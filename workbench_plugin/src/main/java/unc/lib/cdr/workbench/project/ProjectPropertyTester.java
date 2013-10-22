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

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;

public class ProjectPropertyTester extends PropertyTester {

	public ProjectPropertyTester() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		try {
			if (receiver instanceof IProject) {
				IProject project = (IProject) receiver;
				if ("open".equals(property)) {
					return project.isOpen();
				} else if ("closed".equals(property)) {
					return !project.isOpen();
				} else if ("fileSchemeStagingBase".equals(property)) {
					MetsProjectNature nature = MetsProjectNature.get(project);
					if(nature == null) return false;
					String scheme = nature.getStagingBase().getScheme();
					return "file".equals(scheme);
				}
			} else {
				return false;
			}
		} catch (Exception e) {
		}
		return false;
	}

}
