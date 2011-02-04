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

import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.StringButtonFieldEditor;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ide.dialogs.EncodingFieldEditor;

/**
 * @author Gregory Jansen
 *
 */
public class DelimitedFileDataSourceWizardPage extends WizardPage implements IWizardPage {

    // the label used to display selected dir/file.
    StringButtonFieldEditor fileFieldEditor;
    String filePath;

    Combo encodingCombo;
    String encoding;

    String fileFilterPath = System.getProperty("user.home");

    /**
     * @param pageName
     */
    protected DelimitedFileDataSourceWizardPage(String pageName) {
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
	initializeDialogUnits(parent);
	// top level group
	Composite topLevel = new Composite(parent, SWT.NONE);
	topLevel.setLayout(new GridLayout(2,false));
	//this.setMessage("Select the type of data source to crosswalk.", DialogPage.INFORMATION);

	fileFieldEditor = new FileFieldEditor("foo", "Delimited Text File", topLevel);

	EncodingFieldEditor encodingFieldEditor = new EncodingFieldEditor("foo12", "Text Encoding", topLevel);

	encodingCombo = new Combo(topLevel, SWT.SINGLE);

	// Show description on opening
	setErrorMessage(null);
	setMessage(null);
	setControl(topLevel);
    }

    public String getFilePath() {
	return this.filePath;
    }

    @Override
    public boolean canFlipToNextPage() {
	return (filePath != null);
    }

}
