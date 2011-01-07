/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import crosswalk.diagram.part.CrosswalkVisualIDRegistry;

/**
 * @generated
 */
public class CrosswalkNavigatorSorter extends ViewerSorter {

    /**
     * @generated
     */
    private static final int GROUP_CATEGORY = 7016;

    /**
     * @generated
     */
    public int category(Object element) {
	if (element instanceof CrosswalkNavigatorItem) {
	    CrosswalkNavigatorItem item = (CrosswalkNavigatorItem) element;
	    return CrosswalkVisualIDRegistry.getVisualID(item.getView());
	}
	return GROUP_CATEGORY;
    }

}
