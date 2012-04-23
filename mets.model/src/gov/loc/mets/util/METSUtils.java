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
package gov.loc.mets.util;

import gov.loc.mets.AgentType;
import gov.loc.mets.CHECKSUMTYPEType;
import gov.loc.mets.DivType;
import gov.loc.mets.DocumentRoot;
import gov.loc.mets.FLocatType;
import gov.loc.mets.FileGrpType;
import gov.loc.mets.FileGrpType1;
import gov.loc.mets.FileSecType;
import gov.loc.mets.FileType;
import gov.loc.mets.LOCTYPEType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.MetsHdrType;
import gov.loc.mets.MetsType;
import gov.loc.mets.ROLEType;
import gov.loc.mets.SmLinkType;
import gov.loc.mets.StructMapType;
import gov.loc.mets.TYPEType;
import gov.loc.mets.impl.MetsPackageImpl;

import java.net.FileNameMap;
import java.net.URI;
import java.net.URLConnection;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.activation.MimetypesFileTypeMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;

/**
 * @author Gregory Jansen
 *
 */
public class METSUtils {

	static {
		MetsPackageImpl.init();
	}

	public static String makeXMLUUID(UUID rawuuid) {
		return new StringBuilder().append("uuid_").append(rawuuid.toString()).toString();
	}
	
	public static String makeXMLUUID() {
		return new StringBuilder().append("uuid_").append(UUID.randomUUID().toString()).toString();
	}

	public static DocumentRoot createInitialMetsDocument(String label) {
		DocumentRoot result = MetsFactory.eINSTANCE.createDocumentRoot();
		result.setMets(MetsFactory.eINSTANCE.createMetsType1());
		MetsType m = result.getMets();
		UUID uuid = UUID.randomUUID();
		m.setID(makeXMLUUID(uuid));
		m.setOBJID("info:fedora/uuid:"+uuid.toString());
		m.setLABEL(label);
		m.setPROFILE(METSConstants.MetsProfile_UNC_LIBRARIES);
		m.setTYPE(METSConstants.MetsType_WORKBENCH);

		{
			MetsHdrType head = MetsFactory.eINSTANCE.createMetsHdrType();
			Date currentTime = new Date(System.currentTimeMillis());
			head.setCREATEDATE(new XMLCalendar(currentTime, XMLCalendar.DATETIME));
			head.setLASTMODDATE(new XMLCalendar(currentTime, XMLCalendar.DATETIME));
			{ // adding workbench software agent
				AgentType agent = MetsFactory.eINSTANCE.createAgentType();
				agent.setROLE(ROLEType.CREATOR);
				agent.setTYPE(TYPEType.OTHER);
				// TODO embed version in agent name
				agent.setName("CDR Workbench");
				head.getAgent().add(agent);
			}
			{ // adding user name as agent
				AgentType agent = MetsFactory.eINSTANCE.createAgentType();
				agent.setROLE(ROLEType.CREATOR);
				agent.setTYPE(TYPEType.INDIVIDUAL);
				agent.setName(System.getProperty("user.name"));
				head.getAgent().add(agent);
			}
			m.setMetsHdr(head);
		}

		StructMapType arranged = MetsFactory.eINSTANCE.createStructMapType();
		arranged.setTYPE(METSConstants.StructMapType_ARRANGED);
		result.getMets().getStructMap().add(arranged);

		DivType bag = MetsFactory.eINSTANCE.createDivType();
		bag.setTYPE(METSConstants.Div_Bag);
		arranged.setDiv(bag);

		// set the fileSec
		FileSecType fs = MetsFactory.eINSTANCE.createFileSecType();
		m.setFileSec(fs);
		FileGrpType1 fgObjectData = MetsFactory.eINSTANCE.createFileGrpType1();
		fgObjectData.setID(METSConstants.FILEGROUP_Objects);
		fs.getFileGrp().add(fgObjectData);

		FileGrpType1 fgMetadata = MetsFactory.eINSTANCE.createFileGrpType1();
		fgMetadata.setID(METSConstants.FILEGROUP_BatchMetadata);
		fs.getFileGrp().add(fgMetadata);
		return result;
	}

	public static FileGrpType getObjectsFileGroup(MetsType m) {
		FileGrpType result = null;
		for (FileGrpType g : m.getFileSec().getFileGrp()) {
			if (METSConstants.FILEGROUP_Objects.equals(g.getID())) {
				result = g;
				break;
			}
		}
		return result;
	}

	public static FileGrpType getBatchMetadataGroup(MetsType m) {
		FileGrpType result = null;
		for (FileGrpType g : m.getFileSec().getFileGrp()) {
			if (METSConstants.FILEGROUP_BatchMetadata.equals(g.getID())) {
				result = g;
				break;
			}
		}
		return result;
	}
	
	public static SmLinkType findLink(EObject s, String p, EObject o) {
		SmLinkType result = null;
		EObject testMets = s.eContainer();
		while(!MetsType.class.isInstance(testMets)) {
			testMets = testMets.eContainer();
			if(testMets == null) {
				return null;
			}
		}
		MetsType mets = (MetsType)testMets;
		if(mets.getStructLink() == null) return null;
		for(SmLinkType l : mets.getStructLink().getSmLink()) {
			if(l.getXlinkFrom().equals(s)) {
				if(l.getXlinkTo().equals(o)) {
					if(l.getArcrole().equals(p)) {
						result = l;
						break;
					}
				}
			}
		}
		return result;
	}

	/**
	 * @param m
	 * @return
	 */
	public static DivType findBagDiv(MetsType m) {
		DivType result = null;
		for (StructMapType s : m.getStructMap()) {
			if (METSConstants.StructMapType_ARRANGED.equals(s.getTYPE())) {
				result = s.getDiv();
				break;
			}
		}
		return result;
	}

	// public static DivType findDiv(DivType bag, String objectID) {
	// //IFolder set = IResourceConstants.getFileGroupFolder(original);
	// String id = getDivID(set.getName(), original.getLocationURI());
	// return findDiv(bag, id);
	// }

	// public static String getDivID(String fileGroupUniqueName, URI
	// originalURI) {
	// StringBuilder result = new StringBuilder();
	// result.append("div-").append(fileGroupUniqueName.hashCode()).append("-").append(originalURI.hashCode());
	// return result.toString();
	// }

	/**
	 * @param mets
	 * @param original
	 *           the original IFile
	 * @return the file element
	 */
	public static FileType addFile(MetsType mets, URI originalData, long size, String md5) {
		FileType f = MetsFactory.eINSTANCE.createFileType();
		f.setID(makeXMLUUID());

		if (md5 != null) {
			f.setCHECKSUMTYPE(CHECKSUMTYPEType.MD5);
			f.setCHECKSUM(md5);
		}
		f.setSIZE(size);
		FileNameMap fileNameMap = URLConnection.getFileNameMap();
		String type = fileNameMap.getContentTypeFor(originalData.toString());
		if (type == null || type.trim().length() == 0) {
			type = new MimetypesFileTypeMap().getContentType(originalData.toString());
			if (type == null || type.trim().length() == 0) {
				type = "application/octet-stream";
			}
		}
		f.setMIMETYPE(type);
		// add original locator
		FLocatType l = MetsFactory.eINSTANCE.createFLocatType();
		f.getFLocat().add(l);
		l.setUSE(METSConstants.FLocat_USE_ORIGINAL);
		l.setLOCTYPE(LOCTYPEType.OTHER);
		l.setOTHERLOCTYPE(METSConstants.LocType_EFS_SCHEME);
		l.setHref(originalData.toASCIIString());

		FileGrpType objectsGrp = getObjectsFileGroup(mets);
		objectsGrp.getFile().add(f);
		return f;
	}

	/**
	 * @param mets
	 * @param original
	 *           the original IFile
	 * @param stagedUri
	 *           the stage URI
	 * @param locType
	 *           location type
	 * @param otherLocType
	 *           other location type or null
	 * @return the locator
	 */
	public static FLocatType addStagedFileLocator(MetsType mets, String id, URI original, URI stagedUri,
			LOCTYPEType locType, String otherLocType) {
		// find or create the group for this object
		FileType data = (FileType)mets.eResource().getEObject(id);
		if (data == null) {
			throw new Error("data file element does not exist");
		}
		// find or create the staged File record
		FLocatType l = MetsFactory.eINSTANCE.createFLocatType();
		data.getFLocat().add(l);
		l.setUSE(METSConstants.FLocat_USE_STAGE);
		l.setLOCTYPE(locType);
		if (LOCTYPEType.OTHER.equals(locType) && otherLocType != null) {
			l.setOTHERLOCTYPE(otherLocType);
		}
		l.setHref(stagedUri.toASCIIString());
		return l;
	}

	/**
	 * @param div
	 * @return
	 */
	public static EObject getDescription(DivType d, String status) {
		EObject result = null;
		MdSecType userModsSection = null;
		for (MdSecType md : d.getDmdSec()) {
			if (status.equals(md.getSTATUS())) {
				userModsSection = md;
				break;
			}
		}
		result = (EObject) userModsSection.getMdWrap().getXmlData().getAny().getValue(0);
		return result;
	}

	/**
	 * @param d
	 * @return
	 */
	public static boolean isContainer(DivType d) {
		if(!d.getDiv().isEmpty()) {
			return true;
		}
		if (METSConstants.Div_Folder.equals(d.getTYPE()) || METSConstants.Div_Collection.equals(d.getTYPE())
				|| METSConstants.Div_Disk.equals(d.getTYPE()) || METSConstants.Div_AggregateWork.equals(d.getTYPE())) {
			return true;
		} else {
			return false;
		}
	}

	public static Collection<SmLinkType> getObjectLinks(DivType d) {
		Set<SmLinkType> result = new HashSet<SmLinkType>();
		try {
			DocumentRoot r = (DocumentRoot)d.eResource().getContents().get(0);
			for(SmLinkType sml : r.getMets().getStructLink().getSmLink()) {
				if(d.equals(sml.getXlinkTo())) {
					result.add(sml);
				}
			}
		} catch(NullPointerException ignored) {
			//ignored.printStackTrace();
		}
		return result;
	}
}
