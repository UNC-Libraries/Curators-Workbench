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

import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.originals.OriginalStub;
import unc.lib.cdr.workbench.project.MetsProjectNature;

public class HasOriginalFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		if(toTest instanceof OriginalFileStore) {
			return true;
		} else if (toTest instanceof DivType) {
			DivType d = (DivType) toTest;
			OriginalFileStore s = MetsProjectNature.getOriginal(d);
			return s != null;
		} else if(toTest instanceof OriginalStub) {
			return true;
		}
		return false;
	}

}
