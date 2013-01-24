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
package gov.loc.mods.mods.util;

import gov.loc.mods.mods.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage
 * @generated
 */
public class MODSSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MODSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MODSSwitch() {
		if (modelPackage == null) {
			modelPackage = MODSPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MODSPackage.ABSTRACT_DEFINITION: {
			AbstractDefinition abstractDefinition = (AbstractDefinition) theEObject;
			T result = caseAbstractDefinition(abstractDefinition);
			if (result == null)
				result = caseUnstructuredTextDefinition(abstractDefinition);
			if (result == null)
				result = caseXsString(abstractDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.ACCESS_CONDITION_DEFINITION: {
			AccessConditionDefinition accessConditionDefinition = (AccessConditionDefinition) theEObject;
			T result = caseAccessConditionDefinition(accessConditionDefinition);
			if (result == null)
				result = caseXsString(accessConditionDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.CARTOGRAPHICS_DEFINITION: {
			CartographicsDefinition cartographicsDefinition = (CartographicsDefinition) theEObject;
			T result = caseCartographicsDefinition(cartographicsDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.CLASSIFICATION_DEFINITION: {
			ClassificationDefinition classificationDefinition = (ClassificationDefinition) theEObject;
			T result = caseClassificationDefinition(classificationDefinition);
			if (result == null)
				result = caseStringPlusAuthority(classificationDefinition);
			if (result == null)
				result = caseXsString(classificationDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.COPY_INFORMATION_DEFINITION: {
			CopyInformationDefinition copyInformationDefinition = (CopyInformationDefinition) theEObject;
			T result = caseCopyInformationDefinition(copyInformationDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.DATE_BASE_DEFINITION: {
			DateBaseDefinition dateBaseDefinition = (DateBaseDefinition) theEObject;
			T result = caseDateBaseDefinition(dateBaseDefinition);
			if (result == null)
				result = caseXsString(dateBaseDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.DATE_DEFINITION: {
			DateDefinition dateDefinition = (DateDefinition) theEObject;
			T result = caseDateDefinition(dateDefinition);
			if (result == null)
				result = caseDateBaseDefinition(dateDefinition);
			if (result == null)
				result = caseXsString(dateDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.DATE_OTHER_DEFINITION: {
			DateOtherDefinition dateOtherDefinition = (DateOtherDefinition) theEObject;
			T result = caseDateOtherDefinition(dateOtherDefinition);
			if (result == null)
				result = caseDateDefinition(dateOtherDefinition);
			if (result == null)
				result = caseDateBaseDefinition(dateOtherDefinition);
			if (result == null)
				result = caseXsString(dateOtherDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.DETAIL_DEFINITION: {
			DetailDefinition detailDefinition = (DetailDefinition) theEObject;
			T result = caseDetailDefinition(detailDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.DOCUMENT_ROOT: {
			DocumentRoot documentRoot = (DocumentRoot) theEObject;
			T result = caseDocumentRoot(documentRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.ENUMERATION_AND_CHRONOLOGY_DEFINITION: {
			EnumerationAndChronologyDefinition enumerationAndChronologyDefinition = (EnumerationAndChronologyDefinition) theEObject;
			T result = caseEnumerationAndChronologyDefinition(enumerationAndChronologyDefinition);
			if (result == null)
				result = caseXsString(enumerationAndChronologyDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.EXTENSION_DEFINITION: {
			ExtensionDefinition extensionDefinition = (ExtensionDefinition) theEObject;
			T result = caseExtensionDefinition(extensionDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.EXTENT_DEFINITION: {
			ExtentDefinition extentDefinition = (ExtentDefinition) theEObject;
			T result = caseExtentDefinition(extentDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.GENRE_DEFINITION: {
			GenreDefinition genreDefinition = (GenreDefinition) theEObject;
			T result = caseGenreDefinition(genreDefinition);
			if (result == null)
				result = caseStringPlusAuthorityPlusTypePlusDisplayLabel(genreDefinition);
			if (result == null)
				result = caseStringPlusAuthorityPlusType(genreDefinition);
			if (result == null)
				result = caseStringPlusAuthority(genreDefinition);
			if (result == null)
				result = caseXsString(genreDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.GEOGRAPHIC_CODE_DEFINITION: {
			GeographicCodeDefinition geographicCodeDefinition = (GeographicCodeDefinition) theEObject;
			T result = caseGeographicCodeDefinition(geographicCodeDefinition);
			if (result == null)
				result = caseXsString(geographicCodeDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION: {
			HierarchicalGeographicDefinition hierarchicalGeographicDefinition = (HierarchicalGeographicDefinition) theEObject;
			T result = caseHierarchicalGeographicDefinition(hierarchicalGeographicDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.HOLDING_SIMPLE_DEFINITION: {
			HoldingSimpleDefinition holdingSimpleDefinition = (HoldingSimpleDefinition) theEObject;
			T result = caseHoldingSimpleDefinition(holdingSimpleDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.IDENTIFIER_DEFINITION: {
			IdentifierDefinition identifierDefinition = (IdentifierDefinition) theEObject;
			T result = caseIdentifierDefinition(identifierDefinition);
			if (result == null)
				result = caseXsString(identifierDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.LANGUAGE_DEFINITION: {
			LanguageDefinition languageDefinition = (LanguageDefinition) theEObject;
			T result = caseLanguageDefinition(languageDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.LANGUAGE_TERM_DEFINITION: {
			LanguageTermDefinition languageTermDefinition = (LanguageTermDefinition) theEObject;
			T result = caseLanguageTermDefinition(languageTermDefinition);
			if (result == null)
				result = caseXsString(languageTermDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.LOCATION_DEFINITION: {
			LocationDefinition locationDefinition = (LocationDefinition) theEObject;
			T result = caseLocationDefinition(locationDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.MODS_COLLECTION_DEFINITION: {
			ModsCollectionDefinition modsCollectionDefinition = (ModsCollectionDefinition) theEObject;
			T result = caseModsCollectionDefinition(modsCollectionDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.MODS_DEFINITION: {
			ModsDefinition modsDefinition = (ModsDefinition) theEObject;
			T result = caseModsDefinition(modsDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.NAME_BASE_DEFINITION: {
			NameBaseDefinition nameBaseDefinition = (NameBaseDefinition) theEObject;
			T result = caseNameBaseDefinition(nameBaseDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.NAME_DEFINITION: {
			NameDefinition nameDefinition = (NameDefinition) theEObject;
			T result = caseNameDefinition(nameDefinition);
			if (result == null)
				result = caseNameBaseDefinition(nameDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.NAME_PART_DEFINITION: {
			NamePartDefinition namePartDefinition = (NamePartDefinition) theEObject;
			T result = caseNamePartDefinition(namePartDefinition);
			if (result == null)
				result = caseXsString(namePartDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.NOTE_BASE_DEFINITION: {
			NoteBaseDefinition noteBaseDefinition = (NoteBaseDefinition) theEObject;
			T result = caseNoteBaseDefinition(noteBaseDefinition);
			if (result == null)
				result = caseUnstructuredTextDefinition(noteBaseDefinition);
			if (result == null)
				result = caseXsString(noteBaseDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.NOTE_DEFINITION: {
			NoteDefinition noteDefinition = (NoteDefinition) theEObject;
			T result = caseNoteDefinition(noteDefinition);
			if (result == null)
				result = caseNoteBaseDefinition(noteDefinition);
			if (result == null)
				result = caseUnstructuredTextDefinition(noteDefinition);
			if (result == null)
				result = caseXsString(noteDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.ORIGIN_INFO_DEFINITION: {
			OriginInfoDefinition originInfoDefinition = (OriginInfoDefinition) theEObject;
			T result = caseOriginInfoDefinition(originInfoDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.PART_DEFINITION: {
			PartDefinition partDefinition = (PartDefinition) theEObject;
			T result = casePartDefinition(partDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION: {
			PhysicalDescriptionDefinition physicalDescriptionDefinition = (PhysicalDescriptionDefinition) theEObject;
			T result = casePhysicalDescriptionDefinition(physicalDescriptionDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.PHYSICAL_LOCATION_DEFINITION: {
			PhysicalLocationDefinition physicalLocationDefinition = (PhysicalLocationDefinition) theEObject;
			T result = casePhysicalLocationDefinition(physicalLocationDefinition);
			if (result == null)
				result = caseStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink(physicalLocationDefinition);
			if (result == null)
				result = caseStringPlusAuthorityPlusTypePlusDisplayLabel(physicalLocationDefinition);
			if (result == null)
				result = caseStringPlusAuthorityPlusType(physicalLocationDefinition);
			if (result == null)
				result = caseStringPlusAuthority(physicalLocationDefinition);
			if (result == null)
				result = caseXsString(physicalLocationDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.PLACE_DEFINITION: {
			PlaceDefinition placeDefinition = (PlaceDefinition) theEObject;
			T result = casePlaceDefinition(placeDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.PLACE_TERM_DEFINITION: {
			PlaceTermDefinition placeTermDefinition = (PlaceTermDefinition) theEObject;
			T result = casePlaceTermDefinition(placeTermDefinition);
			if (result == null)
				result = caseXsString(placeTermDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.RECORD_IDENTIFIER_DEFINITION: {
			RecordIdentifierDefinition recordIdentifierDefinition = (RecordIdentifierDefinition) theEObject;
			T result = caseRecordIdentifierDefinition(recordIdentifierDefinition);
			if (result == null)
				result = caseXsString(recordIdentifierDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.RECORD_INFO_DEFINITION: {
			RecordInfoDefinition recordInfoDefinition = (RecordInfoDefinition) theEObject;
			T result = caseRecordInfoDefinition(recordInfoDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.RELATED_ITEM_DEFINITION: {
			RelatedItemDefinition relatedItemDefinition = (RelatedItemDefinition) theEObject;
			T result = caseRelatedItemDefinition(relatedItemDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.ROLE_DEFINITION: {
			RoleDefinition roleDefinition = (RoleDefinition) theEObject;
			T result = caseRoleDefinition(roleDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.ROLE_TERM_DEFINITION: {
			RoleTermDefinition roleTermDefinition = (RoleTermDefinition) theEObject;
			T result = caseRoleTermDefinition(roleTermDefinition);
			if (result == null)
				result = caseStringPlusAuthority(roleTermDefinition);
			if (result == null)
				result = caseXsString(roleTermDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.SCRIPT_TERM_DEFINITION: {
			ScriptTermDefinition scriptTermDefinition = (ScriptTermDefinition) theEObject;
			T result = caseScriptTermDefinition(scriptTermDefinition);
			if (result == null)
				result = caseStringPlusAuthority(scriptTermDefinition);
			if (result == null)
				result = caseXsString(scriptTermDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.STRING_PLUS_AUTHORITY: {
			StringPlusAuthority stringPlusAuthority = (StringPlusAuthority) theEObject;
			T result = caseStringPlusAuthority(stringPlusAuthority);
			if (result == null)
				result = caseXsString(stringPlusAuthority);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE: {
			StringPlusAuthorityPlusType stringPlusAuthorityPlusType = (StringPlusAuthorityPlusType) theEObject;
			T result = caseStringPlusAuthorityPlusType(stringPlusAuthorityPlusType);
			if (result == null)
				result = caseStringPlusAuthority(stringPlusAuthorityPlusType);
			if (result == null)
				result = caseXsString(stringPlusAuthorityPlusType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL: {
			StringPlusAuthorityPlusTypePlusDisplayLabel stringPlusAuthorityPlusTypePlusDisplayLabel = (StringPlusAuthorityPlusTypePlusDisplayLabel) theEObject;
			T result = caseStringPlusAuthorityPlusTypePlusDisplayLabel(stringPlusAuthorityPlusTypePlusDisplayLabel);
			if (result == null)
				result = caseStringPlusAuthorityPlusType(stringPlusAuthorityPlusTypePlusDisplayLabel);
			if (result == null)
				result = caseStringPlusAuthority(stringPlusAuthorityPlusTypePlusDisplayLabel);
			if (result == null)
				result = caseXsString(stringPlusAuthorityPlusTypePlusDisplayLabel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK: {
			StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink stringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink = (StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink) theEObject;
			T result = caseStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink(stringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink);
			if (result == null)
				result = caseStringPlusAuthorityPlusTypePlusDisplayLabel(stringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink);
			if (result == null)
				result = caseStringPlusAuthorityPlusType(stringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink);
			if (result == null)
				result = caseStringPlusAuthority(stringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink);
			if (result == null)
				result = caseXsString(stringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.STRING_PLUS_SUPPLIED: {
			StringPlusSupplied stringPlusSupplied = (StringPlusSupplied) theEObject;
			T result = caseStringPlusSupplied(stringPlusSupplied);
			if (result == null)
				result = caseXsString(stringPlusSupplied);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.SUBJECT_DEFINITION: {
			SubjectDefinition subjectDefinition = (SubjectDefinition) theEObject;
			T result = caseSubjectDefinition(subjectDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.SUBJECT_NAME_DEFINITION: {
			SubjectNameDefinition subjectNameDefinition = (SubjectNameDefinition) theEObject;
			T result = caseSubjectNameDefinition(subjectNameDefinition);
			if (result == null)
				result = caseNameBaseDefinition(subjectNameDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.SUBJECT_TITLE_INFO_DEFINITION: {
			SubjectTitleInfoDefinition subjectTitleInfoDefinition = (SubjectTitleInfoDefinition) theEObject;
			T result = caseSubjectTitleInfoDefinition(subjectTitleInfoDefinition);
			if (result == null)
				result = caseTitleInfoBaseDefinition(subjectTitleInfoDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.TABLE_OF_CONTENTS_DEFINITION: {
			TableOfContentsDefinition tableOfContentsDefinition = (TableOfContentsDefinition) theEObject;
			T result = caseTableOfContentsDefinition(tableOfContentsDefinition);
			if (result == null)
				result = caseUnstructuredTextDefinition(tableOfContentsDefinition);
			if (result == null)
				result = caseXsString(tableOfContentsDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.TARGET_AUDIENCE_DEFINITION: {
			TargetAudienceDefinition targetAudienceDefinition = (TargetAudienceDefinition) theEObject;
			T result = caseTargetAudienceDefinition(targetAudienceDefinition);
			if (result == null)
				result = caseStringPlusAuthority(targetAudienceDefinition);
			if (result == null)
				result = caseXsString(targetAudienceDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.TEMPORAL_DEFINITION: {
			TemporalDefinition temporalDefinition = (TemporalDefinition) theEObject;
			T result = caseTemporalDefinition(temporalDefinition);
			if (result == null)
				result = caseDateDefinition(temporalDefinition);
			if (result == null)
				result = caseDateBaseDefinition(temporalDefinition);
			if (result == null)
				result = caseXsString(temporalDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.TITLE_INFO_BASE_DEFINITION: {
			TitleInfoBaseDefinition titleInfoBaseDefinition = (TitleInfoBaseDefinition) theEObject;
			T result = caseTitleInfoBaseDefinition(titleInfoBaseDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.TITLE_INFO_DEFINITION: {
			TitleInfoDefinition titleInfoDefinition = (TitleInfoDefinition) theEObject;
			T result = caseTitleInfoDefinition(titleInfoDefinition);
			if (result == null)
				result = caseTitleInfoBaseDefinition(titleInfoDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.TYPE_OF_RESOURCE_DEFINITION: {
			TypeOfResourceDefinition typeOfResourceDefinition = (TypeOfResourceDefinition) theEObject;
			T result = caseTypeOfResourceDefinition(typeOfResourceDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION: {
			UnstructuredTextDefinition unstructuredTextDefinition = (UnstructuredTextDefinition) theEObject;
			T result = caseUnstructuredTextDefinition(unstructuredTextDefinition);
			if (result == null)
				result = caseXsString(unstructuredTextDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.URL_DEFINITION: {
			UrlDefinition urlDefinition = (UrlDefinition) theEObject;
			T result = caseUrlDefinition(urlDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MODSPackage.XS_STRING: {
			XsString xsString = (XsString) theEObject;
			T result = caseXsString(xsString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDefinition(AbstractDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Condition Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Condition Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessConditionDefinition(AccessConditionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartographics Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartographics Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartographicsDefinition(CartographicsDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classification Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classification Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassificationDefinition(ClassificationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy Information Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy Information Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyInformationDefinition(CopyInformationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Base Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Base Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateBaseDefinition(DateBaseDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateDefinition(DateDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Other Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Other Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateOtherDefinition(DateOtherDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detail Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detail Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailDefinition(DetailDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration And Chronology Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration And Chronology Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationAndChronologyDefinition(
			EnumerationAndChronologyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionDefinition(ExtensionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extent Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extent Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtentDefinition(ExtentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Genre Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Genre Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenreDefinition(GenreDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geographic Code Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geographic Code Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeographicCodeDefinition(GeographicCodeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchical Geographic Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchical Geographic Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierarchicalGeographicDefinition(
			HierarchicalGeographicDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Holding Simple Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Holding Simple Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoldingSimpleDefinition(HoldingSimpleDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierDefinition(IdentifierDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageDefinition(LanguageDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Term Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Term Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageTermDefinition(LanguageTermDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationDefinition(LocationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mods Collection Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mods Collection Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModsCollectionDefinition(ModsCollectionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mods Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mods Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModsDefinition(ModsDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Base Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Base Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameBaseDefinition(NameBaseDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameDefinition(NameDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Part Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Part Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamePartDefinition(NamePartDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Base Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Base Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteBaseDefinition(NoteBaseDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteDefinition(NoteDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Origin Info Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Origin Info Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOriginInfoDefinition(OriginInfoDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartDefinition(PartDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Description Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Description Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalDescriptionDefinition(
			PhysicalDescriptionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Location Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Location Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalLocationDefinition(PhysicalLocationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceDefinition(PlaceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Term Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Term Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceTermDefinition(PlaceTermDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Identifier Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Identifier Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordIdentifierDefinition(RecordIdentifierDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Info Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Info Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordInfoDefinition(RecordInfoDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Item Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedItemDefinition(RelatedItemDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleDefinition(RoleDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Term Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Term Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleTermDefinition(RoleTermDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Term Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Term Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptTermDefinition(ScriptTermDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Plus Authority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Plus Authority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringPlusAuthority(StringPlusAuthority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Plus Authority Plus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Plus Authority Plus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringPlusAuthorityPlusType(StringPlusAuthorityPlusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Plus Authority Plus Type Plus Display Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Plus Authority Plus Type Plus Display Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringPlusAuthorityPlusTypePlusDisplayLabel(
			StringPlusAuthorityPlusTypePlusDisplayLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Plus Authority Plus Type Plus Display Label Plus Xlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Plus Authority Plus Type Plus Display Label Plus Xlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink(
			StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Plus Supplied</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Plus Supplied</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringPlusSupplied(StringPlusSupplied object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectDefinition(SubjectDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Name Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Name Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectNameDefinition(SubjectNameDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Title Info Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Title Info Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectTitleInfoDefinition(SubjectTitleInfoDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Of Contents Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Of Contents Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableOfContentsDefinition(TableOfContentsDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Audience Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Audience Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetAudienceDefinition(TargetAudienceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalDefinition(TemporalDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Info Base Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Info Base Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleInfoBaseDefinition(TitleInfoBaseDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Info Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Info Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleInfoDefinition(TitleInfoDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Of Resource Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Of Resource Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOfResourceDefinition(TypeOfResourceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Text Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Text Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredTextDefinition(UnstructuredTextDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrlDefinition(UrlDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xs String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xs String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXsString(XsString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MODSSwitch
