/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.BehaviorType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.ObjectType;

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
 * An implementation of the model object '<em><b>Behavior Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.BehaviorTypeImpl#getInterfaceDef <em>Interface Def</em>}</li>
 *   <li>{@link gov.loc.mets.impl.BehaviorTypeImpl#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link gov.loc.mets.impl.BehaviorTypeImpl#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.BehaviorTypeImpl#getBTYPE <em>BTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.BehaviorTypeImpl#getCREATED <em>CREATED</em>}</li>
 *   <li>{@link gov.loc.mets.impl.BehaviorTypeImpl#getGROUPID <em>GROUPID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.BehaviorTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.BehaviorTypeImpl#getLABEL <em>LABEL</em>}</li>
 *   <li>{@link gov.loc.mets.impl.BehaviorTypeImpl#getSTRUCTID <em>STRUCTID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorTypeImpl extends EObjectImpl implements BehaviorType {
        /**
         * The cached value of the '{@link #getInterfaceDef() <em>Interface Def</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getInterfaceDef()
         * @generated
         * @ordered
         */
        protected ObjectType interfaceDef;

        /**
         * The cached value of the '{@link #getMechanism() <em>Mechanism</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMechanism()
         * @generated
         * @ordered
         */
        protected ObjectType mechanism;

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
         * The default value of the '{@link #getBTYPE() <em>BTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBTYPE()
         * @generated
         * @ordered
         */
        protected static final String BTYPE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getBTYPE() <em>BTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBTYPE()
         * @generated
         * @ordered
         */
        protected String bTYPE = BTYPE_EDEFAULT;

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
         * The default value of the '{@link #getSTRUCTID() <em>STRUCTID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSTRUCTID()
         * @generated
         * @ordered
         */
        protected static final List<String> STRUCTID_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getSTRUCTID() <em>STRUCTID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSTRUCTID()
         * @generated
         * @ordered
         */
        protected List<String> sTRUCTID = STRUCTID_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected BehaviorTypeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return MetsPackage.Literals.BEHAVIOR_TYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ObjectType getInterfaceDef() {
                return interfaceDef;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetInterfaceDef(ObjectType newInterfaceDef, NotificationChain msgs) {
                ObjectType oldInterfaceDef = interfaceDef;
                interfaceDef = newInterfaceDef;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.BEHAVIOR_TYPE__INTERFACE_DEF, oldInterfaceDef, newInterfaceDef);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setInterfaceDef(ObjectType newInterfaceDef) {
                if (newInterfaceDef != interfaceDef) {
                        NotificationChain msgs = null;
                        if (interfaceDef != null)
                                msgs = ((InternalEObject)interfaceDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.BEHAVIOR_TYPE__INTERFACE_DEF, null, msgs);
                        if (newInterfaceDef != null)
                                msgs = ((InternalEObject)newInterfaceDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.BEHAVIOR_TYPE__INTERFACE_DEF, null, msgs);
                        msgs = basicSetInterfaceDef(newInterfaceDef, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.BEHAVIOR_TYPE__INTERFACE_DEF, newInterfaceDef, newInterfaceDef));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ObjectType getMechanism() {
                return mechanism;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetMechanism(ObjectType newMechanism, NotificationChain msgs) {
                ObjectType oldMechanism = mechanism;
                mechanism = newMechanism;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.BEHAVIOR_TYPE__MECHANISM, oldMechanism, newMechanism);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMechanism(ObjectType newMechanism) {
                if (newMechanism != mechanism) {
                        NotificationChain msgs = null;
                        if (mechanism != null)
                                msgs = ((InternalEObject)mechanism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.BEHAVIOR_TYPE__MECHANISM, null, msgs);
                        if (newMechanism != null)
                                msgs = ((InternalEObject)newMechanism).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.BEHAVIOR_TYPE__MECHANISM, null, msgs);
                        msgs = basicSetMechanism(newMechanism, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.BEHAVIOR_TYPE__MECHANISM, newMechanism, newMechanism));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.BEHAVIOR_TYPE__ADMID, oldADMID, aDMID));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getBTYPE() {
                return bTYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setBTYPE(String newBTYPE) {
                String oldBTYPE = bTYPE;
                bTYPE = newBTYPE;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.BEHAVIOR_TYPE__BTYPE, oldBTYPE, bTYPE));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.BEHAVIOR_TYPE__CREATED, oldCREATED, cREATED));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.BEHAVIOR_TYPE__GROUPID, oldGROUPID, gROUPID));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.BEHAVIOR_TYPE__ID, oldID, iD));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.BEHAVIOR_TYPE__LABEL, oldLABEL, lABEL));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public List<String> getSTRUCTID() {
                return sTRUCTID;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setSTRUCTID(List<String> newSTRUCTID) {
                List<String> oldSTRUCTID = sTRUCTID;
                sTRUCTID = newSTRUCTID;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.BEHAVIOR_TYPE__STRUCTID, oldSTRUCTID, sTRUCTID));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case MetsPackage.BEHAVIOR_TYPE__INTERFACE_DEF:
                                return basicSetInterfaceDef(null, msgs);
                        case MetsPackage.BEHAVIOR_TYPE__MECHANISM:
                                return basicSetMechanism(null, msgs);
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
                        case MetsPackage.BEHAVIOR_TYPE__INTERFACE_DEF:
                                return getInterfaceDef();
                        case MetsPackage.BEHAVIOR_TYPE__MECHANISM:
                                return getMechanism();
                        case MetsPackage.BEHAVIOR_TYPE__ADMID:
                                return getADMID();
                        case MetsPackage.BEHAVIOR_TYPE__BTYPE:
                                return getBTYPE();
                        case MetsPackage.BEHAVIOR_TYPE__CREATED:
                                return getCREATED();
                        case MetsPackage.BEHAVIOR_TYPE__GROUPID:
                                return getGROUPID();
                        case MetsPackage.BEHAVIOR_TYPE__ID:
                                return getID();
                        case MetsPackage.BEHAVIOR_TYPE__LABEL:
                                return getLABEL();
                        case MetsPackage.BEHAVIOR_TYPE__STRUCTID:
                                return getSTRUCTID();
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
                        case MetsPackage.BEHAVIOR_TYPE__INTERFACE_DEF:
                                setInterfaceDef((ObjectType)newValue);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__MECHANISM:
                                setMechanism((ObjectType)newValue);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__ADMID:
                                setADMID((List<String>)newValue);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__BTYPE:
                                setBTYPE((String)newValue);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__CREATED:
                                setCREATED((XMLGregorianCalendar)newValue);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__GROUPID:
                                setGROUPID((String)newValue);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__ID:
                                setID((String)newValue);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__LABEL:
                                setLABEL((String)newValue);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__STRUCTID:
                                setSTRUCTID((List<String>)newValue);
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
                        case MetsPackage.BEHAVIOR_TYPE__INTERFACE_DEF:
                                setInterfaceDef((ObjectType)null);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__MECHANISM:
                                setMechanism((ObjectType)null);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__ADMID:
                                setADMID(ADMID_EDEFAULT);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__BTYPE:
                                setBTYPE(BTYPE_EDEFAULT);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__CREATED:
                                setCREATED(CREATED_EDEFAULT);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__GROUPID:
                                setGROUPID(GROUPID_EDEFAULT);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__ID:
                                setID(ID_EDEFAULT);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__LABEL:
                                setLABEL(LABEL_EDEFAULT);
                                return;
                        case MetsPackage.BEHAVIOR_TYPE__STRUCTID:
                                setSTRUCTID(STRUCTID_EDEFAULT);
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
                        case MetsPackage.BEHAVIOR_TYPE__INTERFACE_DEF:
                                return interfaceDef != null;
                        case MetsPackage.BEHAVIOR_TYPE__MECHANISM:
                                return mechanism != null;
                        case MetsPackage.BEHAVIOR_TYPE__ADMID:
                                return ADMID_EDEFAULT == null ? aDMID != null : !ADMID_EDEFAULT.equals(aDMID);
                        case MetsPackage.BEHAVIOR_TYPE__BTYPE:
                                return BTYPE_EDEFAULT == null ? bTYPE != null : !BTYPE_EDEFAULT.equals(bTYPE);
                        case MetsPackage.BEHAVIOR_TYPE__CREATED:
                                return CREATED_EDEFAULT == null ? cREATED != null : !CREATED_EDEFAULT.equals(cREATED);
                        case MetsPackage.BEHAVIOR_TYPE__GROUPID:
                                return GROUPID_EDEFAULT == null ? gROUPID != null : !GROUPID_EDEFAULT.equals(gROUPID);
                        case MetsPackage.BEHAVIOR_TYPE__ID:
                                return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
                        case MetsPackage.BEHAVIOR_TYPE__LABEL:
                                return LABEL_EDEFAULT == null ? lABEL != null : !LABEL_EDEFAULT.equals(lABEL);
                        case MetsPackage.BEHAVIOR_TYPE__STRUCTID:
                                return STRUCTID_EDEFAULT == null ? sTRUCTID != null : !STRUCTID_EDEFAULT.equals(sTRUCTID);
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
                result.append(", bTYPE: ");
                result.append(bTYPE);
                result.append(", cREATED: ");
                result.append(cREATED);
                result.append(", gROUPID: ");
                result.append(gROUPID);
                result.append(", iD: ");
                result.append(iD);
                result.append(", lABEL: ");
                result.append(lABEL);
                result.append(", sTRUCTID: ");
                result.append(sTRUCTID);
                result.append(')');
                return result.toString();
        }

} //BehaviorTypeImpl
