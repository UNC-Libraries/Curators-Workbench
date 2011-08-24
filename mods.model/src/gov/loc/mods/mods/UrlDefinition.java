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
 * A representation of the model object '<em><b>Url Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.UrlDefinition#getValue <em>Value</em>}</li>
 *   <li>{@link gov.loc.mods.mods.UrlDefinition#getAccess <em>Access</em>}</li>
 *   <li>{@link gov.loc.mods.mods.UrlDefinition#getDateLastAccessed <em>Date Last Accessed</em>}</li>
 *   <li>{@link gov.loc.mods.mods.UrlDefinition#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.UrlDefinition#getNote <em>Note</em>}</li>
 *   <li>{@link gov.loc.mods.mods.UrlDefinition#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getUrlDefinition()
 * @model extendedMetaData="name='urlDefinition' kind='simple'"
 * @generated
 */
public interface UrlDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see gov.loc.mods.mods.MODSPackage#getUrlDefinition_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.UrlDefinition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mods.mods.UrlAccessAttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see gov.loc.mods.mods.UrlAccessAttributeDefinition
	 * @see #isSetAccess()
	 * @see #unsetAccess()
	 * @see #setAccess(UrlAccessAttributeDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getUrlDefinition_Access()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='access'"
	 * @generated
	 */
	UrlAccessAttributeDefinition getAccess();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.UrlDefinition#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see gov.loc.mods.mods.UrlAccessAttributeDefinition
	 * @see #isSetAccess()
	 * @see #unsetAccess()
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(UrlAccessAttributeDefinition value);

	/**
	 * Unsets the value of the '{@link gov.loc.mods.mods.UrlDefinition#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccess()
	 * @see #getAccess()
	 * @see #setAccess(UrlAccessAttributeDefinition)
	 * @generated
	 */
	void unsetAccess();

	/**
	 * Returns whether the value of the '{@link gov.loc.mods.mods.UrlDefinition#getAccess <em>Access</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access</em>' attribute is set.
	 * @see #unsetAccess()
	 * @see #getAccess()
	 * @see #setAccess(UrlAccessAttributeDefinition)
	 * @generated
	 */
	boolean isSetAccess();

	/**
	 * Returns the value of the '<em><b>Date Last Accessed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Last Accessed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Last Accessed</em>' attribute.
	 * @see #setDateLastAccessed(String)
	 * @see gov.loc.mods.mods.MODSPackage#getUrlDefinition_DateLastAccessed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dateLastAccessed'"
	 * @generated
	 */
	String getDateLastAccessed();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.UrlDefinition#getDateLastAccessed <em>Date Last Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Last Accessed</em>' attribute.
	 * @see #getDateLastAccessed()
	 * @generated
	 */
	void setDateLastAccessed(String value);

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
	 * @see gov.loc.mods.mods.MODSPackage#getUrlDefinition_DisplayLabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='displayLabel'"
	 * @generated
	 */
	String getDisplayLabel();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.UrlDefinition#getDisplayLabel <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Label</em>' attribute.
	 * @see #getDisplayLabel()
	 * @generated
	 */
	void setDisplayLabel(String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see gov.loc.mods.mods.MODSPackage#getUrlDefinition_Note()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='note'"
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.UrlDefinition#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mods.mods.UrlUsageAttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see gov.loc.mods.mods.UrlUsageAttributeDefinition
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #setUsage(UrlUsageAttributeDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getUrlDefinition_Usage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='usage'"
	 * @generated
	 */
	UrlUsageAttributeDefinition getUsage();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.UrlDefinition#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see gov.loc.mods.mods.UrlUsageAttributeDefinition
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(UrlUsageAttributeDefinition value);

	/**
	 * Unsets the value of the '{@link gov.loc.mods.mods.UrlDefinition#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsage()
	 * @see #getUsage()
	 * @see #setUsage(UrlUsageAttributeDefinition)
	 * @generated
	 */
	void unsetUsage();

	/**
	 * Returns whether the value of the '{@link gov.loc.mods.mods.UrlDefinition#getUsage <em>Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage</em>' attribute is set.
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @see #setUsage(UrlUsageAttributeDefinition)
	 * @generated
	 */
	boolean isSetUsage();

} // UrlDefinition
