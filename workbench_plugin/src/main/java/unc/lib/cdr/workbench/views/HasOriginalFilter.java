package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;

import org.eclipse.jface.viewers.IFilter;

import unc.lib.cdr.workbench.originals.Original;
import unc.lib.cdr.workbench.originals.OriginalsWrapperStore;
import unc.lib.cdr.workbench.project.MetsProjectNature;

public class HasOriginalFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		if(toTest instanceof OriginalsWrapperStore) {
			return true;
		} else if (toTest instanceof DivType) {
			DivType d = (DivType) toTest;
			OriginalsWrapperStore s = MetsProjectNature.getOriginal(d);
			return s != null;
		} else if(toTest instanceof Original) {
			return true;
		}
		return false;
	}

}
