package unc.lib.cdr.workbench.accession;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class RescanOriginalsHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
	IStructuredSelection select = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
	Object sel = select.getFirstElement();
	IResource target = null;
	if (sel instanceof OriginalFoldersProjectElement) {
	    target = ((OriginalFoldersProjectElement) sel).getProject();
	} else if (sel instanceof IResource) {
	    target = (IResource) sel;
	}
	try {
	    target.refreshLocal(IFolder.DEPTH_INFINITE, new NullProgressMonitor());
	} catch (CoreException e) {
	    throw new ExecutionException("Cannot refresh originals.", e);
	}
	return null;
    }

}
