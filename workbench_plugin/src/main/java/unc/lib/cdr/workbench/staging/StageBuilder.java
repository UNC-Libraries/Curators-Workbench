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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.IResourceConstants;

public class StageBuilder extends IncrementalProjectBuilder {
    private static final Logger log = LoggerFactory.getLogger(StageBuilder.class);

    public StageBuilder() {
    }

    /* (non-Javadoc)
     * @see org.eclipse.core.resources.IncrementalProjectBuilder#build(int, java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
     *
     * audits and repairs previously staged files when arg["verify"] == Boolean.True
     */
    @Override
    protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
	IProject[] result = null;
	boolean audit = false;
	if(args != null && Boolean.TRUE.equals(args.get("audit"))) {
	    audit = true;
	}
	IResourceDelta delta = getDelta(getProject());
	if (delta == null) {
	    fullBuild(audit, monitor);
	} else {
	    incrementalBuild(delta, audit, monitor);
	}
	ResourcesPlugin.getWorkspace().save(false, monitor);
	return result;
    }

    protected void fullBuild(boolean audit, final IProgressMonitor monitor) throws CoreException {
	// gather all the files to be staged, put the set in a job
	// job must recheck each marker before staging to prevent conflict.
	IMarker[] captured = getProject().findMarkers(IResourceConstants.MARKER_CAPTURED, false, IResource.DEPTH_INFINITE);
	List<IFile> toStage = new ArrayList<IFile>();
	for(IMarker m : captured) {
	    if(m.getResource() instanceof IFile) {
		IMarker[] staged = m.getResource().findMarkers(IResourceConstants.MARKER_STAGED, false, IResource.DEPTH_ZERO);
		if(staged.length > 0) {
		} else {
		    toStage.add((IFile)m.getResource());
		}
	    } else {
		// TODO detect files changed since the last stage and prompt user
		//   a list with filename, mod date, checkboxes and select/deselect all would do it.
	    }
	}
	Job stagingJob = new StagingJob("Staging all captured files", toStage);
	stagingJob.schedule();

	if(audit) {
	    // TODO audit jobs
	    //monitor.beginTask("Staging " + stages + " files and auditing "+audits+".", audits+stages);
	    //log.debug("Staging " + stages + " files and auditing "+audits+"...");
	}
    }

    protected void incrementalBuild(IResourceDelta delta, boolean audit, IProgressMonitor monitor) throws CoreException {
	List<IFile> toStage = new ArrayList<IFile>();
	IMarkerDelta[] mds = delta.getMarkerDeltas();
	for(IMarkerDelta md : mds) {
	    if(md.getKind() == IResourceDelta.ADDED &&
			    IResourceConstants.MARKER_CAPTURED.equals(md.getType())) {
		IResource r = md.getResource();
		if(r instanceof IFile) {
		    IMarker[] staged = r.findMarkers(IResourceConstants.MARKER_STAGED, false, IResource.DEPTH_ZERO);
		    if(staged.length == 0) {
			toStage.add((IFile)r);
		    }
		}
	    }
	}
	Job stagingJob = new StagingJob("Staging captured files", toStage);
	stagingJob.schedule();
    }



}
