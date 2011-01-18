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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.OutputElement#getWalk <em>Walk</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getOutputElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OutputElement extends EObject {
        /**
         * Returns the value of the '<em><b>Walk</b></em>' container reference.
         * It is bidirectional and its opposite is '{@link crosswalk.CrossWalk#getElements <em>Elements</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Walk</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Walk</em>' container reference.
         * @see #setWalk(CrossWalk)
         * @see crosswalk.CrosswalkPackage#getOutputElement_Walk()
         * @see crosswalk.CrossWalk#getElements
         * @model opposite="Elements" transient="false"
         * @generated
         */
        CrossWalk getWalk();

        /**
         * Sets the value of the '{@link crosswalk.OutputElement#getWalk <em>Walk</em>}' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Walk</em>' container reference.
         * @see #getWalk()
         * @generated
         */
        void setWalk(CrossWalk value);

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @model recordRequired="true"
         * @generated
         */
        void updateRecord(EObject record);

} // OutputElement
