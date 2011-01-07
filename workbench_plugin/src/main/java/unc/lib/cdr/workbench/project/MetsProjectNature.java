package unc.lib.cdr.workbench.project;

import gov.loc.mets.DocumentRoot;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.MetsType1;
import gov.loc.mets.provider.MetsItemProviderAdapterFactory;
import gov.loc.mets.util.METSUtils;
import gov.loc.mets.util.MetsResourceFactoryImpl;
import gov.loc.mods.mods.provider.MODSItemProviderAdapterFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;
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

import unc.lib.cdr.workbench.accession.OriginalFoldersProjectElement;
import unc.lib.cdr.workbench.arrange.ArrangementProjectElement;
import unc.lib.cdr.workbench.rcp.Activator;
import unc.lib.cdr.workbench.xwalk.CrosswalksProjectElement;

public class MetsProjectNature implements IProjectNature {
    private static final Logger log = LoggerFactory.getLogger(MetsProjectNature.class);
    public static final String NATURE_ID = "cdr_producer.projectNature";
    public static final QualifiedName METS_KEY = new QualifiedName(NATURE_ID, "cdr_producer.metsKey");
    public static final QualifiedName EDITING_DOMAIN_KEY = new QualifiedName(NATURE_ID, "cdr_producer.editingDomain");
    public static final QualifiedName RESOURCE_SET_KEY = new QualifiedName(NATURE_ID, "cdr_producer.resourceSet");
    public static final String STAGING_BUILDER_ID = "unc.lib.cdr.workbench.builders.StageBuilder";
    public static final String CROSSWALKS_BUILDER_ID = "unc.lib.cdr.workbench.builders.CrosswalksBuilder";
    public static final Path METS_PATH = new Path("workbench-mets.xml");
    private static Map<ResourceSet, IProject> rSet2Project = new HashMap<ResourceSet, IProject>();
    private boolean initialized = false;
    private IProject project = null;
    private ResourceSet resourceSet = null;
    private static ComposedAdapterFactory adapterFactory = null;
    private CommandStack commandStack = null;
    private EditingDomain editingDomain = null;
    private Resource metsResource = null;
    private ExtendedMetaData extendedMetaData = null;
    private ICustomProjectElement[] elements = null;
    private CrosswalksProjectElement crosswalksElement = null;
    private ArrangementProjectElement arrangementElement = null;
    private OriginalFoldersProjectElement originalsElement = null;

    public ExtendedMetaData getExtendedMetaData() {
	return extendedMetaData;
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
	adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
    }

    private void initialize() {
	if (!initialized) {
	    // Create a resource set to hold the resources.
	    //
	    this.resourceSet = new ResourceSetImpl();

	    // Register the appropriate resource factory to handle all file
	    // extensions.
	    //
	    this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			    .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new MetsResourceFactoryImpl());

	    // Register the package to ensure it is available during loading.
	    this.resourceSet.getPackageRegistry().put(MetsPackage.eNS_URI, MetsPackage.eINSTANCE);

	    MetsProjectNature.rSet2Project.put(resourceSet, getProject());

	    // Create the command stack that will notify this editor as commands
	    // are executed.
	    commandStack = new BasicCommandStack();
	    editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, resourceSet);
	    extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
	    try {
		this.project.setSessionProperty(EDITING_DOMAIN_KEY, editingDomain);
		this.project.setSessionProperty(RESOURCE_SET_KEY, resourceSet);
	    } catch (CoreException e) {
		e.printStackTrace();
	    }
	    initialized = true;
	}
    }

    public MetsProjectNature() {
    }

    public ICustomProjectElement[] getProjectElements() {
	if (this.elements == null) {
	    this.elements = new ICustomProjectElement[] { getOriginalsElement(),
	    /* getArrangementElement(), */getCrosswalksElement() };
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
	initialize();
	try {
	    this.metsResource.save(new HashMap());
	    log.debug("saved mets");
	} catch (IOException e) {
	    Status s = new Status(Status.ERROR, Activator.PLUGIN_ID, "Cannot save METS", e);
	    throw new CoreException(s);
	}
    }

    public void load() throws CoreException {
	initialize();
	IFile f = project.getFile(MetsProjectNature.METS_PATH);
	Map xmlOptions = new HashMap();
	String uri = f.getLocationURI().toString();
	try {
	    this.metsResource = this.resourceSet.getResource(URI.createURI(uri), true);
	    ((ResourceImpl) this.metsResource).setIntrinsicIDToEObjectMap(new HashMap());
	    this.metsResource.load(xmlOptions);
	} catch (Exception e) {
	    log.debug("exception thrown, trying to create new resource.", e);
	    this.metsResource = this.resourceSet.createResource(URI.createURI(uri));
	    ((ResourceImpl) this.metsResource).setIntrinsicIDToEObjectMap(new HashMap());
	    DocumentRoot r = METSUtils.createInitialMetsDocument(project.getName() + " Workbench Manifest");
	    this.metsResource.getContents().add(r);
	    log.debug("initial mets contents created: "+this.metsResource.getContents());
	    try {
		this.metsResource.save(xmlOptions);
		//this.metsResource.load(xmlOptions);
		log.debug("mets saved for the first time");
	    } catch (IOException e1) {
		log.error("Problem creating METS", e1);
		Status s = new Status(Status.ERROR, Activator.PLUGIN_ID, "Cannot save METS", e1);
		throw new CoreException(s);
	    }
	}
	if (this.metsResource.getContents().size() > 0) {
	    this.project.setSessionProperty(METS_KEY, this.metsResource.getContents().iterator().next());
	} else {
	    log.error("Unable to get METS object from resource");
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
	load();
	IFolder cws = this.getProject().getFolder("crosswalks");
	if (!cws.exists()) {
	    cws.create(false, false, new NullProgressMonitor());
	}

	IFolder os = this.getProject().getFolder("originals");
	if (!os.exists()) {
	    os.create(false, false, new NullProgressMonitor());
	}
	addBuilders();
    }

    /**
     *
     */
    private void addBuilders() throws CoreException {
	IProjectDescription desc = project.getDescription();
	ICommand[] commands = desc.getBuildSpec();
	boolean stagingfound = false;
	boolean crosswalksfound = false;

	for (int i = 0; i < commands.length; ++i) {
	    if (commands[i].getBuilderName().equals(STAGING_BUILDER_ID)) {
		stagingfound = true;
	    } else if (commands[i].getBuilderName().equals(CROSSWALKS_BUILDER_ID)) {
		crosswalksfound = true;
	    }
	}
	if (!stagingfound || !crosswalksfound) {
	    List<ICommand> builders = new ArrayList<ICommand>();
	    if (!stagingfound) {
		// add builder to project
		ICommand command = desc.newCommand();
		command.setBuilderName(STAGING_BUILDER_ID);
		command.setBuilding(IncrementalProjectBuilder.AUTO_BUILD, true);
		command.setBuilding(IncrementalProjectBuilder.FULL_BUILD, true);
		command.setBuilding(IncrementalProjectBuilder.INCREMENTAL_BUILD, true);
		builders.add(command);
	    }
	    if (!crosswalksfound) {
		// add builder to project
		ICommand command = desc.newCommand();
		command.setBuilderName(CROSSWALKS_BUILDER_ID);
		command.setBuilding(IncrementalProjectBuilder.AUTO_BUILD, true);
		command.setBuilding(IncrementalProjectBuilder.FULL_BUILD, true);
		command.setBuilding(IncrementalProjectBuilder.INCREMENTAL_BUILD, true);
		builders.add(command);
	    }
	    for (ICommand c : commands) {
		builders.add(c);
	    }
	    desc.setBuildSpec(builders.toArray(commands));
	    project.setDescription(desc, null);
	}
    }

    @Override
    public void deconfigure() throws CoreException {
	save();
	this.project.getSessionProperties().remove(METS_KEY);
    }

    @Override
    public IProject getProject() {
	return this.project;
    }

    @Override
    public void setProject(IProject project) {
	this.project = project;
//	try {
//	    load();
//	} catch (CoreException e) {
//	    throw new Error("There was a problem loading the METS project nature", e);
//	}
    }

    public static IProject getProjectForMetsResource(EObject object) {
	IProject result = null;
	if (object.eResource() != null && object.eResource().getResourceSet() != null) {
	    result = MetsProjectNature.rSet2Project.get(object.eResource().getResourceSet());
	}
	return result;
    }

    public static MetsProjectNature getNatureForMetsObject(EObject object) {
	IProject p = getProjectForMetsResource(object);
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
	IProject p = getProjectForMetsResource(object);
	if (p != null) {
	    try {
		MetsProjectNature mpn = (MetsProjectNature) p.getNature(MetsProjectNature.NATURE_ID);
		result = mpn.getEditingDomain();
	    } catch (CoreException ignored) {
	    }
	}
	return result;
    }

}
