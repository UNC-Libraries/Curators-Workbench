/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package irods.efs.plugin;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.provider.FileInfo;
import org.eclipse.core.filesystem.provider.FileStore;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.irods.jargon.core.connection.IRODSAccount;
import org.irods.jargon.core.exception.JargonException;
import org.irods.jargon.core.pub.CollectionAO;
import org.irods.jargon.core.pub.DataObjectAO;
import org.irods.jargon.core.pub.IRODSAccessObjectFactory;
import org.irods.jargon.core.pub.IRODSFileSystem;
import org.irods.jargon.core.pub.domain.Collection;
import org.irods.jargon.core.pub.domain.DataObject;
import org.irods.jargon.core.pub.io.IRODSFile;
import org.irods.jargon.core.pub.io.IRODSFileFactory;
import org.irods.jargon.core.pub.io.IRODSFileOutputStream;

/**
 * @author Gregory Jansen
 *
 */
public class IrodsFileStore extends FileStore {
	URI uri = null;
	IRODSAccount __account = null;

	//private static final int BUFFER_SIZE = 4194304;
	// private static final int BUFFER_SIZE = 1048576;
	private static final int BUFFER_SIZE = 262144;
	// private static final int BUFFER_SIZE = 32768;

	public IrodsFileStore(URI uri) throws CoreException {
		this.uri = uri;
	}

	private IrodsFileStore(URI uri, IRODSAccount __account2) {
		this.uri = uri;
		this.__account = __account2;
	}

	private IRODSAccount getAccount() throws CoreException {
		if(__account == null) {
			__account = IrodsEFSFileSystem.getAccount(uri);
		}
		return __account;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.filesystem.provider.FileStore#childNames(int,
	 * org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public String[] childNames(int options, IProgressMonitor monitor)
			throws CoreException {
		List<String> result = new ArrayList<String>();
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		monitor.beginTask("fetching IRODS child names", 2);
		try {
			IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
			IRODSFileFactory ff = irodsFileSystem
					.getIRODSFileFactory(getAccount());
			IRODSFile file = ff.instanceIRODSFile(getDecodedPath());
			monitor.worked(1);
			// remove path and just give names
			for (String c : file.list()) {
				if ("/".equals(c))
					continue;
				String[] split = c.split("/");
				if (split.length > 0) {
					result.add(split[split.length - 1]);
				}
			}
			monitor.worked(1);
			monitor.done();
			return result.toArray(new String[0]);
		} catch (JargonException e) {
			throw new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID, "Problem fetching child names", e));
		}
	}

	private String getDecodedPath() {
		String result = null;
		// try {
		// result = URLDecoder.decode(this.uri.getPath(),"utf-8");
		result = this.uri.getPath();
		// } catch(UnsupportedEncodingException e) {
		// throw new Error(e);
		// }
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.filesystem.provider.FileStore#fetchInfo(int,
	 * org.eclipse.core.runtime.IProgressMonitor)inu
	 */
	@Override
	public IFileInfo fetchInfo(int options, IProgressMonitor monitor)
			throws CoreException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		FileInfo result = new FileInfo();
		monitor.beginTask("fetching IRODS file information", 4);

		// get connection and file
		IRODSFile f = null;
		try {
			IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
			IRODSFileFactory iff = irodsFileSystem
					.getIRODSFileFactory(getAccount());
			f = iff.instanceIRODSFile(getDecodedPath());
		} catch (Exception e) {
			throw new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID, "Problem connecting to IRODS", e));
		}

		if (!f.exists()) {
			// log.debug("fetchInfo found a file that doesn't exist in iRODS");
			result.setExists(false);
			result.setName(this.getName());
			return result;
		}

		if (f.isDirectory()) {
			// log.debug("fetchInfo says a DIR " + uri.toASCIIString());
			result.setDirectory(true);
			fetchCollInfo(result, monitor);
		} else {
			// log.debug("fetchInfo says a FILE " + uri.toASCIIString());
			result.setDirectory(false);
			fetchDataInfo(result, monitor);
		}
		monitor.done();
		return result;
	}

	@Override
	public IFileInfo fetchInfo() {
		try {
			return fetchInfo(EFS.NONE, new NullProgressMonitor());
		} catch (CoreException e) {
			// there was an error contacting the file system, so treat it as
			// non-existent file
			// log.debug("fetchInfo threw a CORE exception on " +
			// uri.toASCIIString(), e);
			e.printStackTrace();
			FileInfo result = new FileInfo(getName());
			result.setExists(false);
			return result;
		}
	}

	/**
	 * @return
	 */
	private void fetchDataInfo(FileInfo info, IProgressMonitor monitor)
			throws CoreException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		try {
			IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
			IRODSAccessObjectFactory aof = irodsFileSystem
					.getIRODSAccessObjectFactory();
			DataObjectAO doao = aof.getDataObjectAO(getAccount());
			DataObject dObject = doao.findByAbsolutePath(getDecodedPath());
			info.setExists(true);
			info.setLastModified(dObject.getUpdatedAt().getTime());
			info.setLength(dObject.getDataSize());
			info.setName(dObject.getDataName());
			info.setStringAttribute(EFS.ATTRIBUTE_LINK_TARGET, dObject.getChecksum());
			info.setAttribute(EFS.ATTRIBUTE_ARCHIVE, false);
			info.setAttribute(EFS.ATTRIBUTE_EXECUTABLE, false);
			info.setAttribute(EFS.ATTRIBUTE_HIDDEN, false);
			info.setAttribute(EFS.ATTRIBUTE_READ_ONLY, false);
			info.setAttribute(EFS.ATTRIBUTE_SYMLINK, false);
		} catch (JargonException e) {
			throw new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID, "Problem executing IRODS data query",
					e));
		}
	}

	/**
	 * @return
	 */
	private void fetchCollInfo(FileInfo info, IProgressMonitor monitor)
			throws CoreException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		try {
			IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
			IRODSAccessObjectFactory aof = irodsFileSystem
					.getIRODSAccessObjectFactory();
			CollectionAO cao = aof.getCollectionAO(getAccount());
			Collection cObject = cao.findByAbsolutePath(getDecodedPath());
			info.setExists(true);
			info.setLastModified(cObject.getModifiedAt().getTime());
			info.setName(cObject.getCollectionName());
			info.setAttribute(EFS.ATTRIBUTE_ARCHIVE, false);
			info.setAttribute(EFS.ATTRIBUTE_EXECUTABLE, false);
			info.setAttribute(EFS.ATTRIBUTE_HIDDEN, false);
			info.setAttribute(EFS.ATTRIBUTE_READ_ONLY, false);
			info.setAttribute(EFS.ATTRIBUTE_SYMLINK, false);
		} catch (JargonException e) {
			throw new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID, "Problem executing IRODS data query",
					e));
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.core.filesystem.provider.FileStore#getChild(java.lang.String)
	 */
	@Override
	public IFileStore getChild(String name) {
		// try {
		// name = new URI("file", name, null).toString();
		// name = name.substring(name.indexOf(":")+1);
		// //name = URLEncoder.encode(name, "utf-8");
		// } catch(URISyntaxException e) {
		// throw new Error(e);
		// }
		StringBuilder newPath = new StringBuilder();
		if (this.uri.getPath().endsWith("/")) {
			newPath.append(this.uri.getPath()).append(name);
		} else {
			newPath.append(this.uri.getPath()).append("/").append(name);
		}
		URI child = null;
		try {
			child = new URI(this.uri.getScheme(), this.uri.getUserInfo(),
					this.uri.getHost(), this.uri.getPort(), newPath.toString(),
					null, null);
		} catch (URISyntaxException er) {
			throw new Error(er);
		}
		IrodsFileStore resultStore = null;
		try {
			if(__account == null) {
				resultStore = new IrodsFileStore(child);
			} else {
				resultStore = new IrodsFileStore(child, __account);
			}
		} catch(CoreException e) {
			throw new Error(e);
		}
		return resultStore;
	}

	private static class NameFilter implements FilenameFilter {
		String filter = null;

		NameFilter(String filter) {
			this.filter = filter;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see java.io.FilenameFilter#accept(java.io.File, java.lang.String)
		 */
		@Override
		public boolean accept(File dir, String name) {
			return filter.equals(name);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.filesystem.provider.FileStore#getName()
	 */
	@Override
	public String getName() {
		String result = this.uri.getRawPath();
		String[] parts = result.split("/");
		if (parts.length == 0) {
			return "";
		}
		result = parts[parts.length - 1];
		try {
			result = URLDecoder.decode(result, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new Error(e);
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.filesystem.provider.FileStore#getParent()
	 */
	@Override
	public IFileStore getParent() {
		String[] path = this.uri.getRawPath().split("/");
		if (path.length < 1) {
			return null;
		}
		StringBuilder parentPathBuilder = new StringBuilder();
		// parentPath.append("/");
		for (int i = 0; i < path.length - 1; i++) {
			parentPathBuilder.append(path[i]).append("/");
		}
		String parentPath;
		try {
			parentPath = URLDecoder.decode(parentPathBuilder.toString(),
					"UTF-8");
		} catch (UnsupportedEncodingException e1) {
			throw new Error(e1);
		}
		URI result;
		try {
			result = new URI(this.uri.getScheme(), this.uri.getUserInfo(),
					this.uri.getHost(), this.uri.getPort(), parentPath, null,
					null);
		} catch (URISyntaxException e) {
			throw new Error(e);
		}
		// System.out.println("parent of "+this.uri+" is "+ result);
		IrodsFileStore resultStore = null;
		try {
			if(__account == null) {
				resultStore = new IrodsFileStore(result);
			} else {
				resultStore = new IrodsFileStore(result, __account);
			}
		} catch(CoreException e) {
			throw new Error(e);
		}
		return resultStore;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.filesystem.provider.FileStore#openInputStream(int,
	 * org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public InputStream openInputStream(int options, IProgressMonitor monitor)
			throws CoreException {
		InputStream result = null;
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		monitor.beginTask("fetching IRODS input stream", 2);
		try {
			IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
			IRODSFileFactory ff = irodsFileSystem
					.getIRODSFileFactory(getAccount());
			IRODSFile file = ff.instanceIRODSFile(getDecodedPath());
			monitor.worked(1);

			System.out.println("GOT ZONE: "+getAccount().getZone());
			result = ff.instanceIRODSFileInputStream(file);
			result = new BufferedInputStream(result, BUFFER_SIZE);
			// irodsSession.closeSession();
			monitor.worked(1);
			monitor.done();
			return result;
		} catch (JargonException e) {
			throw new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID, "Problem getting iRODS input stream",
					e));
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.filesystem.provider.FileStore#toURI()
	 */
	@Override
	public URI toURI() {
		return this.uri;
	}

	@Override
	public void delete(int options, IProgressMonitor monitor)
			throws CoreException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		monitor.beginTask("fetching IRODS input stream", 2);
		try {
			IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
			IRODSFileFactory irodsFileFactory = irodsFileSystem
					.getIRODSFileFactory(getAccount());
			IRODSFile file = irodsFileFactory
					.instanceIRODSFile(getDecodedPath());
			file.deleteWithForceOption();
			irodsFileSystem.close();
			monitor.worked(1);
			monitor.done();
		} catch (JargonException e) {
			throw new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID, "Problem getting iRODS input stream",
					e));
		}
	}

	@Override
	public IFileStore mkdir(int options, IProgressMonitor monitor)
			throws CoreException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		monitor.beginTask("fetching IRODS input stream", 2);
		boolean makeParents = false;
		if ((options & EFS.SHALLOW) == 0) {
			makeParents = true;
		}
		try {
			IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
			IRODSFileFactory irodsFileFactory = irodsFileSystem
					.getIRODSFileFactory(getAccount());
			IRODSFile file = irodsFileFactory
					.instanceIRODSFile(getDecodedPath());
			if (makeParents) {
				file.mkdirs();
			} else {
				file.mkdir();
			}
			irodsFileSystem.close();
			monitor.worked(1);
			monitor.done();
			return this;
		} catch (JargonException e) {
			throw new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID, "Problem getting iRODS input stream",
					e));
		}
	}

	@Override
	public OutputStream openOutputStream(int options, IProgressMonitor monitor)
			throws CoreException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		monitor.beginTask("fetching IRODS output stream", 2);
		try {
			IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
			IRODSFileFactory irodsFileFactory = irodsFileSystem.getIRODSAccessObjectFactory()
					.getIRODSFileFactory(getAccount());
			IRODSFileOutputStream irodsFileOutputStream = irodsFileFactory
					.instanceIRODSFileOutputStream(getDecodedPath());
			BufferedOutputStream bos = new BufferedOutputStream(irodsFileOutputStream, BUFFER_SIZE);
			monitor.worked(1);
			monitor.done();
			return bos;
		} catch (JargonException e) {
			throw new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID, "Problem getting iRODS output stream",
					e));
		}
	}

	@Override
	public void putInfo(IFileInfo info, int options, IProgressMonitor monitor)
			throws CoreException {
		super.putInfo(info, options, monitor);
		// if (monitor == null) {
		// monitor = new NullProgressMonitor();
		// }
		// monitor.beginTask("fetching IRODS output stream", 2);
		// try {
		// IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
		// IRODSFileFactory irodsFileFactory =
		// irodsFileSystem.getIRODSFileFactory(account);
		// IRODSFile file = irodsFileFactory.instanceIRODSFile(uri.getPath());
		// IRODSFileOutputStream irodsFileOutputStream =
		// irodsFileFactory.instanceIRODSFileOutputStream(file);
		// //irodsFileSystem.close();
		// monitor.worked(1);
		// monitor.done();
		// return irodsFileOutputStream;
		// } catch (JargonException e) {
		// throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
		// "Problem getting iRODS input stream",
		// e));
		// }
	}

}
