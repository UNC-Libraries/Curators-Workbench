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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.ContextProvider#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link crosswalk.ContextProvider#getCurrentUser <em>Current User</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getContextProvider()
 * @model abstract="true"
 * @generated
 */
public interface ContextProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Type</em>' reference.
	 * @see #setOutputType(EClass)
	 * @see crosswalk.CrosswalkPackage#getContextProvider_OutputType()
	 * @model required="true"
	 * @generated
	 */
	EClass getOutputType();

	/**
	 * Sets the value of the '{@link crosswalk.ContextProvider#getOutputType <em>Output Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Type</em>' reference.
	 * @see #getOutputType()
	 * @generated
	 */
	void setOutputType(EClass value);

	/**
	 * Returns the value of the '<em><b>Current User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current User</em>' attribute.
	 * @see #setCurrentUser(String)
	 * @see crosswalk.CrosswalkPackage#getContextProvider_CurrentUser()
	 * @model required="true"
	 * @generated
	 */
	String getCurrentUser();

	/**
	 * Sets the value of the '{@link crosswalk.ContextProvider#getCurrentUser <em>Current User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current User</em>' attribute.
	 * @see #getCurrentUser()
	 * @generated
	 */
	void setCurrentUser(String value);

} // ContextProvider
