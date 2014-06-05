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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Display;

import unc.lib.cdr.workbench.arrange.ArrangementProjectElement;
import unc.lib.cdr.workbench.arrange.DivLinkBucket;
import unc.lib.cdr.workbench.originals.OriginalStub;
import unc.lib.cdr.workbench.project.ICustomProjectElement;
import unc.lib.cdr.workbench.rcp.Activator;

/**
 * @author Gregory Jansen
 * 
 */
public class LabelImageFactory {
	public static String iconPath = "icons/";
	private static final int DEFAULT_ICON_SIZE = 18;
	public static Map<String, Icon> diskImages = new HashMap<String, Icon>();

	static {
		diskImages.put("rootfs", Icon.HardDisk);
		diskImages.put("vfat", Icon.HardDisk);
		diskImages.put("fat", Icon.HardDisk);
		diskImages.put("ntfs", Icon.HardDisk);
		diskImages.put("fat32", Icon.HardDisk);
		diskImages.put("fuseblk", Icon.HardDisk);
	}

	public static enum Size {
		ORIGINAL(0, 0), DEFAULT_ICON(DEFAULT_ICON_SIZE, DEFAULT_ICON_SIZE), DEFAULT_DECOR(7, 8), LARGE_DECOR(12, 12);
		int width;
		int height;

		Size(int width, int height) {
			this.width = width;
			this.height = height;
		}
	}

	public enum Icon {
		OpenProject("48px-Crystal_Clear_app_ark.png", Size.DEFAULT_ICON), ClosedProject(
				"48px-Crystal_Clear_app_kthememgr.png", Size.DEFAULT_ICON), HardDisk(
				"48px-Crystal_Clear_app_harddrive.png", Size.DEFAULT_ICON), Folder(
				"type_folder.png",
				Size.DEFAULT_ICON), File(
				"type_file.png", Size.DEFAULT_ICON), Collection(
				"type_coll.png", Size.DEFAULT_ICON), AggregateWork(
				"type_aggr.png",
				Size.DEFAULT_ICON), ArrangementEl("edtsrclkup_co.gif",
				Size.DEFAULT_ICON), CrosswalkEl("filter_tsk.gif", Size.DEFAULT_ICON), OriginalsEl(
				"access_restriction_attrib.gif", Size.DEFAULT_ICON), CaptureDecor(
				"waiting_ovr.gif", Size.DEFAULT_DECOR), StagedDecor(
				"version_controlled.gif", Size.DEFAULT_DECOR), UserEditedDecor(
				"write_obj.gif", Size.LARGE_DECOR), CrosswalkedDecor(
				"write_obj_gray.gif", Size.LARGE_DECOR), ACLDecor("lockedstate.gif",
				Size.LARGE_DECOR), ACLGrayDecor("lockedstate_mono.gif",
				Size.LARGE_DECOR), CrosswalkedRecord("property_obj.gif",
				Size.DEFAULT_ICON), LinkedObject("link_obj.gif", Size.DEFAULT_ICON), EjectedDecore(
				"ejected1.gif", Size.DEFAULT_DECOR), Loading("loading.png",
				Size.ORIGINAL), NoPreview("no_preview.png", Size.ORIGINAL);
		Size size = Size.ORIGINAL;
		String imageFile = null;

		Icon(String imageFile, Size size) {
			this.imageFile = imageFile;
			this.size = size;
		}

		public Image getImage() {
			return LabelImageFactory.getImage(this);
		}

		public ImageDescriptor getImageDescriptor() {
			return LabelImageFactory.getImageDescriptor(this);
		}
	}

	private static ImageRegistry registry = Activator.getDefault()
			.getImageRegistry();

	public static Icon getIconForObject(Object o) {
		Icon result = null;
		if (o instanceof IResource) {
			result = getIconForResource((IResource) o);
		} else if (o instanceof DivType) {
			result = getIconForDiv((DivType) o);
		} else if (o instanceof MdSecType) {
			result = Icon.CrosswalkedRecord;
		} else if (o instanceof ICustomProjectElement) {
			if (o instanceof ArrangementProjectElement) {
				result = Icon.ArrangementEl;
			}
		} else if (o instanceof DivLinkBucket) {
			result = Icon.LinkedObject;
		} else if (IFileStore.class.isInstance(o)) {
			if (((IFileStore) o).fetchInfo().isDirectory()) {
				result = Icon.Folder;
			} else {
				result = Icon.File;
			}
		} else if (OriginalStub.class.isInstance(o)) {
			result = Icon.OriginalsEl;
		}
		return result;
	}

	public static ImageDescriptor getImageDescriptorForObject(Object o) {
		Icon icon = getIconForObject(o);
		return getImageDescriptor(icon);
	}

	public static ImageDescriptor getImageDescriptor(Icon i) {
		ImageDescriptor result = registry.getDescriptor(i.name());
		if (result == null) {
			register(i);
			result = registry.getDescriptor(i.name());
		}
		return result;
	}

	public static Image getImage(Icon i) {
		Image result = registry.get(i.name());
		if (result == null) {
			register(i);
			result = registry.get(i.name());
		}
		return result;
	}

	/**
	 * Registers the given icon.
	 * 
	 * @param i
	 */
	private static void register(Icon i) {
		Image result = null;
		ImageDescriptor d = null;
		d = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, iconPath
				+ i.imageFile);
		if (d != null) {
			result = d.createImage();
			if (i.size != Size.ORIGINAL) {
				result = new Image(Display.getDefault(), result.getImageData()
						.scaledTo(i.size.width, i.size.height));
			}
			try {
				registry.put(i.name(), result);
			} catch(Exception ignored) {
				
			}
			
		}
	}

	public static Image getImageForObject(Object o) {
		Icon icon = getIconForObject(o);
		if (icon != null)
			return getImage(icon);
		return null;
	}

	/**
	 * @param o
	 * @return
	 */
	private static Icon getIconForDiv(DivType o) {
		if (METSConstants.Div_File.equals(o.getTYPE())) {
			return Icon.File;
		} else if (METSConstants.Div_Folder.equals(o.getTYPE())) {
			return Icon.Folder;
		} else if (METSConstants.Div_Collection.equals(o.getTYPE())) {
			return Icon.Collection;
		} else if (METSConstants.Div_AggregateWork.equals(o.getTYPE())) {
			return Icon.AggregateWork;
		} else if (METSConstants.Div_Disk.equals(o.getTYPE())) {
			return Icon.HardDisk;
		}
		return null;
	}

	/**
	 * @param o
	 * @return
	 */
	private static Icon getIconForResource(IResource o) {
		Icon result = null;
		if (o instanceof IProject) {
			boolean open = ((IProject) o).isOpen();
			result = open ? Icon.OpenProject : Icon.ClosedProject;
		} else if (o instanceof IFolder) {
			IFolder f = (IFolder) o;
			if (f.getProject().equals(f.getParent())) {
				// top level folder
				// TODO what kind of drive?
				result = Icon.HardDisk;
			} else {
				result = Icon.Folder;
			}
		} else if (o instanceof IFile) {
			// TODO registry of file type icons
			result = Icon.File;
		}
		return result;
	}

	/**
	 * @param o
	 * @return
	 */
	public static Image getImageForExtension(String ext) {
		Image image = registry.get(ext);
		if (image != null)
			return image;

		Program program = Program.findProgram(ext);
		ImageData imageData = (program == null ? null : program.getImageData());
		if (imageData != null) {
			image = new Image(Display.getCurrent(), imageData);
			registry.put(ext, image);
		} else {
			image = getImage(Icon.File);
		}
		return image;
	}

	public static Image getDiskImage(String type) {
		Icon icon = null;
		if (type == null) {
			icon = Icon.HardDisk;
		} else {
			icon = diskImages.get(type);
			if (icon == null) {
				icon = Icon.HardDisk;
			}
		}
		return icon.getImage();
	}
}
