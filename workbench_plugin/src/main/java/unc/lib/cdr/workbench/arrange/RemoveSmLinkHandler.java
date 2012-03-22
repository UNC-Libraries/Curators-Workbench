package unc.lib.cdr.workbench.arrange;

import gov.loc.mets.MetsPackage;
import gov.loc.mets.SmLinkType;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class RemoveSmLinkHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
		if (!selection.isEmpty()) {
			IStructuredSelection sSelection = (IStructuredSelection) selection;
			if (sSelection.size() == 1) {
				if (sSelection.getFirstElement() instanceof SmLinkType) {
					SmLinkType link = (SmLinkType) sSelection.getFirstElement();
					MetsProjectNature mpn = MetsProjectNature.getNatureForMetsObject(link);
					Command c = RemoveCommand.create(mpn.getEditingDomain(), mpn.getMets().getStructLink(),
							MetsPackage.eINSTANCE.getStructLinkType_SmLink(), link);
					MetsProjectNature.getNatureForMetsObject(link).getCommandStack().execute(c);
				}
			}
		}
		return null;
	}

}
