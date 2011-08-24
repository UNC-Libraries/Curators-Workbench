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

import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.UnstructuredTextDefinition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gov.loc.mods.mods.UnstructuredTextDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnstructuredTextDefinitionItemProvider extends XsStringItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredTextDefinitionItemProvider(AdapterFactory adapterFactory) {
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
			addArcrolePropertyDescriptor(object);
			addDisplayLabelPropertyDescriptor(object);
			addHrefPropertyDescriptor(object);
			addRolePropertyDescriptor(object);
			addShowPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addType1PropertyDescriptor(object);
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
				getString("_UI_UnstructuredTextDefinition_actuate_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UnstructuredTextDefinition_actuate_feature",
						"_UI_UnstructuredTextDefinition_type"),
				MODSPackage.eINSTANCE.getUnstructuredTextDefinition_Actuate(), true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_XLinkPropertyCategory"),
				new String[] { "org.eclipse.ui.views.properties.expert" }));
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
				getString("_UI_UnstructuredTextDefinition_arcrole_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UnstructuredTextDefinition_arcrole_feature",
						"_UI_UnstructuredTextDefinition_type"),
				MODSPackage.eINSTANCE.getUnstructuredTextDefinition_Arcrole(), true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_XLinkPropertyCategory"),
				new String[] { "org.eclipse.ui.views.properties.expert" }));
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
				getString("_UI_UnstructuredTextDefinition_displayLabel_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UnstructuredTextDefinition_displayLabel_feature",
						"_UI_UnstructuredTextDefinition_type"), MODSPackage.eINSTANCE
						.getUnstructuredTextDefinition_DisplayLabel(), true, false, false,
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
				getString("_UI_UnstructuredTextDefinition_href_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UnstructuredTextDefinition_href_feature",
						"_UI_UnstructuredTextDefinition_type"), MODSPackage.eINSTANCE.getUnstructuredTextDefinition_Href(),
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_XLinkPropertyCategory"),
				new String[] { "org.eclipse.ui.views.properties.expert" }));
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
				getString("_UI_UnstructuredTextDefinition_role_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UnstructuredTextDefinition_role_feature",
						"_UI_UnstructuredTextDefinition_type"), MODSPackage.eINSTANCE.getUnstructuredTextDefinition_Role(),
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_XLinkPropertyCategory"),
				new String[] { "org.eclipse.ui.views.properties.expert" }));
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
				getString("_UI_UnstructuredTextDefinition_show_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UnstructuredTextDefinition_show_feature",
						"_UI_UnstructuredTextDefinition_type"), MODSPackage.eINSTANCE.getUnstructuredTextDefinition_Show(),
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_XLinkPropertyCategory"),
				new String[] { "org.eclipse.ui.views.properties.expert" }));
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
				getString("_UI_UnstructuredTextDefinition_title_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UnstructuredTextDefinition_title_feature",
						"_UI_UnstructuredTextDefinition_type"), MODSPackage.eINSTANCE.getUnstructuredTextDefinition_Title(),
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_XLinkPropertyCategory"),
				new String[] { "org.eclipse.ui.views.properties.expert" }));
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
				getString("_UI_UnstructuredTextDefinition_type_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UnstructuredTextDefinition_type_feature",
						"_UI_UnstructuredTextDefinition_type"), MODSPackage.eINSTANCE.getUnstructuredTextDefinition_Type(),
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_XLinkPropertyCategory"),
				new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Type1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addType1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_UnstructuredTextDefinition_type1_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UnstructuredTextDefinition_type1_feature",
						"_UI_UnstructuredTextDefinition_type"), MODSPackage.eINSTANCE.getUnstructuredTextDefinition_Type1(),
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns UnstructuredTextDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnstructuredTextDefinition"));
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
		String label = ((UnstructuredTextDefinition) object).getValue();
		return label == null || label.length() == 0 ? getString("_UI_UnstructuredTextDefinition_type")
				: getString("_UI_UnstructuredTextDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(UnstructuredTextDefinition.class)) {
			case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ACTUATE:
			case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ARCROLE:
			case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__DISPLAY_LABEL:
			case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__HREF:
			case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ROLE:
			case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__SHOW:
			case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TITLE:
			case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TYPE:
			case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TYPE1:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
