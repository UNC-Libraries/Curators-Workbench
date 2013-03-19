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
