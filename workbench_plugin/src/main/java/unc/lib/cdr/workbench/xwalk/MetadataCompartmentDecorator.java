package unc.lib.cdr.workbench.xwalk;

import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;


public class MetadataCompartmentDecorator implements ILightweightLabelDecorator {

	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return true;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
	}

	@Override
	public void decorate(Object element, IDecoration decoration) {
		if(element instanceof MetadataCompartment) {
			MetadataCompartment mc = (MetadataCompartment)element;
			decoration.addSuffix("  "+mc.metadataSections.size()+" records");
		}
	}

}
