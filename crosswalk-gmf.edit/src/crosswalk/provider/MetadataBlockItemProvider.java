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
package crosswalk.provider;


import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;
import crosswalk.MetadataBlock;

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
 * This is the item provider adapter for a {@link crosswalk.MetadataBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetadataBlockItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataBlockItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addMaxRepeatPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MetadataBlock_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MetadataBlock_name_feature", "_UI_MetadataBlock_type"),
				 CrosswalkPackage.Literals.METADATA_BLOCK__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MetadataBlock_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MetadataBlock_description_feature", "_UI_MetadataBlock_type"),
				 CrosswalkPackage.Literals.METADATA_BLOCK__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MetadataBlock_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MetadataBlock_required_feature", "_UI_MetadataBlock_type"),
				 CrosswalkPackage.Literals.METADATA_BLOCK__REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Repeat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxRepeatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MetadataBlock_maxRepeat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MetadataBlock_maxRepeat_feature", "_UI_MetadataBlock_type"),
				 CrosswalkPackage.Literals.METADATA_BLOCK__MAX_REPEAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(CrosswalkPackage.Literals.MAPPING_CONTAINER__WIDGETS);
			childrenFeatures.add(CrosswalkPackage.Literals.MAPPING_CONTAINER__ELEMENTS);
			childrenFeatures.add(CrosswalkPackage.Literals.METADATA_BLOCK__PORTS);
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
	 * This returns MetadataBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MetadataBlock"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MetadataBlock)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MetadataBlock_type") :
			getString("_UI_MetadataBlock_type") + " " + label;
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

		switch (notification.getFeatureID(MetadataBlock.class)) {
			case CrosswalkPackage.METADATA_BLOCK__EXCEPTION:
			case CrosswalkPackage.METADATA_BLOCK__CURRENT_USER:
			case CrosswalkPackage.METADATA_BLOCK__EXCEPTIONS:
			case CrosswalkPackage.METADATA_BLOCK__NAME:
			case CrosswalkPackage.METADATA_BLOCK__DESCRIPTION:
			case CrosswalkPackage.METADATA_BLOCK__REQUIRED:
			case CrosswalkPackage.METADATA_BLOCK__MAX_REPEAT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CrosswalkPackage.METADATA_BLOCK__WIDGETS:
			case CrosswalkPackage.METADATA_BLOCK__ELEMENTS:
			case CrosswalkPackage.METADATA_BLOCK__PORTS:
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

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__WIDGETS,
				 CrosswalkFactory.eINSTANCE.createTrimWhitespace()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__WIDGETS,
				 CrosswalkFactory.eINSTANCE.createCurrentUsername()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__WIDGETS,
				 CrosswalkFactory.eINSTANCE.createCurrentDate()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__WIDGETS,
				 CrosswalkFactory.eINSTANCE.createOriginalNameRecordMatcher()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__WIDGETS,
				 CrosswalkFactory.eINSTANCE.createDateRecognizer()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__WIDGETS,
				 CrosswalkFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__ELEMENTS,
				 CrosswalkFactory.eINSTANCE.createMappedElement()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__ELEMENTS,
				 CrosswalkFactory.eINSTANCE.createMappedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__ELEMENTS,
				 CrosswalkFactory.eINSTANCE.createMetadataBlock()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.METADATA_BLOCK__PORTS,
				 CrosswalkFactory.eINSTANCE.createInputField()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.METADATA_BLOCK__PORTS,
				 CrosswalkFactory.eINSTANCE.createTextInputField()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.METADATA_BLOCK__PORTS,
				 CrosswalkFactory.eINSTANCE.createDateInputField()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CrosswalkEditPlugin.INSTANCE;
	}

}
