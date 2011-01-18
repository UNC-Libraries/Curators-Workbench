/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gov.loc.mods.mods.provider;

import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.RelatedItemDefinition;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.RelatedItemDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelatedItemDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelatedItemDefinitionItemProvider(AdapterFactory adapterFactory) {
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
	    addDisplayLabelPropertyDescriptor(object);
	    addHrefPropertyDescriptor(object);
	    addIDPropertyDescriptor(object);
	    addRolePropertyDescriptor(object);
	    addShowPropertyDescriptor(object);
	    addTitlePropertyDescriptor(object);
	    addTypePropertyDescriptor(object);
	    addType1PropertyDescriptor(object);
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
			getString("_UI_RelatedItemDefinition_actuate_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_RelatedItemDefinition_actuate_feature",
					"_UI_RelatedItemDefinition_type"), MODSPackage.eINSTANCE
					.getRelatedItemDefinition_Actuate(), true, false, false,
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
			getString("_UI_RelatedItemDefinition_arcrole_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_RelatedItemDefinition_arcrole_feature",
					"_UI_RelatedItemDefinition_type"), MODSPackage.eINSTANCE
					.getRelatedItemDefinition_Arcrole(), true, false, false,
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
			getString("_UI_RelatedItemDefinition_displayLabel_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_RelatedItemDefinition_displayLabel_feature",
					"_UI_RelatedItemDefinition_type"), MODSPackage.eINSTANCE
					.getRelatedItemDefinition_DisplayLabel(), true, false, false,
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
			getString("_UI_RelatedItemDefinition_href_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_RelatedItemDefinition_href_feature",
					"_UI_RelatedItemDefinition_type"), MODSPackage.eINSTANCE
					.getRelatedItemDefinition_Href(), true, false, false,
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
			getString("_UI_RelatedItemDefinition_iD_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_RelatedItemDefinition_iD_feature",
					"_UI_RelatedItemDefinition_type"), MODSPackage.eINSTANCE
					.getRelatedItemDefinition_ID(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Role feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRolePropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_RelatedItemDefinition_role_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_RelatedItemDefinition_role_feature",
					"_UI_RelatedItemDefinition_type"), MODSPackage.eINSTANCE
					.getRelatedItemDefinition_Role(), true, false, false,
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
			getString("_UI_RelatedItemDefinition_show_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_RelatedItemDefinition_show_feature",
					"_UI_RelatedItemDefinition_type"), MODSPackage.eINSTANCE
					.getRelatedItemDefinition_Show(), true, false, false,
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
			getString("_UI_RelatedItemDefinition_title_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_RelatedItemDefinition_title_feature",
					"_UI_RelatedItemDefinition_type"), MODSPackage.eINSTANCE
					.getRelatedItemDefinition_Title(), true, false, false,
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
			getString("_UI_RelatedItemDefinition_type_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_RelatedItemDefinition_type_feature",
					"_UI_RelatedItemDefinition_type"), MODSPackage.eINSTANCE
					.getRelatedItemDefinition_Type(), true, false, false,
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
			getString("_UI_RelatedItemDefinition_type1_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_RelatedItemDefinition_type1_feature",
					"_UI_RelatedItemDefinition_type"), MODSPackage.eINSTANCE
					.getRelatedItemDefinition_Type1(), true, false, false,
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
	    childrenFeatures.add(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup());
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
     * This returns RelatedItemDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/RelatedItemDefinition"));
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
	String label = ((RelatedItemDefinition) object).getID();
	return label == null || label.length() == 0 ? getString("_UI_RelatedItemDefinition_type")
			: getString("_UI_RelatedItemDefinition_type") + " " + label;
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

	switch (notification.getFeatureID(RelatedItemDefinition.class)) {
	case MODSPackage.RELATED_ITEM_DEFINITION__ACTUATE:
	case MODSPackage.RELATED_ITEM_DEFINITION__ARCROLE:
	case MODSPackage.RELATED_ITEM_DEFINITION__DISPLAY_LABEL:
	case MODSPackage.RELATED_ITEM_DEFINITION__HREF:
	case MODSPackage.RELATED_ITEM_DEFINITION__ID:
	case MODSPackage.RELATED_ITEM_DEFINITION__ROLE:
	case MODSPackage.RELATED_ITEM_DEFINITION__SHOW:
	case MODSPackage.RELATED_ITEM_DEFINITION__TITLE:
	case MODSPackage.RELATED_ITEM_DEFINITION__TYPE:
	case MODSPackage.RELATED_ITEM_DEFINITION__TYPE1:
	    fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
	    return;
	case MODSPackage.RELATED_ITEM_DEFINITION__MODS_GROUP:
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

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_Abstract(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_AccessCondition(),
					MODSFactory.eINSTANCE.createAccessConditionDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_Classification(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_Extension(),
					MODSFactory.eINSTANCE.createExtensionDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_Extension(),
					MODSFactory.eINSTANCE.createAccessConditionDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_Genre(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_Identifier(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_Language(),
					MODSFactory.eINSTANCE.createLanguageDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_Location(),
					MODSFactory.eINSTANCE.createLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_Name(),
					MODSFactory.eINSTANCE.createNameDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_Note(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_OriginInfo(),
					MODSFactory.eINSTANCE.createOriginInfoDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_Part(),
					MODSFactory.eINSTANCE.createPartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(
					MODSPackage.eINSTANCE.getRelatedItemDefinition_PhysicalDescription(),
					MODSFactory.eINSTANCE.createPhysicalDescriptionDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_RecordInfo(),
					MODSFactory.eINSTANCE.createRecordInfoDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_RelatedItem(),
					MODSFactory.eINSTANCE.createRelatedItemDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_Subject(),
					MODSFactory.eINSTANCE.createSubjectDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_TableOfContents(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_TargetAudience(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_TitleInfo(),
					MODSFactory.eINSTANCE.createTitleInfoDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getRelatedItemDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getRelatedItemDefinition_TypeOfResource(),
					MODSFactory.eINSTANCE.createTypeOfResourceDefinition())));
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

	boolean qualify = childFeature == MODSPackage.eINSTANCE.getRelatedItemDefinition_AccessCondition()
			|| childFeature == MODSPackage.eINSTANCE.getRelatedItemDefinition_Extension();

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
