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

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.provider.FileSystem;
import org.eclipse.core.runtime.CoreException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IrodsEFSFileSystem extends FileSystem {
	
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(IrodsEFSFileSystem.class);

	public IrodsEFSFileSystem() {
		super();
	}

	/*
	 * This method retrieves FileStore objects based on the irods scheme. iRODS URIs look like this;
	 * 
	 * irods://myUser:myPassword@myirodshost.org:1247/myDirectory/myFile
	 * 
	 * If username and/or password are omitted, then store creation will result in a prompt for these. The prompt will
	 * save username and password as a preference under the URI.
	 * 
	 * @see org.eclipse.core.filesystem.provider.FileSystem#getStore(java.net.URI)
	 */
	@Override
	public IFileStore getStore(URI uri) {
		// get IRODS file store (handle only) for URI
		try {
			return new IrodsFileStore(uri);
		} catch (CoreException e) {
			throw new Error(e);
		}
	}

}
