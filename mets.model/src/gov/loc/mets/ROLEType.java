/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ROLE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mets.MetsPackage#getROLEType()
 * @model extendedMetaData="name='ROLE_._type'"
 * @generated
 */
public enum ROLEType implements Enumerator {
        /**
	 * The '<em><b>CREATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #CREATOR_VALUE
	 * @generated
	 * @ordered
	 */
        CREATOR(0, "CREATOR", "CREATOR"),

        /**
	 * The '<em><b>EDITOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #EDITOR_VALUE
	 * @generated
	 * @ordered
	 */
        EDITOR(1, "EDITOR", "EDITOR"),

        /**
	 * The '<em><b>ARCHIVIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #ARCHIVIST_VALUE
	 * @generated
	 * @ordered
	 */
        ARCHIVIST(2, "ARCHIVIST", "ARCHIVIST"),

        /**
	 * The '<em><b>PRESERVATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #PRESERVATION_VALUE
	 * @generated
	 * @ordered
	 */
        PRESERVATION(3, "PRESERVATION", "PRESERVATION"),

        /**
	 * The '<em><b>DISSEMINATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #DISSEMINATOR_VALUE
	 * @generated
	 * @ordered
	 */
        DISSEMINATOR(4, "DISSEMINATOR", "DISSEMINATOR"),

        /**
	 * The '<em><b>CUSTODIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #CUSTODIAN_VALUE
	 * @generated
	 * @ordered
	 */
        CUSTODIAN(5, "CUSTODIAN", "CUSTODIAN"),

        /**
	 * The '<em><b>IPOWNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #IPOWNER_VALUE
	 * @generated
	 * @ordered
	 */
        IPOWNER(6, "IPOWNER", "IPOWNER"),

        /**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
        OTHER(7, "OTHER", "OTHER");

        /**
	 * The '<em><b>CREATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>CREATOR</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #CREATOR
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int CREATOR_VALUE = 0;

        /**
	 * The '<em><b>EDITOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>EDITOR</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #EDITOR
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int EDITOR_VALUE = 1;

        /**
	 * The '<em><b>ARCHIVIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>ARCHIVIST</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #ARCHIVIST
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int ARCHIVIST_VALUE = 2;

        /**
	 * The '<em><b>PRESERVATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>PRESERVATION</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #PRESERVATION
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int PRESERVATION_VALUE = 3;

        /**
	 * The '<em><b>DISSEMINATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>DISSEMINATOR</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #DISSEMINATOR
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int DISSEMINATOR_VALUE = 4;

        /**
	 * The '<em><b>CUSTODIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>CUSTODIAN</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #CUSTODIAN
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int CUSTODIAN_VALUE = 5;

        /**
	 * The '<em><b>IPOWNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>IPOWNER</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #IPOWNER
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int IPOWNER_VALUE = 6;

        /**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int OTHER_VALUE = 7;

        /**
	 * An array of all the '<em><b>ROLE Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private static final ROLEType[] VALUES_ARRAY =
                new ROLEType[] {
			CREATOR,
			EDITOR,
			ARCHIVIST,
			PRESERVATION,
			DISSEMINATOR,
			CUSTODIAN,
			IPOWNER,
			OTHER,
		};

        /**
	 * A public read-only list of all the '<em><b>ROLE Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static final List<ROLEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
	 * Returns the '<em><b>ROLE Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static ROLEType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ROLEType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

        /**
	 * Returns the '<em><b>ROLE Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static ROLEType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ROLEType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

        /**
	 * Returns the '<em><b>ROLE Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static ROLEType get(int value) {
		switch (value) {
			case CREATOR_VALUE: return CREATOR;
			case EDITOR_VALUE: return EDITOR;
			case ARCHIVIST_VALUE: return ARCHIVIST;
			case PRESERVATION_VALUE: return PRESERVATION;
			case DISSEMINATOR_VALUE: return DISSEMINATOR;
			case CUSTODIAN_VALUE: return CUSTODIAN;
			case IPOWNER_VALUE: return IPOWNER;
			case OTHER_VALUE: return OTHER;
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
        private ROLEType(int value, String name, String literal) {
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
        
} //ROLEType
