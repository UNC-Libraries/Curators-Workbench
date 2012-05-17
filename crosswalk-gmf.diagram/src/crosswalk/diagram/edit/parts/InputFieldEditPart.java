package crosswalk.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import crosswalk.InputField;
import crosswalk.diagram.edit.policies.CrosswalkTextSelectionEditPolicy;
import crosswalk.diagram.edit.policies.InputFieldItemSemanticEditPolicy;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class InputFieldEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3017;

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
	public InputFieldEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new InputFieldItemSemanticEditPolicy());
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

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		if (this.getPrimaryShape().isVisible()) {
			return getNodeFigure().getSourceConnectionAnchorAt(
					getPrimaryShape().getFigureInputFieldEllipsis().getLocation());
		} else {
			return super.getSourceConnectionAnchor(request);
		}
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InputFieldLabelEditPart) {
			((InputFieldLabelEditPart) childEditPart).setLabel(getPrimaryShape().getFigureInputFieldLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InputFieldLabelEditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(30, 60);
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
		return getChildBySemanticHint(CrosswalkVisualIDRegistry.getType(InputFieldLabelEditPart.VISUAL_ID));
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
		if (targetEditPart instanceof DateRecognizer2EditPart) {
			types.add(CrosswalkElementTypes.InputOutput_4001);
		}
		if (targetEditPart instanceof Text2EditPart) {
			types.add(CrosswalkElementTypes.InputOutput_4001);
		}
		if (targetEditPart instanceof TrimWhitespace2EditPart) {
			types.add(CrosswalkElementTypes.InputOutput_4001);
		}
		if (targetEditPart instanceof crosswalk.diagram.edit.parts.InputFieldEditPart) {
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
			types.add(CrosswalkElementTypes.DateRecognizer_3012);
			types.add(CrosswalkElementTypes.Text_3013);
			types.add(CrosswalkElementTypes.TrimWhitespace_3014);
			types.add(CrosswalkElementTypes.InputField_3017);
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
			types.add(CrosswalkElementTypes.OriginalNameRecordMatcher_3011);
			types.add(CrosswalkElementTypes.DateRecognizer_3012);
			types.add(CrosswalkElementTypes.TrimWhitespace_3014);
			types.add(CrosswalkElementTypes.InputField_3017);
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
		 * @generated
		 */
		public InputFieldFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 2;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureInputFieldEllipsis = new Ellipse();
			fFigureInputFieldEllipsis.setBackgroundColor(ColorConstants.red);
			fFigureInputFieldEllipsis.setPreferredSize(new Dimension(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10)));
			fFigureInputFieldEllipsis.setMaximumSize(new Dimension(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10)));

			this.add(fFigureInputFieldEllipsis);

			fFigureInputFieldLabel = new WrappingLabel();
			fFigureInputFieldLabel.setText("input");

			this.add(fFigureInputFieldLabel);
			updateFace();
		}

		private void updateFace() {
			InputField input = (InputField) ((Node) InputFieldEditPart.this.getModel()).getElement();
			Color c = ColorConstants.red;
			if (input.getOutput() != null) {
				c = ColorConstants.darkGreen;
			} /* TODO inspect model for default and required in mapped attribute
				else if (input.getDefaultValue() != null) {
				c = ColorConstants.lightGreen;
				} else if (!input.isRequired()) {
				c = ColorConstants.yellow;
				} */
			fFigureInputFieldEllipsis.setBackgroundColor(c);
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

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof InputField) {
			getPrimaryShape().updateFace();
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		if (this.getPrimaryShape().isVisible()) {
			return getNodeFigure().getTargetConnectionAnchorAt(
					getPrimaryShape().getFigureInputFieldLabel().getBounds().getRight());
		} else {
			return super.getTargetConnectionAnchor(request);
		}
	}

}
