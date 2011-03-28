/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.BETYPEType2;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.StreamType;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.StreamTypeImpl#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.StreamTypeImpl#getBEGIN <em>BEGIN</em>}</li>
 *   <li>{@link gov.loc.mets.impl.StreamTypeImpl#getBETYPE <em>BETYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.StreamTypeImpl#getDMDID <em>DMDID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.StreamTypeImpl#getEND <em>END</em>}</li>
 *   <li>{@link gov.loc.mets.impl.StreamTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.StreamTypeImpl#getOWNERID <em>OWNERID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.StreamTypeImpl#getStreamType <em>Stream Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StreamTypeImpl extends EObjectImpl implements StreamType {
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
         * The default value of the '{@link #getBEGIN() <em>BEGIN</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBEGIN()
         * @generated
         * @ordered
         */
        protected static final String BEGIN_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getBEGIN() <em>BEGIN</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBEGIN()
         * @generated
         * @ordered
         */
        protected String bEGIN = BEGIN_EDEFAULT;

        /**
         * The default value of the '{@link #getBETYPE() <em>BETYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBETYPE()
         * @generated
         * @ordered
         */
        protected static final BETYPEType2 BETYPE_EDEFAULT = BETYPEType2.BYTE;

        /**
         * The cached value of the '{@link #getBETYPE() <em>BETYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBETYPE()
         * @generated
         * @ordered
         */
        protected BETYPEType2 bETYPE = BETYPE_EDEFAULT;

        /**
         * This is true if the BETYPE attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean bETYPEESet;

        /**
         * The default value of the '{@link #getDMDID() <em>DMDID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDMDID()
         * @generated
         * @ordered
         */
        protected static final List<String> DMDID_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getDMDID() <em>DMDID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDMDID()
         * @generated
         * @ordered
         */
        protected List<String> dMDID = DMDID_EDEFAULT;

        /**
         * The default value of the '{@link #getEND() <em>END</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getEND()
         * @generated
         * @ordered
         */
        protected static final String END_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getEND() <em>END</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getEND()
         * @generated
         * @ordered
         */
        protected String eND = END_EDEFAULT;

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
         * The default value of the '{@link #getOWNERID() <em>OWNERID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOWNERID()
         * @generated
         * @ordered
         */
        protected static final String OWNERID_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getOWNERID() <em>OWNERID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOWNERID()
         * @generated
         * @ordered
         */
        protected String oWNERID = OWNERID_EDEFAULT;

        /**
         * The default value of the '{@link #getStreamType() <em>Stream Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getStreamType()
         * @generated
         * @ordered
         */
        protected static final String STREAM_TYPE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getStreamType() <em>Stream Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getStreamType()
         * @generated
         * @ordered
         */
        protected String streamType = STREAM_TYPE_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected StreamTypeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return MetsPackage.Literals.STREAM_TYPE;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.STREAM_TYPE__ADMID, oldADMID, aDMID));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getBEGIN() {
                return bEGIN;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setBEGIN(String newBEGIN) {
                String oldBEGIN = bEGIN;
                bEGIN = newBEGIN;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.STREAM_TYPE__BEGIN, oldBEGIN, bEGIN));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BETYPEType2 getBETYPE() {
                return bETYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setBETYPE(BETYPEType2 newBETYPE) {
                BETYPEType2 oldBETYPE = bETYPE;
                bETYPE = newBETYPE == null ? BETYPE_EDEFAULT : newBETYPE;
                boolean oldBETYPEESet = bETYPEESet;
                bETYPEESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.STREAM_TYPE__BETYPE, oldBETYPE, bETYPE, !oldBETYPEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetBETYPE() {
                BETYPEType2 oldBETYPE = bETYPE;
                boolean oldBETYPEESet = bETYPEESet;
                bETYPE = BETYPE_EDEFAULT;
                bETYPEESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.STREAM_TYPE__BETYPE, oldBETYPE, BETYPE_EDEFAULT, oldBETYPEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetBETYPE() {
                return bETYPEESet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public List<String> getDMDID() {
                return dMDID;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setDMDID(List<String> newDMDID) {
                List<String> oldDMDID = dMDID;
                dMDID = newDMDID;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.STREAM_TYPE__DMDID, oldDMDID, dMDID));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getEND() {
                return eND;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setEND(String newEND) {
                String oldEND = eND;
                eND = newEND;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.STREAM_TYPE__END, oldEND, eND));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.STREAM_TYPE__ID, oldID, iD));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getOWNERID() {
                return oWNERID;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setOWNERID(String newOWNERID) {
                String oldOWNERID = oWNERID;
                oWNERID = newOWNERID;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.STREAM_TYPE__OWNERID, oldOWNERID, oWNERID));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getStreamType() {
                return streamType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setStreamType(String newStreamType) {
                String oldStreamType = streamType;
                streamType = newStreamType;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.STREAM_TYPE__STREAM_TYPE, oldStreamType, streamType));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case MetsPackage.STREAM_TYPE__ADMID:
                                return getADMID();
                        case MetsPackage.STREAM_TYPE__BEGIN:
                                return getBEGIN();
                        case MetsPackage.STREAM_TYPE__BETYPE:
                                return getBETYPE();
                        case MetsPackage.STREAM_TYPE__DMDID:
                                return getDMDID();
                        case MetsPackage.STREAM_TYPE__END:
                                return getEND();
                        case MetsPackage.STREAM_TYPE__ID:
                                return getID();
                        case MetsPackage.STREAM_TYPE__OWNERID:
                                return getOWNERID();
                        case MetsPackage.STREAM_TYPE__STREAM_TYPE:
                                return getStreamType();
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
                        case MetsPackage.STREAM_TYPE__ADMID:
                                setADMID((List<String>)newValue);
                                return;
                        case MetsPackage.STREAM_TYPE__BEGIN:
                                setBEGIN((String)newValue);
                                return;
                        case MetsPackage.STREAM_TYPE__BETYPE:
                                setBETYPE((BETYPEType2)newValue);
                                return;
                        case MetsPackage.STREAM_TYPE__DMDID:
                                setDMDID((List<String>)newValue);
                                return;
                        case MetsPackage.STREAM_TYPE__END:
                                setEND((String)newValue);
                                return;
                        case MetsPackage.STREAM_TYPE__ID:
                                setID((String)newValue);
                                return;
                        case MetsPackage.STREAM_TYPE__OWNERID:
                                setOWNERID((String)newValue);
                                return;
                        case MetsPackage.STREAM_TYPE__STREAM_TYPE:
                                setStreamType((String)newValue);
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
                        case MetsPackage.STREAM_TYPE__ADMID:
                                setADMID(ADMID_EDEFAULT);
                                return;
                        case MetsPackage.STREAM_TYPE__BEGIN:
                                setBEGIN(BEGIN_EDEFAULT);
                                return;
                        case MetsPackage.STREAM_TYPE__BETYPE:
                                unsetBETYPE();
                                return;
                        case MetsPackage.STREAM_TYPE__DMDID:
                                setDMDID(DMDID_EDEFAULT);
                                return;
                        case MetsPackage.STREAM_TYPE__END:
                                setEND(END_EDEFAULT);
                                return;
                        case MetsPackage.STREAM_TYPE__ID:
                                setID(ID_EDEFAULT);
                                return;
                        case MetsPackage.STREAM_TYPE__OWNERID:
                                setOWNERID(OWNERID_EDEFAULT);
                                return;
                        case MetsPackage.STREAM_TYPE__STREAM_TYPE:
                                setStreamType(STREAM_TYPE_EDEFAULT);
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
                        case MetsPackage.STREAM_TYPE__ADMID:
                                return ADMID_EDEFAULT == null ? aDMID != null : !ADMID_EDEFAULT.equals(aDMID);
                        case MetsPackage.STREAM_TYPE__BEGIN:
                                return BEGIN_EDEFAULT == null ? bEGIN != null : !BEGIN_EDEFAULT.equals(bEGIN);
                        case MetsPackage.STREAM_TYPE__BETYPE:
                                return isSetBETYPE();
                        case MetsPackage.STREAM_TYPE__DMDID:
                                return DMDID_EDEFAULT == null ? dMDID != null : !DMDID_EDEFAULT.equals(dMDID);
                        case MetsPackage.STREAM_TYPE__END:
                                return END_EDEFAULT == null ? eND != null : !END_EDEFAULT.equals(eND);
                        case MetsPackage.STREAM_TYPE__ID:
                                return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
                        case MetsPackage.STREAM_TYPE__OWNERID:
                                return OWNERID_EDEFAULT == null ? oWNERID != null : !OWNERID_EDEFAULT.equals(oWNERID);
                        case MetsPackage.STREAM_TYPE__STREAM_TYPE:
                                return STREAM_TYPE_EDEFAULT == null ? streamType != null : !STREAM_TYPE_EDEFAULT.equals(streamType);
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
                result.append(", bEGIN: ");
                result.append(bEGIN);
                result.append(", bETYPE: ");
                if (bETYPEESet) result.append(bETYPE); else result.append("<unset>");
                result.append(", dMDID: ");
                result.append(dMDID);
                result.append(", eND: ");
                result.append(eND);
                result.append(", iD: ");
                result.append(iD);
                result.append(", oWNERID: ");
                result.append(oWNERID);
                result.append(", streamType: ");
                result.append(streamType);
                result.append(')');
                return result.toString();
        }

} //StreamTypeImpl
