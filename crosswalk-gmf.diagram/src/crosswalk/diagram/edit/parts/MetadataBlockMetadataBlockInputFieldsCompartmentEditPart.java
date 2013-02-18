package crosswalk.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.CrosswalkPackage;
import crosswalk.diagram.custom.CompartmentChildCreationEditPolicy;
import crosswalk.diagram.custom.ReorderCompartmentEditPolicy;
import crosswalk.diagram.edit.policies.MetadataBlockMetadataBlockInputFieldsCompartmentCanonicalEditPolicy;
import crosswalk.diagram.edit.policies.MetadataBlockMetadataBlockInputFieldsCompartmentItemSemanticEditPolicy;
import crosswalk.diagram.part.Messages;

/**
 * @generated
 */
public class MetadataBlockMetadataBlockInputFieldsCompartmentEditPart extends
		ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7006;

	/**
	 * @generated
	 */
	public MetadataBlockMetadataBlockInputFieldsCompartmentEditPart(View view) {
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
		return Messages.MetadataBlockMetadataBlockInputFieldsCompartmentEditPart_title;
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new MetadataBlockMetadataBlockInputFieldsCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CompartmentChildCreationEditPolicy());
		installEditPolicy(
				EditPolicy.LAYOUT_ROLE,
				new ReorderCompartmentEditPolicy(
						CrosswalkPackage.Literals.METADATA_BLOCK__PORTS));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new MetadataBlockMetadataBlockInputFieldsCompartmentCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}
	
	/**
	 * @generated NOT
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		FlowLayout layout = new FlowLayout();
		layout.setMajorSpacing(getMapMode().DPtoLP(5));
		layout.setMinorSpacing(getMapMode().DPtoLP(5));
		layout.setHorizontal(false);

		result.getContentPane().setLayoutManager(layout);
		result.setTitleVisibility(false);
		return result;
	}

}
