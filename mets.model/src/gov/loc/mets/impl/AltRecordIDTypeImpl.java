/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.AltRecordIDType;
import gov.loc.mets.MetsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alt Record ID Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.AltRecordIDTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AltRecordIDTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AltRecordIDTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AltRecordIDTypeImpl extends EObjectImpl implements AltRecordIDType {
        /**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
        protected static final String VALUE_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
        protected String value = VALUE_EDEFAULT;

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
        protected AltRecordIDTypeImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return MetsPackage.Literals.ALT_RECORD_ID_TYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getValue() {
		return value;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.ALT_RECORD_ID_TYPE__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.ALT_RECORD_ID_TYPE__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.ALT_RECORD_ID_TYPE__TYPE, oldTYPE, tYPE));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetsPackage.ALT_RECORD_ID_TYPE__VALUE:
				return getValue();
			case MetsPackage.ALT_RECORD_ID_TYPE__ID:
				return getID();
			case MetsPackage.ALT_RECORD_ID_TYPE__TYPE:
				return getTYPE();
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
			case MetsPackage.ALT_RECORD_ID_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case MetsPackage.ALT_RECORD_ID_TYPE__ID:
				setID((String)newValue);
				return;
			case MetsPackage.ALT_RECORD_ID_TYPE__TYPE:
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
			case MetsPackage.ALT_RECORD_ID_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MetsPackage.ALT_RECORD_ID_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case MetsPackage.ALT_RECORD_ID_TYPE__TYPE:
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
			case MetsPackage.ALT_RECORD_ID_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case MetsPackage.ALT_RECORD_ID_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MetsPackage.ALT_RECORD_ID_TYPE__TYPE:
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
		result.append(" (value: ");
		result.append(value);
		result.append(", iD: ");
		result.append(iD);
		result.append(", tYPE: ");
		result.append(tYPE);
		result.append(')');
		return result.toString();
	}

} //AltRecordIDTypeImpl
