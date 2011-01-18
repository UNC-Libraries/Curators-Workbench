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
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import crosswalk.DateGenerator;
import crosswalk.DateInput;
import crosswalk.diagram.edit.policies.CrosswalkBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class DateInputInputCreateCommand extends EditElementCommand {

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
    public DateInputInputCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
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
	if (source != null && false == source instanceof DateInput) {
	    return false;
	}
	if (target != null && false == target instanceof DateGenerator) {
	    return false;
	}
	if (getSource() == null) {
	    return true; // link creation is in progress; source is not defined yet
	}
	// target may be null here but it's possible to check constraint
	return CrosswalkBaseItemSemanticEditPolicy.getLinkConstraints().canCreateDateInputInput_4010(getSource(),
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
    protected DateInput getSource() {
	return (DateInput) source;
    }

    /**
     * @generated
     */
    protected DateGenerator getTarget() {
	return (DateGenerator) target;
    }
}
