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
package unc.lib.cdr.workbench.views;

import gov.loc.mets.DivType;

import org.eclipse.jface.viewers.IFilter;

public class DivTypeWithOriginalFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		if (toTest instanceof DivType) {
			DivType d = (DivType) toTest;
			if (d.getCONTENTIDS() != null && d.getCONTENTIDS().size() > 0) {
				return true;
				// String originalUri = d.getCONTENTIDS().get(0);
				// IProject project = MetsProjectNature.getProjectForMetsEObject(d);
			}
		}
		return false;
	}

}
