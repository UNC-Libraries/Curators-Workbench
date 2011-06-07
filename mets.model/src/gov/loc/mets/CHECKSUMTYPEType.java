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
 * A representation of the literals of the enumeration '<em><b>CHECKSUMTYPE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mets.MetsPackage#getCHECKSUMTYPEType()
 * @model extendedMetaData="name='CHECKSUMTYPE_._type'"
 * @generated
 */
public enum CHECKSUMTYPEType implements Enumerator {
        /**
	 * The '<em><b>Adler32</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #ADLER32_VALUE
	 * @generated
	 * @ordered
	 */
        ADLER32(0, "Adler32", "Adler-32"),

        /**
	 * The '<em><b>CRC32</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #CRC32_VALUE
	 * @generated
	 * @ordered
	 */
        CRC32(1, "CRC32", "CRC32"),

        /**
	 * The '<em><b>HAVAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #HAVAL_VALUE
	 * @generated
	 * @ordered
	 */
        HAVAL(2, "HAVAL", "HAVAL"),

        /**
	 * The '<em><b>MD5</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #MD5_VALUE
	 * @generated
	 * @ordered
	 */
        MD5(3, "MD5", "MD5"),

        /**
	 * The '<em><b>MNP</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #MNP_VALUE
	 * @generated
	 * @ordered
	 */
        MNP(4, "MNP", "MNP"),

        /**
	 * The '<em><b>SHA1</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #SHA1_VALUE
	 * @generated
	 * @ordered
	 */
        SHA1(5, "SHA1", "SHA-1"),

        /**
	 * The '<em><b>SHA256</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #SHA256_VALUE
	 * @generated
	 * @ordered
	 */
        SHA256(6, "SHA256", "SHA-256"),

        /**
	 * The '<em><b>SHA384</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #SHA384_VALUE
	 * @generated
	 * @ordered
	 */
        SHA384(7, "SHA384", "SHA-384"),

        /**
	 * The '<em><b>SHA512</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #SHA512_VALUE
	 * @generated
	 * @ordered
	 */
        SHA512(8, "SHA512", "SHA-512"),

        /**
	 * The '<em><b>TIGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #TIGER_VALUE
	 * @generated
	 * @ordered
	 */
        TIGER(9, "TIGER", "TIGER"),

        /**
	 * The '<em><b>WHIRLPOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #WHIRLPOOL_VALUE
	 * @generated
	 * @ordered
	 */
        WHIRLPOOL(10, "WHIRLPOOL", "WHIRLPOOL");

        /**
	 * The '<em><b>Adler32</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Adler32</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #ADLER32
	 * @model name="Adler32" literal="Adler-32"
	 * @generated
	 * @ordered
	 */
        public static final int ADLER32_VALUE = 0;

        /**
	 * The '<em><b>CRC32</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>CRC32</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #CRC32
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int CRC32_VALUE = 1;

        /**
	 * The '<em><b>HAVAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>HAVAL</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #HAVAL
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int HAVAL_VALUE = 2;

        /**
	 * The '<em><b>MD5</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>MD5</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #MD5
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int MD5_VALUE = 3;

        /**
	 * The '<em><b>MNP</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>MNP</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #MNP
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int MNP_VALUE = 4;

        /**
	 * The '<em><b>SHA1</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>SHA1</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #SHA1
	 * @model literal="SHA-1"
	 * @generated
	 * @ordered
	 */
        public static final int SHA1_VALUE = 5;

        /**
	 * The '<em><b>SHA256</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>SHA256</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #SHA256
	 * @model literal="SHA-256"
	 * @generated
	 * @ordered
	 */
        public static final int SHA256_VALUE = 6;

        /**
	 * The '<em><b>SHA384</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>SHA384</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #SHA384
	 * @model literal="SHA-384"
	 * @generated
	 * @ordered
	 */
        public static final int SHA384_VALUE = 7;

        /**
	 * The '<em><b>SHA512</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>SHA512</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #SHA512
	 * @model literal="SHA-512"
	 * @generated
	 * @ordered
	 */
        public static final int SHA512_VALUE = 8;

        /**
	 * The '<em><b>TIGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>TIGER</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #TIGER
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int TIGER_VALUE = 9;

        /**
	 * The '<em><b>WHIRLPOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>WHIRLPOOL</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #WHIRLPOOL
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int WHIRLPOOL_VALUE = 10;

        /**
	 * An array of all the '<em><b>CHECKSUMTYPE Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private static final CHECKSUMTYPEType[] VALUES_ARRAY =
                new CHECKSUMTYPEType[] {
			ADLER32,
			CRC32,
			HAVAL,
			MD5,
			MNP,
			SHA1,
			SHA256,
			SHA384,
			SHA512,
			TIGER,
			WHIRLPOOL,
		};

        /**
	 * A public read-only list of all the '<em><b>CHECKSUMTYPE Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static final List<CHECKSUMTYPEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
	 * Returns the '<em><b>CHECKSUMTYPE Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static CHECKSUMTYPEType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CHECKSUMTYPEType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

        /**
	 * Returns the '<em><b>CHECKSUMTYPE Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static CHECKSUMTYPEType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CHECKSUMTYPEType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

        /**
	 * Returns the '<em><b>CHECKSUMTYPE Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static CHECKSUMTYPEType get(int value) {
		switch (value) {
			case ADLER32_VALUE: return ADLER32;
			case CRC32_VALUE: return CRC32;
			case HAVAL_VALUE: return HAVAL;
			case MD5_VALUE: return MD5;
			case MNP_VALUE: return MNP;
			case SHA1_VALUE: return SHA1;
			case SHA256_VALUE: return SHA256;
			case SHA384_VALUE: return SHA384;
			case SHA512_VALUE: return SHA512;
			case TIGER_VALUE: return TIGER;
			case WHIRLPOOL_VALUE: return WHIRLPOOL;
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
        private CHECKSUMTYPEType(int value, String name, String literal) {
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
        
} //CHECKSUMTYPEType
