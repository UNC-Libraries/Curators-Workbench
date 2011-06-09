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
package unc.lib.cdr.workbench.xwalk;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;

import unc.lib.cdr.workbench.IResourceConstants;
import unc.lib.cdr.workbench.project.AbstractCustomProjectElement;
import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 * 
 */
public class CrosswalksProjectElement extends AbstractCustomProjectElement {
	private static final String text = "Crosswalks";
	private IFolder folder = null;

	public CrosswalksProjectElement(MetsProjectNature nature) {
		super(nature);
		folder = this.getProject().getFolder("crosswalks");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see unc.lib.cdr.workbench.project.ICustomProjectElement#getImage()
	 */
	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see unc.lib.cdr.workbench.project.ICustomProjectElement#getChildren()
	 */
	@Override
	public Object[] getChildren() {
		List<CrosswalkTreeElement> results = new ArrayList<CrosswalkTreeElement>();
		try {
			for (IResource r : folder.members()) {
				if (r instanceof IFile) {
					IFile cwfile = (IFile) r;
					if (IResourceConstants.CROSSWALK_EXTENSION.equals(cwfile.getFileExtension())) {
						results.add(new CrosswalkTreeElement(cwfile));
					}
				}
			}
			return results.toArray();
		} catch (CoreException ignored) {
		}
		return NO_CHILDREN;
	}

	public IFolder getFolder() {
		return folder;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see unc.lib.cdr.workbench.project.ICustomProjectElement#getText()
	 */
	@Override
	public String getText() {
		return text;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see unc.lib.cdr.workbench.project.ICustomProjectElement#hasChildren()
	 */
	@Override
	public boolean hasChildren() {
		return true;
	}

}
