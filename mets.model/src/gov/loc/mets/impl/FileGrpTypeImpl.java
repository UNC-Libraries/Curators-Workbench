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

import gov.loc.mets.FileGrpType;
import gov.loc.mets.FileType;
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
 * An implementation of the model object '<em><b>File Grp Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.FileGrpTypeImpl#getFileGrp <em>File Grp</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileGrpTypeImpl#getFile <em>File</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileGrpTypeImpl#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileGrpTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileGrpTypeImpl#getUSE <em>USE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileGrpTypeImpl#getVERSDATE <em>VERSDATE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileGrpTypeImpl extends EObjectImpl implements FileGrpType {
        /**
	 * The cached value of the '{@link #getFileGrp() <em>File Grp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getFileGrp()
	 * @generated
	 * @ordered
	 */
        protected EList<FileGrpType> fileGrp;

        /**
	 * The cached value of the '{@link #getFile() <em>File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
        protected EList<FileType> file;

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
	 * The default value of the '{@link #getVERSDATE() <em>VERSDATE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getVERSDATE()
	 * @generated
	 * @ordered
	 */
        protected static final XMLGregorianCalendar VERSDATE_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getVERSDATE() <em>VERSDATE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getVERSDATE()
	 * @generated
	 * @ordered
	 */
        protected XMLGregorianCalendar vERSDATE = VERSDATE_EDEFAULT;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected FileGrpTypeImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return MetsPackage.Literals.FILE_GRP_TYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<FileGrpType> getFileGrp() {
		if (fileGrp == null) {
			fileGrp = new EObjectContainmentEList<FileGrpType>(FileGrpType.class, this, MetsPackage.FILE_GRP_TYPE__FILE_GRP);
		}
		return fileGrp;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<FileType> getFile() {
		if (file == null) {
			file = new EObjectContainmentEList<FileType>(FileType.class, this, MetsPackage.FILE_GRP_TYPE__FILE);
		}
		return file;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_GRP_TYPE__ADMID, oldADMID, aDMID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_GRP_TYPE__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_GRP_TYPE__USE, oldUSE, uSE));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public XMLGregorianCalendar getVERSDATE() {
		return vERSDATE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setVERSDATE(XMLGregorianCalendar newVERSDATE) {
		XMLGregorianCalendar oldVERSDATE = vERSDATE;
		vERSDATE = newVERSDATE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_GRP_TYPE__VERSDATE, oldVERSDATE, vERSDATE));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetsPackage.FILE_GRP_TYPE__FILE_GRP:
				return ((InternalEList<?>)getFileGrp()).basicRemove(otherEnd, msgs);
			case MetsPackage.FILE_GRP_TYPE__FILE:
				return ((InternalEList<?>)getFile()).basicRemove(otherEnd, msgs);
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
			case MetsPackage.FILE_GRP_TYPE__FILE_GRP:
				return getFileGrp();
			case MetsPackage.FILE_GRP_TYPE__FILE:
				return getFile();
			case MetsPackage.FILE_GRP_TYPE__ADMID:
				return getADMID();
			case MetsPackage.FILE_GRP_TYPE__ID:
				return getID();
			case MetsPackage.FILE_GRP_TYPE__USE:
				return getUSE();
			case MetsPackage.FILE_GRP_TYPE__VERSDATE:
				return getVERSDATE();
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
			case MetsPackage.FILE_GRP_TYPE__FILE_GRP:
				getFileGrp().clear();
				getFileGrp().addAll((Collection<? extends FileGrpType>)newValue);
				return;
			case MetsPackage.FILE_GRP_TYPE__FILE:
				getFile().clear();
				getFile().addAll((Collection<? extends FileType>)newValue);
				return;
			case MetsPackage.FILE_GRP_TYPE__ADMID:
				setADMID((List<String>)newValue);
				return;
			case MetsPackage.FILE_GRP_TYPE__ID:
				setID((String)newValue);
				return;
			case MetsPackage.FILE_GRP_TYPE__USE:
				setUSE((String)newValue);
				return;
			case MetsPackage.FILE_GRP_TYPE__VERSDATE:
				setVERSDATE((XMLGregorianCalendar)newValue);
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
			case MetsPackage.FILE_GRP_TYPE__FILE_GRP:
				getFileGrp().clear();
				return;
			case MetsPackage.FILE_GRP_TYPE__FILE:
				getFile().clear();
				return;
			case MetsPackage.FILE_GRP_TYPE__ADMID:
				setADMID(ADMID_EDEFAULT);
				return;
			case MetsPackage.FILE_GRP_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case MetsPackage.FILE_GRP_TYPE__USE:
				setUSE(USE_EDEFAULT);
				return;
			case MetsPackage.FILE_GRP_TYPE__VERSDATE:
				setVERSDATE(VERSDATE_EDEFAULT);
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
			case MetsPackage.FILE_GRP_TYPE__FILE_GRP:
				return fileGrp != null && !fileGrp.isEmpty();
			case MetsPackage.FILE_GRP_TYPE__FILE:
				return file != null && !file.isEmpty();
			case MetsPackage.FILE_GRP_TYPE__ADMID:
				return ADMID_EDEFAULT == null ? aDMID != null : !ADMID_EDEFAULT.equals(aDMID);
			case MetsPackage.FILE_GRP_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MetsPackage.FILE_GRP_TYPE__USE:
				return USE_EDEFAULT == null ? uSE != null : !USE_EDEFAULT.equals(uSE);
			case MetsPackage.FILE_GRP_TYPE__VERSDATE:
				return VERSDATE_EDEFAULT == null ? vERSDATE != null : !VERSDATE_EDEFAULT.equals(vERSDATE);
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
		result.append(", iD: ");
		result.append(iD);
		result.append(", uSE: ");
		result.append(uSE);
		result.append(", vERSDATE: ");
		result.append(vERSDATE);
		result.append(')');
		return result.toString();
	}

} //FileGrpTypeImpl
