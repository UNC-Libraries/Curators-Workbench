/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.unc.lib.schemas.acl.impl;

import edu.unc.lib.schemas.acl.AclPackage;
import edu.unc.lib.schemas.acl.GrantType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grant Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.unc.lib.schemas.acl.impl.GrantTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.unc.lib.schemas.acl.impl.GrantTypeImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GrantTypeImpl extends EObjectImpl implements GrantType {
        /**
         * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getGroup()
         * @generated
         * @ordered
         */
        protected static final Object GROUP_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getGroup()
         * @generated
         * @ordered
         */
        protected Object group = GROUP_EDEFAULT;

        /**
         * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getRole()
         * @generated
         * @ordered
         */
        protected static final Object ROLE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getRole()
         * @generated
         * @ordered
         */
        protected Object role = ROLE_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected GrantTypeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return AclPackage.Literals.GRANT_TYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Object getGroup() {
                return group;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setGroup(Object newGroup) {
                Object oldGroup = group;
                group = newGroup;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, AclPackage.GRANT_TYPE__GROUP, oldGroup, group));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Object getRole() {
                return role;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setRole(Object newRole) {
                Object oldRole = role;
                role = newRole;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, AclPackage.GRANT_TYPE__ROLE, oldRole, role));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case AclPackage.GRANT_TYPE__GROUP:
                                return getGroup();
                        case AclPackage.GRANT_TYPE__ROLE:
                                return getRole();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case AclPackage.GRANT_TYPE__GROUP:
                                setGroup(newValue);
                                return;
                        case AclPackage.GRANT_TYPE__ROLE:
                                setRole(newValue);
                                return;
                }
                super.eSet(featureID, newValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eUnset(int featureID) {
                switch (featureID) {
                        case AclPackage.GRANT_TYPE__GROUP:
                                setGroup(GROUP_EDEFAULT);
                                return;
                        case AclPackage.GRANT_TYPE__ROLE:
                                setRole(ROLE_EDEFAULT);
                                return;
                }
                super.eUnset(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public boolean eIsSet(int featureID) {
                switch (featureID) {
                        case AclPackage.GRANT_TYPE__GROUP:
                                return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
                        case AclPackage.GRANT_TYPE__ROLE:
                                return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
                }
                return super.eIsSet(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String toString() {
                if (eIsProxy()) return super.toString();

                StringBuffer result = new StringBuffer(super.toString());
                result.append(" (group: ");
                result.append(group);
                result.append(", role: ");
                result.append(role);
                result.append(')');
                return result.toString();
        }

} //GrantTypeImpl
