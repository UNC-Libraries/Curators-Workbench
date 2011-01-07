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
 * A representation of the literals of the enumeration '<em><b>Date Encoding Attribute Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getDateEncodingAttributeDefinition()
 * @model extendedMetaData="name='dateEncodingAttributeDefinition'"
 * @generated
 */
public enum DateEncodingAttributeDefinition implements Enumerator {
    /**
     * The '<em><b>W3cdtf</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #W3CDTF_VALUE
     * @generated
     * @ordered
     */
    W3CDTF(0, "w3cdtf", "w3cdtf"),

    /**
     * The '<em><b>Iso8601</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ISO8601_VALUE
     * @generated
     * @ordered
     */
    ISO8601(1, "iso8601", "iso8601"),

    /**
     * The '<em><b>Marc</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MARC_VALUE
     * @generated
     * @ordered
     */
    MARC(2, "marc", "marc"),

    /**
     * The '<em><b>Temper</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TEMPER_VALUE
     * @generated
     * @ordered
     */
    TEMPER(3, "temper", "temper"),

    /**
     * The '<em><b>Edtf</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EDTF_VALUE
     * @generated
     * @ordered
     */
    EDTF(4, "edtf", "edtf");

    /**
     * The '<em><b>W3cdtf</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>W3cdtf</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #W3CDTF
     * @model name="w3cdtf"
     * @generated
     * @ordered
     */
    public static final int W3CDTF_VALUE = 0;

    /**
     * The '<em><b>Iso8601</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Iso8601</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ISO8601
     * @model name="iso8601"
     * @generated
     * @ordered
     */
    public static final int ISO8601_VALUE = 1;

    /**
     * The '<em><b>Marc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Marc</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MARC
     * @model name="marc"
     * @generated
     * @ordered
     */
    public static final int MARC_VALUE = 2;

    /**
     * The '<em><b>Temper</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Temper</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TEMPER
     * @model name="temper"
     * @generated
     * @ordered
     */
    public static final int TEMPER_VALUE = 3;

    /**
     * The '<em><b>Edtf</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Edtf</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EDTF
     * @model name="edtf"
     * @generated
     * @ordered
     */
    public static final int EDTF_VALUE = 4;

    /**
     * An array of all the '<em><b>Date Encoding Attribute Definition</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DateEncodingAttributeDefinition[] VALUES_ARRAY = new DateEncodingAttributeDefinition[] {
		    W3CDTF, ISO8601, MARC, TEMPER, EDTF, };

    /**
     * A public read-only list of all the '<em><b>Date Encoding Attribute Definition</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<DateEncodingAttributeDefinition> VALUES = Collections.unmodifiableList(Arrays
		    .asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Date Encoding Attribute Definition</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DateEncodingAttributeDefinition get(String literal) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    DateEncodingAttributeDefinition result = VALUES_ARRAY[i];
	    if (result.toString().equals(literal)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>Date Encoding Attribute Definition</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DateEncodingAttributeDefinition getByName(String name) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    DateEncodingAttributeDefinition result = VALUES_ARRAY[i];
	    if (result.getName().equals(name)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>Date Encoding Attribute Definition</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DateEncodingAttributeDefinition get(int value) {
	switch (value) {
	case W3CDTF_VALUE:
	    return W3CDTF;
	case ISO8601_VALUE:
	    return ISO8601;
	case MARC_VALUE:
	    return MARC;
	case TEMPER_VALUE:
	    return TEMPER;
	case EDTF_VALUE:
	    return EDTF;
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
    private DateEncodingAttributeDefinition(int value, String name, String literal) {
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

} //DateEncodingAttributeDefinition
