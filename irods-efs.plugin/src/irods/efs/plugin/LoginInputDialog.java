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

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author Gregory Jansen
 *
 */
public class LoginInputDialog extends Dialog {
    String message;
    URI irodsURI;
    String defaultUsername;
    Text textUsername;
    Text textPassword;
    Shell shell = null;

    String username = null;
    String password = null;

    /**
     * @param parentShell
     */
    protected LoginInputDialog(Shell parentShell, String message, URI irodsURI, String defaultUsername) {
	super(parentShell);
	this.message = message;
	this.irodsURI = irodsURI;
	this.defaultUsername = defaultUsername;
	this.textPassword = null;
	this.textUsername = null;
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
	Group group = new Group(composite, SWT.None);
	group.setText("");

	group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	group.setLayout(new GridLayout(2, true));
	Label grid = new Label(group, SWT.None);
	grid.setText("Location");
	Text gridText = new Text(group,SWT.BORDER);
	gridText.setText(irodsURI.toString());
	gridText.setEnabled(false);

	Label userId = new Label(group, SWT.None);
	userId.setText("Username");

	textUsername = new Text(group,SWT.BORDER);
	textUsername.setText(this.defaultUsername);
	textUsername.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	Label userPsw = new Label(group, SWT.None);
	userPsw.setText("Password");

	textPassword = new Text(group,SWT.PASSWORD |SWT.BORDER);
	textPassword.setText("");
	textPassword.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	group.pack();
	composite.pack();
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

}
