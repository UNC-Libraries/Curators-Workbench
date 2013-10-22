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

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.stage.StagingJob;

/**
 * @author Gregory Jansen
 * 
 */
public class CaptureJob extends Job {
	
	private static final Logger log = LoggerFactory.getLogger(CaptureJob.class);
	
	private IProject project = null;
	private List<OriginalFileStore> items;
	private Set<String> includedFileExtensions = null;
	public Set<String> getIncludedFileExtensions() {
		return includedFileExtensions;
	}

	public void setIncludedFileExtensions(Set<String> includedFileExtensions) {
		this.includedFileExtensions = includedFileExtensions;
	}

	private DivType topDestination = null;
	private DivType insertBefore = null;
	private MetsProjectNature mpn = null;
	private MetsType m = null;
	private DivType bag = null;
	private IProgressMonitor monitor = null;
	private CompoundCommand command = null;
	private Map<OriginalFileStore, DivType> localParentDivs = new HashMap<OriginalFileStore, DivType>();

	private static Comparator<OriginalFileStore> comparator = new Comparator<OriginalFileStore>() {
		@Override
		public int compare(OriginalFileStore arg0, OriginalFileStore arg1) {
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
	public CaptureJob(String jobName, List<OriginalFileStore> items, DivType destination, DivType insertBefore) {
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
	public CaptureJob(String jobName, List<OriginalFileStore> items) {
		this(jobName, items, null, null);
	}

	public class CounterVisitor {
		IProgressMonitor monitor = new NullProgressMonitor();
		public int count = 0;

		public void visit(IFileStore resource) throws CoreException {
			count++;
			if (resource.fetchInfo().isDirectory()) {
				for (IFileStore f : resource.childStores(EFS.NONE, monitor)) {
					visit(f);
				}
			}
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
			for (OriginalFileStore r : items) {
				v.visit(r);
			}
			String commandLabel = "Capturing " + v.count + " resources..";
			monitor.beginTask(commandLabel, v.count);
			command = new CompoundCommand(commandLabel);

			// get METS object
			mpn = MetsProjectNature.get(project);
			m = mpn.getMets();
			bag = METSUtils.findBagDiv(m);

			Map<OriginalFileStore, DivType> map = captureSiblingList(items);

			if (topDestination == null) {
				// create and add relevant parents (EMF Command for top node)
				for (OriginalFileStore r : items) {
					if (map.containsKey(r)) {
						makeOrLinkParent(r, map.get(r));
					}
				}
			} else {
				for (OriginalFileStore r : items) {
					if (map.containsKey(r)) {
						// use EMF command to add item to topDestination
						emfAdd(topDestination, map.get(r));
					}
				}
			}

			mpn.getCommandStack().execute(command);
			mpn.save();
			project.getWorkspace().save(true, monitor);

			boolean autostage = mpn.getAutomaticStaging();
			if (autostage) {
				log.debug("triggering build b/c auto staging says " + autostage);
				Job stagingJob = new StagingJob("Staging after capture", project);
				stagingJob.setRule(StagingJob.mySchedulingRule);
				stagingJob.schedule();
			} else {
				log.debug("skipping build b/c auto staging says " + autostage);
			}
			monitor.done();
			return Status.OK_STATUS;
		} catch (CoreException e) {
			e.printStackTrace();
			return e.getStatus();
		}
	}

	/**
	 * Recursives captures a list of originals, returning a map of the top nodes to their DivTypes. Originals
	 * already captured are left in place, but their children are captured under them.
	 * 
	 * @param list
	 *           the original stores to capture
	 * @param dest
	 *           the parent to add these DivTypes to
	 * @return a map of captured original stores (at this level) to DivTypes
	 * @throws CoreException
	 */
	private Map<OriginalFileStore, DivType> captureSiblingList(List<OriginalFileStore> list) throws CoreException {
		if (list.size() == 0)
			return Collections.EMPTY_MAP;
		Map<OriginalFileStore, DivType> result = new HashMap<OriginalFileStore, DivType>();

		Collections.sort(list, comparator);
		for (OriginalFileStore r : list) {
			// first find or create this Div
			DivType d = r.getMetsDivType();
			boolean newDiv = false;
			if (d == null) {
				String ext = "";
				String[] parts = r.getName().split(Pattern.quote("."));
				if(parts.length > 1) {
					ext = parts[parts.length-1];
				}
				if(r.fetchInfo().isDirectory() || this.includedFileExtensions == null || this.includedFileExtensions.contains(ext)) {
					newDiv = true;
					d = makeDiv(r);
					result.put(r, d);
				}
			}
			IProgressMonitor mon = new NullProgressMonitor();
			if (r.fetchInfo().isDirectory()) {
				// get children, and capture them
				List<OriginalFileStore> children = Arrays.asList((OriginalFileStore[])r.childStores(EFS.NONE, mon));
				Map<OriginalFileStore, DivType> map = captureSiblingList(children);
				for (OriginalFileStore childRes : children) {
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

	/**
	 * Finds and links to existing parent of resource or builds a parent and recurses.
	 * 
	 * @param original
	 * @return
	 * @throws CoreException
	 */
	private void makeOrLinkParent(OriginalFileStore original, DivType div) throws CoreException {
		DivType parent = null;
		if (original.getOriginalStub().getStores().contains(original)) {
			parent = this.bag;
		} else {
			parent = ((OriginalFileStore)original.getParent()).getMetsDivType();
		}
		if (parent != null) {
			// attach resource div to found parent
			emfAdd(parent, div);
		} else { // parent is not in METS doc
			if (localParentDivs.containsKey((OriginalFileStore)original.getParent())) {
				// parents were already made
				localParentDivs.get((OriginalFileStore)original.getParent()).getDiv().add(div);
			} else {
				// make a parent, attach the child and keep going
				parent = makeDiv((OriginalFileStore)original.getParent());
				localParentDivs.put((OriginalFileStore)original.getParent(), parent);
				parent.getDiv().add(div);
				makeOrLinkParent((OriginalFileStore)original.getParent(), parent);
			}
		}
	}

	/**
	 * @param original
	 */
	private DivType makeDiv(OriginalFileStore original) throws CoreException {
		DivType result = MetsFactory.eINSTANCE.createDivType();
		UUID uuid = UUID.randomUUID();
		List<String> contentIds = new ArrayList<String>();
		contentIds.add(original.getWrapped().toURI().toASCIIString());
		contentIds.add("info:fedora/uuid:" + uuid.toString());
		result.setCONTENTIDS(contentIds);
		result.setID(original.getDivID());
		String name = original.getWrapped().getName();
		if(name == null || name.trim().isEmpty()) {
			name = "(disc root)";
		}
		result.setLABEL1(name);
		if (original.fetchInfo().isDirectory()) {
			result.setTYPE(METSConstants.Div_Folder);
		} else {
			result.setTYPE(METSConstants.Div_File);
			// calc size and checksum.
			IFileInfo sourceFileInfo = original.fetchInfo();
			long size = sourceFileInfo.getLength();
			//long lastModifiedTimestamp = sourceFileInfo.getLastModified();
			Long createTimestamp = null;
			Path path = Paths.get(original.getWrapped().toURI());
			try {
				BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
				FileTime create = attr.creationTime();
				if(create != null) createTimestamp = new Long(create.toMillis());
			} catch(IOException ignored) {}
			// find File section (for previously captured) or make one
			FileType ft = original.getMetsFileType();
			if (ft == null) {
				ft = METSUtils.addFile(m, original.getWrapped().toURI(), original.getFileID(), size, createTimestamp, null);
			}

			FptrType fptr = MetsFactory.eINSTANCE.createFptrType();
			fptr.setFILEID(ft.getID());
			result.getFptr().add(fptr);
		}
		return result;
	}

}
