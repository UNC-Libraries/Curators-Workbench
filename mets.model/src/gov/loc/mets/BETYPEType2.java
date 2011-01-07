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
 * A representation of the literals of the enumeration '<em><b>BETYPE Type2</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mets.MetsPackage#getBETYPEType2()
 * @model extendedMetaData="name='BETYPE_._2_._type'"
 * @generated
 */
public enum BETYPEType2 implements Enumerator {
        /**
         * The '<em><b>BYTE</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #BYTE_VALUE
         * @generated
         * @ordered
         */
        BYTE(0, "BYTE", "BYTE");

        /**
         * The '<em><b>BYTE</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>BYTE</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #BYTE
         * @model
         * @generated
         * @ordered
         */
        public static final int BYTE_VALUE = 0;

        /**
         * An array of all the '<em><b>BETYPE Type2</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static final BETYPEType2[] VALUES_ARRAY =
                new BETYPEType2[] {
                        BYTE,
                };

        /**
         * A public read-only list of all the '<em><b>BETYPE Type2</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final List<BETYPEType2> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
         * Returns the '<em><b>BETYPE Type2</b></em>' literal with the specified literal value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static BETYPEType2 get(String literal) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        BETYPEType2 result = VALUES_ARRAY[i];
                        if (result.toString().equals(literal)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>BETYPE Type2</b></em>' literal with the specified name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static BETYPEType2 getByName(String name) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        BETYPEType2 result = VALUES_ARRAY[i];
                        if (result.getName().equals(name)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>BETYPE Type2</b></em>' literal with the specified integer value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static BETYPEType2 get(int value) {
                switch (value) {
                        case BYTE_VALUE: return BYTE;
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
        private BETYPEType2(int value, String name, String literal) {
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
        
} //BETYPEType2
