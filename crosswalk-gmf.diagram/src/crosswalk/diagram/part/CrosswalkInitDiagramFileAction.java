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

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import crosswalk.diagram.edit.parts.CrossWalkEditPart;

/**
 * @generated
 */
public class CrosswalkInitDiagramFileAction implements IObjectActionDelegate {

    /**
     * @generated
     */
    private IWorkbenchPart targetPart;

    /**
     * @generated
     */
    private URI domainModelURI;

    /**
     * @generated
     */
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	this.targetPart = targetPart;
    }

    /**
     * @generated
     */
    public void selectionChanged(IAction action, ISelection selection) {
	domainModelURI = null;
	action.setEnabled(false);
	if (selection instanceof IStructuredSelection == false || selection.isEmpty()) {
	    return;
	}
	IFile file = (IFile) ((IStructuredSelection) selection).getFirstElement();
	domainModelURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
	action.setEnabled(true);
    }

    /**
     * @generated
     */
    private Shell getShell() {
	return targetPart.getSite().getShell();
    }

    /**
     * @generated
     */
    public void run(IAction action) {
	TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
	ResourceSet resourceSet = new ResourceSetImpl();
	EObject diagramRoot = null;
	try {
	    Resource resource = resourceSet.getResource(domainModelURI, true);
	    diagramRoot = (EObject) resource.getContents().get(0);
	} catch (WrappedException ex) {
	    CrosswalkDiagramEditorPlugin.getInstance().logError("Unable to load resource: " + domainModelURI, ex); //$NON-NLS-1$
	}
	if (diagramRoot == null) {
	    MessageDialog.openError(getShell(), Messages.InitDiagramFile_ResourceErrorDialogTitle,
			    Messages.InitDiagramFile_ResourceErrorDialogMessage);
	    return;
	}
	Wizard wizard = new CrosswalkNewDiagramFileWizard(domainModelURI, diagramRoot, editingDomain);
	wizard.setWindowTitle(NLS.bind(Messages.InitDiagramFile_WizardTitle, CrossWalkEditPart.MODEL_ID));
	CrosswalkDiagramEditorUtil.runWizard(getShell(), wizard, "InitDiagramFile"); //$NON-NLS-1$
    }
}
