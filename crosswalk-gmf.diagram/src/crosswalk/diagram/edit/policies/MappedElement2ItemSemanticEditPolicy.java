/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MappedElement2ItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public MappedElement2ItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.MappedElement_3015);
    }

    /**
     * @generated
     */
    protected Command getDestroyElementCommand(DestroyElementRequest req) {
	View view = (View) getHost().getModel();
	CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
	cmd.setTransactionNestingEnabled(false);
	EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
	if (annotation == null) {
	    // there are indirectly referenced children, need extra commands: false
	    addDestroyShortcutsCommand(cmd, view);
	    // delete host element
	    cmd.add(new DestroyElementCommand(req));
	} else {
	    cmd.add(new DeleteCommand(getEditingDomain(), view));
	}
	return getGEFWrapper(cmd.reduce());
    }

}
