package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.MetadataBlockCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class DictionaryModelBoxCompartmentItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DictionaryModelBoxCompartmentItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.Dictionary_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrosswalkElementTypes.MetadataBlock_3010 == req.getElementType()) {
			return getGEFWrapper(new MetadataBlockCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
