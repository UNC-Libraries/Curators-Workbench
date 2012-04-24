package crosswalk.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
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
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import crosswalk.diagram.custom.SpecialCreationEditPolicy;
import crosswalk.diagram.edit.policies.CrossWalk2ItemSemanticEditPolicy;

/**
 * @generated
 */
public class CrossWalk2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2017;

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
	public CrossWalk2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CrossWalk2ItemSemanticEditPolicy());
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
		return primaryShape = new EditableModelFigure();
	}

	/**
	 * @generated
	 */
	public EditableModelFigure getPrimaryShape() {
		return (EditableModelFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CrossWalkModelBoxCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureModelBox();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CrossWalkModelBoxCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CrossWalkModelBoxCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureModelBox();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((CrossWalkModelBoxCompartmentEditPart) childEditPart).getFigure());
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
		if (editPart instanceof CrossWalkModelBoxCompartmentEditPart) {
			return getPrimaryShape().getFigureModelBox();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(1000, 1000);
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
	public class EditableModelFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureModelLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureModelBox;

		/**
		 * @generated
		 */
		public EditableModelFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(1000), getMapMode().DPtoLP(1000)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureModelLabel = new WrappingLabel();
			fFigureModelLabel.setText("this is the model label");

			fFigureModelLabel.setFont(FFIGUREMODELLABEL_FONT);

			GridData constraintFFigureModelLabel = new GridData();
			constraintFFigureModelLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureModelLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureModelLabel.horizontalIndent = 0;
			constraintFFigureModelLabel.horizontalSpan = 1;
			constraintFFigureModelLabel.verticalSpan = 1;
			constraintFFigureModelLabel.grabExcessHorizontalSpace = false;
			constraintFFigureModelLabel.grabExcessVerticalSpace = false;
			this.add(fFigureModelLabel, constraintFFigureModelLabel);

			fFigureModelBox = new RectangleFigure();

			GridData constraintFFigureModelBox = new GridData();
			constraintFFigureModelBox.verticalAlignment = GridData.FILL;
			constraintFFigureModelBox.horizontalAlignment = GridData.FILL;
			constraintFFigureModelBox.horizontalIndent = 0;
			constraintFFigureModelBox.horizontalSpan = 1;
			constraintFFigureModelBox.verticalSpan = 1;
			constraintFFigureModelBox.grabExcessHorizontalSpace = true;
			constraintFFigureModelBox.grabExcessVerticalSpace = true;
			this.add(fFigureModelBox, constraintFFigureModelBox);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureModelLabel() {
			return fFigureModelLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureModelBox() {
			return fFigureModelBox;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREMODELLABEL_FONT = new Font(Display.getCurrent(), Display.getDefault().getSystemFont()
			.getFontData()[0].getName(), 20, SWT.BOLD);

}