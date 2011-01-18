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

import gov.loc.mets.AmdSecType;
import gov.loc.mets.BehaviorSecType;
import gov.loc.mets.FileSecType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MetsHdrType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.MetsType;
import gov.loc.mets.StructLinkType1;
import gov.loc.mets.StructMapType;

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
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.MetsTypeImpl#getMetsHdr <em>Mets Hdr</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsTypeImpl#getDmdSec <em>Dmd Sec</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsTypeImpl#getAmdSec <em>Amd Sec</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsTypeImpl#getFileSec <em>File Sec</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsTypeImpl#getStructMap <em>Struct Map</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsTypeImpl#getStructLink <em>Struct Link</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsTypeImpl#getBehaviorSec <em>Behavior Sec</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsTypeImpl#getLABEL <em>LABEL</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsTypeImpl#getOBJID <em>OBJID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsTypeImpl#getPROFILE <em>PROFILE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetsTypeImpl extends EObjectImpl implements MetsType {
        /**
         * The cached value of the '{@link #getMetsHdr() <em>Mets Hdr</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMetsHdr()
         * @generated
         * @ordered
         */
        protected MetsHdrType metsHdr;

        /**
         * The cached value of the '{@link #getDmdSec() <em>Dmd Sec</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDmdSec()
         * @generated
         * @ordered
         */
        protected EList<MdSecType> dmdSec;

        /**
         * The cached value of the '{@link #getAmdSec() <em>Amd Sec</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getAmdSec()
         * @generated
         * @ordered
         */
        protected EList<AmdSecType> amdSec;

        /**
         * The cached value of the '{@link #getFileSec() <em>File Sec</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFileSec()
         * @generated
         * @ordered
         */
        protected FileSecType fileSec;

        /**
         * The cached value of the '{@link #getStructMap() <em>Struct Map</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getStructMap()
         * @generated
         * @ordered
         */
        protected EList<StructMapType> structMap;

        /**
         * The cached value of the '{@link #getStructLink() <em>Struct Link</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getStructLink()
         * @generated
         * @ordered
         */
        protected StructLinkType1 structLink;

        /**
         * The cached value of the '{@link #getBehaviorSec() <em>Behavior Sec</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBehaviorSec()
         * @generated
         * @ordered
         */
        protected EList<BehaviorSecType> behaviorSec;

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
         * The default value of the '{@link #getLABEL() <em>LABEL</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getLABEL()
         * @generated
         * @ordered
         */
        protected static final String LABEL_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getLABEL() <em>LABEL</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getLABEL()
         * @generated
         * @ordered
         */
        protected String lABEL = LABEL_EDEFAULT;

        /**
         * The default value of the '{@link #getOBJID() <em>OBJID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOBJID()
         * @generated
         * @ordered
         */
        protected static final String OBJID_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getOBJID() <em>OBJID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOBJID()
         * @generated
         * @ordered
         */
        protected String oBJID = OBJID_EDEFAULT;

        /**
         * The default value of the '{@link #getPROFILE() <em>PROFILE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getPROFILE()
         * @generated
         * @ordered
         */
        protected static final String PROFILE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getPROFILE() <em>PROFILE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getPROFILE()
         * @generated
         * @ordered
         */
        protected String pROFILE = PROFILE_EDEFAULT;

        /**
         * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTYPE()
         * @generated
         * @ordered
         */
        protected static final String TYPE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTYPE()
         * @generated
         * @ordered
         */
        protected String tYPE = TYPE_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MetsTypeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return MetsPackage.Literals.METS_TYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MetsHdrType getMetsHdr() {
                return metsHdr;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetMetsHdr(MetsHdrType newMetsHdr, NotificationChain msgs) {
                MetsHdrType oldMetsHdr = metsHdr;
                metsHdr = newMetsHdr;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.METS_TYPE__METS_HDR, oldMetsHdr, newMetsHdr);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMetsHdr(MetsHdrType newMetsHdr) {
                if (newMetsHdr != metsHdr) {
                        NotificationChain msgs = null;
                        if (metsHdr != null)
                                msgs = ((InternalEObject)metsHdr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.METS_TYPE__METS_HDR, null, msgs);
                        if (newMetsHdr != null)
                                msgs = ((InternalEObject)newMetsHdr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.METS_TYPE__METS_HDR, null, msgs);
                        msgs = basicSetMetsHdr(newMetsHdr, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.METS_TYPE__METS_HDR, newMetsHdr, newMetsHdr));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<MdSecType> getDmdSec() {
                if (dmdSec == null) {
                        dmdSec = new EObjectContainmentEList<MdSecType>(MdSecType.class, this, MetsPackage.METS_TYPE__DMD_SEC);
                }
                return dmdSec;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<AmdSecType> getAmdSec() {
                if (amdSec == null) {
                        amdSec = new EObjectContainmentEList<AmdSecType>(AmdSecType.class, this, MetsPackage.METS_TYPE__AMD_SEC);
                }
                return amdSec;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public FileSecType getFileSec() {
                return fileSec;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetFileSec(FileSecType newFileSec, NotificationChain msgs) {
                FileSecType oldFileSec = fileSec;
                fileSec = newFileSec;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.METS_TYPE__FILE_SEC, oldFileSec, newFileSec);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setFileSec(FileSecType newFileSec) {
                if (newFileSec != fileSec) {
                        NotificationChain msgs = null;
                        if (fileSec != null)
                                msgs = ((InternalEObject)fileSec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.METS_TYPE__FILE_SEC, null, msgs);
                        if (newFileSec != null)
                                msgs = ((InternalEObject)newFileSec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.METS_TYPE__FILE_SEC, null, msgs);
                        msgs = basicSetFileSec(newFileSec, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.METS_TYPE__FILE_SEC, newFileSec, newFileSec));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<StructMapType> getStructMap() {
                if (structMap == null) {
                        structMap = new EObjectContainmentEList<StructMapType>(StructMapType.class, this, MetsPackage.METS_TYPE__STRUCT_MAP);
                }
                return structMap;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public StructLinkType1 getStructLink() {
                return structLink;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetStructLink(StructLinkType1 newStructLink, NotificationChain msgs) {
                StructLinkType1 oldStructLink = structLink;
                structLink = newStructLink;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.METS_TYPE__STRUCT_LINK, oldStructLink, newStructLink);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setStructLink(StructLinkType1 newStructLink) {
                if (newStructLink != structLink) {
                        NotificationChain msgs = null;
                        if (structLink != null)
                                msgs = ((InternalEObject)structLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.METS_TYPE__STRUCT_LINK, null, msgs);
                        if (newStructLink != null)
                                msgs = ((InternalEObject)newStructLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.METS_TYPE__STRUCT_LINK, null, msgs);
                        msgs = basicSetStructLink(newStructLink, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.METS_TYPE__STRUCT_LINK, newStructLink, newStructLink));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<BehaviorSecType> getBehaviorSec() {
                if (behaviorSec == null) {
                        behaviorSec = new EObjectContainmentEList<BehaviorSecType>(BehaviorSecType.class, this, MetsPackage.METS_TYPE__BEHAVIOR_SEC);
                }
                return behaviorSec;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.METS_TYPE__ID, oldID, iD));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getLABEL() {
                return lABEL;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setLABEL(String newLABEL) {
                String oldLABEL = lABEL;
                lABEL = newLABEL;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.METS_TYPE__LABEL, oldLABEL, lABEL));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getOBJID() {
                return oBJID;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setOBJID(String newOBJID) {
                String oldOBJID = oBJID;
                oBJID = newOBJID;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.METS_TYPE__OBJID, oldOBJID, oBJID));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getPROFILE() {
                return pROFILE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setPROFILE(String newPROFILE) {
                String oldPROFILE = pROFILE;
                pROFILE = newPROFILE;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.METS_TYPE__PROFILE, oldPROFILE, pROFILE));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getTYPE() {
                return tYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTYPE(String newTYPE) {
                String oldTYPE = tYPE;
                tYPE = newTYPE;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.METS_TYPE__TYPE, oldTYPE, tYPE));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case MetsPackage.METS_TYPE__METS_HDR:
                                return basicSetMetsHdr(null, msgs);
                        case MetsPackage.METS_TYPE__DMD_SEC:
                                return ((InternalEList<?>)getDmdSec()).basicRemove(otherEnd, msgs);
                        case MetsPackage.METS_TYPE__AMD_SEC:
                                return ((InternalEList<?>)getAmdSec()).basicRemove(otherEnd, msgs);
                        case MetsPackage.METS_TYPE__FILE_SEC:
                                return basicSetFileSec(null, msgs);
                        case MetsPackage.METS_TYPE__STRUCT_MAP:
                                return ((InternalEList<?>)getStructMap()).basicRemove(otherEnd, msgs);
                        case MetsPackage.METS_TYPE__STRUCT_LINK:
                                return basicSetStructLink(null, msgs);
                        case MetsPackage.METS_TYPE__BEHAVIOR_SEC:
                                return ((InternalEList<?>)getBehaviorSec()).basicRemove(otherEnd, msgs);
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
                        case MetsPackage.METS_TYPE__METS_HDR:
                                return getMetsHdr();
                        case MetsPackage.METS_TYPE__DMD_SEC:
                                return getDmdSec();
                        case MetsPackage.METS_TYPE__AMD_SEC:
                                return getAmdSec();
                        case MetsPackage.METS_TYPE__FILE_SEC:
                                return getFileSec();
                        case MetsPackage.METS_TYPE__STRUCT_MAP:
                                return getStructMap();
                        case MetsPackage.METS_TYPE__STRUCT_LINK:
                                return getStructLink();
                        case MetsPackage.METS_TYPE__BEHAVIOR_SEC:
                                return getBehaviorSec();
                        case MetsPackage.METS_TYPE__ID:
                                return getID();
                        case MetsPackage.METS_TYPE__LABEL:
                                return getLABEL();
                        case MetsPackage.METS_TYPE__OBJID:
                                return getOBJID();
                        case MetsPackage.METS_TYPE__PROFILE:
                                return getPROFILE();
                        case MetsPackage.METS_TYPE__TYPE:
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
                        case MetsPackage.METS_TYPE__METS_HDR:
                                setMetsHdr((MetsHdrType)newValue);
                                return;
                        case MetsPackage.METS_TYPE__DMD_SEC:
                                getDmdSec().clear();
                                getDmdSec().addAll((Collection<? extends MdSecType>)newValue);
                                return;
                        case MetsPackage.METS_TYPE__AMD_SEC:
                                getAmdSec().clear();
                                getAmdSec().addAll((Collection<? extends AmdSecType>)newValue);
                                return;
                        case MetsPackage.METS_TYPE__FILE_SEC:
                                setFileSec((FileSecType)newValue);
                                return;
                        case MetsPackage.METS_TYPE__STRUCT_MAP:
                                getStructMap().clear();
                                getStructMap().addAll((Collection<? extends StructMapType>)newValue);
                                return;
                        case MetsPackage.METS_TYPE__STRUCT_LINK:
                                setStructLink((StructLinkType1)newValue);
                                return;
                        case MetsPackage.METS_TYPE__BEHAVIOR_SEC:
                                getBehaviorSec().clear();
                                getBehaviorSec().addAll((Collection<? extends BehaviorSecType>)newValue);
                                return;
                        case MetsPackage.METS_TYPE__ID:
                                setID((String)newValue);
                                return;
                        case MetsPackage.METS_TYPE__LABEL:
                                setLABEL((String)newValue);
                                return;
                        case MetsPackage.METS_TYPE__OBJID:
                                setOBJID((String)newValue);
                                return;
                        case MetsPackage.METS_TYPE__PROFILE:
                                setPROFILE((String)newValue);
                                return;
                        case MetsPackage.METS_TYPE__TYPE:
                                setTYPE((String)newValue);
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
                        case MetsPackage.METS_TYPE__METS_HDR:
                                setMetsHdr((MetsHdrType)null);
                                return;
                        case MetsPackage.METS_TYPE__DMD_SEC:
                                getDmdSec().clear();
                                return;
                        case MetsPackage.METS_TYPE__AMD_SEC:
                                getAmdSec().clear();
                                return;
                        case MetsPackage.METS_TYPE__FILE_SEC:
                                setFileSec((FileSecType)null);
                                return;
                        case MetsPackage.METS_TYPE__STRUCT_MAP:
                                getStructMap().clear();
                                return;
                        case MetsPackage.METS_TYPE__STRUCT_LINK:
                                setStructLink((StructLinkType1)null);
                                return;
                        case MetsPackage.METS_TYPE__BEHAVIOR_SEC:
                                getBehaviorSec().clear();
                                return;
                        case MetsPackage.METS_TYPE__ID:
                                setID(ID_EDEFAULT);
                                return;
                        case MetsPackage.METS_TYPE__LABEL:
                                setLABEL(LABEL_EDEFAULT);
                                return;
                        case MetsPackage.METS_TYPE__OBJID:
                                setOBJID(OBJID_EDEFAULT);
                                return;
                        case MetsPackage.METS_TYPE__PROFILE:
                                setPROFILE(PROFILE_EDEFAULT);
                                return;
                        case MetsPackage.METS_TYPE__TYPE:
                                setTYPE(TYPE_EDEFAULT);
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
                        case MetsPackage.METS_TYPE__METS_HDR:
                                return metsHdr != null;
                        case MetsPackage.METS_TYPE__DMD_SEC:
                                return dmdSec != null && !dmdSec.isEmpty();
                        case MetsPackage.METS_TYPE__AMD_SEC:
                                return amdSec != null && !amdSec.isEmpty();
                        case MetsPackage.METS_TYPE__FILE_SEC:
                                return fileSec != null;
                        case MetsPackage.METS_TYPE__STRUCT_MAP:
                                return structMap != null && !structMap.isEmpty();
                        case MetsPackage.METS_TYPE__STRUCT_LINK:
                                return structLink != null;
                        case MetsPackage.METS_TYPE__BEHAVIOR_SEC:
                                return behaviorSec != null && !behaviorSec.isEmpty();
                        case MetsPackage.METS_TYPE__ID:
                                return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
                        case MetsPackage.METS_TYPE__LABEL:
                                return LABEL_EDEFAULT == null ? lABEL != null : !LABEL_EDEFAULT.equals(lABEL);
                        case MetsPackage.METS_TYPE__OBJID:
                                return OBJID_EDEFAULT == null ? oBJID != null : !OBJID_EDEFAULT.equals(oBJID);
                        case MetsPackage.METS_TYPE__PROFILE:
                                return PROFILE_EDEFAULT == null ? pROFILE != null : !PROFILE_EDEFAULT.equals(pROFILE);
                        case MetsPackage.METS_TYPE__TYPE:
                                return TYPE_EDEFAULT == null ? tYPE != null : !TYPE_EDEFAULT.equals(tYPE);
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
                result.append(" (iD: ");
                result.append(iD);
                result.append(", lABEL: ");
                result.append(lABEL);
                result.append(", oBJID: ");
                result.append(oBJID);
                result.append(", pROFILE: ");
                result.append(pROFILE);
                result.append(", tYPE: ");
                result.append(tYPE);
                result.append(')');
                return result.toString();
        }

} //MetsTypeImpl
