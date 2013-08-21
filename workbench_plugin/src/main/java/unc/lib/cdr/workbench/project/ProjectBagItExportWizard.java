package unc.lib.cdr.workbench.project;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.internal.wizards.datatransfer.DataTransferMessages;
import org.eclipse.ui.internal.wizards.datatransfer.WizardArchiveFileResourceExportPage1;

public class ProjectBagItExportWizard extends Wizard implements IExportWizard {
	IStructuredSelection selection = null;
	private IProject project = null;
	private WizardArchiveFileResourceExportPage1 mainPage;

	public ProjectBagItExportWizard() {
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
        this.selection = currentSelection;
        List selectedResources = IDE.computeSelectedResources(currentSelection);
        if (!selectedResources.isEmpty()) {
            this.selection = new StructuredSelection(selectedResources);
        }

        setWindowTitle("");
        setDefaultPageImageDescriptor(IDEWorkbenchPlugin.getIDEImageDescriptor("wizban/exportzip_wiz.png"));//$NON-NLS-1$
        setNeedsProgressMonitor(true);
		this.project = (IProject)selection.getFirstElement();
	}
	
	// TODO add destination file chooser page
    /* (non-Javadoc)
     * Method declared on IWizard.
     */
    public void addPages() {
        super.addPages();
        mainPage = new WizardArchiveFileResourceExportPage1(selection);
        addPage(mainPage);
    }

	@Override
	public boolean performFinish() {
		// create a ZIP
		// put all the files in it
		// put project root files in a tag folder
		// generate manifest files
        return mainPage.finish();
	}

}
