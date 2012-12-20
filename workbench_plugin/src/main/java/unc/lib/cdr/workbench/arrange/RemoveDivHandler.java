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
package unc.lib.cdr.workbench.arrange;

import gov.loc.mets.DivType;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.MetsProjectNature;

/**
 * @author Gregory Jansen
 * 
 */
public class RemoveDivHandler extends AbstractHandler {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(RemoveDivHandler.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands. ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection select = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		boolean confirmed = MessageDialog.openConfirm(HandlerUtil.getActiveShell(event), "Confirm Delete", 
				"Please confirm that you wish to delete (un-capture) the selected part of the arrangement.");
		if(!confirmed) return null;
		for (Object o : select.toList()) {
			if (o instanceof DivType) {
				DivType d = (DivType) o;
				EditingDomain ed = MetsProjectNature.getEditingDomain(d);
				Command cmd = RemoveCommand.create(ed, o);
				try {
					if(cmd.canExecute()) {
						ed.getCommandStack().execute(cmd);
					}
				} catch (NullPointerException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
