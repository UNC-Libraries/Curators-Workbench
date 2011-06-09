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
package unc.lib.cdr.workbench.project;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.edit.domain.EditingDomain;

@SuppressWarnings("rawtypes")
public class AdapterFactory implements IAdapterFactory {
	private static final Class[] adapters = new Class[] { gov.loc.mets.MetsType.class };

	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		try {
			if (adaptableObject instanceof IProject) {
				IProject proj = (IProject) adaptableObject;
				MetsProjectNature metsNature = (MetsProjectNature) proj.getNature(MetsProjectNature.NATURE_ID);
				if (adapterType.isAssignableFrom(gov.loc.mets.MetsType.class)) {
					return metsNature.getMets();
				} else if (EditingDomain.class.equals(adapterType)) {
					return metsNature.getEditingDomain();
				}
			}
		} catch (CoreException e) {
			return e.getStatus();
		}
		return Status.OK_STATUS;
	}

	@Override
	public Class[] getAdapterList() {
		return adapters;
	}

}
