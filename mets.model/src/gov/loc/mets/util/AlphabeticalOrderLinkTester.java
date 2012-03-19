package gov.loc.mets.util;

import gov.loc.mets.DivType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Requires all the items to be containers. These are then potentially linked to themselves, i.e. tagged as alphabetical.
 * @author count0
 *
 */
public class AlphabeticalOrderLinkTester implements LinkTester {

	@Override
	public Collection<DivType[]> potentialLinks(List list) {
		ArrayList<DivType[]> result = new ArrayList<DivType[]>();
		for(Object o : list) {
			DivType d = (DivType)o;
			if(!METSUtils.isContainer(d)) return Collections.EMPTY_LIST;
			if(METSUtils.findLink(d, Link.ALPHABETICALORDER.uri, d) != null) {
				continue; // link exists
			}
			result.add(new DivType[] {d, d} );
		}
		return result;
	}

}
