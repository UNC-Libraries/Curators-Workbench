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
package unc.lib.cdr.workbench;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.QualifiedName;

import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.rcp.Activator;

/**
 * @author Gregory Jansen
 * 
 */
public class IResourceConstants {
	public static final QualifiedName MODIFIED_TIMESTAMP = new QualifiedName(MetsProjectNature.NATURE_ID,
			"MODIFIED_TIMESTAMP");
	public static final QualifiedName BYTE_SIZE = new QualifiedName(MetsProjectNature.NATURE_ID, "BYTE_SIZE");
	public static final QualifiedName ORIGINAL_NAME = new QualifiedName(MetsProjectNature.NATURE_ID, "ORIGINAL_NAME");

	public static final String TYPE_FOLDER = "folder";
	public static final String TYPE_FILE = "file";
	public static final String TYPE_HARD_DISK = "hard disk";
	public static final String TYPE_CD_ROM = "cd-rom";
	public static final String TYPE_DVD = "dvd";
	public static final String TYPE_USBDRIVE = "usbdrive";
	public static final String TYPE_NETWORK_DRIVE = "netdrive";
	public static final String TYPE_IRODS_GRID = "irods grid";
	public static final String TYPE_ARRANGEMENT_ELEMENT = "arrangementElement";
	public static final String TYPE_CROSSWALK_ELEMENT = "crosswalkElement";
	public static final String TYPE_ORIGINALS_ELEMENT = "originalsElement";
	public static final String MARKER_ORIGINALFILESET = "unc.lib.cdr.workbench.markers.OriginalFileSet";
	public static final String MARKER_CAPTURED = "unc.lib.cdr.workbench.markers.Captured";
	public static final String MARKER_CAPTURED_DIV_ID = "mets.Div.ID";
	public static final QualifiedName PROP_RESOURCE_CAPTURED = new QualifiedName(Activator.PLUGIN_ID, "CAPTURED");
	public static final String MARKER_STAGED = "unc.lib.cdr.workbench.markers.Staged";

	public static final String CROSSWALK_EXTENSION = "crosswalk";

	/**
	 * Find the unique name of the file group within the project.
	 * 
	 * @param resource
	 * @return file group name
	 */
	public static IFolder getFileGroupFolder(IResource resource) {
		IFolder result = null;
		IPath p = resource.getFullPath();
		if (p.segmentCount() > 1) {
			result = resource.getProject().getFolder(p.segment(1));
		} else {
			throw new Error("Unexpectedly short file path");
		}
		return result;
	}

	public static void setCapturedState(IResource r, String divID) {
		try {
			// r.setPersistentProperty(PROP_RESOURCE_CAPTURED, "true");
			IMarker capture = null;
			IMarker[] markers = r.findMarkers(MARKER_CAPTURED, false, IResource.DEPTH_ZERO);
			if (markers.length > 0) {
				capture = markers[0];
			} else {
				capture = r.createMarker(IResourceConstants.MARKER_CAPTURED);
			}
			capture.setAttribute(MARKER_CAPTURED_DIV_ID, divID);
		} catch (CoreException e) {
			throw new Error(e);
		}
	}

	public static String getCapturedDivID(IResource r) throws CoreException {
		String result = null;
		try {
			IMarker[] markers = r.findMarkers(MARKER_CAPTURED, false, IResource.DEPTH_ZERO);
			if (markers.length > 0) {
				IMarker capture = markers[0];
				result = (String) capture.getAttribute(MARKER_CAPTURED_DIV_ID);
			}
		} catch (CoreException e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}
}
