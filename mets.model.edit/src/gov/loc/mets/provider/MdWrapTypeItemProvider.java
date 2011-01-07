/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.provider;


import gov.loc.mets.MdWrapType;
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
 * This is the item provider adapter for a {@link gov.loc.mets.MdWrapType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MdWrapTypeItemProvider
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
        public MdWrapTypeItemProvider(AdapterFactory adapterFactory) {
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

                        addBinDataPropertyDescriptor(object);
                        addCHECKSUMPropertyDescriptor(object);
                        addCHECKSUMTYPEPropertyDescriptor(object);
                        addCREATEDPropertyDescriptor(object);
                        addIDPropertyDescriptor(object);
                        addLABELPropertyDescriptor(object);
                        addMDTYPEPropertyDescriptor(object);
                        addMDTYPEVERSIONPropertyDescriptor(object);
                        addMIMETYPEPropertyDescriptor(object);
                        addOTHERMDTYPEPropertyDescriptor(object);
                        addSIZEPropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
        }

        /**
         * This adds a property descriptor for the Bin Data feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addBinDataPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_MdWrapType_binData_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_MdWrapType_binData_feature", "_UI_MdWrapType_type"),
                                 MetsPackage.Literals.MD_WRAP_TYPE__BIN_DATA,
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
                                 getString("_UI_MdWrapType_cHECKSUM_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_MdWrapType_cHECKSUM_feature", "_UI_MdWrapType_type"),
                                 MetsPackage.Literals.MD_WRAP_TYPE__CHECKSUM,
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
                                 getString("_UI_MdWrapType_cHECKSUMTYPE_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_MdWrapType_cHECKSUMTYPE_feature", "_UI_MdWrapType_type"),
                                 MetsPackage.Literals.MD_WRAP_TYPE__CHECKSUMTYPE,
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
                                 getString("_UI_MdWrapType_cREATED_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_MdWrapType_cREATED_feature", "_UI_MdWrapType_type"),
                                 MetsPackage.Literals.MD_WRAP_TYPE__CREATED,
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
                                 getString("_UI_MdWrapType_iD_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_MdWrapType_iD_feature", "_UI_MdWrapType_type"),
                                 MetsPackage.Literals.MD_WRAP_TYPE__ID,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the LABEL feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addLABELPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_MdWrapType_lABEL_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_MdWrapType_lABEL_feature", "_UI_MdWrapType_type"),
                                 MetsPackage.Literals.MD_WRAP_TYPE__LABEL,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the MDTYPE feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addMDTYPEPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_MdWrapType_mDTYPE_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_MdWrapType_mDTYPE_feature", "_UI_MdWrapType_type"),
                                 MetsPackage.Literals.MD_WRAP_TYPE__MDTYPE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the MDTYPEVERSION feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addMDTYPEVERSIONPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_MdWrapType_mDTYPEVERSION_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_MdWrapType_mDTYPEVERSION_feature", "_UI_MdWrapType_type"),
                                 MetsPackage.Literals.MD_WRAP_TYPE__MDTYPEVERSION,
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
                                 getString("_UI_MdWrapType_mIMETYPE_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_MdWrapType_mIMETYPE_feature", "_UI_MdWrapType_type"),
                                 MetsPackage.Literals.MD_WRAP_TYPE__MIMETYPE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the OTHERMDTYPE feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addOTHERMDTYPEPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_MdWrapType_oTHERMDTYPE_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_MdWrapType_oTHERMDTYPE_feature", "_UI_MdWrapType_type"),
                                 MetsPackage.Literals.MD_WRAP_TYPE__OTHERMDTYPE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                                 getString("_UI_MdWrapType_sIZE_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_MdWrapType_sIZE_feature", "_UI_MdWrapType_type"),
                                 MetsPackage.Literals.MD_WRAP_TYPE__SIZE,
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
                        childrenFeatures.add(MetsPackage.Literals.MD_WRAP_TYPE__XML_DATA);
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
         * This returns MdWrapType.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/MdWrapType"));
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String getText(Object object) {
                String label = ((MdWrapType)object).getID();
                return label == null || label.length() == 0 ?
                        getString("_UI_MdWrapType_type") :
                        getString("_UI_MdWrapType_type") + " " + label;
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

                switch (notification.getFeatureID(MdWrapType.class)) {
                        case MetsPackage.MD_WRAP_TYPE__BIN_DATA:
                        case MetsPackage.MD_WRAP_TYPE__CHECKSUM:
                        case MetsPackage.MD_WRAP_TYPE__CHECKSUMTYPE:
                        case MetsPackage.MD_WRAP_TYPE__CREATED:
                        case MetsPackage.MD_WRAP_TYPE__ID:
                        case MetsPackage.MD_WRAP_TYPE__LABEL:
                        case MetsPackage.MD_WRAP_TYPE__MDTYPE:
                        case MetsPackage.MD_WRAP_TYPE__MDTYPEVERSION:
                        case MetsPackage.MD_WRAP_TYPE__MIMETYPE:
                        case MetsPackage.MD_WRAP_TYPE__OTHERMDTYPE:
                        case MetsPackage.MD_WRAP_TYPE__SIZE:
                                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                                return;
                        case MetsPackage.MD_WRAP_TYPE__XML_DATA:
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
                                (MetsPackage.Literals.MD_WRAP_TYPE__XML_DATA,
                                 MetsFactory.eINSTANCE.createXmlDataType1()));
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
