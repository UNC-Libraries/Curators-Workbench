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
package crosswalk.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.CrosswalkFactory;
import crosswalk.Form;
import crosswalk.MetadataBlock;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MetadataBlock3CreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public MetadataBlock3CreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		return true;

	}

	/**
	 * @generated NOT
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		CreateElementRequest request = ((CreateElementRequest) getRequest());
		MetadataBlock newElement = CrosswalkFactory.eINSTANCE
				.createMetadataBlock();
		Form owner = (Form) getElementToEdit();
		owner.getElements().add(newElement);
		doConfigure(newElement, monitor, info);

		if (request.getParameters().containsKey("templateElement")) {
			System.err.println("MB3 create command, container: "
					+ getElementToEdit());
			EObject template = (EObject) request
					.getParameter("templateElement");
			EcoreUtil.Copier copier = new EcoreUtil.Copier(true, true) {

				@Override
				protected void copyReference(EReference eReference,
						EObject eObject, EObject copyEObject) {
					System.err.println(eReference);
					super.copyReference(eReference, eObject, copyEObject);
				}

				@Override
				protected void copyProxyURI(EObject eObject, EObject copyEObject) {
					super.copyProxyURI(eObject, copyEObject);
				}

			};
			MetadataBlock copyElement = (MetadataBlock) copier.copy(template);
			copier.copyReferences();
			owner.getElements().add(copyElement);
			doConfigure(copyElement, monitor, info);

			owner.getElements().remove(newElement);
			((CreateElementRequest) getRequest()).setNewElement(copyElement);
			return CommandResult.newOKCommandResult(copyElement);
		} else {
			((CreateElementRequest) getRequest()).setNewElement(newElement);
			return CommandResult.newOKCommandResult(newElement);
		}
	}

	/**
	 * @generated
	 */
	protected void doConfigure(MetadataBlock newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

}
