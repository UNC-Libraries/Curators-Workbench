package unc.lib.cdr.workbench.originals;

import gov.loc.mets.DivType;
import gov.loc.mets.FLocatType;
import gov.loc.mets.FileType;
import gov.loc.mets.util.METSConstants;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.IFileSystem;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.rcp.Activator;

public class OriginalFileStore implements IFileStore {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(OriginalFileStore.class);

	private static final String FILETYPE_PREFIX = "f_";
	private static final String DIVTYPE_PREFIX = "d_";
	private static final String protectedMessage = "Operation cancelled. This file under read only protection within the workbench.";
	public static final String SCHEME_PREFIX = "ro+";
	protected URI uri = null;
	private OriginalStub stub = null;
	protected IFileStore wrapped = null;

	public IFileStore getWrapped() {
		return wrapped;
	}

	public OriginalFileStore(URI uri, OriginalStub stub) throws CoreException {
		this.stub = stub;
		this.uri = uri;
		if (!uri.getScheme().startsWith(SCHEME_PREFIX)) {
			throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
					"Read only wrapper stores must start with: " + SCHEME_PREFIX + " " + uri));
		}
		String test = uri.getRawSchemeSpecificPart();
		URI wrappedUri = null;
		try {
			wrappedUri = new URI(uri.getScheme().substring(3) + ":" + test);
		} catch (URISyntaxException e) {
			throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Cannot use read only wrapper on uri: "
					+ uri, e));
		}
		this.wrapped = EFS.getStore(wrappedUri);
	}

	public boolean isAttached() {
		return this.stub.isAttached();
	}

	public OriginalFileStore(IFileStore iFileStore, OriginalStub stub) throws CoreException {
		this.wrapped = iFileStore;
		this.stub = stub;
		try {
			URI wrappedUri = this.wrapped.toURI();
			this.uri = new URI(SCHEME_PREFIX + wrappedUri.getScheme() + ":" + wrappedUri.getRawSchemeSpecificPart());
		} catch (URISyntaxException e) {
			throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Cannot wrap store in read only", e));
		} catch (NullPointerException e) {
			throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Cannot wrap store in read only", e));
		}
	}

	public FileType getMetsFileType() {
		try {
			return (FileType) MetsProjectNature.get(stub.getProject()).getMetsResource().getEObject(getFileID());
		} catch (NullPointerException e) {
			return null;
		}
	}

	public String getFileID() {
		return new StringBuilder().append(FILETYPE_PREFIX).append(this.hashCode()).toString();
	}

	public String getDivID() {
		return new StringBuilder().append(DIVTYPE_PREFIX).append(this.hashCode()).toString();
	}

	public FLocatType getStagingLocatorType() {
		MetsProjectNature n = MetsProjectNature.get(stub.getProject());
		FileType ft = (FileType) n.getMetsResource().getEObject(getFileID());
		if (ft != null && ft.getFLocat() != null) {
			for (FLocatType loc : ft.getFLocat()) {
				if (METSConstants.FLocat_USE_STAGE.equals(loc.getUSE())) {
					return loc;
				}
			}
		}
		return null;
	}

	public DivType getMetsDivType() {
		try {
			MetsProjectNature n = MetsProjectNature.get(stub.getProject());
			return (DivType) n.getMetsResource().getEObject(getDivID());
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public int hashCode() {
		return this.uri.hashCode() ^ this.stub.getVolumeHash();
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof OriginalFileStore && obj != null && obj.hashCode() == this.hashCode());
	}

	@Override
	public Object getAdapter(Class adapter) {
		return this.wrapped.getAdapter(adapter);
	}

	@Override
	public IFileInfo[] childInfos(int options, IProgressMonitor monitor) throws CoreException {
		IFileInfo[] result = wrapped.childInfos(options, monitor);
		return result;
	}

	@Override
	public String[] childNames(int options, IProgressMonitor monitor) throws CoreException {
		return wrapped.childNames(options, monitor);
	}

	@Override
	public IFileStore[] childStores(int options, IProgressMonitor monitor) throws CoreException {
		// wraps these in read only
		IFileStore[] wrappedResult = wrapped.childStores(options, monitor);
		IFileStore[] result = new OriginalFileStore[wrappedResult.length];
		for (int i = 0; i < wrappedResult.length; i++) {
			result[i] = new OriginalFileStore(wrappedResult[i], stub);
		}
		return result;
	}

	@Override
	public void copy(IFileStore destination, int options, IProgressMonitor monitor) throws CoreException {
		wrapped.copy(destination, options, monitor);
	}

	@Override
	public void delete(int options, IProgressMonitor monitor) throws CoreException {
		throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, protectedMessage));
	}

	@Override
	public IFileInfo fetchInfo() {
		return this.wrapped.fetchInfo();
	}

	@Override
	public IFileInfo fetchInfo(int options, IProgressMonitor monitor) throws CoreException {
		return wrapped.fetchInfo();
	}

	@Deprecated
	@Override
	public IFileStore getChild(IPath path) {
		try {
			return new OriginalFileStore(this.wrapped.getChild(path), stub);
		} catch (CoreException e) {
			throw new Error("Unexpected exception", e);
		}
	}

	@Override
	public IFileStore getFileStore(IPath path) {
		try {
			return new OriginalFileStore(this.wrapped.getFileStore(path), stub);
		} catch (CoreException e) {
			throw new Error("Unexpected exception", e);
		}
	}

	@Override
	public IFileStore getChild(String name) {
		try {
			return new OriginalFileStore(this.wrapped.getChild(name), stub);
		} catch (CoreException e) {
			throw new Error("Unexpected exception", e);
		}
	}

	@Override
	public IFileSystem getFileSystem() {
		try {
			return EFS.getFileSystem(uri.getScheme());
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
			throw new Error("Unexpected error", e);
		}
	}

	@Override
	public String toString() {
		return new StringBuilder().append("read only: " + wrapped.toString()).toString();
	}

	@Override
	public String getName() {
		return wrapped.getName();
	}

	@Override
	public IFileStore getParent() {
		try {
			IFileStore wrappedParent = this.wrapped.getParent();
			if (wrappedParent == null)
				return null;
			return new OriginalFileStore(this.wrapped.getParent(), stub);
		} catch (CoreException e) {
			throw new Error("Unexpected exception", e);
		}
	}

	public OriginalStub getOriginalStub() {
		return stub;
	}

	public IProject getProject() {
		return stub.getProject();
	}

	@Override
	public boolean isParentOf(IFileStore other) {
		if (OriginalsFileSystem.class.isInstance(other.getFileSystem()) && OriginalFileStore.class.isInstance(other)) {
			OriginalFileStore o = (OriginalFileStore) other;
			return wrapped.isParentOf(o.wrapped);
		}
		return false;
	}

	@Override
	public IFileStore mkdir(int options, IProgressMonitor monitor) throws CoreException {
		throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "This file is protected by the workbench"));
	}

	@Override
	public void move(IFileStore destination, int options, IProgressMonitor monitor) throws CoreException {
		throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, protectedMessage));
	}

	@Override
	public InputStream openInputStream(int options, IProgressMonitor monitor) throws CoreException {
		return wrapped.openInputStream(options, monitor);
	}

	@Override
	public OutputStream openOutputStream(int options, IProgressMonitor monitor) throws CoreException {
		throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, protectedMessage));
	}

	@Override
	public void putInfo(IFileInfo info, int options, IProgressMonitor monitor) throws CoreException {
		throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, protectedMessage));
	}

	@Override
	public File toLocalFile(int options, IProgressMonitor monitor) throws CoreException {
		return wrapped.toLocalFile(options, monitor);
	}

	@Override
	public URI toURI() {
		return uri;
	}

	/**
	 * Calculate the pre-staged location URI, if applicable
	 * 
	 * @return the pre-staged URI, or null if not pre-staged.
	 */
	public URI getPrestagedLocation() {
		// get path back to store containing prestage location
		List<OriginalFileStore> stubStores = this.stub.getStores();
		OriginalFileStore test = (OriginalFileStore) this.getParent();
		for (test = (OriginalFileStore) this.getParent(); test != null; test = (OriginalFileStore) test.getParent()) {
			URI prestage = this.stub.getPrestageBase(test.getWrapped().toURI());
			if (prestage != null) {
				Path mypath = new Path(this.toURI().getPath());
				Path basePath = new Path(test.toURI().getPath());
				IPath relPath = mypath.makeRelativeTo(basePath);
				IPath psPath = new Path(prestage.getPath()).append(relPath);
				try {
					URI result = new URI(prestage.getScheme(), prestage.getUserInfo(), prestage.getHost(),
							prestage.getPort(), psPath.toString(), prestage.getQuery(), prestage.getFragment());
					return result;
				} catch (URISyntaxException e) {
					throw new Error(e);
				}
			}
			if (stubStores.contains(test))
				return null; // did not find prestaged location in tree
		}
		return null;
	}

	public IFileStore getStageLocation() {
		MetsProjectNature mpn = MetsProjectNature.get(getProject());
		URI stageBase = mpn.getStagingBase();
		LOG.debug("stagebase.getPath(): " + stageBase.getPath());
		IPath stageBasePath = new Path(stageBase.getPath());
		LOG.debug("original.toURI().getPath()" + this.toURI().getPath());
		Path mypath = new Path(this.toURI().getPath());
		Path stubPath = new Path(this.getOriginalStub().getVolumeRoot().getPath());
		LOG.debug("stubPath: " + stubPath);
		IPath relStubPath = mypath.makeRelativeTo(stubPath);
		LOG.debug("relStubPath: " + relStubPath);
		String stubSegment = new StringBuilder().append("_").append(this.getOriginalStub().getVolumeHash()).toString();
		IPath stagePath = stageBasePath.append(stubSegment).append(relStubPath);
		LOG.debug("stagePath: " + stagePath);
		String sps = stagePath.toString();
		if (!sps.startsWith("/")) {
			sps = "/" + sps;
		}
		LOG.debug("sps: " + sps);
		try {
			URI stageLoc = new URI(stageBase.getScheme(), stageBase.getUserInfo(), stageBase.getHost(),
					stageBase.getPort(), sps, stageBase.getQuery(), stageBase.getFragment());
			LOG.debug("stageLoc: " + stageLoc);
			return EFS.getStore(stageLoc);
		} catch (Exception e) {
			throw new Error(e);
		}
	}

}
