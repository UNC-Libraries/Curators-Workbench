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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Of Resource Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.TypeOfResourceDefinition#getValue <em>Value</em>}</li>
 *   <li>{@link gov.loc.mods.mods.TypeOfResourceDefinition#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.TypeOfResourceDefinition#getCollection <em>Collection</em>}</li>
 *   <li>{@link gov.loc.mods.mods.TypeOfResourceDefinition#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.TypeOfResourceDefinition#getManuscript <em>Manuscript</em>}</li>
 *   <li>{@link gov.loc.mods.mods.TypeOfResourceDefinition#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getTypeOfResourceDefinition()
 * @model extendedMetaData="name='typeOfResourceDefinition' kind='simple'"
 * @generated
 */
public interface TypeOfResourceDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mods.mods.ResourceTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see gov.loc.mods.mods.ResourceTypeDefinition
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(ResourceTypeDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getTypeOfResourceDefinition_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	ResourceTypeDefinition getValue();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see gov.loc.mods.mods.ResourceTypeDefinition
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ResourceTypeDefinition value);

	/**
	 * Unsets the value of the '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(ResourceTypeDefinition)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(ResourceTypeDefinition)
	 * @generated
	 */
	boolean isSetValue();

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
	 * @see gov.loc.mods.mods.MODSPackage#getTypeOfResourceDefinition_AltRepGroup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='altRepGroup'"
	 * @generated
	 */
	String getAltRepGroup();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getAltRepGroup <em>Alt Rep Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Rep Group</em>' attribute.
	 * @see #getAltRepGroup()
	 * @generated
	 */
	void setAltRepGroup(String value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mods.mods.YesDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' attribute.
	 * @see gov.loc.mods.mods.YesDefinition
	 * @see #isSetCollection()
	 * @see #unsetCollection()
	 * @see #setCollection(YesDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getTypeOfResourceDefinition_Collection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='collection'"
	 * @generated
	 */
	YesDefinition getCollection();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getCollection <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' attribute.
	 * @see gov.loc.mods.mods.YesDefinition
	 * @see #isSetCollection()
	 * @see #unsetCollection()
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(YesDefinition value);

	/**
	 * Unsets the value of the '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getCollection <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCollection()
	 * @see #getCollection()
	 * @see #setCollection(YesDefinition)
	 * @generated
	 */
	void unsetCollection();

	/**
	 * Returns whether the value of the '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getCollection <em>Collection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Collection</em>' attribute is set.
	 * @see #unsetCollection()
	 * @see #getCollection()
	 * @see #setCollection(YesDefinition)
	 * @generated
	 */
	boolean isSetCollection();

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
	 * @see gov.loc.mods.mods.MODSPackage#getTypeOfResourceDefinition_DisplayLabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='displayLabel'"
	 * @generated
	 */
	String getDisplayLabel();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getDisplayLabel <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Label</em>' attribute.
	 * @see #getDisplayLabel()
	 * @generated
	 */
	void setDisplayLabel(String value);

	/**
	 * Returns the value of the '<em><b>Manuscript</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mods.mods.YesDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manuscript</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manuscript</em>' attribute.
	 * @see gov.loc.mods.mods.YesDefinition
	 * @see #isSetManuscript()
	 * @see #unsetManuscript()
	 * @see #setManuscript(YesDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getTypeOfResourceDefinition_Manuscript()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='manuscript'"
	 * @generated
	 */
	YesDefinition getManuscript();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getManuscript <em>Manuscript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manuscript</em>' attribute.
	 * @see gov.loc.mods.mods.YesDefinition
	 * @see #isSetManuscript()
	 * @see #unsetManuscript()
	 * @see #getManuscript()
	 * @generated
	 */
	void setManuscript(YesDefinition value);

	/**
	 * Unsets the value of the '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getManuscript <em>Manuscript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetManuscript()
	 * @see #getManuscript()
	 * @see #setManuscript(YesDefinition)
	 * @generated
	 */
	void unsetManuscript();

	/**
	 * Returns whether the value of the '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getManuscript <em>Manuscript</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Manuscript</em>' attribute is set.
	 * @see #unsetManuscript()
	 * @see #getManuscript()
	 * @see #setManuscript(YesDefinition)
	 * @generated
	 */
	boolean isSetManuscript();

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
	 * @see gov.loc.mods.mods.MODSPackage#getTypeOfResourceDefinition_Usage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='usage'"
	 * @generated
	 */
	UsageAttributeDefinition getUsage();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getUsage <em>Usage</em>}' attribute.
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
	 * Unsets the value of the '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsage()
	 * @see #getUsage()
	 * @see #setUsage(UsageAttributeDefinition)
	 * @generated
	 */
	void unsetUsage();

	/**
	 * Returns whether the value of the '{@link gov.loc.mods.mods.TypeOfResourceDefinition#getUsage <em>Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage</em>' attribute is set.
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @see #setUsage(UsageAttributeDefinition)
	 * @generated
	 */
	boolean isSetUsage();

} // TypeOfResourceDefinition
