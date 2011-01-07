/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.StringInput7CreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class SubjectOutputElementInputsCompartmentItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public SubjectOutputElementInputsCompartmentItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.Subject_2012);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
	if (CrosswalkElementTypes.StringInput_3015 == req.getElementType()) {
	    return getGEFWrapper(new StringInput7CreateCommand(req));
	}
	return super.getCreateCommand(req);
    }

}
