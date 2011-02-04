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
package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.util.METSConstants;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import unc.lib.cdr.workbench.accession.OriginalFoldersProjectElement;
import unc.lib.cdr.workbench.arrange.ArrangementProjectElement;
import unc.lib.cdr.workbench.project.ICustomProjectElement;
import unc.lib.cdr.workbench.rcp.Activator;
import unc.lib.cdr.workbench.staging.StagedFilesProjectElement;
import unc.lib.cdr.workbench.xwalk.CrosswalksProjectElement;

/**
 * @author Gregory Jansen
 *
 */
public class LabelImageFactory {
    public static String iconPath = "icons/";
    private static final int DEFAULT_ICON_SIZE = 24;
    public static final String PROJECT = "project";
    public static final String PROJECT_CLOSED = "projectClosed";
    public static final String ARRANGEMENT_ELEMENT = "arrangementElement";
    public static final String CROSSWALK_ELEMENT = "crosswalkElement";
    public static final String ORIGINALS_ELEMENT = "originalsElement";
    public static final String STAGE_ELEMENT = "stageElement";

    public static final String FOLDER = "folder";
    public static final String FILE = "file";
    private static final String COLLECTION = "Collection";
    private static final String DISK = "Disk";
    public static final String HARD_DISK = "hard disk";
    public static final String CD_ROM = "cd-rom";
    public static final String DVD = "dvd";
    public static final String USBDRIVE = "usbdrive";
    public static final String NETWORK_DRIVE = "netdrive";
    public static final String IRODS_GRID = "irods grid";

    public static final String CAPTURE_DECORATOR = "captured";
    public static final String STAGED_DECORATOR = "staged";
    public static final String USER_EDITED_DECORATOR = "userEdited";
    public static final String CROSSWALKED_DECORATOR = "crosswalked";
    public static final String CROSSWALK_RECORD = "crosswalkRecord";

    public static void initializeImageRegistry(ImageRegistry reg) {
	putMyImageDefaultResized(PROJECT,"24px-Crystal_Clear_app_ark.png", reg);
	putMyImageDefaultResized(PROJECT_CLOSED,"24px-Crystal_Clear_app_kthememgr.png", reg);
	putMyImageDefaultResized(FOLDER, "24px-Crystal_Clear_filesystem_folder_grey.png", reg);
	putMyImageDefaultResized(COLLECTION, "24px-Crystal_Clear_app_file-manager.png", reg);
	putMyImageDefaultResized(FILE, "24px-Crystal_Clear_action_filenew.png", reg);
	putMyImageDefaultResized(HARD_DISK, "24px-Crystal_Clear_app_harddrive.png", reg);
	putMyImage(ARRANGEMENT_ELEMENT, "edtsrclkup_co.gif", reg);
	putMyImage(CROSSWALK_ELEMENT, "filter_tsk.gif", reg);
	putMyImage(ORIGINALS_ELEMENT, "access_restriction_attrib.gif", reg);
	putMyImage(STAGE_ELEMENT, "var_cntnt_prvdr.gif", reg);
	putMyImage(CAPTURE_DECORATOR, "waiting_ovr.gif", reg);
	putMyImage(STAGED_DECORATOR, "version_controlled.gif", reg);
	putMyImage(USER_EDITED_DECORATOR, "write_obj.gif", reg);
	putMyImage(CROSSWALKED_DECORATOR, "crosswalk_decor.gif", reg);
	putMyImage(CROSSWALK_RECORD, "property_obj.gif", reg);
    }

    private static void putMyImageDefaultResized(String key, String filename, ImageRegistry reg) {
	putMyImageResized(key, filename, reg, DEFAULT_ICON_SIZE, DEFAULT_ICON_SIZE);
    }

    private static void putMyImageResized(String key, String filename, ImageRegistry reg, int height, int width) {
	Image result = null;
	ImageDescriptor d = null;
	d = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, iconPath + filename);
	if (d != null) {
	    Image fullsize = d.createImage();
	    result = new Image(Display.getDefault(), fullsize.getImageData().scaledTo(width, height));
	    reg.put(key, result);
	}
    }

    private static void putMyImage(String key, String filename, ImageRegistry reg) {
	Image result = null;
	String iconPath = "icons/";
	ImageDescriptor d = null;
	d = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, iconPath + filename);
	if (d != null) {
	    result = d.createImage();
	    reg.put(key, result);
	}
    }

    public static String getKeyForObject(Object o) {
	String key = null;
	if (o instanceof IResource) {
	    key = getResourceImageKey((IResource) o);
	} else if (o instanceof DivType) {
	    key = getDivImageKey((DivType) o);
	} else if (o instanceof MdSecType) {
	    key = CROSSWALK_RECORD;
	} else if (o instanceof ICustomProjectElement) {
	    if(o instanceof ArrangementProjectElement) {
		key = ARRANGEMENT_ELEMENT;
	    } else if(o instanceof CrosswalksProjectElement) {
		key = CROSSWALK_ELEMENT;
	    } else if(o instanceof OriginalFoldersProjectElement) {
		key = ORIGINALS_ELEMENT;
	    } else if(o instanceof StagedFilesProjectElement) {
		key = STAGE_ELEMENT;
	    }
	}
	return key;
    }

    public static ImageDescriptor getImageDescriptorForObject(Object o) {
	ImageDescriptor result = null;
	String key = getKeyForObject(o);
	if (key != null) {
	    result = Activator.getDefault().getImageRegistry().getDescriptor(key);
	}
	return result;
    }

    public static ImageDescriptor getImageDescriptorForKey(String s) {
	return Activator.getDefault().getImageRegistry().getDescriptor(s);
    }

    public static Image getImageForObject(Object o) {
	Image result = null;
	String key = getKeyForObject(o);
	if (key != null) {
	    result = Activator.getDefault().getImageRegistry().get(key);
	}
	return result;
    }

    /**
     * @param o
     * @return
     */
    private static String getDivImageKey(DivType o) {
	if (METSConstants.Div_File.equals(o.getTYPE())) {
	    return FILE;
	} else if (METSConstants.Div_Folder.equals(o.getTYPE())) {
	    return FOLDER;
	} else if (METSConstants.Div_Collection.equals(o.getTYPE())) {
	    return COLLECTION;
	} else if (METSConstants.Div_Disk.equals(o.getTYPE())) {
	    return DISK;
	}
	return null;
    }

    /**
     * @param o
     * @return
     */
    private static String getResourceImageKey(IResource o) {
	if (o instanceof IProject) {
	    boolean open = ((IProject)o).isOpen();
	    return open ? PROJECT : PROJECT_CLOSED;
	} else if (o instanceof IFolder) {
	    IFolder f = (IFolder) o;
	    if (f.getProject().equals(f.getParent())) {
		// top level folder
		// TODO what kind of drive?
		return HARD_DISK;
	    } else {
		return FOLDER;
	    }
	} else if (o instanceof IFile) {
	    // TODO registry of file type icons
	    return FILE;
	}
	return null;
    }
}
