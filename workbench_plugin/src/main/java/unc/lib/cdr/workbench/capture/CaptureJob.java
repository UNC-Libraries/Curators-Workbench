/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package unc.lib.cdr.workbench.capture;

import gov.loc.mets.DivType;
import gov.loc.mets.FileType;
import gov.loc.mets.FptrType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.MetsType;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;

import unc.lib.cdr.workbench.IResourceConstants;
import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 *
 */
public class CaptureJob extends Job {
	private IProject project = null;
	private List<IResource> items;
	private DivType topDestination = null;
	private DivType insertBefore = null;
	private MetsProjectNature mpn = null;
	private MetsType m = null;
	private DivType bag = null;
	private IProgressMonitor monitor = null;

	private static Comparator<IResource> resourceComparator = new Comparator<IResource>() {
		@Override
		public int compare(IResource arg0, IResource arg1) {
			return Collator.getInstance().compare(arg0.getName(), arg1.getName());
		}
	};

	/**
	 * @param jobName
	 * @param items
	 *           List of sibling resources items to capture
	 * @param destination
	 *           The div within which to insert the list of siblings, if null original parents are found in arrangement
	 *           or captured.
	 * @param insertBefore
	 *           If not null, captured resources will be inserted before this div
	 */
	public CaptureJob(String jobName, List<IResource> items, DivType destination, DivType insertBefore) {
		super(jobName);
		this.items = items;

		if (items.size() > 0) {
			this.project = items.iterator().next().getProject();
		}

		this.topDestination = destination;
		this.insertBefore = insertBefore;
	}

	/**
	 * @param jobName
	 * @param items
	 *           the items to capture or verify
	 */
	public CaptureJob(String jobName, List<IResource> items) {
		this(jobName, items, null, null);
	}

	public class CounterVisitor implements IResourceVisitor {
		public int count = 0;

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.core.resources.IResourceVisitor#visit(org.eclipse.core.resources.IResource)
		 */
		@Override
		public boolean visit(IResource resource) throws CoreException {
			count++;
			return true;
		}
	}

	/*
	 * if parent folders have been arranged, they will stay in their places, reset arrangement is separate! (non-Javadoc)
	 *
	 * @seeorg.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime. IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		this.monitor = monitor;
		if (this.monitor == null) {
			monitor = new NullProgressMonitor();
		}
		try {
			this.items.remove(this.project);
			if (this.items.size() == 0) {
				return Status.OK_STATUS;
			}
			// recursively count the items
			CounterVisitor v = new CounterVisitor();
			for (IResource r : items) {
				r.accept(v);
			}
			monitor.beginTask("Capturing " + v.count + " resources..", v.count);

			// get METS object
			mpn = (MetsProjectNature) project.getNature(MetsProjectNature.NATURE_ID);
			m = mpn.getMets();
			bag = METSUtils.findBagDiv(m);

			// recursion, yo
			captureSiblingList(items, topDestination, insertBefore);

			project.getWorkspace().save(true, monitor);
			Map<String, Object> params = new HashMap<String, Object>();
			// if (auditPreviouslyStaged) {
			// params.put("audit", Boolean.TRUE);
			// }
			// log.debug("calling incremental build");
			if (mpn.getAutomaticStaging()) {
				System.out.println("triggering build b/c auto staging says "+mpn.getAutomaticStaging());
				project.build(IncrementalProjectBuilder.FULL_BUILD, MetsProjectNature.STAGING_BUILDER_ID, params,
						new NullProgressMonitor());
			} else {
				System.out.println("skipping build b/c auto staging says "+mpn.getAutomaticStaging());
			}
			monitor.done();
			return Status.OK_STATUS;
		} catch (CoreException e) {
			e.printStackTrace();
			return e.getStatus();
		}
	}

	private void captureSiblingList(List<IResource> list, DivType dest, DivType insert) throws CoreException {
		if (list.size() == 0)
			return;
		DivType sharedParent = null;
		if (dest == null) {
			sharedParent = findOrCaptureParent(list.get(0));
		} else {
			sharedParent = dest;
		}
		Collections.sort(list, resourceComparator);
		for (IResource r : list) {
			DivType d = findDiv(r);
			if (d == null) {
				d = capture(r, sharedParent, insert);
			} else {
				System.out.println("previously captured: " + d);
			}
			if (r instanceof IContainer) {
				List<IResource> children = new ArrayList<IResource>();
				IContainer c = (IContainer) r;
				Collections.addAll(children, c.members());
				captureSiblingList(children, d, null);
			}
		}
		// TODO appended in alpha order, now sort the parent folder?
	}

	private DivType findDiv(IResource r) throws CoreException {
		DivType result = null;
		String divID = IResourceConstants.getDivID(r);
		if (divID != null) {
			result = (DivType) m.eResource().getEObject(divID);
		}
		return result;
	}

	private FileType findFile(IResource r) throws CoreException {
		FileType result = null;
		String fileID = IResourceConstants.getFileID(r);
		if (fileID != null) {
			result = (FileType) m.eResource().getEObject(fileID);
		}
		return result;
	}

	/**
	 * @param iResource
	 * @return
	 * @throws CoreException
	 */
	private DivType findOrCaptureParent(IResource me) throws CoreException {
		if (mpn.getOriginalsFolder().equals(me.getParent())) {
			return this.bag;
		}

		DivType result = findDiv(me.getParent());
		if (result != null) {
			System.out.println("Found closest parent:" + result);
			return result;
		}

		// need to create parent, but first we need it's parent
		DivType parent = findOrCaptureParent(me.getParent());
		result = capture(me.getParent(), parent, null);
		// sort the parent folder?
		return result;
	}

	DivType capture(IResource me, DivType parent, DivType insertBefore) throws CoreException {
		monitor.subTask("Capturing " + me.getLocationURI());
		DivType result = MetsFactory.eINSTANCE.createDivType();
		// use an EMF command
		Command command = null;
		if (insertBefore != null && parent.getDiv().contains(insertBefore)) {
			int index = parent.getDiv().indexOf(insertBefore);
			command = AddCommand.create(mpn.getEditingDomain(), parent, MetsPackage.eINSTANCE.getDivType_Div(), result,
					index);
		} else {
			command = AddCommand.create(mpn.getEditingDomain(), parent, MetsPackage.eINSTANCE.getDivType_Div(), result);
		}
		if (me instanceof IContainer) {
			fillFolderDiv(result, (IContainer) me);
		} else if (me instanceof IFile) {
			fillFileDiv(result, (IFile) me);
		}
		mpn.getCommandStack().execute(command);
		monitor.worked(1);
		return result;
	}

	/**
	 * @param folderDiv
	 * @param c
	 */
	private void fillFolderDiv(DivType folderDiv, IContainer c) throws CoreException {
		List<String> contentIds = new ArrayList<String>();
		contentIds.add(c.getLocationURI().toASCIIString());
		folderDiv.setCONTENTIDS(contentIds);
		folderDiv.setID(METSUtils.makeXMLUUID());
		folderDiv.setLABEL1(c.getName());
		folderDiv.setTYPE(METSConstants.Div_Folder);
		IResourceConstants.setDivID(c, folderDiv.getID());
	}

	/**
	 * @param folderDiv
	 * @param c
	 */
	private void fillFileDiv(DivType div, IFile c) throws CoreException {
		List<String> contentIds = new ArrayList<String>();
		contentIds.add(c.getLocationURI().toASCIIString());
		div.setCONTENTIDS(contentIds);
		div.setID(METSUtils.makeXMLUUID());
		div.setLABEL1(c.getName());
		div.setTYPE(METSConstants.Div_File);

		// calc size and checksum.
		IFileStore sourceFileStore = EFS.getStore(c.getLocationURI());
		IFileInfo sourceFileInfo = sourceFileStore.fetchInfo();
		long size = sourceFileInfo.getLength();

		// find File section (for previously captured) or make one
		FileType ft = findFile(c);
		if (ft == null) {
			ft = METSUtils.addFile(m, c.getLocationURI(), size, null);
			IResourceConstants.setFileID(c, ft.getID());
		}

		FptrType fptr = MetsFactory.eINSTANCE.createFptrType();
		fptr.setFILEID(ft.getID());
		div.getFptr().add(fptr);

		IResourceConstants.setDivID(c, div.getID());
	}

}
