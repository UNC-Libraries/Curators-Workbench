package unc.lib.cdr.workbench.arrange;

import gov.loc.mets.MetsPackage;
import gov.loc.mets.SmLinkType;

import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.jface.dialogs.MessageDialog;
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
			boolean confirmed = MessageDialog.openConfirm(HandlerUtil.getActiveShell(event), "Confirm Delete", 
					"Please confirm that you wish to delete this metadata.");
			if(!confirmed) return null;
			MetsProjectNature mpn = MetsProjectNature.getNatureForMetsObject((EObject)sSelection.getFirstElement());
			HashSet<SmLinkType> del = new HashSet<SmLinkType>();
			Iterator it = sSelection.iterator();
			while(it.hasNext()) {
				Object sel = it.next();
				if (sel instanceof SmLinkType) {
					del.add((SmLinkType) sel);
				}
			}
			Command c = RemoveCommand.create(mpn.getEditingDomain(), mpn.getMets().getStructLink(),
			MetsPackage.eINSTANCE.getStructLinkType_SmLink(), del);
			mpn.getCommandStack().execute(c);
		}
		return null;
	}

}
