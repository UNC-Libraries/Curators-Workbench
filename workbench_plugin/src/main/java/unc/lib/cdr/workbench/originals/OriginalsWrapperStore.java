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

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.IFileSystem;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;

import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.rcp.Activator;

public class OriginalsWrapperStore implements IFileStore {
	private static final String FILETYPE_PREFIX = "f_";
	private static final String DIVTYPE_PREFIX = "d_";
	private static final String protectedMessage = "Operation cancelled. This file under read only protection within the workbench.";
	public static final String SCHEME_PREFIX = "ro+";
	protected URI uri = null;
	private IProject project = null;
	protected IFileStore wrapped = null;

	public IFileStore getWrapped() {
		return wrapped;
	}

	protected int volumeHash = -1;

	public OriginalsWrapperStore(URI uri, IProject project) throws CoreException {
		this.project = project;
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
		this.volumeHash = VolumeUtil.makeVolumeFingerprint(wrappedUri);
	}

	public OriginalsWrapperStore(IFileStore iFileStore, IProject project) throws CoreException {
		this.wrapped = iFileStore;
		this.project = project;
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
			return (FileType) MetsProjectNature.get(project).getMetsResource().getEObject(getFileID());
		} catch (NullPointerException e) {
			return null;
		}
	}

	private String getFileID() {
		return new StringBuilder().append(FILETYPE_PREFIX).append(this.hashCode()).toString();
	}

	private String getDivID() {
		return new StringBuilder().append(DIVTYPE_PREFIX).append(this.hashCode()).toString();
	}

	public FLocatType getStagingLocatorType() {
		try {
			MetsProjectNature n = MetsProjectNature.get(project);
			FileType ft = (FileType) n.getMetsResource().getEObject(getFileID());
			for (FLocatType loc : ft.getFLocat()) {
				if (METSConstants.FLocat_USE_STAGE.equals(loc.getUSE())) {
					return loc;
				}
			}
		} catch (NullPointerException e) {
		}
		return null;
	}

	public DivType getMetsDivType() {
		try {
			MetsProjectNature n = MetsProjectNature.get(project);
			return (DivType) n.getMetsResource().getEObject(getDivID());
		} catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public int hashCode() {
		return this.uri.hashCode() ^ this.volumeHash;
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof OriginalsWrapperStore && obj != null && obj.hashCode() == this.hashCode());
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
		IFileStore[] result = new OriginalsWrapperStore[wrappedResult.length];
		for (int i = 0; i < wrappedResult.length; i++) {
			result[i] = new OriginalsWrapperStore(wrappedResult[i], project);
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

	@Override
	public IFileStore getChild(IPath path) {
		try {
			return new OriginalsWrapperStore(this.wrapped.getChild(path), project);
		} catch (CoreException e) {
			throw new Error("Unexpected exception", e);
		}
	}

	@Override
	public IFileStore getFileStore(IPath path) {
		try {
			return new OriginalsWrapperStore(this.wrapped.getFileStore(path), project);
		} catch (CoreException e) {
			throw new Error("Unexpected exception", e);
		}
	}

	@Override
	public IFileStore getChild(String name) {
		try {
			return new OriginalsWrapperStore(this.wrapped.getChild(name), project);
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
			return new OriginalsWrapperStore(this.wrapped.getParent(), project);
		} catch (CoreException e) {
			throw new Error("Unexpected exception", e);
		}
	}

	public IProject getProject() {
		return project;
	}

	@Override
	public boolean isParentOf(IFileStore other) {
		if (OriginalsWrapperFileSystem.class.isInstance(other.getFileSystem())
				&& OriginalsWrapperStore.class.isInstance(other)) {
			OriginalsWrapperStore o = (OriginalsWrapperStore) other;
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

}
