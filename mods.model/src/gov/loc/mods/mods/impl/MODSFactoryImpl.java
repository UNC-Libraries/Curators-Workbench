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

import gov.loc.mods.mods.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MODSFactoryImpl extends EFactoryImpl implements MODSFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MODSFactory init() {
	try {
	    MODSFactory theMODSFactory = (MODSFactory) EPackage.Registry.INSTANCE
			    .getEFactory("http://www.loc.gov/mods/v3");
	    if (theMODSFactory != null) {
		return theMODSFactory;
	    }
	} catch (Exception exception) {
	    EcorePlugin.INSTANCE.log(exception);
	}
	return new MODSFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MODSFactoryImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
	switch (eClass.getClassifierID()) {
	case MODSPackage.ABSTRACT_DEFINITION:
	    return createAbstractDefinition();
	case MODSPackage.ACCESS_CONDITION_DEFINITION:
	    return createAccessConditionDefinition();
	case MODSPackage.CARTOGRAPHICS_DEFINITION:
	    return createCartographicsDefinition();
	case MODSPackage.CLASSIFICATION_DEFINITION:
	    return createClassificationDefinition();
	case MODSPackage.COPY_INFORMATION_DEFINITION:
	    return createCopyInformationDefinition();
	case MODSPackage.DATE_BASE_DEFINITION:
	    return createDateBaseDefinition();
	case MODSPackage.DATE_DEFINITION:
	    return createDateDefinition();
	case MODSPackage.DATE_OTHER_DEFINITION:
	    return createDateOtherDefinition();
	case MODSPackage.DETAIL_DEFINITION:
	    return createDetailDefinition();
	case MODSPackage.DOCUMENT_ROOT:
	    return createDocumentRoot();
	case MODSPackage.ENUMERATION_AND_CHRONOLOGY_DEFINITION:
	    return createEnumerationAndChronologyDefinition();
	case MODSPackage.EXTENSION_DEFINITION:
	    return createExtensionDefinition();
	case MODSPackage.EXTENT_DEFINITION:
	    return createExtentDefinition();
	case MODSPackage.GENRE_DEFINITION:
	    return createGenreDefinition();
	case MODSPackage.GEOGRAPHIC_CODE_DEFINITION:
	    return createGeographicCodeDefinition();
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION:
	    return createHierarchicalGeographicDefinition();
	case MODSPackage.HOLDING_SIMPLE_DEFINITION:
	    return createHoldingSimpleDefinition();
	case MODSPackage.IDENTIFIER_DEFINITION:
	    return createIdentifierDefinition();
	case MODSPackage.LANGUAGE_DEFINITION:
	    return createLanguageDefinition();
	case MODSPackage.LANGUAGE_TERM_DEFINITION:
	    return createLanguageTermDefinition();
	case MODSPackage.LOCATION_DEFINITION:
	    return createLocationDefinition();
	case MODSPackage.MODS_COLLECTION_DEFINITION:
	    return createModsCollectionDefinition();
	case MODSPackage.MODS_DEFINITION:
	    return createModsDefinition();
	case MODSPackage.NAME_BASE_DEFINITION:
	    return createNameBaseDefinition();
	case MODSPackage.NAME_DEFINITION:
	    return createNameDefinition();
	case MODSPackage.NAME_PART_DEFINITION:
	    return createNamePartDefinition();
	case MODSPackage.NOTE_BASE_DEFINITION:
	    return createNoteBaseDefinition();
	case MODSPackage.NOTE_DEFINITION:
	    return createNoteDefinition();
	case MODSPackage.ORIGIN_INFO_DEFINITION:
	    return createOriginInfoDefinition();
	case MODSPackage.PART_DEFINITION:
	    return createPartDefinition();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION:
	    return createPhysicalDescriptionDefinition();
	case MODSPackage.PHYSICAL_LOCATION_DEFINITION:
	    return createPhysicalLocationDefinition();
	case MODSPackage.PLACE_DEFINITION:
	    return createPlaceDefinition();
	case MODSPackage.PLACE_TERM_DEFINITION:
	    return createPlaceTermDefinition();
	case MODSPackage.RECORD_IDENTIFIER_DEFINITION:
	    return createRecordIdentifierDefinition();
	case MODSPackage.RECORD_INFO_DEFINITION:
	    return createRecordInfoDefinition();
	case MODSPackage.RELATED_ITEM_DEFINITION:
	    return createRelatedItemDefinition();
	case MODSPackage.ROLE_DEFINITION:
	    return createRoleDefinition();
	case MODSPackage.ROLE_TERM_DEFINITION:
	    return createRoleTermDefinition();
	case MODSPackage.SCRIPT_TERM_DEFINITION:
	    return createScriptTermDefinition();
	case MODSPackage.STRING_PLUS_AUTHORITY:
	    return createStringPlusAuthority();
	case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE:
	    return createStringPlusAuthorityPlusType();
	case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL:
	    return createStringPlusAuthorityPlusTypePlusDisplayLabel();
	case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK:
	    return createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink();
	case MODSPackage.STRING_PLUS_SUPPLIED:
	    return createStringPlusSupplied();
	case MODSPackage.SUBJECT_DEFINITION:
	    return createSubjectDefinition();
	case MODSPackage.SUBJECT_NAME_DEFINITION:
	    return createSubjectNameDefinition();
	case MODSPackage.SUBJECT_TITLE_INFO_DEFINITION:
	    return createSubjectTitleInfoDefinition();
	case MODSPackage.TABLE_OF_CONTENTS_DEFINITION:
	    return createTableOfContentsDefinition();
	case MODSPackage.TARGET_AUDIENCE_DEFINITION:
	    return createTargetAudienceDefinition();
	case MODSPackage.TEMPORAL_DEFINITION:
	    return createTemporalDefinition();
	case MODSPackage.TITLE_INFO_BASE_DEFINITION:
	    return createTitleInfoBaseDefinition();
	case MODSPackage.TITLE_INFO_DEFINITION:
	    return createTitleInfoDefinition();
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION:
	    return createTypeOfResourceDefinition();
	case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION:
	    return createUnstructuredTextDefinition();
	case MODSPackage.URL_DEFINITION:
	    return createUrlDefinition();
	case MODSPackage.XS_STRING:
	    return createXsString();
	default:
	    throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
	}
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
	switch (eDataType.getClassifierID()) {
	case MODSPackage.CODE_OR_TEXT_DEFINITION:
	    return createCodeOrTextDefinitionFromString(eDataType, initialValue);
	case MODSPackage.DATE_ENCODING_ATTRIBUTE_DEFINITION:
	    return createDateEncodingAttributeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.DATE_POINT_ATTRIBUTE_DEFINITION:
	    return createDatePointAttributeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.DATE_QUALIFIER_ATTRIBUTE_DEFINITION:
	    return createDateQualifierAttributeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.DIGITAL_ORIGIN_DEFINITION:
	    return createDigitalOriginDefinitionFromString(eDataType, initialValue);
	case MODSPackage.ENUMERATION_AND_CHRONOLOGY_UNIT_TYPE_ATTRIBUTE_DEFINITION:
	    return createEnumerationAndChronologyUnitTypeAttributeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.ISSUANCE_DEFINITION:
	    return createIssuanceDefinitionFromString(eDataType, initialValue);
	case MODSPackage.LANGUAGE_AUTHORITY_ATTRIBUTE_DEFINITION:
	    return createLanguageAuthorityAttributeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.MODS_VERSION_ATTRIBUTE_DEFINITION:
	    return createModsVersionAttributeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.NAME_PART_TYPE_ATTRIBUTE_DEFINITION:
	    return createNamePartTypeAttributeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.NAME_TYPE_ATTRIBUTE_DEFINITION:
	    return createNameTypeAttributeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.NO_DEFINITION:
	    return createNoDefinitionFromString(eDataType, initialValue);
	case MODSPackage.PLACE_AUTHORITY_ATTRIBUTE_DEFINITION:
	    return createPlaceAuthorityAttributeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.REFORMATTING_QUALITY_DEFINITION:
	    return createReformattingQualityDefinitionFromString(eDataType, initialValue);
	case MODSPackage.RELATED_ITEM_TYPE_ATTRIBUTE_DEFINITION:
	    return createRelatedItemTypeAttributeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.RESOURCE_TYPE_DEFINITION:
	    return createResourceTypeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.TITLE_INFO_TYPE_ATTRIBUTE_DEFINITION:
	    return createTitleInfoTypeAttributeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.URL_ACCESS_ATTRIBUTE_DEFINITION:
	    return createUrlAccessAttributeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.URL_USAGE_ATTRIBUTE_DEFINITION:
	    return createUrlUsageAttributeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.USAGE_ATTRIBUTE_DEFINITION:
	    return createUsageAttributeDefinitionFromString(eDataType, initialValue);
	case MODSPackage.YES_DEFINITION:
	    return createYesDefinitionFromString(eDataType, initialValue);
	case MODSPackage.CODE_OR_TEXT_DEFINITION_OBJECT:
	    return createCodeOrTextDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.DATE_ENCODING_ATTRIBUTE_DEFINITION_OBJECT:
	    return createDateEncodingAttributeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.DATE_POINT_ATTRIBUTE_DEFINITION_OBJECT:
	    return createDatePointAttributeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.DATE_QUALIFIER_ATTRIBUTE_DEFINITION_OBJECT:
	    return createDateQualifierAttributeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.DIGITAL_ORIGIN_DEFINITION_OBJECT:
	    return createDigitalOriginDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.ENUMERATION_AND_CHRONOLOGY_UNIT_TYPE_ATTRIBUTE_DEFINITION_OBJECT:
	    return createEnumerationAndChronologyUnitTypeAttributeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.ISSUANCE_DEFINITION_OBJECT:
	    return createIssuanceDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.LANGUAGE_AUTHORITY_ATTRIBUTE_DEFINITION_OBJECT:
	    return createLanguageAuthorityAttributeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.MODS_VERSION_ATTRIBUTE_DEFINITION_OBJECT:
	    return createModsVersionAttributeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.NAME_PART_TYPE_ATTRIBUTE_DEFINITION_OBJECT:
	    return createNamePartTypeAttributeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.NAME_TYPE_ATTRIBUTE_DEFINITION_OBJECT:
	    return createNameTypeAttributeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.NO_DEFINITION_OBJECT:
	    return createNoDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.PLACE_AUTHORITY_ATTRIBUTE_DEFINITION_OBJECT:
	    return createPlaceAuthorityAttributeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.REFORMATTING_QUALITY_DEFINITION_OBJECT:
	    return createReformattingQualityDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.RELATED_ITEM_TYPE_ATTRIBUTE_DEFINITION_OBJECT:
	    return createRelatedItemTypeAttributeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.RESOURCE_TYPE_DEFINITION_OBJECT:
	    return createResourceTypeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.TITLE_INFO_TYPE_ATTRIBUTE_DEFINITION_OBJECT:
	    return createTitleInfoTypeAttributeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.URL_ACCESS_ATTRIBUTE_DEFINITION_OBJECT:
	    return createUrlAccessAttributeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.URL_USAGE_ATTRIBUTE_DEFINITION_OBJECT:
	    return createUrlUsageAttributeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.USAGE_ATTRIBUTE_DEFINITION_OBJECT:
	    return createUsageAttributeDefinitionObjectFromString(eDataType, initialValue);
	case MODSPackage.YES_DEFINITION_OBJECT:
	    return createYesDefinitionObjectFromString(eDataType, initialValue);
	default:
	    throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
	}
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
	switch (eDataType.getClassifierID()) {
	case MODSPackage.CODE_OR_TEXT_DEFINITION:
	    return convertCodeOrTextDefinitionToString(eDataType, instanceValue);
	case MODSPackage.DATE_ENCODING_ATTRIBUTE_DEFINITION:
	    return convertDateEncodingAttributeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.DATE_POINT_ATTRIBUTE_DEFINITION:
	    return convertDatePointAttributeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.DATE_QUALIFIER_ATTRIBUTE_DEFINITION:
	    return convertDateQualifierAttributeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.DIGITAL_ORIGIN_DEFINITION:
	    return convertDigitalOriginDefinitionToString(eDataType, instanceValue);
	case MODSPackage.ENUMERATION_AND_CHRONOLOGY_UNIT_TYPE_ATTRIBUTE_DEFINITION:
	    return convertEnumerationAndChronologyUnitTypeAttributeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.ISSUANCE_DEFINITION:
	    return convertIssuanceDefinitionToString(eDataType, instanceValue);
	case MODSPackage.LANGUAGE_AUTHORITY_ATTRIBUTE_DEFINITION:
	    return convertLanguageAuthorityAttributeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.MODS_VERSION_ATTRIBUTE_DEFINITION:
	    return convertModsVersionAttributeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.NAME_PART_TYPE_ATTRIBUTE_DEFINITION:
	    return convertNamePartTypeAttributeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.NAME_TYPE_ATTRIBUTE_DEFINITION:
	    return convertNameTypeAttributeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.NO_DEFINITION:
	    return convertNoDefinitionToString(eDataType, instanceValue);
	case MODSPackage.PLACE_AUTHORITY_ATTRIBUTE_DEFINITION:
	    return convertPlaceAuthorityAttributeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.REFORMATTING_QUALITY_DEFINITION:
	    return convertReformattingQualityDefinitionToString(eDataType, instanceValue);
	case MODSPackage.RELATED_ITEM_TYPE_ATTRIBUTE_DEFINITION:
	    return convertRelatedItemTypeAttributeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.RESOURCE_TYPE_DEFINITION:
	    return convertResourceTypeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.TITLE_INFO_TYPE_ATTRIBUTE_DEFINITION:
	    return convertTitleInfoTypeAttributeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.URL_ACCESS_ATTRIBUTE_DEFINITION:
	    return convertUrlAccessAttributeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.URL_USAGE_ATTRIBUTE_DEFINITION:
	    return convertUrlUsageAttributeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.USAGE_ATTRIBUTE_DEFINITION:
	    return convertUsageAttributeDefinitionToString(eDataType, instanceValue);
	case MODSPackage.YES_DEFINITION:
	    return convertYesDefinitionToString(eDataType, instanceValue);
	case MODSPackage.CODE_OR_TEXT_DEFINITION_OBJECT:
	    return convertCodeOrTextDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.DATE_ENCODING_ATTRIBUTE_DEFINITION_OBJECT:
	    return convertDateEncodingAttributeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.DATE_POINT_ATTRIBUTE_DEFINITION_OBJECT:
	    return convertDatePointAttributeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.DATE_QUALIFIER_ATTRIBUTE_DEFINITION_OBJECT:
	    return convertDateQualifierAttributeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.DIGITAL_ORIGIN_DEFINITION_OBJECT:
	    return convertDigitalOriginDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.ENUMERATION_AND_CHRONOLOGY_UNIT_TYPE_ATTRIBUTE_DEFINITION_OBJECT:
	    return convertEnumerationAndChronologyUnitTypeAttributeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.ISSUANCE_DEFINITION_OBJECT:
	    return convertIssuanceDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.LANGUAGE_AUTHORITY_ATTRIBUTE_DEFINITION_OBJECT:
	    return convertLanguageAuthorityAttributeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.MODS_VERSION_ATTRIBUTE_DEFINITION_OBJECT:
	    return convertModsVersionAttributeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.NAME_PART_TYPE_ATTRIBUTE_DEFINITION_OBJECT:
	    return convertNamePartTypeAttributeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.NAME_TYPE_ATTRIBUTE_DEFINITION_OBJECT:
	    return convertNameTypeAttributeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.NO_DEFINITION_OBJECT:
	    return convertNoDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.PLACE_AUTHORITY_ATTRIBUTE_DEFINITION_OBJECT:
	    return convertPlaceAuthorityAttributeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.REFORMATTING_QUALITY_DEFINITION_OBJECT:
	    return convertReformattingQualityDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.RELATED_ITEM_TYPE_ATTRIBUTE_DEFINITION_OBJECT:
	    return convertRelatedItemTypeAttributeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.RESOURCE_TYPE_DEFINITION_OBJECT:
	    return convertResourceTypeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.TITLE_INFO_TYPE_ATTRIBUTE_DEFINITION_OBJECT:
	    return convertTitleInfoTypeAttributeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.URL_ACCESS_ATTRIBUTE_DEFINITION_OBJECT:
	    return convertUrlAccessAttributeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.URL_USAGE_ATTRIBUTE_DEFINITION_OBJECT:
	    return convertUrlUsageAttributeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.USAGE_ATTRIBUTE_DEFINITION_OBJECT:
	    return convertUsageAttributeDefinitionObjectToString(eDataType, instanceValue);
	case MODSPackage.YES_DEFINITION_OBJECT:
	    return convertYesDefinitionObjectToString(eDataType, instanceValue);
	default:
	    throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
	}
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractDefinition createAbstractDefinition() {
	AbstractDefinitionImpl abstractDefinition = new AbstractDefinitionImpl();
	return abstractDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessConditionDefinition createAccessConditionDefinition() {
	AccessConditionDefinitionImpl accessConditionDefinition = new AccessConditionDefinitionImpl();
	return accessConditionDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CartographicsDefinition createCartographicsDefinition() {
	CartographicsDefinitionImpl cartographicsDefinition = new CartographicsDefinitionImpl();
	return cartographicsDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClassificationDefinition createClassificationDefinition() {
	ClassificationDefinitionImpl classificationDefinition = new ClassificationDefinitionImpl();
	return classificationDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CopyInformationDefinition createCopyInformationDefinition() {
	CopyInformationDefinitionImpl copyInformationDefinition = new CopyInformationDefinitionImpl();
	return copyInformationDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateBaseDefinition createDateBaseDefinition() {
	DateBaseDefinitionImpl dateBaseDefinition = new DateBaseDefinitionImpl();
	return dateBaseDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateDefinition createDateDefinition() {
	DateDefinitionImpl dateDefinition = new DateDefinitionImpl();
	return dateDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateOtherDefinition createDateOtherDefinition() {
	DateOtherDefinitionImpl dateOtherDefinition = new DateOtherDefinitionImpl();
	return dateOtherDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DetailDefinition createDetailDefinition() {
	DetailDefinitionImpl detailDefinition = new DetailDefinitionImpl();
	return detailDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
	DocumentRootImpl documentRoot = new DocumentRootImpl();
	return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnumerationAndChronologyDefinition createEnumerationAndChronologyDefinition() {
	EnumerationAndChronologyDefinitionImpl enumerationAndChronologyDefinition = new EnumerationAndChronologyDefinitionImpl();
	return enumerationAndChronologyDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtensionDefinition createExtensionDefinition() {
	ExtensionDefinitionImpl extensionDefinition = new ExtensionDefinitionImpl();
	return extensionDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtentDefinition createExtentDefinition() {
	ExtentDefinitionImpl extentDefinition = new ExtentDefinitionImpl();
	return extentDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenreDefinition createGenreDefinition() {
	GenreDefinitionImpl genreDefinition = new GenreDefinitionImpl();
	return genreDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeographicCodeDefinition createGeographicCodeDefinition() {
	GeographicCodeDefinitionImpl geographicCodeDefinition = new GeographicCodeDefinitionImpl();
	return geographicCodeDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HierarchicalGeographicDefinition createHierarchicalGeographicDefinition() {
	HierarchicalGeographicDefinitionImpl hierarchicalGeographicDefinition = new HierarchicalGeographicDefinitionImpl();
	return hierarchicalGeographicDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HoldingSimpleDefinition createHoldingSimpleDefinition() {
	HoldingSimpleDefinitionImpl holdingSimpleDefinition = new HoldingSimpleDefinitionImpl();
	return holdingSimpleDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentifierDefinition createIdentifierDefinition() {
	IdentifierDefinitionImpl identifierDefinition = new IdentifierDefinitionImpl();
	return identifierDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LanguageDefinition createLanguageDefinition() {
	LanguageDefinitionImpl languageDefinition = new LanguageDefinitionImpl();
	return languageDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LanguageTermDefinition createLanguageTermDefinition() {
	LanguageTermDefinitionImpl languageTermDefinition = new LanguageTermDefinitionImpl();
	return languageTermDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocationDefinition createLocationDefinition() {
	LocationDefinitionImpl locationDefinition = new LocationDefinitionImpl();
	return locationDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModsCollectionDefinition createModsCollectionDefinition() {
	ModsCollectionDefinitionImpl modsCollectionDefinition = new ModsCollectionDefinitionImpl();
	return modsCollectionDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModsDefinition createModsDefinition() {
	ModsDefinitionImpl modsDefinition = new ModsDefinitionImpl();
	return modsDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NameBaseDefinition createNameBaseDefinition() {
	NameBaseDefinitionImpl nameBaseDefinition = new NameBaseDefinitionImpl();
	return nameBaseDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NameDefinition createNameDefinition() {
	NameDefinitionImpl nameDefinition = new NameDefinitionImpl();
	return nameDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamePartDefinition createNamePartDefinition() {
	NamePartDefinitionImpl namePartDefinition = new NamePartDefinitionImpl();
	return namePartDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NoteBaseDefinition createNoteBaseDefinition() {
	NoteBaseDefinitionImpl noteBaseDefinition = new NoteBaseDefinitionImpl();
	return noteBaseDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NoteDefinition createNoteDefinition() {
	NoteDefinitionImpl noteDefinition = new NoteDefinitionImpl();
	return noteDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OriginInfoDefinition createOriginInfoDefinition() {
	OriginInfoDefinitionImpl originInfoDefinition = new OriginInfoDefinitionImpl();
	return originInfoDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PartDefinition createPartDefinition() {
	PartDefinitionImpl partDefinition = new PartDefinitionImpl();
	return partDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhysicalDescriptionDefinition createPhysicalDescriptionDefinition() {
	PhysicalDescriptionDefinitionImpl physicalDescriptionDefinition = new PhysicalDescriptionDefinitionImpl();
	return physicalDescriptionDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhysicalLocationDefinition createPhysicalLocationDefinition() {
	PhysicalLocationDefinitionImpl physicalLocationDefinition = new PhysicalLocationDefinitionImpl();
	return physicalLocationDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PlaceDefinition createPlaceDefinition() {
	PlaceDefinitionImpl placeDefinition = new PlaceDefinitionImpl();
	return placeDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PlaceTermDefinition createPlaceTermDefinition() {
	PlaceTermDefinitionImpl placeTermDefinition = new PlaceTermDefinitionImpl();
	return placeTermDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RecordIdentifierDefinition createRecordIdentifierDefinition() {
	RecordIdentifierDefinitionImpl recordIdentifierDefinition = new RecordIdentifierDefinitionImpl();
	return recordIdentifierDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RecordInfoDefinition createRecordInfoDefinition() {
	RecordInfoDefinitionImpl recordInfoDefinition = new RecordInfoDefinitionImpl();
	return recordInfoDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelatedItemDefinition createRelatedItemDefinition() {
	RelatedItemDefinitionImpl relatedItemDefinition = new RelatedItemDefinitionImpl();
	return relatedItemDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleDefinition createRoleDefinition() {
	RoleDefinitionImpl roleDefinition = new RoleDefinitionImpl();
	return roleDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleTermDefinition createRoleTermDefinition() {
	RoleTermDefinitionImpl roleTermDefinition = new RoleTermDefinitionImpl();
	return roleTermDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptTermDefinition createScriptTermDefinition() {
	ScriptTermDefinitionImpl scriptTermDefinition = new ScriptTermDefinitionImpl();
	return scriptTermDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringPlusAuthority createStringPlusAuthority() {
	StringPlusAuthorityImpl stringPlusAuthority = new StringPlusAuthorityImpl();
	return stringPlusAuthority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringPlusAuthorityPlusType createStringPlusAuthorityPlusType() {
	StringPlusAuthorityPlusTypeImpl stringPlusAuthorityPlusType = new StringPlusAuthorityPlusTypeImpl();
	return stringPlusAuthorityPlusType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringPlusAuthorityPlusTypePlusDisplayLabel createStringPlusAuthorityPlusTypePlusDisplayLabel() {
	StringPlusAuthorityPlusTypePlusDisplayLabelImpl stringPlusAuthorityPlusTypePlusDisplayLabel = new StringPlusAuthorityPlusTypePlusDisplayLabelImpl();
	return stringPlusAuthorityPlusTypePlusDisplayLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink() {
	StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlinkImpl stringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink = new StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlinkImpl();
	return stringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringPlusSupplied createStringPlusSupplied() {
	StringPlusSuppliedImpl stringPlusSupplied = new StringPlusSuppliedImpl();
	return stringPlusSupplied;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubjectDefinition createSubjectDefinition() {
	SubjectDefinitionImpl subjectDefinition = new SubjectDefinitionImpl();
	return subjectDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubjectNameDefinition createSubjectNameDefinition() {
	SubjectNameDefinitionImpl subjectNameDefinition = new SubjectNameDefinitionImpl();
	return subjectNameDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubjectTitleInfoDefinition createSubjectTitleInfoDefinition() {
	SubjectTitleInfoDefinitionImpl subjectTitleInfoDefinition = new SubjectTitleInfoDefinitionImpl();
	return subjectTitleInfoDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableOfContentsDefinition createTableOfContentsDefinition() {
	TableOfContentsDefinitionImpl tableOfContentsDefinition = new TableOfContentsDefinitionImpl();
	return tableOfContentsDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetAudienceDefinition createTargetAudienceDefinition() {
	TargetAudienceDefinitionImpl targetAudienceDefinition = new TargetAudienceDefinitionImpl();
	return targetAudienceDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemporalDefinition createTemporalDefinition() {
	TemporalDefinitionImpl temporalDefinition = new TemporalDefinitionImpl();
	return temporalDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TitleInfoBaseDefinition createTitleInfoBaseDefinition() {
	TitleInfoBaseDefinitionImpl titleInfoBaseDefinition = new TitleInfoBaseDefinitionImpl();
	return titleInfoBaseDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TitleInfoDefinition createTitleInfoDefinition() {
	TitleInfoDefinitionImpl titleInfoDefinition = new TitleInfoDefinitionImpl();
	return titleInfoDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeOfResourceDefinition createTypeOfResourceDefinition() {
	TypeOfResourceDefinitionImpl typeOfResourceDefinition = new TypeOfResourceDefinitionImpl();
	return typeOfResourceDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnstructuredTextDefinition createUnstructuredTextDefinition() {
	UnstructuredTextDefinitionImpl unstructuredTextDefinition = new UnstructuredTextDefinitionImpl();
	return unstructuredTextDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UrlDefinition createUrlDefinition() {
	UrlDefinitionImpl urlDefinition = new UrlDefinitionImpl();
	return urlDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XsString createXsString() {
	XsStringImpl xsString = new XsStringImpl();
	return xsString;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CodeOrTextDefinition createCodeOrTextDefinitionFromString(EDataType eDataType, String initialValue) {
	CodeOrTextDefinition result = CodeOrTextDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCodeOrTextDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateEncodingAttributeDefinition createDateEncodingAttributeDefinitionFromString(EDataType eDataType,
		    String initialValue) {
	DateEncodingAttributeDefinition result = DateEncodingAttributeDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDateEncodingAttributeDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatePointAttributeDefinition createDatePointAttributeDefinitionFromString(EDataType eDataType,
		    String initialValue) {
	DatePointAttributeDefinition result = DatePointAttributeDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDatePointAttributeDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateQualifierAttributeDefinition createDateQualifierAttributeDefinitionFromString(EDataType eDataType,
		    String initialValue) {
	DateQualifierAttributeDefinition result = DateQualifierAttributeDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDateQualifierAttributeDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DigitalOriginDefinition createDigitalOriginDefinitionFromString(EDataType eDataType, String initialValue) {
	DigitalOriginDefinition result = DigitalOriginDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDigitalOriginDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnumerationAndChronologyUnitTypeAttributeDefinition createEnumerationAndChronologyUnitTypeAttributeDefinitionFromString(
		    EDataType eDataType, String initialValue) {
	EnumerationAndChronologyUnitTypeAttributeDefinition result = EnumerationAndChronologyUnitTypeAttributeDefinition
			.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEnumerationAndChronologyUnitTypeAttributeDefinitionToString(EDataType eDataType,
		    Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IssuanceDefinition createIssuanceDefinitionFromString(EDataType eDataType, String initialValue) {
	IssuanceDefinition result = IssuanceDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIssuanceDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LanguageAuthorityAttributeDefinition createLanguageAuthorityAttributeDefinitionFromString(
		    EDataType eDataType, String initialValue) {
	LanguageAuthorityAttributeDefinition result = LanguageAuthorityAttributeDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLanguageAuthorityAttributeDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModsVersionAttributeDefinition createModsVersionAttributeDefinitionFromString(EDataType eDataType,
		    String initialValue) {
	ModsVersionAttributeDefinition result = ModsVersionAttributeDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModsVersionAttributeDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamePartTypeAttributeDefinition createNamePartTypeAttributeDefinitionFromString(EDataType eDataType,
		    String initialValue) {
	NamePartTypeAttributeDefinition result = NamePartTypeAttributeDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNamePartTypeAttributeDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NameTypeAttributeDefinition createNameTypeAttributeDefinitionFromString(EDataType eDataType,
		    String initialValue) {
	NameTypeAttributeDefinition result = NameTypeAttributeDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNameTypeAttributeDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NoDefinition createNoDefinitionFromString(EDataType eDataType, String initialValue) {
	NoDefinition result = NoDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNoDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PlaceAuthorityAttributeDefinition createPlaceAuthorityAttributeDefinitionFromString(EDataType eDataType,
		    String initialValue) {
	PlaceAuthorityAttributeDefinition result = PlaceAuthorityAttributeDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPlaceAuthorityAttributeDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReformattingQualityDefinition createReformattingQualityDefinitionFromString(EDataType eDataType,
		    String initialValue) {
	ReformattingQualityDefinition result = ReformattingQualityDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertReformattingQualityDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelatedItemTypeAttributeDefinition createRelatedItemTypeAttributeDefinitionFromString(EDataType eDataType,
		    String initialValue) {
	RelatedItemTypeAttributeDefinition result = RelatedItemTypeAttributeDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRelatedItemTypeAttributeDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceTypeDefinition createResourceTypeDefinitionFromString(EDataType eDataType, String initialValue) {
	ResourceTypeDefinition result = ResourceTypeDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertResourceTypeDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TitleInfoTypeAttributeDefinition createTitleInfoTypeAttributeDefinitionFromString(EDataType eDataType,
		    String initialValue) {
	TitleInfoTypeAttributeDefinition result = TitleInfoTypeAttributeDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTitleInfoTypeAttributeDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UrlAccessAttributeDefinition createUrlAccessAttributeDefinitionFromString(EDataType eDataType,
		    String initialValue) {
	UrlAccessAttributeDefinition result = UrlAccessAttributeDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUrlAccessAttributeDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UrlUsageAttributeDefinition createUrlUsageAttributeDefinitionFromString(EDataType eDataType,
		    String initialValue) {
	UrlUsageAttributeDefinition result = UrlUsageAttributeDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUrlUsageAttributeDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsageAttributeDefinition createUsageAttributeDefinitionFromString(EDataType eDataType, String initialValue) {
	UsageAttributeDefinition result = UsageAttributeDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUsageAttributeDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YesDefinition createYesDefinitionFromString(EDataType eDataType, String initialValue) {
	YesDefinition result = YesDefinition.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
			    + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertYesDefinitionToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CodeOrTextDefinition createCodeOrTextDefinitionObjectFromString(EDataType eDataType, String initialValue) {
	return createCodeOrTextDefinitionFromString(MODSPackage.eINSTANCE.getCodeOrTextDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCodeOrTextDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertCodeOrTextDefinitionToString(MODSPackage.eINSTANCE.getCodeOrTextDefinition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateEncodingAttributeDefinition createDateEncodingAttributeDefinitionObjectFromString(EDataType eDataType,
		    String initialValue) {
	return createDateEncodingAttributeDefinitionFromString(
			MODSPackage.eINSTANCE.getDateEncodingAttributeDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDateEncodingAttributeDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertDateEncodingAttributeDefinitionToString(
			MODSPackage.eINSTANCE.getDateEncodingAttributeDefinition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatePointAttributeDefinition createDatePointAttributeDefinitionObjectFromString(EDataType eDataType,
		    String initialValue) {
	return createDatePointAttributeDefinitionFromString(MODSPackage.eINSTANCE.getDatePointAttributeDefinition(),
			initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDatePointAttributeDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertDatePointAttributeDefinitionToString(MODSPackage.eINSTANCE.getDatePointAttributeDefinition(),
			instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateQualifierAttributeDefinition createDateQualifierAttributeDefinitionObjectFromString(EDataType eDataType,
		    String initialValue) {
	return createDateQualifierAttributeDefinitionFromString(
			MODSPackage.eINSTANCE.getDateQualifierAttributeDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDateQualifierAttributeDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertDateQualifierAttributeDefinitionToString(
			MODSPackage.eINSTANCE.getDateQualifierAttributeDefinition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DigitalOriginDefinition createDigitalOriginDefinitionObjectFromString(EDataType eDataType,
		    String initialValue) {
	return createDigitalOriginDefinitionFromString(MODSPackage.eINSTANCE.getDigitalOriginDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDigitalOriginDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertDigitalOriginDefinitionToString(MODSPackage.eINSTANCE.getDigitalOriginDefinition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnumerationAndChronologyUnitTypeAttributeDefinition createEnumerationAndChronologyUnitTypeAttributeDefinitionObjectFromString(
		    EDataType eDataType, String initialValue) {
	return createEnumerationAndChronologyUnitTypeAttributeDefinitionFromString(
			MODSPackage.eINSTANCE.getEnumerationAndChronologyUnitTypeAttributeDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEnumerationAndChronologyUnitTypeAttributeDefinitionObjectToString(EDataType eDataType,
		    Object instanceValue) {
	return convertEnumerationAndChronologyUnitTypeAttributeDefinitionToString(
			MODSPackage.eINSTANCE.getEnumerationAndChronologyUnitTypeAttributeDefinition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IssuanceDefinition createIssuanceDefinitionObjectFromString(EDataType eDataType, String initialValue) {
	return createIssuanceDefinitionFromString(MODSPackage.eINSTANCE.getIssuanceDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIssuanceDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertIssuanceDefinitionToString(MODSPackage.eINSTANCE.getIssuanceDefinition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LanguageAuthorityAttributeDefinition createLanguageAuthorityAttributeDefinitionObjectFromString(
		    EDataType eDataType, String initialValue) {
	return createLanguageAuthorityAttributeDefinitionFromString(
			MODSPackage.eINSTANCE.getLanguageAuthorityAttributeDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLanguageAuthorityAttributeDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertLanguageAuthorityAttributeDefinitionToString(
			MODSPackage.eINSTANCE.getLanguageAuthorityAttributeDefinition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModsVersionAttributeDefinition createModsVersionAttributeDefinitionObjectFromString(EDataType eDataType,
		    String initialValue) {
	return createModsVersionAttributeDefinitionFromString(
			MODSPackage.eINSTANCE.getModsVersionAttributeDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModsVersionAttributeDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertModsVersionAttributeDefinitionToString(MODSPackage.eINSTANCE.getModsVersionAttributeDefinition(),
			instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamePartTypeAttributeDefinition createNamePartTypeAttributeDefinitionObjectFromString(EDataType eDataType,
		    String initialValue) {
	return createNamePartTypeAttributeDefinitionFromString(
			MODSPackage.eINSTANCE.getNamePartTypeAttributeDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNamePartTypeAttributeDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertNamePartTypeAttributeDefinitionToString(
			MODSPackage.eINSTANCE.getNamePartTypeAttributeDefinition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NameTypeAttributeDefinition createNameTypeAttributeDefinitionObjectFromString(EDataType eDataType,
		    String initialValue) {
	return createNameTypeAttributeDefinitionFromString(MODSPackage.eINSTANCE.getNameTypeAttributeDefinition(),
			initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNameTypeAttributeDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertNameTypeAttributeDefinitionToString(MODSPackage.eINSTANCE.getNameTypeAttributeDefinition(),
			instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NoDefinition createNoDefinitionObjectFromString(EDataType eDataType, String initialValue) {
	return createNoDefinitionFromString(MODSPackage.eINSTANCE.getNoDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNoDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertNoDefinitionToString(MODSPackage.eINSTANCE.getNoDefinition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PlaceAuthorityAttributeDefinition createPlaceAuthorityAttributeDefinitionObjectFromString(
		    EDataType eDataType, String initialValue) {
	return createPlaceAuthorityAttributeDefinitionFromString(
			MODSPackage.eINSTANCE.getPlaceAuthorityAttributeDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPlaceAuthorityAttributeDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertPlaceAuthorityAttributeDefinitionToString(
			MODSPackage.eINSTANCE.getPlaceAuthorityAttributeDefinition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReformattingQualityDefinition createReformattingQualityDefinitionObjectFromString(EDataType eDataType,
		    String initialValue) {
	return createReformattingQualityDefinitionFromString(MODSPackage.eINSTANCE.getReformattingQualityDefinition(),
			initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertReformattingQualityDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertReformattingQualityDefinitionToString(MODSPackage.eINSTANCE.getReformattingQualityDefinition(),
			instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelatedItemTypeAttributeDefinition createRelatedItemTypeAttributeDefinitionObjectFromString(
		    EDataType eDataType, String initialValue) {
	return createRelatedItemTypeAttributeDefinitionFromString(
			MODSPackage.eINSTANCE.getRelatedItemTypeAttributeDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRelatedItemTypeAttributeDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertRelatedItemTypeAttributeDefinitionToString(
			MODSPackage.eINSTANCE.getRelatedItemTypeAttributeDefinition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceTypeDefinition createResourceTypeDefinitionObjectFromString(EDataType eDataType, String initialValue) {
	return createResourceTypeDefinitionFromString(MODSPackage.eINSTANCE.getResourceTypeDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertResourceTypeDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertResourceTypeDefinitionToString(MODSPackage.eINSTANCE.getResourceTypeDefinition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TitleInfoTypeAttributeDefinition createTitleInfoTypeAttributeDefinitionObjectFromString(EDataType eDataType,
		    String initialValue) {
	return createTitleInfoTypeAttributeDefinitionFromString(
			MODSPackage.eINSTANCE.getTitleInfoTypeAttributeDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTitleInfoTypeAttributeDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertTitleInfoTypeAttributeDefinitionToString(
			MODSPackage.eINSTANCE.getTitleInfoTypeAttributeDefinition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UrlAccessAttributeDefinition createUrlAccessAttributeDefinitionObjectFromString(EDataType eDataType,
		    String initialValue) {
	return createUrlAccessAttributeDefinitionFromString(MODSPackage.eINSTANCE.getUrlAccessAttributeDefinition(),
			initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUrlAccessAttributeDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertUrlAccessAttributeDefinitionToString(MODSPackage.eINSTANCE.getUrlAccessAttributeDefinition(),
			instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UrlUsageAttributeDefinition createUrlUsageAttributeDefinitionObjectFromString(EDataType eDataType,
		    String initialValue) {
	return createUrlUsageAttributeDefinitionFromString(MODSPackage.eINSTANCE.getUrlUsageAttributeDefinition(),
			initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUrlUsageAttributeDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertUrlUsageAttributeDefinitionToString(MODSPackage.eINSTANCE.getUrlUsageAttributeDefinition(),
			instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsageAttributeDefinition createUsageAttributeDefinitionObjectFromString(EDataType eDataType,
		    String initialValue) {
	return createUsageAttributeDefinitionFromString(MODSPackage.eINSTANCE.getUsageAttributeDefinition(),
			initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUsageAttributeDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertUsageAttributeDefinitionToString(MODSPackage.eINSTANCE.getUsageAttributeDefinition(),
			instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YesDefinition createYesDefinitionObjectFromString(EDataType eDataType, String initialValue) {
	return createYesDefinitionFromString(MODSPackage.eINSTANCE.getYesDefinition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertYesDefinitionObjectToString(EDataType eDataType, Object instanceValue) {
	return convertYesDefinitionToString(MODSPackage.eINSTANCE.getYesDefinition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MODSPackage getMODSPackage() {
	return (MODSPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MODSPackage getPackage() {
	return MODSPackage.eINSTANCE;
    }

} //MODSFactoryImpl
