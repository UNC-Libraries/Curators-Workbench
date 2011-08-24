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
 * A representation of the model object '<em><b>Temporal Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.TemporalDefinition#getAuthority <em>Authority</em>}</li>
 *   <li>{@link gov.loc.mods.mods.TemporalDefinition#getAuthorityURI <em>Authority URI</em>}</li>
 *   <li>{@link gov.loc.mods.mods.TemporalDefinition#getValueURI <em>Value URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getTemporalDefinition()
 * @model extendedMetaData="name='temporalDefinition' kind='simple'"
 * @generated
 */
public interface TemporalDefinition extends DateDefinition {
	/**
	 * Returns the value of the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority</em>' attribute.
	 * @see #setAuthority(String)
	 * @see gov.loc.mods.mods.MODSPackage#getTemporalDefinition_Authority()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='authority'"
	 * @generated
	 */
	String getAuthority();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.TemporalDefinition#getAuthority <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' attribute.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(String value);

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
	 * @see gov.loc.mods.mods.MODSPackage#getTemporalDefinition_AuthorityURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='authorityURI'"
	 * @generated
	 */
	String getAuthorityURI();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.TemporalDefinition#getAuthorityURI <em>Authority URI</em>}' attribute.
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
	 * @see gov.loc.mods.mods.MODSPackage#getTemporalDefinition_ValueURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='valueURI'"
	 * @generated
	 */
	String getValueURI();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.TemporalDefinition#getValueURI <em>Value URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value URI</em>' attribute.
	 * @see #getValueURI()
	 * @generated
	 */
	void setValueURI(String value);

} // TemporalDefinition
