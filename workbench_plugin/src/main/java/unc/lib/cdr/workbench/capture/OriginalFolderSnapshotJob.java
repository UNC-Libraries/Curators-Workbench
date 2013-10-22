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

import static unc.lib.cdr.workbench.rcp.Activator.PLUGIN_ID;

import java.net.URI;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.IResourceConstants;

/**
 * @author Gregory Jansen
 * 
 */
public class OriginalFolderSnapshotJob extends Job {
	private static final Logger log = LoggerFactory
		.getLogger(OriginalFolderSnapshotJob.class);
	
	IFolder folder = null;

	/**
	 * @param name
	 *           job name
	 * @param folder
	 *           IFolder to rescan
	 */
	public OriginalFolderSnapshotJob(IFolder folder, boolean checksum) {
		super("take snapshot of " + folder.getName());
		this.folder = folder;
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
		try {
			log.debug("starting folder snapshot");
			// TODO compare with last snapshot and update markers for changes found
			// making "initial snapshot" vs. "taking up to date snapshot of original files"

			// test to make sure project is open
			IProject project = this.folder.getProject();
			if (!project.isOpen()) {
				throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, "The project is not open."));
			}

			// test to make sure top folder store is attached.
			URI topLocation = this.folder.getLocationURI();
			log.debug("HERE: " + topLocation);
			IFileStore store = EFS.getStore(topLocation);
			if (!store.fetchInfo(EFS.NONE, monitor).exists()) {
				return new Status(Status.ERROR, PLUGIN_ID, "The original files are not connected");
			}

			// fg.setVersDate(dateFormat.format(new Date(System.currentTimeMillis())));

			// recurse IFolder, capture structure and file info
			monitor.subTask("Refreshing linked original files..");
			snapshotResource(this.folder, monitor);
			project.getWorkspace().save(false, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
			return e.getStatus();
		}
		return Status.OK_STATUS;
	}

	private void snapshotResource(IResource r, IProgressMonitor monitor) throws CoreException {
		r.refreshLocal(IResource.DEPTH_ONE, monitor);

		// link and fill out the file record
		fillInfo(r);

		// recurse if a folder
		if (r instanceof IFolder) {
			IFolder f = (IFolder) r;
			IResource[] members = null;
			try {
				members = f.members();
			} catch (CoreException ignored) {
				// folder no longer exists
				// project not open
			}
			if (members != null) {
				for (IResource child : members) {
					snapshotResource(child, monitor);
				}
			}
		}
	}

	/**
	 * @param file
	 * @param r
	 */
	private void fillInfo(IResource r) throws CoreException {
		URI loc = r.getLocationURI();
		IFileStore st = EFS.getStore(loc);
		IFileInfo info = st.fetchInfo();
		if (!info.isDirectory()) {
			r.setPersistentProperty(IResourceConstants.BYTE_SIZE, Long.toString(info.getLength()));
		}
		r.setPersistentProperty(IResourceConstants.MODIFIED_TIMESTAMP, Long.toString(info.getLastModified()));
		r.setPersistentProperty(IResourceConstants.ORIGINAL_NAME, info.getName());
	}

}
