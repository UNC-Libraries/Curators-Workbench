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
 * A representation of the model object '<em><b>String Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.StringInput#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getStringInput()
 * @model
 * @generated
 */
public interface StringInput extends Input {
        /**
         * Returns the value of the '<em><b>Input</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Input</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Input</em>' reference.
         * @see #isSetInput()
         * @see #unsetInput()
         * @see #setInput(StringGenerator)
         * @see crosswalk.CrosswalkPackage#getStringInput_Input()
         * @model unsettable="true"
         * @generated
         */
        StringGenerator getInput();

        /**
         * Sets the value of the '{@link crosswalk.StringInput#getInput <em>Input</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Input</em>' reference.
         * @see #isSetInput()
         * @see #unsetInput()
         * @see #getInput()
         * @generated
         */
        void setInput(StringGenerator value);

        /**
         * Unsets the value of the '{@link crosswalk.StringInput#getInput <em>Input</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetInput()
         * @see #getInput()
         * @see #setInput(StringGenerator)
         * @generated
         */
        void unsetInput();

        /**
         * Returns whether the value of the '{@link crosswalk.StringInput#getInput <em>Input</em>}' reference is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Input</em>' reference is set.
         * @see #unsetInput()
         * @see #getInput()
         * @see #setInput(StringGenerator)
         * @generated
         */
        boolean isSetInput();

} // StringInput
