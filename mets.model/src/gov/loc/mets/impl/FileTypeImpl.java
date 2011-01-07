/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.BETYPEType1;
import gov.loc.mets.CHECKSUMTYPEType;
import gov.loc.mets.FContentType;
import gov.loc.mets.FLocatType;
import gov.loc.mets.FileType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.StreamType;
import gov.loc.mets.TransformFileType;

import java.util.Collection;
import java.util.List;

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
 * An implementation of the model object '<em><b>File Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getFLocat <em>FLocat</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getFContent <em>FContent</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getStream <em>Stream</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getTransformFile <em>Transform File</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getFile <em>File</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getBEGIN <em>BEGIN</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getBETYPE <em>BETYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getCHECKSUM <em>CHECKSUM</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getCREATED <em>CREATED</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getDMDID <em>DMDID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getEND <em>END</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getGROUPID <em>GROUPID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getMIMETYPE <em>MIMETYPE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getOWNERID <em>OWNERID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getSEQ <em>SEQ</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getSIZE <em>SIZE</em>}</li>
 *   <li>{@link gov.loc.mets.impl.FileTypeImpl#getUSE <em>USE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileTypeImpl extends EObjectImpl implements FileType {
        /**
         * The cached value of the '{@link #getFLocat() <em>FLocat</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFLocat()
         * @generated
         * @ordered
         */
        protected EList<FLocatType> fLocat;

        /**
         * The cached value of the '{@link #getFContent() <em>FContent</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFContent()
         * @generated
         * @ordered
         */
        protected FContentType fContent;

        /**
         * The cached value of the '{@link #getStream() <em>Stream</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getStream()
         * @generated
         * @ordered
         */
        protected EList<StreamType> stream;

        /**
         * The cached value of the '{@link #getTransformFile() <em>Transform File</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTransformFile()
         * @generated
         * @ordered
         */
        protected EList<TransformFileType> transformFile;

        /**
         * The cached value of the '{@link #getFile() <em>File</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFile()
         * @generated
         * @ordered
         */
        protected EList<FileType> file;

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
        protected static final BETYPEType1 BETYPE_EDEFAULT = BETYPEType1.BYTE;

        /**
         * The cached value of the '{@link #getBETYPE() <em>BETYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBETYPE()
         * @generated
         * @ordered
         */
        protected BETYPEType1 bETYPE = BETYPE_EDEFAULT;

        /**
         * This is true if the BETYPE attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean bETYPEESet;

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
         * The default value of the '{@link #getSEQ() <em>SEQ</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSEQ()
         * @generated
         * @ordered
         */
        protected static final int SEQ_EDEFAULT = 0;

        /**
         * The cached value of the '{@link #getSEQ() <em>SEQ</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSEQ()
         * @generated
         * @ordered
         */
        protected int sEQ = SEQ_EDEFAULT;

        /**
         * This is true if the SEQ attribute has been set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        protected boolean sEQESet;

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
         * The default value of the '{@link #getUSE() <em>USE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getUSE()
         * @generated
         * @ordered
         */
        protected static final String USE_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getUSE() <em>USE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getUSE()
         * @generated
         * @ordered
         */
        protected String uSE = USE_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected FileTypeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return MetsPackage.Literals.FILE_TYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<FLocatType> getFLocat() {
                if (fLocat == null) {
                        fLocat = new EObjectContainmentEList<FLocatType>(FLocatType.class, this, MetsPackage.FILE_TYPE__FLOCAT);
                }
                return fLocat;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public FContentType getFContent() {
                return fContent;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetFContent(FContentType newFContent, NotificationChain msgs) {
                FContentType oldFContent = fContent;
                fContent = newFContent;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__FCONTENT, oldFContent, newFContent);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setFContent(FContentType newFContent) {
                if (newFContent != fContent) {
                        NotificationChain msgs = null;
                        if (fContent != null)
                                msgs = ((InternalEObject)fContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetsPackage.FILE_TYPE__FCONTENT, null, msgs);
                        if (newFContent != null)
                                msgs = ((InternalEObject)newFContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetsPackage.FILE_TYPE__FCONTENT, null, msgs);
                        msgs = basicSetFContent(newFContent, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__FCONTENT, newFContent, newFContent));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<StreamType> getStream() {
                if (stream == null) {
                        stream = new EObjectContainmentEList<StreamType>(StreamType.class, this, MetsPackage.FILE_TYPE__STREAM);
                }
                return stream;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<TransformFileType> getTransformFile() {
                if (transformFile == null) {
                        transformFile = new EObjectContainmentEList<TransformFileType>(TransformFileType.class, this, MetsPackage.FILE_TYPE__TRANSFORM_FILE);
                }
                return transformFile;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<FileType> getFile() {
                if (file == null) {
                        file = new EObjectContainmentEList<FileType>(FileType.class, this, MetsPackage.FILE_TYPE__FILE);
                }
                return file;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__ADMID, oldADMID, aDMID));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__BEGIN, oldBEGIN, bEGIN));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BETYPEType1 getBETYPE() {
                return bETYPE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setBETYPE(BETYPEType1 newBETYPE) {
                BETYPEType1 oldBETYPE = bETYPE;
                bETYPE = newBETYPE == null ? BETYPE_EDEFAULT : newBETYPE;
                boolean oldBETYPEESet = bETYPEESet;
                bETYPEESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__BETYPE, oldBETYPE, bETYPE, !oldBETYPEESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetBETYPE() {
                BETYPEType1 oldBETYPE = bETYPE;
                boolean oldBETYPEESet = bETYPEESet;
                bETYPE = BETYPE_EDEFAULT;
                bETYPEESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.FILE_TYPE__BETYPE, oldBETYPE, BETYPE_EDEFAULT, oldBETYPEESet));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__CHECKSUM, oldCHECKSUM, cHECKSUM));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__CHECKSUMTYPE, oldCHECKSUMTYPE, cHECKSUMTYPE, !oldCHECKSUMTYPEESet));
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
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.FILE_TYPE__CHECKSUMTYPE, oldCHECKSUMTYPE, CHECKSUMTYPE_EDEFAULT, oldCHECKSUMTYPEESet));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__CREATED, oldCREATED, cREATED));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__DMDID, oldDMDID, dMDID));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__END, oldEND, eND));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__GROUPID, oldGROUPID, gROUPID));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__ID, oldID, iD));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__MIMETYPE, oldMIMETYPE, mIMETYPE));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__OWNERID, oldOWNERID, oWNERID));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public int getSEQ() {
                return sEQ;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setSEQ(int newSEQ) {
                int oldSEQ = sEQ;
                sEQ = newSEQ;
                boolean oldSEQESet = sEQESet;
                sEQESet = true;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__SEQ, oldSEQ, sEQ, !oldSEQESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void unsetSEQ() {
                int oldSEQ = sEQ;
                boolean oldSEQESet = sEQESet;
                sEQ = SEQ_EDEFAULT;
                sEQESet = false;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.FILE_TYPE__SEQ, oldSEQ, SEQ_EDEFAULT, oldSEQESet));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetSEQ() {
                return sEQESet;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__SIZE, oldSIZE, sIZE, !oldSIZEESet));
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
                        eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.FILE_TYPE__SIZE, oldSIZE, SIZE_EDEFAULT, oldSIZEESet));
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
        public String getUSE() {
                return uSE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setUSE(String newUSE) {
                String oldUSE = uSE;
                uSE = newUSE;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.FILE_TYPE__USE, oldUSE, uSE));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case MetsPackage.FILE_TYPE__FLOCAT:
                                return ((InternalEList<?>)getFLocat()).basicRemove(otherEnd, msgs);
                        case MetsPackage.FILE_TYPE__FCONTENT:
                                return basicSetFContent(null, msgs);
                        case MetsPackage.FILE_TYPE__STREAM:
                                return ((InternalEList<?>)getStream()).basicRemove(otherEnd, msgs);
                        case MetsPackage.FILE_TYPE__TRANSFORM_FILE:
                                return ((InternalEList<?>)getTransformFile()).basicRemove(otherEnd, msgs);
                        case MetsPackage.FILE_TYPE__FILE:
                                return ((InternalEList<?>)getFile()).basicRemove(otherEnd, msgs);
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
                        case MetsPackage.FILE_TYPE__FLOCAT:
                                return getFLocat();
                        case MetsPackage.FILE_TYPE__FCONTENT:
                                return getFContent();
                        case MetsPackage.FILE_TYPE__STREAM:
                                return getStream();
                        case MetsPackage.FILE_TYPE__TRANSFORM_FILE:
                                return getTransformFile();
                        case MetsPackage.FILE_TYPE__FILE:
                                return getFile();
                        case MetsPackage.FILE_TYPE__ADMID:
                                return getADMID();
                        case MetsPackage.FILE_TYPE__BEGIN:
                                return getBEGIN();
                        case MetsPackage.FILE_TYPE__BETYPE:
                                return getBETYPE();
                        case MetsPackage.FILE_TYPE__CHECKSUM:
                                return getCHECKSUM();
                        case MetsPackage.FILE_TYPE__CHECKSUMTYPE:
                                return getCHECKSUMTYPE();
                        case MetsPackage.FILE_TYPE__CREATED:
                                return getCREATED();
                        case MetsPackage.FILE_TYPE__DMDID:
                                return getDMDID();
                        case MetsPackage.FILE_TYPE__END:
                                return getEND();
                        case MetsPackage.FILE_TYPE__GROUPID:
                                return getGROUPID();
                        case MetsPackage.FILE_TYPE__ID:
                                return getID();
                        case MetsPackage.FILE_TYPE__MIMETYPE:
                                return getMIMETYPE();
                        case MetsPackage.FILE_TYPE__OWNERID:
                                return getOWNERID();
                        case MetsPackage.FILE_TYPE__SEQ:
                                return getSEQ();
                        case MetsPackage.FILE_TYPE__SIZE:
                                return getSIZE();
                        case MetsPackage.FILE_TYPE__USE:
                                return getUSE();
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
                        case MetsPackage.FILE_TYPE__FLOCAT:
                                getFLocat().clear();
                                getFLocat().addAll((Collection<? extends FLocatType>)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__FCONTENT:
                                setFContent((FContentType)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__STREAM:
                                getStream().clear();
                                getStream().addAll((Collection<? extends StreamType>)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__TRANSFORM_FILE:
                                getTransformFile().clear();
                                getTransformFile().addAll((Collection<? extends TransformFileType>)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__FILE:
                                getFile().clear();
                                getFile().addAll((Collection<? extends FileType>)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__ADMID:
                                setADMID((List<String>)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__BEGIN:
                                setBEGIN((String)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__BETYPE:
                                setBETYPE((BETYPEType1)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__CHECKSUM:
                                setCHECKSUM((String)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__CHECKSUMTYPE:
                                setCHECKSUMTYPE((CHECKSUMTYPEType)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__CREATED:
                                setCREATED((XMLGregorianCalendar)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__DMDID:
                                setDMDID((List<String>)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__END:
                                setEND((String)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__GROUPID:
                                setGROUPID((String)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__ID:
                                setID((String)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__MIMETYPE:
                                setMIMETYPE((String)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__OWNERID:
                                setOWNERID((String)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__SEQ:
                                setSEQ((Integer)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__SIZE:
                                setSIZE((Long)newValue);
                                return;
                        case MetsPackage.FILE_TYPE__USE:
                                setUSE((String)newValue);
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
                        case MetsPackage.FILE_TYPE__FLOCAT:
                                getFLocat().clear();
                                return;
                        case MetsPackage.FILE_TYPE__FCONTENT:
                                setFContent((FContentType)null);
                                return;
                        case MetsPackage.FILE_TYPE__STREAM:
                                getStream().clear();
                                return;
                        case MetsPackage.FILE_TYPE__TRANSFORM_FILE:
                                getTransformFile().clear();
                                return;
                        case MetsPackage.FILE_TYPE__FILE:
                                getFile().clear();
                                return;
                        case MetsPackage.FILE_TYPE__ADMID:
                                setADMID(ADMID_EDEFAULT);
                                return;
                        case MetsPackage.FILE_TYPE__BEGIN:
                                setBEGIN(BEGIN_EDEFAULT);
                                return;
                        case MetsPackage.FILE_TYPE__BETYPE:
                                unsetBETYPE();
                                return;
                        case MetsPackage.FILE_TYPE__CHECKSUM:
                                setCHECKSUM(CHECKSUM_EDEFAULT);
                                return;
                        case MetsPackage.FILE_TYPE__CHECKSUMTYPE:
                                unsetCHECKSUMTYPE();
                                return;
                        case MetsPackage.FILE_TYPE__CREATED:
                                setCREATED(CREATED_EDEFAULT);
                                return;
                        case MetsPackage.FILE_TYPE__DMDID:
                                setDMDID(DMDID_EDEFAULT);
                                return;
                        case MetsPackage.FILE_TYPE__END:
                                setEND(END_EDEFAULT);
                                return;
                        case MetsPackage.FILE_TYPE__GROUPID:
                                setGROUPID(GROUPID_EDEFAULT);
                                return;
                        case MetsPackage.FILE_TYPE__ID:
                                setID(ID_EDEFAULT);
                                return;
                        case MetsPackage.FILE_TYPE__MIMETYPE:
                                setMIMETYPE(MIMETYPE_EDEFAULT);
                                return;
                        case MetsPackage.FILE_TYPE__OWNERID:
                                setOWNERID(OWNERID_EDEFAULT);
                                return;
                        case MetsPackage.FILE_TYPE__SEQ:
                                unsetSEQ();
                                return;
                        case MetsPackage.FILE_TYPE__SIZE:
                                unsetSIZE();
                                return;
                        case MetsPackage.FILE_TYPE__USE:
                                setUSE(USE_EDEFAULT);
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
                        case MetsPackage.FILE_TYPE__FLOCAT:
                                return fLocat != null && !fLocat.isEmpty();
                        case MetsPackage.FILE_TYPE__FCONTENT:
                                return fContent != null;
                        case MetsPackage.FILE_TYPE__STREAM:
                                return stream != null && !stream.isEmpty();
                        case MetsPackage.FILE_TYPE__TRANSFORM_FILE:
                                return transformFile != null && !transformFile.isEmpty();
                        case MetsPackage.FILE_TYPE__FILE:
                                return file != null && !file.isEmpty();
                        case MetsPackage.FILE_TYPE__ADMID:
                                return ADMID_EDEFAULT == null ? aDMID != null : !ADMID_EDEFAULT.equals(aDMID);
                        case MetsPackage.FILE_TYPE__BEGIN:
                                return BEGIN_EDEFAULT == null ? bEGIN != null : !BEGIN_EDEFAULT.equals(bEGIN);
                        case MetsPackage.FILE_TYPE__BETYPE:
                                return isSetBETYPE();
                        case MetsPackage.FILE_TYPE__CHECKSUM:
                                return CHECKSUM_EDEFAULT == null ? cHECKSUM != null : !CHECKSUM_EDEFAULT.equals(cHECKSUM);
                        case MetsPackage.FILE_TYPE__CHECKSUMTYPE:
                                return isSetCHECKSUMTYPE();
                        case MetsPackage.FILE_TYPE__CREATED:
                                return CREATED_EDEFAULT == null ? cREATED != null : !CREATED_EDEFAULT.equals(cREATED);
                        case MetsPackage.FILE_TYPE__DMDID:
                                return DMDID_EDEFAULT == null ? dMDID != null : !DMDID_EDEFAULT.equals(dMDID);
                        case MetsPackage.FILE_TYPE__END:
                                return END_EDEFAULT == null ? eND != null : !END_EDEFAULT.equals(eND);
                        case MetsPackage.FILE_TYPE__GROUPID:
                                return GROUPID_EDEFAULT == null ? gROUPID != null : !GROUPID_EDEFAULT.equals(gROUPID);
                        case MetsPackage.FILE_TYPE__ID:
                                return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
                        case MetsPackage.FILE_TYPE__MIMETYPE:
                                return MIMETYPE_EDEFAULT == null ? mIMETYPE != null : !MIMETYPE_EDEFAULT.equals(mIMETYPE);
                        case MetsPackage.FILE_TYPE__OWNERID:
                                return OWNERID_EDEFAULT == null ? oWNERID != null : !OWNERID_EDEFAULT.equals(oWNERID);
                        case MetsPackage.FILE_TYPE__SEQ:
                                return isSetSEQ();
                        case MetsPackage.FILE_TYPE__SIZE:
                                return isSetSIZE();
                        case MetsPackage.FILE_TYPE__USE:
                                return USE_EDEFAULT == null ? uSE != null : !USE_EDEFAULT.equals(uSE);
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
                result.append(", cHECKSUM: ");
                result.append(cHECKSUM);
                result.append(", cHECKSUMTYPE: ");
                if (cHECKSUMTYPEESet) result.append(cHECKSUMTYPE); else result.append("<unset>");
                result.append(", cREATED: ");
                result.append(cREATED);
                result.append(", dMDID: ");
                result.append(dMDID);
                result.append(", eND: ");
                result.append(eND);
                result.append(", gROUPID: ");
                result.append(gROUPID);
                result.append(", iD: ");
                result.append(iD);
                result.append(", mIMETYPE: ");
                result.append(mIMETYPE);
                result.append(", oWNERID: ");
                result.append(oWNERID);
                result.append(", sEQ: ");
                if (sEQESet) result.append(sEQ); else result.append("<unset>");
                result.append(", sIZE: ");
                if (sIZEESet) result.append(sIZE); else result.append("<unset>");
                result.append(", uSE: ");
                result.append(uSE);
                result.append(')');
                return result.toString();
        }

} //FileTypeImpl
