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
import gov.loc.mods.mods.SubjectDefinition;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.SubjectDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubjectDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubjectDefinitionItemProvider(AdapterFactory adapterFactory) {
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

	    addActuatePropertyDescriptor(object);
	    addAltRepGroupPropertyDescriptor(object);
	    addArcrolePropertyDescriptor(object);
	    addAuthorityPropertyDescriptor(object);
	    addAuthorityURIPropertyDescriptor(object);
	    addDisplayLabelPropertyDescriptor(object);
	    addHrefPropertyDescriptor(object);
	    addIDPropertyDescriptor(object);
	    addLangPropertyDescriptor(object);
	    addLang1PropertyDescriptor(object);
	    addRolePropertyDescriptor(object);
	    addScriptPropertyDescriptor(object);
	    addShowPropertyDescriptor(object);
	    addTitlePropertyDescriptor(object);
	    addTransliterationPropertyDescriptor(object);
	    addTypePropertyDescriptor(object);
	    addUsagePropertyDescriptor(object);
	    addValueURIPropertyDescriptor(object);
	}
	return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Actuate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addActuatePropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_SubjectDefinition_actuate_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_actuate_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_Actuate(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Alt Rep Group feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAltRepGroupPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_SubjectDefinition_altRepGroup_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_altRepGroup_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_AltRepGroup(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Arcrole feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addArcrolePropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_SubjectDefinition_arcrole_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_arcrole_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_Arcrole(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			getString("_UI_SubjectDefinition_authority_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_authority_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_Authority(), true, false, false,
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
			getString("_UI_SubjectDefinition_authorityURI_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_authorityURI_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_AuthorityURI(), true, false, false,
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
			getString("_UI_SubjectDefinition_displayLabel_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_displayLabel_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_DisplayLabel(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Href feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHrefPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_SubjectDefinition_href_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_href_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_Href(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the ID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIDPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_SubjectDefinition_iD_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_iD_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE.getSubjectDefinition_ID(),
			true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			getString("_UI_SubjectDefinition_lang_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_lang_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_Lang(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Lang1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLang1PropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_SubjectDefinition_lang1_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_lang1_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_Lang1(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Role feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRolePropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_SubjectDefinition_role_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_role_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_Role(), true, false, false,
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
			getString("_UI_SubjectDefinition_script_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_script_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_Script(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Show feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShowPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_SubjectDefinition_show_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_show_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_Show(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Title feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTitlePropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_SubjectDefinition_title_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_title_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_Title(), true, false, false,
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
			getString("_UI_SubjectDefinition_transliteration_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_SubjectDefinition_transliteration_feature", "_UI_SubjectDefinition_type"),
			MODSPackage.eINSTANCE.getSubjectDefinition_Transliteration(), true, false, false,
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
			getString("_UI_SubjectDefinition_type_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_type_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_Type(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Usage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsagePropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_SubjectDefinition_usage_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_usage_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_Usage(), true, false, false,
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
			getString("_UI_SubjectDefinition_valueURI_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SubjectDefinition_valueURI_feature",
					"_UI_SubjectDefinition_type"), MODSPackage.eINSTANCE
					.getSubjectDefinition_ValueURI(), true, false, false,
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
	    childrenFeatures.add(MODSPackage.eINSTANCE.getSubjectDefinition_Group());
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
     * This returns SubjectDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/SubjectDefinition"));
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
	String label = ((SubjectDefinition) object).getID();
	return label == null || label.length() == 0 ? getString("_UI_SubjectDefinition_type")
			: getString("_UI_SubjectDefinition_type") + " " + label;
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

	switch (notification.getFeatureID(SubjectDefinition.class)) {
	case MODSPackage.SUBJECT_DEFINITION__ACTUATE:
	case MODSPackage.SUBJECT_DEFINITION__ALT_REP_GROUP:
	case MODSPackage.SUBJECT_DEFINITION__ARCROLE:
	case MODSPackage.SUBJECT_DEFINITION__AUTHORITY:
	case MODSPackage.SUBJECT_DEFINITION__AUTHORITY_URI:
	case MODSPackage.SUBJECT_DEFINITION__DISPLAY_LABEL:
	case MODSPackage.SUBJECT_DEFINITION__HREF:
	case MODSPackage.SUBJECT_DEFINITION__ID:
	case MODSPackage.SUBJECT_DEFINITION__LANG:
	case MODSPackage.SUBJECT_DEFINITION__LANG1:
	case MODSPackage.SUBJECT_DEFINITION__ROLE:
	case MODSPackage.SUBJECT_DEFINITION__SCRIPT:
	case MODSPackage.SUBJECT_DEFINITION__SHOW:
	case MODSPackage.SUBJECT_DEFINITION__TITLE:
	case MODSPackage.SUBJECT_DEFINITION__TRANSLITERATION:
	case MODSPackage.SUBJECT_DEFINITION__TYPE:
	case MODSPackage.SUBJECT_DEFINITION__USAGE:
	case MODSPackage.SUBJECT_DEFINITION__VALUE_URI:
	    fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
	    return;
	case MODSPackage.SUBJECT_DEFINITION__GROUP:
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
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
	super.collectNewChildDescriptors(newChildDescriptors, object);

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Topic(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Topic(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Topic(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Topic(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Topic(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Topic(), MODSFactory.eINSTANCE
					.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Topic(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Topic(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Topic(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Topic(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Geographic(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Geographic(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Geographic(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Geographic(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Geographic(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Geographic(), MODSFactory.eINSTANCE
					.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Geographic(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Geographic(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Geographic(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Geographic(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Temporal(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_TitleInfo(),
					MODSFactory.eINSTANCE.createSubjectTitleInfoDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Name(),
					MODSFactory.eINSTANCE.createSubjectNameDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_GeographicCode(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_HierarchicalGeographic(),
					MODSFactory.eINSTANCE.createHierarchicalGeographicDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Cartographics(),
					MODSFactory.eINSTANCE.createCartographicsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Occupation(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Occupation(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Occupation(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Occupation(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Occupation(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Occupation(), MODSFactory.eINSTANCE
					.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Occupation(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Occupation(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Occupation(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Occupation(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getSubjectDefinition_Group(), FeatureMapUtil
			.createEntry(MODSPackage.eINSTANCE.getSubjectDefinition_Genre(),
					MODSFactory.eINSTANCE.createGenreDefinition())));
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

	boolean qualify = childFeature == MODSPackage.eINSTANCE.getSubjectDefinition_Topic()
			|| childFeature == MODSPackage.eINSTANCE.getSubjectDefinition_Geographic()
			|| childFeature == MODSPackage.eINSTANCE.getSubjectDefinition_Occupation()
			|| childFeature == MODSPackage.eINSTANCE.getSubjectDefinition_Genre();

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
