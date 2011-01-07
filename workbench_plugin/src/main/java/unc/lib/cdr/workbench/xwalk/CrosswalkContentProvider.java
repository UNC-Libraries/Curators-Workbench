package unc.lib.cdr.workbench.xwalk;

import gov.loc.mets.MdSecType;
import gov.loc.mets.util.METSConstants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
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

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class CrosswalkContentProvider implements ITreeContentProvider, IResourceChangeListener {
    @SuppressWarnings("unused")
    private static final Logger LOG = LoggerFactory.getLogger(CrosswalkContentProvider.class);
    Viewer viewer = null;

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
     * @see
     * org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.
     * Object)
     */
    @Override
    public Object[] getChildren(Object parent) {
	// log.debug("getChildren:"+parent.toString());
	List<Object> results = new ArrayList<Object>();
	try {
	    if (parent instanceof IProject) {
		IProject p = (IProject) parent;
		MetsProjectNature n = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
		results.add(n.getCrosswalksElement());
	    } else if (parent instanceof CrosswalksProjectElement) {
		CrosswalksProjectElement e = (CrosswalksProjectElement) parent;
		return e.getChildren();
	    } else if (parent instanceof IContainer) {
		IContainer f = (IContainer) parent;
		for (IResource r : f.members()) {
		    results.add(r);
		}
	    } else if (parent instanceof CrosswalkTreeElement) {
		IFile f = ((CrosswalkTreeElement) parent).getFile();
		IProject p = f.getProject();
		MetsProjectNature n = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
		for (MdSecType dmd : n.getMets().getDmdSec()) {
		    if (f.getName().equals(dmd.getGROUPID())) {
			results.add(dmd);
		    }
		}
	    }
	} catch (CoreException e) {
	    throw new Error(e);
	}
	return results.toArray();
    }

    @Override
    public Object getParent(Object element) {
	Object result = null;
	if (element instanceof IResource) {
	    IResource r = (IResource) element;
	    String[] segments = r.getProjectRelativePath().segments();
	    if (segments.length == 2) {
		// found a crosswalk, return CrosswalksProjectElement
		MetsProjectNature n;
		try {
		    n = (MetsProjectNature) r.getProject().getNature(MetsProjectNature.NATURE_ID);
		} catch (CoreException e) {
		    throw new Error("Unexpected");
		}
		return n.getCrosswalksElement();
	    } else {
		// should be a resource within an originals folder, use
		// getParent()
		return r.getParent();
	    }
	} else {
	    return result;
	}
    }

    @Override
    public boolean hasChildren(Object element) {
	if (element instanceof IContainer) {
	    return true;
	} else if (element instanceof CrosswalksProjectElement) {
	    return ((CrosswalksProjectElement) element).hasChildren();
	} else if (element instanceof CrosswalkTreeElement) {
	    return true;
	}
	return false;
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
