/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.StringInput11CreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class DateRecognizerOutputElementInputsCompartmentItemSemanticEditPolicy extends
		CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public DateRecognizerOutputElementInputsCompartmentItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.DateRecognizer_2017);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
	if (CrosswalkElementTypes.StringInput_3021 == req.getElementType()) {
	    return getGEFWrapper(new StringInput11CreateCommand(req));
	}
	return super.getCreateCommand(req);
    }

}
