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
import gov.loc.mets.util.METSConstants;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdapterFactory;

import unc.lib.cdr.workbench.project.MetsProjectNature;

public class DivAdapterFactory implements IAdapterFactory {
	@SuppressWarnings("rawtypes")
	Class[] adapterTypes = new Class[] { IResource.class };

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		Object result = null;
		if (IResource.class.equals(adapterType)) {
			if (adaptableObject instanceof DivType) {
				// make a DivType into a IResource.
				DivType d = (DivType) adaptableObject;
				IProject project = MetsProjectNature.getProjectForMetsEObject(d);
				if(project == null) return result;
				if (d.getCONTENTIDS() != null && d.getCONTENTIDS().size() > 0) {
					URI loc;
					try {
						loc = new URI(d.getCONTENTIDS().get(0));
						if (METSConstants.Div_File.equals(d.getTYPE())) {
							IFile[] files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(loc);
							for(IFile f : files) {
								if(project.equals(f.getProject())) {
									result = f;
								}
							}
						} else {
							IContainer[] cs = ResourcesPlugin.getWorkspace().getRoot().findContainersForLocationURI(loc);
							for(IContainer f : cs) {
								if(project.equals(f.getProject())) {
									result = f;
								}
							}
						}
					} catch (URISyntaxException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
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
