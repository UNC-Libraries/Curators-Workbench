/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.AreaType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.ParType;
import gov.loc.mets.SeqType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seq Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.SeqTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SeqTypeImpl#getArea <em>Area</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SeqTypeImpl#getPar <em>Par</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SeqTypeImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeqTypeImpl extends EObjectImpl implements SeqType {
        /**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
        protected FeatureMap group;

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
        protected SeqTypeImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return MetsPackage.Literals.SEQ_TYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, MetsPackage.SEQ_TYPE__GROUP);
		}
		return group;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<AreaType> getArea() {
		return getGroup().list(MetsPackage.Literals.SEQ_TYPE__AREA);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<ParType> getPar() {
		return getGroup().list(MetsPackage.Literals.SEQ_TYPE__PAR);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SEQ_TYPE__ID, oldID, iD));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetsPackage.SEQ_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case MetsPackage.SEQ_TYPE__AREA:
				return ((InternalEList<?>)getArea()).basicRemove(otherEnd, msgs);
			case MetsPackage.SEQ_TYPE__PAR:
				return ((InternalEList<?>)getPar()).basicRemove(otherEnd, msgs);
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
			case MetsPackage.SEQ_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case MetsPackage.SEQ_TYPE__AREA:
				return getArea();
			case MetsPackage.SEQ_TYPE__PAR:
				return getPar();
			case MetsPackage.SEQ_TYPE__ID:
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
			case MetsPackage.SEQ_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case MetsPackage.SEQ_TYPE__AREA:
				getArea().clear();
				getArea().addAll((Collection<? extends AreaType>)newValue);
				return;
			case MetsPackage.SEQ_TYPE__PAR:
				getPar().clear();
				getPar().addAll((Collection<? extends ParType>)newValue);
				return;
			case MetsPackage.SEQ_TYPE__ID:
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
			case MetsPackage.SEQ_TYPE__GROUP:
				getGroup().clear();
				return;
			case MetsPackage.SEQ_TYPE__AREA:
				getArea().clear();
				return;
			case MetsPackage.SEQ_TYPE__PAR:
				getPar().clear();
				return;
			case MetsPackage.SEQ_TYPE__ID:
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
			case MetsPackage.SEQ_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case MetsPackage.SEQ_TYPE__AREA:
				return !getArea().isEmpty();
			case MetsPackage.SEQ_TYPE__PAR:
				return !getPar().isEmpty();
			case MetsPackage.SEQ_TYPE__ID:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", iD: ");
		result.append(iD);
		result.append(')');
		return result.toString();
	}

} //SeqTypeImpl
