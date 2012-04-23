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

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.core.runtime.jobs.Job;

import unc.lib.cdr.workbench.IResourceConstants;
import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.readonly.ReadOnlyWrapperFileSystem;
import unc.lib.cdr.workbench.readonly.VolumeUtil;

/**
 * @author Gregory Jansen
 *
 */
public class OriginalsLinkJob extends Job {
	URI baselocation = null;
	List<URI> locations = null;
	String name = null;
	IProject project = null;
	List<IResource> links = new ArrayList<IResource>();
	private boolean prestaged;
	private URI prestagedBase;

	OriginalsLinkJob(URI baselocation, List<URI> locations, IProject project, boolean prestaged, URI prestagedBase) {
		super("creating link to " + locations.size() + " location(s)");
		this.baselocation = baselocation;
		this.locations = locations;
		this.project = project;
		this.prestaged = prestaged;
		this.prestagedBase = prestagedBase;
	}

	public List<IResource> getLinks() {
		return this.links;
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
		System.out.println("starting link");
		monitor.beginTask("Linking to originals ...", this.locations.size());
		IFolder originalsFolder = this.project.getFolder(MetsProjectNature.ORIGINALS_FOLDER_NAME);
		try {
			for (URI location : locations) {
				IFileStore fs = ReadOnlyWrapperFileSystem.wrapStore(location);
				boolean isDir = fs.fetchInfo().isDirectory();

				String linkName = null;
				IPath path = new Path(fs.toURI().getPath());
				if (path != null && path.segments().length > 0 && path.lastSegment().trim().length() > 0) {
					linkName = path.lastSegment();
				} else if (path.getDevice() != null) {
					linkName = path.getDevice().replaceAll(":", "");
				} else {
					linkName = "ROOT";
				}
				IResource link = null;
				if (isDir) {
					link = originalsFolder.getFolder(linkName);
				} else {
					link = originalsFolder.getFile(linkName);
				}
				if (link.exists() && link.getLocationURI().equals(fs.toURI())) {
					// already linked to this original folder, continue
					continue;
				}
				if (link.exists()) {
					for (int suffix = 1; link.exists(); suffix++) {
						if (isDir) {
							link = originalsFolder.getFolder(linkName + "_" + suffix);
						} else {
							link = originalsFolder.getFile(linkName + "_" + suffix);
						}
					}
				}
				monitor.subTask("Linking " + location);
				if (isDir) {
					((IFolder) link).createLink(fs.toURI(), IFolder.ALLOW_MISSING_LOCAL | IFolder.BACKGROUND_REFRESH,
							new SubProgressMonitor(monitor, 1));
				} else {
					((IFile) link).createLink(fs.toURI(), IFolder.ALLOW_MISSING_LOCAL | IFolder.BACKGROUND_REFRESH,
							new SubProgressMonitor(monitor, 1));
				}
				IMarker marker = link.createMarker(IResourceConstants.MARKER_ORIGINALFILESET);
				marker.setAttribute("type", location.getScheme());
				VolumeUtil.isVolumeRemovable(link);
				VolumeUtil.recordVolumeFingerprint(link);
				if (this.prestaged && this.prestagedBase != null && this.baselocation != null) {
					// calculate staging base for each original location
					IPath basePath = new Path(this.baselocation.getPath()); // base path for all locations
					IPath subPath = new Path(fs.toURI().getPath()).makeRelativeTo(basePath.removeLastSegments(1))
							.removeLastSegments(1);
					String myprestagestr = prestagedBase.toString();
					if (subPath.segmentCount() > 0) {
						URI myprestage = prestagedBase;
						for (String s : subPath.segments()) {
							myprestage = URIUtil.append(myprestage, s);
						}
						myprestagestr = myprestage.toString() + "/";
					}
					marker.setAttribute(IResourceConstants.MARKER_ORIGINALFILESET_PRESTAGEDBASE_ATT, myprestagestr);
				}
				this.links.add(link);
			}
			project.getWorkspace().save(false, monitor);
			monitor.done();
			return Status.OK_STATUS;
		} catch (CoreException e) {
			return e.getStatus();
		}
	}

}
