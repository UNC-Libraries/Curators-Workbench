/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
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
package irods.efs.plugin;

import java.io.File;
import java.net.URI;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

/**
 * @author Gregory Jansen
 *
 */
public class PickLocationPage extends WizardPage {

    // constants
    private static final int SIZING_TEXT_FIELD_WIDTH = 250;
    private static final String IRODS_FS = "iRODS Collection";
    private static final String LOCAL_FS = "Local Folder";

    // widgets
    private List fileSystems;
    private Button browseButton;
    private Text locationPathField;

    private String locationName;

    public String getLocationName() {
	return locationName;
    }

    private URI location;

    public URI getSelectedLocation() {
	return location;
    }

    private Listener modifyListener = new Listener() {
	public void handleEvent(Event e) {
	    boolean valid = validatePage();
	    setPageComplete(valid);
	}
    };

    /**
     * @param pageName
     */
    public PickLocationPage(String pageName) {
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
	initializeDialogUnits(parent);

	composite.setLayout(new GridLayout());
	composite.setLayoutData(new GridData(GridData.FILL_BOTH));

	createLocationGroup(composite);

	setPageComplete(validatePage());
	// Show description on opening
	setErrorMessage(null);
	setMessage(null);
	setControl(composite);
	Dialog.applyDialogFont(composite);
    }

    /**
     *
     */
    protected void handleLocationBrowseButtonPressed() {
	String selectedDirectory = null;
	int i = fileSystems.getSelectionIndex();
	if (i == 0) {
	    DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.SHEET);
	    dialog.setMessage("Select the location");
	    selectedDirectory = dialog.open();
	    if(selectedDirectory != null) {
		location = new File(selectedDirectory).toURI();
	    }
	} else if (i == 1) {
	    IrodsConnectionDialog dialog = new IrodsConnectionDialog(getShell());
	    //dialog.setMessage("Enter connection settings and pick a directory.");
	    if(IrodsConnectionDialog.OK == dialog.open()) {
		location = dialog.getLocation();
	    }
	} else {
	    throw new Error("Unrecognized file system: " + i);
	}
	if (location != null) {
	    selectedDirectory = location.toString();
	}
	// set page complete

	// update location label
	if (selectedDirectory != null) {
	    locationPathField.setText(selectedDirectory);
	}
    }

    /**
     * Creates the name controls.
     *
     * @param parent
     *            the parent composite
     */
    private final void createLocationGroup(Composite parent) {
	// project specification group
	Composite group = new Composite(parent, SWT.NONE);
	GridLayout layout = new GridLayout();
	layout.numColumns = 2;
	layout.verticalSpacing = 20;
	group.setLayout(layout);
	group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	Label fileSystemTitle;
	fileSystemTitle = new Label(group, SWT.NONE);
	fileSystemTitle.setText("Type");

	fileSystems = new List(group, SWT.SINGLE);
	fileSystems.setItems(new String[] { LOCAL_FS, IRODS_FS });
	fileSystems.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL));
	fileSystems.select(0);

	// new project label
	Label label = new Label(group, SWT.NONE);
	label.setText("Location");
	label.setFont(parent.getFont());

	// new project name entry field
	locationPathField = new Text(group, SWT.BORDER);
	GridData data = new GridData(GridData.FILL_HORIZONTAL);
	data.widthHint = SIZING_TEXT_FIELD_WIDTH;
	locationPathField.setLayoutData(data);
	locationPathField.setFont(parent.getFont());
	locationPathField.setEnabled(false);

	// browse button
	browseButton = new Button(group, SWT.PUSH);
	browseButton.setText("Select");
	browseButton.addSelectionListener(new SelectionAdapter() {
	    @Override
	    public void widgetSelected(SelectionEvent event) {
		handleLocationBrowseButtonPressed();
	    }
	});
	// Scale the button based on the rest of the dialog
	setButtonLayoutData(browseButton);
	locationPathField.addListener(SWT.Modify, modifyListener);
    }

    /**
     * Returns whether this page's controls currently all contain valid values.
     *
     * @return <code>true</code> if all controls are valid, and
     *         <code>false</code> if at least one is invalid
     */
    public boolean validatePage() {
	String validLocationMessage = checkValidLocation();
	if (validLocationMessage != null) {
	    setErrorMessage(validLocationMessage);
	    return false;
	}
	setErrorMessage(null);
	setMessage(null);
	return true;
    }

    /**
     * @return
     */
    private String checkValidLocation() {
	// TODO validate it
	if (this.location != null) {
	    return null;
	} else {
	    return "You have not selected a valid location";
	}
    }

}
