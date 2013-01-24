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
 * A representation of the literals of the enumeration '<em><b>Language Authority Attribute Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getLanguageAuthorityAttributeDefinition()
 * @model extendedMetaData="name='languageAuthorityAttributeDefinition'"
 * @generated
 */
public enum LanguageAuthorityAttributeDefinition implements Enumerator {
	/**
	 * The '<em><b>Rfc3066</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC3066_VALUE
	 * @generated
	 * @ordered
	 */
	RFC3066(0, "rfc3066", "rfc3066"),

	/**
	 * The '<em><b>Iso6392b</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO6392B_VALUE
	 * @generated
	 * @ordered
	 */
	ISO6392B(1, "iso6392b", "iso639-2b"),

	/**
	 * The '<em><b>Iso6393</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO6393_VALUE
	 * @generated
	 * @ordered
	 */
	ISO6393(2, "iso6393", "iso639-3"),

	/**
	 * The '<em><b>Rfc4646</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC4646_VALUE
	 * @generated
	 * @ordered
	 */
	RFC4646(3, "rfc4646", "rfc4646");

	/**
	 * The '<em><b>Rfc3066</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rfc3066</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RFC3066
	 * @model name="rfc3066"
	 * @generated
	 * @ordered
	 */
	public static final int RFC3066_VALUE = 0;

	/**
	 * The '<em><b>Iso6392b</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Iso6392b</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISO6392B
	 * @model name="iso6392b" literal="iso639-2b"
	 * @generated
	 * @ordered
	 */
	public static final int ISO6392B_VALUE = 1;

	/**
	 * The '<em><b>Iso6393</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Iso6393</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISO6393
	 * @model name="iso6393" literal="iso639-3"
	 * @generated
	 * @ordered
	 */
	public static final int ISO6393_VALUE = 2;

	/**
	 * The '<em><b>Rfc4646</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rfc4646</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RFC4646
	 * @model name="rfc4646"
	 * @generated
	 * @ordered
	 */
	public static final int RFC4646_VALUE = 3;

	/**
	 * An array of all the '<em><b>Language Authority Attribute Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LanguageAuthorityAttributeDefinition[] VALUES_ARRAY = new LanguageAuthorityAttributeDefinition[] {
			RFC3066, ISO6392B, ISO6393, RFC4646, };

	/**
	 * A public read-only list of all the '<em><b>Language Authority Attribute Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LanguageAuthorityAttributeDefinition> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Language Authority Attribute Definition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LanguageAuthorityAttributeDefinition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageAuthorityAttributeDefinition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language Authority Attribute Definition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LanguageAuthorityAttributeDefinition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageAuthorityAttributeDefinition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language Authority Attribute Definition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LanguageAuthorityAttributeDefinition get(int value) {
		switch (value) {
		case RFC3066_VALUE:
			return RFC3066;
		case ISO6392B_VALUE:
			return ISO6392B;
		case ISO6393_VALUE:
			return ISO6393;
		case RFC4646_VALUE:
			return RFC4646;
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
	private LanguageAuthorityAttributeDefinition(int value, String name,
			String literal) {
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

} //LanguageAuthorityAttributeDefinition
