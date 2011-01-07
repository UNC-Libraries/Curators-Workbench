package unc.lib.cdr.workbench.rcp;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class AccessionPerspective implements IPerspectiveFactory {
    private String navViewID = "cdr-workbench.ProjectNavigator";

	public void createInitialLayout(IPageLayout layout) {
	    String editorArea = layout.getEditorArea();
	    layout.setEditorAreaVisible(true);
	    //layout.setFixed(false);

	    PerspectiveTweaks.addMyPerspectiveShortcuts(layout);
	    //layout.addStandaloneView(navViewID, true, IPageLayout.LEFT, .3f, editorArea);
	}
}
