package unc.lib.cdr.workbench.xwalk;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crosswalk.diagram.part.CrosswalkCreationWizard;

public class ImportMetadataSourceHandler extends AbstractHandler {
    private static final Logger LOG = LoggerFactory.getLogger(ImportMetadataSourceHandler.class);

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.
     * ExecutionEvent)
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
	LOG.debug("handler called");
	IStructuredSelection select = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);

	CrosswalkCreationWizard wiz = new CrosswalkCreationWizard();
	wiz.init(HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench(), select);
	WizardDialog dialog = new WizardDialog(HandlerUtil
			.getActiveShell(event), wiz);
	dialog.open();
	return null;
    }

}
