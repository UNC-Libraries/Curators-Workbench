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
package unc.lib.cdr.workbench.xwalk;

import gov.loc.mets.MdSecType;

import java.text.Collator;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

public class CrosswalkViewerSorter extends ViewerSorter {

	public CrosswalkViewerSorter() {
	}

	public CrosswalkViewerSorter(Collator collator) {
		super(collator);
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		if(e1 instanceof MdSecType) {
			if(e2 instanceof MdSecType) {
				String pred1 = ((MdSecType)e1).getMdWrap().getMDTYPE().getName();
				String pred2 = ((MdSecType)e2).getMdWrap().getMDTYPE().getName();
				return this.getComparator().compare(pred1, pred2);
			} else {
				return -1;
			}
		}
		if(e2 instanceof MdSecType) {
			return 1;
		}
		if (e1 instanceof MetadataCompartment && e2 instanceof MetadataCompartment) {
			MetadataCompartment mc1 = (MetadataCompartment) e1;
			MetadataCompartment mc2 = (MetadataCompartment) e2;
			return mc1.row - mc2.row;
		}
		return super.compare(viewer, e1, e2);
	}
	
}
