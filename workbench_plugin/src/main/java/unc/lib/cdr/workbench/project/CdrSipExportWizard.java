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

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;


public class CdrSipExportWizard extends Wizard implements IExportWizard {
	IWorkbench workbench = null;
	IStructuredSelection selection = null;
	PickExportFilePage page = null;
	IProject project = null;

	public CdrSipExportWizard() {
		this.setWindowTitle("Export");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		if (IProject.class.isInstance(selection.getFirstElement())) {
			this.project = (IProject) selection.getFirstElement();
		}
	}

	@Override
	public boolean performFinish() {
		CdrSipExportJob job = new CdrSipExportJob(project, this.page.getDestinationValue());
		job.schedule();
		try {
			job.join();
		} catch (InterruptedException e) {
		}
		if (this.page.openFile) {
			openFile();
		}
//		if (this.page.openFolder) {
//			openFolder();
//		}
		return true;
	}

	/**
	 *
	 */
	private void openFile() {
		IFileStore store = null;
		try {
			Path p = new Path(page.getDestinationValue());
			store = EFS.getStore(p.toFile().toURI());
		} catch (CoreException e) {
			e.printStackTrace();
			return;
		}

		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		System.out.print(page);
		try {
			IDE.openEditorOnFileStore(page, store);
		} catch (PartInitException e) {
			e.printStackTrace();
			return;
		}
	}

	@Override
	public void addPages() {
		super.addPages();
		page = new PickExportFilePage("page Name", project, "Carolina Digital Repository Submission (METS)", "cdr.xml");
		addPage(page);
	}

	@Override
	public boolean canFinish() {
		if (project == null)
			return false;
		if (!page.isPageComplete())
			return false;
		int[] stagedAndCaptured = MetsProjectNature
				.countStagedAndCaptured(project);
		int staged = stagedAndCaptured[0];
		int captured = stagedAndCaptured[1];
		if (captured - staged > 0) {
			page.setErrorMessage("There are still "
					+ (captured - staged)
					+ " out of "
					+ captured
					+ " files queued for staging. All captured files must be staged prior to export.");
			page.setPageComplete(false);
			return false;
		}
		return super.canFinish();
	}

}
