package crosswalk.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import crosswalk.DateInputField;
import crosswalk.MappedAttribute;
import crosswalk.diagram.edit.policies.DateInputFieldItemSemanticEditPolicy;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class DateInputFieldEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3024;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public DateInputFieldEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DateInputFieldItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new InputFieldFigure();
	}

	/**
	 * @generated
	 */
	public InputFieldFigure getPrimaryShape() {
		return (InputFieldFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DateInputFieldLabelEditPart) {
			((DateInputFieldLabelEditPart) childEditPart).setLabel(getPrimaryShape().getFigureInputFieldLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DateInputFieldLabelEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof DateInputField) {
			getPrimaryShape().updateFace();
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(CrosswalkVisualIDRegistry.getType(DateInputFieldLabelEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CrosswalkElementTypes.InputOutput_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TabbedDataFieldEditPart) {
			types.add(CrosswalkElementTypes.InputOutput_4001);
		}
		if (targetEditPart instanceof DateRecognizerEditPart) {
			types.add(CrosswalkElementTypes.InputOutput_4001);
		}
		if (targetEditPart instanceof TextEditPart) {
			types.add(CrosswalkElementTypes.InputOutput_4001);
		}
		if (targetEditPart instanceof TrimWhitespaceEditPart) {
			types.add(CrosswalkElementTypes.InputOutput_4001);
		}
		if (targetEditPart instanceof TextInputFieldEditPart) {
			types.add(CrosswalkElementTypes.InputOutput_4001);
		}
		if (targetEditPart instanceof CurrentDateEditPart) {
			types.add(CrosswalkElementTypes.InputOutput_4001);
		}
		if (targetEditPart instanceof CurrentUsernameEditPart) {
			types.add(CrosswalkElementTypes.InputOutput_4001);
		}
		if (targetEditPart instanceof crosswalk.diagram.edit.parts.DateInputFieldEditPart) {
			types.add(CrosswalkElementTypes.InputOutput_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == CrosswalkElementTypes.InputOutput_4001) {
			types.add(CrosswalkElementTypes.TabbedDataField_3002);
			types.add(CrosswalkElementTypes.DateRecognizer_3004);
			types.add(CrosswalkElementTypes.Text_3005);
			types.add(CrosswalkElementTypes.TrimWhitespace_3006);
			types.add(CrosswalkElementTypes.TextInputField_3023);
			types.add(CrosswalkElementTypes.CurrentDate_3021);
			types.add(CrosswalkElementTypes.CurrentUsername_3022);
			types.add(CrosswalkElementTypes.DateInputField_3024);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CrosswalkElementTypes.InputOutput_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == CrosswalkElementTypes.InputOutput_4001) {
			types.add(CrosswalkElementTypes.OriginalNameRecordMatcher_3003);
			types.add(CrosswalkElementTypes.DateRecognizer_3004);
			types.add(CrosswalkElementTypes.TrimWhitespace_3006);
			types.add(CrosswalkElementTypes.MappedAttribute_3009);
			types.add(CrosswalkElementTypes.TextInputField_3023);
			types.add(CrosswalkElementTypes.DateInputField_3024);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class InputFieldFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInputFieldLabel;
		/**
		 * @generated
		 */
		private Ellipse fFigureInputFieldEllipsis;

		/**
		 * @generated NOT
		 */
		public InputFieldFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 2;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setOutline(false);
			createContents();
			updateFace();
		}

		public void updateFace() {
			DateInputField att = (DateInputField) ((Node) DateInputFieldEditPart.this.getModel()).getElement();
			Color c = ColorConstants.red;
			if (att.getOutput() != null) {
				c = ColorConstants.darkGreen;
			} else if (att.getEnteredValue() != null) {
				c = ColorConstants.lightGreen;
			} else if (!att.isRequired()) {
				c = ColorConstants.yellow;
			}
			fFigureInputFieldEllipsis.setBackgroundColor(c);
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInputFieldEllipsis = new Ellipse();
			fFigureInputFieldEllipsis.setBackgroundColor(ColorConstants.red);
			fFigureInputFieldEllipsis.setPreferredSize(new Dimension(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10)));
			fFigureInputFieldEllipsis.setMaximumSize(new Dimension(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10)));

			GridData constraintFFigureInputFieldEllipsis = new GridData();
			constraintFFigureInputFieldEllipsis.verticalAlignment = GridData.CENTER;
			constraintFFigureInputFieldEllipsis.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureInputFieldEllipsis.horizontalIndent = 0;
			constraintFFigureInputFieldEllipsis.horizontalSpan = 1;
			constraintFFigureInputFieldEllipsis.verticalSpan = 1;
			constraintFFigureInputFieldEllipsis.grabExcessHorizontalSpace = false;
			constraintFFigureInputFieldEllipsis.grabExcessVerticalSpace = false;
			this.add(fFigureInputFieldEllipsis, constraintFFigureInputFieldEllipsis);

			fFigureInputFieldLabel = new WrappingLabel();
			fFigureInputFieldLabel.setText("input");

			GridData constraintFFigureInputFieldLabel = new GridData();
			constraintFFigureInputFieldLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureInputFieldLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureInputFieldLabel.horizontalIndent = 0;
			constraintFFigureInputFieldLabel.horizontalSpan = 1;
			constraintFFigureInputFieldLabel.verticalSpan = 1;
			constraintFFigureInputFieldLabel.grabExcessHorizontalSpace = false;
			constraintFFigureInputFieldLabel.grabExcessVerticalSpace = false;
			this.add(fFigureInputFieldLabel, constraintFFigureInputFieldLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInputFieldLabel() {
			return fFigureInputFieldLabel;
		}

		/**
		 * @generated
		 */
		public Ellipse getFigureInputFieldEllipsis() {
			return fFigureInputFieldEllipsis;
		}

	}

}
