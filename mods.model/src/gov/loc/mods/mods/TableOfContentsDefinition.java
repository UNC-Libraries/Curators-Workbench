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
 * A representation of the model object '<em><b>Table Of Contents Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.TableOfContentsDefinition#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.TableOfContentsDefinition#getShareable <em>Shareable</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getTableOfContentsDefinition()
 * @model extendedMetaData="name='tableOfContentsDefinition' kind='simple'"
 * @generated
 */
public interface TableOfContentsDefinition extends UnstructuredTextDefinition {
    /**
     * Returns the value of the '<em><b>Alt Rep Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alt Rep Group</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alt Rep Group</em>' attribute.
     * @see #setAltRepGroup(String)
     * @see gov.loc.mods.mods.MODSPackage#getTableOfContentsDefinition_AltRepGroup()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='altRepGroup'"
     * @generated
     */
    String getAltRepGroup();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.TableOfContentsDefinition#getAltRepGroup <em>Alt Rep Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alt Rep Group</em>' attribute.
     * @see #getAltRepGroup()
     * @generated
     */
    void setAltRepGroup(String value);

    /**
     * Returns the value of the '<em><b>Shareable</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.NoDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shareable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shareable</em>' attribute.
     * @see gov.loc.mods.mods.NoDefinition
     * @see #isSetShareable()
     * @see #unsetShareable()
     * @see #setShareable(NoDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getTableOfContentsDefinition_Shareable()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='shareable'"
     * @generated
     */
    NoDefinition getShareable();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.TableOfContentsDefinition#getShareable <em>Shareable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shareable</em>' attribute.
     * @see gov.loc.mods.mods.NoDefinition
     * @see #isSetShareable()
     * @see #unsetShareable()
     * @see #getShareable()
     * @generated
     */
    void setShareable(NoDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.TableOfContentsDefinition#getShareable <em>Shareable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShareable()
     * @see #getShareable()
     * @see #setShareable(NoDefinition)
     * @generated
     */
    void unsetShareable();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.TableOfContentsDefinition#getShareable <em>Shareable</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shareable</em>' attribute is set.
     * @see #unsetShareable()
     * @see #getShareable()
     * @see #setShareable(NoDefinition)
     * @generated
     */
    boolean isSetShareable();

} // TableOfContentsDefinition
