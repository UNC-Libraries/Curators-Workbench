/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enumeration And Chronology Unit Type Attribute Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getEnumerationAndChronologyUnitTypeAttributeDefinition()
 * @model extendedMetaData="name='enumerationAndChronologyUnitTypeAttributeDefinition'"
 * @generated
 */
public enum EnumerationAndChronologyUnitTypeAttributeDefinition implements Enumerator {
    /**
     * The '<em><b>1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #_1_VALUE
     * @generated
     * @ordered
     */
    _1(0, "_1", "1"),

    /**
     * The '<em><b>2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #_2_VALUE
     * @generated
     * @ordered
     */
    _2(1, "_2", "2"),

    /**
     * The '<em><b>3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #_3_VALUE
     * @generated
     * @ordered
     */
    _3(2, "_3", "3");

    /**
     * The '<em><b>1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>1</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #_1
     * @model literal="1"
     * @generated
     * @ordered
     */
    public static final int _1_VALUE = 0;

    /**
     * The '<em><b>2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #_2
     * @model literal="2"
     * @generated
     * @ordered
     */
    public static final int _2_VALUE = 1;

    /**
     * The '<em><b>3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #_3
     * @model literal="3"
     * @generated
     * @ordered
     */
    public static final int _3_VALUE = 2;

    /**
     * An array of all the '<em><b>Enumeration And Chronology Unit Type Attribute Definition</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final EnumerationAndChronologyUnitTypeAttributeDefinition[] VALUES_ARRAY = new EnumerationAndChronologyUnitTypeAttributeDefinition[] {
		    _1, _2, _3, };

    /**
     * A public read-only list of all the '<em><b>Enumeration And Chronology Unit Type Attribute Definition</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<EnumerationAndChronologyUnitTypeAttributeDefinition> VALUES = Collections
		    .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Enumeration And Chronology Unit Type Attribute Definition</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EnumerationAndChronologyUnitTypeAttributeDefinition get(String literal) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    EnumerationAndChronologyUnitTypeAttributeDefinition result = VALUES_ARRAY[i];
	    if (result.toString().equals(literal)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>Enumeration And Chronology Unit Type Attribute Definition</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EnumerationAndChronologyUnitTypeAttributeDefinition getByName(String name) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    EnumerationAndChronologyUnitTypeAttributeDefinition result = VALUES_ARRAY[i];
	    if (result.getName().equals(name)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>Enumeration And Chronology Unit Type Attribute Definition</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EnumerationAndChronologyUnitTypeAttributeDefinition get(int value) {
	switch (value) {
	case _1_VALUE:
	    return _1;
	case _2_VALUE:
	    return _2;
	case _3_VALUE:
	    return _3;
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
    private EnumerationAndChronologyUnitTypeAttributeDefinition(int value, String name, String literal) {
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

} //EnumerationAndChronologyUnitTypeAttributeDefinition
