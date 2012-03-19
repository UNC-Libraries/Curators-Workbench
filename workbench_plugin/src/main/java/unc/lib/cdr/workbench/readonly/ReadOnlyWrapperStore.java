package unc.lib.cdr.workbench.readonly;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.IFileSystem;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;

import unc.lib.cdr.workbench.rcp.Activator;

public class ReadOnlyWrapperStore implements IFileStore {
	private static final String protectedMessage = "Operation cancelled. This file under read only protection within the workbench.";
	private static final String SCHEME_PREFIX = "ro+";
	protected URI uri = null;
	protected IFileStore wrapped = null;

	public ReadOnlyWrapperStore(URI uri) throws CoreException {
		this.uri = uri;
		if(!uri.getScheme().startsWith(SCHEME_PREFIX)) {
			throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Read only wrapper stores must start with: "+SCHEME_PREFIX+" "+uri));
		}
		String test = uri.getRawSchemeSpecificPart();
		//Activator.getDefault().getLog().log(new Status(Status.INFO, Activator.PLUGIN_ID, "trying a read only wrapped store: "+uri+ " wraps "+test));
		URI wrappedUri = null;
		try {
			wrappedUri = new URI(uri.getScheme().substring(3)+":"+test);
		} catch(URISyntaxException e) {
			throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Cannot use read only wrapper on uri: "+uri, e));
		}
		this.wrapped = EFS.getStore(wrappedUri);
	}

	public ReadOnlyWrapperStore(IFileStore iFileStore) throws CoreException {
		this.wrapped = iFileStore;
		try {
			URI wrappedUri = this.wrapped.toURI();
			this.uri = new URI(SCHEME_PREFIX+wrappedUri.getScheme()+":"+wrappedUri.getRawSchemeSpecificPart());
		} catch (URISyntaxException e) {
			throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Cannot wrap store in read only", e));
		} catch(NullPointerException e) {
			throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Cannot wrap store in read only", e));
		}
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
		IFileStore[] result = new ReadOnlyWrapperStore[wrappedResult.length];
		for(int i = 0; i < wrappedResult.length; i++) {
			result[i] = new ReadOnlyWrapperStore(wrappedResult[i]);
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
			return new ReadOnlyWrapperStore(this.wrapped.getChild(path));
		} catch (CoreException e) {
			throw new Error("Unexpected exception", e);
		}
	}

	@Override
	public IFileStore getFileStore(IPath path) {
		try {
			return new ReadOnlyWrapperStore(this.wrapped.getFileStore(path));
		} catch (CoreException e) {
			throw new Error("Unexpected exception", e);
		}
	}

	@Override
	public IFileStore getChild(String name) {
		try {
			return new ReadOnlyWrapperStore(this.wrapped.getChild(name));
		} catch (CoreException e) {
			throw new Error("Unexpected exception", e);
		}
	}

	@Override
	public IFileSystem getFileSystem() {
		try {
			return EFS.getFileSystem(uri.getScheme());
		} catch(CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
			throw new Error("Unexpected error", e);
		}
	}

	@Override
	public String toString() {
		return new StringBuilder().append("read only: "+wrapped.toString()).toString();
	}

	@Override
	public String getName() {
		return wrapped.getName();
	}

	@Override
	public IFileStore getParent() {
		try {
			IFileStore wrappedParent = this.wrapped.getParent();
			if(wrappedParent == null) return null;
			return new ReadOnlyWrapperStore(this.wrapped.getParent());
		} catch (CoreException e) {
			throw new Error("Unexpected exception", e);
		}
	}

	@Override
	public boolean isParentOf(IFileStore other) {
		if(ReadOnlyWrapperFileSystem.class.isInstance(other.getFileSystem()) && ReadOnlyWrapperStore.class.isInstance(other)) {
			ReadOnlyWrapperStore o = (ReadOnlyWrapperStore)other;
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
