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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
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
		monitor.beginTask("Staging "+toStage.size()+" files",
				toStage.size()*100);
		monitor.setTaskName("Staging 1 of "+toStage.size());
		int stageCount = 0;
		Set<IProject> projects = new HashSet<IProject>();
		for (IFile r : toStage) {
			IProject p = r.getProject();
			if (!projects.contains(p)) {
				projects.add(p);
			}
			try {
				// is it still captured and not already staged?
				IMarker[] captured = r.findMarkers(
						IResourceConstants.MARKER_CAPTURED, false,
						IResource.DEPTH_ZERO);
				IMarker[] staged = r.findMarkers(
						IResourceConstants.MARKER_STAGED, false,
						IResource.DEPTH_ZERO);
				if (captured.length > 0) {
					if (staged.length == 0) {
						stageCount++;
						monitor.setTaskName("Staging "+stageCount+" of "+toStage.size());
						StagingUtils.stage(r,
								new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK));
					}
				}
			} catch (CoreException e) {
				try {
					IMarker m = r.createMarker(IMarker.PROBLEM);
					m.setAttribute(IMarker.MESSAGE, "Failed to stage file: "
							+ e.getLocalizedMessage());
					m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
				} catch (CoreException e1) {
					e1.printStackTrace();
					return e1.getStatus();
				}
			}
		}
		// refreshLocal on staging folders in relevant projects
		for (IProject p : projects) {
			try {
				MetsProjectNature n = (MetsProjectNature) p
						.getNature(MetsProjectNature.NATURE_ID);
				n.getStageFolder().refreshLocal(IResource.DEPTH_INFINITE,
						new NullProgressMonitor());
			} catch (CoreException e) {
			}
		}
		monitor.done();
		return Status.OK_STATUS;
	}

}
