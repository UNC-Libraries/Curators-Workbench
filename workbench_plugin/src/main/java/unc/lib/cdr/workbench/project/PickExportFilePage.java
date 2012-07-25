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

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Widget;

import unc.lib.cdr.workbench.stage.StagingUtils;

/**
 * @author Gregory Jansen
 *
 */
public class PickExportFilePage extends WizardPage implements IWizardPage, Listener {
	String destinationValue = "";
	//boolean openFolder = true;
	boolean openFile = false;
	boolean overwriteFile = true;

	Composite composite = null;
	Combo destinationNameField;
	Button destinationBrowseButton;
	IProject project = null;
	Button openFolderCheckbox;
	Button overwriteExistingFileCheckbox;
	Button openFileCheckbox;

	/**
	 * @param pageName
	 * @param project
	 */
	protected PickExportFilePage(String pageName, IProject project, String title, String extension) {
		super(pageName);
		this.setTitle(title);
		this.setMessage("Please select the file location and options for export.");
		this.project = project;
		if (project != null) {
			if(project.isOpen()) {
				setDestinationValue(project.getLocation().append(project.getName() + "."+extension).toString());
			} else {
				setErrorMessage("The selected project is closed. Please open it and try again.");
			}
		} else {
			this.setErrorMessage("You must select an open project to export.");
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		// PlatformUI.getWorkbench().getHelpSystem()
		// .setHelp(getControl(), WorkbenchHelpContextIds.CDR_SIP_EXPORT_WIZARD_PAGE);

		this.composite = new Composite(parent, SWT.NULL);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		createDestinationGroup(composite);

		createOptionsGroup(composite);

		this.setControl(composite);
		updatePageCompletion();
	}

	/**
	 * @param composite
	 */
	private void createDestinationGroup(Composite parent) {
		Font font = parent.getFont();
		// destination specification group
		Composite destinationSelectionGroup = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		destinationSelectionGroup.setLayout(layout);
		destinationSelectionGroup.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.VERTICAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));
		destinationSelectionGroup.setFont(font);

		Label destinationLabel = new Label(destinationSelectionGroup, SWT.NONE);
		destinationLabel.setText("To METS file:");
		destinationLabel.setFont(font);

		// destination name entry field
		destinationNameField = new Combo(destinationSelectionGroup, SWT.SINGLE | SWT.BORDER);
		destinationNameField.setText(getDestinationValue());
		destinationNameField.addListener(SWT.Modify, this);
		destinationNameField.addListener(SWT.Selection, this);
		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
		data.widthHint = 250;
		destinationNameField.setLayoutData(data);
		destinationNameField.setFont(font);

		// destination browse button
		destinationBrowseButton = new Button(destinationSelectionGroup, SWT.PUSH);
		destinationBrowseButton.setText("Browse");
		destinationBrowseButton.addListener(SWT.Selection, this);
		destinationBrowseButton.setFont(font);
		setButtonLayoutData(destinationBrowseButton);

		new Label(parent, SWT.NONE); // vertical spacer

	}

	/**
	 * A Group with checkboxes for file overwrite, open output folder
	 *
	 * @param c
	 */
	private void createOptionsGroup(Composite c) {
		Font font = c.getFont();
		Group optionsGroup = new Group(c, SWT.NULL);
		optionsGroup.setText("Options");
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		optionsGroup.setLayout(layout);
		optionsGroup.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_FILL
				| GridData.GRAB_HORIZONTAL));

		this.overwriteExistingFileCheckbox = new Button(optionsGroup, SWT.CHECK);
		this.overwriteExistingFileCheckbox.setText("Overwrite any existing file");
		this.overwriteExistingFileCheckbox.setSelection(this.overwriteFile);
		this.overwriteExistingFileCheckbox.addListener(SWT.Selection, this);

//		this.openFolderCheckbox = new Button(optionsGroup, SWT.CHECK);
//		this.openFolderCheckbox.setText("Show the exported file in a folder view");
//		this.openFolderCheckbox.setSelection(this.openFolder);
//		this.openFolderCheckbox.addListener(SWT.Selection, this);

		this.openFileCheckbox = new Button(optionsGroup, SWT.CHECK);
		this.openFileCheckbox.setText("Open the exported file");
		this.openFileCheckbox.setSelection(this.openFile);
		this.openFileCheckbox.addListener(SWT.Selection, this);
	}

	public String getDestinationValue() {
		return destinationValue;
	}

	/**
	 *
	 */
	private void handleDestinationBrowseButtonPressed() {
		// TODO Auto-generated method stub
		FileDialog dialog = new FileDialog(getContainer().getShell(), SWT.SAVE | SWT.SHEET);
		// dialog.setMessage("Select an output file");
		dialog.setText("Output File");
		Path p = new Path(getDestinationValue());
		dialog.setFileName(p.lastSegment());
		dialog.setFilterPath(p.removeLastSegments(1).toString());
		String selectedFileName = dialog.open();
		if (selectedFileName != null) {
			setErrorMessage(null);
			setDestinationValue(selectedFileName);
			this.destinationNameField.setText(getDestinationValue());
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
	 */
	@Override
	public void handleEvent(Event event) {
		Widget source = event.widget;

		if (source == destinationBrowseButton) {
			handleDestinationBrowseButtonPressed();
//		} else if(source == openFolderCheckbox) {
//			this.openFolder = openFolderCheckbox.getSelection();
		} else if(source == overwriteExistingFileCheckbox) {
			this.overwriteFile = overwriteExistingFileCheckbox.getSelection();
		} else if(source == openFileCheckbox) {
			this.openFile = openFileCheckbox.getSelection();
		}

		updatePageCompletion();
	}

//	public boolean isOpenFolder() {
//		return openFolder;
//	}

	public boolean isOverwriteFile() {
		return overwriteFile;
	}

	public void setDestinationValue(String destinationValue) {
		this.destinationValue = destinationValue;
	}

//	public void setOpenFolder(boolean openFolder) {
//		this.openFolder = openFolder;
//	}

	public void setOverwriteFile(boolean overwriteFile) {
		this.overwriteFile = overwriteFile;
	}

	/**
	 *
	 */
	private void updatePageCompletion() {
		if (project != null) {
			if(!project.isOpen()) {
				setErrorMessage("The selected project is closed. Please open it and try again.");
				setPageComplete(false);
				return;
			}
		} else {
			this.setErrorMessage("You must first select an open project to export.");
			this.setPageComplete(false);
			return;
		}
		if(getDestinationValue() == null || "".equals(getDestinationValue().trim())) {
			this.setErrorMessage("You must select a file location for the export.");
			this.setPageComplete(false);
			return;
		}
		File f = new File(getDestinationValue());
		if(f.exists() && !this.overwriteFile) {
			this.setErrorMessage("File exists, please select another or select the overwrite option.");
			this.setPageComplete(false);
			return;
		}
		this.setErrorMessage(null);
		this.setPageComplete(true);
	}
}
