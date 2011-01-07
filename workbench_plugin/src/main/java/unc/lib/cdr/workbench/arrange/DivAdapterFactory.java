package unc.lib.cdr.workbench.arrange;

import gov.loc.mets.DivType;
import gov.loc.mets.util.METSConstants;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdapterFactory;


public class DivAdapterFactory implements IAdapterFactory {
    @SuppressWarnings("rawtypes")
    Class[] adapterTypes = new Class[] { IResource.class };

    @SuppressWarnings("rawtypes")
    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {
	Object result = null;
	if (IResource.class.equals(adapterType)) {
	    if (adaptableObject instanceof DivType) {
		// make a DivType into a IResource.
		DivType d = (DivType) adaptableObject;
		if (d.getCONTENTIDS() != null && d.getCONTENTIDS().size() > 0) {
		    URI loc;
		    try {
			loc = new URI(d.getCONTENTIDS().get(0));
			if (METSConstants.Div_File.equals(d.getTYPE())) {
			    IFile[] files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(loc);
			    if (files.length > 0) {
				result = files[0];
			    }
			} else {
			    IContainer[] cs = ResourcesPlugin.getWorkspace().getRoot()
					    .findContainersForLocationURI(loc);
			    if (cs.length > 0) {
				result = cs[0];
			    }
			}
		    } catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		}
	    }
	}
	return result;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Class[] getAdapterList() {
	return null;
    }

}
