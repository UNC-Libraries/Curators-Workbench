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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
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
	 * If username and/or password are omitted, then store creation will result
	 * in a prompt for these. The prompt will save username and password as a
	 * preference under the URI.
	 *
	 * @see
	 * org.eclipse.core.filesystem.provider.FileSystem#getStore(java.net.URI)
	 */
	@Override
	public IFileStore getStore(URI uri) {
		// get IRODS file store (handle only) for URI
		try {
			return new IrodsFileStore(uri);
		} catch(CoreException e) {
			throw new Error(e);
		}
	}

	/**
	 * For this base server URI, save zone, password, username, etc in
	 * application preferences.
	 *
	 * @param a
	 * @return the server base URI for which connection details are stored
	 */
	public static URI storeConnectionDetails(IRODSAccount a) {
		try {
			URI serverURI = new URI("irods", a.getUserName(), a.getHost(),
					a.getPort(), "/" + a.getZone() + "/", null, null);
			putStoredCredentials(serverURI, a.getUserName(), a.getPassword());
			return serverURI;
		} catch (URISyntaxException e) {
			throw new Error(e);
		}
	}

	/**
	 * For this server URI, load zone, password, username, etc in application
	 * preferences. Will prompt user if preferences have not been stored.
	 *
	 * @param uri
	 */
	protected static IRODSAccount getAccount(final URI uri) throws CoreException {
		IRODSAccount result = null;

		final String zone = getZone(uri);

		// do we have credentials stored?
		String[] credentials = getStoredCredentials(uri);

		if (credentials[0] == null || credentials[1] == null) {
			System.out.println("No stored credentials");
			// are there sufficient credentials on the URI?
			if (uri.getUserInfo() != null && uri.getUserInfo().contains(":")) {
				// we may have username and password in URI
				credentials = uri.getUserInfo().split(":");
			}
		}

		if (credentials[0] == null || credentials[1] == null) { // prompt
			PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
				public void run() {
					Shell s = Activator.getDefault().getWorkbench()
							.getDisplay().getActiveShell();
					String message = "Need a username and password to connect to iRODS.";
					String promptName = null;
					if (uri.getUserInfo() != null) {
						promptName = uri.getUserInfo();
					}
					URI serverURI = null;
					try {
						serverURI = new URI(makeServerPreferenceKey(uri));
					} catch (URISyntaxException e) {
						throw new Error(e);
					}
					LoginInputDialog d = new LoginInputDialog(s, message,
							serverURI, promptName, zone);
					if (Dialog.OK == d.open()) {
						putStoredCredentials(uri, d.getUsername(),
								d.getPassword());
					}
				}
			});
			credentials = getStoredCredentials(uri);
		}

		if (credentials[0] == null || credentials[1] == null) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot obtain credentials for irods connection: "
					+ uri.toString()));
		}
		result = new IRODSAccount(uri.getHost(), uri.getPort(), credentials[0],
				credentials[1], "", zone, "fake");
		return result;
	}

	public static URI removePassword(URI uri) {
		try {
			String userName = uri.getUserInfo();
			if (userName != null && userName.contains(":")) {
				userName = userName.substring(0, userName.indexOf(":"));
			}
			return new URI(uri.getScheme(), userName, uri.getHost(),
					uri.getPort(), uri.getPath(), null, null);
		} catch (URISyntaxException e) {
			throw new Error("Problem removing password from an iRODS URI.", e);
		}
	}

	// store URI key may be slightly different from regular URI
	private static String[] getStoredCredentials(URI locationURI) {
		String[] result = new String[2];
		String baseKey = makeServerPreferenceKey(locationURI);
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		result[0] = store.getString(baseKey + "#username").trim();
		result[1] = store.getString(baseKey + "#password").trim();
		if(result[0] != null && result[0].isEmpty()) { result[0] = null; }
		if(result[1] != null && result[1].isEmpty()) { result[1] = null; }
		return result;
	}

	private static void putStoredCredentials(URI locationURI, String username,
			String password) {
		String baseKey = makeServerPreferenceKey(locationURI);
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setValue(baseKey + "#username", username.trim());
		store.setValue(baseKey + "#password", password.trim());
	}

	private static String makeServerPreferenceKey(URI locationURI) {
		String userinfo = locationURI.getUserInfo();
		String userName = null;
		String password = null;
		if (userinfo != null) {
			if (userinfo.contains(":")) {
				String[] foo = userinfo.split(":");
				userName = foo[0].trim();
				password = foo[1];
			} else {
				userName = userinfo.trim();
			}
		}
		String zone = getZone(locationURI);
		URI result = null;
		try {
			result = new URI("irods", userName, locationURI.getHost(),
					locationURI.getPort(), "/" + zone + "/", null, null);
			return result.toString();
		} catch (URISyntaxException e) {
			throw new Error(e);
		}
	}

	public static String getZone(URI irodsURI) {
		String zone = null;
		String[] pathParts = irodsURI.getPath().split("/");
		if (pathParts.length > 0) {
			zone = pathParts[1];
		}
		return zone;
	}
}
