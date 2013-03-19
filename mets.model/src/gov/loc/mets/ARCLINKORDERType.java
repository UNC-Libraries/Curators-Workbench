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
package gov.loc.mets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ARCLINKORDER Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mets.MetsPackage#getARCLINKORDERType()
 * @model extendedMetaData="name='ARCLINKORDER_._type'"
 * @generated
 */
public enum ARCLINKORDERType implements Enumerator {
        /**
	 * The '<em><b>Ordered</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #ORDERED_VALUE
	 * @generated
	 * @ordered
	 */
        ORDERED(0, "ordered", "ordered"),

        /**
	 * The '<em><b>Unordered</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #UNORDERED_VALUE
	 * @generated
	 * @ordered
	 */
        UNORDERED(1, "unordered", "unordered");

        /**
	 * The '<em><b>Ordered</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Ordered</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #ORDERED
	 * @model name="ordered"
	 * @generated
	 * @ordered
	 */
        public static final int ORDERED_VALUE = 0;

        /**
	 * The '<em><b>Unordered</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Unordered</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #UNORDERED
	 * @model name="unordered"
	 * @generated
	 * @ordered
	 */
        public static final int UNORDERED_VALUE = 1;

        /**
	 * An array of all the '<em><b>ARCLINKORDER Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private static final ARCLINKORDERType[] VALUES_ARRAY =
                new ARCLINKORDERType[] {
			ORDERED,
			UNORDERED,
		};

        /**
	 * A public read-only list of all the '<em><b>ARCLINKORDER Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static final List<ARCLINKORDERType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
	 * Returns the '<em><b>ARCLINKORDER Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static ARCLINKORDERType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ARCLINKORDERType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

        /**
	 * Returns the '<em><b>ARCLINKORDER Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static ARCLINKORDERType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ARCLINKORDERType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

        /**
	 * Returns the '<em><b>ARCLINKORDER Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static ARCLINKORDERType get(int value) {
		switch (value) {
			case ORDERED_VALUE: return ORDERED;
			case UNORDERED_VALUE: return UNORDERED;
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
        private ARCLINKORDERType(int value, String name, String literal) {
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
        
} //ARCLINKORDERType
