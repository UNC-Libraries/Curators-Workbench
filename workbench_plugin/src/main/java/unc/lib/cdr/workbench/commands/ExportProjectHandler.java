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

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class ExportProjectHandler extends AbstractHandler implements IHandler {

	@SuppressWarnings("unchecked")
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection s = (IStructuredSelection)HandlerUtil.getCurrentSelection(event);
		for(IProject p : (List<IProject>)s.toList()) {
			try {
				MetsProjectNature.get(p).save();
				p.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			} catch(CoreException e) {
				e.printStackTrace();
				throw new ExecutionException("Unexpected problem", e);
			}
		}
		
		@SuppressWarnings("restriction")
		IHandler export = new org.eclipse.ui.internal.handlers.WizardHandler.Export();
		export.execute(event);
		return null;
	}

}
