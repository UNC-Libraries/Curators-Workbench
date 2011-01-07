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
package unc.lib.cdr.workbench.xwalk.wiz;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

/**
 * @author Gregory Jansen
 *
 */
public class CreateCrosswalkPage extends WizardPage {
    private Composite container;
    private Text nameField = null;
    private String name = null;
    private Text fileField = null;
    private IFile file = null;
    private Class sourceType = null;
    private List mediaList;


    /**
     * @param pageName
     */
    protected CreateCrosswalkPage(String pageName) {
	super(pageName);
	this.setTitle(pageName);
	this.setDescription("Create a MODS crosswalk for a batch metadata file.");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IFile getFile() {
        return file;
    }

    public void setFile(IFile file) {
        this.file = file;
    }

    public Class getSourceType() {
        return sourceType;
    }

    public void setSourceType(Class sourceType) {
        this.sourceType = sourceType;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
     */
    @Override
    public void createControl(Composite parent) {
	container = new Composite(parent, SWT.NULL);
	GridLayout layout = new GridLayout();
	container.setLayout(layout);
	layout.numColumns = 2;
	// TODO name field
	Label label1 = new Label(container, SWT.NULL);
	label1.setText("Crosswalk Name");

	nameField = new Text(container, SWT.BORDER | SWT.SINGLE);
	if(this.getFile() != null) {
	    String defaultName = this.getFile().getName();
	    String ext = this.getFile().getFileExtension();
	    if(ext != null) {
		defaultName = defaultName.substring(0, defaultName.length() - (ext.length() + 1));
	    }
	    nameField.setText(defaultName);
	} else {
	    nameField.setText("");
	}

	Label label2 = new Label(container, SWT.NULL);
	label2.setText("Source File");

	fileField = new Text(container, SWT.BORDER | SWT.SINGLE);
	if(this.getFile() != null) {
	    fileField.setEnabled(false);
	    fileField.setText(this.getFile().getName());
	} else {
	    // TODO file picker if not a right click..
	}

	Label label3 = new Label(container, SWT.NULL);
	label3.setText("Metadata Format");
	mediaList = new List(container, SWT.SINGLE);
	mediaList.setItems(new String[] { "Tab-Delimited File (TDF)" });
	mediaList.setSelection(0);

	setControl(container);
	setPageComplete(true);
    }

}
