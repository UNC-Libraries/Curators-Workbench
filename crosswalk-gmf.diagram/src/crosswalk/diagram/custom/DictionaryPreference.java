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
package crosswalk.diagram.custom;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import crosswalk.diagram.part.CrosswalkDiagramEditorPlugin;

public class DictionaryPreference {
	public static final String DICTIONARY_LOCATIONS = "DICTIONARY_LOCATIONS";

	public static String convertLocationsToPref(List<URI> locs) {
		StringBuffer buffer = new StringBuffer();
		for (URI l : locs) {
			buffer.append(l.toString()).append("\n");
		}
		return buffer.toString();
	}

	public static List<URI> getDefaultLocations() {
		return convert(CrosswalkDiagramEditorPlugin.getInstance().getPreferenceStore()
				.getDefaultString(DICTIONARY_LOCATIONS));
	}

	public static List<URI> getLocations() {
		return convert(CrosswalkDiagramEditorPlugin.getInstance().getPreferenceStore().getString(DICTIONARY_LOCATIONS));
	}

	public static void setLocations(List<URI> locs) {
		CrosswalkDiagramEditorPlugin.getInstance().getPreferenceStore()
				.setValue(DICTIONARY_LOCATIONS, convertLocationsToPref(locs));
	}

	private static List<URI> convert(String str) {
		List<URI> result = new ArrayList<URI>();
		String[] lines = str.split("\n");
		for (String lin : lines) {
			if (lin != null && lin.trim().length() > 0) {
				URI u = URI.createURI(lin);
				result.add(u);
			}
		}
		return result;
	}

}
