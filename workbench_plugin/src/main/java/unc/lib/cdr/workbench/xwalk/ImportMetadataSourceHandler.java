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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crosswalk.diagram.part.CrosswalkCreationWizard;

public class ImportMetadataSourceHandler extends AbstractHandler {
    private static final Logger LOG = LoggerFactory.getLogger(ImportMetadataSourceHandler.class);

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.
     * ExecutionEvent)
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
	LOG.debug("handler called");
	IStructuredSelection select = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);

	CrosswalkCreationWizard wiz = new CrosswalkCreationWizard();
	wiz.init(HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench(), select);
	WizardDialog dialog = new WizardDialog(HandlerUtil
			.getActiveShell(event), wiz);
	dialog.open();
	return null;
    }

}
