/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
         *        extendedMetaData="kind='element' name='grant'"
         * @generated
         */
        EList<GrantType> getGrant();

        /**
         * Returns the value of the '<em><b>Embargo Until</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Embargo Until</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Embargo Until</em>' attribute.
         * @see #setEmbargoUntil(XMLGregorianCalendar)
         * @see edu.unc.lib.schemas.acl.AclPackage#getAccessControlType_EmbargoUntil()
         * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
         *        extendedMetaData="kind='attribute' name='embargo-until'"
         * @generated
         */
        XMLGregorianCalendar getEmbargoUntil();

        /**
         * Sets the value of the '{@link edu.unc.lib.schemas.acl.AccessControlType#getEmbargoUntil <em>Embargo Until</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Embargo Until</em>' attribute.
         * @see #getEmbargoUntil()
         * @generated
         */
        void setEmbargoUntil(XMLGregorianCalendar value);

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
         *        extendedMetaData="kind='attribute' name='inherit'"
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
