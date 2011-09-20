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
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import unc.lib.cdr.workbench.arrange.ArrangementProjectElement;
import unc.lib.cdr.workbench.capture.OriginalFoldersProjectElement;
import unc.lib.cdr.workbench.rcp.Activator;
import unc.lib.cdr.workbench.stage.StagedFilesProjectElement;
import unc.lib.cdr.workbench.xwalk.CrosswalksProjectElement;

public class MetsProjectNature implements IProjectNature {

	public static final String ORIGINALS_FOLDER_NAME = "originals";
	private static final String CROSSWALKS_FOLDER_NAME = "crosswalks";
	// public static final String STAGE_FOLDER_NAME = ".stage";

	private static final Logger log = LoggerFactory.getLogger(MetsProjectNature.class);
	public static final String NATURE_ID = "cdr_producer.projectNature";
	public static final QualifiedName EMF_SESSION_KEY = new QualifiedName(NATURE_ID, "cdr_producer.projectEMFSession");
	public static final QualifiedName EDITING_DOMAIN_KEY = new QualifiedName(NATURE_ID,
   "cdr_producer.editingDomain");
	public static final QualifiedName INITIAL_AUTOSTAGE_KEY = new QualifiedName(NATURE_ID, "cdr_producer.init_autostage");
	public static final String STAGING_BUILDER_ID = "unc.lib.cdr.workbench.builders.StageBuilder";
	public static final String CROSSWALKS_BUILDER_ID = "unc.lib.cdr.workbench.builders.CrosswalksBuilder";
	private static final QualifiedName STAGING_BASE_URI_KEY = new QualifiedName(NATURE_ID, "cdr_producer.stagingBaseURI");

	private IProject project = null;

	private ICustomProjectElement[] elements = null;
	private CrosswalksProjectElement crosswalksElement = null;
	private ArrangementProjectElement arrangementElement = null;
	private OriginalFoldersProjectElement originalsElement = null;
	private StagedFilesProjectElement stagedFilesElement = null;

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

	public MetsProjectNature() {
	}

	public ICustomProjectElement[] getProjectElements() {
		if (this.elements == null) {
			this.elements = new ICustomProjectElement[] { getOriginalsElement(),
			/* getArrangementElement(), */getCrosswalksElement(), getStagedFilesElement() };
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

	public EditingDomain getEditingDomain() {
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
	private ProjectEMFSession getEMFSession() {
		ProjectEMFSession result = null;
		try {
			if (this.getProject().getSessionProperty(EMF_SESSION_KEY) != null) {
				result = (ProjectEMFSession) this.getProject().getSessionProperty(EMF_SESSION_KEY);
			}
		} catch (CoreException e) {

		}
		return result;
	}

	public MetsType1 getMets() {
		DocumentRoot r = (DocumentRoot) this.getEMFSession().getMetsResource().getContents().get(0);
		return r.getMets();
	}

	@Override
	public void configure() throws CoreException {
		System.err.println("IN CONFIGURE!!");
		try {
			IFolder cws = this.getProject().getFolder(CROSSWALKS_FOLDER_NAME);
			if (!cws.exists()) {
				System.err.println("READY TO MAKE CROSSWALK FOLDER!!");
				cws.create(IResource.FORCE, true, new NullProgressMonitor());
			}

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
		if(this.getEMFSession() != null) {
			this.project.getSessionProperties().remove(EMF_SESSION_KEY);
		}

	}

	@Override
	public IProject getProject() {
		return this.project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
		if (this.getEMFSession() == null) {
			try {
				ProjectEMFSession session = new ProjectEMFSession(project);
				project.setSessionProperty(EMF_SESSION_KEY, session);
				project.setSessionProperty(EDITING_DOMAIN_KEY, session.getEditingDomain());
			} catch (CoreException e) {
				log.error("Problem setting up EMF session", e);
			}
		}
	}

	public static IProject getProjectForMetsEObject(EObject object) {
		IProject result = null;
		if (object.eResource() != null && object.eResource().getURI() != null) {
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
		try {
			project.setPersistentProperty(STAGING_BASE_URI_KEY, stageURI.toString());
		} catch (CoreException e) {
			throw new Error("Cannot set staging base for project.", e);
		}
	}

	public java.net.URI getStagingBase() {
		try {
			String s = this.getProject().getPersistentProperty(STAGING_BASE_URI_KEY);
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

}
