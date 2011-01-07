/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Md Wrap Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.MdWrapType#getBinData <em>Bin Data</em>}</li>
 *   <li>{@link gov.loc.mets.MdWrapType#getXmlData <em>Xml Data</em>}</li>
 *   <li>{@link gov.loc.mets.MdWrapType#getCHECKSUM <em>CHECKSUM</em>}</li>
 *   <li>{@link gov.loc.mets.MdWrapType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.MdWrapType#getCREATED <em>CREATED</em>}</li>
 *   <li>{@link gov.loc.mets.MdWrapType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.MdWrapType#getLABEL <em>LABEL</em>}</li>
 *   <li>{@link gov.loc.mets.MdWrapType#getMDTYPE <em>MDTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.MdWrapType#getMDTYPEVERSION <em>MDTYPEVERSION</em>}</li>
 *   <li>{@link gov.loc.mets.MdWrapType#getMIMETYPE <em>MIMETYPE</em>}</li>
 *   <li>{@link gov.loc.mets.MdWrapType#getOTHERMDTYPE <em>OTHERMDTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.MdWrapType#getSIZE <em>SIZE</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getMdWrapType()
 * @model extendedMetaData="name='mdWrap_._type' kind='elementOnly'"
 * @generated
 */
public interface MdWrapType extends EObject {
        /**
         * Returns the value of the '<em><b>Bin Data</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 									The binary data wrapper element &lt;binData&gt; is used to contain Base64 encoded metadata.												
         * <!-- end-model-doc -->
         * @return the value of the '<em>Bin Data</em>' attribute.
         * @see #setBinData(byte[])
         * @see gov.loc.mets.MetsPackage#getMdWrapType_BinData()
         * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
         *        extendedMetaData="kind='element' name='binData' namespace='##targetNamespace'"
         * @generated
         */
        byte[] getBinData();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdWrapType#getBinData <em>Bin Data</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Bin Data</em>' attribute.
         * @see #getBinData()
         * @generated
         */
        void setBinData(byte[] value);

        /**
         * Returns the value of the '<em><b>Xml Data</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 									The xml data wrapper element &lt;xmlData&gt; is used to contain XML encoded metadata. The content of an &lt;xmlData&gt; element can be in any namespace or in no namespace. As permitted by the XML Schema Standard, the processContents attribute value for the metadata in an &lt;xmlData&gt; is set to “lax”. Therefore, if the source schema and its location are identified by means of an XML schemaLocation attribute, then an XML processor will validate the elements for which it can find declarations. If a source schema is not identified, or cannot be found at the specified schemaLocation, then an XML validator will check for well-formedness, but otherwise skip over the elements appearing in the &lt;xmlData&gt; element. 												
         * 								
         * <!-- end-model-doc -->
         * @return the value of the '<em>Xml Data</em>' containment reference.
         * @see #setXmlData(XmlDataType1)
         * @see gov.loc.mets.MetsPackage#getMdWrapType_XmlData()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='xmlData' namespace='##targetNamespace'"
         * @generated
         */
        XmlDataType1 getXmlData();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdWrapType#getXmlData <em>Xml Data</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Xml Data</em>' containment reference.
         * @see #getXmlData()
         * @generated
         */
        void setXmlData(XmlDataType1 value);

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
         * @see gov.loc.mets.MetsPackage#getMdWrapType_CHECKSUM()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='CHECKSUM'"
         * @generated
         */
        String getCHECKSUM();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdWrapType#getCHECKSUM <em>CHECKSUM</em>}' attribute.
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
         * @see gov.loc.mets.MetsPackage#getMdWrapType_CHECKSUMTYPE()
         * @model unsettable="true"
         *        extendedMetaData="kind='attribute' name='CHECKSUMTYPE'"
         * @generated
         */
        CHECKSUMTYPEType getCHECKSUMTYPE();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdWrapType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}' attribute.
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
         * Unsets the value of the '{@link gov.loc.mets.MdWrapType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetCHECKSUMTYPE()
         * @see #getCHECKSUMTYPE()
         * @see #setCHECKSUMTYPE(CHECKSUMTYPEType)
         * @generated
         */
        void unsetCHECKSUMTYPE();

        /**
         * Returns whether the value of the '{@link gov.loc.mets.MdWrapType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}' attribute is set.
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
         * @see gov.loc.mets.MetsPackage#getMdWrapType_CREATED()
         * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
         *        extendedMetaData="kind='attribute' name='CREATED'"
         * @generated
         */
        XMLGregorianCalendar getCREATED();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdWrapType#getCREATED <em>CREATED</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>CREATED</em>' attribute.
         * @see #getCREATED()
         * @generated
         */
        void setCREATED(XMLGregorianCalendar value);

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
         * @see gov.loc.mets.MetsPackage#getMdWrapType_ID()
         * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
         *        extendedMetaData="kind='attribute' name='ID'"
         * @generated
         */
        String getID();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdWrapType#getID <em>ID</em>}' attribute.
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
         * LABEL: an optional string attribute providing a label to display to the viewer of the METS document identifying the metadata.
         * 							
         * <!-- end-model-doc -->
         * @return the value of the '<em>LABEL</em>' attribute.
         * @see #setLABEL(String)
         * @see gov.loc.mets.MetsPackage#getMdWrapType_LABEL()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='LABEL'"
         * @generated
         */
        String getLABEL();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdWrapType#getLABEL <em>LABEL</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>LABEL</em>' attribute.
         * @see #getLABEL()
         * @generated
         */
        void setLABEL(String value);

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
         * @see gov.loc.mets.MetsPackage#getMdWrapType_MDTYPE()
         * @model unsettable="true" required="true"
         *        extendedMetaData="kind='attribute' name='MDTYPE'"
         * @generated
         */
        MDTYPEType getMDTYPE();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdWrapType#getMDTYPE <em>MDTYPE</em>}' attribute.
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
         * Unsets the value of the '{@link gov.loc.mets.MdWrapType#getMDTYPE <em>MDTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetMDTYPE()
         * @see #getMDTYPE()
         * @see #setMDTYPE(MDTYPEType)
         * @generated
         */
        void unsetMDTYPE();

        /**
         * Returns whether the value of the '{@link gov.loc.mets.MdWrapType#getMDTYPE <em>MDTYPE</em>}' attribute is set.
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
         * @see gov.loc.mets.MetsPackage#getMdWrapType_MDTYPEVERSION()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='MDTYPEVERSION'"
         * @generated
         */
        String getMDTYPEVERSION();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdWrapType#getMDTYPEVERSION <em>MDTYPEVERSION</em>}' attribute.
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
         * @see gov.loc.mets.MetsPackage#getMdWrapType_MIMETYPE()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='MIMETYPE'"
         * @generated
         */
        String getMIMETYPE();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdWrapType#getMIMETYPE <em>MIMETYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>MIMETYPE</em>' attribute.
         * @see #getMIMETYPE()
         * @generated
         */
        void setMIMETYPE(String value);

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
         * @see gov.loc.mets.MetsPackage#getMdWrapType_OTHERMDTYPE()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='OTHERMDTYPE'"
         * @generated
         */
        String getOTHERMDTYPE();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdWrapType#getOTHERMDTYPE <em>OTHERMDTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>OTHERMDTYPE</em>' attribute.
         * @see #getOTHERMDTYPE()
         * @generated
         */
        void setOTHERMDTYPE(String value);

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
         * @see gov.loc.mets.MetsPackage#getMdWrapType_SIZE()
         * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
         *        extendedMetaData="kind='attribute' name='SIZE'"
         * @generated
         */
        long getSIZE();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdWrapType#getSIZE <em>SIZE</em>}' attribute.
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
         * Unsets the value of the '{@link gov.loc.mets.MdWrapType#getSIZE <em>SIZE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetSIZE()
         * @see #getSIZE()
         * @see #setSIZE(long)
         * @generated
         */
        void unsetSIZE();

        /**
         * Returns whether the value of the '{@link gov.loc.mets.MdWrapType#getSIZE <em>SIZE</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>SIZE</em>' attribute is set.
         * @see #unsetSIZE()
         * @see #getSIZE()
         * @see #setSIZE(long)
         * @generated
         */
        boolean isSetSIZE();

} // MdWrapType
