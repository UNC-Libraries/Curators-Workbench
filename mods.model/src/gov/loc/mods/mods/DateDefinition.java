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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.DateDefinition#getKeyDate <em>Key Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getDateDefinition()
 * @model extendedMetaData="name='dateDefinition' kind='simple'"
 * @generated
 */
public interface DateDefinition extends DateBaseDefinition {
    /**
     * Returns the value of the '<em><b>Key Date</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.YesDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key Date</em>' attribute.
     * @see gov.loc.mods.mods.YesDefinition
     * @see #isSetKeyDate()
     * @see #unsetKeyDate()
     * @see #setKeyDate(YesDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getDateDefinition_KeyDate()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='keyDate'"
     * @generated
     */
    YesDefinition getKeyDate();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.DateDefinition#getKeyDate <em>Key Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key Date</em>' attribute.
     * @see gov.loc.mods.mods.YesDefinition
     * @see #isSetKeyDate()
     * @see #unsetKeyDate()
     * @see #getKeyDate()
     * @generated
     */
    void setKeyDate(YesDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.DateDefinition#getKeyDate <em>Key Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKeyDate()
     * @see #getKeyDate()
     * @see #setKeyDate(YesDefinition)
     * @generated
     */
    void unsetKeyDate();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.DateDefinition#getKeyDate <em>Key Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Key Date</em>' attribute is set.
     * @see #unsetKeyDate()
     * @see #getKeyDate()
     * @see #setKeyDate(YesDefinition)
     * @generated
     */
    boolean isSetKeyDate();

} // DateDefinition
