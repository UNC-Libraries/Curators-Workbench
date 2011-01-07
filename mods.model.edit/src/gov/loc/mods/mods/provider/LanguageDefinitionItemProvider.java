/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.provider;

import gov.loc.mods.mods.LanguageDefinition;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.LanguageDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LanguageDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LanguageDefinitionItemProvider(AdapterFactory adapterFactory) {
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
	    addObjectPartPropertyDescriptor(object);
	    addScriptPropertyDescriptor(object);
	    addTransliterationPropertyDescriptor(object);
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
			getString("_UI_LanguageDefinition_altRepGroup_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_LanguageDefinition_altRepGroup_feature",
					"_UI_LanguageDefinition_type"), MODSPackage.eINSTANCE
					.getLanguageDefinition_AltRepGroup(), true, false, false,
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
			getString("_UI_LanguageDefinition_displayLabel_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_LanguageDefinition_displayLabel_feature",
					"_UI_LanguageDefinition_type"), MODSPackage.eINSTANCE
					.getLanguageDefinition_DisplayLabel(), true, false, false,
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
			getString("_UI_LanguageDefinition_lang_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_LanguageDefinition_lang_feature",
					"_UI_LanguageDefinition_type"), MODSPackage.eINSTANCE
					.getLanguageDefinition_Lang(), true, false, false,
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
			getString("_UI_LanguageDefinition_lang1_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_LanguageDefinition_lang1_feature",
					"_UI_LanguageDefinition_type"), MODSPackage.eINSTANCE
					.getLanguageDefinition_Lang1(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Object Part feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addObjectPartPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_LanguageDefinition_objectPart_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_LanguageDefinition_objectPart_feature",
					"_UI_LanguageDefinition_type"), MODSPackage.eINSTANCE
					.getLanguageDefinition_ObjectPart(), true, false, false,
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
			getString("_UI_LanguageDefinition_script_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_LanguageDefinition_script_feature",
					"_UI_LanguageDefinition_type"), MODSPackage.eINSTANCE
					.getLanguageDefinition_Script(), true, false, false,
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
					getString("_UI_LanguageDefinition_transliteration_feature"),
					getString("_UI_PropertyDescriptor_description",
							"_UI_LanguageDefinition_transliteration_feature",
							"_UI_LanguageDefinition_type"), MODSPackage.eINSTANCE
							.getLanguageDefinition_Transliteration(), true, false, false,
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
			getString("_UI_LanguageDefinition_usage_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_LanguageDefinition_usage_feature",
					"_UI_LanguageDefinition_type"), MODSPackage.eINSTANCE
					.getLanguageDefinition_Usage(), true, false, false,
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
	    childrenFeatures.add(MODSPackage.eINSTANCE.getLanguageDefinition_LanguageTerm());
	    childrenFeatures.add(MODSPackage.eINSTANCE.getLanguageDefinition_ScriptTerm());
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
     * This returns LanguageDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/LanguageDefinition"));
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
	String label = ((LanguageDefinition) object).getAltRepGroup();
	return label == null || label.length() == 0 ? getString("_UI_LanguageDefinition_type")
			: getString("_UI_LanguageDefinition_type") + " " + label;
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

	switch (notification.getFeatureID(LanguageDefinition.class)) {
	case MODSPackage.LANGUAGE_DEFINITION__ALT_REP_GROUP:
	case MODSPackage.LANGUAGE_DEFINITION__DISPLAY_LABEL:
	case MODSPackage.LANGUAGE_DEFINITION__LANG:
	case MODSPackage.LANGUAGE_DEFINITION__LANG1:
	case MODSPackage.LANGUAGE_DEFINITION__OBJECT_PART:
	case MODSPackage.LANGUAGE_DEFINITION__SCRIPT:
	case MODSPackage.LANGUAGE_DEFINITION__TRANSLITERATION:
	case MODSPackage.LANGUAGE_DEFINITION__USAGE:
	    fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__LANGUAGE_TERM:
	case MODSPackage.LANGUAGE_DEFINITION__SCRIPT_TERM:
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

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLanguageDefinition_LanguageTerm(),
			MODSFactory.eINSTANCE.createLanguageTermDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getLanguageDefinition_ScriptTerm(),
			MODSFactory.eINSTANCE.createScriptTermDefinition()));
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
