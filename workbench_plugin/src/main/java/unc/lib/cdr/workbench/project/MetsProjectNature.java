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

import edu.unc.lib.schemas.acl.provider.AclItemProviderAdapterFactory;
import gov.loc.mets.DivType;
import gov.loc.mets.DocumentRoot;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.MetsType1;
import gov.loc.mets.provider.MetsItemProviderAdapterFactory;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;
import gov.loc.mets.util.MetsResourceFactoryImpl;
import gov.loc.mods.mods.provider.MODSItemProviderAdapterFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3._1999.xlink.provider.XlinkItemProviderAdapterFactory;

import unc.lib.cdr.workbench.arrange.ArrangementProjectElement;
import unc.lib.cdr.workbench.capture.OriginalFoldersProjectElement;
import unc.lib.cdr.workbench.rcp.Activator;
import unc.lib.cdr.workbench.stage.StagedFilesProjectElement;
import unc.lib.cdr.workbench.xwalk.CrosswalksProjectElement;

public class MetsProjectNature implements IProjectNature {
	/**
	 * @author Gregory Jansen
	 *
	 */
	public class ProjectCloseListener implements IResourceChangeListener {

		private IProject myproject = null;

		ProjectCloseListener(IProject project) {
			this.myproject = project;
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
			if (myproject.equals(res) && IResourceChangeEvent.PRE_CLOSE == event.getType()) {
				log.debug("detected my project PRE_CLOSE event.");
				// save the METS before closing..
				try {
					MetsProjectNature n = (MetsProjectNature) myproject.getNature(NATURE_ID);
					n.save();
				} catch (CoreException e) {
					e.printStackTrace();
				} finally {
					ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
				}

			}
		}

	}

	public static final String ORIGINALS_FOLDER_NAME = "originals";
	private static final String CROSSWALKS_FOLDER_NAME = "crosswalks";
	public static final String STAGE_FOLDER_NAME = ".stage";

	private static final Logger log = LoggerFactory.getLogger(MetsProjectNature.class);
	public static final String NATURE_ID = "cdr_producer.projectNature";
	// public static final QualifiedName METS_KEY = new QualifiedName(NATURE_ID, "cdr_producer.metsKey");
	public static final QualifiedName EDITING_DOMAIN_KEY = new QualifiedName(NATURE_ID, "cdr_producer.editingDomain");
	public static final QualifiedName RESOURCE_SET_KEY = new QualifiedName(NATURE_ID, "cdr_producer.resourceSet");
	public static final String STAGING_BUILDER_ID = "unc.lib.cdr.workbench.builders.StageBuilder";
	public static final String CROSSWALKS_BUILDER_ID = "unc.lib.cdr.workbench.builders.CrosswalksBuilder";
	public static final Path METS_PATH = new Path("workbench-mets.xml");
	private static ComposedAdapterFactory adapterFactory = null;

	private IProject project = null;
	private ResourceSet resourceSet = null;
	private CommandStack commandStack = null;
	private EditingDomain editingDomain = null;
	private Resource metsResource = null;
	private ExtendedMetaData extendedMetaData = null;
	private ICustomProjectElement[] elements = null;
	private CrosswalksProjectElement crosswalksElement = null;
	private ArrangementProjectElement arrangementElement = null;
	private OriginalFoldersProjectElement originalsElement = null;
	private StagedFilesProjectElement stagedFilesElement = null;

	public ExtendedMetaData getExtendedMetaData() {
		return extendedMetaData;
	}

	public StagedFilesProjectElement getStagedFilesElement() {
		if (stagedFilesElement == null) {
			this.stagedFilesElement = new StagedFilesProjectElement(this);
		}
		return stagedFilesElement;
	}

	public OriginalFoldersProjectElement getOriginalsElement() {
		if (originalsElement == null) {
			this.originalsElement = new OriginalFoldersProjectElement(this);
		}
		return originalsElement;
	}

	public CrosswalksProjectElement getCrosswalksElement() {
		if (this.crosswalksElement == null) {
			this.crosswalksElement = new CrosswalksProjectElement(this);
		}
		return crosswalksElement;
	}

	public ArrangementProjectElement getArrangementElement() {
		if (this.arrangementElement == null) {
			this.arrangementElement = new ArrangementProjectElement(this);
		}
		return arrangementElement;
	}

	static {
		adapterFactory = new ComposedAdapterFactory();
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new MetsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new XlinkItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new MODSItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new AclItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}

	public MetsProjectNature() {
		this.resourceSet = new ResourceSetImpl();
		// Register the appropriate resource factory to handle all file
		// extensions.
		this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new MetsResourceFactoryImpl());
		// Register the package to ensure it is available during loading.
		this.resourceSet.getPackageRegistry().put(MetsPackage.eNS_URI, MetsPackage.eINSTANCE);
		// Create the command stack that will notify this editor as commands are
		// executed.
		commandStack = new BasicCommandStack();
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, resourceSet);
		extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
	}

	public ICustomProjectElement[] getProjectElements() {
		if (this.elements == null) {
			this.elements = new ICustomProjectElement[] { getOriginalsElement(),
			/* getArrangementElement(), */getCrosswalksElement(), getStagedFilesElement() };
		}
		return this.elements;
	}

	public Resource getMetsResource() {
		return metsResource;
	}

	public static ComposedAdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	public CommandStack getCommandStack() {
		return commandStack;
	}

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public void save() throws CoreException {
		try {
			if (this.getProject().isOpen() && this.getMetsResource() != null) {
				this.getMetsResource().save(new HashMap());
			}
			log.debug("saved mets");
		} catch (IOException e) {
			Status s = new Status(Status.ERROR, Activator.PLUGIN_ID, "Cannot save METS", e);
			throw new CoreException(s);
		}
	}

	public void load() throws CoreException {
		IFile f = project.getFile(MetsProjectNature.METS_PATH);
		Map xmlOptions = new HashMap();
		String uri = f.getLocationURI().toString();
		try {
			log.debug("METS attempting to load existing file");
			this.metsResource = this.resourceSet.getResource(URI.createURI(uri), true);
			((ResourceImpl) this.metsResource).setIntrinsicIDToEObjectMap(new HashMap());
			this.metsResource.load(xmlOptions);
			log.debug("METS loaded from existing file");
		} catch (Exception e) {
			log.debug("METS being created.");
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
				throw new CoreException(s);
			}
		} finally {
			IResourceChangeListener listener = new MetsProjectNature.ProjectCloseListener(project);
			// TODO listen for changes to the project name and update METS
			ResourcesPlugin.getWorkspace().addResourceChangeListener(listener, IResourceChangeEvent.PRE_CLOSE);
		}
		for (Diagnostic d : this.metsResource.getErrors()) {
			log.debug(d.toString());
		}
	}

	public MetsType1 getMets() {
		DocumentRoot r = (DocumentRoot) this.metsResource.getContents().get(0);
		return r.getMets();
	}

	@Override
	public void configure() throws CoreException {
		// setProject already called
		// TODO initialize the adapterfactories
		// load();

	}

	@Override
	public void deconfigure() throws CoreException {
		save();
	}

	@Override
	public IProject getProject() {
		return this.project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
		try {
			this.project.setSessionProperty(EDITING_DOMAIN_KEY, editingDomain);
			this.project.setSessionProperty(RESOURCE_SET_KEY, resourceSet);
			IFolder cws = this.getProject().getFolder(CROSSWALKS_FOLDER_NAME);
			if (!cws.exists()) {
				cws.create(false, false, new NullProgressMonitor());
			}

			IFolder os = this.getProject().getFolder(ORIGINALS_FOLDER_NAME);
			if (!os.exists()) {
				os.create(false, false, new NullProgressMonitor());
			}
			load();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public static IProject getProjectForMetsEObject(EObject object) {
		IProject result = null;
		if (object.eResource() != null) {
			java.net.URI u;
			try {
				u = new java.net.URI(object.eResource().getURI().toString());
			} catch (URISyntaxException e) {
				throw new Error(e);
			}
			IFile[] files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(u);
			if (files.length > 0) {
				result = files[0].getProject();
			}
		}
		return result;
	}

	public static MetsProjectNature getNatureForMetsObject(EObject object) {
		IProject p = getProjectForMetsEObject(object);
		MetsProjectNature result;
		try {
			result = (MetsProjectNature) p.getNature(NATURE_ID);
		} catch (CoreException e) {
			throw new Error("Workbench Project MUST have a MetsProjectNature");
		}
		return result;
	}

	public static EditingDomain getEditingDomain(EObject object) {
		EditingDomain result = null;
		IProject p = getProjectForMetsEObject(object);
		if (p != null) {
			try {
				MetsProjectNature mpn = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
				result = mpn.getEditingDomain();
			} catch (CoreException ignored) {
			}
		}
		return result;
	}

	public IFolder getOriginalsFolder() {
		return this.getProject().getFolder(ORIGINALS_FOLDER_NAME);
	}

	public IFolder getStageFolder() {
		return this.getProject().getFolder(STAGE_FOLDER_NAME);
	}

	public boolean getAutomaticStaging() {
		boolean result = false;
		ProjectScope[] s = {new ProjectScope(project)};
		result = Platform.getPreferencesService().getBoolean(Activator.PLUGIN_ID, Activator.AUTOSTAGE_PREFERENCE, true, s);
		return result;
	}

	public void setAutomaticStaging(boolean auto) {
		ProjectScope s = new ProjectScope(project);
		IEclipsePreferences pref = s.getNode(Activator.PLUGIN_ID);
		pref.putBoolean(Activator.AUTOSTAGE_PREFERENCE, auto);
	}

	/**
	 * Finds the original file or folder object for a given div or null.
	 *
	 * @param div
	 * @return the IResource of the original
	 */
	public static IResource getOriginal(DivType div) {
		if (div.getCONTENTIDS().size() > 0) {
			for (String contentid : div.getCONTENTIDS()) {
				try {
					java.net.URI originalLoc = new java.net.URI(contentid);
					IResource[] rs = null;
					if (METSUtils.isContainer(div)) {
						rs = ResourcesPlugin.getWorkspace().getRoot().findContainersForLocationURI(originalLoc);
					} else if (METSConstants.Div_File.equals(div.getTYPE())) {
						rs = ResourcesPlugin.getWorkspace().getRoot().findContainersForLocationURI(originalLoc);
					}
					IProject project = MetsProjectNature.getProjectForMetsEObject(div);
					for (IResource r : rs) {
						if (project.equals(r.getProject())) {
							return r;
						}
					}
				} catch (Exception ignored) {
				}
			}
		}
		return null;
	}

}
