/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

/**
 * @generated
 */
public abstract class CrosswalkAbstractNavigatorItem extends PlatformObject {

    /**
     * @generated
     */
    static {
	final Class[] supportedTypes = new Class[] { ITabbedPropertySheetPageContributor.class };
	final ITabbedPropertySheetPageContributor propertySheetPageContributor = new ITabbedPropertySheetPageContributor() {
	    public String getContributorId() {
		return "crosswalk-gmf.diagram"; //$NON-NLS-1$
	    }
	};
	Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

	    public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adaptableObject instanceof crosswalk.diagram.navigator.CrosswalkAbstractNavigatorItem
				&& adapterType == ITabbedPropertySheetPageContributor.class) {
		    return propertySheetPageContributor;
		}
		return null;
	    }

	    public Class[] getAdapterList() {
		return supportedTypes;
	    }
	}, crosswalk.diagram.navigator.CrosswalkAbstractNavigatorItem.class);
    }

    /**
     * @generated
     */
    private Object myParent;

    /**
     * @generated
     */
    protected CrosswalkAbstractNavigatorItem(Object parent) {
	myParent = parent;
    }

    /**
     * @generated
     */
    public Object getParent() {
	return myParent;
    }

}
