package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.DateRecognizerCreateCommand;
import crosswalk.diagram.edit.commands.MappedElementCreateCommand;
import crosswalk.diagram.edit.commands.TextCreateCommand;
import crosswalk.diagram.edit.commands.TrimWhitespaceCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MetadataBlockMetadataBlockMappingCompartmentItemSemanticEditPolicy extends
		CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MetadataBlockMetadataBlockMappingCompartmentItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.MetadataBlock_3010);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrosswalkElementTypes.DateRecognizer_3004 == req.getElementType()) {
			return getGEFWrapper(new DateRecognizerCreateCommand(req));
		}
		if (CrosswalkElementTypes.Text_3005 == req.getElementType()) {
			return getGEFWrapper(new TextCreateCommand(req));
		}
		if (CrosswalkElementTypes.TrimWhitespace_3006 == req.getElementType()) {
			return getGEFWrapper(new TrimWhitespaceCreateCommand(req));
		}
		if (CrosswalkElementTypes.MappedElement_3007 == req.getElementType()) {
			return getGEFWrapper(new MappedElementCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
