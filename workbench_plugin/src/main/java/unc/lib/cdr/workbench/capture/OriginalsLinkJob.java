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

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;

import unc.lib.cdr.workbench.IResourceConstants;
import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 *
 */
public class OriginalsLinkJob extends Job {
	List<URI> locations = null;
	String name = null;
	IProject project = null;
	List<IFolder> folders = new ArrayList<IFolder>();

	OriginalsLinkJob(List<URI> locations, IProject project) {
		super("creating link to " + locations.size() + " location(s)");
		this.locations = locations;
		this.project = project;
	}

	public List<IFolder> getLinkFolders() {
		return this.folders;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @seeorg.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime. IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		IStatus result = null;
		System.out.println("starting folder link");
		monitor.beginTask("Linking to original folders ...", this.locations.size());
		IFolder originalsFolder = this.project.getFolder(MetsProjectNature.ORIGINALS_FOLDER_NAME);

		try {
			for (URI location : locations) {
				IPath path = new Path(location.getPath());
				IFolder folder = originalsFolder.getFolder(path.lastSegment());
				if (folder.exists() && folder.getLocationURI().equals(location)) {
					// already linked to this original folder, continue
					continue;
				}
				for(int suffix = 1; folder.exists(); suffix++) {
					folder = originalsFolder.getFolder(path.lastSegment()+"_"+suffix);
				}
				monitor.subTask("Linking " + location);
				folder.createLink(location, IFolder.ALLOW_MISSING_LOCAL | IFolder.BACKGROUND_REFRESH,
						new SubProgressMonitor(monitor, 1));
				IMarker marker = folder.createMarker(IResourceConstants.MARKER_ORIGINALFILESET);
				marker.setAttribute("type", location.getScheme());
				this.folders.add(folder);
			}
			project.getWorkspace().save(false, monitor);
			monitor.done();
			return Status.OK_STATUS;
		} catch (CoreException e) {
			return e.getStatus();
		}
	}

}
