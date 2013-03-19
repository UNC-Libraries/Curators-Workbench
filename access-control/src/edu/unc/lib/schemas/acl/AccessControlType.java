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
package edu.unc.lib.schemas.acl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Control Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.unc.lib.schemas.acl.AccessControlType#getGrant <em>Grant</em>}</li>
 *   <li>{@link edu.unc.lib.schemas.acl.AccessControlType#isDiscoverable <em>Discoverable</em>}</li>
 *   <li>{@link edu.unc.lib.schemas.acl.AccessControlType#isPublished <em>Published</em>}</li>
 *   <li>{@link edu.unc.lib.schemas.acl.AccessControlType#getEmbargoUntil <em>Embargo Until</em>}</li>
 *   <li>{@link edu.unc.lib.schemas.acl.AccessControlType#isInherit <em>Inherit</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.unc.lib.schemas.acl.AclPackage#getAccessControlType()
 * @model extendedMetaData="name='accessControl_._type' kind='elementOnly'"
 * @generated
 */
public interface AccessControlType extends EObject {
        /**
	 * Returns the value of the '<em><b>Grant</b></em>' containment reference list.
	 * The list contents are of type {@link edu.unc.lib.schemas.acl.GrantType}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Grant</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Grant</em>' containment reference list.
	 * @see edu.unc.lib.schemas.acl.AclPackage#getAccessControlType_Grant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='grant' namespace='##targetNamespace'"
	 * @generated
	 */
        EList<GrantType> getGrant();

        /**
	 * Returns the value of the '<em><b>Discoverable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discoverable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discoverable</em>' attribute.
	 * @see #isSetDiscoverable()
	 * @see #unsetDiscoverable()
	 * @see #setDiscoverable(boolean)
	 * @see edu.unc.lib.schemas.acl.AclPackage#getAccessControlType_Discoverable()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='discoverable' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDiscoverable();

								/**
	 * Sets the value of the '{@link edu.unc.lib.schemas.acl.AccessControlType#isDiscoverable <em>Discoverable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discoverable</em>' attribute.
	 * @see #isSetDiscoverable()
	 * @see #unsetDiscoverable()
	 * @see #isDiscoverable()
	 * @generated
	 */
	void setDiscoverable(boolean value);

								/**
	 * Unsets the value of the '{@link edu.unc.lib.schemas.acl.AccessControlType#isDiscoverable <em>Discoverable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscoverable()
	 * @see #isDiscoverable()
	 * @see #setDiscoverable(boolean)
	 * @generated
	 */
	void unsetDiscoverable();

								/**
	 * Returns whether the value of the '{@link edu.unc.lib.schemas.acl.AccessControlType#isDiscoverable <em>Discoverable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discoverable</em>' attribute is set.
	 * @see #unsetDiscoverable()
	 * @see #isDiscoverable()
	 * @see #setDiscoverable(boolean)
	 * @generated
	 */
	boolean isSetDiscoverable();

								/**
	 * Returns the value of the '<em><b>Published</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Published</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published</em>' attribute.
	 * @see #isSetPublished()
	 * @see #unsetPublished()
	 * @see #setPublished(boolean)
	 * @see edu.unc.lib.schemas.acl.AclPackage#getAccessControlType_Published()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='published' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPublished();

								/**
	 * Sets the value of the '{@link edu.unc.lib.schemas.acl.AccessControlType#isPublished <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published</em>' attribute.
	 * @see #isSetPublished()
	 * @see #unsetPublished()
	 * @see #isPublished()
	 * @generated
	 */
	void setPublished(boolean value);

								/**
	 * Unsets the value of the '{@link edu.unc.lib.schemas.acl.AccessControlType#isPublished <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPublished()
	 * @see #isPublished()
	 * @see #setPublished(boolean)
	 * @generated
	 */
	void unsetPublished();

								/**
	 * Returns whether the value of the '{@link edu.unc.lib.schemas.acl.AccessControlType#isPublished <em>Published</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Published</em>' attribute is set.
	 * @see #unsetPublished()
	 * @see #isPublished()
	 * @see #setPublished(boolean)
	 * @generated
	 */
	boolean isSetPublished();

								/**
	 * Returns the value of the '<em><b>Embargo Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Embargo Until</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Embargo Until</em>' attribute.
	 * @see #isSetEmbargoUntil()
	 * @see #unsetEmbargoUntil()
	 * @see #setEmbargoUntil(XMLGregorianCalendar)
	 * @see edu.unc.lib.schemas.acl.AclPackage#getAccessControlType_EmbargoUntil()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='embargo-until' namespace='##targetNamespace'"
	 * @generated
	 */
        XMLGregorianCalendar getEmbargoUntil();

        /**
	 * Sets the value of the '{@link edu.unc.lib.schemas.acl.AccessControlType#getEmbargoUntil <em>Embargo Until</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embargo Until</em>' attribute.
	 * @see #isSetEmbargoUntil()
	 * @see #unsetEmbargoUntil()
	 * @see #getEmbargoUntil()
	 * @generated
	 */
        void setEmbargoUntil(XMLGregorianCalendar value);

        /**
	 * Unsets the value of the '{@link edu.unc.lib.schemas.acl.AccessControlType#getEmbargoUntil <em>Embargo Until</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetEmbargoUntil()
	 * @see #getEmbargoUntil()
	 * @see #setEmbargoUntil(XMLGregorianCalendar)
	 * @generated
	 */
        void unsetEmbargoUntil();

        /**
	 * Returns whether the value of the '{@link edu.unc.lib.schemas.acl.AccessControlType#getEmbargoUntil <em>Embargo Until</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Embargo Until</em>' attribute is set.
	 * @see #unsetEmbargoUntil()
	 * @see #getEmbargoUntil()
	 * @see #setEmbargoUntil(XMLGregorianCalendar)
	 * @generated
	 */
        boolean isSetEmbargoUntil();

        /**
	 * Returns the value of the '<em><b>Inherit</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Inherit</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherit</em>' attribute.
	 * @see #isSetInherit()
	 * @see #unsetInherit()
	 * @see #setInherit(boolean)
	 * @see edu.unc.lib.schemas.acl.AclPackage#getAccessControlType_Inherit()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='inherit' namespace='##targetNamespace'"
	 * @generated
	 */
        boolean isInherit();

        /**
	 * Sets the value of the '{@link edu.unc.lib.schemas.acl.AccessControlType#isInherit <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherit</em>' attribute.
	 * @see #isSetInherit()
	 * @see #unsetInherit()
	 * @see #isInherit()
	 * @generated
	 */
        void setInherit(boolean value);

        /**
	 * Unsets the value of the '{@link edu.unc.lib.schemas.acl.AccessControlType#isInherit <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetInherit()
	 * @see #isInherit()
	 * @see #setInherit(boolean)
	 * @generated
	 */
        void unsetInherit();

        /**
	 * Returns whether the value of the '{@link edu.unc.lib.schemas.acl.AccessControlType#isInherit <em>Inherit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inherit</em>' attribute is set.
	 * @see #unsetInherit()
	 * @see #isInherit()
	 * @see #setInherit(boolean)
	 * @generated
	 */
        boolean isSetInherit();

} // AccessControlType
