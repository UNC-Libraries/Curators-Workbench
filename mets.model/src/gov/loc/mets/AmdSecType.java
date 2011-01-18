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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Amd Sec Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * amdSecType: Complex Type for Administrative Metadata Sections
 * 			The administrative metadata section consists of four possible subsidiary sections: techMD (technical metadata for text/image/audio/video files), rightsMD (intellectual property rights metadata), sourceMD (analog/digital source metadata), and digiprovMD (digital provenance metadata, that is, the history of migrations/translations performed on a digital library object from it's original digital capture/encoding).
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.AmdSecType#getTechMD <em>Tech MD</em>}</li>
 *   <li>{@link gov.loc.mets.AmdSecType#getRightsMD <em>Rights MD</em>}</li>
 *   <li>{@link gov.loc.mets.AmdSecType#getSourceMD <em>Source MD</em>}</li>
 *   <li>{@link gov.loc.mets.AmdSecType#getDigiprovMD <em>Digiprov MD</em>}</li>
 *   <li>{@link gov.loc.mets.AmdSecType#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getAmdSecType()
 * @model extendedMetaData="name='amdSecType' kind='elementOnly'"
 * @generated
 */
public interface AmdSecType extends EObject {
        /**
         * Returns the value of the '<em><b>Tech MD</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.MdSecType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 						A technical metadata element &lt;techMD&gt; records technical metadata about a component of the METS object, such as a digital content file. The &lt;techMD&gt; element conforms to same generic datatype as the &lt;dmdSec&gt;, &lt;rightsMD&gt;, &lt;sourceMD&gt; and &lt;digiprovMD&gt; elements, and supports the same sub-elements and attributes.  A technical metadata element can either wrap the metadata  (mdWrap) or reference it in an external location (mdRef) or both.  METS allows multiple &lt;techMD&gt; elements; and technical metadata can be associated with any METS element that supports an ADMID attribute. Technical metadata can be expressed according to many current technical description standards (such as MIX and textMD) or a locally produced XML schema.
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>Tech MD</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getAmdSecType_TechMD()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='techMD' namespace='##targetNamespace'"
         * @generated
         */
        EList<MdSecType> getTechMD();

        /**
         * Returns the value of the '<em><b>Rights MD</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.MdSecType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 						An intellectual property rights metadata element &lt;rightsMD&gt; records information about copyright and licensing pertaining to a component of the METS object. The &lt;rightsMD&gt; element conforms to same generic datatype as the &lt;dmdSec&gt;, &lt;techMD&gt;, &lt;sourceMD&gt; and &lt;digiprovMD&gt; elements, and supports the same sub-elements and attributes. A rights metadata element can either wrap the metadata  (mdWrap) or reference it in an external location (mdRef) or both.  METS allows multiple &lt;rightsMD&gt; elements; and rights metadata can be associated with any METS element that supports an ADMID attribute. Rights metadata can be expressed according current rights description standards (such as CopyrightMD and rightsDeclarationMD) or a locally produced XML schema.
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>Rights MD</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getAmdSecType_RightsMD()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='rightsMD' namespace='##targetNamespace'"
         * @generated
         */
        EList<MdSecType> getRightsMD();

        /**
         * Returns the value of the '<em><b>Source MD</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.MdSecType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 						A source metadata element &lt;sourceMD&gt; records descriptive and administrative metadata about the source format or media of a component of the METS object such as a digital content file. It is often used for discovery, data administration or preservation of the digital object. The &lt;sourceMD&gt; element conforms to same generic datatype as the &lt;dmdSec&gt;, &lt;techMD&gt;, &lt;rightsMD&gt;,  and &lt;digiprovMD&gt; elements, and supports the same sub-elements and attributes.  A source metadata element can either wrap the metadata  (mdWrap) or reference it in an external location (mdRef) or both.  METS allows multiple &lt;sourceMD&gt; elements; and source metadata can be associated with any METS element that supports an ADMID attribute. Source metadata can be expressed according to current source description standards (such as PREMIS) or a locally produced XML schema.
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>Source MD</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getAmdSecType_SourceMD()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='sourceMD' namespace='##targetNamespace'"
         * @generated
         */
        EList<MdSecType> getSourceMD();

        /**
         * Returns the value of the '<em><b>Digiprov MD</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.MdSecType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 						A digital provenance metadata element &lt;digiprovMD&gt; can be used to record any preservation-related actions taken on the various files which comprise a digital object (e.g., those subsequent to the initial digitization of the files such as transformation or migrations) or, in the case of born digital materials, the files’ creation. In short, digital provenance should be used to record information that allows both archival/library staff and scholars to understand what modifications have been made to a digital object and/or its constituent parts during its life cycle. This information can then be used to judge how those processes might have altered or corrupted the object’s ability to accurately represent the original item. One might, for example, record master derivative relationships and the process by which those derivations have been created. Or the &lt;digiprovMD&gt; element could contain information regarding the migration/transformation of a file from its original digitization (e.g., OCR, TEI, etc.,)to its current incarnation as a digital object (e.g., JPEG2000). The &lt;digiprovMD&gt; element conforms to same generic datatype as the &lt;dmdSec&gt;,  &lt;techMD&gt;, &lt;rightsMD&gt;, and &lt;sourceMD&gt; elements, and supports the same sub-elements and attributes. A digital provenance metadata element can either wrap the metadata  (mdWrap) or reference it in an external location (mdRef) or both.  METS allows multiple &lt;digiprovMD&gt; elements; and digital provenance metadata can be associated with any METS element that supports an ADMID attribute. Digital provenance metadata can be expressed according to current digital provenance description standards (such as PREMIS) or a locally produced XML schema.
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>Digiprov MD</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getAmdSecType_DigiprovMD()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='digiprovMD' namespace='##targetNamespace'"
         * @generated
         */
        EList<MdSecType> getDigiprovMD();

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
         * @see gov.loc.mets.MetsPackage#getAmdSecType_ID()
         * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
         *        extendedMetaData="kind='attribute' name='ID'"
         * @generated
         */
        String getID();

        /**
         * Sets the value of the '{@link gov.loc.mets.AmdSecType#getID <em>ID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ID</em>' attribute.
         * @see #getID()
         * @generated
         */
        void setID(String value);

} // AmdSecType
