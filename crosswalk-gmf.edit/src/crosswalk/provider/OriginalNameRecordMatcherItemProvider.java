/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.provider;


import crosswalk.CrosswalkPackage;
import crosswalk.OriginalNameRecordMatcher;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link crosswalk.OriginalNameRecordMatcher} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OriginalNameRecordMatcherItemProvider
        extends WalkWidgetItemProvider
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
        public OriginalNameRecordMatcherItemProvider(AdapterFactory adapterFactory) {
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

                        addCaseSensitivePropertyDescriptor(object);
                        addIncludeFileExtensionPropertyDescriptor(object);
                        addBaseFolderPropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
        }

        /**
         * This adds a property descriptor for the Case Sensitive feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addCaseSensitivePropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_OriginalNameRecordMatcher_caseSensitive_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_OriginalNameRecordMatcher_caseSensitive_feature", "_UI_OriginalNameRecordMatcher_type"),
                                 CrosswalkPackage.Literals.ORIGINAL_NAME_RECORD_MATCHER__CASE_SENSITIVE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Include File Extension feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addIncludeFileExtensionPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_OriginalNameRecordMatcher_includeFileExtension_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_OriginalNameRecordMatcher_includeFileExtension_feature", "_UI_OriginalNameRecordMatcher_type"),
                                 CrosswalkPackage.Literals.ORIGINAL_NAME_RECORD_MATCHER__INCLUDE_FILE_EXTENSION,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Base Folder feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addBaseFolderPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_OriginalNameRecordMatcher_baseFolder_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_OriginalNameRecordMatcher_baseFolder_feature", "_UI_OriginalNameRecordMatcher_type"),
                                 CrosswalkPackage.Literals.ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER,
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
                        childrenFeatures.add(CrosswalkPackage.Literals.ORIGINAL_NAME_RECORD_MATCHER__INPUT);
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
         * This returns OriginalNameRecordMatcher.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/OriginalNameRecordMatcher"));
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String getText(Object object) {
                OriginalNameRecordMatcher originalNameRecordMatcher = (OriginalNameRecordMatcher)object;
                return getString("_UI_OriginalNameRecordMatcher_type") + " " + originalNameRecordMatcher.isCaseSensitive();
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

                switch (notification.getFeatureID(OriginalNameRecordMatcher.class)) {
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__CASE_SENSITIVE:
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__INCLUDE_FILE_EXTENSION:
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER:
                                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                                return;
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__INPUT:
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
        }

}
