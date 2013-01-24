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
package gov.loc.mods.mods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Related Item Type Attribute Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getRelatedItemTypeAttributeDefinition()
 * @model extendedMetaData="name='relatedItemTypeAttributeDefinition'"
 * @generated
 */
public enum RelatedItemTypeAttributeDefinition implements Enumerator {
	/**
	 * The '<em><b>Preceding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECEDING_VALUE
	 * @generated
	 * @ordered
	 */
	PRECEDING(0, "preceding", "preceding"),

	/**
	 * The '<em><b>Succeeding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCEEDING_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCEEDING(1, "succeeding", "succeeding"),

	/**
	 * The '<em><b>Original</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORIGINAL_VALUE
	 * @generated
	 * @ordered
	 */
	ORIGINAL(2, "original", "original"),

	/**
	 * The '<em><b>Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_VALUE
	 * @generated
	 * @ordered
	 */
	HOST(3, "host", "host"),

	/**
	 * The '<em><b>Constituent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTITUENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTITUENT(4, "constituent", "constituent"),

	/**
	 * The '<em><b>Series</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIES_VALUE
	 * @generated
	 * @ordered
	 */
	SERIES(5, "series", "series"),

	/**
	 * The '<em><b>Other Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_VERSION(6, "otherVersion", "otherVersion"),

	/**
	 * The '<em><b>Other Format</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_FORMAT(7, "otherFormat", "otherFormat"),

	/**
	 * The '<em><b>Is Referenced By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REFERENCED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_REFERENCED_BY(8, "isReferencedBy", "isReferencedBy"),

	/**
	 * The '<em><b>References</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCES_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCES(9, "references", "references"),

	/**
	 * The '<em><b>Review Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEW_OF_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEW_OF(10, "reviewOf", "reviewOf");

	/**
	 * The '<em><b>Preceding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preceding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRECEDING
	 * @model name="preceding"
	 * @generated
	 * @ordered
	 */
	public static final int PRECEDING_VALUE = 0;

	/**
	 * The '<em><b>Succeeding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Succeeding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCEEDING
	 * @model name="succeeding"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCEEDING_VALUE = 1;

	/**
	 * The '<em><b>Original</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Original</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORIGINAL
	 * @model name="original"
	 * @generated
	 * @ordered
	 */
	public static final int ORIGINAL_VALUE = 2;

	/**
	 * The '<em><b>Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Host</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOST
	 * @model name="host"
	 * @generated
	 * @ordered
	 */
	public static final int HOST_VALUE = 3;

	/**
	 * The '<em><b>Constituent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Constituent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTITUENT
	 * @model name="constituent"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTITUENT_VALUE = 4;

	/**
	 * The '<em><b>Series</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Series</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERIES
	 * @model name="series"
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_VALUE = 5;

	/**
	 * The '<em><b>Other Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other Version</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_VERSION
	 * @model name="otherVersion"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VERSION_VALUE = 6;

	/**
	 * The '<em><b>Other Format</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other Format</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_FORMAT
	 * @model name="otherFormat"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_FORMAT_VALUE = 7;

	/**
	 * The '<em><b>Is Referenced By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Referenced By</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_REFERENCED_BY
	 * @model name="isReferencedBy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_REFERENCED_BY_VALUE = 8;

	/**
	 * The '<em><b>References</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>References</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFERENCES
	 * @model name="references"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCES_VALUE = 9;

	/**
	 * The '<em><b>Review Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Review Of</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVIEW_OF
	 * @model name="reviewOf"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEW_OF_VALUE = 10;

	/**
	 * An array of all the '<em><b>Related Item Type Attribute Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelatedItemTypeAttributeDefinition[] VALUES_ARRAY = new RelatedItemTypeAttributeDefinition[] {
			PRECEDING, SUCCEEDING, ORIGINAL, HOST, CONSTITUENT, SERIES,
			OTHER_VERSION, OTHER_FORMAT, IS_REFERENCED_BY, REFERENCES,
			REVIEW_OF, };

	/**
	 * A public read-only list of all the '<em><b>Related Item Type Attribute Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelatedItemTypeAttributeDefinition> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Related Item Type Attribute Definition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelatedItemTypeAttributeDefinition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelatedItemTypeAttributeDefinition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Related Item Type Attribute Definition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelatedItemTypeAttributeDefinition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelatedItemTypeAttributeDefinition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Related Item Type Attribute Definition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelatedItemTypeAttributeDefinition get(int value) {
		switch (value) {
		case PRECEDING_VALUE:
			return PRECEDING;
		case SUCCEEDING_VALUE:
			return SUCCEEDING;
		case ORIGINAL_VALUE:
			return ORIGINAL;
		case HOST_VALUE:
			return HOST;
		case CONSTITUENT_VALUE:
			return CONSTITUENT;
		case SERIES_VALUE:
			return SERIES;
		case OTHER_VERSION_VALUE:
			return OTHER_VERSION;
		case OTHER_FORMAT_VALUE:
			return OTHER_FORMAT;
		case IS_REFERENCED_BY_VALUE:
			return IS_REFERENCED_BY;
		case REFERENCES_VALUE:
			return REFERENCES;
		case REVIEW_OF_VALUE:
			return REVIEW_OF;
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
	private RelatedItemTypeAttributeDefinition(int value, String name,
			String literal) {
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

} //RelatedItemTypeAttributeDefinition
