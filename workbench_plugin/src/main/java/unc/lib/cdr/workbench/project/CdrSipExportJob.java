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
package unc.lib.cdr.workbench.project;

import gov.loc.mets.AmdSecType;
import gov.loc.mets.DivType;
import gov.loc.mets.DocumentRoot;
import gov.loc.mets.FLocatType;
import gov.loc.mets.FileGrpType;
import gov.loc.mets.FileGrpType1;
import gov.loc.mets.FileType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.MetsType;
import gov.loc.mets.MetsType1;
import gov.loc.mets.StructMapType;
import gov.loc.mets.provider.MetsItemProviderAdapterFactory;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.METSUtils;
import gov.loc.mets.util.MetsResourceFactoryImpl;
import gov.loc.mods.mods.provider.MODSItemProviderAdapterFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
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
public class CdrSipExportJob extends Job {
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(CdrSipExportJob.class);

	IProject p = null;
	String filepath = null;
	private ResourceSetImpl resourceSet;
	private BasicCommandStack commandStack;
	private AdapterFactoryEditingDomain editingDomain;
	private BasicExtendedMetaData extendedMetaData;
	private ComposedAdapterFactory adapterFactory;
	private Resource metsResource;

	public CdrSipExportJob(IProject p, String filepath) {
		super("Exporting project '" + p.getName() + "' for submission to the CDR");
		this.p = p;
		this.filepath = filepath;
		adapterFactory = new ComposedAdapterFactory();
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new MetsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new XlinkItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new MODSItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime. IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		MetsProjectNature n = null;
		try {
			n = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
		} catch (CoreException e) {
			return new Status(Status.ERROR, Activator.PLUGIN_ID, "There was a problem obtaining the METS project nature.",
					e);
		}
		MetsType1 workbench = n.getMets();

		// initialize a new EMF environment
		resourceSet = new ResourceSetImpl();
		// Register the appropriate resource factory to handle all file
		// extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new MetsResourceFactoryImpl());
		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(MetsPackage.eNS_URI, MetsPackage.eINSTANCE);
		// Create the command stack that will notify this editor as commands are
		// executed.
		commandStack = new BasicCommandStack();
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, resourceSet);
		extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());

		// create export destination URI
		File f = new File(this.filepath);
		if(f.exists()) {
			f.delete();
		}

		String uri = f.toURI().toString();
		metsResource = this.resourceSet.createResource(URI.createURI(uri));
		((ResourceImpl) this.metsResource).setIntrinsicIDToEObjectMap(new HashMap());

		EcoreUtil.Copier copier = new Copier();
		MetsType1 cdr = (MetsType1) copier.copy(workbench);
		copier.copyReferences();
		DocumentRoot root = MetsFactory.eINSTANCE.createDocumentRoot();
		root.setMets(cdr);

		metsResource.getContents().add(root);

		// remove workbench cruft
		removeUnlinkedOrUnsupportedMdSecTypes(cdr);
		removeExtraLinkedMdSecTypes(cdr);
		removeNonStageFLocat(cdr);
		removeNonObjectsFileGroups(cdr);
		removeEmptyStructLink(cdr);
		removeEmptyFileTypes(cdr);
		removeEmptyAmdSecTypes(cdr);
		// moveObjectsFileGroupsToFileSec(cdr);

		// cleanup PROFILE and TYPEs..
		cdr.setPROFILE("http://cdr.unc.edu/METS/profiles/Simple");
		StructMapType map = (StructMapType) METSUtils.findBagDiv(cdr).eContainer();
		map.eUnset(MetsPackage.eINSTANCE.getStructMapType_TYPE());

		try {
			Map<String, String> xmlOptions = new HashMap<String, String>();
			xmlOptions.put(XMLResource.OPTION_ENCODING, "utf-8");
			this.metsResource.save(xmlOptions);
			LOG.debug("mets export saved to: " + uri);
		} catch (IOException e1) {
			LOG.error("Problem creating METS", e1);
			Status s = new Status(Status.ERROR, Activator.PLUGIN_ID, "Cannot save METS", e1);
			return s;
		}

		for(IFile file : ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(f.toURI())) {
			try {
				file.refreshLocal(IResource.DEPTH_ZERO, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return Status.OK_STATUS;
	}

	private void removeUnlinkedOrUnsupportedMdSecTypes(MetsType1 m) {
		final Set<MdSecType> remove = new HashSet<MdSecType>();

		MdSecListWork removeUnlinked = new MdSecListWork() {
			@Override
			public void run(EList<MdSecType> list) {										
				for(MdSecType md : list) {
					if (METSConstants.MD_STATUS_CROSSWALK_NOT_LINKED.equals(md.getSTATUS())) {
						remove.add(md);
					}
				}
			}
		};
		
		for(AmdSecType amd : m.getAmdSec()) {
			// these sections not currently supported by CDR submission profile
			if(amd.getDigiprovMD() != null) remove.addAll(amd.getDigiprovMD());
			if(amd.getSourceMD() != null) remove.addAll(amd.getSourceMD());
			if(amd.getTechMD() != null) remove.addAll(amd.getTechMD());
			removeUnlinked.run(amd.getRightsMD());
		}
		removeUnlinked.run(m.getDmdSec());
		
		Command c = RemoveCommand.create(editingDomain, remove);
		if (c.canExecute()) {
			c.execute();
		}
	}

	private void removeEmptyAmdSecTypes(MetsType1 cdr) {
		Set<AmdSecType> del = new HashSet<AmdSecType>();
		for(AmdSecType a : cdr.getAmdSec()) {
			if(a.eContents() == null || a.eContents().isEmpty()) {
				del.add(a);
			}
		}
		if(del.size() > 0) {
			Command c = RemoveCommand.create(editingDomain, del);
			if (c.canExecute()) {
				c.execute();
			}
		}
	}

	/**
	 * @param cdr
	 */
	private void removeEmptyStructLink(MetsType1 cdr) {
		if(cdr.getStructLink() != null && cdr.getStructLink().eContents().size() == 0 ) {
			Command c = RemoveCommand.create(editingDomain, cdr.getStructLink());
			if (c.canExecute()) {
				c.execute();
			}
		}
	}

	/**
	 * @param cdr
	 */
	private void moveObjectsFileGroupsToFileSec(MetsType1 m) {
		List<FileGrpType1> move = new ArrayList<FileGrpType1>();
		for (FileGrpType1 g : m.getFileSec().getFileGrp()) {
			if (METSConstants.FILEGROUP_Objects.equals(g.getID())) {
				for (FileGrpType f : g.getFileGrp()) {
					move.add((FileGrpType1) f);
				}
			}
		}
		Command remove = RemoveCommand.create(editingDomain, move);
		Command add = AddCommand.create(editingDomain, m.getFileSec(), MetsPackage.eINSTANCE.getFileSecType_FileGrp(),
				move);
		if (remove.canExecute()) {
			remove.execute();
		} else {
			LOG.error("Cannot execute fileGrp remove command");
		}
		if (add.canExecute()) {
			add.execute();
		} else {
			LOG.error("Cannot execute fileGrp add command");
		}
	}

	/**
	 * @param m
	 */
	private void removeNonObjectsFileGroups(MetsType1 m) {
		Set<FileGrpType> remove = new HashSet<FileGrpType>();
		for (FileGrpType g : m.getFileSec().getFileGrp()) {
			if (!METSConstants.FILEGROUP_Objects.equals(g.getID())) {
				remove.add(g);
			}
		}
		Command c = RemoveCommand.create(editingDomain, remove);
		if (c.canExecute()) {
			c.execute();
		}
	}

	/**
	 * @param cdr
	 */
	private void removeNonStageFLocat(MetsType m) {
		Set<FLocatType> remove = new HashSet<FLocatType>();
		Iterator<EObject> i = m.getFileSec().eAllContents();
		while (i.hasNext()) {
			EObject next = i.next();
			if (next instanceof FLocatType) {
				FLocatType l = (FLocatType) next;
				if (METSConstants.FLocat_USE_STAGE.equals(l.getUSE())) {
					// l.setLOCTYPE(value)
				} else if (METSConstants.FLocat_USE_ORIGINAL.equals(l.getUSE())) {
					remove.add(l);
				}
			}
		}
		Command c = RemoveCommand.create(editingDomain, remove);
		if (c.canExecute()) {
			c.execute();
		}
	}
	
	private void removeEmptyFileTypes(MetsType m) {
		Set<FileType> remove = new HashSet<FileType>();
		Iterator<EObject> i = m.getFileSec().eAllContents();
		while (i.hasNext()) {
			EObject next = i.next();
			if (next instanceof FileType) {
				FileType l = (FileType) next;
				if (l.getFLocat() == null || l.getFLocat().size() == 0) {
					remove.add(l);
				}
			}
		}
		Command c = RemoveCommand.create(editingDomain, remove);
		if (c.canExecute()) {
			c.execute();
		}
	}

	interface MdSecListWork {
		void run(EList<MdSecType> list);
	};
	
	/**
	 * @param cdr
	 */
	private void removeExtraLinkedMdSecTypes(MetsType m) {
		final HashSet<MdSecType> remove = new HashSet<MdSecType>();
		Iterator<EObject> bagChildren = METSUtils.findBagDiv(m).eAllContents();
		while (bagChildren.hasNext()) {
			EObject eo = bagChildren.next();
			if (eo instanceof DivType) {
				DivType d = (DivType) eo;
				MdSecListWork prune = new MdSecListWork() {
					@Override
					public void run(EList<MdSecType> list) {
						if (list.size() > 1) {
							MdSecType userCreated = null;
							Set<MdSecType> others = new HashSet<MdSecType>();
							for (MdSecType md : list) {
								if (METSConstants.MD_STATUS_USER_EDITED.equals(md.getSTATUS())) {
									if (userCreated != null) {
										others.add(md);
										LOG.error("found more than one user created mdSec for the same div: " + list);
									} else {
										userCreated = md;
									}
								} else {
									others.add(md);
								}
							}
							// if userCreate not null, use it. otherwise combine the others
							List<MdSecType> mdSecs = new ArrayList<MdSecType>();
							if (userCreated != null) {
								remove.addAll(others);
								mdSecs.add(userCreated);
							} else {
								// FIXME merge all crosswalks together into one dmdSec
								Iterator<MdSecType> i = others.iterator();
								mdSecs.add(i.next());
								while (i.hasNext()) {
									remove.add(i.next());
								}
							}
							list.clear();
							list.addAll(mdSecs);
						}
					}
				};
				prune.run(d.getDmdSec());
				prune.run(d.getMdSec());
			}
		}
		Command c = RemoveCommand.create(editingDomain, remove);
		if (c.canExecute()) {
			c.execute();
		}
	}

}
