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
package gov.loc.mods.mods;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mods Collection Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.ModsCollectionDefinition#getMods <em>Mods</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getModsCollectionDefinition()
 * @model extendedMetaData="name='modsCollectionDefinition' kind='elementOnly'"
 * @generated
 */
public interface ModsCollectionDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Mods</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.ModsDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mods</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getModsCollectionDefinition_Mods()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mods' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModsDefinition> getMods();

} // ModsCollectionDefinition
