package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.InputFieldCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MetadataBlockMetadataBlockInputFieldsCompartmentItemSemanticEditPolicy extends
		CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MetadataBlockMetadataBlockInputFieldsCompartmentItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.MetadataBlock_3010);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrosswalkElementTypes.InputField_3017 == req.getElementType()) {
			return getGEFWrapper(new InputFieldCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
