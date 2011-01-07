/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.provider;

import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.NameBaseDefinition;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.NameBaseDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NameBaseDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NameBaseDefinitionItemProvider(AdapterFactory adapterFactory) {
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

	    addActuatePropertyDescriptor(object);
	    addArcrolePropertyDescriptor(object);
	    addAuthorityPropertyDescriptor(object);
	    addAuthorityURIPropertyDescriptor(object);
	    addDisplayLabelPropertyDescriptor(object);
	    addHrefPropertyDescriptor(object);
	    addIDPropertyDescriptor(object);
	    addLangPropertyDescriptor(object);
	    addLang1PropertyDescriptor(object);
	    addRole1PropertyDescriptor(object);
	    addScriptPropertyDescriptor(object);
	    addShowPropertyDescriptor(object);
	    addTitlePropertyDescriptor(object);
	    addTransliterationPropertyDescriptor(object);
	    addTypePropertyDescriptor(object);
	    addType1PropertyDescriptor(object);
	    addValueURIPropertyDescriptor(object);
	}
	return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Actuate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addActuatePropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_NameBaseDefinition_actuate_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_actuate_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_Actuate(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Arcrole feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addArcrolePropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_NameBaseDefinition_arcrole_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_arcrole_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_Arcrole(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			getString("_UI_NameBaseDefinition_authority_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_authority_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_Authority(), true, false, false,
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
			getString("_UI_NameBaseDefinition_authorityURI_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_authorityURI_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_AuthorityURI(), true, false, false,
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
			getString("_UI_NameBaseDefinition_displayLabel_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_displayLabel_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_DisplayLabel(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Href feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHrefPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_NameBaseDefinition_href_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_href_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_Href(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the ID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIDPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_NameBaseDefinition_iD_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_iD_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_ID(), true, false, false,
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
			getString("_UI_NameBaseDefinition_lang_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_lang_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_Lang(), true, false, false,
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
			getString("_UI_NameBaseDefinition_lang1_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_lang1_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_Lang1(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Role1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRole1PropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_NameBaseDefinition_role1_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_role1_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_Role1(), true, false, false,
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
			getString("_UI_NameBaseDefinition_script_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_script_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_Script(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Show feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShowPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_NameBaseDefinition_show_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_show_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_Show(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Title feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTitlePropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_NameBaseDefinition_title_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_title_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_Title(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Transliteration feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransliterationPropertyDescriptor(Object object) {
	itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
					((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
					getResourceLocator(),
					getString("_UI_NameBaseDefinition_transliteration_feature"),
					getString("_UI_PropertyDescriptor_description",
							"_UI_NameBaseDefinition_transliteration_feature",
							"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
							.getNameBaseDefinition_Transliteration(), true, false, false,
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
			getString("_UI_NameBaseDefinition_type_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_type_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_Type(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Type1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addType1PropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_NameBaseDefinition_type1_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_type1_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_Type1(), true, false, false,
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
			getString("_UI_NameBaseDefinition_valueURI_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_NameBaseDefinition_valueURI_feature",
					"_UI_NameBaseDefinition_type"), MODSPackage.eINSTANCE
					.getNameBaseDefinition_ValueURI(), true, false, false,
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
	    childrenFeatures.add(MODSPackage.eINSTANCE.getNameBaseDefinition_Group());
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
     * This returns NameBaseDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/NameBaseDefinition"));
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
	String label = ((NameBaseDefinition) object).getID();
	return label == null || label.length() == 0 ? getString("_UI_NameBaseDefinition_type")
			: getString("_UI_NameBaseDefinition_type") + " " + label;
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

	switch (notification.getFeatureID(NameBaseDefinition.class)) {
	case MODSPackage.NAME_BASE_DEFINITION__ACTUATE:
	case MODSPackage.NAME_BASE_DEFINITION__ARCROLE:
	case MODSPackage.NAME_BASE_DEFINITION__AUTHORITY:
	case MODSPackage.NAME_BASE_DEFINITION__AUTHORITY_URI:
	case MODSPackage.NAME_BASE_DEFINITION__DISPLAY_LABEL:
	case MODSPackage.NAME_BASE_DEFINITION__HREF:
	case MODSPackage.NAME_BASE_DEFINITION__ID:
	case MODSPackage.NAME_BASE_DEFINITION__LANG:
	case MODSPackage.NAME_BASE_DEFINITION__LANG1:
	case MODSPackage.NAME_BASE_DEFINITION__ROLE1:
	case MODSPackage.NAME_BASE_DEFINITION__SCRIPT:
	case MODSPackage.NAME_BASE_DEFINITION__SHOW:
	case MODSPackage.NAME_BASE_DEFINITION__TITLE:
	case MODSPackage.NAME_BASE_DEFINITION__TRANSLITERATION:
	case MODSPackage.NAME_BASE_DEFINITION__TYPE:
	case MODSPackage.NAME_BASE_DEFINITION__TYPE1:
	case MODSPackage.NAME_BASE_DEFINITION__VALUE_URI:
	    fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
	    return;
	case MODSPackage.NAME_BASE_DEFINITION__GROUP:
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

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_NamePart(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors
			.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
					FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
							.getNameBaseDefinition_DisplayForm(), MODSFactory.eINSTANCE
							.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_DisplayForm(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors
			.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
					FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
							.getNameBaseDefinition_Affiliation(), MODSFactory.eINSTANCE
							.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Affiliation(),
					MODSFactory.eINSTANCE.createTemporalDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Role(),
					MODSFactory.eINSTANCE.createRoleDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createXsString())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createStringPlusAuthority())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createDateBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createDateDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createDateOtherDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createLanguageTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createNamePartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createNoteBaseDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors
			.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
					FeatureMapUtil.createEntry(MODSPackage.eINSTANCE
							.getNameBaseDefinition_Description(), MODSFactory.eINSTANCE
							.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createPlaceTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createRoleTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createScriptTermDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createStringPlusSupplied())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getNameBaseDefinition_Group(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getNameBaseDefinition_Description(),
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
