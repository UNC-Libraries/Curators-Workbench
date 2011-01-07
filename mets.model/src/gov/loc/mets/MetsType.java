/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * metsType: Complex Type for METS Sections
 * 			A METS document consists of seven possible subsidiary sections: metsHdr (METS document header), dmdSec (descriptive metadata section), amdSec (administrative metadata section), fileGrp (file inventory group), structLink (structural map linking), structMap (structural map) and behaviorSec (behaviors section).
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.MetsType#getMetsHdr <em>Mets Hdr</em>}</li>
 *   <li>{@link gov.loc.mets.MetsType#getDmdSec <em>Dmd Sec</em>}</li>
 *   <li>{@link gov.loc.mets.MetsType#getAmdSec <em>Amd Sec</em>}</li>
 *   <li>{@link gov.loc.mets.MetsType#getFileSec <em>File Sec</em>}</li>
 *   <li>{@link gov.loc.mets.MetsType#getStructMap <em>Struct Map</em>}</li>
 *   <li>{@link gov.loc.mets.MetsType#getStructLink <em>Struct Link</em>}</li>
 *   <li>{@link gov.loc.mets.MetsType#getBehaviorSec <em>Behavior Sec</em>}</li>
 *   <li>{@link gov.loc.mets.MetsType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.MetsType#getLABEL <em>LABEL</em>}</li>
 *   <li>{@link gov.loc.mets.MetsType#getOBJID <em>OBJID</em>}</li>
 *   <li>{@link gov.loc.mets.MetsType#getPROFILE <em>PROFILE</em>}</li>
 *   <li>{@link gov.loc.mets.MetsType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getMetsType()
 * @model extendedMetaData="name='metsType' kind='elementOnly'"
 * @generated
 */
public interface MetsType extends EObject {
        /**
         * Returns the value of the '<em><b>Mets Hdr</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 					The mets header element &lt;metsHdr&gt; captures metadata about the METS document itself, not the digital object the METS document encodes. Although it records a more limited set of metadata, it is very similar in function and purpose to the headers employed in other schema such as the Text Encoding Initiative (TEI) or in the Encoded Archival Description (EAD).
         * 			
         * <!-- end-model-doc -->
         * @return the value of the '<em>Mets Hdr</em>' containment reference.
         * @see #setMetsHdr(MetsHdrType)
         * @see gov.loc.mets.MetsPackage#getMetsType_MetsHdr()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='metsHdr' namespace='##targetNamespace'"
         * @generated
         */
        MetsHdrType getMetsHdr();

        /**
         * Sets the value of the '{@link gov.loc.mets.MetsType#getMetsHdr <em>Mets Hdr</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Mets Hdr</em>' containment reference.
         * @see #getMetsHdr()
         * @generated
         */
        void setMetsHdr(MetsHdrType value);

        /**
         * Returns the value of the '<em><b>Dmd Sec</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.MdSecType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 						A descriptive metadata section &lt;dmdSec&gt; records descriptive metadata pertaining to the METS object as a whole or one of its components. The &lt;dmdSec&gt; element conforms to same generic datatype as the &lt;techMD&gt;, &lt;rightsMD&gt;, &lt;sourceMD&gt; and &lt;digiprovMD&gt; elements, and supports the same sub-elements and attributes. A descriptive metadata element can either wrap the metadata  (mdWrap) or reference it in an external location (mdRef) or both.  METS allows multiple &lt;dmdSec&gt; elements; and descriptive metadata can be associated with any METS element that supports a DMDID attribute.  Descriptive metadata can be expressed according to many current description standards (i.e., MARC, MODS, Dublin Core, TEI Header, EAD, VRA, FGDC, DDI) or a locally produced XML schema. 
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>Dmd Sec</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getMetsType_DmdSec()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='dmdSec' namespace='##targetNamespace'"
         * @generated
         */
        EList<MdSecType> getDmdSec();

        /**
         * Returns the value of the '<em><b>Amd Sec</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.AmdSecType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 						The administrative metadata section &lt;amdSec&gt; contains the administrative metadata pertaining to the digital object, its components and any original source material from which the digital object is derived. The &lt;amdSec&gt; is separated into four sub-sections that accommodate technical metadata (techMD), intellectual property rights (rightsMD), analog/digital source metadata (sourceMD), and digital provenance metadata (digiprovMD). Each of these subsections can either wrap the metadata  (mdWrap) or reference it in an external location (mdRef) or both. Multiple instances of the &lt;amdSec&gt; element can occur within a METS document and multiple instances of its subsections can occur in one &lt;amdSec&gt; element. This allows considerable flexibility in the structuring of the administrative metadata. METS does not define a vocabulary or syntax for encoding administrative metadata. Administrative metadata can be expressed within the amdSec sub-elements according to many current community defined standards, or locally produced XML schemas. 
         * <!-- end-model-doc -->
         * @return the value of the '<em>Amd Sec</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getMetsType_AmdSec()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='amdSec' namespace='##targetNamespace'"
         * @generated
         */
        EList<AmdSecType> getAmdSec();

        /**
         * Returns the value of the '<em><b>File Sec</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 						The overall purpose of the content file section element &lt;fileSec&gt; is to provide an inventory of and the location for the content files that comprise the digital object being described in the METS document.
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>File Sec</em>' containment reference.
         * @see #setFileSec(FileSecType)
         * @see gov.loc.mets.MetsPackage#getMetsType_FileSec()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='fileSec' namespace='##targetNamespace'"
         * @generated
         */
        FileSecType getFileSec();

        /**
         * Sets the value of the '{@link gov.loc.mets.MetsType#getFileSec <em>File Sec</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>File Sec</em>' containment reference.
         * @see #getFileSec()
         * @generated
         */
        void setFileSec(FileSecType value);

        /**
         * Returns the value of the '<em><b>Struct Map</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.StructMapType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 						The structural map section &lt;structMap&gt; is the heart of a METS document. It provides a means for organizing the digital content represented by the &lt;file&gt; elements in the &lt;fileSec&gt; of the METS document into a coherent hierarchical structure. Such a hierarchical structure can be presented to users to facilitate their comprehension and navigation of the digital content. It can further be applied to any purpose requiring an understanding of the structural relationship of the content files or parts of the content files. The organization may be specified to any level of granularity (intellectual and or physical) that is desired. Since the &lt;structMap&gt; element is repeatable, more than one organization can be applied to the digital content represented by the METS document.  The hierarchical structure specified by a &lt;structMap&gt; is encoded as a tree of nested &lt;div&gt; elements. A &lt;div&gt; element may directly point to content via child file pointer &lt;fptr&gt; elements (if the content is represented in the &lt;fileSec&lt;) or child METS pointer &lt;mptr&gt; elements (if the content is represented by an external METS document). The &lt;fptr&gt; element may point to a single whole &lt;file&gt; element that manifests its parent &lt;div&lt;, or to part of a &lt;file&gt; that manifests its &lt;div&lt;. It can also point to multiple files or parts of files that must be played/displayed either in sequence or in parallel to reveal its structural division. In addition to providing a means for organizing content, the &lt;structMap&gt; provides a mechanism for linking content at any hierarchical level with relevant descriptive and administrative metadata.
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>Struct Map</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getMetsType_StructMap()
         * @model containment="true" required="true"
         *        extendedMetaData="kind='element' name='structMap' namespace='##targetNamespace'"
         * @generated
         */
        EList<StructMapType> getStructMap();

        /**
         * Returns the value of the '<em><b>Struct Link</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 						The structural link section element &lt;structLink&gt; allows for the specification of hyperlinks between the different components of a METS structure that are delineated in a structural map. This element is a container for a single, repeatable element, &lt;smLink&gt; which indicates a hyperlink between two nodes in the structural map. The &lt;structLink&gt; section in the METS document is identified using its XML ID attributes.
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>Struct Link</em>' containment reference.
         * @see #setStructLink(StructLinkType1)
         * @see gov.loc.mets.MetsPackage#getMetsType_StructLink()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='structLink' namespace='##targetNamespace'"
         * @generated
         */
        StructLinkType1 getStructLink();

        /**
         * Sets the value of the '{@link gov.loc.mets.MetsType#getStructLink <em>Struct Link</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Struct Link</em>' containment reference.
         * @see #getStructLink()
         * @generated
         */
        void setStructLink(StructLinkType1 value);

        /**
         * Returns the value of the '<em><b>Behavior Sec</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.BehaviorSecType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 						A behavior section element &lt;behaviorSec&gt; associates executable behaviors with content in the METS document by means of a repeatable behavior &lt;behavior&gt; element. This element has an interface definition &lt;interfaceDef&gt; element that represents an abstract definition of the set of behaviors represented by a particular behavior section. A &lt;behavior&gt; element also has a &lt;mechanism&gt; element which is used to point to a module of executable code that implements and runs the behavior defined by the interface definition. The &lt;behaviorSec&gt; element, which is repeatable as well as nestable, can be used to group individual behaviors within the structure of the METS document. Such grouping can be useful for organizing families of behaviors together or to indicate other relationships between particular behaviors.
         * <!-- end-model-doc -->
         * @return the value of the '<em>Behavior Sec</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getMetsType_BehaviorSec()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='behaviorSec' namespace='##targetNamespace'"
         * @generated
         */
        EList<BehaviorSecType> getBehaviorSec();

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
         * @see gov.loc.mets.MetsPackage#getMetsType_ID()
         * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
         *        extendedMetaData="kind='attribute' name='ID'"
         * @generated
         */
        String getID();

        /**
         * Sets the value of the '{@link gov.loc.mets.MetsType#getID <em>ID</em>}' attribute.
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
         * LABEL (string/O): Is a simple title string used to identify the object/entity being described in the METS document for the user.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>LABEL</em>' attribute.
         * @see #setLABEL(String)
         * @see gov.loc.mets.MetsPackage#getMetsType_LABEL()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='LABEL'"
         * @generated
         */
        String getLABEL();

        /**
         * Sets the value of the '{@link gov.loc.mets.MetsType#getLABEL <em>LABEL</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>LABEL</em>' attribute.
         * @see #getLABEL()
         * @generated
         */
        void setLABEL(String value);

        /**
         * Returns the value of the '<em><b>OBJID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * OBJID (string/O): Is the primary identifier assigned to the METS object as a whole. Although this attribute is not required, it is strongly recommended. This identifier is used to tag the entire METS object to external systems, in contrast with the ID identifier.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>OBJID</em>' attribute.
         * @see #setOBJID(String)
         * @see gov.loc.mets.MetsPackage#getMetsType_OBJID()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='OBJID'"
         * @generated
         */
        String getOBJID();

        /**
         * Sets the value of the '{@link gov.loc.mets.MetsType#getOBJID <em>OBJID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>OBJID</em>' attribute.
         * @see #getOBJID()
         * @generated
         */
        void setOBJID(String value);

        /**
         * Returns the value of the '<em><b>PROFILE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * PROFILE (string/O): Indicates to which of the registered profile(s) the METS document conforms. For additional information about PROFILES see Chapter 5 of the METS Primer.
         * 			
         * <!-- end-model-doc -->
         * @return the value of the '<em>PROFILE</em>' attribute.
         * @see #setPROFILE(String)
         * @see gov.loc.mets.MetsPackage#getMetsType_PROFILE()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='PROFILE'"
         * @generated
         */
        String getPROFILE();

        /**
         * Sets the value of the '{@link gov.loc.mets.MetsType#getPROFILE <em>PROFILE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>PROFILE</em>' attribute.
         * @see #getPROFILE()
         * @generated
         */
        void setPROFILE(String value);

        /**
         * Returns the value of the '<em><b>TYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * TYPE (string/O): Specifies the class or type of the object, e.g.: book, journal, stereograph, dataset, video, etc.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>TYPE</em>' attribute.
         * @see #setTYPE(String)
         * @see gov.loc.mets.MetsPackage#getMetsType_TYPE()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='TYPE'"
         * @generated
         */
        String getTYPE();

        /**
         * Sets the value of the '{@link gov.loc.mets.MetsType#getTYPE <em>TYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>TYPE</em>' attribute.
         * @see #getTYPE()
         * @generated
         */
        void setTYPE(String value);

} // MetsType
