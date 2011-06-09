package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;

import org.eclipse.jface.viewers.IFilter;

public class DivTypeWithOriginalFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		if (toTest instanceof DivType) {
			DivType d = (DivType) toTest;
			if (d.getCONTENTIDS() != null && d.getCONTENTIDS().size() > 0) {
				return true;
				// String originalUri = d.getCONTENTIDS().get(0);
				// IProject project = MetsProjectNature.getProjectForMetsEObject(d);
			}
		}
		return false;
	}

}
