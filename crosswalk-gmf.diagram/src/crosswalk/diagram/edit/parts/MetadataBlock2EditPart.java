/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package crosswalk.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
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
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import crosswalk.diagram.edit.policies.MetadataBlock2ItemSemanticEditPolicy;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MetadataBlock2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3018;

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
	public MetadataBlock2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						CrosswalkVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MetadataBlock2ItemSemanticEditPolicy());
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
		if (childEditPart instanceof MetadataBlockName2EditPart) {
			((MetadataBlockName2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMetadataBlockLabelFigure());
			return true;
		}
		if (childEditPart instanceof MetadataBlockMetadataBlockInputFieldsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureMetadataBlockInputFieldsPane();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((MetadataBlockMetadataBlockInputFieldsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof MetadataBlockMetadataBlockMappingCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureMetadataBlockMapping();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((MetadataBlockMetadataBlockMappingCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MetadataBlockName2EditPart) {
			return true;
		}
		if (childEditPart instanceof MetadataBlockMetadataBlockInputFieldsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureMetadataBlockInputFieldsPane();
			pane.remove(((MetadataBlockMetadataBlockInputFieldsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof MetadataBlockMetadataBlockMappingCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureMetadataBlockMapping();
			pane.remove(((MetadataBlockMetadataBlockMappingCompartment2EditPart) childEditPart)
					.getFigure());
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
		if (editPart instanceof MetadataBlockMetadataBlockInputFieldsCompartment2EditPart) {
			return getPrimaryShape().getFigureMetadataBlockInputFieldsPane();
		}
		if (editPart instanceof MetadataBlockMetadataBlockMappingCompartment2EditPart) {
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
		return getChildBySemanticHint(CrosswalkVisualIDRegistry
				.getType(MetadataBlockName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == CrosswalkElementTypes.TextInputField_3023) {
				return getChildBySemanticHint(CrosswalkVisualIDRegistry
						.getType(MetadataBlockMetadataBlockInputFieldsCompartment2EditPart.VISUAL_ID));
			}
			if (type == CrosswalkElementTypes.DateInputField_3024) {
				return getChildBySemanticHint(CrosswalkVisualIDRegistry
						.getType(MetadataBlockMetadataBlockInputFieldsCompartment2EditPart.VISUAL_ID));
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

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMetadataBlockLabelFigure = new WrappingLabel();

			fFigureMetadataBlockLabelFigure.setText("Unknown Widget");
			fFigureMetadataBlockLabelFigure
					.setForegroundColor(ColorConstants.darkGray);

			fFigureMetadataBlockLabelFigure
					.setFont(FFIGUREMETADATABLOCKLABELFIGURE_FONT);

			GridData constraintFFigureMetadataBlockLabelFigure = new GridData();
			constraintFFigureMetadataBlockLabelFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureMetadataBlockLabelFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureMetadataBlockLabelFigure.horizontalIndent = 0;
			constraintFFigureMetadataBlockLabelFigure.horizontalSpan = 2;
			constraintFFigureMetadataBlockLabelFigure.verticalSpan = 1;
			constraintFFigureMetadataBlockLabelFigure.grabExcessHorizontalSpace = false;
			constraintFFigureMetadataBlockLabelFigure.grabExcessVerticalSpace = false;
			this.add(fFigureMetadataBlockLabelFigure,
					constraintFFigureMetadataBlockLabelFigure);

			fFigureMetadataBlockInputFieldsPane = new RectangleFigure();

			fFigureMetadataBlockInputFieldsPane.setOutline(false);

			GridData constraintFFigureMetadataBlockInputFieldsPane = new GridData();
			constraintFFigureMetadataBlockInputFieldsPane.verticalAlignment = GridData.CENTER;
			constraintFFigureMetadataBlockInputFieldsPane.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureMetadataBlockInputFieldsPane.horizontalIndent = 0;
			constraintFFigureMetadataBlockInputFieldsPane.horizontalSpan = 1;
			constraintFFigureMetadataBlockInputFieldsPane.verticalSpan = 1;
			constraintFFigureMetadataBlockInputFieldsPane.grabExcessHorizontalSpace = false;
			constraintFFigureMetadataBlockInputFieldsPane.grabExcessVerticalSpace = false;
			this.add(fFigureMetadataBlockInputFieldsPane,
					constraintFFigureMetadataBlockInputFieldsPane);

			FlowLayout layoutFFigureMetadataBlockInputFieldsPane = new FlowLayout();
			layoutFFigureMetadataBlockInputFieldsPane
					.setStretchMinorAxis(false);
			layoutFFigureMetadataBlockInputFieldsPane
					.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutFFigureMetadataBlockInputFieldsPane
					.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFFigureMetadataBlockInputFieldsPane.setMajorSpacing(5);
			layoutFFigureMetadataBlockInputFieldsPane.setMinorSpacing(5);
			layoutFFigureMetadataBlockInputFieldsPane.setHorizontal(false);

			fFigureMetadataBlockInputFieldsPane
					.setLayoutManager(layoutFFigureMetadataBlockInputFieldsPane);

			fFigureMetadataBlockMapping = new RectangleFigure();

			fFigureMetadataBlockMapping.setLineWidth(2);
			fFigureMetadataBlockMapping
					.setBackgroundColor(ColorConstants.lightGray);

			fFigureMetadataBlockMapping.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			fFigureMetadataBlockMapping.setBorder(new LineBorder(null,
					getMapMode().DPtoLP(2)));

			GridData constraintFFigureMetadataBlockMapping = new GridData();
			constraintFFigureMetadataBlockMapping.verticalAlignment = GridData.CENTER;
			constraintFFigureMetadataBlockMapping.horizontalAlignment = GridData.END;
			constraintFFigureMetadataBlockMapping.horizontalIndent = 0;
			constraintFFigureMetadataBlockMapping.horizontalSpan = 1;
			constraintFFigureMetadataBlockMapping.verticalSpan = 1;
			constraintFFigureMetadataBlockMapping.grabExcessHorizontalSpace = false;
			constraintFFigureMetadataBlockMapping.grabExcessVerticalSpace = false;
			this.add(fFigureMetadataBlockMapping,
					constraintFFigureMetadataBlockMapping);

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
	static final Font FFIGUREMETADATABLOCKLABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 12, SWT.BOLD);

}
