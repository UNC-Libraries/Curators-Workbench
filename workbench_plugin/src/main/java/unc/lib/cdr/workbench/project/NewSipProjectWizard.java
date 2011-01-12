package unc.lib.cdr.workbench.project;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class NewSipProjectWizard extends Wizard implements INewWizard {
    private WizardNewProjectCreationPage _pageOne;
    private NewProjectStagingPage _pageTwo;
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
	IProject prog = MetsProjectNatureSupport.createProject(name, location);
	URI stageURI = null;
	try {
	    stageURI = new URI(_pageTwo.getStageLocationWithVariables());
	    stageURI = prog.getPathVariableManager().resolveURI(stageURI);
	    prog.getFolder("stage").createLink(stageURI, IResource.BACKGROUND_REFRESH, new NullProgressMonitor());
	} catch (URISyntaxException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (CoreException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return true;
    }

    @Override
    public void addPages() {
	super.addPages();
	    _pageOne = new WizardNewProjectCreationPage("New Project Wizard");
	    _pageOne.setTitle("Project Name");
	    _pageOne.setDescription("Give your project a descriptive name.");
	    _pageTwo = new NewProjectStagingPage("Staging");
	    _pageTwo.setTitle("Staging Location");
	    _pageTwo.setDescription("Choose a staging location for captured files.");
	    _pageTwo.setMainPage(_pageOne);
	    addPage(_pageOne);
	    addPage(_pageTwo);
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
	this.workbench = workbench;
    }

}
