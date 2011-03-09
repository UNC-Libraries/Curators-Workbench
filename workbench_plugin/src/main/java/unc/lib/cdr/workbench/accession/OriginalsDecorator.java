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
package unc.lib.cdr.workbench.accession;

import gov.loc.mets.DivType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.util.METSConstants;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.IResourceConstants;
import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.rcp.Activator;
import unc.lib.cdr.workbench.views.LabelImageFactory;

public class OriginalsDecorator implements ILightweightLabelDecorator, IResourceChangeListener {
    Set<ILabelProviderListener> listeners = new HashSet<ILabelProviderListener>();

    public OriginalsDecorator() {
	ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
    }

    @SuppressWarnings("unused")
    private static final Logger LOG = LoggerFactory.getLogger(OriginalsDecorator.class);

    @Override
    public void addListener(ILabelProviderListener listener) {
	this.listeners.add(listener);
    }

    @Override
    public void dispose() {
	this.listeners.clear();
    }

    @Override
    public boolean isLabelProperty(Object element, String property) {
	return true;
    }

    @Override
    public void removeListener(ILabelProviderListener listener) {
	this.listeners.remove(listener);
    }

    @Override
    public void decorate(Object element, IDecoration decoration) {
	IResource r = null;
	boolean isDiv = false;
	if (element instanceof IResource) {
	    r = (IResource) element;
	} else if (element instanceof DivType) {
	    isDiv = true;
	    DivType d = (DivType) element;
	    Object adapted = Platform.getAdapterManager().getAdapter(d, IResource.class);
	    if (adapted != null && adapted instanceof IResource) {
		r = (IResource) adapted;
	    }
	    // described, crosswalked
	    MetsProjectNature n = MetsProjectNature.getNatureForMetsObject(d);
	    if (d.getDMDID() != null) {
		boolean userEdited = false;
		boolean crosswalked = false;
		for (String id : d.getDMDID()) {
		    MdSecType md = (MdSecType) n.getMetsResource().getEObject(id);
		    if (md != null) {
			String st = md.getSTATUS();
			if (METSConstants.MD_STATUS_CROSSWALK_LINKED.equals(st)) {
			    decoration.addOverlay(LabelImageFactory
					    .getImageDescriptorForKey(LabelImageFactory.CROSSWALKED_DECORATOR),
					    IDecoration.BOTTOM_LEFT);
			} else if (METSConstants.MD_STATUS_USER_EDITED.equals(st)) {
			    decoration.addOverlay(LabelImageFactory
					    .getImageDescriptorForKey(LabelImageFactory.USER_EDITED_DECORATOR),
					    IDecoration.TOP_RIGHT);
			} else if (METSConstants.MD_STATUS_CROSSWALK_USER_LINKED.equals(st)) {
			    decoration.addOverlay(LabelImageFactory
					    .getImageDescriptorForKey(LabelImageFactory.CROSSWALKED_DECORATOR),
					    IDecoration.BOTTOM_LEFT);
			}
		    }
		}
	    }
	}

	// added/captured, queued/staged BR
	try {
	    ImageDescriptor overlay = null;
	    if (r != null && r.getProject() != null && r.getProject().isOpen()) {
		if (r.findMarkers(IResourceConstants.MARKER_CAPTURED, false, IResource.DEPTH_ZERO).length > 0) {
		    boolean isFolder = (r instanceof IContainer);
		    if (isFolder) { // captured original folder
			decoration.addSuffix("  captured");
		    } else {
			if (r.findMarkers(IResourceConstants.MARKER_STAGED, false, IResource.DEPTH_ZERO).length > 0) {

			    // captured file (original or the div)
			    overlay = LabelImageFactory.getImageDescriptorForKey(LabelImageFactory.STAGED_DECORATOR);
			    decoration.addSuffix("  staged");
			} else {
			    overlay = Activator.getDefault().getImageRegistry()
					    .getDescriptor(LabelImageFactory.CAPTURE_DECORATOR);
			    decoration.addSuffix("  queued");
			}
		    }
		}
	    } else {
		if (isDiv) {
		    decoration.addSuffix("  added");
		}
	    }
	    if (overlay != null) {
		decoration.addOverlay(overlay, IDecoration.BOTTOM_RIGHT);
	    }
	} catch (CoreException ignored) {
	    ignored.printStackTrace();
	}
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
	Set<Object> changes = new HashSet<Object>();
	IMarkerDelta[] captures = event.findMarkerDeltas(IResourceConstants.MARKER_CAPTURED, false);
	IMarkerDelta[] stages = event.findMarkerDeltas(IResourceConstants.MARKER_STAGED, false);
	for (IMarkerDelta d : captures) {
	    if (d.getResource().getProject().isOpen()) {
		changes.add(d.getResource());
		try {
		    MetsProjectNature n = (MetsProjectNature) d.getResource().getProject()
				    .getNature(MetsProjectNature.NATURE_ID);
		    String divID = IResourceConstants.getCapturedDivID(d.getResource());
		    if (n != null && n.getMetsResource() != null && divID != null) {
			Object div = n.getMetsResource().getEObject(divID);
			if(div != null) {
			    changes.add(div);
			}
		    }

		} catch (CoreException e1) {
		    e1.printStackTrace();
		}
	    }
	}
	for (IMarkerDelta d : stages) {
	    if (d.getResource().getProject().isOpen()) {
		changes.add(d.getResource());
		try {
		    MetsProjectNature n = (MetsProjectNature) d.getResource().getProject()
				    .getNature(MetsProjectNature.NATURE_ID);
		    String divID = IResourceConstants.getCapturedDivID(d.getResource());
		    if (n != null && n.getMetsResource() != null && divID != null) {
			Object div = n.getMetsResource().getEObject(divID);
			if(div != null) {
			    changes.add(div);
			}
		    }
		} catch (CoreException e1) {
		    e1.printStackTrace();
		}
	    }
	}
	if (changes.size() > 0) {
	    LabelProviderChangedEvent e = new LabelProviderChangedEvent(this, changes.toArray());
	    for (ILabelProviderListener l : listeners) {
		l.labelProviderChanged(e);
	    }
	}
    }

}
