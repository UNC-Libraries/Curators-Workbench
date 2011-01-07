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

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.irods.jargon.core.connection.IRODSAccount;
import org.irods.jargon.core.exception.JargonException;
import org.irods.jargon.core.pub.IRODSFileSystem;
import org.irods.jargon.core.pub.io.IRODSFile;
import org.irods.jargon.core.pub.io.IRODSFileFactory;

/**
 * @author Gregory Jansen
 *
 */
public class IrodsConnectionDialog extends TitleAreaDialog {

    private Text usernameText;
    private Text passwordText;
    private Text serverText;
    private Text portText;
    private Text zoneText;
    private Text defResourceText;
    private Text homeDirectoryText;
    private Button okButton;
    private IRODSAccount account;
    private IRODSAccount input;
    private URI location;

    /**
     * @param parentShell
     */
    public IrodsConnectionDialog(Shell parentShell) {
	super(parentShell);
    }

    /**
     * @param parentShell
     */
    public IrodsConnectionDialog(Shell parentShell, IRODSAccount input) {
	super(parentShell);
	this.input = input;
    }

    /**
     * @param parentShell
     */
    public IrodsConnectionDialog(Shell parentShell, String uri) {
	super(parentShell);
	// get account for input or make one
	URI i;
	try {
	    i = new URI(uri);
	    this.input = new IRODSAccount(i.getHost(), i.getPort(), null, null, i.getPath(), i.getPath().split("/")[0], null);
	} catch (URISyntaxException e) {
	    throw new IllegalArgumentException("failed to setup account from URI: "+uri, e);
	}
    }

    @Override
    public void create() {
	super.create();
	setTitle("Set up an iRODS Connection");
	setMessage("Provide and test iRODS connection settings.", IMessageProvider.INFORMATION);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
	GridLayout layout = new GridLayout();
	layout.numColumns = 2;
	// layout.horizontalAlignment = GridData.FILL;
	parent.setLayout(layout);

	// The text fields will grow with the size of the dialog
	GridData gridData = new GridData();
	gridData.grabExcessHorizontalSpace = true;
	gridData.horizontalAlignment = GridData.FILL;

	Label label3 = new Label(parent, SWT.NONE);
	label3.setText("Server Host");
	serverText = new Text(parent, SWT.BORDER);
	serverText.setLayoutData(gridData);

	Label label4 = new Label(parent, SWT.NONE);
	label4.setText("Server Port");
	portText = new Text(parent, SWT.BORDER);
	portText.setLayoutData(gridData);

	Label label5 = new Label(parent, SWT.NONE);
	label5.setText("Zone Name");
	zoneText = new Text(parent, SWT.BORDER);
	zoneText.setLayoutData(gridData);

	Label label1 = new Label(parent, SWT.NONE);
	label1.setText("Username");
	usernameText = new Text(parent, SWT.BORDER);
	usernameText.setLayoutData(gridData);

	Label label2 = new Label(parent, SWT.NONE);
	label2.setText("Password");
	passwordText = new Text(parent, SWT.BORDER);
	passwordText.setLayoutData(gridData);

	Label label6 = new Label(parent, SWT.NONE);
	label6.setText("Default Resource");
	defResourceText = new Text(parent, SWT.BORDER);
	defResourceText.setLayoutData(gridData);

	Label label7 = new Label(parent, SWT.NONE);
	label7.setText("Directory");
	homeDirectoryText = new Text(parent, SWT.BORDER);
	homeDirectoryText.setLayoutData(gridData);

	// set some defaults
	portText.setText("1247");
	homeDirectoryText.setText("/");

	// setup fields from input account
	if (input != null) {
	    //usernameText.setText(input.getUserName());
	    //passwordText.setText(input.getPassword());
	    serverText.setText(input.getHost());
	    portText.setText(Integer.toString(input.getPort()));
	    zoneText.setText(input.getZone());
	    //defResourceText.setText(input.getDefaultStorageResource());
	    if (input.getHomeDirectory() != null && !"".equals(input.getHomeDirectory().trim())) {
		homeDirectoryText.setText(input.getHomeDirectory());
	    }
	}
	return parent;
    }

    @Override
    protected void createButtonsForButtonBar(Composite parent) {
	GridData gridData = new GridData();
	gridData.verticalAlignment = GridData.FILL;
	gridData.horizontalSpan = 3;
	gridData.grabExcessHorizontalSpace = true;
	gridData.grabExcessVerticalSpace = true;
	gridData.horizontalAlignment = SWT.CENTER;

	parent.setLayoutData(gridData);
	// Create Add button
	// Own method as we need to overview the SelectionAdapter
	createOkButton(parent, OK, "Okay", true);

	// Create Cancel button
	Button cancelButton = createButton(parent, CANCEL, "Cancel", false);

	// Add a SelectionListener
	cancelButton.addSelectionListener(new SelectionAdapter() {
	    @Override
	    public void widgetSelected(SelectionEvent e) {
		setReturnCode(CANCEL);
		close();
	    }
	});

	// Create Test button
	Button testButton = createButton(parent, IDialogConstants.PROCEED_ID, "Test", false);

	// Add a SelectionListener
	testButton.addSelectionListener(new SelectionAdapter() {
	    @Override
	    public void widgetSelected(SelectionEvent e) {
		if (validFormInputs()) {
		    makeAccount();
		    testConnection();
		}
	    }
	});
    }

    private boolean validFormInputs() {
	boolean result = false;
	try {
	    Integer.parseInt(this.portText.getText());
	    result = true;
	} catch (NumberFormatException e) {
	    setMessage("Server Port must be a number, e.g. \"1247\"");
	    result = false;
	}
	return result;
    }

    private boolean testConnection() {
	boolean result = false;
	try {
	    IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
	    IRODSFileFactory ff = irodsFileSystem.getIRODSFileFactory(this.account);
	    IRODSFile file = ff.instanceIRODSFile(account.getHomeDirectory());
	    result = file.exists();
	    if (!file.exists()) {
		setMessage("Connection succeeded but directory doesn't exist: " + account.getHomeDirectory(),
				IMessageProvider.ERROR);
	    }
	} catch (JargonException e) {
	    String msg = null;
	    if (e.getCause() != null) {
		msg = e.getCause().getLocalizedMessage();
	    } else {
		msg = e.getLocalizedMessage();
	    }
	    setMessage("Connection failed: " + msg, IMessageProvider.ERROR);
	}
	if (result) {
	    setMessage("Connection succeeded", IMessageProvider.INFORMATION);
	    this.okButton.setEnabled(true);
	} else {
	    this.okButton.setEnabled(false);
	}
	return result;
    }

    /**
     * @param parent
     * @param ok
     * @param string
     * @param b
     */
    private Button createOkButton(Composite parent, int ok, String string, boolean defaultButton) {
	// increment the number of columns in the button bar
	((GridLayout) parent.getLayout()).numColumns++;
	okButton = new Button(parent, SWT.PUSH);
	okButton.setEnabled(false);
	okButton.setText(string);
	// button.setFont(JFaceResources.getDialogFont());
	// button.setData(new Integer(id));
	okButton.addSelectionListener(new SelectionAdapter() {
	    @Override
	    public void widgetSelected(SelectionEvent event) {
		okPressed();
	    }
	});
	if (defaultButton) {
	    Shell shell = parent.getShell();
	    if (shell != null) {
		shell.setDefaultButton(okButton);
	    }
	}
	setButtonLayoutData(okButton);
	return okButton;
    }

    @Override
    protected boolean isResizable() {
	return true;
    }

    @Override
    protected void okPressed() {
	if (validFormInputs()) {
	    makeAccount();
	    if (testConnection()) {
		super.okPressed();
		IrodsEFSFileSystem.storeConnectionDetails(this.account);
		try {
		    this.location = IrodsEFSFileSystem.removeUserInfo(this.account.toURI(false));
		} catch (JargonException e) {
		    throw new Error(e);
		}
	    }
	}
    }

    /**
     *
     */
    private void makeAccount() {
	int port = Integer.parseInt(this.portText.getText());
	IRODSAccount result = new IRODSAccount(this.serverText.getText(), port, this.usernameText.getText(),
			this.passwordText.getText(), this.homeDirectoryText.getText(), this.zoneText.getText(),
			this.defResourceText.getText());
	account = result;
    }

    public URI getLocation() {
	return this.location;
    }

}
