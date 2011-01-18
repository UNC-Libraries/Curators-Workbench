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

import gov.loc.mods.mods.ExtentDefinition;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;

import java.math.BigInteger;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.ExtentDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtentDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtentDefinitionItemProvider(AdapterFactory adapterFactory) {
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

	    addTotalPropertyDescriptor(object);
	    addUnitPropertyDescriptor(object);
	}
	return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Total feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTotalPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ExtentDefinition_total_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ExtentDefinition_total_feature",
					"_UI_ExtentDefinition_type"),
			MODSPackage.eINSTANCE.getExtentDefinition_Total(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnitPropertyDescriptor(Object object) {
	itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ExtentDefinition_unit_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ExtentDefinition_unit_feature",
					"_UI_ExtentDefinition_type"), MODSPackage.eINSTANCE.getExtentDefinition_Unit(),
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
	    childrenFeatures.add(MODSPackage.eINSTANCE.getExtentDefinition_Start());
	    childrenFeatures.add(MODSPackage.eINSTANCE.getExtentDefinition_End());
	    childrenFeatures.add(MODSPackage.eINSTANCE.getExtentDefinition_List());
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
     * This returns ExtentDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/ExtentDefinition"));
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
	BigInteger labelValue = ((ExtentDefinition) object).getTotal();
	String label = labelValue == null ? null : labelValue.toString();
	return label == null || label.length() == 0 ? getString("_UI_ExtentDefinition_type")
			: getString("_UI_ExtentDefinition_type") + " " + label;
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

	switch (notification.getFeatureID(ExtentDefinition.class)) {
	case MODSPackage.EXTENT_DEFINITION__TOTAL:
	case MODSPackage.EXTENT_DEFINITION__UNIT:
	    fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
	    return;
	case MODSPackage.EXTENT_DEFINITION__START:
	case MODSPackage.EXTENT_DEFINITION__END:
	case MODSPackage.EXTENT_DEFINITION__LIST:
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

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createXsString()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createUnstructuredTextDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createAbstractDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createStringPlusAuthority()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createClassificationDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createDateBaseDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createDateDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createDateOtherDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createGenreDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createGeographicCodeDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createIdentifierDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createLanguageTermDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createNamePartDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createNoteBaseDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createNoteDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createPhysicalLocationDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createPlaceTermDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createRecordIdentifierDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createRoleTermDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createScriptTermDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createStringPlusSupplied()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createTableOfContentsDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createTargetAudienceDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_Start(),
			MODSFactory.eINSTANCE.createTemporalDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createXsString()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createUnstructuredTextDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createAbstractDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createStringPlusAuthority()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createClassificationDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createDateBaseDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createDateDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createDateOtherDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createGenreDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createGeographicCodeDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createIdentifierDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createLanguageTermDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createNamePartDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createNoteBaseDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createNoteDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createPhysicalLocationDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createPlaceTermDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createRecordIdentifierDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createRoleTermDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createScriptTermDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createStringPlusSupplied()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createTableOfContentsDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createTargetAudienceDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_End(),
			MODSFactory.eINSTANCE.createTemporalDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createXsString()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createUnstructuredTextDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createAbstractDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createStringPlusAuthority()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createClassificationDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createDateBaseDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createDateDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createDateOtherDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createGenreDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createGeographicCodeDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createIdentifierDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createLanguageTermDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createNamePartDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createNoteBaseDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createNoteDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createPhysicalLocationDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createPlaceTermDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createRecordIdentifierDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createRoleTermDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createScriptTermDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createStringPlusSupplied()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createTableOfContentsDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createTargetAudienceDefinition()));

	newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtentDefinition_List(),
			MODSFactory.eINSTANCE.createTemporalDefinition()));
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

	boolean qualify = childFeature == MODSPackage.eINSTANCE.getExtentDefinition_Start()
			|| childFeature == MODSPackage.eINSTANCE.getExtentDefinition_End()
			|| childFeature == MODSPackage.eINSTANCE.getExtentDefinition_List();

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
