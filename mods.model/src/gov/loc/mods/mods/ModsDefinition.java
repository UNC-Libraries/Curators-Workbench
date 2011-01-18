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
package gov.loc.mods.mods;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mods Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getModsGroup <em>Mods Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getAccessCondition <em>Access Condition</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getClassification <em>Classification</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getExtension <em>Extension</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getGenre <em>Genre</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getLanguage <em>Language</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getName <em>Name</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getNote <em>Note</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getOriginInfo <em>Origin Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getPart <em>Part</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getPhysicalDescription <em>Physical Description</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getRecordInfo <em>Record Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getRelatedItem <em>Related Item</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getTableOfContents <em>Table Of Contents</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getTargetAudience <em>Target Audience</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getTitleInfo <em>Title Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getTypeOfResource <em>Type Of Resource</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ModsDefinition#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getModsDefinition()
 * @model extendedMetaData="name='modsDefinition' kind='elementOnly'"
 * @generated
 */
public interface ModsDefinition extends EObject {
    /**
     * Returns the value of the '<em><b>Mods Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mods Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mods Group</em>' attribute list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_ModsGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='ModsGroup:0'"
     * @generated
     */
    FeatureMap getModsGroup();

    /**
     * Returns the value of the '<em><b>Abstract</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.AbstractDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_Abstract()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<AbstractDefinition> getAbstract();

    /**
     * Returns the value of the '<em><b>Access Condition</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.AccessConditionDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Access Condition</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Access Condition</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_AccessCondition()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='accessCondition' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<AccessConditionDefinition> getAccessCondition();

    /**
     * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.ClassificationDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Classification</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Classification</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_Classification()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<ClassificationDefinition> getClassification();

    /**
     * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.ExtensionDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extension</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_Extension()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<ExtensionDefinition> getExtension();

    /**
     * Returns the value of the '<em><b>Genre</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.GenreDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Genre</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Genre</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_Genre()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='genre' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<GenreDefinition> getGenre();

    /**
     * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.IdentifierDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identifier</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_Identifier()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<IdentifierDefinition> getIdentifier();

    /**
     * Returns the value of the '<em><b>Language</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.LanguageDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Language</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Language</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_Language()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<LanguageDefinition> getLanguage();

    /**
     * Returns the value of the '<em><b>Location</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.LocationDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_Location()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<LocationDefinition> getLocation();

    /**
     * Returns the value of the '<em><b>Name</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.NameDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_Name()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<NameDefinition> getName();

    /**
     * Returns the value of the '<em><b>Note</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.NoteDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Note</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_Note()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<NoteDefinition> getNote();

    /**
     * Returns the value of the '<em><b>Origin Info</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.OriginInfoDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Origin Info</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Origin Info</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_OriginInfo()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='originInfo' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<OriginInfoDefinition> getOriginInfo();

    /**
     * Returns the value of the '<em><b>Part</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.PartDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Part</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_Part()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='part' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<PartDefinition> getPart();

    /**
     * Returns the value of the '<em><b>Physical Description</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.PhysicalDescriptionDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Physical Description</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Physical Description</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_PhysicalDescription()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='physicalDescription' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<PhysicalDescriptionDefinition> getPhysicalDescription();

    /**
     * Returns the value of the '<em><b>Record Info</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.RecordInfoDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Record Info</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Record Info</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_RecordInfo()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='recordInfo' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<RecordInfoDefinition> getRecordInfo();

    /**
     * Returns the value of the '<em><b>Related Item</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.RelatedItemDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Related Item</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Related Item</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_RelatedItem()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='relatedItem' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<RelatedItemDefinition> getRelatedItem();

    /**
     * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.SubjectDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subject</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subject</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_Subject()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<SubjectDefinition> getSubject();

    /**
     * Returns the value of the '<em><b>Table Of Contents</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.TableOfContentsDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Table Of Contents</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table Of Contents</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_TableOfContents()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='tableOfContents' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<TableOfContentsDefinition> getTableOfContents();

    /**
     * Returns the value of the '<em><b>Target Audience</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.TargetAudienceDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Audience</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Audience</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_TargetAudience()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='targetAudience' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<TargetAudienceDefinition> getTargetAudience();

    /**
     * Returns the value of the '<em><b>Title Info</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.TitleInfoDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title Info</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title Info</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_TitleInfo()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='titleInfo' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<TitleInfoDefinition> getTitleInfo();

    /**
     * Returns the value of the '<em><b>Type Of Resource</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.TypeOfResourceDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type Of Resource</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Of Resource</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_TypeOfResource()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='typeOfResource' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<TypeOfResourceDefinition> getTypeOfResource();

    /**
     * Returns the value of the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ID</em>' attribute.
     * @see #setID(String)
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_ID()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='ID'"
     * @generated
     */
    String getID();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.ModsDefinition#getID <em>ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ID</em>' attribute.
     * @see #getID()
     * @generated
     */
    void setID(String value);

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.ModsVersionAttributeDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see gov.loc.mods.mods.ModsVersionAttributeDefinition
     * @see #isSetVersion()
     * @see #unsetVersion()
     * @see #setVersion(ModsVersionAttributeDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getModsDefinition_Version()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='version'"
     * @generated
     */
    ModsVersionAttributeDefinition getVersion();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.ModsDefinition#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see gov.loc.mods.mods.ModsVersionAttributeDefinition
     * @see #isSetVersion()
     * @see #unsetVersion()
     * @see #getVersion()
     * @generated
     */
    void setVersion(ModsVersionAttributeDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.ModsDefinition#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVersion()
     * @see #getVersion()
     * @see #setVersion(ModsVersionAttributeDefinition)
     * @generated
     */
    void unsetVersion();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.ModsDefinition#getVersion <em>Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Version</em>' attribute is set.
     * @see #unsetVersion()
     * @see #getVersion()
     * @see #setVersion(ModsVersionAttributeDefinition)
     * @generated
     */
    boolean isSetVersion();

} // ModsDefinition
