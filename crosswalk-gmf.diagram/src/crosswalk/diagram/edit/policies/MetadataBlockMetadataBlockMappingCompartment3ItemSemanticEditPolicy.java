package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.DateRecognizer2CreateCommand;
import crosswalk.diagram.edit.commands.MappedElement3CreateCommand;
import crosswalk.diagram.edit.commands.OriginalNameRecordMatcher2CreateCommand;
import crosswalk.diagram.edit.commands.Text2CreateCommand;
import crosswalk.diagram.edit.commands.TrimWhitespace2CreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MetadataBlockMetadataBlockMappingCompartment3ItemSemanticEditPolicy extends
		CrosswalkBaseItemSemanticEditPolicy {

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
		if (CrosswalkElementTypes.OriginalNameRecordMatcher_3011 == req.getElementType()) {
			return getGEFWrapper(new OriginalNameRecordMatcher2CreateCommand(req));
		}
		if (CrosswalkElementTypes.DateRecognizer_3012 == req.getElementType()) {
			return getGEFWrapper(new DateRecognizer2CreateCommand(req));
		}
		if (CrosswalkElementTypes.Text_3013 == req.getElementType()) {
			return getGEFWrapper(new Text2CreateCommand(req));
		}
		if (CrosswalkElementTypes.TrimWhitespace_3014 == req.getElementType()) {
			return getGEFWrapper(new TrimWhitespace2CreateCommand(req));
		}
		if (CrosswalkElementTypes.MappedElement_3015 == req.getElementType()) {
			return getGEFWrapper(new MappedElement3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
