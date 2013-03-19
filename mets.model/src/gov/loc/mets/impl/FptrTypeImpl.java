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

import gov.loc.mets.AreaType;
import gov.loc.mets.FptrType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.ParType;
import gov.loc.mets.SeqType;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fptr Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.FptrTypeImpl#getPar <em>Par</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FptrTypeImpl#getSeq <em>Seq</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FptrTypeImpl#getArea <em>Area</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FptrTypeImpl#getCONTENTIDS <em>CONTENTIDS</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FptrTypeImpl#getFILEID <em>FILEID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FptrTypeImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FptrTypeImpl extends EObjectImpl implements FptrType {
        /**
	 * The cached value of the '{@link #getPar() <em>Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getPar()
	 * @generated
	 * @ordered
	 */
        protected ParType par;

        /**
	 * The cached value of the '{@link #getSeq() <em>Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getSeq()
	 * @generated
	 * @ordered
	 */
        protected SeqType seq;

        /**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
        protected AreaType area;

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
	 * The default value of the '{@link #getFILEID() <em>FILEID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getFILEID()
	 * @generated
	 * @ordered
	 */
        protected static final String FILEID_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getFILEID() <em>FILEID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getFILEID()
	 * @generated
	 * @ordered
	 */
        protected String fILEID = FILEID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected FptrTypeImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return MetsPackage.Literals.FPTR_TYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ParType getPar() {
		return par;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetPar(ParType newPar, NotificationChain msgs) {
		ParType oldPar = par;
		par = newPar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.FPTR_TYPE__PAR, oldPar, newPar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setPar(ParType newPar) {
		if (newPar != par) {
			NotificationChain msgs = null;
			if (par != null)
				msgs = ((InternalEObject)par).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.FPTR_TYPE__PAR, null, msgs);
			if (newPar != null)
				msgs = ((InternalEObject)newPar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.FPTR_TYPE__PAR, null, msgs);
			msgs = basicSetPar(newPar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FPTR_TYPE__PAR, newPar, newPar));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public SeqType getSeq() {
		return seq;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetSeq(SeqType newSeq, NotificationChain msgs) {
		SeqType oldSeq = seq;
		seq = newSeq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.FPTR_TYPE__SEQ, oldSeq, newSeq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setSeq(SeqType newSeq) {
		if (newSeq != seq) {
			NotificationChain msgs = null;
			if (seq != null)
				msgs = ((InternalEObject)seq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.FPTR_TYPE__SEQ, null, msgs);
			if (newSeq != null)
				msgs = ((InternalEObject)newSeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.FPTR_TYPE__SEQ, null, msgs);
			msgs = basicSetSeq(newSeq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FPTR_TYPE__SEQ, newSeq, newSeq));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public AreaType getArea() {
		return area;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetArea(AreaType newArea, NotificationChain msgs) {
		AreaType oldArea = area;
		area = newArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.FPTR_TYPE__AREA, oldArea, newArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setArea(AreaType newArea) {
		if (newArea != area) {
			NotificationChain msgs = null;
			if (area != null)
				msgs = ((InternalEObject)area).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.FPTR_TYPE__AREA, null, msgs);
			if (newArea != null)
				msgs = ((InternalEObject)newArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.FPTR_TYPE__AREA, null, msgs);
			msgs = basicSetArea(newArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FPTR_TYPE__AREA, newArea, newArea));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FPTR_TYPE__CONTENTIDS, oldCONTENTIDS, cONTENTIDS));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getFILEID() {
		return fILEID;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setFILEID(String newFILEID) {
		String oldFILEID = fILEID;
		fILEID = newFILEID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FPTR_TYPE__FILEID, oldFILEID, fILEID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FPTR_TYPE__ID, oldID, iD));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetsPackage.FPTR_TYPE__PAR:
				return basicSetPar(null, msgs);
			case MetsPackage.FPTR_TYPE__SEQ:
				return basicSetSeq(null, msgs);
			case MetsPackage.FPTR_TYPE__AREA:
				return basicSetArea(null, msgs);
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
			case MetsPackage.FPTR_TYPE__PAR:
				return getPar();
			case MetsPackage.FPTR_TYPE__SEQ:
				return getSeq();
			case MetsPackage.FPTR_TYPE__AREA:
				return getArea();
			case MetsPackage.FPTR_TYPE__CONTENTIDS:
				return getCONTENTIDS();
			case MetsPackage.FPTR_TYPE__FILEID:
				return getFILEID();
			case MetsPackage.FPTR_TYPE__ID:
				return getID();
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
			case MetsPackage.FPTR_TYPE__PAR:
				setPar((ParType)newValue);
				return;
			case MetsPackage.FPTR_TYPE__SEQ:
				setSeq((SeqType)newValue);
				return;
			case MetsPackage.FPTR_TYPE__AREA:
				setArea((AreaType)newValue);
				return;
			case MetsPackage.FPTR_TYPE__CONTENTIDS:
				setCONTENTIDS((List<String>)newValue);
				return;
			case MetsPackage.FPTR_TYPE__FILEID:
				setFILEID((String)newValue);
				return;
			case MetsPackage.FPTR_TYPE__ID:
				setID((String)newValue);
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
			case MetsPackage.FPTR_TYPE__PAR:
				setPar((ParType)null);
				return;
			case MetsPackage.FPTR_TYPE__SEQ:
				setSeq((SeqType)null);
				return;
			case MetsPackage.FPTR_TYPE__AREA:
				setArea((AreaType)null);
				return;
			case MetsPackage.FPTR_TYPE__CONTENTIDS:
				setCONTENTIDS(CONTENTIDS_EDEFAULT);
				return;
			case MetsPackage.FPTR_TYPE__FILEID:
				setFILEID(FILEID_EDEFAULT);
				return;
			case MetsPackage.FPTR_TYPE__ID:
				setID(ID_EDEFAULT);
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
			case MetsPackage.FPTR_TYPE__PAR:
				return par != null;
			case MetsPackage.FPTR_TYPE__SEQ:
				return seq != null;
			case MetsPackage.FPTR_TYPE__AREA:
				return area != null;
			case MetsPackage.FPTR_TYPE__CONTENTIDS:
				return CONTENTIDS_EDEFAULT == null ? cONTENTIDS != null : !CONTENTIDS_EDEFAULT.equals(cONTENTIDS);
			case MetsPackage.FPTR_TYPE__FILEID:
				return FILEID_EDEFAULT == null ? fILEID != null : !FILEID_EDEFAULT.equals(fILEID);
			case MetsPackage.FPTR_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
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
		result.append(" (cONTENTIDS: ");
		result.append(cONTENTIDS);
		result.append(", fILEID: ");
		result.append(fILEID);
		result.append(", iD: ");
		result.append(iD);
		result.append(')');
		return result.toString();
	}

} //FptrTypeImpl
