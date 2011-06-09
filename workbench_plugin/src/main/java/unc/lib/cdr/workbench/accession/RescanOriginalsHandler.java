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
package unc.lib.cdr.workbench.accession;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class RescanOriginalsHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection select = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		Object sel = select.getFirstElement();
		IResource target = null;
		if (sel instanceof OriginalFoldersProjectElement) {
			target = ((OriginalFoldersProjectElement) sel).getProject();
		} else if (sel instanceof IResource) {
			target = (IResource) sel;
		}
		try {
			target.refreshLocal(IFolder.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			throw new ExecutionException("Cannot refresh originals.", e);
		}
		return null;
	}

}
