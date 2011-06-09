package unc.lib.cdr.workbench.xwalk;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import crosswalk.diagram.part.CrosswalkCreationWizardPage;
import crosswalk.diagram.part.CrosswalkDiagramEditorPlugin;
import crosswalk.diagram.part.Messages;

public class NewCrosswalkWizard extends Wizard implements INewWizard {

	private IWorkbench workbench;

	protected IStructuredSelection selection;

	protected CrosswalkCreationWizardPage diagramModelFilePage;

	protected Resource diagram;

	private boolean openNewlyCreatedDiagramEditor = true;

	public IWorkbench getWorkbench() {
		return workbench;
	}

	public IStructuredSelection getSelection() {
		return selection;
	}

	public final Resource getDiagram() {
		return diagram;
	}

	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	public NewCrosswalkWizard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.CrosswalkCreationWizardTitle);
		setDefaultPageImageDescriptor(CrosswalkDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewCrosswalkWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

}
