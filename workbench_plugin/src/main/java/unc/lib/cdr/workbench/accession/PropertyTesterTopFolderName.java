package unc.lib.cdr.workbench.accession;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IResource;

public class PropertyTesterTopFolderName extends PropertyTester {

    public PropertyTesterTopFolderName() {
	// TODO Auto-generated constructor stub
    }

    @Override
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
	if (receiver instanceof IResource && "folderName".equals(property)) {
	    IResource r = (IResource) receiver;
	    return expectedValue.equals(r.getProjectRelativePath().segments()[0]);
	} else {
	    return false;
	}
    }

}
