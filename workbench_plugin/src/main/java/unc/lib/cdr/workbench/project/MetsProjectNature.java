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

import gov.loc.mets.DivType;
import gov.loc.mets.DocumentRoot;
import gov.loc.mets.MetsType1;
import gov.loc.mods.mods.presentation.URIFragmentEditorInput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.osgi.service.prefs.BackingStoreException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.arrange.ArrangementProjectElement;
import unc.lib.cdr.workbench.originals.OriginalFileStore;
import unc.lib.cdr.workbench.originals.OriginalStub;
import unc.lib.cdr.workbench.originals.OriginalsFileSystem;
import unc.lib.cdr.workbench.rcp.Activator;
import unc.lib.cdr.workbench.stage.StagedFilesProjectElement;

public class MetsProjectNature implements IProjectNature {

	public static final String ORIGINALS_FOLDER_NAME = ".originals";
	// public static final String STAGE_FOLDER_NAME = ".stage";

	private static final Logger log = LoggerFactory.getLogger(MetsProjectNature.class);
	public static final String NATURE_ID = "cdr_producer.projectNature";
	public static final String STAGING_BUILDER_ID = "unc.lib.cdr.workbench.builders.StageBuilder";
	public static final String CROSSWALKS_BUILDER_ID = "unc.lib.cdr.workbench.builders.CrosswalksBuilder";
	private static final String STAGING_BASE_URI_KEY = "cdr_producer.stagingBaseURI";
	private static final String ORIGINALS_KEY = "cdr_producer.originals";

	private IProject project = null;

	private ICustomProjectElement[] elements = null;
	private ArrangementProjectElement arrangementElement = null;
	private StagedFilesProjectElement stagedFilesElement = null;
	private ArrayList<OriginalStub> originals = null;
	private ProjectEMFSession emfSession;

	public StagedFilesProjectElement getStagedFilesElement() {
		if (stagedFilesElement == null) {
			this.stagedFilesElement = new StagedFilesProjectElement(this);
		}
		return stagedFilesElement;
	}

	public ArrangementProjectElement getArrangementElement() {
		if (this.arrangementElement == null) {
			this.arrangementElement = new ArrangementProjectElement(this);
		}
		return arrangementElement;
	}

	public MetsProjectNature() {
	}

	public ICustomProjectElement[] getProjectElements() {
		if (this.elements == null) {
			this.elements = new ICustomProjectElement[] {
			/* getArrangementElement(), */getStagedFilesElement() };
		}
		return this.elements;
	}

	public Resource getMetsResource() {
		return getEMFSession().getMetsResource();
	}

	public static ComposedAdapterFactory getAdapterFactory() {
		return ProjectEMFSession.getAdapterFactory();
	}

	public CommandStack getCommandStack() {
		return getEMFSession().getCommandStack();
	}

	public AdapterFactoryEditingDomain getEditingDomain() {
		return getEMFSession().getEditingDomain();
	}

	public void save() throws CoreException {
		if (this.getProject().isOpen()) {
			if (this.getEMFSession() != null) {
				this.getEMFSession().save();
			}
		}
	}

	/**
	 * @return
	 */
	public ProjectEMFSession getEMFSession() {
		return this.emfSession;
	}

	public MetsType1 getMets() {
		DocumentRoot r = (DocumentRoot) this.getEMFSession().getMetsResource().getContents().get(0);
		return r.getMets();
	}

	@Override
	public void configure() throws CoreException {
		System.err.println("IN CONFIGURE!!");
		try {
			IFolder os = this.getProject().getFolder(ORIGINALS_FOLDER_NAME);
			if (!os.exists()) {
				os.create(IResource.FORCE, true, new NullProgressMonitor());
			}
			// set up builders
			IProjectDescription desc = this.getProject().getDescription();
			boolean autostage = getAutomaticStaging(getProject());
			setupBuildSpec(desc, autostage);
			this.project.setDescription(desc, new NullProgressMonitor());
			// this.project.setSessionProperty(EDITING_DOMAIN_KEY, editingDomain);
			// this.project.setSessionProperty(RESOURCE_SET_KEY, resourceSet);
		} catch (CoreException e) {
			e.printStackTrace();
		}
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
		IEclipsePreferences projectNode = new ProjectScope(project).getNode(Activator.PLUGIN_ID);
		try {
			projectNode.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		this.emfSession = new ProjectEMFSession(project);
		this.loadOriginals();
	}

	private void loadOriginals() {
		IEclipsePreferences projectNode = new ProjectScope(project).getNode(Activator.PLUGIN_ID);
		byte[] s = projectNode.getByteArray(ORIGINALS_KEY, null);
		if (s == null) {
			this.originals = new ArrayList<OriginalStub>();
		} else {
			try {
				ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(s));
				this.originals = (ArrayList<OriginalStub>) in.readObject();
				log.debug("loaded originals: " + this.originals.size());
			} catch (Exception e) {
				throw new Error("Cannot deserialize originals for project", e);
			}
		}
	}

	private void saveOriginals() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			ObjectOutputStream out = new ObjectOutputStream(baos);
			out.writeObject(this.originals);
		} catch (Exception e) {
			throw new Error("Cannot serialize project originals", e);
		}
		IEclipsePreferences projectNode = new ProjectScope(project).getNode(Activator.PLUGIN_ID);
		projectNode.putByteArray(ORIGINALS_KEY, baos.toByteArray());
		try {
			projectNode.flush();
		} catch (BackingStoreException e) {
			throw new Error(e);
		}
		log.debug("wrote originals to preferences");
	}

	public void addOriginal(OriginalStub o) {
		this.originals.add(o);
		log.debug("adding original at: " + o.getBase().toString());
		this.saveOriginals();
	}

	public List<OriginalStub> getOriginals() {
		return Collections.unmodifiableList(this.originals);
	}

	public static IProject getProjectForMetsEObject(EObject object) {
		IProject result = null;
		Resource objectResource = object.eResource();
		if (objectResource != null) {
			for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
				if (p.isOpen()) {
					MetsProjectNature n = MetsProjectNature.get(p);
					if (n != null) {
						Resource resource = n.getEMFSession().getMetsResource();
						if (resource != null && objectResource.equals(resource)) {
							return p;
						}
					}
				}
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

	// public IFolder getOriginalsFolder() {
	// return this.getProject().getFolder(ORIGINALS_FOLDER_NAME);
	// }

	public static boolean getAutomaticStaging(IProject project) {
		boolean result = false;
		ProjectScope[] s = { new ProjectScope(project) };
		result = Platform.getPreferencesService()
				.getBoolean(Activator.PLUGIN_ID, Activator.AUTOSTAGE_PREFERENCE, true, s);
		return result;
	}

	public static void setAutomaticStaging(boolean auto, IProject project) {
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
	public static OriginalFileStore getOriginal(DivType div) {
		try {
			if (div.getCONTENTIDS().size() > 0) {
				URI uri = null;
				for (String contentid : div.getCONTENTIDS()) {
					try {
						uri = new URI(contentid);
					} catch (URISyntaxException e) {
						throw new Error(e);
					}
					if (!"uuid".equals(uri.getScheme()))
						break;
				}
				if (uri != null) {
					try {
						IPath divPath = Path.fromOSString(uri.getPath());
						MetsProjectNature n = MetsProjectNature.getNatureForMetsObject(div);
						OriginalStub mystub = null;
						for (OriginalStub stub : n.getOriginals()) {
							IPath originalStubPath = Path.fromOSString(stub.getBase().getPath());
							if (originalStubPath.isPrefixOf(divPath)) {
								mystub = stub;
								break;
							}
						}
						return (OriginalFileStore) OriginalsFileSystem.wrapStore(uri, mystub);
					} catch (Exception ignored) {
					}
				}
			}
		} catch (NullPointerException ignored) {
		}
		return null;
	}

	/**
	 * @param prog
	 * @return
	 */
	public static MetsProjectNature get(IProject prog) {
		MetsProjectNature result = null;
		try {
			result = (MetsProjectNature) prog.getNature(NATURE_ID);
		} catch (CoreException e) {
		}
		return result;
	}

	/**
	 * @param stageURI
	 */
	public static void setStagingBase(java.net.URI stageURI, IProject project) {
		IEclipsePreferences projectNode = new ProjectScope(project).getNode(Activator.PLUGIN_ID);
		projectNode.put(STAGING_BASE_URI_KEY, stageURI.toString());
	}

	public java.net.URI getStagingBase() {
		try {
			IEclipsePreferences projectNode = new ProjectScope(project).getNode(Activator.PLUGIN_ID);
			String s = projectNode.get(STAGING_BASE_URI_KEY, null);
			return new java.net.URI(s);
		} catch (Exception e) {
			throw new Error("unexpected", e);
		}

	}

	/**
	 * @return
	 */
	public IFileStore getStageFileStore() {
		try {
			return EFS.getStore(getStagingBase());
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void setupBuildSpec(IProjectDescription desc, boolean autostage) {
		System.err.println("setting autostage to: " + autostage);

		// create staging builder
		ICommand stagingCommand = desc.newCommand();
		stagingCommand.setBuilderName(MetsProjectNature.STAGING_BUILDER_ID);
		stagingCommand.setBuilding(IncrementalProjectBuilder.AUTO_BUILD, autostage);
		stagingCommand.setBuilding(IncrementalProjectBuilder.FULL_BUILD, true);
		stagingCommand.setBuilding(IncrementalProjectBuilder.INCREMENTAL_BUILD, true);

		// create crosswalks builder
		ICommand crosswalksCommand = desc.newCommand();
		crosswalksCommand.setBuilderName(MetsProjectNature.CROSSWALKS_BUILDER_ID);
		crosswalksCommand.setBuilding(IncrementalProjectBuilder.AUTO_BUILD, true);
		crosswalksCommand.setBuilding(IncrementalProjectBuilder.FULL_BUILD, true);
		crosswalksCommand.setBuilding(IncrementalProjectBuilder.INCREMENTAL_BUILD, true);

		// add builders to project description
		List<ICommand> builders = new ArrayList<ICommand>();
		builders.add(stagingCommand);
		builders.add(crosswalksCommand);
		desc.setBuildSpec(builders.toArray(new ICommand[2]));
	}

	public static EObject getModel(URIFragmentEditorInput in) {
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(in.getProjectName());
		MetsProjectNature n = MetsProjectNature.get(p);
		return n.getEditingDomain().getResourceSet().getResources().get(0).getEObject(in.getFragmentID());
	}

}
