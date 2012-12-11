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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.irods.jargon.core.connection.IRODSAccount;
import org.irods.jargon.core.connection.IRODSAccount.AuthScheme;
import org.irods.jargon.core.connection.auth.AuthResponse;
import org.irods.jargon.core.exception.JargonException;
import org.irods.jargon.core.pub.IRODSFileSystem;
import org.irods.jargon.core.pub.io.IRODSFile;
import org.irods.jargon.core.pub.io.IRODSFileFactory;

/**
 * @author Gregory Jansen
 * 
 */
public class LoginInputDialog extends TitleAreaDialog {
	String message;
	URI irodsURI;
	String zone;
	String defaultUsername;
	Text textUsername;
	Text textPassword;
	Shell shell = null;

	Button okButton;

	String username = null;
	String password = null;
	AuthScheme authScheme = null;
	IRODSAccount authenticatedIrodsAccount = null;

	/**
	 * @param parentShell
	 * @param pam 
	 */
	protected LoginInputDialog(Shell parentShell, String message, URI irodsURI, String defaultUsername, String zone, AuthScheme scheme) {
		super(parentShell);
		this.message = message;
		this.irodsURI = irodsURI;
		this.defaultUsername = defaultUsername;
		this.textPassword = null;
		this.textUsername = null;
		this.zone = zone;
		this.authScheme = scheme;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		createControls(composite);
		// add controls to composite as necessary
		return composite;
	}

	/**
	 * @param composite
	 */
	private void createControls(Composite composite) {
		shell = composite.getShell();
		shell.setText("iRODS Authentication");

		this.setMessage(message);
		Group group = new Group(composite, SWT.None);
		group.setText("");

		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setLayout(new GridLayout(2, true));
		Label grid = new Label(group, SWT.None);
		grid.setText("Location");
		Text gridText = new Text(group, SWT.BORDER);
		gridText.setText(irodsURI.toString());
		gridText.setEnabled(false);

		Label userId = new Label(group, SWT.None);
		userId.setText("Username");

		textUsername = new Text(group, SWT.BORDER);
		if (this.defaultUsername != null && !this.defaultUsername.isEmpty()) {
			textUsername.setText(this.defaultUsername);
			textUsername.setEditable(false);
		}
		textUsername.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Label userPsw = new Label(group, SWT.None);
		userPsw.setText("Password");

		textPassword = new Text(group, SWT.PASSWORD | SWT.BORDER);
		textPassword.setText("");
		textPassword.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		group.pack();
		composite.pack();
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
					IRODSAccount account = makeAccount();
					testConnection(account);
				}
			}
		});
	}

	/**
	 * @return
	 */
	protected IRODSAccount makeAccount() {
		IRODSAccount result = new IRODSAccount(this.irodsURI.getHost(), this.irodsURI.getPort(), textUsername.getText(),
				textPassword.getText(), "", zone, "fake");
		result.setAuthenticationScheme(authScheme);
		return result;
	}

	/**
	 * @return
	 */
	protected boolean validFormInputs() {
		return textPassword.getText() != null && !textPassword.getText().isEmpty() && textUsername.getText() != null
				&& !textUsername.getText().isEmpty();
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
	protected void okPressed() {
		this.username = this.textUsername.getText();
		this.password = this.textPassword.getText();
		super.okPressed();
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	private boolean testConnection(IRODSAccount account) {
		try {
			this.authenticatedIrodsAccount = null;
			IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
			AuthResponse ar = irodsFileSystem.getIRODSAccessObjectFactory().authenticateIRODSAccount(account);
			if(ar.isSuccessful()) {
				this.authenticatedIrodsAccount = ar.getAuthenticatedIRODSAccount();
				setMessage("Connection succeeded.", IMessageProvider.INFORMATION);
				this.okButton.setEnabled(true);
				return true;
			}
		} catch (JargonException e) {
			String msg = null;
			if (e.getCause() != null) {
				msg = e.getCause().getLocalizedMessage();
			} else {
				msg = e.getLocalizedMessage();
			}
			if (msg.contains("826000")) {
				setMessage("Connection failed: Bad username or password.", IMessageProvider.ERROR);
			} else {
				setMessage("Connection failed due to an error: " + msg, IMessageProvider.ERROR);
			}
		}
		this.okButton.setEnabled(false);
		return false;
	}

	public IRODSAccount getAuthenticatedIRODSAccount() {
		return this.authenticatedIrodsAccount;
	}

}
