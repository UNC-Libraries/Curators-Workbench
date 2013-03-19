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
package unc.lib.cdr.workbench.commands;

import gov.loc.mets.DivType;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;

import unc.lib.cdr.workbench.originals.OriginalFileStore;
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
					OriginalFileStore r = MetsProjectNature.getOriginal(d);
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
		final IFileStore tempStore = EFS.getLocalFileSystem().getStore(temppath);
		if(!tempStore.fetchInfo().exists()) {
			try {
				tempStore.getParent().mkdir(EFS.NONE, new NullProgressMonitor());
				file.copy(tempStore, EFS.OVERWRITE, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
				throw new ExecutionException("Cannot copy file to temporary location: "+e.getMessage());
			}
		}
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

			@Override
			public void run() {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditorOnFileStore(page, tempStore);
				} catch (PartInitException e) {
					e.printStackTrace();
				}				
			}});
	}

}
