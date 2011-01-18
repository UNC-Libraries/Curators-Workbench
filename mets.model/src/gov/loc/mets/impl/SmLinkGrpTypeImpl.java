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
package gov.loc.mets.impl;

import gov.loc.mets.ARCLINKORDERType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.SmArcLinkType;
import gov.loc.mets.SmLinkGrpType;
import gov.loc.mets.SmLocatorLinkType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sm Link Grp Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.SmLinkGrpTypeImpl#getSmLocatorLink <em>Sm Locator Link</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLinkGrpTypeImpl#getSmArcLink <em>Sm Arc Link</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLinkGrpTypeImpl#getARCLINKORDER <em>ARCLINKORDER</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLinkGrpTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLinkGrpTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLinkGrpTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLinkGrpTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmLinkGrpTypeImpl extends EObjectImpl implements SmLinkGrpType {
        /**
         * The cached value of the '{@link #getSmLocatorLink() <em>Sm Locator Link</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSmLocatorLink()
         * @generated
         * @ordered
         */
        protected EList<SmLocatorLinkType> smLocatorLink;

        /**
         * The cached value of the '{@link #getSmArcLink() <em>Sm Arc Link</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSmArcLink()
         * @generated
         * @ordered
         */
        protected EList<SmArcLinkType> smArcLink;

        /**
         * The default value of the '{@link #getARCLINKORDER() <em>ARCLINKORDER</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getARCLINKORDER()
         * @generated
         * @ordered
         */
        protected static final ARCLINKORDERType ARCLINKORDER_EDEFAULT = ARCLINKORDERType.UNORDERED;

        /**
         * The cached value of the '{@link #getARCLINKORDER() <em>ARCLINKORDER</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getARCLINKORDER()
         * @generated
         * @ordered
         */
        protected ARCLINKORDERType aRCLINKORDER = ARCLINKORDER_EDEFAULT;

        /**
         * This is true if the ARCLINKORDER attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean aRCLINKORDERESet;

        /**
         * The default value of the '{@link #getID() <em>ID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getID()
         * @generated
         * @ordered
         */
        protected static final String ID_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getID()
         * @generated
         * @ordered
         */
        protected String iD = ID_EDEFAULT;

        /**
         * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getRole()
         * @generated
         * @ordered
         */
        protected static final String ROLE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getRole()
         * @generated
         * @ordered
         */
        protected String role = ROLE_EDEFAULT;

        /**
         * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTitle()
         * @generated
         * @ordered
         */
        protected static final String TITLE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTitle()
         * @generated
         * @ordered
         */
        protected String title = TITLE_EDEFAULT;

        /**
         * The default value of the '{@link #getType() <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getType()
         * @generated
         * @ordered
         */
        protected static final String TYPE_EDEFAULT = "extended";

        /**
         * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getType()
         * @generated
         * @ordered
         */
        protected String type = TYPE_EDEFAULT;

        /**
         * This is true if the Type attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean typeESet;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected SmLinkGrpTypeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return MetsPackage.Literals.SM_LINK_GRP_TYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<SmLocatorLinkType> getSmLocatorLink() {
                if (smLocatorLink == null) {
                        smLocatorLink = new EObjectContainmentEList<SmLocatorLinkType>(SmLocatorLinkType.class, this, MetsPackage.SM_LINK_GRP_TYPE__SM_LOCATOR_LINK);
                }
                return smLocatorLink;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<SmArcLinkType> getSmArcLink() {
                if (smArcLink == null) {
                        smArcLink = new EObjectContainmentEList<SmArcLinkType>(SmArcLinkType.class, this, MetsPackage.SM_LINK_GRP_TYPE__SM_ARC_LINK);
                }
                return smArcLink;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ARCLINKORDERType getARCLINKORDER() {
                return aRCLINKORDER;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setARCLINKORDER(ARCLINKORDERType newARCLINKORDER) {
                ARCLINKORDERType oldARCLINKORDER = aRCLINKORDER;
                aRCLINKORDER = newARCLINKORDER == null ? ARCLINKORDER_EDEFAULT : newARCLINKORDER;
                boolean oldARCLINKORDERESet = aRCLINKORDERESet;
                aRCLINKORDERESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LINK_GRP_TYPE__ARCLINKORDER, oldARCLINKORDER, aRCLINKORDER, !oldARCLINKORDERESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetARCLINKORDER() {
                ARCLINKORDERType oldARCLINKORDER = aRCLINKORDER;
                boolean oldARCLINKORDERESet = aRCLINKORDERESet;
                aRCLINKORDER = ARCLINKORDER_EDEFAULT;
                aRCLINKORDERESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.SM_LINK_GRP_TYPE__ARCLINKORDER, oldARCLINKORDER, ARCLINKORDER_EDEFAULT, oldARCLINKORDERESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetARCLINKORDER() {
                return aRCLINKORDERESet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getID() {
                return iD;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setID(String newID) {
                String oldID = iD;
                iD = newID;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LINK_GRP_TYPE__ID, oldID, iD));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getRole() {
                return role;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setRole(String newRole) {
                String oldRole = role;
                role = newRole;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LINK_GRP_TYPE__ROLE, oldRole, role));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getTitle() {
                return title;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTitle(String newTitle) {
                String oldTitle = title;
                title = newTitle;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LINK_GRP_TYPE__TITLE, oldTitle, title));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getType() {
                return type;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setType(String newType) {
                String oldType = type;
                type = newType;
                boolean oldTypeESet = typeESet;
                typeESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LINK_GRP_TYPE__TYPE, oldType, type, !oldTypeESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetType() {
                String oldType = type;
                boolean oldTypeESet = typeESet;
                type = TYPE_EDEFAULT;
                typeESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.SM_LINK_GRP_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetType() {
                return typeESet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case MetsPackage.SM_LINK_GRP_TYPE__SM_LOCATOR_LINK:
                                return ((InternalEList<?>)getSmLocatorLink()).basicRemove(otherEnd, msgs);
                        case MetsPackage.SM_LINK_GRP_TYPE__SM_ARC_LINK:
                                return ((InternalEList<?>)getSmArcLink()).basicRemove(otherEnd, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case MetsPackage.SM_LINK_GRP_TYPE__SM_LOCATOR_LINK:
                                return getSmLocatorLink();
                        case MetsPackage.SM_LINK_GRP_TYPE__SM_ARC_LINK:
                                return getSmArcLink();
                        case MetsPackage.SM_LINK_GRP_TYPE__ARCLINKORDER:
                                return getARCLINKORDER();
                        case MetsPackage.SM_LINK_GRP_TYPE__ID:
                                return getID();
                        case MetsPackage.SM_LINK_GRP_TYPE__ROLE:
                                return getRole();
                        case MetsPackage.SM_LINK_GRP_TYPE__TITLE:
                                return getTitle();
                        case MetsPackage.SM_LINK_GRP_TYPE__TYPE:
                                return getType();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @SuppressWarnings("unchecked")
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case MetsPackage.SM_LINK_GRP_TYPE__SM_LOCATOR_LINK:
                                getSmLocatorLink().clear();
                                getSmLocatorLink().addAll((Collection<? extends SmLocatorLinkType>)newValue);
                                return;
                        case MetsPackage.SM_LINK_GRP_TYPE__SM_ARC_LINK:
                                getSmArcLink().clear();
                                getSmArcLink().addAll((Collection<? extends SmArcLinkType>)newValue);
                                return;
                        case MetsPackage.SM_LINK_GRP_TYPE__ARCLINKORDER:
                                setARCLINKORDER((ARCLINKORDERType)newValue);
                                return;
                        case MetsPackage.SM_LINK_GRP_TYPE__ID:
                                setID((String)newValue);
                                return;
                        case MetsPackage.SM_LINK_GRP_TYPE__ROLE:
                                setRole((String)newValue);
                                return;
                        case MetsPackage.SM_LINK_GRP_TYPE__TITLE:
                                setTitle((String)newValue);
                                return;
                        case MetsPackage.SM_LINK_GRP_TYPE__TYPE:
                                setType((String)newValue);
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
                        case MetsPackage.SM_LINK_GRP_TYPE__SM_LOCATOR_LINK:
                                getSmLocatorLink().clear();
                                return;
                        case MetsPackage.SM_LINK_GRP_TYPE__SM_ARC_LINK:
                                getSmArcLink().clear();
                                return;
                        case MetsPackage.SM_LINK_GRP_TYPE__ARCLINKORDER:
                                unsetARCLINKORDER();
                                return;
                        case MetsPackage.SM_LINK_GRP_TYPE__ID:
                                setID(ID_EDEFAULT);
                                return;
                        case MetsPackage.SM_LINK_GRP_TYPE__ROLE:
                                setRole(ROLE_EDEFAULT);
                                return;
                        case MetsPackage.SM_LINK_GRP_TYPE__TITLE:
                                setTitle(TITLE_EDEFAULT);
                                return;
                        case MetsPackage.SM_LINK_GRP_TYPE__TYPE:
                                unsetType();
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
                        case MetsPackage.SM_LINK_GRP_TYPE__SM_LOCATOR_LINK:
                                return smLocatorLink != null && !smLocatorLink.isEmpty();
                        case MetsPackage.SM_LINK_GRP_TYPE__SM_ARC_LINK:
                                return smArcLink != null && !smArcLink.isEmpty();
                        case MetsPackage.SM_LINK_GRP_TYPE__ARCLINKORDER:
                                return isSetARCLINKORDER();
                        case MetsPackage.SM_LINK_GRP_TYPE__ID:
                                return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
                        case MetsPackage.SM_LINK_GRP_TYPE__ROLE:
                                return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
                        case MetsPackage.SM_LINK_GRP_TYPE__TITLE:
                                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
                        case MetsPackage.SM_LINK_GRP_TYPE__TYPE:
                                return isSetType();
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
                result.append(" (aRCLINKORDER: ");
                if (aRCLINKORDERESet) result.append(aRCLINKORDER); else result.append("<unset>");
                result.append(", iD: ");
                result.append(iD);
                result.append(", role: ");
                result.append(role);
                result.append(", title: ");
                result.append(title);
                result.append(", type: ");
                if (typeESet) result.append(type); else result.append("<unset>");
                result.append(')');
                return result.toString();
        }

} //SmLinkGrpTypeImpl
