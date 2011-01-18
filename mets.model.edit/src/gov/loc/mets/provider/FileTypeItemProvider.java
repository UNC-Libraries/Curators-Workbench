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
package gov.loc.mets.provider;


import gov.loc.mets.FileType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.MetsPackage;

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
 * This is the item provider adapter for a {@link gov.loc.mets.FileType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FileTypeItemProvider
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
        public FileTypeItemProvider(AdapterFactory adapterFactory) {
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

                        addADMIDPropertyDescriptor(object);
                        addBEGINPropertyDescriptor(object);
                        addBETYPEPropertyDescriptor(object);
                        addCHECKSUMPropertyDescriptor(object);
                        addCHECKSUMTYPEPropertyDescriptor(object);
                        addCREATEDPropertyDescriptor(object);
                        addDMDIDPropertyDescriptor(object);
                        addENDPropertyDescriptor(object);
                        addGROUPIDPropertyDescriptor(object);
                        addIDPropertyDescriptor(object);
                        addMIMETYPEPropertyDescriptor(object);
                        addOWNERIDPropertyDescriptor(object);
                        addSEQPropertyDescriptor(object);
                        addSIZEPropertyDescriptor(object);
                        addUSEPropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
        }

        /**
         * This adds a property descriptor for the ADMID feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addADMIDPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FileType_aDMID_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_aDMID_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__ADMID,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the BEGIN feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addBEGINPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FileType_bEGIN_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_bEGIN_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__BEGIN,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the BETYPE feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addBETYPEPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FileType_bETYPE_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_bETYPE_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__BETYPE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the CHECKSUM feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addCHECKSUMPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FileType_cHECKSUM_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_cHECKSUM_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__CHECKSUM,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the CHECKSUMTYPE feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addCHECKSUMTYPEPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FileType_cHECKSUMTYPE_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_cHECKSUMTYPE_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__CHECKSUMTYPE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the CREATED feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addCREATEDPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FileType_cREATED_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_cREATED_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__CREATED,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the DMDID feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addDMDIDPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FileType_dMDID_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_dMDID_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__DMDID,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the END feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addENDPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FileType_eND_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_eND_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__END,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the GROUPID feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addGROUPIDPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FileType_gROUPID_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_gROUPID_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__GROUPID,
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
                                 getString("_UI_FileType_iD_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_iD_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__ID,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the MIMETYPE feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addMIMETYPEPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FileType_mIMETYPE_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_mIMETYPE_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__MIMETYPE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the OWNERID feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addOWNERIDPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FileType_oWNERID_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_oWNERID_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__OWNERID,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the SEQ feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addSEQPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FileType_sEQ_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_sEQ_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__SEQ,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the SIZE feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addSIZEPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FileType_sIZE_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_sIZE_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__SIZE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the USE feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addUSEPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FileType_uSE_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FileType_uSE_feature", "_UI_FileType_type"),
                                 MetsPackage.Literals.FILE_TYPE__USE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                        childrenFeatures.add(MetsPackage.Literals.FILE_TYPE__FLOCAT);
                        childrenFeatures.add(MetsPackage.Literals.FILE_TYPE__FCONTENT);
                        childrenFeatures.add(MetsPackage.Literals.FILE_TYPE__STREAM);
                        childrenFeatures.add(MetsPackage.Literals.FILE_TYPE__TRANSFORM_FILE);
                        childrenFeatures.add(MetsPackage.Literals.FILE_TYPE__FILE);
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
         * This returns FileType.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/FileType"));
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String getText(Object object) {
                String label = ((FileType)object).getID();
                return label == null || label.length() == 0 ?
                        getString("_UI_FileType_type") :
                        getString("_UI_FileType_type") + " " + label;
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

                switch (notification.getFeatureID(FileType.class)) {
                        case MetsPackage.FILE_TYPE__ADMID:
                        case MetsPackage.FILE_TYPE__BEGIN:
                        case MetsPackage.FILE_TYPE__BETYPE:
                        case MetsPackage.FILE_TYPE__CHECKSUM:
                        case MetsPackage.FILE_TYPE__CHECKSUMTYPE:
                        case MetsPackage.FILE_TYPE__CREATED:
                        case MetsPackage.FILE_TYPE__DMDID:
                        case MetsPackage.FILE_TYPE__END:
                        case MetsPackage.FILE_TYPE__GROUPID:
                        case MetsPackage.FILE_TYPE__ID:
                        case MetsPackage.FILE_TYPE__MIMETYPE:
                        case MetsPackage.FILE_TYPE__OWNERID:
                        case MetsPackage.FILE_TYPE__SEQ:
                        case MetsPackage.FILE_TYPE__SIZE:
                        case MetsPackage.FILE_TYPE__USE:
                                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                                return;
                        case MetsPackage.FILE_TYPE__FLOCAT:
                        case MetsPackage.FILE_TYPE__FCONTENT:
                        case MetsPackage.FILE_TYPE__STREAM:
                        case MetsPackage.FILE_TYPE__TRANSFORM_FILE:
                        case MetsPackage.FILE_TYPE__FILE:
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
                                (MetsPackage.Literals.FILE_TYPE__FLOCAT,
                                 MetsFactory.eINSTANCE.createFLocatType()));

                newChildDescriptors.add
                        (createChildParameter
                                (MetsPackage.Literals.FILE_TYPE__FCONTENT,
                                 MetsFactory.eINSTANCE.createFContentType()));

                newChildDescriptors.add
                        (createChildParameter
                                (MetsPackage.Literals.FILE_TYPE__STREAM,
                                 MetsFactory.eINSTANCE.createStreamType()));

                newChildDescriptors.add
                        (createChildParameter
                                (MetsPackage.Literals.FILE_TYPE__TRANSFORM_FILE,
                                 MetsFactory.eINSTANCE.createTransformFileType()));

                newChildDescriptors.add
                        (createChildParameter
                                (MetsPackage.Literals.FILE_TYPE__FILE,
                                 MetsFactory.eINSTANCE.createFileType()));
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
