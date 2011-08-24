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
 * A representation of the model object '<em><b>Name Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.NameDefinition#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.NameDefinition#getNameTitleGroup <em>Name Title Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.NameDefinition#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getNameDefinition()
 * @model extendedMetaData="name='nameDefinition' kind='elementOnly'"
 * @generated
 */
public interface NameDefinition extends NameBaseDefinition {
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
	 * @see gov.loc.mods.mods.MODSPackage#getNameDefinition_AltRepGroup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='altRepGroup'"
	 * @generated
	 */
	String getAltRepGroup();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.NameDefinition#getAltRepGroup <em>Alt Rep Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Rep Group</em>' attribute.
	 * @see #getAltRepGroup()
	 * @generated
	 */
	void setAltRepGroup(String value);

	/**
	 * Returns the value of the '<em><b>Name Title Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Title Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Title Group</em>' attribute.
	 * @see #setNameTitleGroup(String)
	 * @see gov.loc.mods.mods.MODSPackage#getNameDefinition_NameTitleGroup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nameTitleGroup'"
	 * @generated
	 */
	String getNameTitleGroup();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.NameDefinition#getNameTitleGroup <em>Name Title Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Title Group</em>' attribute.
	 * @see #getNameTitleGroup()
	 * @generated
	 */
	void setNameTitleGroup(String value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mods.mods.UsageAttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see gov.loc.mods.mods.UsageAttributeDefinition
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #setUsage(UsageAttributeDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getNameDefinition_Usage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='usage'"
	 * @generated
	 */
	UsageAttributeDefinition getUsage();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.NameDefinition#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see gov.loc.mods.mods.UsageAttributeDefinition
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(UsageAttributeDefinition value);

	/**
	 * Unsets the value of the '{@link gov.loc.mods.mods.NameDefinition#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsage()
	 * @see #getUsage()
	 * @see #setUsage(UsageAttributeDefinition)
	 * @generated
	 */
	void unsetUsage();

	/**
	 * Returns whether the value of the '{@link gov.loc.mods.mods.NameDefinition#getUsage <em>Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage</em>' attribute is set.
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @see #setUsage(UsageAttributeDefinition)
	 * @generated
	 */
	boolean isSetUsage();

} // NameDefinition
