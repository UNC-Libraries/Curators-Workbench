package unc.lib.cdr.workbench.preferences;

import irods.efs.plugin.IrodsEFSFileSystem;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.irods.jargon.core.connection.IRODSAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.rcp.Activator;
import unc.lib.cdr.workbench.staging.StagingUtils;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {
    private static final Logger LOG = LoggerFactory.getLogger(PreferenceInitializer.class);

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
     * initializeDefaultPreferences()
     */
    @Override
    public void initializeDefaultPreferences() {
	IPreferenceStore store = Activator.getDefault().getPreferenceStore();

	Properties p = new Properties();
	try {
	    URL pURL = Activator.getDefault().getBundle().getEntry("/staging.properties");
	    p.load(pURL.openStream());
	} catch (IOException e1) {
	    throw new Error(e1);
	}

	// set iRODS URIs
	String osUserName = (String) System.getProperties().get("user.name");

	try {
	    String host = p.getProperty("prod.irods.host");
	    String port = p.getProperty("prod.irods.port");
	    String zone = p.getProperty("prod.irods.zone");
	    String resc = p.getProperty("prod.irods.resc");
	    String home = "/" + zone + "/home/" + osUserName + "/staging";
	    URI irods = new URI("irods://" + host + ":" + port + home);
	    store.setDefault(PreferenceConstants.P_PROD_IRODS_URI, irods.toString());
	    //store.setValue(PreferenceConstants.P_PROD_IRODS_URI, irods.toString());

	    // store connection info (without password)
	    int portNo = Integer.parseInt(port);
	    IRODSAccount a = new IRODSAccount(host, portNo, osUserName, null, home, zone, resc);
	    IrodsEFSFileSystem.storeConnectionDetails(a);
	} catch (URISyntaxException e) {
	    throw new Error(e);
	}

	try {
	    String host = p.getProperty("test.irods.host");
	    String port = p.getProperty("test.irods.port");
	    String zone = p.getProperty("test.irods.zone");
	    String resc = p.getProperty("test.irods.resc");
	    String home = "/" + zone + "/home/" + osUserName + "/staging";
	    URI irods = new URI("irods://" + host + ":" + port + home);
	    store.setDefault(PreferenceConstants.P_TEST_IRODS_URI, irods.toString());
	    //store.setValue(PreferenceConstants.P_TEST_IRODS_URI, irods.toString());

	    // store connection info (without password)
	    int portNo = Integer.parseInt(port);
	    IRODSAccount a = new IRODSAccount(host, portNo, osUserName, null, home, zone, resc);
	    IrodsEFSFileSystem.storeConnectionDetails(a);
	} catch (URISyntaxException e) {
	    throw new Error(e);
	}

	// set Local Staging Folder
	String osUserHome = (String) System.getProperties().get("user.home");
	File dir = new File(osUserHome + File.pathSeparator + "cdr_workbench_stage");
	if (dir.mkdir()) {
	    store.setDefault(PreferenceConstants.P_LOCAL_STAGE_PATH, dir.getPath());
	    //store.setValue(PreferenceConstants.P_LOCAL_STAGE_PATH, dir.getPath());
	}

	store.setDefault(PreferenceConstants.P_STAGE_CHOICE, PreferenceConstants.P_STAGE_CHOICE_IRODS_TEST);
	//store.setValue(PreferenceConstants.P_STAGE_CHOICE, PreferenceConstants.P_STAGE_CHOICE_IRODS_TEST);
	// IRODSAccount account = new IRODSAccount("localhost", 1247, "fedora",
	// "inst1repo",
	// "/count0Zone/home/fedora/stage", "count0Zone", "count0Resc");
	// IrodsEFSFileSystem.storeConnectionDetails(account);

	try {
	    StagingUtils.getStageRoot();
	} catch (CoreException e) {
	    LOG.error("There was a problem getting the staging root location on startup, should prompt for password.",
			    e);
	}
    }

}
