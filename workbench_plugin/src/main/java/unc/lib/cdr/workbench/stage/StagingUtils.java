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
package unc.lib.cdr.workbench.stage;

import gov.loc.mets.CHECKSUMTYPEType;
import gov.loc.mets.FileType;
import gov.loc.mets.LOCTYPEType;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;
import irods.efs.plugin.IrodsFileStore;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.IResourceConstants;
import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.rcp.Activator;

/**
 * @author Gregory Jansen
 *
 */
public class StagingUtils {
	private static final Logger log = LoggerFactory.getLogger(StagingUtils.class);
	private static final int chunkSize = 8192;

	
	public static int countUnstaged(IProject project) throws CoreException {
		// TODO update this code to check against METS instead
		int result = 0;
		IMarker[] captured = project.findMarkers(IResourceConstants.MARKER_CAPTURED, false, IResource.DEPTH_INFINITE);
		for (IMarker m : captured) {
			if (m.getResource() instanceof IFile) {
				IMarker[] staged = m.getResource().findMarkers(IResourceConstants.MARKER_STAGED, false,
						IResource.DEPTH_ZERO);
				if (staged.length <= 0) {
					result++;
				}
			}
		}
		return result;
	}
	
	/**
	 * @param r
	 */
	public static void stage(OriginalFileStore original, IProgressMonitor monitor) throws CoreException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		monitor.beginTask(original.toURI().toString(), 100);
		monitor.subTask(original.toURI().toString());

		IProgressMonitor setupMon = new SubProgressMonitor(monitor, 1, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		setupMon.beginTask("Preparing to stage", 1);
		setupMon.subTask("Preparing to stage");
		String fileID = original.getFileID();

		IFileInfo sourceFileInfo = original.getWrapped().fetchInfo();
		// calculate # of blocks
		MetsProjectNature mpn;
		try {
			mpn = (MetsProjectNature) original.getProject().getNature(MetsProjectNature.NATURE_ID);
		} catch (CoreException e) {
			// Unexpected error, rethrow
			throw e;
		}

		IFileStore stageFileStore = original.getStageLocation();


		// prepare for overwrite if necessary
		IFileInfo stageFileInfo = stageFileStore.fetchInfo();
		if (stageFileInfo.exists()) {
				stageFileStore.delete(EFS.NONE, null);
		}

		FileType fileRec = (FileType) mpn.getMets().eResource().getEObject(fileID);
		setupMon.done();

		// stage the file
		IProgressMonitor copyMonitor = new SubProgressMonitor(monitor, 50,
				SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		String sourceMD5 = null;
		try {
			copyMonitor.beginTask("", 100);
			copyMonitor.subTask("Copying to stage");
			sourceMD5 = copyWithMD5Digest(original, stageFileStore, sourceFileInfo, copyMonitor);
			copyMonitor.done();
		} catch (CoreException e) {
			// Unexpected copy error, rethrow
			throw e;
		}
		fileRec.setCHECKSUMTYPE(CHECKSUMTYPEType.MD5);
		fileRec.setCHECKSUM(sourceMD5);

		// get the digest of the staged file
		
		IProgressMonitor stagedChecksumMonitor = new SubProgressMonitor(monitor, 49,
			SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		// stagedChecksumMonitor.subTask("Getting digest for staged file.. ");
		String stagedMD5 = fetchMD5Digest(stageFileStore, stagedChecksumMonitor); // 1 tick

		if (!sourceMD5.equals(stagedMD5)) {
			stageFileStore.delete(EFS.NONE, stagedChecksumMonitor);
		} else {
			// now update markers and record File in METS
			stageFileInfo = stageFileStore.fetchInfo();
			// checksum, size, location type, other loc type, URI
			METSUtils.addStagedFileLocator(mpn.getMets(), fileID, original.getWrapped().toURI(), stageFileStore.toURI(),
					LOCTYPEType.OTHER, METSConstants.LocType_EFS_SCHEME);
		}
		monitor.done();
	}

	/**
	 * @param stageFileStore
	 * @return
	 */
	public static String fetchMD5Digest(IFileStore fileStore, IProgressMonitor monitor) throws CoreException {
		String result = null;
		IFileInfo info = null;
		if (fileStore instanceof IrodsFileStore) {
			monitor.beginTask("Retrieving checksum from iRODS", 1);
			info = fileStore.fetchInfo();
			result = info.getStringAttribute(EFS.ATTRIBUTE_LINK_TARGET);
			monitor.done();
		} else {
			monitor.beginTask("Retreiving staged file and calculating checksum", 100);
			info = fileStore.fetchInfo();
			if(info.getLength() == 0) {
				return "d41d8cd98f00b204e9800998ecf8427e";
			}
			MessageDigest messageDigest;
			try {
				messageDigest = MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException e) {
				throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
						"Cannot create checksum without MD5 algorithm.", e));
			}
			messageDigest.reset();
			byte[] buffer = new byte[chunkSize];
			int bytesRead = 0;
			int totalBytesRead = 0;
			int progressTickBytes = (int) info.getLength() / 100;
			if(progressTickBytes == 0) {
				progressTickBytes = 1; // prevents divide by zero on files less than 100 bytes
			}
			BufferedInputStream in = new BufferedInputStream(fileStore.openInputStream(EFS.NONE, null));
			try {
				while ((bytesRead = in.read(buffer, 0, chunkSize)) != -1) {
					messageDigest.update(buffer, 0, bytesRead);
					totalBytesRead = totalBytesRead + bytesRead;
					if ((totalBytesRead % progressTickBytes) < bytesRead) {
						monitor.worked(1);
					}
				}
			} catch (IOException e) {
				throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
						"Cannot read file store to calculate MD5 digest.", e));
			}
			Hex hex = new Hex();
			result = new String(hex.encode(messageDigest.digest()));
			monitor.done();
		}
		return result;
	}

	public static final String copyWithMD5Digest(IFileStore source, IFileStore destination, IFileInfo sourceInfo,
			IProgressMonitor monitor) throws CoreException {
		// TODO honor cancellation requests during copy
		// TODO report progress
		log.debug("source: " + source);
		log.debug("destination: " + destination);
		// monitor.subTask("Copying file " + source.getName() + "...");
		String result = null;
		byte[] buffer = new byte[chunkSize];
		int length = (int) sourceInfo.getLength();
		int progressTickBytes = length / 100;
		int bytesRead = 0;
		int totalBytesCopied = 0;
		InputStream in = null;
		OutputStream out = null;
		try {
			MessageDigest messageDigest;
			try {
				messageDigest = MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException e) {
				throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
						"Cannot compare checksums without MD5 algorithm.", e));
			}
			messageDigest.reset();
			in = new BufferedInputStream(source.openInputStream(EFS.NONE, null), 1024 * 64);
			destination.getParent().mkdir(EFS.NONE, null);
			out = new BufferedOutputStream(destination.openOutputStream(EFS.NONE, null), 1024 * 64);
			while ((bytesRead = in.read(buffer, 0, chunkSize)) != -1) {
				if(monitor.isCanceled()) {
					throw new CoreException(new Status(IStatus.CANCEL, Activator.PLUGIN_ID, "Staging cancelled"));
				}
				out.write(buffer, 0, bytesRead);
				messageDigest.update(buffer, 0, bytesRead);
				totalBytesCopied = totalBytesCopied + bytesRead;
				if (totalBytesCopied > 0 && progressTickBytes > 0) {
					if ((totalBytesCopied % progressTickBytes) < bytesRead) {
						monitor.worked(1);
						//if (length > 0) {
						//	int percent = (int) (100.0 * ((float) totalBytesCopied / length));
						//	monitor.subTask(percent + "% (" + totalBytesCopied / 1024 + "/" + length / 1024 + "K)");
						//}
					}
				}
			}
			Hex hex = new Hex();
			result = new String(hex.encode(messageDigest.digest()));
		} catch (IOException e) {
			throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e));
		} finally {
			try {
				if (out != null) {
					out.flush();
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e));
			}
		}
		return result;
	}

	/**
	 * @param r
	 * @param subProgressMonitor
	 */
	public static void audit(IFile r, IProgressMonitor monitor) {
		// TODO get URI and checksum from METS
		// create staged file store and fetch MD5
		// compare manifest checksum with the one fetched..
		// if okay then quit, else stage it..
	}

	/**
	 * @param r
	 * @param topOriginal
	 * @param prestageBase
	 * @param subProgressMonitor
	 * @throws CoreException
	 */
	public static void prestage(OriginalFileStore f, URI prestagedLocation, IProgressMonitor monitor)
			throws CoreException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		monitor.beginTask(f.toURI().toString(), 100);
		monitor.subTask(f.toURI().toString());

		IProgressMonitor setupMon = new SubProgressMonitor(monitor, 1, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		setupMon.beginTask("Preparing to checksum pre-staged file", 1);
		setupMon.subTask("Preparing to checksum pre-staged file");
		String fileID = f.getFileID();

		IFileInfo sourceFileInfo = f.getWrapped().fetchInfo();
		// calculate # of blocks
		MetsProjectNature mpn = MetsProjectNature.get(f.getProject());

		FileType fileRec = (FileType) mpn.getMets().eResource().getEObject(fileID);
		setupMon.done();

		// checksum the file
		IProgressMonitor checksumMonitor = new SubProgressMonitor(monitor, 50,
				SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		String sourceMD5 = null;
		checksumMonitor.beginTask("", 100);
		checksumMonitor.subTask("Computing checksum of pre-staged file");
		sourceMD5 = checksumWithMD5Digest(f, sourceFileInfo, checksumMonitor);
		checksumMonitor.done();
		fileRec.setCHECKSUMTYPE(CHECKSUMTYPEType.MD5);
		fileRec.setCHECKSUM(sourceMD5);
		// now update markers and record File in METS
		// checksum, size, location type, other loc type, URI
		METSUtils.addStagedFileLocator(mpn.getMets(), fileID, f.getWrapped().toURI(), prestagedLocation, LOCTYPEType.OTHER,
				METSConstants.LocType_EFS_SCHEME);
		monitor.done();
	}

	/**
	 * @param sourceFileStore
	 * @param sourceFileInfo
	 * @param checksumMonitor
	 * @return
	 * @throws CoreException
	 */
	private static String checksumWithMD5Digest(IFileStore source, IFileInfo sourceInfo, IProgressMonitor monitor) throws CoreException {
			// TODO honor cancellation requests during copy
			// TODO report progress
			log.info("source: " + source);
			String result = null;
			byte[] buffer = new byte[chunkSize];
			int length = (int) sourceInfo.getLength();
			int progressTickBytes = length / 100;
			int bytesRead = 0;
			int totalBytesCopied = 0;
			InputStream in = null;
			try {
				MessageDigest messageDigest;
				try {
					messageDigest = MessageDigest.getInstance("MD5");
				} catch (NoSuchAlgorithmException e) {
					throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
							"Cannot compare checksums without MD5 algorithm.", e));
				}
				messageDigest.reset();
				in = new BufferedInputStream(source.openInputStream(EFS.NONE, null), 1024 * 64);
				while ((bytesRead = in.read(buffer, 0, chunkSize)) != -1) {
					messageDigest.update(buffer, 0, bytesRead);
					totalBytesCopied = totalBytesCopied + bytesRead;
					if (totalBytesCopied > 0 && progressTickBytes > 0) {
						if ((totalBytesCopied % progressTickBytes) < bytesRead) {
							monitor.worked(1);
							// if (length > 0) {
							// int percent = (int) (100.0 * ((float) totalBytesCopied / length));
							// monitor.subTask(percent + "% (" + totalBytesCopied / 1024 + "/" + length / 1024 + "K)");
							// }
						}
					}
				}
				Hex hex = new Hex();
				result = new String(hex.encode(messageDigest.digest()));
			} catch (IOException e) {
				throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e));
			} finally {
				try {
					if (in != null) {
						in.close();
					}
				} catch (IOException e) {
					throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e));
				}
			}
			return result;
	}
}
