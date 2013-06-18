package staging.plugin;

import java.net.URI;

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
	public boolean exists(String uri) {
		try {
			URI test = URI.create(uri);
			IFileStore fs = EFS.getStore(test);
			return fs.fetchInfo().exists();
		} catch(CoreException e) {
			return false;
		}
	}

}
