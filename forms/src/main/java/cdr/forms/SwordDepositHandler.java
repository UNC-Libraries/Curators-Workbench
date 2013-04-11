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
package cdr.forms;

import edu.unc.lib.schemas.acl.AccessControlType;
import edu.unc.lib.schemas.acl.AclFactory;
import edu.unc.lib.schemas.acl.AclPackage;
import gov.loc.mets.AgentType;
import gov.loc.mets.AmdSecType;
import gov.loc.mets.DivType;
import gov.loc.mets.FLocatType;
import gov.loc.mets.FileGrpType1;
import gov.loc.mets.FileSecType;
import gov.loc.mets.FileType;
import gov.loc.mets.FptrType;
import gov.loc.mets.LOCTYPEType;
import gov.loc.mets.MDTYPEType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MdWrapType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.MetsHdrType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.MetsType;
import gov.loc.mets.ROLEType;
import gov.loc.mets.SmLinkType;
import gov.loc.mets.StructLinkType1;
import gov.loc.mets.StructMapType;
import gov.loc.mets.TYPEType;
import gov.loc.mets.XmlDataType1;
import gov.loc.mets.util.Link;
import gov.loc.mets.util.METSConstants;
import gov.loc.mets.util.MetsResourceFactoryImpl;
import gov.loc.mods.mods.AbstractDefinition;
import gov.loc.mods.mods.DateDefinition;
import gov.loc.mods.mods.DateEncodingAttributeDefinition;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.ModsDefinition;
import gov.loc.mods.mods.OriginInfoDefinition;
import gov.loc.mods.mods.PhysicalDescriptionDefinition;
import gov.loc.mods.mods.StringPlusAuthorityPlusType;
import gov.loc.mods.mods.StringPlusSupplied;
import gov.loc.mods.mods.TitleInfoDefinition;
import gov.loc.mods.mods.XsString;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.FileRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3._1999.xlink.XlinkPackage;

import crosswalk.FileBlock;
import crosswalk.Form;
import crosswalk.FormElement;
import crosswalk.MetadataBlock;
import crosswalk.OutputElement;
import crosswalk.OutputMetadataSections;
import crosswalk.OutputProfile;

import cdr.forms.DepositResult.Status;


public class SwordDepositHandler implements DepositHandler {

	private static final Logger LOG = LoggerFactory.getLogger(SwordDepositHandler.class);

	private String serviceUrl;
	private String username;
	private String password;

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	private String defaultContainer = null;

	public String getDefaultContainer() {
		return defaultContainer;
	}

	/**
	 * Set the default deposit container. String should be appropriate
	 * @param defaultContainer
	 */
	public void setDefaultContainer(String defaultContainer) {
		this.defaultContainer = defaultContainer;
	}
	
	public DepositResult deposit(Deposit deposit) {
		
		return this.deposit(deposit, null);
		
	}

	public DepositResult deposit(Deposit deposit, SupplementalDeposit supplemental) {
		
		Form form = deposit.getForm();
		
		// Generate a PID
		
		String pid = "uuid:" + UUID.randomUUID().toString();
		
		
		// Build the METS and zip file
		
		List<DepositFile> files = new ArrayList<DepositFile>();
		
		files.addAll(deposit.getAllFiles());
		files.addAll(supplemental.getAllFiles());
		
		Map<DepositFile, String> fileNames = buildFileNameMap(files);
		Map<DepositFile, FileBlock> fileBlocks = buildFileBlockMap(deposit);
		Map<OutputMetadataSections, List<MdSecType>> rootMetadata = buildRootMetadataMap(form);
		Map<DepositFile, MdSecType> fileDescriptiveMetadata = buildFileDescriptiveMetadataMap(supplemental.getFiles());
		
		gov.loc.mets.DocumentRoot metsDocumentRoot =
				makeMets(files, deposit.getMainFile(),
						 fileNames, fileBlocks, rootMetadata, fileDescriptiveMetadata,
						 form.getCurrentUser(), form.isReviewBeforePublication());
		
		File zipFile = makeZipFile(metsDocumentRoot, files, fileNames);
		
		
		// Obtain the path for the collection in which we'll attempt to make the deposit
		
		String containerId = form.getDepositContainerId();
		
		if (containerId == null || "".equals(containerId.trim()))
			containerId = this.getDefaultContainer();

		String depositPath = getServiceUrl() + "collection/" + containerId;
		
		
		// Make the SWORD request
		
		HttpClient client = new HttpClient();
		
		UsernamePasswordCredentials creds = new UsernamePasswordCredentials(this.getUsername(), this.getPassword());
		client.getState().setCredentials(getAuthenticationScope(depositPath), creds);
		client.getParams().setAuthenticationPreemptive(true);
		
		PostMethod post = new PostMethod(depositPath);
		
		RequestEntity fileRequestEntity = new FileRequestEntity(zipFile, "application/zip");
		
		Header contentDispositionHeader = new Header("Content-Disposition", "attachment; filename=package.zip");
		post.addRequestHeader(contentDispositionHeader);
		
		Header packagingHeader = new Header("Packaging", "http://cdr.unc.edu/METS/profiles/Simple");
		post.addRequestHeader(packagingHeader);
		
		Header slugHeader = new Header("Slug", pid);
		post.addRequestHeader(slugHeader);
		
		post.setRequestEntity(fileRequestEntity);
		
		
		// Interpret the response from the SWORD endpoint
		
		DepositResult result = new DepositResult();
		result.setPid(pid);
		
		try {
			
			// Set the result's status based on the HTTP response code
			
			int responseCode = client.executeMethod(post);
			
			if (responseCode >= 300) {
				LOG.error(String.valueOf(responseCode));
				LOG.error(post.getResponseBodyAsString());
				result.setStatus(Status.FAILED);
			} else {
				result.setStatus(Status.COMPLETE);
			}
			
			// Save the response body
			
			result.setResponseBody(post.getResponseBodyAsString());
			
			// Assign additional attributes based on the response body.
			
			try {
				
			    Namespace atom = Namespace.getNamespace("http://www.w3.org/2005/Atom");

				SAXBuilder sx = new SAXBuilder();
				org.jdom.Document d = sx.build(post.getResponseBodyAsStream());
				
				// Set accessURL to the href of the first <link rel="alternate"> inside an Atom entry
				
				if (result.getStatus() == Status.COMPLETE) {

					if (d.getRootElement().getNamespace().equals(atom) && d.getRootElement().getName().equals("entry")) {
						@SuppressWarnings("unchecked")
						List<Element> links = d.getRootElement().getChildren("link", atom);
	
						for (Element link : links) {
							if ("alternate".equals(link.getAttributeValue("rel"))) {
								result.setAccessURL(link.getAttributeValue("href"));
								break;
							}
						}
					}
					
				}

			} catch (JDOMException e) {
				LOG.error("There was a problem parsing the SWORD response.", e);
			}
			
			LOG.debug("response was: \n" + post.getResponseBodyAsString());
			
		} catch (HttpException e) {
			LOG.error("Exception during SWORD deposit", e);
			throw new Error(e);
		} catch (IOException e) {
			LOG.error("Exception during SWORD deposit", e);
			throw new Error(e);
		}
		
		return result;
		
	}
	
	private IdentityHashMap<DepositFile, String> buildFileNameMap(List<DepositFile> files) {
		
		IdentityHashMap<DepositFile, String> filenames = new IdentityHashMap<DepositFile, String>();

		int index = 0;

		for (DepositFile file : files) {
			filenames.put(file, "data_" + index + file.getExtension());
			index++;
		}
		
		return filenames;
		
	}
	
	private Map<DepositFile, FileBlock> buildFileBlockMap(Deposit deposit) {
		
		IdentityHashMap<DepositFile, FileBlock> fileBlocks = new IdentityHashMap<DepositFile, FileBlock>();
		
		for (Entry<FileBlock, Integer> entry : deposit.getBlockFileIndexMap().entrySet()) {
			DepositFile depositFile = deposit.getFiles()[entry.getValue()];
			
			if (depositFile != null)
				fileBlocks.put(depositFile, entry.getKey());
		}
		
		return fileBlocks;
		
	}
	
	private MdSecType makeMetadata(OutputProfile profile, Form form) {
		
		EClass outputElementClass = null;
		
		if (profile.isStartMappingAtChildren())
			outputElementClass = profile.getParentMappedFeature().getEReferenceType();	
		else
			outputElementClass = profile.getParentMappedFeature().getEContainingClass();
		
		EObject outputElement = outputElementClass.getEPackage().getEFactoryInstance().create(outputElementClass);
		
		for (FormElement fe : form.getElements()) {
			if (fe instanceof MetadataBlock) {
				MetadataBlock mb = (MetadataBlock) fe;
				for (OutputElement oe : mb.getElements()) {
					oe.updateRecord(outputElement);
				}
			}
		}
		
		if (outputElement.eContents() == null || outputElement.eContents().isEmpty())
			return null;
		
		if (!profile.isStartMappingAtChildren())
			outputElement = outputElement.eContents().get(0);
		
		MdWrapType mdWrap = MetsFactory.eINSTANCE.createMdWrapType();
		
		MDTYPEType mdType = MDTYPEType.get(profile.getMetadataType());
		if (mdType == null) {
			mdWrap.setMDTYPE(MDTYPEType.OTHER);
			mdWrap.setOTHERMDTYPE(profile.getMetadataType());
		} else {
			mdWrap.setMDTYPE(mdType);
		}	
		
		XmlDataType1 xml = MetsFactory.eINSTANCE.createXmlDataType1();
		xml.getAny().add(profile.getParentMappedFeature(), outputElement);
		mdWrap.setXmlData(xml);

		MdSecType mdSec = MetsFactory.eINSTANCE.createMdSecType();
		mdSec.setMdWrap(mdWrap);
		
		return mdSec;
		
	}
	
	private Map<OutputMetadataSections, List<MdSecType>> buildRootMetadataMap(Form form) {
		
		IdentityHashMap<OutputMetadataSections, List<MdSecType>> rootMetadata = new IdentityHashMap<OutputMetadataSections, List<MdSecType>>();
		
		for (OutputProfile profile : form.getOutputProfiles()) {
			MdSecType mdSec = makeMetadata(profile, form);
			
			if (mdSec != null) {
				List<MdSecType> list = rootMetadata.get(profile.getMetadataSection());
				
				if (list == null) {
					list = new ArrayList<MdSecType>();
					rootMetadata.put(profile.getMetadataSection(), list);
				}
				
				list.add(mdSec);
			}
		}
		
		return rootMetadata;
		
	}
	
	private Map<DepositFile, MdSecType> buildFileDescriptiveMetadataMap(List<SupplementalObject> files) {
		
		IdentityHashMap<DepositFile, MdSecType> fileDescriptiveMetadata = new IdentityHashMap<DepositFile, MdSecType>();
		
		if (files != null) {
			for (SupplementalObject file : files)
				fileDescriptiveMetadata.put(file.getDepositFile(), file.getDescriptiveMetadata());
		}
		
		return fileDescriptiveMetadata;
		
	}
	
	/**
	 * @param files List of files to include in the file section 
	 * @param mainFile Reference to the "main" file, if there were no file blocks used in the form
	 * @param fileNames Mapping from files to filenames
	 * @param fileBlocks Mapping from files to FileBlock instances
	 * @param rootMetadata Mapping from metadata section type to list of metadata sections (descriptive and administrative metadata for root object)
	 * @param fileDescriptiveMetadata Mapping from deposit files to metadata sections (descriptive metadata for individual files)
	 * @param user
	 * @param reviewBeforePublication
	 **/
	
	private gov.loc.mets.DocumentRoot makeMets(
		List<DepositFile> files,
		DepositFile mainFile,
		Map<DepositFile, String> fileNames,
		Map<DepositFile, FileBlock> fileBlocks,
		Map<OutputMetadataSections, List<MdSecType>> rootMetadata,
		Map<DepositFile, MdSecType> fileDescriptiveMetadata,
		String user,
		boolean reviewBeforePublication
	) {

		gov.loc.mets.DocumentRoot root;
		MetsType mets;
		AmdSecType amdSec;
		MdSecType dmdSec;
		DivType aggregateWorkDiv = null;
		
		// Document root
		
		{

			root = MetsFactory.eINSTANCE.createDocumentRoot();
			root.setMets(MetsFactory.eINSTANCE.createMetsType1());
			mets = root.getMets();

			mets.setPROFILE("http://cdr.unc.edu/METS/profiles/Simple");
			
		}

		// Header
		
		{

			MetsHdrType head = MetsFactory.eINSTANCE.createMetsHdrType();
			Date currentTime = new Date(System.currentTimeMillis());
			head.setCREATEDATE(new XMLCalendar(currentTime, XMLCalendar.DATETIME));
			head.setLASTMODDATE(new XMLCalendar(currentTime, XMLCalendar.DATETIME));
	
			AgentType agent;
			
			if (user != null) {
				agent = MetsFactory.eINSTANCE.createAgentType();
				agent.setROLE(ROLEType.CREATOR);
				agent.setTYPE(TYPEType.INDIVIDUAL);
				agent.setName(user);
				head.getAgent().add(agent);
			}
			
			agent = MetsFactory.eINSTANCE.createAgentType();
			agent.setROLE(ROLEType.CREATOR);
			agent.setTYPE(TYPEType.OTHER);
			agent.setName("CDR Forms");
			head.getAgent().add(agent);

			mets.setMetsHdr(head);
			
		}
		
		// Metadata sections
		
		dmdSec = null;
		amdSec = MetsFactory.eINSTANCE.createAmdSecType();
		mets.getAmdSec().add(amdSec);
		
		{
			
			int i = 0;
			
			for (Entry<OutputMetadataSections, List<MdSecType>> entry : rootMetadata.entrySet()) {
				for (MdSecType mdSec : entry.getValue()) {
					mdSec.setID("md_" + i);
					
					switch (entry.getKey()) {
					case DIGIPROV_MD:
						amdSec.getDigiprovMD().add(mdSec);
						break;
					case RIGHTS_MD:
						amdSec.getRightsMD().add(mdSec);
						break;
					case SOURCE_MD:
						amdSec.getSourceMD().add(mdSec);
						break;
					case TECH_MD:
						amdSec.getTechMD().add(mdSec);
						break;
					case DMD_SEC:
						dmdSec = mdSec;
						mets.getDmdSec().add(mdSec);
						break;
					}
					
					i++;
				}
			}
			
			for (Entry<DepositFile, MdSecType> entry : fileDescriptiveMetadata.entrySet()) {
				entry.getValue().setID("md_" + i);
				mets.getDmdSec().add(entry.getValue());
				
				i++;
			}
			
		}
		
		// If the form specifies that the object should be reviewed before publication,
		// the ACL should specify that it is not published.
		
		if (reviewBeforePublication) {
			
			AccessControlType accessControl = null;
			
			for (MdSecType mdSec : amdSec.getRightsMD()) {
				
				if (mdSec.getMdWrap() != null &&
						mdSec.getMdWrap().getMDTYPE().equals(MDTYPEType.OTHER) &&
						mdSec.getMdWrap().getOTHERMDTYPE().equals("ACL")) {
					accessControl = (AccessControlType) mdSec.getMdWrap().getXmlData().getAny().list(AclPackage.eINSTANCE.getDocumentRoot_AccessControl()).get(0);
					break;
				}
				
			}
			
			if (accessControl != null) {
				
				accessControl.setPublished(false);
				
			} else {
				
				accessControl = AclFactory.eINSTANCE.createAccessControlType();
				accessControl.setPublished(false);
				
				MdSecType rightsMdSec = MetsFactory.eINSTANCE.createMdSecType();
				rightsMdSec.setID("md_review");

				MdWrapType mdWrap = MetsFactory.eINSTANCE.createMdWrapType();
				mdWrap.setMDTYPE(MDTYPEType.OTHER);
				mdWrap.setOTHERMDTYPE("ACL");

				XmlDataType1 xmlData = MetsFactory.eINSTANCE.createXmlDataType1();
				xmlData.getAny().add(AclPackage.eINSTANCE.getDocumentRoot_AccessControl(), accessControl);

				mdWrap.setXmlData(xmlData);
				rightsMdSec.setMdWrap(mdWrap);

				amdSec.getRightsMD().add(rightsMdSec);
				
			}
			
		}
		
		// Files section
		
		IdentityHashMap<DepositFile, FileType> filesFiles = new IdentityHashMap<DepositFile, FileType>();

		{

			FileSecType fileSec = MetsFactory.eINSTANCE.createFileSecType();
			FileGrpType1 fileGrp = MetsFactory.eINSTANCE.createFileGrpType1();

			int i = 0;

			for (DepositFile depositFile : files) {
				
				FileType file = MetsFactory.eINSTANCE.createFileType();
				file.setID("f_" + i);
				file.setMIMETYPE(depositFile.getContentType());
	
				FLocatType fLocat = MetsFactory.eINSTANCE.createFLocatType();
				fLocat.setLOCTYPE(LOCTYPEType.URL);
				fLocat.setHref(fileNames.get(depositFile));
	
				file.getFLocat().add(fLocat);
				fileGrp.getFile().add(file);
				
				filesFiles.put(depositFile, file);
				
				i++;
				
			}
			
			fileSec.getFileGrp().add(fileGrp);
			mets.setFileSec(fileSec);
			
		}
		
		// Structural map
		
		IdentityHashMap<DepositFile, DivType> fileDivs = new IdentityHashMap<DepositFile, DivType>();
		DivType rootDiv; 
		
		if (mainFile != null && files.size() == 1) {
			
			StructMapType structMap = MetsFactory.eINSTANCE.createStructMapType();

			DivType fileDiv = MetsFactory.eINSTANCE.createDivType();
			
			fileDiv.setTYPE(METSConstants.Div_File);
			fileDiv.setID("d_0");
			fileDiv.setLABEL1(mainFile.getFilename());
			
			MdSecType mdSec = fileDescriptiveMetadata.get(mainFile);
			if (mdSec != null)
				fileDiv.getDmdSec().add(mdSec);
			
			FptrType fptr = MetsFactory.eINSTANCE.createFptrType();
			fptr.setFILEID(filesFiles.get(mainFile).getID());
			fileDiv.getFptr().add(fptr);

			structMap.setDiv(fileDiv);
			mets.getStructMap().add(structMap);

			fileDivs.put(mainFile, fileDiv);
			rootDiv = fileDiv;
			
		} else {

			StructMapType structMap = MetsFactory.eINSTANCE.createStructMapType();

			aggregateWorkDiv = MetsFactory.eINSTANCE.createDivType();
			aggregateWorkDiv.setTYPE(METSConstants.Div_AggregateWork);
			aggregateWorkDiv.setID("d_0");
			
			int i = 1;

			for (DepositFile depositFile : files) {
			
				DivType fileDiv = MetsFactory.eINSTANCE.createDivType();
				fileDiv.setTYPE(METSConstants.Div_File);
				
				FileBlock fileBlock = fileBlocks.get(depositFile);
				if (fileBlock != null && fileBlock.getLabel() != null && fileBlock.getLabel().trim().length() > 0)
					fileDiv.setLABEL1(fileBlock.getLabel());
				else
					fileDiv.setLABEL1(depositFile.getFilename());
				
				MdSecType mdSec = fileDescriptiveMetadata.get(depositFile);
				if (mdSec != null)
					fileDiv.getDmdSec().add(mdSec);
				
				FptrType fptr = MetsFactory.eINSTANCE.createFptrType();
				fptr.setFILEID(filesFiles.get(depositFile).getID());
				fileDiv.getFptr().add(fptr);
				fileDiv.setID("d_" + i);
				
				aggregateWorkDiv.getDiv().add(fileDiv);
				
				fileDivs.put(depositFile, fileDiv);
				
				i++;
				
			}
	
			structMap.setDiv(aggregateWorkDiv);
			mets.getStructMap().add(structMap);

			rootDiv = aggregateWorkDiv;
			
		}
		
		// Add metadata to the root object
		
		if (dmdSec != null)
			rootDiv.getDmdSec().add(dmdSec);
		
		rootDiv.getMdSec().addAll(amdSec.getDigiprovMD());
		rootDiv.getMdSec().addAll(amdSec.getRightsMD());
		rootDiv.getMdSec().addAll(amdSec.getSourceMD());
		rootDiv.getMdSec().addAll(amdSec.getTechMD());
		
		// Structural Links
		
		// Add "default access" links from the Aggregate Work div to each File div
		// if its corresponding FileBlock has "default access role" set, or
		// if its corresponding DepositFile is the main file (if set).
		
		if (aggregateWorkDiv != null) {
		
			StructLinkType1 structLink = MetsFactory.eINSTANCE.createStructLinkType1();
			
			for (DepositFile depositFile : files) {
				
				FileBlock fileBlock = fileBlocks.get(depositFile);
				
				if ((fileBlock != null && fileBlock.isDefaultAccess()) || (depositFile == mainFile)) {
					
					DivType fileDiv = fileDivs.get(depositFile);
			
					SmLinkType smLink = MetsFactory.eINSTANCE.createSmLinkType();
					smLink.setArcrole(Link.DEFAULTACCESS.uri);
					smLink.setXlinkFrom(aggregateWorkDiv);
					smLink.setXlinkTo(fileDiv);
					
					structLink.getSmLink().add(smLink);
					
				}
				
			}
			
			// Only add the structLink section if there are actually links
			
			if (structLink.getSmLink().size() > 0)
				mets.setStructLink(structLink);
		
		}
		
		return root;
		
	}
	
	private String serializeMets(gov.loc.mets.DocumentRoot root) {
		
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("mets", new MetsResourceFactoryImpl());
		rs.getPackageRegistry().put(MODSPackage.eNS_URI, MODSPackage.eINSTANCE);
		rs.getPackageRegistry().put(MetsPackage.eNS_URI, MetsPackage.eINSTANCE);
		rs.getPackageRegistry().put(XlinkPackage.eNS_URI, XlinkPackage.eINSTANCE);
		rs.getPackageRegistry().put(AclPackage.eNS_URI, AclPackage.eINSTANCE);

		gov.loc.mets.MetsType mets = root.getMets();

		File tmp;
		try {
			tmp = File.createTempFile("tmp", ".mets");
		} catch (IOException e1) {
			throw new Error(e1);
		}

		URI uri = URI.createURI(tmp.toURI().toString());
		XMLResource res = (XMLResource) rs.createResource(uri);
		res.getContents().add(root);

		StringWriter sw = new StringWriter();
		Map<Object, Object> options = new HashMap<Object, Object>();

		options.put(XMLResource.OPTION_ENCODING, "utf-8");
		options.put(XMLResource.OPTION_DECLARE_XML, "");
		options.put(XMLResource.OPTION_LINE_WIDTH, new Integer(80));
		options.put(XMLResource.OPTION_ROOT_OBJECTS, Collections.singletonList(mets));

		try {
			res.save(sw, options);
		} catch (IOException e) {
			throw new Error("failed to serialize XML for model object", e);
		}

		return sw.toString();

	}
	
	private File makeZipFile(gov.loc.mets.DocumentRoot metsDocumentRoot, List<DepositFile> files, Map<DepositFile, String> filenames) {
		
		// Get the METS XML
		
		String metsXml = serializeMets(metsDocumentRoot);

		// Create the zip file

		File zipFile;
		
		try {
			zipFile = File.createTempFile("tmp", ".zip");
		} catch (IOException e) {
			throw new Error(e);
		}

		FileOutputStream fileOutput;

		try {
			fileOutput = new FileOutputStream(zipFile);
		} catch (FileNotFoundException e) {
			throw new Error(e);
		}

		ZipOutputStream zipOutput = new ZipOutputStream(fileOutput);
		
		try {

			ZipEntry entry;
			
			// Write the METS
			
			entry = new ZipEntry("mets.xml");
			zipOutput.putNextEntry(entry);
			
			PrintStream xmlPrintStream = new PrintStream(zipOutput);
			xmlPrintStream.print(metsXml);
			
			// Write files
			
			for (int i = 0; i < files.size(); i++) {
				
				DepositFile file = files.get(i);
				
				entry = new ZipEntry(filenames.get(file));
				zipOutput.putNextEntry(entry);

				FileInputStream fileInput = new FileInputStream(file.getFile());

				byte[] buffer = new byte[1024];
				int length;

				while ((length = fileInput.read(buffer)) != -1)
					zipOutput.write(buffer, 0, length);

				fileInput.close();
				
			}

			zipOutput.finish();
			zipOutput.close();
			
			fileOutput.close();
			
		} catch (IOException e) {
			
			throw new Error(e);
			
		}
		
		return zipFile;
		
	}

	/**
	 * Generates a limited authentication scope for the supplied URL, so that an HTTP client will not send username and
	 * passwords to other URLs.
	 * 
	 * @param queryURL
	 *           the URL for the query.
	 * @return an authentication scope tuned to the requested URL.
	 * @throws IllegalArgumentException
	 *            if <code>queryURL</code> is not a well-formed URL.
	 */
	public static AuthScope getAuthenticationScope(String queryURL) {
		if (queryURL == null) {
			throw new NullPointerException("Cannot derive authentication scope for null URL");
		}
		try {
			URL url = new URL(queryURL);
			// port defaults to 80 unless the scheme is https
			// or the port is explicitly set in the URL.
			int port = 80;
			if (url.getPort() == -1) {
				if ("https".equals(url.getProtocol())) {
					port = 443;
				}
			} else {
				port = url.getPort();
			}
			return new AuthScope(url.getHost(), port);
		} catch (MalformedURLException mue) {
			throw new IllegalArgumentException("supplied URL <" + queryURL + "> is ill-formed:" + mue.getMessage());
		}
	}
	
}
