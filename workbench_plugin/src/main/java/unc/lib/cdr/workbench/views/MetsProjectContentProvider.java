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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;

/**
 * Provides a tree of METS objects as organized in the DOM document. This supports a raw view of the data captured in
 * workbench METS projects.
 * 
 * @author Gregory Jansen
 * 
 */
public class MetsProjectContentProvider implements ITreeContentProvider, IResourceChangeListener {
	private static final Object[] NO_CHILDREN = {};
	private Object input = null;

	Viewer viewer = null;

	public MetsProjectContentProvider() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface .viewers.Viewer, java.lang.Object,
	 * java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = viewer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang. Object)
	 */
	@Override
	public Object[] getChildren(Object parent) {
		// System.out.println("getChildren called with parent: " + parent + " (" + parent.getClass() + ")");
		if (parent instanceof WorkbenchWorkbenchRoot) {
			List<Object> results = new ArrayList<Object>();
			for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
				// try {
				// if (p.isOpen() && p.hasNature(MetsProjectNature.NATURE_ID)) {
				results.add(p);
				// }
				// } catch (CoreException e) {
				// throw new Error("Unexpected");
				// }
			}
			return results.toArray();
		} /*
			 * else if (parent instanceof IProject) { IProject p = (IProject) parent; MetsProjectNature n; try { n =
			 * (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID); return n.getProjectElements(); } catch
			 * (CoreException e) { throw new Error("Unexpected"); } }
			 */
		return NO_CHILDREN;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object )
	 */
	@Override
	public Object getParent(Object element) {
		if (element instanceof IProject) {
			return input;
		} /*
			 * else if(element instanceof ICustomProjectElement) { ICustomProjectElement e =
			 * (ICustomProjectElement)element; return e.getParent(); }
			 */else {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang. Object)
	 */
	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof IProject) {
			return ((IProject) element).isOpen();
		} else if (element instanceof WorkbenchWorkbenchRoot) {
			return true;
		} /*
			 * else if(element instanceof ICustomProjectElement) { ICustomProjectElement e =
			 * (ICustomProjectElement)element; return e.hasChildren(); }
			 */else {
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java .lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IResourceChangeListener#resourceChanged(org
	 * .eclipse.core.resources.IResourceChangeEvent)
	 */
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				if (!viewer.getControl().isDisposed()) {
					viewer.refresh();
				}
			}
		});
	}

}
