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

import gov.loc.mets.DivType;
import gov.loc.mets.FileType;
import gov.loc.mets.FptrType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.MetsType;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;
import irods.efs.plugin.Activator;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ProgressMonitor;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;

import unc.lib.cdr.workbench.IResourceConstants;
import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 * 
 */
public class CaptureJob extends Job {
	private IProject project = null;
	private List<IResource> items;
	private DivType topDestination = null;
	private DivType insertBefore = null;
	private MetsProjectNature mpn = null;
	private MetsType m = null;
	private DivType bag = null;
	private IProgressMonitor monitor = null;
	private CompoundCommand command = null;
	private Map<IResource, DivType> localParentDivs = new HashMap<IResource, DivType>();

	private static Comparator<IResource> resourceComparator = new Comparator<IResource>() {
		@Override
		public int compare(IResource arg0, IResource arg1) {
			return Collator.getInstance().compare(arg0.getName(), arg1.getName());
		}
	};

	/**
	 * @param jobName
	 * @param items
	 *           List of sibling resources items to capture
	 * @param destination
	 *           The div within which to insert the list of siblings, if null original parents are found in arrangement
	 *           or captured.
	 * @param insertBefore
	 *           If not null, captured resources will be inserted before this div
	 */
	public CaptureJob(String jobName, List<IResource> items, DivType destination, DivType insertBefore) {
		super(jobName);
		this.items = items;

		if (items.size() > 0) {
			this.project = items.iterator().next().getProject();
		}

		this.topDestination = destination;
		this.insertBefore = insertBefore;
	}

	/**
	 * @param jobName
	 * @param items
	 *           the items to capture or verify
	 */
	public CaptureJob(String jobName, List<IResource> items) {
		this(jobName, items, null, null);
	}

	public class CounterVisitor implements IResourceVisitor {
		public int count = 0;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceVisitor#visit(org.eclipse.core.resources.IResource)
		 */
		@Override
		public boolean visit(IResource resource) throws CoreException {
			count++;
			return true;
		}
	}

	/*
	 * if parent folders have been arranged, they will stay in their places, reset arrangement is separate! (non-Javadoc)
	 * 
	 * @seeorg.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime. IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		this.monitor = monitor;
		if (this.monitor == null) {
			monitor = new NullProgressMonitor();
		}
		try {
			this.items.remove(this.project);
			if (this.items.size() == 0) {
				return Status.OK_STATUS;
			}
			// recursively count the items
			CounterVisitor v = new CounterVisitor();
			for (IResource r : items) {
				r.accept(v);
			}
			String commandLabel = "Capturing " + v.count + " resources..";
			monitor.beginTask(commandLabel, v.count);
			command = new CompoundCommand(commandLabel);

			// get METS object
			mpn = (MetsProjectNature) project.getNature(MetsProjectNature.NATURE_ID);
			m = mpn.getMets();
			bag = METSUtils.findBagDiv(m);

			Map<IResource, DivType> map = captureSiblingList(items);
			
			if (topDestination == null) {
				// create and add relevant parents (EMF Command for top node)
				for(IResource r: items) {
					if(map.containsKey(r)) {
						makeOrLinkParent(r, map.get(r));
					}
				}
			} else {
				for(IResource r : items) {
					if(map.containsKey(r)) {
						// use EMF command to add item to topDestination
						emfAdd(topDestination, map.get(r));
					}
				}
			}

			mpn.getCommandStack().execute(command);
			project.getWorkspace().save(true, monitor);
			
			if (mpn.getAutomaticStaging(project)) {
				System.out.println("triggering build b/c auto staging says " + mpn.getAutomaticStaging(project));
				Job buildJob = new Job("") {

					@Override
					protected IStatus run(IProgressMonitor monitor) {
						Map<String, String> params = new HashMap<String, String>();
						try {
							project.build(IncrementalProjectBuilder.FULL_BUILD, MetsProjectNature.STAGING_BUILDER_ID, params,
									monitor);
						} catch (CoreException e) {
							return new Status(Status.ERROR, Activator.PLUGIN_ID, "There was a problem running the staging process.", e);
						}
						return Status.OK_STATUS;
					}					
				};
				buildJob.setPriority(Job.BUILD);
				buildJob.schedule(1000);
			} else {
				System.out.println("skipping build b/c auto staging says " + mpn.getAutomaticStaging(project));
			}
			
			monitor.done();
			return Status.OK_STATUS;
		} catch (CoreException e) {
			e.printStackTrace();
			return e.getStatus();
		}
	}

	/**
	 * Recursives captures a list of resources, returning a map of the top resource nodes to their DivTypes. Resources
	 * already captured are left in place, but their children are captured under them.
	 * 
	 * @param list
	 *           the resources to capture
	 * @param dest
	 *           the parent to add these DivTypes to
	 * @return a map of captured resources (at this level) to DivTypes
	 * @throws CoreException
	 */
	private Map<IResource, DivType> captureSiblingList(List<IResource> list) throws CoreException {
		if (list.size() == 0)
			return Collections.EMPTY_MAP;
		Map<IResource, DivType> result = new HashMap<IResource, DivType>();
		
		Collections.sort(list, resourceComparator);
		for (IResource r : list) {
			// first find or create this Div
			DivType d = findDiv(r);
			boolean newDiv = false;
			if (d == null) {
				newDiv = true;
				d = makeDiv(r);
				result.put(r, d);
				// dest.getDiv().add(d);
			} else {
				System.out.println("previously captured: " + d);
			}
			if (r instanceof IContainer) {
				// get children, and capture them
				List<IResource> children = new ArrayList<IResource>();
				IContainer c = (IContainer) r;
				Collections.addAll(children, c.members());
				Map<IResource, DivType> map = captureSiblingList(children);
				for (IResource childRes : children) {
					if (map.containsKey(childRes)) { // if we created a new Div
						if (!newDiv) {
							emfAdd(d, map.get(childRes));
						} else {
							d.getDiv().add(map.get(childRes));
						}
					}
				}
			}
		}
		return result;
	}

	private void emfAdd(DivType d, DivType child) {
		Command add = AddCommand.create(mpn.getEditingDomain(), d, MetsPackage.eINSTANCE.getDivType_Div(), child);
		command.append(add);
	}

	private DivType findDiv(IResource r) throws CoreException {
		DivType result = null;
		String divID = IResourceConstants.getDivID(r);
		if (divID != null) {
			result = (DivType) m.eResource().getEObject(divID);
		}
		return result;
	}

	private FileType findFile(IResource r) throws CoreException {
		FileType result = null;
		String fileID = IResourceConstants.getFileID(r);
		if (fileID != null) {
			result = (FileType) m.eResource().getEObject(fileID);
		}
		return result;
	}

	/**
	 * Finds and links to existing parent of resource or builds a parent and recurses. 
	 * 
	 * @param iResource
	 * @return
	 * @throws CoreException
	 */
	private void makeOrLinkParent(IResource resource, DivType div) throws CoreException {
		DivType parent = null;
		if (mpn.getOriginalsFolder().equals(resource.getParent()) || resource.getParent() == null) {
			parent = this.bag;
		} else {
			parent = findDiv(resource.getParent());
		}
		if (parent != null) {
			// attach resource div to found parent
			emfAdd(parent, div);
		} else { // parent is not in METS doc
			if(localParentDivs.containsKey(resource.getParent())) {
				// parents were already made
				localParentDivs.get(resource.getParent()).getDiv().add(div);
			} else {
				// make a parent, attach the child and keep going
				parent = makeDiv(resource.getParent());
				localParentDivs.put(resource.getParent(), parent);
				parent.getDiv().add(div);
				makeOrLinkParent(resource.getParent(), parent);
			}
		}
	}

	/**
	 * @param folderDiv
	 * @param c
	 */
	private DivType makeDiv(IResource c) throws CoreException {
		DivType result = MetsFactory.eINSTANCE.createDivType();
		List<String> contentIds = new ArrayList<String>();
		contentIds.add(c.getLocationURI().toASCIIString());
		result.setCONTENTIDS(contentIds);
		result.setID(METSUtils.makeXMLUUID());
		result.setLABEL1(c.getName());
		if (c instanceof IContainer) {
			result.setTYPE(METSConstants.Div_Folder);
		} else if (c instanceof IFile) {
			result.setTYPE(METSConstants.Div_File);

			// calc size and checksum.
			IFileStore sourceFileStore = EFS.getStore(c.getLocationURI());
			IFileInfo sourceFileInfo = sourceFileStore.fetchInfo();
			long size = sourceFileInfo.getLength();

			// find File section (for previously captured) or make one
			FileType ft = findFile(c);
			if (ft == null) {
				ft = METSUtils.addFile(m, c.getLocationURI(), size, null);
				IResourceConstants.setFileID(c, ft.getID());
			}

			FptrType fptr = MetsFactory.eINSTANCE.createFptrType();
			fptr.setFILEID(ft.getID());
			result.getFptr().add(fptr);
		}
		IResourceConstants.setDivID(c, result.getID());
		return result;
	}

}
