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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchical Geographic Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getExtraterrestrialArea <em>Extraterrestrial Area</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getContinent <em>Continent</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getCountry <em>Country</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getProvince <em>Province</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getRegion <em>Region</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getState <em>State</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getTerritory <em>Territory</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getCounty <em>County</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getCity <em>City</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getCitySection <em>City Section</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getIsland <em>Island</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getArea <em>Area</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getAuthority <em>Authority</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getAuthorityURI <em>Authority URI</em>}</li>
 *   <li>{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getValueURI <em>Value URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition()
 * @model extendedMetaData="name='hierarchicalGeographicDefinition' kind='elementOnly'"
 * @generated
 */
public interface HierarchicalGeographicDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Extraterrestrial Area</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.XsString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extraterrestrial Area</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extraterrestrial Area</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_ExtraterrestrialArea()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extraterrestrialArea' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XsString> getExtraterrestrialArea();

	/**
	 * Returns the value of the '<em><b>Continent</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.XsString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continent</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_Continent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='continent' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XsString> getContinent();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.XsString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_Country()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XsString> getCountry();

	/**
	 * Returns the value of the '<em><b>Province</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.XsString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Province</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Province</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_Province()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='province' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XsString> getProvince();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.XsString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_Region()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='region' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XsString> getRegion();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.XsString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_State()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XsString> getState();

	/**
	 * Returns the value of the '<em><b>Territory</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.XsString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Territory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Territory</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_Territory()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='territory' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XsString> getTerritory();

	/**
	 * Returns the value of the '<em><b>County</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.XsString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>County</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_County()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='county' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XsString> getCounty();

	/**
	 * Returns the value of the '<em><b>City</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.XsString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_City()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='city' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XsString> getCity();

	/**
	 * Returns the value of the '<em><b>City Section</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.XsString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Section</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Section</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_CitySection()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='citySection' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XsString> getCitySection();

	/**
	 * Returns the value of the '<em><b>Island</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.XsString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Island</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Island</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_Island()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='island' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XsString> getIsland();

	/**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.XsString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_Area()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='area' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XsString> getArea();

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
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_Authority()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='authority'"
	 * @generated
	 */
	String getAuthority();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getAuthority <em>Authority</em>}' attribute.
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
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_AuthorityURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='authorityURI'"
	 * @generated
	 */
	String getAuthorityURI();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getAuthorityURI <em>Authority URI</em>}' attribute.
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
	 * @see gov.loc.mods.mods.MODSPackage#getHierarchicalGeographicDefinition_ValueURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='valueURI'"
	 * @generated
	 */
	String getValueURI();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition#getValueURI <em>Value URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value URI</em>' attribute.
	 * @see #getValueURI()
	 * @generated
	 */
	void setValueURI(String value);

} // HierarchicalGeographicDefinition
