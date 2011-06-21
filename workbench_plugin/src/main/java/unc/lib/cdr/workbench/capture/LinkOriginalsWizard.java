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
package unc.lib.cdr.workbench.capture;

import irods.efs.plugin.PickLocationPage;

import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

/**
 * @author Gregory Jansen
 * 
 */
public class LinkOriginalsWizard extends Wizard {
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (_pageOne.equals(page)) {
			_pageTwo.initializeName();
		}
		return super.getNextPage(page);
	}

	PickLocationPage _pageOne;
	OriginalsInfoPage _pageTwo;
	IProject project;
	String name;
	String description;

	// String media;

	public LinkOriginalsWizard(IProject project) {
		this.project = project;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();
		// first page: pick original file location
		_pageOne = new PickLocationPage("Add an Original File Location");
		_pageOne.setTitle("File Location");
		_pageOne.setDescription("Add a new file location to your workbench project.");
		addPage(_pageOne);

		// second page: name and describe the file set
		_pageTwo = new OriginalsInfoPage(project);
		addPage(_pageTwo);
		// FINISH
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#canFinish()
	 */
	@Override
	public boolean canFinish() {
		return _pageTwo.isPageComplete() && _pageOne.validatePage();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#performCancel()
	 */
	@Override
	public boolean performCancel() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		saveInput();
		return true;
	}

	/**
     *
     */
	private void saveInput() {
		this.name = this._pageTwo.getNameText().getText();
		this.description = this._pageTwo.getDescriptionText().getText();
		// String[] m = this._pageTwo.getMediaList().getSelection();
		// if(m.length > 0) {
		// this.media = m[0];
		// } else {
		// this.media = null;
		// }
	}

	public URI getSelectedLocation() {
		return this._pageOne.getSelectedLocation();
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	// public String getMediaType() {
	// return this.media;
	// }

}
