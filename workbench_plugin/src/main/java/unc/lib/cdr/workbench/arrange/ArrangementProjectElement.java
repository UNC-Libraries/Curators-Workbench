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
package unc.lib.cdr.workbench.arrange;

import org.eclipse.jface.resource.ImageDescriptor;

import unc.lib.cdr.workbench.project.AbstractCustomProjectElement;
import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 * 
 */
public class ArrangementProjectElement extends AbstractCustomProjectElement {
	/**
	 * @param n
	 */
	public ArrangementProjectElement(MetsProjectNature n) {
		super(n);
	}

	private static final String label = "Arrangement";

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
		return null;
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
