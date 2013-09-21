/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package unc.lib.cdr.workbench.project;

import edu.unc.lib.staging.StagingException;
import gov.loc.mets.DivType;
import gov.loc.mets.FileGrpType;
import gov.loc.mets.FileType;
import gov.loc.mets.FptrType;
import gov.loc.mets.util.METSUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import staging.plugin.StagingPlugin;
import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.rcp.Activator;

public class BagItZipExportJob extends Job {

	IProject project = null;
	String destination = null;

	public BagItZipExportJob(IProject project, String destination) {
		super("Export BagIt ZIP Package");
		this.project = project;
		this.destination = destination;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		MetsProjectNature nature = MetsProjectNature.get(project);
		if (nature == null) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Project is not a Curator's Workbench project.");
		}
		DivType bag = METSUtils.findBagDiv(nature.getMets());
		FileGrpType fileGrp = METSUtils.getObjectsFileGroup(nature.getMets());
		byte[] buffer = new byte[1024];

		// create a ZIP file writer
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(destination);
		} catch (IOException e) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Cannot create export ZIP file", e);
		}

		ZipOutputStream zout = new ZipOutputStream(fout);
		PrintWriter out = new PrintWriter(zout);
		zout.setComment("BagIt ZIP serialization by Curator's Workbench");

		try {

			// add bagit.txt
			zout.putNextEntry(new ZipEntry(project.getName() + "/bagit.txt"));
			out.println("BagIt-version: 0.96");
			out.println("Tag-File-Character-Encoding: UTF-8");
			out.flush();
			zout.closeEntry();

			// build manifest-md5 and packaged files list
			zout.putNextEntry(new ZipEntry(project.getName()
					+ "/manifest-md5.txt"));
			for (TreeIterator<EObject> iter = bag.eAllContents(); iter
					.hasNext();) {
				EObject eo = iter.next();
				if (eo instanceof FptrType) {
					FptrType fptr = (FptrType) eo;
					String fid = fptr.getFILEID();
					for (FileType ftype : fileGrp.getFile()) {
						if (fid.equals(ftype.getID())) {
							out.print(ftype.getCHECKSUM());
							out.print(' ');
							out.println(getLocation(
									(DivType) fptr.eContainer(), bag));
						}
					}
				}
			}
			out.flush();
			zout.closeEntry();

			// send files to ZIP
			for (TreeIterator<EObject> iter = bag.eAllContents(); iter
					.hasNext();) {
				EObject eo = iter.next();
				if (eo instanceof FptrType) {
					FptrType fptr = (FptrType) eo;
					String fid = fptr.getFILEID();
					for (FileType ftype : fileGrp.getFile()) {
						if (fid.equals(ftype.getID())) {
							// found file element, process this file..
							zout.putNextEntry(new ZipEntry(this.project
									.getName()
									+ "/"
									+ getLocation((DivType) fptr.eContainer(),
											bag)));
							OriginalFileStore orig = MetsProjectNature
									.getOriginal((DivType) fptr.eContainer());
							IFileStore source = orig;
							if (orig.getStagingLocatorType() != null) {
								URI manifestURI = URI.create(orig
										.getStagingLocatorType().getHref());
								URI store;
								try {
									store = StagingPlugin.getDefault()
											.getStages()
											.getStorageURI(manifestURI);
									IFileStore test = EFS.getStore(store);
									if (test.fetchInfo().exists()) {
										source = test;
									}
								} catch (StagingException ignored) {
								}
							}
							stream(zout, source, buffer);
							zout.closeEntry();
						}
					}
				}
			}
		} catch (IOException e) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Cannot create export ZIP file", e);
		} catch (CoreException e) {
			return e.getStatus();
		} finally {
			if (zout != null) {
				try {
					zout.close();
				} catch (IOException e) {
				}
			}
			if (out != null)
				out.close();
		}
		try {
			nature.getProject().refreshLocal(IResource.DEPTH_ONE,
					new NullProgressMonitor());
		} catch (CoreException ignored) {
		}
		// write all data files in main manifest
		// close the zip file
		return Status.OK_STATUS;
	}

	private void stream(ZipOutputStream zout, IFileStore store, byte[] buffer)
			throws IOException, CoreException {
		InputStream in = store.openInputStream(EFS.NONE,
				new NullProgressMonitor());
		int length;
		while ((length = in.read(buffer)) > 0) {
			zout.write(buffer, 0, length);
		}
		in.close();
	}

	/**
	 * Generate a path to this file, based on labels in the div tree.
	 * 
	 * @param div
	 *            the div for the File
	 * @return BagIt path to the file
	 */
	private String getLocation(DivType div, DivType bagDiv) {
		Deque<String> pathSegments = new ArrayDeque<String>();
		for (DivType d = div; !bagDiv.equals(d); d = (DivType) d.eContainer()) {
			pathSegments.push(d.getLABEL1());
		}
		pathSegments.push("data");

		StringBuilder sb = new StringBuilder(pathSegments.poll());
		for (String seg = pathSegments.poll(); seg != null; seg = pathSegments
				.poll()) {
			sb.append("/");
			sb.append(seg);
		}
		return sb.toString();
	}

}
