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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy Information Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.CopyInformationDefinition#getForm <em>Form</em>}</li>
 *   <li>{@link gov.loc.mods.mods.CopyInformationDefinition#getSubLocation <em>Sub Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.CopyInformationDefinition#getShelfLocator <em>Shelf Locator</em>}</li>
 *   <li>{@link gov.loc.mods.mods.CopyInformationDefinition#getElectronicLocator <em>Electronic Locator</em>}</li>
 *   <li>{@link gov.loc.mods.mods.CopyInformationDefinition#getNote <em>Note</em>}</li>
 *   <li>{@link gov.loc.mods.mods.CopyInformationDefinition#getEnumerationAndChronology <em>Enumeration And Chronology</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getCopyInformationDefinition()
 * @model extendedMetaData="name='copyInformationDefinition' kind='elementOnly'"
 * @generated
 */
public interface CopyInformationDefinition extends EObject {
    /**
     * Returns the value of the '<em><b>Form</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Form</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Form</em>' containment reference.
     * @see #setForm(StringPlusAuthorityPlusType)
     * @see gov.loc.mods.mods.MODSPackage#getCopyInformationDefinition_Form()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
     * @generated
     */
    StringPlusAuthorityPlusType getForm();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.CopyInformationDefinition#getForm <em>Form</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Form</em>' containment reference.
     * @see #getForm()
     * @generated
     */
    void setForm(StringPlusAuthorityPlusType value);

    /**
     * Returns the value of the '<em><b>Sub Location</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.XsString}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Location</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Location</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getCopyInformationDefinition_SubLocation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='subLocation' namespace='##targetNamespace'"
     * @generated
     */
    EList<XsString> getSubLocation();

    /**
     * Returns the value of the '<em><b>Shelf Locator</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.XsString}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shelf Locator</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shelf Locator</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getCopyInformationDefinition_ShelfLocator()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='shelfLocator' namespace='##targetNamespace'"
     * @generated
     */
    EList<XsString> getShelfLocator();

    /**
     * Returns the value of the '<em><b>Electronic Locator</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.XsString}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Electronic Locator</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Electronic Locator</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getCopyInformationDefinition_ElectronicLocator()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='electronicLocator' namespace='##targetNamespace'"
     * @generated
     */
    EList<XsString> getElectronicLocator();

    /**
     * Returns the value of the '<em><b>Note</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.NoteBaseDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Note</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getCopyInformationDefinition_Note()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
     * @generated
     */
    EList<NoteBaseDefinition> getNote();

    /**
     * Returns the value of the '<em><b>Enumeration And Chronology</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.EnumerationAndChronologyDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enumeration And Chronology</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enumeration And Chronology</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getCopyInformationDefinition_EnumerationAndChronology()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='enumerationAndChronology' namespace='##targetNamespace'"
     * @generated
     */
    EList<EnumerationAndChronologyDefinition> getEnumerationAndChronology();

} // CopyInformationDefinition
