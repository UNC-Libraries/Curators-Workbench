/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gov.loc.mods.mods.presentation;

import java.lang.reflect.Constructor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.CommonUIPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.osgi.framework.Bundle;

/**
 * @author Gregory Jansen
 *
 */
public class URIFragmentEditorInput implements IEditorInput, IPersistableElement {
	private EObject modsObject = null;
	private String projectName;
	private String name;
	private String fragmentID;

	/**
	 * @param rescURI
	 * @param name
	 */
	public URIFragmentEditorInput(String projectName, String fragmentID, String name, EObject mods) {
		this.modsObject = mods;
		this.projectName = projectName;
		this.fragmentID = fragmentID;
		this.name = name;

		System.out.println("constructed from parts: " + toString());
	}

	@Override
	public String toString() {
		return "URIFragmentEditorInput [projectName=" + projectName + ", name=" + name + ", fragmentID=" + fragmentID
				+ "]";
	}

	public String getFragmentID() {
		return fragmentID;
	}

	public URIFragmentEditorInput(String platformURI, String fragmentID) {
		this.projectName = platformURI;
		this.fragmentID = fragmentID;
	}

	public URIFragmentEditorInput(IMemento memento) {
		loadState(memento);
	}

	public EObject getMODS() {
		return this.modsObject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fragmentID == null) ? 0 : fragmentID.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		URIFragmentEditorInput other = (URIFragmentEditorInput) obj;
		if (fragmentID == null) {
			if (other.fragmentID != null)
				return false;
		} else if (!fragmentID.equals(other.fragmentID))
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		return true;
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * TODO: make this return false for non-existent fragments. Returns <b>true</b> only if the URI represents a file and
	 * if this file exists.
	 *
	 * @see org.eclipse.ui.IEditorInput#exists()
	 */
	@Override
	public boolean exists() {
		return true;
		// if (getPlatformURI().isFile())
		// {
		// return new File(getURI().toFileString()).exists();
		// }
		// else
		// {
		// if (EMFPlugin.IS_RESOURCES_BUNDLE_AVAILABLE)
		// {
		// return EclipseUtil.exists(projectName);
		// }
		// else
		// {
		// return false;
		// }
		// }
	}

	/**
	 * Returns the <i>toString</i> value of the associated URI.
	 *
	 * @see org.eclipse.ui.IEditorInput#getName()
	 */
	@Override
	public String getName() {
		if (name == null) {
			return getProjectName() + "#" + this.fragmentID;
		} else {
			return name;
		}
	}

	@Override
	public String getToolTipText() {
		return getProjectName() + "#" + this.fragmentID;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public IPersistableElement getPersistable() {
		return this;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) {
		if (EMFPlugin.IS_RESOURCES_BUNDLE_AVAILABLE) {
			Object result = EclipseUtil.getAdapter(adapter, projectName, fragmentID);
			if (result != null) {
				return result;
			}
		}
		return null;
	}

	@Override
	public String getFactoryId() {
		return URIFragmentEditorInputFactory.ID;
	}

	protected String getBundleSymbolicName() {
		return ModsEditorPlugin.getPlugin().getSymbolicName();
	}

	protected static final String BUNDLE_TAG = "bundle";
	protected static final String CLASS_TAG = "class";
	protected static final String URI_TAG = "projectName";
	protected static final String FRAGMENT_TAG = "fragment";
	protected static final String NAME_TAG = "name";

	static URIFragmentEditorInput create(IMemento memento) {
		String bundleSymbolicName = memento.getString(BUNDLE_TAG);
		String className = memento.getString(CLASS_TAG);
		try {
			Bundle bundle = Platform.getBundle(bundleSymbolicName);
			Class<?> theClass = bundle.loadClass(className);
			Constructor<?> constructor = theClass.getConstructor(IMemento.class);
			return (URIFragmentEditorInput) constructor.newInstance(memento);
		} catch (Exception exception) {
			CommonUIPlugin.INSTANCE.log(exception);
			return new URIFragmentEditorInput(memento);
		}
	}

	public void saveState(IMemento memento) {
		System.out.println("saving: " + toString());
		memento.putString(BUNDLE_TAG, getBundleSymbolicName());
		memento.putString(CLASS_TAG, getClass().getName());
		memento.putString(URI_TAG, projectName.toString());
		memento.putString(FRAGMENT_TAG, fragmentID);
		memento.putString(NAME_TAG, name);
	}

	protected void loadState(IMemento memento) {
		projectName = memento.getString(URI_TAG);
		fragmentID = memento.getString(FRAGMENT_TAG);
		name = memento.getString(NAME_TAG);
	}

	protected static class EclipseUtil {
		public static Object getAdapter(Class<?> adapter, String platformURI, String fragmentID) {
			if ((adapter == IFile.class || adapter == IResource.class)) {
				return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformURI));
			} else {
				return null;
			}
		}

		public static boolean exists(URI uri) {
			if (uri.isPlatformResource()) {
				return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))).exists();
			} else {
				return false;
			}
		}
	}

}
