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
package unc.lib.cdr.workbench.arrange;

import gov.loc.mets.DivType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class AddFolderDivHandler extends AbstractHandler {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(AddFolderDivHandler.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands. ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection select = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		DivType within = null;
		MetsProjectNature mpn = null;
		Object o = select.getFirstElement();
		if (o instanceof IProject || o instanceof ArrangementProjectElement) {
			// get the bag div
			IProject p = null;
			if (o instanceof IProject) {
				p = (IProject) o;
			} else {
				p = ((ArrangementProjectElement) o).getProject();
			}
			try {
				mpn = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
				within = METSUtils.findBagDiv(mpn.getMets());
			} catch (CoreException e) {
				throw new ExecutionException("Project must have a METS nature.", e);
			}
		} else if (o instanceof DivType) {
			within = (DivType) o;
		}
		LOG.debug("WITHIN " + within.toString());
		IInputValidator v = new IInputValidator() {
			@Override
			public String isValid(String newText) {
				if (newText.trim().length() < 1) {
					return "Name cannot be empty or blank";
				}
				return null;
			}
		};
		InputDialog d = new InputDialog(HandlerUtil.getActiveShell(event), "Folder Name", "Enter the folder name.", "", v);
		if (InputDialog.OK == d.open()) {
			DivType div = MetsFactory.eINSTANCE.createDivType();
			div.setLABEL1(d.getValue());
			String ID = METSUtils.makeXMLUUID();
			div.setID(ID);
			div.setTYPE(METSConstants.Div_Folder);

			EditingDomain ed = MetsProjectNature.getEditingDomain(within);
			Command cmd = AddCommand.create(ed, within, null, div);
			ed.getCommandStack().execute(cmd);
		}
		return null;
	}

}
