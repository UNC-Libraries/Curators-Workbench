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

import gov.loc.mods.mods.IssuanceDefinition;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.OriginInfoDefinition;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.OriginInfoDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OriginInfoDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginInfoDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addIssuancePropertyDescriptor(object);
			addAltRepGroupPropertyDescriptor(object);
			addDisplayLabelPropertyDescriptor(object);
			addLangPropertyDescriptor(object);
			addLang1PropertyDescriptor(object);
			addScriptPropertyDescriptor(object);
			addTransliterationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Issuance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIssuancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_OriginInfoDefinition_issuance_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OriginInfoDefinition_issuance_feature",
						"_UI_OriginInfoDefinition_type"), MODSPackage.eINSTANCE.getOriginInfoDefinition_Issuance(), true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_OriginInfoDefinition_altRepGroup_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OriginInfoDefinition_altRepGroup_feature",
						"_UI_OriginInfoDefinition_type"), MODSPackage.eINSTANCE.getOriginInfoDefinition_AltRepGroup(), true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_OriginInfoDefinition_displayLabel_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OriginInfoDefinition_displayLabel_feature",
						"_UI_OriginInfoDefinition_type"), MODSPackage.eINSTANCE.getOriginInfoDefinition_DisplayLabel(), true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_OriginInfoDefinition_lang_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OriginInfoDefinition_lang_feature",
						"_UI_OriginInfoDefinition_type"), MODSPackage.eINSTANCE.getOriginInfoDefinition_Lang(), true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_OriginInfoDefinition_lang1_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OriginInfoDefinition_lang1_feature",
						"_UI_OriginInfoDefinition_type"), MODSPackage.eINSTANCE.getOriginInfoDefinition_Lang1(), true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_OriginInfoDefinition_script_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OriginInfoDefinition_script_feature",
						"_UI_OriginInfoDefinition_type"), MODSPackage.eINSTANCE.getOriginInfoDefinition_Script(), true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_OriginInfoDefinition_transliteration_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OriginInfoDefinition_transliteration_feature",
						"_UI_OriginInfoDefinition_type"), MODSPackage.eINSTANCE.getOriginInfoDefinition_Transliteration(),
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group());
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
	 * This returns OriginInfoDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OriginInfoDefinition"));
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
		String label = ((OriginInfoDefinition) object).getAltRepGroup();
		return label == null || label.length() == 0 ? getString("_UI_OriginInfoDefinition_type")
				: getString("_UI_OriginInfoDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(OriginInfoDefinition.class)) {
			case MODSPackage.ORIGIN_INFO_DEFINITION__ISSUANCE:
			case MODSPackage.ORIGIN_INFO_DEFINITION__ALT_REP_GROUP:
			case MODSPackage.ORIGIN_INFO_DEFINITION__DISPLAY_LABEL:
			case MODSPackage.ORIGIN_INFO_DEFINITION__LANG:
			case MODSPackage.ORIGIN_INFO_DEFINITION__LANG1:
			case MODSPackage.ORIGIN_INFO_DEFINITION__SCRIPT:
			case MODSPackage.ORIGIN_INFO_DEFINITION__TRANSLITERATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MODSPackage.ORIGIN_INFO_DEFINITION__GROUP:
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

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_Place(),
						MODSFactory.eINSTANCE.createPlaceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_Publisher(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateIssued(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateIssued(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateIssued(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateCreated(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateCreated(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateCreated(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateCaptured(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateCaptured(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateCaptured(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateValid(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateValid(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateValid(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateModified(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateModified(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateModified(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_CopyrightDate(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_CopyrightDate(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_CopyrightDate(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateOther(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_Edition(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_Issuance(),
						IssuanceDefinition.CONTINUING)));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_Frequency(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_Frequency(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_Frequency(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_Frequency(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_Frequency(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_Frequency(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_Frequency(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_Frequency(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_Frequency(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getOriginInfoDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getOriginInfoDefinition_Frequency(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature) childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry) childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify = childFeature == MODSPackage.eINSTANCE.getOriginInfoDefinition_Publisher()
				|| childFeature == MODSPackage.eINSTANCE.getOriginInfoDefinition_Edition()
				|| childFeature == MODSPackage.eINSTANCE.getOriginInfoDefinition_DateIssued()
				|| childFeature == MODSPackage.eINSTANCE.getOriginInfoDefinition_DateCreated()
				|| childFeature == MODSPackage.eINSTANCE.getOriginInfoDefinition_DateCaptured()
				|| childFeature == MODSPackage.eINSTANCE.getOriginInfoDefinition_DateValid()
				|| childFeature == MODSPackage.eINSTANCE.getOriginInfoDefinition_DateModified()
				|| childFeature == MODSPackage.eINSTANCE.getOriginInfoDefinition_CopyrightDate()
				|| childFeature == MODSPackage.eINSTANCE.getOriginInfoDefinition_DateOther();

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
