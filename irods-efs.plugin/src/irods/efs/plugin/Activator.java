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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.irods.jargon.core.connection.IRODSAccount;
import org.irods.jargon.core.connection.IRODSAccount.AuthScheme;
import org.irods.jargon.core.connection.auth.AuthResponse;
import org.irods.jargon.core.exception.JargonException;
import org.irods.jargon.core.pub.IRODSFileSystem;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	private static final Logger LOG = LoggerFactory.getLogger(Activator.class);
	private static Map<String, String> accountPasswords = new HashMap<String, String>();
	private static ThreadLocal<Boolean> authenticated = new ThreadLocal<Boolean>() {
		@Override
		protected Boolean initialValue() {
			return Boolean.FALSE;
		}
	};
	private static Object lock = new Object();
	private IRODSFileSystem ifs = null;

	// The plug-in ID
	public static final String PLUGIN_ID = "irods-efs.plugin"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	public IRODSFileSystem getIRODSFileSystem() {
		return this.ifs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		ifs = IRODSFileSystem.instance();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	/**
	 * For this base server URI, save zone, password, username, etc in
	 * application preferences.
	 * 
	 * @param a
	 * @return the server base URI for which connection details are stored
	 */
	public void storeConnectionDetails(IRODSAccount a, String password) {
		String key = makeKey(a);
		LOG.debug("storing password by key: " + key);
		accountPasswords.put(key, password);
	}

	private String makeKey(IRODSAccount account) {
		return account.getHost() + ":" + account.getPort() + "/"
				+ account.getZone();
	}

	public String getZone(URI irodsURI) {
		String zone = null;
		String[] pathParts = irodsURI.getPath().split("/");
		if (pathParts.length > 0) {
			zone = pathParts[1];
		}
		return zone;
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

	private IRODSAccount makeAccount(URI uri) {
		LOG.debug("Making account for irods uri: " + uri);
		IRODSAccount result = null;
		String userName = uri.getUserInfo();
		if (userName != null && userName.contains(":")) {
			userName = userName.substring(0, userName.indexOf(":"));
		}
		if (userName == null)
			userName = System.getProperty("user.name");
		String zone = getZone(uri);
		result = new IRODSAccount(uri.getHost(), uri.getPort(), userName, null,
				"", zone, "fake");
		result.setAuthenticationScheme(AuthScheme.PAM);
		LOG.debug("Account serializes to URI as: " + result.toString());
		return result;
	}

	private URI makeURI(IRODSAccount a) {
		StringBuilder sb = new StringBuilder();
		sb.append("irods://").append(a.getUserName()).append("@")
				.append(a.getHost()).append(":").append(a.getPort());
		return URI.create(sb.toString());
	}

	/**
	 * For this server URI, load zone, password, username, etc in application
	 * preferences. Will prompt user if preferences have not been stored.
	 * 
	 * @param uri
	 */
	protected IRODSAccount getAccount(final URI uri) throws CoreException {
		IRODSAccount result = makeAccount(uri);
		authenticate(result);
		return result;
	}

	private void authenticate(final IRODSAccount account) throws CoreException {
		final String baseKey = makeKey(account);
		final URI gridURI = makeURI(account);
		final String zone = account.getZone();
		// do we have credentials stored?
		String result = accountPasswords.get(baseKey);

		if (result == null) { // prompt
			synchronized (lock) {
				LOG.debug("getting password by key: " + baseKey);
				result = accountPasswords.get(baseKey);
				LOG.info(Thread.currentThread().getId()
						+ " in sync and got initial account: " + result);
				if (result == null) {
					PlatformUI.getWorkbench().getDisplay()
							.syncExec(new Runnable() {
								public void run() {
									Shell s = Activator.getDefault()
											.getWorkbench().getDisplay()
											.getActiveShell();
									String message = "Need a username and password to connect to iRODS.";
									String promptName = account.getUserName();
									LoginInputDialog d = new LoginInputDialog(
											s, message, gridURI, promptName,
											zone, AuthScheme.PAM);
									if (Dialog.OK == d.open()) {
										storeConnectionDetails(
												d.getAuthenticatedIRODSAccount(),
												d.getPassword());
										account.setPassword(d.getPassword());
										LOG.info(Thread.currentThread().getId()
												+ " set new password on account");
									}
								}
							});
				}
			}
		} else {
			account.setPassword(result);
		}

		// now authenticate for this thread
		if (!authenticated.get()) {
			LOG.debug("Authenticating");
			try {
				AuthResponse ar = ifs.getIRODSAccessObjectFactory()
						.authenticateIRODSAccount(account);
				if (ar.isSuccessful()) authenticated.set(Boolean.TRUE);
			} catch (JargonException e) {
				LOG.debug("I had trouble authenticating to irods", e);
			}
		}
	}
}
