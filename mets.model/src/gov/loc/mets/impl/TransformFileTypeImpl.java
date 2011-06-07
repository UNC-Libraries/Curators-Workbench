/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.MetsPackage;
import gov.loc.mets.TRANSFORMTYPEType;
import gov.loc.mets.TransformFileType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform File Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.TransformFileTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.TransformFileTypeImpl#getTRANSFORMALGORITHM <em>TRANSFORMALGORITHM</em>}</li>
 *   <li>{@link gov.loc.mets.impl.TransformFileTypeImpl#getTRANSFORMBEHAVIOR <em>TRANSFORMBEHAVIOR</em>}</li>
 *   <li>{@link gov.loc.mets.impl.TransformFileTypeImpl#getTRANSFORMKEY <em>TRANSFORMKEY</em>}</li>
 *   <li>{@link gov.loc.mets.impl.TransformFileTypeImpl#getTRANSFORMORDER <em>TRANSFORMORDER</em>}</li>
 *   <li>{@link gov.loc.mets.impl.TransformFileTypeImpl#getTRANSFORMTYPE <em>TRANSFORMTYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformFileTypeImpl extends EObjectImpl implements TransformFileType {
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
	 * The default value of the '{@link #getTRANSFORMALGORITHM() <em>TRANSFORMALGORITHM</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getTRANSFORMALGORITHM()
	 * @generated
	 * @ordered
	 */
        protected static final String TRANSFORMALGORITHM_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getTRANSFORMALGORITHM() <em>TRANSFORMALGORITHM</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getTRANSFORMALGORITHM()
	 * @generated
	 * @ordered
	 */
        protected String tRANSFORMALGORITHM = TRANSFORMALGORITHM_EDEFAULT;

        /**
	 * The default value of the '{@link #getTRANSFORMBEHAVIOR() <em>TRANSFORMBEHAVIOR</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getTRANSFORMBEHAVIOR()
	 * @generated
	 * @ordered
	 */
        protected static final String TRANSFORMBEHAVIOR_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getTRANSFORMBEHAVIOR() <em>TRANSFORMBEHAVIOR</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getTRANSFORMBEHAVIOR()
	 * @generated
	 * @ordered
	 */
        protected String tRANSFORMBEHAVIOR = TRANSFORMBEHAVIOR_EDEFAULT;

        /**
	 * The default value of the '{@link #getTRANSFORMKEY() <em>TRANSFORMKEY</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getTRANSFORMKEY()
	 * @generated
	 * @ordered
	 */
        protected static final String TRANSFORMKEY_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getTRANSFORMKEY() <em>TRANSFORMKEY</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getTRANSFORMKEY()
	 * @generated
	 * @ordered
	 */
        protected String tRANSFORMKEY = TRANSFORMKEY_EDEFAULT;

        /**
	 * The default value of the '{@link #getTRANSFORMORDER() <em>TRANSFORMORDER</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getTRANSFORMORDER()
	 * @generated
	 * @ordered
	 */
        protected static final BigInteger TRANSFORMORDER_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getTRANSFORMORDER() <em>TRANSFORMORDER</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getTRANSFORMORDER()
	 * @generated
	 * @ordered
	 */
        protected BigInteger tRANSFORMORDER = TRANSFORMORDER_EDEFAULT;

        /**
	 * The default value of the '{@link #getTRANSFORMTYPE() <em>TRANSFORMTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getTRANSFORMTYPE()
	 * @generated
	 * @ordered
	 */
        protected static final TRANSFORMTYPEType TRANSFORMTYPE_EDEFAULT = TRANSFORMTYPEType.DECOMPRESSION;

        /**
	 * The cached value of the '{@link #getTRANSFORMTYPE() <em>TRANSFORMTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getTRANSFORMTYPE()
	 * @generated
	 * @ordered
	 */
        protected TRANSFORMTYPEType tRANSFORMTYPE = TRANSFORMTYPE_EDEFAULT;

        /**
	 * This is true if the TRANSFORMTYPE attribute has been set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        protected boolean tRANSFORMTYPEESet;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected TransformFileTypeImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return MetsPackage.Literals.TRANSFORM_FILE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.TRANSFORM_FILE_TYPE__ID, oldID, iD));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getTRANSFORMALGORITHM() {
		return tRANSFORMALGORITHM;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setTRANSFORMALGORITHM(String newTRANSFORMALGORITHM) {
		String oldTRANSFORMALGORITHM = tRANSFORMALGORITHM;
		tRANSFORMALGORITHM = newTRANSFORMALGORITHM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMALGORITHM, oldTRANSFORMALGORITHM, tRANSFORMALGORITHM));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getTRANSFORMBEHAVIOR() {
		return tRANSFORMBEHAVIOR;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setTRANSFORMBEHAVIOR(String newTRANSFORMBEHAVIOR) {
		String oldTRANSFORMBEHAVIOR = tRANSFORMBEHAVIOR;
		tRANSFORMBEHAVIOR = newTRANSFORMBEHAVIOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMBEHAVIOR, oldTRANSFORMBEHAVIOR, tRANSFORMBEHAVIOR));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getTRANSFORMKEY() {
		return tRANSFORMKEY;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setTRANSFORMKEY(String newTRANSFORMKEY) {
		String oldTRANSFORMKEY = tRANSFORMKEY;
		tRANSFORMKEY = newTRANSFORMKEY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMKEY, oldTRANSFORMKEY, tRANSFORMKEY));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public BigInteger getTRANSFORMORDER() {
		return tRANSFORMORDER;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setTRANSFORMORDER(BigInteger newTRANSFORMORDER) {
		BigInteger oldTRANSFORMORDER = tRANSFORMORDER;
		tRANSFORMORDER = newTRANSFORMORDER;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMORDER, oldTRANSFORMORDER, tRANSFORMORDER));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public TRANSFORMTYPEType getTRANSFORMTYPE() {
		return tRANSFORMTYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setTRANSFORMTYPE(TRANSFORMTYPEType newTRANSFORMTYPE) {
		TRANSFORMTYPEType oldTRANSFORMTYPE = tRANSFORMTYPE;
		tRANSFORMTYPE = newTRANSFORMTYPE == null ? TRANSFORMTYPE_EDEFAULT : newTRANSFORMTYPE;
		boolean oldTRANSFORMTYPEESet = tRANSFORMTYPEESet;
		tRANSFORMTYPEESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMTYPE, oldTRANSFORMTYPE, tRANSFORMTYPE, !oldTRANSFORMTYPEESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void unsetTRANSFORMTYPE() {
		TRANSFORMTYPEType oldTRANSFORMTYPE = tRANSFORMTYPE;
		boolean oldTRANSFORMTYPEESet = tRANSFORMTYPEESet;
		tRANSFORMTYPE = TRANSFORMTYPE_EDEFAULT;
		tRANSFORMTYPEESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMTYPE, oldTRANSFORMTYPE, TRANSFORMTYPE_EDEFAULT, oldTRANSFORMTYPEESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean isSetTRANSFORMTYPE() {
		return tRANSFORMTYPEESet;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetsPackage.TRANSFORM_FILE_TYPE__ID:
				return getID();
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMALGORITHM:
				return getTRANSFORMALGORITHM();
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMBEHAVIOR:
				return getTRANSFORMBEHAVIOR();
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMKEY:
				return getTRANSFORMKEY();
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMORDER:
				return getTRANSFORMORDER();
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMTYPE:
				return getTRANSFORMTYPE();
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
			case MetsPackage.TRANSFORM_FILE_TYPE__ID:
				setID((String)newValue);
				return;
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMALGORITHM:
				setTRANSFORMALGORITHM((String)newValue);
				return;
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMBEHAVIOR:
				setTRANSFORMBEHAVIOR((String)newValue);
				return;
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMKEY:
				setTRANSFORMKEY((String)newValue);
				return;
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMORDER:
				setTRANSFORMORDER((BigInteger)newValue);
				return;
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMTYPE:
				setTRANSFORMTYPE((TRANSFORMTYPEType)newValue);
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
			case MetsPackage.TRANSFORM_FILE_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMALGORITHM:
				setTRANSFORMALGORITHM(TRANSFORMALGORITHM_EDEFAULT);
				return;
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMBEHAVIOR:
				setTRANSFORMBEHAVIOR(TRANSFORMBEHAVIOR_EDEFAULT);
				return;
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMKEY:
				setTRANSFORMKEY(TRANSFORMKEY_EDEFAULT);
				return;
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMORDER:
				setTRANSFORMORDER(TRANSFORMORDER_EDEFAULT);
				return;
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMTYPE:
				unsetTRANSFORMTYPE();
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
			case MetsPackage.TRANSFORM_FILE_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMALGORITHM:
				return TRANSFORMALGORITHM_EDEFAULT == null ? tRANSFORMALGORITHM != null : !TRANSFORMALGORITHM_EDEFAULT.equals(tRANSFORMALGORITHM);
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMBEHAVIOR:
				return TRANSFORMBEHAVIOR_EDEFAULT == null ? tRANSFORMBEHAVIOR != null : !TRANSFORMBEHAVIOR_EDEFAULT.equals(tRANSFORMBEHAVIOR);
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMKEY:
				return TRANSFORMKEY_EDEFAULT == null ? tRANSFORMKEY != null : !TRANSFORMKEY_EDEFAULT.equals(tRANSFORMKEY);
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMORDER:
				return TRANSFORMORDER_EDEFAULT == null ? tRANSFORMORDER != null : !TRANSFORMORDER_EDEFAULT.equals(tRANSFORMORDER);
			case MetsPackage.TRANSFORM_FILE_TYPE__TRANSFORMTYPE:
				return isSetTRANSFORMTYPE();
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
		result.append(", tRANSFORMALGORITHM: ");
		result.append(tRANSFORMALGORITHM);
		result.append(", tRANSFORMBEHAVIOR: ");
		result.append(tRANSFORMBEHAVIOR);
		result.append(", tRANSFORMKEY: ");
		result.append(tRANSFORMKEY);
		result.append(", tRANSFORMORDER: ");
		result.append(tRANSFORMORDER);
		result.append(", tRANSFORMTYPE: ");
		if (tRANSFORMTYPEESet) result.append(tRANSFORMTYPE); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TransformFileTypeImpl
