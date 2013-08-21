/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package unc.lib.cdr.workbench.project;

import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

import unc.lib.cdr.workbench.rcp.Activator;

/**
 * @author Gregory Jansen
 *
 */
public class MetsProjectNatureSupport {

	/**
	 * For this marvelous project we need to: - create the default Eclipse project - add the custom project nature -
	 * create the folder structure
	 *
	 * @param projectName
	 * @param location
	 * @param natureId
	 * @return
	 */
	public static IProject createProject(String projectName, URI location, boolean autostage) throws CoreException {
		Assert.isNotNull(projectName);
		Assert.isTrue(projectName.trim().length() > 0);
		NullProgressMonitor npm = new NullProgressMonitor();
		IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IProjectDescription desc = null;
		if (!newProject.exists()) {
			URI projectLocation = location;
			desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
			if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
				projectLocation = null;
			}
			desc.setLocationURI(projectLocation);
			newProject.create(desc, null);
		}
		if (!newProject.isOpen()) {
			newProject.open(npm);
		}
		// set initial autostage property
		ProjectScope s = new ProjectScope(newProject);
		IEclipsePreferences pref = s.getNode(Activator.PLUGIN_ID);
		pref.putBoolean(Activator.AUTOSTAGE_PREFERENCE, autostage);

		// add custom nature
		desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
		setupProjectDescription(desc, autostage);
		newProject.setDescription(desc, null);
		return newProject;
	}

	/**
	 * Just do the basics: create a basic project.
	 *
	 * @param location
	 * @param projectName
	 */
	private static void setupProjectDescription(IProjectDescription desc, boolean autostage) {
		// add the nature to description
		String[] prevNatures = desc.getNatureIds();
		String[] newNatures = new String[prevNatures.length + 1];
		System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
		newNatures[prevNatures.length] = MetsProjectNature.NATURE_ID;
		desc.setNatureIds(newNatures);
	}

}
