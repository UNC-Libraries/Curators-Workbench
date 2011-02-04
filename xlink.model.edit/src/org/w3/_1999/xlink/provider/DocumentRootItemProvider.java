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
package org.w3._1999.xlink.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.DocumentRoot;
import org.w3._1999.xlink.XlinkPackage;

/**
 * This is the item provider adapter for a {@link org.w3._1999.xlink.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
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
        public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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
                        addFromPropertyDescriptor(object);
                        addHrefPropertyDescriptor(object);
                        addLabelPropertyDescriptor(object);
                        addRolePropertyDescriptor(object);
                        addShowPropertyDescriptor(object);
                        addTitlePropertyDescriptor(object);
                        addToPropertyDescriptor(object);
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
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DocumentRoot_actuate_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_actuate_feature", "_UI_DocumentRoot_type"),
                                 XlinkPackage.Literals.DOCUMENT_ROOT__ACTUATE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 getString("_UI_xlinkPropertyCategory"),
                                 new String[] {
                                        "org.eclipse.ui.views.properties.expert"
                                 }));
        }

        /**
         * This adds a property descriptor for the Arcrole feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addArcrolePropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DocumentRoot_arcrole_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_arcrole_feature", "_UI_DocumentRoot_type"),
                                 XlinkPackage.Literals.DOCUMENT_ROOT__ARCROLE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 getString("_UI_xlinkPropertyCategory"),
                                 new String[] {
                                        "org.eclipse.ui.views.properties.expert"
                                 }));
        }

        /**
         * This adds a property descriptor for the From feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addFromPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DocumentRoot_from_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_from_feature", "_UI_DocumentRoot_type"),
                                 XlinkPackage.Literals.DOCUMENT_ROOT__FROM,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 getString("_UI_xlinkPropertyCategory"),
                                 new String[] {
                                        "org.eclipse.ui.views.properties.expert"
                                 }));
        }

        /**
         * This adds a property descriptor for the Href feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addHrefPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DocumentRoot_href_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_href_feature", "_UI_DocumentRoot_type"),
                                 XlinkPackage.Literals.DOCUMENT_ROOT__HREF,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 getString("_UI_xlinkPropertyCategory"),
                                 null));
        }

        /**
         * This adds a property descriptor for the Label feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addLabelPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DocumentRoot_label_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_label_feature", "_UI_DocumentRoot_type"),
                                 XlinkPackage.Literals.DOCUMENT_ROOT__LABEL,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 getString("_UI_xlinkPropertyCategory"),
                                 new String[] {
                                        "org.eclipse.ui.views.properties.expert"
                                 }));
        }

        /**
         * This adds a property descriptor for the Role feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addRolePropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DocumentRoot_role_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_role_feature", "_UI_DocumentRoot_type"),
                                 XlinkPackage.Literals.DOCUMENT_ROOT__ROLE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 getString("_UI_xlinkPropertyCategory"),
                                 new String[] {
                                        "org.eclipse.ui.views.properties.expert"
                                 }));
        }

        /**
         * This adds a property descriptor for the Show feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addShowPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DocumentRoot_show_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_show_feature", "_UI_DocumentRoot_type"),
                                 XlinkPackage.Literals.DOCUMENT_ROOT__SHOW,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 getString("_UI_xlinkPropertyCategory"),
                                 new String[] {
                                        "org.eclipse.ui.views.properties.expert"
                                 }));
        }

        /**
         * This adds a property descriptor for the Title feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addTitlePropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DocumentRoot_title_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_title_feature", "_UI_DocumentRoot_type"),
                                 XlinkPackage.Literals.DOCUMENT_ROOT__TITLE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 getString("_UI_xlinkPropertyCategory"),
                                 new String[] {
                                        "org.eclipse.ui.views.properties.expert"
                                 }));
        }

        /**
         * This adds a property descriptor for the To feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addToPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DocumentRoot_to_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_to_feature", "_UI_DocumentRoot_type"),
                                 XlinkPackage.Literals.DOCUMENT_ROOT__TO,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 getString("_UI_xlinkPropertyCategory"),
                                 new String[] {
                                        "org.eclipse.ui.views.properties.expert"
                                 }));
        }

        /**
         * This returns DocumentRoot.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
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
                ActuateType labelValue = ((DocumentRoot)object).getActuate();
                String label = labelValue == null ? null : labelValue.toString();
                return label == null || label.length() == 0 ?
                        getString("_UI_DocumentRoot_type") :
                        getString("_UI_DocumentRoot_type") + " " + label;
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

                switch (notification.getFeatureID(DocumentRoot.class)) {
                        case XlinkPackage.DOCUMENT_ROOT__ACTUATE:
                        case XlinkPackage.DOCUMENT_ROOT__ARCROLE:
                        case XlinkPackage.DOCUMENT_ROOT__FROM:
                        case XlinkPackage.DOCUMENT_ROOT__HREF:
                        case XlinkPackage.DOCUMENT_ROOT__LABEL:
                        case XlinkPackage.DOCUMENT_ROOT__ROLE:
                        case XlinkPackage.DOCUMENT_ROOT__SHOW:
                        case XlinkPackage.DOCUMENT_ROOT__TITLE:
                        case XlinkPackage.DOCUMENT_ROOT__TO:
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

        /**
         * Return the resource locator for this item provider's resources.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public ResourceLocator getResourceLocator() {
                return XlinkEditPlugin.INSTANCE;
        }

}
