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
import gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlinkItemProvider extends
		StringPlusAuthorityPlusTypePlusDisplayLabelItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlinkItemProvider(AdapterFactory adapterFactory) {
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
			addHrefPropertyDescriptor(object);
			addRolePropertyDescriptor(object);
			addShowPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
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
				getString("_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_actuate_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_actuate_feature",
						"_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_type"), MODSPackage.eINSTANCE
						.getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Actuate(), true, false, false,
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
				getString("_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_arcrole_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_arcrole_feature",
						"_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_type"), MODSPackage.eINSTANCE
						.getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Arcrole(), true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_XLinkPropertyCategory"),
				new String[] { "org.eclipse.ui.views.properties.expert" }));
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
				getString("_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_href_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_href_feature",
						"_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_type"), MODSPackage.eINSTANCE
						.getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Href(), true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_XLinkPropertyCategory"),
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
				getString("_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_role_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_role_feature",
						"_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_type"), MODSPackage.eINSTANCE
						.getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Role(), true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_XLinkPropertyCategory"),
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
				getString("_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_show_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_show_feature",
						"_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_type"), MODSPackage.eINSTANCE
						.getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Show(), true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_XLinkPropertyCategory"),
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
				getString("_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_title_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_title_feature",
						"_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_type"), MODSPackage.eINSTANCE
						.getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Title(), true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_XLinkPropertyCategory"),
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
				getString("_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_type1_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_type1_feature",
						"_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_type"), MODSPackage.eINSTANCE
						.getStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_Type1(), true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_XLinkPropertyCategory"),
				new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This returns StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink"));
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
		String label = ((StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink) object).getValue();
		return label == null || label.length() == 0 ? getString("_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_type")
				: getString("_UI_StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink_type") + " " + label;
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

		switch (notification.getFeatureID(StringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink.class)) {
			case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__ACTUATE:
			case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__ARCROLE:
			case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__HREF:
			case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__ROLE:
			case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__SHOW:
			case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__TITLE:
			case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL_PLUS_XLINK__TYPE1:
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
