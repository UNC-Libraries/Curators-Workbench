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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Base Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.DateBaseDefinition#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DateBaseDefinition#getPoint <em>Point</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DateBaseDefinition#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getDateBaseDefinition()
 * @model extendedMetaData="name='dateBaseDefinition' kind='simple'"
 * @generated
 */
public interface DateBaseDefinition extends XsString {
    /**
     * Returns the value of the '<em><b>Encoding</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.DateEncodingAttributeDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Encoding</em>' attribute.
     * @see gov.loc.mods.mods.DateEncodingAttributeDefinition
     * @see #isSetEncoding()
     * @see #unsetEncoding()
     * @see #setEncoding(DateEncodingAttributeDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getDateBaseDefinition_Encoding()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='encoding'"
     * @generated
     */
    DateEncodingAttributeDefinition getEncoding();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.DateBaseDefinition#getEncoding <em>Encoding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Encoding</em>' attribute.
     * @see gov.loc.mods.mods.DateEncodingAttributeDefinition
     * @see #isSetEncoding()
     * @see #unsetEncoding()
     * @see #getEncoding()
     * @generated
     */
    void setEncoding(DateEncodingAttributeDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.DateBaseDefinition#getEncoding <em>Encoding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEncoding()
     * @see #getEncoding()
     * @see #setEncoding(DateEncodingAttributeDefinition)
     * @generated
     */
    void unsetEncoding();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.DateBaseDefinition#getEncoding <em>Encoding</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Encoding</em>' attribute is set.
     * @see #unsetEncoding()
     * @see #getEncoding()
     * @see #setEncoding(DateEncodingAttributeDefinition)
     * @generated
     */
    boolean isSetEncoding();

    /**
     * Returns the value of the '<em><b>Point</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.DatePointAttributeDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Point</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Point</em>' attribute.
     * @see gov.loc.mods.mods.DatePointAttributeDefinition
     * @see #isSetPoint()
     * @see #unsetPoint()
     * @see #setPoint(DatePointAttributeDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getDateBaseDefinition_Point()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='point'"
     * @generated
     */
    DatePointAttributeDefinition getPoint();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.DateBaseDefinition#getPoint <em>Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Point</em>' attribute.
     * @see gov.loc.mods.mods.DatePointAttributeDefinition
     * @see #isSetPoint()
     * @see #unsetPoint()
     * @see #getPoint()
     * @generated
     */
    void setPoint(DatePointAttributeDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.DateBaseDefinition#getPoint <em>Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPoint()
     * @see #getPoint()
     * @see #setPoint(DatePointAttributeDefinition)
     * @generated
     */
    void unsetPoint();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.DateBaseDefinition#getPoint <em>Point</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Point</em>' attribute is set.
     * @see #unsetPoint()
     * @see #getPoint()
     * @see #setPoint(DatePointAttributeDefinition)
     * @generated
     */
    boolean isSetPoint();

    /**
     * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.DateQualifierAttributeDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qualifier</em>' attribute.
     * @see gov.loc.mods.mods.DateQualifierAttributeDefinition
     * @see #isSetQualifier()
     * @see #unsetQualifier()
     * @see #setQualifier(DateQualifierAttributeDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getDateBaseDefinition_Qualifier()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='qualifier'"
     * @generated
     */
    DateQualifierAttributeDefinition getQualifier();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.DateBaseDefinition#getQualifier <em>Qualifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qualifier</em>' attribute.
     * @see gov.loc.mods.mods.DateQualifierAttributeDefinition
     * @see #isSetQualifier()
     * @see #unsetQualifier()
     * @see #getQualifier()
     * @generated
     */
    void setQualifier(DateQualifierAttributeDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.DateBaseDefinition#getQualifier <em>Qualifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQualifier()
     * @see #getQualifier()
     * @see #setQualifier(DateQualifierAttributeDefinition)
     * @generated
     */
    void unsetQualifier();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.DateBaseDefinition#getQualifier <em>Qualifier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qualifier</em>' attribute is set.
     * @see #unsetQualifier()
     * @see #getQualifier()
     * @see #setQualifier(DateQualifierAttributeDefinition)
     * @generated
     */
    boolean isSetQualifier();

} // DateBaseDefinition
