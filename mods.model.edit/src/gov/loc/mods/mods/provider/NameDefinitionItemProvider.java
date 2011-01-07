/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.provider;

import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.NameDefinition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.NameDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NameDefinitionItemProvider extends NameBaseDefinitionItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NameDefinitionItemProvider(AdapterFactory adapterFactory) {
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
	    addNameTitleGroupPropertyDescriptor(object);
	    addUsagePropertyDescriptor(object);
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
			getString("_UI_NameDefinition_altRepGroup_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameDefinition_altRepGroup_feature",
					"_UI_NameDefinition_type"), MODSPackage.eINSTANCE
					.getNameDefinition_AltRepGroup(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Name Title Group feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNameTitleGroupPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_NameDefinition_nameTitleGroup_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameDefinition_nameTitleGroup_feature",
					"_UI_NameDefinition_type"), MODSPackage.eINSTANCE
					.getNameDefinition_NameTitleGroup(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Usage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsagePropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_NameDefinition_usage_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameDefinition_usage_feature",
					"_UI_NameDefinition_type"), MODSPackage.eINSTANCE.getNameDefinition_Usage(),
			true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns NameDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/NameDefinition"));
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
	String label = ((NameDefinition) object).getID();
	return label == null || label.length() == 0 ? getString("_UI_NameDefinition_type")
			: getString("_UI_NameDefinition_type") + " " + label;
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

	switch (notification.getFeatureID(NameDefinition.class)) {
	case MODSPackage.NAME_DEFINITION__ALT_REP_GROUP:
	case MODSPackage.NAME_DEFINITION__NAME_TITLE_GROUP:
	case MODSPackage.NAME_DEFINITION__USAGE:
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
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
	Object childFeature = feature;
	Object childObject = child;

	if (childFeature instanceof EStructuralFeature
			&& FeatureMapUtil.isFeatureMap((EStructuralFeature) childFeature)) {
	    FeatureMap.Entry entry = (FeatureMap.Entry) childObject;
	    childFeature = entry.getEStructuralFeature();
	    childObject = entry.getValue();
	}

	boolean qualify = childFeature == MODSPackage.eINSTANCE.getNameBaseDefinition_NamePart()
			|| childFeature == MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm()
			|| childFeature == MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation()
			|| childFeature == MODSPackage.eINSTANCE.getNameBaseDefinition_Description();

	if (qualify) {
	    return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject),
			    getFeatureText(childFeature), getTypeText(owner) });
	}
	return super.getCreateChildText(owner, feature, child, selection);
    }

}
