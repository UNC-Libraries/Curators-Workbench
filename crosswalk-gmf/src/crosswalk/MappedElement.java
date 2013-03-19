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
package crosswalk;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.MappedElement#getChildElements <em>Child Elements</em>}</li>
 *   <li>{@link crosswalk.MappedElement#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link crosswalk.MappedElement#getMappedFeature <em>Mapped Feature</em>}</li>
 *   <li>{@link crosswalk.MappedElement#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getMappedElement()
 * @model
 * @generated
 */
public interface MappedElement extends OutputElement {
        /**
	 * Returns the value of the '<em><b>Child Elements</b></em>' containment reference list.
	 * The list contents are of type {@link crosswalk.MappedElement}.
	 * It is bidirectional and its opposite is '{@link crosswalk.MappedElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Child Elements</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Elements</em>' containment reference list.
	 * @see crosswalk.CrosswalkPackage#getMappedElement_ChildElements()
	 * @see crosswalk.MappedElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
        EList<MappedElement> getChildElements();

        /**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link crosswalk.MappedAttribute}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see crosswalk.CrosswalkPackage#getMappedElement_Attributes()
	 * @model containment="true"
	 * @generated
	 */
        EList<MappedAttribute> getAttributes();

        /**
	 * Returns the value of the '<em><b>Mapped Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Mapped Feature</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Feature</em>' reference.
	 * @see #setMappedFeature(EReference)
	 * @see crosswalk.CrosswalkPackage#getMappedElement_MappedFeature()
	 * @model required="true"
	 * @generated
	 */
        EReference getMappedFeature();

        /**
	 * Sets the value of the '{@link crosswalk.MappedElement#getMappedFeature <em>Mapped Feature</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Feature</em>' reference.
	 * @see #getMappedFeature()
	 * @generated
	 */
        void setMappedFeature(EReference value);

        /**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link crosswalk.MappedElement#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Parent</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(MappedElement)
	 * @see crosswalk.CrosswalkPackage#getMappedElement_Parent()
	 * @see crosswalk.MappedElement#getChildElements
	 * @model opposite="childElements" transient="false"
	 * @generated
	 */
        MappedElement getParent();

        /**
	 * Sets the value of the '{@link crosswalk.MappedElement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
        void setParent(MappedElement value);

} // MappedElement
