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
 * A representation of the model object '<em><b>Geographic Code Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.GeographicCodeDefinition#getAuthority <em>Authority</em>}</li>
 *   <li>{@link gov.loc.mods.mods.GeographicCodeDefinition#getAuthorityURI <em>Authority URI</em>}</li>
 *   <li>{@link gov.loc.mods.mods.GeographicCodeDefinition#getValueURI <em>Value URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getGeographicCodeDefinition()
 * @model extendedMetaData="name='geographicCodeDefinition' kind='simple'"
 * @generated
 */
public interface GeographicCodeDefinition extends XsString {
	/**
	 * Returns the value of the '<em><b>Authority</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mods.mods.PlaceAuthorityAttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority</em>' attribute.
	 * @see gov.loc.mods.mods.PlaceAuthorityAttributeDefinition
	 * @see #isSetAuthority()
	 * @see #unsetAuthority()
	 * @see #setAuthority(PlaceAuthorityAttributeDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getGeographicCodeDefinition_Authority()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='authority'"
	 * @generated
	 */
	PlaceAuthorityAttributeDefinition getAuthority();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.GeographicCodeDefinition#getAuthority <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' attribute.
	 * @see gov.loc.mods.mods.PlaceAuthorityAttributeDefinition
	 * @see #isSetAuthority()
	 * @see #unsetAuthority()
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(PlaceAuthorityAttributeDefinition value);

	/**
	 * Unsets the value of the '{@link gov.loc.mods.mods.GeographicCodeDefinition#getAuthority <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuthority()
	 * @see #getAuthority()
	 * @see #setAuthority(PlaceAuthorityAttributeDefinition)
	 * @generated
	 */
	void unsetAuthority();

	/**
	 * Returns whether the value of the '{@link gov.loc.mods.mods.GeographicCodeDefinition#getAuthority <em>Authority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Authority</em>' attribute is set.
	 * @see #unsetAuthority()
	 * @see #getAuthority()
	 * @see #setAuthority(PlaceAuthorityAttributeDefinition)
	 * @generated
	 */
	boolean isSetAuthority();

	/**
	 * Returns the value of the '<em><b>Authority URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authority URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority URI</em>' attribute.
	 * @see #setAuthorityURI(String)
	 * @see gov.loc.mods.mods.MODSPackage#getGeographicCodeDefinition_AuthorityURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='authorityURI'"
	 * @generated
	 */
	String getAuthorityURI();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.GeographicCodeDefinition#getAuthorityURI <em>Authority URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority URI</em>' attribute.
	 * @see #getAuthorityURI()
	 * @generated
	 */
	void setAuthorityURI(String value);

	/**
	 * Returns the value of the '<em><b>Value URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value URI</em>' attribute.
	 * @see #setValueURI(String)
	 * @see gov.loc.mods.mods.MODSPackage#getGeographicCodeDefinition_ValueURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='valueURI'"
	 * @generated
	 */
	String getValueURI();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.GeographicCodeDefinition#getValueURI <em>Value URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value URI</em>' attribute.
	 * @see #getValueURI()
	 * @generated
	 */
	void setValueURI(String value);

} // GeographicCodeDefinition
