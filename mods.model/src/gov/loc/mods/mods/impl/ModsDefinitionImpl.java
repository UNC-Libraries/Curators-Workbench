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
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.AbstractDefinition;
import gov.loc.mods.mods.AccessConditionDefinition;
import gov.loc.mods.mods.ClassificationDefinition;
import gov.loc.mods.mods.ExtensionDefinition;
import gov.loc.mods.mods.GenreDefinition;
import gov.loc.mods.mods.IdentifierDefinition;
import gov.loc.mods.mods.LanguageDefinition;
import gov.loc.mods.mods.LocationDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.ModsDefinition;
import gov.loc.mods.mods.ModsVersionAttributeDefinition;
import gov.loc.mods.mods.NameDefinition;
import gov.loc.mods.mods.NoteDefinition;
import gov.loc.mods.mods.OriginInfoDefinition;
import gov.loc.mods.mods.PartDefinition;
import gov.loc.mods.mods.PhysicalDescriptionDefinition;
import gov.loc.mods.mods.RecordInfoDefinition;
import gov.loc.mods.mods.RelatedItemDefinition;
import gov.loc.mods.mods.SubjectDefinition;
import gov.loc.mods.mods.TableOfContentsDefinition;
import gov.loc.mods.mods.TargetAudienceDefinition;
import gov.loc.mods.mods.TitleInfoDefinition;
import gov.loc.mods.mods.TypeOfResourceDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mods Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getModsGroup <em>Mods Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getAccessCondition <em>Access Condition</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getGenre <em>Genre</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getOriginInfo <em>Origin Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getPart <em>Part</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getPhysicalDescription <em>Physical Description</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getRecordInfo <em>Record Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getRelatedItem <em>Related Item</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getTableOfContents <em>Table Of Contents</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getTargetAudience <em>Target Audience</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getTitleInfo <em>Title Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getTypeOfResource <em>Type Of Resource</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ModsDefinitionImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModsDefinitionImpl extends EObjectImpl implements ModsDefinition {
    /**
     * The cached value of the '{@link #getModsGroup() <em>Mods Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModsGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap modsGroup;

    /**
     * The default value of the '{@link #getID() <em>ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getID()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getID()
     * @generated
     * @ordered
     */
    protected String iD = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final ModsVersionAttributeDefinition VERSION_EDEFAULT = ModsVersionAttributeDefinition._34;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected ModsVersionAttributeDefinition version = VERSION_EDEFAULT;

    /**
     * This is true if the Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean versionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModsDefinitionImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return MODSPackage.eINSTANCE.getModsDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getModsGroup() {
	if (modsGroup == null) {
	    modsGroup = new BasicFeatureMap(this, MODSPackage.MODS_DEFINITION__MODS_GROUP);
	}
	return modsGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractDefinition> getAbstract() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_Abstract());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AccessConditionDefinition> getAccessCondition() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_AccessCondition());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ClassificationDefinition> getClassification() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_Classification());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ExtensionDefinition> getExtension() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_Extension());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GenreDefinition> getGenre() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_Genre());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentifierDefinition> getIdentifier() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_Identifier());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LanguageDefinition> getLanguage() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_Language());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LocationDefinition> getLocation() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_Location());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NameDefinition> getName() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_Name());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NoteDefinition> getNote() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_Note());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OriginInfoDefinition> getOriginInfo() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_OriginInfo());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PartDefinition> getPart() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_Part());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PhysicalDescriptionDefinition> getPhysicalDescription() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_PhysicalDescription());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RecordInfoDefinition> getRecordInfo() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_RecordInfo());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RelatedItemDefinition> getRelatedItem() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_RelatedItem());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SubjectDefinition> getSubject() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_Subject());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TableOfContentsDefinition> getTableOfContents() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_TableOfContents());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TargetAudienceDefinition> getTargetAudience() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_TargetAudience());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TitleInfoDefinition> getTitleInfo() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_TitleInfo());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TypeOfResourceDefinition> getTypeOfResource() {
	return getModsGroup().list(MODSPackage.eINSTANCE.getModsDefinition_TypeOfResource());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getID() {
	return iD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setID(String newID) {
	String oldID = iD;
	iD = newID;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.MODS_DEFINITION__ID, oldID, iD));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModsVersionAttributeDefinition getVersion() {
	return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(ModsVersionAttributeDefinition newVersion) {
	ModsVersionAttributeDefinition oldVersion = version;
	version = newVersion == null ? VERSION_EDEFAULT : newVersion;
	boolean oldVersionESet = versionESet;
	versionESet = true;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.MODS_DEFINITION__VERSION, oldVersion,
			    version, !oldVersionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVersion() {
	ModsVersionAttributeDefinition oldVersion = version;
	boolean oldVersionESet = versionESet;
	version = VERSION_EDEFAULT;
	versionESet = false;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.MODS_DEFINITION__VERSION, oldVersion,
			    VERSION_EDEFAULT, oldVersionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVersion() {
	return versionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
	switch (featureID) {
	case MODSPackage.MODS_DEFINITION__MODS_GROUP:
	    return ((InternalEList<?>) getModsGroup()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__ABSTRACT:
	    return ((InternalEList<?>) getAbstract()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__ACCESS_CONDITION:
	    return ((InternalEList<?>) getAccessCondition()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__CLASSIFICATION:
	    return ((InternalEList<?>) getClassification()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__EXTENSION:
	    return ((InternalEList<?>) getExtension()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__GENRE:
	    return ((InternalEList<?>) getGenre()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__IDENTIFIER:
	    return ((InternalEList<?>) getIdentifier()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__LANGUAGE:
	    return ((InternalEList<?>) getLanguage()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__LOCATION:
	    return ((InternalEList<?>) getLocation()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__NAME:
	    return ((InternalEList<?>) getName()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__NOTE:
	    return ((InternalEList<?>) getNote()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__ORIGIN_INFO:
	    return ((InternalEList<?>) getOriginInfo()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__PART:
	    return ((InternalEList<?>) getPart()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__PHYSICAL_DESCRIPTION:
	    return ((InternalEList<?>) getPhysicalDescription()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__RECORD_INFO:
	    return ((InternalEList<?>) getRecordInfo()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__RELATED_ITEM:
	    return ((InternalEList<?>) getRelatedItem()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__SUBJECT:
	    return ((InternalEList<?>) getSubject()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__TABLE_OF_CONTENTS:
	    return ((InternalEList<?>) getTableOfContents()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__TARGET_AUDIENCE:
	    return ((InternalEList<?>) getTargetAudience()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__TITLE_INFO:
	    return ((InternalEList<?>) getTitleInfo()).basicRemove(otherEnd, msgs);
	case MODSPackage.MODS_DEFINITION__TYPE_OF_RESOURCE:
	    return ((InternalEList<?>) getTypeOfResource()).basicRemove(otherEnd, msgs);
	}
	return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case MODSPackage.MODS_DEFINITION__MODS_GROUP:
	    if (coreType)
		return getModsGroup();
	    return ((FeatureMap.Internal) getModsGroup()).getWrapper();
	case MODSPackage.MODS_DEFINITION__ABSTRACT:
	    return getAbstract();
	case MODSPackage.MODS_DEFINITION__ACCESS_CONDITION:
	    return getAccessCondition();
	case MODSPackage.MODS_DEFINITION__CLASSIFICATION:
	    return getClassification();
	case MODSPackage.MODS_DEFINITION__EXTENSION:
	    return getExtension();
	case MODSPackage.MODS_DEFINITION__GENRE:
	    return getGenre();
	case MODSPackage.MODS_DEFINITION__IDENTIFIER:
	    return getIdentifier();
	case MODSPackage.MODS_DEFINITION__LANGUAGE:
	    return getLanguage();
	case MODSPackage.MODS_DEFINITION__LOCATION:
	    return getLocation();
	case MODSPackage.MODS_DEFINITION__NAME:
	    return getName();
	case MODSPackage.MODS_DEFINITION__NOTE:
	    return getNote();
	case MODSPackage.MODS_DEFINITION__ORIGIN_INFO:
	    return getOriginInfo();
	case MODSPackage.MODS_DEFINITION__PART:
	    return getPart();
	case MODSPackage.MODS_DEFINITION__PHYSICAL_DESCRIPTION:
	    return getPhysicalDescription();
	case MODSPackage.MODS_DEFINITION__RECORD_INFO:
	    return getRecordInfo();
	case MODSPackage.MODS_DEFINITION__RELATED_ITEM:
	    return getRelatedItem();
	case MODSPackage.MODS_DEFINITION__SUBJECT:
	    return getSubject();
	case MODSPackage.MODS_DEFINITION__TABLE_OF_CONTENTS:
	    return getTableOfContents();
	case MODSPackage.MODS_DEFINITION__TARGET_AUDIENCE:
	    return getTargetAudience();
	case MODSPackage.MODS_DEFINITION__TITLE_INFO:
	    return getTitleInfo();
	case MODSPackage.MODS_DEFINITION__TYPE_OF_RESOURCE:
	    return getTypeOfResource();
	case MODSPackage.MODS_DEFINITION__ID:
	    return getID();
	case MODSPackage.MODS_DEFINITION__VERSION:
	    return getVersion();
	}
	return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
	switch (featureID) {
	case MODSPackage.MODS_DEFINITION__MODS_GROUP:
	    ((FeatureMap.Internal) getModsGroup()).set(newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__ABSTRACT:
	    getAbstract().clear();
	    getAbstract().addAll((Collection<? extends AbstractDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__ACCESS_CONDITION:
	    getAccessCondition().clear();
	    getAccessCondition().addAll((Collection<? extends AccessConditionDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__CLASSIFICATION:
	    getClassification().clear();
	    getClassification().addAll((Collection<? extends ClassificationDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__EXTENSION:
	    getExtension().clear();
	    getExtension().addAll((Collection<? extends ExtensionDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__GENRE:
	    getGenre().clear();
	    getGenre().addAll((Collection<? extends GenreDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__IDENTIFIER:
	    getIdentifier().clear();
	    getIdentifier().addAll((Collection<? extends IdentifierDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__LANGUAGE:
	    getLanguage().clear();
	    getLanguage().addAll((Collection<? extends LanguageDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__LOCATION:
	    getLocation().clear();
	    getLocation().addAll((Collection<? extends LocationDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__NAME:
	    getName().clear();
	    getName().addAll((Collection<? extends NameDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__NOTE:
	    getNote().clear();
	    getNote().addAll((Collection<? extends NoteDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__ORIGIN_INFO:
	    getOriginInfo().clear();
	    getOriginInfo().addAll((Collection<? extends OriginInfoDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__PART:
	    getPart().clear();
	    getPart().addAll((Collection<? extends PartDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__PHYSICAL_DESCRIPTION:
	    getPhysicalDescription().clear();
	    getPhysicalDescription().addAll((Collection<? extends PhysicalDescriptionDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__RECORD_INFO:
	    getRecordInfo().clear();
	    getRecordInfo().addAll((Collection<? extends RecordInfoDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__RELATED_ITEM:
	    getRelatedItem().clear();
	    getRelatedItem().addAll((Collection<? extends RelatedItemDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__SUBJECT:
	    getSubject().clear();
	    getSubject().addAll((Collection<? extends SubjectDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__TABLE_OF_CONTENTS:
	    getTableOfContents().clear();
	    getTableOfContents().addAll((Collection<? extends TableOfContentsDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__TARGET_AUDIENCE:
	    getTargetAudience().clear();
	    getTargetAudience().addAll((Collection<? extends TargetAudienceDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__TITLE_INFO:
	    getTitleInfo().clear();
	    getTitleInfo().addAll((Collection<? extends TitleInfoDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__TYPE_OF_RESOURCE:
	    getTypeOfResource().clear();
	    getTypeOfResource().addAll((Collection<? extends TypeOfResourceDefinition>) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__ID:
	    setID((String) newValue);
	    return;
	case MODSPackage.MODS_DEFINITION__VERSION:
	    setVersion((ModsVersionAttributeDefinition) newValue);
	    return;
	}
	super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
	switch (featureID) {
	case MODSPackage.MODS_DEFINITION__MODS_GROUP:
	    getModsGroup().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__ABSTRACT:
	    getAbstract().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__ACCESS_CONDITION:
	    getAccessCondition().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__CLASSIFICATION:
	    getClassification().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__EXTENSION:
	    getExtension().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__GENRE:
	    getGenre().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__IDENTIFIER:
	    getIdentifier().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__LANGUAGE:
	    getLanguage().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__LOCATION:
	    getLocation().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__NAME:
	    getName().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__NOTE:
	    getNote().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__ORIGIN_INFO:
	    getOriginInfo().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__PART:
	    getPart().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__PHYSICAL_DESCRIPTION:
	    getPhysicalDescription().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__RECORD_INFO:
	    getRecordInfo().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__RELATED_ITEM:
	    getRelatedItem().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__SUBJECT:
	    getSubject().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__TABLE_OF_CONTENTS:
	    getTableOfContents().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__TARGET_AUDIENCE:
	    getTargetAudience().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__TITLE_INFO:
	    getTitleInfo().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__TYPE_OF_RESOURCE:
	    getTypeOfResource().clear();
	    return;
	case MODSPackage.MODS_DEFINITION__ID:
	    setID(ID_EDEFAULT);
	    return;
	case MODSPackage.MODS_DEFINITION__VERSION:
	    unsetVersion();
	    return;
	}
	super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
	switch (featureID) {
	case MODSPackage.MODS_DEFINITION__MODS_GROUP:
	    return modsGroup != null && !modsGroup.isEmpty();
	case MODSPackage.MODS_DEFINITION__ABSTRACT:
	    return !getAbstract().isEmpty();
	case MODSPackage.MODS_DEFINITION__ACCESS_CONDITION:
	    return !getAccessCondition().isEmpty();
	case MODSPackage.MODS_DEFINITION__CLASSIFICATION:
	    return !getClassification().isEmpty();
	case MODSPackage.MODS_DEFINITION__EXTENSION:
	    return !getExtension().isEmpty();
	case MODSPackage.MODS_DEFINITION__GENRE:
	    return !getGenre().isEmpty();
	case MODSPackage.MODS_DEFINITION__IDENTIFIER:
	    return !getIdentifier().isEmpty();
	case MODSPackage.MODS_DEFINITION__LANGUAGE:
	    return !getLanguage().isEmpty();
	case MODSPackage.MODS_DEFINITION__LOCATION:
	    return !getLocation().isEmpty();
	case MODSPackage.MODS_DEFINITION__NAME:
	    return !getName().isEmpty();
	case MODSPackage.MODS_DEFINITION__NOTE:
	    return !getNote().isEmpty();
	case MODSPackage.MODS_DEFINITION__ORIGIN_INFO:
	    return !getOriginInfo().isEmpty();
	case MODSPackage.MODS_DEFINITION__PART:
	    return !getPart().isEmpty();
	case MODSPackage.MODS_DEFINITION__PHYSICAL_DESCRIPTION:
	    return !getPhysicalDescription().isEmpty();
	case MODSPackage.MODS_DEFINITION__RECORD_INFO:
	    return !getRecordInfo().isEmpty();
	case MODSPackage.MODS_DEFINITION__RELATED_ITEM:
	    return !getRelatedItem().isEmpty();
	case MODSPackage.MODS_DEFINITION__SUBJECT:
	    return !getSubject().isEmpty();
	case MODSPackage.MODS_DEFINITION__TABLE_OF_CONTENTS:
	    return !getTableOfContents().isEmpty();
	case MODSPackage.MODS_DEFINITION__TARGET_AUDIENCE:
	    return !getTargetAudience().isEmpty();
	case MODSPackage.MODS_DEFINITION__TITLE_INFO:
	    return !getTitleInfo().isEmpty();
	case MODSPackage.MODS_DEFINITION__TYPE_OF_RESOURCE:
	    return !getTypeOfResource().isEmpty();
	case MODSPackage.MODS_DEFINITION__ID:
	    return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
	case MODSPackage.MODS_DEFINITION__VERSION:
	    return isSetVersion();
	}
	return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
	if (eIsProxy())
	    return super.toString();

	StringBuffer result = new StringBuffer(super.toString());
	result.append(" (modsGroup: ");
	result.append(modsGroup);
	result.append(", iD: ");
	result.append(iD);
	result.append(", version: ");
	if (versionESet)
	    result.append(version);
	else
	    result.append("<unset>");
	result.append(')');
	return result.toString();
    }

} //ModsDefinitionImpl
