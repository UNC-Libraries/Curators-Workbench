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
 * A representation of the literals of the enumeration '<em><b>Url Usage Attribute Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getUrlUsageAttributeDefinition()
 * @model extendedMetaData="name='urlUsageAttributeDefinition'"
 * @generated
 */
public enum UrlUsageAttributeDefinition implements Enumerator {
	/**
	 * The '<em><b>Primary Display</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_DISPLAY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARY_DISPLAY(0, "primaryDisplay", "primary display"),

	/**
	 * The '<em><b>Primary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARY(1, "primary", "primary");

	/**
	 * The '<em><b>Primary Display</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Primary Display</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_DISPLAY
	 * @model name="primaryDisplay" literal="primary display"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARY_DISPLAY_VALUE = 0;

	/**
	 * The '<em><b>Primary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Primary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIMARY
	 * @model name="primary"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Url Usage Attribute Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UrlUsageAttributeDefinition[] VALUES_ARRAY = new UrlUsageAttributeDefinition[] {
			PRIMARY_DISPLAY, PRIMARY, };

	/**
	 * A public read-only list of all the '<em><b>Url Usage Attribute Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UrlUsageAttributeDefinition> VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Url Usage Attribute Definition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UrlUsageAttributeDefinition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UrlUsageAttributeDefinition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Url Usage Attribute Definition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UrlUsageAttributeDefinition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UrlUsageAttributeDefinition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Url Usage Attribute Definition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UrlUsageAttributeDefinition get(int value) {
		switch (value) {
			case PRIMARY_DISPLAY_VALUE:
				return PRIMARY_DISPLAY;
			case PRIMARY_VALUE:
				return PRIMARY;
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
	private UrlUsageAttributeDefinition(int value, String name, String literal) {
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

} //UrlUsageAttributeDefinition
