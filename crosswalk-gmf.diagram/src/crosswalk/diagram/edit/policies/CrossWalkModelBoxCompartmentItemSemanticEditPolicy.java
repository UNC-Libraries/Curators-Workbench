package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.DateRecognizerCreateCommand;
import crosswalk.diagram.edit.commands.DelimitedFileCreateCommand;
import crosswalk.diagram.edit.commands.MappedElementCreateCommand;
import crosswalk.diagram.edit.commands.MetadataBlock2CreateCommand;
import crosswalk.diagram.edit.commands.OriginalNameRecordMatcherCreateCommand;
import crosswalk.diagram.edit.commands.TextCreateCommand;
import crosswalk.diagram.edit.commands.TrimWhitespaceCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class CrossWalkModelBoxCompartmentItemSemanticEditPolicy extends
		CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CrossWalkModelBoxCompartmentItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.CrossWalk_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrosswalkElementTypes.DelimitedFile_3001 == req.getElementType()) {
			return getGEFWrapper(new DelimitedFileCreateCommand(req));
		}
		if (CrosswalkElementTypes.OriginalNameRecordMatcher_3003 == req
				.getElementType()) {
			return getGEFWrapper(new OriginalNameRecordMatcherCreateCommand(req));
		}
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
		if (CrosswalkElementTypes.MetadataBlock_3018 == req.getElementType()) {
			return getGEFWrapper(new MetadataBlock2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
