package crosswalk.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import crosswalk.diagram.edit.commands.CrossWalkCreateCommand;
import crosswalk.diagram.edit.commands.DictionaryCreateCommand;
import crosswalk.diagram.edit.commands.FormCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class EditingContainerItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EditingContainerItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.EditingContainer_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrosswalkElementTypes.CrossWalk_2001 == req.getElementType()) {
			return getGEFWrapper(new CrossWalkCreateCommand(req));
		}
		if (CrosswalkElementTypes.Dictionary_2002 == req.getElementType()) {
			return getGEFWrapper(new DictionaryCreateCommand(req));
		}
		if (CrosswalkElementTypes.Form_2003 == req.getElementType()) {
			return getGEFWrapper(new FormCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
