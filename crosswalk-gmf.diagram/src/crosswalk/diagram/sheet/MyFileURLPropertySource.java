package crosswalk.diagram.sheet;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

import crosswalk.provider.MyFileURLItemPropertyDescriptor;

public class MyFileURLPropertySource extends PropertySource implements
		IPropertySource {

	public MyFileURLPropertySource(Object object,
			IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
	}
	
	@Override
	protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
		if (itemPropertyDescriptor instanceof MyFileURLItemPropertyDescriptor) {
			return new MyFileURLPropertyDescriptor(object, itemPropertyDescriptor);
		}
		return super.createPropertyDescriptor(itemPropertyDescriptor);
	}

}
