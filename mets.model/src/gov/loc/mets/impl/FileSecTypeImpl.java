/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.FileGrpType1;
import gov.loc.mets.FileSecType;
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
 * An implementation of the model object '<em><b>File Sec Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.FileSecTypeImpl#getFileGrp <em>File Grp</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileSecTypeImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileSecTypeImpl extends EObjectImpl implements FileSecType {
        /**
         * The cached value of the '{@link #getFileGrp() <em>File Grp</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFileGrp()
         * @generated
         * @ordered
         */
        protected EList<FileGrpType1> fileGrp;

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
        protected FileSecTypeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return MetsPackage.Literals.FILE_SEC_TYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<FileGrpType1> getFileGrp() {
                if (fileGrp == null) {
                        fileGrp = new EObjectContainmentEList<FileGrpType1>(FileGrpType1.class, this, MetsPackage.FILE_SEC_TYPE__FILE_GRP);
                }
                return fileGrp;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_SEC_TYPE__ID, oldID, iD));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case MetsPackage.FILE_SEC_TYPE__FILE_GRP:
                                return ((InternalEList<?>)getFileGrp()).basicRemove(otherEnd, msgs);
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
                        case MetsPackage.FILE_SEC_TYPE__FILE_GRP:
                                return getFileGrp();
                        case MetsPackage.FILE_SEC_TYPE__ID:
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
                        case MetsPackage.FILE_SEC_TYPE__FILE_GRP:
                                getFileGrp().clear();
                                getFileGrp().addAll((Collection<? extends FileGrpType1>)newValue);
                                return;
                        case MetsPackage.FILE_SEC_TYPE__ID:
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
                        case MetsPackage.FILE_SEC_TYPE__FILE_GRP:
                                getFileGrp().clear();
                                return;
                        case MetsPackage.FILE_SEC_TYPE__ID:
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
                        case MetsPackage.FILE_SEC_TYPE__FILE_GRP:
                                return fileGrp != null && !fileGrp.isEmpty();
                        case MetsPackage.FILE_SEC_TYPE__ID:
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

} //FileSecTypeImpl
