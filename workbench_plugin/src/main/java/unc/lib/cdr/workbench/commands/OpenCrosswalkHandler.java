package unc.lib.cdr.workbench.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.xwalk.CrosswalkTreeElement;

public class OpenCrosswalkHandler extends AbstractHandler {

@SuppressWarnings("unused")
private static final Logger LOG = LoggerFactory.getLogger(OpenCrosswalkHandler.class);

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
	LOG.debug("crosswalk edit handler called");
	IStructuredSelection s = (IStructuredSelection)HandlerUtil.getCurrentSelection(event);
	Object o = s.getFirstElement();
	if(o instanceof CrosswalkTreeElement) {
	    IFile f = ((CrosswalkTreeElement)o).getFile();
	    IEditorInput editorInput = new FileEditorInput(f);
	    IWorkbenchWindow window=PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	    IWorkbenchPage page = window.getActivePage();
	    try {
		page.openEditor(editorInput, "crosswalk.diagram.part.CrosswalkDiagramEditorID");
	    } catch (PartInitException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
	return null;
    }

}
