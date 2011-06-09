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
import gov.loc.mets.MetsPackage;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class RenameDivHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection select = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		try {
			DivType div = (DivType) select.getFirstElement();
			IInputValidator v = new IInputValidator() {
				@Override
				public String isValid(String newText) {
					if (newText.trim().length() < 1) {
						return "Name cannot be empty or blank";
					}
					return null;
				}
			};
			InputDialog d = new InputDialog(HandlerUtil.getActiveShell(event), "Folder Name", "Enter the new name.",
					div.getLABEL1(), v);
			if (InputDialog.OK == d.open()) {
				EditingDomain ed = MetsProjectNature.getEditingDomain(div);
				Command cmd = SetCommand.create(ed, div, MetsPackage.eINSTANCE.getDivType_LABEL1(), d.getValue());
				ed.getCommandStack().execute(cmd);
			}
		} catch (ClassCastException e) {
			throw new ExecutionException("Selection is not of Div type.", e);
		}
		return null;
	}
}
