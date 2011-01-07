package unc.lib.cdr.workbench.rcp;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class ArrangementPerspective implements IPerspectiveFactory {

    @Override
    public void createInitialLayout(IPageLayout layout) {
	// TODO Auto-generated method stub
	PerspectiveTweaks.addMyPerspectiveShortcuts(layout);
    }

}
