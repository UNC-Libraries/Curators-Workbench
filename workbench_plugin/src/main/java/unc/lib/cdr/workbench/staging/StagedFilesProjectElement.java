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

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.AbstractCustomProjectElement;
import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.rcp.Activator;

/**
 * @author Gregory Jansen
 * 
 */
public class StagedFilesProjectElement extends AbstractCustomProjectElement {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(StagedFilesProjectElement.class);

	private static final String text = "Staged Files";
	private IFolder folder = null;

	public StagedFilesProjectElement(MetsProjectNature nature) {
		super(nature);
		folder = nature.getStageFolder();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see unc.lib.cdr.workbench.project.ICustomProjectElement#getImage()
	 */
	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see unc.lib.cdr.workbench.project.ICustomProjectElement#getChildren()
	 */
	@Override
	public Object[] getChildren() {
		try {
			if (this.getFolder() != null) {
				return this.getFolder().members();
			} else {
				LOG.debug("stage folder was null");
			}
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
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
