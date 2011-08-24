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

import gov.loc.mods.mods.DigitalOriginDefinition;
import gov.loc.mods.mods.ExtensionDefinition;
import gov.loc.mods.mods.IssuanceDefinition;
import gov.loc.mods.mods.MODSFactory;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.ReformattingQualityDefinition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
 * This is the item provider adapter for a {@link gov.loc.mods.mods.ExtensionDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addDisplayLabelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				getString("_UI_ExtensionDefinition_displayLabel_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ExtensionDefinition_displayLabel_feature",
						"_UI_ExtensionDefinition_type"), MODSPackage.eINSTANCE.getExtensionDefinition_DisplayLabel(), true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed());
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
	 * This returns ExtensionDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExtensionDefinition"));
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
		String label = ((ExtensionDefinition) object).getDisplayLabel();
		return label == null || label.length() == 0 ? getString("_UI_ExtensionDefinition_type")
				: getString("_UI_ExtensionDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(ExtensionDefinition.class)) {
			case MODSPackage.EXTENSION_DEFINITION__DISPLAY_LABEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MODSPackage.EXTENSION_DEFINITION__MIXED:
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

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT, "")));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT, "")));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
						XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA, "")));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Abstract(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_AccessCondition(),
						MODSFactory.eINSTANCE.createAccessConditionDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Affiliation(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Area(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Caption(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Cartographics(),
						MODSFactory.eINSTANCE.createCartographicsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_City(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CitySection(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Classification(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Continent(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Coordinates(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CopyInformation(),
						MODSFactory.eINSTANCE.createCopyInformationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CopyrightDate(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CopyrightDate(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_CopyrightDate(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Country(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_County(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Date(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Date(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Date(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Date(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateCaptured(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateCaptured(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateCaptured(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateCreated(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateCreated(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateCreated(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateIssued(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateIssued(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateIssued(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateModified(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateModified(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateModified(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateOther(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateValid(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateValid(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DateValid(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Description(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DescriptionStandard(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DescriptionStandard(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DescriptionStandard(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DescriptionStandard(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DescriptionStandard(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DescriptionStandard(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DescriptionStandard(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DescriptionStandard(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DescriptionStandard(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DescriptionStandard(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Detail(),
						MODSFactory.eINSTANCE.createDetailDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DigitalOrigin(), DigitalOriginDefinition.BORN_DIGITAL)));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Edition(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_End(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_EnumerationAndChronology(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Extension(),
						MODSFactory.eINSTANCE.createExtensionDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Extension(),
						MODSFactory.eINSTANCE.createAccessConditionDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Extent(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Form(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Form(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Form(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Form(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Form(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Frequency(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Frequency(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Frequency(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Frequency(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Frequency(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Frequency(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Frequency(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Frequency(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Frequency(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Frequency(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Genre(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Geographic(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Geographic(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Geographic(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Geographic(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Geographic(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Geographic(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Geographic(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Geographic(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Geographic(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Geographic(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_GeographicCode(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_HierarchicalGeographic(),
						MODSFactory.eINSTANCE.createHierarchicalGeographicDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_HoldingExternal(),
						MODSFactory.eINSTANCE.createExtensionDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_HoldingExternal(),
						MODSFactory.eINSTANCE.createAccessConditionDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_HoldingSimple(),
						MODSFactory.eINSTANCE.createHoldingSimpleDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Identifier(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Island(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors
				.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil.createEntry(
						MODSPackage.eINSTANCE.getDocumentRoot_Issuance(), IssuanceDefinition.CONTINUING)));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Language(),
						MODSFactory.eINSTANCE.createLanguageDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_LanguageOfCataloging(),
						MODSFactory.eINSTANCE.createLanguageDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_LanguageTerm(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_List(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Location(),
						MODSFactory.eINSTANCE.createLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Mods(),
						MODSFactory.eINSTANCE.createModsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ModsCollection(),
						MODSFactory.eINSTANCE.createModsCollectionDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Name(),
						MODSFactory.eINSTANCE.createNameDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NamePart(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_NonSort(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Note(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Number(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Occupation(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Occupation(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Occupation(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Occupation(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Occupation(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Occupation(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Occupation(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Occupation(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Occupation(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Occupation(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_OriginInfo(),
						MODSFactory.eINSTANCE.createOriginInfoDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Part(),
						MODSFactory.eINSTANCE.createPartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartName(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PartNumber(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PhysicalDescription(),
						MODSFactory.eINSTANCE.createPhysicalDescriptionDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PhysicalLocation(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Place(),
						MODSFactory.eINSTANCE.createPlaceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_PlaceTerm(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Projection(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Province(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Publisher(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordChangeDate(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordChangeDate(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordChangeDate(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordContentSource(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordContentSource(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordContentSource(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordContentSource(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordContentSource(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordContentSource(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordContentSource(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordContentSource(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordContentSource(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordContentSource(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordCreationDate(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordCreationDate(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordCreationDate(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordIdentifier(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordInfo(),
						MODSFactory.eINSTANCE.createRecordInfoDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(), FeatureMapUtil
				.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ReformattingQuality(),
						ReformattingQualityDefinition.ACCESS)));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Region(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RelatedItem(),
						MODSFactory.eINSTANCE.createRelatedItemDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Role(),
						MODSFactory.eINSTANCE.createRoleDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_RoleTerm(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Scale(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ScriptTerm(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Start(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_State(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Subject(),
						MODSFactory.eINSTANCE.createSubjectDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubLocation(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_SubTitle(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_TableOfContents(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_TargetAudience(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Temporal(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Territory(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Text(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Text(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Text(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Text(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Text(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createXsString())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createUnstructuredTextDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createAbstractDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createDateBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createDateDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createDateOtherDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createEnumerationAndChronologyDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createGeographicCodeDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createLanguageTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createNamePartDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createNoteBaseDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createNoteDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createPlaceTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createRecordIdentifierDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createStringPlusSupplied())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createTableOfContentsDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Title(),
						MODSFactory.eINSTANCE.createTemporalDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_TitleInfo(),
						MODSFactory.eINSTANCE.createTitleInfoDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Topic(),
						MODSFactory.eINSTANCE.createStringPlusAuthority())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Topic(),
						MODSFactory.eINSTANCE.createClassificationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Topic(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusType())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Topic(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabel())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Topic(),
						MODSFactory.eINSTANCE.createGenreDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Topic(),
						MODSFactory.eINSTANCE.createStringPlusAuthorityPlusTypePlusDisplayLabelPlusXlink())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Topic(),
						MODSFactory.eINSTANCE.createPhysicalLocationDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Topic(),
						MODSFactory.eINSTANCE.createRoleTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Topic(),
						MODSFactory.eINSTANCE.createScriptTermDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Topic(),
						MODSFactory.eINSTANCE.createTargetAudienceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Total(),
						XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, "0"))));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_TypeOfResource(),
						MODSFactory.eINSTANCE.createTypeOfResourceDefinition())));

		newChildDescriptors.add(createChildParameter(
				MODSPackage.eINSTANCE.getExtensionDefinition_Mixed(),
				FeatureMapUtil.createEntry(MODSPackage.eINSTANCE.getDocumentRoot_Url(),
						MODSFactory.eINSTANCE.createUrlDefinition())));
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature) childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry) childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify = childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Abstract()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Affiliation()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Area()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Caption()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_City()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_CitySection()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Continent()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Coordinates()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Country()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_County()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Description()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_DisplayForm()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_ElectronicLocator()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_End()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_ExtraterrestrialArea()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_InternetMediaType()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Island()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_List()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_NonSort()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Number()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_PartName()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_PartNumber()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Projection()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Province()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_RecordOrigin()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Region()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Scale()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_ShelfLocator()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Start()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_State()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_SubLocation()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_SubTitle()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Territory()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Text()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Title()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_AccessCondition()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Extension()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_HoldingExternal()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_DescriptionStandard()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Frequency()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Geographic()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Occupation()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_RecordContentSource()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Topic()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Classification()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Date()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_CopyrightDate()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_DateCaptured()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_DateCreated()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_DateIssued()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_DateModified()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_DateValid()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_RecordChangeDate()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_RecordCreationDate()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_DateOther()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_EnumerationAndChronology()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Form()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Genre()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_GeographicCode()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Identifier()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_LanguageTerm()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_NamePart()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Note()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_PhysicalLocation()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_PlaceTerm()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_RecordIdentifier()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_RoleTerm()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_ScriptTerm()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Edition()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Extent()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Publisher()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_TableOfContents()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_TargetAudience()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Temporal()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_Language()
				|| childFeature == MODSPackage.eINSTANCE.getDocumentRoot_LanguageOfCataloging();

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
