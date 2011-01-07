package unc.lib.cdr.workbench.arrange;

import gov.loc.mets.DivType;

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
	if(e1 instanceof DivType && e2 instanceof DivType) {
	    DivType d1 = (DivType)e1;
	    EObject parent = d1.eContainer();
	    if(parent != null && parent instanceof DivType) {
		EList<DivType> divs = ((DivType)parent).getDiv();
		return divs.indexOf(e1) - divs.indexOf(e2);
	    }
	}
	return super.compare(viewer, e1, e2);
    }


}
