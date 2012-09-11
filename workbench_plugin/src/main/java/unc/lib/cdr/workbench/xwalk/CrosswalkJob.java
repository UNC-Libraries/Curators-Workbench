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
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.ModsDefinition;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
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
import crosswalk.RecordMatcherStrategy;
import crosswalk.RecordMatches;
import crosswalk.RecordOutOfRangeException;
import crosswalk.WalkWidget;

public class CrosswalkJob extends Job {
	private static final Logger LOG = LoggerFactory.getLogger(CrosswalkJob.class);

	IFile file = null;
	MetsProjectNature nature = null;
	
	public CrosswalkJob(IFile crosswalkFile) {
		super("Running "+crosswalkFile.getName());
		this.file = crosswalkFile;
		this.nature = MetsProjectNature.get(this.file.getProject());
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		LOG.debug("running crosswalk: " + file.getName());
		clearProblemMarkers(file);
		final MetsType m = nature.getMets();
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(CrosswalkPackage.eNS_URI, CrosswalkPackage.eINSTANCE);
		@SuppressWarnings("rawtypes")
		Map xmlOptions = new HashMap();
		java.net.URI uri = file.getLocationURI();
		Resource crosswalkResource = null;
		crosswalkResource = resourceSet.getResource(URI.createURI(uri.toASCIIString()), true);
		try {
			crosswalkResource.load(xmlOptions);
		} catch (IOException e) {
			setProblemMarker(e.getLocalizedMessage(), file);
		}
		CrossWalk cw = null;
		for (EObject o : crosswalkResource.getContents()) {
			if(o instanceof EditingContainer) {
				Editable editable = ((EditingContainer)o).getModel();
				if (editable instanceof CrossWalk) {
					cw = (CrossWalk)editable;
				}
			}
		}
		if (cw == null) {
			setProblemMarker("No CrossWalk element in this file.", file);
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "There was no crosswalk element in the file.");
		}
		if (cw.getDataSource() == null) {
			setProblemMarker("No data source defined in this CrossWalk", file);
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "There was no data source defined in the crosswalk file.");
		}

		String dataFileName = cw.getDataSource().getName();
		try {
			cw.getDataSource().Reset();
		} catch (DataException e) {
			LOG.debug("cannot reset data source", e);
			setProblemMarker(e.getLocalizedMessage(), file);
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot reset the data source in the crosswalk file.");
		}
		cw.setMetsSource(new MetsSource() {
			@Override
			public MetsType getMets() {
				return m;
			}
		});
		
		cw.setCurrentUser(System.getProperty("user.name"));

		String gROUPID = file.getName();

		// build a list of the old mdSecs for this crosswalk
		Map<String, MdSecType> oldCwDmds = new HashMap<String, MdSecType>();
		for (MdSecType md : m.getDmdSec()) {
			if (gROUPID.equals(md.getGROUPID())) {
				oldCwDmds.put(md.getID(), md);
			}
		}

		Map<String, MdSecType> newCwDmds = new HashMap<String, MdSecType>();

		// create new records, update status if old dmd was user linked
		try {
			while (true) {
				MdSecType md = processRecord(cw, m, nature, file, dataFileName);
				newCwDmds.put(md.getID(), md);
				if (oldCwDmds.containsKey(md.getID())) {
					MdSecType oldMd = oldCwDmds.get(md.getID());
					if (METSConstants.MD_STATUS_CROSSWALK_USER_LINKED.equals(oldMd.getSTATUS())) {
						md.setSTATUS(oldMd.getSTATUS());
					}
				}
				cw.getDataSource().NextRecord();
			}
		} catch (RecordOutOfRangeException e) {
			// LOG.debug("got exception", e);
		} catch (DataException e) {
			setProblemMarker(e.getMessage(), file);
		}

		// cleanup links
		CompoundCommand removeLinksCommand = new CompoundCommand();
		DivType bag = METSUtils.findBagDiv(m);
		Iterator<EObject> bagChildren = bag.eAllContents();
		while (bagChildren.hasNext()) {
			EObject o = bagChildren.next();
			if (o instanceof DivType) {
				DivType div = (DivType) o;
				for (MdSecType md : div.getDmdSec()) {
					if (gROUPID.equals(md.getGROUPID())) {
						if (METSConstants.MD_STATUS_CROSSWALK_LINKED.equals(md.getSTATUS())) {
							// remove all links established by this CW
							removeLinksCommand.append(RemoveCommand.create(nature.getEditingDomain(), div,
									MetsPackage.eINSTANCE.getDivType_DmdSec(), md));
						} else if (!newCwDmds.containsKey(md.getID())) {
							// remove all links to mdSecs that no longer exist
							removeLinksCommand.append(RemoveCommand.create(nature.getEditingDomain(), div,
									MetsPackage.eINSTANCE.getDivType_DmdSec(), md));
						} else { // migrate links you want to keep to new mds
							removeLinksCommand.append(RemoveCommand.create(nature.getEditingDomain(), div,
									MetsPackage.eINSTANCE.getDivType_DmdSec(), md));
							MdSecType newMd = newCwDmds.get(md.getID());
							removeLinksCommand.append(AddCommand.create(nature.getEditingDomain(), div,
									MetsPackage.eINSTANCE.getDivType_DmdSec(), newMd));
						}
					}
				}
			}
		}
		nature.getCommandStack().execute(removeLinksCommand);

		// remove all the old mdSecs
		nature.getCommandStack().execute(RemoveCommand.create(nature.getEditingDomain(), oldCwDmds.values()));

		// add the new records to mets
		nature.getCommandStack().execute(
				AddCommand.create(nature.getEditingDomain(), m, MetsPackage.eINSTANCE.getMetsType_DmdSec(),
						newCwDmds.values()));

		// find the matcher strategies
		CompoundCommand autoLinkCommand = new CompoundCommand();
		for (WalkWidget w : cw.getWidgets()) {
			if (w instanceof RecordMatcherStrategy) {
				RecordMatcherStrategy s = (RecordMatcherStrategy) w;
				try {
					s.run();
					RecordMatches matches = s.getMatches();
					LOG.debug("Got matches: " + matches.getMatches().size() + " matched, "
							+ matches.getRecordCollisions().size() + " record collisions, "
							+ matches.getResourceCollisions().size() + " resource collisions.");
					// TODO set warnings for collisions
					// TODO set links and status for matches
					for (Map.Entry<DivType, String> match : matches.getMatches().entrySet()) {
						String divID = match.getKey().getID();
						System.out.println("got id " + divID + " for resource " + match.getKey());
						if (divID != null) {
							// DivType div = METSUtils.findDivTreeSearch(bag,
							// divID);
							DivType div = (DivType) m.eResource().getEObject(divID);
							String dmdID = makeMdSecID(file, match.getValue());
							if (newCwDmds.containsKey(dmdID)) {
								MdSecType md = newCwDmds.get(dmdID);
								md.setSTATUS(METSConstants.MD_STATUS_CROSSWALK_LINKED);
								// remove any remaining link to this DMDID.
								for (TreeIterator<EObject> ti = METSUtils.findBagDiv(m).eAllContents(); ti.hasNext();) {
									EObject e = ti.next();
									if (e instanceof DivType) {
										DivType divL = (DivType) e;
										for (MdSecType linked : divL.getDmdSec()) {
											if (dmdID.equals(linked.getID())) {
												autoLinkCommand.append(RemoveCommand.create(nature.getEditingDomain(), divL,
														MetsPackage.eINSTANCE.getDivType_DmdSec(), md));
											}
										}
									}
								}
								// add the CW link
								autoLinkCommand.append(AddCommand.create(nature.getEditingDomain(), div,
										MetsPackage.eINSTANCE.getDivType_DmdSec(), md));
							}
						}
					}
					nature.getCommandStack().execute(autoLinkCommand);
					MetsProjectNature.getAdapterFactory().fireNotifyChanged(
							new NotificationImpl(Notification.ADD, null, null));
				} catch (Exception e) {
					setProblemMarker(e.getLocalizedMessage(), file);
					LOG.error("failure in record matcher", e);
				}
			}
		}
		return Status.OK_STATUS;
	}

	/**
	 * @param cw
	 * @param m
	 */
	private MdSecType processRecord(CrossWalk cw, MetsType m, MetsProjectNature n, IFile file, String datafilename) {
		MODSFactory f = gov.loc.mods.mods.MODSFactory.eINSTANCE;
		ModsDefinition r = f.createModsDefinition();
		for (OutputElement e : cw.getElements()) {
			e.updateRecord(r);
		}
		// LOG.debug("created record: " + r.toString());

		// detect if ID already present.
		MdSecType md = MetsFactory.eINSTANCE.createMdSecType();
		md.setGROUPID(file.getName());
		md.setSTATUS(METSConstants.MD_STATUS_CROSSWALK_NOT_LINKED);
		md.setCREATED(new XMLCalendar(new java.util.Date(System.currentTimeMillis()), XMLCalendar.DATETIME));
		String recordID = cw.getDataSource().getRecordID();
		md.setID(makeMdSecID(file, recordID));

		MdWrapType wrap = MetsFactory.eINSTANCE.createMdWrapType();
		wrap.setMDTYPE(MDTYPEType.MODS);
		wrap.setLABEL(recordID);
		XmlDataType1 xml = MetsFactory.eINSTANCE.createXmlDataType1();

		xml.getAny().add(MODSPackage.eINSTANCE.getDocumentRoot_Mods(), r);
		wrap.setXmlData(xml);
		md.setMdWrap(wrap);
		return md;
	}

	/**
	 * @param file
	 *           the Crosswalk Definition File
	 * @param recordID
	 * @return
	 */
	private String makeMdSecID(IFile crosswalkFile, String recordID) {
		return "cw_" + crosswalkFile.hashCode() + "_" + recordID;
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
