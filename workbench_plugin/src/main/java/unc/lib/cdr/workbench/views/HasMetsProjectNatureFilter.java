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
package unc.lib.cdr.workbench.views;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IFilter;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class HasMetsProjectNatureFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		if(toTest instanceof IProject) {
			IProject test = (IProject)toTest;
			try {
				return (test.isOpen() && test.hasNature(MetsProjectNature.NATURE_ID));
			} catch (CoreException e) {
				return false;
			}
		}
		return false;
	}

}
