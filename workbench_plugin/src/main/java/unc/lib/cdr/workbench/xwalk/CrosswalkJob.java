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
package unc.lib.cdr.workbench.xwalk;

import edu.unc.lib.schemas.acl.AclPackage;
import gov.loc.mets.AmdSecType;
import gov.loc.mets.DivType;
import gov.loc.mets.MDTYPEType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MdWrapType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.MetsType;
import gov.loc.mets.XmlDataType1;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;
import gov.loc.mods.mods.MODSPackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.rcp.Activator;
import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.Editable;
import crosswalk.EditingContainer;
import crosswalk.MetsSource;
import crosswalk.OutputElement;
import crosswalk.OutputMetadataSections;
import crosswalk.OutputProfile;
import crosswalk.RecordMatcherStrategy;
import crosswalk.RecordMatches;
import crosswalk.RecordOutOfRangeException;
import crosswalk.WalkWidget;

public class CrosswalkJob extends Job {
	public static final String crosswalkJobFamilyObject = "crosswalkJobFamily";

	@Override
	public boolean belongsTo(Object family) {
		if (family == crosswalkJobFamilyObject)
			return true;
		return super.belongsTo(family);
	}

	private static final Logger LOG = LoggerFactory
			.getLogger(CrosswalkJob.class);

	private IFile file = null;
	private MetsProjectNature nature = null;
	private MetsType mets = null;
	private CrossWalk cw = null;
	private String groupId;

	// private Map<String, MdSecType> oldMdSecs;

	/**
	 * For each profile, a list of the objects to be added to the METS root.
	 */
	private HashMap<OutputProfile, Map<String, MdSecType>> profile2MetsAdditions;

	public CrosswalkJob(IFile crosswalkFile) {
		super("Running " + crosswalkFile.getName());
		this.file = crosswalkFile;
		this.nature = MetsProjectNature.get(this.file.getProject());
		this.mets = nature.getMets();
		this.groupId = file.getName();
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		LOG.debug("running crosswalk: " + file.getName());
		clearProblemMarkers(file);
		try {
			setupCrosswalk();
		} catch (CoreException e) {
			return e.getStatus();
		}

		// setup profile to record map
		this.profile2MetsAdditions = new HashMap<OutputProfile, Map<String, MdSecType>>();
		for (OutputProfile profile : cw.getOutputProfiles())
			profile2MetsAdditions
					.put(profile, new HashMap<String, MdSecType>());

		try {
			generateNewMetadataRecords(monitor);
		} catch (CoreException e) {
			return e.getStatus();
		}

		nature.getCommandStack().execute(getLinkCleanupCommand());

		// remove the old mdSecs for this crosswalk
		nature.getCommandStack().execute(
				RemoveCommand.create(nature.getEditingDomain(),
						getCurrentCrosswalkMdSecs()));

		// add the new records to mets
		nature.getCommandStack().execute(getRecordAddCommand());

		try {
			nature.save();
		} catch (CoreException e1) {
			return e1.getStatus();
		}

		nature.getCommandStack().execute(getMatcherLinkComand());

		try {
			nature.save();
		} catch (CoreException e1) {
			return e1.getStatus();
		}

		return Status.OK_STATUS;
	}

	private Command getMatcherLinkComand() {
		// find the matcher strategies
		CompoundCommand autoLinkCommand = new CompoundCommand();
		for (WalkWidget w : cw.getWidgets()) {
			if (w instanceof RecordMatcherStrategy) {
				RecordMatcherStrategy s = (RecordMatcherStrategy) w;
				try {
					s.run();
					RecordMatches matches = s.getMatches();
					LOG.debug("Got matches: " + matches.getMatches().size()
							+ " matched, "
							+ matches.getRecordCollisions().size()
							+ " record collisions, "
							+ matches.getResourceCollisions().size()
							+ " resource collisions.");
					// TODO set warnings for collisions
					// set links and status for matches
					for (Map.Entry<DivType, String> match : matches
							.getMatches().entrySet()) {
						String divID = match.getKey().getID();						
						// for each profile, add links to matched records
						for(OutputProfile profile : this.cw.getOutputProfiles()) {
							String mdID = makeMdSecID(file, profile, match.getValue());
							MdSecType md = this.profile2MetsAdditions.get(profile).get(mdID);
							if(md == null) continue;
							md.setSTATUS(METSConstants.MD_STATUS_CROSSWALK_LINKED);
							// old links should have been removed earlier
							// add the CW link
							autoLinkCommand.append(AddCommand.create(
									nature.getEditingDomain(), match.getKey(),
									profile.getMetadataSection().getDivReference(),
									md));
						}
					}
				} catch (Exception e) {
					setProblemMarker(e.getLocalizedMessage(), file);
					LOG.error("failure in record matcher", e);
				}
			}
		}
		return autoLinkCommand;
	}

	private Command getRecordAddCommand() {
		CompoundCommand result = new CompoundCommand();
		for (OutputProfile profile : cw.getOutputProfiles()) {
			if (profile.getMetadataSection().equals(
					OutputMetadataSections.DMD_SEC)) {
				result.append(AddCommand.create(nature.getEditingDomain(),
						mets, MetsPackage.eINSTANCE.getMetsType_DmdSec(),
						this.profile2MetsAdditions.get(profile).values()));
			} else {
				for (MdSecType md : this.profile2MetsAdditions.get(profile)
						.values()) {
					AmdSecType amd = MetsFactory.eINSTANCE.createAmdSecType();
					switch (profile.getMetadataSection()) {
					case DIGIPROV_MD:
						amd.getDigiprovMD().add(md);
						break;
					case RIGHTS_MD:
						amd.getRightsMD().add(md);
						break;
					case SOURCE_MD:
						amd.getSourceMD().add(md);
						break;
					case TECH_MD:
						amd.getTechMD().add(md);
						break;
					}
					result.append(AddCommand.create(nature.getEditingDomain(),
							mets, MetsPackage.eINSTANCE.getMetsType_AmdSec(),
							amd));
				}
			}
		}
		return result;
	}

	private CompoundCommand getLinkCleanupCommand() {
		// cleanup links
		CompoundCommand command = new CompoundCommand();
		// build set of new mdSec elements
		Map<String, MdSecType> newMdSecIDs = new HashMap<String, MdSecType>();
		for (OutputProfile profile : cw.getOutputProfiles())
			newMdSecIDs.putAll(profile2MetsAdditions.get(profile));
		DivType bag = METSUtils.findBagDiv(mets);
		Iterator<EObject> bagChildren = bag.eAllContents();
		while (bagChildren.hasNext()) {
			EObject o = bagChildren.next();
			if (o instanceof DivType) {
				DivType div = (DivType) o;

				for (MdSecType md : div.getDmdSec()) {
					if (groupId.equals(md.getGROUPID())) {
						updateCrosswalkLink(div, md, newMdSecIDs, command,
								MetsPackage.eINSTANCE.getDivType_DmdSec());
					}
				}
				for (MdSecType md : div.getMdSec()) {
					if (groupId.equals(md.getGROUPID())) {
						updateCrosswalkLink(div, md, newMdSecIDs, command,
								MetsPackage.eINSTANCE.getDivType_MdSec());
					}
				}
			}
		}
		return command;
	}

	/**
	 * Determines link update behavior prior to matcher run. Only pass links to
	 * mdSecs created by this crosswalk.
	 * 
	 * @param md
	 * @param newMdSecIDs
	 * @param updateLinksCommand
	 * @param linkReference
	 */
	private void updateCrosswalkLink(DivType div, MdSecType md,
			Map<String, MdSecType> newMdSecIDs,
			CompoundCommand updateLinksCommand, EReference linkReference) {
		if (METSConstants.MD_STATUS_CROSSWALK_LINKED.equals(md.getSTATUS())) {
			// remove links established by the CW
			updateLinksCommand.append(RemoveCommand.create(
					nature.getEditingDomain(), div, linkReference, md));
		} else if (!newMdSecIDs.containsKey(md.getID())) {
			// remove links to mdSecs that no longer exist
			updateLinksCommand.append(RemoveCommand.create(
					nature.getEditingDomain(), div, linkReference, md));
		} else {
			// migrate links you want to keep to new mds
			MdSecType newMd = newMdSecIDs.get(md.getID());
			// preserve user linked status
			if (md.getSTATUS().equals(
					METSConstants.MD_STATUS_CROSSWALK_USER_LINKED)) {
				newMd.setSTATUS(METSConstants.MD_STATUS_CROSSWALK_USER_LINKED);
			}
			updateLinksCommand.append(RemoveCommand.create(
					nature.getEditingDomain(), div, linkReference, md));
			updateLinksCommand.append(AddCommand.create(
					nature.getEditingDomain(), div, linkReference, newMd));
		}
	}

	private void generateNewMetadataRecords(IProgressMonitor monitor)
			throws CoreException {
		// create new records, update status if old mdSec was user linked
		try {
			while (true) {
				for (OutputProfile profile : cw.getOutputProfiles()) {
					if (monitor.isCanceled())
						throw new CoreException(Status.CANCEL_STATUS);
					MdSecType md = processRecord(profile);
					if (md != null) {
						profile2MetsAdditions.get(profile).put(md.getID(), md);
					}
				}
				cw.getDataSource().NextRecord();
			}
		} catch (RecordOutOfRangeException ignored) {
		} catch (DataException e) {
			setProblemMarker(e.getMessage(), file);
		}
	}

	private void setupCrosswalk() throws CoreException {
		ResourceSet resourceSet = new ResourceSetImpl();
		AclPackage.eINSTANCE.eClass();
		MODSPackage.eINSTANCE.eClass();
		resourceSet.getPackageRegistry().put(CrosswalkPackage.eNS_URI,
				CrosswalkPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(MODSPackage.eNS_URI,
				MODSPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(AclPackage.eNS_URI,
				AclPackage.eINSTANCE);
		@SuppressWarnings("rawtypes")
		Map xmlOptions = new HashMap();
		java.net.URI uri = file.getLocationURI();
		Resource crosswalkResource = null;
		crosswalkResource = resourceSet.getResource(
				URI.createURI(uri.toASCIIString()), true);
		try {
			crosswalkResource.load(xmlOptions);
		} catch (IOException e) {
			setProblemMarker(e.getLocalizedMessage(), file);
		}
		this.cw = null;
		for (EObject o : crosswalkResource.getContents()) {
			if (o instanceof EditingContainer) {
				Editable editable = ((EditingContainer) o).getModel();
				if (editable instanceof CrossWalk) {
					cw = (CrossWalk) editable;
				}
			}
		}
		if (cw == null) {
			setProblemMarker("No CrossWalk element in this file.", file);
			throw new CoreException(new Status(IStatus.ERROR,
					Activator.PLUGIN_ID,
					"There was no crosswalk element in the file."));
		}
		if (cw.getDataSource() == null) {
			setProblemMarker("No data source defined in this CrossWalk", file);
			throw new CoreException(new Status(IStatus.ERROR,
					Activator.PLUGIN_ID,
					"There was no data source defined in the crosswalk file."));
		}
		try {
			cw.getDataSource().Reset();
		} catch (DataException e) {
			LOG.debug("cannot reset data source", e);
			setProblemMarker(e.getLocalizedMessage(), file);
			throw new CoreException(new Status(IStatus.ERROR,
					Activator.PLUGIN_ID,
					"Cannot reset the data source in the crosswalk file."));
		}
		cw.setMetsSource(new MetsSource() {
			@Override
			public MetsType getMets() {
				return mets;
			}
		});
		cw.setCurrentUser(System.getProperty("user.name"));
	}

	/**
	 * @param cw
	 * @param mets
	 */
	private MdSecType processRecord(OutputProfile profile) {
		EClass outputElementClass = null;
		if(profile.isStartMappingAtChildren()) {
			outputElementClass = profile.getParentMappedFeature().getEReferenceType();	
		} else {
			outputElementClass = profile.getParentMappedFeature().getEContainingClass();
		}
		EObject outputElement = outputElementClass.getEPackage().getEFactoryInstance().create(outputElementClass);
		
		for (OutputElement e : cw.getElements()) {
			e.updateRecord(outputElement);
		}
		if (outputElement.eContents() == null
				|| outputElement.eContents().isEmpty()) {
			return null;
		}

		// detect if ID already present.
		MdSecType md = MetsFactory.eINSTANCE.createMdSecType();
		md.setGROUPID(this.groupId);
		md.setSTATUS(METSConstants.MD_STATUS_CROSSWALK_NOT_LINKED);
		md.setCREATED(new XMLCalendar(new java.util.Date(System
				.currentTimeMillis()), XMLCalendar.DATETIME));
		String recordID = cw.getDataSource().getRecordID();
		md.setID(makeMdSecID(file, profile, recordID));

		MdWrapType wrap = MetsFactory.eINSTANCE.createMdWrapType();
		MDTYPEType t = MDTYPEType.get(profile.getMetadataType());
		if (t == null)
			t = MDTYPEType.OTHER;
		wrap.setMDTYPE(t);
		if (MDTYPEType.OTHER.equals(t))
			wrap.setOTHERMDTYPE(profile.getMetadataType());
		wrap.setLABEL(profile.getMetadataLabel() +" "+ recordID);
		XmlDataType1 xml = MetsFactory.eINSTANCE.createXmlDataType1();

		// root was mapped, grab nested feature
		if(!profile.isStartMappingAtChildren()) {
			outputElement = outputElement.eContents().get(0);
		}
		
		xml.getAny().add(profile.getParentMappedFeature(), outputElement);
		wrap.setXmlData(xml);
		md.setMdWrap(wrap);
		return md;
	}

	private Set<EObject> getCurrentCrosswalkMdSecs() {
		// build a list of the old mdSecs for this crosswalk
		Set<EObject> result = new HashSet<EObject>();
		if (mets.getDmdSec() != null) {
			for (MdSecType md : mets.getDmdSec()) {
				if (groupId.equals(md.getGROUPID())) {
					result.add(md);
				}
			}
		}
		if (mets.getAmdSec() != null) {
			for (AmdSecType amd : mets.getAmdSec()) {
				if (amd.getDigiprovMD() != null) {
					for (MdSecType md : amd.getDigiprovMD()) {
						if (groupId.equals(md.getGROUPID())) {
							result.add(amd);
						}
					}
				}
				if (amd.getRightsMD() != null) {
					for (MdSecType md : amd.getRightsMD()) {
						if (groupId.equals(md.getGROUPID())) {
							result.add(amd);
						}
					}
				}
				if (amd.getSourceMD() != null) {
					for (MdSecType md : amd.getSourceMD()) {
						if (groupId.equals(md.getGROUPID())) {
							result.add(amd);
						}
					}
				}
				if (amd.getTechMD() != null) {
					for (MdSecType md : amd.getTechMD()) {
						if (groupId.equals(md.getGROUPID())) {
							result.add(amd);
						}
					}
				}
			}
		}
		return result;
	}

	/**
	 * @param file
	 *            the Crosswalk Definition File
	 * @param recordID
	 * @return
	 */
	private String makeMdSecID(IFile crosswalkFile, OutputProfile profile,
			String recordID) {
		return "cw_" + crosswalkFile.hashCode() + "_" + profile.hashCode()
				+ "_" + recordID;
	}

	/**
	 * @param f
	 */
	private void clearProblemMarkers(IFile f) {
		int depth = IResource.DEPTH_INFINITE;
		try {
			f.deleteMarkers(IMarker.PROBLEM, true, depth);
		} catch (CoreException e) {
			LOG.debug("problem clearing markers", e);
		}
	}

	/**
	 * @param e
	 * @param f
	 */
	private void setProblemMarker(String msg, IFile f) {
		try {
			IMarker m = f.createMarker(IMarker.PROBLEM);
			m.setAttribute(IMarker.MESSAGE, msg);
		} catch (CoreException e1) {
			LOG.error("there was a problem setting the problem marker:" + msg);
		}
	}

}
