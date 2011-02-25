package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.StringInput9CreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class OriginalNameRecordMatcherRecordMatcherInputsCompartmentItemSemanticEditPolicy extends
		CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public OriginalNameRecordMatcherRecordMatcherInputsCompartmentItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.OriginalNameRecordMatcher_2010);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
	if (CrosswalkElementTypes.StringInput_3010 == req.getElementType()) {
	    return getGEFWrapper(new StringInput9CreateCommand(req));
	}
	return super.getCreateCommand(req);
    }

}
