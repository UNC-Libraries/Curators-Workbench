/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.AmdSecType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MetsPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Amd Sec Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.AmdSecTypeImpl#getTechMD <em>Tech MD</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AmdSecTypeImpl#getRightsMD <em>Rights MD</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AmdSecTypeImpl#getSourceMD <em>Source MD</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AmdSecTypeImpl#getDigiprovMD <em>Digiprov MD</em>}</li>
 *   <li>{@link gov.loc.mets.impl.AmdSecTypeImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AmdSecTypeImpl extends EObjectImpl implements AmdSecType {
        /**
         * The cached value of the '{@link #getTechMD() <em>Tech MD</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTechMD()
         * @generated
         * @ordered
         */
        protected EList<MdSecType> techMD;

        /**
         * The cached value of the '{@link #getRightsMD() <em>Rights MD</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getRightsMD()
         * @generated
         * @ordered
         */
        protected EList<MdSecType> rightsMD;

        /**
         * The cached value of the '{@link #getSourceMD() <em>Source MD</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSourceMD()
         * @generated
         * @ordered
         */
        protected EList<MdSecType> sourceMD;

        /**
         * The cached value of the '{@link #getDigiprovMD() <em>Digiprov MD</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDigiprovMD()
         * @generated
         * @ordered
         */
        protected EList<MdSecType> digiprovMD;

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
        protected AmdSecTypeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return MetsPackage.Literals.AMD_SEC_TYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<MdSecType> getTechMD() {
                if (techMD == null) {
                        techMD = new EObjectContainmentEList<MdSecType>(MdSecType.class, this, MetsPackage.AMD_SEC_TYPE__TECH_MD);
                }
                return techMD;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<MdSecType> getRightsMD() {
                if (rightsMD == null) {
                        rightsMD = new EObjectContainmentEList<MdSecType>(MdSecType.class, this, MetsPackage.AMD_SEC_TYPE__RIGHTS_MD);
                }
                return rightsMD;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<MdSecType> getSourceMD() {
                if (sourceMD == null) {
                        sourceMD = new EObjectContainmentEList<MdSecType>(MdSecType.class, this, MetsPackage.AMD_SEC_TYPE__SOURCE_MD);
                }
                return sourceMD;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<MdSecType> getDigiprovMD() {
                if (digiprovMD == null) {
                        digiprovMD = new EObjectContainmentEList<MdSecType>(MdSecType.class, this, MetsPackage.AMD_SEC_TYPE__DIGIPROV_MD);
                }
                return digiprovMD;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.AMD_SEC_TYPE__ID, oldID, iD));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case MetsPackage.AMD_SEC_TYPE__TECH_MD:
                                return ((InternalEList<?>)getTechMD()).basicRemove(otherEnd, msgs);
                        case MetsPackage.AMD_SEC_TYPE__RIGHTS_MD:
                                return ((InternalEList<?>)getRightsMD()).basicRemove(otherEnd, msgs);
                        case MetsPackage.AMD_SEC_TYPE__SOURCE_MD:
                                return ((InternalEList<?>)getSourceMD()).basicRemove(otherEnd, msgs);
                        case MetsPackage.AMD_SEC_TYPE__DIGIPROV_MD:
                                return ((InternalEList<?>)getDigiprovMD()).basicRemove(otherEnd, msgs);
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
                        case MetsPackage.AMD_SEC_TYPE__TECH_MD:
                                return getTechMD();
                        case MetsPackage.AMD_SEC_TYPE__RIGHTS_MD:
                                return getRightsMD();
                        case MetsPackage.AMD_SEC_TYPE__SOURCE_MD:
                                return getSourceMD();
                        case MetsPackage.AMD_SEC_TYPE__DIGIPROV_MD:
                                return getDigiprovMD();
                        case MetsPackage.AMD_SEC_TYPE__ID:
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
                        case MetsPackage.AMD_SEC_TYPE__TECH_MD:
                                getTechMD().clear();
                                getTechMD().addAll((Collection<? extends MdSecType>)newValue);
                                return;
                        case MetsPackage.AMD_SEC_TYPE__RIGHTS_MD:
                                getRightsMD().clear();
                                getRightsMD().addAll((Collection<? extends MdSecType>)newValue);
                                return;
                        case MetsPackage.AMD_SEC_TYPE__SOURCE_MD:
                                getSourceMD().clear();
                                getSourceMD().addAll((Collection<? extends MdSecType>)newValue);
                                return;
                        case MetsPackage.AMD_SEC_TYPE__DIGIPROV_MD:
                                getDigiprovMD().clear();
                                getDigiprovMD().addAll((Collection<? extends MdSecType>)newValue);
                                return;
                        case MetsPackage.AMD_SEC_TYPE__ID:
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
                        case MetsPackage.AMD_SEC_TYPE__TECH_MD:
                                getTechMD().clear();
                                return;
                        case MetsPackage.AMD_SEC_TYPE__RIGHTS_MD:
                                getRightsMD().clear();
                                return;
                        case MetsPackage.AMD_SEC_TYPE__SOURCE_MD:
                                getSourceMD().clear();
                                return;
                        case MetsPackage.AMD_SEC_TYPE__DIGIPROV_MD:
                                getDigiprovMD().clear();
                                return;
                        case MetsPackage.AMD_SEC_TYPE__ID:
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
                        case MetsPackage.AMD_SEC_TYPE__TECH_MD:
                                return techMD != null && !techMD.isEmpty();
                        case MetsPackage.AMD_SEC_TYPE__RIGHTS_MD:
                                return rightsMD != null && !rightsMD.isEmpty();
                        case MetsPackage.AMD_SEC_TYPE__SOURCE_MD:
                                return sourceMD != null && !sourceMD.isEmpty();
                        case MetsPackage.AMD_SEC_TYPE__DIGIPROV_MD:
                                return digiprovMD != null && !digiprovMD.isEmpty();
                        case MetsPackage.AMD_SEC_TYPE__ID:
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
                result.append(" (iD: ");
                result.append(iD);
                result.append(')');
                return result.toString();
        }

} //AmdSecTypeImpl
