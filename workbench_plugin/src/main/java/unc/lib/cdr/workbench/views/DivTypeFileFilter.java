package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;
import gov.loc.mets.util.METSConstants;

import org.eclipse.jface.viewers.IFilter;

public class DivTypeFileFilter implements IFilter {

    @Override
    public boolean select(Object toTest) {
	if (toTest instanceof DivType) {
	    DivType d = (DivType) toTest;
	    if(METSConstants.Div_File.equals(d.getTYPE())) {
		return true;
		//String originalUri = d.getCONTENTIDS().get(0);
		//IProject project = MetsProjectNature.getProjectForMetsEObject(d);
	    }
	}
	return false;
    }

}
