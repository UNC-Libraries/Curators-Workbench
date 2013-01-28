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
import gov.loc.mods.mods.PartDefinition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.PartDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PartDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addAltRepGroupPropertyDescriptor(object);
			addDisplayLabelPropertyDescriptor(object);
			addIDPropertyDescriptor(object);
			addLangPropertyDescriptor(object);
			addLang1PropertyDescriptor(object);
			addOrderPropertyDescriptor(object);
			addScriptPropertyDescriptor(object);
			addTransliterationPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				getString("_UI_PartDefinition_altRepGroup_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PartDefinition_altRepGroup_feature",
						"_UI_PartDefinition_type"), MODSPackage.eINSTANCE.getPartDefinition_AltRepGroup(), true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_PartDefinition_displayLabel_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PartDefinition_displayLabel_feature",
						"_UI_PartDefinition_type"), MODSPackage.eINSTANCE.getPartDefinition_DisplayLabel(), true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_PartDefinition_iD_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PartDefinition_iD_feature",
								"_UI_PartDefinition_type"), MODSPackage.eINSTANCE.getPartDefinition_ID(), true, false, false,
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
				getString("_UI_PartDefinition_lang_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PartDefinition_lang_feature",
						"_UI_PartDefinition_type"), MODSPackage.eINSTANCE.getPartDefinition_Lang(), true, false, false,
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
				getString("_UI_PartDefinition_lang1_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PartDefinition_lang1_feature",
						"_UI_PartDefinition_type"), MODSPackage.eINSTANCE.getPartDefinition_Lang1(), true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PartDefinition_order_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PartDefinition_order_feature",
						"_UI_PartDefinition_type"), MODSPackage.eINSTANCE.getPartDefinition_Order(), true, false, false,
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
				getString("_UI_PartDefinition_script_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PartDefinition_script_feature",
						"_UI_PartDefinition_type"), MODSPackage.eINSTANCE.getPartDefinition_Script(), true, false, false,
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
				getString("_UI_PartDefinition_transliteration_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PartDefinition_transliteration_feature",
						"_UI_PartDefinition_type"), MODSPackage.eINSTANCE.getPartDefinition_Transliteration(), true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_PartDefinition_type_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PartDefinition_type_feature",
						"_UI_PartDefinition_type"), MODSPackage.eINSTANCE.getPartDefinition_Type(), true, false, false,
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
			childrenFeatures.add(MODSPackage.eINSTANCE.getPartDefinition_Group());
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
	 * This returns PartDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PartDefinition"));
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
		String label = ((PartDefinition) object).getID();
		return label == null || label.length() == 0 ? getString("_UI_PartDefinition_type")
				: getString("_UI_PartDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(PartDefinition.class)) {
			case MODSPackage.PART_DEFINITION__ALT_REP_GROUP:
			case MODSPackage.PART_DEFINITION__DISPLAY_LABEL:
			case MODSPackage.PART_DEFINITION__ID:
			case MODSPackage.PART_DEFINITION__LANG:
			case MODSPackage.PART_DEFINITION__LANG1:
			case MODSPackage.PART_DEFINITION__ORDER:
			case MODSPackage.PART_DEFINITION__SCRIPT:
			case MODSPackage.PART_DEFINITION__TRANSLITERATION:
			case MODSPackage.PART_DEFINITION__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MODSPackage.PART_DEFINITION__GROUP:
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
				MODSPackage.eINSTANCE.getPartDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPartDefinition_Detail(),
						MODSFactory.eINSTANCE.createDetailDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getPartDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPartDefinition_Extent(),
						MODSFactory.eINSTANCE.createExtentDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getPartDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPartDefinition_Date(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getPartDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPartDefinition_Date(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getPartDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPartDefinition_Date(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getPartDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPartDefinition_Date(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getPartDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPartDefinition_Text(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getPartDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPartDefinition_Text(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getPartDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPartDefinition_Text(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getPartDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPartDefinition_Text(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getPartDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPartDefinition_Text(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));
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
