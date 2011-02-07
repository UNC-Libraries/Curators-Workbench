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
package unc.lib.cdr.workbench.staging;

import gov.loc.mets.CHECKSUMTYPEType;
import gov.loc.mets.FileType;
import gov.loc.mets.LOCTYPEType;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;

import java.io.BufferedInputStream;
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
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
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
    private static final int bufferSize = 4196;

    /**
     * @param r
     */
    public static void stage(IFile f, IProgressMonitor monitor) throws CoreException {
	if (monitor == null) {
	    monitor = new NullProgressMonitor();
	}
	String divID = IResourceConstants.getCapturedDivID(f);

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
	int blocks = (int) (sourceFileInfo.getLength() / bufferSize);
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
		m.setAttribute(IMarker.MESSAGE,
				"Failed to delete previously staged version: " + e.getLocalizedMessage());
		m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
		e.printStackTrace();
	    }
	}

	FileType fileRec = METSUtils.getDataFile(mpn.getMets(), divID, f.getLocationURI());
	// stage the file
	String sourceMD5 = null;
	try {
	    monitor.beginTask("Calculating digest and copying " + f.getName() + " to stage.", 2*blocks);
	    sourceMD5 = copyWithMD5Digest(sourceFileStore, stageFileStore, monitor);
	} catch (CoreException e) {
	    // Unexpected copy error, rethrow
	    throw e;
	}
	fileRec.setCHECKSUMTYPE(CHECKSUMTYPEType.MD5);
	fileRec.setCHECKSUM(sourceMD5);

	// get the digest of the staged file
	String stagedMD5;
	try {
	    monitor.subTask("Getting staged file digest for "+f.getName());
	    stagedMD5 = fetchMD5Digest(stageFileStore, monitor);
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
	    METSUtils.addStagedFileLocator(mpn.getMets(), divID, f.getLocationURI(), stageFileStore.toURI(),
			    LOCTYPEType.OTHER, METSConstants.LocType_EFS_SCHEME);
	    f.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_ZERO);
	    IMarker staged = f.createMarker(IResourceConstants.MARKER_STAGED);
	    staged.setAttribute("stage.uri", stageFileStore.toURI().toASCIIString());
	}
	f.refreshLocal(0, monitor);
	monitor.done();
    }

    /**
     * @param f
     * @return
     * @throws CoreException
     */
    public static IFileStore getStageLocation(IFile f) throws CoreException {
	// get the file store for staging this file
	IFileStore stageFileStore = null;
	URI stageRoot = f.getProject().getFolder(".stage").getRawLocationURI();
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
	//monitor.subTask("retrieving checksum for file");
	String result = null;
	MessageDigest messageDigest;
	try {
	    messageDigest = MessageDigest.getInstance("MD5");
	} catch (NoSuchAlgorithmException e) {
	    throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
			    "Cannot create checksum without MD5 algorithm.", e));
	}
	messageDigest.reset();
	byte[] buffer = new byte[bufferSize];
	int bytesRead = 0;
	BufferedInputStream in = new BufferedInputStream(fileStore.openInputStream(EFS.NONE, null));
	try {
	    while ((bytesRead = in.read(buffer, 0, bufferSize)) != -1) {
		messageDigest.update(buffer, 0, bytesRead);
		monitor.worked(1);
	    }
	} catch (IOException e) {
	    throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
			    "Cannot read file store to calculate MD5 digest.", e));
	}
	Hex hex = new Hex();
	result = new String(hex.encode(messageDigest.digest()));
	//monitor.worked(1);
	return result;
    }

    public static final String copyWithMD5Digest(IFileStore source, IFileStore destination, IProgressMonitor monitor)
		    throws CoreException {
	// TODO honor cancellation requests during copy
	// TODO report progress
	log.debug("source: " + source);
	log.debug("destination: " + destination);
	//monitor.subTask("Copying file " + source.getName() + "...");
	String result = null;
	byte[] buffer = new byte[bufferSize];
	int bytesRead = 0;
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
	    in = source.openInputStream(EFS.NONE, null);
	    destination.getParent().mkdir(EFS.NONE, null);
	    out = destination.openOutputStream(EFS.NONE, null);
	    while ((bytesRead = in.read(buffer, 0, bufferSize)) != -1) {
		out.write(buffer, 0, bytesRead);
		messageDigest.update(buffer, 0, bytesRead);
		monitor.worked(1);
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
}
