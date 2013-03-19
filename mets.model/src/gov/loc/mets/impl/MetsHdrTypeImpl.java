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
import gov.loc.mets.AltRecordIDType;
import gov.loc.mets.MetsDocumentIDType;
import gov.loc.mets.MetsHdrType;
import gov.loc.mets.MetsPackage;

import java.util.Collection;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Hdr Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.MetsHdrTypeImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsHdrTypeImpl#getAltRecordID <em>Alt Record ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsHdrTypeImpl#getMetsDocumentID <em>Mets Document ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsHdrTypeImpl#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsHdrTypeImpl#getCREATEDATE <em>CREATEDATE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsHdrTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsHdrTypeImpl#getLASTMODDATE <em>LASTMODDATE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MetsHdrTypeImpl#getRECORDSTATUS <em>RECORDSTATUS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetsHdrTypeImpl extends EObjectImpl implements MetsHdrType {
        /**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
        protected EList<AgentType> agent;

        /**
	 * The cached value of the '{@link #getAltRecordID() <em>Alt Record ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getAltRecordID()
	 * @generated
	 * @ordered
	 */
        protected EList<AltRecordIDType> altRecordID;

        /**
	 * The cached value of the '{@link #getMetsDocumentID() <em>Mets Document ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getMetsDocumentID()
	 * @generated
	 * @ordered
	 */
        protected MetsDocumentIDType metsDocumentID;

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
	 * The default value of the '{@link #getCREATEDATE() <em>CREATEDATE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCREATEDATE()
	 * @generated
	 * @ordered
	 */
        protected static final XMLGregorianCalendar CREATEDATE_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getCREATEDATE() <em>CREATEDATE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCREATEDATE()
	 * @generated
	 * @ordered
	 */
        protected XMLGregorianCalendar cREATEDATE = CREATEDATE_EDEFAULT;

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
	 * The default value of the '{@link #getLASTMODDATE() <em>LASTMODDATE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getLASTMODDATE()
	 * @generated
	 * @ordered
	 */
        protected static final XMLGregorianCalendar LASTMODDATE_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getLASTMODDATE() <em>LASTMODDATE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getLASTMODDATE()
	 * @generated
	 * @ordered
	 */
        protected XMLGregorianCalendar lASTMODDATE = LASTMODDATE_EDEFAULT;

        /**
	 * The default value of the '{@link #getRECORDSTATUS() <em>RECORDSTATUS</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getRECORDSTATUS()
	 * @generated
	 * @ordered
	 */
        protected static final String RECORDSTATUS_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getRECORDSTATUS() <em>RECORDSTATUS</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getRECORDSTATUS()
	 * @generated
	 * @ordered
	 */
        protected String rECORDSTATUS = RECORDSTATUS_EDEFAULT;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected MetsHdrTypeImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return MetsPackage.Literals.METS_HDR_TYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<AgentType> getAgent() {
		if (agent == null) {
			agent = new EObjectContainmentEList<AgentType>(AgentType.class, this, MetsPackage.METS_HDR_TYPE__AGENT);
		}
		return agent;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<AltRecordIDType> getAltRecordID() {
		if (altRecordID == null) {
			altRecordID = new EObjectContainmentEList<AltRecordIDType>(AltRecordIDType.class, this, MetsPackage.METS_HDR_TYPE__ALT_RECORD_ID);
		}
		return altRecordID;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public MetsDocumentIDType getMetsDocumentID() {
		return metsDocumentID;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetMetsDocumentID(MetsDocumentIDType newMetsDocumentID, NotificationChain msgs) {
		MetsDocumentIDType oldMetsDocumentID = metsDocumentID;
		metsDocumentID = newMetsDocumentID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.METS_HDR_TYPE__METS_DOCUMENT_ID, oldMetsDocumentID, newMetsDocumentID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setMetsDocumentID(MetsDocumentIDType newMetsDocumentID) {
		if (newMetsDocumentID != metsDocumentID) {
			NotificationChain msgs = null;
			if (metsDocumentID != null)
				msgs = ((InternalEObject)metsDocumentID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.METS_HDR_TYPE__METS_DOCUMENT_ID, null, msgs);
			if (newMetsDocumentID != null)
				msgs = ((InternalEObject)newMetsDocumentID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.METS_HDR_TYPE__METS_DOCUMENT_ID, null, msgs);
			msgs = basicSetMetsDocumentID(newMetsDocumentID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.METS_HDR_TYPE__METS_DOCUMENT_ID, newMetsDocumentID, newMetsDocumentID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.METS_HDR_TYPE__ADMID, oldADMID, aDMID));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public XMLGregorianCalendar getCREATEDATE() {
		return cREATEDATE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCREATEDATE(XMLGregorianCalendar newCREATEDATE) {
		XMLGregorianCalendar oldCREATEDATE = cREATEDATE;
		cREATEDATE = newCREATEDATE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.METS_HDR_TYPE__CREATEDATE, oldCREATEDATE, cREATEDATE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.METS_HDR_TYPE__ID, oldID, iD));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public XMLGregorianCalendar getLASTMODDATE() {
		return lASTMODDATE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setLASTMODDATE(XMLGregorianCalendar newLASTMODDATE) {
		XMLGregorianCalendar oldLASTMODDATE = lASTMODDATE;
		lASTMODDATE = newLASTMODDATE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.METS_HDR_TYPE__LASTMODDATE, oldLASTMODDATE, lASTMODDATE));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getRECORDSTATUS() {
		return rECORDSTATUS;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setRECORDSTATUS(String newRECORDSTATUS) {
		String oldRECORDSTATUS = rECORDSTATUS;
		rECORDSTATUS = newRECORDSTATUS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.METS_HDR_TYPE__RECORDSTATUS, oldRECORDSTATUS, rECORDSTATUS));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetsPackage.METS_HDR_TYPE__AGENT:
				return ((InternalEList<?>)getAgent()).basicRemove(otherEnd, msgs);
			case MetsPackage.METS_HDR_TYPE__ALT_RECORD_ID:
				return ((InternalEList<?>)getAltRecordID()).basicRemove(otherEnd, msgs);
			case MetsPackage.METS_HDR_TYPE__METS_DOCUMENT_ID:
				return basicSetMetsDocumentID(null, msgs);
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
			case MetsPackage.METS_HDR_TYPE__AGENT:
				return getAgent();
			case MetsPackage.METS_HDR_TYPE__ALT_RECORD_ID:
				return getAltRecordID();
			case MetsPackage.METS_HDR_TYPE__METS_DOCUMENT_ID:
				return getMetsDocumentID();
			case MetsPackage.METS_HDR_TYPE__ADMID:
				return getADMID();
			case MetsPackage.METS_HDR_TYPE__CREATEDATE:
				return getCREATEDATE();
			case MetsPackage.METS_HDR_TYPE__ID:
				return getID();
			case MetsPackage.METS_HDR_TYPE__LASTMODDATE:
				return getLASTMODDATE();
			case MetsPackage.METS_HDR_TYPE__RECORDSTATUS:
				return getRECORDSTATUS();
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
			case MetsPackage.METS_HDR_TYPE__AGENT:
				getAgent().clear();
				getAgent().addAll((Collection<? extends AgentType>)newValue);
				return;
			case MetsPackage.METS_HDR_TYPE__ALT_RECORD_ID:
				getAltRecordID().clear();
				getAltRecordID().addAll((Collection<? extends AltRecordIDType>)newValue);
				return;
			case MetsPackage.METS_HDR_TYPE__METS_DOCUMENT_ID:
				setMetsDocumentID((MetsDocumentIDType)newValue);
				return;
			case MetsPackage.METS_HDR_TYPE__ADMID:
				setADMID((List<String>)newValue);
				return;
			case MetsPackage.METS_HDR_TYPE__CREATEDATE:
				setCREATEDATE((XMLGregorianCalendar)newValue);
				return;
			case MetsPackage.METS_HDR_TYPE__ID:
				setID((String)newValue);
				return;
			case MetsPackage.METS_HDR_TYPE__LASTMODDATE:
				setLASTMODDATE((XMLGregorianCalendar)newValue);
				return;
			case MetsPackage.METS_HDR_TYPE__RECORDSTATUS:
				setRECORDSTATUS((String)newValue);
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
			case MetsPackage.METS_HDR_TYPE__AGENT:
				getAgent().clear();
				return;
			case MetsPackage.METS_HDR_TYPE__ALT_RECORD_ID:
				getAltRecordID().clear();
				return;
			case MetsPackage.METS_HDR_TYPE__METS_DOCUMENT_ID:
				setMetsDocumentID((MetsDocumentIDType)null);
				return;
			case MetsPackage.METS_HDR_TYPE__ADMID:
				setADMID(ADMID_EDEFAULT);
				return;
			case MetsPackage.METS_HDR_TYPE__CREATEDATE:
				setCREATEDATE(CREATEDATE_EDEFAULT);
				return;
			case MetsPackage.METS_HDR_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case MetsPackage.METS_HDR_TYPE__LASTMODDATE:
				setLASTMODDATE(LASTMODDATE_EDEFAULT);
				return;
			case MetsPackage.METS_HDR_TYPE__RECORDSTATUS:
				setRECORDSTATUS(RECORDSTATUS_EDEFAULT);
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
			case MetsPackage.METS_HDR_TYPE__AGENT:
				return agent != null && !agent.isEmpty();
			case MetsPackage.METS_HDR_TYPE__ALT_RECORD_ID:
				return altRecordID != null && !altRecordID.isEmpty();
			case MetsPackage.METS_HDR_TYPE__METS_DOCUMENT_ID:
				return metsDocumentID != null;
			case MetsPackage.METS_HDR_TYPE__ADMID:
				return ADMID_EDEFAULT == null ? aDMID != null : !ADMID_EDEFAULT.equals(aDMID);
			case MetsPackage.METS_HDR_TYPE__CREATEDATE:
				return CREATEDATE_EDEFAULT == null ? cREATEDATE != null : !CREATEDATE_EDEFAULT.equals(cREATEDATE);
			case MetsPackage.METS_HDR_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MetsPackage.METS_HDR_TYPE__LASTMODDATE:
				return LASTMODDATE_EDEFAULT == null ? lASTMODDATE != null : !LASTMODDATE_EDEFAULT.equals(lASTMODDATE);
			case MetsPackage.METS_HDR_TYPE__RECORDSTATUS:
				return RECORDSTATUS_EDEFAULT == null ? rECORDSTATUS != null : !RECORDSTATUS_EDEFAULT.equals(rECORDSTATUS);
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
		result.append(", cREATEDATE: ");
		result.append(cREATEDATE);
		result.append(", iD: ");
		result.append(iD);
		result.append(", lASTMODDATE: ");
		result.append(lASTMODDATE);
		result.append(", rECORDSTATUS: ");
		result.append(rECORDSTATUS);
		result.append(')');
		return result.toString();
	}

} //MetsHdrTypeImpl
