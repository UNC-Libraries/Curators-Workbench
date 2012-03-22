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


import gov.loc.mets.DivType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.util.METSConstants;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
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
 * This is the item provider adapter for a {@link gov.loc.mets.DivType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DivTypeItemProvider
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
        public DivTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

        @Override
		protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
				Collection<?> collection) {
      	  return new RemoveDivTypeCommand(domain, owner, feature, collection);
		}

		@Override
		protected Command createRemoveCommand(EditingDomain domain, EObject owner, EReference feature,
				Collection<?> collection) {
			// TODO Auto-generated method stub
			return new RemoveDivTypeCommand(domain, owner, feature, collection);
		}

		/**
         * This returns the property descriptors for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        @Override
        public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
                if (itemPropertyDescriptors == null) {
                        super.getPropertyDescriptors(object);

                        //addADMIDPropertyDescriptor(object);
                        addCONTENTIDSPropertyDescriptor(object);
                        //addDMDIDPropertyDescriptor(object);
                        addIDPropertyDescriptor(object);
                        //addLabelPropertyDescriptor(object);
                        addLABEL1PropertyDescriptor(object);
                        //addORDERPropertyDescriptor(object);
                        //addORDERLABELPropertyDescriptor(object);
                        addTYPEPropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
        }

        /**
	 * This adds a property descriptor for the Md Sec feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addMdSecPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DivType_mdSec_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DivType_mdSec_feature", "_UI_DivType_type"),
				 MetsPackage.Literals.DIV_TYPE__MD_SEC,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the CONTENTIDS feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addCONTENTIDSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DivType_cONTENTIDS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DivType_cONTENTIDS_feature", "_UI_DivType_type"),
				 MetsPackage.Literals.DIV_TYPE__CONTENTIDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the Dmd Sec feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addDmdSecPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DivType_dmdSec_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DivType_dmdSec_feature", "_UI_DivType_type"),
				 MetsPackage.Literals.DIV_TYPE__DMD_SEC,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_DivType_iD_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DivType_iD_feature", "_UI_DivType_type"),
				 MetsPackage.Literals.DIV_TYPE__ID,
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
				 getString("_UI_DivType_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DivType_label_feature", "_UI_DivType_type"),
				 MetsPackage.Literals.DIV_TYPE__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the LABEL1 feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addLABEL1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DivType_lABEL1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DivType_lABEL1_feature", "_UI_DivType_type"),
				 MetsPackage.Literals.DIV_TYPE__LABEL1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the ORDER feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addORDERPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DivType_oRDER_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DivType_oRDER_feature", "_UI_DivType_type"),
				 MetsPackage.Literals.DIV_TYPE__ORDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the ORDERLABEL feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addORDERLABELPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DivType_oRDERLABEL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DivType_oRDERLABEL_feature", "_UI_DivType_type"),
				 MetsPackage.Literals.DIV_TYPE__ORDERLABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the TYPE feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addTYPEPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DivType_tYPE_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DivType_tYPE_feature", "_UI_DivType_type"),
				 MetsPackage.Literals.DIV_TYPE__TYPE,
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
         * @generated NOT
         */
        @Override
        public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
                if (childrenFeatures == null) {
                        super.getChildrenFeatures(object);
                        //childrenFeatures.add(MetsPackage.Literals.DIV_TYPE__MPTR);
                        //childrenFeatures.add(MetsPackage.Literals.DIV_TYPE__FPTR);
                        childrenFeatures.add(MetsPackage.Literals.DIV_TYPE__DIV);
                        //addUserDescriptionChildFeature(object);

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
	 * This returns DivType.gif.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated NOT
	 */
        @Override
        public Object getImage(Object object) {
      	  DivType div = (DivType)object;
      	  if(METSConstants.Div_Collection.equals(div.getTYPE())) {
      		  return overlayImage(object, getResourceLocator().getImage("full/obj16/CollectionDivType.png"));
      	  } else if(METSConstants.Div_Disk.equals(div.getTYPE())) {
      		  return overlayImage(object, getResourceLocator().getImage("full/obj16/DiskDivType.png"));
      	  } else if(METSConstants.Div_File.equals(div.getTYPE())) {
      		  return overlayImage(object, getResourceLocator().getImage("full/obj16/FileDivType.png"));
      	  } else if(METSConstants.Div_Folder.equals(div.getTYPE())) {
      		  return overlayImage(object, getResourceLocator().getImage("full/obj16/FolderDivType.png"));
      	  } else {
      		  return overlayImage(object, getResourceLocator().getImage("full/obj16/DivType"));
      	  }
	}

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        @Override
        public String getText(Object object) {
                String label = ((DivType)object).getLABEL1();
                return label == null || label.length() == 0 ?
                        getString("_UI_DivType_type") :
                        label;
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

		switch (notification.getFeatureID(DivType.class)) {
			case MetsPackage.DIV_TYPE__CONTENTIDS:
			case MetsPackage.DIV_TYPE__ID:
			case MetsPackage.DIV_TYPE__LABEL:
			case MetsPackage.DIV_TYPE__LABEL1:
			case MetsPackage.DIV_TYPE__ORDER:
			case MetsPackage.DIV_TYPE__ORDERLABEL:
			case MetsPackage.DIV_TYPE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MetsPackage.DIV_TYPE__MPTR:
			case MetsPackage.DIV_TYPE__FPTR:
			case MetsPackage.DIV_TYPE__DIV:
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
				(MetsPackage.Literals.DIV_TYPE__MPTR,
				 MetsFactory.eINSTANCE.createMptrType()));

		newChildDescriptors.add
			(createChildParameter
				(MetsPackage.Literals.DIV_TYPE__FPTR,
				 MetsFactory.eINSTANCE.createFptrType()));

		newChildDescriptors.add
			(createChildParameter
				(MetsPackage.Literals.DIV_TYPE__DIV,
				 MetsFactory.eINSTANCE.createDivType()));
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
