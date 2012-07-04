package unc.lib.cdr.workbench.commands;

import gov.loc.mets.DivType;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;

import unc.lib.cdr.workbench.originals.OriginalsWrapperStore;
import unc.lib.cdr.workbench.project.MetsProjectNature;

public class OpenSystemEditorTempCopyHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveMenuSelection(event);
		if (selection instanceof IStructuredSelection) {
			for (Iterator it = ((IStructuredSelection) selection).iterator(); it.hasNext();) {
				Object element = it.next();
				if (element instanceof IFileStore) {
					IFileStore file = (IFileStore) element;
					openTempCopy(file, event);
				} else if(element instanceof DivType) {
					DivType d = (DivType)element;
					OriginalsWrapperStore r = MetsProjectNature.getOriginal(d);
					openTempCopy(r, event);
				}
			}
		}
		return null;
	}

	/**
	 * @param file
	 * @param event
	 * @throws ExecutionException
	 */
	private void openTempCopy(IFileStore file, ExecutionEvent event) throws ExecutionException {
		IPath origPath = new Path(file.toURI().getPath());
		String tmpdir = System.getProperty("java.io.tmpdir");
		IPath temppath = new Path(tmpdir).append(origPath.removeLastSegments(1));
		temppath = temppath.append(
				origPath.removeFileExtension().lastSegment() +
				" (Temporary Copy)." +
				origPath.getFileExtension());
		IFileStore tempStore = EFS.getLocalFileSystem().getStore(temppath);
		if(!tempStore.fetchInfo().exists()) {
			try {
				tempStore.getParent().mkdir(EFS.NONE, new NullProgressMonitor());
				file.copy(tempStore, EFS.OVERWRITE, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
				throw new ExecutionException("Cannot copy file to temporary location: "+e.getMessage());
			}
		}
		IWorkbenchPage page = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
		System.out.print(page);
		try {
			IDE.openEditorOnFileStore(page, tempStore);
		} catch (PartInitException e) {
			e.printStackTrace();
			throw new ExecutionException("Cannot open editor for temporary copy: "+e.getMessage());
		}
	}

}
