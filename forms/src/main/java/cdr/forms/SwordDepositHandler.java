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
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.ModsDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
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

import crosswalk.Form;
import crosswalk.FormElement;
import crosswalk.MetadataBlock;
import crosswalk.OutputElement;

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
	
	public DepositResult deposit(Form form, List<SubmittedFile> files) {
		
		// Generate a PID

		String pid = "uuid:" + UUID.randomUUID().toString();

		// Identify the "main file" within the list of submitted files.
		// If the form has file blocks, this is the form's mainFileBlock reference.
		// If the form doesn't have file blocks, this is the first file
		// in the list of submitted files (if any).
		
		SubmittedFile mainFile = null;
		
		if (form.isHasFileBlocks()) {
		
			if (form.getMainFileBlock() != null) {
				for (SubmittedFile file : files) {
					if (file.getFileBlock() == form.getMainFileBlock()) {
						mainFile = file;
						break;
					}
				}
			}
			
		} else {
			
			if (files.size() > 0)
				mainFile = files.get(0);
			
		}
		
		// Prepare the zip file for deposit
		
		gov.loc.mods.mods.DocumentRoot mods = makeMods(form);
		edu.unc.lib.schemas.acl.DocumentRoot acl = makeAcl(form);
		IdentityHashMap<SubmittedFile, String> filenames = buildFilenameMap(files);

		gov.loc.mets.DocumentRoot metsDocumentRoot = makeMets(form.getCurrentUser(), mods, acl, files, mainFile, filenames);
		File zipFile = makeZipFile(metsDocumentRoot, files, filenames);
		
		
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

	private IdentityHashMap<SubmittedFile, String> buildFilenameMap(List<SubmittedFile> files) {
		
		IdentityHashMap<SubmittedFile, String> filenames = new IdentityHashMap<SubmittedFile, String>();

		int index = 0;

		for (SubmittedFile file : files) {
			filenames.put(file, "data_" + index + file.getExtension());
			index++;
		}
		
		return filenames;
		
	}
	
	private gov.loc.mods.mods.DocumentRoot makeMods(Form form) {
		// run the mapping and get a MODS record. (report any errors)
		ModsDefinition mods = MODSFactory.eINSTANCE.createModsDefinition();
		gov.loc.mods.mods.DocumentRoot root = MODSFactory.eINSTANCE.createDocumentRoot();
		root.setMods(mods);
		for (FormElement fe : form.getElements()) {
			if(MetadataBlock.class.isInstance(fe)) {
				MetadataBlock mb = (MetadataBlock)fe;
				for(OutputElement oe : mb.getElements()) {
					oe.updateRecord(mods);
				}
			}
		}
		return root;
	}
	
	private edu.unc.lib.schemas.acl.DocumentRoot makeAcl(Form form) {
		
		AccessControlType accessControl = AclFactory.eINSTANCE.createAccessControlType();
		edu.unc.lib.schemas.acl.DocumentRoot root = AclFactory.eINSTANCE.createDocumentRoot();
		root.setAccessControl(accessControl);
		
		// If the form specifies that the object should be reviewed before publication,
		// the ACL should specify that it is not published.
		
		if (form.isReviewBeforePublication())
			accessControl.setPublished(false);
		
		return root;
		
	}
	
	/**
	 * Prepare a METS document.
	 * 
	 * This takes care of both the single file and aggregate work cases. If
	 * supplementalFiles is null, the generated structMap will contain a single
	 * div of type "File". Otherwise, the structMap will contain a div of type
	 * "Aggregate Work" at its root, and a structLink element will be generated,
	 * assigning the main file as the defaultWebObject.
	 * 
	 * file and div elements are given ID attributes of the form "f_{index}" and
	 * "d_{index}" respectively, where index is 0 for the main file, and 1, 2, ...
	 * for each supplemental file.
	 */
	private gov.loc.mets.DocumentRoot makeMets(String user, gov.loc.mods.mods.DocumentRoot modsDocumentRoot, edu.unc.lib.schemas.acl.DocumentRoot acl,
			List<SubmittedFile> files, SubmittedFile mainFile, IdentityHashMap<SubmittedFile, String> filenames) {
		
		gov.loc.mets.DocumentRoot root;
		MetsType mets;
		MdSecType rightsMdSec;
		MdSecType modsMdSec;
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
		
		// Administrative metadata section
		
		{

			AmdSecType amdSec = MetsFactory.eINSTANCE.createAmdSecType();
			
			rightsMdSec = MetsFactory.eINSTANCE.createMdSecType();
			rightsMdSec.setID("acl");

			MdWrapType mdWrap = MetsFactory.eINSTANCE.createMdWrapType();
			mdWrap.setMDTYPE(MDTYPEType.OTHER);
		
			XmlDataType1 xmlData = MetsFactory.eINSTANCE.createXmlDataType1();
			
			xmlData.getAny().add(AclPackage.eINSTANCE.getDocumentRoot_AccessControl(), acl.getAccessControl());
			
			mdWrap.setXmlData(xmlData);
			rightsMdSec.setMdWrap(mdWrap);
			
			amdSec.getRightsMD().add(rightsMdSec);
			
			mets.getAmdSec().add(amdSec);
		
		}

		// Descriptive metadata section
		
		{

			modsMdSec = MetsFactory.eINSTANCE.createMdSecType();
			modsMdSec.setID("mods");
	
			MdWrapType mdWrap = MetsFactory.eINSTANCE.createMdWrapType();
			mdWrap.setMDTYPE(MDTYPEType.MODS);
	
			XmlDataType1 xmlData = MetsFactory.eINSTANCE.createXmlDataType1();
	
			xmlData.getAny().add(MODSPackage.eINSTANCE.getDocumentRoot_Mods(), modsDocumentRoot.getMods());
	
			mdWrap.setXmlData(xmlData);
			modsMdSec.setMdWrap(mdWrap);
	
			mets.getDmdSec().add(modsMdSec);
			
		}

		// Files section
		
		{

			FileSecType fileSec = MetsFactory.eINSTANCE.createFileSecType();
			FileGrpType1 fileGrp = MetsFactory.eINSTANCE.createFileGrpType1();
			
			for (int i = 0; i < files.size(); i++) {
				
				SubmittedFile submittedFile = files.get(i);
				
				FileType file = MetsFactory.eINSTANCE.createFileType();
				file.setID("f_" + i);
				file.setMIMETYPE(submittedFile.getContentType());
	
				FLocatType fLocat = MetsFactory.eINSTANCE.createFLocatType();
				fLocat.setLOCTYPE(LOCTYPEType.URL);
				fLocat.setHref(filenames.get(submittedFile));
	
				file.getFLocat().add(fLocat);
				fileGrp.getFile().add(file);
				
			}
			
			fileSec.getFileGrp().add(fileGrp);
			mets.setFileSec(fileSec);
		
		}

		// Structural map and structural links
		
		DivType mainFileDiv = null;
		
		{

			StructMapType structMap = MetsFactory.eINSTANCE.createStructMapType();

			aggregateWorkDiv = MetsFactory.eINSTANCE.createDivType();
			aggregateWorkDiv.setTYPE(METSConstants.Div_AggregateWork);
			aggregateWorkDiv.getDmdSec().add(modsMdSec);
			aggregateWorkDiv.getMdSec().add(rightsMdSec);
			aggregateWorkDiv.setID("a");
			
			for (int i = 0; i < files.size(); i++) {

				SubmittedFile submittedFile = files.get(i);
			
				DivType fileDiv = MetsFactory.eINSTANCE.createDivType();
				
				fileDiv.setTYPE(METSConstants.Div_File);
				
				if (submittedFile.getFileBlock() != null && submittedFile.getFileBlock().getLabel() != null)
					fileDiv.setLABEL1(submittedFile.getFileBlock().getLabel());
				else
					fileDiv.setLABEL1(submittedFile.getFilename());
				
				FptrType fptr = MetsFactory.eINSTANCE.createFptrType();
				fptr.setFILEID("f_" + i);
				fileDiv.getFptr().add(fptr);
				
				fileDiv.setID("d_" + i);
				
				aggregateWorkDiv.getDiv().add(fileDiv);
				
				if (submittedFile == mainFile)
					mainFileDiv = fileDiv;
				
			}
	
			structMap.setDiv(aggregateWorkDiv);
			mets.getStructMap().add(structMap);
			
		}
		
		// Structural Links
		
		{
		
			StructLinkType1 structLink = MetsFactory.eINSTANCE.createStructLinkType1();
			
			if (mainFileDiv != null) {
	
				SmLinkType smLink = MetsFactory.eINSTANCE.createSmLinkType();
				smLink.setArcrole(Link.DEFAULTACCESS.uri);
				smLink.setXlinkFrom(aggregateWorkDiv);
				smLink.setXlinkTo(mainFileDiv);
		
				structLink.getSmLink().add(smLink);
				
			}
			
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
	
	private File makeZipFile(gov.loc.mets.DocumentRoot metsDocumentRoot, List<SubmittedFile> files, IdentityHashMap<SubmittedFile, String> filenames) {
		
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
				
				SubmittedFile submittedFile = files.get(i);
				
				entry = new ZipEntry(filenames.get(submittedFile));
				zipOutput.putNextEntry(entry);

				FileInputStream fileInput = new FileInputStream(submittedFile.getFile());

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
