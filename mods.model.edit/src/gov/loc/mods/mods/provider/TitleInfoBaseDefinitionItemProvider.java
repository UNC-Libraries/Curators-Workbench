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
package gov.loc.mods.mods.provider;

import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.TitleInfoBaseDefinition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gov.loc.mods.mods.TitleInfoBaseDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TitleInfoBaseDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TitleInfoBaseDefinitionItemProvider(AdapterFactory adapterFactory) {
	super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
	if (itemPropertyDescriptors == null) {
	    super.getPropertyDescriptors(object);

	    addAuthorityPropertyDescriptor(object);
	    addAuthorityURIPropertyDescriptor(object);
	    addDisplayLabelPropertyDescriptor(object);
	    addLangPropertyDescriptor(object);
	    addScriptPropertyDescriptor(object);
	    addTransliterationPropertyDescriptor(object);
	    addTypePropertyDescriptor(object);
	    addValueURIPropertyDescriptor(object);
	}
	return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Authority feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuthorityPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_TitleInfoBaseDefinition_authority_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_TitleInfoBaseDefinition_authority_feature",
					"_UI_TitleInfoBaseDefinition_type"), MODSPackage.eINSTANCE
					.getTitleInfoBaseDefinition_Authority(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Authority URI feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuthorityURIPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_TitleInfoBaseDefinition_authorityURI_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_TitleInfoBaseDefinition_authorityURI_feature",
					"_UI_TitleInfoBaseDefinition_type"), MODSPackage.eINSTANCE
					.getTitleInfoBaseDefinition_AuthorityURI(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Display Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDisplayLabelPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_TitleInfoBaseDefinition_displayLabel_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_TitleInfoBaseDefinition_displayLabel_feature",
					"_UI_TitleInfoBaseDefinition_type"), MODSPackage.eINSTANCE
					.getTitleInfoBaseDefinition_DisplayLabel(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Lang feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLangPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_TitleInfoBaseDefinition_lang_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_TitleInfoBaseDefinition_lang_feature",
					"_UI_TitleInfoBaseDefinition_type"), MODSPackage.eINSTANCE
					.getTitleInfoBaseDefinition_Lang(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Script feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addScriptPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_TitleInfoBaseDefinition_script_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_TitleInfoBaseDefinition_script_feature",
					"_UI_TitleInfoBaseDefinition_type"), MODSPackage.eINSTANCE
					.getTitleInfoBaseDefinition_Script(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Transliteration feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransliterationPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_TitleInfoBaseDefinition_transliteration_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_TitleInfoBaseDefinition_transliteration_feature",
					"_UI_TitleInfoBaseDefinition_type"), MODSPackage.eINSTANCE
					.getTitleInfoBaseDefinition_Transliteration(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_TitleInfoBaseDefinition_type_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_TitleInfoBaseDefinition_type_feature",
					"_UI_TitleInfoBaseDefinition_type"), MODSPackage.eINSTANCE
					.getTitleInfoBaseDefinition_Type(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Value URI feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValueURIPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_TitleInfoBaseDefinition_valueURI_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_TitleInfoBaseDefinition_valueURI_feature",
					"_UI_TitleInfoBaseDefinition_type"), MODSPackage.eINSTANCE
					.getTitleInfoBaseDefinition_ValueURI(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
	if (childrenFeatures == null) {
	    super.getChildrenFeatures(object);
	    childrenFeatures.add(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group());
	}
	return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
	// Check the type of the specified child object and return the proper feature to use for
	// adding (see {@link AddCommand}) it as a child.

	return super.getChildFeature(object, child);
    }

    /**
     * This returns TitleInfoBaseDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/TitleInfoBaseDefinition"));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean shouldComposeCreationImage() {
	return true;
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
	String label = ((TitleInfoBaseDefinition) object).getID();
	return label == null || label.length() == 0 ? getString("_UI_TitleInfoBaseDefinition_type")
			: getString("_UI_TitleInfoBaseDefinition_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
	updateChildren(notification);

	switch (notification.getFeatureID(TitleInfoBaseDefinition.class)) {
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__ACTUATE:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__ARCROLE:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__AUTHORITY:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__AUTHORITY_URI:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__DISPLAY_LABEL:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__HREF:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__ID:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__LANG:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__LANG1:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__ROLE:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__SCRIPT:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__SHOW:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__TITLE1:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__TRANSLITERATION:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__TYPE:
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__VALUE_URI:
	    fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
	    return;
	case MODSPackage.TITLE_INFO_BASE_DEFINITION__GROUP:
	    fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
	    return;
	}
	super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
	super.collectNewChildDescriptors(newChildDescriptors, object);

	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createXsString())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createAbstractDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createStringPlusAuthority())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createClassificationDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createDateBaseDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createDateDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createDateOtherDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));
	//
	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createGenreDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createIdentifierDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createLanguageTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createNamePartDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createNoteBaseDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createNoteDefinition())));
	//
	//	newChildDescriptors
	//			.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//					FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
	//							.getTitleInfoBaseDefinition_Title(), MODSFactory.eINSTANCE
	//							.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createPlaceTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createRoleTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createScriptTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createStringPlusSupplied())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title(),
	//					MODSFactory.eINSTANCE.createTemporalDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createXsString())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createAbstractDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createStringPlusAuthority())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createClassificationDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createDateBaseDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createDateDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createDateOtherDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));
	//
	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createGenreDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createIdentifierDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createLanguageTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createNamePartDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createNoteBaseDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createNoteDefinition())));
	//
	//	newChildDescriptors
	//			.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//					FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
	//							.getTitleInfoBaseDefinition_SubTitle(), MODSFactory.eINSTANCE
	//							.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createPlaceTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createRoleTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createScriptTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createStringPlusSupplied())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle(),
	//					MODSFactory.eINSTANCE.createTemporalDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createXsString())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createAbstractDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createStringPlusAuthority())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createClassificationDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createDateBaseDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createDateDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createDateOtherDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));
	//
	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createGenreDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createIdentifierDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createLanguageTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createNamePartDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createNoteBaseDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createNoteDefinition())));
	//
	//	newChildDescriptors
	//			.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//					FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
	//							.getTitleInfoBaseDefinition_PartNumber(), MODSFactory.eINSTANCE
	//							.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createPlaceTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createRoleTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createScriptTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createStringPlusSupplied())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber(),
	//					MODSFactory.eINSTANCE.createTemporalDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createXsString())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createAbstractDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createStringPlusAuthority())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createClassificationDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createDateBaseDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createDateDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createDateOtherDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));
	//
	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createGenreDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createIdentifierDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createLanguageTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createNamePartDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createNoteBaseDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createNoteDefinition())));
	//
	//	newChildDescriptors
	//			.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//					FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
	//							.getTitleInfoBaseDefinition_PartName(), MODSFactory.eINSTANCE
	//							.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createPlaceTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createRoleTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createScriptTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createStringPlusSupplied())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName(),
	//					MODSFactory.eINSTANCE.createTemporalDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createXsString())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createAbstractDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createStringPlusAuthority())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createClassificationDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createDateBaseDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createDateDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createDateOtherDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));
	//
	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createGenreDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createIdentifierDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createLanguageTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createNamePartDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createNoteBaseDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createNoteDefinition())));
	//
	//	newChildDescriptors
	//			.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//					FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
	//							.getTitleInfoBaseDefinition_NonSort(), MODSFactory.eINSTANCE
	//							.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createPlaceTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createRoleTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createScriptTermDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createStringPlusSupplied())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));
	//
	//	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Group(),
	//			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort(),
	//					MODSFactory.eINSTANCE.createTemporalDefinition())));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
	Object childFeature = feature;
	Object childObject = child;

	if (childFeature instanceof EStructuralFeature
			&& FeatureMapUtil.isFeatureMap((EStructuralFeature) childFeature)) {
	    FeatureMap.Entry entry = (FeatureMap.Entry) childObject;
	    childFeature = entry.getEStructuralFeature();
	    childObject = entry.getValue();
	}

	boolean qualify = childFeature == MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title()
			|| childFeature == MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle()
			|| childFeature == MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber()
			|| childFeature == MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName()
			|| childFeature == MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort();

	if (qualify) {
	    return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject),
			    getFeatureText(childFeature), getTypeText(owner) });
	}
	return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
	return ModsEditPlugin.INSTANCE;
    }

}
