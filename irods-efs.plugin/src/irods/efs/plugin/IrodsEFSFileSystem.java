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
package irods.efs.plugin;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.provider.FileSystem;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.irods.jargon.core.connection.IRODSAccount;

public class IrodsEFSFileSystem extends FileSystem {

    public IrodsEFSFileSystem() {
	super();
    }

    /*
     * This method retrieves FileStore objects based on the irods scheme. iRODS
     * URIs look like this;
     *
     * irods://myUser:myPassword@myirodshost.org:1247/myDirectory/myFile
     *
     * @see
     * org.eclipse.core.filesystem.provider.FileSystem#getStore(java.net.URI)
     */
    @Override
    public IFileStore getStore(URI uri) {
	// get IRODS file store (handle only) for URI
	return new IrodsFileStore(uri);
    }

    /**
     * For this base server URI, save zone, password, username, etc in
     * application preferences.
     *
     * @param a
     * @return the server base URI for which connection details are stored
     */
    public static URI storeConnectionDetails(IRODSAccount a) {
	URI serverURI = getGridURI(a.getHost(), a.getPort());
	IPreferenceStore store = Activator.getDefault().getPreferenceStore();
	if (a.getPassword() != null) {
	    store.setValue(serverURI + "#password", a.getPassword());
	}
	if (a.getUserName() != null) {
	    store.setValue(serverURI + "#username", a.getUserName());
	}
	if (a.getZone() != null) {
	    store.setValue(serverURI + "#zone", a.getZone());
	}
	if (a.getDefaultStorageResource() != null) {
	    store.setValue(serverURI + "#defaultResource", a.getDefaultStorageResource());
	}
	if (a.getHomeDirectory() != null) {
	    store.setValue(serverURI + "#homeDirectory", a.getHomeDirectory());
	}
	return serverURI;
    }

    /**
     * For this server URI, load zone, password, username, etc in application
     * preferences. Will prompt user if preferences have not been stored.
     *
     * @param uri
     */
    protected static IRODSAccount getAccount(URI uri) {
	IRODSAccount result = null;
	URI serverURI = getGridURI(uri.getHost(), uri.getPort());
	IPreferenceStore store = Activator.getDefault().getPreferenceStore();
	String password = store.getString(serverURI + "#password");
	String userName = store.getString(serverURI + "#username");
	if (userName == null || userName.isEmpty() || password == null || password.isEmpty()) {
	    promptForLogin("Need a username and password to connect to iRODS.", serverURI, store, userName);
	}

	// set basics from URI
	String host = uri.getHost();
	int port = uri.getPort();
	// load connection details
	password = store.getString(serverURI + "#password");
	userName = store.getString(serverURI + "#username");
	String zone = store.getString(serverURI + "#zone");
	String defaultStorageResource = store.getString(serverURI + "#defaultResource");
	String homeDirectory = store.getString(serverURI + "#homeDirectory");

	result = new IRODSAccount(host, port, userName, password, homeDirectory, zone, defaultStorageResource);
	return result;
    }

    private static void promptForLogin(final String message, final URI serverURI, final IPreferenceStore store,
		    final String username) {
	Display.getDefault().syncExec(new Runnable() {
	    public void run() {
		Shell s = Display.getCurrent().getActiveShell();
		LoginInputDialog d = new LoginInputDialog(s, message, serverURI, username);
		if (Dialog.OK == d.open()) {
		    store.setValue(serverURI + "#password", d.getPassword());
		    store.setValue(serverURI + "#username", d.getUsername());
		}
	    }
	});
    }

    private static URI getGridURI(String host, int port) {
	try {
	    return new URI("irods", null, host, port, null, null, null);
	} catch (URISyntaxException e) {
	    throw new Error("Cannot make URI for iRODS without user info and path", e);
	}
    }

    public static URI removeUserInfo(URI uri) {
	try {
	    return new URI(uri.getScheme(), null, uri.getHost(), uri.getPort(), uri.getPath(), null, null);
	} catch (URISyntaxException e) {
	    throw new Error("Cannot make URI for iRODS without user info and path", e);
	}
    }

}
