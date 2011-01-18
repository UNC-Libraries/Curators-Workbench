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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Place Authority Attribute Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getPlaceAuthorityAttributeDefinition()
 * @model extendedMetaData="name='placeAuthorityAttributeDefinition'"
 * @generated
 */
public enum PlaceAuthorityAttributeDefinition implements Enumerator {
    /**
     * The '<em><b>Marcgac</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MARCGAC_VALUE
     * @generated
     * @ordered
     */
    MARCGAC(0, "marcgac", "marcgac"),

    /**
     * The '<em><b>Marccountry</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MARCCOUNTRY_VALUE
     * @generated
     * @ordered
     */
    MARCCOUNTRY(1, "marccountry", "marccountry"),

    /**
     * The '<em><b>Iso3166</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ISO3166_VALUE
     * @generated
     * @ordered
     */
    ISO3166(2, "iso3166", "iso3166");

    /**
     * The '<em><b>Marcgac</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Marcgac</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MARCGAC
     * @model name="marcgac"
     * @generated
     * @ordered
     */
    public static final int MARCGAC_VALUE = 0;

    /**
     * The '<em><b>Marccountry</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Marccountry</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MARCCOUNTRY
     * @model name="marccountry"
     * @generated
     * @ordered
     */
    public static final int MARCCOUNTRY_VALUE = 1;

    /**
     * The '<em><b>Iso3166</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Iso3166</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ISO3166
     * @model name="iso3166"
     * @generated
     * @ordered
     */
    public static final int ISO3166_VALUE = 2;

    /**
     * An array of all the '<em><b>Place Authority Attribute Definition</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final PlaceAuthorityAttributeDefinition[] VALUES_ARRAY = new PlaceAuthorityAttributeDefinition[] {
		    MARCGAC, MARCCOUNTRY, ISO3166, };

    /**
     * A public read-only list of all the '<em><b>Place Authority Attribute Definition</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<PlaceAuthorityAttributeDefinition> VALUES = Collections.unmodifiableList(Arrays
		    .asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Place Authority Attribute Definition</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PlaceAuthorityAttributeDefinition get(String literal) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    PlaceAuthorityAttributeDefinition result = VALUES_ARRAY[i];
	    if (result.toString().equals(literal)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>Place Authority Attribute Definition</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PlaceAuthorityAttributeDefinition getByName(String name) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    PlaceAuthorityAttributeDefinition result = VALUES_ARRAY[i];
	    if (result.getName().equals(name)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>Place Authority Attribute Definition</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PlaceAuthorityAttributeDefinition get(int value) {
	switch (value) {
	case MARCGAC_VALUE:
	    return MARCGAC;
	case MARCCOUNTRY_VALUE:
	    return MARCCOUNTRY;
	case ISO3166_VALUE:
	    return ISO3166;
	}
	return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private PlaceAuthorityAttributeDefinition(int value, String name, String literal) {
	this.value = value;
	this.name = name;
	this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
	return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
	return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
	return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
	return literal;
    }

} //PlaceAuthorityAttributeDefinition
