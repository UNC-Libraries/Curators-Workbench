/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gov.loc.mets.MetsFactory
 * @model kind="package"
 * @generated
 */
public interface MetsPackage extends EPackage {
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "mets";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "http://www.loc.gov/METS/";

        /**
         * The package namespace name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_PREFIX = "mets";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        MetsPackage eINSTANCE = gov.loc.mets.impl.MetsPackageImpl.init();

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.AgentTypeImpl <em>Agent Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.AgentTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getAgentType()
         * @generated
         */
        int AGENT_TYPE = 0;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AGENT_TYPE__NAME = 0;

        /**
         * The feature id for the '<em><b>Note</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AGENT_TYPE__NOTE = 1;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AGENT_TYPE__ID = 2;

        /**
         * The feature id for the '<em><b>OTHERROLE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AGENT_TYPE__OTHERROLE = 3;

        /**
         * The feature id for the '<em><b>OTHERTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AGENT_TYPE__OTHERTYPE = 4;

        /**
         * The feature id for the '<em><b>ROLE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AGENT_TYPE__ROLE = 5;

        /**
         * The feature id for the '<em><b>TYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AGENT_TYPE__TYPE = 6;

        /**
         * The number of structural features of the '<em>Agent Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AGENT_TYPE_FEATURE_COUNT = 7;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.AltRecordIDTypeImpl <em>Alt Record ID Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.AltRecordIDTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getAltRecordIDType()
         * @generated
         */
        int ALT_RECORD_ID_TYPE = 1;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ALT_RECORD_ID_TYPE__VALUE = 0;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ALT_RECORD_ID_TYPE__ID = 1;

        /**
         * The feature id for the '<em><b>TYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ALT_RECORD_ID_TYPE__TYPE = 2;

        /**
         * The number of structural features of the '<em>Alt Record ID Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ALT_RECORD_ID_TYPE_FEATURE_COUNT = 3;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.AmdSecTypeImpl <em>Amd Sec Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.AmdSecTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getAmdSecType()
         * @generated
         */
        int AMD_SEC_TYPE = 2;

        /**
         * The feature id for the '<em><b>Tech MD</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AMD_SEC_TYPE__TECH_MD = 0;

        /**
         * The feature id for the '<em><b>Rights MD</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AMD_SEC_TYPE__RIGHTS_MD = 1;

        /**
         * The feature id for the '<em><b>Source MD</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AMD_SEC_TYPE__SOURCE_MD = 2;

        /**
         * The feature id for the '<em><b>Digiprov MD</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AMD_SEC_TYPE__DIGIPROV_MD = 3;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AMD_SEC_TYPE__ID = 4;

        /**
         * The number of structural features of the '<em>Amd Sec Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AMD_SEC_TYPE_FEATURE_COUNT = 5;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.AreaTypeImpl <em>Area Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.AreaTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getAreaType()
         * @generated
         */
        int AREA_TYPE = 3;

        /**
         * The feature id for the '<em><b>ADMID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_TYPE__ADMID = 0;

        /**
         * The feature id for the '<em><b>BEGIN</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_TYPE__BEGIN = 1;

        /**
         * The feature id for the '<em><b>BETYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_TYPE__BETYPE = 2;

        /**
         * The feature id for the '<em><b>CONTENTIDS</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_TYPE__CONTENTIDS = 3;

        /**
         * The feature id for the '<em><b>COORDS</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_TYPE__COORDS = 4;

        /**
         * The feature id for the '<em><b>END</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_TYPE__END = 5;

        /**
         * The feature id for the '<em><b>EXTENT</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_TYPE__EXTENT = 6;

        /**
         * The feature id for the '<em><b>EXTTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_TYPE__EXTTYPE = 7;

        /**
         * The feature id for the '<em><b>FILEID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_TYPE__FILEID = 8;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_TYPE__ID = 9;

        /**
         * The feature id for the '<em><b>SHAPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_TYPE__SHAPE = 10;

        /**
         * The number of structural features of the '<em>Area Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_TYPE_FEATURE_COUNT = 11;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.BehaviorSecTypeImpl <em>Behavior Sec Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.BehaviorSecTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getBehaviorSecType()
         * @generated
         */
        int BEHAVIOR_SEC_TYPE = 4;

        /**
         * The feature id for the '<em><b>Behavior Sec</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_SEC_TYPE__BEHAVIOR_SEC = 0;

        /**
         * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_SEC_TYPE__BEHAVIOR = 1;

        /**
         * The feature id for the '<em><b>CREATED</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_SEC_TYPE__CREATED = 2;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_SEC_TYPE__ID = 3;

        /**
         * The feature id for the '<em><b>LABEL</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_SEC_TYPE__LABEL = 4;

        /**
         * The number of structural features of the '<em>Behavior Sec Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_SEC_TYPE_FEATURE_COUNT = 5;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.BehaviorTypeImpl <em>Behavior Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.BehaviorTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getBehaviorType()
         * @generated
         */
        int BEHAVIOR_TYPE = 5;

        /**
         * The feature id for the '<em><b>Interface Def</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_TYPE__INTERFACE_DEF = 0;

        /**
         * The feature id for the '<em><b>Mechanism</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_TYPE__MECHANISM = 1;

        /**
         * The feature id for the '<em><b>ADMID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_TYPE__ADMID = 2;

        /**
         * The feature id for the '<em><b>BTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_TYPE__BTYPE = 3;

        /**
         * The feature id for the '<em><b>CREATED</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_TYPE__CREATED = 4;

        /**
         * The feature id for the '<em><b>GROUPID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_TYPE__GROUPID = 5;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_TYPE__ID = 6;

        /**
         * The feature id for the '<em><b>LABEL</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_TYPE__LABEL = 7;

        /**
         * The feature id for the '<em><b>STRUCTID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_TYPE__STRUCTID = 8;

        /**
         * The number of structural features of the '<em>Behavior Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOR_TYPE_FEATURE_COUNT = 9;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.DivTypeImpl <em>Div Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.DivTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getDivType()
         * @generated
         */
        int DIV_TYPE = 6;

        /**
         * The feature id for the '<em><b>Mptr</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIV_TYPE__MPTR = 0;

        /**
         * The feature id for the '<em><b>Fptr</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIV_TYPE__FPTR = 1;

        /**
         * The feature id for the '<em><b>Div</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIV_TYPE__DIV = 2;

        /**
         * The feature id for the '<em><b>Md Sec</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIV_TYPE__MD_SEC = 3;

        /**
         * The feature id for the '<em><b>CONTENTIDS</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIV_TYPE__CONTENTIDS = 4;

        /**
         * The feature id for the '<em><b>Dmd Sec</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIV_TYPE__DMD_SEC = 5;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIV_TYPE__ID = 6;

        /**
         * The feature id for the '<em><b>Label</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIV_TYPE__LABEL = 7;

        /**
         * The feature id for the '<em><b>LABEL1</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIV_TYPE__LABEL1 = 8;

        /**
         * The feature id for the '<em><b>ORDER</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIV_TYPE__ORDER = 9;

        /**
         * The feature id for the '<em><b>ORDERLABEL</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIV_TYPE__ORDERLABEL = 10;

        /**
         * The feature id for the '<em><b>TYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIV_TYPE__TYPE = 11;

        /**
         * The number of structural features of the '<em>Div Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIV_TYPE_FEATURE_COUNT = 12;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.DocumentRootImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getDocumentRoot()
         * @generated
         */
        int DOCUMENT_ROOT = 7;

        /**
         * The feature id for the '<em><b>Mixed</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DOCUMENT_ROOT__MIXED = 0;

        /**
         * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

        /**
         * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

        /**
         * The feature id for the '<em><b>Mets</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DOCUMENT_ROOT__METS = 3;

        /**
         * The number of structural features of the '<em>Document Root</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DOCUMENT_ROOT_FEATURE_COUNT = 4;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.FContentTypeImpl <em>FContent Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.FContentTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getFContentType()
         * @generated
         */
        int FCONTENT_TYPE = 8;

        /**
         * The feature id for the '<em><b>Bin Data</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FCONTENT_TYPE__BIN_DATA = 0;

        /**
         * The feature id for the '<em><b>Xml Data</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FCONTENT_TYPE__XML_DATA = 1;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FCONTENT_TYPE__ID = 2;

        /**
         * The feature id for the '<em><b>USE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FCONTENT_TYPE__USE = 3;

        /**
         * The number of structural features of the '<em>FContent Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FCONTENT_TYPE_FEATURE_COUNT = 4;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.FileGrpTypeImpl <em>File Grp Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.FileGrpTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getFileGrpType()
         * @generated
         */
        int FILE_GRP_TYPE = 9;

        /**
         * The feature id for the '<em><b>File Grp</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_GRP_TYPE__FILE_GRP = 0;

        /**
         * The feature id for the '<em><b>File</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_GRP_TYPE__FILE = 1;

        /**
         * The feature id for the '<em><b>ADMID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_GRP_TYPE__ADMID = 2;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_GRP_TYPE__ID = 3;

        /**
         * The feature id for the '<em><b>USE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_GRP_TYPE__USE = 4;

        /**
         * The feature id for the '<em><b>VERSDATE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_GRP_TYPE__VERSDATE = 5;

        /**
         * The number of structural features of the '<em>File Grp Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_GRP_TYPE_FEATURE_COUNT = 6;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.FileGrpType1Impl <em>File Grp Type1</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.FileGrpType1Impl
         * @see gov.loc.mets.impl.MetsPackageImpl#getFileGrpType1()
         * @generated
         */
        int FILE_GRP_TYPE1 = 10;

        /**
         * The feature id for the '<em><b>File Grp</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_GRP_TYPE1__FILE_GRP = FILE_GRP_TYPE__FILE_GRP;

        /**
         * The feature id for the '<em><b>File</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_GRP_TYPE1__FILE = FILE_GRP_TYPE__FILE;

        /**
         * The feature id for the '<em><b>ADMID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_GRP_TYPE1__ADMID = FILE_GRP_TYPE__ADMID;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_GRP_TYPE1__ID = FILE_GRP_TYPE__ID;

        /**
         * The feature id for the '<em><b>USE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_GRP_TYPE1__USE = FILE_GRP_TYPE__USE;

        /**
         * The feature id for the '<em><b>VERSDATE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_GRP_TYPE1__VERSDATE = FILE_GRP_TYPE__VERSDATE;

        /**
         * The number of structural features of the '<em>File Grp Type1</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_GRP_TYPE1_FEATURE_COUNT = FILE_GRP_TYPE_FEATURE_COUNT + 0;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.FileSecTypeImpl <em>File Sec Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.FileSecTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getFileSecType()
         * @generated
         */
        int FILE_SEC_TYPE = 11;

        /**
         * The feature id for the '<em><b>File Grp</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_SEC_TYPE__FILE_GRP = 0;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_SEC_TYPE__ID = 1;

        /**
         * The number of structural features of the '<em>File Sec Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_SEC_TYPE_FEATURE_COUNT = 2;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.FileTypeImpl <em>File Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.FileTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getFileType()
         * @generated
         */
        int FILE_TYPE = 12;

        /**
         * The feature id for the '<em><b>FLocat</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__FLOCAT = 0;

        /**
         * The feature id for the '<em><b>FContent</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__FCONTENT = 1;

        /**
         * The feature id for the '<em><b>Stream</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__STREAM = 2;

        /**
         * The feature id for the '<em><b>Transform File</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__TRANSFORM_FILE = 3;

        /**
         * The feature id for the '<em><b>File</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__FILE = 4;

        /**
         * The feature id for the '<em><b>ADMID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__ADMID = 5;

        /**
         * The feature id for the '<em><b>BEGIN</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__BEGIN = 6;

        /**
         * The feature id for the '<em><b>BETYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__BETYPE = 7;

        /**
         * The feature id for the '<em><b>CHECKSUM</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__CHECKSUM = 8;

        /**
         * The feature id for the '<em><b>CHECKSUMTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__CHECKSUMTYPE = 9;

        /**
         * The feature id for the '<em><b>CREATED</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__CREATED = 10;

        /**
         * The feature id for the '<em><b>DMDID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__DMDID = 11;

        /**
         * The feature id for the '<em><b>END</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__END = 12;

        /**
         * The feature id for the '<em><b>GROUPID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__GROUPID = 13;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__ID = 14;

        /**
         * The feature id for the '<em><b>MIMETYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__MIMETYPE = 15;

        /**
         * The feature id for the '<em><b>OWNERID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__OWNERID = 16;

        /**
         * The feature id for the '<em><b>SEQ</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__SEQ = 17;

        /**
         * The feature id for the '<em><b>SIZE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__SIZE = 18;

        /**
         * The feature id for the '<em><b>USE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE__USE = 19;

        /**
         * The number of structural features of the '<em>File Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FILE_TYPE_FEATURE_COUNT = 20;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.FLocatTypeImpl <em>FLocat Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.FLocatTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getFLocatType()
         * @generated
         */
        int FLOCAT_TYPE = 13;

        /**
         * The feature id for the '<em><b>Actuate</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FLOCAT_TYPE__ACTUATE = 0;

        /**
         * The feature id for the '<em><b>Arcrole</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FLOCAT_TYPE__ARCROLE = 1;

        /**
         * The feature id for the '<em><b>Href</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FLOCAT_TYPE__HREF = 2;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FLOCAT_TYPE__ID = 3;

        /**
         * The feature id for the '<em><b>LOCTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FLOCAT_TYPE__LOCTYPE = 4;

        /**
         * The feature id for the '<em><b>OTHERLOCTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FLOCAT_TYPE__OTHERLOCTYPE = 5;

        /**
         * The feature id for the '<em><b>Role</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FLOCAT_TYPE__ROLE = 6;

        /**
         * The feature id for the '<em><b>Show</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FLOCAT_TYPE__SHOW = 7;

        /**
         * The feature id for the '<em><b>Title</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FLOCAT_TYPE__TITLE = 8;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FLOCAT_TYPE__TYPE = 9;

        /**
         * The feature id for the '<em><b>USE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FLOCAT_TYPE__USE = 10;

        /**
         * The number of structural features of the '<em>FLocat Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FLOCAT_TYPE_FEATURE_COUNT = 11;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.FptrTypeImpl <em>Fptr Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.FptrTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getFptrType()
         * @generated
         */
        int FPTR_TYPE = 14;

        /**
         * The feature id for the '<em><b>Par</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FPTR_TYPE__PAR = 0;

        /**
         * The feature id for the '<em><b>Seq</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FPTR_TYPE__SEQ = 1;

        /**
         * The feature id for the '<em><b>Area</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FPTR_TYPE__AREA = 2;

        /**
         * The feature id for the '<em><b>CONTENTIDS</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FPTR_TYPE__CONTENTIDS = 3;

        /**
         * The feature id for the '<em><b>FILEID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FPTR_TYPE__FILEID = 4;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FPTR_TYPE__ID = 5;

        /**
         * The number of structural features of the '<em>Fptr Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FPTR_TYPE_FEATURE_COUNT = 6;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.MdRefTypeImpl <em>Md Ref Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.MdRefTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getMdRefType()
         * @generated
         */
        int MD_REF_TYPE = 15;

        /**
         * The feature id for the '<em><b>Actuate</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__ACTUATE = 0;

        /**
         * The feature id for the '<em><b>Arcrole</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__ARCROLE = 1;

        /**
         * The feature id for the '<em><b>CHECKSUM</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__CHECKSUM = 2;

        /**
         * The feature id for the '<em><b>CHECKSUMTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__CHECKSUMTYPE = 3;

        /**
         * The feature id for the '<em><b>CREATED</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__CREATED = 4;

        /**
         * The feature id for the '<em><b>Href</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__HREF = 5;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__ID = 6;

        /**
         * The feature id for the '<em><b>LABEL</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__LABEL = 7;

        /**
         * The feature id for the '<em><b>LOCTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__LOCTYPE = 8;

        /**
         * The feature id for the '<em><b>MDTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__MDTYPE = 9;

        /**
         * The feature id for the '<em><b>MDTYPEVERSION</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__MDTYPEVERSION = 10;

        /**
         * The feature id for the '<em><b>MIMETYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__MIMETYPE = 11;

        /**
         * The feature id for the '<em><b>OTHERLOCTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__OTHERLOCTYPE = 12;

        /**
         * The feature id for the '<em><b>OTHERMDTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__OTHERMDTYPE = 13;

        /**
         * The feature id for the '<em><b>Role</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__ROLE = 14;

        /**
         * The feature id for the '<em><b>Show</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__SHOW = 15;

        /**
         * The feature id for the '<em><b>SIZE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__SIZE = 16;

        /**
         * The feature id for the '<em><b>Title</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__TITLE = 17;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__TYPE = 18;

        /**
         * The feature id for the '<em><b>XPTR</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE__XPTR = 19;

        /**
         * The number of structural features of the '<em>Md Ref Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_REF_TYPE_FEATURE_COUNT = 20;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.MdSecTypeImpl <em>Md Sec Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.MdSecTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getMdSecType()
         * @generated
         */
        int MD_SEC_TYPE = 16;

        /**
         * The feature id for the '<em><b>Md Ref</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_SEC_TYPE__MD_REF = 0;

        /**
         * The feature id for the '<em><b>Md Wrap</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_SEC_TYPE__MD_WRAP = 1;

        /**
         * The feature id for the '<em><b>ADMID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_SEC_TYPE__ADMID = 2;

        /**
         * The feature id for the '<em><b>CREATED</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_SEC_TYPE__CREATED = 3;

        /**
         * The feature id for the '<em><b>GROUPID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_SEC_TYPE__GROUPID = 4;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_SEC_TYPE__ID = 5;

        /**
         * The feature id for the '<em><b>STATUS</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_SEC_TYPE__STATUS = 6;

        /**
         * The number of structural features of the '<em>Md Sec Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_SEC_TYPE_FEATURE_COUNT = 7;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.MdWrapTypeImpl <em>Md Wrap Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.MdWrapTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getMdWrapType()
         * @generated
         */
        int MD_WRAP_TYPE = 17;

        /**
         * The feature id for the '<em><b>Bin Data</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_WRAP_TYPE__BIN_DATA = 0;

        /**
         * The feature id for the '<em><b>Xml Data</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_WRAP_TYPE__XML_DATA = 1;

        /**
         * The feature id for the '<em><b>CHECKSUM</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_WRAP_TYPE__CHECKSUM = 2;

        /**
         * The feature id for the '<em><b>CHECKSUMTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_WRAP_TYPE__CHECKSUMTYPE = 3;

        /**
         * The feature id for the '<em><b>CREATED</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_WRAP_TYPE__CREATED = 4;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_WRAP_TYPE__ID = 5;

        /**
         * The feature id for the '<em><b>LABEL</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_WRAP_TYPE__LABEL = 6;

        /**
         * The feature id for the '<em><b>MDTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_WRAP_TYPE__MDTYPE = 7;

        /**
         * The feature id for the '<em><b>MDTYPEVERSION</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_WRAP_TYPE__MDTYPEVERSION = 8;

        /**
         * The feature id for the '<em><b>MIMETYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_WRAP_TYPE__MIMETYPE = 9;

        /**
         * The feature id for the '<em><b>OTHERMDTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_WRAP_TYPE__OTHERMDTYPE = 10;

        /**
         * The feature id for the '<em><b>SIZE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_WRAP_TYPE__SIZE = 11;

        /**
         * The number of structural features of the '<em>Md Wrap Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MD_WRAP_TYPE_FEATURE_COUNT = 12;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.MetsDocumentIDTypeImpl <em>Document ID Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.MetsDocumentIDTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getMetsDocumentIDType()
         * @generated
         */
        int METS_DOCUMENT_ID_TYPE = 18;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_DOCUMENT_ID_TYPE__VALUE = 0;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_DOCUMENT_ID_TYPE__ID = 1;

        /**
         * The feature id for the '<em><b>TYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_DOCUMENT_ID_TYPE__TYPE = 2;

        /**
         * The number of structural features of the '<em>Document ID Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_DOCUMENT_ID_TYPE_FEATURE_COUNT = 3;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.MetsHdrTypeImpl <em>Hdr Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.MetsHdrTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getMetsHdrType()
         * @generated
         */
        int METS_HDR_TYPE = 19;

        /**
         * The feature id for the '<em><b>Agent</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_HDR_TYPE__AGENT = 0;

        /**
         * The feature id for the '<em><b>Alt Record ID</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_HDR_TYPE__ALT_RECORD_ID = 1;

        /**
         * The feature id for the '<em><b>Mets Document ID</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_HDR_TYPE__METS_DOCUMENT_ID = 2;

        /**
         * The feature id for the '<em><b>ADMID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_HDR_TYPE__ADMID = 3;

        /**
         * The feature id for the '<em><b>CREATEDATE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_HDR_TYPE__CREATEDATE = 4;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_HDR_TYPE__ID = 5;

        /**
         * The feature id for the '<em><b>LASTMODDATE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_HDR_TYPE__LASTMODDATE = 6;

        /**
         * The feature id for the '<em><b>RECORDSTATUS</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_HDR_TYPE__RECORDSTATUS = 7;

        /**
         * The number of structural features of the '<em>Hdr Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_HDR_TYPE_FEATURE_COUNT = 8;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.MetsTypeImpl <em>Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.MetsTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getMetsType()
         * @generated
         */
        int METS_TYPE = 20;

        /**
         * The feature id for the '<em><b>Mets Hdr</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE__METS_HDR = 0;

        /**
         * The feature id for the '<em><b>Dmd Sec</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE__DMD_SEC = 1;

        /**
         * The feature id for the '<em><b>Amd Sec</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE__AMD_SEC = 2;

        /**
         * The feature id for the '<em><b>File Sec</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE__FILE_SEC = 3;

        /**
         * The feature id for the '<em><b>Struct Map</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE__STRUCT_MAP = 4;

        /**
         * The feature id for the '<em><b>Struct Link</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE__STRUCT_LINK = 5;

        /**
         * The feature id for the '<em><b>Behavior Sec</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE__BEHAVIOR_SEC = 6;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE__ID = 7;

        /**
         * The feature id for the '<em><b>LABEL</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE__LABEL = 8;

        /**
         * The feature id for the '<em><b>OBJID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE__OBJID = 9;

        /**
         * The feature id for the '<em><b>PROFILE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE__PROFILE = 10;

        /**
         * The feature id for the '<em><b>TYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE__TYPE = 11;

        /**
         * The number of structural features of the '<em>Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE_FEATURE_COUNT = 12;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.MetsType1Impl <em>Type1</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.MetsType1Impl
         * @see gov.loc.mets.impl.MetsPackageImpl#getMetsType1()
         * @generated
         */
        int METS_TYPE1 = 21;

        /**
         * The feature id for the '<em><b>Mets Hdr</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE1__METS_HDR = METS_TYPE__METS_HDR;

        /**
         * The feature id for the '<em><b>Dmd Sec</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE1__DMD_SEC = METS_TYPE__DMD_SEC;

        /**
         * The feature id for the '<em><b>Amd Sec</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE1__AMD_SEC = METS_TYPE__AMD_SEC;

        /**
         * The feature id for the '<em><b>File Sec</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE1__FILE_SEC = METS_TYPE__FILE_SEC;

        /**
         * The feature id for the '<em><b>Struct Map</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE1__STRUCT_MAP = METS_TYPE__STRUCT_MAP;

        /**
         * The feature id for the '<em><b>Struct Link</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE1__STRUCT_LINK = METS_TYPE__STRUCT_LINK;

        /**
         * The feature id for the '<em><b>Behavior Sec</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE1__BEHAVIOR_SEC = METS_TYPE__BEHAVIOR_SEC;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE1__ID = METS_TYPE__ID;

        /**
         * The feature id for the '<em><b>LABEL</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE1__LABEL = METS_TYPE__LABEL;

        /**
         * The feature id for the '<em><b>OBJID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE1__OBJID = METS_TYPE__OBJID;

        /**
         * The feature id for the '<em><b>PROFILE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE1__PROFILE = METS_TYPE__PROFILE;

        /**
         * The feature id for the '<em><b>TYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE1__TYPE = METS_TYPE__TYPE;

        /**
         * The number of structural features of the '<em>Type1</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int METS_TYPE1_FEATURE_COUNT = METS_TYPE_FEATURE_COUNT + 0;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.MptrTypeImpl <em>Mptr Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.MptrTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getMptrType()
         * @generated
         */
        int MPTR_TYPE = 22;

        /**
         * The feature id for the '<em><b>Actuate</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MPTR_TYPE__ACTUATE = 0;

        /**
         * The feature id for the '<em><b>Arcrole</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MPTR_TYPE__ARCROLE = 1;

        /**
         * The feature id for the '<em><b>CONTENTIDS</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MPTR_TYPE__CONTENTIDS = 2;

        /**
         * The feature id for the '<em><b>Href</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MPTR_TYPE__HREF = 3;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MPTR_TYPE__ID = 4;

        /**
         * The feature id for the '<em><b>LOCTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MPTR_TYPE__LOCTYPE = 5;

        /**
         * The feature id for the '<em><b>OTHERLOCTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MPTR_TYPE__OTHERLOCTYPE = 6;

        /**
         * The feature id for the '<em><b>Role</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MPTR_TYPE__ROLE = 7;

        /**
         * The feature id for the '<em><b>Show</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MPTR_TYPE__SHOW = 8;

        /**
         * The feature id for the '<em><b>Title</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MPTR_TYPE__TITLE = 9;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MPTR_TYPE__TYPE = 10;

        /**
         * The number of structural features of the '<em>Mptr Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MPTR_TYPE_FEATURE_COUNT = 11;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.ObjectTypeImpl <em>Object Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.ObjectTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getObjectType()
         * @generated
         */
        int OBJECT_TYPE = 23;

        /**
         * The feature id for the '<em><b>Actuate</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OBJECT_TYPE__ACTUATE = 0;

        /**
         * The feature id for the '<em><b>Arcrole</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OBJECT_TYPE__ARCROLE = 1;

        /**
         * The feature id for the '<em><b>Href</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OBJECT_TYPE__HREF = 2;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OBJECT_TYPE__ID = 3;

        /**
         * The feature id for the '<em><b>LABEL</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OBJECT_TYPE__LABEL = 4;

        /**
         * The feature id for the '<em><b>LOCTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OBJECT_TYPE__LOCTYPE = 5;

        /**
         * The feature id for the '<em><b>OTHERLOCTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OBJECT_TYPE__OTHERLOCTYPE = 6;

        /**
         * The feature id for the '<em><b>Role</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OBJECT_TYPE__ROLE = 7;

        /**
         * The feature id for the '<em><b>Show</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OBJECT_TYPE__SHOW = 8;

        /**
         * The feature id for the '<em><b>Title</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OBJECT_TYPE__TITLE = 9;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OBJECT_TYPE__TYPE = 10;

        /**
         * The number of structural features of the '<em>Object Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OBJECT_TYPE_FEATURE_COUNT = 11;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.ParTypeImpl <em>Par Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.ParTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getParType()
         * @generated
         */
        int PAR_TYPE = 24;

        /**
         * The feature id for the '<em><b>Group</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PAR_TYPE__GROUP = 0;

        /**
         * The feature id for the '<em><b>Area</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PAR_TYPE__AREA = 1;

        /**
         * The feature id for the '<em><b>Seq</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PAR_TYPE__SEQ = 2;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PAR_TYPE__ID = 3;

        /**
         * The number of structural features of the '<em>Par Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PAR_TYPE_FEATURE_COUNT = 4;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.SeqTypeImpl <em>Seq Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.SeqTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getSeqType()
         * @generated
         */
        int SEQ_TYPE = 25;

        /**
         * The feature id for the '<em><b>Group</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEQ_TYPE__GROUP = 0;

        /**
         * The feature id for the '<em><b>Area</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEQ_TYPE__AREA = 1;

        /**
         * The feature id for the '<em><b>Par</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEQ_TYPE__PAR = 2;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEQ_TYPE__ID = 3;

        /**
         * The number of structural features of the '<em>Seq Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEQ_TYPE_FEATURE_COUNT = 4;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.SmArcLinkTypeImpl <em>Sm Arc Link Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.SmArcLinkTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getSmArcLinkType()
         * @generated
         */
        int SM_ARC_LINK_TYPE = 26;

        /**
         * The feature id for the '<em><b>Actuate</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_ARC_LINK_TYPE__ACTUATE = 0;

        /**
         * The feature id for the '<em><b>ADMID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_ARC_LINK_TYPE__ADMID = 1;

        /**
         * The feature id for the '<em><b>Arcrole</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_ARC_LINK_TYPE__ARCROLE = 2;

        /**
         * The feature id for the '<em><b>ARCTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_ARC_LINK_TYPE__ARCTYPE = 3;

        /**
         * The feature id for the '<em><b>From</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_ARC_LINK_TYPE__FROM = 4;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_ARC_LINK_TYPE__ID = 5;

        /**
         * The feature id for the '<em><b>Show</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_ARC_LINK_TYPE__SHOW = 6;

        /**
         * The feature id for the '<em><b>Title</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_ARC_LINK_TYPE__TITLE = 7;

        /**
         * The feature id for the '<em><b>To</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_ARC_LINK_TYPE__TO = 8;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_ARC_LINK_TYPE__TYPE = 9;

        /**
         * The number of structural features of the '<em>Sm Arc Link Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_ARC_LINK_TYPE_FEATURE_COUNT = 10;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.SmLinkGrpTypeImpl <em>Sm Link Grp Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.SmLinkGrpTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getSmLinkGrpType()
         * @generated
         */
        int SM_LINK_GRP_TYPE = 27;

        /**
         * The feature id for the '<em><b>Sm Locator Link</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_GRP_TYPE__SM_LOCATOR_LINK = 0;

        /**
         * The feature id for the '<em><b>Sm Arc Link</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_GRP_TYPE__SM_ARC_LINK = 1;

        /**
         * The feature id for the '<em><b>ARCLINKORDER</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_GRP_TYPE__ARCLINKORDER = 2;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_GRP_TYPE__ID = 3;

        /**
         * The feature id for the '<em><b>Role</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_GRP_TYPE__ROLE = 4;

        /**
         * The feature id for the '<em><b>Title</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_GRP_TYPE__TITLE = 5;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_GRP_TYPE__TYPE = 6;

        /**
         * The number of structural features of the '<em>Sm Link Grp Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_GRP_TYPE_FEATURE_COUNT = 7;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.SmLinkTypeImpl <em>Sm Link Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.SmLinkTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getSmLinkType()
         * @generated
         */
        int SM_LINK_TYPE = 28;

        /**
         * The feature id for the '<em><b>Actuate</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_TYPE__ACTUATE = 0;

        /**
         * The feature id for the '<em><b>Arcrole</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_TYPE__ARCROLE = 1;

        /**
         * The feature id for the '<em><b>From</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_TYPE__FROM = 2;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_TYPE__ID = 3;

        /**
         * The feature id for the '<em><b>Show</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_TYPE__SHOW = 4;

        /**
         * The feature id for the '<em><b>Title</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_TYPE__TITLE = 5;

        /**
         * The feature id for the '<em><b>To</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_TYPE__TO = 6;

        /**
         * The number of structural features of the '<em>Sm Link Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LINK_TYPE_FEATURE_COUNT = 7;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.SmLocatorLinkTypeImpl <em>Sm Locator Link Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.SmLocatorLinkTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getSmLocatorLinkType()
         * @generated
         */
        int SM_LOCATOR_LINK_TYPE = 29;

        /**
         * The feature id for the '<em><b>Href</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LOCATOR_LINK_TYPE__HREF = 0;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LOCATOR_LINK_TYPE__ID = 1;

        /**
         * The feature id for the '<em><b>Label</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LOCATOR_LINK_TYPE__LABEL = 2;

        /**
         * The feature id for the '<em><b>Role</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LOCATOR_LINK_TYPE__ROLE = 3;

        /**
         * The feature id for the '<em><b>Title</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LOCATOR_LINK_TYPE__TITLE = 4;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LOCATOR_LINK_TYPE__TYPE = 5;

        /**
         * The number of structural features of the '<em>Sm Locator Link Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SM_LOCATOR_LINK_TYPE_FEATURE_COUNT = 6;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.StreamTypeImpl <em>Stream Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.StreamTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getStreamType()
         * @generated
         */
        int STREAM_TYPE = 30;

        /**
         * The feature id for the '<em><b>ADMID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STREAM_TYPE__ADMID = 0;

        /**
         * The feature id for the '<em><b>BEGIN</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STREAM_TYPE__BEGIN = 1;

        /**
         * The feature id for the '<em><b>BETYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STREAM_TYPE__BETYPE = 2;

        /**
         * The feature id for the '<em><b>DMDID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STREAM_TYPE__DMDID = 3;

        /**
         * The feature id for the '<em><b>END</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STREAM_TYPE__END = 4;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STREAM_TYPE__ID = 5;

        /**
         * The feature id for the '<em><b>OWNERID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STREAM_TYPE__OWNERID = 6;

        /**
         * The feature id for the '<em><b>Stream Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STREAM_TYPE__STREAM_TYPE = 7;

        /**
         * The number of structural features of the '<em>Stream Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STREAM_TYPE_FEATURE_COUNT = 8;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.StructLinkTypeImpl <em>Struct Link Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.StructLinkTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getStructLinkType()
         * @generated
         */
        int STRUCT_LINK_TYPE = 31;

        /**
         * The feature id for the '<em><b>Group</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_LINK_TYPE__GROUP = 0;

        /**
         * The feature id for the '<em><b>Sm Link</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_LINK_TYPE__SM_LINK = 1;

        /**
         * The feature id for the '<em><b>Sm Link Grp</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_LINK_TYPE__SM_LINK_GRP = 2;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_LINK_TYPE__ID = 3;

        /**
         * The number of structural features of the '<em>Struct Link Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_LINK_TYPE_FEATURE_COUNT = 4;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.StructLinkType1Impl <em>Struct Link Type1</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.StructLinkType1Impl
         * @see gov.loc.mets.impl.MetsPackageImpl#getStructLinkType1()
         * @generated
         */
        int STRUCT_LINK_TYPE1 = 32;

        /**
         * The feature id for the '<em><b>Group</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_LINK_TYPE1__GROUP = STRUCT_LINK_TYPE__GROUP;

        /**
         * The feature id for the '<em><b>Sm Link</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_LINK_TYPE1__SM_LINK = STRUCT_LINK_TYPE__SM_LINK;

        /**
         * The feature id for the '<em><b>Sm Link Grp</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_LINK_TYPE1__SM_LINK_GRP = STRUCT_LINK_TYPE__SM_LINK_GRP;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_LINK_TYPE1__ID = STRUCT_LINK_TYPE__ID;

        /**
         * The number of structural features of the '<em>Struct Link Type1</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_LINK_TYPE1_FEATURE_COUNT = STRUCT_LINK_TYPE_FEATURE_COUNT + 0;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.StructMapTypeImpl <em>Struct Map Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.StructMapTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getStructMapType()
         * @generated
         */
        int STRUCT_MAP_TYPE = 33;

        /**
         * The feature id for the '<em><b>Div</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_MAP_TYPE__DIV = 0;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_MAP_TYPE__ID = 1;

        /**
         * The feature id for the '<em><b>LABEL</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_MAP_TYPE__LABEL = 2;

        /**
         * The feature id for the '<em><b>TYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_MAP_TYPE__TYPE = 3;

        /**
         * The number of structural features of the '<em>Struct Map Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRUCT_MAP_TYPE_FEATURE_COUNT = 4;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.TransformFileTypeImpl <em>Transform File Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.TransformFileTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getTransformFileType()
         * @generated
         */
        int TRANSFORM_FILE_TYPE = 34;

        /**
         * The feature id for the '<em><b>ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TRANSFORM_FILE_TYPE__ID = 0;

        /**
         * The feature id for the '<em><b>TRANSFORMALGORITHM</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TRANSFORM_FILE_TYPE__TRANSFORMALGORITHM = 1;

        /**
         * The feature id for the '<em><b>TRANSFORMBEHAVIOR</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TRANSFORM_FILE_TYPE__TRANSFORMBEHAVIOR = 2;

        /**
         * The feature id for the '<em><b>TRANSFORMKEY</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TRANSFORM_FILE_TYPE__TRANSFORMKEY = 3;

        /**
         * The feature id for the '<em><b>TRANSFORMORDER</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TRANSFORM_FILE_TYPE__TRANSFORMORDER = 4;

        /**
         * The feature id for the '<em><b>TRANSFORMTYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TRANSFORM_FILE_TYPE__TRANSFORMTYPE = 5;

        /**
         * The number of structural features of the '<em>Transform File Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TRANSFORM_FILE_TYPE_FEATURE_COUNT = 6;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.XmlDataTypeImpl <em>Xml Data Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.XmlDataTypeImpl
         * @see gov.loc.mets.impl.MetsPackageImpl#getXmlDataType()
         * @generated
         */
        int XML_DATA_TYPE = 35;

        /**
         * The feature id for the '<em><b>Any</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int XML_DATA_TYPE__ANY = 0;

        /**
         * The number of structural features of the '<em>Xml Data Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int XML_DATA_TYPE_FEATURE_COUNT = 1;

        /**
         * The meta object id for the '{@link gov.loc.mets.impl.XmlDataType1Impl <em>Xml Data Type1</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.impl.XmlDataType1Impl
         * @see gov.loc.mets.impl.MetsPackageImpl#getXmlDataType1()
         * @generated
         */
        int XML_DATA_TYPE1 = 36;

        /**
         * The feature id for the '<em><b>Any</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int XML_DATA_TYPE1__ANY = 0;

        /**
         * The number of structural features of the '<em>Xml Data Type1</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int XML_DATA_TYPE1_FEATURE_COUNT = 1;

        /**
         * The meta object id for the '{@link gov.loc.mets.ARCLINKORDERType <em>ARCLINKORDER Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.ARCLINKORDERType
         * @see gov.loc.mets.impl.MetsPackageImpl#getARCLINKORDERType()
         * @generated
         */
        int ARCLINKORDER_TYPE = 37;

        /**
         * The meta object id for the '{@link gov.loc.mets.BETYPEType <em>BETYPE Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.BETYPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getBETYPEType()
         * @generated
         */
        int BETYPE_TYPE = 38;

        /**
         * The meta object id for the '{@link gov.loc.mets.BETYPEType1 <em>BETYPE Type1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.BETYPEType1
         * @see gov.loc.mets.impl.MetsPackageImpl#getBETYPEType1()
         * @generated
         */
        int BETYPE_TYPE1 = 39;

        /**
         * The meta object id for the '{@link gov.loc.mets.BETYPEType2 <em>BETYPE Type2</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.BETYPEType2
         * @see gov.loc.mets.impl.MetsPackageImpl#getBETYPEType2()
         * @generated
         */
        int BETYPE_TYPE2 = 40;

        /**
         * The meta object id for the '{@link gov.loc.mets.CHECKSUMTYPEType <em>CHECKSUMTYPE Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.CHECKSUMTYPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getCHECKSUMTYPEType()
         * @generated
         */
        int CHECKSUMTYPE_TYPE = 41;

        /**
         * The meta object id for the '{@link gov.loc.mets.EXTTYPEType <em>EXTTYPE Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.EXTTYPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getEXTTYPEType()
         * @generated
         */
        int EXTTYPE_TYPE = 42;

        /**
         * The meta object id for the '{@link gov.loc.mets.LOCTYPEType <em>LOCTYPE Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.LOCTYPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getLOCTYPEType()
         * @generated
         */
        int LOCTYPE_TYPE = 43;

        /**
         * The meta object id for the '{@link gov.loc.mets.MDTYPEType <em>MDTYPE Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.MDTYPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getMDTYPEType()
         * @generated
         */
        int MDTYPE_TYPE = 44;

        /**
         * The meta object id for the '{@link gov.loc.mets.ROLEType <em>ROLE Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.ROLEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getROLEType()
         * @generated
         */
        int ROLE_TYPE = 45;

        /**
         * The meta object id for the '{@link gov.loc.mets.SHAPEType <em>SHAPE Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.SHAPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getSHAPEType()
         * @generated
         */
        int SHAPE_TYPE = 46;

        /**
         * The meta object id for the '{@link gov.loc.mets.TRANSFORMTYPEType <em>TRANSFORMTYPE Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.TRANSFORMTYPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getTRANSFORMTYPEType()
         * @generated
         */
        int TRANSFORMTYPE_TYPE = 47;

        /**
         * The meta object id for the '{@link gov.loc.mets.TYPEType <em>TYPE Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.TYPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getTYPEType()
         * @generated
         */
        int TYPE_TYPE = 48;

        /**
         * The meta object id for the '<em>ARCLINKORDER Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.ARCLINKORDERType
         * @see gov.loc.mets.impl.MetsPackageImpl#getARCLINKORDERTypeObject()
         * @generated
         */
        int ARCLINKORDER_TYPE_OBJECT = 49;

        /**
         * The meta object id for the '<em>BETYPE Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.BETYPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getBETYPETypeObject()
         * @generated
         */
        int BETYPE_TYPE_OBJECT = 50;

        /**
         * The meta object id for the '<em>BETYPE Type Object1</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.BETYPEType1
         * @see gov.loc.mets.impl.MetsPackageImpl#getBETYPETypeObject1()
         * @generated
         */
        int BETYPE_TYPE_OBJECT1 = 51;

        /**
         * The meta object id for the '<em>BETYPE Type Object2</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.BETYPEType2
         * @see gov.loc.mets.impl.MetsPackageImpl#getBETYPETypeObject2()
         * @generated
         */
        int BETYPE_TYPE_OBJECT2 = 52;

        /**
         * The meta object id for the '<em>CHECKSUMTYPE Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.CHECKSUMTYPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getCHECKSUMTYPETypeObject()
         * @generated
         */
        int CHECKSUMTYPE_TYPE_OBJECT = 53;

        /**
         * The meta object id for the '<em>EXTTYPE Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.EXTTYPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getEXTTYPETypeObject()
         * @generated
         */
        int EXTTYPE_TYPE_OBJECT = 54;

        /**
         * The meta object id for the '<em>LOCTYPE Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.LOCTYPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getLOCTYPETypeObject()
         * @generated
         */
        int LOCTYPE_TYPE_OBJECT = 55;

        /**
         * The meta object id for the '<em>MDTYPE Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.MDTYPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getMDTYPETypeObject()
         * @generated
         */
        int MDTYPE_TYPE_OBJECT = 56;

        /**
         * The meta object id for the '<em>ROLE Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.ROLEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getROLETypeObject()
         * @generated
         */
        int ROLE_TYPE_OBJECT = 57;

        /**
         * The meta object id for the '<em>SHAPE Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.SHAPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getSHAPETypeObject()
         * @generated
         */
        int SHAPE_TYPE_OBJECT = 58;

        /**
         * The meta object id for the '<em>TRANSFORMTYPE Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.TRANSFORMTYPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getTRANSFORMTYPETypeObject()
         * @generated
         */
        int TRANSFORMTYPE_TYPE_OBJECT = 59;

        /**
         * The meta object id for the '<em>TYPE Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see gov.loc.mets.TYPEType
         * @see gov.loc.mets.impl.MetsPackageImpl#getTYPETypeObject()
         * @generated
         */
        int TYPE_TYPE_OBJECT = 60;

        /**
         * The meta object id for the '<em>UR Is</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see gov.loc.mets.impl.MetsPackageImpl#getURIs()
         * @generated
         */
        int UR_IS = 61;


        /**
         * Returns the meta object for class '{@link gov.loc.mets.AgentType <em>Agent Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Agent Type</em>'.
         * @see gov.loc.mets.AgentType
         * @generated
         */
        EClass getAgentType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AgentType#getName <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Name</em>'.
         * @see gov.loc.mets.AgentType#getName()
         * @see #getAgentType()
         * @generated
         */
        EAttribute getAgentType_Name();

        /**
         * Returns the meta object for the attribute list '{@link gov.loc.mets.AgentType#getNote <em>Note</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Note</em>'.
         * @see gov.loc.mets.AgentType#getNote()
         * @see #getAgentType()
         * @generated
         */
        EAttribute getAgentType_Note();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AgentType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.AgentType#getID()
         * @see #getAgentType()
         * @generated
         */
        EAttribute getAgentType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AgentType#getOTHERROLE <em>OTHERROLE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>OTHERROLE</em>'.
         * @see gov.loc.mets.AgentType#getOTHERROLE()
         * @see #getAgentType()
         * @generated
         */
        EAttribute getAgentType_OTHERROLE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AgentType#getOTHERTYPE <em>OTHERTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>OTHERTYPE</em>'.
         * @see gov.loc.mets.AgentType#getOTHERTYPE()
         * @see #getAgentType()
         * @generated
         */
        EAttribute getAgentType_OTHERTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AgentType#getROLE <em>ROLE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ROLE</em>'.
         * @see gov.loc.mets.AgentType#getROLE()
         * @see #getAgentType()
         * @generated
         */
        EAttribute getAgentType_ROLE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AgentType#getTYPE <em>TYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>TYPE</em>'.
         * @see gov.loc.mets.AgentType#getTYPE()
         * @see #getAgentType()
         * @generated
         */
        EAttribute getAgentType_TYPE();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.AltRecordIDType <em>Alt Record ID Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Alt Record ID Type</em>'.
         * @see gov.loc.mets.AltRecordIDType
         * @generated
         */
        EClass getAltRecordIDType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AltRecordIDType#getValue <em>Value</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Value</em>'.
         * @see gov.loc.mets.AltRecordIDType#getValue()
         * @see #getAltRecordIDType()
         * @generated
         */
        EAttribute getAltRecordIDType_Value();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AltRecordIDType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.AltRecordIDType#getID()
         * @see #getAltRecordIDType()
         * @generated
         */
        EAttribute getAltRecordIDType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AltRecordIDType#getTYPE <em>TYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>TYPE</em>'.
         * @see gov.loc.mets.AltRecordIDType#getTYPE()
         * @see #getAltRecordIDType()
         * @generated
         */
        EAttribute getAltRecordIDType_TYPE();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.AmdSecType <em>Amd Sec Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Amd Sec Type</em>'.
         * @see gov.loc.mets.AmdSecType
         * @generated
         */
        EClass getAmdSecType();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.AmdSecType#getTechMD <em>Tech MD</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Tech MD</em>'.
         * @see gov.loc.mets.AmdSecType#getTechMD()
         * @see #getAmdSecType()
         * @generated
         */
        EReference getAmdSecType_TechMD();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.AmdSecType#getRightsMD <em>Rights MD</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Rights MD</em>'.
         * @see gov.loc.mets.AmdSecType#getRightsMD()
         * @see #getAmdSecType()
         * @generated
         */
        EReference getAmdSecType_RightsMD();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.AmdSecType#getSourceMD <em>Source MD</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Source MD</em>'.
         * @see gov.loc.mets.AmdSecType#getSourceMD()
         * @see #getAmdSecType()
         * @generated
         */
        EReference getAmdSecType_SourceMD();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.AmdSecType#getDigiprovMD <em>Digiprov MD</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Digiprov MD</em>'.
         * @see gov.loc.mets.AmdSecType#getDigiprovMD()
         * @see #getAmdSecType()
         * @generated
         */
        EReference getAmdSecType_DigiprovMD();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AmdSecType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.AmdSecType#getID()
         * @see #getAmdSecType()
         * @generated
         */
        EAttribute getAmdSecType_ID();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.AreaType <em>Area Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Area Type</em>'.
         * @see gov.loc.mets.AreaType
         * @generated
         */
        EClass getAreaType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AreaType#getADMID <em>ADMID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ADMID</em>'.
         * @see gov.loc.mets.AreaType#getADMID()
         * @see #getAreaType()
         * @generated
         */
        EAttribute getAreaType_ADMID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AreaType#getBEGIN <em>BEGIN</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>BEGIN</em>'.
         * @see gov.loc.mets.AreaType#getBEGIN()
         * @see #getAreaType()
         * @generated
         */
        EAttribute getAreaType_BEGIN();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AreaType#getBETYPE <em>BETYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>BETYPE</em>'.
         * @see gov.loc.mets.AreaType#getBETYPE()
         * @see #getAreaType()
         * @generated
         */
        EAttribute getAreaType_BETYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AreaType#getCONTENTIDS <em>CONTENTIDS</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CONTENTIDS</em>'.
         * @see gov.loc.mets.AreaType#getCONTENTIDS()
         * @see #getAreaType()
         * @generated
         */
        EAttribute getAreaType_CONTENTIDS();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AreaType#getCOORDS <em>COORDS</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>COORDS</em>'.
         * @see gov.loc.mets.AreaType#getCOORDS()
         * @see #getAreaType()
         * @generated
         */
        EAttribute getAreaType_COORDS();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AreaType#getEND <em>END</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>END</em>'.
         * @see gov.loc.mets.AreaType#getEND()
         * @see #getAreaType()
         * @generated
         */
        EAttribute getAreaType_END();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AreaType#getEXTENT <em>EXTENT</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>EXTENT</em>'.
         * @see gov.loc.mets.AreaType#getEXTENT()
         * @see #getAreaType()
         * @generated
         */
        EAttribute getAreaType_EXTENT();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AreaType#getEXTTYPE <em>EXTTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>EXTTYPE</em>'.
         * @see gov.loc.mets.AreaType#getEXTTYPE()
         * @see #getAreaType()
         * @generated
         */
        EAttribute getAreaType_EXTTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AreaType#getFILEID <em>FILEID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>FILEID</em>'.
         * @see gov.loc.mets.AreaType#getFILEID()
         * @see #getAreaType()
         * @generated
         */
        EAttribute getAreaType_FILEID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AreaType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.AreaType#getID()
         * @see #getAreaType()
         * @generated
         */
        EAttribute getAreaType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.AreaType#getSHAPE <em>SHAPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>SHAPE</em>'.
         * @see gov.loc.mets.AreaType#getSHAPE()
         * @see #getAreaType()
         * @generated
         */
        EAttribute getAreaType_SHAPE();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.BehaviorSecType <em>Behavior Sec Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Behavior Sec Type</em>'.
         * @see gov.loc.mets.BehaviorSecType
         * @generated
         */
        EClass getBehaviorSecType();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.BehaviorSecType#getBehaviorSec <em>Behavior Sec</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Behavior Sec</em>'.
         * @see gov.loc.mets.BehaviorSecType#getBehaviorSec()
         * @see #getBehaviorSecType()
         * @generated
         */
        EReference getBehaviorSecType_BehaviorSec();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.BehaviorSecType#getBehavior <em>Behavior</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Behavior</em>'.
         * @see gov.loc.mets.BehaviorSecType#getBehavior()
         * @see #getBehaviorSecType()
         * @generated
         */
        EReference getBehaviorSecType_Behavior();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.BehaviorSecType#getCREATED <em>CREATED</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CREATED</em>'.
         * @see gov.loc.mets.BehaviorSecType#getCREATED()
         * @see #getBehaviorSecType()
         * @generated
         */
        EAttribute getBehaviorSecType_CREATED();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.BehaviorSecType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.BehaviorSecType#getID()
         * @see #getBehaviorSecType()
         * @generated
         */
        EAttribute getBehaviorSecType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.BehaviorSecType#getLABEL <em>LABEL</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>LABEL</em>'.
         * @see gov.loc.mets.BehaviorSecType#getLABEL()
         * @see #getBehaviorSecType()
         * @generated
         */
        EAttribute getBehaviorSecType_LABEL();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.BehaviorType <em>Behavior Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Behavior Type</em>'.
         * @see gov.loc.mets.BehaviorType
         * @generated
         */
        EClass getBehaviorType();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.BehaviorType#getInterfaceDef <em>Interface Def</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Interface Def</em>'.
         * @see gov.loc.mets.BehaviorType#getInterfaceDef()
         * @see #getBehaviorType()
         * @generated
         */
        EReference getBehaviorType_InterfaceDef();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.BehaviorType#getMechanism <em>Mechanism</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Mechanism</em>'.
         * @see gov.loc.mets.BehaviorType#getMechanism()
         * @see #getBehaviorType()
         * @generated
         */
        EReference getBehaviorType_Mechanism();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.BehaviorType#getADMID <em>ADMID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ADMID</em>'.
         * @see gov.loc.mets.BehaviorType#getADMID()
         * @see #getBehaviorType()
         * @generated
         */
        EAttribute getBehaviorType_ADMID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.BehaviorType#getBTYPE <em>BTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>BTYPE</em>'.
         * @see gov.loc.mets.BehaviorType#getBTYPE()
         * @see #getBehaviorType()
         * @generated
         */
        EAttribute getBehaviorType_BTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.BehaviorType#getCREATED <em>CREATED</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CREATED</em>'.
         * @see gov.loc.mets.BehaviorType#getCREATED()
         * @see #getBehaviorType()
         * @generated
         */
        EAttribute getBehaviorType_CREATED();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.BehaviorType#getGROUPID <em>GROUPID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>GROUPID</em>'.
         * @see gov.loc.mets.BehaviorType#getGROUPID()
         * @see #getBehaviorType()
         * @generated
         */
        EAttribute getBehaviorType_GROUPID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.BehaviorType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.BehaviorType#getID()
         * @see #getBehaviorType()
         * @generated
         */
        EAttribute getBehaviorType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.BehaviorType#getLABEL <em>LABEL</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>LABEL</em>'.
         * @see gov.loc.mets.BehaviorType#getLABEL()
         * @see #getBehaviorType()
         * @generated
         */
        EAttribute getBehaviorType_LABEL();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.BehaviorType#getSTRUCTID <em>STRUCTID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>STRUCTID</em>'.
         * @see gov.loc.mets.BehaviorType#getSTRUCTID()
         * @see #getBehaviorType()
         * @generated
         */
        EAttribute getBehaviorType_STRUCTID();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.DivType <em>Div Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Div Type</em>'.
         * @see gov.loc.mets.DivType
         * @generated
         */
        EClass getDivType();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.DivType#getMptr <em>Mptr</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Mptr</em>'.
         * @see gov.loc.mets.DivType#getMptr()
         * @see #getDivType()
         * @generated
         */
        EReference getDivType_Mptr();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.DivType#getFptr <em>Fptr</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Fptr</em>'.
         * @see gov.loc.mets.DivType#getFptr()
         * @see #getDivType()
         * @generated
         */
        EReference getDivType_Fptr();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.DivType#getDiv <em>Div</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Div</em>'.
         * @see gov.loc.mets.DivType#getDiv()
         * @see #getDivType()
         * @generated
         */
        EReference getDivType_Div();

        /**
         * Returns the meta object for the reference list '{@link gov.loc.mets.DivType#getMdSec <em>Md Sec</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Md Sec</em>'.
         * @see gov.loc.mets.DivType#getMdSec()
         * @see #getDivType()
         * @generated
         */
        EReference getDivType_MdSec();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.DivType#getCONTENTIDS <em>CONTENTIDS</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CONTENTIDS</em>'.
         * @see gov.loc.mets.DivType#getCONTENTIDS()
         * @see #getDivType()
         * @generated
         */
        EAttribute getDivType_CONTENTIDS();

        /**
         * Returns the meta object for the reference list '{@link gov.loc.mets.DivType#getDmdSec <em>Dmd Sec</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Dmd Sec</em>'.
         * @see gov.loc.mets.DivType#getDmdSec()
         * @see #getDivType()
         * @generated
         */
        EReference getDivType_DmdSec();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.DivType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.DivType#getID()
         * @see #getDivType()
         * @generated
         */
        EAttribute getDivType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.DivType#getLabel <em>Label</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Label</em>'.
         * @see gov.loc.mets.DivType#getLabel()
         * @see #getDivType()
         * @generated
         */
        EAttribute getDivType_Label();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.DivType#getLABEL1 <em>LABEL1</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>LABEL1</em>'.
         * @see gov.loc.mets.DivType#getLABEL1()
         * @see #getDivType()
         * @generated
         */
        EAttribute getDivType_LABEL1();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.DivType#getORDER <em>ORDER</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ORDER</em>'.
         * @see gov.loc.mets.DivType#getORDER()
         * @see #getDivType()
         * @generated
         */
        EAttribute getDivType_ORDER();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.DivType#getORDERLABEL <em>ORDERLABEL</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ORDERLABEL</em>'.
         * @see gov.loc.mets.DivType#getORDERLABEL()
         * @see #getDivType()
         * @generated
         */
        EAttribute getDivType_ORDERLABEL();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.DivType#getTYPE <em>TYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>TYPE</em>'.
         * @see gov.loc.mets.DivType#getTYPE()
         * @see #getDivType()
         * @generated
         */
        EAttribute getDivType_TYPE();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.DocumentRoot <em>Document Root</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Document Root</em>'.
         * @see gov.loc.mets.DocumentRoot
         * @generated
         */
        EClass getDocumentRoot();

        /**
         * Returns the meta object for the attribute list '{@link gov.loc.mets.DocumentRoot#getMixed <em>Mixed</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Mixed</em>'.
         * @see gov.loc.mets.DocumentRoot#getMixed()
         * @see #getDocumentRoot()
         * @generated
         */
        EAttribute getDocumentRoot_Mixed();

        /**
         * Returns the meta object for the map '{@link gov.loc.mets.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
         * @see gov.loc.mets.DocumentRoot#getXMLNSPrefixMap()
         * @see #getDocumentRoot()
         * @generated
         */
        EReference getDocumentRoot_XMLNSPrefixMap();

        /**
         * Returns the meta object for the map '{@link gov.loc.mets.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the map '<em>XSI Schema Location</em>'.
         * @see gov.loc.mets.DocumentRoot#getXSISchemaLocation()
         * @see #getDocumentRoot()
         * @generated
         */
        EReference getDocumentRoot_XSISchemaLocation();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.DocumentRoot#getMets <em>Mets</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Mets</em>'.
         * @see gov.loc.mets.DocumentRoot#getMets()
         * @see #getDocumentRoot()
         * @generated
         */
        EReference getDocumentRoot_Mets();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.FContentType <em>FContent Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>FContent Type</em>'.
         * @see gov.loc.mets.FContentType
         * @generated
         */
        EClass getFContentType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FContentType#getBinData <em>Bin Data</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Bin Data</em>'.
         * @see gov.loc.mets.FContentType#getBinData()
         * @see #getFContentType()
         * @generated
         */
        EAttribute getFContentType_BinData();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.FContentType#getXmlData <em>Xml Data</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Xml Data</em>'.
         * @see gov.loc.mets.FContentType#getXmlData()
         * @see #getFContentType()
         * @generated
         */
        EReference getFContentType_XmlData();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FContentType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.FContentType#getID()
         * @see #getFContentType()
         * @generated
         */
        EAttribute getFContentType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FContentType#getUSE <em>USE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>USE</em>'.
         * @see gov.loc.mets.FContentType#getUSE()
         * @see #getFContentType()
         * @generated
         */
        EAttribute getFContentType_USE();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.FileGrpType <em>File Grp Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>File Grp Type</em>'.
         * @see gov.loc.mets.FileGrpType
         * @generated
         */
        EClass getFileGrpType();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.FileGrpType#getFileGrp <em>File Grp</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>File Grp</em>'.
         * @see gov.loc.mets.FileGrpType#getFileGrp()
         * @see #getFileGrpType()
         * @generated
         */
        EReference getFileGrpType_FileGrp();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.FileGrpType#getFile <em>File</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>File</em>'.
         * @see gov.loc.mets.FileGrpType#getFile()
         * @see #getFileGrpType()
         * @generated
         */
        EReference getFileGrpType_File();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileGrpType#getADMID <em>ADMID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ADMID</em>'.
         * @see gov.loc.mets.FileGrpType#getADMID()
         * @see #getFileGrpType()
         * @generated
         */
        EAttribute getFileGrpType_ADMID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileGrpType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.FileGrpType#getID()
         * @see #getFileGrpType()
         * @generated
         */
        EAttribute getFileGrpType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileGrpType#getUSE <em>USE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>USE</em>'.
         * @see gov.loc.mets.FileGrpType#getUSE()
         * @see #getFileGrpType()
         * @generated
         */
        EAttribute getFileGrpType_USE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileGrpType#getVERSDATE <em>VERSDATE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>VERSDATE</em>'.
         * @see gov.loc.mets.FileGrpType#getVERSDATE()
         * @see #getFileGrpType()
         * @generated
         */
        EAttribute getFileGrpType_VERSDATE();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.FileGrpType1 <em>File Grp Type1</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>File Grp Type1</em>'.
         * @see gov.loc.mets.FileGrpType1
         * @generated
         */
        EClass getFileGrpType1();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.FileSecType <em>File Sec Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>File Sec Type</em>'.
         * @see gov.loc.mets.FileSecType
         * @generated
         */
        EClass getFileSecType();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.FileSecType#getFileGrp <em>File Grp</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>File Grp</em>'.
         * @see gov.loc.mets.FileSecType#getFileGrp()
         * @see #getFileSecType()
         * @generated
         */
        EReference getFileSecType_FileGrp();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileSecType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.FileSecType#getID()
         * @see #getFileSecType()
         * @generated
         */
        EAttribute getFileSecType_ID();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.FileType <em>File Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>File Type</em>'.
         * @see gov.loc.mets.FileType
         * @generated
         */
        EClass getFileType();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.FileType#getFLocat <em>FLocat</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>FLocat</em>'.
         * @see gov.loc.mets.FileType#getFLocat()
         * @see #getFileType()
         * @generated
         */
        EReference getFileType_FLocat();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.FileType#getFContent <em>FContent</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>FContent</em>'.
         * @see gov.loc.mets.FileType#getFContent()
         * @see #getFileType()
         * @generated
         */
        EReference getFileType_FContent();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.FileType#getStream <em>Stream</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Stream</em>'.
         * @see gov.loc.mets.FileType#getStream()
         * @see #getFileType()
         * @generated
         */
        EReference getFileType_Stream();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.FileType#getTransformFile <em>Transform File</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Transform File</em>'.
         * @see gov.loc.mets.FileType#getTransformFile()
         * @see #getFileType()
         * @generated
         */
        EReference getFileType_TransformFile();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.FileType#getFile <em>File</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>File</em>'.
         * @see gov.loc.mets.FileType#getFile()
         * @see #getFileType()
         * @generated
         */
        EReference getFileType_File();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getADMID <em>ADMID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ADMID</em>'.
         * @see gov.loc.mets.FileType#getADMID()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_ADMID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getBEGIN <em>BEGIN</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>BEGIN</em>'.
         * @see gov.loc.mets.FileType#getBEGIN()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_BEGIN();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getBETYPE <em>BETYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>BETYPE</em>'.
         * @see gov.loc.mets.FileType#getBETYPE()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_BETYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getCHECKSUM <em>CHECKSUM</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CHECKSUM</em>'.
         * @see gov.loc.mets.FileType#getCHECKSUM()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_CHECKSUM();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CHECKSUMTYPE</em>'.
         * @see gov.loc.mets.FileType#getCHECKSUMTYPE()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_CHECKSUMTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getCREATED <em>CREATED</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CREATED</em>'.
         * @see gov.loc.mets.FileType#getCREATED()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_CREATED();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getDMDID <em>DMDID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>DMDID</em>'.
         * @see gov.loc.mets.FileType#getDMDID()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_DMDID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getEND <em>END</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>END</em>'.
         * @see gov.loc.mets.FileType#getEND()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_END();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getGROUPID <em>GROUPID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>GROUPID</em>'.
         * @see gov.loc.mets.FileType#getGROUPID()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_GROUPID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.FileType#getID()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getMIMETYPE <em>MIMETYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>MIMETYPE</em>'.
         * @see gov.loc.mets.FileType#getMIMETYPE()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_MIMETYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getOWNERID <em>OWNERID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>OWNERID</em>'.
         * @see gov.loc.mets.FileType#getOWNERID()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_OWNERID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getSEQ <em>SEQ</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>SEQ</em>'.
         * @see gov.loc.mets.FileType#getSEQ()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_SEQ();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getSIZE <em>SIZE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>SIZE</em>'.
         * @see gov.loc.mets.FileType#getSIZE()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_SIZE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FileType#getUSE <em>USE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>USE</em>'.
         * @see gov.loc.mets.FileType#getUSE()
         * @see #getFileType()
         * @generated
         */
        EAttribute getFileType_USE();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.FLocatType <em>FLocat Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>FLocat Type</em>'.
         * @see gov.loc.mets.FLocatType
         * @generated
         */
        EClass getFLocatType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FLocatType#getActuate <em>Actuate</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Actuate</em>'.
         * @see gov.loc.mets.FLocatType#getActuate()
         * @see #getFLocatType()
         * @generated
         */
        EAttribute getFLocatType_Actuate();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FLocatType#getArcrole <em>Arcrole</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Arcrole</em>'.
         * @see gov.loc.mets.FLocatType#getArcrole()
         * @see #getFLocatType()
         * @generated
         */
        EAttribute getFLocatType_Arcrole();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FLocatType#getHref <em>Href</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Href</em>'.
         * @see gov.loc.mets.FLocatType#getHref()
         * @see #getFLocatType()
         * @generated
         */
        EAttribute getFLocatType_Href();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FLocatType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.FLocatType#getID()
         * @see #getFLocatType()
         * @generated
         */
        EAttribute getFLocatType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FLocatType#getLOCTYPE <em>LOCTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>LOCTYPE</em>'.
         * @see gov.loc.mets.FLocatType#getLOCTYPE()
         * @see #getFLocatType()
         * @generated
         */
        EAttribute getFLocatType_LOCTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FLocatType#getOTHERLOCTYPE <em>OTHERLOCTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>OTHERLOCTYPE</em>'.
         * @see gov.loc.mets.FLocatType#getOTHERLOCTYPE()
         * @see #getFLocatType()
         * @generated
         */
        EAttribute getFLocatType_OTHERLOCTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FLocatType#getRole <em>Role</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Role</em>'.
         * @see gov.loc.mets.FLocatType#getRole()
         * @see #getFLocatType()
         * @generated
         */
        EAttribute getFLocatType_Role();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FLocatType#getShow <em>Show</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Show</em>'.
         * @see gov.loc.mets.FLocatType#getShow()
         * @see #getFLocatType()
         * @generated
         */
        EAttribute getFLocatType_Show();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FLocatType#getTitle <em>Title</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Title</em>'.
         * @see gov.loc.mets.FLocatType#getTitle()
         * @see #getFLocatType()
         * @generated
         */
        EAttribute getFLocatType_Title();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FLocatType#getType <em>Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Type</em>'.
         * @see gov.loc.mets.FLocatType#getType()
         * @see #getFLocatType()
         * @generated
         */
        EAttribute getFLocatType_Type();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FLocatType#getUSE <em>USE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>USE</em>'.
         * @see gov.loc.mets.FLocatType#getUSE()
         * @see #getFLocatType()
         * @generated
         */
        EAttribute getFLocatType_USE();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.FptrType <em>Fptr Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Fptr Type</em>'.
         * @see gov.loc.mets.FptrType
         * @generated
         */
        EClass getFptrType();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.FptrType#getPar <em>Par</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Par</em>'.
         * @see gov.loc.mets.FptrType#getPar()
         * @see #getFptrType()
         * @generated
         */
        EReference getFptrType_Par();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.FptrType#getSeq <em>Seq</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Seq</em>'.
         * @see gov.loc.mets.FptrType#getSeq()
         * @see #getFptrType()
         * @generated
         */
        EReference getFptrType_Seq();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.FptrType#getArea <em>Area</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Area</em>'.
         * @see gov.loc.mets.FptrType#getArea()
         * @see #getFptrType()
         * @generated
         */
        EReference getFptrType_Area();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FptrType#getCONTENTIDS <em>CONTENTIDS</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CONTENTIDS</em>'.
         * @see gov.loc.mets.FptrType#getCONTENTIDS()
         * @see #getFptrType()
         * @generated
         */
        EAttribute getFptrType_CONTENTIDS();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FptrType#getFILEID <em>FILEID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>FILEID</em>'.
         * @see gov.loc.mets.FptrType#getFILEID()
         * @see #getFptrType()
         * @generated
         */
        EAttribute getFptrType_FILEID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.FptrType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.FptrType#getID()
         * @see #getFptrType()
         * @generated
         */
        EAttribute getFptrType_ID();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.MdRefType <em>Md Ref Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Md Ref Type</em>'.
         * @see gov.loc.mets.MdRefType
         * @generated
         */
        EClass getMdRefType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getActuate <em>Actuate</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Actuate</em>'.
         * @see gov.loc.mets.MdRefType#getActuate()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_Actuate();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getArcrole <em>Arcrole</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Arcrole</em>'.
         * @see gov.loc.mets.MdRefType#getArcrole()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_Arcrole();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getCHECKSUM <em>CHECKSUM</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CHECKSUM</em>'.
         * @see gov.loc.mets.MdRefType#getCHECKSUM()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_CHECKSUM();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CHECKSUMTYPE</em>'.
         * @see gov.loc.mets.MdRefType#getCHECKSUMTYPE()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_CHECKSUMTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getCREATED <em>CREATED</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CREATED</em>'.
         * @see gov.loc.mets.MdRefType#getCREATED()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_CREATED();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getHref <em>Href</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Href</em>'.
         * @see gov.loc.mets.MdRefType#getHref()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_Href();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.MdRefType#getID()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getLABEL <em>LABEL</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>LABEL</em>'.
         * @see gov.loc.mets.MdRefType#getLABEL()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_LABEL();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getLOCTYPE <em>LOCTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>LOCTYPE</em>'.
         * @see gov.loc.mets.MdRefType#getLOCTYPE()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_LOCTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getMDTYPE <em>MDTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>MDTYPE</em>'.
         * @see gov.loc.mets.MdRefType#getMDTYPE()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_MDTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getMDTYPEVERSION <em>MDTYPEVERSION</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>MDTYPEVERSION</em>'.
         * @see gov.loc.mets.MdRefType#getMDTYPEVERSION()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_MDTYPEVERSION();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getMIMETYPE <em>MIMETYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>MIMETYPE</em>'.
         * @see gov.loc.mets.MdRefType#getMIMETYPE()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_MIMETYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getOTHERLOCTYPE <em>OTHERLOCTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>OTHERLOCTYPE</em>'.
         * @see gov.loc.mets.MdRefType#getOTHERLOCTYPE()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_OTHERLOCTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getOTHERMDTYPE <em>OTHERMDTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>OTHERMDTYPE</em>'.
         * @see gov.loc.mets.MdRefType#getOTHERMDTYPE()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_OTHERMDTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getRole <em>Role</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Role</em>'.
         * @see gov.loc.mets.MdRefType#getRole()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_Role();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getShow <em>Show</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Show</em>'.
         * @see gov.loc.mets.MdRefType#getShow()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_Show();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getSIZE <em>SIZE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>SIZE</em>'.
         * @see gov.loc.mets.MdRefType#getSIZE()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_SIZE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getTitle <em>Title</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Title</em>'.
         * @see gov.loc.mets.MdRefType#getTitle()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_Title();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getType <em>Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Type</em>'.
         * @see gov.loc.mets.MdRefType#getType()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_Type();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdRefType#getXPTR <em>XPTR</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>XPTR</em>'.
         * @see gov.loc.mets.MdRefType#getXPTR()
         * @see #getMdRefType()
         * @generated
         */
        EAttribute getMdRefType_XPTR();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.MdSecType <em>Md Sec Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Md Sec Type</em>'.
         * @see gov.loc.mets.MdSecType
         * @generated
         */
        EClass getMdSecType();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.MdSecType#getMdRef <em>Md Ref</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Md Ref</em>'.
         * @see gov.loc.mets.MdSecType#getMdRef()
         * @see #getMdSecType()
         * @generated
         */
        EReference getMdSecType_MdRef();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.MdSecType#getMdWrap <em>Md Wrap</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Md Wrap</em>'.
         * @see gov.loc.mets.MdSecType#getMdWrap()
         * @see #getMdSecType()
         * @generated
         */
        EReference getMdSecType_MdWrap();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdSecType#getADMID <em>ADMID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ADMID</em>'.
         * @see gov.loc.mets.MdSecType#getADMID()
         * @see #getMdSecType()
         * @generated
         */
        EAttribute getMdSecType_ADMID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdSecType#getCREATED <em>CREATED</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CREATED</em>'.
         * @see gov.loc.mets.MdSecType#getCREATED()
         * @see #getMdSecType()
         * @generated
         */
        EAttribute getMdSecType_CREATED();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdSecType#getGROUPID <em>GROUPID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>GROUPID</em>'.
         * @see gov.loc.mets.MdSecType#getGROUPID()
         * @see #getMdSecType()
         * @generated
         */
        EAttribute getMdSecType_GROUPID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdSecType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.MdSecType#getID()
         * @see #getMdSecType()
         * @generated
         */
        EAttribute getMdSecType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdSecType#getSTATUS <em>STATUS</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>STATUS</em>'.
         * @see gov.loc.mets.MdSecType#getSTATUS()
         * @see #getMdSecType()
         * @generated
         */
        EAttribute getMdSecType_STATUS();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.MdWrapType <em>Md Wrap Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Md Wrap Type</em>'.
         * @see gov.loc.mets.MdWrapType
         * @generated
         */
        EClass getMdWrapType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdWrapType#getBinData <em>Bin Data</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Bin Data</em>'.
         * @see gov.loc.mets.MdWrapType#getBinData()
         * @see #getMdWrapType()
         * @generated
         */
        EAttribute getMdWrapType_BinData();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.MdWrapType#getXmlData <em>Xml Data</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Xml Data</em>'.
         * @see gov.loc.mets.MdWrapType#getXmlData()
         * @see #getMdWrapType()
         * @generated
         */
        EReference getMdWrapType_XmlData();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdWrapType#getCHECKSUM <em>CHECKSUM</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CHECKSUM</em>'.
         * @see gov.loc.mets.MdWrapType#getCHECKSUM()
         * @see #getMdWrapType()
         * @generated
         */
        EAttribute getMdWrapType_CHECKSUM();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdWrapType#getCHECKSUMTYPE <em>CHECKSUMTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CHECKSUMTYPE</em>'.
         * @see gov.loc.mets.MdWrapType#getCHECKSUMTYPE()
         * @see #getMdWrapType()
         * @generated
         */
        EAttribute getMdWrapType_CHECKSUMTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdWrapType#getCREATED <em>CREATED</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CREATED</em>'.
         * @see gov.loc.mets.MdWrapType#getCREATED()
         * @see #getMdWrapType()
         * @generated
         */
        EAttribute getMdWrapType_CREATED();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdWrapType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.MdWrapType#getID()
         * @see #getMdWrapType()
         * @generated
         */
        EAttribute getMdWrapType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdWrapType#getLABEL <em>LABEL</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>LABEL</em>'.
         * @see gov.loc.mets.MdWrapType#getLABEL()
         * @see #getMdWrapType()
         * @generated
         */
        EAttribute getMdWrapType_LABEL();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdWrapType#getMDTYPE <em>MDTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>MDTYPE</em>'.
         * @see gov.loc.mets.MdWrapType#getMDTYPE()
         * @see #getMdWrapType()
         * @generated
         */
        EAttribute getMdWrapType_MDTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdWrapType#getMDTYPEVERSION <em>MDTYPEVERSION</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>MDTYPEVERSION</em>'.
         * @see gov.loc.mets.MdWrapType#getMDTYPEVERSION()
         * @see #getMdWrapType()
         * @generated
         */
        EAttribute getMdWrapType_MDTYPEVERSION();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdWrapType#getMIMETYPE <em>MIMETYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>MIMETYPE</em>'.
         * @see gov.loc.mets.MdWrapType#getMIMETYPE()
         * @see #getMdWrapType()
         * @generated
         */
        EAttribute getMdWrapType_MIMETYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdWrapType#getOTHERMDTYPE <em>OTHERMDTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>OTHERMDTYPE</em>'.
         * @see gov.loc.mets.MdWrapType#getOTHERMDTYPE()
         * @see #getMdWrapType()
         * @generated
         */
        EAttribute getMdWrapType_OTHERMDTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MdWrapType#getSIZE <em>SIZE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>SIZE</em>'.
         * @see gov.loc.mets.MdWrapType#getSIZE()
         * @see #getMdWrapType()
         * @generated
         */
        EAttribute getMdWrapType_SIZE();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.MetsDocumentIDType <em>Document ID Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Document ID Type</em>'.
         * @see gov.loc.mets.MetsDocumentIDType
         * @generated
         */
        EClass getMetsDocumentIDType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MetsDocumentIDType#getValue <em>Value</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Value</em>'.
         * @see gov.loc.mets.MetsDocumentIDType#getValue()
         * @see #getMetsDocumentIDType()
         * @generated
         */
        EAttribute getMetsDocumentIDType_Value();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MetsDocumentIDType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.MetsDocumentIDType#getID()
         * @see #getMetsDocumentIDType()
         * @generated
         */
        EAttribute getMetsDocumentIDType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MetsDocumentIDType#getTYPE <em>TYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>TYPE</em>'.
         * @see gov.loc.mets.MetsDocumentIDType#getTYPE()
         * @see #getMetsDocumentIDType()
         * @generated
         */
        EAttribute getMetsDocumentIDType_TYPE();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.MetsHdrType <em>Hdr Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Hdr Type</em>'.
         * @see gov.loc.mets.MetsHdrType
         * @generated
         */
        EClass getMetsHdrType();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.MetsHdrType#getAgent <em>Agent</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Agent</em>'.
         * @see gov.loc.mets.MetsHdrType#getAgent()
         * @see #getMetsHdrType()
         * @generated
         */
        EReference getMetsHdrType_Agent();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.MetsHdrType#getAltRecordID <em>Alt Record ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Alt Record ID</em>'.
         * @see gov.loc.mets.MetsHdrType#getAltRecordID()
         * @see #getMetsHdrType()
         * @generated
         */
        EReference getMetsHdrType_AltRecordID();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.MetsHdrType#getMetsDocumentID <em>Mets Document ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Mets Document ID</em>'.
         * @see gov.loc.mets.MetsHdrType#getMetsDocumentID()
         * @see #getMetsHdrType()
         * @generated
         */
        EReference getMetsHdrType_MetsDocumentID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MetsHdrType#getADMID <em>ADMID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ADMID</em>'.
         * @see gov.loc.mets.MetsHdrType#getADMID()
         * @see #getMetsHdrType()
         * @generated
         */
        EAttribute getMetsHdrType_ADMID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MetsHdrType#getCREATEDATE <em>CREATEDATE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CREATEDATE</em>'.
         * @see gov.loc.mets.MetsHdrType#getCREATEDATE()
         * @see #getMetsHdrType()
         * @generated
         */
        EAttribute getMetsHdrType_CREATEDATE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MetsHdrType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.MetsHdrType#getID()
         * @see #getMetsHdrType()
         * @generated
         */
        EAttribute getMetsHdrType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MetsHdrType#getLASTMODDATE <em>LASTMODDATE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>LASTMODDATE</em>'.
         * @see gov.loc.mets.MetsHdrType#getLASTMODDATE()
         * @see #getMetsHdrType()
         * @generated
         */
        EAttribute getMetsHdrType_LASTMODDATE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MetsHdrType#getRECORDSTATUS <em>RECORDSTATUS</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>RECORDSTATUS</em>'.
         * @see gov.loc.mets.MetsHdrType#getRECORDSTATUS()
         * @see #getMetsHdrType()
         * @generated
         */
        EAttribute getMetsHdrType_RECORDSTATUS();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.MetsType <em>Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Type</em>'.
         * @see gov.loc.mets.MetsType
         * @generated
         */
        EClass getMetsType();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.MetsType#getMetsHdr <em>Mets Hdr</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Mets Hdr</em>'.
         * @see gov.loc.mets.MetsType#getMetsHdr()
         * @see #getMetsType()
         * @generated
         */
        EReference getMetsType_MetsHdr();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.MetsType#getDmdSec <em>Dmd Sec</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Dmd Sec</em>'.
         * @see gov.loc.mets.MetsType#getDmdSec()
         * @see #getMetsType()
         * @generated
         */
        EReference getMetsType_DmdSec();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.MetsType#getAmdSec <em>Amd Sec</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Amd Sec</em>'.
         * @see gov.loc.mets.MetsType#getAmdSec()
         * @see #getMetsType()
         * @generated
         */
        EReference getMetsType_AmdSec();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.MetsType#getFileSec <em>File Sec</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>File Sec</em>'.
         * @see gov.loc.mets.MetsType#getFileSec()
         * @see #getMetsType()
         * @generated
         */
        EReference getMetsType_FileSec();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.MetsType#getStructMap <em>Struct Map</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Struct Map</em>'.
         * @see gov.loc.mets.MetsType#getStructMap()
         * @see #getMetsType()
         * @generated
         */
        EReference getMetsType_StructMap();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.MetsType#getStructLink <em>Struct Link</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Struct Link</em>'.
         * @see gov.loc.mets.MetsType#getStructLink()
         * @see #getMetsType()
         * @generated
         */
        EReference getMetsType_StructLink();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.MetsType#getBehaviorSec <em>Behavior Sec</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Behavior Sec</em>'.
         * @see gov.loc.mets.MetsType#getBehaviorSec()
         * @see #getMetsType()
         * @generated
         */
        EReference getMetsType_BehaviorSec();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MetsType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.MetsType#getID()
         * @see #getMetsType()
         * @generated
         */
        EAttribute getMetsType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MetsType#getLABEL <em>LABEL</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>LABEL</em>'.
         * @see gov.loc.mets.MetsType#getLABEL()
         * @see #getMetsType()
         * @generated
         */
        EAttribute getMetsType_LABEL();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MetsType#getOBJID <em>OBJID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>OBJID</em>'.
         * @see gov.loc.mets.MetsType#getOBJID()
         * @see #getMetsType()
         * @generated
         */
        EAttribute getMetsType_OBJID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MetsType#getPROFILE <em>PROFILE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>PROFILE</em>'.
         * @see gov.loc.mets.MetsType#getPROFILE()
         * @see #getMetsType()
         * @generated
         */
        EAttribute getMetsType_PROFILE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MetsType#getTYPE <em>TYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>TYPE</em>'.
         * @see gov.loc.mets.MetsType#getTYPE()
         * @see #getMetsType()
         * @generated
         */
        EAttribute getMetsType_TYPE();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.MetsType1 <em>Type1</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Type1</em>'.
         * @see gov.loc.mets.MetsType1
         * @generated
         */
        EClass getMetsType1();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.MptrType <em>Mptr Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Mptr Type</em>'.
         * @see gov.loc.mets.MptrType
         * @generated
         */
        EClass getMptrType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MptrType#getActuate <em>Actuate</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Actuate</em>'.
         * @see gov.loc.mets.MptrType#getActuate()
         * @see #getMptrType()
         * @generated
         */
        EAttribute getMptrType_Actuate();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MptrType#getArcrole <em>Arcrole</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Arcrole</em>'.
         * @see gov.loc.mets.MptrType#getArcrole()
         * @see #getMptrType()
         * @generated
         */
        EAttribute getMptrType_Arcrole();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MptrType#getCONTENTIDS <em>CONTENTIDS</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>CONTENTIDS</em>'.
         * @see gov.loc.mets.MptrType#getCONTENTIDS()
         * @see #getMptrType()
         * @generated
         */
        EAttribute getMptrType_CONTENTIDS();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MptrType#getHref <em>Href</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Href</em>'.
         * @see gov.loc.mets.MptrType#getHref()
         * @see #getMptrType()
         * @generated
         */
        EAttribute getMptrType_Href();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MptrType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.MptrType#getID()
         * @see #getMptrType()
         * @generated
         */
        EAttribute getMptrType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MptrType#getLOCTYPE <em>LOCTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>LOCTYPE</em>'.
         * @see gov.loc.mets.MptrType#getLOCTYPE()
         * @see #getMptrType()
         * @generated
         */
        EAttribute getMptrType_LOCTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MptrType#getOTHERLOCTYPE <em>OTHERLOCTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>OTHERLOCTYPE</em>'.
         * @see gov.loc.mets.MptrType#getOTHERLOCTYPE()
         * @see #getMptrType()
         * @generated
         */
        EAttribute getMptrType_OTHERLOCTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MptrType#getRole <em>Role</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Role</em>'.
         * @see gov.loc.mets.MptrType#getRole()
         * @see #getMptrType()
         * @generated
         */
        EAttribute getMptrType_Role();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MptrType#getShow <em>Show</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Show</em>'.
         * @see gov.loc.mets.MptrType#getShow()
         * @see #getMptrType()
         * @generated
         */
        EAttribute getMptrType_Show();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MptrType#getTitle <em>Title</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Title</em>'.
         * @see gov.loc.mets.MptrType#getTitle()
         * @see #getMptrType()
         * @generated
         */
        EAttribute getMptrType_Title();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.MptrType#getType <em>Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Type</em>'.
         * @see gov.loc.mets.MptrType#getType()
         * @see #getMptrType()
         * @generated
         */
        EAttribute getMptrType_Type();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.ObjectType <em>Object Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Object Type</em>'.
         * @see gov.loc.mets.ObjectType
         * @generated
         */
        EClass getObjectType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.ObjectType#getActuate <em>Actuate</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Actuate</em>'.
         * @see gov.loc.mets.ObjectType#getActuate()
         * @see #getObjectType()
         * @generated
         */
        EAttribute getObjectType_Actuate();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.ObjectType#getArcrole <em>Arcrole</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Arcrole</em>'.
         * @see gov.loc.mets.ObjectType#getArcrole()
         * @see #getObjectType()
         * @generated
         */
        EAttribute getObjectType_Arcrole();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.ObjectType#getHref <em>Href</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Href</em>'.
         * @see gov.loc.mets.ObjectType#getHref()
         * @see #getObjectType()
         * @generated
         */
        EAttribute getObjectType_Href();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.ObjectType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.ObjectType#getID()
         * @see #getObjectType()
         * @generated
         */
        EAttribute getObjectType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.ObjectType#getLABEL <em>LABEL</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>LABEL</em>'.
         * @see gov.loc.mets.ObjectType#getLABEL()
         * @see #getObjectType()
         * @generated
         */
        EAttribute getObjectType_LABEL();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.ObjectType#getLOCTYPE <em>LOCTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>LOCTYPE</em>'.
         * @see gov.loc.mets.ObjectType#getLOCTYPE()
         * @see #getObjectType()
         * @generated
         */
        EAttribute getObjectType_LOCTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.ObjectType#getOTHERLOCTYPE <em>OTHERLOCTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>OTHERLOCTYPE</em>'.
         * @see gov.loc.mets.ObjectType#getOTHERLOCTYPE()
         * @see #getObjectType()
         * @generated
         */
        EAttribute getObjectType_OTHERLOCTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.ObjectType#getRole <em>Role</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Role</em>'.
         * @see gov.loc.mets.ObjectType#getRole()
         * @see #getObjectType()
         * @generated
         */
        EAttribute getObjectType_Role();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.ObjectType#getShow <em>Show</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Show</em>'.
         * @see gov.loc.mets.ObjectType#getShow()
         * @see #getObjectType()
         * @generated
         */
        EAttribute getObjectType_Show();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.ObjectType#getTitle <em>Title</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Title</em>'.
         * @see gov.loc.mets.ObjectType#getTitle()
         * @see #getObjectType()
         * @generated
         */
        EAttribute getObjectType_Title();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.ObjectType#getType <em>Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Type</em>'.
         * @see gov.loc.mets.ObjectType#getType()
         * @see #getObjectType()
         * @generated
         */
        EAttribute getObjectType_Type();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.ParType <em>Par Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Par Type</em>'.
         * @see gov.loc.mets.ParType
         * @generated
         */
        EClass getParType();

        /**
         * Returns the meta object for the attribute list '{@link gov.loc.mets.ParType#getGroup <em>Group</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Group</em>'.
         * @see gov.loc.mets.ParType#getGroup()
         * @see #getParType()
         * @generated
         */
        EAttribute getParType_Group();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.ParType#getArea <em>Area</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Area</em>'.
         * @see gov.loc.mets.ParType#getArea()
         * @see #getParType()
         * @generated
         */
        EReference getParType_Area();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.ParType#getSeq <em>Seq</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Seq</em>'.
         * @see gov.loc.mets.ParType#getSeq()
         * @see #getParType()
         * @generated
         */
        EReference getParType_Seq();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.ParType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.ParType#getID()
         * @see #getParType()
         * @generated
         */
        EAttribute getParType_ID();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.SeqType <em>Seq Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Seq Type</em>'.
         * @see gov.loc.mets.SeqType
         * @generated
         */
        EClass getSeqType();

        /**
         * Returns the meta object for the attribute list '{@link gov.loc.mets.SeqType#getGroup <em>Group</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Group</em>'.
         * @see gov.loc.mets.SeqType#getGroup()
         * @see #getSeqType()
         * @generated
         */
        EAttribute getSeqType_Group();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.SeqType#getArea <em>Area</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Area</em>'.
         * @see gov.loc.mets.SeqType#getArea()
         * @see #getSeqType()
         * @generated
         */
        EReference getSeqType_Area();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.SeqType#getPar <em>Par</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Par</em>'.
         * @see gov.loc.mets.SeqType#getPar()
         * @see #getSeqType()
         * @generated
         */
        EReference getSeqType_Par();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SeqType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.SeqType#getID()
         * @see #getSeqType()
         * @generated
         */
        EAttribute getSeqType_ID();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.SmArcLinkType <em>Sm Arc Link Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Sm Arc Link Type</em>'.
         * @see gov.loc.mets.SmArcLinkType
         * @generated
         */
        EClass getSmArcLinkType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmArcLinkType#getActuate <em>Actuate</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Actuate</em>'.
         * @see gov.loc.mets.SmArcLinkType#getActuate()
         * @see #getSmArcLinkType()
         * @generated
         */
        EAttribute getSmArcLinkType_Actuate();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmArcLinkType#getADMID <em>ADMID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ADMID</em>'.
         * @see gov.loc.mets.SmArcLinkType#getADMID()
         * @see #getSmArcLinkType()
         * @generated
         */
        EAttribute getSmArcLinkType_ADMID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmArcLinkType#getArcrole <em>Arcrole</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Arcrole</em>'.
         * @see gov.loc.mets.SmArcLinkType#getArcrole()
         * @see #getSmArcLinkType()
         * @generated
         */
        EAttribute getSmArcLinkType_Arcrole();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmArcLinkType#getARCTYPE <em>ARCTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ARCTYPE</em>'.
         * @see gov.loc.mets.SmArcLinkType#getARCTYPE()
         * @see #getSmArcLinkType()
         * @generated
         */
        EAttribute getSmArcLinkType_ARCTYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmArcLinkType#getFrom <em>From</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>From</em>'.
         * @see gov.loc.mets.SmArcLinkType#getFrom()
         * @see #getSmArcLinkType()
         * @generated
         */
        EAttribute getSmArcLinkType_From();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmArcLinkType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.SmArcLinkType#getID()
         * @see #getSmArcLinkType()
         * @generated
         */
        EAttribute getSmArcLinkType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmArcLinkType#getShow <em>Show</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Show</em>'.
         * @see gov.loc.mets.SmArcLinkType#getShow()
         * @see #getSmArcLinkType()
         * @generated
         */
        EAttribute getSmArcLinkType_Show();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmArcLinkType#getTitle <em>Title</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Title</em>'.
         * @see gov.loc.mets.SmArcLinkType#getTitle()
         * @see #getSmArcLinkType()
         * @generated
         */
        EAttribute getSmArcLinkType_Title();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmArcLinkType#getTo <em>To</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>To</em>'.
         * @see gov.loc.mets.SmArcLinkType#getTo()
         * @see #getSmArcLinkType()
         * @generated
         */
        EAttribute getSmArcLinkType_To();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmArcLinkType#getType <em>Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Type</em>'.
         * @see gov.loc.mets.SmArcLinkType#getType()
         * @see #getSmArcLinkType()
         * @generated
         */
        EAttribute getSmArcLinkType_Type();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.SmLinkGrpType <em>Sm Link Grp Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Sm Link Grp Type</em>'.
         * @see gov.loc.mets.SmLinkGrpType
         * @generated
         */
        EClass getSmLinkGrpType();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.SmLinkGrpType#getSmLocatorLink <em>Sm Locator Link</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Sm Locator Link</em>'.
         * @see gov.loc.mets.SmLinkGrpType#getSmLocatorLink()
         * @see #getSmLinkGrpType()
         * @generated
         */
        EReference getSmLinkGrpType_SmLocatorLink();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.SmLinkGrpType#getSmArcLink <em>Sm Arc Link</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Sm Arc Link</em>'.
         * @see gov.loc.mets.SmLinkGrpType#getSmArcLink()
         * @see #getSmLinkGrpType()
         * @generated
         */
        EReference getSmLinkGrpType_SmArcLink();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLinkGrpType#getARCLINKORDER <em>ARCLINKORDER</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ARCLINKORDER</em>'.
         * @see gov.loc.mets.SmLinkGrpType#getARCLINKORDER()
         * @see #getSmLinkGrpType()
         * @generated
         */
        EAttribute getSmLinkGrpType_ARCLINKORDER();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLinkGrpType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.SmLinkGrpType#getID()
         * @see #getSmLinkGrpType()
         * @generated
         */
        EAttribute getSmLinkGrpType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLinkGrpType#getRole <em>Role</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Role</em>'.
         * @see gov.loc.mets.SmLinkGrpType#getRole()
         * @see #getSmLinkGrpType()
         * @generated
         */
        EAttribute getSmLinkGrpType_Role();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLinkGrpType#getTitle <em>Title</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Title</em>'.
         * @see gov.loc.mets.SmLinkGrpType#getTitle()
         * @see #getSmLinkGrpType()
         * @generated
         */
        EAttribute getSmLinkGrpType_Title();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLinkGrpType#getType <em>Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Type</em>'.
         * @see gov.loc.mets.SmLinkGrpType#getType()
         * @see #getSmLinkGrpType()
         * @generated
         */
        EAttribute getSmLinkGrpType_Type();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.SmLinkType <em>Sm Link Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Sm Link Type</em>'.
         * @see gov.loc.mets.SmLinkType
         * @generated
         */
        EClass getSmLinkType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLinkType#getActuate <em>Actuate</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Actuate</em>'.
         * @see gov.loc.mets.SmLinkType#getActuate()
         * @see #getSmLinkType()
         * @generated
         */
        EAttribute getSmLinkType_Actuate();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLinkType#getArcrole <em>Arcrole</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Arcrole</em>'.
         * @see gov.loc.mets.SmLinkType#getArcrole()
         * @see #getSmLinkType()
         * @generated
         */
        EAttribute getSmLinkType_Arcrole();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLinkType#getFrom <em>From</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>From</em>'.
         * @see gov.loc.mets.SmLinkType#getFrom()
         * @see #getSmLinkType()
         * @generated
         */
        EAttribute getSmLinkType_From();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLinkType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.SmLinkType#getID()
         * @see #getSmLinkType()
         * @generated
         */
        EAttribute getSmLinkType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLinkType#getShow <em>Show</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Show</em>'.
         * @see gov.loc.mets.SmLinkType#getShow()
         * @see #getSmLinkType()
         * @generated
         */
        EAttribute getSmLinkType_Show();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLinkType#getTitle <em>Title</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Title</em>'.
         * @see gov.loc.mets.SmLinkType#getTitle()
         * @see #getSmLinkType()
         * @generated
         */
        EAttribute getSmLinkType_Title();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLinkType#getTo <em>To</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>To</em>'.
         * @see gov.loc.mets.SmLinkType#getTo()
         * @see #getSmLinkType()
         * @generated
         */
        EAttribute getSmLinkType_To();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.SmLocatorLinkType <em>Sm Locator Link Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Sm Locator Link Type</em>'.
         * @see gov.loc.mets.SmLocatorLinkType
         * @generated
         */
        EClass getSmLocatorLinkType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLocatorLinkType#getHref <em>Href</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Href</em>'.
         * @see gov.loc.mets.SmLocatorLinkType#getHref()
         * @see #getSmLocatorLinkType()
         * @generated
         */
        EAttribute getSmLocatorLinkType_Href();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLocatorLinkType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.SmLocatorLinkType#getID()
         * @see #getSmLocatorLinkType()
         * @generated
         */
        EAttribute getSmLocatorLinkType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLocatorLinkType#getLabel <em>Label</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Label</em>'.
         * @see gov.loc.mets.SmLocatorLinkType#getLabel()
         * @see #getSmLocatorLinkType()
         * @generated
         */
        EAttribute getSmLocatorLinkType_Label();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLocatorLinkType#getRole <em>Role</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Role</em>'.
         * @see gov.loc.mets.SmLocatorLinkType#getRole()
         * @see #getSmLocatorLinkType()
         * @generated
         */
        EAttribute getSmLocatorLinkType_Role();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLocatorLinkType#getTitle <em>Title</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Title</em>'.
         * @see gov.loc.mets.SmLocatorLinkType#getTitle()
         * @see #getSmLocatorLinkType()
         * @generated
         */
        EAttribute getSmLocatorLinkType_Title();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.SmLocatorLinkType#getType <em>Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Type</em>'.
         * @see gov.loc.mets.SmLocatorLinkType#getType()
         * @see #getSmLocatorLinkType()
         * @generated
         */
        EAttribute getSmLocatorLinkType_Type();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.StreamType <em>Stream Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Stream Type</em>'.
         * @see gov.loc.mets.StreamType
         * @generated
         */
        EClass getStreamType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.StreamType#getADMID <em>ADMID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ADMID</em>'.
         * @see gov.loc.mets.StreamType#getADMID()
         * @see #getStreamType()
         * @generated
         */
        EAttribute getStreamType_ADMID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.StreamType#getBEGIN <em>BEGIN</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>BEGIN</em>'.
         * @see gov.loc.mets.StreamType#getBEGIN()
         * @see #getStreamType()
         * @generated
         */
        EAttribute getStreamType_BEGIN();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.StreamType#getBETYPE <em>BETYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>BETYPE</em>'.
         * @see gov.loc.mets.StreamType#getBETYPE()
         * @see #getStreamType()
         * @generated
         */
        EAttribute getStreamType_BETYPE();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.StreamType#getDMDID <em>DMDID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>DMDID</em>'.
         * @see gov.loc.mets.StreamType#getDMDID()
         * @see #getStreamType()
         * @generated
         */
        EAttribute getStreamType_DMDID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.StreamType#getEND <em>END</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>END</em>'.
         * @see gov.loc.mets.StreamType#getEND()
         * @see #getStreamType()
         * @generated
         */
        EAttribute getStreamType_END();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.StreamType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.StreamType#getID()
         * @see #getStreamType()
         * @generated
         */
        EAttribute getStreamType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.StreamType#getOWNERID <em>OWNERID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>OWNERID</em>'.
         * @see gov.loc.mets.StreamType#getOWNERID()
         * @see #getStreamType()
         * @generated
         */
        EAttribute getStreamType_OWNERID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.StreamType#getStreamType <em>Stream Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Stream Type</em>'.
         * @see gov.loc.mets.StreamType#getStreamType()
         * @see #getStreamType()
         * @generated
         */
        EAttribute getStreamType_StreamType();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.StructLinkType <em>Struct Link Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Struct Link Type</em>'.
         * @see gov.loc.mets.StructLinkType
         * @generated
         */
        EClass getStructLinkType();

        /**
         * Returns the meta object for the attribute list '{@link gov.loc.mets.StructLinkType#getGroup <em>Group</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Group</em>'.
         * @see gov.loc.mets.StructLinkType#getGroup()
         * @see #getStructLinkType()
         * @generated
         */
        EAttribute getStructLinkType_Group();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.StructLinkType#getSmLink <em>Sm Link</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Sm Link</em>'.
         * @see gov.loc.mets.StructLinkType#getSmLink()
         * @see #getStructLinkType()
         * @generated
         */
        EReference getStructLinkType_SmLink();

        /**
         * Returns the meta object for the containment reference list '{@link gov.loc.mets.StructLinkType#getSmLinkGrp <em>Sm Link Grp</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Sm Link Grp</em>'.
         * @see gov.loc.mets.StructLinkType#getSmLinkGrp()
         * @see #getStructLinkType()
         * @generated
         */
        EReference getStructLinkType_SmLinkGrp();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.StructLinkType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.StructLinkType#getID()
         * @see #getStructLinkType()
         * @generated
         */
        EAttribute getStructLinkType_ID();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.StructLinkType1 <em>Struct Link Type1</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Struct Link Type1</em>'.
         * @see gov.loc.mets.StructLinkType1
         * @generated
         */
        EClass getStructLinkType1();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.StructMapType <em>Struct Map Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Struct Map Type</em>'.
         * @see gov.loc.mets.StructMapType
         * @generated
         */
        EClass getStructMapType();

        /**
         * Returns the meta object for the containment reference '{@link gov.loc.mets.StructMapType#getDiv <em>Div</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Div</em>'.
         * @see gov.loc.mets.StructMapType#getDiv()
         * @see #getStructMapType()
         * @generated
         */
        EReference getStructMapType_Div();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.StructMapType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.StructMapType#getID()
         * @see #getStructMapType()
         * @generated
         */
        EAttribute getStructMapType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.StructMapType#getLABEL <em>LABEL</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>LABEL</em>'.
         * @see gov.loc.mets.StructMapType#getLABEL()
         * @see #getStructMapType()
         * @generated
         */
        EAttribute getStructMapType_LABEL();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.StructMapType#getTYPE <em>TYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>TYPE</em>'.
         * @see gov.loc.mets.StructMapType#getTYPE()
         * @see #getStructMapType()
         * @generated
         */
        EAttribute getStructMapType_TYPE();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.TransformFileType <em>Transform File Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Transform File Type</em>'.
         * @see gov.loc.mets.TransformFileType
         * @generated
         */
        EClass getTransformFileType();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.TransformFileType#getID <em>ID</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>ID</em>'.
         * @see gov.loc.mets.TransformFileType#getID()
         * @see #getTransformFileType()
         * @generated
         */
        EAttribute getTransformFileType_ID();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.TransformFileType#getTRANSFORMALGORITHM <em>TRANSFORMALGORITHM</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>TRANSFORMALGORITHM</em>'.
         * @see gov.loc.mets.TransformFileType#getTRANSFORMALGORITHM()
         * @see #getTransformFileType()
         * @generated
         */
        EAttribute getTransformFileType_TRANSFORMALGORITHM();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.TransformFileType#getTRANSFORMBEHAVIOR <em>TRANSFORMBEHAVIOR</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>TRANSFORMBEHAVIOR</em>'.
         * @see gov.loc.mets.TransformFileType#getTRANSFORMBEHAVIOR()
         * @see #getTransformFileType()
         * @generated
         */
        EAttribute getTransformFileType_TRANSFORMBEHAVIOR();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.TransformFileType#getTRANSFORMKEY <em>TRANSFORMKEY</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>TRANSFORMKEY</em>'.
         * @see gov.loc.mets.TransformFileType#getTRANSFORMKEY()
         * @see #getTransformFileType()
         * @generated
         */
        EAttribute getTransformFileType_TRANSFORMKEY();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.TransformFileType#getTRANSFORMORDER <em>TRANSFORMORDER</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>TRANSFORMORDER</em>'.
         * @see gov.loc.mets.TransformFileType#getTRANSFORMORDER()
         * @see #getTransformFileType()
         * @generated
         */
        EAttribute getTransformFileType_TRANSFORMORDER();

        /**
         * Returns the meta object for the attribute '{@link gov.loc.mets.TransformFileType#getTRANSFORMTYPE <em>TRANSFORMTYPE</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>TRANSFORMTYPE</em>'.
         * @see gov.loc.mets.TransformFileType#getTRANSFORMTYPE()
         * @see #getTransformFileType()
         * @generated
         */
        EAttribute getTransformFileType_TRANSFORMTYPE();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.XmlDataType <em>Xml Data Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Xml Data Type</em>'.
         * @see gov.loc.mets.XmlDataType
         * @generated
         */
        EClass getXmlDataType();

        /**
         * Returns the meta object for the attribute list '{@link gov.loc.mets.XmlDataType#getAny <em>Any</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Any</em>'.
         * @see gov.loc.mets.XmlDataType#getAny()
         * @see #getXmlDataType()
         * @generated
         */
        EAttribute getXmlDataType_Any();

        /**
         * Returns the meta object for class '{@link gov.loc.mets.XmlDataType1 <em>Xml Data Type1</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Xml Data Type1</em>'.
         * @see gov.loc.mets.XmlDataType1
         * @generated
         */
        EClass getXmlDataType1();

        /**
         * Returns the meta object for the attribute list '{@link gov.loc.mets.XmlDataType1#getAny <em>Any</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Any</em>'.
         * @see gov.loc.mets.XmlDataType1#getAny()
         * @see #getXmlDataType1()
         * @generated
         */
        EAttribute getXmlDataType1_Any();

        /**
         * Returns the meta object for enum '{@link gov.loc.mets.ARCLINKORDERType <em>ARCLINKORDER Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>ARCLINKORDER Type</em>'.
         * @see gov.loc.mets.ARCLINKORDERType
         * @generated
         */
        EEnum getARCLINKORDERType();

        /**
         * Returns the meta object for enum '{@link gov.loc.mets.BETYPEType <em>BETYPE Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>BETYPE Type</em>'.
         * @see gov.loc.mets.BETYPEType
         * @generated
         */
        EEnum getBETYPEType();

        /**
         * Returns the meta object for enum '{@link gov.loc.mets.BETYPEType1 <em>BETYPE Type1</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>BETYPE Type1</em>'.
         * @see gov.loc.mets.BETYPEType1
         * @generated
         */
        EEnum getBETYPEType1();

        /**
         * Returns the meta object for enum '{@link gov.loc.mets.BETYPEType2 <em>BETYPE Type2</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>BETYPE Type2</em>'.
         * @see gov.loc.mets.BETYPEType2
         * @generated
         */
        EEnum getBETYPEType2();

        /**
         * Returns the meta object for enum '{@link gov.loc.mets.CHECKSUMTYPEType <em>CHECKSUMTYPE Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>CHECKSUMTYPE Type</em>'.
         * @see gov.loc.mets.CHECKSUMTYPEType
         * @generated
         */
        EEnum getCHECKSUMTYPEType();

        /**
         * Returns the meta object for enum '{@link gov.loc.mets.EXTTYPEType <em>EXTTYPE Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>EXTTYPE Type</em>'.
         * @see gov.loc.mets.EXTTYPEType
         * @generated
         */
        EEnum getEXTTYPEType();

        /**
         * Returns the meta object for enum '{@link gov.loc.mets.LOCTYPEType <em>LOCTYPE Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>LOCTYPE Type</em>'.
         * @see gov.loc.mets.LOCTYPEType
         * @generated
         */
        EEnum getLOCTYPEType();

        /**
         * Returns the meta object for enum '{@link gov.loc.mets.MDTYPEType <em>MDTYPE Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>MDTYPE Type</em>'.
         * @see gov.loc.mets.MDTYPEType
         * @generated
         */
        EEnum getMDTYPEType();

        /**
         * Returns the meta object for enum '{@link gov.loc.mets.ROLEType <em>ROLE Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>ROLE Type</em>'.
         * @see gov.loc.mets.ROLEType
         * @generated
         */
        EEnum getROLEType();

        /**
         * Returns the meta object for enum '{@link gov.loc.mets.SHAPEType <em>SHAPE Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>SHAPE Type</em>'.
         * @see gov.loc.mets.SHAPEType
         * @generated
         */
        EEnum getSHAPEType();

        /**
         * Returns the meta object for enum '{@link gov.loc.mets.TRANSFORMTYPEType <em>TRANSFORMTYPE Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>TRANSFORMTYPE Type</em>'.
         * @see gov.loc.mets.TRANSFORMTYPEType
         * @generated
         */
        EEnum getTRANSFORMTYPEType();

        /**
         * Returns the meta object for enum '{@link gov.loc.mets.TYPEType <em>TYPE Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>TYPE Type</em>'.
         * @see gov.loc.mets.TYPEType
         * @generated
         */
        EEnum getTYPEType();

        /**
         * Returns the meta object for data type '{@link gov.loc.mets.ARCLINKORDERType <em>ARCLINKORDER Type Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>ARCLINKORDER Type Object</em>'.
         * @see gov.loc.mets.ARCLINKORDERType
         * @model instanceClass="gov.loc.mets.ARCLINKORDERType"
         *        extendedMetaData="name='ARCLINKORDER_._type:Object' baseType='ARCLINKORDER_._type'"
         * @generated
         */
        EDataType getARCLINKORDERTypeObject();

        /**
         * Returns the meta object for data type '{@link gov.loc.mets.BETYPEType <em>BETYPE Type Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>BETYPE Type Object</em>'.
         * @see gov.loc.mets.BETYPEType
         * @model instanceClass="gov.loc.mets.BETYPEType"
         *        extendedMetaData="name='BETYPE_._type:Object' baseType='BETYPE_._type'"
         * @generated
         */
        EDataType getBETYPETypeObject();

        /**
         * Returns the meta object for data type '{@link gov.loc.mets.BETYPEType1 <em>BETYPE Type Object1</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>BETYPE Type Object1</em>'.
         * @see gov.loc.mets.BETYPEType1
         * @model instanceClass="gov.loc.mets.BETYPEType1"
         *        extendedMetaData="name='BETYPE_._1_._type:Object' baseType='BETYPE_._1_._type'"
         * @generated
         */
        EDataType getBETYPETypeObject1();

        /**
         * Returns the meta object for data type '{@link gov.loc.mets.BETYPEType2 <em>BETYPE Type Object2</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>BETYPE Type Object2</em>'.
         * @see gov.loc.mets.BETYPEType2
         * @model instanceClass="gov.loc.mets.BETYPEType2"
         *        extendedMetaData="name='BETYPE_._2_._type:Object' baseType='BETYPE_._2_._type'"
         * @generated
         */
        EDataType getBETYPETypeObject2();

        /**
         * Returns the meta object for data type '{@link gov.loc.mets.CHECKSUMTYPEType <em>CHECKSUMTYPE Type Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>CHECKSUMTYPE Type Object</em>'.
         * @see gov.loc.mets.CHECKSUMTYPEType
         * @model instanceClass="gov.loc.mets.CHECKSUMTYPEType"
         *        extendedMetaData="name='CHECKSUMTYPE_._type:Object' baseType='CHECKSUMTYPE_._type'"
         * @generated
         */
        EDataType getCHECKSUMTYPETypeObject();

        /**
         * Returns the meta object for data type '{@link gov.loc.mets.EXTTYPEType <em>EXTTYPE Type Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>EXTTYPE Type Object</em>'.
         * @see gov.loc.mets.EXTTYPEType
         * @model instanceClass="gov.loc.mets.EXTTYPEType"
         *        extendedMetaData="name='EXTTYPE_._type:Object' baseType='EXTTYPE_._type'"
         * @generated
         */
        EDataType getEXTTYPETypeObject();

        /**
         * Returns the meta object for data type '{@link gov.loc.mets.LOCTYPEType <em>LOCTYPE Type Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>LOCTYPE Type Object</em>'.
         * @see gov.loc.mets.LOCTYPEType
         * @model instanceClass="gov.loc.mets.LOCTYPEType"
         *        extendedMetaData="name='LOCTYPE_._type:Object' baseType='LOCTYPE_._type'"
         * @generated
         */
        EDataType getLOCTYPETypeObject();

        /**
         * Returns the meta object for data type '{@link gov.loc.mets.MDTYPEType <em>MDTYPE Type Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>MDTYPE Type Object</em>'.
         * @see gov.loc.mets.MDTYPEType
         * @model instanceClass="gov.loc.mets.MDTYPEType"
         *        extendedMetaData="name='MDTYPE_._type:Object' baseType='MDTYPE_._type'"
         * @generated
         */
        EDataType getMDTYPETypeObject();

        /**
         * Returns the meta object for data type '{@link gov.loc.mets.ROLEType <em>ROLE Type Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>ROLE Type Object</em>'.
         * @see gov.loc.mets.ROLEType
         * @model instanceClass="gov.loc.mets.ROLEType"
         *        extendedMetaData="name='ROLE_._type:Object' baseType='ROLE_._type'"
         * @generated
         */
        EDataType getROLETypeObject();

        /**
         * Returns the meta object for data type '{@link gov.loc.mets.SHAPEType <em>SHAPE Type Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>SHAPE Type Object</em>'.
         * @see gov.loc.mets.SHAPEType
         * @model instanceClass="gov.loc.mets.SHAPEType"
         *        extendedMetaData="name='SHAPE_._type:Object' baseType='SHAPE_._type'"
         * @generated
         */
        EDataType getSHAPETypeObject();

        /**
         * Returns the meta object for data type '{@link gov.loc.mets.TRANSFORMTYPEType <em>TRANSFORMTYPE Type Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>TRANSFORMTYPE Type Object</em>'.
         * @see gov.loc.mets.TRANSFORMTYPEType
         * @model instanceClass="gov.loc.mets.TRANSFORMTYPEType"
         *        extendedMetaData="name='TRANSFORMTYPE_._type:Object' baseType='TRANSFORMTYPE_._type'"
         * @generated
         */
        EDataType getTRANSFORMTYPETypeObject();

        /**
         * Returns the meta object for data type '{@link gov.loc.mets.TYPEType <em>TYPE Type Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>TYPE Type Object</em>'.
         * @see gov.loc.mets.TYPEType
         * @model instanceClass="gov.loc.mets.TYPEType"
         *        extendedMetaData="name='TYPE_._type:Object' baseType='TYPE_._type'"
         * @generated
         */
        EDataType getTYPETypeObject();

        /**
         * Returns the meta object for data type '{@link java.util.List <em>UR Is</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>UR Is</em>'.
         * @see java.util.List
         * @model instanceClass="java.util.List"
         *        extendedMetaData="name='URIs' itemType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
         * @generated
         */
        EDataType getURIs();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        MetsFactory getMetsFactory();

        /**
         * <!-- begin-user-doc -->
         * Defines literals for the meta objects that represent
         * <ul>
         *   <li>each class,</li>
         *   <li>each feature of each class,</li>
         *   <li>each enum,</li>
         *   <li>and each data type</li>
         * </ul>
         * <!-- end-user-doc -->
         * @generated
         */
        interface Literals {
                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.AgentTypeImpl <em>Agent Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.AgentTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getAgentType()
                 * @generated
                 */
                EClass AGENT_TYPE = eINSTANCE.getAgentType();

                /**
                 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AGENT_TYPE__NAME = eINSTANCE.getAgentType_Name();

                /**
                 * The meta object literal for the '<em><b>Note</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AGENT_TYPE__NOTE = eINSTANCE.getAgentType_Note();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AGENT_TYPE__ID = eINSTANCE.getAgentType_ID();

                /**
                 * The meta object literal for the '<em><b>OTHERROLE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AGENT_TYPE__OTHERROLE = eINSTANCE.getAgentType_OTHERROLE();

                /**
                 * The meta object literal for the '<em><b>OTHERTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AGENT_TYPE__OTHERTYPE = eINSTANCE.getAgentType_OTHERTYPE();

                /**
                 * The meta object literal for the '<em><b>ROLE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AGENT_TYPE__ROLE = eINSTANCE.getAgentType_ROLE();

                /**
                 * The meta object literal for the '<em><b>TYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AGENT_TYPE__TYPE = eINSTANCE.getAgentType_TYPE();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.AltRecordIDTypeImpl <em>Alt Record ID Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.AltRecordIDTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getAltRecordIDType()
                 * @generated
                 */
                EClass ALT_RECORD_ID_TYPE = eINSTANCE.getAltRecordIDType();

                /**
                 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute ALT_RECORD_ID_TYPE__VALUE = eINSTANCE.getAltRecordIDType_Value();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute ALT_RECORD_ID_TYPE__ID = eINSTANCE.getAltRecordIDType_ID();

                /**
                 * The meta object literal for the '<em><b>TYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute ALT_RECORD_ID_TYPE__TYPE = eINSTANCE.getAltRecordIDType_TYPE();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.AmdSecTypeImpl <em>Amd Sec Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.AmdSecTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getAmdSecType()
                 * @generated
                 */
                EClass AMD_SEC_TYPE = eINSTANCE.getAmdSecType();

                /**
                 * The meta object literal for the '<em><b>Tech MD</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference AMD_SEC_TYPE__TECH_MD = eINSTANCE.getAmdSecType_TechMD();

                /**
                 * The meta object literal for the '<em><b>Rights MD</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference AMD_SEC_TYPE__RIGHTS_MD = eINSTANCE.getAmdSecType_RightsMD();

                /**
                 * The meta object literal for the '<em><b>Source MD</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference AMD_SEC_TYPE__SOURCE_MD = eINSTANCE.getAmdSecType_SourceMD();

                /**
                 * The meta object literal for the '<em><b>Digiprov MD</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference AMD_SEC_TYPE__DIGIPROV_MD = eINSTANCE.getAmdSecType_DigiprovMD();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AMD_SEC_TYPE__ID = eINSTANCE.getAmdSecType_ID();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.AreaTypeImpl <em>Area Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.AreaTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getAreaType()
                 * @generated
                 */
                EClass AREA_TYPE = eINSTANCE.getAreaType();

                /**
                 * The meta object literal for the '<em><b>ADMID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AREA_TYPE__ADMID = eINSTANCE.getAreaType_ADMID();

                /**
                 * The meta object literal for the '<em><b>BEGIN</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AREA_TYPE__BEGIN = eINSTANCE.getAreaType_BEGIN();

                /**
                 * The meta object literal for the '<em><b>BETYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AREA_TYPE__BETYPE = eINSTANCE.getAreaType_BETYPE();

                /**
                 * The meta object literal for the '<em><b>CONTENTIDS</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AREA_TYPE__CONTENTIDS = eINSTANCE.getAreaType_CONTENTIDS();

                /**
                 * The meta object literal for the '<em><b>COORDS</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AREA_TYPE__COORDS = eINSTANCE.getAreaType_COORDS();

                /**
                 * The meta object literal for the '<em><b>END</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AREA_TYPE__END = eINSTANCE.getAreaType_END();

                /**
                 * The meta object literal for the '<em><b>EXTENT</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AREA_TYPE__EXTENT = eINSTANCE.getAreaType_EXTENT();

                /**
                 * The meta object literal for the '<em><b>EXTTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AREA_TYPE__EXTTYPE = eINSTANCE.getAreaType_EXTTYPE();

                /**
                 * The meta object literal for the '<em><b>FILEID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AREA_TYPE__FILEID = eINSTANCE.getAreaType_FILEID();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AREA_TYPE__ID = eINSTANCE.getAreaType_ID();

                /**
                 * The meta object literal for the '<em><b>SHAPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AREA_TYPE__SHAPE = eINSTANCE.getAreaType_SHAPE();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.BehaviorSecTypeImpl <em>Behavior Sec Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.BehaviorSecTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getBehaviorSecType()
                 * @generated
                 */
                EClass BEHAVIOR_SEC_TYPE = eINSTANCE.getBehaviorSecType();

                /**
                 * The meta object literal for the '<em><b>Behavior Sec</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference BEHAVIOR_SEC_TYPE__BEHAVIOR_SEC = eINSTANCE.getBehaviorSecType_BehaviorSec();

                /**
                 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference BEHAVIOR_SEC_TYPE__BEHAVIOR = eINSTANCE.getBehaviorSecType_Behavior();

                /**
                 * The meta object literal for the '<em><b>CREATED</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute BEHAVIOR_SEC_TYPE__CREATED = eINSTANCE.getBehaviorSecType_CREATED();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute BEHAVIOR_SEC_TYPE__ID = eINSTANCE.getBehaviorSecType_ID();

                /**
                 * The meta object literal for the '<em><b>LABEL</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute BEHAVIOR_SEC_TYPE__LABEL = eINSTANCE.getBehaviorSecType_LABEL();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.BehaviorTypeImpl <em>Behavior Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.BehaviorTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getBehaviorType()
                 * @generated
                 */
                EClass BEHAVIOR_TYPE = eINSTANCE.getBehaviorType();

                /**
                 * The meta object literal for the '<em><b>Interface Def</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference BEHAVIOR_TYPE__INTERFACE_DEF = eINSTANCE.getBehaviorType_InterfaceDef();

                /**
                 * The meta object literal for the '<em><b>Mechanism</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference BEHAVIOR_TYPE__MECHANISM = eINSTANCE.getBehaviorType_Mechanism();

                /**
                 * The meta object literal for the '<em><b>ADMID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute BEHAVIOR_TYPE__ADMID = eINSTANCE.getBehaviorType_ADMID();

                /**
                 * The meta object literal for the '<em><b>BTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute BEHAVIOR_TYPE__BTYPE = eINSTANCE.getBehaviorType_BTYPE();

                /**
                 * The meta object literal for the '<em><b>CREATED</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute BEHAVIOR_TYPE__CREATED = eINSTANCE.getBehaviorType_CREATED();

                /**
                 * The meta object literal for the '<em><b>GROUPID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute BEHAVIOR_TYPE__GROUPID = eINSTANCE.getBehaviorType_GROUPID();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute BEHAVIOR_TYPE__ID = eINSTANCE.getBehaviorType_ID();

                /**
                 * The meta object literal for the '<em><b>LABEL</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute BEHAVIOR_TYPE__LABEL = eINSTANCE.getBehaviorType_LABEL();

                /**
                 * The meta object literal for the '<em><b>STRUCTID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute BEHAVIOR_TYPE__STRUCTID = eINSTANCE.getBehaviorType_STRUCTID();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.DivTypeImpl <em>Div Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.DivTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getDivType()
                 * @generated
                 */
                EClass DIV_TYPE = eINSTANCE.getDivType();

                /**
                 * The meta object literal for the '<em><b>Mptr</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DIV_TYPE__MPTR = eINSTANCE.getDivType_Mptr();

                /**
                 * The meta object literal for the '<em><b>Fptr</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DIV_TYPE__FPTR = eINSTANCE.getDivType_Fptr();

                /**
                 * The meta object literal for the '<em><b>Div</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DIV_TYPE__DIV = eINSTANCE.getDivType_Div();

                /**
                 * The meta object literal for the '<em><b>Md Sec</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DIV_TYPE__MD_SEC = eINSTANCE.getDivType_MdSec();

                /**
                 * The meta object literal for the '<em><b>CONTENTIDS</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DIV_TYPE__CONTENTIDS = eINSTANCE.getDivType_CONTENTIDS();

                /**
                 * The meta object literal for the '<em><b>Dmd Sec</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DIV_TYPE__DMD_SEC = eINSTANCE.getDivType_DmdSec();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DIV_TYPE__ID = eINSTANCE.getDivType_ID();

                /**
                 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DIV_TYPE__LABEL = eINSTANCE.getDivType_Label();

                /**
                 * The meta object literal for the '<em><b>LABEL1</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DIV_TYPE__LABEL1 = eINSTANCE.getDivType_LABEL1();

                /**
                 * The meta object literal for the '<em><b>ORDER</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DIV_TYPE__ORDER = eINSTANCE.getDivType_ORDER();

                /**
                 * The meta object literal for the '<em><b>ORDERLABEL</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DIV_TYPE__ORDERLABEL = eINSTANCE.getDivType_ORDERLABEL();

                /**
                 * The meta object literal for the '<em><b>TYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DIV_TYPE__TYPE = eINSTANCE.getDivType_TYPE();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.DocumentRootImpl <em>Document Root</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.DocumentRootImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getDocumentRoot()
                 * @generated
                 */
                EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

                /**
                 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

                /**
                 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

                /**
                 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

                /**
                 * The meta object literal for the '<em><b>Mets</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DOCUMENT_ROOT__METS = eINSTANCE.getDocumentRoot_Mets();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.FContentTypeImpl <em>FContent Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.FContentTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getFContentType()
                 * @generated
                 */
                EClass FCONTENT_TYPE = eINSTANCE.getFContentType();

                /**
                 * The meta object literal for the '<em><b>Bin Data</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FCONTENT_TYPE__BIN_DATA = eINSTANCE.getFContentType_BinData();

                /**
                 * The meta object literal for the '<em><b>Xml Data</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference FCONTENT_TYPE__XML_DATA = eINSTANCE.getFContentType_XmlData();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FCONTENT_TYPE__ID = eINSTANCE.getFContentType_ID();

                /**
                 * The meta object literal for the '<em><b>USE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FCONTENT_TYPE__USE = eINSTANCE.getFContentType_USE();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.FileGrpTypeImpl <em>File Grp Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.FileGrpTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getFileGrpType()
                 * @generated
                 */
                EClass FILE_GRP_TYPE = eINSTANCE.getFileGrpType();

                /**
                 * The meta object literal for the '<em><b>File Grp</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference FILE_GRP_TYPE__FILE_GRP = eINSTANCE.getFileGrpType_FileGrp();

                /**
                 * The meta object literal for the '<em><b>File</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference FILE_GRP_TYPE__FILE = eINSTANCE.getFileGrpType_File();

                /**
                 * The meta object literal for the '<em><b>ADMID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_GRP_TYPE__ADMID = eINSTANCE.getFileGrpType_ADMID();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_GRP_TYPE__ID = eINSTANCE.getFileGrpType_ID();

                /**
                 * The meta object literal for the '<em><b>USE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_GRP_TYPE__USE = eINSTANCE.getFileGrpType_USE();

                /**
                 * The meta object literal for the '<em><b>VERSDATE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_GRP_TYPE__VERSDATE = eINSTANCE.getFileGrpType_VERSDATE();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.FileGrpType1Impl <em>File Grp Type1</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.FileGrpType1Impl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getFileGrpType1()
                 * @generated
                 */
                EClass FILE_GRP_TYPE1 = eINSTANCE.getFileGrpType1();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.FileSecTypeImpl <em>File Sec Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.FileSecTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getFileSecType()
                 * @generated
                 */
                EClass FILE_SEC_TYPE = eINSTANCE.getFileSecType();

                /**
                 * The meta object literal for the '<em><b>File Grp</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference FILE_SEC_TYPE__FILE_GRP = eINSTANCE.getFileSecType_FileGrp();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_SEC_TYPE__ID = eINSTANCE.getFileSecType_ID();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.FileTypeImpl <em>File Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.FileTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getFileType()
                 * @generated
                 */
                EClass FILE_TYPE = eINSTANCE.getFileType();

                /**
                 * The meta object literal for the '<em><b>FLocat</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference FILE_TYPE__FLOCAT = eINSTANCE.getFileType_FLocat();

                /**
                 * The meta object literal for the '<em><b>FContent</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference FILE_TYPE__FCONTENT = eINSTANCE.getFileType_FContent();

                /**
                 * The meta object literal for the '<em><b>Stream</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference FILE_TYPE__STREAM = eINSTANCE.getFileType_Stream();

                /**
                 * The meta object literal for the '<em><b>Transform File</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference FILE_TYPE__TRANSFORM_FILE = eINSTANCE.getFileType_TransformFile();

                /**
                 * The meta object literal for the '<em><b>File</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference FILE_TYPE__FILE = eINSTANCE.getFileType_File();

                /**
                 * The meta object literal for the '<em><b>ADMID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__ADMID = eINSTANCE.getFileType_ADMID();

                /**
                 * The meta object literal for the '<em><b>BEGIN</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__BEGIN = eINSTANCE.getFileType_BEGIN();

                /**
                 * The meta object literal for the '<em><b>BETYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__BETYPE = eINSTANCE.getFileType_BETYPE();

                /**
                 * The meta object literal for the '<em><b>CHECKSUM</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__CHECKSUM = eINSTANCE.getFileType_CHECKSUM();

                /**
                 * The meta object literal for the '<em><b>CHECKSUMTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__CHECKSUMTYPE = eINSTANCE.getFileType_CHECKSUMTYPE();

                /**
                 * The meta object literal for the '<em><b>CREATED</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__CREATED = eINSTANCE.getFileType_CREATED();

                /**
                 * The meta object literal for the '<em><b>DMDID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__DMDID = eINSTANCE.getFileType_DMDID();

                /**
                 * The meta object literal for the '<em><b>END</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__END = eINSTANCE.getFileType_END();

                /**
                 * The meta object literal for the '<em><b>GROUPID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__GROUPID = eINSTANCE.getFileType_GROUPID();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__ID = eINSTANCE.getFileType_ID();

                /**
                 * The meta object literal for the '<em><b>MIMETYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__MIMETYPE = eINSTANCE.getFileType_MIMETYPE();

                /**
                 * The meta object literal for the '<em><b>OWNERID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__OWNERID = eINSTANCE.getFileType_OWNERID();

                /**
                 * The meta object literal for the '<em><b>SEQ</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__SEQ = eINSTANCE.getFileType_SEQ();

                /**
                 * The meta object literal for the '<em><b>SIZE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__SIZE = eINSTANCE.getFileType_SIZE();

                /**
                 * The meta object literal for the '<em><b>USE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FILE_TYPE__USE = eINSTANCE.getFileType_USE();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.FLocatTypeImpl <em>FLocat Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.FLocatTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getFLocatType()
                 * @generated
                 */
                EClass FLOCAT_TYPE = eINSTANCE.getFLocatType();

                /**
                 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FLOCAT_TYPE__ACTUATE = eINSTANCE.getFLocatType_Actuate();

                /**
                 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FLOCAT_TYPE__ARCROLE = eINSTANCE.getFLocatType_Arcrole();

                /**
                 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FLOCAT_TYPE__HREF = eINSTANCE.getFLocatType_Href();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FLOCAT_TYPE__ID = eINSTANCE.getFLocatType_ID();

                /**
                 * The meta object literal for the '<em><b>LOCTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FLOCAT_TYPE__LOCTYPE = eINSTANCE.getFLocatType_LOCTYPE();

                /**
                 * The meta object literal for the '<em><b>OTHERLOCTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FLOCAT_TYPE__OTHERLOCTYPE = eINSTANCE.getFLocatType_OTHERLOCTYPE();

                /**
                 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FLOCAT_TYPE__ROLE = eINSTANCE.getFLocatType_Role();

                /**
                 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FLOCAT_TYPE__SHOW = eINSTANCE.getFLocatType_Show();

                /**
                 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FLOCAT_TYPE__TITLE = eINSTANCE.getFLocatType_Title();

                /**
                 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FLOCAT_TYPE__TYPE = eINSTANCE.getFLocatType_Type();

                /**
                 * The meta object literal for the '<em><b>USE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FLOCAT_TYPE__USE = eINSTANCE.getFLocatType_USE();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.FptrTypeImpl <em>Fptr Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.FptrTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getFptrType()
                 * @generated
                 */
                EClass FPTR_TYPE = eINSTANCE.getFptrType();

                /**
                 * The meta object literal for the '<em><b>Par</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference FPTR_TYPE__PAR = eINSTANCE.getFptrType_Par();

                /**
                 * The meta object literal for the '<em><b>Seq</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference FPTR_TYPE__SEQ = eINSTANCE.getFptrType_Seq();

                /**
                 * The meta object literal for the '<em><b>Area</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference FPTR_TYPE__AREA = eINSTANCE.getFptrType_Area();

                /**
                 * The meta object literal for the '<em><b>CONTENTIDS</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FPTR_TYPE__CONTENTIDS = eINSTANCE.getFptrType_CONTENTIDS();

                /**
                 * The meta object literal for the '<em><b>FILEID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FPTR_TYPE__FILEID = eINSTANCE.getFptrType_FILEID();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FPTR_TYPE__ID = eINSTANCE.getFptrType_ID();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.MdRefTypeImpl <em>Md Ref Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.MdRefTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getMdRefType()
                 * @generated
                 */
                EClass MD_REF_TYPE = eINSTANCE.getMdRefType();

                /**
                 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__ACTUATE = eINSTANCE.getMdRefType_Actuate();

                /**
                 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__ARCROLE = eINSTANCE.getMdRefType_Arcrole();

                /**
                 * The meta object literal for the '<em><b>CHECKSUM</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__CHECKSUM = eINSTANCE.getMdRefType_CHECKSUM();

                /**
                 * The meta object literal for the '<em><b>CHECKSUMTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__CHECKSUMTYPE = eINSTANCE.getMdRefType_CHECKSUMTYPE();

                /**
                 * The meta object literal for the '<em><b>CREATED</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__CREATED = eINSTANCE.getMdRefType_CREATED();

                /**
                 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__HREF = eINSTANCE.getMdRefType_Href();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__ID = eINSTANCE.getMdRefType_ID();

                /**
                 * The meta object literal for the '<em><b>LABEL</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__LABEL = eINSTANCE.getMdRefType_LABEL();

                /**
                 * The meta object literal for the '<em><b>LOCTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__LOCTYPE = eINSTANCE.getMdRefType_LOCTYPE();

                /**
                 * The meta object literal for the '<em><b>MDTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__MDTYPE = eINSTANCE.getMdRefType_MDTYPE();

                /**
                 * The meta object literal for the '<em><b>MDTYPEVERSION</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__MDTYPEVERSION = eINSTANCE.getMdRefType_MDTYPEVERSION();

                /**
                 * The meta object literal for the '<em><b>MIMETYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__MIMETYPE = eINSTANCE.getMdRefType_MIMETYPE();

                /**
                 * The meta object literal for the '<em><b>OTHERLOCTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__OTHERLOCTYPE = eINSTANCE.getMdRefType_OTHERLOCTYPE();

                /**
                 * The meta object literal for the '<em><b>OTHERMDTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__OTHERMDTYPE = eINSTANCE.getMdRefType_OTHERMDTYPE();

                /**
                 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__ROLE = eINSTANCE.getMdRefType_Role();

                /**
                 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__SHOW = eINSTANCE.getMdRefType_Show();

                /**
                 * The meta object literal for the '<em><b>SIZE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__SIZE = eINSTANCE.getMdRefType_SIZE();

                /**
                 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__TITLE = eINSTANCE.getMdRefType_Title();

                /**
                 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__TYPE = eINSTANCE.getMdRefType_Type();

                /**
                 * The meta object literal for the '<em><b>XPTR</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_REF_TYPE__XPTR = eINSTANCE.getMdRefType_XPTR();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.MdSecTypeImpl <em>Md Sec Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.MdSecTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getMdSecType()
                 * @generated
                 */
                EClass MD_SEC_TYPE = eINSTANCE.getMdSecType();

                /**
                 * The meta object literal for the '<em><b>Md Ref</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MD_SEC_TYPE__MD_REF = eINSTANCE.getMdSecType_MdRef();

                /**
                 * The meta object literal for the '<em><b>Md Wrap</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MD_SEC_TYPE__MD_WRAP = eINSTANCE.getMdSecType_MdWrap();

                /**
                 * The meta object literal for the '<em><b>ADMID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_SEC_TYPE__ADMID = eINSTANCE.getMdSecType_ADMID();

                /**
                 * The meta object literal for the '<em><b>CREATED</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_SEC_TYPE__CREATED = eINSTANCE.getMdSecType_CREATED();

                /**
                 * The meta object literal for the '<em><b>GROUPID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_SEC_TYPE__GROUPID = eINSTANCE.getMdSecType_GROUPID();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_SEC_TYPE__ID = eINSTANCE.getMdSecType_ID();

                /**
                 * The meta object literal for the '<em><b>STATUS</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_SEC_TYPE__STATUS = eINSTANCE.getMdSecType_STATUS();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.MdWrapTypeImpl <em>Md Wrap Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.MdWrapTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getMdWrapType()
                 * @generated
                 */
                EClass MD_WRAP_TYPE = eINSTANCE.getMdWrapType();

                /**
                 * The meta object literal for the '<em><b>Bin Data</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_WRAP_TYPE__BIN_DATA = eINSTANCE.getMdWrapType_BinData();

                /**
                 * The meta object literal for the '<em><b>Xml Data</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MD_WRAP_TYPE__XML_DATA = eINSTANCE.getMdWrapType_XmlData();

                /**
                 * The meta object literal for the '<em><b>CHECKSUM</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_WRAP_TYPE__CHECKSUM = eINSTANCE.getMdWrapType_CHECKSUM();

                /**
                 * The meta object literal for the '<em><b>CHECKSUMTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_WRAP_TYPE__CHECKSUMTYPE = eINSTANCE.getMdWrapType_CHECKSUMTYPE();

                /**
                 * The meta object literal for the '<em><b>CREATED</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_WRAP_TYPE__CREATED = eINSTANCE.getMdWrapType_CREATED();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_WRAP_TYPE__ID = eINSTANCE.getMdWrapType_ID();

                /**
                 * The meta object literal for the '<em><b>LABEL</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_WRAP_TYPE__LABEL = eINSTANCE.getMdWrapType_LABEL();

                /**
                 * The meta object literal for the '<em><b>MDTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_WRAP_TYPE__MDTYPE = eINSTANCE.getMdWrapType_MDTYPE();

                /**
                 * The meta object literal for the '<em><b>MDTYPEVERSION</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_WRAP_TYPE__MDTYPEVERSION = eINSTANCE.getMdWrapType_MDTYPEVERSION();

                /**
                 * The meta object literal for the '<em><b>MIMETYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_WRAP_TYPE__MIMETYPE = eINSTANCE.getMdWrapType_MIMETYPE();

                /**
                 * The meta object literal for the '<em><b>OTHERMDTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_WRAP_TYPE__OTHERMDTYPE = eINSTANCE.getMdWrapType_OTHERMDTYPE();

                /**
                 * The meta object literal for the '<em><b>SIZE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MD_WRAP_TYPE__SIZE = eINSTANCE.getMdWrapType_SIZE();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.MetsDocumentIDTypeImpl <em>Document ID Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.MetsDocumentIDTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getMetsDocumentIDType()
                 * @generated
                 */
                EClass METS_DOCUMENT_ID_TYPE = eINSTANCE.getMetsDocumentIDType();

                /**
                 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute METS_DOCUMENT_ID_TYPE__VALUE = eINSTANCE.getMetsDocumentIDType_Value();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute METS_DOCUMENT_ID_TYPE__ID = eINSTANCE.getMetsDocumentIDType_ID();

                /**
                 * The meta object literal for the '<em><b>TYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute METS_DOCUMENT_ID_TYPE__TYPE = eINSTANCE.getMetsDocumentIDType_TYPE();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.MetsHdrTypeImpl <em>Hdr Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.MetsHdrTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getMetsHdrType()
                 * @generated
                 */
                EClass METS_HDR_TYPE = eINSTANCE.getMetsHdrType();

                /**
                 * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference METS_HDR_TYPE__AGENT = eINSTANCE.getMetsHdrType_Agent();

                /**
                 * The meta object literal for the '<em><b>Alt Record ID</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference METS_HDR_TYPE__ALT_RECORD_ID = eINSTANCE.getMetsHdrType_AltRecordID();

                /**
                 * The meta object literal for the '<em><b>Mets Document ID</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference METS_HDR_TYPE__METS_DOCUMENT_ID = eINSTANCE.getMetsHdrType_MetsDocumentID();

                /**
                 * The meta object literal for the '<em><b>ADMID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute METS_HDR_TYPE__ADMID = eINSTANCE.getMetsHdrType_ADMID();

                /**
                 * The meta object literal for the '<em><b>CREATEDATE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute METS_HDR_TYPE__CREATEDATE = eINSTANCE.getMetsHdrType_CREATEDATE();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute METS_HDR_TYPE__ID = eINSTANCE.getMetsHdrType_ID();

                /**
                 * The meta object literal for the '<em><b>LASTMODDATE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute METS_HDR_TYPE__LASTMODDATE = eINSTANCE.getMetsHdrType_LASTMODDATE();

                /**
                 * The meta object literal for the '<em><b>RECORDSTATUS</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute METS_HDR_TYPE__RECORDSTATUS = eINSTANCE.getMetsHdrType_RECORDSTATUS();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.MetsTypeImpl <em>Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.MetsTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getMetsType()
                 * @generated
                 */
                EClass METS_TYPE = eINSTANCE.getMetsType();

                /**
                 * The meta object literal for the '<em><b>Mets Hdr</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference METS_TYPE__METS_HDR = eINSTANCE.getMetsType_MetsHdr();

                /**
                 * The meta object literal for the '<em><b>Dmd Sec</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference METS_TYPE__DMD_SEC = eINSTANCE.getMetsType_DmdSec();

                /**
                 * The meta object literal for the '<em><b>Amd Sec</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference METS_TYPE__AMD_SEC = eINSTANCE.getMetsType_AmdSec();

                /**
                 * The meta object literal for the '<em><b>File Sec</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference METS_TYPE__FILE_SEC = eINSTANCE.getMetsType_FileSec();

                /**
                 * The meta object literal for the '<em><b>Struct Map</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference METS_TYPE__STRUCT_MAP = eINSTANCE.getMetsType_StructMap();

                /**
                 * The meta object literal for the '<em><b>Struct Link</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference METS_TYPE__STRUCT_LINK = eINSTANCE.getMetsType_StructLink();

                /**
                 * The meta object literal for the '<em><b>Behavior Sec</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference METS_TYPE__BEHAVIOR_SEC = eINSTANCE.getMetsType_BehaviorSec();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute METS_TYPE__ID = eINSTANCE.getMetsType_ID();

                /**
                 * The meta object literal for the '<em><b>LABEL</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute METS_TYPE__LABEL = eINSTANCE.getMetsType_LABEL();

                /**
                 * The meta object literal for the '<em><b>OBJID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute METS_TYPE__OBJID = eINSTANCE.getMetsType_OBJID();

                /**
                 * The meta object literal for the '<em><b>PROFILE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute METS_TYPE__PROFILE = eINSTANCE.getMetsType_PROFILE();

                /**
                 * The meta object literal for the '<em><b>TYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute METS_TYPE__TYPE = eINSTANCE.getMetsType_TYPE();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.MetsType1Impl <em>Type1</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.MetsType1Impl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getMetsType1()
                 * @generated
                 */
                EClass METS_TYPE1 = eINSTANCE.getMetsType1();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.MptrTypeImpl <em>Mptr Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.MptrTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getMptrType()
                 * @generated
                 */
                EClass MPTR_TYPE = eINSTANCE.getMptrType();

                /**
                 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MPTR_TYPE__ACTUATE = eINSTANCE.getMptrType_Actuate();

                /**
                 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MPTR_TYPE__ARCROLE = eINSTANCE.getMptrType_Arcrole();

                /**
                 * The meta object literal for the '<em><b>CONTENTIDS</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MPTR_TYPE__CONTENTIDS = eINSTANCE.getMptrType_CONTENTIDS();

                /**
                 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MPTR_TYPE__HREF = eINSTANCE.getMptrType_Href();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MPTR_TYPE__ID = eINSTANCE.getMptrType_ID();

                /**
                 * The meta object literal for the '<em><b>LOCTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MPTR_TYPE__LOCTYPE = eINSTANCE.getMptrType_LOCTYPE();

                /**
                 * The meta object literal for the '<em><b>OTHERLOCTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MPTR_TYPE__OTHERLOCTYPE = eINSTANCE.getMptrType_OTHERLOCTYPE();

                /**
                 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MPTR_TYPE__ROLE = eINSTANCE.getMptrType_Role();

                /**
                 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MPTR_TYPE__SHOW = eINSTANCE.getMptrType_Show();

                /**
                 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MPTR_TYPE__TITLE = eINSTANCE.getMptrType_Title();

                /**
                 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MPTR_TYPE__TYPE = eINSTANCE.getMptrType_Type();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.ObjectTypeImpl <em>Object Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.ObjectTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getObjectType()
                 * @generated
                 */
                EClass OBJECT_TYPE = eINSTANCE.getObjectType();

                /**
                 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute OBJECT_TYPE__ACTUATE = eINSTANCE.getObjectType_Actuate();

                /**
                 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute OBJECT_TYPE__ARCROLE = eINSTANCE.getObjectType_Arcrole();

                /**
                 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute OBJECT_TYPE__HREF = eINSTANCE.getObjectType_Href();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute OBJECT_TYPE__ID = eINSTANCE.getObjectType_ID();

                /**
                 * The meta object literal for the '<em><b>LABEL</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute OBJECT_TYPE__LABEL = eINSTANCE.getObjectType_LABEL();

                /**
                 * The meta object literal for the '<em><b>LOCTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute OBJECT_TYPE__LOCTYPE = eINSTANCE.getObjectType_LOCTYPE();

                /**
                 * The meta object literal for the '<em><b>OTHERLOCTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute OBJECT_TYPE__OTHERLOCTYPE = eINSTANCE.getObjectType_OTHERLOCTYPE();

                /**
                 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute OBJECT_TYPE__ROLE = eINSTANCE.getObjectType_Role();

                /**
                 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute OBJECT_TYPE__SHOW = eINSTANCE.getObjectType_Show();

                /**
                 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute OBJECT_TYPE__TITLE = eINSTANCE.getObjectType_Title();

                /**
                 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute OBJECT_TYPE__TYPE = eINSTANCE.getObjectType_Type();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.ParTypeImpl <em>Par Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.ParTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getParType()
                 * @generated
                 */
                EClass PAR_TYPE = eINSTANCE.getParType();

                /**
                 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PAR_TYPE__GROUP = eINSTANCE.getParType_Group();

                /**
                 * The meta object literal for the '<em><b>Area</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference PAR_TYPE__AREA = eINSTANCE.getParType_Area();

                /**
                 * The meta object literal for the '<em><b>Seq</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference PAR_TYPE__SEQ = eINSTANCE.getParType_Seq();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PAR_TYPE__ID = eINSTANCE.getParType_ID();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.SeqTypeImpl <em>Seq Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.SeqTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getSeqType()
                 * @generated
                 */
                EClass SEQ_TYPE = eINSTANCE.getSeqType();

                /**
                 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SEQ_TYPE__GROUP = eINSTANCE.getSeqType_Group();

                /**
                 * The meta object literal for the '<em><b>Area</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference SEQ_TYPE__AREA = eINSTANCE.getSeqType_Area();

                /**
                 * The meta object literal for the '<em><b>Par</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference SEQ_TYPE__PAR = eINSTANCE.getSeqType_Par();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SEQ_TYPE__ID = eINSTANCE.getSeqType_ID();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.SmArcLinkTypeImpl <em>Sm Arc Link Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.SmArcLinkTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getSmArcLinkType()
                 * @generated
                 */
                EClass SM_ARC_LINK_TYPE = eINSTANCE.getSmArcLinkType();

                /**
                 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_ARC_LINK_TYPE__ACTUATE = eINSTANCE.getSmArcLinkType_Actuate();

                /**
                 * The meta object literal for the '<em><b>ADMID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_ARC_LINK_TYPE__ADMID = eINSTANCE.getSmArcLinkType_ADMID();

                /**
                 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_ARC_LINK_TYPE__ARCROLE = eINSTANCE.getSmArcLinkType_Arcrole();

                /**
                 * The meta object literal for the '<em><b>ARCTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_ARC_LINK_TYPE__ARCTYPE = eINSTANCE.getSmArcLinkType_ARCTYPE();

                /**
                 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_ARC_LINK_TYPE__FROM = eINSTANCE.getSmArcLinkType_From();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_ARC_LINK_TYPE__ID = eINSTANCE.getSmArcLinkType_ID();

                /**
                 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_ARC_LINK_TYPE__SHOW = eINSTANCE.getSmArcLinkType_Show();

                /**
                 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_ARC_LINK_TYPE__TITLE = eINSTANCE.getSmArcLinkType_Title();

                /**
                 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_ARC_LINK_TYPE__TO = eINSTANCE.getSmArcLinkType_To();

                /**
                 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_ARC_LINK_TYPE__TYPE = eINSTANCE.getSmArcLinkType_Type();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.SmLinkGrpTypeImpl <em>Sm Link Grp Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.SmLinkGrpTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getSmLinkGrpType()
                 * @generated
                 */
                EClass SM_LINK_GRP_TYPE = eINSTANCE.getSmLinkGrpType();

                /**
                 * The meta object literal for the '<em><b>Sm Locator Link</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference SM_LINK_GRP_TYPE__SM_LOCATOR_LINK = eINSTANCE.getSmLinkGrpType_SmLocatorLink();

                /**
                 * The meta object literal for the '<em><b>Sm Arc Link</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference SM_LINK_GRP_TYPE__SM_ARC_LINK = eINSTANCE.getSmLinkGrpType_SmArcLink();

                /**
                 * The meta object literal for the '<em><b>ARCLINKORDER</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LINK_GRP_TYPE__ARCLINKORDER = eINSTANCE.getSmLinkGrpType_ARCLINKORDER();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LINK_GRP_TYPE__ID = eINSTANCE.getSmLinkGrpType_ID();

                /**
                 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LINK_GRP_TYPE__ROLE = eINSTANCE.getSmLinkGrpType_Role();

                /**
                 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LINK_GRP_TYPE__TITLE = eINSTANCE.getSmLinkGrpType_Title();

                /**
                 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LINK_GRP_TYPE__TYPE = eINSTANCE.getSmLinkGrpType_Type();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.SmLinkTypeImpl <em>Sm Link Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.SmLinkTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getSmLinkType()
                 * @generated
                 */
                EClass SM_LINK_TYPE = eINSTANCE.getSmLinkType();

                /**
                 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LINK_TYPE__ACTUATE = eINSTANCE.getSmLinkType_Actuate();

                /**
                 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LINK_TYPE__ARCROLE = eINSTANCE.getSmLinkType_Arcrole();

                /**
                 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LINK_TYPE__FROM = eINSTANCE.getSmLinkType_From();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LINK_TYPE__ID = eINSTANCE.getSmLinkType_ID();

                /**
                 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LINK_TYPE__SHOW = eINSTANCE.getSmLinkType_Show();

                /**
                 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LINK_TYPE__TITLE = eINSTANCE.getSmLinkType_Title();

                /**
                 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LINK_TYPE__TO = eINSTANCE.getSmLinkType_To();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.SmLocatorLinkTypeImpl <em>Sm Locator Link Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.SmLocatorLinkTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getSmLocatorLinkType()
                 * @generated
                 */
                EClass SM_LOCATOR_LINK_TYPE = eINSTANCE.getSmLocatorLinkType();

                /**
                 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LOCATOR_LINK_TYPE__HREF = eINSTANCE.getSmLocatorLinkType_Href();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LOCATOR_LINK_TYPE__ID = eINSTANCE.getSmLocatorLinkType_ID();

                /**
                 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LOCATOR_LINK_TYPE__LABEL = eINSTANCE.getSmLocatorLinkType_Label();

                /**
                 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LOCATOR_LINK_TYPE__ROLE = eINSTANCE.getSmLocatorLinkType_Role();

                /**
                 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LOCATOR_LINK_TYPE__TITLE = eINSTANCE.getSmLocatorLinkType_Title();

                /**
                 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SM_LOCATOR_LINK_TYPE__TYPE = eINSTANCE.getSmLocatorLinkType_Type();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.StreamTypeImpl <em>Stream Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.StreamTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getStreamType()
                 * @generated
                 */
                EClass STREAM_TYPE = eINSTANCE.getStreamType();

                /**
                 * The meta object literal for the '<em><b>ADMID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STREAM_TYPE__ADMID = eINSTANCE.getStreamType_ADMID();

                /**
                 * The meta object literal for the '<em><b>BEGIN</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STREAM_TYPE__BEGIN = eINSTANCE.getStreamType_BEGIN();

                /**
                 * The meta object literal for the '<em><b>BETYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STREAM_TYPE__BETYPE = eINSTANCE.getStreamType_BETYPE();

                /**
                 * The meta object literal for the '<em><b>DMDID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STREAM_TYPE__DMDID = eINSTANCE.getStreamType_DMDID();

                /**
                 * The meta object literal for the '<em><b>END</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STREAM_TYPE__END = eINSTANCE.getStreamType_END();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STREAM_TYPE__ID = eINSTANCE.getStreamType_ID();

                /**
                 * The meta object literal for the '<em><b>OWNERID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STREAM_TYPE__OWNERID = eINSTANCE.getStreamType_OWNERID();

                /**
                 * The meta object literal for the '<em><b>Stream Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STREAM_TYPE__STREAM_TYPE = eINSTANCE.getStreamType_StreamType();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.StructLinkTypeImpl <em>Struct Link Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.StructLinkTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getStructLinkType()
                 * @generated
                 */
                EClass STRUCT_LINK_TYPE = eINSTANCE.getStructLinkType();

                /**
                 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STRUCT_LINK_TYPE__GROUP = eINSTANCE.getStructLinkType_Group();

                /**
                 * The meta object literal for the '<em><b>Sm Link</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference STRUCT_LINK_TYPE__SM_LINK = eINSTANCE.getStructLinkType_SmLink();

                /**
                 * The meta object literal for the '<em><b>Sm Link Grp</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference STRUCT_LINK_TYPE__SM_LINK_GRP = eINSTANCE.getStructLinkType_SmLinkGrp();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STRUCT_LINK_TYPE__ID = eINSTANCE.getStructLinkType_ID();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.StructLinkType1Impl <em>Struct Link Type1</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.StructLinkType1Impl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getStructLinkType1()
                 * @generated
                 */
                EClass STRUCT_LINK_TYPE1 = eINSTANCE.getStructLinkType1();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.StructMapTypeImpl <em>Struct Map Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.StructMapTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getStructMapType()
                 * @generated
                 */
                EClass STRUCT_MAP_TYPE = eINSTANCE.getStructMapType();

                /**
                 * The meta object literal for the '<em><b>Div</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference STRUCT_MAP_TYPE__DIV = eINSTANCE.getStructMapType_Div();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STRUCT_MAP_TYPE__ID = eINSTANCE.getStructMapType_ID();

                /**
                 * The meta object literal for the '<em><b>LABEL</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STRUCT_MAP_TYPE__LABEL = eINSTANCE.getStructMapType_LABEL();

                /**
                 * The meta object literal for the '<em><b>TYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STRUCT_MAP_TYPE__TYPE = eINSTANCE.getStructMapType_TYPE();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.TransformFileTypeImpl <em>Transform File Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.TransformFileTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getTransformFileType()
                 * @generated
                 */
                EClass TRANSFORM_FILE_TYPE = eINSTANCE.getTransformFileType();

                /**
                 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute TRANSFORM_FILE_TYPE__ID = eINSTANCE.getTransformFileType_ID();

                /**
                 * The meta object literal for the '<em><b>TRANSFORMALGORITHM</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute TRANSFORM_FILE_TYPE__TRANSFORMALGORITHM = eINSTANCE.getTransformFileType_TRANSFORMALGORITHM();

                /**
                 * The meta object literal for the '<em><b>TRANSFORMBEHAVIOR</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute TRANSFORM_FILE_TYPE__TRANSFORMBEHAVIOR = eINSTANCE.getTransformFileType_TRANSFORMBEHAVIOR();

                /**
                 * The meta object literal for the '<em><b>TRANSFORMKEY</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute TRANSFORM_FILE_TYPE__TRANSFORMKEY = eINSTANCE.getTransformFileType_TRANSFORMKEY();

                /**
                 * The meta object literal for the '<em><b>TRANSFORMORDER</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute TRANSFORM_FILE_TYPE__TRANSFORMORDER = eINSTANCE.getTransformFileType_TRANSFORMORDER();

                /**
                 * The meta object literal for the '<em><b>TRANSFORMTYPE</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute TRANSFORM_FILE_TYPE__TRANSFORMTYPE = eINSTANCE.getTransformFileType_TRANSFORMTYPE();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.XmlDataTypeImpl <em>Xml Data Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.XmlDataTypeImpl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getXmlDataType()
                 * @generated
                 */
                EClass XML_DATA_TYPE = eINSTANCE.getXmlDataType();

                /**
                 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute XML_DATA_TYPE__ANY = eINSTANCE.getXmlDataType_Any();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.impl.XmlDataType1Impl <em>Xml Data Type1</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.impl.XmlDataType1Impl
                 * @see gov.loc.mets.impl.MetsPackageImpl#getXmlDataType1()
                 * @generated
                 */
                EClass XML_DATA_TYPE1 = eINSTANCE.getXmlDataType1();

                /**
                 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute XML_DATA_TYPE1__ANY = eINSTANCE.getXmlDataType1_Any();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.ARCLINKORDERType <em>ARCLINKORDER Type</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.ARCLINKORDERType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getARCLINKORDERType()
                 * @generated
                 */
                EEnum ARCLINKORDER_TYPE = eINSTANCE.getARCLINKORDERType();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.BETYPEType <em>BETYPE Type</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.BETYPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getBETYPEType()
                 * @generated
                 */
                EEnum BETYPE_TYPE = eINSTANCE.getBETYPEType();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.BETYPEType1 <em>BETYPE Type1</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.BETYPEType1
                 * @see gov.loc.mets.impl.MetsPackageImpl#getBETYPEType1()
                 * @generated
                 */
                EEnum BETYPE_TYPE1 = eINSTANCE.getBETYPEType1();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.BETYPEType2 <em>BETYPE Type2</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.BETYPEType2
                 * @see gov.loc.mets.impl.MetsPackageImpl#getBETYPEType2()
                 * @generated
                 */
                EEnum BETYPE_TYPE2 = eINSTANCE.getBETYPEType2();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.CHECKSUMTYPEType <em>CHECKSUMTYPE Type</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.CHECKSUMTYPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getCHECKSUMTYPEType()
                 * @generated
                 */
                EEnum CHECKSUMTYPE_TYPE = eINSTANCE.getCHECKSUMTYPEType();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.EXTTYPEType <em>EXTTYPE Type</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.EXTTYPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getEXTTYPEType()
                 * @generated
                 */
                EEnum EXTTYPE_TYPE = eINSTANCE.getEXTTYPEType();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.LOCTYPEType <em>LOCTYPE Type</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.LOCTYPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getLOCTYPEType()
                 * @generated
                 */
                EEnum LOCTYPE_TYPE = eINSTANCE.getLOCTYPEType();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.MDTYPEType <em>MDTYPE Type</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.MDTYPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getMDTYPEType()
                 * @generated
                 */
                EEnum MDTYPE_TYPE = eINSTANCE.getMDTYPEType();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.ROLEType <em>ROLE Type</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.ROLEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getROLEType()
                 * @generated
                 */
                EEnum ROLE_TYPE = eINSTANCE.getROLEType();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.SHAPEType <em>SHAPE Type</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.SHAPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getSHAPEType()
                 * @generated
                 */
                EEnum SHAPE_TYPE = eINSTANCE.getSHAPEType();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.TRANSFORMTYPEType <em>TRANSFORMTYPE Type</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.TRANSFORMTYPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getTRANSFORMTYPEType()
                 * @generated
                 */
                EEnum TRANSFORMTYPE_TYPE = eINSTANCE.getTRANSFORMTYPEType();

                /**
                 * The meta object literal for the '{@link gov.loc.mets.TYPEType <em>TYPE Type</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.TYPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getTYPEType()
                 * @generated
                 */
                EEnum TYPE_TYPE = eINSTANCE.getTYPEType();

                /**
                 * The meta object literal for the '<em>ARCLINKORDER Type Object</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.ARCLINKORDERType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getARCLINKORDERTypeObject()
                 * @generated
                 */
                EDataType ARCLINKORDER_TYPE_OBJECT = eINSTANCE.getARCLINKORDERTypeObject();

                /**
                 * The meta object literal for the '<em>BETYPE Type Object</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.BETYPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getBETYPETypeObject()
                 * @generated
                 */
                EDataType BETYPE_TYPE_OBJECT = eINSTANCE.getBETYPETypeObject();

                /**
                 * The meta object literal for the '<em>BETYPE Type Object1</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.BETYPEType1
                 * @see gov.loc.mets.impl.MetsPackageImpl#getBETYPETypeObject1()
                 * @generated
                 */
                EDataType BETYPE_TYPE_OBJECT1 = eINSTANCE.getBETYPETypeObject1();

                /**
                 * The meta object literal for the '<em>BETYPE Type Object2</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.BETYPEType2
                 * @see gov.loc.mets.impl.MetsPackageImpl#getBETYPETypeObject2()
                 * @generated
                 */
                EDataType BETYPE_TYPE_OBJECT2 = eINSTANCE.getBETYPETypeObject2();

                /**
                 * The meta object literal for the '<em>CHECKSUMTYPE Type Object</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.CHECKSUMTYPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getCHECKSUMTYPETypeObject()
                 * @generated
                 */
                EDataType CHECKSUMTYPE_TYPE_OBJECT = eINSTANCE.getCHECKSUMTYPETypeObject();

                /**
                 * The meta object literal for the '<em>EXTTYPE Type Object</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.EXTTYPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getEXTTYPETypeObject()
                 * @generated
                 */
                EDataType EXTTYPE_TYPE_OBJECT = eINSTANCE.getEXTTYPETypeObject();

                /**
                 * The meta object literal for the '<em>LOCTYPE Type Object</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.LOCTYPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getLOCTYPETypeObject()
                 * @generated
                 */
                EDataType LOCTYPE_TYPE_OBJECT = eINSTANCE.getLOCTYPETypeObject();

                /**
                 * The meta object literal for the '<em>MDTYPE Type Object</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.MDTYPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getMDTYPETypeObject()
                 * @generated
                 */
                EDataType MDTYPE_TYPE_OBJECT = eINSTANCE.getMDTYPETypeObject();

                /**
                 * The meta object literal for the '<em>ROLE Type Object</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.ROLEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getROLETypeObject()
                 * @generated
                 */
                EDataType ROLE_TYPE_OBJECT = eINSTANCE.getROLETypeObject();

                /**
                 * The meta object literal for the '<em>SHAPE Type Object</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.SHAPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getSHAPETypeObject()
                 * @generated
                 */
                EDataType SHAPE_TYPE_OBJECT = eINSTANCE.getSHAPETypeObject();

                /**
                 * The meta object literal for the '<em>TRANSFORMTYPE Type Object</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.TRANSFORMTYPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getTRANSFORMTYPETypeObject()
                 * @generated
                 */
                EDataType TRANSFORMTYPE_TYPE_OBJECT = eINSTANCE.getTRANSFORMTYPETypeObject();

                /**
                 * The meta object literal for the '<em>TYPE Type Object</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see gov.loc.mets.TYPEType
                 * @see gov.loc.mets.impl.MetsPackageImpl#getTYPETypeObject()
                 * @generated
                 */
                EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTYPETypeObject();

                /**
                 * The meta object literal for the '<em>UR Is</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see java.util.List
                 * @see gov.loc.mets.impl.MetsPackageImpl#getURIs()
                 * @generated
                 */
                EDataType UR_IS = eINSTANCE.getURIs();

        }

} //MetsPackage
