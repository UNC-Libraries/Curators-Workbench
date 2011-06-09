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
package unc.lib.cdr.workbench.project;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import unc.lib.cdr.workbench.views.LabelImageFactory;

/**
 * @author Gregory Jansen
 * 
 */
public abstract class AbstractCustomProjectElement implements ICustomProjectElement, IWorkbenchAdapter {
	public static final Object[] NO_CHILDREN = {};
	private MetsProjectNature nature;

	public AbstractCustomProjectElement(MetsProjectNature n) {
		this.nature = n;
	}

	@Override
	public IProject getProject() {
		return this.nature.getProject();
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
		return NO_CHILDREN;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see unc.lib.cdr.workbench.project.ICustomProjectElement#hasChildren()
	 */
	@Override
	public boolean hasChildren() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see unc.lib.cdr.workbench.project.ICustomProjectElement#getProject()
	 */
	@Override
	public MetsProjectNature getProjectNature() {
		return this.nature;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see unc.lib.cdr.workbench.project.ICustomProjectElement#getParent()
	 */
	@Override
	public Object getParent() {
		return this.nature.getProject();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.model.IWorkbenchAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object o) {
		AbstractCustomProjectElement e = (AbstractCustomProjectElement) o;
		return e.getChildren();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.model.IWorkbenchAdapter#getImageDescriptor(java.lang.Object )
	 */
	@Override
	public ImageDescriptor getImageDescriptor(Object o) {
		return LabelImageFactory.getImageDescriptorForObject(o);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.model.IWorkbenchAdapter#getLabel(java.lang.Object)
	 */
	@Override
	public String getLabel(Object o) {
		AbstractCustomProjectElement e = (AbstractCustomProjectElement) o;
		return e.getText();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.model.IWorkbenchAdapter#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object o) {
		AbstractCustomProjectElement e = (AbstractCustomProjectElement) o;
		return e.getParent();
	}

}
