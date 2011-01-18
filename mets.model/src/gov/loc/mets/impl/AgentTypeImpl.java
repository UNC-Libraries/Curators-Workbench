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

import gov.loc.mets.AgentType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.ROLEType;
import gov.loc.mets.TYPEType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.AgentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AgentTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AgentTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AgentTypeImpl#getOTHERROLE <em>OTHERROLE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AgentTypeImpl#getOTHERTYPE <em>OTHERTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AgentTypeImpl#getROLE <em>ROLE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AgentTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentTypeImpl extends EObjectImpl implements AgentType {
        /**
         * The default value of the '{@link #getName() <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getName()
         * @generated
         * @ordered
         */
        protected static final String NAME_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getName()
         * @generated
         * @ordered
         */
        protected String name = NAME_EDEFAULT;

        /**
         * The cached value of the '{@link #getNote() <em>Note</em>}' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getNote()
         * @generated
         * @ordered
         */
        protected EList<String> note;

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
         * The default value of the '{@link #getOTHERROLE() <em>OTHERROLE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOTHERROLE()
         * @generated
         * @ordered
         */
        protected static final String OTHERROLE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getOTHERROLE() <em>OTHERROLE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOTHERROLE()
         * @generated
         * @ordered
         */
        protected String oTHERROLE = OTHERROLE_EDEFAULT;

        /**
         * The default value of the '{@link #getOTHERTYPE() <em>OTHERTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOTHERTYPE()
         * @generated
         * @ordered
         */
        protected static final String OTHERTYPE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getOTHERTYPE() <em>OTHERTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOTHERTYPE()
         * @generated
         * @ordered
         */
        protected String oTHERTYPE = OTHERTYPE_EDEFAULT;

        /**
         * The default value of the '{@link #getROLE() <em>ROLE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getROLE()
         * @generated
         * @ordered
         */
        protected static final ROLEType ROLE_EDEFAULT = ROLEType.CREATOR;

        /**
         * The cached value of the '{@link #getROLE() <em>ROLE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getROLE()
         * @generated
         * @ordered
         */
        protected ROLEType rOLE = ROLE_EDEFAULT;

        /**
         * This is true if the ROLE attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean rOLEESet;

        /**
         * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTYPE()
         * @generated
         * @ordered
         */
        protected static final TYPEType TYPE_EDEFAULT = TYPEType.INDIVIDUAL;

        /**
         * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTYPE()
         * @generated
         * @ordered
         */
        protected TYPEType tYPE = TYPE_EDEFAULT;

        /**
         * This is true if the TYPE attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean tYPEESet;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected AgentTypeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return MetsPackage.Literals.AGENT_TYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getName() {
                return name;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setName(String newName) {
                String oldName = name;
                name = newName;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AGENT_TYPE__NAME, oldName, name));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<String> getNote() {
                if (note == null) {
                        note = new EDataTypeEList<String>(String.class, this, MetsPackage.AGENT_TYPE__NOTE);
                }
                return note;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AGENT_TYPE__ID, oldID, iD));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getOTHERROLE() {
                return oTHERROLE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setOTHERROLE(String newOTHERROLE) {
                String oldOTHERROLE = oTHERROLE;
                oTHERROLE = newOTHERROLE;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AGENT_TYPE__OTHERROLE, oldOTHERROLE, oTHERROLE));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getOTHERTYPE() {
                return oTHERTYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setOTHERTYPE(String newOTHERTYPE) {
                String oldOTHERTYPE = oTHERTYPE;
                oTHERTYPE = newOTHERTYPE;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AGENT_TYPE__OTHERTYPE, oldOTHERTYPE, oTHERTYPE));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ROLEType getROLE() {
                return rOLE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setROLE(ROLEType newROLE) {
                ROLEType oldROLE = rOLE;
                rOLE = newROLE == null ? ROLE_EDEFAULT : newROLE;
                boolean oldROLEESet = rOLEESet;
                rOLEESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AGENT_TYPE__ROLE, oldROLE, rOLE, !oldROLEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetROLE() {
                ROLEType oldROLE = rOLE;
                boolean oldROLEESet = rOLEESet;
                rOLE = ROLE_EDEFAULT;
                rOLEESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.AGENT_TYPE__ROLE, oldROLE, ROLE_EDEFAULT, oldROLEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetROLE() {
                return rOLEESet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TYPEType getTYPE() {
                return tYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTYPE(TYPEType newTYPE) {
                TYPEType oldTYPE = tYPE;
                tYPE = newTYPE == null ? TYPE_EDEFAULT : newTYPE;
                boolean oldTYPEESet = tYPEESet;
                tYPEESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AGENT_TYPE__TYPE, oldTYPE, tYPE, !oldTYPEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetTYPE() {
                TYPEType oldTYPE = tYPE;
                boolean oldTYPEESet = tYPEESet;
                tYPE = TYPE_EDEFAULT;
                tYPEESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.AGENT_TYPE__TYPE, oldTYPE, TYPE_EDEFAULT, oldTYPEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetTYPE() {
                return tYPEESet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case MetsPackage.AGENT_TYPE__NAME:
                                return getName();
                        case MetsPackage.AGENT_TYPE__NOTE:
                                return getNote();
                        case MetsPackage.AGENT_TYPE__ID:
                                return getID();
                        case MetsPackage.AGENT_TYPE__OTHERROLE:
                                return getOTHERROLE();
                        case MetsPackage.AGENT_TYPE__OTHERTYPE:
                                return getOTHERTYPE();
                        case MetsPackage.AGENT_TYPE__ROLE:
                                return getROLE();
                        case MetsPackage.AGENT_TYPE__TYPE:
                                return getTYPE();
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
                        case MetsPackage.AGENT_TYPE__NAME:
                                setName((String)newValue);
                                return;
                        case MetsPackage.AGENT_TYPE__NOTE:
                                getNote().clear();
                                getNote().addAll((Collection<? extends String>)newValue);
                                return;
                        case MetsPackage.AGENT_TYPE__ID:
                                setID((String)newValue);
                                return;
                        case MetsPackage.AGENT_TYPE__OTHERROLE:
                                setOTHERROLE((String)newValue);
                                return;
                        case MetsPackage.AGENT_TYPE__OTHERTYPE:
                                setOTHERTYPE((String)newValue);
                                return;
                        case MetsPackage.AGENT_TYPE__ROLE:
                                setROLE((ROLEType)newValue);
                                return;
                        case MetsPackage.AGENT_TYPE__TYPE:
                                setTYPE((TYPEType)newValue);
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
                        case MetsPackage.AGENT_TYPE__NAME:
                                setName(NAME_EDEFAULT);
                                return;
                        case MetsPackage.AGENT_TYPE__NOTE:
                                getNote().clear();
                                return;
                        case MetsPackage.AGENT_TYPE__ID:
                                setID(ID_EDEFAULT);
                                return;
                        case MetsPackage.AGENT_TYPE__OTHERROLE:
                                setOTHERROLE(OTHERROLE_EDEFAULT);
                                return;
                        case MetsPackage.AGENT_TYPE__OTHERTYPE:
                                setOTHERTYPE(OTHERTYPE_EDEFAULT);
                                return;
                        case MetsPackage.AGENT_TYPE__ROLE:
                                unsetROLE();
                                return;
                        case MetsPackage.AGENT_TYPE__TYPE:
                                unsetTYPE();
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
                        case MetsPackage.AGENT_TYPE__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                        case MetsPackage.AGENT_TYPE__NOTE:
                                return note != null && !note.isEmpty();
                        case MetsPackage.AGENT_TYPE__ID:
                                return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
                        case MetsPackage.AGENT_TYPE__OTHERROLE:
                                return OTHERROLE_EDEFAULT == null ? oTHERROLE != null : !OTHERROLE_EDEFAULT.equals(oTHERROLE);
                        case MetsPackage.AGENT_TYPE__OTHERTYPE:
                                return OTHERTYPE_EDEFAULT == null ? oTHERTYPE != null : !OTHERTYPE_EDEFAULT.equals(oTHERTYPE);
                        case MetsPackage.AGENT_TYPE__ROLE:
                                return isSetROLE();
                        case MetsPackage.AGENT_TYPE__TYPE:
                                return isSetTYPE();
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
                result.append(" (name: ");
                result.append(name);
                result.append(", note: ");
                result.append(note);
                result.append(", iD: ");
                result.append(iD);
                result.append(", oTHERROLE: ");
                result.append(oTHERROLE);
                result.append(", oTHERTYPE: ");
                result.append(oTHERTYPE);
                result.append(", rOLE: ");
                if (rOLEESet) result.append(rOLE); else result.append("<unset>");
                result.append(", tYPE: ");
                if (tYPEESet) result.append(tYPE); else result.append("<unset>");
                result.append(')');
                return result.toString();
        }

} //AgentTypeImpl
