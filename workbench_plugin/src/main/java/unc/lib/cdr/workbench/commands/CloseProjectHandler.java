package unc.lib.cdr.workbench.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CloseProjectHandler extends AbstractHandler implements IHandler {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(CloseProjectHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// IWorkbenchPart part = HandlerUtil.getActivePart(event);
		IStructuredSelection sel = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		for (Object foo : sel.toArray()) {
			if (foo != null && foo instanceof IProject) {
				IProject p = (IProject) foo;
				try {
					p.close(new NullProgressMonitor());
				} catch (CoreException e) {
					throw new ExecutionException("Cannot close project.", e);
				}
			}
		}
		return null;
	}
}
