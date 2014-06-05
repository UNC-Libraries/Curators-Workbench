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
