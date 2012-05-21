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
package unc.lib.cdr.workbench.stage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
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

import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 *
 */
public class StagedFileContentProvider implements ITreeContentProvider, IResourceChangeListener {
	private static final Logger log = LoggerFactory.getLogger(StagedFileContentProvider.class);
	Viewer viewer = null;

	private static Object[] EMPTY_ARRAY = new Object[] {};

	/**
     *
     */
	public StagedFileContentProvider() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang. Object)
	 */
	@Override
	public Object[] getChildren(Object parent) {
		try {
			if (parent instanceof IProject) {
				IProject p = (IProject) parent;
				if (p.isOpen()) {
					MetsProjectNature n = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
					return new Object[]{n.getStagedFilesElement()};
				}
			} else if (parent instanceof StagedFilesProjectElement) {
				StagedFilesProjectElement e = (StagedFilesProjectElement) parent;
				return e.getChildren();
			} else if (parent instanceof IFileStore) {
				List<Object> results = new ArrayList<Object>();
				IFileStore f = (IFileStore) parent;
				for (IFileStore r : f.childStores(EFS.NONE, new NullProgressMonitor())) {
					results.add(r);
				}
				return results.toArray();
			}
		} catch (CoreException e) {
			throw new Error(e);
		}
		return EMPTY_ARRAY;
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
			result = ((IFileStore)element).getParent();
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang. Object)
	 */
	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof IFileStore) {
			IFileStore fs = (IFileStore)element;
			return fs.fetchInfo().isDirectory();
		} else if (element instanceof StagedFilesProjectElement) {
			return ((StagedFilesProjectElement) element).hasChildren();
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
