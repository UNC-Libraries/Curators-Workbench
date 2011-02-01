/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.TabbedDataFieldCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class DelimitedFileDataFieldCompartmentItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public DelimitedFileDataFieldCompartmentItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.DelimitedFile_2020);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
	if (CrosswalkElementTypes.TabbedDataField_3017 == req.getElementType()) {
	    return getGEFWrapper(new TabbedDataFieldCreateCommand(req));
	}
	return super.getCreateCommand(req);
    }

}
