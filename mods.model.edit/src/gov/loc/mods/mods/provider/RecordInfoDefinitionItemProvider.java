/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.provider;

import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.RecordInfoDefinition;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.RecordInfoDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RecordInfoDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RecordInfoDefinitionItemProvider(AdapterFactory adapterFactory) {
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
	    addLangPropertyDescriptor(object);
	    addLang1PropertyDescriptor(object);
	    addScriptPropertyDescriptor(object);
	    addTransliterationPropertyDescriptor(object);
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
			getString("_UI_RecordInfoDefinition_altRepGroup_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_RecordInfoDefinition_altRepGroup_feature",
					"_UI_RecordInfoDefinition_type"), MODSPackage.eINSTANCE
					.getRecordInfoDefinition_AltRepGroup(), true, false, false,
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
			getString("_UI_RecordInfoDefinition_displayLabel_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_RecordInfoDefinition_displayLabel_feature",
					"_UI_RecordInfoDefinition_type"), MODSPackage.eINSTANCE
					.getRecordInfoDefinition_DisplayLabel(), true, false, false,
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
			getString("_UI_RecordInfoDefinition_lang_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_RecordInfoDefinition_lang_feature",
					"_UI_RecordInfoDefinition_type"), MODSPackage.eINSTANCE
					.getRecordInfoDefinition_Lang(), true, false, false,
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
			getString("_UI_RecordInfoDefinition_lang1_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_RecordInfoDefinition_lang1_feature",
					"_UI_RecordInfoDefinition_type"), MODSPackage.eINSTANCE
					.getRecordInfoDefinition_Lang1(), true, false, false,
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
			getString("_UI_RecordInfoDefinition_script_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_RecordInfoDefinition_script_feature",
					"_UI_RecordInfoDefinition_type"), MODSPackage.eINSTANCE
					.getRecordInfoDefinition_Script(), true, false, false,
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
			getString("_UI_RecordInfoDefinition_transliteration_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_RecordInfoDefinition_transliteration_feature",
					"_UI_RecordInfoDefinition_type"), MODSPackage.eINSTANCE
					.getRecordInfoDefinition_Transliteration(), true, false, false,
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
	    childrenFeatures.add(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group());
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
     * This returns RecordInfoDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/RecordInfoDefinition"));
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
	String label = ((RecordInfoDefinition) object).getAltRepGroup();
	return label == null || label.length() == 0 ? getString("_UI_RecordInfoDefinition_type")
			: getString("_UI_RecordInfoDefinition_type") + " " + label;
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

	switch (notification.getFeatureID(RecordInfoDefinition.class)) {
	case MODSPackage.RECORD_INFO_DEFINITION__ALT_REP_GROUP:
	case MODSPackage.RECORD_INFO_DEFINITION__DISPLAY_LABEL:
	case MODSPackage.RECORD_INFO_DEFINITION__LANG:
	case MODSPackage.RECORD_INFO_DEFINITION__LANG1:
	case MODSPackage.RECORD_INFO_DEFINITION__SCRIPT:
	case MODSPackage.RECORD_INFO_DEFINITION__TRANSLITERATION:
	    fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
	    return;
	case MODSPackage.RECORD_INFO_DEFINITION__GROUP:
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

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordContentSource(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordContentSource(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordContentSource(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordContentSource(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordContentSource(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors
			.add(createChildParameter(
					MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
					FeatureMapUtil.createEntry(
							MODSPackage.eINSTANCE
									.getRecordInfoDefinition_RecordContentSource(),
							MODSFactory.eINSTANCE
									.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordContentSource(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordContentSource(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordContentSource(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordContentSource(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordCreationDate(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordCreationDate(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordCreationDate(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordChangeDate(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordChangeDate(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordChangeDate(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordIdentifier(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getRecordInfoDefinition_LanguageOfCataloging(),
					MODSFactory.eINSTANCE.createLanguageDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors
			.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
					FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
							.getRecordInfoDefinition_RecordOrigin(), MODSFactory.eINSTANCE
							.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_DescriptionStandard(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_DescriptionStandard(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_DescriptionStandard(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_DescriptionStandard(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_DescriptionStandard(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors
			.add(createChildParameter(
					MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
					FeatureMapUtil.createEntry(
							MODSPackage.eINSTANCE
									.getRecordInfoDefinition_DescriptionStandard(),
							MODSFactory.eINSTANCE
									.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_DescriptionStandard(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_DescriptionStandard(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_DescriptionStandard(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRecordInfoDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRecordInfoDefinition_DescriptionStandard(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));
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

	boolean qualify = childFeature == MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordContentSource()
			|| childFeature == MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin()
			|| childFeature == MODSPackage.eINSTANCE.getRecordInfoDefinition_DescriptionStandard()
			|| childFeature == MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordCreationDate()
			|| childFeature == MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordChangeDate()
			|| childFeature == MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordIdentifier();

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
