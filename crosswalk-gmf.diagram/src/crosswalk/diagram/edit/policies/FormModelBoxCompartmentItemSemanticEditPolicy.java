package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.MetadataBlock3CreateCommand;
import crosswalk.diagram.edit.commands.ParagraphCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class FormModelBoxCompartmentItemSemanticEditPolicy extends
		CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FormModelBoxCompartmentItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.Form_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrosswalkElementTypes.MetadataBlock_3019 == req.getElementType()) {
			return getGEFWrapper(new MetadataBlock3CreateCommand(req));
		}
		if (CrosswalkElementTypes.Paragraph_3020 == req.getElementType()) {
			return getGEFWrapper(new ParagraphCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
