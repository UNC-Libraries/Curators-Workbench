/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
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

import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;
import crosswalk.DelimitedFile;
import java.net.URI;

/**
 * This is the item provider adapter for a {@link crosswalk.DelimitedFile} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DelimitedFileItemProvider
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
        public DelimitedFileItemProvider(AdapterFactory adapterFactory) {
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

			addSourceFilePropertyDescriptor(object);
			addDataRowPropertyDescriptor(object);
			addHeaderRowPropertyDescriptor(object);
			addTextEncodingPropertyDescriptor(object);
			addFieldDelimiterPropertyDescriptor(object);
			addTextDelimiterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

        /**
	 * This adds a property descriptor for the Source File feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addSourceFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelimitedFile_SourceFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelimitedFile_SourceFile_feature", "_UI_DelimitedFile_type"),
				 CrosswalkPackage.Literals.DELIMITED_FILE__SOURCE_FILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the Data Row feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addDataRowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelimitedFile_dataRow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelimitedFile_dataRow_feature", "_UI_DelimitedFile_type"),
				 CrosswalkPackage.Literals.DELIMITED_FILE__DATA_ROW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the Header Row feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addHeaderRowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelimitedFile_headerRow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelimitedFile_headerRow_feature", "_UI_DelimitedFile_type"),
				 CrosswalkPackage.Literals.DELIMITED_FILE__HEADER_ROW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the Text Encoding feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addTextEncodingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelimitedFile_textEncoding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelimitedFile_textEncoding_feature", "_UI_DelimitedFile_type"),
				 CrosswalkPackage.Literals.DELIMITED_FILE__TEXT_ENCODING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the Field Delimiter feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addFieldDelimiterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelimitedFile_fieldDelimiter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelimitedFile_fieldDelimiter_feature", "_UI_DelimitedFile_type"),
				 CrosswalkPackage.Literals.DELIMITED_FILE__FIELD_DELIMITER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.TEXT_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the Text Delimiter feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addTextDelimiterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelimitedFile_textDelimiter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelimitedFile_textDelimiter_feature", "_UI_DelimitedFile_type"),
				 CrosswalkPackage.Literals.DELIMITED_FILE__TEXT_DELIMITER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.TEXT_VALUE_IMAGE,
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
			childrenFeatures.add(CrosswalkPackage.Literals.DATA_SOURCE__FIELDS);
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
	 * This returns DelimitedFile.gif.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DelimitedFile"));
	}

        /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public String getText(Object object) {
		URI labelValue = ((DelimitedFile)object).getSourceFile();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DelimitedFile_type") :
			getString("_UI_DelimitedFile_type") + " " + label;
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

		switch (notification.getFeatureID(DelimitedFile.class)) {
			case CrosswalkPackage.DELIMITED_FILE__SOURCE_FILE:
			case CrosswalkPackage.DELIMITED_FILE__DATA_ROW:
			case CrosswalkPackage.DELIMITED_FILE__HEADER_ROW:
			case CrosswalkPackage.DELIMITED_FILE__TEXT_ENCODING:
			case CrosswalkPackage.DELIMITED_FILE__FIELD_DELIMITER:
			case CrosswalkPackage.DELIMITED_FILE__TEXT_DELIMITER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CrosswalkPackage.DELIMITED_FILE__FIELDS:
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
				(CrosswalkPackage.Literals.DATA_SOURCE__FIELDS,
				 CrosswalkFactory.eINSTANCE.createDataField()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.DATA_SOURCE__FIELDS,
				 CrosswalkFactory.eINSTANCE.createTabbedDataField()));
	}

        /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public ResourceLocator getResourceLocator() {
		return CrosswalkEditPlugin.INSTANCE;
	}

}
