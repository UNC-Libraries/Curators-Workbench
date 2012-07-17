package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;

import org.eclipse.jface.viewers.IFilter;

public class HasDescriptionsDivTypeFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		if (toTest instanceof DivType) {
			DivType d = (DivType) toTest;
			return (d.getDmdSec() != null && d.getDmdSec().size() > 0);
		}
		return false;
	}

}
