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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.loc.mods.mods.MODSPackage
 * @generated
 */
public class MODSAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MODSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MODSAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MODSPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MODSSwitch<Adapter> modelSwitch = new MODSSwitch<Adapter>() {
		@Override
		public Adapter caseAbstractDefinition(AbstractDefinition object) {
			return createAbstractDefinitionAdapter();
		}

		@Override
		public Adapter caseAccessConditionDefinition(AccessConditionDefinition object) {
			return createAccessConditionDefinitionAdapter();
		}

		@Override
		public Adapter caseCartographicsDefinition(CartographicsDefinition object) {
			return createCartographicsDefinitionAdapter();
		}

		@Override
		public Adapter caseClassificationDefinition(ClassificationDefinition object) {
			return createClassificationDefinitionAdapter();
		}

		@Override
		public Adapter caseCopyInformationDefinition(CopyInformationDefinition object) {
			return createCopyInformationDefinitionAdapter();
		}

		@Override
		public Adapter caseDateBaseDefinition(DateBaseDefinition object) {
			return createDateBaseDefinitionAdapter();
		}

		@Override
		public Adapter caseDateDefinition(DateDefinition object) {
			return createDateDefinitionAdapter();
		}

		@Override
		public Adapter caseDateOtherDefinition(DateOtherDefinition object) {
			return createDateOtherDefinitionAdapter();
		}

		@Override
		public Adapter caseDetailDefinition(DetailDefinition object) {
			return createDetailDefinitionAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseEnumerationAndChronologyDefinition(EnumerationAndChronologyDefinition object) {
			return createEnumerationAndChronologyDefinitionAdapter();
		}

		@Override
		public Adapter caseExtensionDefinition(ExtensionDefinition object) {
			return createExtensionDefinitionAdapter();
		}

		@Override
		public Adapter caseExtentDefinition(ExtentDefinition object) {
			return createExtentDefinitionAdapter();
		}

		@Override
		public Adapter caseGenreDefinition(GenreDefinition object) {
			return createGenreDefinitionAdapter();
		}

		@Override
		public Adapter caseGeographicCodeDefinition(GeographicCodeDefinition object) {
			return createGeographicCodeDefinitionAdapter();
		}

		@Override
		public Adapter caseHierarchicalGeographicDefinition(HierarchicalGeographicDefinition object) {
			return createHierarchicalGeographicDefinitionAdapter();
		}

		@Override
		public Adapter caseHoldingSimpleDefinition(HoldingSimpleDefinition object) {
			return createHoldingSimpleDefinitionAdapter();
		}

		@Override
		public Adapter caseIdentifierDefinition(IdentifierDefinition object) {
			return createIdentifierDefinitionAdapter();
		}

		@Override
		public Adapter caseLanguageDefinition(LanguageDefinition object) {
			return createLanguageDefinitionAdapter();
		}

		@Override
		public Adapter caseLanguageTermDefinition(LanguageTermDefinition object) {
			return createLanguageTermDefinitionAdapter();
		}

		@Override
		public Adapter caseLocationDefinition(LocationDefinition object) {
			return createLocationDefinitionAdapter();
		}

		@Override
		public Adapter caseModsCollectionDefinition(ModsCollectionDefinition object) {
			return createModsCollectionDefinitionAdapter();
		}

		@Override
		public Adapter caseModsDefinition(ModsDefinition object) {
			return createModsDefinitionAdapter();
		}

		@Override
		public Adapter caseNameBaseDefinition(NameBaseDefinition object) {
			return createNameBaseDefinitionAdapter();
		}

		@Override
		public Adapter caseNameDefinition(NameDefinition object) {
			return createNameDefinitionAdapter();
		}

		@Override
		public Adapter caseNamePartDefinition(NamePartDefinition object) {
			return createNamePartDefinitionAdapter();
		}

		@Override
		public Adapter caseNoteBaseDefinition(NoteBaseDefinition object) {
			return createNoteBaseDefinitionAdapter();
		}

		@Override
		public Adapter caseNoteDefinition(NoteDefinition object) {
			return createNoteDefinitionAdapter();
		}

		@Override
		public Adapter caseOriginInfoDefinition(OriginInfoDefinition object) {
			return createOriginInfoDefinitionAdapter();
		}

		@Override
		public Adapter casePartDefinition(PartDefinition object) {
			return createPartDefinitionAdapter();
		}

		@Override
		public Adapter casePhysicalDescriptionDefinition(PhysicalDescriptionDefinition object) {
			return createPhysicalDescriptionDefinitionAdapter();
		}

		@Override
		public Adapter casePhysicalLocationDefinition(PhysicalLocationDefinition object) {
			return createPhysicalLocationDefinitionAdapter();
		}

		@Override
		public Adapter casePlaceDefinition(PlaceDefinition object) {
			return createPlaceDefinitionAdapter();
		}

		@Override
		public Adapter casePlaceTermDefinition(PlaceTermDefinition object) {
			return createPlaceTermDefinitionAdapter();
		}

		@Override
		public Adapter caseRecordIdentifierDefinition(RecordIdentifierDefinition object) {
			return createRecordIdentifierDefinitionAdapter();
		}

		@Override
		public Adapter caseRecordInfoDefinition(RecordInfoDefinition object) {
			return createRecordInfoDefinitionAdapter();
		}

		@Override
		public Adapter caseRelatedItemDefinition(RelatedItemDefinition object) {
			return createRelatedItemDefinitionAdapter();
		}

		@Override
		public Adapter caseRoleDefinition(RoleDefinition object) {
			return createRoleDefinitionAdapter();
		}

		@Override
		public Adapter caseRoleTermDefinition(RoleTermDefinition object) {
			return createRoleTermDefinitionAdapter();
		}

		@Override
		public Adapter caseScriptTermDefinition(ScriptTermDefinition object) {
			return createScriptTermDefinitionAdapter();
		}

		@Override
		public Adapter caseStringPlusAuthority(StringPlusAuthority object) {
			return createStringPlusAuthorityAdapter();
		}

		@Override
		public Adapter caseStringPlusAuthorityPlusType(StringPlusAuthorityPlusType object) {
			return createStringPlusAuthorityPlusTypeAdapter();
		}

		@Override
		public Adapter caseStringPlusAuthorityPlusTypePlusDisplayLabel(StringPlusAuthorityPlusTypePlusDisplayLabel object) {
			return createStringPlusAuthorityPlusTypePlusDisplayLabelAdapter();
		}

		@Override
		public Adapter caseStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink(
				StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink object) {
			return createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlinkAdapter();
		}

		@Override
		public Adapter caseStringPlusSupplied(StringPlusSupplied object) {
			return createStringPlusSuppliedAdapter();
		}

		@Override
		public Adapter caseSubjectDefinition(SubjectDefinition object) {
			return createSubjectDefinitionAdapter();
		}

		@Override
		public Adapter caseSubjectNameDefinition(SubjectNameDefinition object) {
			return createSubjectNameDefinitionAdapter();
		}

		@Override
		public Adapter caseSubjectTitleInfoDefinition(SubjectTitleInfoDefinition object) {
			return createSubjectTitleInfoDefinitionAdapter();
		}

		@Override
		public Adapter caseTableOfContentsDefinition(TableOfContentsDefinition object) {
			return createTableOfContentsDefinitionAdapter();
		}

		@Override
		public Adapter caseTargetAudienceDefinition(TargetAudienceDefinition object) {
			return createTargetAudienceDefinitionAdapter();
		}

		@Override
		public Adapter caseTemporalDefinition(TemporalDefinition object) {
			return createTemporalDefinitionAdapter();
		}

		@Override
		public Adapter caseTitleInfoBaseDefinition(TitleInfoBaseDefinition object) {
			return createTitleInfoBaseDefinitionAdapter();
		}

		@Override
		public Adapter caseTitleInfoDefinition(TitleInfoDefinition object) {
			return createTitleInfoDefinitionAdapter();
		}

		@Override
		public Adapter caseTypeOfResourceDefinition(TypeOfResourceDefinition object) {
			return createTypeOfResourceDefinitionAdapter();
		}

		@Override
		public Adapter caseUnstructuredTextDefinition(UnstructuredTextDefinition object) {
			return createUnstructuredTextDefinitionAdapter();
		}

		@Override
		public Adapter caseUrlDefinition(UrlDefinition object) {
			return createUrlDefinitionAdapter();
		}

		@Override
		public Adapter caseXsString(XsString object) {
			return createXsStringAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.AbstractDefinition <em>Abstract Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.AbstractDefinition
	 * @generated
	 */
	public Adapter createAbstractDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.AccessConditionDefinition <em>Access Condition Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.AccessConditionDefinition
	 * @generated
	 */
	public Adapter createAccessConditionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.CartographicsDefinition <em>Cartographics Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.CartographicsDefinition
	 * @generated
	 */
	public Adapter createCartographicsDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.ClassificationDefinition <em>Classification Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.ClassificationDefinition
	 * @generated
	 */
	public Adapter createClassificationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.CopyInformationDefinition <em>Copy Information Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.CopyInformationDefinition
	 * @generated
	 */
	public Adapter createCopyInformationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.DateBaseDefinition <em>Date Base Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.DateBaseDefinition
	 * @generated
	 */
	public Adapter createDateBaseDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.DateDefinition <em>Date Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.DateDefinition
	 * @generated
	 */
	public Adapter createDateDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.DateOtherDefinition <em>Date Other Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.DateOtherDefinition
	 * @generated
	 */
	public Adapter createDateOtherDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.DetailDefinition <em>Detail Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.DetailDefinition
	 * @generated
	 */
	public Adapter createDetailDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.EnumerationAndChronologyDefinition <em>Enumeration And Chronology Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.EnumerationAndChronologyDefinition
	 * @generated
	 */
	public Adapter createEnumerationAndChronologyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.ExtensionDefinition <em>Extension Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.ExtensionDefinition
	 * @generated
	 */
	public Adapter createExtensionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.ExtentDefinition <em>Extent Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.ExtentDefinition
	 * @generated
	 */
	public Adapter createExtentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.GenreDefinition <em>Genre Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.GenreDefinition
	 * @generated
	 */
	public Adapter createGenreDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.GeographicCodeDefinition <em>Geographic Code Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.GeographicCodeDefinition
	 * @generated
	 */
	public Adapter createGeographicCodeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.HierarchicalGeographicDefinition <em>Hierarchical Geographic Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.HierarchicalGeographicDefinition
	 * @generated
	 */
	public Adapter createHierarchicalGeographicDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.HoldingSimpleDefinition <em>Holding Simple Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.HoldingSimpleDefinition
	 * @generated
	 */
	public Adapter createHoldingSimpleDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.IdentifierDefinition <em>Identifier Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.IdentifierDefinition
	 * @generated
	 */
	public Adapter createIdentifierDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.LanguageDefinition <em>Language Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.LanguageDefinition
	 * @generated
	 */
	public Adapter createLanguageDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.LanguageTermDefinition <em>Language Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.LanguageTermDefinition
	 * @generated
	 */
	public Adapter createLanguageTermDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.LocationDefinition <em>Location Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.LocationDefinition
	 * @generated
	 */
	public Adapter createLocationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.ModsCollectionDefinition <em>Mods Collection Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.ModsCollectionDefinition
	 * @generated
	 */
	public Adapter createModsCollectionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.ModsDefinition <em>Mods Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.ModsDefinition
	 * @generated
	 */
	public Adapter createModsDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.NameBaseDefinition <em>Name Base Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.NameBaseDefinition
	 * @generated
	 */
	public Adapter createNameBaseDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.NameDefinition <em>Name Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.NameDefinition
	 * @generated
	 */
	public Adapter createNameDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.NamePartDefinition <em>Name Part Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.NamePartDefinition
	 * @generated
	 */
	public Adapter createNamePartDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.NoteBaseDefinition <em>Note Base Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.NoteBaseDefinition
	 * @generated
	 */
	public Adapter createNoteBaseDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.NoteDefinition <em>Note Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.NoteDefinition
	 * @generated
	 */
	public Adapter createNoteDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.OriginInfoDefinition <em>Origin Info Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.OriginInfoDefinition
	 * @generated
	 */
	public Adapter createOriginInfoDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.PartDefinition <em>Part Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.PartDefinition
	 * @generated
	 */
	public Adapter createPartDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition <em>Physical Description Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.PhysicalDescriptionDefinition
	 * @generated
	 */
	public Adapter createPhysicalDescriptionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.PhysicalLocationDefinition <em>Physical Location Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.PhysicalLocationDefinition
	 * @generated
	 */
	public Adapter createPhysicalLocationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.PlaceDefinition <em>Place Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.PlaceDefinition
	 * @generated
	 */
	public Adapter createPlaceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.PlaceTermDefinition <em>Place Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.PlaceTermDefinition
	 * @generated
	 */
	public Adapter createPlaceTermDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.RecordIdentifierDefinition <em>Record Identifier Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.RecordIdentifierDefinition
	 * @generated
	 */
	public Adapter createRecordIdentifierDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.RecordInfoDefinition <em>Record Info Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.RecordInfoDefinition
	 * @generated
	 */
	public Adapter createRecordInfoDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.RelatedItemDefinition <em>Related Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.RelatedItemDefinition
	 * @generated
	 */
	public Adapter createRelatedItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.RoleDefinition <em>Role Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.RoleDefinition
	 * @generated
	 */
	public Adapter createRoleDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.RoleTermDefinition <em>Role Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.RoleTermDefinition
	 * @generated
	 */
	public Adapter createRoleTermDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.ScriptTermDefinition <em>Script Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.ScriptTermDefinition
	 * @generated
	 */
	public Adapter createScriptTermDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.StringPlusAuthority <em>String Plus Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.StringPlusAuthority
	 * @generated
	 */
	public Adapter createStringPlusAuthorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.StringPlusAuthorityPlusType <em>String Plus Authority Plus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusType
	 * @generated
	 */
	public Adapter createStringPlusAuthorityPlusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabel <em>String Plus Authority Plus Type Plus Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabel
	 * @generated
	 */
	public Adapter createStringPlusAuthorityPlusTypePlusDisplayLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink <em>String Plus Authority Plus Type Plus Display Label Plus Xlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink
	 * @generated
	 */
	public Adapter createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.StringPlusSupplied <em>String Plus Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.StringPlusSupplied
	 * @generated
	 */
	public Adapter createStringPlusSuppliedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.SubjectDefinition <em>Subject Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.SubjectDefinition
	 * @generated
	 */
	public Adapter createSubjectDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.SubjectNameDefinition <em>Subject Name Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.SubjectNameDefinition
	 * @generated
	 */
	public Adapter createSubjectNameDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.SubjectTitleInfoDefinition <em>Subject Title Info Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.SubjectTitleInfoDefinition
	 * @generated
	 */
	public Adapter createSubjectTitleInfoDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.TableOfContentsDefinition <em>Table Of Contents Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.TableOfContentsDefinition
	 * @generated
	 */
	public Adapter createTableOfContentsDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.TargetAudienceDefinition <em>Target Audience Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.TargetAudienceDefinition
	 * @generated
	 */
	public Adapter createTargetAudienceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.TemporalDefinition <em>Temporal Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.TemporalDefinition
	 * @generated
	 */
	public Adapter createTemporalDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.TitleInfoBaseDefinition <em>Title Info Base Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.TitleInfoBaseDefinition
	 * @generated
	 */
	public Adapter createTitleInfoBaseDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.TitleInfoDefinition <em>Title Info Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.TitleInfoDefinition
	 * @generated
	 */
	public Adapter createTitleInfoDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.TypeOfResourceDefinition <em>Type Of Resource Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.TypeOfResourceDefinition
	 * @generated
	 */
	public Adapter createTypeOfResourceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.UnstructuredTextDefinition <em>Unstructured Text Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.UnstructuredTextDefinition
	 * @generated
	 */
	public Adapter createUnstructuredTextDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.UrlDefinition <em>Url Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.UrlDefinition
	 * @generated
	 */
	public Adapter createUrlDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.loc.mods.mods.XsString <em>Xs String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.loc.mods.mods.XsString
	 * @generated
	 */
	public Adapter createXsStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MODSAdapterFactory
