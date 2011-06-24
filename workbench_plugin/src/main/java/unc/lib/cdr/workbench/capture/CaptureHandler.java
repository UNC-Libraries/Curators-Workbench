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
package unc.lib.cdr.workbench.capture;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IWorkbenchSiteProgressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.IResourceConstants;

public class CaptureHandler extends AbstractHandler {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(CaptureHandler.class);

	/*
	 * if parent folders have been arranged, they will stay in their places, reset arrangement is separate!
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands. ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		List<IResource> toCapture = new ArrayList<IResource>();
		ISelectionProvider sp = HandlerUtil.getActiveSite(event).getSelectionProvider();
		IStructuredSelection s = (IStructuredSelection) sp.getSelection();
		toCapture.addAll(s.toList());

		CaptureJob job = new CaptureJob("Capturing " + Integer.toString(toCapture.size()) + " items...", toCapture);
		IWorkbenchPart part = HandlerUtil.getActivePart(event);
		if (part != null) {
			IWorkbenchSiteProgressService siteService = (IWorkbenchSiteProgressService) part.getSite().getAdapter(
					IWorkbenchSiteProgressService.class);
			Shell shell = HandlerUtil.getActiveShell(event);
			siteService.showInDialog(shell, job);
			siteService.schedule(job);
		} else {
			job.schedule();
		}
		return null;
	}

	/**
	 * @param toCapture
	 * @throws CoreException
	 */
	private void addFolderContents(List<IResource> toCapture) throws CoreException {
		Set<IResource> additions = new HashSet<IResource>();
		// for each Folder, if no contents are selected individually, add all contents
		foldercheck: for (IResource r : toCapture) {
			if (r instanceof IFolder) {
				IFolder f = (IFolder) r;
				IPath p = f.getFullPath();
				for (IResource check : toCapture) {
					if (!f.equals(check) && p.isPrefixOf(check.getFullPath())) {
						LOG.debug(f.getName() + " found selected children, breaking here..");
						break foldercheck;
					}
				}
				// no children were selected, so add them all
				addMembersRecursive(additions, f);
			}
		}
		toCapture.addAll(additions);
	}

	/**
	 * @param additions
	 *           the set to add members to
	 * @param f
	 *           the folder
	 */
	private void addMembersRecursive(Set<IResource> additions, IFolder f) throws CoreException {
		for (IResource r : f.members()) {
			additions.add(r);
			if (r instanceof IFolder) {
				IFolder cf = (IFolder) r;
				addMembersRecursive(additions, cf);
			}
		}
	}

	/**
	 * @param toCapture
	 * @return
	 */
	private Set<IResource> findPreviouslyCaptured(List<IResource> toCapture) throws CoreException {
		Set<IResource> result = new HashSet<IResource>();
		for (Object o : toCapture) {
			IResource r = (IResource) o;
			IMarker[] ms = r.findMarkers(IResourceConstants.MARKER_CAPTURED, false, IResource.DEPTH_ZERO);
			if (ms.length > 0) {
				result.add(r);
			}
		}
		return result;
	}

}
