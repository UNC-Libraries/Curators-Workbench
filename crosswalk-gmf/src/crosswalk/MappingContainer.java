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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.MappingContainer#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link crosswalk.MappingContainer#getElements <em>Elements</em>}</li>
 *   <li>{@link crosswalk.MappingContainer#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getMappingContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MappingContainer extends ContextProvider {
	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link crosswalk.WalkWidget}.
	 * It is bidirectional and its opposite is '{@link crosswalk.WalkWidget#getWalk <em>Walk</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see crosswalk.CrosswalkPackage#getMappingContainer_Widgets()
	 * @see crosswalk.WalkWidget#getWalk
	 * @model opposite="Walk" containment="true" ordered="false"
	 * @generated
	 */
	EList<WalkWidget> getWidgets();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link crosswalk.OutputElement}.
	 * It is bidirectional and its opposite is '{@link crosswalk.OutputElement#getWalk <em>Walk</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see crosswalk.CrosswalkPackage#getMappingContainer_Elements()
	 * @see crosswalk.OutputElement#getWalk
	 * @model opposite="Walk" containment="true" ordered="false"
	 * @generated
	 */
	EList<OutputElement> getElements();

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Throwable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exceptions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' attribute list.
	 * @see crosswalk.CrosswalkPackage#getMappingContainer_Exceptions()
	 * @model dataType="crosswalk.Exception" transient="true"
	 * @generated
	 */
	EList<Throwable> getExceptions();

} // MappingContainer
