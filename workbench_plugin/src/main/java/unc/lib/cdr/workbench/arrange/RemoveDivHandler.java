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

import gov.loc.mets.AmdSecType;
import gov.loc.mets.DivType;
import gov.loc.mets.FptrType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.util.METSConstants;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.IResourceConstants;
import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 *
 */
public class RemoveDivHandler extends AbstractHandler {

    @SuppressWarnings("unused")
    private static final Logger LOG = LoggerFactory.getLogger(RemoveDivHandler.class);

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.
     * ExecutionEvent)
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
	IStructuredSelection select = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
	for (Object o : select.toList()) {
	    // find cascading deletes in this and children
	    if (o instanceof DivType) {
		Set<EObject> toDelete = new HashSet<EObject>();
		DivType d = (DivType) o;
		toDelete.add(d);
		addLinkedElements(toDelete, d);
		removeCaptureMarker(d);
		TreeIterator<EObject> iter = d.eAllContents();
		while (iter.hasNext()) {
		    EObject i = iter.next();
		    if (i instanceof DivType) {
			DivType desc = (DivType) i;
			removeCaptureMarker(desc);
			addLinkedElements(toDelete, desc);
		    }
		}
		EditingDomain ed = MetsProjectNature.getEditingDomain(d);
		try {
		    Command cmd = RemoveCommand.create(ed, toDelete);
		    ed.getCommandStack().execute(cmd);
		} catch (NullPointerException e) {
		    // ignore, item's parent probably removed
		    e.printStackTrace();
		}
	    }
	}
	return null;
    }

    /**
     * @param d
     */
    private void removeCaptureMarker(DivType d) {
	// get top folder/file
	if (d.getCONTENTIDS() != null && d.getCONTENTIDS().size() > 0) {
	    String originalLoc = d.getCONTENTIDS().get(0);
	    try {
		IPath loc = new Path(new URI(originalLoc).getPath());
		LOG.debug("Trying to uncapture: " + originalLoc + "\nwith path:" + loc);
		IResource r = ResourcesPlugin.getWorkspace().getRoot().getContainerForLocation(loc);
		if (r == null) {
		    r = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(loc);
		}
		if (r != null) {
		    r.deleteMarkers(IResourceConstants.MARKER_CAPTURED, true, r.DEPTH_ZERO);
		} else {
		    LOG.debug("Cannot find resource for path: " + loc);
		}

	    } catch (URISyntaxException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (CoreException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
	// remove capture and stage markers with infinite depth
    }

    /**
     * Finds elements that are linked to in this DivType and adds them to the
     * supplied list
     *
     * @param toDelete
     *            the list
     * @param div
     *            the DivType with potential links
     */
    private void addLinkedElements(Set<EObject> toDelete, DivType div) {
	for (MdSecType dmd : div.getDmdSec()) {
	    if (METSConstants.MD_STATUS_CROSSWALK_LINKED.equals(dmd.getSTATUS())) {
		dmd.setSTATUS(METSConstants.MD_STATUS_CROSSWALK_NOT_LINKED);
	    }
	    if (METSConstants.MD_STATUS_CROSSWALK_USER_LINKED.equals(dmd.getSTATUS())) {
		dmd.setSTATUS(METSConstants.MD_STATUS_CROSSWALK_NOT_LINKED);
	    } else {
		toDelete.add(dmd);
	    }
	}
	for (MdSecType md : div.getMdSec()) {
	    toDelete.add(md);
	}
	if (div.getFptr() != null) {
	    for (FptrType f : div.getFptr()) {
		EObject ob = div.eResource().getEObject(f.getFILEID());
		if (ob != null) {
		    toDelete.add(ob);
		} else {
		    LOG.debug("Cannot find FILEID: " + f.getFILEID());
		}
	    }
	}
    }
}
