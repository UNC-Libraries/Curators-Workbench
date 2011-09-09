/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package unc.lib.cdr.workbench.project;

import java.net.URI;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class NewSipProjectWizard extends Wizard implements INewWizard {
	private WizardNewProjectCreationPage _pageOne;
	private NewProjectStagingPage _pageTwo;
	IWorkbench workbench = null;

	public NewSipProjectWizard() {
	}

	@Override
	public boolean performFinish() {
		String name = _pageOne.getProjectName();
		URI location = null;
		if (!_pageOne.useDefaults()) {
			location = _pageOne.getLocationURI();
		}
		boolean autostage = _pageTwo.isAutoStage();
		try {
		IProject prog = MetsProjectNatureSupport.createProject(name, location, autostage);
		URI stageURI = _pageTwo.computeStageLocation(prog.getLocationURI(), prog.getName());
		MetsProjectNature.setStagingBase(stageURI, prog);
		} catch(CoreException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public void addPages() {
		super.addPages();
		_pageOne = new WizardNewProjectCreationPage("New Project Wizard");
		_pageOne.setTitle("Project Name");
		_pageOne.setDescription("Give your project a descriptive name.");
		_pageTwo = new NewProjectStagingPage("Staging");
		_pageTwo.setTitle("Staging Location");
		_pageTwo.setDescription("Choose a staging location for captured files.");
		_pageTwo.setMainPage(_pageOne);
		addPage(_pageOne);
		addPage(_pageTwo);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
	}

}
