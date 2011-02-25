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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import crosswalk.diagram.edit.policies.CrosswalkTextSelectionEditPolicy;
import crosswalk.diagram.edit.policies.DateRecognizerItemSemanticEditPolicy;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class DateRecognizerEditPart extends ShapeNodeEditPart {

    /**
     * @generated
     */
    public static final int VISUAL_ID = 2013;

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
    public DateRecognizerEditPart(View view) {
	super(view);
    }

    /**
     * @generated
     */
    protected void createDefaultEditPolicies() {
	installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
	super.createDefaultEditPolicies();
	installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DateRecognizerItemSemanticEditPolicy());
	installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
	// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
	// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
    }

    /**
     * @generated
     */
    protected LayoutEditPolicy createLayoutEditPolicy() {

	FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

	    protected Command createAddCommand(EditPart child, EditPart after) {
		return null;
	    }

	    protected Command createMoveChildCommand(EditPart child, EditPart after) {
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
	return primaryShape = new RoundedOutputElementFigure();
    }

    /**
     * @generated
     */
    public RoundedOutputElementFigure getPrimaryShape() {
	return (RoundedOutputElementFigure) primaryShape;
    }

    /**
     * @generated
     */
    protected boolean addFixedChild(EditPart childEditPart) {
	if (childEditPart instanceof WrappingLabel12EditPart) {
	    ((WrappingLabel12EditPart) childEditPart).setLabel(getPrimaryShape().getFigureOutputElementLabelFigure());
	    return true;
	}
	if (childEditPart instanceof DateRecognizerOutputElementInputsCompartmentEditPart) {
	    IFigure pane = getPrimaryShape().getContentPane();
	    setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
	    pane.add(((DateRecognizerOutputElementInputsCompartmentEditPart) childEditPart).getFigure());
	    return true;
	}
	return false;
    }

    /**
     * @generated
     */
    protected boolean removeFixedChild(EditPart childEditPart) {
	if (childEditPart instanceof WrappingLabel12EditPart) {
	    return true;
	}
	if (childEditPart instanceof DateRecognizerOutputElementInputsCompartmentEditPart) {
	    IFigure pane = getPrimaryShape().getContentPane();
	    setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
	    pane.remove(((DateRecognizerOutputElementInputsCompartmentEditPart) childEditPart).getFigure());
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
	if (editPart instanceof DateRecognizerOutputElementInputsCompartmentEditPart) {
	    return getPrimaryShape().getContentPane();
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
	return getChildBySemanticHint(CrosswalkVisualIDRegistry.getType(WrappingLabel12EditPart.VISUAL_ID));
    }

    /**
     * @generated
     */
    public List<IElementType> getMARelTypesOnTarget() {
	ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	types.add(CrosswalkElementTypes.DateInputInput_4002);
	return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMATypesForSource(IElementType relationshipType) {
	LinkedList<IElementType> types = new LinkedList<IElementType>();
	if (relationshipType == CrosswalkElementTypes.DateInputInput_4002) {
	    types.add(CrosswalkElementTypes.DateInput_3011);
	}
	return types;
    }

    /**
     * @generated
     */
    public EditPart getTargetEditPart(Request request) {
	if (request instanceof CreateViewAndElementRequest) {
	    CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
			    .getCreateElementRequestAdapter();
	    IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
	    if (type == CrosswalkElementTypes.StringInput_3013) {
		return getChildBySemanticHint(CrosswalkVisualIDRegistry
				.getType(DateRecognizerOutputElementInputsCompartmentEditPart.VISUAL_ID));
	    }
	}
	return super.getTargetEditPart(request);
    }

    /**
     * @generated
     */
    public class RoundedOutputElementFigure extends RoundedRectangle {

	/**
	 * @generated
	 */
	private RectangleFigure fContentPane;
	/**
	 * @generated
	 */
	private WrappingLabel fFigureOutputElementLabelFigure;

	/**
	 * @generated
	 */
	public RoundedOutputElementFigure() {

	    FlowLayout layoutThis = new FlowLayout();
	    layoutThis.setStretchMinorAxis(false);
	    layoutThis.setMinorAlignment(FlowLayout.ALIGN_CENTER);

	    layoutThis.setMajorAlignment(FlowLayout.ALIGN_CENTER);
	    layoutThis.setMajorSpacing(5);
	    layoutThis.setMinorSpacing(5);
	    layoutThis.setHorizontal(false);

	    this.setLayoutManager(layoutThis);

	    this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(20), getMapMode().DPtoLP(20)));

	    this.setBorder(new MarginBorder(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10), getMapMode().DPtoLP(10),
			    getMapMode().DPtoLP(10)));
	    createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

	    fFigureOutputElementLabelFigure = new WrappingLabel();
	    fFigureOutputElementLabelFigure.setText("Unknown MODS Element");

	    this.add(fFigureOutputElementLabelFigure);

	    fContentPane = new RectangleFigure();
	    fContentPane.setOutline(false);

	    this.add(fContentPane);

	    ToolbarLayout layoutFContentPane = new ToolbarLayout();
	    layoutFContentPane.setStretchMinorAxis(false);
	    layoutFContentPane.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

	    layoutFContentPane.setSpacing(2);
	    layoutFContentPane.setVertical(true);

	    fContentPane.setLayoutManager(layoutFContentPane);

	}

	/**
	 * @generated
	 */
	public RectangleFigure getContentPane() {
	    return fContentPane;
	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureOutputElementLabelFigure() {
	    return fFigureOutputElementLabelFigure;
	}

    }

}
