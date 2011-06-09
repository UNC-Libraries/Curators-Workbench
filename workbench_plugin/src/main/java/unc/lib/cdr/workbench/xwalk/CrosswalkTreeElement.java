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

import org.eclipse.core.resources.IFile;

import unc.lib.cdr.workbench.IResourceConstants;

/**
 * @author Gregory Jansen
 * 
 */
public class CrosswalkTreeElement {
	IFile file = null;

	public CrosswalkTreeElement(IFile file) {
		this.file = file;
	}

	/**
	 * @return
	 */
	public IFile getFile() {
		return this.file;
	}

	/**
	 * @return
	 */
	public String getName() {
		String fname = this.file.getName();
		return fname.substring(0, fname.length() - IResourceConstants.CROSSWALK_EXTENSION.length() - 1);
	}

}
