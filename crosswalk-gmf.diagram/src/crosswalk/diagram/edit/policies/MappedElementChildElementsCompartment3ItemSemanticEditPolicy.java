package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.MappedAttribute2CreateCommand;
import crosswalk.diagram.edit.commands.MappedElement2CreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MappedElementChildElementsCompartment3ItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MappedElementChildElementsCompartment3ItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.MappedElement_3015);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrosswalkElementTypes.MappedElement_3008 == req.getElementType()) {
			return getGEFWrapper(new MappedElement2CreateCommand(req));
		}
		if (CrosswalkElementTypes.MappedAttribute_3016 == req.getElementType()) {
			return getGEFWrapper(new MappedAttribute2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
