/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.provider;


import gov.loc.mets.AmdSecType;
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
 * This is the item provider adapter for a {@link gov.loc.mets.AmdSecType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AmdSecTypeItemProvider
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
        public AmdSecTypeItemProvider(AdapterFactory adapterFactory) {
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

                        addIDPropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
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
                                 getString("_UI_AmdSecType_iD_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_AmdSecType_iD_feature", "_UI_AmdSecType_type"),
                                 MetsPackage.Literals.AMD_SEC_TYPE__ID,
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
                        childrenFeatures.add(MetsPackage.Literals.AMD_SEC_TYPE__TECH_MD);
                        childrenFeatures.add(MetsPackage.Literals.AMD_SEC_TYPE__RIGHTS_MD);
                        childrenFeatures.add(MetsPackage.Literals.AMD_SEC_TYPE__SOURCE_MD);
                        childrenFeatures.add(MetsPackage.Literals.AMD_SEC_TYPE__DIGIPROV_MD);
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
         * This returns AmdSecType.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/AmdSecType"));
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String getText(Object object) {
                String label = ((AmdSecType)object).getID();
                return label == null || label.length() == 0 ?
                        getString("_UI_AmdSecType_type") :
                        getString("_UI_AmdSecType_type") + " " + label;
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

                switch (notification.getFeatureID(AmdSecType.class)) {
                        case MetsPackage.AMD_SEC_TYPE__ID:
                                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                                return;
                        case MetsPackage.AMD_SEC_TYPE__TECH_MD:
                        case MetsPackage.AMD_SEC_TYPE__RIGHTS_MD:
                        case MetsPackage.AMD_SEC_TYPE__SOURCE_MD:
                        case MetsPackage.AMD_SEC_TYPE__DIGIPROV_MD:
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
                                (MetsPackage.Literals.AMD_SEC_TYPE__TECH_MD,
                                 MetsFactory.eINSTANCE.createMdSecType()));

                newChildDescriptors.add
                        (createChildParameter
                                (MetsPackage.Literals.AMD_SEC_TYPE__RIGHTS_MD,
                                 MetsFactory.eINSTANCE.createMdSecType()));

                newChildDescriptors.add
                        (createChildParameter
                                (MetsPackage.Literals.AMD_SEC_TYPE__SOURCE_MD,
                                 MetsFactory.eINSTANCE.createMdSecType()));

                newChildDescriptors.add
                        (createChildParameter
                                (MetsPackage.Literals.AMD_SEC_TYPE__DIGIPROV_MD,
                                 MetsFactory.eINSTANCE.createMdSecType()));
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

                boolean qualify =
                        childFeature == MetsPackage.Literals.AMD_SEC_TYPE__TECH_MD ||
                        childFeature == MetsPackage.Literals.AMD_SEC_TYPE__RIGHTS_MD ||
                        childFeature == MetsPackage.Literals.AMD_SEC_TYPE__SOURCE_MD ||
                        childFeature == MetsPackage.Literals.AMD_SEC_TYPE__DIGIPROV_MD;

                if (qualify) {
                        return getString
                                ("_UI_CreateChild_text2",
                                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
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
                return MetsEditPlugin.INSTANCE;
        }

}
