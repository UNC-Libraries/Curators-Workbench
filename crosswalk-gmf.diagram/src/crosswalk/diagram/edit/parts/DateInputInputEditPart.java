/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.diagram.edit.policies.DateInputInputItemSemanticEditPolicy;

/**
 * @generated
 */
public class DateInputInputEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

    /**
     * @generated
     */
    public static final int VISUAL_ID = 4010;

    /**
     * @generated
     */
    public DateInputInputEditPart(View view) {
	super(view);
    }

    /**
     * @generated
     */
    protected void createDefaultEditPolicies() {
	super.createDefaultEditPolicies();
	installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DateInputInputItemSemanticEditPolicy());
    }

    /**
     * Creates figure for this edit part.
     * 
     * Body of this method does not depend on settings in generation model
     * so you may safely remove <i>generated</i> tag and modify it.
     * 
     * @generated
     */

    protected Connection createConnectionFigure() {
	return new StringConnectionFigure();
    }

    /**
     * @generated
     */
    public StringConnectionFigure getPrimaryShape() {
	return (StringConnectionFigure) getFigure();
    }

    /**
     * @generated
     */
    public class StringConnectionFigure extends PolylineConnectionEx {

	/**
	 * @generated
	 */
	public StringConnectionFigure() {
	    this.setLineWidth(5);
	    this.setForegroundColor(ColorConstants.green);

	}

    }

}
