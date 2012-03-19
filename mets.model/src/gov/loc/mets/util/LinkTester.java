package gov.loc.mets.util;

import gov.loc.mets.DivType;

import java.util.Collection;
import java.util.List;

public interface LinkTester {
	/** Validates that the supplied list can be linked. Returns the list of links implied by the list. The subject DivType object
	 * may or may not be in the supplied list.
	 * @param list a list of DivType objects
	 * @return a collection of the links implied by the list
	 */
	public Collection<DivType[]> potentialLinks(List list);
}
