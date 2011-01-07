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
package unc.lib.cdr.workbench.accession;

import java.net.URI;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gregory Jansen
 *
 */
public class OriginalsInfoPage extends WizardPage {

    private static final Logger LOG = LoggerFactory.getLogger(OriginalsInfoPage.class);

    private Text nameText;
    private Text descriptionText;
    //private List mediaList;

    public Text getNameText() {
	return nameText;
    }

    public Text getDescriptionText() {
	return descriptionText;
    }

    //public List getMediaList() {
	//return mediaList;
    //}

    private Composite container;
    private IProject project;

    /**
     * @param pageName
     */
    protected OriginalsInfoPage(IProject project) {
	super("Describe this set of originals");
	this.project = project;
	setTitle("Describe Originals");
	setDescription("Name and describe this set of linked original files.");
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
	container = new Composite(parent, SWT.NULL);
	GridLayout layout = new GridLayout();
	container.setLayout(layout);
	layout.numColumns = 2;
	Label label1 = new Label(container, SWT.NULL);
	label1.setText("Name");

	nameText = new Text(container, SWT.BORDER | SWT.SINGLE);
	// grab nameText from location URI
	nameText.setText("");

	nameText.addKeyListener(new KeyListener() {

	    @Override
	    public void keyPressed(KeyEvent e) {
	    }

	    @Override
	    public void keyReleased(KeyEvent e) {
		if (!nameText.getText().isEmpty()) {
		    String n = nameText.getText();
		    if (!project.getFolder(n).exists()) {
			setPageComplete(true);
		    } else {
			setErrorMessage("The name you give the folder of originals must be unique within the project.");
		    }
		}
	    }

	});
	GridData gd = new GridData(GridData.FILL_HORIZONTAL);
	nameText.setLayoutData(gd);

	Label label3 = new Label(container, SWT.NULL);
	label3.setText("Description");

	descriptionText = new Text(container, SWT.BORDER | SWT.SINGLE);
	descriptionText.setText("");
	GridData gd2 = new GridData(GridData.FILL_HORIZONTAL);
	descriptionText.setLayoutData(gd2);

	//Label label2 = new Label(container, SWT.NULL);
	//label2.setText("Media Type");

	//mediaList = new List(container, SWT.SINGLE);
	//mediaList.setItems(new String[] { "foo", "barr" });

	// Required to avoid an error in the system
	setControl(container);
	checkPageComplete();
    }

    /**
     *
     */
    public void initializeName() {
	String name = null;
	try {
	    URI location = ((LinkOriginalsWizard) getWizard()).getSelectedLocation();
	    if (location != null) {
		LOG.debug("got location "+location.toString());
		IFileStore fs;
		fs = EFS.getStore(location);
		name = fs.getName();
	    }
	} catch (CoreException ignored) {
	    ignored.printStackTrace();
	}
	if(name != null) {
	    nameText.setText(name);
	    checkPageComplete();
	}
    }

    private void checkPageComplete() {
	if (!nameText.getText().isEmpty()) {
	    String n = nameText.getText();
	    if (!project.getFolder(n).exists()) {
		setPageComplete(true);
	    } else {
		setPageComplete(false);
		setErrorMessage("The name you give the folder of originals must be unique within the project.");
	    }
	}
    }
}
