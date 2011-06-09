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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.IResourceConstants;
import unc.lib.cdr.workbench.project.MetsProjectNature;
import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.MetsSource;
import crosswalk.OutputElement;
import crosswalk.RecordMatcherStrategy;
import crosswalk.RecordMatches;
import crosswalk.RecordOutOfRangeException;
import crosswalk.WalkWidget;

public class CrosswalksProjectBuilder extends IncrementalProjectBuilder {
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(CrosswalksProjectBuilder.class);

	public CrosswalksProjectBuilder() {
	}

	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
		LOG.debug("build invoked");
		// if (FULL_BUILD == kind) {
		fullBuild(monitor);
		// }
		return null;
	}

	/**
	 * @param monitor
	 */
	private void fullBuild(IProgressMonitor monitor) {
		IProject p = getProject();
		try {
			if (p.isOpen() && p.hasNature(MetsProjectNature.NATURE_ID)) {
				MetsProjectNature n = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
				for (IResource r : n.getCrosswalksElement().getFolder().members()) {
					if (r.exists() && r instanceof IFile
							&& IResourceConstants.CROSSWALK_EXTENSION.equals(r.getFileExtension())) {
						runCrosswalk(n, (IFile) r);
					}
				}
			}
		} catch (CoreException e) {
			LOG.error("Unexpected", e);
		}
	}

	/**
	 * @param nature
	 *           the METS project nature
	 * @param file
	 *           the crosswalk definition file
	 */
	private void runCrosswalk(MetsProjectNature nature, IFile file) {
		LOG.debug("running crosswalk: " + file.getName());
		clearProblemMarkers(file);
		final MetsType m = nature.getMets();
		// FIXME do this as undo transaction if builder doesn't provider that
		// automatically
		ResourceSet resourceSet = new ResourceSetImpl();
		// resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
		// .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new
		// CrosswalkResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(CrosswalkPackage.eNS_URI, CrosswalkPackage.eINSTANCE);
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
			if (o instanceof CrossWalk) {
				cw = (CrossWalk) o;
			}
		}
		if (cw == null) {
			setProblemMarker("No CrossWalk element in this file.", file);
			return;
		}
		if (cw.getDataSource() == null) {
			setProblemMarker("No data source defined in this CrossWalk", file);
			return;
		}
		String dataFileName = cw.getDataSource().getName();
		try {
			cw.getDataSource().Reset();
		} catch (DataException e) {
			LOG.debug("cannot reset data source", e);
			setProblemMarker(e.getLocalizedMessage(), file);
			return;
		}

		cw.setMetsSource(new MetsSource() {
			@Override
			public MetsType getMets() {
				return m;
			}
		});

		// remove stale records
		clearOldMDRecordsAndCrosswalkLinks(nature.getEditingDomain(), m, cw, file);

		// create new records
		List<MdSecType> dmdSecs = new ArrayList<MdSecType>();
		try {
			MdSecType md = processRecord(cw, m, nature, file, dataFileName);
			dmdSecs.add(md);
			while (true) {
				cw.getDataSource().NextRecord();
				MdSecType md2 = processRecord(cw, m, nature, file, dataFileName);
				dmdSecs.add(md2);
			}
		} catch (RecordOutOfRangeException e) {
			// LOG.debug("got exception", e);
		} catch (DataException e) {
			setProblemMarker(e.getMessage(), file);
		}

		// add the new records to mets
		Command addCommand = AddCommand.create(nature.getEditingDomain(), m, MetsPackage.eINSTANCE.getMetsType_DmdSec(),
				dmdSecs);
		if (addCommand.canExecute()) {
			nature.getEditingDomain().getCommandStack().execute(addCommand);
		} else {
			setProblemMarker("Cannot add dmdSecs to METS", file);
			LOG.error("There was a problem executing the add command for dmdSecs");
		}

		// find the matcher strategies
		for (WalkWidget w : cw.getWidgets()) {
			if (w instanceof RecordMatcherStrategy) {
				RecordMatcherStrategy s = (RecordMatcherStrategy) w;
				try {
					s.run();
					RecordMatches matches = s.getMatches();
					LOG.debug("Got matches: " + matches.getMatches().size() + " matched, "
							+ matches.getRecordCollisions().size() + " record collisions, "
							+ matches.getResourceCollisions().size() + " resource collisions.");
					// DivType bag = METSUtils.findBagDiv(m);
					// TODO set warnings for collisions
					// TODO set links and status for matches
					for (Entry<DivType, String> match : matches.getMatches().entrySet()) {
						String divID = match.getKey().getID();
						System.out.println("got id " + divID + " for resource " + match.getKey());
						if (divID != null) {
							// DivType div = METSUtils.findDivTreeSearch(bag,
							// divID);
							DivType div = (DivType) m.eResource().getEObject(divID);
							String dmdID = makeMdSecID(file, match.getValue());
							EObject o = m.eResource().getEObject(dmdID);
							if (o != null && o instanceof MdSecType) {
								MdSecType md = (MdSecType) o;
								md.setSTATUS(METSConstants.MD_STATUS_CROSSWALK_LINKED);
								if (!div.getDmdSec().contains(md)) {
									div.getDmdSec().add(md);
								}
							}
						}
					}
				} catch (DataException e) {
					setProblemMarker(e.getLocalizedMessage(), file);
					LOG.error("failure in record matcher", e);
				}
			}
		}
		// run
		// getMatches
		// create warnings
		// create links and adjust md status
	}

	/**
	 * @param cw
	 * @param n
	 * @param f
	 */
	private void clearOldMDRecordsAndCrosswalkLinks(EditingDomain d, MetsType m, CrossWalk cw, IFile f) {
		Set<MdSecType> removeDMD = new HashSet<MdSecType>();
		Set<MdSecType> removeDMDIDLink = new HashSet<MdSecType>();
		for (MdSecType md : m.getDmdSec()) {
			String cwGroupName = f.getName();
			if (cwGroupName.equals(md.getGROUPID())) {
				removeDMD.add(md);
				if (METSConstants.MD_STATUS_CROSSWALK_LINKED.equals(md.getSTATUS())) {
					removeDMDIDLink.add(md);
				}
			}
		}
		for (MdSecType md : removeDMDIDLink) {
			// remove dmdid ref if status is AUTO_LINKED
			DivType bag = METSUtils.findBagDiv(m);
			Iterator<EObject> bagChildren = bag.eAllContents();
			while (bagChildren.hasNext()) {
				EObject o = bagChildren.next();
				if (o instanceof DivType) {
					DivType div = (DivType) o;
					if (div.getDmdSec().contains(md)) {
						div.getDmdSec().remove(md);
						break;
					}
				}
			}
		}
		if (removeDMD.size() > 0) {
			Command removeCommand = RemoveCommand.create(d, removeDMD);
			if (removeCommand.canExecute()) {
				d.getCommandStack().execute(removeCommand);
			} else {
				setProblemMarker("Cannot remove dmdSecs from METS", f);
				LOG.error("There was a problem executing the remove command for dmdSecs");
			}
		}
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
		// m.getDmdSec().add(md);

		MdWrapType wrap = MetsFactory.eINSTANCE.createMdWrapType();
		wrap.setMDTYPE(MDTYPEType.MODS);
		wrap.setLABEL("record " + recordID);
		XmlDataType1 xml = MetsFactory.eINSTANCE.createXmlDataType1();
		// LOG.debug(r.toString());

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
