package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.MappedAttributeCreateCommand;
import crosswalk.diagram.edit.commands.MappedElement2CreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MappedElementChildElementsCompartment2ItemSemanticEditPolicy
		extends CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MappedElementChildElementsCompartment2ItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.MappedElement_3008);
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
