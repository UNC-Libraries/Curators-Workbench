/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.unc.lib.schemas.acl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grant Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.unc.lib.schemas.acl.GrantType#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.unc.lib.schemas.acl.GrantType#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.unc.lib.schemas.acl.AclPackage#getGrantType()
 * @model extendedMetaData="name='grant_._type' kind='empty'"
 * @generated
 */
public interface GrantType extends EObject {
        /**
         * Returns the value of the '<em><b>Group</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Group</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Group</em>' attribute.
         * @see #setGroup(String)
         * @see edu.unc.lib.schemas.acl.AclPackage#getGrantType_Group()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
         *        extendedMetaData="kind='attribute' name='group' namespace='##targetNamespace'"
         * @generated
         */
        String getGroup();

        /**
         * Sets the value of the '{@link edu.unc.lib.schemas.acl.GrantType#getGroup <em>Group</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Group</em>' attribute.
         * @see #getGroup()
         * @generated
         */
        void setGroup(String value);

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
         * @see edu.unc.lib.schemas.acl.AclPackage#getGrantType_Role()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
         *        extendedMetaData="kind='attribute' name='role' namespace='##targetNamespace'"
         * @generated
         */
        String getRole();

        /**
         * Sets the value of the '{@link edu.unc.lib.schemas.acl.GrantType#getRole <em>Role</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Role</em>' attribute.
         * @see #getRole()
         * @generated
         */
        void setRole(String value);

} // GrantType
