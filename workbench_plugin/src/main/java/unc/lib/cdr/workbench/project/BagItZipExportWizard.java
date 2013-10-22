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

public class BagItZipExportWizard extends Wizard implements IExportWizard {

	public BagItZipExportWizard() {
		this.setWindowTitle("Export BagIt ZIP Package");
	}
	IWorkbench workbench = null;
	IStructuredSelection selection = null;
	PickExportFilePage page = null;
	IProject project = null;

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
		BagItZipExportJob job = new BagItZipExportJob(project, this.page.getDestinationValue());
		job.schedule();
		try {
			job.join();
		} catch (InterruptedException e) {
		}
		if (this.page.openFile) {
			openFile();
		}
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
		page = new PickExportFilePage("Choose export destination", project, "Export BagIt ZIP Package", "zip");
		addPage(page);
	}

	@Override
	public boolean canFinish() {
		if (project == null)
			return false;
		if (!page.isPageComplete())
			return false;
		// TODO add warning if everything is not staged?
		return super.canFinish();
	}

}
