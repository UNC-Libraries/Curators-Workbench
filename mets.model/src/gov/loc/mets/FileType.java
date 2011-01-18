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
package gov.loc.mets;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * fileType: Complex Type for Files
 * 				The file element provides access to content files for a METS object.  A file element may contain one or more FLocat elements, which provide pointers to a content file, and/or an FContent element, which wraps an encoded version of the file. Note that ALL FLocat and FContent elements underneath a single file element should identify/contain identical copies of a single file.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.FileType#getFLocat <em>FLocat</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getFContent <em>FContent</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getStream <em>Stream</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getTransformFile <em>Transform File</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getFile <em>File</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getBEGIN <em>BEGIN</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getBETYPE <em>BETYPE</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getCHECKSUM <em>CHECKSUM</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getCREATED <em>CREATED</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getDMDID <em>DMDID</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getEND <em>END</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getGROUPID <em>GROUPID</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getMIMETYPE <em>MIMETYPE</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getOWNERID <em>OWNERID</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getSEQ <em>SEQ</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getSIZE <em>SIZE</em>}</li>
 *   <li>{@link gov.loc.mets.FileType#getUSE <em>USE</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getFileType()
 * @model extendedMetaData="name='fileType' kind='elementOnly'"
 * @generated
 */
public interface FileType extends EObject {
        /**
         * Returns the value of the '<em><b>FLocat</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.FLocatType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 						The file location element &lt;FLocat&gt; provides a pointer to the location of a content file. It uses the XLink reference syntax to provide linking information indicating the actual location of the content file, along with other attributes specifying additional linking information. NOTE: &lt;FLocat&gt; is an empty element. The location of the resource pointed to MUST be stored in the xlink:href attribute.
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>FLocat</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getFileType_FLocat()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='FLocat' namespace='##targetNamespace'"
         * @generated
         */
        EList<FLocatType> getFLocat();

        /**
         * Returns the value of the '<em><b>FContent</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 						The file content element &lt;FContent&gt; is used to identify a content file contained internally within a METS document. The content file must be either Base64 encoded and contained within the subsidiary &lt;binData&gt; wrapper element, or consist of XML information and be contained within the subsidiary &lt;xmlData&gt; wrapper element.
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>FContent</em>' containment reference.
         * @see #setFContent(FContentType)
         * @see gov.loc.mets.MetsPackage#getFileType_FContent()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='FContent' namespace='##targetNamespace'"
         * @generated
         */
        FContentType getFContent();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getFContent <em>FContent</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>FContent</em>' containment reference.
         * @see #getFContent()
         * @generated
         */
        void setFContent(FContentType value);

        /**
         * Returns the value of the '<em><b>Stream</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.StreamType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 						A component byte stream element &lt;stream&gt; may be composed of one or more subsidiary streams. An MPEG4 file, for example, might contain separate audio and video streams, each of which is associated with technical metadata. The repeatable &lt;stream&gt; element provides a mechanism to record the existence of separate data streams within a particular file, and the opportunity to associate &lt;dmdSec&gt; and &lt;amdSec&gt; with those subsidiary data streams if desired. 
         * <!-- end-model-doc -->
         * @return the value of the '<em>Stream</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getFileType_Stream()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='stream' namespace='##targetNamespace'"
         * @generated
         */
        EList<StreamType> getStream();

        /**
         * Returns the value of the '<em><b>Transform File</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.TransformFileType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 						The transform file element &lt;transformFile&gt; provides a means to access any subsidiary files listed below a &lt;file&gt; element by indicating the steps required to "unpack" or transform the subsidiary files. This element is repeatable and might provide a link to a &lt;behavior&gt; in the &lt;behaviorSec&gt; that performs the transformation.
         * <!-- end-model-doc -->
         * @return the value of the '<em>Transform File</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getFileType_TransformFile()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='transformFile' namespace='##targetNamespace'"
         * @generated
         */
        EList<TransformFileType> getTransformFile();

        /**
         * Returns the value of the '<em><b>File</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.FileType}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>File</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>File</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getFileType_File()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='file' namespace='##targetNamespace'"
         * @generated
         */
        EList<FileType> getFile();

        /**
         * Returns the value of the '<em><b>ADMID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * ADMID (IDREFS/O): Contains the ID attribute values of the &lt;techMD&gt;, &lt;sourceMD&gt;, &lt;rightsMD&gt; and/or &lt;digiprovMD&gt; elements within the &lt;amdSec&gt; of the METS document that contain administrative metadata pertaining to the file. For more information on using METS IDREFS and IDREF type attributes for internal linking, see Chapter 4 of the METS Primer.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>ADMID</em>' attribute.
         * @see #setADMID(List)
         * @see gov.loc.mets.MetsPackage#getFileType_ADMID()
         * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
         *        extendedMetaData="kind='attribute' name='ADMID'"
         * @generated
         */
        List<String> getADMID();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getADMID <em>ADMID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ADMID</em>' attribute.
         * @see #getADMID()
         * @generated
         */
        void setADMID(List<String> value);

        /**
         * Returns the value of the '<em><b>BEGIN</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * BEGIN (string/O): An attribute that specifies the point in the parent &lt;file&gt; where the current &lt;file&gt; begins.  When used in conjunction with a &lt;file&gt; element, this attribute is only meaningful when this element is nested, and its parent &lt;file&gt; element represents a container file. It can be used in conjunction with the END attribute as a means of defining the location of the current file within its parent file. However, the BEGIN attribute can be used with or without a companion END attribute. When no END attribute is specified, the end of the parent file is assumed also to be the end point of the current file. The BEGIN and END attributes can only be interpreted meaningfully in conjunction with a BETYPE attribute, which specifies the kind of beginning/ending point values that are being used. 
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>BEGIN</em>' attribute.
         * @see #setBEGIN(String)
         * @see gov.loc.mets.MetsPackage#getFileType_BEGIN()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='BEGIN'"
         * @generated
         */
        String getBEGIN();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getBEGIN <em>BEGIN</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>BEGIN</em>' attribute.
         * @see #getBEGIN()
         * @generated
         */
        void setBEGIN(String value);

        /**
         * Returns the value of the '<em><b>BETYPE</b></em>' attribute.
         * The literals are from the enumeration {@link gov.loc.mets.BETYPEType1}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * BETYPE: Begin/End Type.
         * 					BETYPE (string/O): An attribute that specifies the kind of BEGIN and/or END values that are being used. Currently BYTE is the only valid value that can be used in conjunction with nested &lt;file&gt; or &lt;stream&gt; elements. 
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>BETYPE</em>' attribute.
         * @see gov.loc.mets.BETYPEType1
         * @see #isSetBETYPE()
         * @see #unsetBETYPE()
         * @see #setBETYPE(BETYPEType1)
         * @see gov.loc.mets.MetsPackage#getFileType_BETYPE()
         * @model unsettable="true"
         *        extendedMetaData="kind='attribute' name='BETYPE'"
         * @generated
         */
        BETYPEType1 getBETYPE();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getBETYPE <em>BETYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>BETYPE</em>' attribute.
         * @see gov.loc.mets.BETYPEType1
         * @see #isSetBETYPE()
         * @see #unsetBETYPE()
         * @see #getBETYPE()
         * @generated
         */
        void setBETYPE(BETYPEType1 value);

        /**
         * Unsets the value of the '{@link gov.loc.mets.FileType#getBETYPE <em>BETYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetBETYPE()
         * @see #getBETYPE()
         * @see #setBETYPE(BETYPEType1)
         * @generated
         */
        void unsetBETYPE();

        /**
         * Returns whether the value of the '{@link gov.loc.mets.FileType#getBETYPE <em>BETYPE</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>BETYPE</em>' attribute is set.
         * @see #unsetBETYPE()
         * @see #getBETYPE()
         * @see #setBETYPE(BETYPEType1)
         * @generated
         */
        boolean isSetBETYPE();

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
         * @see gov.loc.mets.MetsPackage#getFileType_CHECKSUM()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='CHECKSUM'"
         * @generated
         */
        String getCHECKSUM();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getCHECKSUM <em>CHECKSUM</em>}' attribute.
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
         * @see gov.loc.mets.MetsPackage#getFileType_CHECKSUMTYPE()
         * @model unsettable="true"
         *        extendedMetaData="kind='attribute' name='CHECKSUMTYPE'"
         * @generated
         */
        CHECKSUMTYPEType getCHECKSUMTYPE();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}' attribute.
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
         * Unsets the value of the '{@link gov.loc.mets.FileType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetCHECKSUMTYPE()
         * @see #getCHECKSUMTYPE()
         * @see #setCHECKSUMTYPE(CHECKSUMTYPEType)
         * @generated
         */
        void unsetCHECKSUMTYPE();

        /**
         * Returns whether the value of the '{@link gov.loc.mets.FileType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}' attribute is set.
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
         * @see gov.loc.mets.MetsPackage#getFileType_CREATED()
         * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
         *        extendedMetaData="kind='attribute' name='CREATED'"
         * @generated
         */
        XMLGregorianCalendar getCREATED();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getCREATED <em>CREATED</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>CREATED</em>' attribute.
         * @see #getCREATED()
         * @generated
         */
        void setCREATED(XMLGregorianCalendar value);

        /**
         * Returns the value of the '<em><b>DMDID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * DMDID (IDREFS/O): Contains the ID attribute values identifying the &lt;dmdSec&gt;, elements in the METS document that contain or link to descriptive metadata pertaining to the content file represented by the current &lt;file&gt; element.  For more information on using METS IDREFS and IDREF type attributes for internal linking, see Chapter 4 of the METS Primer.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>DMDID</em>' attribute.
         * @see #setDMDID(List)
         * @see gov.loc.mets.MetsPackage#getFileType_DMDID()
         * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
         *        extendedMetaData="kind='attribute' name='DMDID'"
         * @generated
         */
        List<String> getDMDID();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getDMDID <em>DMDID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>DMDID</em>' attribute.
         * @see #getDMDID()
         * @generated
         */
        void setDMDID(List<String> value);

        /**
         * Returns the value of the '<em><b>END</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * END (string/O): An attribute that specifies the point in the parent &lt;file&gt; where the current, nested &lt;file&gt; ends. It can only be interpreted meaningfully in conjunction with the BETYPE, which specifies the kind of ending point values being used. Typically the END attribute would only appear in conjunction with a BEGIN attribute.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>END</em>' attribute.
         * @see #setEND(String)
         * @see gov.loc.mets.MetsPackage#getFileType_END()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='END'"
         * @generated
         */
        String getEND();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getEND <em>END</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>END</em>' attribute.
         * @see #getEND()
         * @generated
         */
        void setEND(String value);

        /**
         * Returns the value of the '<em><b>GROUPID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * GROUPID (string/O): An identifier that establishes a correspondence between this file and files in other file groups. Typically, this will be used to associate a master file in one file group with the derivative files made from it in other file groups.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>GROUPID</em>' attribute.
         * @see #setGROUPID(String)
         * @see gov.loc.mets.MetsPackage#getFileType_GROUPID()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='GROUPID'"
         * @generated
         */
        String getGROUPID();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getGROUPID <em>GROUPID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>GROUPID</em>' attribute.
         * @see #getGROUPID()
         * @generated
         */
        void setGROUPID(String value);

        /**
         * Returns the value of the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * ID (ID/R): This attribute uniquely identifies the element within the METS document, and would allow the element to be referenced unambiguously from another element or document via an IDREF or an XPTR. Typically, the ID attribute value on a &lt;file&gt; element would be referenced from one or more FILEID attributes (which are of type IDREF) on &lt;fptr&gt;and/or &lt;area&gt; elements within the &lt;structMap&gt;.  Such references establish links between  structural divisions (&lt;div&gt; elements) and the specific content files or parts of content files that manifest them. For more information on using ID attributes for internal and external linking see Chapter 4 of the METS Primer.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>ID</em>' attribute.
         * @see #setID(String)
         * @see gov.loc.mets.MetsPackage#getFileType_ID()
         * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
         *        extendedMetaData="kind='attribute' name='ID'"
         * @generated
         */
        String getID();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getID <em>ID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ID</em>' attribute.
         * @see #getID()
         * @generated
         */
        void setID(String value);

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
         * @see gov.loc.mets.MetsPackage#getFileType_MIMETYPE()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='MIMETYPE'"
         * @generated
         */
        String getMIMETYPE();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getMIMETYPE <em>MIMETYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>MIMETYPE</em>' attribute.
         * @see #getMIMETYPE()
         * @generated
         */
        void setMIMETYPE(String value);

        /**
         * Returns the value of the '<em><b>OWNERID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * OWNERID (string/O): A unique identifier assigned to the file by its owner.  This may be a URI which differs from the URI used to retrieve the file.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>OWNERID</em>' attribute.
         * @see #setOWNERID(String)
         * @see gov.loc.mets.MetsPackage#getFileType_OWNERID()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='OWNERID'"
         * @generated
         */
        String getOWNERID();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getOWNERID <em>OWNERID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>OWNERID</em>' attribute.
         * @see #getOWNERID()
         * @generated
         */
        void setOWNERID(String value);

        /**
         * Returns the value of the '<em><b>SEQ</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * SEQ (integer/O): Indicates the sequence of this &lt;file&gt; relative to the others in its &lt;fileGrp&gt;.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>SEQ</em>' attribute.
         * @see #isSetSEQ()
         * @see #unsetSEQ()
         * @see #setSEQ(int)
         * @see gov.loc.mets.MetsPackage#getFileType_SEQ()
         * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
         *        extendedMetaData="kind='attribute' name='SEQ'"
         * @generated
         */
        int getSEQ();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getSEQ <em>SEQ</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>SEQ</em>' attribute.
         * @see #isSetSEQ()
         * @see #unsetSEQ()
         * @see #getSEQ()
         * @generated
         */
        void setSEQ(int value);

        /**
         * Unsets the value of the '{@link gov.loc.mets.FileType#getSEQ <em>SEQ</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetSEQ()
         * @see #getSEQ()
         * @see #setSEQ(int)
         * @generated
         */
        void unsetSEQ();

        /**
         * Returns whether the value of the '{@link gov.loc.mets.FileType#getSEQ <em>SEQ</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>SEQ</em>' attribute is set.
         * @see #unsetSEQ()
         * @see #getSEQ()
         * @see #setSEQ(int)
         * @generated
         */
        boolean isSetSEQ();

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
         * @see gov.loc.mets.MetsPackage#getFileType_SIZE()
         * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
         *        extendedMetaData="kind='attribute' name='SIZE'"
         * @generated
         */
        long getSIZE();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getSIZE <em>SIZE</em>}' attribute.
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
         * Unsets the value of the '{@link gov.loc.mets.FileType#getSIZE <em>SIZE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetSIZE()
         * @see #getSIZE()
         * @see #setSIZE(long)
         * @generated
         */
        void unsetSIZE();

        /**
         * Returns whether the value of the '{@link gov.loc.mets.FileType#getSIZE <em>SIZE</em>}' attribute is set.
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
         * Returns the value of the '<em><b>USE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * USE (string/O): A tagging attribute to indicate the intended use of all copies of the file aggregated by the &lt;file&gt; element (e.g., master, reference, thumbnails for image files). A USE attribute can be expressed at the&lt;fileGrp&gt; level, the &lt;file&gt; level, the &lt;FLocat&gt; level and/or the &lt;FContent&gt; level.  A USE attribute value at the &lt;fileGrp&gt; level should pertain to all of the files in the &lt;fileGrp&gt;.  A USE attribute at the &lt;file&gt; level should pertain to all copies of the file as represented by subsidiary &lt;FLocat&gt; and/or &lt;FContent&gt; elements.  A USE attribute at the &lt;FLocat&gt; or &lt;FContent&gt; level pertains to the particular copy of the file that is either referenced (&lt;FLocat&gt;) or wrapped (&lt;FContent&gt;).
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>USE</em>' attribute.
         * @see #setUSE(String)
         * @see gov.loc.mets.MetsPackage#getFileType_USE()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='USE'"
         * @generated
         */
        String getUSE();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileType#getUSE <em>USE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>USE</em>' attribute.
         * @see #getUSE()
         * @generated
         */
        void setUSE(String value);

} // FileType
