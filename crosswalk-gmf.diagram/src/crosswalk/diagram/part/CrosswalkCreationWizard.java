/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import crosswalk.CrosswalkFactory;
import crosswalk.DataSource;
import crosswalk.TabSeparatedFile;

/**
 * @generated
 */
public class CrosswalkCreationWizard extends Wizard implements INewWizard {

    /**
     * @generated
     */
    private IWorkbench workbench;

    /**
     * @generated
     */
    protected IStructuredSelection selection;

    /**
     * @generated
     */
    protected CrosswalkCreationWizardPage diagramModelFilePage;

    /**
     * @generated
     */
    protected Resource diagram;

    /**
     * @generated
     */
    private boolean openNewlyCreatedDiagramEditor = true;

    /**
     * @generated
     */
    public IWorkbench getWorkbench() {
	return workbench;
    }

    /**
     * @generated
     */
    public IStructuredSelection getSelection() {
	return selection;
    }

    public IFile getSelectedFile() {
	IFile result = null;
	if (this.getSelection().size() > 0) {
	    if (this.getSelection().getFirstElement() instanceof IFile) {
		result = (IFile) this.getSelection().getFirstElement();
	    }
	}
	return result;
    }

    public DataSource getSelectedDataSource() {
	DataSource result = null;
	if (this.getSelection().size() > 0) {
	    if (this.getSelection().getFirstElement() instanceof IFile) {
		// TODO implement other data sources
		IFile source = (IFile) this.getSelection().getFirstElement();
		TabSeparatedFile tsf = CrosswalkFactory.eINSTANCE.createTabSeparatedFile();
		tsf.setSourceFile(source);
		result = tsf;
	    }
	}
	return result;
    }

    /**
     * @generated
     */
    public final Resource getDiagram() {
	return diagram;
    }

    /**
     * @generated
     */
    public final boolean isOpenNewlyCreatedDiagramEditor() {
	return openNewlyCreatedDiagramEditor;
    }

    /**
     * @generated
     */
    public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
	this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
    }

    /**
     * @generated
     */
    public void init(IWorkbench workbench, IStructuredSelection selection) {
	this.workbench = workbench;
	this.selection = selection;
	setWindowTitle(Messages.CrosswalkCreationWizardTitle);
	setDefaultPageImageDescriptor(CrosswalkDiagramEditorPlugin
			.getBundledImageDescriptor("icons/wizban/NewCrosswalkWizard.gif")); //$NON-NLS-1$
	setNeedsProgressMonitor(true);
    }

    /**
     * @generated NOT
     */
    @Override
    public void addPages() {
	diagramModelFilePage = new CrosswalkCreationWizardPage("DiagramModelFile", getSelection(), "crosswalk"); //$NON-NLS-1$ //$NON-NLS-2$
	diagramModelFilePage.setTitle(Messages.CrosswalkCreationWizard_DiagramModelFilePageTitle);
	diagramModelFilePage.setDescription(Messages.CrosswalkCreationWizard_DiagramModelFilePageDescription);
	IFile selection = this.getSelectedFile();
	if (selection != null) {
	    diagramModelFilePage.setContainerFullPath(selection.getProject().getFolder("crosswalks").getFullPath());
	    String defaultName = selection.getName();
	    String ext = selection.getFileExtension();
	    if (ext != null) {
		defaultName = defaultName.substring(0, defaultName.length() - (ext.length() + 1));
	    }
	    diagramModelFilePage.setFileName(defaultName);
	}
	addPage(diagramModelFilePage);
    }

    /**
     * @generated NOT
     */
    @Override
    public boolean performFinish() {
	IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

	    @Override
	    protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
		diagram = CrosswalkDiagramEditorUtil.createDiagramWithSource(diagramModelFilePage.getURI(), monitor,
				getSelectedDataSource());
		if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
		    try {
			CrosswalkDiagramEditorUtil.openDiagram(diagram);
		    } catch (PartInitException e) {
			ErrorDialog.openError(getContainer().getShell(),
					Messages.CrosswalkCreationWizardOpenEditorError, null, e.getStatus());
		    }
		}
	    }
	};
	try {
	    getContainer().run(false, true, op);
	} catch (InterruptedException e) {
	    return false;
	} catch (InvocationTargetException e) {
	    if (e.getTargetException() instanceof CoreException) {
		ErrorDialog.openError(getContainer().getShell(), Messages.CrosswalkCreationWizardCreationError, null,
				((CoreException) e.getTargetException()).getStatus());
	    } else {
		CrosswalkDiagramEditorPlugin.getInstance().logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
	    }
	    return false;
	}
	return diagram != null;
    }
}
