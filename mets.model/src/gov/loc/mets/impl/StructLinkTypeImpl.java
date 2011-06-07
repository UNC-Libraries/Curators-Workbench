/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.MetsPackage;
import gov.loc.mets.SmLinkGrpType;
import gov.loc.mets.SmLinkType;
import gov.loc.mets.StructLinkType;

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
 * An implementation of the model object '<em><b>Struct Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.StructLinkTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mets.impl.StructLinkTypeImpl#getSmLink <em>Sm Link</em>}</li>
 *   <li>{@link gov.loc.mets.impl.StructLinkTypeImpl#getSmLinkGrp <em>Sm Link Grp</em>}</li>
 *   <li>{@link gov.loc.mets.impl.StructLinkTypeImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructLinkTypeImpl extends EObjectImpl implements StructLinkType {
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
        protected StructLinkTypeImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return MetsPackage.Literals.STRUCT_LINK_TYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, MetsPackage.STRUCT_LINK_TYPE__GROUP);
		}
		return group;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<SmLinkType> getSmLink() {
		return getGroup().list(MetsPackage.Literals.STRUCT_LINK_TYPE__SM_LINK);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<SmLinkGrpType> getSmLinkGrp() {
		return getGroup().list(MetsPackage.Literals.STRUCT_LINK_TYPE__SM_LINK_GRP);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.STRUCT_LINK_TYPE__ID, oldID, iD));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetsPackage.STRUCT_LINK_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case MetsPackage.STRUCT_LINK_TYPE__SM_LINK:
				return ((InternalEList<?>)getSmLink()).basicRemove(otherEnd, msgs);
			case MetsPackage.STRUCT_LINK_TYPE__SM_LINK_GRP:
				return ((InternalEList<?>)getSmLinkGrp()).basicRemove(otherEnd, msgs);
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
			case MetsPackage.STRUCT_LINK_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case MetsPackage.STRUCT_LINK_TYPE__SM_LINK:
				return getSmLink();
			case MetsPackage.STRUCT_LINK_TYPE__SM_LINK_GRP:
				return getSmLinkGrp();
			case MetsPackage.STRUCT_LINK_TYPE__ID:
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
			case MetsPackage.STRUCT_LINK_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case MetsPackage.STRUCT_LINK_TYPE__SM_LINK:
				getSmLink().clear();
				getSmLink().addAll((Collection<? extends SmLinkType>)newValue);
				return;
			case MetsPackage.STRUCT_LINK_TYPE__SM_LINK_GRP:
				getSmLinkGrp().clear();
				getSmLinkGrp().addAll((Collection<? extends SmLinkGrpType>)newValue);
				return;
			case MetsPackage.STRUCT_LINK_TYPE__ID:
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
			case MetsPackage.STRUCT_LINK_TYPE__GROUP:
				getGroup().clear();
				return;
			case MetsPackage.STRUCT_LINK_TYPE__SM_LINK:
				getSmLink().clear();
				return;
			case MetsPackage.STRUCT_LINK_TYPE__SM_LINK_GRP:
				getSmLinkGrp().clear();
				return;
			case MetsPackage.STRUCT_LINK_TYPE__ID:
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
			case MetsPackage.STRUCT_LINK_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case MetsPackage.STRUCT_LINK_TYPE__SM_LINK:
				return !getSmLink().isEmpty();
			case MetsPackage.STRUCT_LINK_TYPE__SM_LINK_GRP:
				return !getSmLinkGrp().isEmpty();
			case MetsPackage.STRUCT_LINK_TYPE__ID:
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

} //StructLinkTypeImpl
