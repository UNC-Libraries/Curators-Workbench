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

import gov.loc.mets.DivType;
import gov.loc.mets.FptrType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.MptrType;

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

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
 * An implementation of the model object '<em><b>Div Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.DivTypeImpl#getMptr <em>Mptr</em>}</li>
 *   <li>{@link gov.loc.mets.impl.DivTypeImpl#getFptr <em>Fptr</em>}</li>
 *   <li>{@link gov.loc.mets.impl.DivTypeImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link gov.loc.mets.impl.DivTypeImpl#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.DivTypeImpl#getCONTENTIDS <em>CONTENTIDS</em>}</li>
 *   <li>{@link gov.loc.mets.impl.DivTypeImpl#getDMDID <em>DMDID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.DivTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.DivTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.loc.mets.impl.DivTypeImpl#getLABEL1 <em>LABEL1</em>}</li>
 *   <li>{@link gov.loc.mets.impl.DivTypeImpl#getORDER <em>ORDER</em>}</li>
 *   <li>{@link gov.loc.mets.impl.DivTypeImpl#getORDERLABEL <em>ORDERLABEL</em>}</li>
 *   <li>{@link gov.loc.mets.impl.DivTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DivTypeImpl extends EObjectImpl implements DivType {
        /**
         * The cached value of the '{@link #getMptr() <em>Mptr</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMptr()
         * @generated
         * @ordered
         */
        protected EList<MptrType> mptr;

        /**
         * The cached value of the '{@link #getFptr() <em>Fptr</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFptr()
         * @generated
         * @ordered
         */
        protected EList<FptrType> fptr;

        /**
         * The cached value of the '{@link #getDiv() <em>Div</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDiv()
         * @generated
         * @ordered
         */
        protected EList<DivType> div;

        /**
         * The default value of the '{@link #getADMID() <em>ADMID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getADMID()
         * @generated
         * @ordered
         */
        protected static final List<String> ADMID_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getADMID() <em>ADMID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getADMID()
         * @generated
         * @ordered
         */
        protected List<String> aDMID = ADMID_EDEFAULT;

        /**
         * The default value of the '{@link #getCONTENTIDS() <em>CONTENTIDS</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCONTENTIDS()
         * @generated
         * @ordered
         */
        protected static final List<String> CONTENTIDS_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getCONTENTIDS() <em>CONTENTIDS</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCONTENTIDS()
         * @generated
         * @ordered
         */
        protected List<String> cONTENTIDS = CONTENTIDS_EDEFAULT;

        /**
         * The default value of the '{@link #getDMDID() <em>DMDID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDMDID()
         * @generated
         * @ordered
         */
        protected static final List<String> DMDID_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getDMDID() <em>DMDID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDMDID()
         * @generated
         * @ordered
         */
        protected List<String> dMDID = DMDID_EDEFAULT;

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
         * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getLabel()
         * @generated
         * @ordered
         */
        protected static final String LABEL_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getLabel()
         * @generated
         * @ordered
         */
        protected String label = LABEL_EDEFAULT;

        /**
         * The default value of the '{@link #getLABEL1() <em>LABEL1</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getLABEL1()
         * @generated
         * @ordered
         */
        protected static final String LABEL1_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getLABEL1() <em>LABEL1</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getLABEL1()
         * @generated
         * @ordered
         */
        protected String lABEL1 = LABEL1_EDEFAULT;

        /**
         * The default value of the '{@link #getORDER() <em>ORDER</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getORDER()
         * @generated
         * @ordered
         */
        protected static final BigInteger ORDER_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getORDER() <em>ORDER</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getORDER()
         * @generated
         * @ordered
         */
        protected BigInteger oRDER = ORDER_EDEFAULT;

        /**
         * The default value of the '{@link #getORDERLABEL() <em>ORDERLABEL</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getORDERLABEL()
         * @generated
         * @ordered
         */
        protected static final String ORDERLABEL_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getORDERLABEL() <em>ORDERLABEL</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getORDERLABEL()
         * @generated
         * @ordered
         */
        protected String oRDERLABEL = ORDERLABEL_EDEFAULT;

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
        protected DivTypeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return MetsPackage.Literals.DIV_TYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<MptrType> getMptr() {
                if (mptr == null) {
                        mptr = new EObjectContainmentEList<MptrType>(MptrType.class, this, MetsPackage.DIV_TYPE__MPTR);
                }
                return mptr;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<FptrType> getFptr() {
                if (fptr == null) {
                        fptr = new EObjectContainmentEList<FptrType>(FptrType.class, this, MetsPackage.DIV_TYPE__FPTR);
                }
                return fptr;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<DivType> getDiv() {
                if (div == null) {
                        div = new EObjectContainmentEList<DivType>(DivType.class, this, MetsPackage.DIV_TYPE__DIV);
                }
                return div;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public List<String> getADMID() {
                return aDMID;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setADMID(List<String> newADMID) {
                List<String> oldADMID = aDMID;
                aDMID = newADMID;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.DIV_TYPE__ADMID, oldADMID, aDMID));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public List<String> getCONTENTIDS() {
                return cONTENTIDS;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setCONTENTIDS(List<String> newCONTENTIDS) {
                List<String> oldCONTENTIDS = cONTENTIDS;
                cONTENTIDS = newCONTENTIDS;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.DIV_TYPE__CONTENTIDS, oldCONTENTIDS, cONTENTIDS));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public List<String> getDMDID() {
                return dMDID;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setDMDID(List<String> newDMDID) {
                List<String> oldDMDID = dMDID;
                dMDID = newDMDID;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.DIV_TYPE__DMDID, oldDMDID, dMDID));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.DIV_TYPE__ID, oldID, iD));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getLabel() {
                return label;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setLabel(String newLabel) {
                String oldLabel = label;
                label = newLabel;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.DIV_TYPE__LABEL, oldLabel, label));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getLABEL1() {
                return lABEL1;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setLABEL1(String newLABEL1) {
                String oldLABEL1 = lABEL1;
                lABEL1 = newLABEL1;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.DIV_TYPE__LABEL1, oldLABEL1, lABEL1));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BigInteger getORDER() {
                return oRDER;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setORDER(BigInteger newORDER) {
                BigInteger oldORDER = oRDER;
                oRDER = newORDER;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.DIV_TYPE__ORDER, oldORDER, oRDER));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getORDERLABEL() {
                return oRDERLABEL;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setORDERLABEL(String newORDERLABEL) {
                String oldORDERLABEL = oRDERLABEL;
                oRDERLABEL = newORDERLABEL;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.DIV_TYPE__ORDERLABEL, oldORDERLABEL, oRDERLABEL));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.DIV_TYPE__TYPE, oldTYPE, tYPE));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case MetsPackage.DIV_TYPE__MPTR:
                                return ((InternalEList<?>)getMptr()).basicRemove(otherEnd, msgs);
                        case MetsPackage.DIV_TYPE__FPTR:
                                return ((InternalEList<?>)getFptr()).basicRemove(otherEnd, msgs);
                        case MetsPackage.DIV_TYPE__DIV:
                                return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
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
                        case MetsPackage.DIV_TYPE__MPTR:
                                return getMptr();
                        case MetsPackage.DIV_TYPE__FPTR:
                                return getFptr();
                        case MetsPackage.DIV_TYPE__DIV:
                                return getDiv();
                        case MetsPackage.DIV_TYPE__ADMID:
                                return getADMID();
                        case MetsPackage.DIV_TYPE__CONTENTIDS:
                                return getCONTENTIDS();
                        case MetsPackage.DIV_TYPE__DMDID:
                                return getDMDID();
                        case MetsPackage.DIV_TYPE__ID:
                                return getID();
                        case MetsPackage.DIV_TYPE__LABEL:
                                return getLabel();
                        case MetsPackage.DIV_TYPE__LABEL1:
                                return getLABEL1();
                        case MetsPackage.DIV_TYPE__ORDER:
                                return getORDER();
                        case MetsPackage.DIV_TYPE__ORDERLABEL:
                                return getORDERLABEL();
                        case MetsPackage.DIV_TYPE__TYPE:
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
                        case MetsPackage.DIV_TYPE__MPTR:
                                getMptr().clear();
                                getMptr().addAll((Collection<? extends MptrType>)newValue);
                                return;
                        case MetsPackage.DIV_TYPE__FPTR:
                                getFptr().clear();
                                getFptr().addAll((Collection<? extends FptrType>)newValue);
                                return;
                        case MetsPackage.DIV_TYPE__DIV:
                                getDiv().clear();
                                getDiv().addAll((Collection<? extends DivType>)newValue);
                                return;
                        case MetsPackage.DIV_TYPE__ADMID:
                                setADMID((List<String>)newValue);
                                return;
                        case MetsPackage.DIV_TYPE__CONTENTIDS:
                                setCONTENTIDS((List<String>)newValue);
                                return;
                        case MetsPackage.DIV_TYPE__DMDID:
                                setDMDID((List<String>)newValue);
                                return;
                        case MetsPackage.DIV_TYPE__ID:
                                setID((String)newValue);
                                return;
                        case MetsPackage.DIV_TYPE__LABEL:
                                setLabel((String)newValue);
                                return;
                        case MetsPackage.DIV_TYPE__LABEL1:
                                setLABEL1((String)newValue);
                                return;
                        case MetsPackage.DIV_TYPE__ORDER:
                                setORDER((BigInteger)newValue);
                                return;
                        case MetsPackage.DIV_TYPE__ORDERLABEL:
                                setORDERLABEL((String)newValue);
                                return;
                        case MetsPackage.DIV_TYPE__TYPE:
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
                        case MetsPackage.DIV_TYPE__MPTR:
                                getMptr().clear();
                                return;
                        case MetsPackage.DIV_TYPE__FPTR:
                                getFptr().clear();
                                return;
                        case MetsPackage.DIV_TYPE__DIV:
                                getDiv().clear();
                                return;
                        case MetsPackage.DIV_TYPE__ADMID:
                                setADMID(ADMID_EDEFAULT);
                                return;
                        case MetsPackage.DIV_TYPE__CONTENTIDS:
                                setCONTENTIDS(CONTENTIDS_EDEFAULT);
                                return;
                        case MetsPackage.DIV_TYPE__DMDID:
                                setDMDID(DMDID_EDEFAULT);
                                return;
                        case MetsPackage.DIV_TYPE__ID:
                                setID(ID_EDEFAULT);
                                return;
                        case MetsPackage.DIV_TYPE__LABEL:
                                setLabel(LABEL_EDEFAULT);
                                return;
                        case MetsPackage.DIV_TYPE__LABEL1:
                                setLABEL1(LABEL1_EDEFAULT);
                                return;
                        case MetsPackage.DIV_TYPE__ORDER:
                                setORDER(ORDER_EDEFAULT);
                                return;
                        case MetsPackage.DIV_TYPE__ORDERLABEL:
                                setORDERLABEL(ORDERLABEL_EDEFAULT);
                                return;
                        case MetsPackage.DIV_TYPE__TYPE:
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
                        case MetsPackage.DIV_TYPE__MPTR:
                                return mptr != null && !mptr.isEmpty();
                        case MetsPackage.DIV_TYPE__FPTR:
                                return fptr != null && !fptr.isEmpty();
                        case MetsPackage.DIV_TYPE__DIV:
                                return div != null && !div.isEmpty();
                        case MetsPackage.DIV_TYPE__ADMID:
                                return ADMID_EDEFAULT == null ? aDMID != null : !ADMID_EDEFAULT.equals(aDMID);
                        case MetsPackage.DIV_TYPE__CONTENTIDS:
                                return CONTENTIDS_EDEFAULT == null ? cONTENTIDS != null : !CONTENTIDS_EDEFAULT.equals(cONTENTIDS);
                        case MetsPackage.DIV_TYPE__DMDID:
                                return DMDID_EDEFAULT == null ? dMDID != null : !DMDID_EDEFAULT.equals(dMDID);
                        case MetsPackage.DIV_TYPE__ID:
                                return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
                        case MetsPackage.DIV_TYPE__LABEL:
                                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
                        case MetsPackage.DIV_TYPE__LABEL1:
                                return LABEL1_EDEFAULT == null ? lABEL1 != null : !LABEL1_EDEFAULT.equals(lABEL1);
                        case MetsPackage.DIV_TYPE__ORDER:
                                return ORDER_EDEFAULT == null ? oRDER != null : !ORDER_EDEFAULT.equals(oRDER);
                        case MetsPackage.DIV_TYPE__ORDERLABEL:
                                return ORDERLABEL_EDEFAULT == null ? oRDERLABEL != null : !ORDERLABEL_EDEFAULT.equals(oRDERLABEL);
                        case MetsPackage.DIV_TYPE__TYPE:
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
                result.append(" (aDMID: ");
                result.append(aDMID);
                result.append(", cONTENTIDS: ");
                result.append(cONTENTIDS);
                result.append(", dMDID: ");
                result.append(dMDID);
                result.append(", iD: ");
                result.append(iD);
                result.append(", label: ");
                result.append(label);
                result.append(", lABEL1: ");
                result.append(lABEL1);
                result.append(", oRDER: ");
                result.append(oRDER);
                result.append(", oRDERLABEL: ");
                result.append(oRDERLABEL);
                result.append(", tYPE: ");
                result.append(tYPE);
                result.append(')');
                return result.toString();
        }

} //DivTypeImpl
