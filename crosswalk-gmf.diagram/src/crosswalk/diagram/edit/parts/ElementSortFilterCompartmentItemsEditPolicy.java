/**
 * Copyright 2011 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package crosswalk.diagram.edit.parts;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SortFilterCompartmentItemsEditPolicy;
import org.eclipse.gmf.runtime.notation.SortingDirection;

/**
 * @author Gregory Jansen
 *
 */
public class ElementSortFilterCompartmentItemsEditPolicy extends SortFilterCompartmentItemsEditPolicy {
	public static final String SORT_KEY_NODE_TYPE = "Node Type";
	private static Map<String, SortingDirection> orderedSortMap = new LinkedHashMap<String, SortingDirection>();

	static {
		orderedSortMap.put(SORT_KEY_NODE_TYPE, SortingDirection.ASCENDING_LITERAL);
	}
	@Override
	public Map getFilterMap() {
		System.out.println("FILTER MAP WAS REQUESTED!!");
		return orderedSortMap;
	}

	public static final Comparator COMPARATOR_NODE_TYPE = new Comparator() {
		@Override
		public int compare(Object arg0, Object arg1) {
			System.out.println("comparing: "+arg0+" with "+arg1);
			return 0;
		}

	};
}
