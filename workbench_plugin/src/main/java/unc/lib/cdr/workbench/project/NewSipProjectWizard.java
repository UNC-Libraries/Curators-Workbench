package unc.lib.cdr.workbench.project;

import java.net.URI;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class NewSipProjectWizard extends Wizard implements INewWizard {
    private WizardNewProjectCreationPage _pageOne;
    IWorkbench workbench = null;

    public NewSipProjectWizard() {
    }

    @Override
    public boolean performFinish() {
	String name = _pageOne.getProjectName();
	URI location = null;
	if(!_pageOne.useDefaults()) {
	    location = _pageOne.getLocationURI();
	}
	MetsProjectNatureSupport.createProject(name, location);
	return true;
    }

    @Override
    public void addPages() {
	super.addPages();
	    _pageOne = new WizardNewProjectCreationPage("New Project Wizard");
	    _pageOne.setTitle("Project Name");
	    _pageOne.setDescription("Give your project a descriptive name.");
	    addPage(_pageOne);
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
	this.workbench = workbench;
    }

}
