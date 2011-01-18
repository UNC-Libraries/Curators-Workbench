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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * Wizard page that allows to select element from model.
 * @generated
 */
public class ModelElementSelectionPage extends WizardPage {
    /**
     * @generated
     */
    protected EObject selectedModelElement;

    /**
     * @generated
     */
    private TreeViewer modelViewer;

    /**
     * @generated
     */
    public ModelElementSelectionPage(String pageName) {
	super(pageName);
    }

    /**
     * @generated
     */
    public EObject getModelElement() {
	return selectedModelElement;
    }

    /**
     * @generated
     */
    public void setModelElement(EObject modelElement) {
	selectedModelElement = modelElement;
	if (modelViewer != null) {
	    if (selectedModelElement != null) {
		modelViewer.setInput(selectedModelElement.eResource());
		modelViewer.setSelection(new StructuredSelection(selectedModelElement));
	    } else {
		modelViewer.setInput(null);
	    }
	    setPageComplete(validatePage());
	}
    }

    /**
     * @generated
     */
    public void createControl(Composite parent) {
	initializeDialogUnits(parent);

	Composite plate = new Composite(parent, SWT.NONE);
	plate.setLayoutData(new GridData(GridData.FILL_BOTH));
	GridLayout layout = new GridLayout();
	layout.marginWidth = 0;
	plate.setLayout(layout);
	setControl(plate);

	Label label = new Label(plate, SWT.NONE);
	label.setText(getSelectionTitle());
	label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

	modelViewer = new TreeViewer(plate, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
	GridData layoutData = new GridData(GridData.FILL_BOTH);
	layoutData.heightHint = 300;
	layoutData.widthHint = 300;
	modelViewer.getTree().setLayoutData(layoutData);
	modelViewer.setContentProvider(new AdapterFactoryContentProvider(CrosswalkDiagramEditorPlugin.getInstance()
			.getItemProvidersAdapterFactory()));
	modelViewer.setLabelProvider(new AdapterFactoryLabelProvider(CrosswalkDiagramEditorPlugin.getInstance()
			.getItemProvidersAdapterFactory()));
	if (selectedModelElement != null) {
	    modelViewer.setInput(selectedModelElement.eResource());
	    modelViewer.setSelection(new StructuredSelection(selectedModelElement));
	}
	modelViewer.addSelectionChangedListener(new ISelectionChangedListener() {
	    public void selectionChanged(SelectionChangedEvent event) {
		ModelElementSelectionPage.this.updateSelection((IStructuredSelection) event.getSelection());
	    }
	});

	setPageComplete(validatePage());
    }

    /**
     * Override to provide custom model element description.
     * @generated
     */
    protected String getSelectionTitle() {
	return Messages.ModelElementSelectionPageMessage;
    }

    /**
     * @generated
     */
    protected void updateSelection(IStructuredSelection selection) {
	selectedModelElement = null;
	if (selection.size() == 1) {
	    Object selectedElement = selection.getFirstElement();
	    if (selectedElement instanceof IWrapperItemProvider) {
		selectedElement = ((IWrapperItemProvider) selectedElement).getValue();
	    }
	    if (selectedElement instanceof FeatureMap.Entry) {
		selectedElement = ((FeatureMap.Entry) selectedElement).getValue();
	    }
	    if (selectedElement instanceof EObject) {
		selectedModelElement = (EObject) selectedElement;
	    }
	}
	setPageComplete(validatePage());
    }

    /**
     * Override to provide specific validation of the selected model element.
     * @generated
     */
    protected boolean validatePage() {
	return true;
    }

}
