/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.diagram.edit.policies.CrossWalkCanonicalEditPolicy;
import crosswalk.diagram.edit.policies.CrossWalkItemSemanticEditPolicy;

/**
 * @generated
 */
public class CrossWalkEditPart extends DiagramEditPart {

    /**
     * @generated
     */
    public final static String MODEL_ID = "Crosswalk"; //$NON-NLS-1$

    /**
     * @generated
     */
    public static final int VISUAL_ID = 1000;

    /**
     * @generated
     */
    public CrossWalkEditPart(View view) {
	super(view);
    }

    /**
     * @generated
     */
    protected void createDefaultEditPolicies() {
	super.createDefaultEditPolicies();
	installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CrossWalkItemSemanticEditPolicy());
	installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new CrossWalkCanonicalEditPolicy());
	// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
    }

    /**
     * @generated
     */
    /*package-local*/static class NodeLabelDragPolicy extends NonResizableEditPolicy {

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected List createSelectionHandles() {
	    MoveHandle h = new MoveHandle((GraphicalEditPart) getHost());
	    h.setBorder(null);
	    return Collections.singletonList(h);
	}

	/**
	 * @generated
	 */
	public Command getCommand(Request request) {
	    return null;
	}

	/**
	 * @generated
	 */
	public boolean understandsRequest(Request request) {
	    return false;
	}
    }

}
