package gov.loc.mets.util;

import gov.loc.mets.DivType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Accepts lists where all members are children of the same aggregate. List may also include that parent aggregate.
 * whose parents are an aggregate.
 * 
 * @param list
 * @return a list of potential links
 * @author count0
 */
public class AggregateRoleLinkTester implements LinkTester {
	private String roleURI = null;
	
	public AggregateRoleLinkTester(String uri) {
		this.roleURI = uri;
	}

	@Override
	public Collection<DivType[]> potentialLinks(List list) {
		DivType passedInAggregate = null;
		DivType impliedParentAggregate = null;
		for (Object o : list) {
			DivType d = (DivType) o;
			if(METSConstants.Div_AggregateWork.equals(d.getTYPE())) {
				if(passedInAggregate != null) return Collections.EMPTY_LIST;
				passedInAggregate = d;
			} else {
				if(DivType.class.isInstance(d.eContainer())) {
					DivType parent = (DivType)d.eContainer();
					if(METSConstants.Div_AggregateWork.equals(parent.getTYPE())) {
						if(impliedParentAggregate != null) {
							if(!impliedParentAggregate.equals(parent)) return Collections.EMPTY_LIST;
						} else {
							impliedParentAggregate = parent;
						}
					} else {
						return Collections.EMPTY_LIST;
					}
				}
			}
		}
		if(passedInAggregate != null && !passedInAggregate.equals(impliedParentAggregate)) {
			return Collections.EMPTY_LIST;
		}
		ArrayList<DivType[]> result = new ArrayList<DivType[]>();
		for(Object o : list) {
			if(impliedParentAggregate.equals(o)) continue;
			if(METSUtils.findLink(impliedParentAggregate, this.roleURI, (DivType)o) != null) {
				continue; // link exists
			}
			result.add(new DivType[] {impliedParentAggregate, (DivType)o} );
		}	
		return result;
	}

}
