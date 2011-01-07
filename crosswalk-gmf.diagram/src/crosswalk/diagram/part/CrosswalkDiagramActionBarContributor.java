/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.part;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.gmf.runtime.diagram.ui.printing.render.actions.EnhancedPrintActionHelper;
import org.eclipse.gmf.runtime.diagram.ui.printing.render.actions.RenderedPrintPreviewAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;

/**
 * @generated
 */
public class CrosswalkDiagramActionBarContributor extends DiagramActionBarContributor {

    /**
     * @generated
     */
    protected Class getEditorClass() {
	return CrosswalkDiagramEditor.class;
    }

    /**
     * @generated
     */
    protected String getEditorId() {
	return CrosswalkDiagramEditor.ID;
    }

    /**
     * @generated
     */
    public void init(IActionBars bars, IWorkbenchPage page) {
	super.init(bars, page);
	// print preview
	IMenuManager fileMenu = bars.getMenuManager().findMenuUsingPath(IWorkbenchActionConstants.M_FILE);
	assert fileMenu != null;
	fileMenu.remove("pageSetupAction"); //$NON-NLS-1$
    }
}
