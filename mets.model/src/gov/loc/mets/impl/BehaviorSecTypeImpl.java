/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.BehaviorSecType;
import gov.loc.mets.BehaviorType;
import gov.loc.mets.MetsPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Behavior Sec Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.BehaviorSecTypeImpl#getBehaviorSec <em>Behavior Sec</em>}</li>
 *   <li>{@link gov.loc.mets.impl.BehaviorSecTypeImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link gov.loc.mets.impl.BehaviorSecTypeImpl#getCREATED <em>CREATED</em>}</li>
 *   <li>{@link gov.loc.mets.impl.BehaviorSecTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.BehaviorSecTypeImpl#getLABEL <em>LABEL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorSecTypeImpl extends EObjectImpl implements BehaviorSecType {
        /**
         * The cached value of the '{@link #getBehaviorSec() <em>Behavior Sec</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBehaviorSec()
         * @generated
         * @ordered
         */
        protected EList<BehaviorSecType> behaviorSec;

        /**
         * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBehavior()
         * @generated
         * @ordered
         */
        protected EList<BehaviorType> behavior;

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
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected BehaviorSecTypeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return MetsPackage.Literals.BEHAVIOR_SEC_TYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<BehaviorSecType> getBehaviorSec() {
                if (behaviorSec == null) {
                        behaviorSec = new EObjectContainmentEList<BehaviorSecType>(BehaviorSecType.class, this, MetsPackage.BEHAVIOR_SEC_TYPE__BEHAVIOR_SEC);
                }
                return behaviorSec;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<BehaviorType> getBehavior() {
                if (behavior == null) {
                        behavior = new EObjectContainmentEList<BehaviorType>(BehaviorType.class, this, MetsPackage.BEHAVIOR_SEC_TYPE__BEHAVIOR);
                }
                return behavior;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.BEHAVIOR_SEC_TYPE__CREATED, oldCREATED, cREATED));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.BEHAVIOR_SEC_TYPE__ID, oldID, iD));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.BEHAVIOR_SEC_TYPE__LABEL, oldLABEL, lABEL));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case MetsPackage.BEHAVIOR_SEC_TYPE__BEHAVIOR_SEC:
                                return ((InternalEList<?>)getBehaviorSec()).basicRemove(otherEnd, msgs);
                        case MetsPackage.BEHAVIOR_SEC_TYPE__BEHAVIOR:
                                return ((InternalEList<?>)getBehavior()).basicRemove(otherEnd, msgs);
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
                        case MetsPackage.BEHAVIOR_SEC_TYPE__BEHAVIOR_SEC:
                                return getBehaviorSec();
                        case MetsPackage.BEHAVIOR_SEC_TYPE__BEHAVIOR:
                                return getBehavior();
                        case MetsPackage.BEHAVIOR_SEC_TYPE__CREATED:
                                return getCREATED();
                        case MetsPackage.BEHAVIOR_SEC_TYPE__ID:
                                return getID();
                        case MetsPackage.BEHAVIOR_SEC_TYPE__LABEL:
                                return getLABEL();
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
                        case MetsPackage.BEHAVIOR_SEC_TYPE__BEHAVIOR_SEC:
                                getBehaviorSec().clear();
                                getBehaviorSec().addAll((Collection<? extends BehaviorSecType>)newValue);
                                return;
                        case MetsPackage.BEHAVIOR_SEC_TYPE__BEHAVIOR:
                                getBehavior().clear();
                                getBehavior().addAll((Collection<? extends BehaviorType>)newValue);
                                return;
                        case MetsPackage.BEHAVIOR_SEC_TYPE__CREATED:
                                setCREATED((XMLGregorianCalendar)newValue);
                                return;
                        case MetsPackage.BEHAVIOR_SEC_TYPE__ID:
                                setID((String)newValue);
                                return;
                        case MetsPackage.BEHAVIOR_SEC_TYPE__LABEL:
                                setLABEL((String)newValue);
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
                        case MetsPackage.BEHAVIOR_SEC_TYPE__BEHAVIOR_SEC:
                                getBehaviorSec().clear();
                                return;
                        case MetsPackage.BEHAVIOR_SEC_TYPE__BEHAVIOR:
                                getBehavior().clear();
                                return;
                        case MetsPackage.BEHAVIOR_SEC_TYPE__CREATED:
                                setCREATED(CREATED_EDEFAULT);
                                return;
                        case MetsPackage.BEHAVIOR_SEC_TYPE__ID:
                                setID(ID_EDEFAULT);
                                return;
                        case MetsPackage.BEHAVIOR_SEC_TYPE__LABEL:
                                setLABEL(LABEL_EDEFAULT);
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
                        case MetsPackage.BEHAVIOR_SEC_TYPE__BEHAVIOR_SEC:
                                return behaviorSec != null && !behaviorSec.isEmpty();
                        case MetsPackage.BEHAVIOR_SEC_TYPE__BEHAVIOR:
                                return behavior != null && !behavior.isEmpty();
                        case MetsPackage.BEHAVIOR_SEC_TYPE__CREATED:
                                return CREATED_EDEFAULT == null ? cREATED != null : !CREATED_EDEFAULT.equals(cREATED);
                        case MetsPackage.BEHAVIOR_SEC_TYPE__ID:
                                return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
                        case MetsPackage.BEHAVIOR_SEC_TYPE__LABEL:
                                return LABEL_EDEFAULT == null ? lABEL != null : !LABEL_EDEFAULT.equals(lABEL);
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
                result.append(" (cREATED: ");
                result.append(cREATED);
                result.append(", iD: ");
                result.append(iD);
                result.append(", lABEL: ");
                result.append(lABEL);
                result.append(')');
                return result.toString();
        }

} //BehaviorSecTypeImpl
