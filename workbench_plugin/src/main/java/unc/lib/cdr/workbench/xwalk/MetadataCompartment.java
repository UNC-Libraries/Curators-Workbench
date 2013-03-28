package unc.lib.cdr.workbench.xwalk;

import gov.loc.mets.MdSecType;

import java.util.ArrayList;
import java.util.List;

public class MetadataCompartment {
	public List<MdSecType> metadataSections = new ArrayList<MdSecType>();
	public String label = null;
	public int row = -1;
	
	public String toString() {
		return "data row "+row;
	}
}