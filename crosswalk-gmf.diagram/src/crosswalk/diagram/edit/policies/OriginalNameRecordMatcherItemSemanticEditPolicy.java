/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.StringInput9EditPart;
import crosswalk.diagram.edit.parts.StringInputInputEditPart;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class OriginalNameRecordMatcherItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public OriginalNameRecordMatcherItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.OriginalNameRecordMatcher_2014);
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
	    addDestroyChildNodesCommand(cmd);
	    addDestroyShortcutsCommand(cmd, view);
	    // delete host element
	    cmd.add(new DestroyElementCommand(req));
	} else {
	    cmd.add(new DeleteCommand(getEditingDomain(), view));
	}
	return getGEFWrapper(cmd.reduce());
    }

    /**
     * @generated
     */
    private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
	View view = (View) getHost().getModel();
	for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
	    Node node = (Node) nit.next();
	    switch (CrosswalkVisualIDRegistry.getVisualID(node)) {
	    case OriginalNameRecordMatcherOutputElementInputsCompartmentEditPart.VISUAL_ID:
		for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
		    Node cnode = (Node) cit.next();
		    switch (CrosswalkVisualIDRegistry.getVisualID(cnode)) {
		    case StringInput9EditPart.VISUAL_ID:
			for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
			    Edge outgoingLink = (Edge) it.next();
			    if (CrosswalkVisualIDRegistry.getVisualID(outgoingLink) == StringInputInputEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource()
						.getElement(), null, outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			    }
			}
			cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode
					.getElement(), false))); // directlyOwned: true
			// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
			// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
			break;
		    }
		}
		break;
	    }
	}
    }

}
