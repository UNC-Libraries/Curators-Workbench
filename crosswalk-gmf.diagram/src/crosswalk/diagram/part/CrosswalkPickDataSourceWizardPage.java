/**
 * Copyright 2011 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package crosswalk.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import crosswalk.CrosswalkPackage;

/**
 * @author Gregory Jansen
 *
 */
public class CrosswalkPickDataSourceWizardPage extends WizardPage implements IWizardPage {
    Combo dataSourceCombo;
    List<EClass> dataSourceTypes = CrosswalkPackage.eINSTANCE.getDataSourceImplementations();
    private Combo projectCombo;
    Text crosswalkNameText;

    /**
     * @param pageName
     */
    protected CrosswalkPickDataSourceWizardPage(String pageName) {
	super(pageName);
    }

    protected CrosswalkCreationWizard getWiz() {
	return (CrosswalkCreationWizard) getWizard();
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
     * .Composite)
     */
    @Override
    public void createControl(Composite parent) {
	initializeDialogUnits(parent);
	// top level group
	Composite topLevel = new Composite(parent, SWT.NONE);
	topLevel.setLayout(new GridLayout(2, false));

	Label l1 = new Label(topLevel, SWT.None);
	l1.setText("Crosswalk Name");

	crosswalkNameText = new Text(topLevel, SWT.SINGLE | SWT.BORDER);
	crosswalkNameText.addListener(SWT.Modify, new Listener() {
	    @Override
	    public void handleEvent(Event event) {
		System.out.println(event);
		validatePage();
		getWizard().getContainer().updateButtons();
	    }
	});

	Label l2 = new Label(topLevel, SWT.None);
	l2.setText("Project");

	projectCombo = new Combo(topLevel, SWT.DROP_DOWN | SWT.READ_ONLY);
	List<IProject> projects = new ArrayList<IProject>();
	for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
	    if (p.isOpen()) {
		projects.add(p);
	    }
	}
	for (int i = 0; i < projects.size(); i++) {
	    projectCombo.add(projects.get(i).getName(), i);
	}
	if (getWiz().project != null && projects.indexOf(getWiz().project) >= 0) {
	    projectCombo.select(projects.indexOf(getWiz().project));
	} else {
	    projectCombo.select(0);
	}
	projectCombo.addListener(SWT.Selection, new Listener() {
	    @Override
	    public void handleEvent(Event event) {
		validatePage();
		getWizard().getContainer().updateButtons();
	    }
	});

	Label l3 = new Label(topLevel, SWT.None);
	l3.setText("Data Source Type");

	dataSourceCombo = new Combo(topLevel, SWT.READ_ONLY);
	Collections.sort(dataSourceTypes, new Comparator<EClass>() {
	    @Override
	    public int compare(EClass o1, EClass o2) {
		return o1.getName().compareTo(o2.getName());
	    }
	});
	for (ListIterator<EClass> li = dataSourceTypes.listIterator(); li.hasNext();) {
	    int i = li.nextIndex();
	    EClass c = li.next();
	    dataSourceCombo.add(c.getName(), i);
	}
	dataSourceCombo.select(0);
	dataSourceCombo.addListener(SWT.Selection, new Listener() {
	    @Override
	    public void handleEvent(Event event) {
		validatePage();
		getWizard().getContainer().updateButtons();
	    }
	});
	// Show description on opening
	//setErrorMessage(null);
	//setMessage(null);
	setControl(topLevel);
	validatePage();
    }

    @Override
    public boolean canFlipToNextPage() {
	return (getWiz().selectedDataSourceType != null && getWiz().project != null && getWiz().crosswalkName != null);
    }

    @Override
    public IWizardPage getNextPage() {
	CrosswalkCreationWizard wiz = (CrosswalkCreationWizard) this.getWizard();
	IWizardPage next = wiz.dataSourceTypePages.get(getWiz().selectedDataSourceType);
	return next;
    }

    private void validatePage() {
	boolean complete = true;
	setErrorMessage(null);
	if (dataSourceCombo.getSelectionIndex() >= 0) {
	    getWiz().selectedDataSourceType = dataSourceTypes.get(dataSourceCombo.getSelectionIndex());
	} else {
	    complete = false;
	    setErrorMessage("Please choose a type of data source.");
	}
	if(projectCombo.getSelectionIndex() > -1) {
	    String projectName = projectCombo.getItem(projectCombo.getSelectionIndex());
	    getWiz().project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	} else {
	    complete = false;
	    setErrorMessage("Please select a project");
	}
	String txt = crosswalkNameText.getText();
	if (txt != null && txt.trim().length() > 0) {
	    getWiz().crosswalkName = txt;
	} else {
	    complete = false;
	    setErrorMessage("Please supply a crosswalk name.");
	}
	setPageComplete(complete);
    }
}
