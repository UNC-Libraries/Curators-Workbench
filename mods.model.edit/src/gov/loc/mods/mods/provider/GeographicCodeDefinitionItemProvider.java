/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.provider;

import gov.loc.mods.mods.GeographicCodeDefinition;
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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.GeographicCodeDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeographicCodeDefinitionItemProvider extends XsStringItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeographicCodeDefinitionItemProvider(AdapterFactory adapterFactory) {
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

	    addAuthorityPropertyDescriptor(object);
	    addAuthorityURIPropertyDescriptor(object);
	    addValueURIPropertyDescriptor(object);
	}
	return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Authority feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuthorityPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_GeographicCodeDefinition_authority_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_GeographicCodeDefinition_authority_feature",
					"_UI_GeographicCodeDefinition_type"), MODSPackage.eINSTANCE
					.getGeographicCodeDefinition_Authority(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Authority URI feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuthorityURIPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_GeographicCodeDefinition_authorityURI_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_GeographicCodeDefinition_authorityURI_feature",
					"_UI_GeographicCodeDefinition_type"), MODSPackage.eINSTANCE
					.getGeographicCodeDefinition_AuthorityURI(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Value URI feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValueURIPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_GeographicCodeDefinition_valueURI_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_GeographicCodeDefinition_valueURI_feature",
					"_UI_GeographicCodeDefinition_type"), MODSPackage.eINSTANCE
					.getGeographicCodeDefinition_ValueURI(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns GeographicCodeDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/GeographicCodeDefinition"));
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
	String label = ((GeographicCodeDefinition) object).getValue();
	return label == null || label.length() == 0 ? getString("_UI_GeographicCodeDefinition_type")
			: getString("_UI_GeographicCodeDefinition_type") + " " + label;
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

	switch (notification.getFeatureID(GeographicCodeDefinition.class)) {
	case MODSPackage.GEOGRAPHIC_CODE_DEFINITION__AUTHORITY:
	case MODSPackage.GEOGRAPHIC_CODE_DEFINITION__AUTHORITY_URI:
	case MODSPackage.GEOGRAPHIC_CODE_DEFINITION__VALUE_URI:
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
