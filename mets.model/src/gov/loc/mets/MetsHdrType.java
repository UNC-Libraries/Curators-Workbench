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
 * A representation of the model object '<em><b>Hdr Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.MetsHdrType#getAgent <em>Agent</em>}</li>
 *   <li>{@link gov.loc.mets.MetsHdrType#getAltRecordID <em>Alt Record ID</em>}</li>
 *   <li>{@link gov.loc.mets.MetsHdrType#getMetsDocumentID <em>Mets Document ID</em>}</li>
 *   <li>{@link gov.loc.mets.MetsHdrType#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.MetsHdrType#getCREATEDATE <em>CREATEDATE</em>}</li>
 *   <li>{@link gov.loc.mets.MetsHdrType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.MetsHdrType#getLASTMODDATE <em>LASTMODDATE</em>}</li>
 *   <li>{@link gov.loc.mets.MetsHdrType#getRECORDSTATUS <em>RECORDSTATUS</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getMetsHdrType()
 * @model extendedMetaData="name='metsHdr_._type' kind='elementOnly'"
 * @generated
 */
public interface MetsHdrType extends EObject {
        /**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mets.AgentType}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * agent: 
	 * 								The agent element &lt;agent&gt; provides for various parties and their roles with respect to the METS record to be documented.  
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see gov.loc.mets.MetsPackage#getMetsHdrType_Agent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='agent' namespace='##targetNamespace'"
	 * @generated
	 */
        EList<AgentType> getAgent();

        /**
	 * Returns the value of the '<em><b>Alt Record ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mets.AltRecordIDType}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *     
	 * 									The alternative record identifier element &lt;altRecordID&gt; allows one to use alternative record identifier values for the digital object represented by the METS document; the primary record identifier is stored in the OBJID attribute in the root &lt;mets&gt; element.
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alt Record ID</em>' containment reference list.
	 * @see gov.loc.mets.MetsPackage#getMetsHdrType_AltRecordID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='altRecordID' namespace='##targetNamespace'"
	 * @generated
	 */
        EList<AltRecordIDType> getAltRecordID();

        /**
	 * Returns the value of the '<em><b>Mets Document ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *     
	 * 									The metsDocument identifier element &lt;metsDocumentID&gt; allows a unique identifier to be assigned to the METS document itself.  This may be different from the OBJID attribute value in the root &lt;mets&gt; element, which uniquely identifies the entire digital object represented by the METS document.
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mets Document ID</em>' containment reference.
	 * @see #setMetsDocumentID(MetsDocumentIDType)
	 * @see gov.loc.mets.MetsPackage#getMetsHdrType_MetsDocumentID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metsDocumentID' namespace='##targetNamespace'"
	 * @generated
	 */
        MetsDocumentIDType getMetsDocumentID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MetsHdrType#getMetsDocumentID <em>Mets Document ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mets Document ID</em>' containment reference.
	 * @see #getMetsDocumentID()
	 * @generated
	 */
        void setMetsDocumentID(MetsDocumentIDType value);

        /**
	 * Returns the value of the '<em><b>ADMID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ADMID (IDREFS/O): Contains the ID attribute values of the &lt;techMD&gt;, &lt;sourceMD&gt;, &lt;rightsMD&gt; and/or &lt;digiprovMD&gt; elements within the &lt;amdSec&gt; of the METS document that contain administrative metadata pertaining to the METS document itself.  For more information on using METS IDREFS and IDREF type attributes for internal linking, see Chapter 4 of the METS Primer.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ADMID</em>' attribute.
	 * @see #setADMID(List)
	 * @see gov.loc.mets.MetsPackage#getMetsHdrType_ADMID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='ADMID'"
	 * @generated
	 */
        List<String> getADMID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MetsHdrType#getADMID <em>ADMID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADMID</em>' attribute.
	 * @see #getADMID()
	 * @generated
	 */
        void setADMID(List<String> value);

        /**
	 * Returns the value of the '<em><b>CREATEDATE</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CREATEDATE (dateTime/O): Records the date/time the METS document was created.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CREATEDATE</em>' attribute.
	 * @see #setCREATEDATE(XMLGregorianCalendar)
	 * @see gov.loc.mets.MetsPackage#getMetsHdrType_CREATEDATE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='CREATEDATE'"
	 * @generated
	 */
        XMLGregorianCalendar getCREATEDATE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MetsHdrType#getCREATEDATE <em>CREATEDATE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATEDATE</em>' attribute.
	 * @see #getCREATEDATE()
	 * @generated
	 */
        void setCREATEDATE(XMLGregorianCalendar value);

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
	 * @see gov.loc.mets.MetsPackage#getMetsHdrType_ID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
        String getID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MetsHdrType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
        void setID(String value);

        /**
	 * Returns the value of the '<em><b>LASTMODDATE</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LASTMODDATE (dateTime/O): Is used to indicate the date/time the METS document was last modified.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LASTMODDATE</em>' attribute.
	 * @see #setLASTMODDATE(XMLGregorianCalendar)
	 * @see gov.loc.mets.MetsPackage#getMetsHdrType_LASTMODDATE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='LASTMODDATE'"
	 * @generated
	 */
        XMLGregorianCalendar getLASTMODDATE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MetsHdrType#getLASTMODDATE <em>LASTMODDATE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LASTMODDATE</em>' attribute.
	 * @see #getLASTMODDATE()
	 * @generated
	 */
        void setLASTMODDATE(XMLGregorianCalendar value);

        /**
	 * Returns the value of the '<em><b>RECORDSTATUS</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RECORDSTATUS (string/O): Specifies the status of the METS document. It is used for internal processing purposes.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RECORDSTATUS</em>' attribute.
	 * @see #setRECORDSTATUS(String)
	 * @see gov.loc.mets.MetsPackage#getMetsHdrType_RECORDSTATUS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='RECORDSTATUS'"
	 * @generated
	 */
        String getRECORDSTATUS();

        /**
	 * Sets the value of the '{@link gov.loc.mets.MetsHdrType#getRECORDSTATUS <em>RECORDSTATUS</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RECORDSTATUS</em>' attribute.
	 * @see #getRECORDSTATUS()
	 * @generated
	 */
        void setRECORDSTATUS(String value);

} // MetsHdrType
