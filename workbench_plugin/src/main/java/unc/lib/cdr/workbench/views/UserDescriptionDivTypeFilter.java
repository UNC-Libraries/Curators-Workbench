package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.util.METSConstants;

import org.eclipse.jface.viewers.IFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDescriptionDivTypeFilter implements IFilter {

    @SuppressWarnings("unused")
    private static final Logger LOG = LoggerFactory.getLogger(UserDescriptionDivTypeFilter.class);

    @Override
    public boolean select(Object toTest) {
	if (toTest instanceof DivType) {
	    DivType d = (DivType) toTest;
	    for (MdSecType md : d.getDmdSec()) {
		if (METSConstants.MD_STATUS_USER_EDITED.equals(md.getSTATUS())) {
		    // LOG.debug("found a user description");
		    return true;
		}
	    }
	}
	return false;
    }

}
