package unc.lib.cdr.workbench.project;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.variableresolvers.PathVariableResolver;

public class VariableResolver extends PathVariableResolver {

    public VariableResolver() {
    }

    @Override
    public String getValue(String variable, IResource resource) {
	String result = null;
	if("PROJECT_NAME".equals(variable)) {
	    result = resource.getProject().getName();
	}
	return result;
    }

}
