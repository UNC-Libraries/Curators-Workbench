package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;

import org.eclipse.jface.viewers.IFilter;

import unc.lib.cdr.workbench.originals.OriginalStub;
import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.project.MetsProjectNature;

public class HasStagedFileFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		OriginalFileStore original = null;
		if(toTest instanceof OriginalFileStore) {
			original = (OriginalFileStore)toTest;
		} else if (toTest instanceof DivType) {
			DivType d = (DivType) toTest;
			original = MetsProjectNature.getOriginal(d);
		} else if(toTest instanceof OriginalStub) {
			original = ((OriginalStub)toTest).getStore();
		}
		return original == null ? false : original.getStagingLocatorType() != null;
	}

}
