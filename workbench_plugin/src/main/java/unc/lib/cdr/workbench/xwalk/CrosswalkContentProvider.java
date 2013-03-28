/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package unc.lib.cdr.workbench.xwalk;

import gov.loc.mets.MdSecType;
import gov.loc.mets.util.METSUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.IResourceConstants;
import unc.lib.cdr.workbench.project.MetsProjectNature;

public class CrosswalkContentProvider implements ITreeContentProvider, IResourceChangeListener {
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(CrosswalkContentProvider.class);
	Viewer viewer = null;

	private static Object[] EMPTY_ARRAY = new Object[] {};
	
	public CrosswalkContentProvider() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	}

	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = viewer;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return this.getChildren(inputElement);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang. Object)
	 */
	@Override
	public Object[] getChildren(Object parent) {
		// log.debug("getChildren:"+parent.toString());
		try {
			if (parent instanceof IFile) {
				IFile f = (IFile) parent;
				if (IResourceConstants.CROSSWALK_EXTENSION.equals(f.getFileExtension())) {
					Map<Integer, MetadataCompartment> results = new HashMap<Integer, MetadataCompartment>();
					IProject p = f.getProject();
					MetsProjectNature n = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
					Collection<MdSecType> mdSecs = METSUtils.getAllMdSecTypes(n.getMets());
					for (MdSecType mdSec : mdSecs) {
						if (f.getName().equals(mdSec.getGROUPID())) {
							// crosswalk record IDs end in underscore and row number
							String row = mdSec.getID().substring(mdSec.getID().lastIndexOf("_")+1);
							Integer r = Integer.valueOf(Integer.parseInt(row));
							MetadataCompartment mc = null;
							if(results.get(Integer.valueOf(r)) == null) {
								mc = new MetadataCompartment();
								mc.row = r.intValue();
								results.put(r, mc);
							} else {
								mc = results.get(r);
							}
							mc.metadataSections.add(mdSec);
						}
					}
					return results.values().toArray();
				}
			} else if(parent instanceof MetadataCompartment) {
				MetadataCompartment mc = (MetadataCompartment)parent;
				return mc.metadataSections.toArray();
			}
		} catch (CoreException e) {
			throw new Error(e);
		}
		return EMPTY_ARRAY;
	}

	@Override
	public Object getParent(Object element) {
		Object result = null;
		if (element instanceof IResource) {
			IResource r = (IResource) element;
			// should be a resource within an originals folder, use
			// getParent()
			return r.getParent();
		} else {
			return result;
		}
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof IFile || element instanceof MetadataCompartment) {
			return true;
		}
		return false;
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
