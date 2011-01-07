/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import crosswalk.diagram.edit.policies.TabbedDataFieldItemSemanticEditPolicy;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class TabbedDataFieldEditPart extends ShapeNodeEditPart {

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
    public TabbedDataFieldEditPart(View view) {
	super(view);
    }

    /**
     * @generated
     */
    @Override
    protected void createDefaultEditPolicies() {
	super.createDefaultEditPolicies();
	installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new TabbedDataFieldItemSemanticEditPolicy());
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
	return primaryShape = new DataFieldFigure();
    }

    /**
     * @generated
     */
    public DataFieldFigure getPrimaryShape() {
	return (DataFieldFigure) primaryShape;
    }

    /**
     * @generated
     */
    protected boolean addFixedChild(EditPart childEditPart) {
	if (childEditPart instanceof TabbedDataFieldColumnNumberEditPart) {
	    ((TabbedDataFieldColumnNumberEditPart) childEditPart).setLabel(getPrimaryShape()
			    .getFigureDataFieldValueLabelFigure());
	    return true;
	}
	if (childEditPart instanceof TabbedDataFieldLabelColumnNumberEditPart) {
	    ((TabbedDataFieldLabelColumnNumberEditPart) childEditPart).setLabel(getPrimaryShape()
			    .getFigureDataFieldLabelFigure());
	    return true;
	}
	return false;
    }

    /**
     * @generated
     */
    protected boolean removeFixedChild(EditPart childEditPart) {
	if (childEditPart instanceof TabbedDataFieldColumnNumberEditPart) {
	    return true;
	}
	if (childEditPart instanceof TabbedDataFieldLabelColumnNumberEditPart) {
	    return true;
	}
	return false;
    }

    /**
     * @generated
     */
    @Override
    protected void addChildVisual(EditPart childEditPart, int index) {
	if (addFixedChild(childEditPart)) {
	    return;
	}
	super.addChildVisual(childEditPart, -1);
    }

    /**
     * @generated
     */
    @Override
    protected void removeChildVisual(EditPart childEditPart) {
	if (removeFixedChild(childEditPart)) {
	    return;
	}
	super.removeChildVisual(childEditPart);
    }

    /**
     * @generated
     */
    @Override
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
    @Override
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
    @Override
    public IFigure getContentPane() {
	if (contentPane != null) {
	    return contentPane;
	}
	return super.getContentPane();
    }

    /**
     * @generated
     */
    @Override
    protected void setForegroundColor(Color color) {
	if (primaryShape != null) {
	    primaryShape.setForegroundColor(color);
	}
    }

    /**
     * @generated
     */
    @Override
    protected void setBackgroundColor(Color color) {
	if (primaryShape != null) {
	    primaryShape.setBackgroundColor(color);
	}
    }

    /**
     * @generated
     */
    @Override
    protected void setLineWidth(int width) {
	if (primaryShape instanceof Shape) {
	    ((Shape) primaryShape).setLineWidth(width);
	}
    }

    /**
     * @generated
     */
    @Override
    protected void setLineType(int style) {
	if (primaryShape instanceof Shape) {
	    ((Shape) primaryShape).setLineStyle(style);
	}
    }

    /**
     * @generated
     */
    @Override
    public EditPart getPrimaryChildEditPart() {
	return getChildBySemanticHint(CrosswalkVisualIDRegistry.getType(TabbedDataFieldColumnNumberEditPart.VISUAL_ID));
    }

    /**
     * @generated
     */
    public List<IElementType> getMARelTypesOnTarget() {
	ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	types.add(CrosswalkElementTypes.StringInputInput_4009);
	return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMATypesForSource(IElementType relationshipType) {
	LinkedList<IElementType> types = new LinkedList<IElementType>();
	if (relationshipType == CrosswalkElementTypes.StringInputInput_4009) {
	    types.add(CrosswalkElementTypes.StringInput_3008);
	    types.add(CrosswalkElementTypes.StringInput_3010);
	    types.add(CrosswalkElementTypes.StringInput_3011);
	    types.add(CrosswalkElementTypes.StringInput_3012);
	    types.add(CrosswalkElementTypes.StringInput_3013);
	    types.add(CrosswalkElementTypes.StringInput_3014);
	    types.add(CrosswalkElementTypes.StringInput_3015);
	    types.add(CrosswalkElementTypes.StringInput_3016);
	    types.add(CrosswalkElementTypes.StringInput_3018);
	    types.add(CrosswalkElementTypes.StringInput_3020);
	    types.add(CrosswalkElementTypes.StringInput_3021);
	    types.add(CrosswalkElementTypes.StringInput_3022);
	}
	return types;
    }

    /**
     * @generated
     */
    public class DataFieldFigure extends RectangleFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureDataFieldLabelFigure;

	/**
	 * @generated
	 */
	private WrappingLabel fFigureDataFieldValueLabelFigure;

	/**
	 * @generated
	 */
	public DataFieldFigure() {
	    this.setFill(false);
	    createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

	    fFigureDataFieldLabelFigure = new WrappingLabel();
	    fFigureDataFieldLabelFigure.setText("foo");
	    fFigureDataFieldLabelFigure.setForegroundColor(ColorConstants.darkGray);

	    this.add(fFigureDataFieldLabelFigure);

	    fFigureDataFieldValueLabelFigure = new WrappingLabel();
	    fFigureDataFieldValueLabelFigure.setText("");
	    fFigureDataFieldValueLabelFigure.setForegroundColor(ColorConstants.darkBlue);

	    this.add(fFigureDataFieldValueLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureDataFieldLabelFigure() {
	    return fFigureDataFieldLabelFigure;
	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureDataFieldValueLabelFigure() {
	    return fFigureDataFieldValueLabelFigure;
	}

    }

}
