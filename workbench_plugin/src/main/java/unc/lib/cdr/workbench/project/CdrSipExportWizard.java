package unc.lib.cdr.workbench.project;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.Workbench;

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

		IWorkbenchPage page = Workbench.getInstance().getActiveWorkbenchWindow().getActivePage();
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
		page = new PickExportFilePage("page Name", project);
		addPage(page);
	}

	@Override
	public boolean canFinish() {
		if (project == null)
			return false;
		if (!page.isPageComplete())
			return false;
		return super.canFinish();
	}

}
