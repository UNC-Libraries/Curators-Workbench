package unc.lib.cdr.workbench.stage;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class StagedResourcesDecorator implements ILightweightLabelDecorator {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
	}

	@Override
	public void decorate(Object element, IDecoration decoration) {
		if(element instanceof IResource) {
			IResource r = (IResource)element;
			MetsProjectNature n = MetsProjectNature.get(r.getProject());
			if(n != null) {
				if(r.getLocationURI().toASCIIString().equals(n.getStagingBase().toASCIIString())) {
					decoration.addSuffix(" [project staging]");
				}
			}
		}

	}

}
