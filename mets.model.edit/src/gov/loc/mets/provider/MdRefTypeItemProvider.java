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


import gov.loc.mets.MdRefType;
import gov.loc.mets.MetsPackage;

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
 * This is the item provider adapter for a {@link gov.loc.mets.MdRefType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MdRefTypeItemProvider
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
        public MdRefTypeItemProvider(AdapterFactory adapterFactory) {
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
			addCHECKSUMPropertyDescriptor(object);
			addCHECKSUMTYPEPropertyDescriptor(object);
			addCREATEDPropertyDescriptor(object);
			addHrefPropertyDescriptor(object);
			addIDPropertyDescriptor(object);
			addLABELPropertyDescriptor(object);
			addLOCTYPEPropertyDescriptor(object);
			addMDTYPEPropertyDescriptor(object);
			addMDTYPEVERSIONPropertyDescriptor(object);
			addMIMETYPEPropertyDescriptor(object);
			addOTHERLOCTYPEPropertyDescriptor(object);
			addOTHERMDTYPEPropertyDescriptor(object);
			addRolePropertyDescriptor(object);
			addShowPropertyDescriptor(object);
			addSIZEPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addXPTRPropertyDescriptor(object);
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
				 getString("_UI_MdRefType_actuate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_actuate_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__ACTUATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_MdRefType_arcrole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_arcrole_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__ARCROLE,
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
				 getString("_UI_MdRefType_cHECKSUM_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_cHECKSUM_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__CHECKSUM,
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
				 getString("_UI_MdRefType_cHECKSUMTYPE_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_cHECKSUMTYPE_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__CHECKSUMTYPE,
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
				 getString("_UI_MdRefType_cREATED_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_cREATED_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__CREATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_MdRefType_href_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_href_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__HREF,
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
				 getString("_UI_MdRefType_iD_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_iD_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__ID,
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
				 getString("_UI_MdRefType_lABEL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_lABEL_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the LOCTYPE feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addLOCTYPEPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MdRefType_lOCTYPE_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_lOCTYPE_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__LOCTYPE,
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
				 getString("_UI_MdRefType_mDTYPE_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_mDTYPE_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__MDTYPE,
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
				 getString("_UI_MdRefType_mDTYPEVERSION_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_mDTYPEVERSION_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__MDTYPEVERSION,
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
				 getString("_UI_MdRefType_mIMETYPE_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_mIMETYPE_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__MIMETYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the OTHERLOCTYPE feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addOTHERLOCTYPEPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MdRefType_oTHERLOCTYPE_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_oTHERLOCTYPE_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__OTHERLOCTYPE,
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
				 getString("_UI_MdRefType_oTHERMDTYPE_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_oTHERMDTYPE_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__OTHERMDTYPE,
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
				 getString("_UI_MdRefType_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_role_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__ROLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_MdRefType_show_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_show_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__SHOW,
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
				 getString("_UI_MdRefType_sIZE_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_sIZE_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_MdRefType_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_title_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__TITLE,
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
				 getString("_UI_MdRefType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_type_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the XPTR feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addXPTRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MdRefType_xPTR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MdRefType_xPTR_feature", "_UI_MdRefType_type"),
				 MetsPackage.Literals.MD_REF_TYPE__XPTR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This returns MdRefType.gif.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MdRefType"));
	}

        /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public String getText(Object object) {
		String label = ((MdRefType)object).getID();
		return label == null || label.length() == 0 ?
			getString("_UI_MdRefType_type") :
			getString("_UI_MdRefType_type") + " " + label;
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

		switch (notification.getFeatureID(MdRefType.class)) {
			case MetsPackage.MD_REF_TYPE__ACTUATE:
			case MetsPackage.MD_REF_TYPE__ARCROLE:
			case MetsPackage.MD_REF_TYPE__CHECKSUM:
			case MetsPackage.MD_REF_TYPE__CHECKSUMTYPE:
			case MetsPackage.MD_REF_TYPE__CREATED:
			case MetsPackage.MD_REF_TYPE__HREF:
			case MetsPackage.MD_REF_TYPE__ID:
			case MetsPackage.MD_REF_TYPE__LABEL:
			case MetsPackage.MD_REF_TYPE__LOCTYPE:
			case MetsPackage.MD_REF_TYPE__MDTYPE:
			case MetsPackage.MD_REF_TYPE__MDTYPEVERSION:
			case MetsPackage.MD_REF_TYPE__MIMETYPE:
			case MetsPackage.MD_REF_TYPE__OTHERLOCTYPE:
			case MetsPackage.MD_REF_TYPE__OTHERMDTYPE:
			case MetsPackage.MD_REF_TYPE__ROLE:
			case MetsPackage.MD_REF_TYPE__SHOW:
			case MetsPackage.MD_REF_TYPE__SIZE:
			case MetsPackage.MD_REF_TYPE__TITLE:
			case MetsPackage.MD_REF_TYPE__TYPE:
			case MetsPackage.MD_REF_TYPE__XPTR:
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
