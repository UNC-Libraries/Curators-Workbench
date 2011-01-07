/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.AccessCondition;
import crosswalk.CrossWalk;
import crosswalk.CrosswalkFactory;

/**
 * @generated
 */
public class AccessConditionCreateCommand extends EditElementCommand {

    /**
     * @generated
     */
    public AccessConditionCreateCommand(CreateElementRequest req) {
	super(req.getLabel(), null, req);
    }

    /**
     * FIXME: replace with setElementToEdit()
     * @generated
     */
    @Override
    protected EObject getElementToEdit() {
	EObject container = ((CreateElementRequest) getRequest()).getContainer();
	if (container instanceof View) {
	    container = ((View) container).getElement();
	}
	return container;
    }

    /**
     * @generated
     */
    @Override
    public boolean canExecute() {
	return true;

    }

    /**
     * @generated NOT
     */
    @Override
    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
	AccessCondition newElement = CrosswalkFactory.eINSTANCE.createAccessCondition();
	newElement.initInputs();

	CrossWalk owner = (CrossWalk) getElementToEdit();
	owner.getElements().add(newElement);

	doConfigure(newElement, monitor, info);

	((CreateElementRequest) getRequest()).setNewElement(newElement);
	return CommandResult.newOKCommandResult(newElement);
    }

    /**
     * @generated
     */
    protected void doConfigure(AccessCondition newElement, IProgressMonitor monitor, IAdaptable info)
		    throws ExecutionException {
	IElementType elementType = ((CreateElementRequest) getRequest()).getElementType();
	ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
	configureRequest.setClientContext(((CreateElementRequest) getRequest()).getClientContext());
	configureRequest.addParameters(getRequest().getParameters());
	ICommand configureCommand = elementType.getEditCommand(configureRequest);
	if (configureCommand != null && configureCommand.canExecute()) {
	    configureCommand.execute(monitor, info);
	}
    }

}
