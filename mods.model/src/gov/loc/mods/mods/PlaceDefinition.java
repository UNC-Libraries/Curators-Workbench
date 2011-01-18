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
 * A representation of the model object '<em><b>Place Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.PlaceDefinition#getPlaceTerm <em>Place Term</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PlaceDefinition#getSupplied <em>Supplied</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getPlaceDefinition()
 * @model extendedMetaData="name='placeDefinition' kind='elementOnly'"
 * @generated
 */
public interface PlaceDefinition extends EObject {
    /**
     * Returns the value of the '<em><b>Place Term</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.PlaceTermDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Place Term</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Place Term</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getPlaceDefinition_PlaceTerm()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='placeTerm' namespace='##targetNamespace'"
     * @generated
     */
    EList<PlaceTermDefinition> getPlaceTerm();

    /**
     * Returns the value of the '<em><b>Supplied</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.YesDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supplied</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Supplied</em>' attribute.
     * @see gov.loc.mods.mods.YesDefinition
     * @see #isSetSupplied()
     * @see #unsetSupplied()
     * @see #setSupplied(YesDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getPlaceDefinition_Supplied()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='supplied'"
     * @generated
     */
    YesDefinition getSupplied();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PlaceDefinition#getSupplied <em>Supplied</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Supplied</em>' attribute.
     * @see gov.loc.mods.mods.YesDefinition
     * @see #isSetSupplied()
     * @see #unsetSupplied()
     * @see #getSupplied()
     * @generated
     */
    void setSupplied(YesDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.PlaceDefinition#getSupplied <em>Supplied</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSupplied()
     * @see #getSupplied()
     * @see #setSupplied(YesDefinition)
     * @generated
     */
    void unsetSupplied();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.PlaceDefinition#getSupplied <em>Supplied</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Supplied</em>' attribute is set.
     * @see #unsetSupplied()
     * @see #getSupplied()
     * @see #setSupplied(YesDefinition)
     * @generated
     */
    boolean isSetSupplied();

} // PlaceDefinition
