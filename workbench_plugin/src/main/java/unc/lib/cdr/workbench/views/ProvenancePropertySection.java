package unc.lib.cdr.workbench.views;

import gov.loc.mets.MdSecType;
import gov.loc.mets.MetsPackage;

import java.util.ArrayList;
import java.util.List;

public class ProvenancePropertySection extends
		AbstractDivTypeMetadataPropertySection {

	@Override
	List<MdSecType> getMdSecs() {
		List<MdSecType> result = new ArrayList<MdSecType>();
		for(MdSecType md : this.div.getMdSec()) {
			if(MetsPackage.eINSTANCE.getAmdSecType_DigiprovMD().equals(md.eContainingFeature())) {
				result.add(md);
			}
		}
		return result;
	}

}
