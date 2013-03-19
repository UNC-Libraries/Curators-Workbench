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
