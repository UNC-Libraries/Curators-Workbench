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
package unc.lib.cdr.workbench.commands;

import gov.loc.mets.DivType;
import gov.loc.mets.MDTYPEType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MdWrapType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.XmlDataType1;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.ModsDefinition;
import gov.loc.mods.mods.presentation.URIFragmentEditorInput;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.views.MetsProjectNavigator;

public class EditDescriptionCommand extends AbstractHandler implements IHandler {

	private static final Logger LOG = LoggerFactory.getLogger(EditDescriptionCommand.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage page = window.getActivePage();
		IViewPart view = page.findView(MetsProjectNavigator.ID);
		// Get the selection
		ISelection selection = view.getSite().getSelectionProvider().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection s = (IStructuredSelection) selection;
			DivType d = (DivType) s.getFirstElement();
			LOG.debug(String.valueOf(d));
			XMLResource r = (XMLResource) d.eResource();
			MetsProjectNature n = MetsProjectNature.getNatureForMetsObject(d);
			MdSecType userModsSec = null;
			ModsDefinition modsDef = null;
			boolean saveRequired = false;
			List<MdSecType> otherModsSec = new ArrayList<MdSecType>();
			for (MdSecType md : d.getDmdSec()) {
				if (METSConstants.MD_STATUS_USER_EDITED.equals(md.getSTATUS())) {
					userModsSec = md;
					Object o = md.getMdWrap().getXmlData().getAny().getValue(0);
					if (o != null && o instanceof ModsDefinition) {
						modsDef = (ModsDefinition) o;
					}
					break;
				} else {
					otherModsSec.add(md);
				}
			}
			if (userModsSec == null) {
				saveRequired = true;
				// we need to create the MODS record
				userModsSec = MetsFactory.eINSTANCE.createMdSecType();
				userModsSec.setSTATUS(METSConstants.MD_STATUS_USER_EDITED);
				userModsSec
						.setCREATED(new XMLCalendar(new java.util.Date(System.currentTimeMillis()), XMLCalendar.DATETIME));
				// userModsSec.setGROUPID("foo"); // username?
				String ID = METSUtils.makeXMLUUID();
				userModsSec.setID(ID);
				n.getMets().getDmdSec().add(userModsSec);

				// setup a MODS element in a mdWrap
				XmlDataType1 xml = MetsFactory.eINSTANCE.createXmlDataType1();
				modsDef = MODSFactory.eINSTANCE.createModsDefinition();
				modsDef.setID(METSUtils.makeXMLUUID());
				xml.getAny().add(MODSPackage.eINSTANCE.getDocumentRoot_Mods(), modsDef);
				MdWrapType wrap = MetsFactory.eINSTANCE.createMdWrapType();
				wrap.setMDTYPE(MDTYPEType.MODS);
				wrap.setXmlData(xml);
				userModsSec.setMdWrap(wrap);

				// link div to dmdSec
				d.getDmdSec().add(userModsSec);
				// TODO prompt for element copy from otherMods records
			}
			if (modsDef == null) { // perhaps the editor allows deletes of the root
				// MODS element?
				saveRequired = true;
				userModsSec.getMdWrap().getXmlData().getAny().clear();
				modsDef = MODSFactory.eINSTANCE.createModsDefinition();
				modsDef.setID(METSUtils.makeXMLUUID());
				userModsSec.getMdWrap().getXmlData().getAny().add(MODSPackage.eINSTANCE.getDocumentRoot_Mods(), modsDef);
			}
			if (saveRequired) {
				try {
					n.save();
				} catch (CoreException e) {
					throw new ExecutionException("There were unexpected problems opening the MODS Editor", e);
				}
			}
			// load the name of the MODS element.. description of <div label>?
			String fragmentID = r.getURIFragment(modsDef);
			String projectName = n.getProject().getName();
			URIFragmentEditorInput input = new URIFragmentEditorInput(projectName, fragmentID, "Description of '"
					+ d.getLABEL1() + "'", modsDef);
			try {
				page.openEditor(input, "gov.loc.mods.mods.presentation.MODSEditorID");
			} catch (PartInitException e) {
				throw new ExecutionException("There were unexpected problems opening the MODS Editor", e);
			}
		}
		// open Editor
		return null;
	}

}
