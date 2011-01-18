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

import gov.loc.mods.mods.NameTypeAttributeDefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.Name#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getName_()
 * @model
 * @generated
 */
public interface Name extends InputConsumer, OutputElement {

    /**
         * Returns the value of the '<em><b>Type</b></em>' attribute.
         * The literals are from the enumeration {@link gov.loc.mods.mods.NameTypeAttributeDefinition}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Type</em>' attribute.
         * @see gov.loc.mods.mods.NameTypeAttributeDefinition
         * @see #isSetType()
         * @see #unsetType()
         * @see #setType(NameTypeAttributeDefinition)
         * @see crosswalk.CrosswalkPackage#getName_Type()
         * @model unsettable="true"
         * @generated
         */
        NameTypeAttributeDefinition getType();

        /**
         * Sets the value of the '{@link crosswalk.Name#getType <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Type</em>' attribute.
         * @see gov.loc.mods.mods.NameTypeAttributeDefinition
         * @see #isSetType()
         * @see #unsetType()
         * @see #getType()
         * @generated
         */
        void setType(NameTypeAttributeDefinition value);

        /**
         * Unsets the value of the '{@link crosswalk.Name#getType <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetType()
         * @see #getType()
         * @see #setType(NameTypeAttributeDefinition)
         * @generated
         */
        void unsetType();

        /**
         * Returns whether the value of the '{@link crosswalk.Name#getType <em>Type</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Type</em>' attribute is set.
         * @see #unsetType()
         * @see #getType()
         * @see #setType(NameTypeAttributeDefinition)
         * @generated
         */
        boolean isSetType();

public static final String[] stringInputNames = { null };
} // Name
