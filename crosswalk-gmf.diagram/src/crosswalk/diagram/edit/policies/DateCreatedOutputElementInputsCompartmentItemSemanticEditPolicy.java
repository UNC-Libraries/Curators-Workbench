/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.DateInputCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class DateCreatedOutputElementInputsCompartmentItemSemanticEditPolicy extends
		CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public DateCreatedOutputElementInputsCompartmentItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.DateCreated_2015);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
	if (CrosswalkElementTypes.DateInput_3019 == req.getElementType()) {
	    return getGEFWrapper(new DateInputCreateCommand(req));
	}
	return super.getCreateCommand(req);
    }

}
