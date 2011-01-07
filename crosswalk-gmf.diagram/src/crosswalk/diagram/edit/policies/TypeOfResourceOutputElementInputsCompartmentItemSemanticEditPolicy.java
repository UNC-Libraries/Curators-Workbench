/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.StringInput8CreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class TypeOfResourceOutputElementInputsCompartmentItemSemanticEditPolicy extends
		CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public TypeOfResourceOutputElementInputsCompartmentItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.TypeOfResource_2013);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
	if (CrosswalkElementTypes.StringInput_3016 == req.getElementType()) {
	    return getGEFWrapper(new StringInput8CreateCommand(req));
	}
	return super.getCreateCommand(req);
    }

}
