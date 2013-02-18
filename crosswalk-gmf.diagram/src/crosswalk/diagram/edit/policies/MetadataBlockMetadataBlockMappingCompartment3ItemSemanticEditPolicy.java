package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.CurrentDateCreateCommand;
import crosswalk.diagram.edit.commands.CurrentUsernameCreateCommand;
import crosswalk.diagram.edit.commands.DateRecognizerCreateCommand;
import crosswalk.diagram.edit.commands.MappedElementCreateCommand;
import crosswalk.diagram.edit.commands.TextCreateCommand;
import crosswalk.diagram.edit.commands.TrimWhitespaceCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MetadataBlockMetadataBlockMappingCompartment3ItemSemanticEditPolicy
		extends CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MetadataBlockMetadataBlockMappingCompartment3ItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.MetadataBlock_3019);
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
		if (CrosswalkElementTypes.CurrentDate_3021 == req.getElementType()) {
			return getGEFWrapper(new CurrentDateCreateCommand(req));
		}
		if (CrosswalkElementTypes.CurrentUsername_3022 == req.getElementType()) {
			return getGEFWrapper(new CurrentUsernameCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
