/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CrosswalkNavigatorItem extends CrosswalkAbstractNavigatorItem {

    /**
     * @generated
     */
    static {
	final Class[] supportedTypes = new Class[] { View.class, EObject.class };
	Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

	    public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adaptableObject instanceof crosswalk.diagram.navigator.CrosswalkNavigatorItem
				&& (adapterType == View.class || adapterType == EObject.class)) {
		    return ((crosswalk.diagram.navigator.CrosswalkNavigatorItem) adaptableObject).getView();
		}
		return null;
	    }

	    public Class[] getAdapterList() {
		return supportedTypes;
	    }
	}, crosswalk.diagram.navigator.CrosswalkNavigatorItem.class);
    }

    /**
     * @generated
     */
    private View myView;

    /**
     * @generated
     */
    private boolean myLeaf = false;

    /**
     * @generated
     */
    public CrosswalkNavigatorItem(View view, Object parent, boolean isLeaf) {
	super(parent);
	myView = view;
	myLeaf = isLeaf;
    }

    /**
     * @generated
     */
    public View getView() {
	return myView;
    }

    /**
     * @generated
     */
    public boolean isLeaf() {
	return myLeaf;
    }

    /**
     * @generated
     */
    public boolean equals(Object obj) {
	if (obj instanceof crosswalk.diagram.navigator.CrosswalkNavigatorItem) {
	    return EcoreUtil.getURI(getView()).equals(
			    EcoreUtil.getURI(((crosswalk.diagram.navigator.CrosswalkNavigatorItem) obj).getView()));
	}
	return super.equals(obj);
    }

    /**
     * @generated
     */
    public int hashCode() {
	return EcoreUtil.getURI(getView()).hashCode();
    }

}
