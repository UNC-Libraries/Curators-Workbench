package unc.lib.cdr.workbench.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeleteProjectHandler extends AbstractHandler implements IHandler {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(DeleteProjectHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection sel = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		for (Object foo : sel.toArray()) {
			if (foo != null && foo instanceof IProject) {
				IProject p = (IProject) foo;
				MessageDialogWithToggle mdwt = MessageDialogWithToggle.openOkCancelConfirm(
						HandlerUtil.getActiveShellChecked(event), "Delete Project",
						"Are you sure you want to delete this project from the workbench?\n\n\t" + p.getName(),
						"Delete project files created by the workbench? (originals never deleted)", false, null, null);
				if (mdwt.getReturnCode() == mdwt.OK) {
					try {
						p.delete(mdwt.getToggleState(), true, new NullProgressMonitor());
					} catch (CoreException e) {
						throw new ExecutionException("Cannot delete project.", e);
					}
				}
			}
		}
		return null;
	}
}
