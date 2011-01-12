package unc.lib.cdr.workbench.preferences;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

import unc.lib.cdr.workbench.rcp.Activator;

public class Initializer extends AbstractPreferenceInitializer {

    public Initializer() {
    }

    @Override
    public void initializeDefaultPreferences() {
	List<String[]> locs = new ArrayList<String[]>();
	// add the relative to project folder option (using dynamic path variable for PROJECT_PATH)
	locs.add(new String[] {"stage folder in project location", "${PROJECT_LOC}/stage"});

	// add example iRODS path (using dynamic path variable for project name)
	locs.add(new String[] {"example iRODS location", "irods://icat.example.com:1247/myZone/home/a_user_id/${PROJECT_NAME}/stage"});

	// set Local Staging Folder
	String osUserHome = (String) System.getProperties().get("user.home");
	File dir = new File(osUserHome + "/workbench_staging");
	locs.add(new String[] {"stage folder in user home", dir.toURI().toString()+"/${PROJECT_NAME}"});
	String str = Activator.convertLocationsToPref(locs);
	Activator.getDefault().getLog().log(new Status(IStatus.INFO, Activator.PLUGIN_ID, "setting defaults: "+str));

	IEclipsePreferences prefs = new DefaultScope().getNode(Activator.PLUGIN_ID);
	prefs.put(Activator.STAGE_LOCATIONS, str);
    }

}
