/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.unc.lib.schemas.acl;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.unc.lib.schemas.acl.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link edu.unc.lib.schemas.acl.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link edu.unc.lib.schemas.acl.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link edu.unc.lib.schemas.acl.DocumentRoot#getAccessControl <em>Access Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.unc.lib.schemas.acl.AclPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
        /**
         * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
         * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Mixed</em>' attribute list.
         * @see edu.unc.lib.schemas.acl.AclPackage#getDocumentRoot_Mixed()
         * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
         *        extendedMetaData="kind='elementWildcard' name=':mixed'"
         * @generated
         */
        FeatureMap getMixed();

        /**
         * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
         * The key is of type {@link java.lang.String},
         * and the value is of type {@link java.lang.String},
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>XMLNS Prefix Map</em>' map.
         * @see edu.unc.lib.schemas.acl.AclPackage#getDocumentRoot_XMLNSPrefixMap()
         * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
         *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
         * @generated
         */
        EMap<String, String> getXMLNSPrefixMap();

        /**
         * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
         * The key is of type {@link java.lang.String},
         * and the value is of type {@link java.lang.String},
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>XSI Schema Location</em>' map.
         * @see edu.unc.lib.schemas.acl.AclPackage#getDocumentRoot_XSISchemaLocation()
         * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
         *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
         * @generated
         */
        EMap<String, String> getXSISchemaLocation();

        /**
         * Returns the value of the '<em><b>Access Control</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Access Control</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Access Control</em>' containment reference.
         * @see #setAccessControl(AccessControlType)
         * @see edu.unc.lib.schemas.acl.AclPackage#getDocumentRoot_AccessControl()
         * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
         *        extendedMetaData="kind='element' name='accessControl' namespace='##targetNamespace'"
         * @generated
         */
        AccessControlType getAccessControl();

        /**
         * Sets the value of the '{@link edu.unc.lib.schemas.acl.DocumentRoot#getAccessControl <em>Access Control</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Access Control</em>' containment reference.
         * @see #getAccessControl()
         * @generated
         */
        void setAccessControl(AccessControlType value);

} // DocumentRoot
