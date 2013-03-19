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

import gov.loc.mets.CHECKSUMTYPEType;
import gov.loc.mets.MDTYPEType;
import gov.loc.mets.MdWrapType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.XmlDataType1;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Md Wrap Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.MdWrapTypeImpl#getBinData <em>Bin Data</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdWrapTypeImpl#getXmlData <em>Xml Data</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdWrapTypeImpl#getCHECKSUM <em>CHECKSUM</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdWrapTypeImpl#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdWrapTypeImpl#getCREATED <em>CREATED</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdWrapTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdWrapTypeImpl#getLABEL <em>LABEL</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdWrapTypeImpl#getMDTYPE <em>MDTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdWrapTypeImpl#getMDTYPEVERSION <em>MDTYPEVERSION</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdWrapTypeImpl#getMIMETYPE <em>MIMETYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdWrapTypeImpl#getOTHERMDTYPE <em>OTHERMDTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdWrapTypeImpl#getSIZE <em>SIZE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MdWrapTypeImpl extends EObjectImpl implements MdWrapType {
        /**
	 * The default value of the '{@link #getBinData() <em>Bin Data</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getBinData()
	 * @generated
	 * @ordered
	 */
        protected static final byte[] BIN_DATA_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getBinData() <em>Bin Data</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getBinData()
	 * @generated
	 * @ordered
	 */
        protected byte[] binData = BIN_DATA_EDEFAULT;

        /**
	 * The cached value of the '{@link #getXmlData() <em>Xml Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getXmlData()
	 * @generated
	 * @ordered
	 */
        protected XmlDataType1 xmlData;

        /**
	 * The default value of the '{@link #getCHECKSUM() <em>CHECKSUM</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCHECKSUM()
	 * @generated
	 * @ordered
	 */
        protected static final String CHECKSUM_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getCHECKSUM() <em>CHECKSUM</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCHECKSUM()
	 * @generated
	 * @ordered
	 */
        protected String cHECKSUM = CHECKSUM_EDEFAULT;

        /**
	 * The default value of the '{@link #getCHECKSUMTYPE() <em>CHECKSUMTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCHECKSUMTYPE()
	 * @generated
	 * @ordered
	 */
        protected static final CHECKSUMTYPEType CHECKSUMTYPE_EDEFAULT = CHECKSUMTYPEType.ADLER32;

        /**
	 * The cached value of the '{@link #getCHECKSUMTYPE() <em>CHECKSUMTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCHECKSUMTYPE()
	 * @generated
	 * @ordered
	 */
        protected CHECKSUMTYPEType cHECKSUMTYPE = CHECKSUMTYPE_EDEFAULT;

        /**
	 * This is true if the CHECKSUMTYPE attribute has been set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        protected boolean cHECKSUMTYPEESet;

        /**
	 * The default value of the '{@link #getCREATED() <em>CREATED</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCREATED()
	 * @generated
	 * @ordered
	 */
        protected static final XMLGregorianCalendar CREATED_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getCREATED() <em>CREATED</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCREATED()
	 * @generated
	 * @ordered
	 */
        protected XMLGregorianCalendar cREATED = CREATED_EDEFAULT;

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
	 * The default value of the '{@link #getMDTYPE() <em>MDTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getMDTYPE()
	 * @generated
	 * @ordered
	 */
        protected static final MDTYPEType MDTYPE_EDEFAULT = MDTYPEType.MARC;

        /**
	 * The cached value of the '{@link #getMDTYPE() <em>MDTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getMDTYPE()
	 * @generated
	 * @ordered
	 */
        protected MDTYPEType mDTYPE = MDTYPE_EDEFAULT;

        /**
	 * This is true if the MDTYPE attribute has been set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        protected boolean mDTYPEESet;

        /**
	 * The default value of the '{@link #getMDTYPEVERSION() <em>MDTYPEVERSION</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getMDTYPEVERSION()
	 * @generated
	 * @ordered
	 */
        protected static final String MDTYPEVERSION_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getMDTYPEVERSION() <em>MDTYPEVERSION</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getMDTYPEVERSION()
	 * @generated
	 * @ordered
	 */
        protected String mDTYPEVERSION = MDTYPEVERSION_EDEFAULT;

        /**
	 * The default value of the '{@link #getMIMETYPE() <em>MIMETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getMIMETYPE()
	 * @generated
	 * @ordered
	 */
        protected static final String MIMETYPE_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getMIMETYPE() <em>MIMETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getMIMETYPE()
	 * @generated
	 * @ordered
	 */
        protected String mIMETYPE = MIMETYPE_EDEFAULT;

        /**
	 * The default value of the '{@link #getOTHERMDTYPE() <em>OTHERMDTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getOTHERMDTYPE()
	 * @generated
	 * @ordered
	 */
        protected static final String OTHERMDTYPE_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getOTHERMDTYPE() <em>OTHERMDTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getOTHERMDTYPE()
	 * @generated
	 * @ordered
	 */
        protected String oTHERMDTYPE = OTHERMDTYPE_EDEFAULT;

        /**
	 * The default value of the '{@link #getSIZE() <em>SIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getSIZE()
	 * @generated
	 * @ordered
	 */
        protected static final long SIZE_EDEFAULT = 0L;

        /**
	 * The cached value of the '{@link #getSIZE() <em>SIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getSIZE()
	 * @generated
	 * @ordered
	 */
        protected long sIZE = SIZE_EDEFAULT;

        /**
	 * This is true if the SIZE attribute has been set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        protected boolean sIZEESet;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected MdWrapTypeImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return MetsPackage.Literals.MD_WRAP_TYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public byte[] getBinData() {
		return binData;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setBinData(byte[] newBinData) {
		byte[] oldBinData = binData;
		binData = newBinData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_WRAP_TYPE__BIN_DATA, oldBinData, binData));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public XmlDataType1 getXmlData() {
		return xmlData;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetXmlData(XmlDataType1 newXmlData, NotificationChain msgs) {
		XmlDataType1 oldXmlData = xmlData;
		xmlData = newXmlData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.MD_WRAP_TYPE__XML_DATA, oldXmlData, newXmlData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setXmlData(XmlDataType1 newXmlData) {
		if (newXmlData != xmlData) {
			NotificationChain msgs = null;
			if (xmlData != null)
				msgs = ((InternalEObject)xmlData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.MD_WRAP_TYPE__XML_DATA, null, msgs);
			if (newXmlData != null)
				msgs = ((InternalEObject)newXmlData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.MD_WRAP_TYPE__XML_DATA, null, msgs);
			msgs = basicSetXmlData(newXmlData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_WRAP_TYPE__XML_DATA, newXmlData, newXmlData));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getCHECKSUM() {
		return cHECKSUM;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCHECKSUM(String newCHECKSUM) {
		String oldCHECKSUM = cHECKSUM;
		cHECKSUM = newCHECKSUM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_WRAP_TYPE__CHECKSUM, oldCHECKSUM, cHECKSUM));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CHECKSUMTYPEType getCHECKSUMTYPE() {
		return cHECKSUMTYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCHECKSUMTYPE(CHECKSUMTYPEType newCHECKSUMTYPE) {
		CHECKSUMTYPEType oldCHECKSUMTYPE = cHECKSUMTYPE;
		cHECKSUMTYPE = newCHECKSUMTYPE == null ? CHECKSUMTYPE_EDEFAULT : newCHECKSUMTYPE;
		boolean oldCHECKSUMTYPEESet = cHECKSUMTYPEESet;
		cHECKSUMTYPEESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_WRAP_TYPE__CHECKSUMTYPE, oldCHECKSUMTYPE, cHECKSUMTYPE, !oldCHECKSUMTYPEESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void unsetCHECKSUMTYPE() {
		CHECKSUMTYPEType oldCHECKSUMTYPE = cHECKSUMTYPE;
		boolean oldCHECKSUMTYPEESet = cHECKSUMTYPEESet;
		cHECKSUMTYPE = CHECKSUMTYPE_EDEFAULT;
		cHECKSUMTYPEESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.MD_WRAP_TYPE__CHECKSUMTYPE, oldCHECKSUMTYPE, CHECKSUMTYPE_EDEFAULT, oldCHECKSUMTYPEESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean isSetCHECKSUMTYPE() {
		return cHECKSUMTYPEESet;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public XMLGregorianCalendar getCREATED() {
		return cREATED;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCREATED(XMLGregorianCalendar newCREATED) {
		XMLGregorianCalendar oldCREATED = cREATED;
		cREATED = newCREATED;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_WRAP_TYPE__CREATED, oldCREATED, cREATED));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_WRAP_TYPE__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_WRAP_TYPE__LABEL, oldLABEL, lABEL));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public MDTYPEType getMDTYPE() {
		return mDTYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setMDTYPE(MDTYPEType newMDTYPE) {
		MDTYPEType oldMDTYPE = mDTYPE;
		mDTYPE = newMDTYPE == null ? MDTYPE_EDEFAULT : newMDTYPE;
		boolean oldMDTYPEESet = mDTYPEESet;
		mDTYPEESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_WRAP_TYPE__MDTYPE, oldMDTYPE, mDTYPE, !oldMDTYPEESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void unsetMDTYPE() {
		MDTYPEType oldMDTYPE = mDTYPE;
		boolean oldMDTYPEESet = mDTYPEESet;
		mDTYPE = MDTYPE_EDEFAULT;
		mDTYPEESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.MD_WRAP_TYPE__MDTYPE, oldMDTYPE, MDTYPE_EDEFAULT, oldMDTYPEESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean isSetMDTYPE() {
		return mDTYPEESet;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getMDTYPEVERSION() {
		return mDTYPEVERSION;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setMDTYPEVERSION(String newMDTYPEVERSION) {
		String oldMDTYPEVERSION = mDTYPEVERSION;
		mDTYPEVERSION = newMDTYPEVERSION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_WRAP_TYPE__MDTYPEVERSION, oldMDTYPEVERSION, mDTYPEVERSION));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getMIMETYPE() {
		return mIMETYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setMIMETYPE(String newMIMETYPE) {
		String oldMIMETYPE = mIMETYPE;
		mIMETYPE = newMIMETYPE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_WRAP_TYPE__MIMETYPE, oldMIMETYPE, mIMETYPE));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getOTHERMDTYPE() {
		return oTHERMDTYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setOTHERMDTYPE(String newOTHERMDTYPE) {
		String oldOTHERMDTYPE = oTHERMDTYPE;
		oTHERMDTYPE = newOTHERMDTYPE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_WRAP_TYPE__OTHERMDTYPE, oldOTHERMDTYPE, oTHERMDTYPE));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public long getSIZE() {
		return sIZE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setSIZE(long newSIZE) {
		long oldSIZE = sIZE;
		sIZE = newSIZE;
		boolean oldSIZEESet = sIZEESet;
		sIZEESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_WRAP_TYPE__SIZE, oldSIZE, sIZE, !oldSIZEESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void unsetSIZE() {
		long oldSIZE = sIZE;
		boolean oldSIZEESet = sIZEESet;
		sIZE = SIZE_EDEFAULT;
		sIZEESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.MD_WRAP_TYPE__SIZE, oldSIZE, SIZE_EDEFAULT, oldSIZEESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean isSetSIZE() {
		return sIZEESet;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetsPackage.MD_WRAP_TYPE__XML_DATA:
				return basicSetXmlData(null, msgs);
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
			case MetsPackage.MD_WRAP_TYPE__BIN_DATA:
				return getBinData();
			case MetsPackage.MD_WRAP_TYPE__XML_DATA:
				return getXmlData();
			case MetsPackage.MD_WRAP_TYPE__CHECKSUM:
				return getCHECKSUM();
			case MetsPackage.MD_WRAP_TYPE__CHECKSUMTYPE:
				return getCHECKSUMTYPE();
			case MetsPackage.MD_WRAP_TYPE__CREATED:
				return getCREATED();
			case MetsPackage.MD_WRAP_TYPE__ID:
				return getID();
			case MetsPackage.MD_WRAP_TYPE__LABEL:
				return getLABEL();
			case MetsPackage.MD_WRAP_TYPE__MDTYPE:
				return getMDTYPE();
			case MetsPackage.MD_WRAP_TYPE__MDTYPEVERSION:
				return getMDTYPEVERSION();
			case MetsPackage.MD_WRAP_TYPE__MIMETYPE:
				return getMIMETYPE();
			case MetsPackage.MD_WRAP_TYPE__OTHERMDTYPE:
				return getOTHERMDTYPE();
			case MetsPackage.MD_WRAP_TYPE__SIZE:
				return getSIZE();
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
			case MetsPackage.MD_WRAP_TYPE__BIN_DATA:
				setBinData((byte[])newValue);
				return;
			case MetsPackage.MD_WRAP_TYPE__XML_DATA:
				setXmlData((XmlDataType1)newValue);
				return;
			case MetsPackage.MD_WRAP_TYPE__CHECKSUM:
				setCHECKSUM((String)newValue);
				return;
			case MetsPackage.MD_WRAP_TYPE__CHECKSUMTYPE:
				setCHECKSUMTYPE((CHECKSUMTYPEType)newValue);
				return;
			case MetsPackage.MD_WRAP_TYPE__CREATED:
				setCREATED((XMLGregorianCalendar)newValue);
				return;
			case MetsPackage.MD_WRAP_TYPE__ID:
				setID((String)newValue);
				return;
			case MetsPackage.MD_WRAP_TYPE__LABEL:
				setLABEL((String)newValue);
				return;
			case MetsPackage.MD_WRAP_TYPE__MDTYPE:
				setMDTYPE((MDTYPEType)newValue);
				return;
			case MetsPackage.MD_WRAP_TYPE__MDTYPEVERSION:
				setMDTYPEVERSION((String)newValue);
				return;
			case MetsPackage.MD_WRAP_TYPE__MIMETYPE:
				setMIMETYPE((String)newValue);
				return;
			case MetsPackage.MD_WRAP_TYPE__OTHERMDTYPE:
				setOTHERMDTYPE((String)newValue);
				return;
			case MetsPackage.MD_WRAP_TYPE__SIZE:
				setSIZE((Long)newValue);
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
			case MetsPackage.MD_WRAP_TYPE__BIN_DATA:
				setBinData(BIN_DATA_EDEFAULT);
				return;
			case MetsPackage.MD_WRAP_TYPE__XML_DATA:
				setXmlData((XmlDataType1)null);
				return;
			case MetsPackage.MD_WRAP_TYPE__CHECKSUM:
				setCHECKSUM(CHECKSUM_EDEFAULT);
				return;
			case MetsPackage.MD_WRAP_TYPE__CHECKSUMTYPE:
				unsetCHECKSUMTYPE();
				return;
			case MetsPackage.MD_WRAP_TYPE__CREATED:
				setCREATED(CREATED_EDEFAULT);
				return;
			case MetsPackage.MD_WRAP_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case MetsPackage.MD_WRAP_TYPE__LABEL:
				setLABEL(LABEL_EDEFAULT);
				return;
			case MetsPackage.MD_WRAP_TYPE__MDTYPE:
				unsetMDTYPE();
				return;
			case MetsPackage.MD_WRAP_TYPE__MDTYPEVERSION:
				setMDTYPEVERSION(MDTYPEVERSION_EDEFAULT);
				return;
			case MetsPackage.MD_WRAP_TYPE__MIMETYPE:
				setMIMETYPE(MIMETYPE_EDEFAULT);
				return;
			case MetsPackage.MD_WRAP_TYPE__OTHERMDTYPE:
				setOTHERMDTYPE(OTHERMDTYPE_EDEFAULT);
				return;
			case MetsPackage.MD_WRAP_TYPE__SIZE:
				unsetSIZE();
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
			case MetsPackage.MD_WRAP_TYPE__BIN_DATA:
				return BIN_DATA_EDEFAULT == null ? binData != null : !BIN_DATA_EDEFAULT.equals(binData);
			case MetsPackage.MD_WRAP_TYPE__XML_DATA:
				return xmlData != null;
			case MetsPackage.MD_WRAP_TYPE__CHECKSUM:
				return CHECKSUM_EDEFAULT == null ? cHECKSUM != null : !CHECKSUM_EDEFAULT.equals(cHECKSUM);
			case MetsPackage.MD_WRAP_TYPE__CHECKSUMTYPE:
				return isSetCHECKSUMTYPE();
			case MetsPackage.MD_WRAP_TYPE__CREATED:
				return CREATED_EDEFAULT == null ? cREATED != null : !CREATED_EDEFAULT.equals(cREATED);
			case MetsPackage.MD_WRAP_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MetsPackage.MD_WRAP_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? lABEL != null : !LABEL_EDEFAULT.equals(lABEL);
			case MetsPackage.MD_WRAP_TYPE__MDTYPE:
				return isSetMDTYPE();
			case MetsPackage.MD_WRAP_TYPE__MDTYPEVERSION:
				return MDTYPEVERSION_EDEFAULT == null ? mDTYPEVERSION != null : !MDTYPEVERSION_EDEFAULT.equals(mDTYPEVERSION);
			case MetsPackage.MD_WRAP_TYPE__MIMETYPE:
				return MIMETYPE_EDEFAULT == null ? mIMETYPE != null : !MIMETYPE_EDEFAULT.equals(mIMETYPE);
			case MetsPackage.MD_WRAP_TYPE__OTHERMDTYPE:
				return OTHERMDTYPE_EDEFAULT == null ? oTHERMDTYPE != null : !OTHERMDTYPE_EDEFAULT.equals(oTHERMDTYPE);
			case MetsPackage.MD_WRAP_TYPE__SIZE:
				return isSetSIZE();
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
		result.append(" (binData: ");
		result.append(binData);
		result.append(", cHECKSUM: ");
		result.append(cHECKSUM);
		result.append(", cHECKSUMTYPE: ");
		if (cHECKSUMTYPEESet) result.append(cHECKSUMTYPE); else result.append("<unset>");
		result.append(", cREATED: ");
		result.append(cREATED);
		result.append(", iD: ");
		result.append(iD);
		result.append(", lABEL: ");
		result.append(lABEL);
		result.append(", mDTYPE: ");
		if (mDTYPEESet) result.append(mDTYPE); else result.append("<unset>");
		result.append(", mDTYPEVERSION: ");
		result.append(mDTYPEVERSION);
		result.append(", mIMETYPE: ");
		result.append(mIMETYPE);
		result.append(", oTHERMDTYPE: ");
		result.append(oTHERMDTYPE);
		result.append(", sIZE: ");
		if (sIZEESet) result.append(sIZE); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MdWrapTypeImpl
