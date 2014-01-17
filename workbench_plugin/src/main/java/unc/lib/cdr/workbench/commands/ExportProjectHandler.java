package unc.lib.cdr.workbench.commands;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class ExportProjectHandler extends AbstractHandler implements IHandler {

	@SuppressWarnings("unchecked")
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection s = (IStructuredSelection)HandlerUtil.getCurrentSelection(event);
		for(IProject p : (List<IProject>)s.toList()) {
			try {
				MetsProjectNature.get(p).save();
				p.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			} catch(CoreException e) {
				e.printStackTrace();
				throw new ExecutionException("Unexpected problem", e);
			}
		}
		
		@SuppressWarnings("restriction")
		IHandler export = new org.eclipse.ui.internal.handlers.WizardHandler.Export();
		export.execute(event);
		return null;
	}

}
