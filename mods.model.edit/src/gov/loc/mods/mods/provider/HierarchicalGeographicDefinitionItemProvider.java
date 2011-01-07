/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.provider;

import gov.loc.mods.mods.HierarchicalGeographicDefinition;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gov.loc.mods.mods.HierarchicalGeographicDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HierarchicalGeographicDefinitionItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HierarchicalGeographicDefinitionItemProvider(AdapterFactory adapterFactory) {
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
			getString("_UI_HierarchicalGeographicDefinition_authority_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_HierarchicalGeographicDefinition_authority_feature",
					"_UI_HierarchicalGeographicDefinition_type"), MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_Authority(), true, false, false,
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
			getString("_UI_HierarchicalGeographicDefinition_authorityURI_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_HierarchicalGeographicDefinition_authorityURI_feature",
					"_UI_HierarchicalGeographicDefinition_type"), MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_AuthorityURI(), true, false, false,
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
			getString("_UI_HierarchicalGeographicDefinition_valueURI_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_HierarchicalGeographicDefinition_valueURI_feature",
					"_UI_HierarchicalGeographicDefinition_type"), MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ValueURI(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
	    childrenFeatures.add(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group());
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
     * This returns HierarchicalGeographicDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/HierarchicalGeographicDefinition"));
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
	String label = ((HierarchicalGeographicDefinition) object).getAuthority();
	return label == null || label.length() == 0 ? getString("_UI_HierarchicalGeographicDefinition_type")
			: getString("_UI_HierarchicalGeographicDefinition_type") + " " + label;
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

	switch (notification.getFeatureID(HierarchicalGeographicDefinition.class)) {
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AUTHORITY:
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__AUTHORITY_URI:
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__VALUE_URI:
	    fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
	    return;
	case MODSPackage.HIERARCHICAL_GEOGRAPHIC_DEFINITION__GROUP:
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

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors
			.add(createChildParameter(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
					FeatureMapUtil.createEntry(
							MODSPackage.eINSTANCE
									.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
							MODSFactory.eINSTANCE
									.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_ExtraterrestrialArea(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_Continent(), MODSFactory.eINSTANCE
					.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors
			.add(createChildParameter(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
					FeatureMapUtil.createEntry(
							MODSPackage.eINSTANCE
									.getHierarchicalGeographicDefinition_Country(),
							MODSFactory.eINSTANCE
									.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors
			.add(createChildParameter(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
					FeatureMapUtil.createEntry(
							MODSPackage.eINSTANCE
									.getHierarchicalGeographicDefinition_Province(),
							MODSFactory.eINSTANCE
									.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors
			.add(createChildParameter(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
					FeatureMapUtil.createEntry(
							MODSPackage.eINSTANCE
									.getHierarchicalGeographicDefinition_Region(),
							MODSFactory.eINSTANCE
									.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors
			.add(createChildParameter(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
					FeatureMapUtil.createEntry(
							MODSPackage.eINSTANCE
									.getHierarchicalGeographicDefinition_State(),
							MODSFactory.eINSTANCE
									.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_Territory(), MODSFactory.eINSTANCE
					.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors
			.add(createChildParameter(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
					FeatureMapUtil.createEntry(
							MODSPackage.eINSTANCE
									.getHierarchicalGeographicDefinition_County(),
							MODSFactory.eINSTANCE
									.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors
			.add(createChildParameter(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
					FeatureMapUtil.createEntry(
							MODSPackage.eINSTANCE
									.getHierarchicalGeographicDefinition_City(),
							MODSFactory.eINSTANCE
									.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getHierarchicalGeographicDefinition_CitySection(), MODSFactory.eINSTANCE
					.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors
			.add(createChildParameter(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
					FeatureMapUtil.createEntry(
							MODSPackage.eINSTANCE
									.getHierarchicalGeographicDefinition_Island(),
							MODSFactory.eINSTANCE
									.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors
			.add(createChildParameter(
					MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
					FeatureMapUtil.createEntry(
							MODSPackage.eINSTANCE
									.getHierarchicalGeographicDefinition_Area(),
							MODSFactory.eINSTANCE
									.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));
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

	boolean qualify = childFeature == MODSPackage.eINSTANCE
			.getHierarchicalGeographicDefinition_ExtraterrestrialArea()
			|| childFeature == MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Continent()
			|| childFeature == MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Country()
			|| childFeature == MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Province()
			|| childFeature == MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Region()
			|| childFeature == MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_State()
			|| childFeature == MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Territory()
			|| childFeature == MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_County()
			|| childFeature == MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_City()
			|| childFeature == MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_CitySection()
			|| childFeature == MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Island()
			|| childFeature == MODSPackage.eINSTANCE.getHierarchicalGeographicDefinition_Area();

	if (qualify) {
	    return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject),
			    getFeatureText(childFeature), getTypeText(owner) });
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
	return ModsEditPlugin.INSTANCE;
    }

}
