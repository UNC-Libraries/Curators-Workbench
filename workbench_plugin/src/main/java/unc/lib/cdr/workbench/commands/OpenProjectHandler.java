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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenProjectHandler extends AbstractHandler implements IHandler {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(OpenProjectHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// IWorkbenchPart part = HandlerUtil.getActivePart(event);
		IStructuredSelection sel = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		for (Object foo : sel.toArray()) {
			if (foo != null && foo instanceof IProject) {
				IProject p = (IProject) foo;
				try {
					p.open(new NullProgressMonitor());
				} catch (CoreException e) {
					throw new ExecutionException("Cannot open project.", e);
				}
			}
		}
		return null;
	}
}
