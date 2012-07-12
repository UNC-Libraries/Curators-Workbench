/**
 * Copyright 2011 The University of North Carolina at Chapel Hill
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
package unc.lib.cdr.workbench.project;

import edu.unc.lib.schemas.acl.provider.AclItemProviderAdapterFactory;
import gov.loc.mets.DocumentRoot;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.provider.MetsItemProviderAdapterFactory;
import gov.loc.mets.util.METSUtils;
import gov.loc.mets.util.MetsResourceFactoryImpl;
import gov.loc.mods.mods.provider.MODSItemProviderAdapterFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3._1999.xlink.provider.XlinkItemProviderAdapterFactory;

import unc.lib.cdr.workbench.rcp.Activator;

/**
 * @author Gregory Jansen
 * 
 */
public class ProjectEMFSession {
	private static final Path METS_PATH = new Path(".workbench-mets.xml");
	private static final Logger log = LoggerFactory.getLogger(ProjectEMFSession.class);
	private static ComposedAdapterFactory adapterFactory = null;
	private static Map<String, String> xmlOptions = new HashMap<String, String>();

	static {
		adapterFactory = new ComposedAdapterFactory();
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new MetsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new XlinkItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new MODSItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new AclItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		xmlOptions.put(XMLResource.OPTION_ENCODING, "utf-8");
	}

	private ResourceSet resourceSet = null;
	private CommandStack commandStack = null;
	private AdapterFactoryEditingDomain editingDomain = null;
	private Resource metsResource = null;
	private ExtendedMetaData extendedMetaData = null;
	private IProject project = null;

	public ProjectEMFSession(IProject project) {
		this.project = project;
		this.resourceSet = new ResourceSetImpl();
		// Register the appropriate resource factory to handle all file
		// extensions.
		this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new MetsResourceFactoryImpl());
		// Register the package to ensure it is available during loading.
		this.resourceSet.getPackageRegistry().put(MetsPackage.eNS_URI, MetsPackage.eINSTANCE);
		// Create the command stack that will notify this editor as commands are
		// executed.
		this.commandStack = new BasicCommandStack();
		this.editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, resourceSet);
		this.extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		load();
	}
	
	private void load() {
		IPath f = getMetsFile();
		IFile old = getOldMetsFile();
		if (!f.toFile().exists() && old.exists()) {
			try {

				System.out.println("moving " + old.getLocation() + " to " + f);
				old.move(f, true, new NullProgressMonitor());
			} catch (CoreException e) {
				throw new Error(e);
			}
		}
		String uri = f.toFile().toURI().toString();
		try {
			log.debug("METS attempting to load existing file:" + uri);
			this.metsResource = this.resourceSet.getResource(URI.createURI(uri), true);
			((ResourceImpl) this.metsResource).setIntrinsicIDToEObjectMap(new HashMap());
			this.metsResource.load(xmlOptions);
			log.debug("METS loaded from existing file");
		} catch (Exception e) {
			log.debug("METS being created:" + uri);
			this.metsResource = this.resourceSet.createResource(URI.createURI(uri));
			((ResourceImpl) this.metsResource).setIntrinsicIDToEObjectMap(new HashMap());
			DocumentRoot r = METSUtils.createInitialMetsDocument(project.getName() + " Workbench Manifest");
			this.metsResource.getContents().add(r);
			log.debug("METS created: " + this.metsResource.getContents());
			try {
				this.metsResource.save(xmlOptions);
				// this.metsResource.load(xmlOptions);
				log.debug("METS saved for the first time");
			} catch (IOException e1) {
				log.error("Problem creating METS", e1);
				Status s = new Status(Status.ERROR, Activator.PLUGIN_ID, "Cannot save METS", e1);
			}
		} finally {
			IResourceChangeListener listener = new ProjectCloseListener();
			// TODO listen for changes to the project name and update METS
			ResourcesPlugin.getWorkspace().addResourceChangeListener(listener, IResourceChangeEvent.PRE_CLOSE);
		}
		for (Diagnostic d : this.metsResource.getErrors()) {
			log.debug(d.toString());
		}
	}

	public IPath getMetsFile() {
		IPath metsPath = this.project.getLocation().append(METS_PATH);
		System.err.println("METS FILE PATH: "+metsPath);
		return metsPath;
	}

	public IFile getOldMetsFile() {
		return this.project.getFile(METS_PATH);
	}

	public static ComposedAdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	public CommandStack getCommandStack() {
		return commandStack;
	}

	public AdapterFactoryEditingDomain getEditingDomain() {
		return editingDomain;
	}

	public Resource getMetsResource() {
		return metsResource;
	}

	public ExtendedMetaData getExtendedMetaData() {
		return extendedMetaData;
	}

	/**
	 * @author Gregory Jansen
	 * 
	 */
	public class ProjectCloseListener implements IResourceChangeListener {

		ProjectCloseListener() {
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceChangeListener#resourceChanged
		 * (org.eclipse.core.resources.IResourceChangeEvent)
		 */
		@Override
		public void resourceChanged(IResourceChangeEvent event) {
			IResource res = event.getResource();
			if (project.equals(res) && IResourceChangeEvent.PRE_CLOSE == event.getType()) {
				log.debug("Saving EMF session prior to project close.");
				IProject p = (IProject) res;
				MetsProjectNature.get(p).getEMFSession().save();
				ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
			}
		}

	}

	/**
	 *
	 */
	public void save() {
		try {
			this.metsResource.save(xmlOptions);
		} catch (IOException e) {
			log.error("Cannot save EMF session", e);
		}
	}
}
