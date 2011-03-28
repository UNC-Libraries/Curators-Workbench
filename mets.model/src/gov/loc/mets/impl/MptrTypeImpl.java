/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.LOCTYPEType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.MptrType;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mptr Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.MptrTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MptrTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MptrTypeImpl#getCONTENTIDS <em>CONTENTIDS</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MptrTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MptrTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MptrTypeImpl#getLOCTYPE <em>LOCTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MptrTypeImpl#getOTHERLOCTYPE <em>OTHERLOCTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MptrTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MptrTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MptrTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MptrTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MptrTypeImpl extends EObjectImpl implements MptrType {
        /**
         * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getActuate()
         * @generated
         * @ordered
         */
        protected static final ActuateType ACTUATE_EDEFAULT = ActuateType.ON_LOAD;

        /**
         * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getActuate()
         * @generated
         * @ordered
         */
        protected ActuateType actuate = ACTUATE_EDEFAULT;

        /**
         * This is true if the Actuate attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean actuateESet;

        /**
         * The default value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getArcrole()
         * @generated
         * @ordered
         */
        protected static final String ARCROLE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getArcrole()
         * @generated
         * @ordered
         */
        protected String arcrole = ARCROLE_EDEFAULT;

        /**
         * The default value of the '{@link #getCONTENTIDS() <em>CONTENTIDS</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCONTENTIDS()
         * @generated
         * @ordered
         */
        protected static final List<String> CONTENTIDS_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getCONTENTIDS() <em>CONTENTIDS</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCONTENTIDS()
         * @generated
         * @ordered
         */
        protected List<String> cONTENTIDS = CONTENTIDS_EDEFAULT;

        /**
         * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getHref()
         * @generated
         * @ordered
         */
        protected static final String HREF_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getHref()
         * @generated
         * @ordered
         */
        protected String href = HREF_EDEFAULT;

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
         * The default value of the '{@link #getLOCTYPE() <em>LOCTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getLOCTYPE()
         * @generated
         * @ordered
         */
        protected static final LOCTYPEType LOCTYPE_EDEFAULT = LOCTYPEType.ARK;

        /**
         * The cached value of the '{@link #getLOCTYPE() <em>LOCTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getLOCTYPE()
         * @generated
         * @ordered
         */
        protected LOCTYPEType lOCTYPE = LOCTYPE_EDEFAULT;

        /**
         * This is true if the LOCTYPE attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean lOCTYPEESet;

        /**
         * The default value of the '{@link #getOTHERLOCTYPE() <em>OTHERLOCTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOTHERLOCTYPE()
         * @generated
         * @ordered
         */
        protected static final String OTHERLOCTYPE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getOTHERLOCTYPE() <em>OTHERLOCTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOTHERLOCTYPE()
         * @generated
         * @ordered
         */
        protected String oTHERLOCTYPE = OTHERLOCTYPE_EDEFAULT;

        /**
         * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getRole()
         * @generated
         * @ordered
         */
        protected static final String ROLE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getRole()
         * @generated
         * @ordered
         */
        protected String role = ROLE_EDEFAULT;

        /**
         * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getShow()
         * @generated
         * @ordered
         */
        protected static final ShowType SHOW_EDEFAULT = ShowType.NEW;

        /**
         * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getShow()
         * @generated
         * @ordered
         */
        protected ShowType show = SHOW_EDEFAULT;

        /**
         * This is true if the Show attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean showESet;

        /**
         * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTitle()
         * @generated
         * @ordered
         */
        protected static final String TITLE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTitle()
         * @generated
         * @ordered
         */
        protected String title = TITLE_EDEFAULT;

        /**
         * The default value of the '{@link #getType() <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getType()
         * @generated
         * @ordered
         */
        protected static final String TYPE_EDEFAULT = "simple";

        /**
         * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getType()
         * @generated
         * @ordered
         */
        protected String type = TYPE_EDEFAULT;

        /**
         * This is true if the Type attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean typeESet;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MptrTypeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return MetsPackage.Literals.MPTR_TYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ActuateType getActuate() {
                return actuate;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setActuate(ActuateType newActuate) {
                ActuateType oldActuate = actuate;
                actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
                boolean oldActuateESet = actuateESet;
                actuateESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MPTR_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetActuate() {
                ActuateType oldActuate = actuate;
                boolean oldActuateESet = actuateESet;
                actuate = ACTUATE_EDEFAULT;
                actuateESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.MPTR_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetActuate() {
                return actuateESet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getArcrole() {
                return arcrole;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setArcrole(String newArcrole) {
                String oldArcrole = arcrole;
                arcrole = newArcrole;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MPTR_TYPE__ARCROLE, oldArcrole, arcrole));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public List<String> getCONTENTIDS() {
                return cONTENTIDS;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setCONTENTIDS(List<String> newCONTENTIDS) {
                List<String> oldCONTENTIDS = cONTENTIDS;
                cONTENTIDS = newCONTENTIDS;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MPTR_TYPE__CONTENTIDS, oldCONTENTIDS, cONTENTIDS));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getHref() {
                return href;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setHref(String newHref) {
                String oldHref = href;
                href = newHref;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MPTR_TYPE__HREF, oldHref, href));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MPTR_TYPE__ID, oldID, iD));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public LOCTYPEType getLOCTYPE() {
                return lOCTYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setLOCTYPE(LOCTYPEType newLOCTYPE) {
                LOCTYPEType oldLOCTYPE = lOCTYPE;
                lOCTYPE = newLOCTYPE == null ? LOCTYPE_EDEFAULT : newLOCTYPE;
                boolean oldLOCTYPEESet = lOCTYPEESet;
                lOCTYPEESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MPTR_TYPE__LOCTYPE, oldLOCTYPE, lOCTYPE, !oldLOCTYPEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetLOCTYPE() {
                LOCTYPEType oldLOCTYPE = lOCTYPE;
                boolean oldLOCTYPEESet = lOCTYPEESet;
                lOCTYPE = LOCTYPE_EDEFAULT;
                lOCTYPEESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.MPTR_TYPE__LOCTYPE, oldLOCTYPE, LOCTYPE_EDEFAULT, oldLOCTYPEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetLOCTYPE() {
                return lOCTYPEESet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getOTHERLOCTYPE() {
                return oTHERLOCTYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setOTHERLOCTYPE(String newOTHERLOCTYPE) {
                String oldOTHERLOCTYPE = oTHERLOCTYPE;
                oTHERLOCTYPE = newOTHERLOCTYPE;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MPTR_TYPE__OTHERLOCTYPE, oldOTHERLOCTYPE, oTHERLOCTYPE));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getRole() {
                return role;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setRole(String newRole) {
                String oldRole = role;
                role = newRole;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MPTR_TYPE__ROLE, oldRole, role));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ShowType getShow() {
                return show;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setShow(ShowType newShow) {
                ShowType oldShow = show;
                show = newShow == null ? SHOW_EDEFAULT : newShow;
                boolean oldShowESet = showESet;
                showESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MPTR_TYPE__SHOW, oldShow, show, !oldShowESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetShow() {
                ShowType oldShow = show;
                boolean oldShowESet = showESet;
                show = SHOW_EDEFAULT;
                showESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.MPTR_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetShow() {
                return showESet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getTitle() {
                return title;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTitle(String newTitle) {
                String oldTitle = title;
                title = newTitle;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MPTR_TYPE__TITLE, oldTitle, title));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getType() {
                return type;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setType(String newType) {
                String oldType = type;
                type = newType;
                boolean oldTypeESet = typeESet;
                typeESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MPTR_TYPE__TYPE, oldType, type, !oldTypeESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetType() {
                String oldType = type;
                boolean oldTypeESet = typeESet;
                type = TYPE_EDEFAULT;
                typeESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.MPTR_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetType() {
                return typeESet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case MetsPackage.MPTR_TYPE__ACTUATE:
                                return getActuate();
                        case MetsPackage.MPTR_TYPE__ARCROLE:
                                return getArcrole();
                        case MetsPackage.MPTR_TYPE__CONTENTIDS:
                                return getCONTENTIDS();
                        case MetsPackage.MPTR_TYPE__HREF:
                                return getHref();
                        case MetsPackage.MPTR_TYPE__ID:
                                return getID();
                        case MetsPackage.MPTR_TYPE__LOCTYPE:
                                return getLOCTYPE();
                        case MetsPackage.MPTR_TYPE__OTHERLOCTYPE:
                                return getOTHERLOCTYPE();
                        case MetsPackage.MPTR_TYPE__ROLE:
                                return getRole();
                        case MetsPackage.MPTR_TYPE__SHOW:
                                return getShow();
                        case MetsPackage.MPTR_TYPE__TITLE:
                                return getTitle();
                        case MetsPackage.MPTR_TYPE__TYPE:
                                return getType();
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
                        case MetsPackage.MPTR_TYPE__ACTUATE:
                                setActuate((ActuateType)newValue);
                                return;
                        case MetsPackage.MPTR_TYPE__ARCROLE:
                                setArcrole((String)newValue);
                                return;
                        case MetsPackage.MPTR_TYPE__CONTENTIDS:
                                setCONTENTIDS((List<String>)newValue);
                                return;
                        case MetsPackage.MPTR_TYPE__HREF:
                                setHref((String)newValue);
                                return;
                        case MetsPackage.MPTR_TYPE__ID:
                                setID((String)newValue);
                                return;
                        case MetsPackage.MPTR_TYPE__LOCTYPE:
                                setLOCTYPE((LOCTYPEType)newValue);
                                return;
                        case MetsPackage.MPTR_TYPE__OTHERLOCTYPE:
                                setOTHERLOCTYPE((String)newValue);
                                return;
                        case MetsPackage.MPTR_TYPE__ROLE:
                                setRole((String)newValue);
                                return;
                        case MetsPackage.MPTR_TYPE__SHOW:
                                setShow((ShowType)newValue);
                                return;
                        case MetsPackage.MPTR_TYPE__TITLE:
                                setTitle((String)newValue);
                                return;
                        case MetsPackage.MPTR_TYPE__TYPE:
                                setType((String)newValue);
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
                        case MetsPackage.MPTR_TYPE__ACTUATE:
                                unsetActuate();
                                return;
                        case MetsPackage.MPTR_TYPE__ARCROLE:
                                setArcrole(ARCROLE_EDEFAULT);
                                return;
                        case MetsPackage.MPTR_TYPE__CONTENTIDS:
                                setCONTENTIDS(CONTENTIDS_EDEFAULT);
                                return;
                        case MetsPackage.MPTR_TYPE__HREF:
                                setHref(HREF_EDEFAULT);
                                return;
                        case MetsPackage.MPTR_TYPE__ID:
                                setID(ID_EDEFAULT);
                                return;
                        case MetsPackage.MPTR_TYPE__LOCTYPE:
                                unsetLOCTYPE();
                                return;
                        case MetsPackage.MPTR_TYPE__OTHERLOCTYPE:
                                setOTHERLOCTYPE(OTHERLOCTYPE_EDEFAULT);
                                return;
                        case MetsPackage.MPTR_TYPE__ROLE:
                                setRole(ROLE_EDEFAULT);
                                return;
                        case MetsPackage.MPTR_TYPE__SHOW:
                                unsetShow();
                                return;
                        case MetsPackage.MPTR_TYPE__TITLE:
                                setTitle(TITLE_EDEFAULT);
                                return;
                        case MetsPackage.MPTR_TYPE__TYPE:
                                unsetType();
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
                        case MetsPackage.MPTR_TYPE__ACTUATE:
                                return isSetActuate();
                        case MetsPackage.MPTR_TYPE__ARCROLE:
                                return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
                        case MetsPackage.MPTR_TYPE__CONTENTIDS:
                                return CONTENTIDS_EDEFAULT == null ? cONTENTIDS != null : !CONTENTIDS_EDEFAULT.equals(cONTENTIDS);
                        case MetsPackage.MPTR_TYPE__HREF:
                                return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
                        case MetsPackage.MPTR_TYPE__ID:
                                return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
                        case MetsPackage.MPTR_TYPE__LOCTYPE:
                                return isSetLOCTYPE();
                        case MetsPackage.MPTR_TYPE__OTHERLOCTYPE:
                                return OTHERLOCTYPE_EDEFAULT == null ? oTHERLOCTYPE != null : !OTHERLOCTYPE_EDEFAULT.equals(oTHERLOCTYPE);
                        case MetsPackage.MPTR_TYPE__ROLE:
                                return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
                        case MetsPackage.MPTR_TYPE__SHOW:
                                return isSetShow();
                        case MetsPackage.MPTR_TYPE__TITLE:
                                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
                        case MetsPackage.MPTR_TYPE__TYPE:
                                return isSetType();
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
                result.append(" (actuate: ");
                if (actuateESet) result.append(actuate); else result.append("<unset>");
                result.append(", arcrole: ");
                result.append(arcrole);
                result.append(", cONTENTIDS: ");
                result.append(cONTENTIDS);
                result.append(", href: ");
                result.append(href);
                result.append(", iD: ");
                result.append(iD);
                result.append(", lOCTYPE: ");
                if (lOCTYPEESet) result.append(lOCTYPE); else result.append("<unset>");
                result.append(", oTHERLOCTYPE: ");
                result.append(oTHERLOCTYPE);
                result.append(", role: ");
                result.append(role);
                result.append(", show: ");
                if (showESet) result.append(show); else result.append("<unset>");
                result.append(", title: ");
                result.append(title);
                result.append(", type: ");
                if (typeESet) result.append(type); else result.append("<unset>");
                result.append(')');
                return result.toString();
        }

} //MptrTypeImpl
