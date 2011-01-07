/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.diagram.edit.policies.SubjectOutputElementInputsCompartmentCanonicalEditPolicy;
import crosswalk.diagram.edit.policies.SubjectOutputElementInputsCompartmentItemSemanticEditPolicy;
import crosswalk.diagram.part.Messages;

/**
 * @generated
 */
public class SubjectOutputElementInputsCompartmentEditPart extends ListCompartmentEditPart {

    /**
     * @generated
     */
    public static final int VISUAL_ID = 7007;

    /**
     * @generated
     */
    public SubjectOutputElementInputsCompartmentEditPart(View view) {
	super(view);
    }

    /**
     * @generated
     */
    protected boolean hasModelChildrenChanged(Notification evt) {
	return false;
    }

    /**
     * @generated
     */
    public String getCompartmentName() {
	return Messages.SubjectOutputElementInputsCompartmentEditPart_title;
    }

    /**
     * @generated
     */
    public IFigure createFigure() {
	ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
	result.setTitleVisibility(false);
	return result;
    }

    /**
     * @generated
     */
    protected void createDefaultEditPolicies() {
	super.createDefaultEditPolicies();
	installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
			new SubjectOutputElementInputsCompartmentItemSemanticEditPolicy());
	installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
	installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
	installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
			new SubjectOutputElementInputsCompartmentCanonicalEditPolicy());
    }

    /**
     * @generated
     */
    protected void setRatio(Double ratio) {
	// nothing to do -- parent layout does not accept Double constraints as ratio
	// super.setRatio(ratio); 
    }

}
