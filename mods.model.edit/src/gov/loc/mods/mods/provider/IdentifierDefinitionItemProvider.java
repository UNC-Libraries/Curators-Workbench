/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.provider;

import gov.loc.mods.mods.IdentifierDefinition;
import gov.loc.mods.mods.MODSPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.IdentifierDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifierDefinitionItemProvider extends XsStringItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentifierDefinitionItemProvider(AdapterFactory adapterFactory) {
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

	    addAltRepGroupPropertyDescriptor(object);
	    addDisplayLabelPropertyDescriptor(object);
	    addInvalidPropertyDescriptor(object);
	    addTypePropertyDescriptor(object);
	}
	return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Alt Rep Group feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAltRepGroupPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_IdentifierDefinition_altRepGroup_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_IdentifierDefinition_altRepGroup_feature",
					"_UI_IdentifierDefinition_type"), MODSPackage.eINSTANCE
					.getIdentifierDefinition_AltRepGroup(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Display Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDisplayLabelPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_IdentifierDefinition_displayLabel_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_IdentifierDefinition_displayLabel_feature",
					"_UI_IdentifierDefinition_type"), MODSPackage.eINSTANCE
					.getIdentifierDefinition_DisplayLabel(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Invalid feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInvalidPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_IdentifierDefinition_invalid_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_IdentifierDefinition_invalid_feature",
					"_UI_IdentifierDefinition_type"), MODSPackage.eINSTANCE
					.getIdentifierDefinition_Invalid(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_IdentifierDefinition_type_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_IdentifierDefinition_type_feature",
					"_UI_IdentifierDefinition_type"), MODSPackage.eINSTANCE
					.getIdentifierDefinition_Type(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns IdentifierDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/IdentifierDefinition"));
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
	String label = ((IdentifierDefinition) object).getValue();
	return label == null || label.length() == 0 ? getString("_UI_IdentifierDefinition_type")
			: getString("_UI_IdentifierDefinition_type") + " " + label;
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

	switch (notification.getFeatureID(IdentifierDefinition.class)) {
	case MODSPackage.IDENTIFIER_DEFINITION__ALT_REP_GROUP:
	case MODSPackage.IDENTIFIER_DEFINITION__DISPLAY_LABEL:
	case MODSPackage.IDENTIFIER_DEFINITION__INVALID:
	case MODSPackage.IDENTIFIER_DEFINITION__TYPE:
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

}
