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

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.Input#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getInput()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Input extends EObject {
        /**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Output</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #isSetOutput()
	 * @see #unsetOutput()
	 * @see #setOutput(Output)
	 * @see crosswalk.CrosswalkPackage#getInput_Output()
	 * @model unsettable="true"
	 * @generated
	 */
        Output getOutput();

        /**
	 * Sets the value of the '{@link crosswalk.Input#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #isSetOutput()
	 * @see #unsetOutput()
	 * @see #getOutput()
	 * @generated
	 */
        void setOutput(Output value);

        /**
	 * Unsets the value of the '{@link crosswalk.Input#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetOutput()
	 * @see #getOutput()
	 * @see #setOutput(Output)
	 * @generated
	 */
        void unsetOutput();

        /**
	 * Returns whether the value of the '{@link crosswalk.Input#getOutput <em>Output</em>}' reference is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Output</em>' reference is set.
	 * @see #unsetOutput()
	 * @see #getOutput()
	 * @see #setOutput(Output)
	 * @generated
	 */
        boolean isSetOutput();

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @model kind="operation" dataType="crosswalk.Clazz"
	 * @generated
	 */
        Class getInputType();

} // Input
