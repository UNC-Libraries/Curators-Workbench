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

import gov.loc.mets.MetsPackage;
import gov.loc.mets.SmLinkType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sm Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.SmLinkTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLinkTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLinkTypeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLinkTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLinkTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLinkTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLinkTypeImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmLinkTypeImpl extends EObjectImpl implements SmLinkType {
        /**
         * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getActuate()
         * @generated
         * @ordered
         */
        protected static final ActuateType ACTUATE_EDEFAULT = ActuateType.ON_LOAD;

        /**
         * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getActuate()
         * @generated
         * @ordered
         */
        protected ActuateType actuate = ACTUATE_EDEFAULT;

        /**
         * This is true if the Actuate attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean actuateESet;

        /**
         * The default value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getArcrole()
         * @generated
         * @ordered
         */
        protected static final String ARCROLE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getArcrole()
         * @generated
         * @ordered
         */
        protected String arcrole = ARCROLE_EDEFAULT;

        /**
         * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFrom()
         * @generated
         * @ordered
         */
        protected static final String FROM_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFrom()
         * @generated
         * @ordered
         */
        protected String from = FROM_EDEFAULT;

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
         * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getShow()
         * @generated
         * @ordered
         */
        protected static final ShowType SHOW_EDEFAULT = ShowType.NEW;

        /**
         * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getShow()
         * @generated
         * @ordered
         */
        protected ShowType show = SHOW_EDEFAULT;

        /**
         * This is true if the Show attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean showESet;

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
         * The default value of the '{@link #getTo() <em>To</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTo()
         * @generated
         * @ordered
         */
        protected static final String TO_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTo()
         * @generated
         * @ordered
         */
        protected String to = TO_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected SmLinkTypeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return MetsPackage.Literals.SM_LINK_TYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ActuateType getActuate() {
                return actuate;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setActuate(ActuateType newActuate) {
                ActuateType oldActuate = actuate;
                actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
                boolean oldActuateESet = actuateESet;
                actuateESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LINK_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetActuate() {
                ActuateType oldActuate = actuate;
                boolean oldActuateESet = actuateESet;
                actuate = ACTUATE_EDEFAULT;
                actuateESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.SM_LINK_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetActuate() {
                return actuateESet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getArcrole() {
                return arcrole;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setArcrole(String newArcrole) {
                String oldArcrole = arcrole;
                arcrole = newArcrole;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LINK_TYPE__ARCROLE, oldArcrole, arcrole));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getFrom() {
                return from;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setFrom(String newFrom) {
                String oldFrom = from;
                from = newFrom;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LINK_TYPE__FROM, oldFrom, from));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LINK_TYPE__ID, oldID, iD));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ShowType getShow() {
                return show;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setShow(ShowType newShow) {
                ShowType oldShow = show;
                show = newShow == null ? SHOW_EDEFAULT : newShow;
                boolean oldShowESet = showESet;
                showESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LINK_TYPE__SHOW, oldShow, show, !oldShowESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetShow() {
                ShowType oldShow = show;
                boolean oldShowESet = showESet;
                show = SHOW_EDEFAULT;
                showESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.SM_LINK_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetShow() {
                return showESet;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LINK_TYPE__TITLE, oldTitle, title));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getTo() {
                return to;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTo(String newTo) {
                String oldTo = to;
                to = newTo;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LINK_TYPE__TO, oldTo, to));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case MetsPackage.SM_LINK_TYPE__ACTUATE:
                                return getActuate();
                        case MetsPackage.SM_LINK_TYPE__ARCROLE:
                                return getArcrole();
                        case MetsPackage.SM_LINK_TYPE__FROM:
                                return getFrom();
                        case MetsPackage.SM_LINK_TYPE__ID:
                                return getID();
                        case MetsPackage.SM_LINK_TYPE__SHOW:
                                return getShow();
                        case MetsPackage.SM_LINK_TYPE__TITLE:
                                return getTitle();
                        case MetsPackage.SM_LINK_TYPE__TO:
                                return getTo();
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
                        case MetsPackage.SM_LINK_TYPE__ACTUATE:
                                setActuate((ActuateType)newValue);
                                return;
                        case MetsPackage.SM_LINK_TYPE__ARCROLE:
                                setArcrole((String)newValue);
                                return;
                        case MetsPackage.SM_LINK_TYPE__FROM:
                                setFrom((String)newValue);
                                return;
                        case MetsPackage.SM_LINK_TYPE__ID:
                                setID((String)newValue);
                                return;
                        case MetsPackage.SM_LINK_TYPE__SHOW:
                                setShow((ShowType)newValue);
                                return;
                        case MetsPackage.SM_LINK_TYPE__TITLE:
                                setTitle((String)newValue);
                                return;
                        case MetsPackage.SM_LINK_TYPE__TO:
                                setTo((String)newValue);
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
                        case MetsPackage.SM_LINK_TYPE__ACTUATE:
                                unsetActuate();
                                return;
                        case MetsPackage.SM_LINK_TYPE__ARCROLE:
                                setArcrole(ARCROLE_EDEFAULT);
                                return;
                        case MetsPackage.SM_LINK_TYPE__FROM:
                                setFrom(FROM_EDEFAULT);
                                return;
                        case MetsPackage.SM_LINK_TYPE__ID:
                                setID(ID_EDEFAULT);
                                return;
                        case MetsPackage.SM_LINK_TYPE__SHOW:
                                unsetShow();
                                return;
                        case MetsPackage.SM_LINK_TYPE__TITLE:
                                setTitle(TITLE_EDEFAULT);
                                return;
                        case MetsPackage.SM_LINK_TYPE__TO:
                                setTo(TO_EDEFAULT);
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
                        case MetsPackage.SM_LINK_TYPE__ACTUATE:
                                return isSetActuate();
                        case MetsPackage.SM_LINK_TYPE__ARCROLE:
                                return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
                        case MetsPackage.SM_LINK_TYPE__FROM:
                                return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
                        case MetsPackage.SM_LINK_TYPE__ID:
                                return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
                        case MetsPackage.SM_LINK_TYPE__SHOW:
                                return isSetShow();
                        case MetsPackage.SM_LINK_TYPE__TITLE:
                                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
                        case MetsPackage.SM_LINK_TYPE__TO:
                                return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
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
                result.append(" (actuate: ");
                if (actuateESet) result.append(actuate); else result.append("<unset>");
                result.append(", arcrole: ");
                result.append(arcrole);
                result.append(", from: ");
                result.append(from);
                result.append(", iD: ");
                result.append(iD);
                result.append(", show: ");
                if (showESet) result.append(show); else result.append("<unset>");
                result.append(", title: ");
                result.append(title);
                result.append(", to: ");
                result.append(to);
                result.append(')');
                return result.toString();
        }

} //SmLinkTypeImpl
