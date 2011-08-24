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
 * A representation of the literals of the enumeration '<em><b>Title Info Type Attribute Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getTitleInfoTypeAttributeDefinition()
 * @model extendedMetaData="name='titleInfoTypeAttributeDefinition'"
 * @generated
 */
public enum TitleInfoTypeAttributeDefinition implements Enumerator {
	/**
	 * The '<em><b>Abbreviated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABBREVIATED_VALUE
	 * @generated
	 * @ordered
	 */
	ABBREVIATED(0, "abbreviated", "abbreviated"),

	/**
	 * The '<em><b>Translated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSLATED_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSLATED(1, "translated", "translated"),

	/**
	 * The '<em><b>Alternative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALTERNATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ALTERNATIVE(2, "alternative", "alternative"),

	/**
	 * The '<em><b>Uniform</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIFORM_VALUE
	 * @generated
	 * @ordered
	 */
	UNIFORM(3, "uniform", "uniform");

	/**
	 * The '<em><b>Abbreviated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abbreviated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABBREVIATED
	 * @model name="abbreviated"
	 * @generated
	 * @ordered
	 */
	public static final int ABBREVIATED_VALUE = 0;

	/**
	 * The '<em><b>Translated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Translated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSLATED
	 * @model name="translated"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSLATED_VALUE = 1;

	/**
	 * The '<em><b>Alternative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alternative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALTERNATIVE
	 * @model name="alternative"
	 * @generated
	 * @ordered
	 */
	public static final int ALTERNATIVE_VALUE = 2;

	/**
	 * The '<em><b>Uniform</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uniform</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIFORM
	 * @model name="uniform"
	 * @generated
	 * @ordered
	 */
	public static final int UNIFORM_VALUE = 3;

	/**
	 * An array of all the '<em><b>Title Info Type Attribute Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TitleInfoTypeAttributeDefinition[] VALUES_ARRAY = new TitleInfoTypeAttributeDefinition[] {
			ABBREVIATED, TRANSLATED, ALTERNATIVE, UNIFORM, };

	/**
	 * A public read-only list of all the '<em><b>Title Info Type Attribute Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TitleInfoTypeAttributeDefinition> VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Title Info Type Attribute Definition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TitleInfoTypeAttributeDefinition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TitleInfoTypeAttributeDefinition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Title Info Type Attribute Definition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TitleInfoTypeAttributeDefinition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TitleInfoTypeAttributeDefinition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Title Info Type Attribute Definition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TitleInfoTypeAttributeDefinition get(int value) {
		switch (value) {
			case ABBREVIATED_VALUE:
				return ABBREVIATED;
			case TRANSLATED_VALUE:
				return TRANSLATED;
			case ALTERNATIVE_VALUE:
				return ALTERNATIVE;
			case UNIFORM_VALUE:
				return UNIFORM;
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
	private TitleInfoTypeAttributeDefinition(int value, String name, String literal) {
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

} //TitleInfoTypeAttributeDefinition
