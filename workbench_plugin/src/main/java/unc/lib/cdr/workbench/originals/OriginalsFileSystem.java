package unc.lib.cdr.workbench.originals;

import java.net.URI;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.provider.FileSystem;
import org.eclipse.core.internal.filesystem.NullFileSystem;
import org.eclipse.core.runtime.CoreException;

import unc.lib.cdr.workbench.rcp.Activator;

public class OriginalsFileSystem extends FileSystem {
	private static OriginalsFileSystem __instance = new OriginalsFileSystem();
	
	public OriginalsFileSystem() {
	}

	@Override
	public IFileStore getStore(URI uri) {
		try {
			return new OriginalFileStore(uri, null);
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
			return NullFileSystem.getInstance().getStore(uri);
		}
	}
	
	public static IFileStore wrapStore(URI uri, OriginalStub stub) throws CoreException {
		IFileStore wrapped = EFS.getStore(uri);
		return new OriginalFileStore(wrapped, stub);
	}

}
