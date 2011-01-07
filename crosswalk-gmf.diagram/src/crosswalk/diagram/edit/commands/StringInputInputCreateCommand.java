/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import crosswalk.StringGenerator;
import crosswalk.StringInput;
import crosswalk.diagram.edit.policies.CrosswalkBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class StringInputInputCreateCommand extends EditElementCommand {

    /**
     * @generated
     */
    private final EObject source;

    /**
     * @generated
     */
    private final EObject target;

    /**
     * @generated
     */
    public StringInputInputCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
	super(request.getLabel(), null, request);
	this.source = source;
	this.target = target;
    }

    /**
     * @generated
     */
    public boolean canExecute() {
	if (source == null && target == null) {
	    return false;
	}
	if (source != null && false == source instanceof StringInput) {
	    return false;
	}
	if (target != null && false == target instanceof StringGenerator) {
	    return false;
	}
	if (getSource() == null) {
	    return true; // link creation is in progress; source is not defined yet
	}
	// target may be null here but it's possible to check constraint
	return CrosswalkBaseItemSemanticEditPolicy.getLinkConstraints().canCreateStringInputInput_4009(getSource(),
			getTarget());
    }

    /**
     * @generated
     */
    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
	if (!canExecute()) {
	    throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
	}

	if (getSource() != null && getTarget() != null) {
	    getSource().setInput(getTarget());
	}
	return CommandResult.newOKCommandResult();

    }

    /**
     * @generated
     */
    protected void setElementToEdit(EObject element) {
	throw new UnsupportedOperationException();
    }

    /**
     * @generated
     */
    protected StringInput getSource() {
	return (StringInput) source;
    }

    /**
     * @generated
     */
    protected StringGenerator getTarget() {
	return (StringGenerator) target;
    }
}
