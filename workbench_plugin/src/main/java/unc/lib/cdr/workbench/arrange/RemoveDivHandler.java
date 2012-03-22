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

import gov.loc.mets.DivType;
import gov.loc.mets.DocumentRoot;
import gov.loc.mets.MdSecType;
import gov.loc.mets.SmLinkType;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
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
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands. ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection select = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		for (Object o : select.toList()) {
			if (o instanceof DivType) {
				DivType d = (DivType) o;
				IProject project = MetsProjectNature.getProjectForMetsEObject(d);
				removeCaptureMarker(d, project);
				for(TreeIterator<EObject> iter = d.eAllContents(); iter.hasNext();) {
					EObject eobj = iter.next();
					if(DivType.class.isInstance(eobj)) {
						removeCaptureMarker((DivType)eobj, project);
					}
				}
				EditingDomain ed = MetsProjectNature.getEditingDomain(d);
				Command cmd = RemoveCommand.create(ed, o);
				try {
					if(cmd.canExecute()) {
						ed.getCommandStack().execute(cmd);
					}
				} catch (NullPointerException e) {
					e.printStackTrace();
				}				
			}
		}
		return null;
	}

	/**
	 * @param d
	 */
	private void removeCaptureMarker(DivType d, IProject project) {
		// get top folder/file
		if (d.getCONTENTIDS() != null && d.getCONTENTIDS().size() > 0) {
			String originalLoc = d.getCONTENTIDS().get(0);
			try {
				URI location = new URI(originalLoc);
				IResource r = null;
				IResource[] found = null;
				if (METSUtils.isContainer(d)) {
					found = ResourcesPlugin.getWorkspace().getRoot().findContainersForLocationURI(location);
				} else {
					found = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(location);
				}
				for (IResource f : found) {
					if (project.equals(f.getProject())) {
						r = f;
						break;
					}
				}
				if (r != null) {
					r.deleteMarkers(IResourceConstants.MARKER_CAPTURED, true, r.DEPTH_ZERO);
				} else {
					LOG.debug("Did not find resource for URI: " + location);
				}
			} catch (URISyntaxException e) {
				e.printStackTrace();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		// remove capture and stage markers with infinite depth
	}
}
