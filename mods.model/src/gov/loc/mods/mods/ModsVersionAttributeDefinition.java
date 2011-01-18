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
 * A representation of the literals of the enumeration '<em><b>Mods Version Attribute Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getModsVersionAttributeDefinition()
 * @model extendedMetaData="name='modsVersionAttributeDefinition'"
 * @generated
 */
public enum ModsVersionAttributeDefinition implements Enumerator {
    /**
     * The '<em><b>34</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #_34_VALUE
     * @generated
     * @ordered
     */
    _34(0, "_34", "3.4"),

    /**
     * The '<em><b>33</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #_33_VALUE
     * @generated
     * @ordered
     */
    _33(1, "_33", "3.3"),

    /**
     * The '<em><b>32</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #_32_VALUE
     * @generated
     * @ordered
     */
    _32(2, "_32", "3.2"),

    /**
     * The '<em><b>31</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #_31_VALUE
     * @generated
     * @ordered
     */
    _31(3, "_31", "3.1"),

    /**
     * The '<em><b>30</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #_30_VALUE
     * @generated
     * @ordered
     */
    _30(4, "_30", "3.0");

    /**
     * The '<em><b>34</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>34</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #_34
     * @model literal="3.4"
     * @generated
     * @ordered
     */
    public static final int _34_VALUE = 0;

    /**
     * The '<em><b>33</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>33</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #_33
     * @model literal="3.3"
     * @generated
     * @ordered
     */
    public static final int _33_VALUE = 1;

    /**
     * The '<em><b>32</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>32</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #_32
     * @model literal="3.2"
     * @generated
     * @ordered
     */
    public static final int _32_VALUE = 2;

    /**
     * The '<em><b>31</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>31</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #_31
     * @model literal="3.1"
     * @generated
     * @ordered
     */
    public static final int _31_VALUE = 3;

    /**
     * The '<em><b>30</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>30</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #_30
     * @model literal="3.0"
     * @generated
     * @ordered
     */
    public static final int _30_VALUE = 4;

    /**
     * An array of all the '<em><b>Mods Version Attribute Definition</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ModsVersionAttributeDefinition[] VALUES_ARRAY = new ModsVersionAttributeDefinition[] { _34,
		    _33, _32, _31, _30, };

    /**
     * A public read-only list of all the '<em><b>Mods Version Attribute Definition</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ModsVersionAttributeDefinition> VALUES = Collections.unmodifiableList(Arrays
		    .asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Mods Version Attribute Definition</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ModsVersionAttributeDefinition get(String literal) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    ModsVersionAttributeDefinition result = VALUES_ARRAY[i];
	    if (result.toString().equals(literal)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>Mods Version Attribute Definition</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ModsVersionAttributeDefinition getByName(String name) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    ModsVersionAttributeDefinition result = VALUES_ARRAY[i];
	    if (result.getName().equals(name)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>Mods Version Attribute Definition</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ModsVersionAttributeDefinition get(int value) {
	switch (value) {
	case _34_VALUE:
	    return _34;
	case _33_VALUE:
	    return _33;
	case _32_VALUE:
	    return _32;
	case _31_VALUE:
	    return _31;
	case _30_VALUE:
	    return _30;
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
    private ModsVersionAttributeDefinition(int value, String name, String literal) {
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

} //ModsVersionAttributeDefinition
