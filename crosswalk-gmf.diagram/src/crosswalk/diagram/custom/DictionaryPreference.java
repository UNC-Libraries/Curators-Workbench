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
