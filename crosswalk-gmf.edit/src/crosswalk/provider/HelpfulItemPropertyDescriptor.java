package crosswalk.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

public class HelpfulItemPropertyDescriptor extends ItemPropertyDescriptor {
	AdapterFactory adapter = null;
	Object object = null;

	public HelpfulItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			String category) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, false, true, null, category, null);
	}
}
