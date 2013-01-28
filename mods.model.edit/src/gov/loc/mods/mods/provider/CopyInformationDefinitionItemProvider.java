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

import gov.loc.mods.mods.CopyInformationDefinition;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gov.loc.mods.mods.CopyInformationDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CopyInformationDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyInformationDefinitionItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(MODSPackage.eINSTANCE.getCopyInformationDefinition_Form());
			childrenFeatures.add(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation());
			childrenFeatures.add(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator());
			childrenFeatures.add(MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator());
			childrenFeatures.add(MODSPackage.eINSTANCE.getCopyInformationDefinition_Note());
			childrenFeatures.add(MODSPackage.eINSTANCE.getCopyInformationDefinition_EnumerationAndChronology());
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
	 * This returns CopyInformationDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CopyInformationDefinition"));
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
		return getString("_UI_CopyInformationDefinition_type");
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

		switch (notification.getFeatureID(CopyInformationDefinition.class)) {
			case MODSPackage.COPY_INFORMATION_DEFINITION__FORM:
			case MODSPackage.COPY_INFORMATION_DEFINITION__SUB_LOCATION:
			case MODSPackage.COPY_INFORMATION_DEFINITION__SHELF_LOCATOR:
			case MODSPackage.COPY_INFORMATION_DEFINITION__ELECTRONIC_LOCATOR:
			case MODSPackage.COPY_INFORMATION_DEFINITION__NOTE:
			case MODSPackage.COPY_INFORMATION_DEFINITION__ENUMERATION_AND_CHRONOLOGY:
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

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_Form(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_Form(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_Form(),
				MODSFactory.eINSTANCE.createGenreDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_Form(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_Form(),
				MODSFactory.eINSTANCE.createPhysicalLocationDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createXsString()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createUnstructuredTextDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createAbstractDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createStringPlusAuthority()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createClassificationDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createDateBaseDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createDateDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createDateOtherDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createGenreDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createGeographicCodeDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createIdentifierDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createLanguageTermDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createNamePartDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createNoteBaseDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createNoteDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createPhysicalLocationDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createPlaceTermDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createRecordIdentifierDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createRoleTermDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createScriptTermDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createStringPlusSupplied()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createTableOfContentsDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createTargetAudienceDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation(),
				MODSFactory.eINSTANCE.createTemporalDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createXsString()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createUnstructuredTextDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createAbstractDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createStringPlusAuthority()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createClassificationDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createDateBaseDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createDateDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createDateOtherDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createGenreDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createGeographicCodeDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createIdentifierDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createLanguageTermDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createNamePartDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createNoteBaseDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createNoteDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createPhysicalLocationDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createPlaceTermDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createRecordIdentifierDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createRoleTermDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createScriptTermDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createStringPlusSupplied()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createTableOfContentsDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createTargetAudienceDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator(),
				MODSFactory.eINSTANCE.createTemporalDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createXsString()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createUnstructuredTextDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createAbstractDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createStringPlusAuthority()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createClassificationDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createDateBaseDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createDateDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createDateOtherDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createGenreDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createGeographicCodeDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createIdentifierDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createLanguageTermDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createNamePartDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createNoteBaseDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createNoteDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createPhysicalLocationDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createPlaceTermDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createRecordIdentifierDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createRoleTermDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createScriptTermDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createStringPlusSupplied()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createTableOfContentsDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createTargetAudienceDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator(),
				MODSFactory.eINSTANCE.createTemporalDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_Note(),
				MODSFactory.eINSTANCE.createNoteBaseDefinition()));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getCopyInformationDefinition_Note(),
				MODSFactory.eINSTANCE.createNoteDefinition()));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getCopyInformationDefinition_EnumerationAndChronology(),
				MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition()));
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

		boolean qualify = childFeature == MODSPackage.eINSTANCE.getCopyInformationDefinition_Form()
				|| childFeature == MODSPackage.eINSTANCE.getCopyInformationDefinition_SubLocation()
				|| childFeature == MODSPackage.eINSTANCE.getCopyInformationDefinition_ShelfLocator()
				|| childFeature == MODSPackage.eINSTANCE.getCopyInformationDefinition_ElectronicLocator()
				|| childFeature == MODSPackage.eINSTANCE.getCopyInformationDefinition_EnumerationAndChronology()
				|| childFeature == MODSPackage.eINSTANCE.getCopyInformationDefinition_Note();

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
