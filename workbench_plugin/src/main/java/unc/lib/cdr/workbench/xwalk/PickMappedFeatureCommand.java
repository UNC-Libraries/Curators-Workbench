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

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crosswalk.CrosswalkPackage;
import crosswalk.diagram.custom.MappedModelUtil;

public class PickMappedFeatureCommand extends AbstractTransactionalCommand {
	private static final String MAPPED_FEATURE_PARAM = "mappedFeature";
	private static final Logger LOG = LoggerFactory.getLogger(PickMappedFeatureCommand.class);
	
	private CreateElementRequest request = null;
	
	public PickMappedFeatureCommand(CreateElementRequest request) {
		super(request.getEditingDomain(), "Pick the Mapped Feature", Collections.EMPTY_LIST);
		this.request = request;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		EObject parent = request.getContainer();
		EClass classToCreate = request.getElementType().getEClass();
		LOG.debug("executing on parent "+parent+" class "+classToCreate);
		// switch between create element and create attribute
		List<EStructuralFeature> possibleFeatures = null;
		String message = null;
		if (CrosswalkPackage.eINSTANCE.getMappedElement().equals(classToCreate)) {
			possibleFeatures = MappedModelUtil.getChildElementFeatures(parent);
			message = "Pick a child element.";
		} else if (CrosswalkPackage.eINSTANCE.getMappedAttribute().equals(classToCreate)) {
			possibleFeatures = MappedModelUtil.getAttributes(parent);
			message = "Pick an attribute";
		}
		Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		if (possibleFeatures.size() == 0) {
			String dialogMessage = "No features of that type are possible in this element.";
			MessageDialog.openInformation(shell, message, dialogMessage);
			return CommandResult.newCancelledCommandResult();
		} else {
			MappedFeatureChoiceDialog dialog = new MappedFeatureChoiceDialog(shell);
			dialog.setFeatures(possibleFeatures);
			dialog.setMessage(message);
			EStructuralFeature answer = dialog.open();
			if (answer != null) {
				Map<String, Object> params = new HashMap<String, Object>();
				params.put(MAPPED_FEATURE_PARAM, answer);
				request.addParameters(params);
			} else {
				return CommandResult.newCancelledCommandResult();
			}
		}
		return CommandResult.newOKCommandResult();
	}

}
