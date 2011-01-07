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
 * A representation of the literals of the enumeration '<em><b>No Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getNoDefinition()
 * @model extendedMetaData="name='noDefinition'"
 * @generated
 */
public enum NoDefinition implements Enumerator {
    /**
     * The '<em><b>No</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NO_VALUE
     * @generated
     * @ordered
     */
    NO(0, "no", "no");

    /**
     * The '<em><b>No</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>No</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NO
     * @model name="no"
     * @generated
     * @ordered
     */
    public static final int NO_VALUE = 0;

    /**
     * An array of all the '<em><b>No Definition</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final NoDefinition[] VALUES_ARRAY = new NoDefinition[] { NO, };

    /**
     * A public read-only list of all the '<em><b>No Definition</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<NoDefinition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>No Definition</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static NoDefinition get(String literal) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    NoDefinition result = VALUES_ARRAY[i];
	    if (result.toString().equals(literal)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>No Definition</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static NoDefinition getByName(String name) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    NoDefinition result = VALUES_ARRAY[i];
	    if (result.getName().equals(name)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>No Definition</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static NoDefinition get(int value) {
	switch (value) {
	case NO_VALUE:
	    return NO;
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
    private NoDefinition(int value, String name, String literal) {
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

} //NoDefinition
