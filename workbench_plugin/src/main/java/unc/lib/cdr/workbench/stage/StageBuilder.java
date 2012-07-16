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

import gov.loc.mets.DivType;
import gov.loc.mets.FLocatType;
import gov.loc.mets.FptrType;
import gov.loc.mets.util.METSUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.project.MetsProjectNature;

public class StageBuilder extends IncrementalProjectBuilder {

	public StageBuilder() {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.resources.IncrementalProjectBuilder#build(int, java.util.Map,
	 * org.eclipse.core.runtime.IProgressMonitor)
	 *
	 * audits and repairs previously staged files when arg["verify"] == Boolean.True
	 */
	@Override
	protected IProject[] build(int kind, @SuppressWarnings("rawtypes") Map args, IProgressMonitor monitor) throws CoreException {
		IProject[] result = null;

		if(AUTO_BUILD == kind && !MetsProjectNature.getAutomaticStaging(getProject())) {
			System.out.println("skipping this auto build b/c auto staging says "+MetsProjectNature.getAutomaticStaging(getProject()));
			return result;
		}
		boolean audit = false;
		if (args != null && Boolean.TRUE.equals(args.get("audit"))) {
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
		// TODO find all divs that have fptr/files but no FLocat with staging use.

		List<OriginalFileStore> toStage = new ArrayList<OriginalFileStore>();
		
		MetsProjectNature mpn = MetsProjectNature.get(getProject());
		DivType bag = METSUtils.findBagDiv(mpn.getMets());
		for(TreeIterator<EObject> iter = bag.eAllContents(); iter.hasNext();) {
			EObject next = iter.next();
			if(next instanceof FptrType) {
				FptrType fptr = (FptrType)next;
				OriginalFileStore original = mpn.getOriginal((DivType)fptr.eContainer());
				if(original != null) {
					FLocatType loc = original.getStagingLocatorType();
					if(loc == null) {
						toStage.add(original);
					}
				}
			}
		}
		Job stagingJob = new StagingJob("Staging all captured files", toStage);
		stagingJob.schedule();

		if (audit) {
			// TODO audit jobs
			// monitor.beginTask("Staging " + stages + " files and auditing "+audits+".", audits+stages);
			// log.debug("Staging " + stages + " files and auditing "+audits+"...");
		}
	}

	protected void incrementalBuild(IResourceDelta delta, boolean audit, IProgressMonitor monitor) throws CoreException {
		fullBuild(audit, monitor);
	}

}
