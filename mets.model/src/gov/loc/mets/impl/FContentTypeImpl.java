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

import gov.loc.mets.FContentType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.XmlDataType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FContent Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.FContentTypeImpl#getBinData <em>Bin Data</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FContentTypeImpl#getXmlData <em>Xml Data</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FContentTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FContentTypeImpl#getUSE <em>USE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FContentTypeImpl extends EObjectImpl implements FContentType {
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
        protected XmlDataType xmlData;

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
	 * The default value of the '{@link #getUSE() <em>USE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getUSE()
	 * @generated
	 * @ordered
	 */
        protected static final String USE_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getUSE() <em>USE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getUSE()
	 * @generated
	 * @ordered
	 */
        protected String uSE = USE_EDEFAULT;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected FContentTypeImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return MetsPackage.Literals.FCONTENT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FCONTENT_TYPE__BIN_DATA, oldBinData, binData));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public XmlDataType getXmlData() {
		return xmlData;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetXmlData(XmlDataType newXmlData, NotificationChain msgs) {
		XmlDataType oldXmlData = xmlData;
		xmlData = newXmlData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.FCONTENT_TYPE__XML_DATA, oldXmlData, newXmlData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setXmlData(XmlDataType newXmlData) {
		if (newXmlData != xmlData) {
			NotificationChain msgs = null;
			if (xmlData != null)
				msgs = ((InternalEObject)xmlData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.FCONTENT_TYPE__XML_DATA, null, msgs);
			if (newXmlData != null)
				msgs = ((InternalEObject)newXmlData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.FCONTENT_TYPE__XML_DATA, null, msgs);
			msgs = basicSetXmlData(newXmlData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FCONTENT_TYPE__XML_DATA, newXmlData, newXmlData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FCONTENT_TYPE__ID, oldID, iD));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getUSE() {
		return uSE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setUSE(String newUSE) {
		String oldUSE = uSE;
		uSE = newUSE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FCONTENT_TYPE__USE, oldUSE, uSE));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetsPackage.FCONTENT_TYPE__XML_DATA:
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
			case MetsPackage.FCONTENT_TYPE__BIN_DATA:
				return getBinData();
			case MetsPackage.FCONTENT_TYPE__XML_DATA:
				return getXmlData();
			case MetsPackage.FCONTENT_TYPE__ID:
				return getID();
			case MetsPackage.FCONTENT_TYPE__USE:
				return getUSE();
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
			case MetsPackage.FCONTENT_TYPE__BIN_DATA:
				setBinData((byte[])newValue);
				return;
			case MetsPackage.FCONTENT_TYPE__XML_DATA:
				setXmlData((XmlDataType)newValue);
				return;
			case MetsPackage.FCONTENT_TYPE__ID:
				setID((String)newValue);
				return;
			case MetsPackage.FCONTENT_TYPE__USE:
				setUSE((String)newValue);
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
			case MetsPackage.FCONTENT_TYPE__BIN_DATA:
				setBinData(BIN_DATA_EDEFAULT);
				return;
			case MetsPackage.FCONTENT_TYPE__XML_DATA:
				setXmlData((XmlDataType)null);
				return;
			case MetsPackage.FCONTENT_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case MetsPackage.FCONTENT_TYPE__USE:
				setUSE(USE_EDEFAULT);
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
			case MetsPackage.FCONTENT_TYPE__BIN_DATA:
				return BIN_DATA_EDEFAULT == null ? binData != null : !BIN_DATA_EDEFAULT.equals(binData);
			case MetsPackage.FCONTENT_TYPE__XML_DATA:
				return xmlData != null;
			case MetsPackage.FCONTENT_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MetsPackage.FCONTENT_TYPE__USE:
				return USE_EDEFAULT == null ? uSE != null : !USE_EDEFAULT.equals(uSE);
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
		result.append(", iD: ");
		result.append(iD);
		result.append(", uSE: ");
		result.append(uSE);
		result.append(')');
		return result.toString();
	}

} //FContentTypeImpl
