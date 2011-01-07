/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.StringInput2CreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class AbstractOutputElementInputsCompartmentItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public AbstractOutputElementInputsCompartmentItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.Abstract_2007);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
	if (CrosswalkElementTypes.StringInput_3010 == req.getElementType()) {
	    return getGEFWrapper(new StringInput2CreateCommand(req));
	}
	return super.getCreateCommand(req);
    }

}
