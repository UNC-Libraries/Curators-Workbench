/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.provider;

import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.TableOfContentsDefinition;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.TableOfContentsDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TableOfContentsDefinitionItemProvider extends UnstructuredTextDefinitionItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableOfContentsDefinitionItemProvider(AdapterFactory adapterFactory) {
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
	    addShareablePropertyDescriptor(object);
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
			getString("_UI_TableOfContentsDefinition_altRepGroup_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_TableOfContentsDefinition_altRepGroup_feature",
					"_UI_TableOfContentsDefinition_type"), MODSPackage.eINSTANCE
					.getTableOfContentsDefinition_AltRepGroup(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Shareable feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShareablePropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_TableOfContentsDefinition_shareable_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_TableOfContentsDefinition_shareable_feature",
					"_UI_TableOfContentsDefinition_type"), MODSPackage.eINSTANCE
					.getTableOfContentsDefinition_Shareable(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns TableOfContentsDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/TableOfContentsDefinition"));
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
	String label = ((TableOfContentsDefinition) object).getValue();
	return label == null || label.length() == 0 ? getString("_UI_TableOfContentsDefinition_type")
			: getString("_UI_TableOfContentsDefinition_type") + " " + label;
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

	switch (notification.getFeatureID(TableOfContentsDefinition.class)) {
	case MODSPackage.TABLE_OF_CONTENTS_DEFINITION__ALT_REP_GROUP:
	case MODSPackage.TABLE_OF_CONTENTS_DEFINITION__SHAREABLE:
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
