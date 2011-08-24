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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.LocationDefinition#getPhysicalLocation <em>Physical Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LocationDefinition#getShelfLocator <em>Shelf Locator</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LocationDefinition#getUrl <em>Url</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LocationDefinition#getHoldingSimple <em>Holding Simple</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LocationDefinition#getHoldingExternal <em>Holding External</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LocationDefinition#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LocationDefinition#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LocationDefinition#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LocationDefinition#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LocationDefinition#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LocationDefinition#getTransliteration <em>Transliteration</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getLocationDefinition()
 * @model extendedMetaData="name='locationDefinition' kind='elementOnly'"
 * @generated
 */
public interface LocationDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Physical Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.PhysicalLocationDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Location</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getLocationDefinition_PhysicalLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='physicalLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PhysicalLocationDefinition> getPhysicalLocation();

	/**
	 * Returns the value of the '<em><b>Shelf Locator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.XsString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shelf Locator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shelf Locator</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getLocationDefinition_ShelfLocator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shelfLocator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XsString> getShelfLocator();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.UrlDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getLocationDefinition_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UrlDefinition> getUrl();

	/**
	 * Returns the value of the '<em><b>Holding Simple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holding Simple</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holding Simple</em>' containment reference.
	 * @see #setHoldingSimple(HoldingSimpleDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getLocationDefinition_HoldingSimple()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='holdingSimple' namespace='##targetNamespace'"
	 * @generated
	 */
	HoldingSimpleDefinition getHoldingSimple();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.LocationDefinition#getHoldingSimple <em>Holding Simple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holding Simple</em>' containment reference.
	 * @see #getHoldingSimple()
	 * @generated
	 */
	void setHoldingSimple(HoldingSimpleDefinition value);

	/**
	 * Returns the value of the '<em><b>Holding External</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holding External</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holding External</em>' containment reference.
	 * @see #setHoldingExternal(ExtensionDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getLocationDefinition_HoldingExternal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='holdingExternal' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionDefinition getHoldingExternal();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.LocationDefinition#getHoldingExternal <em>Holding External</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holding External</em>' containment reference.
	 * @see #getHoldingExternal()
	 * @generated
	 */
	void setHoldingExternal(ExtensionDefinition value);

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
	 * @see gov.loc.mods.mods.MODSPackage#getLocationDefinition_AltRepGroup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='altRepGroup'"
	 * @generated
	 */
	String getAltRepGroup();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.LocationDefinition#getAltRepGroup <em>Alt Rep Group</em>}' attribute.
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
	 * @see gov.loc.mods.mods.MODSPackage#getLocationDefinition_DisplayLabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='displayLabel'"
	 * @generated
	 */
	String getDisplayLabel();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.LocationDefinition#getDisplayLabel <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Label</em>' attribute.
	 * @see #getDisplayLabel()
	 * @generated
	 */
	void setDisplayLabel(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see gov.loc.mods.mods.MODSPackage#getLocationDefinition_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lang'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.LocationDefinition#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attempting to install the relevant ISO 2- and 3-letter
	 *          codes as the enumerated possible values is probably never
	 *          going to be a realistic possibility.  See
	 *          RFC 3066 at http://www.ietf.org/rfc/rfc3066.txt and the IANA registry
	 *          at http://www.iana.org/assignments/lang-tag-apps.htm for
	 *          further information.
	 * 
	 *          The union allows for the 'un-declaration' of xml:lang with
	 *          the empty string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang1</em>' attribute.
	 * @see #setLang1(String)
	 * @see gov.loc.mods.mods.MODSPackage#getLocationDefinition_Lang1()
	 * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang1();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.LocationDefinition#getLang1 <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang1</em>' attribute.
	 * @see #getLang1()
	 * @generated
	 */
	void setLang1(String value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see gov.loc.mods.mods.MODSPackage#getLocationDefinition_Script()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='script'"
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.LocationDefinition#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

	/**
	 * Returns the value of the '<em><b>Transliteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transliteration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transliteration</em>' attribute.
	 * @see #setTransliteration(String)
	 * @see gov.loc.mods.mods.MODSPackage#getLocationDefinition_Transliteration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='transliteration'"
	 * @generated
	 */
	String getTransliteration();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.LocationDefinition#getTransliteration <em>Transliteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transliteration</em>' attribute.
	 * @see #getTransliteration()
	 * @generated
	 */
	void setTransliteration(String value);

} // LocationDefinition
