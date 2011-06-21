package unc.lib.cdr.workbench.project;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;

public class ProjectPropertyTester extends PropertyTester {

	public ProjectPropertyTester() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		try {
			if (receiver instanceof IProject) {
				IProject project = (IProject) receiver;
				if ("open".equals(property)) {
					return project.isOpen();
				} else if ("closed".equals(property)) {
					return !project.isOpen();
				}
			} else {
				return false;
			}
		} catch (Exception e) {
		}
		return false;
	}

}
