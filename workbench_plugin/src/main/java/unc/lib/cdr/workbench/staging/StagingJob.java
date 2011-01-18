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
package unc.lib.cdr.workbench.staging;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;

import unc.lib.cdr.workbench.IResourceConstants;

/**
 * @author Gregory Jansen
 *
 */
public class StagingJob extends Job {
    List<IFile> toStage = null;

    /**
     * @param name
     */
    public StagingJob(String name, List<IFile> toStage) {
	super(name);
	this.toStage = toStage;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.
     * IProgressMonitor)
     */
    @Override
    protected IStatus run(IProgressMonitor monitor) {
	monitor.beginTask("Staging captured files..", toStage.size());
	for (IFile r : toStage) {
	    try {
		// is it still captured and not already staged?
		IMarker[] captured = r.findMarkers(IResourceConstants.MARKER_CAPTURED, false, IResource.DEPTH_ZERO);
		IMarker[] staged = r.findMarkers(IResourceConstants.MARKER_STAGED, false, IResource.DEPTH_ZERO);
		if (captured.length > 0) {
		    if (staged.length == 0) {
			StagingUtils.stage(r, new SubProgressMonitor(monitor, 1));
		    }
		}
	    } catch (CoreException e) {
		try {
		    IMarker m = r.createMarker(IMarker.PROBLEM);
		    m.setAttribute(IMarker.MESSAGE, "Failed to stage file: "+e.getLocalizedMessage());
		    m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
		} catch (CoreException e1) {
		    e1.printStackTrace();
		    return e1.getStatus();
		}
	    }
	}
	monitor.done();
	return Status.OK_STATUS;
    }

}
