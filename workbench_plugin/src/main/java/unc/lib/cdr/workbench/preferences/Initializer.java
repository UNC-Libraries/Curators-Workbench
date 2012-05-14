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
package unc.lib.cdr.workbench.preferences;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.ui.IWorkbenchPreferenceConstants;

import unc.lib.cdr.workbench.rcp.Activator;

public class Initializer extends AbstractPreferenceInitializer {

	public Initializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		List<String[]> locs = new ArrayList<String[]>();
		// add the relative to project folder option (using dynamic path variable for PROJECT_PATH)
		locs.add(new String[] { "stage folder in project location", "${PROJECT_LOC}/.stage" });

		locs.add(new String[] { "CDR PROD iRODS",
		"irods://${USER_NAME}@cdr-vault.libint.unc.edu:3333/cdrZone/home/${USER_NAME}/staging/${PROJECT_NAME}" });

		// add example iRODS path (using dynamic path variable for project name)
		locs.add(new String[] { "CDR DEV iRODS",
				"irods://${USER_NAME}@cdr-dev-vault.libint.unc.edu:5555/cdrTestZone/home/${USER_NAME}/staging/${PROJECT_NAME}" });

		// set Local Staging Folder
		String osUserHome = (String) System.getProperties().get("user.home");
		File dir = new File(osUserHome + "/workbench_staging");
		locs.add(new String[] { "stage folder in user home", dir.toURI().toString() + "/${PROJECT_NAME}" });
		String str = Activator.convertLocationsToPref(locs);
		// Activator.getDefault().getLog().log(new Status(IStatus.INFO, Activator.PLUGIN_ID, "setting defaults: "+str));

		IEclipsePreferences prefs = new DefaultScope().getNode(Activator.PLUGIN_ID);
		prefs.put(Activator.STAGE_LOCATIONS, str);
	}

}
