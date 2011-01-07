package unc.lib.cdr.workbench.rcp;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ISaveParticipant;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.ide.IDE;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {
    private static final String PERSPECTIVE_ID = "cdr-workbench.AccessionPerspective"; // "org.eclipse.ui.resourcePerspective";
									      // //
									      // ??

    @Override
    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
	return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

    @Override
    public String getInitialWindowPerspectiveId() {
	return PERSPECTIVE_ID;
    }

    @Override
    public void initialize(IWorkbenchConfigurer configurer) {
	super.initialize(configurer);
	configurer.setSaveAndRestore(true);
	IDE.registerAdapters();
	// done with workspace location stuff

	ISaveParticipant saveParticipant = new METSWorkspaceSaveParticipant();
	try {
	    // restore models from workbench files
	    for(IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
		if(p.hasNature(MetsProjectNature.NATURE_ID) && p.isOpen()) {
		    MetsProjectNature n = (MetsProjectNature)p.getNature(MetsProjectNature.NATURE_ID);
		    n.load();
		}
	    }
	    ResourcesPlugin.getWorkspace().addSaveParticipant(Activator.PLUGIN_ID, saveParticipant);
	} catch (CoreException e) {
	    e.printStackTrace();
	}
    }

    @Override
    public boolean preShutdown() {
	try {
	    ResourcesPlugin.getWorkspace().save(true, null);
	} catch (CoreException e) {
	    System.err.println(e.getMessage());
	}
	return super.preShutdown();
    }

}
