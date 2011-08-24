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
 * A representation of the literals of the enumeration '<em><b>Reformatting Quality Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getReformattingQualityDefinition()
 * @model extendedMetaData="name='reformattingQualityDefinition'"
 * @generated
 */
public enum ReformattingQualityDefinition implements Enumerator {
	/**
	 * The '<em><b>Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS(0, "access", "access"),

	/**
	 * The '<em><b>Preservation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	PRESERVATION(1, "preservation", "preservation"),

	/**
	 * The '<em><b>Replacement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACEMENT(2, "replacement", "replacement");

	/**
	 * The '<em><b>Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Access</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCESS
	 * @model name="access"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_VALUE = 0;

	/**
	 * The '<em><b>Preservation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preservation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESERVATION
	 * @model name="preservation"
	 * @generated
	 * @ordered
	 */
	public static final int PRESERVATION_VALUE = 1;

	/**
	 * The '<em><b>Replacement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Replacement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPLACEMENT
	 * @model name="replacement"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACEMENT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Reformatting Quality Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReformattingQualityDefinition[] VALUES_ARRAY = new ReformattingQualityDefinition[] { ACCESS,
			PRESERVATION, REPLACEMENT, };

	/**
	 * A public read-only list of all the '<em><b>Reformatting Quality Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReformattingQualityDefinition> VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reformatting Quality Definition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReformattingQualityDefinition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReformattingQualityDefinition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reformatting Quality Definition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReformattingQualityDefinition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReformattingQualityDefinition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reformatting Quality Definition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReformattingQualityDefinition get(int value) {
		switch (value) {
			case ACCESS_VALUE:
				return ACCESS;
			case PRESERVATION_VALUE:
				return PRESERVATION;
			case REPLACEMENT_VALUE:
				return REPLACEMENT;
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
	private ReformattingQualityDefinition(int value, String name, String literal) {
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

} //ReformattingQualityDefinition
