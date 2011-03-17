package crosswalk.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import crosswalk.Input;
import crosswalk.Output;
import crosswalk.diagram.edit.policies.CrosswalkBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class InputOutputReorientCommand extends EditElementCommand {

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
    public InputOutputReorientCommand(ReorientReferenceRelationshipRequest request) {
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
	if (false == referenceOwner instanceof Input) {
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
	if (!(oldEnd instanceof Output && newEnd instanceof Input)) {
	    return false;
	}
	return CrosswalkBaseItemSemanticEditPolicy.getLinkConstraints().canExistInputOutput_4003(getNewSource(),
			getOldTarget());
    }

    /**
     * @generated
     */
    protected boolean canReorientTarget() {
	if (!(oldEnd instanceof Output && newEnd instanceof Output)) {
	    return false;
	}
	return CrosswalkBaseItemSemanticEditPolicy.getLinkConstraints().canExistInputOutput_4003(getOldSource(),
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
	getOldSource().setOutput(null);
	getNewSource().setOutput(getOldTarget());
	return CommandResult.newOKCommandResult(referenceOwner);
    }

    /**
     * @generated
     */
    protected CommandResult reorientTarget() throws ExecutionException {
	getOldSource().setOutput(getNewTarget());
	return CommandResult.newOKCommandResult(referenceOwner);
    }

    /**
     * @generated
     */
    protected Input getOldSource() {
	return (Input) referenceOwner;
    }

    /**
     * @generated
     */
    protected Input getNewSource() {
	return (Input) newEnd;
    }

    /**
     * @generated
     */
    protected Output getOldTarget() {
	return (Output) oldEnd;
    }

    /**
     * @generated
     */
    protected Output getNewTarget() {
	return (Output) newEnd;
    }
}
