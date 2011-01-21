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

import java.net.URI;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
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
    URI location = null;
    String name = null;
    IProject project = null;
    IFolder folder = null;

    OriginalsLinkJob(URI location, String name, IProject project) {
	super("creating link \"" + name + "\" (" + location + ")");
	this.location = location;
	this.name = name;
	this.project = project;
    }

    public IFolder getLinkFolder() {
	return this.folder;
    }

    /*
     * (non-Javadoc)
     *
     * @seeorg.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.
     * IProgressMonitor)
     */
    @Override
    protected IStatus run(IProgressMonitor monitor) {
	if(monitor == null) {
	    monitor = new NullProgressMonitor();
	}
	IStatus result = null;
	System.out.println("starting folder link");
	monitor.beginTask("Adding original folder link ...", 100);
	IFolder originalsFolder = this.project.getFolder(MetsProjectNature.ORIGINALS_FOLDER_NAME);
	this.folder = originalsFolder.getFolder(name);
	try {
	    monitor.subTask("Creating link");
	    folder.createLink(location, IFolder.ALLOW_MISSING_LOCAL | IFolder.BACKGROUND_REFRESH, new SubProgressMonitor(monitor, 10));
	    IMarker marker = folder.createMarker(IResourceConstants.MARKER_ORIGINALFILESET);
	    marker.setAttribute("type", this.location.getScheme());
	    project.getWorkspace().save(false, monitor);
	    monitor.done();
	    return Status.OK_STATUS;
	} catch (CoreException e) {
	    return e.getStatus();
	}
    }

}
