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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.IdentifierDefinition#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.IdentifierDefinition#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.IdentifierDefinition#getInvalid <em>Invalid</em>}</li>
 *   <li>{@link gov.loc.mods.mods.IdentifierDefinition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getIdentifierDefinition()
 * @model extendedMetaData="name='identifierDefinition' kind='simple'"
 * @generated
 */
public interface IdentifierDefinition extends XsString {
	/**
	 * Returns the value of the '<em><b>Alt Rep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Rep Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Rep Group</em>' attribute.
	 * @see #setAltRepGroup(String)
	 * @see gov.loc.mods.mods.MODSPackage#getIdentifierDefinition_AltRepGroup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='altRepGroup'"
	 * @generated
	 */
	String getAltRepGroup();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.IdentifierDefinition#getAltRepGroup <em>Alt Rep Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Rep Group</em>' attribute.
	 * @see #getAltRepGroup()
	 * @generated
	 */
	void setAltRepGroup(String value);

	/**
	 * Returns the value of the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Label</em>' attribute.
	 * @see #setDisplayLabel(String)
	 * @see gov.loc.mods.mods.MODSPackage#getIdentifierDefinition_DisplayLabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='displayLabel'"
	 * @generated
	 */
	String getDisplayLabel();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.IdentifierDefinition#getDisplayLabel <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Label</em>' attribute.
	 * @see #getDisplayLabel()
	 * @generated
	 */
	void setDisplayLabel(String value);

	/**
	 * Returns the value of the '<em><b>Invalid</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mods.mods.YesDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invalid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid</em>' attribute.
	 * @see gov.loc.mods.mods.YesDefinition
	 * @see #isSetInvalid()
	 * @see #unsetInvalid()
	 * @see #setInvalid(YesDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getIdentifierDefinition_Invalid()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='invalid'"
	 * @generated
	 */
	YesDefinition getInvalid();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.IdentifierDefinition#getInvalid <em>Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid</em>' attribute.
	 * @see gov.loc.mods.mods.YesDefinition
	 * @see #isSetInvalid()
	 * @see #unsetInvalid()
	 * @see #getInvalid()
	 * @generated
	 */
	void setInvalid(YesDefinition value);

	/**
	 * Unsets the value of the '{@link gov.loc.mods.mods.IdentifierDefinition#getInvalid <em>Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInvalid()
	 * @see #getInvalid()
	 * @see #setInvalid(YesDefinition)
	 * @generated
	 */
	void unsetInvalid();

	/**
	 * Returns whether the value of the '{@link gov.loc.mods.mods.IdentifierDefinition#getInvalid <em>Invalid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Invalid</em>' attribute is set.
	 * @see #unsetInvalid()
	 * @see #getInvalid()
	 * @see #setInvalid(YesDefinition)
	 * @generated
	 */
	boolean isSetInvalid();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gov.loc.mods.mods.MODSPackage#getIdentifierDefinition_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.IdentifierDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // IdentifierDefinition
