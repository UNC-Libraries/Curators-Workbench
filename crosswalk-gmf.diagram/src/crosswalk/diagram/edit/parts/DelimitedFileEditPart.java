/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import crosswalk.diagram.edit.policies.CrosswalkTextSelectionEditPolicy;
import crosswalk.diagram.edit.policies.DelimitedFileItemSemanticEditPolicy;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class DelimitedFileEditPart extends ShapeNodeEditPart {

    /**
     * @generated
     */
    public static final int VISUAL_ID = 2001;

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
    public DelimitedFileEditPart(View view) {
	super(view);
    }

    /**
     * @generated
     */
    protected void createDefaultEditPolicies() {
	installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
	super.createDefaultEditPolicies();
	installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DelimitedFileItemSemanticEditPolicy());
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
	return primaryShape = new DataSourceFigure();
    }

    /**
     * @generated
     */
    public DataSourceFigure getPrimaryShape() {
	return (DataSourceFigure) primaryShape;
    }

    /**
     * @generated
     */
    protected boolean addFixedChild(EditPart childEditPart) {
	if (childEditPart instanceof DelimitedFileSourceFileEditPart) {
	    ((DelimitedFileSourceFileEditPart) childEditPart).setLabel(getPrimaryShape()
			    .getFigureDataSourceNameFigure());
	    return true;
	}
	if (childEditPart instanceof DelimitedFileDataFieldCompartmentEditPart) {
	    IFigure pane = getPrimaryShape().getFigureFieldCompartmentRect();
	    setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
	    pane.add(((DelimitedFileDataFieldCompartmentEditPart) childEditPart).getFigure());
	    return true;
	}
	return false;
    }

    /**
     * @generated
     */
    protected boolean removeFixedChild(EditPart childEditPart) {
	if (childEditPart instanceof DelimitedFileSourceFileEditPart) {
	    return true;
	}
	if (childEditPart instanceof DelimitedFileDataFieldCompartmentEditPart) {
	    IFigure pane = getPrimaryShape().getFigureFieldCompartmentRect();
	    setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
	    pane.remove(((DelimitedFileDataFieldCompartmentEditPart) childEditPart).getFigure());
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
	if (editPart instanceof DelimitedFileDataFieldCompartmentEditPart) {
	    return getPrimaryShape().getFigureFieldCompartmentRect();
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
	return getChildBySemanticHint(CrosswalkVisualIDRegistry.getType(DelimitedFileSourceFileEditPart.VISUAL_ID));
    }

    /**
     * @generated
     */
    public EditPart getTargetEditPart(Request request) {
	if (request instanceof CreateViewAndElementRequest) {
	    CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
			    .getCreateElementRequestAdapter();
	    IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
	    if (type == CrosswalkElementTypes.TabbedDataField_3001) {
		return getChildBySemanticHint(CrosswalkVisualIDRegistry
				.getType(DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID));
	    }
	}
	return super.getTargetEditPart(request);
    }

    /**
     * @generated
     */
    public class DataSourceFigure extends RectangleFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureDataSourceNameFigure;
	/**
	 * @generated
	 */
	private RectangleFigure fFigureFieldCompartmentRect;

	/**
	 * @generated
	 */
	public DataSourceFigure() {

	    ToolbarLayout layoutThis = new ToolbarLayout();
	    layoutThis.setStretchMinorAxis(false);
	    layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

	    layoutThis.setSpacing(5);
	    layoutThis.setVertical(true);

	    this.setLayoutManager(layoutThis);

	    this.setBorder(new MarginBorder(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10), getMapMode().DPtoLP(10),
			    getMapMode().DPtoLP(10)));
	    createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

	    WrappingLabel l0 = new WrappingLabel();
	    l0.setText("Data Source");

	    this.add(l0);

	    fFigureDataSourceNameFigure = new WrappingLabel();
	    fFigureDataSourceNameFigure.setText("faaa");

	    this.add(fFigureDataSourceNameFigure);

	    fFigureFieldCompartmentRect = new RectangleFigure();
	    fFigureFieldCompartmentRect.setFill(false);
	    fFigureFieldCompartmentRect.setOutline(false);

	    this.add(fFigureFieldCompartmentRect);

	    ToolbarLayout layoutFFigureFieldCompartmentRect = new ToolbarLayout();
	    layoutFFigureFieldCompartmentRect.setStretchMinorAxis(false);
	    layoutFFigureFieldCompartmentRect.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

	    layoutFFigureFieldCompartmentRect.setSpacing(0);
	    layoutFFigureFieldCompartmentRect.setVertical(true);

	    fFigureFieldCompartmentRect.setLayoutManager(layoutFFigureFieldCompartmentRect);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureDataSourceNameFigure() {
	    return fFigureDataSourceNameFigure;
	}

	/**
	 * @generated
	 */
	public RectangleFigure getFigureFieldCompartmentRect() {
	    return fFigureFieldCompartmentRect;
	}

    }

}
