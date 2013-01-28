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

import gov.loc.mods.mods.LocationDefinition;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.LocationDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationDefinitionItemProvider(AdapterFactory adapterFactory) {
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
			addLangPropertyDescriptor(object);
			addLang1PropertyDescriptor(object);
			addScriptPropertyDescriptor(object);
			addTransliterationPropertyDescriptor(object);
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
				getString("_UI_LocationDefinition_altRepGroup_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LocationDefinition_altRepGroup_feature",
						"_UI_LocationDefinition_type"), MODSPackage.eINSTANCE.getLocationDefinition_AltRepGroup(), true,
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
				getString("_UI_LocationDefinition_displayLabel_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LocationDefinition_displayLabel_feature",
						"_UI_LocationDefinition_type"), MODSPackage.eINSTANCE.getLocationDefinition_DisplayLabel(), true,
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
				getString("_UI_LocationDefinition_lang_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LocationDefinition_lang_feature",
						"_UI_LocationDefinition_type"), MODSPackage.eINSTANCE.getLocationDefinition_Lang(), true, false,
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
				getString("_UI_LocationDefinition_lang1_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LocationDefinition_lang1_feature",
						"_UI_LocationDefinition_type"), MODSPackage.eINSTANCE.getLocationDefinition_Lang1(), true, false,
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
				getString("_UI_LocationDefinition_script_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LocationDefinition_script_feature",
						"_UI_LocationDefinition_type"), MODSPackage.eINSTANCE.getLocationDefinition_Script(), true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_LocationDefinition_transliteration_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LocationDefinition_transliteration_feature",
						"_UI_LocationDefinition_type"), MODSPackage.eINSTANCE.getLocationDefinition_Transliteration(), true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(MODSPackage.eINSTANCE.getLocationDefinition_PhysicalLocation());
			childrenFeatures.add(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator());
			childrenFeatures.add(MODSPackage.eINSTANCE.getLocationDefinition_Url());
			childrenFeatures.add(MODSPackage.eINSTANCE.getLocationDefinition_HoldingSimple());
			childrenFeatures.add(MODSPackage.eINSTANCE.getLocationDefinition_HoldingExternal());
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
	 * This returns LocationDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LocationDefinition"));
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
		String label = ((LocationDefinition) object).getAltRepGroup();
		return label == null || label.length() == 0 ? getString("_UI_LocationDefinition_type")
				: getString("_UI_LocationDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(LocationDefinition.class)) {
			case MODSPackage.LOCATION_DEFINITION__ALT_REP_GROUP:
			case MODSPackage.LOCATION_DEFINITION__DISPLAY_LABEL:
			case MODSPackage.LOCATION_DEFINITION__LANG:
			case MODSPackage.LOCATION_DEFINITION__LANG1:
			case MODSPackage.LOCATION_DEFINITION__SCRIPT:
			case MODSPackage.LOCATION_DEFINITION__TRANSLITERATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MODSPackage.LOCATION_DEFINITION__PHYSICAL_LOCATION:
			case MODSPackage.LOCATION_DEFINITION__SHELF_LOCATOR:
			case MODSPackage.LOCATION_DEFINITION__URL:
			case MODSPackage.LOCATION_DEFINITION__HOLDING_SIMPLE:
			case MODSPackage.LOCATION_DEFINITION__HOLDING_EXTERNAL:
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

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_PhysicalLocation(),
				MODSFactory.eINSTANCE.createPhysicalLocationDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createXsString()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createUnstructuredTextDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createAbstractDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createStringPlusAuthority()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createClassificationDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createDateBaseDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createDateDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createDateOtherDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createGenreDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createGeographicCodeDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createIdentifierDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createLanguageTermDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createNamePartDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createNoteBaseDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createNoteDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createPhysicalLocationDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createPlaceTermDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createRecordIdentifierDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createRoleTermDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createScriptTermDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createStringPlusSupplied()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createTableOfContentsDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createTargetAudienceDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createTemporalDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_Url(),
				MODSFactory.eINSTANCE.createUrlDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_HoldingSimple(),
				MODSFactory.eINSTANCE.createHoldingSimpleDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_HoldingExternal(),
				MODSFactory.eINSTANCE.createExtensionDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLocationDefinition_HoldingExternal(),
				MODSFactory.eINSTANCE.createAccessConditionDefinition()));
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

		boolean qualify = childFeature == MODSPackage.eINSTANCE.getLocationDefinition_PhysicalLocation()
				|| childFeature == MODSPackage.eINSTANCE.getLocationDefinition_ShelfLocator();

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
