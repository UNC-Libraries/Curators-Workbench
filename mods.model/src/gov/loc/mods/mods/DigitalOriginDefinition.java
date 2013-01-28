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
 * A representation of the literals of the enumeration '<em><b>Digital Origin Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getDigitalOriginDefinition()
 * @model extendedMetaData="name='digitalOriginDefinition'"
 * @generated
 */
public enum DigitalOriginDefinition implements Enumerator {
	/**
	 * The '<em><b>Born Digital</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORN_DIGITAL_VALUE
	 * @generated
	 * @ordered
	 */
	BORN_DIGITAL(0, "bornDigital", "born digital"),

	/**
	 * The '<em><b>Reformatted Digital</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFORMATTED_DIGITAL_VALUE
	 * @generated
	 * @ordered
	 */
	REFORMATTED_DIGITAL(1, "reformattedDigital", "reformatted digital"),

	/**
	 * The '<em><b>Digitized Microfilm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITIZED_MICROFILM_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITIZED_MICROFILM(2, "digitizedMicrofilm", "digitized microfilm"),

	/**
	 * The '<em><b>Digitized Other Analog</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITIZED_OTHER_ANALOG_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITIZED_OTHER_ANALOG(3, "digitizedOtherAnalog", "digitized other analog");

	/**
	 * The '<em><b>Born Digital</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Born Digital</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BORN_DIGITAL
	 * @model name="bornDigital" literal="born digital"
	 * @generated
	 * @ordered
	 */
	public static final int BORN_DIGITAL_VALUE = 0;

	/**
	 * The '<em><b>Reformatted Digital</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reformatted Digital</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFORMATTED_DIGITAL
	 * @model name="reformattedDigital" literal="reformatted digital"
	 * @generated
	 * @ordered
	 */
	public static final int REFORMATTED_DIGITAL_VALUE = 1;

	/**
	 * The '<em><b>Digitized Microfilm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Digitized Microfilm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIGITIZED_MICROFILM
	 * @model name="digitizedMicrofilm" literal="digitized microfilm"
	 * @generated
	 * @ordered
	 */
	public static final int DIGITIZED_MICROFILM_VALUE = 2;

	/**
	 * The '<em><b>Digitized Other Analog</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Digitized Other Analog</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIGITIZED_OTHER_ANALOG
	 * @model name="digitizedOtherAnalog" literal="digitized other analog"
	 * @generated
	 * @ordered
	 */
	public static final int DIGITIZED_OTHER_ANALOG_VALUE = 3;

	/**
	 * An array of all the '<em><b>Digital Origin Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DigitalOriginDefinition[] VALUES_ARRAY = new DigitalOriginDefinition[] { BORN_DIGITAL,
			REFORMATTED_DIGITAL, DIGITIZED_MICROFILM, DIGITIZED_OTHER_ANALOG, };

	/**
	 * A public read-only list of all the '<em><b>Digital Origin Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DigitalOriginDefinition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Digital Origin Definition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DigitalOriginDefinition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DigitalOriginDefinition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Digital Origin Definition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DigitalOriginDefinition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DigitalOriginDefinition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Digital Origin Definition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DigitalOriginDefinition get(int value) {
		switch (value) {
			case BORN_DIGITAL_VALUE:
				return BORN_DIGITAL;
			case REFORMATTED_DIGITAL_VALUE:
				return REFORMATTED_DIGITAL;
			case DIGITIZED_MICROFILM_VALUE:
				return DIGITIZED_MICROFILM;
			case DIGITIZED_OTHER_ANALOG_VALUE:
				return DIGITIZED_OTHER_ANALOG;
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
	private DigitalOriginDefinition(int value, String name, String literal) {
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

} //DigitalOriginDefinition
