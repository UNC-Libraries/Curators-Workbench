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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * structMapType: Complex Type for Structural Maps
 * 			The structural map (structMap) outlines a hierarchical structure for the original object being encoded, using a series of nested div elements.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.StructMapType#getDiv <em>Div</em>}</li>
 *   <li>{@link gov.loc.mets.StructMapType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.StructMapType#getLABEL <em>LABEL</em>}</li>
 *   <li>{@link gov.loc.mets.StructMapType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getStructMapType()
 * @model extendedMetaData="name='structMapType' kind='elementOnly'"
 * @generated
 */
public interface StructMapType extends EObject {
        /**
         * Returns the value of the '<em><b>Div</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 						The structural divisions of the hierarchical organization provided by a &lt;structMap&gt; are represented by division &lt;div&gt; elements, which can be nested to any depth. Each &lt;div&gt; element can represent either an intellectual (logical) division or a physical division. Every &lt;div&gt; node in the structural map hierarchy may be connected (via subsidiary &lt;mptr&gt; or &lt;fptr&gt; elements) to content files which represent that div's portion of the whole document. 
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>Div</em>' containment reference.
         * @see #setDiv(DivType)
         * @see gov.loc.mets.MetsPackage#getStructMapType_Div()
         * @model containment="true" required="true"
         *        extendedMetaData="kind='element' name='div' namespace='##targetNamespace'"
         * @generated
         */
        DivType getDiv();

        /**
         * Sets the value of the '{@link gov.loc.mets.StructMapType#getDiv <em>Div</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Div</em>' containment reference.
         * @see #getDiv()
         * @generated
         */
        void setDiv(DivType value);

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
         * @see gov.loc.mets.MetsPackage#getStructMapType_ID()
         * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
         *        extendedMetaData="kind='attribute' name='ID'"
         * @generated
         */
        String getID();

        /**
         * Sets the value of the '{@link gov.loc.mets.StructMapType#getID <em>ID</em>}' attribute.
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
         * LABEL (string/O): Describes the &lt;structMap&gt; to viewers of the METS document. This would be useful primarily where more than one &lt;structMap&gt; is provided for a single object. A descriptive LABEL value, in that case, could clarify to users the purpose of each of the available structMaps.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>LABEL</em>' attribute.
         * @see #setLABEL(String)
         * @see gov.loc.mets.MetsPackage#getStructMapType_LABEL()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='LABEL'"
         * @generated
         */
        String getLABEL();

        /**
         * Sets the value of the '{@link gov.loc.mets.StructMapType#getLABEL <em>LABEL</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>LABEL</em>' attribute.
         * @see #getLABEL()
         * @generated
         */
        void setLABEL(String value);

        /**
         * Returns the value of the '<em><b>TYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * TYPE (string/O): Identifies the type of structure represented by the &lt;structMap&gt;. For example, a &lt;structMap&gt; that represented a purely logical or intellectual structure could be assigned a TYPE value of “logical” whereas a &lt;structMap&gt; that represented a purely physical structure could be assigned a TYPE value of “physical”. However, the METS schema neither defines nor requires a common vocabulary for this attribute. A METS profile, however, may well constrain the values for the &lt;structMap&gt; TYPE.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>TYPE</em>' attribute.
         * @see #setTYPE(String)
         * @see gov.loc.mets.MetsPackage#getStructMapType_TYPE()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='TYPE'"
         * @generated
         */
        String getTYPE();

        /**
         * Sets the value of the '{@link gov.loc.mets.StructMapType#getTYPE <em>TYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>TYPE</em>' attribute.
         * @see #getTYPE()
         * @generated
         */
        void setTYPE(String value);

} // StructMapType
