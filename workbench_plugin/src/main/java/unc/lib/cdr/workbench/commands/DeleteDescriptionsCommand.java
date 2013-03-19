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
import gov.loc.mets.MdSecType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.util.METSConstants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class DeleteDescriptionsCommand extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection s = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		boolean confirmed = MessageDialog.openConfirm(HandlerUtil.getActiveShell(event), "Confirm Delete", 
				"Please confirm that you wish to delete descriptions.");
		if(!confirmed) return null;
		Map<IProject, CompoundCommand> deletesByProject = new HashMap<IProject, CompoundCommand>();
		for (@SuppressWarnings("rawtypes")
		Iterator iter = s.iterator(); iter.hasNext();) {
			Object o = iter.next();
			if (DivType.class.isInstance(o)) {
				DivType div = (DivType) o;
				MdSecType userMD = null;
				for (MdSecType md : div.getDmdSec()) {
					if (METSConstants.MD_STATUS_USER_EDITED.equals(md.getSTATUS())) {
						userMD = md;
						break;
					}
				}
				if (userMD != null) {
					IProject p = MetsProjectNature.getProjectForMetsEObject(userMD);
					EditingDomain ed = MetsProjectNature.get(p).getEditingDomain();
					if (!deletesByProject.containsKey(p)) {
						deletesByProject.put(p, new CompoundCommand("Delete of MODS Descriptions"));
					}
					deletesByProject.get(p).append(RemoveCommand.create(ed, div,
						MetsPackage.eINSTANCE.getDivType_DmdSec(), userMD));
					deletesByProject.get(p).append(RemoveCommand.create(ed, userMD));
				}
			}
		}
		for(IProject p : deletesByProject.keySet()) {
			CompoundCommand delete = deletesByProject.get(p);
			if (delete.canExecute()) {
				MetsProjectNature.get(p).getCommandStack().execute(delete);
			}
		}
		return null;
	}

}
