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
import java.util.HashMap;
import java.util.Map;

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
import org.irods.jargon.core.connection.IRODSAccount.AuthScheme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IrodsEFSFileSystem extends FileSystem {
	
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(IrodsEFSFileSystem.class);
	private static Object lock = new Object();
	private static Map<String, IRODSAccount> sessionCredentials = new HashMap<String, IRODSAccount>();

	public IrodsEFSFileSystem() {
		super();
	}

	/*
	 * This method retrieves FileStore objects based on the irods scheme. iRODS URIs look like this;
	 * 
	 * irods://myUser:myPassword@myirodshost.org:1247/myDirectory/myFile
	 * 
	 * If username and/or password are omitted, then store creation will result in a prompt for these. The prompt will
	 * save username and password as a preference under the URI.
	 * 
	 * @see org.eclipse.core.filesystem.provider.FileSystem#getStore(java.net.URI)
	 */
	@Override
	public IFileStore getStore(URI uri) {
		// get IRODS file store (handle only) for URI
		try {
			return new IrodsFileStore(uri);
		} catch (CoreException e) {
			throw new Error(e);
		}
	}

	/**
	 * For this base server URI, save zone, password, username, etc in application preferences.
	 * 
	 * @param a
	 * @return the server base URI for which connection details are stored
	 */
	public static URI storeConnectionDetails(IRODSAccount a) {
		try {
			URI serverURI = new URI("irods", a.getUserName(), a.getHost(), a.getPort(), "/" + a.getZone() + "/", null,
					null);
			sessionCredentials.put(makeServerPreferenceKey(serverURI), a);
			return serverURI;
		} catch (URISyntaxException e) {
			throw new Error(e);
		}
	}

	/**
	 * For this server URI, load zone, password, username, etc in application preferences. Will prompt user if
	 * preferences have not been stored.
	 * 
	 * @param uri
	 */
	protected static IRODSAccount getAccount(final URI uri) throws CoreException {
		IRODSAccount result = null;

		final String zone = getZone(uri);
		
		String baseKey = makeServerPreferenceKey(uri);
		
		// do we have credentials stored?
		result = sessionCredentials.get(baseKey);

		if (result == null) { // prompt
			synchronized (lock) {
				result = sessionCredentials.get(baseKey);
				LOG.info(Thread.currentThread().getId()+" in sync and got initial account: "+result);
				if (result == null) {
					PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
						public void run() {
							String baseKey = makeServerPreferenceKey(uri);
							Shell s = Activator.getDefault().getWorkbench().getDisplay().getActiveShell();
							String message = "Need a username and password to connect to iRODS.";
							String promptName = null;
							if (uri.getUserInfo() != null) {
								promptName = uri.getUserInfo();
							} else {
								promptName = System.getProperty("user.name");
							}
							URI serverURI = null;
							try {
								serverURI = new URI(baseKey);
							} catch (URISyntaxException e) {
								throw new Error(e);
							}
							LoginInputDialog d = new LoginInputDialog(s, message, serverURI, promptName, zone, AuthScheme.PAM);
							if (Dialog.OK == d.open()) {
								sessionCredentials.put(baseKey, d.getAuthenticatedIRODSAccount());
							}
						}
					});
					result = sessionCredentials.get(baseKey);
					LOG.info(Thread.currentThread().getId()+" exiting sync with creds: "+result);
				}
			}
		}

		if (result == null) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Cannot obtain credentials for irods connection: " + uri.toString()));
		}
		return result;
	}

	public static URI removePassword(URI uri) {
		try {
			String userName = uri.getUserInfo();
			if (userName != null && userName.contains(":")) {
				userName = userName.substring(0, userName.indexOf(":"));
			}
			return new URI(uri.getScheme(), userName, uri.getHost(), uri.getPort(), uri.getPath(), null, null);
		} catch (URISyntaxException e) {
			throw new Error("Problem removing password from an iRODS URI.", e);
		}
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
			result = new URI("irods", userName, locationURI.getHost(), locationURI.getPort(), "/" + zone + "/", null, null);
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
