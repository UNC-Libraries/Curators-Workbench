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

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

import unc.lib.cdr.workbench.rcp.Activator;

public class Initializer extends AbstractPreferenceInitializer {

	public Initializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		URL cUrl = Activator.getDefault().getBundle().getResource("initialStagingAreasConfig.json");
		StringBuilder sb = new StringBuilder();
		try(BufferedReader r = new BufferedReader(new InputStreamReader(cUrl.openStream()))) {
			for(String line = r.readLine(); line != null; line = r.readLine()) {
				sb.append(line).append('\n');
			}
		} catch(IOException e) {
			throw new Error("Unexpected issue loading JSON file", e);
		}
		String localStagingConfig = sb.toString();
		
		IEclipsePreferences prefs = DefaultScope.INSTANCE.getNode(Activator.PLUGIN_ID);
		prefs.put(Activator.LOCAL_STAGING_CONFIG_JSON, localStagingConfig);
		
		List<String[]> locs = new ArrayList<String[]>();
		
		locs.add(new String[] { "CDR Staging iRODS Grid",
		"irods://${USER_NAME}@cdr-stage.lib.unc.edu:3333/stagingZone/home/${USER_NAME}/${PROJECT_NAME}" });
		
		locs.add(new String[] { "StorHouse processing folder", "file:/Z:/in_process/${PROJECT_NAME}" });
		
		// set Local Staging Folder
		String osUserHome = (String) System.getProperties().get("user.home");
		File dir = new File(osUserHome + "/workbench_staging");
		locs.add(new String[] { "Staging folder in home directory", dir.toURI().toString() + "${PROJECT_NAME}" });
		
		// add the relative to project folder option (using dynamic path variable for PROJECT_PATH)
		locs.add(new String[] { "Data folder within project (Bag-It style)", "${PROJECT_LOC}/data" });
		
		String str = Activator.convertLocationsToPref(locs);
		// Activator.getDefault().getLog().log(new Status(IStatus.INFO, Activator.PLUGIN_ID, "setting defaults: "+str));

		prefs.put(Activator.STAGE_LOCATIONS, str);
	}
}
