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
 * A representation of the literals of the enumeration '<em><b>Date Qualifier Attribute Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getDateQualifierAttributeDefinition()
 * @model extendedMetaData="name='dateQualifierAttributeDefinition'"
 * @generated
 */
public enum DateQualifierAttributeDefinition implements Enumerator {
	/**
	 * The '<em><b>Approximate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROXIMATE_VALUE
	 * @generated
	 * @ordered
	 */
	APPROXIMATE(0, "approximate", "approximate"),

	/**
	 * The '<em><b>Inferred</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFERRED_VALUE
	 * @generated
	 * @ordered
	 */
	INFERRED(1, "inferred", "inferred"),

	/**
	 * The '<em><b>Questionable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUESTIONABLE_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTIONABLE(2, "questionable", "questionable");

	/**
	 * The '<em><b>Approximate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Approximate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPROXIMATE
	 * @model name="approximate"
	 * @generated
	 * @ordered
	 */
	public static final int APPROXIMATE_VALUE = 0;

	/**
	 * The '<em><b>Inferred</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inferred</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFERRED
	 * @model name="inferred"
	 * @generated
	 * @ordered
	 */
	public static final int INFERRED_VALUE = 1;

	/**
	 * The '<em><b>Questionable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Questionable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUESTIONABLE
	 * @model name="questionable"
	 * @generated
	 * @ordered
	 */
	public static final int QUESTIONABLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Date Qualifier Attribute Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DateQualifierAttributeDefinition[] VALUES_ARRAY = new DateQualifierAttributeDefinition[] {
			APPROXIMATE, INFERRED, QUESTIONABLE, };

	/**
	 * A public read-only list of all the '<em><b>Date Qualifier Attribute Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DateQualifierAttributeDefinition> VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Date Qualifier Attribute Definition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DateQualifierAttributeDefinition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DateQualifierAttributeDefinition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Date Qualifier Attribute Definition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DateQualifierAttributeDefinition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DateQualifierAttributeDefinition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Date Qualifier Attribute Definition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DateQualifierAttributeDefinition get(int value) {
		switch (value) {
			case APPROXIMATE_VALUE:
				return APPROXIMATE;
			case INFERRED_VALUE:
				return INFERRED;
			case QUESTIONABLE_VALUE:
				return QUESTIONABLE;
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
	private DateQualifierAttributeDefinition(int value, String name, String literal) {
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

} //DateQualifierAttributeDefinition
