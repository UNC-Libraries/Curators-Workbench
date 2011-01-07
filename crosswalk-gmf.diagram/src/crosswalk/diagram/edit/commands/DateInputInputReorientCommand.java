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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import crosswalk.DateGenerator;
import crosswalk.DateInput;
import crosswalk.diagram.edit.policies.CrosswalkBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class DateInputInputReorientCommand extends EditElementCommand {

    /**
     * @generated
     */
    private final int reorientDirection;

    /**
     * @generated
     */
    private final EObject referenceOwner;

    /**
     * @generated
     */
    private final EObject oldEnd;

    /**
     * @generated
     */
    private final EObject newEnd;

    /**
     * @generated
     */
    public DateInputInputReorientCommand(ReorientReferenceRelationshipRequest request) {
	super(request.getLabel(), null, request);
	reorientDirection = request.getDirection();
	referenceOwner = request.getReferenceOwner();
	oldEnd = request.getOldRelationshipEnd();
	newEnd = request.getNewRelationshipEnd();
    }

    /**
     * @generated
     */
    public boolean canExecute() {
	if (false == referenceOwner instanceof DateInput) {
	    return false;
	}
	if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
	    return canReorientSource();
	}
	if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
	    return canReorientTarget();
	}
	return false;
    }

    /**
     * @generated
     */
    protected boolean canReorientSource() {
	if (!(oldEnd instanceof DateGenerator && newEnd instanceof DateInput)) {
	    return false;
	}
	return CrosswalkBaseItemSemanticEditPolicy.getLinkConstraints().canExistDateInputInput_4010(getNewSource(),
			getOldTarget());
    }

    /**
     * @generated
     */
    protected boolean canReorientTarget() {
	if (!(oldEnd instanceof DateGenerator && newEnd instanceof DateGenerator)) {
	    return false;
	}
	return CrosswalkBaseItemSemanticEditPolicy.getLinkConstraints().canExistDateInputInput_4010(getOldSource(),
			getNewTarget());
    }

    /**
     * @generated
     */
    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
	if (!canExecute()) {
	    throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
	}
	if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
	    return reorientSource();
	}
	if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
	    return reorientTarget();
	}
	throw new IllegalStateException();
    }

    /**
     * @generated
     */
    protected CommandResult reorientSource() throws ExecutionException {
	getOldSource().setInput(null);
	getNewSource().setInput(getOldTarget());
	return CommandResult.newOKCommandResult(referenceOwner);
    }

    /**
     * @generated
     */
    protected CommandResult reorientTarget() throws ExecutionException {
	getOldSource().setInput(getNewTarget());
	return CommandResult.newOKCommandResult(referenceOwner);
    }

    /**
     * @generated
     */
    protected DateInput getOldSource() {
	return (DateInput) referenceOwner;
    }

    /**
     * @generated
     */
    protected DateInput getNewSource() {
	return (DateInput) newEnd;
    }

    /**
     * @generated
     */
    protected DateGenerator getOldTarget() {
	return (DateGenerator) oldEnd;
    }

    /**
     * @generated
     */
    protected DateGenerator getNewTarget() {
	return (DateGenerator) newEnd;
    }
}
