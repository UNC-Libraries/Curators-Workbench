/**
 * Copyright 2008 The University of North Carolina at Chapel Hill
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
import gov.loc.mods.mods.MODSPackage;

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
import java.util.List;
import java.util.Map;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3._1999.xlink.XlinkPackage;

import cdr.forms.DepositResult.Status;


public class SwordDepositHandler implements DepositHandler {
	/**
	 * This option takes a Boolean object indicate if publication is desired.
	 */
	public static final String OPTION_PUBLISH = "publish";
	
	/**
	 * This option takes a string, indicating the observed mime-type.
	 */
	public static final String OPTION_MIMETYPE = "mime-type";

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
	
	public DepositResult depositAggregate(String containerId, String pid, gov.loc.mods.mods.DocumentRoot mods, edu.unc.lib.schemas.acl.DocumentRoot acl,
			SubmittedFile mainFile, List<SubmittedFile> supplementaryFiles) {

		gov.loc.mets.DocumentRoot metsDocumentRoot = makeMets(mods, acl, mainFile, supplementaryFiles);
		File zipFile = makeZipFile(metsDocumentRoot, mainFile, supplementaryFiles);

		return depositZip(containerId, pid, zipFile);
		
	}

	public DepositResult depositFile(String containerId, String pid, gov.loc.mods.mods.DocumentRoot mods, edu.unc.lib.schemas.acl.DocumentRoot acl, SubmittedFile file) {
		
		gov.loc.mets.DocumentRoot metsDocumentRoot = makeMets(mods, acl, file, null);
		File zipFile = makeZipFile(metsDocumentRoot, file, null);
		
		return depositZip(containerId, pid, zipFile);
		
	}

	private DepositResult depositZip(String containerId, String pid, File zipFile) {
		
		if (containerId == null || "".equals(containerId.trim()))
			containerId = this.getDefaultContainer();

		String depositPath = getServiceUrl() + "collection/" + containerId;
		
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
		
		int responseCode;

		DepositResult result = new DepositResult();
		
		// result.setObjectPid(pid);
		try {
			responseCode = client.executeMethod(post);
			if (responseCode >= 300) {
				LOG.error(String.valueOf(responseCode));
				LOG.error(post.getResponseBodyAsString());
				result.setStatus(Status.FAILED);
			} else {
				result.setStatus(Status.COMPLETE);
			}
			SAXBuilder sx = new SAXBuilder();
			try {
				org.jdom.Document d = sx.build(post.getResponseBodyAsStream());
				Namespace atom = d.getRootElement().getNamespace();
				List<Element> links = d.getRootElement().getChildren("link", atom);
				for (Element el : links) {
					if ("alternate".equals(el.getAttributeValue("rel"))) {
						String accessURL = el.getAttributeValue("href");
						result.setAccessURL(accessURL);
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
	
	/**
	 * Prepare a METS document.
	 * 
	 * This takes care of both the single file and aggregate work cases. If
	 * supplementalFiles is null, the generated structMap will contain a single
	 * div of type "File". Otherwise, the structMap will contain a div of type
	 * "Aggregate Work" at its root, and a structLink element will be generated.
	 * 
	 * Because the zip file we will prepare in makeZipFile cannot have duplicate
	 * paths and there may be issues with spaces in file names, FLocat elements
	 * have their href attributes "f{index}.data". mainFile has index 0, and the
	 * elements of supplementalFiles have indices 1, 2, ... (if supplementalFiles
	 * is not null).
	 */

	private gov.loc.mets.DocumentRoot makeMets(gov.loc.mods.mods.DocumentRoot modsDocumentRoot, edu.unc.lib.schemas.acl.DocumentRoot acl,
			SubmittedFile mainFile, List<SubmittedFile> supplementalFiles) {
		
		gov.loc.mets.DocumentRoot root;
		MetsType mets;
		MdSecType rightsMdSec;
		MdSecType modsMdSec;
		DivType aggregateWorkDiv = null;
		
		int totalFiles;
		
		if (supplementalFiles == null)
			totalFiles = 1;
		else
			totalFiles = 1 + supplementalFiles.size();
		
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
	
			AgentType agent = MetsFactory.eINSTANCE.createAgentType();
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
			
			for (int i = 0; i < totalFiles; i++) {
				
				SubmittedFile submittedFile = i == 0 ? mainFile : supplementalFiles.get(i - 1);
				
				FileType file = MetsFactory.eINSTANCE.createFileType();
				file.setID("f" + i);
				file.setMIMETYPE(submittedFile.getContentType());
	
				FLocatType fLocat = MetsFactory.eINSTANCE.createFLocatType();
				fLocat.setLOCTYPE(LOCTYPEType.URL);
				fLocat.setHref("f" + i + ".data");
	
				file.getFLocat().add(fLocat);
				fileGrp.getFile().add(file);
				
			}
			
			fileSec.getFileGrp().add(fileGrp);
			mets.setFileSec(fileSec);
		
		}

		// Structural map and structural links
		
		if (supplementalFiles == null) {
			
			StructMapType structMap = MetsFactory.eINSTANCE.createStructMapType();

			DivType fileDiv = MetsFactory.eINSTANCE.createDivType();
			
			fileDiv.setLABEL1(mainFile.getFilename());
			fileDiv.setTYPE(METSConstants.Div_File);
			fileDiv.getDmdSec().add(modsMdSec);
			fileDiv.getMdSec().add(rightsMdSec);
			
			FptrType fptr = MetsFactory.eINSTANCE.createFptrType();
			fptr.setFILEID("f0");
			fileDiv.getFptr().add(fptr);

			structMap.setDiv(fileDiv);

			mets.getStructMap().add(structMap);
			
		} else {

			StructMapType structMap = MetsFactory.eINSTANCE.createStructMapType();

			aggregateWorkDiv = MetsFactory.eINSTANCE.createDivType();
			aggregateWorkDiv.setTYPE(METSConstants.Div_AggregateWork);
			aggregateWorkDiv.getDmdSec().add(modsMdSec);
			aggregateWorkDiv.getMdSec().add(rightsMdSec);
			aggregateWorkDiv.setID("a");
			
			for (int i = 0; i < totalFiles; i++) {
			
				DivType fileDiv = MetsFactory.eINSTANCE.createDivType();
				
				fileDiv.setTYPE(METSConstants.Div_File);
				fileDiv.setLABEL1(mainFile.getFilename());
				
				FptrType fptr = MetsFactory.eINSTANCE.createFptrType();
				fptr.setFILEID("f" + i);
				fileDiv.getFptr().add(fptr);
				fileDiv.setID("d" + i);
				
				aggregateWorkDiv.getDiv().add(fileDiv);
				
			}
	
			structMap.setDiv(aggregateWorkDiv);
			mets.getStructMap().add(structMap);
			
		}
		
		// Structural Links
		
		if (supplementalFiles != null) {
		
			StructLinkType1 structLink = MetsFactory.eINSTANCE.createStructLinkType1();

			for (int i = 0; i < totalFiles; i++) {
				
				SmLinkType smLink = MetsFactory.eINSTANCE.createSmLinkType();
				smLink.setArcrole(i == 0 ? Link.DEFAULTACCESS.uri : Link.SUPPLEMENTAL.uri);
				smLink.setXlinkFrom(aggregateWorkDiv);
				smLink.setXlinkTo(aggregateWorkDiv.getDiv().get(i));
	
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
	
	private File makeZipFile(gov.loc.mets.DocumentRoot metsDocumentRoot, SubmittedFile mainFile, List<SubmittedFile> supplementaryFiles) {
		
		// Assemble a list of files to write (see comment for makeMets)
		
		List<SubmittedFile> files = new ArrayList<SubmittedFile>();
		files.add(mainFile);
		if (supplementaryFiles != null)
			files.addAll(supplementaryFiles);
		
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
			
			// Write files using the paths "f{index}.data"
			
			for (int i = 0; i < files.size(); i++) {
				
				entry = new ZipEntry("f" + i + ".data");
				zipOutput.putNextEntry(entry);

				FileInputStream fileInput = new FileInputStream(files.get(i).getFile());

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
