package unc.lib.cdr.workbench.capture;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IResource;

public class PropertyTesterTopFolderName extends PropertyTester {

	public PropertyTesterTopFolderName() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		try {
			if (receiver instanceof IResource && "folderName".equals(property)) {
				IResource r = (IResource) receiver;
				return expectedValue.equals(r.getProjectRelativePath().segments()[0]);
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

}
