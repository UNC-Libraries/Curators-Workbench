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
package unc.lib.cdr.workbench.arrange;

import gov.loc.mets.DivType;
import gov.loc.mets.FLocatType;
import gov.loc.mets.FileType;
import gov.loc.mets.util.METSConstants;

import java.net.URI;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterFactory;

import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.project.MetsProjectNature;
import unc.lib.cdr.workbench.views.FileStoreImageProvider;
import unc.lib.cdr.workbench.views.ImageProvider;

public class DivAdapterFactory implements IAdapterFactory {
	@SuppressWarnings("rawtypes")
	Class[] adapterTypes = new Class[] { OriginalFileStore.class,
			ImageProvider.class };

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		Object result = null;
		if (OriginalFileStore.class.equals(adapterType)) {
			if (adaptableObject instanceof DivType) {
				DivType d = (DivType) adaptableObject;
				return MetsProjectNature.getOriginalFileStore(d);
			}
		}
		if (ImageProvider.class.equals(adapterType)) {
			if (adaptableObject instanceof DivType) {
				DivType d = (DivType) adaptableObject;
				IFileStore store = MetsProjectNature.getOriginalFileStore(d);
				if(store == null || !store.fetchInfo().exists()) store = MetsProjectNature.getStagedFileStore(d);
				IFileInfo info = store.fetchInfo();
				if (!info.isDirectory() && info.exists()) {
					return new FileStoreImageProvider(store);
				} else {
					if (d.getFptr().size() > 0) {
						FileType fileType = (FileType) d.eResource()
								.getEObject(d.getFptr().get(0).getFILEID());
						for (FLocatType test : fileType.getFLocat()) {
							if (METSConstants.FLocat_USE_STAGE.equals(test
									.getUSE())) {
								URI stagedURI = URI.create(test.getHref());
								stagedURI = MetsProjectNature.getNatureForMetsObject(test).resolveProjectRelativeURI(stagedURI);
								try {
									IFileStore fs = EFS.getStore(stagedURI);
									return new FileStoreImageProvider(fs);
								} catch (CoreException ignore) {
								}
							}
						}
					}

				}
			} else if (adaptableObject instanceof IFileStore) {
				IFileStore store = (IFileStore) adaptableObject;
				if (!store.fetchInfo().isDirectory()) {
					return new FileStoreImageProvider(store);
				}
			}
		}
		return result;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getAdapterList() {
		return adapterTypes;
	}

}
