package unc.lib.cdr.workbench.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import unc.lib.cdr.workbench.project.NewSipProjectWizard;

public class CreateProjectHandler extends AbstractHandler implements IHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
	NewSipProjectWizard wiz = new NewSipProjectWizard();
	WizardDialog dialog = new WizardDialog(HandlerUtil
			.getActiveShell(event), wiz);
	dialog.open();
	return null;
    }

}
