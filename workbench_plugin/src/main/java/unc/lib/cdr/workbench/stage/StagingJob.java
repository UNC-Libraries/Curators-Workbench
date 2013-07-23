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

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import staging.plugin.ProjectBagItDataStage;
import staging.plugin.StagingPlugin;
import staging.plugin.StagingUtils;
import staging.plugin.StagingUtils.StagingResult;
import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.rcp.Activator;
import edu.unc.lib.staging.SharedStagingArea;
import edu.unc.lib.staging.Stages;
import edu.unc.lib.staging.StagingArea;
import gov.loc.mets.CHECKSUMTYPEType;
import gov.loc.mets.DivType;
import gov.loc.mets.FLocatType;
import gov.loc.mets.FileType;
import gov.loc.mets.FptrType;
import gov.loc.mets.LOCTYPEType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.util.METSUtils;

/**
 * @author Gregory Jansen
 * 
 */
public class StagingJob extends Job {
	private static final Logger log = LoggerFactory.getLogger(StagingJob.class); 
	IProject project = null;
	public static MutexRule mySchedulingRule = new MutexRule();
	StagingArea stage = null;

	public static class MutexRule implements ISchedulingRule {
		public boolean isConflicting(ISchedulingRule rule) {
			return rule == this;
		}

		public boolean contains(ISchedulingRule rule) {
			return rule == this;
		}
	}

	@Override
	public boolean belongsTo(Object family) {
		if (stagingJobFamilyObject == family) {
			return true;
		}
		return super.belongsTo(family);
	}

	public static final String stagingJobFamilyObject = "stagingFamily";

	/**
	 * @param name
	 */
	// public StagingJob(String name, List<OriginalFileStore> toStage2) {
	// super(name);
	// this.toStage = toStage2;
	// this.setRule(mySchedulingRule);
	// }

	/**
	 * @param name
	 */
	public StagingJob(String name, IProject project) {
		super(name);
		this.project = project;
		this.setRule(mySchedulingRule);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.
	 * IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		List<OriginalFileStore> toStage = new ArrayList<OriginalFileStore>();
		final MetsProjectNature mpn = MetsProjectNature.get(project);
		DivType bag = METSUtils.findBagDiv(mpn.getMets());
		Stages stages = StagingPlugin.getDefault().getStages();
		log.error(mpn.getStagingBase().toString());
		SharedStagingArea projectStage = (SharedStagingArea) stages
				.getStage(mpn.getStagingBase());
		URL destinationConfig = projectStage.getConfigURL();
		final StagingJob myJob = this;
		if (!projectStage.isConnected()) {
			StagingPlugin.getDefault().getStages().connect(projectStage.getURI());
		}
		if (!projectStage.isConnected()) {
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					if (MessageDialog
							.openConfirm(
									Display.getCurrent().getActiveShell(),
									"Project Staging Area Disconnected",
									"Press OK to stage files in the project data folder or cancel to turn off staging until connected.")) {
						// stage to project data folder (BagIt)
						stage = new ProjectBagItDataStage(mpn.getProject());
					} else { 
						// turn off project automatic staging
						MetsProjectNature.setAutomaticStaging(false,
								mpn.getProject());
						// cancel staging operation
						myJob.cancel();
					}
				}
			});
		} else {
			stage = projectStage;
		}
		if (monitor.isCanceled()) {
			return Status.CANCEL_STATUS;
		}
		for (TreeIterator<EObject> iter = bag.eAllContents(); iter.hasNext();) {
			EObject next = iter.next();
			if (next instanceof FptrType) {
				FptrType fptr = (FptrType) next;
				OriginalFileStore original = MetsProjectNature
						.getOriginal((DivType) fptr.eContainer());
				if (original != null) {
					FLocatType loc = original.getStagingLocatorType();
					if (loc == null) {
						toStage.add(original);
					} else {
					}
				} else {
					System.err.println(" cannot find original");
				}
			}
		}

		monitor.beginTask("Staging " + toStage.size() + " files",
				toStage.size() * 100);
		monitor.setTaskName("Staging 1 of " + toStage.size());

		int stageCount = 0;
		Set<OriginalFileStore> skipped = new HashSet<OriginalFileStore>();
		for (OriginalFileStore original : toStage) {
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;
			monitor.setTaskName(stageCount++ + " of " + toStage.size()
					+ " staged");
			String fileID = original.getFileID();
			FileType fileRec = (FileType) mpn.getMets().eResource()
					.getEObject(fileID);
			String divID = original.getDivID();
			DivType div = (DivType) mpn.getMets().eResource().getEObject(divID);
			if (div == null) {
				monitor.worked(100);
				continue;
			}
			// We used to delete older staging locations
			// Set<FLocatType> oldStageFLocat = new HashSet<FLocatType>();
			// for(FLocatType l : fileRec.getFLocat()) {
			// if(METSConstants.FLocat_USE_STAGE.equals(l.getUSE())) {
			// oldStageFLocat.add(l);
			// }
			// }
			// for(EObject e : oldStageFLocat) {
			// EcoreUtil.delete(e);
			// }
			try {
				if (original.isAttached()) {
					// TODO send md5 if we have it
					String md5sum = fileRec.getCHECKSUM();
					StagingResult result = StagingUtils
							.stage(original.getWrapped(),
									this.project,
									original.getDistinctStagingPath(),
									md5sum,
									stage,
									destinationConfig,
									new SubProgressMonitor(
											monitor,
											100,
											SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK));
					if (md5sum == null) { // use newly calculated
						fileRec.setCHECKSUMTYPE(CHECKSUMTYPEType.MD5);
						fileRec.setCHECKSUM(result.md5Sum);
					} else {
						if(!md5sum.equals(result.md5Sum)) {
							// TODO add a warning that file has changed.
							fileRec.setCHECKSUM(result.md5Sum);
							fileRec.setCHECKSUMTYPE(CHECKSUMTYPEType.MD5);
						}
					}
					// now update markers and record File in METS
					// checksum, size, location type, other loc type, URI
					FLocatType flocat = METSUtils.makeStagedFileLocator(mpn.getMets(),
							fileID, original.getWrapped().toURI(),
							result.manifestURI, LOCTYPEType.OTHER,
							result.manifestURIScheme);
					Command add = AddCommand.create(mpn.getEditingDomain(), fileRec,
							MetsPackage.eINSTANCE.getFileType_FLocat(), flocat);
					if (add.canExecute()) {
						mpn.getCommandStack().execute(add);
					} else {
						System.out.println("Cannot add Flocat via command");
					}
				} else {
					monitor.worked(100);
					skipped.add(original);
				}
			} catch (CoreException e) {
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
						"Job could not finish", e);
			}
		}
		monitor.done();

		if (skipped.size() > 0) {
			return new Status(
					IStatus.INFO,
					Activator.PLUGIN_ID,
					skipped.size()
							+ " original files cannot stage because they are not accessible.");
		} else {
			return Status.OK_STATUS;
		}
	}
}
