/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.provider;


import gov.loc.mets.MetsPackage;
import gov.loc.mets.SmLocatorLinkType;

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

/**
 * This is the item provider adapter for a {@link gov.loc.mets.SmLocatorLinkType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SmLocatorLinkTypeItemProvider
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
        public SmLocatorLinkTypeItemProvider(AdapterFactory adapterFactory) {
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

                        addHrefPropertyDescriptor(object);
                        addIDPropertyDescriptor(object);
                        addLabelPropertyDescriptor(object);
                        addRolePropertyDescriptor(object);
                        addTitlePropertyDescriptor(object);
                        addTypePropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
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
                                 getString("_UI_SmLocatorLinkType_href_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_SmLocatorLinkType_href_feature", "_UI_SmLocatorLinkType_type"),
                                 MetsPackage.Literals.SM_LOCATOR_LINK_TYPE__HREF,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the ID feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addIDPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_SmLocatorLinkType_iD_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_SmLocatorLinkType_iD_feature", "_UI_SmLocatorLinkType_type"),
                                 MetsPackage.Literals.SM_LOCATOR_LINK_TYPE__ID,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
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
                                 getString("_UI_SmLocatorLinkType_label_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_SmLocatorLinkType_label_feature", "_UI_SmLocatorLinkType_type"),
                                 MetsPackage.Literals.SM_LOCATOR_LINK_TYPE__LABEL,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
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
                                 getString("_UI_SmLocatorLinkType_role_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_SmLocatorLinkType_role_feature", "_UI_SmLocatorLinkType_type"),
                                 MetsPackage.Literals.SM_LOCATOR_LINK_TYPE__ROLE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
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
                                 getString("_UI_SmLocatorLinkType_title_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_SmLocatorLinkType_title_feature", "_UI_SmLocatorLinkType_type"),
                                 MetsPackage.Literals.SM_LOCATOR_LINK_TYPE__TITLE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Type feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addTypePropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_SmLocatorLinkType_type_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_SmLocatorLinkType_type_feature", "_UI_SmLocatorLinkType_type"),
                                 MetsPackage.Literals.SM_LOCATOR_LINK_TYPE__TYPE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This returns SmLocatorLinkType.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/SmLocatorLinkType"));
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String getText(Object object) {
                String label = ((SmLocatorLinkType)object).getID();
                return label == null || label.length() == 0 ?
                        getString("_UI_SmLocatorLinkType_type") :
                        getString("_UI_SmLocatorLinkType_type") + " " + label;
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

                switch (notification.getFeatureID(SmLocatorLinkType.class)) {
                        case MetsPackage.SM_LOCATOR_LINK_TYPE__HREF:
                        case MetsPackage.SM_LOCATOR_LINK_TYPE__ID:
                        case MetsPackage.SM_LOCATOR_LINK_TYPE__LABEL:
                        case MetsPackage.SM_LOCATOR_LINK_TYPE__ROLE:
                        case MetsPackage.SM_LOCATOR_LINK_TYPE__TITLE:
                        case MetsPackage.SM_LOCATOR_LINK_TYPE__TYPE:
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
                return MetsEditPlugin.INSTANCE;
        }

}
