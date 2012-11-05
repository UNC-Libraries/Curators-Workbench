/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Text Input Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see crosswalk.CrosswalkPackage#getTextInputType()
 * @model
 * @generated
 */
public enum TextInputType implements Enumerator {
	/**
	 * The '<em><b>Single Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_LINE(0, "SingleLine", "SingleLine"),

	/**
	 * The '<em><b>Multiple Lines</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_LINES_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_LINES(1, "MultipleLines", "MultipleLines");

	/**
	 * The '<em><b>Single Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Single Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_LINE
	 * @model name="SingleLine"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_LINE_VALUE = 0;

	/**
	 * The '<em><b>Multiple Lines</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiple Lines</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_LINES
	 * @model name="MultipleLines"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_LINES_VALUE = 1;

	/**
	 * An array of all the '<em><b>Text Input Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TextInputType[] VALUES_ARRAY =
		new TextInputType[] {
			SINGLE_LINE,
			MULTIPLE_LINES,
		};

	/**
	 * A public read-only list of all the '<em><b>Text Input Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TextInputType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Text Input Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextInputType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextInputType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Input Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextInputType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextInputType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Input Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextInputType get(int value) {
		switch (value) {
			case SINGLE_LINE_VALUE: return SINGLE_LINE;
			case MULTIPLE_LINES_VALUE: return MULTIPLE_LINES;
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
	private TextInputType(int value, String name, String literal) {
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
	
} //TextInputType
