/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.StringInput6CreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class NameOutputElementInputsCompartmentItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public NameOutputElementInputsCompartmentItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.Name_2011);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
	if (CrosswalkElementTypes.StringInput_3014 == req.getElementType()) {
	    return getGEFWrapper(new StringInput6CreateCommand(req));
	}
	return super.getCreateCommand(req);
    }

}
