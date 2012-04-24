package crosswalk.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LabeledContainer;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import crosswalk.diagram.custom.SpecialCreationEditPolicy;
import crosswalk.diagram.edit.policies.MetadataBlockItemSemanticEditPolicy;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MetadataBlockEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3010;

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
	public MetadataBlockEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		super.createDefaultEditPolicies();
		//installEditPolicy(EditPolicyRoles.CREATION_ROLE, new SpecialCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new MetadataBlockItemSemanticEditPolicy());
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
		return primaryShape = new MetadataBlockFigure();
	}

	/**
	 * @generated
	 */
	public MetadataBlockFigure getPrimaryShape() {
		return (MetadataBlockFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MetadataBlockNameEditPart) {
			((MetadataBlockNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureMetadataBlockLabelFigure());
			return true;
		}
		if (childEditPart instanceof MetadataBlockMetadataBlockInputFieldsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureMetadataBlockInputFieldsPane();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((MetadataBlockMetadataBlockInputFieldsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof MetadataBlockMetadataBlockMappingCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureMetadataBlockMapping();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((MetadataBlockMetadataBlockMappingCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MetadataBlockNameEditPart) {
			return true;
		}
		if (childEditPart instanceof MetadataBlockMetadataBlockInputFieldsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureMetadataBlockInputFieldsPane();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((MetadataBlockMetadataBlockInputFieldsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof MetadataBlockMetadataBlockMappingCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureMetadataBlockMapping();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((MetadataBlockMetadataBlockMappingCompartmentEditPart) childEditPart).getFigure());
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
		if (editPart instanceof MetadataBlockMetadataBlockInputFieldsCompartmentEditPart) {
			return getPrimaryShape().getFigureMetadataBlockInputFieldsPane();
		}
		if (editPart instanceof MetadataBlockMetadataBlockMappingCompartmentEditPart) {
			return getPrimaryShape().getFigureMetadataBlockMapping();
		}
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
		return getChildBySemanticHint(CrosswalkVisualIDRegistry.getType(MetadataBlockNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == CrosswalkElementTypes.InputField_3017) {
				return getChildBySemanticHint(CrosswalkVisualIDRegistry
						.getType(MetadataBlockMetadataBlockInputFieldsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class MetadataBlockFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMetadataBlockLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureMetadataBlockInputFieldsPane;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureMetadataBlockMapping;

		/**
		 * @generated
		 */
		public MetadataBlockFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 2;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setLineWidth(3);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(0), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMetadataBlockLabelFigure = new WrappingLabel();
			fFigureMetadataBlockLabelFigure.setText("Unknown Widget");
			fFigureMetadataBlockLabelFigure.setForegroundColor(ColorConstants.darkGray);

			fFigureMetadataBlockLabelFigure.setFont(FFIGUREMETADATABLOCKLABELFIGURE_FONT);

			GridData constraintFFigureMetadataBlockLabelFigure = new GridData();
			constraintFFigureMetadataBlockLabelFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureMetadataBlockLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureMetadataBlockLabelFigure.horizontalIndent = 0;
			constraintFFigureMetadataBlockLabelFigure.horizontalSpan = 2;
			constraintFFigureMetadataBlockLabelFigure.verticalSpan = 1;
			constraintFFigureMetadataBlockLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureMetadataBlockLabelFigure.grabExcessVerticalSpace = false;
			this.add(fFigureMetadataBlockLabelFigure, constraintFFigureMetadataBlockLabelFigure);

			fFigureMetadataBlockInputFieldsPane = new RectangleFigure();
			fFigureMetadataBlockInputFieldsPane.setOutline(false);

			GridData constraintFFigureMetadataBlockInputFieldsPane = new GridData();
			constraintFFigureMetadataBlockInputFieldsPane.verticalAlignment = GridData.FILL;
			constraintFFigureMetadataBlockInputFieldsPane.horizontalAlignment = GridData.FILL;
			constraintFFigureMetadataBlockInputFieldsPane.horizontalIndent = -10;
			constraintFFigureMetadataBlockInputFieldsPane.horizontalSpan = 1;
			constraintFFigureMetadataBlockInputFieldsPane.verticalSpan = 1;
			constraintFFigureMetadataBlockInputFieldsPane.grabExcessHorizontalSpace = false;
			constraintFFigureMetadataBlockInputFieldsPane.grabExcessVerticalSpace = false;
			this.add(fFigureMetadataBlockInputFieldsPane, constraintFFigureMetadataBlockInputFieldsPane);

			fFigureMetadataBlockMapping = new RectangleFigure();

			GridData constraintFFigureMetadataBlockMapping = new GridData();
			constraintFFigureMetadataBlockMapping.verticalAlignment = GridData.FILL;
			constraintFFigureMetadataBlockMapping.horizontalAlignment = GridData.FILL;
			constraintFFigureMetadataBlockMapping.horizontalIndent = 0;
			constraintFFigureMetadataBlockMapping.horizontalSpan = 1;
			constraintFFigureMetadataBlockMapping.verticalSpan = 1;
			constraintFFigureMetadataBlockMapping.grabExcessHorizontalSpace = true;
			constraintFFigureMetadataBlockMapping.grabExcessVerticalSpace = true;
			this.add(fFigureMetadataBlockMapping, constraintFFigureMetadataBlockMapping);

			ToolbarLayout layoutFFigureMetadataBlockMapping = new ToolbarLayout();
			layoutFFigureMetadataBlockMapping.setStretchMinorAxis(false);
			layoutFFigureMetadataBlockMapping.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutFFigureMetadataBlockMapping.setSpacing(0);
			layoutFFigureMetadataBlockMapping.setVertical(true);

			fFigureMetadataBlockMapping.setLayoutManager(layoutFFigureMetadataBlockMapping);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMetadataBlockLabelFigure() {
			return fFigureMetadataBlockLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureMetadataBlockInputFieldsPane() {
			return fFigureMetadataBlockInputFieldsPane;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureMetadataBlockMapping() {
			return fFigureMetadataBlockMapping;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREMETADATABLOCKLABELFIGURE_FONT = new Font(Display.getCurrent(), Display.getDefault()
			.getSystemFont().getFontData()[0].getName(), 12, SWT.BOLD);

}