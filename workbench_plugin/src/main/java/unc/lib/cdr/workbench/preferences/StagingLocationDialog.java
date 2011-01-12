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
package unc.lib.cdr.workbench.preferences;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author Gregory Jansen
 *
 */
public class StagingLocationDialog extends TitleAreaDialog {
    Text nameText = null;
    Text uriText = null;
    String name = null;
    String uri = null;
    String title = null;

    String locMsg = "You may use these variables to create a project-based location:\n"+
	" ${PROJECT_HOME} - the project folder, for using a sub-folder\n" +
	" ${PROJECT_NAME} - name of the project, for using a central staging location";

    /**
     * @param parentShell
     * @param title
     */
    protected StagingLocationDialog(Shell parentShell, String title) {
	super(parentShell);
	this.title = title;
	//setMessage(locMsg);
    }

    public String getName() {
	return this.name;
    }

    @Override
    protected Control createDialogArea(Composite parent) {
	Composite composite = new Composite(parent, SWT.NULL);
	composite.setLayout(new GridLayout(2, false));
	composite.setLayoutData(new GridData(GridData.FILL_BOTH));

	Text messageLabel = new Text(parent, SWT.WRAP | SWT.READ_ONLY);
	messageLabel.setText(locMsg); // two lines//$NON-NLS-1$
	messageLabel.setFont(JFaceResources.getDialogFont());
	messageLabel.setBackground(composite.getBackground());
	GridData gd = new GridData(GridData.FILL_BOTH);
	gd.horizontalSpan = 2;
	messageLabel.setLayoutData(gd);

	Label l1 = new Label(composite, SWT.NULL);
	l1.setText("Name");
	ModifyListener lis = new ModifyListener() {
	    @Override
	    public void modifyText(ModifyEvent e) {
		textChanged();
	    }
	};
	nameText = new Text(composite, SWT.BORDER);
	if(name != null) {
	    nameText.setText(name);
	}
	nameText.addModifyListener(lis);
	Label l2 = new Label(composite, SWT.NULL);
	l2.setText("Location");
	uriText = new Text(composite, SWT.BORDER);
	if(uri != null) {
	    uriText.setText(uri);
	}
	uriText.addModifyListener(lis);

	setTitle(title);
	setMessage("Enter a name and location.");

	return composite;
    }

    private void textChanged() {
	if(nameText.getText().length() > 0 && uriText.getText().length() > 0) {
	    this.getButton(IDialogConstants.OK_ID).setEnabled(true);
	} else {
	    this.getButton(IDialogConstants.OK_ID).setEnabled(false);
	}
    }

    @Override
    protected void okPressed() {
	this.name = nameText.getText();
	this.uri = uriText.getText();
	super.okPressed();
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setName(String name) {
        this.name = name;
    }

}
