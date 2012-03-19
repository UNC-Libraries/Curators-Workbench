package unc.lib.cdr.workbench.readonly;

import java.net.URI;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.provider.FileSystem;
import org.eclipse.core.internal.filesystem.NullFileSystem;
import org.eclipse.core.runtime.CoreException;

import unc.lib.cdr.workbench.rcp.Activator;

public class ReadOnlyWrapperFileSystem extends FileSystem {
	private static ReadOnlyWrapperFileSystem __instance = new ReadOnlyWrapperFileSystem();
	
	public ReadOnlyWrapperFileSystem() {
	}

	@Override
	public IFileStore getStore(URI uri) {
		try {
			return new ReadOnlyWrapperStore(uri);
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
			return NullFileSystem.getInstance().getStore(uri);
		}
	}
	
	public static IFileStore wrapStore(URI uri) throws CoreException {
		IFileStore wrapped = EFS.getStore(uri);
		return new ReadOnlyWrapperStore(wrapped);
	}

}
