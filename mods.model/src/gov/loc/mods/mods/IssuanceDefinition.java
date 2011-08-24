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
 * A representation of the literals of the enumeration '<em><b>Issuance Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getIssuanceDefinition()
 * @model extendedMetaData="name='issuanceDefinition'"
 * @generated
 */
public enum IssuanceDefinition implements Enumerator {
	/**
	 * The '<em><b>Continuing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUING_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUING(0, "continuing", "continuing"),

	/**
	 * The '<em><b>Monographic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONOGRAPHIC_VALUE
	 * @generated
	 * @ordered
	 */
	MONOGRAPHIC(1, "monographic", "monographic"),

	/**
	 * The '<em><b>Single Unit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_UNIT(2, "singleUnit", "single unit"),

	/**
	 * The '<em><b>Multipart Monograph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_MONOGRAPH_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPART_MONOGRAPH(3, "multipartMonograph", "multipart monograph"),

	/**
	 * The '<em><b>Serial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SERIAL(4, "serial", "serial"),

	/**
	 * The '<em><b>Integrating Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATING_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRATING_RESOURCE(5, "integratingResource", "integrating resource");

	/**
	 * The '<em><b>Continuing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Continuing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTINUING
	 * @model name="continuing"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUING_VALUE = 0;

	/**
	 * The '<em><b>Monographic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Monographic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONOGRAPHIC
	 * @model name="monographic"
	 * @generated
	 * @ordered
	 */
	public static final int MONOGRAPHIC_VALUE = 1;

	/**
	 * The '<em><b>Single Unit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Single Unit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_UNIT
	 * @model name="singleUnit" literal="single unit"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_UNIT_VALUE = 2;

	/**
	 * The '<em><b>Multipart Monograph</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multipart Monograph</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_MONOGRAPH
	 * @model name="multipartMonograph" literal="multipart monograph"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPART_MONOGRAPH_VALUE = 3;

	/**
	 * The '<em><b>Serial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Serial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERIAL
	 * @model name="serial"
	 * @generated
	 * @ordered
	 */
	public static final int SERIAL_VALUE = 4;

	/**
	 * The '<em><b>Integrating Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integrating Resource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGRATING_RESOURCE
	 * @model name="integratingResource" literal="integrating resource"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRATING_RESOURCE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Issuance Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IssuanceDefinition[] VALUES_ARRAY = new IssuanceDefinition[] { CONTINUING, MONOGRAPHIC,
			SINGLE_UNIT, MULTIPART_MONOGRAPH, SERIAL, INTEGRATING_RESOURCE, };

	/**
	 * A public read-only list of all the '<em><b>Issuance Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IssuanceDefinition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Issuance Definition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IssuanceDefinition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssuanceDefinition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issuance Definition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IssuanceDefinition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssuanceDefinition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issuance Definition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IssuanceDefinition get(int value) {
		switch (value) {
			case CONTINUING_VALUE:
				return CONTINUING;
			case MONOGRAPHIC_VALUE:
				return MONOGRAPHIC;
			case SINGLE_UNIT_VALUE:
				return SINGLE_UNIT;
			case MULTIPART_MONOGRAPH_VALUE:
				return MULTIPART_MONOGRAPH;
			case SERIAL_VALUE:
				return SERIAL;
			case INTEGRATING_RESOURCE_VALUE:
				return INTEGRATING_RESOURCE;
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
	private IssuanceDefinition(int value, String name, String literal) {
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

} //IssuanceDefinition
