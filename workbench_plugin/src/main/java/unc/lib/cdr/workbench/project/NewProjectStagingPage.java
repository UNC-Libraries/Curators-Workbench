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
package unc.lib.cdr.workbench.project;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.filesystem.URIUtil;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
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
	Button autoStageButton = null;
	boolean autoStage = true;
	String stagingLocationTemplate = null;

	// boolean

	/**
	 * @param pageName
	 */
	protected NewProjectStagingPage(String pageName) {
		super(pageName);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets .Composite)
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
		cName.pack();
		// cUri.pack();
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
		autoStageButton = new Button(composite, SWT.CHECK | SWT.RIGHT);
		autoStageButton.setText("Automatically stage files as you capture them.");
		autoStageButton.setSelection(true);
		GridData buttonData = new GridData();
		buttonData.horizontalSpan = 2;
		autoStageButton.setLayoutData(buttonData);
		autoStageButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				autoStage = autoStageButton.getSelection();
			}
		});

		this.setControl(composite);
	}

	private void stageSelectionChanged() {
		if (stageTable.getSelectionIndex() != -1) {
			this.stagingLocationTemplate = stageTable.getSelection()[0].getText(1);
		}
		URI projectLocation = null;
		if (!mainPage.useDefaults()) {
			projectLocation = mainPage.getLocationURI();
		} else {
			projectLocation = URIUtil.toURI(mainPage.getLocationPath().append(mainPage.getProjectName()));
		}
		URI location = computeStageLocation(projectLocation, mainPage.getProjectName());
		rawStageText.setText(stagingLocationTemplate);
		stageText.setText(location.toString());
		this.setPageComplete(this.stagingLocationTemplate != null);
	}

	/**
	 * @param projectLocation
	 *           Project Location URI
	 * @param projectName
	 *           Project Name
	 * @return staging URI
	 */
	URI computeStageLocation(URI projectLocation, String projectName) {
		System.out.println("computeStageLocation: projectLocation=" + projectLocation);
		System.out.println("computeStageLocation: projectName=" + projectName);
		try {
			projectName = new URI("file", projectName, null).toString();
			projectName = projectName.substring(projectName.indexOf(":") + 1);
			System.out.println("computeStageLocation: projectNameEncoded=" + projectName);
		} catch (URISyntaxException e) {
			throw new Error(e);
		}
		URI result;
		String userName = System.getProperty("user.name");
		String stageLocation = null;
		stageLocation = stagingLocationTemplate.replaceAll("\\$\\{PROJECT_NAME\\}", projectName);
		stageLocation = stageLocation.replaceAll("\\$\\{PROJECT_LOC\\}", projectLocation.toString());
		stageLocation = stageLocation.replaceAll("\\$\\{USER_NAME\\}", userName);
		System.out.println("stageLocation str before new URI call: " + stageLocation);
		try {
			result = new URI(stageLocation);
		} catch (URISyntaxException e) {
			throw new Error(e);
		}
		return result;
	}

	public void setMainPage(WizardNewProjectCreationPage mainPage) {
		this.mainPage = mainPage;
	}

	@Override
	public boolean isPageComplete() {
		return (this.stagingLocationTemplate != null);
	}

	public boolean isAutoStage() {
		return autoStage;
	}

}
