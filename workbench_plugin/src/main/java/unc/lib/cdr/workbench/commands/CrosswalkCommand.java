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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IWorkbenchSiteProgressService;

import unc.lib.cdr.workbench.xwalk.CrosswalkJob;

public class CrosswalkCommand extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection s = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		IFile file = (IFile) s.getFirstElement();
		
		CrosswalkJob job = new CrosswalkJob(file);
		
		IWorkbenchPart part = HandlerUtil.getActivePart(event);
		if (part != null) {
			IWorkbenchSiteProgressService siteService = (IWorkbenchSiteProgressService) part.getSite().getAdapter(
					IWorkbenchSiteProgressService.class);
			Shell shell = HandlerUtil.getActiveShell(event);
			siteService.showInDialog(shell, job);
			siteService.schedule(job);
		} else {
			job.schedule();
		}
		return null;
	}

}
