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
import gov.loc.mets.BETYPEType;
import gov.loc.mets.EXTTYPEType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.SHAPEType;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Area Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.AreaTypeImpl#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AreaTypeImpl#getBEGIN <em>BEGIN</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AreaTypeImpl#getBETYPE <em>BETYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AreaTypeImpl#getCONTENTIDS <em>CONTENTIDS</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AreaTypeImpl#getCOORDS <em>COORDS</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AreaTypeImpl#getEND <em>END</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AreaTypeImpl#getEXTENT <em>EXTENT</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AreaTypeImpl#getEXTTYPE <em>EXTTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AreaTypeImpl#getFILEID <em>FILEID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AreaTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AreaTypeImpl#getSHAPE <em>SHAPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AreaTypeImpl extends EObjectImpl implements AreaType {
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
	 * The default value of the '{@link #getBEGIN() <em>BEGIN</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getBEGIN()
	 * @generated
	 * @ordered
	 */
        protected static final String BEGIN_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getBEGIN() <em>BEGIN</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getBEGIN()
	 * @generated
	 * @ordered
	 */
        protected String bEGIN = BEGIN_EDEFAULT;

        /**
	 * The default value of the '{@link #getBETYPE() <em>BETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getBETYPE()
	 * @generated
	 * @ordered
	 */
        protected static final BETYPEType BETYPE_EDEFAULT = BETYPEType.BYTE;

        /**
	 * The cached value of the '{@link #getBETYPE() <em>BETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getBETYPE()
	 * @generated
	 * @ordered
	 */
        protected BETYPEType bETYPE = BETYPE_EDEFAULT;

        /**
	 * This is true if the BETYPE attribute has been set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        protected boolean bETYPEESet;

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
	 * The default value of the '{@link #getCOORDS() <em>COORDS</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCOORDS()
	 * @generated
	 * @ordered
	 */
        protected static final String COORDS_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getCOORDS() <em>COORDS</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCOORDS()
	 * @generated
	 * @ordered
	 */
        protected String cOORDS = COORDS_EDEFAULT;

        /**
	 * The default value of the '{@link #getEND() <em>END</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getEND()
	 * @generated
	 * @ordered
	 */
        protected static final String END_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getEND() <em>END</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getEND()
	 * @generated
	 * @ordered
	 */
        protected String eND = END_EDEFAULT;

        /**
	 * The default value of the '{@link #getEXTENT() <em>EXTENT</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getEXTENT()
	 * @generated
	 * @ordered
	 */
        protected static final String EXTENT_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getEXTENT() <em>EXTENT</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getEXTENT()
	 * @generated
	 * @ordered
	 */
        protected String eXTENT = EXTENT_EDEFAULT;

        /**
	 * The default value of the '{@link #getEXTTYPE() <em>EXTTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getEXTTYPE()
	 * @generated
	 * @ordered
	 */
        protected static final EXTTYPEType EXTTYPE_EDEFAULT = EXTTYPEType.BYTE;

        /**
	 * The cached value of the '{@link #getEXTTYPE() <em>EXTTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getEXTTYPE()
	 * @generated
	 * @ordered
	 */
        protected EXTTYPEType eXTTYPE = EXTTYPE_EDEFAULT;

        /**
	 * This is true if the EXTTYPE attribute has been set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        protected boolean eXTTYPEESet;

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
	 * The default value of the '{@link #getSHAPE() <em>SHAPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getSHAPE()
	 * @generated
	 * @ordered
	 */
        protected static final SHAPEType SHAPE_EDEFAULT = SHAPEType.RECT;

        /**
	 * The cached value of the '{@link #getSHAPE() <em>SHAPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getSHAPE()
	 * @generated
	 * @ordered
	 */
        protected SHAPEType sHAPE = SHAPE_EDEFAULT;

        /**
	 * This is true if the SHAPE attribute has been set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        protected boolean sHAPEESet;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected AreaTypeImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return MetsPackage.Literals.AREA_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AREA_TYPE__ADMID, oldADMID, aDMID));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getBEGIN() {
		return bEGIN;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setBEGIN(String newBEGIN) {
		String oldBEGIN = bEGIN;
		bEGIN = newBEGIN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AREA_TYPE__BEGIN, oldBEGIN, bEGIN));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public BETYPEType getBETYPE() {
		return bETYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setBETYPE(BETYPEType newBETYPE) {
		BETYPEType oldBETYPE = bETYPE;
		bETYPE = newBETYPE == null ? BETYPE_EDEFAULT : newBETYPE;
		boolean oldBETYPEESet = bETYPEESet;
		bETYPEESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AREA_TYPE__BETYPE, oldBETYPE, bETYPE, !oldBETYPEESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void unsetBETYPE() {
		BETYPEType oldBETYPE = bETYPE;
		boolean oldBETYPEESet = bETYPEESet;
		bETYPE = BETYPE_EDEFAULT;
		bETYPEESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.AREA_TYPE__BETYPE, oldBETYPE, BETYPE_EDEFAULT, oldBETYPEESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean isSetBETYPE() {
		return bETYPEESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AREA_TYPE__CONTENTIDS, oldCONTENTIDS, cONTENTIDS));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getCOORDS() {
		return cOORDS;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCOORDS(String newCOORDS) {
		String oldCOORDS = cOORDS;
		cOORDS = newCOORDS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AREA_TYPE__COORDS, oldCOORDS, cOORDS));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getEND() {
		return eND;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setEND(String newEND) {
		String oldEND = eND;
		eND = newEND;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AREA_TYPE__END, oldEND, eND));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getEXTENT() {
		return eXTENT;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setEXTENT(String newEXTENT) {
		String oldEXTENT = eXTENT;
		eXTENT = newEXTENT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AREA_TYPE__EXTENT, oldEXTENT, eXTENT));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EXTTYPEType getEXTTYPE() {
		return eXTTYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setEXTTYPE(EXTTYPEType newEXTTYPE) {
		EXTTYPEType oldEXTTYPE = eXTTYPE;
		eXTTYPE = newEXTTYPE == null ? EXTTYPE_EDEFAULT : newEXTTYPE;
		boolean oldEXTTYPEESet = eXTTYPEESet;
		eXTTYPEESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AREA_TYPE__EXTTYPE, oldEXTTYPE, eXTTYPE, !oldEXTTYPEESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void unsetEXTTYPE() {
		EXTTYPEType oldEXTTYPE = eXTTYPE;
		boolean oldEXTTYPEESet = eXTTYPEESet;
		eXTTYPE = EXTTYPE_EDEFAULT;
		eXTTYPEESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.AREA_TYPE__EXTTYPE, oldEXTTYPE, EXTTYPE_EDEFAULT, oldEXTTYPEESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean isSetEXTTYPE() {
		return eXTTYPEESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AREA_TYPE__FILEID, oldFILEID, fILEID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AREA_TYPE__ID, oldID, iD));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public SHAPEType getSHAPE() {
		return sHAPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setSHAPE(SHAPEType newSHAPE) {
		SHAPEType oldSHAPE = sHAPE;
		sHAPE = newSHAPE == null ? SHAPE_EDEFAULT : newSHAPE;
		boolean oldSHAPEESet = sHAPEESet;
		sHAPEESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AREA_TYPE__SHAPE, oldSHAPE, sHAPE, !oldSHAPEESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void unsetSHAPE() {
		SHAPEType oldSHAPE = sHAPE;
		boolean oldSHAPEESet = sHAPEESet;
		sHAPE = SHAPE_EDEFAULT;
		sHAPEESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.AREA_TYPE__SHAPE, oldSHAPE, SHAPE_EDEFAULT, oldSHAPEESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean isSetSHAPE() {
		return sHAPEESet;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetsPackage.AREA_TYPE__ADMID:
				return getADMID();
			case MetsPackage.AREA_TYPE__BEGIN:
				return getBEGIN();
			case MetsPackage.AREA_TYPE__BETYPE:
				return getBETYPE();
			case MetsPackage.AREA_TYPE__CONTENTIDS:
				return getCONTENTIDS();
			case MetsPackage.AREA_TYPE__COORDS:
				return getCOORDS();
			case MetsPackage.AREA_TYPE__END:
				return getEND();
			case MetsPackage.AREA_TYPE__EXTENT:
				return getEXTENT();
			case MetsPackage.AREA_TYPE__EXTTYPE:
				return getEXTTYPE();
			case MetsPackage.AREA_TYPE__FILEID:
				return getFILEID();
			case MetsPackage.AREA_TYPE__ID:
				return getID();
			case MetsPackage.AREA_TYPE__SHAPE:
				return getSHAPE();
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
			case MetsPackage.AREA_TYPE__ADMID:
				setADMID((List<String>)newValue);
				return;
			case MetsPackage.AREA_TYPE__BEGIN:
				setBEGIN((String)newValue);
				return;
			case MetsPackage.AREA_TYPE__BETYPE:
				setBETYPE((BETYPEType)newValue);
				return;
			case MetsPackage.AREA_TYPE__CONTENTIDS:
				setCONTENTIDS((List<String>)newValue);
				return;
			case MetsPackage.AREA_TYPE__COORDS:
				setCOORDS((String)newValue);
				return;
			case MetsPackage.AREA_TYPE__END:
				setEND((String)newValue);
				return;
			case MetsPackage.AREA_TYPE__EXTENT:
				setEXTENT((String)newValue);
				return;
			case MetsPackage.AREA_TYPE__EXTTYPE:
				setEXTTYPE((EXTTYPEType)newValue);
				return;
			case MetsPackage.AREA_TYPE__FILEID:
				setFILEID((String)newValue);
				return;
			case MetsPackage.AREA_TYPE__ID:
				setID((String)newValue);
				return;
			case MetsPackage.AREA_TYPE__SHAPE:
				setSHAPE((SHAPEType)newValue);
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
			case MetsPackage.AREA_TYPE__ADMID:
				setADMID(ADMID_EDEFAULT);
				return;
			case MetsPackage.AREA_TYPE__BEGIN:
				setBEGIN(BEGIN_EDEFAULT);
				return;
			case MetsPackage.AREA_TYPE__BETYPE:
				unsetBETYPE();
				return;
			case MetsPackage.AREA_TYPE__CONTENTIDS:
				setCONTENTIDS(CONTENTIDS_EDEFAULT);
				return;
			case MetsPackage.AREA_TYPE__COORDS:
				setCOORDS(COORDS_EDEFAULT);
				return;
			case MetsPackage.AREA_TYPE__END:
				setEND(END_EDEFAULT);
				return;
			case MetsPackage.AREA_TYPE__EXTENT:
				setEXTENT(EXTENT_EDEFAULT);
				return;
			case MetsPackage.AREA_TYPE__EXTTYPE:
				unsetEXTTYPE();
				return;
			case MetsPackage.AREA_TYPE__FILEID:
				setFILEID(FILEID_EDEFAULT);
				return;
			case MetsPackage.AREA_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case MetsPackage.AREA_TYPE__SHAPE:
				unsetSHAPE();
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
			case MetsPackage.AREA_TYPE__ADMID:
				return ADMID_EDEFAULT == null ? aDMID != null : !ADMID_EDEFAULT.equals(aDMID);
			case MetsPackage.AREA_TYPE__BEGIN:
				return BEGIN_EDEFAULT == null ? bEGIN != null : !BEGIN_EDEFAULT.equals(bEGIN);
			case MetsPackage.AREA_TYPE__BETYPE:
				return isSetBETYPE();
			case MetsPackage.AREA_TYPE__CONTENTIDS:
				return CONTENTIDS_EDEFAULT == null ? cONTENTIDS != null : !CONTENTIDS_EDEFAULT.equals(cONTENTIDS);
			case MetsPackage.AREA_TYPE__COORDS:
				return COORDS_EDEFAULT == null ? cOORDS != null : !COORDS_EDEFAULT.equals(cOORDS);
			case MetsPackage.AREA_TYPE__END:
				return END_EDEFAULT == null ? eND != null : !END_EDEFAULT.equals(eND);
			case MetsPackage.AREA_TYPE__EXTENT:
				return EXTENT_EDEFAULT == null ? eXTENT != null : !EXTENT_EDEFAULT.equals(eXTENT);
			case MetsPackage.AREA_TYPE__EXTTYPE:
				return isSetEXTTYPE();
			case MetsPackage.AREA_TYPE__FILEID:
				return FILEID_EDEFAULT == null ? fILEID != null : !FILEID_EDEFAULT.equals(fILEID);
			case MetsPackage.AREA_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MetsPackage.AREA_TYPE__SHAPE:
				return isSetSHAPE();
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
		result.append(", bEGIN: ");
		result.append(bEGIN);
		result.append(", bETYPE: ");
		if (bETYPEESet) result.append(bETYPE); else result.append("<unset>");
		result.append(", cONTENTIDS: ");
		result.append(cONTENTIDS);
		result.append(", cOORDS: ");
		result.append(cOORDS);
		result.append(", eND: ");
		result.append(eND);
		result.append(", eXTENT: ");
		result.append(eXTENT);
		result.append(", eXTTYPE: ");
		if (eXTTYPEESet) result.append(eXTTYPE); else result.append("<unset>");
		result.append(", fILEID: ");
		result.append(fILEID);
		result.append(", iD: ");
		result.append(iD);
		result.append(", sHAPE: ");
		if (sHAPEESet) result.append(sHAPE); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AreaTypeImpl
