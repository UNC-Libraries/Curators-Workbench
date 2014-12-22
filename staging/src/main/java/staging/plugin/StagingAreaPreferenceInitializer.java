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
package staging.plugin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

public class StagingAreaPreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		URL cUrl = StagingPlugin.getDefault().getBundle().getResource("initialStagingAreasConfig.json");
		StringBuilder sb = new StringBuilder();
		try(BufferedReader r = new BufferedReader(new InputStreamReader(cUrl.openStream()))) {
			for(String line = r.readLine(); line != null; line = r.readLine()) {
				sb.append(line).append('\n');
			}
		} catch(IOException e) {
			throw new Error("Unexpected issue loading JSON file", e);
		}
		String localStagingConfig = sb.toString();		
		IEclipsePreferences prefs = DefaultScope.INSTANCE.getNode(StagingPlugin.PLUGIN_ID);
		prefs.put(StagingPlugin.LOCAL_STAGING_CONFIG_JSON, localStagingConfig);
	}

}
