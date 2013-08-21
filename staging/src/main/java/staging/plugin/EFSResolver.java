package staging.plugin;

import java.net.URI;
import java.net.URLStreamHandlerFactory;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.CoreException;

import edu.unc.lib.staging.LocalResolver;

/**
 * This resolves URLs via the Eclipse File System.
 * @author count0
 *
 */
public class EFSResolver implements LocalResolver {

	@Override
	public boolean exists(URI locationURI) {
		try {
			IFileStore fs = EFS.getStore(locationURI);
			return fs.fetchInfo().exists();
		} catch(CoreException e) {
			return false;
		} catch(NullPointerException e) {
			return false;
		}
	}

	@Override
	public URLStreamHandlerFactory getURLStreamHandlerFactory() {
		return new IRODSURLStreamHandlerFactory();
	}

}
