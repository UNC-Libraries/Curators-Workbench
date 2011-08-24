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

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;

import unc.lib.cdr.workbench.project.AbstractCustomProjectElement;
import unc.lib.cdr.workbench.project.ICustomProjectElement;
import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 *
 */
public class OriginalFoldersProjectElement extends AbstractCustomProjectElement implements ICustomProjectElement {
	private static final String label = "Originals";
	private IFolder folder = null;

	/**
	 * @param n
	 */
	public OriginalFoldersProjectElement(MetsProjectNature n) {
		super(n);
		this.folder = n.getOriginalsFolder();
	}

	@Override
	public Object[] getChildren() {
		try {
			return folder.members();
		} catch (CoreException e) {
			e.printStackTrace();
			throw new Error("Unexpected", e);
		}
	}

	@Override
	public boolean hasChildren() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see unc.lib.cdr.workbench.project.ICustomProjectElement#getText()
	 */
	@Override
	public String getText() {
		return label;
	}

}
