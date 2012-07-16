package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;

import org.eclipse.jface.viewers.IFilter;

import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.originals.OriginalStub;
import unc.lib.cdr.workbench.project.MetsProjectNature;

public class HasOriginalFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		if(toTest instanceof OriginalFileStore) {
			return true;
		} else if (toTest instanceof DivType) {
			DivType d = (DivType) toTest;
			OriginalFileStore s = MetsProjectNature.getOriginal(d);
			return s != null;
		} else if(toTest instanceof OriginalStub) {
			return true;
		}
		return false;
	}

}
