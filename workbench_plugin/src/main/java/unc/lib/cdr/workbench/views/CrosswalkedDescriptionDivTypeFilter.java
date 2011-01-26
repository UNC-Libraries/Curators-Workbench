package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.util.METSConstants;

import org.eclipse.jface.viewers.IFilter;

public class CrosswalkedDescriptionDivTypeFilter implements IFilter {

    @Override
    public boolean select(Object toTest) {
	if (toTest instanceof DivType) {
	    DivType d = (DivType) toTest;
	    if (d.getDMDID() != null) {
		for (String id : d.getDMDID()) {
		    MdSecType md = (MdSecType) d.eResource().getEObject(id);
		    if (METSConstants.MD_STATUS_CROSSWALK_LINKED.equals(md.getSTATUS())) {
			return true;
		    } else if(METSConstants.MD_STATUS_CROSSWALK_USER_LINKED.equals(md.getSTATUS())) {
			return true;
		    }
		}
	    }
	}
	return false;
    }

}
