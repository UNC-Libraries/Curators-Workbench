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

import gov.loc.mods.mods.DetailDefinition;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;

import java.math.BigInteger;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.DetailDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DetailDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addLevelPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DetailDefinition_level_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DetailDefinition_level_feature",
						"_UI_DetailDefinition_type"), MODSPackage.eINSTANCE.getDetailDefinition_Level(), true, false, false,
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
				getString("_UI_DetailDefinition_type_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DetailDefinition_type_feature",
						"_UI_DetailDefinition_type"), MODSPackage.eINSTANCE.getDetailDefinition_Type(), true, false, false,
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
			childrenFeatures.add(MODSPackage.eINSTANCE.getDetailDefinition_Group());
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
	 * This returns DetailDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DetailDefinition"));
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
		BigInteger labelValue = ((DetailDefinition) object).getLevel();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_DetailDefinition_type")
				: getString("_UI_DetailDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(DetailDefinition.class)) {
			case MODSPackage.DETAIL_DEFINITION__LEVEL:
			case MODSPackage.DETAIL_DEFINITION__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MODSPackage.DETAIL_DEFINITION__GROUP:
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
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Number(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Caption(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getDetailDefinition_Group(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDetailDefinition_Title(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));
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

		boolean qualify = childFeature == MODSPackage.eINSTANCE.getDetailDefinition_Number()
				|| childFeature == MODSPackage.eINSTANCE.getDetailDefinition_Caption()
				|| childFeature == MODSPackage.eINSTANCE.getDetailDefinition_Title();

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
