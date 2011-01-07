/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.StringInput12CreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class TrimWhitespaceOutputElementInputsCompartmentItemSemanticEditPolicy extends
		CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public TrimWhitespaceOutputElementInputsCompartmentItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.TrimWhitespace_2019);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
	if (CrosswalkElementTypes.StringInput_3022 == req.getElementType()) {
	    return getGEFWrapper(new StringInput12CreateCommand(req));
	}
	return super.getCreateCommand(req);
    }

}
