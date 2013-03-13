/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.provider;


import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;
import crosswalk.Form;

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
 * This is the item provider adapter for a {@link crosswalk.Form} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FormItemProvider
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
	public FormItemProvider(AdapterFactory adapterFactory) {
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

			addTitlePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addEmailDepositNoticeToPropertyDescriptor(object);
			addDepositContainerIdPropertyDescriptor(object);
			addAuthorizedGroupsPropertyDescriptor(object);
			addReviewBeforePublicationPropertyDescriptor(object);
			addPromptForMultipleSubmissionsPropertyDescriptor(object);
			addCanAddSupplementalFilesPropertyDescriptor(object);
			addContactNamePropertyDescriptor(object);
			addContactEmailPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Form_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Form_title_feature", "_UI_Form_type"),
				 CrosswalkPackage.Literals.FORM__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Form_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Form_description_feature", "_UI_Form_type"),
				 CrosswalkPackage.Literals.FORM__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Deposit Notice To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailDepositNoticeToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Form_emailDepositNoticeTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Form_emailDepositNoticeTo_feature", "_UI_Form_type"),
				 CrosswalkPackage.Literals.FORM__EMAIL_DEPOSIT_NOTICE_TO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deposit Container Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDepositContainerIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Form_depositContainerId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Form_depositContainerId_feature", "_UI_Form_type"),
				 CrosswalkPackage.Literals.FORM__DEPOSIT_CONTAINER_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Authorized Groups feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorizedGroupsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Form_authorizedGroups_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Form_authorizedGroups_feature", "_UI_Form_type"),
				 CrosswalkPackage.Literals.FORM__AUTHORIZED_GROUPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Review Before Publication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReviewBeforePublicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Form_reviewBeforePublication_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Form_reviewBeforePublication_feature", "_UI_Form_type"),
				 CrosswalkPackage.Literals.FORM__REVIEW_BEFORE_PUBLICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prompt For Multiple Submissions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPromptForMultipleSubmissionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Form_promptForMultipleSubmissions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Form_promptForMultipleSubmissions_feature", "_UI_Form_type"),
				 CrosswalkPackage.Literals.FORM__PROMPT_FOR_MULTIPLE_SUBMISSIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Add Supplemental Files feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanAddSupplementalFilesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Form_canAddSupplementalFiles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Form_canAddSupplementalFiles_feature", "_UI_Form_type"),
				 CrosswalkPackage.Literals.FORM__CAN_ADD_SUPPLEMENTAL_FILES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contact Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContactNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Form_contactName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Form_contactName_feature", "_UI_Form_type"),
				 CrosswalkPackage.Literals.FORM__CONTACT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contact Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContactEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Form_contactEmail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Form_contactEmail_feature", "_UI_Form_type"),
				 CrosswalkPackage.Literals.FORM__CONTACT_EMAIL,
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
			childrenFeatures.add(CrosswalkPackage.Literals.FORM__ELEMENTS);
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
	 * This returns Form.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Form"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Form)object).getContactName();
		return label == null || label.length() == 0 ?
			getString("_UI_Form_type") :
			getString("_UI_Form_type") + " " + label;
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

		switch (notification.getFeatureID(Form.class)) {
			case CrosswalkPackage.FORM__CURRENT_USER:
			case CrosswalkPackage.FORM__TITLE:
			case CrosswalkPackage.FORM__DESCRIPTION:
			case CrosswalkPackage.FORM__EMAIL_DEPOSIT_NOTICE_TO:
			case CrosswalkPackage.FORM__DEPOSIT_CONTAINER_ID:
			case CrosswalkPackage.FORM__AUTHORIZED_GROUPS:
			case CrosswalkPackage.FORM__REVIEW_BEFORE_PUBLICATION:
			case CrosswalkPackage.FORM__PROMPT_FOR_MULTIPLE_SUBMISSIONS:
			case CrosswalkPackage.FORM__CAN_ADD_SUPPLEMENTAL_FILES:
			case CrosswalkPackage.FORM__CONTACT_NAME:
			case CrosswalkPackage.FORM__CONTACT_EMAIL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CrosswalkPackage.FORM__ELEMENTS:
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
				(CrosswalkPackage.Literals.FORM__ELEMENTS,
				 CrosswalkFactory.eINSTANCE.createMetadataBlock()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.FORM__ELEMENTS,
				 CrosswalkFactory.eINSTANCE.createParagraph()));
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
