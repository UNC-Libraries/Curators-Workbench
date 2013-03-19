/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
