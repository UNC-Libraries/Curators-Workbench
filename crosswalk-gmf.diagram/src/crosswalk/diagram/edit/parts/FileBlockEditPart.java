package crosswalk.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
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
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import crosswalk.FileBlock;
import crosswalk.diagram.edit.policies.FileBlockItemSemanticEditPolicy;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;

/**
 * @generated
 */
public class FileBlockEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3025;

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
	public FileBlockEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new FileBlockItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof FileBlock) {
			getPrimaryShape().updateFace();
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
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
		return primaryShape = new FileBlockFigure();
	}

	/**
	 * @generated
	 */
	public FileBlockFigure getPrimaryShape() {
		return (FileBlockFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FileBlockNameEditPart) {
			((FileBlockNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureFileBlockNameLabel());
			return true;
		}
		if (childEditPart instanceof FileBlockDescriptionEditPart) {
			((FileBlockDescriptionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFileBlockDescriptionLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FileBlockNameEditPart) {
			return true;
		}
		if (childEditPart instanceof FileBlockDescriptionEditPart) {
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
		return getChildBySemanticHint(CrosswalkVisualIDRegistry
				.getType(FileBlockNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class FileBlockFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFileBlockNameLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFileBlockDescriptionLabel;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFileBlockRequiredLabel;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFileBlockDefaultLabel;

		/**
		 * @generated NOT
		 */
		public FileBlockFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 3;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			createContents();
			updateFace();

		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureFileBlockNameLabel = new WrappingLabel();

			fFigureFileBlockNameLabel.setText("");
			fFigureFileBlockNameLabel.setForegroundColor(ColorConstants.black);

			fFigureFileBlockNameLabel.setFont(FFIGUREFILEBLOCKNAMELABEL_FONT);

			GridData constraintFFigureFileBlockNameLabel = new GridData();
			constraintFFigureFileBlockNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureFileBlockNameLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureFileBlockNameLabel.horizontalIndent = 0;
			constraintFFigureFileBlockNameLabel.horizontalSpan = 1;
			constraintFFigureFileBlockNameLabel.verticalSpan = 1;
			constraintFFigureFileBlockNameLabel.grabExcessHorizontalSpace = false;
			constraintFFigureFileBlockNameLabel.grabExcessVerticalSpace = false;
			this.add(fFigureFileBlockNameLabel,
					constraintFFigureFileBlockNameLabel);

			fFigureFileBlockRequiredLabel = new WrappingLabel();

			fFigureFileBlockRequiredLabel.setText("required");
			fFigureFileBlockRequiredLabel
					.setForegroundColor(ColorConstants.red);

			fFigureFileBlockRequiredLabel
					.setFont(FFIGUREFILEBLOCKREQUIREDLABEL_FONT);

			GridData constraintFFigureFileBlockRequiredLabel = new GridData();
			constraintFFigureFileBlockRequiredLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureFileBlockRequiredLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureFileBlockRequiredLabel.horizontalIndent = 0;
			constraintFFigureFileBlockRequiredLabel.horizontalSpan = 1;
			constraintFFigureFileBlockRequiredLabel.verticalSpan = 1;
			constraintFFigureFileBlockRequiredLabel.grabExcessHorizontalSpace = false;
			constraintFFigureFileBlockRequiredLabel.grabExcessVerticalSpace = false;
			this.add(fFigureFileBlockRequiredLabel,
					constraintFFigureFileBlockRequiredLabel);

			fFigureFileBlockDefaultLabel = new WrappingLabel();

			fFigureFileBlockDefaultLabel.setText("default access");
			fFigureFileBlockDefaultLabel
					.setForegroundColor(ColorConstants.gray);

			fFigureFileBlockDefaultLabel
					.setFont(FFIGUREFILEBLOCKDEFAULTLABEL_FONT);

			GridData constraintFFigureFileBlockDefaultLabel = new GridData();
			constraintFFigureFileBlockDefaultLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureFileBlockDefaultLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureFileBlockDefaultLabel.horizontalIndent = 0;
			constraintFFigureFileBlockDefaultLabel.horizontalSpan = 1;
			constraintFFigureFileBlockDefaultLabel.verticalSpan = 1;
			constraintFFigureFileBlockDefaultLabel.grabExcessHorizontalSpace = false;
			constraintFFigureFileBlockDefaultLabel.grabExcessVerticalSpace = false;
			this.add(fFigureFileBlockDefaultLabel,
					constraintFFigureFileBlockDefaultLabel);

			fFigureFileBlockDescriptionLabel = new WrappingLabel();

			fFigureFileBlockDescriptionLabel.setText("");

			GridData constraintFFigureFileBlockDescriptionLabel = new GridData();
			constraintFFigureFileBlockDescriptionLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureFileBlockDescriptionLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureFileBlockDescriptionLabel.horizontalIndent = 0;
			constraintFFigureFileBlockDescriptionLabel.horizontalSpan = 3;
			constraintFFigureFileBlockDescriptionLabel.verticalSpan = 1;
			constraintFFigureFileBlockDescriptionLabel.grabExcessHorizontalSpace = false;
			constraintFFigureFileBlockDescriptionLabel.grabExcessVerticalSpace = false;
			this.add(fFigureFileBlockDescriptionLabel,
					constraintFFigureFileBlockDescriptionLabel);

		}

		private void updateFace() {

			FileBlock fileBlock = (FileBlock) ((Node) FileBlockEditPart.this
					.getModel()).getElement();

			// Remove "tag" labels if present

			if (fFigureFileBlockRequiredLabel.getParent() == this)
				this.remove(fFigureFileBlockRequiredLabel);

			if (fFigureFileBlockDefaultLabel.getParent() == this)
				this.remove(fFigureFileBlockDefaultLabel);

			// Add "tag" labels if necessary, right to left

			if (fileBlock.isDefaultAccess())
				this.add(fFigureFileBlockDefaultLabel, 1);

			if (fileBlock.isRequired())
				this.add(fFigureFileBlockRequiredLabel, 1);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFileBlockNameLabel() {
			return fFigureFileBlockNameLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFileBlockDescriptionLabel() {
			return fFigureFileBlockDescriptionLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFileBlockRequiredLabel() {
			return fFigureFileBlockRequiredLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFileBlockDefaultLabel() {
			return fFigureFileBlockDefaultLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREFILEBLOCKNAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 12, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FFIGUREFILEBLOCKREQUIREDLABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 12, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font FFIGUREFILEBLOCKDEFAULTLABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 12, SWT.NORMAL);

}
