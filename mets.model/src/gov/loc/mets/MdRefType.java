/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Md Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.MdRefType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getCHECKSUM <em>CHECKSUM</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getCREATED <em>CREATED</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getHref <em>Href</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getLABEL <em>LABEL</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getLOCTYPE <em>LOCTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getMDTYPE <em>MDTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getMDTYPEVERSION <em>MDTYPEVERSION</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getMIMETYPE <em>MIMETYPE</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getOTHERLOCTYPE <em>OTHERLOCTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getOTHERMDTYPE <em>OTHERMDTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getSIZE <em>SIZE</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getType <em>Type</em>}</li>
 *   <li>{@link gov.loc.mets.MdRefType#getXPTR <em>XPTR</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getMdRefType()
 * @model extendedMetaData="name='mdRef_._type' kind='empty'"
 * @generated
 */
public interface MdRefType extends EObject {
        /**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Actuate</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        ActuateType getActuate();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
        void setActuate(ActuateType value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.MdRefType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
        void unsetActuate();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.MdRefType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
        boolean isSetActuate();

        /**
	 * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Arcrole</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(String)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_Arcrole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getArcrole();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getArcrole <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcrole</em>' attribute.
	 * @see #getArcrole()
	 * @generated
	 */
        void setArcrole(String value);

        /**
	 * Returns the value of the '<em><b>CHECKSUM</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CHECKSUM (string/O): Provides a checksum value for the associated file or wrapped content.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CHECKSUM</em>' attribute.
	 * @see #setCHECKSUM(String)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_CHECKSUM()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='CHECKSUM'"
	 * @generated
	 */
        String getCHECKSUM();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getCHECKSUM <em>CHECKSUM</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CHECKSUM</em>' attribute.
	 * @see #getCHECKSUM()
	 * @generated
	 */
        void setCHECKSUM(String value);

        /**
	 * Returns the value of the '<em><b>CHECKSUMTYPE</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mets.CHECKSUMTYPEType}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CHECKSUMTYPE (enumerated string/O): Specifies the checksum algorithm used to produce the value contained in the CHECKSUM attribute.  CHECKSUMTYPE must contain one of the following values:
	 * 					Adler-32
	 * 					CRC32
	 * 					HAVAL
	 * 					MD5
	 * 					MNP
	 * 					SHA-1
	 * 					SHA-256
	 * 					SHA-384
	 * 					SHA-512
	 * 					TIGER
	 * 					WHIRLPOOL
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CHECKSUMTYPE</em>' attribute.
	 * @see gov.loc.mets.CHECKSUMTYPEType
	 * @see #isSetCHECKSUMTYPE()
	 * @see #unsetCHECKSUMTYPE()
	 * @see #setCHECKSUMTYPE(CHECKSUMTYPEType)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_CHECKSUMTYPE()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='CHECKSUMTYPE'"
	 * @generated
	 */
        CHECKSUMTYPEType getCHECKSUMTYPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CHECKSUMTYPE</em>' attribute.
	 * @see gov.loc.mets.CHECKSUMTYPEType
	 * @see #isSetCHECKSUMTYPE()
	 * @see #unsetCHECKSUMTYPE()
	 * @see #getCHECKSUMTYPE()
	 * @generated
	 */
        void setCHECKSUMTYPE(CHECKSUMTYPEType value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.MdRefType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetCHECKSUMTYPE()
	 * @see #getCHECKSUMTYPE()
	 * @see #setCHECKSUMTYPE(CHECKSUMTYPEType)
	 * @generated
	 */
        void unsetCHECKSUMTYPE();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.MdRefType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>CHECKSUMTYPE</em>' attribute is set.
	 * @see #unsetCHECKSUMTYPE()
	 * @see #getCHECKSUMTYPE()
	 * @see #setCHECKSUMTYPE(CHECKSUMTYPEType)
	 * @generated
	 */
        boolean isSetCHECKSUMTYPE();

        /**
	 * Returns the value of the '<em><b>CREATED</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CREATED (dateTime/O): Specifies the date and time of creation for the associated file or wrapped content.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CREATED</em>' attribute.
	 * @see #setCREATED(XMLGregorianCalendar)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_CREATED()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='CREATED'"
	 * @generated
	 */
        XMLGregorianCalendar getCREATED();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getCREATED <em>CREATED</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATED</em>' attribute.
	 * @see #getCREATED()
	 * @generated
	 */
        void setCREATED(XMLGregorianCalendar value);

        /**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Href</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getHref();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
        void setHref(String value);

        /**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID (ID/O): This attribute uniquely identifies the element within the METS document, and would allow the element to be referenced unambiguously from another element or document via an IDREF or an XPTR. For more information on using ID attributes for internal and external linking see Chapter 4 of the METS Primer.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_ID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
        String getID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
        void setID(String value);

        /**
	 * Returns the value of the '<em><b>LABEL</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LABEL (string/O): Provides a label to display to the viewer of the METS document that identifies the associated metadata.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LABEL</em>' attribute.
	 * @see #setLABEL(String)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_LABEL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='LABEL'"
	 * @generated
	 */
        String getLABEL();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getLABEL <em>LABEL</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LABEL</em>' attribute.
	 * @see #getLABEL()
	 * @generated
	 */
        void setLABEL(String value);

        /**
	 * Returns the value of the '<em><b>LOCTYPE</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mets.LOCTYPEType}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LOCTYPE (string/R): Specifies the locator type used in the xlink:href attribute. Valid values for LOCTYPE are: 
	 * 					ARK
	 * 					URN
	 * 					URL
	 * 					PURL
	 * 					HANDLE
	 * 					DOI
	 * 					OTHER
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LOCTYPE</em>' attribute.
	 * @see gov.loc.mets.LOCTYPEType
	 * @see #isSetLOCTYPE()
	 * @see #unsetLOCTYPE()
	 * @see #setLOCTYPE(LOCTYPEType)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_LOCTYPE()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='LOCTYPE'"
	 * @generated
	 */
        LOCTYPEType getLOCTYPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getLOCTYPE <em>LOCTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LOCTYPE</em>' attribute.
	 * @see gov.loc.mets.LOCTYPEType
	 * @see #isSetLOCTYPE()
	 * @see #unsetLOCTYPE()
	 * @see #getLOCTYPE()
	 * @generated
	 */
        void setLOCTYPE(LOCTYPEType value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.MdRefType#getLOCTYPE <em>LOCTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetLOCTYPE()
	 * @see #getLOCTYPE()
	 * @see #setLOCTYPE(LOCTYPEType)
	 * @generated
	 */
        void unsetLOCTYPE();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.MdRefType#getLOCTYPE <em>LOCTYPE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>LOCTYPE</em>' attribute is set.
	 * @see #unsetLOCTYPE()
	 * @see #getLOCTYPE()
	 * @see #setLOCTYPE(LOCTYPEType)
	 * @generated
	 */
        boolean isSetLOCTYPE();

        /**
	 * Returns the value of the '<em><b>MDTYPE</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mets.MDTYPEType}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MDTYPE (string/R): Is used to indicate the type of the associated metadata. It must have one of the following values:
	 * MARC: any form of MARC record
	 * MODS: metadata in the Library of Congress MODS format
	 * EAD: Encoded Archival Description finding aid
	 * DC: Dublin Core
	 * NISOIMG: NISO Technical Metadata for Digital Still Images
	 * LC-AV: technical metadata specified in the Library of Congress A/V prototyping project
	 * VRA: Visual Resources Association Core
	 * TEIHDR: Text Encoding Initiative Header
	 * DDI: Data Documentation Initiative
	 * FGDC: Federal Geographic Data Committee metadata
	 * LOM: Learning Object Model
	 * PREMIS:  PREservation Metadata: Implementation Strategies
	 * PREMIS:OBJECT: PREMIS Object entiry
	 * PREMIS:AGENT: PREMIS Agent entity
	 * PREMIS:RIGHTS: PREMIS Rights entity
	 * PREMIS:EVENT: PREMIS Event entity
	 * TEXTMD: textMD Technical metadata for text
	 * METSRIGHTS: Rights Declaration Schema
	 * ISO 19115:2003 NAP: North American Profile of ISO 19115:2003 descriptive metadata
	 * OTHER: metadata in a format not specified above
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MDTYPE</em>' attribute.
	 * @see gov.loc.mets.MDTYPEType
	 * @see #isSetMDTYPE()
	 * @see #unsetMDTYPE()
	 * @see #setMDTYPE(MDTYPEType)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_MDTYPE()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='MDTYPE'"
	 * @generated
	 */
        MDTYPEType getMDTYPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getMDTYPE <em>MDTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDTYPE</em>' attribute.
	 * @see gov.loc.mets.MDTYPEType
	 * @see #isSetMDTYPE()
	 * @see #unsetMDTYPE()
	 * @see #getMDTYPE()
	 * @generated
	 */
        void setMDTYPE(MDTYPEType value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.MdRefType#getMDTYPE <em>MDTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetMDTYPE()
	 * @see #getMDTYPE()
	 * @see #setMDTYPE(MDTYPEType)
	 * @generated
	 */
        void unsetMDTYPE();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.MdRefType#getMDTYPE <em>MDTYPE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>MDTYPE</em>' attribute is set.
	 * @see #unsetMDTYPE()
	 * @see #getMDTYPE()
	 * @see #setMDTYPE(MDTYPEType)
	 * @generated
	 */
        boolean isSetMDTYPE();

        /**
	 * Returns the value of the '<em><b>MDTYPEVERSION</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MDTYPEVERSION(string/O): Provides a means for recording the version of the type of metadata (as recorded in the MDTYPE or OTHERMDTYPE attribute) that is being used.  This may represent the version of the underlying data dictionary or metadata model rather than a schema version. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MDTYPEVERSION</em>' attribute.
	 * @see #setMDTYPEVERSION(String)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_MDTYPEVERSION()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='MDTYPEVERSION'"
	 * @generated
	 */
        String getMDTYPEVERSION();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getMDTYPEVERSION <em>MDTYPEVERSION</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDTYPEVERSION</em>' attribute.
	 * @see #getMDTYPEVERSION()
	 * @generated
	 */
        void setMDTYPEVERSION(String value);

        /**
	 * Returns the value of the '<em><b>MIMETYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIMETYPE (string/O): The IANA MIME media type for the associated file or wrapped content. Some values for this attribute can be found on the IANA website.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MIMETYPE</em>' attribute.
	 * @see #setMIMETYPE(String)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_MIMETYPE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='MIMETYPE'"
	 * @generated
	 */
        String getMIMETYPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getMIMETYPE <em>MIMETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MIMETYPE</em>' attribute.
	 * @see #getMIMETYPE()
	 * @generated
	 */
        void setMIMETYPE(String value);

        /**
	 * Returns the value of the '<em><b>OTHERLOCTYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OTHERLOCTYPE (string/O): Specifies the locator type when the value OTHER is used in the LOCTYPE attribute. Although optional, it is strongly recommended when OTHER is used.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OTHERLOCTYPE</em>' attribute.
	 * @see #setOTHERLOCTYPE(String)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_OTHERLOCTYPE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='OTHERLOCTYPE'"
	 * @generated
	 */
        String getOTHERLOCTYPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getOTHERLOCTYPE <em>OTHERLOCTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OTHERLOCTYPE</em>' attribute.
	 * @see #getOTHERLOCTYPE()
	 * @generated
	 */
        void setOTHERLOCTYPE(String value);

        /**
	 * Returns the value of the '<em><b>OTHERMDTYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OTHERMDTYPE (string/O): Specifies the form of metadata in use when the value OTHER is indicated in the MDTYPE attribute.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OTHERMDTYPE</em>' attribute.
	 * @see #setOTHERMDTYPE(String)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_OTHERMDTYPE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='OTHERMDTYPE'"
	 * @generated
	 */
        String getOTHERMDTYPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getOTHERMDTYPE <em>OTHERMDTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OTHERMDTYPE</em>' attribute.
	 * @see #getOTHERMDTYPE()
	 * @generated
	 */
        void setOTHERMDTYPE(String value);

        /**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Role</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getRole();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
        void setRole(String value);

        /**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Show</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        ShowType getShow();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
        void setShow(ShowType value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.MdRefType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
        void unsetShow();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.MdRefType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
        boolean isSetShow();

        /**
	 * Returns the value of the '<em><b>SIZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIZE (long/O): Specifies the size in bytes of the associated file or wrapped content.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SIZE</em>' attribute.
	 * @see #isSetSIZE()
	 * @see #unsetSIZE()
	 * @see #setSIZE(long)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_SIZE()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='SIZE'"
	 * @generated
	 */
        long getSIZE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getSIZE <em>SIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SIZE</em>' attribute.
	 * @see #isSetSIZE()
	 * @see #unsetSIZE()
	 * @see #getSIZE()
	 * @generated
	 */
        void setSIZE(long value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.MdRefType#getSIZE <em>SIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetSIZE()
	 * @see #getSIZE()
	 * @see #setSIZE(long)
	 * @generated
	 */
        void unsetSIZE();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.MdRefType#getSIZE <em>SIZE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SIZE</em>' attribute is set.
	 * @see #unsetSIZE()
	 * @see #getSIZE()
	 * @see #setSIZE(long)
	 * @generated
	 */
        boolean isSetSIZE();

        /**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Title</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getTitle();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
        void setTitle(String value);

        /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_Type()
	 * @model default="simple" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getType();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
        void setType(String value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.MdRefType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
        void unsetType();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.MdRefType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
        boolean isSetType();

        /**
	 * Returns the value of the '<em><b>XPTR</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XPTR (string/O): Locates the point within a file to which the &lt;mdRef&gt; element refers, if applicable.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPTR</em>' attribute.
	 * @see #setXPTR(String)
	 * @see gov.loc.mets.MetsPackage#getMdRefType_XPTR()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='XPTR'"
	 * @generated
	 */
        String getXPTR();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MdRefType#getXPTR <em>XPTR</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPTR</em>' attribute.
	 * @see #getXPTR()
	 * @generated
	 */
        void setXPTR(String value);

} // MdRefType
