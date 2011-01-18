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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Md Sec Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * mdSecType: Complex Type for Metadata Sections
 * 			A generic framework for pointing to/including metadata within a METS document, a la Warwick Framework.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.MdSecType#getMdRef <em>Md Ref</em>}</li>
 *   <li>{@link gov.loc.mets.MdSecType#getMdWrap <em>Md Wrap</em>}</li>
 *   <li>{@link gov.loc.mets.MdSecType#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.MdSecType#getCREATED <em>CREATED</em>}</li>
 *   <li>{@link gov.loc.mets.MdSecType#getGROUPID <em>GROUPID</em>}</li>
 *   <li>{@link gov.loc.mets.MdSecType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.MdSecType#getSTATUS <em>STATUS</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getMdSecType()
 * @model extendedMetaData="name='mdSecType' kind='elementOnly'"
 * @generated
 */
public interface MdSecType extends EObject {
        /**
         * Returns the value of the '<em><b>Md Ref</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 						The metadata reference element &lt;mdRef&gt; element is a generic element used throughout the METS schema to provide a pointer to metadata which resides outside the METS document.  NB: &lt;mdRef&gt; is an empty element.  The location of the metadata must be recorded in the xlink:href attribute, supplemented by the XPTR attribute as needed.
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>Md Ref</em>' containment reference.
         * @see #setMdRef(MdRefType)
         * @see gov.loc.mets.MetsPackage#getMdSecType_MdRef()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='mdRef' namespace='##targetNamespace'"
         * @generated
         */
        MdRefType getMdRef();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdSecType#getMdRef <em>Md Ref</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Md Ref</em>' containment reference.
         * @see #getMdRef()
         * @generated
         */
        void setMdRef(MdRefType value);

        /**
         * Returns the value of the '<em><b>Md Wrap</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 						A metadata wrapper element &lt;mdWrap&gt; provides a wrapper around metadata embedded within a METS document. The element is repeatable. Such metadata can be in one of two forms: 1) XML-encoded metadata, with the XML-encoding identifying itself as belonging to a namespace other than the METS document namespace. 2) Any arbitrary binary or textual form, PROVIDED that the metadata is Base64 encoded and wrapped in a &lt;binData&gt; element within the internal descriptive metadata element.
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>Md Wrap</em>' containment reference.
         * @see #setMdWrap(MdWrapType)
         * @see gov.loc.mets.MetsPackage#getMdSecType_MdWrap()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='mdWrap' namespace='##targetNamespace'"
         * @generated
         */
        MdWrapType getMdWrap();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdSecType#getMdWrap <em>Md Wrap</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Md Wrap</em>' containment reference.
         * @see #getMdWrap()
         * @generated
         */
        void setMdWrap(MdWrapType value);

        /**
         * Returns the value of the '<em><b>ADMID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * ADMID (IDREFS/O): Contains the ID attribute values of the &lt;digiprovMD&gt;, &lt;techMD&gt;, &lt;sourceMD&gt; and/or &lt;rightsMD&gt; elements within the &lt;amdSec&gt; of the METS document that contain administrative metadata pertaining to the current mdSecType element. Typically used in this context to reference preservation metadata (digiprovMD) which applies to the current metadata. For more information on using METS IDREFS and IDREF type attributes for internal linking, see Chapter 4 of the METS Primer.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>ADMID</em>' attribute.
         * @see #setADMID(List)
         * @see gov.loc.mets.MetsPackage#getMdSecType_ADMID()
         * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
         *        extendedMetaData="kind='attribute' name='ADMID'"
         * @generated
         */
        List<String> getADMID();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdSecType#getADMID <em>ADMID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ADMID</em>' attribute.
         * @see #getADMID()
         * @generated
         */
        void setADMID(List<String> value);

        /**
         * Returns the value of the '<em><b>CREATED</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * CREATED (dateTime/O): Specifies the date and time of creation for the metadata.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>CREATED</em>' attribute.
         * @see #setCREATED(XMLGregorianCalendar)
         * @see gov.loc.mets.MetsPackage#getMdSecType_CREATED()
         * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
         *        extendedMetaData="kind='attribute' name='CREATED'"
         * @generated
         */
        XMLGregorianCalendar getCREATED();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdSecType#getCREATED <em>CREATED</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>CREATED</em>' attribute.
         * @see #getCREATED()
         * @generated
         */
        void setCREATED(XMLGregorianCalendar value);

        /**
         * Returns the value of the '<em><b>GROUPID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * GROUPID (string/O): This identifier is used to indicate that different metadata sections may be considered as part of a group. Two metadata sections with the same GROUPID value are to be considered part of the same group. For example this facility might be used to group changed versions of the same metadata if previous versions are maintained in a file for tracking purposes.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>GROUPID</em>' attribute.
         * @see #setGROUPID(String)
         * @see gov.loc.mets.MetsPackage#getMdSecType_GROUPID()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='GROUPID'"
         * @generated
         */
        String getGROUPID();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdSecType#getGROUPID <em>GROUPID</em>}' attribute.
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
         * ID (ID/R): This attribute uniquely identifies the element within the METS document, and would allow the element to be referenced unambiguously from another element or document via an IDREF or an XPTR. The ID attribute on the &lt;dmdSec&gt;, &lt;techMD&gt;, &lt;sourceMD&gt;, &lt;rightsMD&gt; and &lt;digiprovMD&gt; elements (which are all of mdSecType) is required, and its value should be referenced from one or more DMDID attributes (when the ID identifies a &lt;dmdSec&gt; element) or ADMID attributes (when the ID identifies a &lt;techMD&gt;, &lt;sourceMD&gt;, &lt;rightsMD&gt; or &lt;digiprovMD&gt; element) that are associated with other elements in the METS document. The following elements support references to a &lt;dmdSec&gt; via a DMDID attribute: &lt;file&gt;, &lt;stream&gt;, &lt;div&gt;.  The following elements support references to &lt;techMD&gt;, &lt;sourceMD&gt;, &lt;rightsMD&gt; and &lt;digiprovMD&gt; elements via an ADMID attribute: &lt;metsHdr&gt;, &lt;dmdSec&gt;, &lt;techMD&gt;, &lt;sourceMD&gt;, &lt;rightsMD&gt;, &lt;digiprovMD&gt;, &lt;fileGrp&gt;, &lt;file&gt;, &lt;stream&gt;, &lt;div&gt;, &lt;area&gt;, &lt;behavior&gt;. For more information on using ID attributes for internal and external linking see Chapter 4 of the METS Primer.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>ID</em>' attribute.
         * @see #setID(String)
         * @see gov.loc.mets.MetsPackage#getMdSecType_ID()
         * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
         *        extendedMetaData="kind='attribute' name='ID'"
         * @generated
         */
        String getID();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdSecType#getID <em>ID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ID</em>' attribute.
         * @see #getID()
         * @generated
         */
        void setID(String value);

        /**
         * Returns the value of the '<em><b>STATUS</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * STATUS (string/O): Indicates the status of this metadata (e.g., superseded, current, etc.).
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>STATUS</em>' attribute.
         * @see #setSTATUS(String)
         * @see gov.loc.mets.MetsPackage#getMdSecType_STATUS()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='STATUS'"
         * @generated
         */
        String getSTATUS();

        /**
         * Sets the value of the '{@link gov.loc.mets.MdSecType#getSTATUS <em>STATUS</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>STATUS</em>' attribute.
         * @see #getSTATUS()
         * @generated
         */
        void setSTATUS(String value);

} // MdSecType
