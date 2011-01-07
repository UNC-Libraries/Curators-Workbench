/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class DateInputInputItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public DateInputInputItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.DateInputInput_4010);
    }

    /**
     * @generated
     */
    protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
	return getGEFWrapper(new DestroyReferenceCommand(req));
    }

}
