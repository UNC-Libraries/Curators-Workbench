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

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import staging.plugin.StagingPlugin;
import staging.plugin.StagingUtils;
import staging.plugin.StagingUtils.StagingResult;
import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.rcp.Activator;
import edu.unc.lib.staging.SharedStagingArea;
import edu.unc.lib.staging.Stages;
import edu.unc.lib.staging.StagingArea;
import edu.unc.lib.staging.StagingException;
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
	private final static String markerID = "workbench_plugin.stagingProblem";
	private static final Logger log = LoggerFactory.getLogger(StagingJob.class);
	IProject project = null;
	public static MutexRule mySchedulingRule = new MutexRule();
	StagingArea stage = null;
	URL destinationRepo = null;

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
		clearMarkers();
		List<OriginalFileStore> toStage = new ArrayList<OriginalFileStore>();
		Map<OriginalFileStore, FLocatType> toMigrate = new HashMap<OriginalFileStore, FLocatType>();
		final MetsProjectNature mpn = MetsProjectNature.get(project);
		DivType bag = METSUtils.findBagDiv(mpn.getMets());
		
		getEffectiveStagingArea(mpn);
		
		if (monitor.isCanceled()) {
			return Status.CANCEL_STATUS;
		}
		for (TreeIterator<EObject> iter = bag.eAllContents(); iter.hasNext();) {
			EObject next = iter.next();
			log.debug(next.toString());
			if (next instanceof FptrType) {
				FptrType fptr = (FptrType) next;
				OriginalFileStore original = MetsProjectNature
						.getOriginal((DivType) fptr.eContainer());
				log.error("original file store: "+original);
				if (original != null) {
					FLocatType loc = original.getStagingLocatorType();
					log.error("original staging locator: "+loc);
					if (loc == null) {
						toStage.add(original);
					} else {
						try {
							URI stagedLoc = new URI(loc.getHref());
							log.debug("found migration: "+original.toURI()+" "+stagedLoc);
							if (!stage.isWithinManifestNamespace(stagedLoc)) {
								toStage.add(original);
								toMigrate.put(original, loc);
							}
						} catch (URISyntaxException e) {
							log.error("Unable to make URI"+loc.getHref(), e);
						}
					}
				} else {
					log.error("Cannot get original file store for fptr: "+fptr);
				}
			}
		}

		String taskName = "Staging " + toStage.size() + " files";
		monitor.beginTask(taskName, toStage.size() * 100);
		int stageCount = 0;
		Set<OriginalFileStore> skipped = new HashSet<OriginalFileStore>();

		for (OriginalFileStore original : toStage) {
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;
			monitor.setTaskName("Staging " + stageCount++ + " of "
					+ toStage.size());

			// check if original still captured
			String fileID = original.getFileID();
			FileType fileRec = (FileType) mpn.getMets().eResource()
					.getEObject(fileID);
			String divID = original.getDivID();
			DivType div = (DivType) mpn.getMets().eResource().getEObject(divID);
			if (div == null) {
				monitor.worked(100);
				continue; // no longer captured
			}

			// find the source file for staging
			IFileStore stagingSource = null;
			if (toMigrate.containsKey(original)) {
				try {
					FLocatType loc = toMigrate.get(original);
					URI stagedManifestURI = new URI(loc.getHref());
					// get storage URI from manifest URI
					SharedStagingArea s = StagingPlugin.getDefault().getStages().findMatchingArea(stagedManifestURI);
					if(!s.isConnected()) StagingPlugin.getDefault().getStages().connect(s.getURI());
					URI stagedStorageURI = StagingPlugin.getDefault().getStages()
							.getStorageURI(stagedManifestURI);
					// resolve relative URIs against project location
					stagedStorageURI = mpn.resolveProjectRelativeURI(stagedStorageURI);
					stagingSource = EFS.getStore(stagedStorageURI);
 				} catch (URISyntaxException|CoreException|StagingException e) {
					log.error("Cannot locate previous stage URI", e);
				}
			} else if (original.isAttached()) {
				stagingSource = original.getWrapped();
			}
			if(stagingSource == null) {
				addProblemMarker("Cannot locate a staging source for "+original.toString());
				monitor.worked(100);
				skipped.add(original);
				continue;
			}

			// stage file, sending md5 if we have it
			String md5sum = fileRec.getCHECKSUM();
			StagingResult result = null;
			try {
				result = StagingUtils.stage(stagingSource,
					this.project, original.getDistinctStagingPath(), md5sum,
					stage, destinationRepo, new SubProgressMonitor(monitor,
							100,
							SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK));
			} catch(CoreException e) {
				mpn.setAutomaticStaging(false);
				addProblemMarker("Staging stopped due to an error, autostaging disabled: "+e.getMessage());
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Staging encountered an error and stopped, autostaging disabled.",e);
			}
			// set checksum
			if (md5sum == null) { // use newly calculated
				fileRec.setCHECKSUMTYPE(CHECKSUMTYPEType.MD5);
				fileRec.setCHECKSUM(result.md5Sum);
			} else {
				if (!md5sum.equals(result.md5Sum)) {
					addProblemMarker("A file changed since the last checksum was calculated: "+original.toString());
					fileRec.setCHECKSUM(result.md5Sum);
					fileRec.setCHECKSUMTYPE(CHECKSUMTYPEType.MD5);
				}
			}

			// record staged File in METS
			// checksum, size, location type, other loc type, URI
			FLocatType flocat = METSUtils.makeStagedFileLocator(mpn.getMets(),
					fileID, original.getWrapped().toURI(), result.manifestURI,
					LOCTYPEType.OTHER, result.manifestURIScheme);
			CompoundCommand addremove = new CompoundCommand(
					"Add new stage and remove old.");
			Command add = AddCommand.create(mpn.getEditingDomain(), fileRec,
					MetsPackage.eINSTANCE.getFileType_FLocat(), flocat);
			addremove.append(add);

			String deleteOldFile = null;
			if (toMigrate.containsKey(original)) {
				FLocatType oldlocat = toMigrate.get(original);
				deleteOldFile = oldlocat.getHref();
				Command remove = RemoveCommand.create(mpn.getEditingDomain(),
						oldlocat);
				addremove.append(remove);
			}
			if (addremove.canExecute()) {
				mpn.getCommandStack().execute(addremove);
				mpn.getEMFSession().save();
				if (deleteOldFile != null && !result.prestaged) {
					try {
						URI delManifest = new URI(deleteOldFile);
						URI delStorage = StagingPlugin.getDefault().getStages()
								.getStorageURI(delManifest);
						IFileStore deleteStore = EFS.getStore(delStorage);
						deleteStore.delete(EFS.NONE, new NullProgressMonitor());
					} catch (URISyntaxException|StagingException|CoreException e) {
						addProblemMarker("Cannot delete file from old staging area: "+deleteOldFile);
					}
				}
			} else {
				log.error("Cannot save results of staging, command not executable");
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot finish staging operation, command not executable");
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
	
	private void getEffectiveStagingArea(MetsProjectNature mpn) {
		URI stageURI = mpn.getStagingBase();
		
		Stages stages = StagingPlugin.getDefault().getStages();
		SharedStagingArea projectStage = (SharedStagingArea) stages
				.getStage(stageURI);
		if(projectStage != null) {
			this.destinationRepo = projectStage.getConfigURL();
		}
		
		if (projectStage != null && !projectStage.isConnected()) {
			StagingPlugin.getDefault().getStages()
					.connect(projectStage.getURI());
		}
		
		if (projectStage == null || !projectStage.isConnected()) {
			final boolean unrecognized = projectStage==null;
			final SharedStagingArea bagIt = StagingPlugin.getDefault().getStages().findMatchingArea(URI.create("data/"));
			final StagingJob myJob = this;
			final MetsProjectNature finalmpn = mpn; 
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					if (bagIt != null && MessageDialog
							.openConfirm(
									Display.getCurrent().getActiveShell(),
									"Project Staging Area "+(unrecognized?"Unrecognized":"Disconnected"),
									"Press OK to stage files in the project data folder or cancel to turn off staging until connected.")) {
						// stage to project data folder (BagIt)
						stage = bagIt;
					} else {
						// turn off project automatic staging
						finalmpn.setAutomaticStaging(false);
						// cancel staging operation
						myJob.cancel();
						addProblemMarker("Staging disabled. Could not connect to preferred staging area.");
					}
				}
			});
		} else {
			stage = projectStage;
		}
	}

	private void clearMarkers() {
		try {
			IMarker[] marks = this.project.findMarkers(markerID, true, IResource.DEPTH_ZERO);
			for(IMarker mark : marks) mark.delete();
		} catch(CoreException e) {
			log.error("Cannot clear markers", e);
		}
	}

	private void addProblemMarker(String message) {
		try {
			IMarker m = project.createMarker(StagingJob.markerID);
			m.setAttribute(IMarker.MESSAGE, message);
		} catch (CoreException e1) {
			log.error("there was a problem setting the problem marker:" + message);
		}
	}
}
