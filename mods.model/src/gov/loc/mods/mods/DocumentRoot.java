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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getAccessCondition <em>Access Condition</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getArea <em>Area</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getCaption <em>Caption</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getCartographics <em>Cartographics</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getCity <em>City</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getCitySection <em>City Section</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getClassification <em>Classification</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getContinent <em>Continent</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getCopyInformation <em>Copy Information</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getCopyrightDate <em>Copyright Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getCountry <em>Country</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getCounty <em>County</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getDate <em>Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getDateCaptured <em>Date Captured</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getDateIssued <em>Date Issued</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getDateModified <em>Date Modified</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getDateOther <em>Date Other</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getDateValid <em>Date Valid</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getDescriptionStandard <em>Description Standard</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getDetail <em>Detail</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getDigitalOrigin <em>Digital Origin</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getDisplayForm <em>Display Form</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getEdition <em>Edition</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getElectronicLocator <em>Electronic Locator</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getEnd <em>End</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getEnumerationAndChronology <em>Enumeration And Chronology</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getExtension <em>Extension</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getExtent <em>Extent</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getExtraterrestrialArea <em>Extraterrestrial Area</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getForm <em>Form</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getGenre <em>Genre</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getGeographic <em>Geographic</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getGeographicCode <em>Geographic Code</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getHierarchicalGeographic <em>Hierarchical Geographic</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getHoldingExternal <em>Holding External</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getHoldingSimple <em>Holding Simple</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getInternetMediaType <em>Internet Media Type</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getIsland <em>Island</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getIssuance <em>Issuance</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getLanguage <em>Language</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getLanguageOfCataloging <em>Language Of Cataloging</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getLanguageTerm <em>Language Term</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getList <em>List</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getMods <em>Mods</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getModsCollection <em>Mods Collection</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getNamePart <em>Name Part</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getNonSort <em>Non Sort</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getNote <em>Note</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getNumber <em>Number</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getOccupation <em>Occupation</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getOriginInfo <em>Origin Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getPart <em>Part</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getPartName <em>Part Name</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getPhysicalDescription <em>Physical Description</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getPhysicalLocation <em>Physical Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getPlace <em>Place</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getPlaceTerm <em>Place Term</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getProjection <em>Projection</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getProvince <em>Province</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getRecordChangeDate <em>Record Change Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getRecordContentSource <em>Record Content Source</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getRecordCreationDate <em>Record Creation Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getRecordIdentifier <em>Record Identifier</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getRecordInfo <em>Record Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getRecordOrigin <em>Record Origin</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getReformattingQuality <em>Reformatting Quality</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getRegion <em>Region</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getRelatedItem <em>Related Item</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getRoleTerm <em>Role Term</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getScale <em>Scale</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getScriptTerm <em>Script Term</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getShelfLocator <em>Shelf Locator</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getStart <em>Start</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getState <em>State</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getSubLocation <em>Sub Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getSubTitle <em>Sub Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getTableOfContents <em>Table Of Contents</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getTargetAudience <em>Target Audience</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getTerritory <em>Territory</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getText <em>Text</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getTitleInfo <em>Title Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getTopic <em>Topic</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getTotal <em>Total</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getTypeOfResource <em>Type Of Resource</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DocumentRoot#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(AbstractDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Abstract()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractDefinition getAbstract();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(AbstractDefinition value);

	/**
	 * Returns the value of the '<em><b>Access Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Condition</em>' containment reference.
	 * @see #setAccessCondition(AccessConditionDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_AccessCondition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='accessCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessConditionDefinition getAccessCondition();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getAccessCondition <em>Access Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Condition</em>' containment reference.
	 * @see #getAccessCondition()
	 * @generated
	 */
	void setAccessCondition(AccessConditionDefinition value);

	/**
	 * Returns the value of the '<em><b>Affiliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affiliation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affiliation</em>' containment reference.
	 * @see #setAffiliation(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Affiliation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='affiliation' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getAffiliation();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getAffiliation <em>Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affiliation</em>' containment reference.
	 * @see #getAffiliation()
	 * @generated
	 */
	void setAffiliation(XsString value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' containment reference.
	 * @see #setArea(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Area()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='area' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getArea();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getArea <em>Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' containment reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(XsString value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference.
	 * @see #setCaption(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Caption()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caption' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getCaption();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getCaption <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' containment reference.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(XsString value);

	/**
	 * Returns the value of the '<em><b>Cartographics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cartographics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartographics</em>' containment reference.
	 * @see #setCartographics(CartographicsDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Cartographics()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cartographics' namespace='##targetNamespace'"
	 * @generated
	 */
	CartographicsDefinition getCartographics();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getCartographics <em>Cartographics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartographics</em>' containment reference.
	 * @see #getCartographics()
	 * @generated
	 */
	void setCartographics(CartographicsDefinition value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' containment reference.
	 * @see #setCity(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_City()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='city' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getCity();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getCity <em>City</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' containment reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(XsString value);

	/**
	 * Returns the value of the '<em><b>City Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Section</em>' containment reference.
	 * @see #setCitySection(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_CitySection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='citySection' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getCitySection();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getCitySection <em>City Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Section</em>' containment reference.
	 * @see #getCitySection()
	 * @generated
	 */
	void setCitySection(XsString value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference.
	 * @see #setClassification(ClassificationDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Classification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassificationDefinition getClassification();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getClassification <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' containment reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(ClassificationDefinition value);

	/**
	 * Returns the value of the '<em><b>Continent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continent</em>' containment reference.
	 * @see #setContinent(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Continent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='continent' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getContinent();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getContinent <em>Continent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continent</em>' containment reference.
	 * @see #getContinent()
	 * @generated
	 */
	void setContinent(XsString value);

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Coordinates()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getCoordinates();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(XsString value);

	/**
	 * Returns the value of the '<em><b>Copy Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Information</em>' containment reference.
	 * @see #setCopyInformation(CopyInformationDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_CopyInformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='copyInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	CopyInformationDefinition getCopyInformation();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getCopyInformation <em>Copy Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Information</em>' containment reference.
	 * @see #getCopyInformation()
	 * @generated
	 */
	void setCopyInformation(CopyInformationDefinition value);

	/**
	 * Returns the value of the '<em><b>Copyright Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright Date</em>' containment reference.
	 * @see #setCopyrightDate(DateDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_CopyrightDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='copyrightDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateDefinition getCopyrightDate();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getCopyrightDate <em>Copyright Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Date</em>' containment reference.
	 * @see #getCopyrightDate()
	 * @generated
	 */
	void setCopyrightDate(DateDefinition value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Country()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getCountry();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(XsString value);

	/**
	 * Returns the value of the '<em><b>County</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>County</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County</em>' containment reference.
	 * @see #setCounty(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_County()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='county' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getCounty();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getCounty <em>County</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>County</em>' containment reference.
	 * @see #getCounty()
	 * @generated
	 */
	void setCounty(XsString value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateBaseDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Date()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateBaseDefinition getDate();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateBaseDefinition value);

	/**
	 * Returns the value of the '<em><b>Date Captured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Captured</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Captured</em>' containment reference.
	 * @see #setDateCaptured(DateDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_DateCaptured()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dateCaptured' namespace='##targetNamespace'"
	 * @generated
	 */
	DateDefinition getDateCaptured();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getDateCaptured <em>Date Captured</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Captured</em>' containment reference.
	 * @see #getDateCaptured()
	 * @generated
	 */
	void setDateCaptured(DateDefinition value);

	/**
	 * Returns the value of the '<em><b>Date Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Created</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Created</em>' containment reference.
	 * @see #setDateCreated(DateDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_DateCreated()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dateCreated' namespace='##targetNamespace'"
	 * @generated
	 */
	DateDefinition getDateCreated();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getDateCreated <em>Date Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Created</em>' containment reference.
	 * @see #getDateCreated()
	 * @generated
	 */
	void setDateCreated(DateDefinition value);

	/**
	 * Returns the value of the '<em><b>Date Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Issued</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Issued</em>' containment reference.
	 * @see #setDateIssued(DateDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_DateIssued()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dateIssued' namespace='##targetNamespace'"
	 * @generated
	 */
	DateDefinition getDateIssued();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getDateIssued <em>Date Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Issued</em>' containment reference.
	 * @see #getDateIssued()
	 * @generated
	 */
	void setDateIssued(DateDefinition value);

	/**
	 * Returns the value of the '<em><b>Date Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Modified</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Modified</em>' containment reference.
	 * @see #setDateModified(DateDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_DateModified()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dateModified' namespace='##targetNamespace'"
	 * @generated
	 */
	DateDefinition getDateModified();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getDateModified <em>Date Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Modified</em>' containment reference.
	 * @see #getDateModified()
	 * @generated
	 */
	void setDateModified(DateDefinition value);

	/**
	 * Returns the value of the '<em><b>Date Other</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Other</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Other</em>' containment reference.
	 * @see #setDateOther(DateOtherDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_DateOther()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dateOther' namespace='##targetNamespace'"
	 * @generated
	 */
	DateOtherDefinition getDateOther();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getDateOther <em>Date Other</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Other</em>' containment reference.
	 * @see #getDateOther()
	 * @generated
	 */
	void setDateOther(DateOtherDefinition value);

	/**
	 * Returns the value of the '<em><b>Date Valid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Valid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Valid</em>' containment reference.
	 * @see #setDateValid(DateDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_DateValid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dateValid' namespace='##targetNamespace'"
	 * @generated
	 */
	DateDefinition getDateValid();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getDateValid <em>Date Valid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Valid</em>' containment reference.
	 * @see #getDateValid()
	 * @generated
	 */
	void setDateValid(DateDefinition value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Description()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getDescription();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(XsString value);

	/**
	 * Returns the value of the '<em><b>Description Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Standard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Standard</em>' containment reference.
	 * @see #setDescriptionStandard(StringPlusAuthority)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_DescriptionStandard()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='descriptionStandard' namespace='##targetNamespace'"
	 * @generated
	 */
	StringPlusAuthority getDescriptionStandard();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getDescriptionStandard <em>Description Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Standard</em>' containment reference.
	 * @see #getDescriptionStandard()
	 * @generated
	 */
	void setDescriptionStandard(StringPlusAuthority value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(DetailDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Detail()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	DetailDefinition getDetail();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(DetailDefinition value);

	/**
	 * Returns the value of the '<em><b>Digital Origin</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mods.mods.DigitalOriginDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digital Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digital Origin</em>' attribute.
	 * @see gov.loc.mods.mods.DigitalOriginDefinition
	 * @see #setDigitalOrigin(DigitalOriginDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_DigitalOrigin()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='digitalOrigin' namespace='##targetNamespace'"
	 * @generated
	 */
	DigitalOriginDefinition getDigitalOrigin();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getDigitalOrigin <em>Digital Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digital Origin</em>' attribute.
	 * @see gov.loc.mods.mods.DigitalOriginDefinition
	 * @see #getDigitalOrigin()
	 * @generated
	 */
	void setDigitalOrigin(DigitalOriginDefinition value);

	/**
	 * Returns the value of the '<em><b>Display Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Form</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Form</em>' containment reference.
	 * @see #setDisplayForm(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_DisplayForm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='displayForm' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getDisplayForm();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getDisplayForm <em>Display Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Form</em>' containment reference.
	 * @see #getDisplayForm()
	 * @generated
	 */
	void setDisplayForm(XsString value);

	/**
	 * Returns the value of the '<em><b>Edition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition</em>' containment reference.
	 * @see #setEdition(StringPlusSupplied)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Edition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='edition' namespace='##targetNamespace'"
	 * @generated
	 */
	StringPlusSupplied getEdition();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getEdition <em>Edition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition</em>' containment reference.
	 * @see #getEdition()
	 * @generated
	 */
	void setEdition(StringPlusSupplied value);

	/**
	 * Returns the value of the '<em><b>Electronic Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Locator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Locator</em>' containment reference.
	 * @see #setElectronicLocator(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_ElectronicLocator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='electronicLocator' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getElectronicLocator();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getElectronicLocator <em>Electronic Locator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Locator</em>' containment reference.
	 * @see #getElectronicLocator()
	 * @generated
	 */
	void setElectronicLocator(XsString value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_End()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getEnd();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(XsString value);

	/**
	 * Returns the value of the '<em><b>Enumeration And Chronology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration And Chronology</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration And Chronology</em>' containment reference.
	 * @see #setEnumerationAndChronology(EnumerationAndChronologyDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_EnumerationAndChronology()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='enumerationAndChronology' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumerationAndChronologyDefinition getEnumerationAndChronology();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getEnumerationAndChronology <em>Enumeration And Chronology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration And Chronology</em>' containment reference.
	 * @see #getEnumerationAndChronology()
	 * @generated
	 */
	void setEnumerationAndChronology(EnumerationAndChronologyDefinition value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference.
	 * @see #setExtension(ExtensionDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Extension()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionDefinition getExtension();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getExtension <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' containment reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(ExtensionDefinition value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference.
	 * @see #setExtent(StringPlusSupplied)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Extent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extent' namespace='##targetNamespace'"
	 * @generated
	 */
	StringPlusSupplied getExtent();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getExtent <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' containment reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(StringPlusSupplied value);

	/**
	 * Returns the value of the '<em><b>Extraterrestrial Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extraterrestrial Area</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extraterrestrial Area</em>' containment reference.
	 * @see #setExtraterrestrialArea(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_ExtraterrestrialArea()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extraterrestrialArea' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getExtraterrestrialArea();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getExtraterrestrialArea <em>Extraterrestrial Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extraterrestrial Area</em>' containment reference.
	 * @see #getExtraterrestrialArea()
	 * @generated
	 */
	void setExtraterrestrialArea(XsString value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(StringPlusAuthorityPlusType)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Form()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
	 * @generated
	 */
	StringPlusAuthorityPlusType getForm();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(StringPlusAuthorityPlusType value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' containment reference.
	 * @see #setFrequency(StringPlusAuthority)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Frequency()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='frequency' namespace='##targetNamespace'"
	 * @generated
	 */
	StringPlusAuthority getFrequency();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getFrequency <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' containment reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(StringPlusAuthority value);

	/**
	 * Returns the value of the '<em><b>Genre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genre</em>' containment reference.
	 * @see #setGenre(GenreDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Genre()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='genre' namespace='##targetNamespace'"
	 * @generated
	 */
	GenreDefinition getGenre();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getGenre <em>Genre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genre</em>' containment reference.
	 * @see #getGenre()
	 * @generated
	 */
	void setGenre(GenreDefinition value);

	/**
	 * Returns the value of the '<em><b>Geographic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geographic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geographic</em>' containment reference.
	 * @see #setGeographic(StringPlusAuthority)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Geographic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='geographic' namespace='##targetNamespace'"
	 * @generated
	 */
	StringPlusAuthority getGeographic();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getGeographic <em>Geographic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geographic</em>' containment reference.
	 * @see #getGeographic()
	 * @generated
	 */
	void setGeographic(StringPlusAuthority value);

	/**
	 * Returns the value of the '<em><b>Geographic Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geographic Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geographic Code</em>' containment reference.
	 * @see #setGeographicCode(GeographicCodeDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_GeographicCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='geographicCode' namespace='##targetNamespace'"
	 * @generated
	 */
	GeographicCodeDefinition getGeographicCode();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getGeographicCode <em>Geographic Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geographic Code</em>' containment reference.
	 * @see #getGeographicCode()
	 * @generated
	 */
	void setGeographicCode(GeographicCodeDefinition value);

	/**
	 * Returns the value of the '<em><b>Hierarchical Geographic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchical Geographic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchical Geographic</em>' containment reference.
	 * @see #setHierarchicalGeographic(HierarchicalGeographicDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_HierarchicalGeographic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hierarchicalGeographic' namespace='##targetNamespace'"
	 * @generated
	 */
	HierarchicalGeographicDefinition getHierarchicalGeographic();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getHierarchicalGeographic <em>Hierarchical Geographic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchical Geographic</em>' containment reference.
	 * @see #getHierarchicalGeographic()
	 * @generated
	 */
	void setHierarchicalGeographic(HierarchicalGeographicDefinition value);

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
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_HoldingExternal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='holdingExternal' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionDefinition getHoldingExternal();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getHoldingExternal <em>Holding External</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holding External</em>' containment reference.
	 * @see #getHoldingExternal()
	 * @generated
	 */
	void setHoldingExternal(ExtensionDefinition value);

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
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_HoldingSimple()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='holdingSimple' namespace='##targetNamespace'"
	 * @generated
	 */
	HoldingSimpleDefinition getHoldingSimple();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getHoldingSimple <em>Holding Simple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holding Simple</em>' containment reference.
	 * @see #getHoldingSimple()
	 * @generated
	 */
	void setHoldingSimple(HoldingSimpleDefinition value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(IdentifierDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Identifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifierDefinition getIdentifier();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(IdentifierDefinition value);

	/**
	 * Returns the value of the '<em><b>Internet Media Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internet Media Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internet Media Type</em>' containment reference.
	 * @see #setInternetMediaType(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_InternetMediaType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='internetMediaType' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getInternetMediaType();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getInternetMediaType <em>Internet Media Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internet Media Type</em>' containment reference.
	 * @see #getInternetMediaType()
	 * @generated
	 */
	void setInternetMediaType(XsString value);

	/**
	 * Returns the value of the '<em><b>Island</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Island</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Island</em>' containment reference.
	 * @see #setIsland(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Island()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='island' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getIsland();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getIsland <em>Island</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Island</em>' containment reference.
	 * @see #getIsland()
	 * @generated
	 */
	void setIsland(XsString value);

	/**
	 * Returns the value of the '<em><b>Issuance</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mods.mods.IssuanceDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issuance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuance</em>' attribute.
	 * @see gov.loc.mods.mods.IssuanceDefinition
	 * @see #setIssuance(IssuanceDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Issuance()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issuance' namespace='##targetNamespace'"
	 * @generated
	 */
	IssuanceDefinition getIssuance();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getIssuance <em>Issuance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuance</em>' attribute.
	 * @see gov.loc.mods.mods.IssuanceDefinition
	 * @see #getIssuance()
	 * @generated
	 */
	void setIssuance(IssuanceDefinition value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(LanguageDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Language()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageDefinition getLanguage();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageDefinition value);

	/**
	 * Returns the value of the '<em><b>Language Of Cataloging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Of Cataloging</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Of Cataloging</em>' containment reference.
	 * @see #setLanguageOfCataloging(LanguageDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_LanguageOfCataloging()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='languageOfCataloging' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageDefinition getLanguageOfCataloging();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getLanguageOfCataloging <em>Language Of Cataloging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Of Cataloging</em>' containment reference.
	 * @see #getLanguageOfCataloging()
	 * @generated
	 */
	void setLanguageOfCataloging(LanguageDefinition value);

	/**
	 * Returns the value of the '<em><b>Language Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Term</em>' containment reference.
	 * @see #setLanguageTerm(LanguageTermDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_LanguageTerm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='languageTerm' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageTermDefinition getLanguageTerm();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getLanguageTerm <em>Language Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Term</em>' containment reference.
	 * @see #getLanguageTerm()
	 * @generated
	 */
	void setLanguageTerm(LanguageTermDefinition value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_List()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getList();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(XsString value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Location()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationDefinition getLocation();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationDefinition value);

	/**
	 * Returns the value of the '<em><b>Mods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mods</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mods</em>' containment reference.
	 * @see #setMods(ModsDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Mods()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mods' namespace='##targetNamespace'"
	 * @generated
	 */
	ModsDefinition getMods();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getMods <em>Mods</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mods</em>' containment reference.
	 * @see #getMods()
	 * @generated
	 */
	void setMods(ModsDefinition value);

	/**
	 * Returns the value of the '<em><b>Mods Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mods Collection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mods Collection</em>' containment reference.
	 * @see #setModsCollection(ModsCollectionDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_ModsCollection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modsCollection' namespace='##targetNamespace'"
	 * @generated
	 */
	ModsCollectionDefinition getModsCollection();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getModsCollection <em>Mods Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mods Collection</em>' containment reference.
	 * @see #getModsCollection()
	 * @generated
	 */
	void setModsCollection(ModsCollectionDefinition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Name()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameDefinition getName();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameDefinition value);

	/**
	 * Returns the value of the '<em><b>Name Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Part</em>' containment reference.
	 * @see #setNamePart(NamePartDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_NamePart()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='namePart' namespace='##targetNamespace'"
	 * @generated
	 */
	NamePartDefinition getNamePart();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getNamePart <em>Name Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Part</em>' containment reference.
	 * @see #getNamePart()
	 * @generated
	 */
	void setNamePart(NamePartDefinition value);

	/**
	 * Returns the value of the '<em><b>Non Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Sort</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Sort</em>' containment reference.
	 * @see #setNonSort(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_NonSort()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nonSort' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getNonSort();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getNonSort <em>Non Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Sort</em>' containment reference.
	 * @see #getNonSort()
	 * @generated
	 */
	void setNonSort(XsString value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(NoteDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Note()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	NoteDefinition getNote();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(NoteDefinition value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' containment reference.
	 * @see #setNumber(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Number()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getNumber();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(XsString value);

	/**
	 * Returns the value of the '<em><b>Occupation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupation</em>' containment reference.
	 * @see #setOccupation(StringPlusAuthority)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Occupation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='occupation' namespace='##targetNamespace'"
	 * @generated
	 */
	StringPlusAuthority getOccupation();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getOccupation <em>Occupation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupation</em>' containment reference.
	 * @see #getOccupation()
	 * @generated
	 */
	void setOccupation(StringPlusAuthority value);

	/**
	 * Returns the value of the '<em><b>Origin Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Info</em>' containment reference.
	 * @see #setOriginInfo(OriginInfoDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_OriginInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='originInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	OriginInfoDefinition getOriginInfo();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getOriginInfo <em>Origin Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Info</em>' containment reference.
	 * @see #getOriginInfo()
	 * @generated
	 */
	void setOriginInfo(OriginInfoDefinition value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference.
	 * @see #setPart(PartDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Part()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='part' namespace='##targetNamespace'"
	 * @generated
	 */
	PartDefinition getPart();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getPart <em>Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' containment reference.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(PartDefinition value);

	/**
	 * Returns the value of the '<em><b>Part Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Name</em>' containment reference.
	 * @see #setPartName(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_PartName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='partName' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getPartName();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getPartName <em>Part Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Name</em>' containment reference.
	 * @see #getPartName()
	 * @generated
	 */
	void setPartName(XsString value);

	/**
	 * Returns the value of the '<em><b>Part Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Number</em>' containment reference.
	 * @see #setPartNumber(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_PartNumber()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='partNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getPartNumber();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getPartNumber <em>Part Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Number</em>' containment reference.
	 * @see #getPartNumber()
	 * @generated
	 */
	void setPartNumber(XsString value);

	/**
	 * Returns the value of the '<em><b>Physical Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Description</em>' containment reference.
	 * @see #setPhysicalDescription(PhysicalDescriptionDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_PhysicalDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='physicalDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	PhysicalDescriptionDefinition getPhysicalDescription();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getPhysicalDescription <em>Physical Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Description</em>' containment reference.
	 * @see #getPhysicalDescription()
	 * @generated
	 */
	void setPhysicalDescription(PhysicalDescriptionDefinition value);

	/**
	 * Returns the value of the '<em><b>Physical Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Location</em>' containment reference.
	 * @see #setPhysicalLocation(PhysicalLocationDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_PhysicalLocation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='physicalLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	PhysicalLocationDefinition getPhysicalLocation();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getPhysicalLocation <em>Physical Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Location</em>' containment reference.
	 * @see #getPhysicalLocation()
	 * @generated
	 */
	void setPhysicalLocation(PhysicalLocationDefinition value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' containment reference.
	 * @see #setPlace(PlaceDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Place()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='place' namespace='##targetNamespace'"
	 * @generated
	 */
	PlaceDefinition getPlace();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getPlace <em>Place</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' containment reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(PlaceDefinition value);

	/**
	 * Returns the value of the '<em><b>Place Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Term</em>' containment reference.
	 * @see #setPlaceTerm(PlaceTermDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_PlaceTerm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='placeTerm' namespace='##targetNamespace'"
	 * @generated
	 */
	PlaceTermDefinition getPlaceTerm();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getPlaceTerm <em>Place Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place Term</em>' containment reference.
	 * @see #getPlaceTerm()
	 * @generated
	 */
	void setPlaceTerm(PlaceTermDefinition value);

	/**
	 * Returns the value of the '<em><b>Projection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection</em>' containment reference.
	 * @see #setProjection(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Projection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='projection' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getProjection();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getProjection <em>Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection</em>' containment reference.
	 * @see #getProjection()
	 * @generated
	 */
	void setProjection(XsString value);

	/**
	 * Returns the value of the '<em><b>Province</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Province</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Province</em>' containment reference.
	 * @see #setProvince(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Province()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='province' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getProvince();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getProvince <em>Province</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Province</em>' containment reference.
	 * @see #getProvince()
	 * @generated
	 */
	void setProvince(XsString value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(StringPlusSupplied)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Publisher()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	StringPlusSupplied getPublisher();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(StringPlusSupplied value);

	/**
	 * Returns the value of the '<em><b>Record Change Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Change Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Change Date</em>' containment reference.
	 * @see #setRecordChangeDate(DateDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_RecordChangeDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recordChangeDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateDefinition getRecordChangeDate();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getRecordChangeDate <em>Record Change Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Change Date</em>' containment reference.
	 * @see #getRecordChangeDate()
	 * @generated
	 */
	void setRecordChangeDate(DateDefinition value);

	/**
	 * Returns the value of the '<em><b>Record Content Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Content Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Content Source</em>' containment reference.
	 * @see #setRecordContentSource(StringPlusAuthority)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_RecordContentSource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recordContentSource' namespace='##targetNamespace'"
	 * @generated
	 */
	StringPlusAuthority getRecordContentSource();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getRecordContentSource <em>Record Content Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Content Source</em>' containment reference.
	 * @see #getRecordContentSource()
	 * @generated
	 */
	void setRecordContentSource(StringPlusAuthority value);

	/**
	 * Returns the value of the '<em><b>Record Creation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Creation Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Creation Date</em>' containment reference.
	 * @see #setRecordCreationDate(DateDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_RecordCreationDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recordCreationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateDefinition getRecordCreationDate();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getRecordCreationDate <em>Record Creation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Creation Date</em>' containment reference.
	 * @see #getRecordCreationDate()
	 * @generated
	 */
	void setRecordCreationDate(DateDefinition value);

	/**
	 * Returns the value of the '<em><b>Record Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Identifier</em>' containment reference.
	 * @see #setRecordIdentifier(RecordIdentifierDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_RecordIdentifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recordIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	RecordIdentifierDefinition getRecordIdentifier();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getRecordIdentifier <em>Record Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Identifier</em>' containment reference.
	 * @see #getRecordIdentifier()
	 * @generated
	 */
	void setRecordIdentifier(RecordIdentifierDefinition value);

	/**
	 * Returns the value of the '<em><b>Record Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Info</em>' containment reference.
	 * @see #setRecordInfo(RecordInfoDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_RecordInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recordInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	RecordInfoDefinition getRecordInfo();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getRecordInfo <em>Record Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Info</em>' containment reference.
	 * @see #getRecordInfo()
	 * @generated
	 */
	void setRecordInfo(RecordInfoDefinition value);

	/**
	 * Returns the value of the '<em><b>Record Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Origin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Origin</em>' containment reference.
	 * @see #setRecordOrigin(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_RecordOrigin()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recordOrigin' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getRecordOrigin();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getRecordOrigin <em>Record Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Origin</em>' containment reference.
	 * @see #getRecordOrigin()
	 * @generated
	 */
	void setRecordOrigin(XsString value);

	/**
	 * Returns the value of the '<em><b>Reformatting Quality</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mods.mods.ReformattingQualityDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reformatting Quality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reformatting Quality</em>' attribute.
	 * @see gov.loc.mods.mods.ReformattingQualityDefinition
	 * @see #setReformattingQuality(ReformattingQualityDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_ReformattingQuality()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reformattingQuality' namespace='##targetNamespace'"
	 * @generated
	 */
	ReformattingQualityDefinition getReformattingQuality();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getReformattingQuality <em>Reformatting Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reformatting Quality</em>' attribute.
	 * @see gov.loc.mods.mods.ReformattingQualityDefinition
	 * @see #getReformattingQuality()
	 * @generated
	 */
	void setReformattingQuality(ReformattingQualityDefinition value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference.
	 * @see #setRegion(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Region()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='region' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getRegion();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getRegion <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' containment reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(XsString value);

	/**
	 * Returns the value of the '<em><b>Related Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Item</em>' containment reference.
	 * @see #setRelatedItem(RelatedItemDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_RelatedItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='relatedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedItemDefinition getRelatedItem();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getRelatedItem <em>Related Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Item</em>' containment reference.
	 * @see #getRelatedItem()
	 * @generated
	 */
	void setRelatedItem(RelatedItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(RoleDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Role()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleDefinition getRole();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RoleDefinition value);

	/**
	 * Returns the value of the '<em><b>Role Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Term</em>' containment reference.
	 * @see #setRoleTerm(RoleTermDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_RoleTerm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='roleTerm' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleTermDefinition getRoleTerm();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getRoleTerm <em>Role Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Term</em>' containment reference.
	 * @see #getRoleTerm()
	 * @generated
	 */
	void setRoleTerm(RoleTermDefinition value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' containment reference.
	 * @see #setScale(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Scale()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scale' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getScale();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getScale <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' containment reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(XsString value);

	/**
	 * Returns the value of the '<em><b>Script Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Term</em>' containment reference.
	 * @see #setScriptTerm(ScriptTermDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_ScriptTerm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scriptTerm' namespace='##targetNamespace'"
	 * @generated
	 */
	ScriptTermDefinition getScriptTerm();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getScriptTerm <em>Script Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Term</em>' containment reference.
	 * @see #getScriptTerm()
	 * @generated
	 */
	void setScriptTerm(ScriptTermDefinition value);

	/**
	 * Returns the value of the '<em><b>Shelf Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shelf Locator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shelf Locator</em>' containment reference.
	 * @see #setShelfLocator(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_ShelfLocator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='shelfLocator' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getShelfLocator();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getShelfLocator <em>Shelf Locator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shelf Locator</em>' containment reference.
	 * @see #getShelfLocator()
	 * @generated
	 */
	void setShelfLocator(XsString value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Start()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getStart();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(XsString value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_State()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getState();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(XsString value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(SubjectDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Subject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectDefinition getSubject();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(SubjectDefinition value);

	/**
	 * Returns the value of the '<em><b>Sub Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Location</em>' containment reference.
	 * @see #setSubLocation(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_SubLocation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getSubLocation();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getSubLocation <em>Sub Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Location</em>' containment reference.
	 * @see #getSubLocation()
	 * @generated
	 */
	void setSubLocation(XsString value);

	/**
	 * Returns the value of the '<em><b>Sub Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Title</em>' containment reference.
	 * @see #setSubTitle(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_SubTitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subTitle' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getSubTitle();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getSubTitle <em>Sub Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Title</em>' containment reference.
	 * @see #getSubTitle()
	 * @generated
	 */
	void setSubTitle(XsString value);

	/**
	 * Returns the value of the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Of Contents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Of Contents</em>' containment reference.
	 * @see #setTableOfContents(TableOfContentsDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_TableOfContents()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tableOfContents' namespace='##targetNamespace'"
	 * @generated
	 */
	TableOfContentsDefinition getTableOfContents();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getTableOfContents <em>Table Of Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Of Contents</em>' containment reference.
	 * @see #getTableOfContents()
	 * @generated
	 */
	void setTableOfContents(TableOfContentsDefinition value);

	/**
	 * Returns the value of the '<em><b>Target Audience</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Audience</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Audience</em>' containment reference.
	 * @see #setTargetAudience(TargetAudienceDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_TargetAudience()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='targetAudience' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetAudienceDefinition getTargetAudience();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getTargetAudience <em>Target Audience</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Audience</em>' containment reference.
	 * @see #getTargetAudience()
	 * @generated
	 */
	void setTargetAudience(TargetAudienceDefinition value);

	/**
	 * Returns the value of the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal</em>' containment reference.
	 * @see #setTemporal(TemporalDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Temporal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='temporal' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalDefinition getTemporal();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getTemporal <em>Temporal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal</em>' containment reference.
	 * @see #getTemporal()
	 * @generated
	 */
	void setTemporal(TemporalDefinition value);

	/**
	 * Returns the value of the '<em><b>Territory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Territory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Territory</em>' containment reference.
	 * @see #setTerritory(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Territory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='territory' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getTerritory();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getTerritory <em>Territory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Territory</em>' containment reference.
	 * @see #getTerritory()
	 * @generated
	 */
	void setTerritory(XsString value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(UnstructuredTextDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Text()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	UnstructuredTextDefinition getText();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(UnstructuredTextDefinition value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(XsString)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Title()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	XsString getTitle();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(XsString value);

	/**
	 * Returns the value of the '<em><b>Title Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Info</em>' containment reference.
	 * @see #setTitleInfo(TitleInfoDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_TitleInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='titleInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleInfoDefinition getTitleInfo();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getTitleInfo <em>Title Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Info</em>' containment reference.
	 * @see #getTitleInfo()
	 * @generated
	 */
	void setTitleInfo(TitleInfoDefinition value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference.
	 * @see #setTopic(StringPlusAuthority)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Topic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='topic' namespace='##targetNamespace'"
	 * @generated
	 */
	StringPlusAuthority getTopic();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getTopic <em>Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' containment reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(StringPlusAuthority value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(BigInteger)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Total()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='total' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTotal();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type Of Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of Resource</em>' containment reference.
	 * @see #setTypeOfResource(TypeOfResourceDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_TypeOfResource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='typeOfResource' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeOfResourceDefinition getTypeOfResource();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getTypeOfResource <em>Type Of Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Resource</em>' containment reference.
	 * @see #getTypeOfResource()
	 * @generated
	 */
	void setTypeOfResource(TypeOfResourceDefinition value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(UrlDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getDocumentRoot_Url()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	UrlDefinition getUrl();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.DocumentRoot#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(UrlDefinition value);

} // DocumentRoot
