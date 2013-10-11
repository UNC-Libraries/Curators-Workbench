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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.stage.RepairProjectStagingWizard;

public class RepairProjectStagingAreasHandler extends AbstractHandler
		implements IHandler {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory
			.getLogger(RepairProjectStagingAreasHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection sel = (IStructuredSelection) HandlerUtil
				.getCurrentSelectionChecked(event);
		if (sel.isEmpty())
			return Status.OK_STATUS;

		for (Object foo : sel.toArray()) {
			if (foo != null && foo instanceof IProject) {
				IProject p = (IProject) foo;
				MetsProjectNature mpn = MetsProjectNature.get(p);
				if (mpn == null)
					continue;
				RepairProjectStagingWizard wiz = new RepairProjectStagingWizard(
						mpn);
				WizardDialog dialog = new WizardDialog(
						HandlerUtil.getActiveShell(event), wiz);
				dialog.open();
			}
		}
		return Status.OK_STATUS;
	}
}
