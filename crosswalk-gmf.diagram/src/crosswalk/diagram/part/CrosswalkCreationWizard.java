/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package crosswalk.diagram.part;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;
import crosswalk.DataSource;

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

    protected IProject project;

    protected CrosswalkPickDataSourceWizardPage dataSourceTypePage;
    protected DelimitedFileDataSourceWizardPage delimitedFilePage;
    protected DelimitedFileDelimitersWizardPage delimitedFileDelimitersPage;

    protected Map<EClass, IWizardPage> dataSourceTypePages = new HashMap<EClass, IWizardPage>();

    protected EClass selectedDataSourceType;
    protected DataSource dataSource;

    /**
     * @generated
     */
    protected Resource diagram;

    /**
     * @generated
     */
    private boolean openNewlyCreatedDiagramEditor = true;

    protected String crosswalkName;

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
     * @generated NOT
     */
    public void init(IWorkbench workbench, IStructuredSelection selection) {
	this.workbench = workbench;
	this.selection = selection;
	if(this.getSelection() != null) {
	    if(this.getSelection().getFirstElement() instanceof IResource) {
		this.project = ((IResource)this.getSelection().getFirstElement()).getProject();
	    }
	}
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
	System.out.println("addPages called");
	dataSourceTypePage = new CrosswalkPickDataSourceWizardPage("Choose a data source type.");
	delimitedFilePage = new DelimitedFileDataSourceWizardPage("Choose your text file and character set.");
	delimitedFileDelimitersPage = new DelimitedFileDelimitersWizardPage("Choose the delimiters and significant rows.");
	delimitedFileDelimitersPage.filePage = delimitedFilePage;
	this.dataSourceTypePages.put(CrosswalkPackage.eINSTANCE.getDelimitedFile(), delimitedFilePage);
	this.addPage(dataSourceTypePage);
	this.addPage(delimitedFilePage);
	this.addPage(delimitedFileDelimitersPage);
    }

    private URI getCrosswalkFileURI() {
	IFile f = this.project.getFolder("crosswalks").getFile(this.crosswalkName+".crosswalk");
	URI result = URI.createPlatformResourceURI(f.getFullPath().toString(), true);
	System.out.println("Crosswalk File URI: " +result);
	return result;
    }

    /**
     * @generated NOT
     */
    @Override
    public boolean performFinish() {
	if(dataSource == null) { // create the selected type of data source, if not set by a page
	    dataSource = (DataSource)CrosswalkFactory.eINSTANCE.create(this.selectedDataSourceType);
	}
	IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
	    @Override
	    protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
		diagram = CrosswalkDiagramEditorUtil.createDiagramWithSource(getCrosswalkFileURI(), monitor,
				dataSource);
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

    @Override
    public boolean canFinish() {
	return (this.project != null && this.selectedDataSourceType != null && this.crosswalkName != null);
    }
}
