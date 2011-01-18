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

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getModsGroup <em>Mods Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getAccessCondition <em>Access Condition</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getClassification <em>Classification</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getExtension <em>Extension</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getGenre <em>Genre</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getLanguage <em>Language</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getName <em>Name</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getNote <em>Note</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getOriginInfo <em>Origin Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getPart <em>Part</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getPhysicalDescription <em>Physical Description</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getRecordInfo <em>Record Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getRelatedItem <em>Related Item</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getTableOfContents <em>Table Of Contents</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getTargetAudience <em>Target Audience</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getTitleInfo <em>Title Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getTypeOfResource <em>Type Of Resource</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getHref <em>Href</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getType <em>Type</em>}</li>
 *   <li>{@link gov.loc.mods.mods.RelatedItemDefinition#getType1 <em>Type1</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition()
 * @model extendedMetaData="name='relatedItemDefinition' kind='elementOnly'"
 * @generated
 */
public interface RelatedItemDefinition extends EObject {
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_ModsGroup()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Abstract()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_AccessCondition()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Classification()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Extension()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Genre()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Identifier()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Language()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Location()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Name()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Note()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_OriginInfo()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Part()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_PhysicalDescription()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_RecordInfo()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_RelatedItem()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Subject()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_TableOfContents()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_TargetAudience()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_TitleInfo()
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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_TypeOfResource()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='typeOfResource' namespace='##targetNamespace' group='#ModsGroup:0'"
     * @generated
     */
    EList<TypeOfResourceDefinition> getTypeOfResource();

    /**
     * Returns the value of the '<em><b>Actuate</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actuate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actuate</em>' attribute.
     * @see org.w3._1999.xlink.ActuateType
     * @see #isSetActuate()
     * @see #unsetActuate()
     * @see #setActuate(ActuateType)
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Actuate()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    ActuateType getActuate();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getActuate <em>Actuate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actuate</em>' attribute.
     * @see org.w3._1999.xlink.ActuateType
     * @see #isSetActuate()
     * @see #unsetActuate()
     * @see #getActuate()
     * @generated
     */
    void setActuate(ActuateType value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getActuate <em>Actuate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActuate()
     * @see #getActuate()
     * @see #setActuate(ActuateType)
     * @generated
     */
    void unsetActuate();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getActuate <em>Actuate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Actuate</em>' attribute is set.
     * @see #unsetActuate()
     * @see #getActuate()
     * @see #setActuate(ActuateType)
     * @generated
     */
    boolean isSetActuate();

    /**
     * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Arcrole</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Arcrole</em>' attribute.
     * @see #setArcrole(String)
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Arcrole()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getArcrole();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getArcrole <em>Arcrole</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Arcrole</em>' attribute.
     * @see #getArcrole()
     * @generated
     */
    void setArcrole(String value);

    /**
     * Returns the value of the '<em><b>Display Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Display Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Display Label</em>' attribute.
     * @see #setDisplayLabel(String)
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_DisplayLabel()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='displayLabel'"
     * @generated
     */
    String getDisplayLabel();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getDisplayLabel <em>Display Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Display Label</em>' attribute.
     * @see #getDisplayLabel()
     * @generated
     */
    void setDisplayLabel(String value);

    /**
     * Returns the value of the '<em><b>Href</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Href</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Href</em>' attribute.
     * @see #setHref(String)
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Href()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getHref();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getHref <em>Href</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Href</em>' attribute.
     * @see #getHref()
     * @generated
     */
    void setHref(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_ID()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='ID'"
     * @generated
     */
    String getID();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getID <em>ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ID</em>' attribute.
     * @see #getID()
     * @generated
     */
    void setID(String value);

    /**
     * Returns the value of the '<em><b>Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role</em>' attribute.
     * @see #setRole(String)
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Role()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getRole();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getRole <em>Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role</em>' attribute.
     * @see #getRole()
     * @generated
     */
    void setRole(String value);

    /**
     * Returns the value of the '<em><b>Show</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Show</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Show</em>' attribute.
     * @see org.w3._1999.xlink.ShowType
     * @see #isSetShow()
     * @see #unsetShow()
     * @see #setShow(ShowType)
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Show()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    ShowType getShow();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getShow <em>Show</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Show</em>' attribute.
     * @see org.w3._1999.xlink.ShowType
     * @see #isSetShow()
     * @see #unsetShow()
     * @see #getShow()
     * @generated
     */
    void setShow(ShowType value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getShow <em>Show</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShow()
     * @see #getShow()
     * @see #setShow(ShowType)
     * @generated
     */
    void unsetShow();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getShow <em>Show</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Show</em>' attribute is set.
     * @see #unsetShow()
     * @see #getShow()
     * @see #setShow(ShowType)
     * @generated
     */
    boolean isSetShow();

    /**
     * Returns the value of the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title</em>' attribute.
     * @see #setTitle(String)
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Title()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.RelatedItemTypeAttributeDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see gov.loc.mods.mods.RelatedItemTypeAttributeDefinition
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(RelatedItemTypeAttributeDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Type()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    RelatedItemTypeAttributeDefinition getType();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see gov.loc.mods.mods.RelatedItemTypeAttributeDefinition
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(RelatedItemTypeAttributeDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(RelatedItemTypeAttributeDefinition)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(RelatedItemTypeAttributeDefinition)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Type1</b></em>' attribute.
     * The default value is <code>"simple"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type1</em>' attribute.
     * @see #isSetType1()
     * @see #unsetType1()
     * @see #setType1(String)
     * @see gov.loc.mods.mods.MODSPackage#getRelatedItemDefinition_Type1()
     * @model default="simple" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getType1();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getType1 <em>Type1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type1</em>' attribute.
     * @see #isSetType1()
     * @see #unsetType1()
     * @see #getType1()
     * @generated
     */
    void setType1(String value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getType1 <em>Type1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType1()
     * @see #getType1()
     * @see #setType1(String)
     * @generated
     */
    void unsetType1();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.RelatedItemDefinition#getType1 <em>Type1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type1</em>' attribute is set.
     * @see #unsetType1()
     * @see #getType1()
     * @see #setType1(String)
     * @generated
     */
    boolean isSetType1();

} // RelatedItemDefinition
