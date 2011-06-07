package unc.lib.cdr.workbench.commands;

import gov.loc.mets.DivType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.util.METSConstants;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class ConvertToCollectionHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection select = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		for (Object o : select.toList()) {
			if (o instanceof DivType) {
				DivType d = (DivType) o;
				if (METSConstants.Div_Folder.equals(d.getTYPE())) {
					try {
						EditingDomain ed = MetsProjectNature.getEditingDomain(d);
						Command cmd = SetCommand.create(ed, d, MetsPackage.eINSTANCE.getDivType_TYPE(),
								METSConstants.Div_Collection);
						ed.getCommandStack().execute(cmd);
					} catch (NullPointerException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return null;
	}

}
