/**
 */
package crosswalk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Output Metadata Sections</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see crosswalk.CrosswalkPackage#getOutputMetadataSections()
 * @model
 * @generated
 */
public enum OutputMetadataSections implements Enumerator {
	/**
	 * The '<em><b>Rights MD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHTS_MD_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHTS_MD(0, "rightsMD", "rightsMD"),

	/**
	 * The '<em><b>Dmd Sec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMD_SEC_VALUE
	 * @generated
	 * @ordered
	 */
	DMD_SEC(1, "dmdSec", "dmdSec"),

	/**
	 * The '<em><b>Tech MD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECH_MD_VALUE
	 * @generated
	 * @ordered
	 */
	TECH_MD(2, "techMD", "techMD"),

	/**
	 * The '<em><b>Digiprov MD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGIPROV_MD_VALUE
	 * @generated
	 * @ordered
	 */
	DIGIPROV_MD(3, "digiprovMD", "digiprovMD"),

	/**
	 * The '<em><b>Source MD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_MD_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_MD(4, "sourceMD", "sourceMD");

	/**
	 * The '<em><b>Rights MD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rights MD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHTS_MD
	 * @model name="rightsMD"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHTS_MD_VALUE = 0;

	/**
	 * The '<em><b>Dmd Sec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dmd Sec</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DMD_SEC
	 * @model name="dmdSec"
	 * @generated
	 * @ordered
	 */
	public static final int DMD_SEC_VALUE = 1;

	/**
	 * The '<em><b>Tech MD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tech MD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TECH_MD
	 * @model name="techMD"
	 * @generated
	 * @ordered
	 */
	public static final int TECH_MD_VALUE = 2;

	/**
	 * The '<em><b>Digiprov MD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Digiprov MD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIGIPROV_MD
	 * @model name="digiprovMD"
	 * @generated
	 * @ordered
	 */
	public static final int DIGIPROV_MD_VALUE = 3;

	/**
	 * The '<em><b>Source MD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Source MD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOURCE_MD
	 * @model name="sourceMD"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_MD_VALUE = 4;

	/**
	 * An array of all the '<em><b>Output Metadata Sections</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OutputMetadataSections[] VALUES_ARRAY =
		new OutputMetadataSections[] {
			RIGHTS_MD,
			DMD_SEC,
			TECH_MD,
			DIGIPROV_MD,
			SOURCE_MD,
		};

	/**
	 * A public read-only list of all the '<em><b>Output Metadata Sections</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OutputMetadataSections> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Output Metadata Sections</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OutputMetadataSections get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OutputMetadataSections result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Output Metadata Sections</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OutputMetadataSections getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OutputMetadataSections result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Output Metadata Sections</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OutputMetadataSections get(int value) {
		switch (value) {
			case RIGHTS_MD_VALUE: return RIGHTS_MD;
			case DMD_SEC_VALUE: return DMD_SEC;
			case TECH_MD_VALUE: return TECH_MD;
			case DIGIPROV_MD_VALUE: return DIGIPROV_MD;
			case SOURCE_MD_VALUE: return SOURCE_MD;
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
	private OutputMetadataSections(int value, String name, String literal) {
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
	
} //OutputMetadataSections
