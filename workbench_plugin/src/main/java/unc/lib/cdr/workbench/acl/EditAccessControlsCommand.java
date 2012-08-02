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
package unc.lib.cdr.workbench.acl;

import edu.unc.lib.schemas.acl.AccessControlType;
import edu.unc.lib.schemas.acl.AclFactory;
import edu.unc.lib.schemas.acl.AclPackage;
import gov.loc.mets.AmdSecType;
import gov.loc.mets.DivType;
import gov.loc.mets.MDTYPEType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MdWrapType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.XmlDataType1;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;
import gov.loc.mods.mods.presentation.URIFragmentEditorInput;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class EditAccessControlsCommand extends AbstractHandler implements IHandler {

	private static final Logger LOG = LoggerFactory.getLogger(EditAccessControlsCommand.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection s = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		DivType d = (DivType) s.getFirstElement();
		LOG.debug(String.valueOf(d));
		MetsProjectNature n = MetsProjectNature.getNatureForMetsObject(d);

		MdSecType rightsSec = null;
		for (MdSecType md : d.getMdSec()) {
			if (METSConstants.MD_STATUS_USER_EDITED.equals(md.getSTATUS())) {
				if (MetsPackage.eINSTANCE.getAmdSecType_RightsMD().equals(md.eContainingFeature())) {
					rightsSec = md;
					break;
				}
			}
		}

		if (rightsSec == null) {
			AmdSecType amdSec = MetsFactory.eINSTANCE.createAmdSecType();
			n.getMets().getAmdSec().add(amdSec);

			rightsSec = MetsFactory.eINSTANCE.createMdSecType();
			rightsSec.setSTATUS(METSConstants.MD_STATUS_USER_EDITED);
			rightsSec.setCREATED(new XMLCalendar(new java.util.Date(System.currentTimeMillis()), XMLCalendar.DATETIME));
			rightsSec.setID(METSUtils.makeXMLUUID());
			amdSec.getRightsMD().add(rightsSec);
			// link div to rightsMD
			d.getMdSec().add(rightsSec);
		}

		AccessControlType acl = null;
		try {
			Object o = rightsSec.getMdWrap().getXmlData().getAny().getValue(0);
			if (o != null && o instanceof AccessControlType) {
				acl = (AccessControlType) o;
			}
		} catch (NullPointerException e) {
			//e.printStackTrace();
		}

		if (acl == null) {
			XmlDataType1 xml = MetsFactory.eINSTANCE.createXmlDataType1();
			acl = AclFactory.eINSTANCE.createAccessControlType();
			// acl.setID(METSUtils.makeXMLUUID());
			xml.getAny().add(AclPackage.eINSTANCE.getDocumentRoot_AccessControl(), acl);
			MdWrapType wrap = MetsFactory.eINSTANCE.createMdWrapType();
			wrap.setMDTYPE(MDTYPEType.OTHER);
			wrap.setXmlData(xml);
			rightsSec.setMdWrap(wrap);
		}
		try {
			n.save();
		} catch (CoreException e) {
			throw new ExecutionException("There were unexpected problems opening the MODS Editor", e);
		}
		String uriFrag = acl.eResource().getURIFragment(acl);
		URIFragmentEditorInput input = new URIFragmentEditorInput(n.getProject().getName(), uriFrag, "Access Controls for '" + d.getLABEL1() + "'", acl);
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		try {
			page.openEditor(input, "workbench_plugin.accessControlEditor");
		} catch (PartInitException e) {
			throw new ExecutionException("There were unexpected problems opening the ACL Editor", e);
		}
		// open Editor
		return null;
	}

}
