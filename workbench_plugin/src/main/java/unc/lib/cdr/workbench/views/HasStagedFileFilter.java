package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;

import org.eclipse.jface.viewers.IFilter;

import unc.lib.cdr.workbench.originals.Original;
import unc.lib.cdr.workbench.originals.OriginalsWrapperStore;
import unc.lib.cdr.workbench.project.MetsProjectNature;

public class HasStagedFileFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		OriginalsWrapperStore original = null;
		if(toTest instanceof OriginalsWrapperStore) {
			original = (OriginalsWrapperStore)toTest;
		} else if (toTest instanceof DivType) {
			DivType d = (DivType) toTest;
			original = MetsProjectNature.getOriginal(d);
		} else if(toTest instanceof Original) {
			original = ((Original)toTest).getStore();
		}
		return original.getStagingLocatorType() != null;
	}

}
