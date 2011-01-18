/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gov.loc.mets.impl;

import gov.loc.mets.CHECKSUMTYPEType;
import gov.loc.mets.LOCTYPEType;
import gov.loc.mets.MDTYPEType;
import gov.loc.mets.MdRefType;
import gov.loc.mets.MetsPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Md Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getCHECKSUM <em>CHECKSUM</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getCREATED <em>CREATED</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getLABEL <em>LABEL</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getLOCTYPE <em>LOCTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getMDTYPE <em>MDTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getMDTYPEVERSION <em>MDTYPEVERSION</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getMIMETYPE <em>MIMETYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getOTHERLOCTYPE <em>OTHERLOCTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getOTHERMDTYPE <em>OTHERMDTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getSIZE <em>SIZE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.loc.mets.impl.MdRefTypeImpl#getXPTR <em>XPTR</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MdRefTypeImpl extends EObjectImpl implements MdRefType {
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
         * The default value of the '{@link #getCHECKSUM() <em>CHECKSUM</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCHECKSUM()
         * @generated
         * @ordered
         */
        protected static final String CHECKSUM_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getCHECKSUM() <em>CHECKSUM</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCHECKSUM()
         * @generated
         * @ordered
         */
        protected String cHECKSUM = CHECKSUM_EDEFAULT;

        /**
         * The default value of the '{@link #getCHECKSUMTYPE() <em>CHECKSUMTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCHECKSUMTYPE()
         * @generated
         * @ordered
         */
        protected static final CHECKSUMTYPEType CHECKSUMTYPE_EDEFAULT = CHECKSUMTYPEType.ADLER32;

        /**
         * The cached value of the '{@link #getCHECKSUMTYPE() <em>CHECKSUMTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCHECKSUMTYPE()
         * @generated
         * @ordered
         */
        protected CHECKSUMTYPEType cHECKSUMTYPE = CHECKSUMTYPE_EDEFAULT;

        /**
         * This is true if the CHECKSUMTYPE attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean cHECKSUMTYPEESet;

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
         * The default value of the '{@link #getMDTYPE() <em>MDTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMDTYPE()
         * @generated
         * @ordered
         */
        protected static final MDTYPEType MDTYPE_EDEFAULT = MDTYPEType.MARC;

        /**
         * The cached value of the '{@link #getMDTYPE() <em>MDTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMDTYPE()
         * @generated
         * @ordered
         */
        protected MDTYPEType mDTYPE = MDTYPE_EDEFAULT;

        /**
         * This is true if the MDTYPE attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean mDTYPEESet;

        /**
         * The default value of the '{@link #getMDTYPEVERSION() <em>MDTYPEVERSION</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMDTYPEVERSION()
         * @generated
         * @ordered
         */
        protected static final String MDTYPEVERSION_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getMDTYPEVERSION() <em>MDTYPEVERSION</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMDTYPEVERSION()
         * @generated
         * @ordered
         */
        protected String mDTYPEVERSION = MDTYPEVERSION_EDEFAULT;

        /**
         * The default value of the '{@link #getMIMETYPE() <em>MIMETYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMIMETYPE()
         * @generated
         * @ordered
         */
        protected static final String MIMETYPE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getMIMETYPE() <em>MIMETYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMIMETYPE()
         * @generated
         * @ordered
         */
        protected String mIMETYPE = MIMETYPE_EDEFAULT;

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
         * The default value of the '{@link #getOTHERMDTYPE() <em>OTHERMDTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOTHERMDTYPE()
         * @generated
         * @ordered
         */
        protected static final String OTHERMDTYPE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getOTHERMDTYPE() <em>OTHERMDTYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOTHERMDTYPE()
         * @generated
         * @ordered
         */
        protected String oTHERMDTYPE = OTHERMDTYPE_EDEFAULT;

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
         * The default value of the '{@link #getSIZE() <em>SIZE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSIZE()
         * @generated
         * @ordered
         */
        protected static final long SIZE_EDEFAULT = 0L;

        /**
         * The cached value of the '{@link #getSIZE() <em>SIZE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSIZE()
         * @generated
         * @ordered
         */
        protected long sIZE = SIZE_EDEFAULT;

        /**
         * This is true if the SIZE attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean sIZEESet;

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
         * The default value of the '{@link #getXPTR() <em>XPTR</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getXPTR()
         * @generated
         * @ordered
         */
        protected static final String XPTR_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getXPTR() <em>XPTR</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getXPTR()
         * @generated
         * @ordered
         */
        protected String xPTR = XPTR_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MdRefTypeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return MetsPackage.Literals.MD_REF_TYPE;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.MD_REF_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__ARCROLE, oldArcrole, arcrole));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getCHECKSUM() {
                return cHECKSUM;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setCHECKSUM(String newCHECKSUM) {
                String oldCHECKSUM = cHECKSUM;
                cHECKSUM = newCHECKSUM;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__CHECKSUM, oldCHECKSUM, cHECKSUM));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public CHECKSUMTYPEType getCHECKSUMTYPE() {
                return cHECKSUMTYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setCHECKSUMTYPE(CHECKSUMTYPEType newCHECKSUMTYPE) {
                CHECKSUMTYPEType oldCHECKSUMTYPE = cHECKSUMTYPE;
                cHECKSUMTYPE = newCHECKSUMTYPE == null ? CHECKSUMTYPE_EDEFAULT : newCHECKSUMTYPE;
                boolean oldCHECKSUMTYPEESet = cHECKSUMTYPEESet;
                cHECKSUMTYPEESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__CHECKSUMTYPE, oldCHECKSUMTYPE, cHECKSUMTYPE, !oldCHECKSUMTYPEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetCHECKSUMTYPE() {
                CHECKSUMTYPEType oldCHECKSUMTYPE = cHECKSUMTYPE;
                boolean oldCHECKSUMTYPEESet = cHECKSUMTYPEESet;
                cHECKSUMTYPE = CHECKSUMTYPE_EDEFAULT;
                cHECKSUMTYPEESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.MD_REF_TYPE__CHECKSUMTYPE, oldCHECKSUMTYPE, CHECKSUMTYPE_EDEFAULT, oldCHECKSUMTYPEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetCHECKSUMTYPE() {
                return cHECKSUMTYPEESet;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__CREATED, oldCREATED, cREATED));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__HREF, oldHref, href));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__ID, oldID, iD));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__LABEL, oldLABEL, lABEL));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__LOCTYPE, oldLOCTYPE, lOCTYPE, !oldLOCTYPEESet));
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
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.MD_REF_TYPE__LOCTYPE, oldLOCTYPE, LOCTYPE_EDEFAULT, oldLOCTYPEESet));
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
        public MDTYPEType getMDTYPE() {
                return mDTYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMDTYPE(MDTYPEType newMDTYPE) {
                MDTYPEType oldMDTYPE = mDTYPE;
                mDTYPE = newMDTYPE == null ? MDTYPE_EDEFAULT : newMDTYPE;
                boolean oldMDTYPEESet = mDTYPEESet;
                mDTYPEESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__MDTYPE, oldMDTYPE, mDTYPE, !oldMDTYPEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetMDTYPE() {
                MDTYPEType oldMDTYPE = mDTYPE;
                boolean oldMDTYPEESet = mDTYPEESet;
                mDTYPE = MDTYPE_EDEFAULT;
                mDTYPEESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.MD_REF_TYPE__MDTYPE, oldMDTYPE, MDTYPE_EDEFAULT, oldMDTYPEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetMDTYPE() {
                return mDTYPEESet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getMDTYPEVERSION() {
                return mDTYPEVERSION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMDTYPEVERSION(String newMDTYPEVERSION) {
                String oldMDTYPEVERSION = mDTYPEVERSION;
                mDTYPEVERSION = newMDTYPEVERSION;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__MDTYPEVERSION, oldMDTYPEVERSION, mDTYPEVERSION));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getMIMETYPE() {
                return mIMETYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMIMETYPE(String newMIMETYPE) {
                String oldMIMETYPE = mIMETYPE;
                mIMETYPE = newMIMETYPE;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__MIMETYPE, oldMIMETYPE, mIMETYPE));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__OTHERLOCTYPE, oldOTHERLOCTYPE, oTHERLOCTYPE));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getOTHERMDTYPE() {
                return oTHERMDTYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setOTHERMDTYPE(String newOTHERMDTYPE) {
                String oldOTHERMDTYPE = oTHERMDTYPE;
                oTHERMDTYPE = newOTHERMDTYPE;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__OTHERMDTYPE, oldOTHERMDTYPE, oTHERMDTYPE));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__ROLE, oldRole, role));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__SHOW, oldShow, show, !oldShowESet));
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
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.MD_REF_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
        public long getSIZE() {
                return sIZE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setSIZE(long newSIZE) {
                long oldSIZE = sIZE;
                sIZE = newSIZE;
                boolean oldSIZEESet = sIZEESet;
                sIZEESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__SIZE, oldSIZE, sIZE, !oldSIZEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetSIZE() {
                long oldSIZE = sIZE;
                boolean oldSIZEESet = sIZEESet;
                sIZE = SIZE_EDEFAULT;
                sIZEESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.MD_REF_TYPE__SIZE, oldSIZE, SIZE_EDEFAULT, oldSIZEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetSIZE() {
                return sIZEESet;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__TITLE, oldTitle, title));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__TYPE, oldType, type, !oldTypeESet));
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
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.MD_REF_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
        public String getXPTR() {
                return xPTR;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setXPTR(String newXPTR) {
                String oldXPTR = xPTR;
                xPTR = newXPTR;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.MD_REF_TYPE__XPTR, oldXPTR, xPTR));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case MetsPackage.MD_REF_TYPE__ACTUATE:
                                return getActuate();
                        case MetsPackage.MD_REF_TYPE__ARCROLE:
                                return getArcrole();
                        case MetsPackage.MD_REF_TYPE__CHECKSUM:
                                return getCHECKSUM();
                        case MetsPackage.MD_REF_TYPE__CHECKSUMTYPE:
                                return getCHECKSUMTYPE();
                        case MetsPackage.MD_REF_TYPE__CREATED:
                                return getCREATED();
                        case MetsPackage.MD_REF_TYPE__HREF:
                                return getHref();
                        case MetsPackage.MD_REF_TYPE__ID:
                                return getID();
                        case MetsPackage.MD_REF_TYPE__LABEL:
                                return getLABEL();
                        case MetsPackage.MD_REF_TYPE__LOCTYPE:
                                return getLOCTYPE();
                        case MetsPackage.MD_REF_TYPE__MDTYPE:
                                return getMDTYPE();
                        case MetsPackage.MD_REF_TYPE__MDTYPEVERSION:
                                return getMDTYPEVERSION();
                        case MetsPackage.MD_REF_TYPE__MIMETYPE:
                                return getMIMETYPE();
                        case MetsPackage.MD_REF_TYPE__OTHERLOCTYPE:
                                return getOTHERLOCTYPE();
                        case MetsPackage.MD_REF_TYPE__OTHERMDTYPE:
                                return getOTHERMDTYPE();
                        case MetsPackage.MD_REF_TYPE__ROLE:
                                return getRole();
                        case MetsPackage.MD_REF_TYPE__SHOW:
                                return getShow();
                        case MetsPackage.MD_REF_TYPE__SIZE:
                                return getSIZE();
                        case MetsPackage.MD_REF_TYPE__TITLE:
                                return getTitle();
                        case MetsPackage.MD_REF_TYPE__TYPE:
                                return getType();
                        case MetsPackage.MD_REF_TYPE__XPTR:
                                return getXPTR();
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
                        case MetsPackage.MD_REF_TYPE__ACTUATE:
                                setActuate((ActuateType)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__ARCROLE:
                                setArcrole((String)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__CHECKSUM:
                                setCHECKSUM((String)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__CHECKSUMTYPE:
                                setCHECKSUMTYPE((CHECKSUMTYPEType)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__CREATED:
                                setCREATED((XMLGregorianCalendar)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__HREF:
                                setHref((String)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__ID:
                                setID((String)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__LABEL:
                                setLABEL((String)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__LOCTYPE:
                                setLOCTYPE((LOCTYPEType)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__MDTYPE:
                                setMDTYPE((MDTYPEType)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__MDTYPEVERSION:
                                setMDTYPEVERSION((String)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__MIMETYPE:
                                setMIMETYPE((String)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__OTHERLOCTYPE:
                                setOTHERLOCTYPE((String)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__OTHERMDTYPE:
                                setOTHERMDTYPE((String)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__ROLE:
                                setRole((String)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__SHOW:
                                setShow((ShowType)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__SIZE:
                                setSIZE((Long)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__TITLE:
                                setTitle((String)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__TYPE:
                                setType((String)newValue);
                                return;
                        case MetsPackage.MD_REF_TYPE__XPTR:
                                setXPTR((String)newValue);
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
                        case MetsPackage.MD_REF_TYPE__ACTUATE:
                                unsetActuate();
                                return;
                        case MetsPackage.MD_REF_TYPE__ARCROLE:
                                setArcrole(ARCROLE_EDEFAULT);
                                return;
                        case MetsPackage.MD_REF_TYPE__CHECKSUM:
                                setCHECKSUM(CHECKSUM_EDEFAULT);
                                return;
                        case MetsPackage.MD_REF_TYPE__CHECKSUMTYPE:
                                unsetCHECKSUMTYPE();
                                return;
                        case MetsPackage.MD_REF_TYPE__CREATED:
                                setCREATED(CREATED_EDEFAULT);
                                return;
                        case MetsPackage.MD_REF_TYPE__HREF:
                                setHref(HREF_EDEFAULT);
                                return;
                        case MetsPackage.MD_REF_TYPE__ID:
                                setID(ID_EDEFAULT);
                                return;
                        case MetsPackage.MD_REF_TYPE__LABEL:
                                setLABEL(LABEL_EDEFAULT);
                                return;
                        case MetsPackage.MD_REF_TYPE__LOCTYPE:
                                unsetLOCTYPE();
                                return;
                        case MetsPackage.MD_REF_TYPE__MDTYPE:
                                unsetMDTYPE();
                                return;
                        case MetsPackage.MD_REF_TYPE__MDTYPEVERSION:
                                setMDTYPEVERSION(MDTYPEVERSION_EDEFAULT);
                                return;
                        case MetsPackage.MD_REF_TYPE__MIMETYPE:
                                setMIMETYPE(MIMETYPE_EDEFAULT);
                                return;
                        case MetsPackage.MD_REF_TYPE__OTHERLOCTYPE:
                                setOTHERLOCTYPE(OTHERLOCTYPE_EDEFAULT);
                                return;
                        case MetsPackage.MD_REF_TYPE__OTHERMDTYPE:
                                setOTHERMDTYPE(OTHERMDTYPE_EDEFAULT);
                                return;
                        case MetsPackage.MD_REF_TYPE__ROLE:
                                setRole(ROLE_EDEFAULT);
                                return;
                        case MetsPackage.MD_REF_TYPE__SHOW:
                                unsetShow();
                                return;
                        case MetsPackage.MD_REF_TYPE__SIZE:
                                unsetSIZE();
                                return;
                        case MetsPackage.MD_REF_TYPE__TITLE:
                                setTitle(TITLE_EDEFAULT);
                                return;
                        case MetsPackage.MD_REF_TYPE__TYPE:
                                unsetType();
                                return;
                        case MetsPackage.MD_REF_TYPE__XPTR:
                                setXPTR(XPTR_EDEFAULT);
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
                        case MetsPackage.MD_REF_TYPE__ACTUATE:
                                return isSetActuate();
                        case MetsPackage.MD_REF_TYPE__ARCROLE:
                                return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
                        case MetsPackage.MD_REF_TYPE__CHECKSUM:
                                return CHECKSUM_EDEFAULT == null ? cHECKSUM != null : !CHECKSUM_EDEFAULT.equals(cHECKSUM);
                        case MetsPackage.MD_REF_TYPE__CHECKSUMTYPE:
                                return isSetCHECKSUMTYPE();
                        case MetsPackage.MD_REF_TYPE__CREATED:
                                return CREATED_EDEFAULT == null ? cREATED != null : !CREATED_EDEFAULT.equals(cREATED);
                        case MetsPackage.MD_REF_TYPE__HREF:
                                return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
                        case MetsPackage.MD_REF_TYPE__ID:
                                return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
                        case MetsPackage.MD_REF_TYPE__LABEL:
                                return LABEL_EDEFAULT == null ? lABEL != null : !LABEL_EDEFAULT.equals(lABEL);
                        case MetsPackage.MD_REF_TYPE__LOCTYPE:
                                return isSetLOCTYPE();
                        case MetsPackage.MD_REF_TYPE__MDTYPE:
                                return isSetMDTYPE();
                        case MetsPackage.MD_REF_TYPE__MDTYPEVERSION:
                                return MDTYPEVERSION_EDEFAULT == null ? mDTYPEVERSION != null : !MDTYPEVERSION_EDEFAULT.equals(mDTYPEVERSION);
                        case MetsPackage.MD_REF_TYPE__MIMETYPE:
                                return MIMETYPE_EDEFAULT == null ? mIMETYPE != null : !MIMETYPE_EDEFAULT.equals(mIMETYPE);
                        case MetsPackage.MD_REF_TYPE__OTHERLOCTYPE:
                                return OTHERLOCTYPE_EDEFAULT == null ? oTHERLOCTYPE != null : !OTHERLOCTYPE_EDEFAULT.equals(oTHERLOCTYPE);
                        case MetsPackage.MD_REF_TYPE__OTHERMDTYPE:
                                return OTHERMDTYPE_EDEFAULT == null ? oTHERMDTYPE != null : !OTHERMDTYPE_EDEFAULT.equals(oTHERMDTYPE);
                        case MetsPackage.MD_REF_TYPE__ROLE:
                                return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
                        case MetsPackage.MD_REF_TYPE__SHOW:
                                return isSetShow();
                        case MetsPackage.MD_REF_TYPE__SIZE:
                                return isSetSIZE();
                        case MetsPackage.MD_REF_TYPE__TITLE:
                                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
                        case MetsPackage.MD_REF_TYPE__TYPE:
                                return isSetType();
                        case MetsPackage.MD_REF_TYPE__XPTR:
                                return XPTR_EDEFAULT == null ? xPTR != null : !XPTR_EDEFAULT.equals(xPTR);
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
                result.append(", cHECKSUM: ");
                result.append(cHECKSUM);
                result.append(", cHECKSUMTYPE: ");
                if (cHECKSUMTYPEESet) result.append(cHECKSUMTYPE); else result.append("<unset>");
                result.append(", cREATED: ");
                result.append(cREATED);
                result.append(", href: ");
                result.append(href);
                result.append(", iD: ");
                result.append(iD);
                result.append(", lABEL: ");
                result.append(lABEL);
                result.append(", lOCTYPE: ");
                if (lOCTYPEESet) result.append(lOCTYPE); else result.append("<unset>");
                result.append(", mDTYPE: ");
                if (mDTYPEESet) result.append(mDTYPE); else result.append("<unset>");
                result.append(", mDTYPEVERSION: ");
                result.append(mDTYPEVERSION);
                result.append(", mIMETYPE: ");
                result.append(mIMETYPE);
                result.append(", oTHERLOCTYPE: ");
                result.append(oTHERLOCTYPE);
                result.append(", oTHERMDTYPE: ");
                result.append(oTHERMDTYPE);
                result.append(", role: ");
                result.append(role);
                result.append(", show: ");
                if (showESet) result.append(show); else result.append("<unset>");
                result.append(", sIZE: ");
                if (sIZEESet) result.append(sIZE); else result.append("<unset>");
                result.append(", title: ");
                result.append(title);
                result.append(", type: ");
                if (typeESet) result.append(type); else result.append("<unset>");
                result.append(", xPTR: ");
                result.append(xPTR);
                result.append(')');
                return result.toString();
        }

} //MdRefTypeImpl
