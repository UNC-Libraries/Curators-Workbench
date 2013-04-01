package unc.lib.cdr.workbench.views;

import gov.loc.mets.MdSecType;

import java.util.ArrayList;
import java.util.List;

public class DescriptionPropertySection extends
		AbstractDivTypeMetadataPropertySection {

	@Override
	List<MdSecType> getMdSecs() {
		List<MdSecType> result = new ArrayList<MdSecType>();
		result.addAll(this.div.getDmdSec());
		return result;
	}

}
