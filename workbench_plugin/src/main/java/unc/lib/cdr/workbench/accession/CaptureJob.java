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

import gov.loc.mets.DivType;
import gov.loc.mets.FileGrpType;
import gov.loc.mets.FptrType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.MetsType;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.IResourceConstants;
import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.staging.StagingUtils;

/**
 * @author Gregory Jansen
 *
 */
public class CaptureJob extends Job {
	private static final Logger log = LoggerFactory.getLogger(CaptureJob.class);
	private IProject project = null;
	private List<IResource> items;
	private boolean auditPreviouslyStaged = false;
	private DivType parent = null;
	private DivType insertBefore = null;
	private MetsProjectNature mpn = null;
	private MetsType m = null;
	private DivType bag = null;

	/**
	 * @param jobName
	 * @param items
	 *           the items to capture or verify
	 * @param bag
	 *           the parent within which to insert the new items
	 * @param insertBefore
	 *           the sibling it should precede or null to append
	 * @param auditPreviouslyStaged
	 *           if true, update any items previously staged
	 */
	public CaptureJob(String jobName, List<IResource> items, DivType parent, DivType insertBefore,
			boolean auditPreviouslyStaged) {
		super(jobName);
		this.items = items;
		this.auditPreviouslyStaged = auditPreviouslyStaged;

		if (items.size() > 0) {
			this.project = items.iterator().next().getProject();
		}

		this.parent = parent;
		this.insertBefore = insertBefore;
	}

	/**
	 * @param jobName
	 * @param items
	 *           the items to capture or verify
	 */
	public CaptureJob(String jobName, List<IResource> items, boolean auditPreviouslyStaged) {
		this(jobName, items, null, null, auditPreviouslyStaged);
	}

	/*
	 * if parent folders have been arranged, they will stay in their places, reset arrangement is separate! (non-Javadoc)
	 *
	 * @seeorg.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime. IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		this.items.remove(this.project);
		if (this.items.size() == 0) {
			return Status.OK_STATUS;
		}
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		monitor.beginTask("Capturing " + this.items.size() + " resources...", 2 * this.items.size());

		// get METS object
		try {
			mpn = (MetsProjectNature) project.getNature(MetsProjectNature.NATURE_ID);
			m = mpn.getMets();
			bag = METSUtils.findBagDiv(m);

			// for each resource..
			for (IResource r : items) {
				monitor.subTask(r.getName());

				// place this item within the Div tree
				DivType myParent = null;
				if (this.parent != null) {
					myParent = this.parent;
				} else { // recreate any uncaptured parent branches of the
					// original tree structure
					myParent = captureMissingParentFolders(m, r);
				}

				// capture the resource itself
				DivType div = null;
				String divID = IResourceConstants.getCapturedDivID(r);
				if (divID != null) {
					div = METSUtils.findDiv(m, divID);
				}
				if (div == null) {
					div = MetsFactory.eINSTANCE.createDivType();
					if (myParent == null) { // we are capturing the top folder
						myParent = bag;
					}
					if (this.insertBefore != null) {
						boolean added = false;
						EList<DivType> divs = myParent.getDiv();
						for (int i = 0; i < divs.size(); i++) {
							if (this.insertBefore.equals(divs.get(i))) {
								divs.add(i, div);
								added = true;
								break;
							}
						}
						if (!added) {
							throw new Error("Could not find the insertBefore Div specified.");
						}
					} else {
						myParent.getDiv().add(div);
					}
					// GNJ: moved these into null Div block, so only creates new elements for new captures
					if (r instanceof IFolder) {
						fillFolderDiv(div, (IFolder) r);
					} else if (r instanceof IFile) {
						IFile f = (IFile) r;
						fillFileDiv(div, f);
					}
				} else {
					log.debug("skipping previously captured original: " + r.getName());
				}
				monitor.worked(1);
			}
			project.getWorkspace().save(true, monitor);
			Map<String, Object> params = new HashMap<String, Object>();
			if (auditPreviouslyStaged) {
				params.put("audit", Boolean.TRUE);
			}
			log.debug("calling incremental build");
			project.build(IncrementalProjectBuilder.FULL_BUILD, MetsProjectNature.STAGING_BUILDER_ID, params,
					new NullProgressMonitor());
			monitor.done();
			return Status.OK_STATUS;
		} catch (CoreException e) {
			return e.getStatus();
		}
	}

	private DivType captureMissingParentFolders(MetsType m, IResource resource) throws CoreException {
		// look for closest captured parent to nest under (bottom up)
		// build list of Folders to make Divs for
		DivType capturedAncestorDiv = null;
		Stack<IContainer> folderStack = new Stack<IContainer>();
		for (IContainer p = resource.getParent(); p != null; p = p.getParent()) {
			// get the Captured Marker and extract ID from it.
			DivType d = null;
			String divID = IResourceConstants.getCapturedDivID(p);
			if (divID != null) {
				d = METSUtils.findDiv(m, divID);
			}
			if (d != null) {
				capturedAncestorDiv = d;
				break;
			} else {
				if (!(p instanceof IFolder)) {
					break;
				} else if (this.project.getFolder("originals").equals(p)) {
					break;
				}
				folderStack.add(p);
			}
		}

		// make Divs for folders in the stack
		DivType lastParent = capturedAncestorDiv;
		IContainer c = null;
		while (!folderStack.empty()) {
			c = folderStack.pop();
			DivType folderDiv = MetsFactory.eINSTANCE.createDivType();
			if (lastParent == null) {
				bag.getDiv().add(folderDiv);
			} else {
				lastParent.getDiv().add(folderDiv);
			}
			fillFolderDiv(folderDiv, c);
			lastParent = folderDiv;
		}
		return lastParent;
	}

	/**
	 * @param folderDiv
	 * @param c
	 */
	private void fillFolderDiv(DivType folderDiv, IContainer c) throws CoreException {
		List<String> contentIds = new ArrayList<String>();
		contentIds.add(c.getLocationURI().toASCIIString());
		folderDiv.setCONTENTIDS(contentIds);
		String ID = METSUtils.makeXMLUUID();
		folderDiv.setID(ID);
		folderDiv.setLABEL1(c.getName());
		folderDiv.setTYPE(METSConstants.Div_Folder);
		IResourceConstants.setCapturedState(c, ID);
	}

	/**
	 * @param folderDiv
	 * @param c
	 */
	private void fillFileDiv(DivType div, IFile c) throws CoreException {
		List<String> contentIds = new ArrayList<String>();
		contentIds.add(c.getLocationURI().toASCIIString());
		div.setCONTENTIDS(contentIds);
		String ID = METSUtils.makeXMLUUID();
		div.setID(ID);
		div.setLABEL1(c.getName());
		div.setTYPE(METSConstants.Div_File);

		FileGrpType objectFileGrp = METSUtils.addObjectFileGroup(m, ID);
		FptrType fptr = MetsFactory.eINSTANCE.createFptrType();
		fptr.setFILEID(objectFileGrp.getID());
		div.getFptr().add(fptr);

		// calc size and checksum.
		IFileStore sourceFileStore = EFS.getStore(c.getLocationURI());
		IFileInfo sourceFileInfo = sourceFileStore.fetchInfo();
		long size = sourceFileInfo.getLength();
		// String md5 = StagingUtils.fetchMD5Digest(sourceFileStore, new NullProgressMonitor());
		METSUtils.addDataFile(m, ID, c.getLocationURI(), size, null);
		// update resource to reflect capture
		IResourceConstants.setCapturedState(c, ID);
	}

}
