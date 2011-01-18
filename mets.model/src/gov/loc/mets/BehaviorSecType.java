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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Sec Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * behaviorSecType: Complex Type for Behavior Sections
 * 			Behaviors are executable code which can be associated with parts of a METS object.  The behaviorSec element is used to group individual behaviors within a hierarchical structure.  Such grouping can be useful to organize families of behaviors together or to indicate other relationships between particular behaviors.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.BehaviorSecType#getBehaviorSec <em>Behavior Sec</em>}</li>
 *   <li>{@link gov.loc.mets.BehaviorSecType#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link gov.loc.mets.BehaviorSecType#getCREATED <em>CREATED</em>}</li>
 *   <li>{@link gov.loc.mets.BehaviorSecType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.BehaviorSecType#getLABEL <em>LABEL</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getBehaviorSecType()
 * @model extendedMetaData="name='behaviorSecType' kind='elementOnly'"
 * @generated
 */
public interface BehaviorSecType extends EObject {
        /**
         * Returns the value of the '<em><b>Behavior Sec</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.BehaviorSecType}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Behavior Sec</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Behavior Sec</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getBehaviorSecType_BehaviorSec()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='behaviorSec' namespace='##targetNamespace'"
         * @generated
         */
        EList<BehaviorSecType> getBehaviorSec();

        /**
         * Returns the value of the '<em><b>Behavior</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.BehaviorType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 						A behavior element &lt;behavior&gt; can be used to associate executable behaviors with content in the METS document. This element has an interface definition &lt;interfaceDef&gt; element that represents an abstract definition of a set of behaviors represented by a particular behavior. A &lt;behavior&gt; element also has a behavior mechanism &lt;mechanism&gt; element, a module of executable code that implements and runs the behavior defined abstractly by the interface definition.
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>Behavior</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getBehaviorSecType_Behavior()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='behavior' namespace='##targetNamespace'"
         * @generated
         */
        EList<BehaviorType> getBehavior();

        /**
         * Returns the value of the '<em><b>CREATED</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * CREATED (dateTime/O): Specifies the date and time of creation for the &lt;behaviorSec&gt;
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>CREATED</em>' attribute.
         * @see #setCREATED(XMLGregorianCalendar)
         * @see gov.loc.mets.MetsPackage#getBehaviorSecType_CREATED()
         * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
         *        extendedMetaData="kind='attribute' name='CREATED'"
         * @generated
         */
        XMLGregorianCalendar getCREATED();

        /**
         * Sets the value of the '{@link gov.loc.mets.BehaviorSecType#getCREATED <em>CREATED</em>}' attribute.
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
         * @see gov.loc.mets.MetsPackage#getBehaviorSecType_ID()
         * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
         *        extendedMetaData="kind='attribute' name='ID'"
         * @generated
         */
        String getID();

        /**
         * Sets the value of the '{@link gov.loc.mets.BehaviorSecType#getID <em>ID</em>}' attribute.
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
         * LABEL (string/O): A text description of the behavior section.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>LABEL</em>' attribute.
         * @see #setLABEL(String)
         * @see gov.loc.mets.MetsPackage#getBehaviorSecType_LABEL()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='LABEL'"
         * @generated
         */
        String getLABEL();

        /**
         * Sets the value of the '{@link gov.loc.mets.BehaviorSecType#getLABEL <em>LABEL</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>LABEL</em>' attribute.
         * @see #getLABEL()
         * @generated
         */
        void setLABEL(String value);

} // BehaviorSecType
