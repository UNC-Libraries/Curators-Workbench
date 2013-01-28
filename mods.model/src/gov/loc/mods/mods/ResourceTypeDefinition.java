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
 * A representation of the literals of the enumeration '<em><b>Resource Type Definition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage#getResourceTypeDefinition()
 * @model extendedMetaData="name='resourceTypeDefinition'"
 * @generated
 */
public enum ResourceTypeDefinition implements Enumerator {
	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(0, "text", "text"),

	/**
	 * The '<em><b>Cartographic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARTOGRAPHIC_VALUE
	 * @generated
	 * @ordered
	 */
	CARTOGRAPHIC(1, "cartographic", "cartographic"),

	/**
	 * The '<em><b>Notated Music</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTATED_MUSIC_VALUE
	 * @generated
	 * @ordered
	 */
	NOTATED_MUSIC(2, "notatedMusic", "notated music"),

	/**
	 * The '<em><b>Sound Recording Musical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND_RECORDING_MUSICAL_VALUE
	 * @generated
	 * @ordered
	 */
	SOUND_RECORDING_MUSICAL(3, "soundRecordingMusical", "sound recording-musical"),

	/**
	 * The '<em><b>Sound Recording Nonmusical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND_RECORDING_NONMUSICAL_VALUE
	 * @generated
	 * @ordered
	 */
	SOUND_RECORDING_NONMUSICAL(4, "soundRecordingNonmusical", "sound recording-nonmusical"),

	/**
	 * The '<em><b>Sound Recording</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND_RECORDING_VALUE
	 * @generated
	 * @ordered
	 */
	SOUND_RECORDING(5, "soundRecording", "sound recording"),

	/**
	 * The '<em><b>Still Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STILL_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	STILL_IMAGE(6, "stillImage", "still image"),

	/**
	 * The '<em><b>Moving Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVING_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MOVING_IMAGE(7, "movingImage", "moving image"),

	/**
	 * The '<em><b>Three Dimensional Object</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE_DIMENSIONAL_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	THREE_DIMENSIONAL_OBJECT(8, "threeDimensionalObject", "three dimensional object"),

	/**
	 * The '<em><b>Software Multimedia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_MULTIMEDIA_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_MULTIMEDIA(9, "softwareMultimedia", "software, multimedia"),

	/**
	 * The '<em><b>Mixed Material</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED_MATERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	MIXED_MATERIAL(10, "mixedMaterial", "mixed material"),

	/**
	 * The '<em><b></b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #__VALUE
	 * @generated
	 * @ordered
	 */
	_(11, "_", "");

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model name="text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 0;

	/**
	 * The '<em><b>Cartographic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cartographic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARTOGRAPHIC
	 * @model name="cartographic"
	 * @generated
	 * @ordered
	 */
	public static final int CARTOGRAPHIC_VALUE = 1;

	/**
	 * The '<em><b>Notated Music</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Notated Music</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTATED_MUSIC
	 * @model name="notatedMusic" literal="notated music"
	 * @generated
	 * @ordered
	 */
	public static final int NOTATED_MUSIC_VALUE = 2;

	/**
	 * The '<em><b>Sound Recording Musical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sound Recording Musical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUND_RECORDING_MUSICAL
	 * @model name="soundRecordingMusical" literal="sound recording-musical"
	 * @generated
	 * @ordered
	 */
	public static final int SOUND_RECORDING_MUSICAL_VALUE = 3;

	/**
	 * The '<em><b>Sound Recording Nonmusical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sound Recording Nonmusical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUND_RECORDING_NONMUSICAL
	 * @model name="soundRecordingNonmusical" literal="sound recording-nonmusical"
	 * @generated
	 * @ordered
	 */
	public static final int SOUND_RECORDING_NONMUSICAL_VALUE = 4;

	/**
	 * The '<em><b>Sound Recording</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sound Recording</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUND_RECORDING
	 * @model name="soundRecording" literal="sound recording"
	 * @generated
	 * @ordered
	 */
	public static final int SOUND_RECORDING_VALUE = 5;

	/**
	 * The '<em><b>Still Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Still Image</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STILL_IMAGE
	 * @model name="stillImage" literal="still image"
	 * @generated
	 * @ordered
	 */
	public static final int STILL_IMAGE_VALUE = 6;

	/**
	 * The '<em><b>Moving Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Moving Image</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVING_IMAGE
	 * @model name="movingImage" literal="moving image"
	 * @generated
	 * @ordered
	 */
	public static final int MOVING_IMAGE_VALUE = 7;

	/**
	 * The '<em><b>Three Dimensional Object</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Three Dimensional Object</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THREE_DIMENSIONAL_OBJECT
	 * @model name="threeDimensionalObject" literal="three dimensional object"
	 * @generated
	 * @ordered
	 */
	public static final int THREE_DIMENSIONAL_OBJECT_VALUE = 8;

	/**
	 * The '<em><b>Software Multimedia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Software Multimedia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_MULTIMEDIA
	 * @model name="softwareMultimedia" literal="software, multimedia"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_MULTIMEDIA_VALUE = 9;

	/**
	 * The '<em><b>Mixed Material</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mixed Material</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIXED_MATERIAL
	 * @model name="mixedMaterial" literal="mixed material"
	 * @generated
	 * @ordered
	 */
	public static final int MIXED_MATERIAL_VALUE = 10;

	/**
	 * The '<em><b></b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b></b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_
	 * @model literal=""
	 * @generated
	 * @ordered
	 */
	public static final int __VALUE = 11;

	/**
	 * An array of all the '<em><b>Resource Type Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceTypeDefinition[] VALUES_ARRAY = new ResourceTypeDefinition[] { TEXT, CARTOGRAPHIC,
			NOTATED_MUSIC, SOUND_RECORDING_MUSICAL, SOUND_RECORDING_NONMUSICAL, SOUND_RECORDING, STILL_IMAGE,
			MOVING_IMAGE, THREE_DIMENSIONAL_OBJECT, SOFTWARE_MULTIMEDIA, MIXED_MATERIAL, _, };

	/**
	 * A public read-only list of all the '<em><b>Resource Type Definition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceTypeDefinition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Type Definition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceTypeDefinition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceTypeDefinition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Type Definition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceTypeDefinition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceTypeDefinition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Type Definition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceTypeDefinition get(int value) {
		switch (value) {
			case TEXT_VALUE:
				return TEXT;
			case CARTOGRAPHIC_VALUE:
				return CARTOGRAPHIC;
			case NOTATED_MUSIC_VALUE:
				return NOTATED_MUSIC;
			case SOUND_RECORDING_MUSICAL_VALUE:
				return SOUND_RECORDING_MUSICAL;
			case SOUND_RECORDING_NONMUSICAL_VALUE:
				return SOUND_RECORDING_NONMUSICAL;
			case SOUND_RECORDING_VALUE:
				return SOUND_RECORDING;
			case STILL_IMAGE_VALUE:
				return STILL_IMAGE;
			case MOVING_IMAGE_VALUE:
				return MOVING_IMAGE;
			case THREE_DIMENSIONAL_OBJECT_VALUE:
				return THREE_DIMENSIONAL_OBJECT;
			case SOFTWARE_MULTIMEDIA_VALUE:
				return SOFTWARE_MULTIMEDIA;
			case MIXED_MATERIAL_VALUE:
				return MIXED_MATERIAL;
			case __VALUE:
				return _;
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
	private ResourceTypeDefinition(int value, String name, String literal) {
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

} //ResourceTypeDefinition
