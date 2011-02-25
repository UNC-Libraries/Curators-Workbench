package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.StringInputCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class TitleInfoOutputElementInputsCompartmentItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public TitleInfoOutputElementInputsCompartmentItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.TitleInfo_2002);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
	if (CrosswalkElementTypes.StringInput_3002 == req.getElementType()) {
	    return getGEFWrapper(new StringInputCreateCommand(req));
	}
	return super.getCreateCommand(req);
    }

}
