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
 * A representation of the literals of the enumeration '<em><b>Show Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._1999.xlink.XlinkPackage#getShowType()
 * @model extendedMetaData="name='show_._type'"
 * @generated
 */
public enum ShowType implements Enumerator {
        /**
         * The '<em><b>New</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #NEW_VALUE
         * @generated
         * @ordered
         */
        NEW(0, "new", "new"),

        /**
         * The '<em><b>Replace</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #REPLACE_VALUE
         * @generated
         * @ordered
         */
        REPLACE(1, "replace", "replace"),

        /**
         * The '<em><b>Embed</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #EMBED_VALUE
         * @generated
         * @ordered
         */
        EMBED(2, "embed", "embed"),

        /**
         * The '<em><b>Other</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #OTHER_VALUE
         * @generated
         * @ordered
         */
        OTHER(3, "other", "other"),

        /**
         * The '<em><b>None</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #NONE_VALUE
         * @generated
         * @ordered
         */
        NONE(4, "none", "none");

        /**
         * The '<em><b>New</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>New</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #NEW
         * @model name="new"
         * @generated
         * @ordered
         */
        public static final int NEW_VALUE = 0;

        /**
         * The '<em><b>Replace</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Replace</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #REPLACE
         * @model name="replace"
         * @generated
         * @ordered
         */
        public static final int REPLACE_VALUE = 1;

        /**
         * The '<em><b>Embed</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Embed</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #EMBED
         * @model name="embed"
         * @generated
         * @ordered
         */
        public static final int EMBED_VALUE = 2;

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
        public static final int OTHER_VALUE = 3;

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
        public static final int NONE_VALUE = 4;

        /**
         * An array of all the '<em><b>Show Type</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static final ShowType[] VALUES_ARRAY =
                new ShowType[] {
                        NEW,
                        REPLACE,
                        EMBED,
                        OTHER,
                        NONE,
                };

        /**
         * A public read-only list of all the '<em><b>Show Type</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final List<ShowType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
         * Returns the '<em><b>Show Type</b></em>' literal with the specified literal value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static ShowType get(String literal) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        ShowType result = VALUES_ARRAY[i];
                        if (result.toString().equals(literal)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Show Type</b></em>' literal with the specified name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static ShowType getByName(String name) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        ShowType result = VALUES_ARRAY[i];
                        if (result.getName().equals(name)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Show Type</b></em>' literal with the specified integer value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static ShowType get(int value) {
                switch (value) {
                        case NEW_VALUE: return NEW;
                        case REPLACE_VALUE: return REPLACE;
                        case EMBED_VALUE: return EMBED;
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
        private ShowType(int value, String name, String literal) {
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
        
} //ShowType
