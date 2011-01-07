/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.StringInputCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class TitleInfoTitleInfoInputsCompartmentItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public TitleInfoTitleInfoInputsCompartmentItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.TitleInfo_2005);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
	if (CrosswalkElementTypes.StringInput_3008 == req.getElementType()) {
	    return getGEFWrapper(new StringInputCreateCommand(req));
	}
	return super.getCreateCommand(req);
    }

}
