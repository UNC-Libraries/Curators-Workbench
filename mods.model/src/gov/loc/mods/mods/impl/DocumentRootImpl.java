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
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.AbstractDefinition;
import gov.loc.mods.mods.AccessConditionDefinition;
import gov.loc.mods.mods.CartographicsDefinition;
import gov.loc.mods.mods.ClassificationDefinition;
import gov.loc.mods.mods.CopyInformationDefinition;
import gov.loc.mods.mods.DateBaseDefinition;
import gov.loc.mods.mods.DateDefinition;
import gov.loc.mods.mods.DateOtherDefinition;
import gov.loc.mods.mods.DetailDefinition;
import gov.loc.mods.mods.DigitalOriginDefinition;
import gov.loc.mods.mods.DocumentRoot;
import gov.loc.mods.mods.EnumerationAndChronologyDefinition;
import gov.loc.mods.mods.ExtensionDefinition;
import gov.loc.mods.mods.GenreDefinition;
import gov.loc.mods.mods.GeographicCodeDefinition;
import gov.loc.mods.mods.HierarchicalGeographicDefinition;
import gov.loc.mods.mods.HoldingSimpleDefinition;
import gov.loc.mods.mods.IdentifierDefinition;
import gov.loc.mods.mods.IssuanceDefinition;
import gov.loc.mods.mods.LanguageDefinition;
import gov.loc.mods.mods.LanguageTermDefinition;
import gov.loc.mods.mods.LocationDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.ModsCollectionDefinition;
import gov.loc.mods.mods.ModsDefinition;
import gov.loc.mods.mods.NameDefinition;
import gov.loc.mods.mods.NamePartDefinition;
import gov.loc.mods.mods.NoteDefinition;
import gov.loc.mods.mods.OriginInfoDefinition;
import gov.loc.mods.mods.PartDefinition;
import gov.loc.mods.mods.PhysicalDescriptionDefinition;
import gov.loc.mods.mods.PhysicalLocationDefinition;
import gov.loc.mods.mods.PlaceDefinition;
import gov.loc.mods.mods.PlaceTermDefinition;
import gov.loc.mods.mods.RecordIdentifierDefinition;
import gov.loc.mods.mods.RecordInfoDefinition;
import gov.loc.mods.mods.ReformattingQualityDefinition;
import gov.loc.mods.mods.RelatedItemDefinition;
import gov.loc.mods.mods.RoleDefinition;
import gov.loc.mods.mods.RoleTermDefinition;
import gov.loc.mods.mods.ScriptTermDefinition;
import gov.loc.mods.mods.StringPlusAuthority;
import gov.loc.mods.mods.StringPlusAuthorityPlusType;
import gov.loc.mods.mods.StringPlusSupplied;
import gov.loc.mods.mods.SubjectDefinition;
import gov.loc.mods.mods.TableOfContentsDefinition;
import gov.loc.mods.mods.TargetAudienceDefinition;
import gov.loc.mods.mods.TemporalDefinition;
import gov.loc.mods.mods.TitleInfoDefinition;
import gov.loc.mods.mods.TypeOfResourceDefinition;
import gov.loc.mods.mods.UnstructuredTextDefinition;
import gov.loc.mods.mods.UrlDefinition;
import gov.loc.mods.mods.XsString;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getAccessCondition <em>Access Condition</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getArea <em>Area</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getCartographics <em>Cartographics</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getCity <em>City</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getCitySection <em>City Section</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getContinent <em>Continent</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getCopyInformation <em>Copy Information</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getCopyrightDate <em>Copyright Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getCounty <em>County</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getDate <em>Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getDateCaptured <em>Date Captured</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getDateIssued <em>Date Issued</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getDateModified <em>Date Modified</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getDateOther <em>Date Other</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getDateValid <em>Date Valid</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getDescriptionStandard <em>Description Standard</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getDigitalOrigin <em>Digital Origin</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getDisplayForm <em>Display Form</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getElectronicLocator <em>Electronic Locator</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getEnd <em>End</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getEnumerationAndChronology <em>Enumeration And Chronology</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getExtraterrestrialArea <em>Extraterrestrial Area</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getForm <em>Form</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getGenre <em>Genre</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getGeographic <em>Geographic</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getGeographicCode <em>Geographic Code</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getHierarchicalGeographic <em>Hierarchical Geographic</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getHoldingExternal <em>Holding External</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getHoldingSimple <em>Holding Simple</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getInternetMediaType <em>Internet Media Type</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getIsland <em>Island</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getIssuance <em>Issuance</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getLanguageOfCataloging <em>Language Of Cataloging</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getLanguageTerm <em>Language Term</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getList <em>List</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getMods <em>Mods</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getModsCollection <em>Mods Collection</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getNamePart <em>Name Part</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getNonSort <em>Non Sort</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getNote <em>Note</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getOccupation <em>Occupation</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getOriginInfo <em>Origin Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getPart <em>Part</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getPartName <em>Part Name</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getPhysicalDescription <em>Physical Description</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getPhysicalLocation <em>Physical Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getPlaceTerm <em>Place Term</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getProjection <em>Projection</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getProvince <em>Province</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getRecordChangeDate <em>Record Change Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getRecordContentSource <em>Record Content Source</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getRecordCreationDate <em>Record Creation Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getRecordIdentifier <em>Record Identifier</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getRecordInfo <em>Record Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getRecordOrigin <em>Record Origin</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getReformattingQuality <em>Reformatting Quality</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getRelatedItem <em>Related Item</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getRoleTerm <em>Role Term</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getScriptTerm <em>Script Term</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getShelfLocator <em>Shelf Locator</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getStart <em>Start</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getState <em>State</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getSubLocation <em>Sub Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getSubTitle <em>Sub Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getTableOfContents <em>Table Of Contents</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getTargetAudience <em>Target Audience</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getTerritory <em>Territory</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getText <em>Text</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getTitleInfo <em>Title Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getTypeOfResource <em>Type Of Resource</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DocumentRootImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getDigitalOrigin() <em>Digital Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitalOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final DigitalOriginDefinition DIGITAL_ORIGIN_EDEFAULT = DigitalOriginDefinition.BORN_DIGITAL;

	/**
	 * The default value of the '{@link #getIssuance() <em>Issuance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuance()
	 * @generated
	 * @ordered
	 */
	protected static final IssuanceDefinition ISSUANCE_EDEFAULT = IssuanceDefinition.CONTINUING;

	/**
	 * The default value of the '{@link #getReformattingQuality() <em>Reformatting Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReformattingQuality()
	 * @generated
	 * @ordered
	 */
	protected static final ReformattingQualityDefinition REFORMATTING_QUALITY_EDEFAULT = ReformattingQualityDefinition.ACCESS;

	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TOTAL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, MODSPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String, String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this, MODSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String, String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this, MODSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDefinition getAbstract() {
		return (AbstractDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Abstract(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstract(AbstractDefinition newAbstract, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Abstract(), newAbstract,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(AbstractDefinition newAbstract) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Abstract(), newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessConditionDefinition getAccessCondition() {
		return (AccessConditionDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_AccessCondition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessCondition(AccessConditionDefinition newAccessCondition, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_AccessCondition(),
				newAccessCondition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessCondition(AccessConditionDefinition newAccessCondition) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_AccessCondition(),
				newAccessCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getAffiliation() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffiliation(XsString newAffiliation, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
				newAffiliation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffiliation(XsString newAffiliation) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(), newAffiliation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getArea() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Area(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArea(XsString newArea, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Area(), newArea, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(XsString newArea) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Area(), newArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getCaption() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Caption(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(XsString newCaption, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Caption(), newCaption,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(XsString newCaption) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Caption(), newCaption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartographicsDefinition getCartographics() {
		return (CartographicsDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Cartographics(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartographics(CartographicsDefinition newCartographics, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Cartographics(),
				newCartographics, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCartographics(CartographicsDefinition newCartographics) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Cartographics(), newCartographics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getCity() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_City(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCity(XsString newCity, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_City(), newCity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(XsString newCity) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_City(), newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getCitySection() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitySection(XsString newCitySection, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
				newCitySection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitySection(XsString newCitySection) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(), newCitySection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationDefinition getClassification() {
		return (ClassificationDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Classification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassification(ClassificationDefinition newClassification, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Classification(),
				newClassification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(ClassificationDefinition newClassification) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Classification(), newClassification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getContinent() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Continent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinent(XsString newContinent, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
				newContinent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinent(XsString newContinent) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Continent(), newContinent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getCoordinates() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinates(XsString newCoordinates, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
				newCoordinates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinates(XsString newCoordinates) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(), newCoordinates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyInformationDefinition getCopyInformation() {
		return (CopyInformationDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_CopyInformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyInformation(CopyInformationDefinition newCopyInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_CopyInformation(),
				newCopyInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyInformation(CopyInformationDefinition newCopyInformation) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_CopyInformation(),
				newCopyInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateDefinition getCopyrightDate() {
		return (DateDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_CopyrightDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyrightDate(DateDefinition newCopyrightDate, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_CopyrightDate(),
				newCopyrightDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyrightDate(DateDefinition newCopyrightDate) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_CopyrightDate(), newCopyrightDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getCountry() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Country(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(XsString newCountry, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Country(), newCountry,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(XsString newCountry) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Country(), newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getCounty() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_County(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCounty(XsString newCounty, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_County(), newCounty,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounty(XsString newCounty) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_County(), newCounty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateBaseDefinition getDate() {
		return (DateBaseDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Date(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateBaseDefinition newDate, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Date(), newDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateBaseDefinition newDate) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Date(), newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateDefinition getDateCaptured() {
		return (DateDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_DateCaptured(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateCaptured(DateDefinition newDateCaptured, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_DateCaptured(),
				newDateCaptured, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCaptured(DateDefinition newDateCaptured) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_DateCaptured(), newDateCaptured);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateDefinition getDateCreated() {
		return (DateDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_DateCreated(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateCreated(DateDefinition newDateCreated, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_DateCreated(),
				newDateCreated, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCreated(DateDefinition newDateCreated) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_DateCreated(), newDateCreated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateDefinition getDateIssued() {
		return (DateDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_DateIssued(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateIssued(DateDefinition newDateIssued, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_DateIssued(),
				newDateIssued, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateIssued(DateDefinition newDateIssued) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_DateIssued(), newDateIssued);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateDefinition getDateModified() {
		return (DateDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_DateModified(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateModified(DateDefinition newDateModified, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_DateModified(),
				newDateModified, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateModified(DateDefinition newDateModified) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_DateModified(), newDateModified);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateOtherDefinition getDateOther() {
		return (DateOtherDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_DateOther(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateOther(DateOtherDefinition newDateOther, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_DateOther(),
				newDateOther, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOther(DateOtherDefinition newDateOther) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_DateOther(), newDateOther);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateDefinition getDateValid() {
		return (DateDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_DateValid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateValid(DateDefinition newDateValid, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_DateValid(),
				newDateValid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateValid(DateDefinition newDateValid) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_DateValid(), newDateValid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getDescription() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(XsString newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
				newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(XsString newDescription) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPlusAuthority getDescriptionStandard() {
		return (StringPlusAuthority) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_DescriptionStandard(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionStandard(StringPlusAuthority newDescriptionStandard,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_DescriptionStandard(),
				newDescriptionStandard, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionStandard(StringPlusAuthority newDescriptionStandard) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_DescriptionStandard(),
				newDescriptionStandard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailDefinition getDetail() {
		return (DetailDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Detail(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(DetailDefinition newDetail, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Detail(), newDetail,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(DetailDefinition newDetail) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Detail(), newDetail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalOriginDefinition getDigitalOrigin() {
		return (DigitalOriginDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_DigitalOrigin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigitalOrigin(DigitalOriginDefinition newDigitalOrigin) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_DigitalOrigin(), newDigitalOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getDisplayForm() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayForm(XsString newDisplayForm, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
				newDisplayForm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayForm(XsString newDisplayForm) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(), newDisplayForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPlusSupplied getEdition() {
		return (StringPlusSupplied) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Edition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdition(StringPlusSupplied newEdition, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Edition(), newEdition,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdition(StringPlusSupplied newEdition) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Edition(), newEdition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getElectronicLocator() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectronicLocator(XsString newElectronicLocator, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
				newElectronicLocator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectronicLocator(XsString newElectronicLocator) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
				newElectronicLocator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getEnd() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_End(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(XsString newEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_End(), newEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(XsString newEnd) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_End(), newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationAndChronologyDefinition getEnumerationAndChronology() {
		return (EnumerationAndChronologyDefinition) getMixed().get(
				MODSPackage.eINSTANCE.getDocumentRoot_EnumerationAndChronology(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumerationAndChronology(
			EnumerationAndChronologyDefinition newEnumerationAndChronology, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				MODSPackage.eINSTANCE.getDocumentRoot_EnumerationAndChronology(), newEnumerationAndChronology, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerationAndChronology(EnumerationAndChronologyDefinition newEnumerationAndChronology) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_EnumerationAndChronology(),
				newEnumerationAndChronology);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionDefinition getExtension() {
		return (ExtensionDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Extension(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtension(ExtensionDefinition newExtension, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Extension(),
				newExtension, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(ExtensionDefinition newExtension) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Extension(), newExtension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPlusSupplied getExtent() {
		return (StringPlusSupplied) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Extent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtent(StringPlusSupplied newExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Extent(), newExtent,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtent(StringPlusSupplied newExtent) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Extent(), newExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getExtraterrestrialArea() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtraterrestrialArea(XsString newExtraterrestrialArea, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
				newExtraterrestrialArea, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraterrestrialArea(XsString newExtraterrestrialArea) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
				newExtraterrestrialArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPlusAuthorityPlusType getForm() {
		return (StringPlusAuthorityPlusType) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Form(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(StringPlusAuthorityPlusType newForm, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Form(), newForm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(StringPlusAuthorityPlusType newForm) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Form(), newForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPlusAuthority getFrequency() {
		return (StringPlusAuthority) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Frequency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequency(StringPlusAuthority newFrequency, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Frequency(),
				newFrequency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(StringPlusAuthority newFrequency) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Frequency(), newFrequency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenreDefinition getGenre() {
		return (GenreDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Genre(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenre(GenreDefinition newGenre, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Genre(), newGenre, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenre(GenreDefinition newGenre) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Genre(), newGenre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPlusAuthority getGeographic() {
		return (StringPlusAuthority) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Geographic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeographic(StringPlusAuthority newGeographic, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Geographic(),
				newGeographic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeographic(StringPlusAuthority newGeographic) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Geographic(), newGeographic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicCodeDefinition getGeographicCode() {
		return (GeographicCodeDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_GeographicCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeographicCode(GeographicCodeDefinition newGeographicCode, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_GeographicCode(),
				newGeographicCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeographicCode(GeographicCodeDefinition newGeographicCode) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_GeographicCode(), newGeographicCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchicalGeographicDefinition getHierarchicalGeographic() {
		return (HierarchicalGeographicDefinition) getMixed().get(
				MODSPackage.eINSTANCE.getDocumentRoot_HierarchicalGeographic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHierarchicalGeographic(HierarchicalGeographicDefinition newHierarchicalGeographic,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				MODSPackage.eINSTANCE.getDocumentRoot_HierarchicalGeographic(), newHierarchicalGeographic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchicalGeographic(HierarchicalGeographicDefinition newHierarchicalGeographic) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_HierarchicalGeographic(),
				newHierarchicalGeographic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionDefinition getHoldingExternal() {
		return (ExtensionDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_HoldingExternal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHoldingExternal(ExtensionDefinition newHoldingExternal, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_HoldingExternal(),
				newHoldingExternal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldingExternal(ExtensionDefinition newHoldingExternal) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_HoldingExternal(),
				newHoldingExternal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HoldingSimpleDefinition getHoldingSimple() {
		return (HoldingSimpleDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_HoldingSimple(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHoldingSimple(HoldingSimpleDefinition newHoldingSimple, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_HoldingSimple(),
				newHoldingSimple, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldingSimple(HoldingSimpleDefinition newHoldingSimple) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_HoldingSimple(), newHoldingSimple);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierDefinition getIdentifier() {
		return (IdentifierDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Identifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(IdentifierDefinition newIdentifier, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Identifier(),
				newIdentifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(IdentifierDefinition newIdentifier) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Identifier(), newIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getInternetMediaType() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternetMediaType(XsString newInternetMediaType, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
				newInternetMediaType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternetMediaType(XsString newInternetMediaType) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
				newInternetMediaType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getIsland() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Island(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsland(XsString newIsland, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Island(), newIsland,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsland(XsString newIsland) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Island(), newIsland);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuanceDefinition getIssuance() {
		return (IssuanceDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Issuance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuance(IssuanceDefinition newIssuance) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Issuance(), newIssuance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageDefinition getLanguage() {
		return (LanguageDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Language(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(LanguageDefinition newLanguage, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Language(), newLanguage,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(LanguageDefinition newLanguage) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Language(), newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageDefinition getLanguageOfCataloging() {
		return (LanguageDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_LanguageOfCataloging(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguageOfCataloging(LanguageDefinition newLanguageOfCataloging,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_LanguageOfCataloging(),
				newLanguageOfCataloging, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageOfCataloging(LanguageDefinition newLanguageOfCataloging) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_LanguageOfCataloging(),
				newLanguageOfCataloging);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageTermDefinition getLanguageTerm() {
		return (LanguageTermDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_LanguageTerm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguageTerm(LanguageTermDefinition newLanguageTerm, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_LanguageTerm(),
				newLanguageTerm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageTerm(LanguageTermDefinition newLanguageTerm) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_LanguageTerm(), newLanguageTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getList() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_List(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(XsString newList, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_List(), newList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(XsString newList) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_List(), newList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationDefinition getLocation() {
		return (LocationDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Location(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationDefinition newLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Location(), newLocation,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LocationDefinition newLocation) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Location(), newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModsDefinition getMods() {
		return (ModsDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Mods(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMods(ModsDefinition newMods, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Mods(), newMods, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMods(ModsDefinition newMods) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Mods(), newMods);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModsCollectionDefinition getModsCollection() {
		return (ModsCollectionDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_ModsCollection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModsCollection(ModsCollectionDefinition newModsCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_ModsCollection(),
				newModsCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModsCollection(ModsCollectionDefinition newModsCollection) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_ModsCollection(), newModsCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameDefinition getName() {
		return (NameDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameDefinition newName, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Name(), newName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(NameDefinition newName) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamePartDefinition getNamePart() {
		return (NamePartDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_NamePart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamePart(NamePartDefinition newNamePart, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_NamePart(), newNamePart,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamePart(NamePartDefinition newNamePart) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_NamePart(), newNamePart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getNonSort() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonSort(XsString newNonSort, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(), newNonSort,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonSort(XsString newNonSort) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(), newNonSort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteDefinition getNote() {
		return (NoteDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Note(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(NoteDefinition newNote, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Note(), newNote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(NoteDefinition newNote) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Note(), newNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getNumber() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Number(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(XsString newNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Number(), newNumber,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(XsString newNumber) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Number(), newNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPlusAuthority getOccupation() {
		return (StringPlusAuthority) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Occupation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccupation(StringPlusAuthority newOccupation, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Occupation(),
				newOccupation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccupation(StringPlusAuthority newOccupation) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Occupation(), newOccupation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginInfoDefinition getOriginInfo() {
		return (OriginInfoDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_OriginInfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginInfo(OriginInfoDefinition newOriginInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_OriginInfo(),
				newOriginInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginInfo(OriginInfoDefinition newOriginInfo) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_OriginInfo(), newOriginInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDefinition getPart() {
		return (PartDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Part(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPart(PartDefinition newPart, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Part(), newPart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPart(PartDefinition newPart) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Part(), newPart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getPartName() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_PartName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartName(XsString newPartName, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_PartName(), newPartName,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartName(XsString newPartName) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_PartName(), newPartName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getPartNumber() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartNumber(XsString newPartNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
				newPartNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartNumber(XsString newPartNumber) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(), newPartNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDescriptionDefinition getPhysicalDescription() {
		return (PhysicalDescriptionDefinition) getMixed().get(
				MODSPackage.eINSTANCE.getDocumentRoot_PhysicalDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalDescription(PhysicalDescriptionDefinition newPhysicalDescription,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_PhysicalDescription(),
				newPhysicalDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalDescription(PhysicalDescriptionDefinition newPhysicalDescription) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_PhysicalDescription(),
				newPhysicalDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalLocationDefinition getPhysicalLocation() {
		return (PhysicalLocationDefinition) getMixed()
				.get(MODSPackage.eINSTANCE.getDocumentRoot_PhysicalLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalLocation(PhysicalLocationDefinition newPhysicalLocation,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_PhysicalLocation(),
				newPhysicalLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalLocation(PhysicalLocationDefinition newPhysicalLocation) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_PhysicalLocation(),
				newPhysicalLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceDefinition getPlace() {
		return (PlaceDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Place(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlace(PlaceDefinition newPlace, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Place(), newPlace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(PlaceDefinition newPlace) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Place(), newPlace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceTermDefinition getPlaceTerm() {
		return (PlaceTermDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_PlaceTerm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlaceTerm(PlaceTermDefinition newPlaceTerm, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_PlaceTerm(),
				newPlaceTerm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceTerm(PlaceTermDefinition newPlaceTerm) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_PlaceTerm(), newPlaceTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getProjection() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Projection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjection(XsString newProjection, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
				newProjection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjection(XsString newProjection) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Projection(), newProjection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getProvince() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Province(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvince(XsString newProvince, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Province(), newProvince,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvince(XsString newProvince) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Province(), newProvince);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPlusSupplied getPublisher() {
		return (StringPlusSupplied) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Publisher(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(StringPlusSupplied newPublisher, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Publisher(),
				newPublisher, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(StringPlusSupplied newPublisher) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Publisher(), newPublisher);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateDefinition getRecordChangeDate() {
		return (DateDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_RecordChangeDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordChangeDate(DateDefinition newRecordChangeDate, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_RecordChangeDate(),
				newRecordChangeDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordChangeDate(DateDefinition newRecordChangeDate) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_RecordChangeDate(),
				newRecordChangeDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPlusAuthority getRecordContentSource() {
		return (StringPlusAuthority) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_RecordContentSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordContentSource(StringPlusAuthority newRecordContentSource,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_RecordContentSource(),
				newRecordContentSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordContentSource(StringPlusAuthority newRecordContentSource) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_RecordContentSource(),
				newRecordContentSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateDefinition getRecordCreationDate() {
		return (DateDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_RecordCreationDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordCreationDate(DateDefinition newRecordCreationDate, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_RecordCreationDate(),
				newRecordCreationDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordCreationDate(DateDefinition newRecordCreationDate) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_RecordCreationDate(),
				newRecordCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordIdentifierDefinition getRecordIdentifier() {
		return (RecordIdentifierDefinition) getMixed()
				.get(MODSPackage.eINSTANCE.getDocumentRoot_RecordIdentifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordIdentifier(RecordIdentifierDefinition newRecordIdentifier,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_RecordIdentifier(),
				newRecordIdentifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordIdentifier(RecordIdentifierDefinition newRecordIdentifier) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_RecordIdentifier(),
				newRecordIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordInfoDefinition getRecordInfo() {
		return (RecordInfoDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_RecordInfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordInfo(RecordInfoDefinition newRecordInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_RecordInfo(),
				newRecordInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordInfo(RecordInfoDefinition newRecordInfo) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_RecordInfo(), newRecordInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getRecordOrigin() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordOrigin(XsString newRecordOrigin, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
				newRecordOrigin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordOrigin(XsString newRecordOrigin) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(), newRecordOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReformattingQualityDefinition getReformattingQuality() {
		return (ReformattingQualityDefinition) getMixed().get(
				MODSPackage.eINSTANCE.getDocumentRoot_ReformattingQuality(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReformattingQuality(ReformattingQualityDefinition newReformattingQuality) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_ReformattingQuality(),
				newReformattingQuality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getRegion() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Region(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(XsString newRegion, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Region(), newRegion,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(XsString newRegion) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Region(), newRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedItemDefinition getRelatedItem() {
		return (RelatedItemDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_RelatedItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedItem(RelatedItemDefinition newRelatedItem, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_RelatedItem(),
				newRelatedItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedItem(RelatedItemDefinition newRelatedItem) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_RelatedItem(), newRelatedItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleDefinition getRole() {
		return (RoleDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Role(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(RoleDefinition newRole, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Role(), newRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(RoleDefinition newRole) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Role(), newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTermDefinition getRoleTerm() {
		return (RoleTermDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_RoleTerm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleTerm(RoleTermDefinition newRoleTerm, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_RoleTerm(), newRoleTerm,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleTerm(RoleTermDefinition newRoleTerm) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_RoleTerm(), newRoleTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getScale() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Scale(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScale(XsString newScale, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Scale(), newScale, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(XsString newScale) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Scale(), newScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptTermDefinition getScriptTerm() {
		return (ScriptTermDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_ScriptTerm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScriptTerm(ScriptTermDefinition newScriptTerm, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_ScriptTerm(),
				newScriptTerm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptTerm(ScriptTermDefinition newScriptTerm) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_ScriptTerm(), newScriptTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getShelfLocator() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShelfLocator(XsString newShelfLocator, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
				newShelfLocator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShelfLocator(XsString newShelfLocator) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(), newShelfLocator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getStart() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Start(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(XsString newStart, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Start(), newStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(XsString newStart) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Start(), newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getState() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_State(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(XsString newState, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_State(), newState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(XsString newState) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_State(), newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectDefinition getSubject() {
		return (SubjectDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Subject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(SubjectDefinition newSubject, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Subject(), newSubject,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(SubjectDefinition newSubject) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Subject(), newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getSubLocation() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubLocation(XsString newSubLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
				newSubLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubLocation(XsString newSubLocation) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(), newSubLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getSubTitle() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubTitle(XsString newSubTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(), newSubTitle,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubTitle(XsString newSubTitle) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(), newSubTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableOfContentsDefinition getTableOfContents() {
		return (TableOfContentsDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_TableOfContents(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableOfContents(TableOfContentsDefinition newTableOfContents, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_TableOfContents(),
				newTableOfContents, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableOfContents(TableOfContentsDefinition newTableOfContents) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_TableOfContents(),
				newTableOfContents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetAudienceDefinition getTargetAudience() {
		return (TargetAudienceDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_TargetAudience(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetAudience(TargetAudienceDefinition newTargetAudience, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_TargetAudience(),
				newTargetAudience, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAudience(TargetAudienceDefinition newTargetAudience) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_TargetAudience(), newTargetAudience);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalDefinition getTemporal() {
		return (TemporalDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Temporal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporal(TemporalDefinition newTemporal, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Temporal(), newTemporal,
				msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporal(TemporalDefinition newTemporal) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Temporal(), newTemporal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getTerritory() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Territory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerritory(XsString newTerritory, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
				newTerritory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerritory(XsString newTerritory) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Territory(), newTerritory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredTextDefinition getText() {
		return (UnstructuredTextDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Text(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(UnstructuredTextDefinition newText, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Text(), newText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(UnstructuredTextDefinition newText) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Text(), newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getTitle() {
		return (XsString) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Title(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(XsString newTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Title(), newTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(XsString newTitle) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Title(), newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleInfoDefinition getTitleInfo() {
		return (TitleInfoDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_TitleInfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitleInfo(TitleInfoDefinition newTitleInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_TitleInfo(),
				newTitleInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleInfo(TitleInfoDefinition newTitleInfo) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_TitleInfo(), newTitleInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPlusAuthority getTopic() {
		return (StringPlusAuthority) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Topic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopic(StringPlusAuthority newTopic, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Topic(), newTopic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(StringPlusAuthority newTopic) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Topic(), newTopic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTotal() {
		return (BigInteger) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Total(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(BigInteger newTotal) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Total(), newTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfResourceDefinition getTypeOfResource() {
		return (TypeOfResourceDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_TypeOfResource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeOfResource(TypeOfResourceDefinition newTypeOfResource, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_TypeOfResource(),
				newTypeOfResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOfResource(TypeOfResourceDefinition newTypeOfResource) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_TypeOfResource(), newTypeOfResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrlDefinition getUrl() {
		return (UrlDefinition) getMixed().get(MODSPackage.eINSTANCE.getDocumentRoot_Url(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(UrlDefinition newUrl, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(MODSPackage.eINSTANCE.getDocumentRoot_Url(), newUrl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(UrlDefinition newUrl) {
		((FeatureMap.Internal) getMixed()).set(MODSPackage.eINSTANCE.getDocumentRoot_Url(), newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MODSPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
			case MODSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>) getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case MODSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>) getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case MODSPackage.DOCUMENT_ROOT__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__ACCESS_CONDITION:
				return basicSetAccessCondition(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__AFFILIATION:
				return basicSetAffiliation(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__AREA:
				return basicSetArea(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__CAPTION:
				return basicSetCaption(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__CARTOGRAPHICS:
				return basicSetCartographics(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__CITY:
				return basicSetCity(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__CITY_SECTION:
				return basicSetCitySection(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__CONTINENT:
				return basicSetContinent(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__COORDINATES:
				return basicSetCoordinates(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__COPY_INFORMATION:
				return basicSetCopyInformation(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__COPYRIGHT_DATE:
				return basicSetCopyrightDate(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__COUNTRY:
				return basicSetCountry(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__COUNTY:
				return basicSetCounty(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__DATE:
				return basicSetDate(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__DATE_CAPTURED:
				return basicSetDateCaptured(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__DATE_CREATED:
				return basicSetDateCreated(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__DATE_ISSUED:
				return basicSetDateIssued(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__DATE_MODIFIED:
				return basicSetDateModified(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__DATE_OTHER:
				return basicSetDateOther(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__DATE_VALID:
				return basicSetDateValid(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__DESCRIPTION_STANDARD:
				return basicSetDescriptionStandard(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__DETAIL:
				return basicSetDetail(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__DISPLAY_FORM:
				return basicSetDisplayForm(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__EDITION:
				return basicSetEdition(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__ELECTRONIC_LOCATOR:
				return basicSetElectronicLocator(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__END:
				return basicSetEnd(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__ENUMERATION_AND_CHRONOLOGY:
				return basicSetEnumerationAndChronology(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__EXTENSION:
				return basicSetExtension(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__EXTENT:
				return basicSetExtent(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__EXTRATERRESTRIAL_AREA:
				return basicSetExtraterrestrialArea(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__FORM:
				return basicSetForm(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__FREQUENCY:
				return basicSetFrequency(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__GENRE:
				return basicSetGenre(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__GEOGRAPHIC:
				return basicSetGeographic(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__GEOGRAPHIC_CODE:
				return basicSetGeographicCode(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__HIERARCHICAL_GEOGRAPHIC:
				return basicSetHierarchicalGeographic(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__HOLDING_EXTERNAL:
				return basicSetHoldingExternal(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__HOLDING_SIMPLE:
				return basicSetHoldingSimple(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__INTERNET_MEDIA_TYPE:
				return basicSetInternetMediaType(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__ISLAND:
				return basicSetIsland(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE_OF_CATALOGING:
				return basicSetLanguageOfCataloging(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE_TERM:
				return basicSetLanguageTerm(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__LIST:
				return basicSetList(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__LOCATION:
				return basicSetLocation(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__MODS:
				return basicSetMods(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__MODS_COLLECTION:
				return basicSetModsCollection(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__NAME:
				return basicSetName(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__NAME_PART:
				return basicSetNamePart(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__NON_SORT:
				return basicSetNonSort(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__NOTE:
				return basicSetNote(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__NUMBER:
				return basicSetNumber(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__OCCUPATION:
				return basicSetOccupation(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__ORIGIN_INFO:
				return basicSetOriginInfo(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__PART:
				return basicSetPart(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__PART_NAME:
				return basicSetPartName(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__PART_NUMBER:
				return basicSetPartNumber(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__PHYSICAL_DESCRIPTION:
				return basicSetPhysicalDescription(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__PHYSICAL_LOCATION:
				return basicSetPhysicalLocation(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__PLACE:
				return basicSetPlace(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__PLACE_TERM:
				return basicSetPlaceTerm(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__PROJECTION:
				return basicSetProjection(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__PROVINCE:
				return basicSetProvince(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__RECORD_CHANGE_DATE:
				return basicSetRecordChangeDate(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__RECORD_CONTENT_SOURCE:
				return basicSetRecordContentSource(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__RECORD_CREATION_DATE:
				return basicSetRecordCreationDate(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__RECORD_IDENTIFIER:
				return basicSetRecordIdentifier(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__RECORD_INFO:
				return basicSetRecordInfo(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__RECORD_ORIGIN:
				return basicSetRecordOrigin(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__REGION:
				return basicSetRegion(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__RELATED_ITEM:
				return basicSetRelatedItem(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__ROLE:
				return basicSetRole(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__ROLE_TERM:
				return basicSetRoleTerm(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__SCALE:
				return basicSetScale(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__SCRIPT_TERM:
				return basicSetScriptTerm(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__SHELF_LOCATOR:
				return basicSetShelfLocator(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__START:
				return basicSetStart(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__STATE:
				return basicSetState(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__SUBJECT:
				return basicSetSubject(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__SUB_LOCATION:
				return basicSetSubLocation(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__SUB_TITLE:
				return basicSetSubTitle(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
				return basicSetTableOfContents(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__TARGET_AUDIENCE:
				return basicSetTargetAudience(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__TEMPORAL:
				return basicSetTemporal(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__TERRITORY:
				return basicSetTerritory(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__TEXT:
				return basicSetText(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__TITLE:
				return basicSetTitle(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__TITLE_INFO:
				return basicSetTitleInfo(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__TOPIC:
				return basicSetTopic(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__TYPE_OF_RESOURCE:
				return basicSetTypeOfResource(null, msgs);
			case MODSPackage.DOCUMENT_ROOT__URL:
				return basicSetUrl(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MODSPackage.DOCUMENT_ROOT__MIXED:
				if (coreType)
					return getMixed();
				return ((FeatureMap.Internal) getMixed()).getWrapper();
			case MODSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType)
					return getXMLNSPrefixMap();
				else
					return getXMLNSPrefixMap().map();
			case MODSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType)
					return getXSISchemaLocation();
				else
					return getXSISchemaLocation().map();
			case MODSPackage.DOCUMENT_ROOT__ABSTRACT:
				return getAbstract();
			case MODSPackage.DOCUMENT_ROOT__ACCESS_CONDITION:
				return getAccessCondition();
			case MODSPackage.DOCUMENT_ROOT__AFFILIATION:
				return getAffiliation();
			case MODSPackage.DOCUMENT_ROOT__AREA:
				return getArea();
			case MODSPackage.DOCUMENT_ROOT__CAPTION:
				return getCaption();
			case MODSPackage.DOCUMENT_ROOT__CARTOGRAPHICS:
				return getCartographics();
			case MODSPackage.DOCUMENT_ROOT__CITY:
				return getCity();
			case MODSPackage.DOCUMENT_ROOT__CITY_SECTION:
				return getCitySection();
			case MODSPackage.DOCUMENT_ROOT__CLASSIFICATION:
				return getClassification();
			case MODSPackage.DOCUMENT_ROOT__CONTINENT:
				return getContinent();
			case MODSPackage.DOCUMENT_ROOT__COORDINATES:
				return getCoordinates();
			case MODSPackage.DOCUMENT_ROOT__COPY_INFORMATION:
				return getCopyInformation();
			case MODSPackage.DOCUMENT_ROOT__COPYRIGHT_DATE:
				return getCopyrightDate();
			case MODSPackage.DOCUMENT_ROOT__COUNTRY:
				return getCountry();
			case MODSPackage.DOCUMENT_ROOT__COUNTY:
				return getCounty();
			case MODSPackage.DOCUMENT_ROOT__DATE:
				return getDate();
			case MODSPackage.DOCUMENT_ROOT__DATE_CAPTURED:
				return getDateCaptured();
			case MODSPackage.DOCUMENT_ROOT__DATE_CREATED:
				return getDateCreated();
			case MODSPackage.DOCUMENT_ROOT__DATE_ISSUED:
				return getDateIssued();
			case MODSPackage.DOCUMENT_ROOT__DATE_MODIFIED:
				return getDateModified();
			case MODSPackage.DOCUMENT_ROOT__DATE_OTHER:
				return getDateOther();
			case MODSPackage.DOCUMENT_ROOT__DATE_VALID:
				return getDateValid();
			case MODSPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case MODSPackage.DOCUMENT_ROOT__DESCRIPTION_STANDARD:
				return getDescriptionStandard();
			case MODSPackage.DOCUMENT_ROOT__DETAIL:
				return getDetail();
			case MODSPackage.DOCUMENT_ROOT__DIGITAL_ORIGIN:
				return getDigitalOrigin();
			case MODSPackage.DOCUMENT_ROOT__DISPLAY_FORM:
				return getDisplayForm();
			case MODSPackage.DOCUMENT_ROOT__EDITION:
				return getEdition();
			case MODSPackage.DOCUMENT_ROOT__ELECTRONIC_LOCATOR:
				return getElectronicLocator();
			case MODSPackage.DOCUMENT_ROOT__END:
				return getEnd();
			case MODSPackage.DOCUMENT_ROOT__ENUMERATION_AND_CHRONOLOGY:
				return getEnumerationAndChronology();
			case MODSPackage.DOCUMENT_ROOT__EXTENSION:
				return getExtension();
			case MODSPackage.DOCUMENT_ROOT__EXTENT:
				return getExtent();
			case MODSPackage.DOCUMENT_ROOT__EXTRATERRESTRIAL_AREA:
				return getExtraterrestrialArea();
			case MODSPackage.DOCUMENT_ROOT__FORM:
				return getForm();
			case MODSPackage.DOCUMENT_ROOT__FREQUENCY:
				return getFrequency();
			case MODSPackage.DOCUMENT_ROOT__GENRE:
				return getGenre();
			case MODSPackage.DOCUMENT_ROOT__GEOGRAPHIC:
				return getGeographic();
			case MODSPackage.DOCUMENT_ROOT__GEOGRAPHIC_CODE:
				return getGeographicCode();
			case MODSPackage.DOCUMENT_ROOT__HIERARCHICAL_GEOGRAPHIC:
				return getHierarchicalGeographic();
			case MODSPackage.DOCUMENT_ROOT__HOLDING_EXTERNAL:
				return getHoldingExternal();
			case MODSPackage.DOCUMENT_ROOT__HOLDING_SIMPLE:
				return getHoldingSimple();
			case MODSPackage.DOCUMENT_ROOT__IDENTIFIER:
				return getIdentifier();
			case MODSPackage.DOCUMENT_ROOT__INTERNET_MEDIA_TYPE:
				return getInternetMediaType();
			case MODSPackage.DOCUMENT_ROOT__ISLAND:
				return getIsland();
			case MODSPackage.DOCUMENT_ROOT__ISSUANCE:
				return getIssuance();
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage();
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE_OF_CATALOGING:
				return getLanguageOfCataloging();
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE_TERM:
				return getLanguageTerm();
			case MODSPackage.DOCUMENT_ROOT__LIST:
				return getList();
			case MODSPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation();
			case MODSPackage.DOCUMENT_ROOT__MODS:
				return getMods();
			case MODSPackage.DOCUMENT_ROOT__MODS_COLLECTION:
				return getModsCollection();
			case MODSPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case MODSPackage.DOCUMENT_ROOT__NAME_PART:
				return getNamePart();
			case MODSPackage.DOCUMENT_ROOT__NON_SORT:
				return getNonSort();
			case MODSPackage.DOCUMENT_ROOT__NOTE:
				return getNote();
			case MODSPackage.DOCUMENT_ROOT__NUMBER:
				return getNumber();
			case MODSPackage.DOCUMENT_ROOT__OCCUPATION:
				return getOccupation();
			case MODSPackage.DOCUMENT_ROOT__ORIGIN_INFO:
				return getOriginInfo();
			case MODSPackage.DOCUMENT_ROOT__PART:
				return getPart();
			case MODSPackage.DOCUMENT_ROOT__PART_NAME:
				return getPartName();
			case MODSPackage.DOCUMENT_ROOT__PART_NUMBER:
				return getPartNumber();
			case MODSPackage.DOCUMENT_ROOT__PHYSICAL_DESCRIPTION:
				return getPhysicalDescription();
			case MODSPackage.DOCUMENT_ROOT__PHYSICAL_LOCATION:
				return getPhysicalLocation();
			case MODSPackage.DOCUMENT_ROOT__PLACE:
				return getPlace();
			case MODSPackage.DOCUMENT_ROOT__PLACE_TERM:
				return getPlaceTerm();
			case MODSPackage.DOCUMENT_ROOT__PROJECTION:
				return getProjection();
			case MODSPackage.DOCUMENT_ROOT__PROVINCE:
				return getProvince();
			case MODSPackage.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher();
			case MODSPackage.DOCUMENT_ROOT__RECORD_CHANGE_DATE:
				return getRecordChangeDate();
			case MODSPackage.DOCUMENT_ROOT__RECORD_CONTENT_SOURCE:
				return getRecordContentSource();
			case MODSPackage.DOCUMENT_ROOT__RECORD_CREATION_DATE:
				return getRecordCreationDate();
			case MODSPackage.DOCUMENT_ROOT__RECORD_IDENTIFIER:
				return getRecordIdentifier();
			case MODSPackage.DOCUMENT_ROOT__RECORD_INFO:
				return getRecordInfo();
			case MODSPackage.DOCUMENT_ROOT__RECORD_ORIGIN:
				return getRecordOrigin();
			case MODSPackage.DOCUMENT_ROOT__REFORMATTING_QUALITY:
				return getReformattingQuality();
			case MODSPackage.DOCUMENT_ROOT__REGION:
				return getRegion();
			case MODSPackage.DOCUMENT_ROOT__RELATED_ITEM:
				return getRelatedItem();
			case MODSPackage.DOCUMENT_ROOT__ROLE:
				return getRole();
			case MODSPackage.DOCUMENT_ROOT__ROLE_TERM:
				return getRoleTerm();
			case MODSPackage.DOCUMENT_ROOT__SCALE:
				return getScale();
			case MODSPackage.DOCUMENT_ROOT__SCRIPT_TERM:
				return getScriptTerm();
			case MODSPackage.DOCUMENT_ROOT__SHELF_LOCATOR:
				return getShelfLocator();
			case MODSPackage.DOCUMENT_ROOT__START:
				return getStart();
			case MODSPackage.DOCUMENT_ROOT__STATE:
				return getState();
			case MODSPackage.DOCUMENT_ROOT__SUBJECT:
				return getSubject();
			case MODSPackage.DOCUMENT_ROOT__SUB_LOCATION:
				return getSubLocation();
			case MODSPackage.DOCUMENT_ROOT__SUB_TITLE:
				return getSubTitle();
			case MODSPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
				return getTableOfContents();
			case MODSPackage.DOCUMENT_ROOT__TARGET_AUDIENCE:
				return getTargetAudience();
			case MODSPackage.DOCUMENT_ROOT__TEMPORAL:
				return getTemporal();
			case MODSPackage.DOCUMENT_ROOT__TERRITORY:
				return getTerritory();
			case MODSPackage.DOCUMENT_ROOT__TEXT:
				return getText();
			case MODSPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case MODSPackage.DOCUMENT_ROOT__TITLE_INFO:
				return getTitleInfo();
			case MODSPackage.DOCUMENT_ROOT__TOPIC:
				return getTopic();
			case MODSPackage.DOCUMENT_ROOT__TOTAL:
				return getTotal();
			case MODSPackage.DOCUMENT_ROOT__TYPE_OF_RESOURCE:
				return getTypeOfResource();
			case MODSPackage.DOCUMENT_ROOT__URL:
				return getUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MODSPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal) getMixed()).set(newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting) getXMLNSPrefixMap()).set(newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting) getXSISchemaLocation()).set(newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__ABSTRACT:
				setAbstract((AbstractDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__ACCESS_CONDITION:
				setAccessCondition((AccessConditionDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__AFFILIATION:
				setAffiliation((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__AREA:
				setArea((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__CAPTION:
				setCaption((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__CARTOGRAPHICS:
				setCartographics((CartographicsDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__CITY:
				setCity((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__CITY_SECTION:
				setCitySection((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__CLASSIFICATION:
				setClassification((ClassificationDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__CONTINENT:
				setContinent((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__COORDINATES:
				setCoordinates((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__COPY_INFORMATION:
				setCopyInformation((CopyInformationDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__COPYRIGHT_DATE:
				setCopyrightDate((DateDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__COUNTRY:
				setCountry((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__COUNTY:
				setCounty((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__DATE:
				setDate((DateBaseDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__DATE_CAPTURED:
				setDateCaptured((DateDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__DATE_CREATED:
				setDateCreated((DateDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__DATE_ISSUED:
				setDateIssued((DateDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__DATE_MODIFIED:
				setDateModified((DateDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__DATE_OTHER:
				setDateOther((DateOtherDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__DATE_VALID:
				setDateValid((DateDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__DESCRIPTION_STANDARD:
				setDescriptionStandard((StringPlusAuthority) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__DETAIL:
				setDetail((DetailDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__DIGITAL_ORIGIN:
				setDigitalOrigin((DigitalOriginDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__DISPLAY_FORM:
				setDisplayForm((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__EDITION:
				setEdition((StringPlusSupplied) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__ELECTRONIC_LOCATOR:
				setElectronicLocator((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__END:
				setEnd((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__ENUMERATION_AND_CHRONOLOGY:
				setEnumerationAndChronology((EnumerationAndChronologyDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__EXTENSION:
				setExtension((ExtensionDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__EXTENT:
				setExtent((StringPlusSupplied) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__EXTRATERRESTRIAL_AREA:
				setExtraterrestrialArea((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__FORM:
				setForm((StringPlusAuthorityPlusType) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__FREQUENCY:
				setFrequency((StringPlusAuthority) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__GENRE:
				setGenre((GenreDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__GEOGRAPHIC:
				setGeographic((StringPlusAuthority) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__GEOGRAPHIC_CODE:
				setGeographicCode((GeographicCodeDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__HIERARCHICAL_GEOGRAPHIC:
				setHierarchicalGeographic((HierarchicalGeographicDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__HOLDING_EXTERNAL:
				setHoldingExternal((ExtensionDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__HOLDING_SIMPLE:
				setHoldingSimple((HoldingSimpleDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__IDENTIFIER:
				setIdentifier((IdentifierDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__INTERNET_MEDIA_TYPE:
				setInternetMediaType((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__ISLAND:
				setIsland((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__ISSUANCE:
				setIssuance((IssuanceDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((LanguageDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE_OF_CATALOGING:
				setLanguageOfCataloging((LanguageDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE_TERM:
				setLanguageTerm((LanguageTermDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__LIST:
				setList((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__LOCATION:
				setLocation((LocationDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__MODS:
				setMods((ModsDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__MODS_COLLECTION:
				setModsCollection((ModsCollectionDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__NAME:
				setName((NameDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__NAME_PART:
				setNamePart((NamePartDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__NON_SORT:
				setNonSort((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__NOTE:
				setNote((NoteDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__NUMBER:
				setNumber((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__OCCUPATION:
				setOccupation((StringPlusAuthority) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__ORIGIN_INFO:
				setOriginInfo((OriginInfoDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__PART:
				setPart((PartDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__PART_NAME:
				setPartName((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__PART_NUMBER:
				setPartNumber((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__PHYSICAL_DESCRIPTION:
				setPhysicalDescription((PhysicalDescriptionDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__PHYSICAL_LOCATION:
				setPhysicalLocation((PhysicalLocationDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__PLACE:
				setPlace((PlaceDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__PLACE_TERM:
				setPlaceTerm((PlaceTermDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__PROJECTION:
				setProjection((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__PROVINCE:
				setProvince((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((StringPlusSupplied) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__RECORD_CHANGE_DATE:
				setRecordChangeDate((DateDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__RECORD_CONTENT_SOURCE:
				setRecordContentSource((StringPlusAuthority) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__RECORD_CREATION_DATE:
				setRecordCreationDate((DateDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__RECORD_IDENTIFIER:
				setRecordIdentifier((RecordIdentifierDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__RECORD_INFO:
				setRecordInfo((RecordInfoDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__RECORD_ORIGIN:
				setRecordOrigin((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__REFORMATTING_QUALITY:
				setReformattingQuality((ReformattingQualityDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__REGION:
				setRegion((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__RELATED_ITEM:
				setRelatedItem((RelatedItemDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__ROLE:
				setRole((RoleDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__ROLE_TERM:
				setRoleTerm((RoleTermDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__SCALE:
				setScale((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__SCRIPT_TERM:
				setScriptTerm((ScriptTermDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__SHELF_LOCATOR:
				setShelfLocator((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__START:
				setStart((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__STATE:
				setState((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__SUBJECT:
				setSubject((SubjectDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__SUB_LOCATION:
				setSubLocation((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__SUB_TITLE:
				setSubTitle((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
				setTableOfContents((TableOfContentsDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__TARGET_AUDIENCE:
				setTargetAudience((TargetAudienceDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__TEMPORAL:
				setTemporal((TemporalDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__TERRITORY:
				setTerritory((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__TEXT:
				setText((UnstructuredTextDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__TITLE:
				setTitle((XsString) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__TITLE_INFO:
				setTitleInfo((TitleInfoDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__TOPIC:
				setTopic((StringPlusAuthority) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__TOTAL:
				setTotal((BigInteger) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__TYPE_OF_RESOURCE:
				setTypeOfResource((TypeOfResourceDefinition) newValue);
				return;
			case MODSPackage.DOCUMENT_ROOT__URL:
				setUrl((UrlDefinition) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MODSPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case MODSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case MODSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case MODSPackage.DOCUMENT_ROOT__ABSTRACT:
				setAbstract((AbstractDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__ACCESS_CONDITION:
				setAccessCondition((AccessConditionDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__AFFILIATION:
				setAffiliation((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__AREA:
				setArea((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__CAPTION:
				setCaption((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__CARTOGRAPHICS:
				setCartographics((CartographicsDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__CITY:
				setCity((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__CITY_SECTION:
				setCitySection((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__CLASSIFICATION:
				setClassification((ClassificationDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__CONTINENT:
				setContinent((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__COORDINATES:
				setCoordinates((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__COPY_INFORMATION:
				setCopyInformation((CopyInformationDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__COPYRIGHT_DATE:
				setCopyrightDate((DateDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__COUNTRY:
				setCountry((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__COUNTY:
				setCounty((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__DATE:
				setDate((DateBaseDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__DATE_CAPTURED:
				setDateCaptured((DateDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__DATE_CREATED:
				setDateCreated((DateDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__DATE_ISSUED:
				setDateIssued((DateDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__DATE_MODIFIED:
				setDateModified((DateDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__DATE_OTHER:
				setDateOther((DateOtherDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__DATE_VALID:
				setDateValid((DateDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__DESCRIPTION_STANDARD:
				setDescriptionStandard((StringPlusAuthority) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__DETAIL:
				setDetail((DetailDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__DIGITAL_ORIGIN:
				setDigitalOrigin(DIGITAL_ORIGIN_EDEFAULT);
				return;
			case MODSPackage.DOCUMENT_ROOT__DISPLAY_FORM:
				setDisplayForm((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__EDITION:
				setEdition((StringPlusSupplied) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__ELECTRONIC_LOCATOR:
				setElectronicLocator((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__END:
				setEnd((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__ENUMERATION_AND_CHRONOLOGY:
				setEnumerationAndChronology((EnumerationAndChronologyDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__EXTENSION:
				setExtension((ExtensionDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__EXTENT:
				setExtent((StringPlusSupplied) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__EXTRATERRESTRIAL_AREA:
				setExtraterrestrialArea((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__FORM:
				setForm((StringPlusAuthorityPlusType) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__FREQUENCY:
				setFrequency((StringPlusAuthority) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__GENRE:
				setGenre((GenreDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__GEOGRAPHIC:
				setGeographic((StringPlusAuthority) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__GEOGRAPHIC_CODE:
				setGeographicCode((GeographicCodeDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__HIERARCHICAL_GEOGRAPHIC:
				setHierarchicalGeographic((HierarchicalGeographicDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__HOLDING_EXTERNAL:
				setHoldingExternal((ExtensionDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__HOLDING_SIMPLE:
				setHoldingSimple((HoldingSimpleDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__IDENTIFIER:
				setIdentifier((IdentifierDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__INTERNET_MEDIA_TYPE:
				setInternetMediaType((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__ISLAND:
				setIsland((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__ISSUANCE:
				setIssuance(ISSUANCE_EDEFAULT);
				return;
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((LanguageDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE_OF_CATALOGING:
				setLanguageOfCataloging((LanguageDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE_TERM:
				setLanguageTerm((LanguageTermDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__LIST:
				setList((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__LOCATION:
				setLocation((LocationDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__MODS:
				setMods((ModsDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__MODS_COLLECTION:
				setModsCollection((ModsCollectionDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__NAME:
				setName((NameDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__NAME_PART:
				setNamePart((NamePartDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__NON_SORT:
				setNonSort((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__NOTE:
				setNote((NoteDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__NUMBER:
				setNumber((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__OCCUPATION:
				setOccupation((StringPlusAuthority) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__ORIGIN_INFO:
				setOriginInfo((OriginInfoDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__PART:
				setPart((PartDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__PART_NAME:
				setPartName((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__PART_NUMBER:
				setPartNumber((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__PHYSICAL_DESCRIPTION:
				setPhysicalDescription((PhysicalDescriptionDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__PHYSICAL_LOCATION:
				setPhysicalLocation((PhysicalLocationDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__PLACE:
				setPlace((PlaceDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__PLACE_TERM:
				setPlaceTerm((PlaceTermDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__PROJECTION:
				setProjection((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__PROVINCE:
				setProvince((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((StringPlusSupplied) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__RECORD_CHANGE_DATE:
				setRecordChangeDate((DateDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__RECORD_CONTENT_SOURCE:
				setRecordContentSource((StringPlusAuthority) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__RECORD_CREATION_DATE:
				setRecordCreationDate((DateDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__RECORD_IDENTIFIER:
				setRecordIdentifier((RecordIdentifierDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__RECORD_INFO:
				setRecordInfo((RecordInfoDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__RECORD_ORIGIN:
				setRecordOrigin((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__REFORMATTING_QUALITY:
				setReformattingQuality(REFORMATTING_QUALITY_EDEFAULT);
				return;
			case MODSPackage.DOCUMENT_ROOT__REGION:
				setRegion((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__RELATED_ITEM:
				setRelatedItem((RelatedItemDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__ROLE:
				setRole((RoleDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__ROLE_TERM:
				setRoleTerm((RoleTermDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__SCALE:
				setScale((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__SCRIPT_TERM:
				setScriptTerm((ScriptTermDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__SHELF_LOCATOR:
				setShelfLocator((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__START:
				setStart((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__STATE:
				setState((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__SUBJECT:
				setSubject((SubjectDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__SUB_LOCATION:
				setSubLocation((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__SUB_TITLE:
				setSubTitle((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
				setTableOfContents((TableOfContentsDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__TARGET_AUDIENCE:
				setTargetAudience((TargetAudienceDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__TEMPORAL:
				setTemporal((TemporalDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__TERRITORY:
				setTerritory((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__TEXT:
				setText((UnstructuredTextDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__TITLE:
				setTitle((XsString) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__TITLE_INFO:
				setTitleInfo((TitleInfoDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__TOPIC:
				setTopic((StringPlusAuthority) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__TOTAL:
				setTotal(TOTAL_EDEFAULT);
				return;
			case MODSPackage.DOCUMENT_ROOT__TYPE_OF_RESOURCE:
				setTypeOfResource((TypeOfResourceDefinition) null);
				return;
			case MODSPackage.DOCUMENT_ROOT__URL:
				setUrl((UrlDefinition) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MODSPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case MODSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case MODSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case MODSPackage.DOCUMENT_ROOT__ABSTRACT:
				return getAbstract() != null;
			case MODSPackage.DOCUMENT_ROOT__ACCESS_CONDITION:
				return getAccessCondition() != null;
			case MODSPackage.DOCUMENT_ROOT__AFFILIATION:
				return getAffiliation() != null;
			case MODSPackage.DOCUMENT_ROOT__AREA:
				return getArea() != null;
			case MODSPackage.DOCUMENT_ROOT__CAPTION:
				return getCaption() != null;
			case MODSPackage.DOCUMENT_ROOT__CARTOGRAPHICS:
				return getCartographics() != null;
			case MODSPackage.DOCUMENT_ROOT__CITY:
				return getCity() != null;
			case MODSPackage.DOCUMENT_ROOT__CITY_SECTION:
				return getCitySection() != null;
			case MODSPackage.DOCUMENT_ROOT__CLASSIFICATION:
				return getClassification() != null;
			case MODSPackage.DOCUMENT_ROOT__CONTINENT:
				return getContinent() != null;
			case MODSPackage.DOCUMENT_ROOT__COORDINATES:
				return getCoordinates() != null;
			case MODSPackage.DOCUMENT_ROOT__COPY_INFORMATION:
				return getCopyInformation() != null;
			case MODSPackage.DOCUMENT_ROOT__COPYRIGHT_DATE:
				return getCopyrightDate() != null;
			case MODSPackage.DOCUMENT_ROOT__COUNTRY:
				return getCountry() != null;
			case MODSPackage.DOCUMENT_ROOT__COUNTY:
				return getCounty() != null;
			case MODSPackage.DOCUMENT_ROOT__DATE:
				return getDate() != null;
			case MODSPackage.DOCUMENT_ROOT__DATE_CAPTURED:
				return getDateCaptured() != null;
			case MODSPackage.DOCUMENT_ROOT__DATE_CREATED:
				return getDateCreated() != null;
			case MODSPackage.DOCUMENT_ROOT__DATE_ISSUED:
				return getDateIssued() != null;
			case MODSPackage.DOCUMENT_ROOT__DATE_MODIFIED:
				return getDateModified() != null;
			case MODSPackage.DOCUMENT_ROOT__DATE_OTHER:
				return getDateOther() != null;
			case MODSPackage.DOCUMENT_ROOT__DATE_VALID:
				return getDateValid() != null;
			case MODSPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case MODSPackage.DOCUMENT_ROOT__DESCRIPTION_STANDARD:
				return getDescriptionStandard() != null;
			case MODSPackage.DOCUMENT_ROOT__DETAIL:
				return getDetail() != null;
			case MODSPackage.DOCUMENT_ROOT__DIGITAL_ORIGIN:
				return getDigitalOrigin() != DIGITAL_ORIGIN_EDEFAULT;
			case MODSPackage.DOCUMENT_ROOT__DISPLAY_FORM:
				return getDisplayForm() != null;
			case MODSPackage.DOCUMENT_ROOT__EDITION:
				return getEdition() != null;
			case MODSPackage.DOCUMENT_ROOT__ELECTRONIC_LOCATOR:
				return getElectronicLocator() != null;
			case MODSPackage.DOCUMENT_ROOT__END:
				return getEnd() != null;
			case MODSPackage.DOCUMENT_ROOT__ENUMERATION_AND_CHRONOLOGY:
				return getEnumerationAndChronology() != null;
			case MODSPackage.DOCUMENT_ROOT__EXTENSION:
				return getExtension() != null;
			case MODSPackage.DOCUMENT_ROOT__EXTENT:
				return getExtent() != null;
			case MODSPackage.DOCUMENT_ROOT__EXTRATERRESTRIAL_AREA:
				return getExtraterrestrialArea() != null;
			case MODSPackage.DOCUMENT_ROOT__FORM:
				return getForm() != null;
			case MODSPackage.DOCUMENT_ROOT__FREQUENCY:
				return getFrequency() != null;
			case MODSPackage.DOCUMENT_ROOT__GENRE:
				return getGenre() != null;
			case MODSPackage.DOCUMENT_ROOT__GEOGRAPHIC:
				return getGeographic() != null;
			case MODSPackage.DOCUMENT_ROOT__GEOGRAPHIC_CODE:
				return getGeographicCode() != null;
			case MODSPackage.DOCUMENT_ROOT__HIERARCHICAL_GEOGRAPHIC:
				return getHierarchicalGeographic() != null;
			case MODSPackage.DOCUMENT_ROOT__HOLDING_EXTERNAL:
				return getHoldingExternal() != null;
			case MODSPackage.DOCUMENT_ROOT__HOLDING_SIMPLE:
				return getHoldingSimple() != null;
			case MODSPackage.DOCUMENT_ROOT__IDENTIFIER:
				return getIdentifier() != null;
			case MODSPackage.DOCUMENT_ROOT__INTERNET_MEDIA_TYPE:
				return getInternetMediaType() != null;
			case MODSPackage.DOCUMENT_ROOT__ISLAND:
				return getIsland() != null;
			case MODSPackage.DOCUMENT_ROOT__ISSUANCE:
				return getIssuance() != ISSUANCE_EDEFAULT;
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage() != null;
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE_OF_CATALOGING:
				return getLanguageOfCataloging() != null;
			case MODSPackage.DOCUMENT_ROOT__LANGUAGE_TERM:
				return getLanguageTerm() != null;
			case MODSPackage.DOCUMENT_ROOT__LIST:
				return getList() != null;
			case MODSPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation() != null;
			case MODSPackage.DOCUMENT_ROOT__MODS:
				return getMods() != null;
			case MODSPackage.DOCUMENT_ROOT__MODS_COLLECTION:
				return getModsCollection() != null;
			case MODSPackage.DOCUMENT_ROOT__NAME:
				return getName() != null;
			case MODSPackage.DOCUMENT_ROOT__NAME_PART:
				return getNamePart() != null;
			case MODSPackage.DOCUMENT_ROOT__NON_SORT:
				return getNonSort() != null;
			case MODSPackage.DOCUMENT_ROOT__NOTE:
				return getNote() != null;
			case MODSPackage.DOCUMENT_ROOT__NUMBER:
				return getNumber() != null;
			case MODSPackage.DOCUMENT_ROOT__OCCUPATION:
				return getOccupation() != null;
			case MODSPackage.DOCUMENT_ROOT__ORIGIN_INFO:
				return getOriginInfo() != null;
			case MODSPackage.DOCUMENT_ROOT__PART:
				return getPart() != null;
			case MODSPackage.DOCUMENT_ROOT__PART_NAME:
				return getPartName() != null;
			case MODSPackage.DOCUMENT_ROOT__PART_NUMBER:
				return getPartNumber() != null;
			case MODSPackage.DOCUMENT_ROOT__PHYSICAL_DESCRIPTION:
				return getPhysicalDescription() != null;
			case MODSPackage.DOCUMENT_ROOT__PHYSICAL_LOCATION:
				return getPhysicalLocation() != null;
			case MODSPackage.DOCUMENT_ROOT__PLACE:
				return getPlace() != null;
			case MODSPackage.DOCUMENT_ROOT__PLACE_TERM:
				return getPlaceTerm() != null;
			case MODSPackage.DOCUMENT_ROOT__PROJECTION:
				return getProjection() != null;
			case MODSPackage.DOCUMENT_ROOT__PROVINCE:
				return getProvince() != null;
			case MODSPackage.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher() != null;
			case MODSPackage.DOCUMENT_ROOT__RECORD_CHANGE_DATE:
				return getRecordChangeDate() != null;
			case MODSPackage.DOCUMENT_ROOT__RECORD_CONTENT_SOURCE:
				return getRecordContentSource() != null;
			case MODSPackage.DOCUMENT_ROOT__RECORD_CREATION_DATE:
				return getRecordCreationDate() != null;
			case MODSPackage.DOCUMENT_ROOT__RECORD_IDENTIFIER:
				return getRecordIdentifier() != null;
			case MODSPackage.DOCUMENT_ROOT__RECORD_INFO:
				return getRecordInfo() != null;
			case MODSPackage.DOCUMENT_ROOT__RECORD_ORIGIN:
				return getRecordOrigin() != null;
			case MODSPackage.DOCUMENT_ROOT__REFORMATTING_QUALITY:
				return getReformattingQuality() != REFORMATTING_QUALITY_EDEFAULT;
			case MODSPackage.DOCUMENT_ROOT__REGION:
				return getRegion() != null;
			case MODSPackage.DOCUMENT_ROOT__RELATED_ITEM:
				return getRelatedItem() != null;
			case MODSPackage.DOCUMENT_ROOT__ROLE:
				return getRole() != null;
			case MODSPackage.DOCUMENT_ROOT__ROLE_TERM:
				return getRoleTerm() != null;
			case MODSPackage.DOCUMENT_ROOT__SCALE:
				return getScale() != null;
			case MODSPackage.DOCUMENT_ROOT__SCRIPT_TERM:
				return getScriptTerm() != null;
			case MODSPackage.DOCUMENT_ROOT__SHELF_LOCATOR:
				return getShelfLocator() != null;
			case MODSPackage.DOCUMENT_ROOT__START:
				return getStart() != null;
			case MODSPackage.DOCUMENT_ROOT__STATE:
				return getState() != null;
			case MODSPackage.DOCUMENT_ROOT__SUBJECT:
				return getSubject() != null;
			case MODSPackage.DOCUMENT_ROOT__SUB_LOCATION:
				return getSubLocation() != null;
			case MODSPackage.DOCUMENT_ROOT__SUB_TITLE:
				return getSubTitle() != null;
			case MODSPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
				return getTableOfContents() != null;
			case MODSPackage.DOCUMENT_ROOT__TARGET_AUDIENCE:
				return getTargetAudience() != null;
			case MODSPackage.DOCUMENT_ROOT__TEMPORAL:
				return getTemporal() != null;
			case MODSPackage.DOCUMENT_ROOT__TERRITORY:
				return getTerritory() != null;
			case MODSPackage.DOCUMENT_ROOT__TEXT:
				return getText() != null;
			case MODSPackage.DOCUMENT_ROOT__TITLE:
				return getTitle() != null;
			case MODSPackage.DOCUMENT_ROOT__TITLE_INFO:
				return getTitleInfo() != null;
			case MODSPackage.DOCUMENT_ROOT__TOPIC:
				return getTopic() != null;
			case MODSPackage.DOCUMENT_ROOT__TOTAL:
				return TOTAL_EDEFAULT == null ? getTotal() != null : !TOTAL_EDEFAULT.equals(getTotal());
			case MODSPackage.DOCUMENT_ROOT__TYPE_OF_RESOURCE:
				return getTypeOfResource() != null;
			case MODSPackage.DOCUMENT_ROOT__URL:
				return getUrl() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
