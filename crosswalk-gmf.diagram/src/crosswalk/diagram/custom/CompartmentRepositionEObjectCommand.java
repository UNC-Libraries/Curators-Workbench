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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.emf.commands.core.commands.RepositionEObjectCommand;
import org.eclipse.gmf.runtime.notation.View;

public class CompartmentRepositionEObjectCommand extends RepositionEObjectCommand {
	EditPart childToMove = null;
	int newIndex = 0;

	public CompartmentRepositionEObjectCommand(TransactionalEditingDomain editingDomain, String label, EList elements,
			EObject element, int displacement) {
		super(editingDomain, label, elements, element, displacement);
	}

	public CompartmentRepositionEObjectCommand(EditPart childToMove, TransactionalEditingDomain editingDomain,
			String label, EList elements, EObject element, int displacement, int newIndex) {
		super(editingDomain, label, elements, element, displacement);
		this.childToMove = childToMove;
		this.newIndex = newIndex;
	}

	public CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info)
			throws ExecutionException {
		CommandResult rs = super.doExecuteWithResult(progressMonitor, info);
		EditPart compartment = childToMove.getParent();
		ViewUtil.repositionChildAt((View) compartment.getModel(), (View) childToMove.getModel(), newIndex);
		compartment.refresh();
		return rs;
	}
}
