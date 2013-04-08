package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.MappedAttributeCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MappedElementChildAttributesCompartmentItemSemanticEditPolicy
		extends CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MappedElementChildAttributesCompartmentItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.MappedElement_3007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrosswalkElementTypes.MappedAttribute_3009 == req.getElementType()) {
			return getGEFWrapper(new MappedAttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
