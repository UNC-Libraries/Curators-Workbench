/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
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
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import crosswalk.diagram.edit.policies.CrosswalkTextSelectionEditPolicy;
import crosswalk.diagram.edit.policies.StringInput6ItemSemanticEditPolicy;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class StringInput6EditPart extends ShapeNodeEditPart {

    /**
     * @generated
     */
    public static final int VISUAL_ID = 3014;

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
    public StringInput6EditPart(View view) {
	super(view);
    }

    /**
     * @generated
     */
    protected void createDefaultEditPolicies() {
	super.createDefaultEditPolicies();
	installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StringInput6ItemSemanticEditPolicy());
	installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
	// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
	// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
    }

    /**
     * @generated
     */
    protected LayoutEditPolicy createLayoutEditPolicy() {

	ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

	    protected EditPolicy createChildEditPolicy(EditPart child) {
		if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
		    if (child instanceof ITextAwareEditPart) {
			return new CrosswalkTextSelectionEditPolicy();
		    }
		}
		return super.createChildEditPolicy(child);
	    }
	};
	return lep;
    }

    /**
     * @generated
     */
    protected IFigure createNodeShape() {
	return primaryShape = new StringInputFigure();
    }

    /**
     * @generated
     */
    public StringInputFigure getPrimaryShape() {
	return (StringInputFigure) primaryShape;
    }

    /**
     * @generated
     */
    protected boolean addFixedChild(EditPart childEditPart) {
	if (childEditPart instanceof StringInputName5EditPart) {
	    ((StringInputName5EditPart) childEditPart).setLabel(getPrimaryShape().getFigureInputLabel());
	    return true;
	}
	return false;
    }

    /**
     * @generated
     */
    protected boolean removeFixedChild(EditPart childEditPart) {
	if (childEditPart instanceof StringInputName5EditPart) {
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
	return getChildBySemanticHint(CrosswalkVisualIDRegistry.getType(StringInputName5EditPart.VISUAL_ID));
    }

    /**
     * @generated
     */
    public List<IElementType> getMARelTypesOnSource() {
	ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	types.add(CrosswalkElementTypes.StringInputInput_4009);
	return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
	LinkedList<IElementType> types = new LinkedList<IElementType>();
	if (targetEditPart instanceof TextEditPart) {
	    types.add(CrosswalkElementTypes.StringInputInput_4009);
	}
	if (targetEditPart instanceof TrimWhitespaceEditPart) {
	    types.add(CrosswalkElementTypes.StringInputInput_4009);
	}
	if (targetEditPart instanceof TabbedDataFieldEditPart) {
	    types.add(CrosswalkElementTypes.StringInputInput_4009);
	}
	return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
	LinkedList<IElementType> types = new LinkedList<IElementType>();
	if (relationshipType == CrosswalkElementTypes.StringInputInput_4009) {
	    types.add(CrosswalkElementTypes.Text_2018);
	    types.add(CrosswalkElementTypes.TrimWhitespace_2019);
	    types.add(CrosswalkElementTypes.TabbedDataField_3017);
	}
	return types;
    }

    /**
     * @generated
     */
    public class StringInputFigure extends RectangleFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureInputLabel;

	/**
	 * @generated
	 */
	public StringInputFigure() {

	    ToolbarLayout layoutThis = new ToolbarLayout();
	    layoutThis.setStretchMinorAxis(false);
	    layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

	    layoutThis.setSpacing(5);
	    layoutThis.setVertical(false);

	    this.setLayoutManager(layoutThis);

	    this.setFill(false);
	    this.setOutline(false);
	    this.setMaximumSize(new Dimension(getMapMode().DPtoLP(50), getMapMode().DPtoLP(12)));
	    createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

	    Ellipse stringInputEllipsis0 = new Ellipse();
	    stringInputEllipsis0.setBackgroundColor(ColorConstants.red);
	    stringInputEllipsis0.setPreferredSize(new Dimension(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10)));
	    stringInputEllipsis0.setMaximumSize(new Dimension(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10)));

	    this.add(stringInputEllipsis0);

	    fFigureInputLabel = new WrappingLabel();
	    fFigureInputLabel.setText("input");

	    this.add(fFigureInputLabel);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureInputLabel() {
	    return fFigureInputLabel;
	}

    }

}
