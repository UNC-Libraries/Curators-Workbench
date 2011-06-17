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
package unc.lib.cdr.workbench.arrange;

import gov.loc.mets.DivType;
import gov.loc.mets.SmLinkType;

import java.text.Collator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

public class ArrangementViewerSorter extends ViewerSorter {

	public ArrangementViewerSorter() {
	}

	public ArrangementViewerSorter(Collator collator) {
		super(collator);
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		if(e1 instanceof SmLinkType) {
			if(e2 instanceof SmLinkType) {
				String pred1 = ((SmLinkType)e1).getArcrole();
				String pred2 = ((SmLinkType)e2).getArcrole();
				return this.getComparator().compare(pred1, pred2);
			} else {
				return -1;
			}
		}
		if(e2 instanceof SmLinkType) {
			return 1;
		}
		if (e1 instanceof DivType && e2 instanceof DivType) {
			DivType d1 = (DivType) e1;
			EObject parent = d1.eContainer();
			if (parent != null && parent instanceof DivType) {
				EList<DivType> divs = ((DivType) parent).getDiv();
				return divs.indexOf(e1) - divs.indexOf(e2);
			}
		}
		return super.compare(viewer, e1, e2);
	}

}
