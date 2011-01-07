/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.provider;

import gov.loc.mods.mods.DigitalOriginDefinition;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.PhysicalDescriptionDefinition;
import gov.loc.mods.mods.ReformattingQualityDefinition;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.PhysicalDescriptionDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalDescriptionDefinitionItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhysicalDescriptionDefinitionItemProvider(AdapterFactory adapterFactory) {
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

	    addReformattingQualityPropertyDescriptor(object);
	    addDigitalOriginPropertyDescriptor(object);
	    addAltRepGroupPropertyDescriptor(object);
	    addDisplayLabelPropertyDescriptor(object);
	    addLangPropertyDescriptor(object);
	    addLang1PropertyDescriptor(object);
	    addScriptPropertyDescriptor(object);
	    addTransliterationPropertyDescriptor(object);
	}
	return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Reformatting Quality feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReformattingQualityPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_PhysicalDescriptionDefinition_reformattingQuality_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_PhysicalDescriptionDefinition_reformattingQuality_feature",
					"_UI_PhysicalDescriptionDefinition_type"), MODSPackage.eINSTANCE
					.getPhysicalDescriptionDefinition_ReformattingQuality(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Digital Origin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDigitalOriginPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_PhysicalDescriptionDefinition_digitalOrigin_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_PhysicalDescriptionDefinition_digitalOrigin_feature",
					"_UI_PhysicalDescriptionDefinition_type"), MODSPackage.eINSTANCE
					.getPhysicalDescriptionDefinition_DigitalOrigin(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			getString("_UI_PhysicalDescriptionDefinition_altRepGroup_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_PhysicalDescriptionDefinition_altRepGroup_feature",
					"_UI_PhysicalDescriptionDefinition_type"), MODSPackage.eINSTANCE
					.getPhysicalDescriptionDefinition_AltRepGroup(), true, false, false,
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
			getString("_UI_PhysicalDescriptionDefinition_displayLabel_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_PhysicalDescriptionDefinition_displayLabel_feature",
					"_UI_PhysicalDescriptionDefinition_type"), MODSPackage.eINSTANCE
					.getPhysicalDescriptionDefinition_DisplayLabel(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Lang feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLangPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_PhysicalDescriptionDefinition_lang_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_PhysicalDescriptionDefinition_lang_feature",
					"_UI_PhysicalDescriptionDefinition_type"), MODSPackage.eINSTANCE
					.getPhysicalDescriptionDefinition_Lang(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Lang1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLang1PropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_PhysicalDescriptionDefinition_lang1_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_PhysicalDescriptionDefinition_lang1_feature",
					"_UI_PhysicalDescriptionDefinition_type"), MODSPackage.eINSTANCE
					.getPhysicalDescriptionDefinition_Lang1(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Script feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addScriptPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_PhysicalDescriptionDefinition_script_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_PhysicalDescriptionDefinition_script_feature",
					"_UI_PhysicalDescriptionDefinition_type"), MODSPackage.eINSTANCE
					.getPhysicalDescriptionDefinition_Script(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Transliteration feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransliterationPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_PhysicalDescriptionDefinition_transliteration_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_PhysicalDescriptionDefinition_transliteration_feature",
					"_UI_PhysicalDescriptionDefinition_type"), MODSPackage.eINSTANCE
					.getPhysicalDescriptionDefinition_Transliteration(), true, false, false,
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
	    childrenFeatures.add(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group());
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
     * This returns PhysicalDescriptionDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/PhysicalDescriptionDefinition"));
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
	String label = ((PhysicalDescriptionDefinition) object).getAltRepGroup();
	return label == null || label.length() == 0 ? getString("_UI_PhysicalDescriptionDefinition_type")
			: getString("_UI_PhysicalDescriptionDefinition_type") + " " + label;
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

	switch (notification.getFeatureID(PhysicalDescriptionDefinition.class)) {
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__REFORMATTING_QUALITY:
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__DIGITAL_ORIGIN:
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__ALT_REP_GROUP:
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__DISPLAY_LABEL:
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__LANG:
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__LANG1:
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__SCRIPT:
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__TRANSLITERATION:
	    fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__GROUP:
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

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Form(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Form(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Form(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors
			.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
					FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
							.getPhysicalDescriptionDefinition_Form(), MODSFactory.eINSTANCE
							.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Form(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_ReformattingQuality(),
					ReformattingQualityDefinition.ACCESS)));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
					.getPhysicalDescriptionDefinition_InternetMediaType(), MODSFactory.eINSTANCE
					.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Extent(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_DigitalOrigin(),
					DigitalOriginDefinition.BORN_DIGITAL)));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Note(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Note(),
					MODSFactory.eINSTANCE.createNoteDefinition())));
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

	boolean qualify = childFeature == MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Form()
			|| childFeature == MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType()
			|| childFeature == MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Note()
			|| childFeature == MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Extent();

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
