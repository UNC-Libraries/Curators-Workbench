package crosswalk.diagram.sheet;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

import crosswalk.provider.HelpfulItemPropertyDescriptor;

public class HelpfulPropertySource extends PropertySource implements
		IPropertySource {
	public HelpfulPropertySource(Object object,
			IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
	}
	
	@Override
	protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
		//if (itemPropertyDescriptor instanceof HelpfulItemPropertyDescriptor) {
			return new HelpfulPropertyDescriptor(object, itemPropertyDescriptor);
		//}
		//return super.createPropertyDescriptor(itemPropertyDescriptor);
	}
}
