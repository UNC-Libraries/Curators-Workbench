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
import gov.loc.mods.mods.ModsDefinition;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.ModsDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModsDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModsDefinitionItemProvider(AdapterFactory adapterFactory) {
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

	    addIDPropertyDescriptor(object);
	    addVersionPropertyDescriptor(object);
	}
	return itemPropertyDescriptors;
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
			getString("_UI_ModsDefinition_iD_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ModsDefinition_iD_feature",
					"_UI_ModsDefinition_type"), MODSPackage.eINSTANCE.getModsDefinition_ID(), true,
			false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVersionPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ModsDefinition_version_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ModsDefinition_version_feature",
					"_UI_ModsDefinition_type"), MODSPackage.eINSTANCE.getModsDefinition_Version(),
			true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
	    childrenFeatures.add(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup());
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
     * This returns ModsDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/ModsDefinition"));
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
	String label = ((ModsDefinition) object).getID();
	return label == null || label.length() == 0 ? getString("_UI_ModsDefinition_type")
			: getString("_UI_ModsDefinition_type") + " " + label;
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

	switch (notification.getFeatureID(ModsDefinition.class)) {
	case MODSPackage.MODS_DEFINITION__ID:
	case MODSPackage.MODS_DEFINITION__VERSION:
	    fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
	    return;
	case MODSPackage.MODS_DEFINITION__MODS_GROUP:
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

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_Abstract(),
					MODSFactory.eINSTANCE.createAbstractDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_AccessCondition(),
					MODSFactory.eINSTANCE.createAccessConditionDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_Classification(),
					MODSFactory.eINSTANCE.createClassificationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_Extension(),
					MODSFactory.eINSTANCE.createExtensionDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_Extension(),
					MODSFactory.eINSTANCE.createAccessConditionDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_Genre(),
					MODSFactory.eINSTANCE.createGenreDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_Identifier(),
					MODSFactory.eINSTANCE.createIdentifierDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_Language(),
					MODSFactory.eINSTANCE.createLanguageDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_Location(),
					MODSFactory.eINSTANCE.createLocationDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_Name(),
					MODSFactory.eINSTANCE.createNameDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_Note(),
					MODSFactory.eINSTANCE.createNoteDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_OriginInfo(),
					MODSFactory.eINSTANCE.createOriginInfoDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_Part(),
					MODSFactory.eINSTANCE.createPartDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_PhysicalDescription(),
					MODSFactory.eINSTANCE.createPhysicalDescriptionDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_RecordInfo(),
					MODSFactory.eINSTANCE.createRecordInfoDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_RelatedItem(),
					MODSFactory.eINSTANCE.createRelatedItemDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_Subject(),
					MODSFactory.eINSTANCE.createSubjectDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_TableOfContents(),
					MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_TargetAudience(),
					MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_TitleInfo(),
					MODSFactory.eINSTANCE.createTitleInfoDefinition())));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getModsDefinition_ModsGroup(),
			FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getModsDefinition_TypeOfResource(),
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

	boolean qualify = childFeature == MODSPackage.eINSTANCE.getModsDefinition_AccessCondition()
			|| childFeature == MODSPackage.eINSTANCE.getModsDefinition_Extension();

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
