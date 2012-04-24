/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.MappedAttributeCreateCommand;
import crosswalk.diagram.edit.commands.MappedElement2CreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MappedElementChildElementsCompartmentItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MappedElementChildElementsCompartmentItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.MappedElement_3007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrosswalkElementTypes.MappedElement_3008 == req.getElementType()) {
			return getGEFWrapper(new MappedElement2CreateCommand(req));
		}
		if (CrosswalkElementTypes.MappedAttribute_3009 == req.getElementType()) {
			return getGEFWrapper(new MappedAttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
