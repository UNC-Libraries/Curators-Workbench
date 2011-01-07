package unc.lib.cdr.workbench;

import gov.loc.mets.DivType;
import gov.loc.mets.util.METSConstants;

import org.eclipse.core.expressions.PropertyTester;

public class DivPropertyTester extends PropertyTester {
    public static final String IS_CONTAINER_PROPERTY = "isContainer";

    public DivPropertyTester() {
    }

    @Override
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
	if(!(receiver instanceof DivType)) {
	    return false;
	}
	DivType div = (DivType)receiver;
	if(IS_CONTAINER_PROPERTY.equals(property)) {
	    if(METSConstants.Div_Folder.equals(div.getTYPE()) || METSConstants.Div_Disk.equals(div.getTYPE())) {
		return true;
	    }
	}
	return false;
    }

}
