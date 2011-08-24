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
 * A representation of the model object '<em><b>Record Info Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.RecordInfoDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RecordInfoDefinition#getRecordContentSource <em>Record Content Source</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RecordInfoDefinition#getRecordCreationDate <em>Record Creation Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RecordInfoDefinition#getRecordChangeDate <em>Record Change Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RecordInfoDefinition#getRecordIdentifier <em>Record Identifier</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RecordInfoDefinition#getLanguageOfCataloging <em>Language Of Cataloging</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RecordInfoDefinition#getRecordOrigin <em>Record Origin</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RecordInfoDefinition#getDescriptionStandard <em>Description Standard</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RecordInfoDefinition#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RecordInfoDefinition#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RecordInfoDefinition#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RecordInfoDefinition#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RecordInfoDefinition#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RecordInfoDefinition#getTransliteration <em>Transliteration</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition()
 * @model extendedMetaData="name='recordInfoDefinition' kind='elementOnly'"
 * @generated
 */
public interface RecordInfoDefinition extends EObject {
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
	 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Record Content Source</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.StringPlusAuthority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Content Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Content Source</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition_RecordContentSource()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recordContentSource' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<StringPlusAuthority> getRecordContentSource();

	/**
	 * Returns the value of the '<em><b>Record Creation Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.DateDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Creation Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Creation Date</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition_RecordCreationDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recordCreationDate' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DateDefinition> getRecordCreationDate();

	/**
	 * Returns the value of the '<em><b>Record Change Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.DateDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Change Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Change Date</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition_RecordChangeDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recordChangeDate' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DateDefinition> getRecordChangeDate();

	/**
	 * Returns the value of the '<em><b>Record Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.RecordIdentifierDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Identifier</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition_RecordIdentifier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recordIdentifier' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RecordIdentifierDefinition> getRecordIdentifier();

	/**
	 * Returns the value of the '<em><b>Language Of Cataloging</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.LanguageDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Of Cataloging</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Of Cataloging</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition_LanguageOfCataloging()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='languageOfCataloging' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LanguageDefinition> getLanguageOfCataloging();

	/**
	 * Returns the value of the '<em><b>Record Origin</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.XsString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Origin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Origin</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition_RecordOrigin()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recordOrigin' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XsString> getRecordOrigin();

	/**
	 * Returns the value of the '<em><b>Description Standard</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mods.mods.StringPlusAuthority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Standard</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Standard</em>' containment reference list.
	 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition_DescriptionStandard()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='descriptionStandard' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<StringPlusAuthority> getDescriptionStandard();

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
	 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition_AltRepGroup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='altRepGroup'"
	 * @generated
	 */
	String getAltRepGroup();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.RecordInfoDefinition#getAltRepGroup <em>Alt Rep Group</em>}' attribute.
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
	 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition_DisplayLabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='displayLabel'"
	 * @generated
	 */
	String getDisplayLabel();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.RecordInfoDefinition#getDisplayLabel <em>Display Label</em>}' attribute.
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
	 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lang'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.RecordInfoDefinition#getLang <em>Lang</em>}' attribute.
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
	 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition_Lang1()
	 * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang1();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.RecordInfoDefinition#getLang1 <em>Lang1</em>}' attribute.
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
	 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition_Script()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='script'"
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.RecordInfoDefinition#getScript <em>Script</em>}' attribute.
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
	 * @see gov.loc.mods.mods.MODSPackage#getRecordInfoDefinition_Transliteration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='transliteration'"
	 * @generated
	 */
	String getTransliteration();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.RecordInfoDefinition#getTransliteration <em>Transliteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transliteration</em>' attribute.
	 * @see #getTransliteration()
	 * @generated
	 */
	void setTransliteration(String value);

} // RecordInfoDefinition
