/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.sheet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;

import crosswalk.diagram.navigator.CrosswalkNavigatorGroup;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class CrosswalkSheetLabelProvider extends BaseLabelProvider implements ILabelProvider {

    /**
     * @generated
     */
    public String getText(Object element) {
	element = unwrap(element);
	if (element instanceof CrosswalkNavigatorGroup) {
	    return ((CrosswalkNavigatorGroup) element).getGroupName();
	}
	IElementType etype = getElementType(getView(element));
	return etype == null ? "" : etype.getDisplayName();
    }

    /**
     * @generated
     */
    public Image getImage(Object element) {
	IElementType etype = getElementType(getView(unwrap(element)));
	return etype == null ? null : CrosswalkElementTypes.getImage(etype);
    }

    /**
     * @generated
     */
    private Object unwrap(Object element) {
	if (element instanceof IStructuredSelection) {
	    return ((IStructuredSelection) element).getFirstElement();
	}
	return element;
    }

    /**
     * @generated
     */
    private View getView(Object element) {
	if (element instanceof View) {
	    return (View) element;
	}
	if (element instanceof IAdaptable) {
	    return (View) ((IAdaptable) element).getAdapter(View.class);
	}
	return null;
    }

    /**
     * @generated
     */
    private IElementType getElementType(View view) {
	// For intermediate views climb up the containment hierarchy to find the one associated with an element type.
	while (view != null) {
	    int vid = CrosswalkVisualIDRegistry.getVisualID(view);
	    IElementType etype = CrosswalkElementTypes.getElementType(vid);
	    if (etype != null) {
		return etype;
	    }
	    view = view.eContainer() instanceof View ? (View) view.eContainer() : null;
	}
	return null;
    }

}
