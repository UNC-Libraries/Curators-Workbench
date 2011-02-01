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
import gov.loc.mets.StructMapType;
import gov.loc.mets.TYPEType;
import gov.loc.mets.impl.MetsPackageImpl;

import java.net.FileNameMap;
import java.net.URI;
import java.net.URLConnection;
import java.util.Date;
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

    public static String makeXMLUUID() {
	return new StringBuilder().append("uuid_").append(UUID.randomUUID().toString()).toString();
    }

    public static DocumentRoot createInitialMetsDocument(String label) {
	DocumentRoot result = MetsFactory.eINSTANCE.createDocumentRoot();
	result.setMets(MetsFactory.eINSTANCE.createMetsType1());
	MetsType m = result.getMets();
	m.setID(makeXMLUUID());
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
     * @param d
     * @param uri
     * @return
     */
    public static DivType findDiv(MetsType m, String id) {
	DivType result = null;
	Object o = m.eResource().getEObject(id);
	if (o instanceof DivType) {
	    result = (DivType) o;
	}
	return result;
    }

    /**
     * @param mets
     * @param original
     *            the original IFile
     * @return the file element
     */
    public static FileType addDataFile(MetsType mets, String objectID, URI originalData, long size, String md5) {
	FileType test = getDataFile(mets, objectID, originalData);
	if (test != null) {
	    throw new Error("already exists");
	}
	FileGrpType fg = getObjectFileGroup(mets, objectID);
	FileType f = MetsFactory.eINSTANCE.createFileType();
	String ID = new StringBuilder().append("data-").append(originalData.hashCode()).toString();
	f.setID(ID);
	fg.getFile().add(f);
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
	return f;
    }

    /**
     * @param mets
     * @param objectID
     * @param originalData
     * @return
     */
    public static FileType getDataFile(MetsType mets, String objectID, URI originalData) {
	String ID = new StringBuilder().append("data-").append(originalData.hashCode()).toString();
	FileGrpType object = getObjectFileGroup(mets, objectID);
	FileType file = null;
	for (FileType f : object.getFile()) {
	    if (ID.equals(f.getID())) {
		file = f;
	    }
	}
	return file;
    }

    public static FileGrpType addObjectFileGroup(MetsType mets, String objectID) {
	FileGrpType result = getObjectFileGroup(mets, objectID);
	if (result != null) {
	    throw new Error("already exists");
	}
	String ID = new StringBuilder().append("objectGrp-").append(objectID).toString();
	result = MetsFactory.eINSTANCE.createFileGrpType();
	result.setID(ID);
	getObjectsFileGroup(mets).getFileGrp().add(result);
	return result;
    }

    /**
     * Find a /fileSec/FileGrp[ID="OBJECTS"]/FileGrp[ID="object-URI_hashcode"]
     *
     * @param mets
     * @param locationURI
     * @return
     */
    public static FileGrpType getObjectFileGroup(MetsType mets, String objectID) {
	FileGrpType objects = getObjectsFileGroup(mets);
	String ID = new StringBuilder().append("objectGrp-").append(objectID).toString();
	FileGrpType object = null;
	for (FileGrpType o : objects.getFileGrp()) {
	    if (ID.equals(o.getID())) {
		object = o;
	    }
	}
	return object;
    }

    /**
     * @param mets
     * @param original
     *            the original IFile
     * @param stagedUri
     *            the stage URI
     * @param locType
     *            location type
     * @param otherLocType
     *            other location type or null
     * @return the locator
     */
    public static FLocatType addStagedFileLocator(MetsType mets, String objectID, URI original, URI stagedUri,
		    LOCTYPEType locType, String otherLocType) {
	// find or create the group for this object
	FileType data = getDataFile(mets, objectID, original);
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
	if (d.getDMDID() != null) {
	    for (String id : d.getDMDID()) {
		MdSecType md = (MdSecType) d.eResource().getEObject(id);
		if (status.equals(md.getSTATUS())) {
		    userModsSection = md;
		    break;
		}
	    }
	    result = (EObject) userModsSection.getMdWrap().getXmlData().getAny().getValue(0);
	}
	return result;
    }

    /**
     * @param d
     * @return
     */
    public static boolean isContainer(DivType d) {
	if (METSConstants.Div_Folder.equals(d.getTYPE()) || METSConstants.Div_Collection.equals(d.getTYPE())
			    || METSConstants.Div_Disk.equals(d.getTYPE())) {
	    return true;
	} else {
	    return false;
	}
    }

    // private static FileGrpType getFileGrpForSet(MetsType mets, String
    // fileSetUniqueName) {
    // String fileGrpID = getFileSetGroupID(fileSetUniqueName);
    // log.debug("file group id:" + fileGrpID);
    // FileSecType fs = mets.getFileSec();
    // // FIXME support file set renames (hashcode will change)
    // FileGrpType1 result = null;
    // for (FileGrpType g : fs.getFileGrp()) {
    // if (fileGrpID.equals(g.getID())) {
    // return g;
    // }
    // }
    // log.debug("had to create it");
    // result = MetsFactory.eINSTANCE.createFileGrpType1();
    // fs.getFileGrp().add(result);
    // result.setID(fileGrpID);
    // return result;
    // }

    // public static String getFileSetGroupID(String fileSetUniqueName) {
    // StringBuilder result = new StringBuilder();
    // result.append("fileGrp-");
    // result.append(fileSetUniqueName.hashCode());
    // return result.toString();
    // }
}
