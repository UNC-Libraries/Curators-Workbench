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
package unc.lib.cdr.workbench.accession;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
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

import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 *
 */
public class OriginalsContentProvider implements ITreeContentProvider, IResourceChangeListener {
    private static final Logger log = LoggerFactory.getLogger(OriginalsContentProvider.class);
    Viewer viewer = null;

    /**
     *
     */
    public OriginalsContentProvider() {
	 ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
     */
    @Override
    public Object[] getChildren(Object parent) {
	//log.debug("getChildren:"+parent.toString());
	List<Object> results = new ArrayList<Object>();
	try {
	    if(parent instanceof IProject) {
		IProject p = (IProject)parent;
		MetsProjectNature n = (MetsProjectNature)p.getNature(MetsProjectNature.NATURE_ID);
		results.add(n.getOriginalsElement());
	    } else if (parent instanceof OriginalFoldersProjectElement) {
		OriginalFoldersProjectElement e = (OriginalFoldersProjectElement)parent;
		return e.getChildren();
	    } else if (parent instanceof IContainer) {
		IContainer f = (IContainer) parent;
		for(IResource r : f.members()) {
		    results.add(r);
		}
	    }
	} catch (CoreException e) {
	    throw new Error(e);
	}
	return results.toArray();
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
     */
    @Override
    public Object getParent(Object element) {
	Object result = null;
	if(element instanceof IResource) {
	    IResource r = (IResource)element;
	    String[] segments = r.getProjectRelativePath().segments();
	    if(segments.length == 2) {
		// found an originals folder, return OriginalsProjectElement
		MetsProjectNature n;
		try {
		    n = (MetsProjectNature)r.getProject().getNature(MetsProjectNature.NATURE_ID);
		} catch (CoreException e) {
		    throw new Error("Unexpected");
		}
		return n.getOriginalsElement();
	    } else {
		// should be a resource within an originals folder, use getParent()
		return r.getParent();
	    }
	} else {
	    return result;
	}
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
     */
    @Override
    public boolean hasChildren(Object element) {
	if(element instanceof IContainer) {
	    return true;
	} else if(element instanceof OriginalFoldersProjectElement){
	    return ((OriginalFoldersProjectElement)element).hasChildren();
	} else {
	    return false;
	}
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
     */
    @Override
    public Object[] getElements(Object inputElement) {
	return this.getChildren(inputElement);
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.IContentProvider#dispose()
     */
    @Override
    public void dispose() {
	 ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
     */
    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	this.viewer = viewer;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.resources.IResourceChangeListener#resourceChanged(org
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
