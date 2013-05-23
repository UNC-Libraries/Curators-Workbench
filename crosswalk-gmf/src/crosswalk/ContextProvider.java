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

import edu.unc.lib.schemas.acl.DocumentRoot;
import gov.loc.mods.mods.ModsDefinition;
import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link crosswalk.ContextProvider#getOutputProfiles <em>Output Profiles</em>}</li>
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
	 * Returns the value of the '<em><b>Output Profiles</b></em>' containment reference list.
	 * The list contents are of type {@link crosswalk.OutputProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Profiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Profiles</em>' containment reference list.
	 * @see crosswalk.CrosswalkPackage#getContextProvider_OutputProfiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputProfile> getOutputProfiles();

	/**
	 * Returns the value of the '<em><b>Current User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current User</em>' attribute.
	 * @see #isSetCurrentUser()
	 * @see #unsetCurrentUser()
	 * @see #setCurrentUser(String)
	 * @see crosswalk.CrosswalkPackage#getContextProvider_CurrentUser()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCurrentUser();

	/**
	 * Sets the value of the '{@link crosswalk.ContextProvider#getCurrentUser <em>Current User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current User</em>' attribute.
	 * @see #isSetCurrentUser()
	 * @see #unsetCurrentUser()
	 * @see #getCurrentUser()
	 * @generated
	 */
	void setCurrentUser(String value);

	/**
	 * Unsets the value of the '{@link crosswalk.ContextProvider#getCurrentUser <em>Current User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentUser()
	 * @see #getCurrentUser()
	 * @see #setCurrentUser(String)
	 * @generated
	 */
	void unsetCurrentUser();

	/**
	 * Returns whether the value of the '{@link crosswalk.ContextProvider#getCurrentUser <em>Current User</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current User</em>' attribute is set.
	 * @see #unsetCurrentUser()
	 * @see #getCurrentUser()
	 * @see #setCurrentUser(String)
	 * @generated
	 */
	boolean isSetCurrentUser();

} // ContextProvider
