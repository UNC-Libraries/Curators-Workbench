/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3._1999.xlink;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Actuate Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._1999.xlink.XlinkPackage#getActuateType()
 * @model extendedMetaData="name='actuate_._type'"
 * @generated
 */
public enum ActuateType implements Enumerator {
        /**
         * The '<em><b>On Load</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #ON_LOAD_VALUE
         * @generated
         * @ordered
         */
        ON_LOAD(0, "onLoad", "onLoad"),

        /**
         * The '<em><b>On Request</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #ON_REQUEST_VALUE
         * @generated
         * @ordered
         */
        ON_REQUEST(1, "onRequest", "onRequest"),

        /**
         * The '<em><b>Other</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #OTHER_VALUE
         * @generated
         * @ordered
         */
        OTHER(2, "other", "other"),

        /**
         * The '<em><b>None</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #NONE_VALUE
         * @generated
         * @ordered
         */
        NONE(3, "none", "none");

        /**
         * The '<em><b>On Load</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>On Load</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #ON_LOAD
         * @model name="onLoad"
         * @generated
         * @ordered
         */
        public static final int ON_LOAD_VALUE = 0;

        /**
         * The '<em><b>On Request</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>On Request</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #ON_REQUEST
         * @model name="onRequest"
         * @generated
         * @ordered
         */
        public static final int ON_REQUEST_VALUE = 1;

        /**
         * The '<em><b>Other</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #OTHER
         * @model name="other"
         * @generated
         * @ordered
         */
        public static final int OTHER_VALUE = 2;

        /**
         * The '<em><b>None</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #NONE
         * @model name="none"
         * @generated
         * @ordered
         */
        public static final int NONE_VALUE = 3;

        /**
         * An array of all the '<em><b>Actuate Type</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static final ActuateType[] VALUES_ARRAY =
                new ActuateType[] {
                        ON_LOAD,
                        ON_REQUEST,
                        OTHER,
                        NONE,
                };

        /**
         * A public read-only list of all the '<em><b>Actuate Type</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final List<ActuateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
         * Returns the '<em><b>Actuate Type</b></em>' literal with the specified literal value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static ActuateType get(String literal) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        ActuateType result = VALUES_ARRAY[i];
                        if (result.toString().equals(literal)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Actuate Type</b></em>' literal with the specified name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static ActuateType getByName(String name) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        ActuateType result = VALUES_ARRAY[i];
                        if (result.getName().equals(name)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Actuate Type</b></em>' literal with the specified integer value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static ActuateType get(int value) {
                switch (value) {
                        case ON_LOAD_VALUE: return ON_LOAD;
                        case ON_REQUEST_VALUE: return ON_REQUEST;
                        case OTHER_VALUE: return OTHER;
                        case NONE_VALUE: return NONE;
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
        private ActuateType(int value, String name, String literal) {
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
        
} //ActuateType
