/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.StringInput9CreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class OriginalNameRecordMatcherOutputElementInputsCompartmentItemSemanticEditPolicy extends
		CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public OriginalNameRecordMatcherOutputElementInputsCompartmentItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.OriginalNameRecordMatcher_2014);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
	if (CrosswalkElementTypes.StringInput_3018 == req.getElementType()) {
	    return getGEFWrapper(new StringInput9CreateCommand(req));
	}
	return super.getCreateCommand(req);
    }

}
