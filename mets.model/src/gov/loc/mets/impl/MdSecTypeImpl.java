/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.MdRefType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MdWrapType;
import gov.loc.mets.MetsPackage;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Md Sec Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.MdSecTypeImpl#getMdRef <em>Md Ref</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdSecTypeImpl#getMdWrap <em>Md Wrap</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdSecTypeImpl#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdSecTypeImpl#getCREATED <em>CREATED</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdSecTypeImpl#getGROUPID <em>GROUPID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdSecTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdSecTypeImpl#getSTATUS <em>STATUS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MdSecTypeImpl extends EObjectImpl implements MdSecType {
        /**
	 * The cached value of the '{@link #getMdRef() <em>Md Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getMdRef()
	 * @generated
	 * @ordered
	 */
        protected MdRefType mdRef;

        /**
	 * The cached value of the '{@link #getMdWrap() <em>Md Wrap</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getMdWrap()
	 * @generated
	 * @ordered
	 */
        protected MdWrapType mdWrap;

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
	 * The default value of the '{@link #getGROUPID() <em>GROUPID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getGROUPID()
	 * @generated
	 * @ordered
	 */
        protected static final String GROUPID_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getGROUPID() <em>GROUPID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getGROUPID()
	 * @generated
	 * @ordered
	 */
        protected String gROUPID = GROUPID_EDEFAULT;

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
	 * The default value of the '{@link #getSTATUS() <em>STATUS</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getSTATUS()
	 * @generated
	 * @ordered
	 */
        protected static final String STATUS_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getSTATUS() <em>STATUS</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getSTATUS()
	 * @generated
	 * @ordered
	 */
        protected String sTATUS = STATUS_EDEFAULT;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected MdSecTypeImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return MetsPackage.Literals.MD_SEC_TYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public MdRefType getMdRef() {
		return mdRef;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetMdRef(MdRefType newMdRef, NotificationChain msgs) {
		MdRefType oldMdRef = mdRef;
		mdRef = newMdRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.MD_SEC_TYPE__MD_REF, oldMdRef, newMdRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setMdRef(MdRefType newMdRef) {
		if (newMdRef != mdRef) {
			NotificationChain msgs = null;
			if (mdRef != null)
				msgs = ((InternalEObject)mdRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.MD_SEC_TYPE__MD_REF, null, msgs);
			if (newMdRef != null)
				msgs = ((InternalEObject)newMdRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.MD_SEC_TYPE__MD_REF, null, msgs);
			msgs = basicSetMdRef(newMdRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_SEC_TYPE__MD_REF, newMdRef, newMdRef));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public MdWrapType getMdWrap() {
		return mdWrap;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetMdWrap(MdWrapType newMdWrap, NotificationChain msgs) {
		MdWrapType oldMdWrap = mdWrap;
		mdWrap = newMdWrap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.MD_SEC_TYPE__MD_WRAP, oldMdWrap, newMdWrap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setMdWrap(MdWrapType newMdWrap) {
		if (newMdWrap != mdWrap) {
			NotificationChain msgs = null;
			if (mdWrap != null)
				msgs = ((InternalEObject)mdWrap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.MD_SEC_TYPE__MD_WRAP, null, msgs);
			if (newMdWrap != null)
				msgs = ((InternalEObject)newMdWrap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.MD_SEC_TYPE__MD_WRAP, null, msgs);
			msgs = basicSetMdWrap(newMdWrap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_SEC_TYPE__MD_WRAP, newMdWrap, newMdWrap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_SEC_TYPE__ADMID, oldADMID, aDMID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_SEC_TYPE__CREATED, oldCREATED, cREATED));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getGROUPID() {
		return gROUPID;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setGROUPID(String newGROUPID) {
		String oldGROUPID = gROUPID;
		gROUPID = newGROUPID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_SEC_TYPE__GROUPID, oldGROUPID, gROUPID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_SEC_TYPE__ID, oldID, iD));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getSTATUS() {
		return sTATUS;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setSTATUS(String newSTATUS) {
		String oldSTATUS = sTATUS;
		sTATUS = newSTATUS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_SEC_TYPE__STATUS, oldSTATUS, sTATUS));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetsPackage.MD_SEC_TYPE__MD_REF:
				return basicSetMdRef(null, msgs);
			case MetsPackage.MD_SEC_TYPE__MD_WRAP:
				return basicSetMdWrap(null, msgs);
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
			case MetsPackage.MD_SEC_TYPE__MD_REF:
				return getMdRef();
			case MetsPackage.MD_SEC_TYPE__MD_WRAP:
				return getMdWrap();
			case MetsPackage.MD_SEC_TYPE__ADMID:
				return getADMID();
			case MetsPackage.MD_SEC_TYPE__CREATED:
				return getCREATED();
			case MetsPackage.MD_SEC_TYPE__GROUPID:
				return getGROUPID();
			case MetsPackage.MD_SEC_TYPE__ID:
				return getID();
			case MetsPackage.MD_SEC_TYPE__STATUS:
				return getSTATUS();
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
			case MetsPackage.MD_SEC_TYPE__MD_REF:
				setMdRef((MdRefType)newValue);
				return;
			case MetsPackage.MD_SEC_TYPE__MD_WRAP:
				setMdWrap((MdWrapType)newValue);
				return;
			case MetsPackage.MD_SEC_TYPE__ADMID:
				setADMID((List<String>)newValue);
				return;
			case MetsPackage.MD_SEC_TYPE__CREATED:
				setCREATED((XMLGregorianCalendar)newValue);
				return;
			case MetsPackage.MD_SEC_TYPE__GROUPID:
				setGROUPID((String)newValue);
				return;
			case MetsPackage.MD_SEC_TYPE__ID:
				setID((String)newValue);
				return;
			case MetsPackage.MD_SEC_TYPE__STATUS:
				setSTATUS((String)newValue);
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
			case MetsPackage.MD_SEC_TYPE__MD_REF:
				setMdRef((MdRefType)null);
				return;
			case MetsPackage.MD_SEC_TYPE__MD_WRAP:
				setMdWrap((MdWrapType)null);
				return;
			case MetsPackage.MD_SEC_TYPE__ADMID:
				setADMID(ADMID_EDEFAULT);
				return;
			case MetsPackage.MD_SEC_TYPE__CREATED:
				setCREATED(CREATED_EDEFAULT);
				return;
			case MetsPackage.MD_SEC_TYPE__GROUPID:
				setGROUPID(GROUPID_EDEFAULT);
				return;
			case MetsPackage.MD_SEC_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case MetsPackage.MD_SEC_TYPE__STATUS:
				setSTATUS(STATUS_EDEFAULT);
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
			case MetsPackage.MD_SEC_TYPE__MD_REF:
				return mdRef != null;
			case MetsPackage.MD_SEC_TYPE__MD_WRAP:
				return mdWrap != null;
			case MetsPackage.MD_SEC_TYPE__ADMID:
				return ADMID_EDEFAULT == null ? aDMID != null : !ADMID_EDEFAULT.equals(aDMID);
			case MetsPackage.MD_SEC_TYPE__CREATED:
				return CREATED_EDEFAULT == null ? cREATED != null : !CREATED_EDEFAULT.equals(cREATED);
			case MetsPackage.MD_SEC_TYPE__GROUPID:
				return GROUPID_EDEFAULT == null ? gROUPID != null : !GROUPID_EDEFAULT.equals(gROUPID);
			case MetsPackage.MD_SEC_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MetsPackage.MD_SEC_TYPE__STATUS:
				return STATUS_EDEFAULT == null ? sTATUS != null : !STATUS_EDEFAULT.equals(sTATUS);
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
		result.append(", cREATED: ");
		result.append(cREATED);
		result.append(", gROUPID: ");
		result.append(gROUPID);
		result.append(", iD: ");
		result.append(iD);
		result.append(", sTATUS: ");
		result.append(sTATUS);
		result.append(')');
		return result.toString();
	}

} //MdSecTypeImpl
