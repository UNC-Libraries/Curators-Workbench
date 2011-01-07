package unc.lib.cdr.workbench.project;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.model.IWorkbenchAdapter;

import unc.lib.cdr.workbench.accession.OriginalFoldersProjectElement;

@SuppressWarnings("rawtypes")
public class AdapterFactory implements IAdapterFactory {
    private static final Class[] adapters = new Class[] { gov.loc.mets.MetsType.class };

    @SuppressWarnings("unchecked")
    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {
	try {
	    if (adaptableObject instanceof IProject) {
		IProject proj = (IProject) adaptableObject;
		MetsProjectNature metsNature = (MetsProjectNature) proj.getNature(MetsProjectNature.NATURE_ID);
		if (adapterType.isAssignableFrom(gov.loc.mets.MetsType.class)) {
		    return metsNature.getMets();
		} else if(EditingDomain.class.equals(adapterType)) {
		    return metsNature.getEditingDomain();
		}
	    }
	} catch (CoreException e) {
	    return e.getStatus();
	}
	return Status.OK_STATUS;
    }

    @Override
    public Class[] getAdapterList() {
	return adapters;
    }

}
