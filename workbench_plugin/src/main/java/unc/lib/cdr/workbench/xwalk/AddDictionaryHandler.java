package unc.lib.cdr.workbench.xwalk;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.MetsProjectNature;
import crosswalk.diagram.part.DictionaryCreationWizard;

public class AddDictionaryHandler extends AbstractHandler implements IHandler {
	private static final Logger LOG = LoggerFactory.getLogger(AddDictionaryHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		LOG.debug("handler called");
		IStructuredSelection select = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);

		DictionaryCreationWizard wiz = new DictionaryCreationWizard();
		if(IResource.class.isInstance(select.getFirstElement())) {
			IProject p = ((IResource)select.getFirstElement()).getProject();
			if(p != null) {
				IFolder f = p.getFolder(MetsProjectNature.CROSSWALKS_FOLDER_NAME);
				if(f != null) select = new StructuredSelection(f);
			}
		}
		wiz.init(HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench(), select);
		WizardDialog dialog = new WizardDialog(HandlerUtil.getActiveShell(event), wiz);
		dialog.open();
		return null;
	}

}
