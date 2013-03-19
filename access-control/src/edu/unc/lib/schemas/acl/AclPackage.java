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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.unc.lib.schemas.acl.AclFactory
 * @model kind="package"
 * @generated
 */
public interface AclPackage extends EPackage {
        /**
	 * The package name.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        String eNAME = "acl";

        /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        String eNS_URI = "http://cdr.unc.edu/definitions/acl#";

        /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        String eNS_PREFIX = "acl";

        /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        AclPackage eINSTANCE = edu.unc.lib.schemas.acl.impl.AclPackageImpl.init();

        /**
	 * The meta object id for the '{@link edu.unc.lib.schemas.acl.impl.AccessControlTypeImpl <em>Access Control Type</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see edu.unc.lib.schemas.acl.impl.AccessControlTypeImpl
	 * @see edu.unc.lib.schemas.acl.impl.AclPackageImpl#getAccessControlType()
	 * @generated
	 */
        int ACCESS_CONTROL_TYPE = 0;

        /**
	 * The feature id for the '<em><b>Grant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int ACCESS_CONTROL_TYPE__GRANT = 0;

        /**
	 * The feature id for the '<em><b>Discoverable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_TYPE__DISCOVERABLE = 1;

								/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_TYPE__PUBLISHED = 2;

								/**
	 * The feature id for the '<em><b>Embargo Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int ACCESS_CONTROL_TYPE__EMBARGO_UNTIL = 3;

        /**
	 * The feature id for the '<em><b>Inherit</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int ACCESS_CONTROL_TYPE__INHERIT = 4;

        /**
	 * The number of structural features of the '<em>Access Control Type</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int ACCESS_CONTROL_TYPE_FEATURE_COUNT = 5;

        /**
	 * The meta object id for the '{@link edu.unc.lib.schemas.acl.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see edu.unc.lib.schemas.acl.impl.DocumentRootImpl
	 * @see edu.unc.lib.schemas.acl.impl.AclPackageImpl#getDocumentRoot()
	 * @generated
	 */
        int DOCUMENT_ROOT = 1;

        /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DOCUMENT_ROOT__MIXED = 0;

        /**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

        /**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

        /**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DOCUMENT_ROOT__ACCESS_CONTROL = 3;

        /**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DOCUMENT_ROOT_FEATURE_COUNT = 4;

        /**
	 * The meta object id for the '{@link edu.unc.lib.schemas.acl.impl.GrantTypeImpl <em>Grant Type</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see edu.unc.lib.schemas.acl.impl.GrantTypeImpl
	 * @see edu.unc.lib.schemas.acl.impl.AclPackageImpl#getGrantType()
	 * @generated
	 */
        int GRANT_TYPE = 2;

        /**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int GRANT_TYPE__GROUP = 0;

        /**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int GRANT_TYPE__ROLE = 1;

        /**
	 * The number of structural features of the '<em>Grant Type</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int GRANT_TYPE_FEATURE_COUNT = 2;


        /**
	 * Returns the meta object for class '{@link edu.unc.lib.schemas.acl.AccessControlType <em>Access Control Type</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Control Type</em>'.
	 * @see edu.unc.lib.schemas.acl.AccessControlType
	 * @generated
	 */
        EClass getAccessControlType();

        /**
	 * Returns the meta object for the containment reference list '{@link edu.unc.lib.schemas.acl.AccessControlType#getGrant <em>Grant</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grant</em>'.
	 * @see edu.unc.lib.schemas.acl.AccessControlType#getGrant()
	 * @see #getAccessControlType()
	 * @generated
	 */
        EReference getAccessControlType_Grant();

        /**
	 * Returns the meta object for the attribute '{@link edu.unc.lib.schemas.acl.AccessControlType#isDiscoverable <em>Discoverable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discoverable</em>'.
	 * @see edu.unc.lib.schemas.acl.AccessControlType#isDiscoverable()
	 * @see #getAccessControlType()
	 * @generated
	 */
	EAttribute getAccessControlType_Discoverable();

								/**
	 * Returns the meta object for the attribute '{@link edu.unc.lib.schemas.acl.AccessControlType#isPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published</em>'.
	 * @see edu.unc.lib.schemas.acl.AccessControlType#isPublished()
	 * @see #getAccessControlType()
	 * @generated
	 */
	EAttribute getAccessControlType_Published();

								/**
	 * Returns the meta object for the attribute '{@link edu.unc.lib.schemas.acl.AccessControlType#getEmbargoUntil <em>Embargo Until</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embargo Until</em>'.
	 * @see edu.unc.lib.schemas.acl.AccessControlType#getEmbargoUntil()
	 * @see #getAccessControlType()
	 * @generated
	 */
        EAttribute getAccessControlType_EmbargoUntil();

        /**
	 * Returns the meta object for the attribute '{@link edu.unc.lib.schemas.acl.AccessControlType#isInherit <em>Inherit</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherit</em>'.
	 * @see edu.unc.lib.schemas.acl.AccessControlType#isInherit()
	 * @see #getAccessControlType()
	 * @generated
	 */
        EAttribute getAccessControlType_Inherit();

        /**
	 * Returns the meta object for class '{@link edu.unc.lib.schemas.acl.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see edu.unc.lib.schemas.acl.DocumentRoot
	 * @generated
	 */
        EClass getDocumentRoot();

        /**
	 * Returns the meta object for the attribute list '{@link edu.unc.lib.schemas.acl.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see edu.unc.lib.schemas.acl.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
        EAttribute getDocumentRoot_Mixed();

        /**
	 * Returns the meta object for the map '{@link edu.unc.lib.schemas.acl.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see edu.unc.lib.schemas.acl.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
        EReference getDocumentRoot_XMLNSPrefixMap();

        /**
	 * Returns the meta object for the map '{@link edu.unc.lib.schemas.acl.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see edu.unc.lib.schemas.acl.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
        EReference getDocumentRoot_XSISchemaLocation();

        /**
	 * Returns the meta object for the containment reference '{@link edu.unc.lib.schemas.acl.DocumentRoot#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Control</em>'.
	 * @see edu.unc.lib.schemas.acl.DocumentRoot#getAccessControl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
        EReference getDocumentRoot_AccessControl();

        /**
	 * Returns the meta object for class '{@link edu.unc.lib.schemas.acl.GrantType <em>Grant Type</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grant Type</em>'.
	 * @see edu.unc.lib.schemas.acl.GrantType
	 * @generated
	 */
        EClass getGrantType();

        /**
	 * Returns the meta object for the attribute '{@link edu.unc.lib.schemas.acl.GrantType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see edu.unc.lib.schemas.acl.GrantType#getGroup()
	 * @see #getGrantType()
	 * @generated
	 */
        EAttribute getGrantType_Group();

        /**
	 * Returns the meta object for the attribute '{@link edu.unc.lib.schemas.acl.GrantType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see edu.unc.lib.schemas.acl.GrantType#getRole()
	 * @see #getGrantType()
	 * @generated
	 */
        EAttribute getGrantType_Role();

        /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
        AclFactory getAclFactory();

        /**
	 * <!-- begin-user-doc -->
         * Defines literals for the meta objects that represent
         * <ul>
         *   <li>each class,</li>
         *   <li>each feature of each class,</li>
         *   <li>each enum,</li>
         *   <li>and each data type</li>
         * </ul>
         * <!-- end-user-doc -->
	 * @generated
	 */
        interface Literals {
                /**
		 * The meta object literal for the '{@link edu.unc.lib.schemas.acl.impl.AccessControlTypeImpl <em>Access Control Type</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see edu.unc.lib.schemas.acl.impl.AccessControlTypeImpl
		 * @see edu.unc.lib.schemas.acl.impl.AclPackageImpl#getAccessControlType()
		 * @generated
		 */
                EClass ACCESS_CONTROL_TYPE = eINSTANCE.getAccessControlType();

                /**
		 * The meta object literal for the '<em><b>Grant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference ACCESS_CONTROL_TYPE__GRANT = eINSTANCE.getAccessControlType_Grant();

                /**
		 * The meta object literal for the '<em><b>Discoverable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL_TYPE__DISCOVERABLE = eINSTANCE.getAccessControlType_Discoverable();

																/**
		 * The meta object literal for the '<em><b>Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL_TYPE__PUBLISHED = eINSTANCE.getAccessControlType_Published();

																/**
		 * The meta object literal for the '<em><b>Embargo Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute ACCESS_CONTROL_TYPE__EMBARGO_UNTIL = eINSTANCE.getAccessControlType_EmbargoUntil();

                /**
		 * The meta object literal for the '<em><b>Inherit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute ACCESS_CONTROL_TYPE__INHERIT = eINSTANCE.getAccessControlType_Inherit();

                /**
		 * The meta object literal for the '{@link edu.unc.lib.schemas.acl.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see edu.unc.lib.schemas.acl.impl.DocumentRootImpl
		 * @see edu.unc.lib.schemas.acl.impl.AclPackageImpl#getDocumentRoot()
		 * @generated
		 */
                EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

                /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

                /**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

                /**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

                /**
		 * The meta object literal for the '<em><b>Access Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference DOCUMENT_ROOT__ACCESS_CONTROL = eINSTANCE.getDocumentRoot_AccessControl();

                /**
		 * The meta object literal for the '{@link edu.unc.lib.schemas.acl.impl.GrantTypeImpl <em>Grant Type</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see edu.unc.lib.schemas.acl.impl.GrantTypeImpl
		 * @see edu.unc.lib.schemas.acl.impl.AclPackageImpl#getGrantType()
		 * @generated
		 */
                EClass GRANT_TYPE = eINSTANCE.getGrantType();

                /**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute GRANT_TYPE__GROUP = eINSTANCE.getGrantType_Group();

                /**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute GRANT_TYPE__ROLE = eINSTANCE.getGrantType_Role();

        }

} //AclPackage
