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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.originals.Original;
import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 * 
 */
public class OriginalsContentProvider implements ITreeContentProvider {
	private static final Logger log = LoggerFactory.getLogger(OriginalsContentProvider.class);
	Viewer viewer = null;

	/**
     *
     */
	public OriginalsContentProvider() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang. Object)
	 */
	@Override
	public Object[] getChildren(Object parent) {
		// log.debug("getChildren:"+parent.toString());
		List<Object> results = new ArrayList<Object>();
		try {
			if (parent instanceof IProject) {
				IProject p = (IProject) parent;
				if (p.isOpen()) {
					MetsProjectNature n = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
					results.addAll(n.getOriginals());
				}
			} else if(parent instanceof Original) {
				Original original = (Original)parent;
				results.add(original.getStore());
			} else if (parent instanceof IFileStore) {
				IFileStore f = (IFileStore) parent;
				for (IFileStore r : f.childStores(0, new NullProgressMonitor())) {
					results.add(r);
				}
			}
		} catch (CoreException e) {
			throw new Error(e);
		}
		return results.toArray();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object )
	 */
	@Override
	public Object getParent(Object element) {
		Object result = null;
		if (element instanceof IFileStore) {
			return ((IFileStore)element).getParent();
		} else {
			return result;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang. Object)
	 */
	@Override
	public boolean hasChildren(Object element) {
		if(element instanceof Original) {
			return true;
		} else if(element instanceof IFileStore) {
			IFileStore fs = (IFileStore)element;
			try {
				return (fs.fetchInfo().isDirectory() && fs.childNames(EFS.NONE, new NullProgressMonitor()).length > 0);
			} catch(CoreException e) {
				e.printStackTrace();
				return false;
			}
		} else {
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
		return this.getChildren(inputElement);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
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

}
