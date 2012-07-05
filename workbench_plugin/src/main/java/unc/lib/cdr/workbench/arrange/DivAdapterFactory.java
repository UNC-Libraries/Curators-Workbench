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

import org.eclipse.core.runtime.IAdapterFactory;

import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.project.MetsProjectNature;

public class DivAdapterFactory implements IAdapterFactory {
	@SuppressWarnings("rawtypes")
	Class[] adapterTypes = new Class[] { OriginalFileStore.class };

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		Object result = null;
		if (OriginalFileStore.class.equals(adapterType)) {
			if (adaptableObject instanceof DivType) {
				DivType d = (DivType) adaptableObject;
				return MetsProjectNature.getOriginal(d);
			}
		}
		return result;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getAdapterList() {
		return null;
	}

}
