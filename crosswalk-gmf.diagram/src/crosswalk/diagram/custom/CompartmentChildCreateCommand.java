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
package crosswalk.diagram.custom;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.util.Assert;

public class CompartmentChildCreateCommand extends CreateCommand {
	int index;
	private EStructuralFeature feature;

	public CompartmentChildCreateCommand(TransactionalEditingDomain editingDomain, ViewDescriptor viewDescriptor,
			View containerView, int index, EStructuralFeature feature) {
		super(editingDomain, viewDescriptor, containerView);
		this.index = index;
		this.feature = feature;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {

		View view = ViewService.getInstance().createView(viewDescriptor.getViewKind(),
				viewDescriptor.getElementAdapter(), containerView, viewDescriptor.getSemanticHint(), index,
				viewDescriptor.isPersisted(), viewDescriptor.getPreferencesHint());
		Assert.isNotNull(view, "failed to create a view"); //$NON-NLS-1$
		viewDescriptor.setView(view);
		
		if (index > -1) {
			EList nodes = (EList) getContainerView().getElement().eGet(feature);
			Object o = nodes.remove(nodes.size() - 1);
			nodes.add(index, o);
		}
		
		return CommandResult.newOKCommandResult(viewDescriptor);
	}
}
