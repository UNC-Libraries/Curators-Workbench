package unc.lib.cdr.workbench.commands;

import gov.loc.mets.DivType;
import gov.loc.mets.MetsPackage;

import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.commands.IElementUpdater;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.RadioState;
import org.eclipse.ui.menus.UIElement;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class SetDivTypeHandler extends AbstractHandler implements IElementUpdater {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (HandlerUtil.matchesRadioState(event))
			return null; // we are already in the updated state - do nothing
		String currentState = event.getParameter(RadioState.PARAMETER_ID);
		// perform task for current state
		IStructuredSelection select = (IStructuredSelection) HandlerUtil
				.getCurrentSelectionChecked(event);
		for (Object o : select.toList()) {
			if (o instanceof DivType) {
				DivType d = (DivType) o;
				try {
					EditingDomain ed = MetsProjectNature.getEditingDomain(d);
					Command cmd = SetCommand.create(ed, d,
							MetsPackage.eINSTANCE.getDivType_TYPE(),
							currentState);
					ed.getCommandStack().execute(cmd);
				} catch (NullPointerException e) {
					e.printStackTrace();
				}
			}
		}

		// and finally update the current state
		HandlerUtil.updateRadioState(event.getCommand(), currentState);
		return null;
	}

	@Override
	public void updateElement(UIElement element, Map parameters) {
		String state = (String)parameters.get("org.eclipse.ui.commands.radioStateParameter");
		IWorkbenchPartSite site = (IWorkbenchPartSite)parameters.get("org.eclipse.ui.part.IWorkbenchPartSite");
		if(site.getId().equals("cdr-workbench.projectview")) {
			IStructuredSelection s = (IStructuredSelection)site.getSelectionProvider().getSelection();
			if(s.getFirstElement() instanceof DivType) {
				DivType div = (DivType)s.getFirstElement();
				element.setChecked(div.getTYPE() != null && div.getTYPE().equals(state));
			}
		}
	}

}
