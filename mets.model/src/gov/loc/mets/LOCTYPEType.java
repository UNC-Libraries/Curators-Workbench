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
 * A representation of the literals of the enumeration '<em><b>LOCTYPE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mets.MetsPackage#getLOCTYPEType()
 * @model extendedMetaData="name='LOCTYPE_._type'"
 * @generated
 */
public enum LOCTYPEType implements Enumerator {
        /**
	 * The '<em><b>ARK</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #ARK_VALUE
	 * @generated
	 * @ordered
	 */
        ARK(0, "ARK", "ARK"),

        /**
	 * The '<em><b>URN</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #URN_VALUE
	 * @generated
	 * @ordered
	 */
        URN(1, "URN", "URN"),

        /**
	 * The '<em><b>URL</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #URL_VALUE
	 * @generated
	 * @ordered
	 */
        URL(2, "URL", "URL"),

        /**
	 * The '<em><b>PURL</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #PURL_VALUE
	 * @generated
	 * @ordered
	 */
        PURL(3, "PURL", "PURL"),

        /**
	 * The '<em><b>HANDLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #HANDLE_VALUE
	 * @generated
	 * @ordered
	 */
        HANDLE(4, "HANDLE", "HANDLE"),

        /**
	 * The '<em><b>DOI</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #DOI_VALUE
	 * @generated
	 * @ordered
	 */
        DOI(5, "DOI", "DOI"),

        /**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
        OTHER(6, "OTHER", "OTHER");

        /**
	 * The '<em><b>ARK</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>ARK</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #ARK
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int ARK_VALUE = 0;

        /**
	 * The '<em><b>URN</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>URN</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #URN
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int URN_VALUE = 1;

        /**
	 * The '<em><b>URL</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>URL</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #URL
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int URL_VALUE = 2;

        /**
	 * The '<em><b>PURL</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>PURL</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #PURL
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int PURL_VALUE = 3;

        /**
	 * The '<em><b>HANDLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>HANDLE</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #HANDLE
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int HANDLE_VALUE = 4;

        /**
	 * The '<em><b>DOI</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>DOI</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #DOI
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int DOI_VALUE = 5;

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
        public static final int OTHER_VALUE = 6;

        /**
	 * An array of all the '<em><b>LOCTYPE Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private static final LOCTYPEType[] VALUES_ARRAY =
                new LOCTYPEType[] {
			ARK,
			URN,
			URL,
			PURL,
			HANDLE,
			DOI,
			OTHER,
		};

        /**
	 * A public read-only list of all the '<em><b>LOCTYPE Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static final List<LOCTYPEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
	 * Returns the '<em><b>LOCTYPE Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static LOCTYPEType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LOCTYPEType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

        /**
	 * Returns the '<em><b>LOCTYPE Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static LOCTYPEType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LOCTYPEType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

        /**
	 * Returns the '<em><b>LOCTYPE Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static LOCTYPEType get(int value) {
		switch (value) {
			case ARK_VALUE: return ARK;
			case URN_VALUE: return URN;
			case URL_VALUE: return URL;
			case PURL_VALUE: return PURL;
			case HANDLE_VALUE: return HANDLE;
			case DOI_VALUE: return DOI;
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
        private LOCTYPEType(int value, String name, String literal) {
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
        
} //LOCTYPEType
