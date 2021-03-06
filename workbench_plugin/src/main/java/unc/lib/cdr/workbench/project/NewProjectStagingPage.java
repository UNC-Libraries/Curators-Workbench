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
import java.net.URL;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.Dialog;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import staging.plugin.StagingPlugin;
import staging.plugin.views.StagingFolderDialog;
import edu.unc.lib.staging.SharedStagingArea;
import edu.unc.lib.staging.Stages;
import edu.unc.lib.staging.StagingException;

/**
 * @author Gregory Jansen
 * 
 */
public class NewProjectStagingPage extends WizardPage {
	private static final Logger log = LoggerFactory.getLogger(NewProjectStagingPage.class);
	WizardNewProjectCreationPage mainPage = null;
	Table stageTable = null;

	Text folderText = null;
	Text manifestURIText = null;
	Text storageFolderText = null;
	Button autoStageButton = null;
	Button parentFolderButton = null;
	boolean autoStage = true;
	SharedStagingArea stagingArea = null;
	String relativePath = null;
	URI projectManifestBase = null;

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
		cgd.grabExcessHorizontalSpace = true;
		cgd.horizontalAlignment = SWT.FILL;
		stageTable.setLayoutData(cgd);
		stageTable.setLinesVisible(true);
		stageTable.setHeaderVisible(true);
		TableColumn cName = new TableColumn(stageTable, SWT.NULL);
		cName.setText("Staging Area");
		TableColumn cUri = new TableColumn(stageTable, SWT.NULL);
		cUri.setText("Repository");
		TableColumn cConn = new TableColumn(stageTable, SWT.NULL);
		cConn.setText("Connected");

		Stages stages = StagingPlugin.getDefault().getStages();
		for (SharedStagingArea area : stages.getAllAreas().values()) {
			if (!area.isReadOnly()) {
				URL repo = area.getConfigURL();
				TableItem add = new TableItem(stageTable, SWT.NULL);
				add.setText(0, area.getName());
				add.setText(1, repo.getHost());
				add.setText(2, area.isConnected() ? "yes" : "no");
				add.setData(area);
			}
		}
		cUri.pack();
		cName.pack();
		cConn.pack();

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

		parentFolderButton = new Button(composite, SWT.PUSH);
		parentFolderButton.setText("Choose Sub-Folder..");
		parentFolderButton.setEnabled(false);
		parentFolderButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				StagingFolderDialog d = new StagingFolderDialog(getShell(), stagingArea);
				d.open();
				relativePath = d.getRelativePath();
				update();
			}
			
		});
		
		storageFolderText = new Text(composite, SWT.NULL);
		storageFolderText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		storageFolderText.setEditable(false);

		Label txtLabel = new Label(composite, SWT.NULL);
		txtLabel.setText("Manifest URI");
		manifestURIText = new Text(composite, SWT.NULL);
		manifestURIText.setLayoutData(new GridData(
				GridData.FILL_HORIZONTAL));
		manifestURIText.setEditable(false);

		// checkbox - automatically stage captured files?
		autoStageButton = new Button(composite, SWT.CHECK | SWT.RIGHT);
		autoStageButton
				.setText("Automatically stage files as you capture them.");
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
			this.relativePath = null;
			this.stagingArea = (SharedStagingArea) stageTable.getSelection()[0]
					.getData();
			if (!this.stagingArea.isConnected()) {
				StagingPlugin.getDefault().getStages()
						.connect(this.stagingArea.getURI());
			}
			if (this.stagingArea.getURI().isAbsolute() && this.stagingArea.isConnected()) {
				parentFolderButton.setEnabled(true);
			} else {
				parentFolderButton.setEnabled(false);
			}
			update();
		}
	}

	private void update() {
		if (!this.stagingArea.getURI().isAbsolute()) {
			projectManifestBase = this.stagingArea.makeURI("");
		} else {
			projectManifestBase = this.stagingArea.makeURI(relativePath, mainPage.getProjectName());
		}
		manifestURIText.setText(projectManifestBase.toString());
		if (this.stagingArea.isConnected()) {
			try {
				URI projectStagedBase = this.stagingArea
						.getStorageURI(projectManifestBase);
				storageFolderText.setText(projectStagedBase.toString());
				this.setPageComplete(this.stagingArea != null);
			} catch (StagingException e) {
				storageFolderText.setText("Cannot connect to this staging area: "
						+ e.getMessage());
			}
		} else {
			storageFolderText.setText("Cannot connect to this staging area");
		}
	}

	public void setMainPage(WizardNewProjectCreationPage mainPage) {
		this.mainPage = mainPage;
	}

	@Override
	public boolean isPageComplete() {
		return (this.stagingArea != null && this.stagingArea.isConnected());
	}

	public boolean isAutoStage() {
		return autoStage;
	}

}
