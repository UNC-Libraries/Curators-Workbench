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
package unc.lib.cdr.workbench.project;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import unc.lib.cdr.workbench.rcp.Activator;

/**
 * @author Gregory Jansen
 *
 */
public class NewProjectStagingPage extends WizardPage {
    WizardNewProjectCreationPage mainPage = null;
    Table stageTable = null;

    Text rawStageText = null;
    Text stageText = null;

    /**
     * @param pageName
     */
    protected NewProjectStagingPage(String pageName) {
	super(pageName);
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
	Composite composite = new Composite(parent, SWT.NULL);
	composite.setLayout(new GridLayout(2, false));
	composite.setLayoutData(new GridData(GridData.FILL_BOTH));

	// combo box - pick a staging location for captured files (drop down
	// options from variables)
	stageTable = new Table(composite, SWT.BORDER | SWT.SINGLE);
	GridData cgd = new GridData();
	cgd.horizontalSpan = 2;
	stageTable.setLayoutData(cgd);
	stageTable.setLinesVisible(true);
	stageTable.setHeaderVisible(true);
	TableColumn cName = new TableColumn(stageTable, SWT.NULL);
	cName.setText("Name");
	TableColumn cUri = new TableColumn(stageTable, SWT.NULL);
	cUri.setText("Location");
	for (String[] pair : Activator.getDefault().getStagingLocationsPreference()) {
	    TableItem item = new TableItem(stageTable, SWT.NULL);
	    item.setText(pair);
	}
	stageTable.getColumn(0).pack();
	stageTable.getColumn(1).pack();
	stageTable.addSelectionListener(new SelectionListener() {
	    @Override
	    public void widgetSelected(SelectionEvent e) {
		stageSelectionChanged();
	    }

	    @Override
	    public void widgetDefaultSelected(SelectionEvent e) {
		stageSelectionChanged();
	    }
	});

	Label txtLabel = new Label(composite, SWT.NULL);
	txtLabel.setText("Template");
	rawStageText = new Text(composite, SWT.NULL);
	rawStageText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	Label txt2Label = new Label(composite, SWT.NULL);
	txt2Label.setText("Location");
	stageText = new Text(composite, SWT.NULL);
	stageText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	// checkbox - automatically stage captured files?

	this.setControl(composite);
	stageTable.select(0);
    }

    private void stageSelectionChanged() {
	String txt = this.getStageLocationWithVariables();
	rawStageText.setText(txt);
	stageText.setText(computeLocation(txt));
	if(txt != null) {
	    this.setPageComplete(true);
	} else {
	    this.setPageComplete(false);
	}
    }

    /**
     * @param txt
     * @return
     */
    private String computeLocation(String txt) {
	// TODO Auto-generated method stub
	return txt;
    }

    public String getStageLocationWithVariables() {
	if (stageTable.getSelectionIndex() != -1) {
	    String pattern = stageTable.getSelection()[0].getText(1);
	    return pattern;
	} else {
	    return null;
	}
    }

    public void setMainPage(WizardNewProjectCreationPage mainPage) {
	this.mainPage = mainPage;
    }

}
