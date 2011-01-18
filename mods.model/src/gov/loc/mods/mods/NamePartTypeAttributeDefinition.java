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
 * A representation of the literals of the enumeration '<em><b>Name Part Type Attribute Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getNamePartTypeAttributeDefinition()
 * @model extendedMetaData="name='namePartTypeAttributeDefinition'"
 * @generated
 */
public enum NamePartTypeAttributeDefinition implements Enumerator {
    /**
     * The '<em><b>Date</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DATE_VALUE
     * @generated
     * @ordered
     */
    DATE(0, "date", "date"),

    /**
     * The '<em><b>Family</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FAMILY_VALUE
     * @generated
     * @ordered
     */
    FAMILY(1, "family", "family"),

    /**
     * The '<em><b>Given</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GIVEN_VALUE
     * @generated
     * @ordered
     */
    GIVEN(2, "given", "given"),

    /**
     * The '<em><b>Terms Of Address</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TERMS_OF_ADDRESS_VALUE
     * @generated
     * @ordered
     */
    TERMS_OF_ADDRESS(3, "termsOfAddress", "termsOfAddress");

    /**
     * The '<em><b>Date</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DATE
     * @model name="date"
     * @generated
     * @ordered
     */
    public static final int DATE_VALUE = 0;

    /**
     * The '<em><b>Family</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Family</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FAMILY
     * @model name="family"
     * @generated
     * @ordered
     */
    public static final int FAMILY_VALUE = 1;

    /**
     * The '<em><b>Given</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Given</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GIVEN
     * @model name="given"
     * @generated
     * @ordered
     */
    public static final int GIVEN_VALUE = 2;

    /**
     * The '<em><b>Terms Of Address</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Terms Of Address</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TERMS_OF_ADDRESS
     * @model name="termsOfAddress"
     * @generated
     * @ordered
     */
    public static final int TERMS_OF_ADDRESS_VALUE = 3;

    /**
     * An array of all the '<em><b>Name Part Type Attribute Definition</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final NamePartTypeAttributeDefinition[] VALUES_ARRAY = new NamePartTypeAttributeDefinition[] { DATE,
		    FAMILY, GIVEN, TERMS_OF_ADDRESS, };

    /**
     * A public read-only list of all the '<em><b>Name Part Type Attribute Definition</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<NamePartTypeAttributeDefinition> VALUES = Collections.unmodifiableList(Arrays
		    .asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Name Part Type Attribute Definition</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static NamePartTypeAttributeDefinition get(String literal) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    NamePartTypeAttributeDefinition result = VALUES_ARRAY[i];
	    if (result.toString().equals(literal)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>Name Part Type Attribute Definition</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static NamePartTypeAttributeDefinition getByName(String name) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    NamePartTypeAttributeDefinition result = VALUES_ARRAY[i];
	    if (result.getName().equals(name)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>Name Part Type Attribute Definition</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static NamePartTypeAttributeDefinition get(int value) {
	switch (value) {
	case DATE_VALUE:
	    return DATE;
	case FAMILY_VALUE:
	    return FAMILY;
	case GIVEN_VALUE:
	    return GIVEN;
	case TERMS_OF_ADDRESS_VALUE:
	    return TERMS_OF_ADDRESS;
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
    private NamePartTypeAttributeDefinition(int value, String name, String literal) {
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

} //NamePartTypeAttributeDefinition
