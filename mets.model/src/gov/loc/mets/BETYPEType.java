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
 * A representation of the literals of the enumeration '<em><b>BETYPE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mets.MetsPackage#getBETYPEType()
 * @model extendedMetaData="name='BETYPE_._type'"
 * @generated
 */
public enum BETYPEType implements Enumerator {
        /**
	 * The '<em><b>BYTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #BYTE_VALUE
	 * @generated
	 * @ordered
	 */
        BYTE(0, "BYTE", "BYTE"),

        /**
	 * The '<em><b>IDREF</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #IDREF_VALUE
	 * @generated
	 * @ordered
	 */
        IDREF(1, "IDREF", "IDREF"),

        /**
	 * The '<em><b>SMIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #SMIL_VALUE
	 * @generated
	 * @ordered
	 */
        SMIL(2, "SMIL", "SMIL"),

        /**
	 * The '<em><b>MIDI</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #MIDI_VALUE
	 * @generated
	 * @ordered
	 */
        MIDI(3, "MIDI", "MIDI"),

        /**
	 * The '<em><b>SMPTE25</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #SMPTE25_VALUE
	 * @generated
	 * @ordered
	 */
        SMPTE25(4, "SMPTE25", "SMPTE-25"),

        /**
	 * The '<em><b>SMPTE24</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #SMPTE24_VALUE
	 * @generated
	 * @ordered
	 */
        SMPTE24(5, "SMPTE24", "SMPTE-24"),

        /**
	 * The '<em><b>SMPTEDF30</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #SMPTEDF30_VALUE
	 * @generated
	 * @ordered
	 */
        SMPTEDF30(6, "SMPTEDF30", "SMPTE-DF30"),

        /**
	 * The '<em><b>SMPTENDF30</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #SMPTENDF30_VALUE
	 * @generated
	 * @ordered
	 */
        SMPTENDF30(7, "SMPTENDF30", "SMPTE-NDF30"),

        /**
	 * The '<em><b>SMPTEDF2997</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #SMPTEDF2997_VALUE
	 * @generated
	 * @ordered
	 */
        SMPTEDF2997(8, "SMPTEDF2997", "SMPTE-DF29.97"),

        /**
	 * The '<em><b>SMPTENDF2997</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #SMPTENDF2997_VALUE
	 * @generated
	 * @ordered
	 */
        SMPTENDF2997(9, "SMPTENDF2997", "SMPTE-NDF29.97"),

        /**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
        TIME(10, "TIME", "TIME"),

        /**
	 * The '<em><b>TCF</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #TCF_VALUE
	 * @generated
	 * @ordered
	 */
        TCF(11, "TCF", "TCF"),

        /**
	 * The '<em><b>XPTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #XPTR_VALUE
	 * @generated
	 * @ordered
	 */
        XPTR(12, "XPTR", "XPTR");

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
	 * The '<em><b>IDREF</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>IDREF</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #IDREF
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int IDREF_VALUE = 1;

        /**
	 * The '<em><b>SMIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>SMIL</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #SMIL
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int SMIL_VALUE = 2;

        /**
	 * The '<em><b>MIDI</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>MIDI</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #MIDI
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int MIDI_VALUE = 3;

        /**
	 * The '<em><b>SMPTE25</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>SMPTE25</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #SMPTE25
	 * @model literal="SMPTE-25"
	 * @generated
	 * @ordered
	 */
        public static final int SMPTE25_VALUE = 4;

        /**
	 * The '<em><b>SMPTE24</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>SMPTE24</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #SMPTE24
	 * @model literal="SMPTE-24"
	 * @generated
	 * @ordered
	 */
        public static final int SMPTE24_VALUE = 5;

        /**
	 * The '<em><b>SMPTEDF30</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>SMPTEDF30</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #SMPTEDF30
	 * @model literal="SMPTE-DF30"
	 * @generated
	 * @ordered
	 */
        public static final int SMPTEDF30_VALUE = 6;

        /**
	 * The '<em><b>SMPTENDF30</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>SMPTENDF30</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #SMPTENDF30
	 * @model literal="SMPTE-NDF30"
	 * @generated
	 * @ordered
	 */
        public static final int SMPTENDF30_VALUE = 7;

        /**
	 * The '<em><b>SMPTEDF2997</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>SMPTEDF2997</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #SMPTEDF2997
	 * @model literal="SMPTE-DF29.97"
	 * @generated
	 * @ordered
	 */
        public static final int SMPTEDF2997_VALUE = 8;

        /**
	 * The '<em><b>SMPTENDF2997</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>SMPTENDF2997</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #SMPTENDF2997
	 * @model literal="SMPTE-NDF29.97"
	 * @generated
	 * @ordered
	 */
        public static final int SMPTENDF2997_VALUE = 9;

        /**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>TIME</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #TIME
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int TIME_VALUE = 10;

        /**
	 * The '<em><b>TCF</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>TCF</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #TCF
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int TCF_VALUE = 11;

        /**
	 * The '<em><b>XPTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>XPTR</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #XPTR
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int XPTR_VALUE = 12;

        /**
	 * An array of all the '<em><b>BETYPE Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private static final BETYPEType[] VALUES_ARRAY =
                new BETYPEType[] {
			BYTE,
			IDREF,
			SMIL,
			MIDI,
			SMPTE25,
			SMPTE24,
			SMPTEDF30,
			SMPTENDF30,
			SMPTEDF2997,
			SMPTENDF2997,
			TIME,
			TCF,
			XPTR,
		};

        /**
	 * A public read-only list of all the '<em><b>BETYPE Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static final List<BETYPEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
	 * Returns the '<em><b>BETYPE Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static BETYPEType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BETYPEType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

        /**
	 * Returns the '<em><b>BETYPE Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static BETYPEType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BETYPEType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

        /**
	 * Returns the '<em><b>BETYPE Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static BETYPEType get(int value) {
		switch (value) {
			case BYTE_VALUE: return BYTE;
			case IDREF_VALUE: return IDREF;
			case SMIL_VALUE: return SMIL;
			case MIDI_VALUE: return MIDI;
			case SMPTE25_VALUE: return SMPTE25;
			case SMPTE24_VALUE: return SMPTE24;
			case SMPTEDF30_VALUE: return SMPTEDF30;
			case SMPTENDF30_VALUE: return SMPTENDF30;
			case SMPTEDF2997_VALUE: return SMPTEDF2997;
			case SMPTENDF2997_VALUE: return SMPTENDF2997;
			case TIME_VALUE: return TIME;
			case TCF_VALUE: return TCF;
			case XPTR_VALUE: return XPTR;
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
        private BETYPEType(int value, String name, String literal) {
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
        
} //BETYPEType
