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
	return CrosswalkBaseItemSemanticEditPolicy.getLinkConstraints().canExistDateInputInput_4002(getNewSource(),
			getOldTarget());
    }

    /**
     * @generated
     */
    protected boolean canReorientTarget() {
	if (!(oldEnd instanceof DateGenerator && newEnd instanceof DateGenerator)) {
	    return false;
	}
	return CrosswalkBaseItemSemanticEditPolicy.getLinkConstraints().canExistDateInputInput_4002(getOldSource(),
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
