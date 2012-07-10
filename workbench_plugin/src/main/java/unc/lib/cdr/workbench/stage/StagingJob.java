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
package unc.lib.cdr.workbench.stage;

import java.net.URI;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;

import unc.lib.cdr.workbench.originals.OriginalFileStore;

/**
 * @author Gregory Jansen
 * 
 */
public class StagingJob extends Job {
	List<OriginalFileStore> toStage = null;

	/**
	 * @param name
	 */
	public StagingJob(String name, List<OriginalFileStore> toStage2) {
		super(name);
		this.toStage = toStage2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime. IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		monitor.beginTask("Staging " + toStage.size() + " files", toStage.size() * 100);
		monitor.setTaskName("Staging 1 of " + toStage.size());
		int stageCount = 0;
		Set<IProject> projects = new HashSet<IProject>();
		for (OriginalFileStore original : toStage) {
			monitor.setTaskName("Staging " + stageCount++ + " of " + toStage.size());
			URI prestagedLocation = original.getPrestagedLocation();
			try {
			if (prestagedLocation != null) {
				StagingUtils.prestage(original, prestagedLocation, new SubProgressMonitor(monitor, 100,
						SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK));
			} else {
				StagingUtils.stage(original,
						new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK));
			}
			} catch(CoreException e) {
				
			}
		}
		monitor.done();
		return Status.OK_STATUS;
	}

}
