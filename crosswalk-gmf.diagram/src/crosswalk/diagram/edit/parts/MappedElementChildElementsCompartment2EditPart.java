package crosswalk.diagram.edit.parts;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.dialogs.sortfilter.SortFilterLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SortFilterCompartmentItemsEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SortFilterContentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.Alignment;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.SortingDirection;
import org.eclipse.gmf.runtime.notation.SortingStyle;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.diagram.custom.SpecialCreationEditPolicy;
import crosswalk.diagram.edit.policies.MappedElementChildElementsCompartment2CanonicalEditPolicy;
import crosswalk.diagram.edit.policies.MappedElementChildElementsCompartment2ItemSemanticEditPolicy;
import crosswalk.diagram.part.Messages;

/**
 * @generated
 */
public class MappedElementChildElementsCompartment2EditPart extends ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7016;

	/**
	 * @generated
	 */
	public MappedElementChildElementsCompartment2EditPart(View view) {
		super(view);
	}

	@Override
	protected Comparator getComparator(String name, SortingDirection direction) {
		new Exception("I am here").printStackTrace();
		if(ElementSortFilterCompartmentItemsEditPolicy.SORT_KEY_NODE_TYPE.equals(name)) {
			return ElementSortFilterCompartmentItemsEditPolicy.COMPARATOR_NODE_TYPE;
		} else {
			return super.getComparator(name, direction);
		}
	}

	/**
	 * @generated
	 */
	@Override
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	@Override
	public String getCompartmentName() {
		return Messages.MappedElementChildElementsCompartment2EditPart_title;
	}

	/**
	 * @generated
	 */
	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SORT_FILTER_ROLE, new ElementSortFilterCompartmentItemsEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MappedElementChildElementsCompartment2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new SpecialCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new MappedElementChildElementsCompartment2CanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	@Override
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio);
	}

}
