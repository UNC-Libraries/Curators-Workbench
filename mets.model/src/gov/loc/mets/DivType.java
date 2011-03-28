/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Div Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * divType: Complex Type for Divisions
 * 					The METS standard represents a document structurally as a series of nested div elements, that is, as a hierarchy (e.g., a book, which is composed of chapters, which are composed of subchapters, which are composed of text).  Every div node in the structural map hierarchy may be connected (via subsidiary mptr or fptr elements) to content files which represent that div's portion of the whole document.
 * 
 * SPECIAL NOTE REGARDING DIV ATTRIBUTE VALUES:
 * to clarify the differences between the ORDER, ORDERLABEL, and LABEL attributes for the &lt;div&gt; element, imagine a text with 10 roman numbered pages followed by 10 arabic numbered pages. Page iii would have an ORDER of "3", an ORDERLABEL of "iii" and a LABEL of "Page iii", while page 3 would have an ORDER of "13", an ORDERLABEL of "3" and a LABEL of "Page 3".
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.DivType#getMptr <em>Mptr</em>}</li>
 *   <li>{@link gov.loc.mets.DivType#getFptr <em>Fptr</em>}</li>
 *   <li>{@link gov.loc.mets.DivType#getDiv <em>Div</em>}</li>
 *   <li>{@link gov.loc.mets.DivType#getAmdSec <em>Amd Sec</em>}</li>
 *   <li>{@link gov.loc.mets.DivType#getCONTENTIDS <em>CONTENTIDS</em>}</li>
 *   <li>{@link gov.loc.mets.DivType#getDmdSec <em>Dmd Sec</em>}</li>
 *   <li>{@link gov.loc.mets.DivType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.DivType#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.loc.mets.DivType#getLABEL1 <em>LABEL1</em>}</li>
 *   <li>{@link gov.loc.mets.DivType#getORDER <em>ORDER</em>}</li>
 *   <li>{@link gov.loc.mets.DivType#getORDERLABEL <em>ORDERLABEL</em>}</li>
 *   <li>{@link gov.loc.mets.DivType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getDivType()
 * @model extendedMetaData="name='divType' kind='elementOnly'"
 * @generated
 */
public interface DivType extends EObject {
        /**
         * Returns the value of the '<em><b>Mptr</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.MptrType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 						Like the &lt;fptr&gt; element, the METS pointer element &lt;mptr&gt; represents digital content that manifests its parent &lt;div&gt; element. Unlike the &lt;fptr&gt;, which either directly or indirectly points to content represented in the &lt;fileSec&gt; of the parent METS document, the &lt;mptr&gt; element points to content represented by an external METS document. Thus, this element allows multiple discrete and separate METS documents to be organized at a higher level by a separate METS document. For example, METS documents representing the individual issues in the series of a journal could be grouped together and organized by a higher level METS document that represents the entire journal series. Each of the &lt;div&gt; elements in the &lt;structMap&gt; of the METS document representing the journal series would point to a METS document representing an issue.  It would do so via a child &lt;mptr&gt; element. Thus the &lt;mptr&gt; element gives METS users considerable flexibility in managing the depth of the &lt;structMap&gt; hierarchy of individual METS documents. The &lt;mptr&gt; element points to an external METS document by means of an xlink:href attribute and associated XLink attributes. 								
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>Mptr</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getDivType_Mptr()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='mptr' namespace='##targetNamespace'"
         * @generated
         */
        EList<MptrType> getMptr();

        /**
         * Returns the value of the '<em><b>Fptr</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.FptrType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 						The &lt;fptr&gt; or file pointer element represents digital content that manifests its parent &lt;div&gt; element. The content represented by an &lt;fptr&gt; element must consist of integral files or parts of files that are represented by &lt;file&gt; elements in the &lt;fileSec&gt;. Via its FILEID attribute,  an &lt;fptr&gt; may point directly to a single integral &lt;file&gt; element that manifests a structural division. However, an &lt;fptr&gt; element may also govern an &lt;area&gt; element,  a &lt;par&gt;, or  a &lt;seq&gt;  which in turn would point to the relevant file or files. A child &lt;area&gt; element can point to part of a &lt;file&gt; that manifests a division, while the &lt;par&gt; and &lt;seq&gt; elements can point to multiple files or parts of files that together manifest a division. More than one &lt;fptr&gt; element can be associated with a &lt;div&gt; element. Typically sibling &lt;fptr&gt; elements represent alternative versions, or manifestations, of the same content
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>Fptr</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getDivType_Fptr()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='fptr' namespace='##targetNamespace'"
         * @generated
         */
        EList<FptrType> getFptr();

        /**
         * Returns the value of the '<em><b>Div</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.DivType}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Div</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Div</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getDivType_Div()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='div' namespace='##targetNamespace'"
         * @generated
         */
        EList<DivType> getDiv();

        /**
         * Returns the value of the '<em><b>Amd Sec</b></em>' reference list.
         * The list contents are of type {@link gov.loc.mets.AmdSecType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * ADMID (IDREFS/O): Contains the ID attribute values identifying the &lt;rightsMD&gt;, &lt;sourceMD&gt;, &lt;techMD&gt; and/or &lt;digiprovMD&gt; elements within the &lt;amdSec&gt; of the METS document that contain or link to administrative metadata pertaining to the structural division represented by the &lt;div&gt; element. Typically the &lt;div&gt; ADMID attribute would be used to identify the &lt;rightsMD&gt; element or elements that pertain to the &lt;div&gt;, but it could be used anytime there was a need to link a &lt;div&gt; with pertinent administrative metadata. For more information on using METS IDREFS and IDREF type attributes for internal linking, see Chapter 4 of the METS Primer.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>Amd Sec</em>' reference list.
         * @see gov.loc.mets.MetsPackage#getDivType_AmdSec()
         * @model resolveProxies="false"
         *        extendedMetaData="kind='attribute' name='ADMID'"
         * @generated
         */
        EList<AmdSecType> getAmdSec();

        /**
         * Returns the value of the '<em><b>CONTENTIDS</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * CONTENTIDS (URI/O): Content IDs for the content represented by the &lt;div&gt; (equivalent to DIDL DII or Digital Item Identifier, a unique external ID).
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>CONTENTIDS</em>' attribute.
         * @see #setCONTENTIDS(List)
         * @see gov.loc.mets.MetsPackage#getDivType_CONTENTIDS()
         * @model dataType="gov.loc.mets.URIs" many="false"
         *        extendedMetaData="kind='attribute' name='CONTENTIDS'"
         * @generated
         */
        List<String> getCONTENTIDS();

        /**
         * Sets the value of the '{@link gov.loc.mets.DivType#getCONTENTIDS <em>CONTENTIDS</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>CONTENTIDS</em>' attribute.
         * @see #getCONTENTIDS()
         * @generated
         */
        void setCONTENTIDS(List<String> value);

        /**
         * Returns the value of the '<em><b>Dmd Sec</b></em>' reference list.
         * The list contents are of type {@link gov.loc.mets.MdSecType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * DMDID (IDREFS/O): Contains the ID attribute values identifying the &lt;dmdSec&gt;, elements in the METS document that contain or link to descriptive metadata pertaining to the structural division represented by the current &lt;div&gt; element.  For more information on using METS IDREFS and IDREF type attributes for internal linking, see Chapter 4 of the METS Primer.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>Dmd Sec</em>' reference list.
         * @see gov.loc.mets.MetsPackage#getDivType_DmdSec()
         * @model resolveProxies="false"
         *        extendedMetaData="kind='attribute' name='DMDID'"
         * @generated
         */
        EList<MdSecType> getDmdSec();

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
         * @see gov.loc.mets.MetsPackage#getDivType_ID()
         * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
         *        extendedMetaData="kind='attribute' name='ID'"
         * @generated
         */
        String getID();

        /**
         * Sets the value of the '{@link gov.loc.mets.DivType#getID <em>ID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ID</em>' attribute.
         * @see #getID()
         * @generated
         */
        void setID(String value);

        /**
         * Returns the value of the '<em><b>Label</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * xlink:label - an xlink label to be referred to by an smLink element
         * <!-- end-model-doc -->
         * @return the value of the '<em>Label</em>' attribute.
         * @see #setLabel(String)
         * @see gov.loc.mets.MetsPackage#getDivType_Label()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='label' namespace='http://www.w3.org/1999/xlink'"
         * @generated
         */
        String getLabel();

        /**
         * Sets the value of the '{@link gov.loc.mets.DivType#getLabel <em>Label</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Label</em>' attribute.
         * @see #getLabel()
         * @generated
         */
        void setLabel(String value);

        /**
         * Returns the value of the '<em><b>LABEL1</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * LABEL (string/O): An attribute used, for example, to identify a &lt;div&gt; to an end user viewing the document. Thus a hierarchical arrangement of the &lt;div&gt; LABEL values could provide a table of contents to the digital content represented by a METS document and facilitate the users’ navigation of the digital object. Note that a &lt;div&gt; LABEL should be specific to its level in the structural map. In the case of a book with chapters, the book &lt;div&gt; LABEL should have the book title and the chapter &lt;div&gt;; LABELs should have the individual chapter titles, rather than having the chapter &lt;div&gt; LABELs combine both book title and chapter title . For further of the distinction between LABEL and ORDERLABEL see the description of the ORDERLABEL attribute.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>LABEL1</em>' attribute.
         * @see #setLABEL1(String)
         * @see gov.loc.mets.MetsPackage#getDivType_LABEL1()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='LABEL'"
         * @generated
         */
        String getLABEL1();

        /**
         * Sets the value of the '{@link gov.loc.mets.DivType#getLABEL1 <em>LABEL1</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>LABEL1</em>' attribute.
         * @see #getLABEL1()
         * @generated
         */
        void setLABEL1(String value);

        /**
         * Returns the value of the '<em><b>ORDER</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * ORDER (integer/O): A representation of the div's order among its siblings (e.g., its absolute, numeric sequence). For an example, and clarification of the distinction between ORDER and ORDERLABEL, see the description of the ORDERLABEL attribute.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>ORDER</em>' attribute.
         * @see #setORDER(BigInteger)
         * @see gov.loc.mets.MetsPackage#getDivType_ORDER()
         * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
         *        extendedMetaData="kind='attribute' name='ORDER'"
         * @generated
         */
        BigInteger getORDER();

        /**
         * Sets the value of the '{@link gov.loc.mets.DivType#getORDER <em>ORDER</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ORDER</em>' attribute.
         * @see #getORDER()
         * @generated
         */
        void setORDER(BigInteger value);

        /**
         * Returns the value of the '<em><b>ORDERLABEL</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * ORDERLABEL (string/O): A representation of the div's order among its siblings (e.g., “xii”), or of any non-integer native numbering system. It is presumed that this value will still be machine actionable (e.g., it would support ‘go to page ___’ function), and it should not be used as a replacement/substitute for the LABEL attribute. To understand the differences between ORDER, ORDERLABEL and LABEL, imagine a text with 10 roman numbered pages followed by 10 arabic numbered pages. Page iii would have an ORDER of “3”, an ORDERLABEL of “iii” and a LABEL of “Page iii”, while page 3 would have an ORDER of “13”, an ORDERLABEL of “3” and a LABEL of “Page 3”.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>ORDERLABEL</em>' attribute.
         * @see #setORDERLABEL(String)
         * @see gov.loc.mets.MetsPackage#getDivType_ORDERLABEL()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='ORDERLABEL'"
         * @generated
         */
        String getORDERLABEL();

        /**
         * Sets the value of the '{@link gov.loc.mets.DivType#getORDERLABEL <em>ORDERLABEL</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ORDERLABEL</em>' attribute.
         * @see #getORDERLABEL()
         * @generated
         */
        void setORDERLABEL(String value);

        /**
         * Returns the value of the '<em><b>TYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * TYPE (string/O): An attribute that specifies the type of structural division that the &lt;div&gt; element represents. Possible &lt;div&gt; TYPE attribute values include: chapter, article, page, track, segment, section etc. METS places no constraints on the possible TYPE values. Suggestions for controlled vocabularies for TYPE may be found on the METS website.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>TYPE</em>' attribute.
         * @see #setTYPE(String)
         * @see gov.loc.mets.MetsPackage#getDivType_TYPE()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='TYPE'"
         * @generated
         */
        String getTYPE();

        /**
         * Sets the value of the '{@link gov.loc.mets.DivType#getTYPE <em>TYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>TYPE</em>' attribute.
         * @see #getTYPE()
         * @generated
         */
        void setTYPE(String value);

} // DivType
