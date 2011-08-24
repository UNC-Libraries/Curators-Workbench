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
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.URIUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.IResourceConstants;
import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.rcp.Activator;

/**
 * @author Gregory Jansen
 *
 */
public class StagingUtils {
	private static final Logger log = LoggerFactory.getLogger(StagingUtils.class);
	private static final int chunkSize = 8192;

	/**
	 * @param r
	 */
	public static void stage(IFile f, IProgressMonitor monitor) throws CoreException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		monitor.beginTask(f.getLocation().toString(), 100);
		monitor.subTask(f.getLocation().toString());

		IProgressMonitor setupMon = new SubProgressMonitor(monitor, 1, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		setupMon.beginTask("Preparing to stage", 1);
		setupMon.subTask("Preparing to stage");
		String fileID = IResourceConstants.getFileID(f);

		IFileStore sourceFileStore = null;
		try {
			sourceFileStore = EFS.getStore(f.getLocationURI());
		} catch (CoreException e) {
			// Cannot locate source file, set warn marker
			IMarker m = f.createMarker(IMarker.PROBLEM);
			m.setAttribute(IMarker.MESSAGE, "Failed to read captured file for staging: " + e.getLocalizedMessage());
			m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			return;
		}
		IFileInfo sourceFileInfo = sourceFileStore.fetchInfo();
		// calculate # of blocks
		MetsProjectNature mpn;
		try {
			mpn = (MetsProjectNature) f.getProject().getNature(MetsProjectNature.NATURE_ID);
		} catch (CoreException e) {
			// Unexpected error, rethrow
			throw e;
		}

		IFileStore stageFileStore;
		try {
			stageFileStore = getStageLocation(f);
		} catch (CoreException e) {
			// Unexpected error, rethrow
			throw e;
		}

		// prepare for overwrite if necessary
		IFileInfo stageFileInfo = stageFileStore.fetchInfo();
		if (stageFileInfo.exists()) {
			try {
				stageFileStore.delete(EFS.NONE, null);
			} catch (CoreException e) {
				// Cannot delete previous staged version, set error marker
				IMarker m = f.createMarker(IMarker.PROBLEM);
				m.setAttribute(IMarker.MESSAGE, "Failed to delete previously staged version: " + e.getLocalizedMessage());
				m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
				e.printStackTrace();
			}
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
			sourceMD5 = copyWithMD5Digest(sourceFileStore, stageFileStore, sourceFileInfo, copyMonitor);
			copyMonitor.done();
		} catch (CoreException e) {
			// Unexpected copy error, rethrow
			throw e;
		}
		fileRec.setCHECKSUMTYPE(CHECKSUMTYPEType.MD5);
		fileRec.setCHECKSUM(sourceMD5);

		// get the digest of the staged file
		String stagedMD5;
		try {
			IProgressMonitor stagedChecksumMonitor = new SubProgressMonitor(monitor, 49,
					SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
			// stagedChecksumMonitor.subTask("Getting digest for staged file.. ");
			stagedMD5 = fetchMD5Digest(stageFileStore, stagedChecksumMonitor); // 1 tick
		} catch (CoreException e) {
			// Unexpected digest error, rethrow
			throw e;
		}

		if (!sourceMD5.equals(stagedMD5)) {
			IMarker m = f.createMarker(IMarker.PROBLEM);
			m.setAttribute(IMarker.MESSAGE, "staged file does not match original checksum");
			m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
		} else {
			// now update markers and record File in METS
			stageFileInfo = stageFileStore.fetchInfo();
			// checksum, size, location type, other loc type, URI
			METSUtils.addStagedFileLocator(mpn.getMets(), fileID, f.getLocationURI(), stageFileStore.toURI(),
					LOCTYPEType.OTHER, METSConstants.LocType_EFS_SCHEME);
			// f.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_ZERO);
			IMarker staged = f.createMarker(IResourceConstants.MARKER_STAGED);
			staged.setAttribute(IResourceConstants.MARKER_STAGED_URI, stageFileStore.toURI().toASCIIString());
		}
		f.refreshLocal(IResource.DEPTH_ZERO, monitor);
		monitor.done();
	}

	/**
	 * @param f
	 * @return
	 * @throws CoreException
	 */
	public static IFileStore getStageLocation(IFile f) throws CoreException {
		// get the file store for staging this file
		MetsProjectNature mpn = MetsProjectNature.get(f.getProject());
		URI stageRoot = mpn.getStagingBase();
		IFileStore stageFileStore = null;
		IFileStore stageRootFileStore = EFS.getStore(stageRoot);
		IPath stagePath = f.getProjectRelativePath().removeFirstSegments(1);
		stageFileStore = stageRootFileStore.getFileStore(stagePath);
		return stageFileStore;
	}

	/**
	 * @param f
	 * @return
	 * @throws CoreException
	 */
	// public static IFileStore getStageRoot() throws CoreException {
	// // get the file store for staging this file
	// try {
	// URI stage = this.;
	// String stageChoice = store.getString(PreferenceConstants.P_STAGE_CHOICE);
	// if (PreferenceConstants.P_STAGE_CHOICE_LOCAL.equals(stageChoice)) {
	// String rawPath = store.getString(PreferenceConstants.P_LOCAL_STAGE_PATH);
	// IPath path = new Path(rawPath);
	// File f = path.toFile();
	// stage = f.toURI();
	// //stage = ("file:" + rawPath.replace('\\', '/'));
	// } else if
	// (PreferenceConstants.P_STAGE_CHOICE_IRODS_PROD.equals(stageChoice)) {
	// stage = new URI(store.getString(PreferenceConstants.P_PROD_IRODS_URI));
	// } else if
	// (PreferenceConstants.P_STAGE_CHOICE_IRODS_TEST.equals(stageChoice)) {
	// stage = new URI(store.getString(PreferenceConstants.P_TEST_IRODS_URI));
	// } else {
	// throw new Error("unknown stage choice " + stageChoice);
	// }
	// return stageRootFileStore;
	// } catch (URISyntaxException e) {
	// throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
	// "The staging location is not configured correctly in preferences.", e));
	// }
	// }

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
				out.write(buffer, 0, bytesRead);
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
	public static void prestage(IFile f, IResource topOriginal, URI prestageBase, IProgressMonitor monitor)
			throws CoreException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		monitor.beginTask(f.getLocation().toString(), 100);
		monitor.subTask(f.getLocation().toString());

		IProgressMonitor setupMon = new SubProgressMonitor(monitor, 1, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		setupMon.beginTask("Preparing to checksum pre-staged file", 1);
		setupMon.subTask("Preparing to checksum pre-staged file");
		String fileID = IResourceConstants.getFileID(f);

		IFileStore sourceFileStore = null;
		try {
			sourceFileStore = EFS.getStore(f.getLocationURI());
		} catch (CoreException e) {
			// Cannot locate source file, set warn marker
			IMarker m = f.createMarker(IMarker.PROBLEM);
			m.setAttribute(IMarker.MESSAGE, "Failed to read captured file for pre-staging: " + e.getLocalizedMessage());
			m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			return;
		}
		IFileInfo sourceFileInfo = sourceFileStore.fetchInfo();
		// calculate # of blocks
		MetsProjectNature mpn;
		try {
			mpn = (MetsProjectNature) f.getProject().getNature(MetsProjectNature.NATURE_ID);
		} catch (CoreException e) {
			// Unexpected error, rethrow
			throw e;
		}

		URI prestagedFileURI;
		try {
			prestagedFileURI = getPrestageLocation(f, topOriginal, prestageBase);
		} catch (URISyntaxException e) {
			e.printStackTrace();
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot compute prestaged file URI: "+e.getMessage()));
		}

		FileType fileRec = (FileType) mpn.getMets().eResource().getEObject(fileID);
		setupMon.done();

		// checksum the file
		IProgressMonitor checksumMonitor = new SubProgressMonitor(monitor, 50,
				SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
		String sourceMD5 = null;
		checksumMonitor.beginTask("", 100);
		checksumMonitor.subTask("Computing checksum of pre-staged file");
		sourceMD5 = checksumWithMD5Digest(sourceFileStore, sourceFileInfo, checksumMonitor);
		checksumMonitor.done();
		fileRec.setCHECKSUMTYPE(CHECKSUMTYPEType.MD5);
		fileRec.setCHECKSUM(sourceMD5);
		// now update markers and record File in METS
		// checksum, size, location type, other loc type, URI
		METSUtils.addStagedFileLocator(mpn.getMets(), fileID, f.getLocationURI(), prestagedFileURI, LOCTYPEType.OTHER,
				METSConstants.LocType_EFS_SCHEME);
		// f.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_ZERO);
		IMarker staged = f.createMarker(IResourceConstants.MARKER_STAGED);
		staged.setAttribute(IResourceConstants.MARKER_STAGED_URI, prestagedFileURI.toASCIIString());
		f.refreshLocal(IResource.DEPTH_ZERO, monitor);
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
			log.debug("source: " + source);
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

	/**
	 * @param f
	 * @param topOriginal
	 * @param prestageBase
	 * @return
	 * @throws URISyntaxException
	 */
	private static URI getPrestageLocation(IFile f, IResource topOriginal, URI prestageBase) throws URISyntaxException {
		IPath path = f.getProjectRelativePath().makeRelativeTo(topOriginal.getParent().getProjectRelativePath());
		URI test = URIUtil.fromString(path.toString());
		return new URI(prestageBase.toString()+ test.getRawPath() );
	}
}
