/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.DivType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.StructMapType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.StructMapTypeImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link gov.loc.mets.impl.StructMapTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.StructMapTypeImpl#getLABEL <em>LABEL</em>}</li>
 *   <li>{@link gov.loc.mets.impl.StructMapTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructMapTypeImpl extends EObjectImpl implements StructMapType {
        /**
	 * The cached value of the '{@link #getDiv() <em>Div</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getDiv()
	 * @generated
	 * @ordered
	 */
        protected DivType div;

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
        protected StructMapTypeImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return MetsPackage.Literals.STRUCT_MAP_TYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public DivType getDiv() {
		return div;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetDiv(DivType newDiv, NotificationChain msgs) {
		DivType oldDiv = div;
		div = newDiv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.STRUCT_MAP_TYPE__DIV, oldDiv, newDiv);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setDiv(DivType newDiv) {
		if (newDiv != div) {
			NotificationChain msgs = null;
			if (div != null)
				msgs = ((InternalEObject)div).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.STRUCT_MAP_TYPE__DIV, null, msgs);
			if (newDiv != null)
				msgs = ((InternalEObject)newDiv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.STRUCT_MAP_TYPE__DIV, null, msgs);
			msgs = basicSetDiv(newDiv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.STRUCT_MAP_TYPE__DIV, newDiv, newDiv));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.STRUCT_MAP_TYPE__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.STRUCT_MAP_TYPE__LABEL, oldLABEL, lABEL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.STRUCT_MAP_TYPE__TYPE, oldTYPE, tYPE));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetsPackage.STRUCT_MAP_TYPE__DIV:
				return basicSetDiv(null, msgs);
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
			case MetsPackage.STRUCT_MAP_TYPE__DIV:
				return getDiv();
			case MetsPackage.STRUCT_MAP_TYPE__ID:
				return getID();
			case MetsPackage.STRUCT_MAP_TYPE__LABEL:
				return getLABEL();
			case MetsPackage.STRUCT_MAP_TYPE__TYPE:
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
			case MetsPackage.STRUCT_MAP_TYPE__DIV:
				setDiv((DivType)newValue);
				return;
			case MetsPackage.STRUCT_MAP_TYPE__ID:
				setID((String)newValue);
				return;
			case MetsPackage.STRUCT_MAP_TYPE__LABEL:
				setLABEL((String)newValue);
				return;
			case MetsPackage.STRUCT_MAP_TYPE__TYPE:
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
			case MetsPackage.STRUCT_MAP_TYPE__DIV:
				setDiv((DivType)null);
				return;
			case MetsPackage.STRUCT_MAP_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case MetsPackage.STRUCT_MAP_TYPE__LABEL:
				setLABEL(LABEL_EDEFAULT);
				return;
			case MetsPackage.STRUCT_MAP_TYPE__TYPE:
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
			case MetsPackage.STRUCT_MAP_TYPE__DIV:
				return div != null;
			case MetsPackage.STRUCT_MAP_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MetsPackage.STRUCT_MAP_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? lABEL != null : !LABEL_EDEFAULT.equals(lABEL);
			case MetsPackage.STRUCT_MAP_TYPE__TYPE:
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
		result.append(" (iD: ");
		result.append(iD);
		result.append(", lABEL: ");
		result.append(lABEL);
		result.append(", tYPE: ");
		result.append(tYPE);
		result.append(')');
		return result.toString();
	}

} //StructMapTypeImpl
