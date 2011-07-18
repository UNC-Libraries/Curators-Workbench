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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

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
	public static IProject createProject(String projectName, URI location, boolean autostage) {
		Assert.isNotNull(projectName);
		Assert.isTrue(projectName.trim().length() > 0);
		NullProgressMonitor npm = new NullProgressMonitor();
		IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (!newProject.exists()) {
			URI projectLocation = location;
			IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
			setProjectDescription(desc, autostage);
			if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
				projectLocation = null;
			}
			desc.setLocationURI(projectLocation);
			try {
				newProject.create(desc, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		try {
			if (!newProject.isOpen()) {
				newProject.open(npm);
			}
		} catch (CoreException e) {
			e.printStackTrace();
			newProject = null;
		}
		return newProject;
	}

	/**
	 * Just do the basics: create a basic project.
	 *
	 * @param location
	 * @param projectName
	 */
	private static void setProjectDescription(IProjectDescription desc, boolean autostage) {
		// add the nature to description
		String[] prevNatures = desc.getNatureIds();
		String[] newNatures = new String[prevNatures.length + 1];
		System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
		newNatures[prevNatures.length] = MetsProjectNature.NATURE_ID;
		desc.setNatureIds(newNatures);

		// create staging builder
		ICommand stagingCommand = desc.newCommand();
		stagingCommand.setBuilderName(MetsProjectNature.STAGING_BUILDER_ID);
		stagingCommand.setBuilding(IncrementalProjectBuilder.AUTO_BUILD, autostage);
		stagingCommand.setBuilding(IncrementalProjectBuilder.FULL_BUILD, true);
		stagingCommand.setBuilding(IncrementalProjectBuilder.INCREMENTAL_BUILD, true);

		// create crosswalks builder
		ICommand crosswalksCommand = desc.newCommand();
		crosswalksCommand.setBuilderName(MetsProjectNature.CROSSWALKS_BUILDER_ID);
		crosswalksCommand.setBuilding(IncrementalProjectBuilder.AUTO_BUILD, true);
		crosswalksCommand.setBuilding(IncrementalProjectBuilder.FULL_BUILD, true);
		crosswalksCommand.setBuilding(IncrementalProjectBuilder.INCREMENTAL_BUILD, true);

		// add builders to project description
		List<ICommand> builders = new ArrayList<ICommand>();
		builders.add(stagingCommand);
		builders.add(crosswalksCommand);
		desc.setBuildSpec(builders.toArray(new ICommand[2]));
	}

}
