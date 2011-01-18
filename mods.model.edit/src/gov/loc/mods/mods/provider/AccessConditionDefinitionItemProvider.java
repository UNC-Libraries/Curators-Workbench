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

import gov.loc.mods.mods.AccessConditionDefinition;
import gov.loc.mods.mods.MODSPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gov.loc.mods.mods.AccessConditionDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessConditionDefinitionItemProvider extends ExtensionDefinitionItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessConditionDefinitionItemProvider(AdapterFactory adapterFactory) {
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
	    addAltRepGroupPropertyDescriptor(object);
	    addArcrolePropertyDescriptor(object);
	    addHrefPropertyDescriptor(object);
	    addLangPropertyDescriptor(object);
	    addLang1PropertyDescriptor(object);
	    addRolePropertyDescriptor(object);
	    addScriptPropertyDescriptor(object);
	    addShowPropertyDescriptor(object);
	    addTitlePropertyDescriptor(object);
	    addTransliterationPropertyDescriptor(object);
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
			getString("_UI_AccessConditionDefinition_actuate_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_AccessConditionDefinition_actuate_feature",
					"_UI_AccessConditionDefinition_type"), MODSPackage.eINSTANCE
					.getAccessConditionDefinition_Actuate(), true, false, false,
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
			getString("_UI_AccessConditionDefinition_altRepGroup_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_AccessConditionDefinition_altRepGroup_feature",
					"_UI_AccessConditionDefinition_type"), MODSPackage.eINSTANCE
					.getAccessConditionDefinition_AltRepGroup(), true, false, false,
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
			getString("_UI_AccessConditionDefinition_arcrole_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_AccessConditionDefinition_arcrole_feature",
					"_UI_AccessConditionDefinition_type"), MODSPackage.eINSTANCE
					.getAccessConditionDefinition_Arcrole(), true, false, false,
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
			getString("_UI_AccessConditionDefinition_href_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AccessConditionDefinition_href_feature",
					"_UI_AccessConditionDefinition_type"), MODSPackage.eINSTANCE
					.getAccessConditionDefinition_Href(), true, false, false,
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
			getString("_UI_AccessConditionDefinition_lang_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AccessConditionDefinition_lang_feature",
					"_UI_AccessConditionDefinition_type"), MODSPackage.eINSTANCE
					.getAccessConditionDefinition_Lang(), true, false, false,
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
			getString("_UI_AccessConditionDefinition_lang1_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AccessConditionDefinition_lang1_feature",
					"_UI_AccessConditionDefinition_type"), MODSPackage.eINSTANCE
					.getAccessConditionDefinition_Lang1(), true, false, false,
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
			getString("_UI_AccessConditionDefinition_role_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AccessConditionDefinition_role_feature",
					"_UI_AccessConditionDefinition_type"), MODSPackage.eINSTANCE
					.getAccessConditionDefinition_Role(), true, false, false,
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
			getString("_UI_AccessConditionDefinition_script_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AccessConditionDefinition_script_feature",
					"_UI_AccessConditionDefinition_type"), MODSPackage.eINSTANCE
					.getAccessConditionDefinition_Script(), true, false, false,
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
			getString("_UI_AccessConditionDefinition_show_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AccessConditionDefinition_show_feature",
					"_UI_AccessConditionDefinition_type"), MODSPackage.eINSTANCE
					.getAccessConditionDefinition_Show(), true, false, false,
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
			getString("_UI_AccessConditionDefinition_title_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AccessConditionDefinition_title_feature",
					"_UI_AccessConditionDefinition_type"), MODSPackage.eINSTANCE
					.getAccessConditionDefinition_Title(), true, false, false,
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
			getString("_UI_AccessConditionDefinition_transliteration_feature"),
			getString("_UI_PropertyDescriptor_description",
					"_UI_AccessConditionDefinition_transliteration_feature",
					"_UI_AccessConditionDefinition_type"), MODSPackage.eINSTANCE
					.getAccessConditionDefinition_Transliteration(), true, false, false,
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
			getString("_UI_AccessConditionDefinition_type_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AccessConditionDefinition_type_feature",
					"_UI_AccessConditionDefinition_type"), MODSPackage.eINSTANCE
					.getAccessConditionDefinition_Type(), true, false, false,
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
			getString("_UI_AccessConditionDefinition_type1_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AccessConditionDefinition_type1_feature",
					"_UI_AccessConditionDefinition_type"), MODSPackage.eINSTANCE
					.getAccessConditionDefinition_Type1(), true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns AccessConditionDefinition.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
	return overlayImage(object, getResourceLocator().getImage("full/obj16/AccessConditionDefinition"));
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
	String label = ((AccessConditionDefinition) object).getDisplayLabel();
	return label == null || label.length() == 0 ? getString("_UI_AccessConditionDefinition_type")
			: getString("_UI_AccessConditionDefinition_type") + " " + label;
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

	switch (notification.getFeatureID(AccessConditionDefinition.class)) {
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ACTUATE:
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ALT_REP_GROUP:
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ARCROLE:
	case MODSPackage.ACCESS_CONDITION_DEFINITION__HREF:
	case MODSPackage.ACCESS_CONDITION_DEFINITION__LANG:
	case MODSPackage.ACCESS_CONDITION_DEFINITION__LANG1:
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ROLE:
	case MODSPackage.ACCESS_CONDITION_DEFINITION__SCRIPT:
	case MODSPackage.ACCESS_CONDITION_DEFINITION__SHOW:
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TITLE:
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TRANSLITERATION:
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TYPE:
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TYPE1:
	    fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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

}
