package unc.lib.cdr.workbench.views;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IFilter;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class HasMetsProjectNatureFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		if(toTest instanceof IProject) {
			IProject test = (IProject)toTest;
			try {
				return (test.isOpen() && test.hasNature(MetsProjectNature.NATURE_ID));
			} catch (CoreException e) {
				return false;
			}
		}
		return false;
	}

}
