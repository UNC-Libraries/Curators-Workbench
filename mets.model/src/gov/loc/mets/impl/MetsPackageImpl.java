/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.ARCLINKORDERType;
import gov.loc.mets.AgentType;
import gov.loc.mets.AltRecordIDType;
import gov.loc.mets.AmdSecType;
import gov.loc.mets.AreaType;
import gov.loc.mets.BETYPEType;
import gov.loc.mets.BETYPEType1;
import gov.loc.mets.BETYPEType2;
import gov.loc.mets.BehaviorSecType;
import gov.loc.mets.BehaviorType;
import gov.loc.mets.CHECKSUMTYPEType;
import gov.loc.mets.DivType;
import gov.loc.mets.DocumentRoot;
import gov.loc.mets.EXTTYPEType;
import gov.loc.mets.FContentType;
import gov.loc.mets.FLocatType;
import gov.loc.mets.FileGrpType;
import gov.loc.mets.FileGrpType1;
import gov.loc.mets.FileSecType;
import gov.loc.mets.FileType;
import gov.loc.mets.FptrType;
import gov.loc.mets.LOCTYPEType;
import gov.loc.mets.MDTYPEType;
import gov.loc.mets.MdRefType;
import gov.loc.mets.MdSecType;
import gov.loc.mets.MdWrapType;
import gov.loc.mets.MetsDocumentIDType;
import gov.loc.mets.MetsFactory;
import gov.loc.mets.MetsHdrType;
import gov.loc.mets.MetsPackage;
import gov.loc.mets.MetsType;
import gov.loc.mets.MetsType1;
import gov.loc.mets.MptrType;
import gov.loc.mets.ObjectType;
import gov.loc.mets.ParType;
import gov.loc.mets.ROLEType;
import gov.loc.mets.SHAPEType;
import gov.loc.mets.SeqType;
import gov.loc.mets.SmArcLinkType;
import gov.loc.mets.SmLinkGrpType;
import gov.loc.mets.SmLinkType;
import gov.loc.mets.SmLocatorLinkType;
import gov.loc.mets.StreamType;
import gov.loc.mets.StructLinkType;
import gov.loc.mets.StructLinkType1;
import gov.loc.mets.StructMapType;
import gov.loc.mets.TRANSFORMTYPEType;
import gov.loc.mets.TYPEType;
import gov.loc.mets.TransformFileType;
import gov.loc.mets.XmlDataType;
import gov.loc.mets.XmlDataType1;

import gov.loc.mets.util.MetsValidator;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._1999.xlink.XlinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetsPackageImpl extends EPackageImpl implements MetsPackage {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass agentTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass altRecordIDTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass amdSecTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass areaTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass behaviorSecTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass behaviorTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass divTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass documentRootEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass fContentTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass fileGrpTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass fileGrpType1EClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass fileSecTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass fileTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass fLocatTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass fptrTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass mdRefTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass mdSecTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass mdWrapTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass metsDocumentIDTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass metsHdrTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass metsTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass metsType1EClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass mptrTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass objectTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass parTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass seqTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass smArcLinkTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass smLinkGrpTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass smLinkTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass smLocatorLinkTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass streamTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass structLinkTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass structLinkType1EClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass structMapTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass transformFileTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass xmlDataTypeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass xmlDataType1EClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum arclinkorderTypeEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum betypeTypeEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum betypeType1EEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum betypeType2EEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum checksumtypeTypeEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum exttypeTypeEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum loctypeTypeEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum mdtypeTypeEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum roleTypeEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum shapeTypeEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum transformtypeTypeEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum typeTypeEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType arclinkorderTypeObjectEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType betypeTypeObjectEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType betypeTypeObject1EDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType betypeTypeObject2EDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType checksumtypeTypeObjectEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType exttypeTypeObjectEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType loctypeTypeObjectEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType mdtypeTypeObjectEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType roleTypeObjectEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType shapeTypeObjectEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType transformtypeTypeObjectEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType typeTypeObjectEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType urIsEDataType = null;

        /**
         * Creates an instance of the model <b>Package</b>, registered with
         * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
         * package URI value.
         * <p>Note: the correct way to create the package is via the static
         * factory method {@link #init init()}, which also performs
         * initialization of the package, or returns the registered package,
         * if one already exists.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.ecore.EPackage.Registry
         * @see gov.loc.mets.MetsPackage#eNS_URI
         * @see #init()
         * @generated
         */
        private MetsPackageImpl() {
                super(eNS_URI, MetsFactory.eINSTANCE);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static boolean isInited = false;

        /**
         * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
         * 
         * <p>This method is used to initialize {@link MetsPackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static MetsPackage init() {
                if (isInited) return (MetsPackage)EPackage.Registry.INSTANCE.getEPackage(MetsPackage.eNS_URI);

                // Obtain or create and register package
                MetsPackageImpl theMetsPackage = (MetsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetsPackageImpl());

                isInited = true;

                // Initialize simple dependencies
                XlinkPackage.eINSTANCE.eClass();
                XMLTypePackage.eINSTANCE.eClass();

                // Create package meta-data objects
                theMetsPackage.createPackageContents();

                // Initialize created meta-data
                theMetsPackage.initializePackageContents();

                // Register package validator
                EValidator.Registry.INSTANCE.put
                        (theMetsPackage, 
                         new EValidator.Descriptor() {
                                 public EValidator getEValidator() {
                                         return MetsValidator.INSTANCE;
                                 }
                         });

                // Mark meta-data to indicate it can't be changed
                theMetsPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(MetsPackage.eNS_URI, theMetsPackage);
                return theMetsPackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getAgentType() {
                return agentTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAgentType_Name() {
                return (EAttribute)agentTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAgentType_Note() {
                return (EAttribute)agentTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAgentType_ID() {
                return (EAttribute)agentTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAgentType_OTHERROLE() {
                return (EAttribute)agentTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAgentType_OTHERTYPE() {
                return (EAttribute)agentTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAgentType_ROLE() {
                return (EAttribute)agentTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAgentType_TYPE() {
                return (EAttribute)agentTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getAltRecordIDType() {
                return altRecordIDTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAltRecordIDType_Value() {
                return (EAttribute)altRecordIDTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAltRecordIDType_ID() {
                return (EAttribute)altRecordIDTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAltRecordIDType_TYPE() {
                return (EAttribute)altRecordIDTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getAmdSecType() {
                return amdSecTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getAmdSecType_TechMD() {
                return (EReference)amdSecTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getAmdSecType_RightsMD() {
                return (EReference)amdSecTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getAmdSecType_SourceMD() {
                return (EReference)amdSecTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getAmdSecType_DigiprovMD() {
                return (EReference)amdSecTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAmdSecType_ID() {
                return (EAttribute)amdSecTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getAreaType() {
                return areaTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAreaType_ADMID() {
                return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAreaType_BEGIN() {
                return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAreaType_BETYPE() {
                return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAreaType_CONTENTIDS() {
                return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAreaType_COORDS() {
                return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAreaType_END() {
                return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAreaType_EXTENT() {
                return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAreaType_EXTTYPE() {
                return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAreaType_FILEID() {
                return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAreaType_ID() {
                return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(9);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getAreaType_SHAPE() {
                return (EAttribute)areaTypeEClass.getEStructuralFeatures().get(10);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getBehaviorSecType() {
                return behaviorSecTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getBehaviorSecType_BehaviorSec() {
                return (EReference)behaviorSecTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getBehaviorSecType_Behavior() {
                return (EReference)behaviorSecTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getBehaviorSecType_CREATED() {
                return (EAttribute)behaviorSecTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getBehaviorSecType_ID() {
                return (EAttribute)behaviorSecTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getBehaviorSecType_LABEL() {
                return (EAttribute)behaviorSecTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getBehaviorType() {
                return behaviorTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getBehaviorType_InterfaceDef() {
                return (EReference)behaviorTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getBehaviorType_Mechanism() {
                return (EReference)behaviorTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getBehaviorType_ADMID() {
                return (EAttribute)behaviorTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getBehaviorType_BTYPE() {
                return (EAttribute)behaviorTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getBehaviorType_CREATED() {
                return (EAttribute)behaviorTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getBehaviorType_GROUPID() {
                return (EAttribute)behaviorTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getBehaviorType_ID() {
                return (EAttribute)behaviorTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getBehaviorType_LABEL() {
                return (EAttribute)behaviorTypeEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getBehaviorType_STRUCTID() {
                return (EAttribute)behaviorTypeEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDivType() {
                return divTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDivType_Mptr() {
                return (EReference)divTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDivType_Fptr() {
                return (EReference)divTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDivType_Div() {
                return (EReference)divTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDivType_AmdSec() {
                return (EReference)divTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDivType_CONTENTIDS() {
                return (EAttribute)divTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDivType_DmdSec() {
                return (EReference)divTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDivType_ID() {
                return (EAttribute)divTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDivType_Label() {
                return (EAttribute)divTypeEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDivType_LABEL1() {
                return (EAttribute)divTypeEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDivType_ORDER() {
                return (EAttribute)divTypeEClass.getEStructuralFeatures().get(9);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDivType_ORDERLABEL() {
                return (EAttribute)divTypeEClass.getEStructuralFeatures().get(10);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDivType_TYPE() {
                return (EAttribute)divTypeEClass.getEStructuralFeatures().get(11);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDocumentRoot() {
                return documentRootEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDocumentRoot_Mixed() {
                return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDocumentRoot_XMLNSPrefixMap() {
                return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDocumentRoot_XSISchemaLocation() {
                return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDocumentRoot_Mets() {
                return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getFContentType() {
                return fContentTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFContentType_BinData() {
                return (EAttribute)fContentTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getFContentType_XmlData() {
                return (EReference)fContentTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFContentType_ID() {
                return (EAttribute)fContentTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFContentType_USE() {
                return (EAttribute)fContentTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getFileGrpType() {
                return fileGrpTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getFileGrpType_FileGrp() {
                return (EReference)fileGrpTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getFileGrpType_File() {
                return (EReference)fileGrpTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileGrpType_ADMID() {
                return (EAttribute)fileGrpTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileGrpType_ID() {
                return (EAttribute)fileGrpTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileGrpType_USE() {
                return (EAttribute)fileGrpTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileGrpType_VERSDATE() {
                return (EAttribute)fileGrpTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getFileGrpType1() {
                return fileGrpType1EClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getFileSecType() {
                return fileSecTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getFileSecType_FileGrp() {
                return (EReference)fileSecTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileSecType_ID() {
                return (EAttribute)fileSecTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getFileType() {
                return fileTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getFileType_FLocat() {
                return (EReference)fileTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getFileType_FContent() {
                return (EReference)fileTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getFileType_Stream() {
                return (EReference)fileTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getFileType_TransformFile() {
                return (EReference)fileTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getFileType_File() {
                return (EReference)fileTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_ADMID() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_BEGIN() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_BETYPE() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_CHECKSUM() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_CHECKSUMTYPE() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(9);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_CREATED() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(10);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_DMDID() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(11);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_END() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(12);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_GROUPID() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(13);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_ID() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(14);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_MIMETYPE() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(15);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_OWNERID() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(16);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_SEQ() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(17);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_SIZE() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(18);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFileType_USE() {
                return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(19);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getFLocatType() {
                return fLocatTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFLocatType_Actuate() {
                return (EAttribute)fLocatTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFLocatType_Arcrole() {
                return (EAttribute)fLocatTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFLocatType_Href() {
                return (EAttribute)fLocatTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFLocatType_ID() {
                return (EAttribute)fLocatTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFLocatType_LOCTYPE() {
                return (EAttribute)fLocatTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFLocatType_OTHERLOCTYPE() {
                return (EAttribute)fLocatTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFLocatType_Role() {
                return (EAttribute)fLocatTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFLocatType_Show() {
                return (EAttribute)fLocatTypeEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFLocatType_Title() {
                return (EAttribute)fLocatTypeEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFLocatType_Type() {
                return (EAttribute)fLocatTypeEClass.getEStructuralFeatures().get(9);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFLocatType_USE() {
                return (EAttribute)fLocatTypeEClass.getEStructuralFeatures().get(10);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getFptrType() {
                return fptrTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getFptrType_Par() {
                return (EReference)fptrTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getFptrType_Seq() {
                return (EReference)fptrTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getFptrType_Area() {
                return (EReference)fptrTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFptrType_CONTENTIDS() {
                return (EAttribute)fptrTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFptrType_FILEID() {
                return (EAttribute)fptrTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFptrType_ID() {
                return (EAttribute)fptrTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMdRefType() {
                return mdRefTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_Actuate() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_Arcrole() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_CHECKSUM() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_CHECKSUMTYPE() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_CREATED() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_Href() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_ID() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_LABEL() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_LOCTYPE() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_MDTYPE() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(9);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_MDTYPEVERSION() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(10);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_MIMETYPE() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(11);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_OTHERLOCTYPE() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(12);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_OTHERMDTYPE() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(13);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_Role() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(14);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_Show() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(15);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_SIZE() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(16);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_Title() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(17);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_Type() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(18);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdRefType_XPTR() {
                return (EAttribute)mdRefTypeEClass.getEStructuralFeatures().get(19);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMdSecType() {
                return mdSecTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMdSecType_MdRef() {
                return (EReference)mdSecTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMdSecType_MdWrap() {
                return (EReference)mdSecTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdSecType_ADMID() {
                return (EAttribute)mdSecTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdSecType_CREATED() {
                return (EAttribute)mdSecTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdSecType_GROUPID() {
                return (EAttribute)mdSecTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdSecType_ID() {
                return (EAttribute)mdSecTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdSecType_STATUS() {
                return (EAttribute)mdSecTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMdWrapType() {
                return mdWrapTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdWrapType_BinData() {
                return (EAttribute)mdWrapTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMdWrapType_XmlData() {
                return (EReference)mdWrapTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdWrapType_CHECKSUM() {
                return (EAttribute)mdWrapTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdWrapType_CHECKSUMTYPE() {
                return (EAttribute)mdWrapTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdWrapType_CREATED() {
                return (EAttribute)mdWrapTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdWrapType_ID() {
                return (EAttribute)mdWrapTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdWrapType_LABEL() {
                return (EAttribute)mdWrapTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdWrapType_MDTYPE() {
                return (EAttribute)mdWrapTypeEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdWrapType_MDTYPEVERSION() {
                return (EAttribute)mdWrapTypeEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdWrapType_MIMETYPE() {
                return (EAttribute)mdWrapTypeEClass.getEStructuralFeatures().get(9);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdWrapType_OTHERMDTYPE() {
                return (EAttribute)mdWrapTypeEClass.getEStructuralFeatures().get(10);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMdWrapType_SIZE() {
                return (EAttribute)mdWrapTypeEClass.getEStructuralFeatures().get(11);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMetsDocumentIDType() {
                return metsDocumentIDTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMetsDocumentIDType_Value() {
                return (EAttribute)metsDocumentIDTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMetsDocumentIDType_ID() {
                return (EAttribute)metsDocumentIDTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMetsDocumentIDType_TYPE() {
                return (EAttribute)metsDocumentIDTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMetsHdrType() {
                return metsHdrTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMetsHdrType_Agent() {
                return (EReference)metsHdrTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMetsHdrType_AltRecordID() {
                return (EReference)metsHdrTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMetsHdrType_MetsDocumentID() {
                return (EReference)metsHdrTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMetsHdrType_ADMID() {
                return (EAttribute)metsHdrTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMetsHdrType_CREATEDATE() {
                return (EAttribute)metsHdrTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMetsHdrType_ID() {
                return (EAttribute)metsHdrTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMetsHdrType_LASTMODDATE() {
                return (EAttribute)metsHdrTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMetsHdrType_RECORDSTATUS() {
                return (EAttribute)metsHdrTypeEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMetsType() {
                return metsTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMetsType_MetsHdr() {
                return (EReference)metsTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMetsType_DmdSec() {
                return (EReference)metsTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMetsType_AmdSec() {
                return (EReference)metsTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMetsType_FileSec() {
                return (EReference)metsTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMetsType_StructMap() {
                return (EReference)metsTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMetsType_StructLink() {
                return (EReference)metsTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMetsType_BehaviorSec() {
                return (EReference)metsTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMetsType_ID() {
                return (EAttribute)metsTypeEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMetsType_LABEL() {
                return (EAttribute)metsTypeEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMetsType_OBJID() {
                return (EAttribute)metsTypeEClass.getEStructuralFeatures().get(9);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMetsType_PROFILE() {
                return (EAttribute)metsTypeEClass.getEStructuralFeatures().get(10);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMetsType_TYPE() {
                return (EAttribute)metsTypeEClass.getEStructuralFeatures().get(11);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMetsType1() {
                return metsType1EClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMptrType() {
                return mptrTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMptrType_Actuate() {
                return (EAttribute)mptrTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMptrType_Arcrole() {
                return (EAttribute)mptrTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMptrType_CONTENTIDS() {
                return (EAttribute)mptrTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMptrType_Href() {
                return (EAttribute)mptrTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMptrType_ID() {
                return (EAttribute)mptrTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMptrType_LOCTYPE() {
                return (EAttribute)mptrTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMptrType_OTHERLOCTYPE() {
                return (EAttribute)mptrTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMptrType_Role() {
                return (EAttribute)mptrTypeEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMptrType_Show() {
                return (EAttribute)mptrTypeEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMptrType_Title() {
                return (EAttribute)mptrTypeEClass.getEStructuralFeatures().get(9);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMptrType_Type() {
                return (EAttribute)mptrTypeEClass.getEStructuralFeatures().get(10);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getObjectType() {
                return objectTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getObjectType_Actuate() {
                return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getObjectType_Arcrole() {
                return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getObjectType_Href() {
                return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getObjectType_ID() {
                return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getObjectType_LABEL() {
                return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getObjectType_LOCTYPE() {
                return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getObjectType_OTHERLOCTYPE() {
                return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getObjectType_Role() {
                return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getObjectType_Show() {
                return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getObjectType_Title() {
                return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(9);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getObjectType_Type() {
                return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(10);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getParType() {
                return parTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParType_Group() {
                return (EAttribute)parTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getParType_Area() {
                return (EReference)parTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getParType_Seq() {
                return (EReference)parTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getParType_ID() {
                return (EAttribute)parTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSeqType() {
                return seqTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSeqType_Group() {
                return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getSeqType_Area() {
                return (EReference)seqTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getSeqType_Par() {
                return (EReference)seqTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSeqType_ID() {
                return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSmArcLinkType() {
                return smArcLinkTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmArcLinkType_Actuate() {
                return (EAttribute)smArcLinkTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmArcLinkType_ADMID() {
                return (EAttribute)smArcLinkTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmArcLinkType_Arcrole() {
                return (EAttribute)smArcLinkTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmArcLinkType_ARCTYPE() {
                return (EAttribute)smArcLinkTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmArcLinkType_From() {
                return (EAttribute)smArcLinkTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmArcLinkType_ID() {
                return (EAttribute)smArcLinkTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmArcLinkType_Show() {
                return (EAttribute)smArcLinkTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmArcLinkType_Title() {
                return (EAttribute)smArcLinkTypeEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmArcLinkType_To() {
                return (EAttribute)smArcLinkTypeEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmArcLinkType_Type() {
                return (EAttribute)smArcLinkTypeEClass.getEStructuralFeatures().get(9);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSmLinkGrpType() {
                return smLinkGrpTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getSmLinkGrpType_SmLocatorLink() {
                return (EReference)smLinkGrpTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getSmLinkGrpType_SmArcLink() {
                return (EReference)smLinkGrpTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLinkGrpType_ARCLINKORDER() {
                return (EAttribute)smLinkGrpTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLinkGrpType_ID() {
                return (EAttribute)smLinkGrpTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLinkGrpType_Role() {
                return (EAttribute)smLinkGrpTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLinkGrpType_Title() {
                return (EAttribute)smLinkGrpTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLinkGrpType_Type() {
                return (EAttribute)smLinkGrpTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSmLinkType() {
                return smLinkTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLinkType_Actuate() {
                return (EAttribute)smLinkTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLinkType_Arcrole() {
                return (EAttribute)smLinkTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLinkType_From() {
                return (EAttribute)smLinkTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLinkType_ID() {
                return (EAttribute)smLinkTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLinkType_Show() {
                return (EAttribute)smLinkTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLinkType_Title() {
                return (EAttribute)smLinkTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLinkType_To() {
                return (EAttribute)smLinkTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSmLocatorLinkType() {
                return smLocatorLinkTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLocatorLinkType_Href() {
                return (EAttribute)smLocatorLinkTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLocatorLinkType_ID() {
                return (EAttribute)smLocatorLinkTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLocatorLinkType_Label() {
                return (EAttribute)smLocatorLinkTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLocatorLinkType_Role() {
                return (EAttribute)smLocatorLinkTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLocatorLinkType_Title() {
                return (EAttribute)smLocatorLinkTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSmLocatorLinkType_Type() {
                return (EAttribute)smLocatorLinkTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getStreamType() {
                return streamTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStreamType_ADMID() {
                return (EAttribute)streamTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStreamType_BEGIN() {
                return (EAttribute)streamTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStreamType_BETYPE() {
                return (EAttribute)streamTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStreamType_DMDID() {
                return (EAttribute)streamTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStreamType_END() {
                return (EAttribute)streamTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStreamType_ID() {
                return (EAttribute)streamTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStreamType_OWNERID() {
                return (EAttribute)streamTypeEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStreamType_StreamType() {
                return (EAttribute)streamTypeEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getStructLinkType() {
                return structLinkTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStructLinkType_Group() {
                return (EAttribute)structLinkTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getStructLinkType_SmLink() {
                return (EReference)structLinkTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getStructLinkType_SmLinkGrp() {
                return (EReference)structLinkTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStructLinkType_ID() {
                return (EAttribute)structLinkTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getStructLinkType1() {
                return structLinkType1EClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getStructMapType() {
                return structMapTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getStructMapType_Div() {
                return (EReference)structMapTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStructMapType_ID() {
                return (EAttribute)structMapTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStructMapType_LABEL() {
                return (EAttribute)structMapTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStructMapType_TYPE() {
                return (EAttribute)structMapTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getTransformFileType() {
                return transformFileTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTransformFileType_ID() {
                return (EAttribute)transformFileTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTransformFileType_TRANSFORMALGORITHM() {
                return (EAttribute)transformFileTypeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTransformFileType_TRANSFORMBEHAVIOR() {
                return (EAttribute)transformFileTypeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTransformFileType_TRANSFORMKEY() {
                return (EAttribute)transformFileTypeEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTransformFileType_TRANSFORMORDER() {
                return (EAttribute)transformFileTypeEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTransformFileType_TRANSFORMTYPE() {
                return (EAttribute)transformFileTypeEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getXmlDataType() {
                return xmlDataTypeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getXmlDataType_Any() {
                return (EAttribute)xmlDataTypeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getXmlDataType1() {
                return xmlDataType1EClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getXmlDataType1_Any() {
                return (EAttribute)xmlDataType1EClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getARCLINKORDERType() {
                return arclinkorderTypeEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getBETYPEType() {
                return betypeTypeEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getBETYPEType1() {
                return betypeType1EEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getBETYPEType2() {
                return betypeType2EEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getCHECKSUMTYPEType() {
                return checksumtypeTypeEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getEXTTYPEType() {
                return exttypeTypeEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getLOCTYPEType() {
                return loctypeTypeEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getMDTYPEType() {
                return mdtypeTypeEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getROLEType() {
                return roleTypeEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getSHAPEType() {
                return shapeTypeEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getTRANSFORMTYPEType() {
                return transformtypeTypeEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getTYPEType() {
                return typeTypeEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getARCLINKORDERTypeObject() {
                return arclinkorderTypeObjectEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getBETYPETypeObject() {
                return betypeTypeObjectEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getBETYPETypeObject1() {
                return betypeTypeObject1EDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getBETYPETypeObject2() {
                return betypeTypeObject2EDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getCHECKSUMTYPETypeObject() {
                return checksumtypeTypeObjectEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getEXTTYPETypeObject() {
                return exttypeTypeObjectEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getLOCTYPETypeObject() {
                return loctypeTypeObjectEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getMDTYPETypeObject() {
                return mdtypeTypeObjectEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getROLETypeObject() {
                return roleTypeObjectEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getSHAPETypeObject() {
                return shapeTypeObjectEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getTRANSFORMTYPETypeObject() {
                return transformtypeTypeObjectEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getTYPETypeObject() {
                return typeTypeObjectEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getURIs() {
                return urIsEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MetsFactory getMetsFactory() {
                return (MetsFactory)getEFactoryInstance();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private boolean isCreated = false;

        /**
         * Creates the meta-model objects for the package.  This method is
         * guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void createPackageContents() {
                if (isCreated) return;
                isCreated = true;

                // Create classes and their features
                agentTypeEClass = createEClass(AGENT_TYPE);
                createEAttribute(agentTypeEClass, AGENT_TYPE__NAME);
                createEAttribute(agentTypeEClass, AGENT_TYPE__NOTE);
                createEAttribute(agentTypeEClass, AGENT_TYPE__ID);
                createEAttribute(agentTypeEClass, AGENT_TYPE__OTHERROLE);
                createEAttribute(agentTypeEClass, AGENT_TYPE__OTHERTYPE);
                createEAttribute(agentTypeEClass, AGENT_TYPE__ROLE);
                createEAttribute(agentTypeEClass, AGENT_TYPE__TYPE);

                altRecordIDTypeEClass = createEClass(ALT_RECORD_ID_TYPE);
                createEAttribute(altRecordIDTypeEClass, ALT_RECORD_ID_TYPE__VALUE);
                createEAttribute(altRecordIDTypeEClass, ALT_RECORD_ID_TYPE__ID);
                createEAttribute(altRecordIDTypeEClass, ALT_RECORD_ID_TYPE__TYPE);

                amdSecTypeEClass = createEClass(AMD_SEC_TYPE);
                createEReference(amdSecTypeEClass, AMD_SEC_TYPE__TECH_MD);
                createEReference(amdSecTypeEClass, AMD_SEC_TYPE__RIGHTS_MD);
                createEReference(amdSecTypeEClass, AMD_SEC_TYPE__SOURCE_MD);
                createEReference(amdSecTypeEClass, AMD_SEC_TYPE__DIGIPROV_MD);
                createEAttribute(amdSecTypeEClass, AMD_SEC_TYPE__ID);

                areaTypeEClass = createEClass(AREA_TYPE);
                createEAttribute(areaTypeEClass, AREA_TYPE__ADMID);
                createEAttribute(areaTypeEClass, AREA_TYPE__BEGIN);
                createEAttribute(areaTypeEClass, AREA_TYPE__BETYPE);
                createEAttribute(areaTypeEClass, AREA_TYPE__CONTENTIDS);
                createEAttribute(areaTypeEClass, AREA_TYPE__COORDS);
                createEAttribute(areaTypeEClass, AREA_TYPE__END);
                createEAttribute(areaTypeEClass, AREA_TYPE__EXTENT);
                createEAttribute(areaTypeEClass, AREA_TYPE__EXTTYPE);
                createEAttribute(areaTypeEClass, AREA_TYPE__FILEID);
                createEAttribute(areaTypeEClass, AREA_TYPE__ID);
                createEAttribute(areaTypeEClass, AREA_TYPE__SHAPE);

                behaviorSecTypeEClass = createEClass(BEHAVIOR_SEC_TYPE);
                createEReference(behaviorSecTypeEClass, BEHAVIOR_SEC_TYPE__BEHAVIOR_SEC);
                createEReference(behaviorSecTypeEClass, BEHAVIOR_SEC_TYPE__BEHAVIOR);
                createEAttribute(behaviorSecTypeEClass, BEHAVIOR_SEC_TYPE__CREATED);
                createEAttribute(behaviorSecTypeEClass, BEHAVIOR_SEC_TYPE__ID);
                createEAttribute(behaviorSecTypeEClass, BEHAVIOR_SEC_TYPE__LABEL);

                behaviorTypeEClass = createEClass(BEHAVIOR_TYPE);
                createEReference(behaviorTypeEClass, BEHAVIOR_TYPE__INTERFACE_DEF);
                createEReference(behaviorTypeEClass, BEHAVIOR_TYPE__MECHANISM);
                createEAttribute(behaviorTypeEClass, BEHAVIOR_TYPE__ADMID);
                createEAttribute(behaviorTypeEClass, BEHAVIOR_TYPE__BTYPE);
                createEAttribute(behaviorTypeEClass, BEHAVIOR_TYPE__CREATED);
                createEAttribute(behaviorTypeEClass, BEHAVIOR_TYPE__GROUPID);
                createEAttribute(behaviorTypeEClass, BEHAVIOR_TYPE__ID);
                createEAttribute(behaviorTypeEClass, BEHAVIOR_TYPE__LABEL);
                createEAttribute(behaviorTypeEClass, BEHAVIOR_TYPE__STRUCTID);

                divTypeEClass = createEClass(DIV_TYPE);
                createEReference(divTypeEClass, DIV_TYPE__MPTR);
                createEReference(divTypeEClass, DIV_TYPE__FPTR);
                createEReference(divTypeEClass, DIV_TYPE__DIV);
                createEReference(divTypeEClass, DIV_TYPE__AMD_SEC);
                createEAttribute(divTypeEClass, DIV_TYPE__CONTENTIDS);
                createEReference(divTypeEClass, DIV_TYPE__DMD_SEC);
                createEAttribute(divTypeEClass, DIV_TYPE__ID);
                createEAttribute(divTypeEClass, DIV_TYPE__LABEL);
                createEAttribute(divTypeEClass, DIV_TYPE__LABEL1);
                createEAttribute(divTypeEClass, DIV_TYPE__ORDER);
                createEAttribute(divTypeEClass, DIV_TYPE__ORDERLABEL);
                createEAttribute(divTypeEClass, DIV_TYPE__TYPE);

                documentRootEClass = createEClass(DOCUMENT_ROOT);
                createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
                createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
                createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
                createEReference(documentRootEClass, DOCUMENT_ROOT__METS);

                fContentTypeEClass = createEClass(FCONTENT_TYPE);
                createEAttribute(fContentTypeEClass, FCONTENT_TYPE__BIN_DATA);
                createEReference(fContentTypeEClass, FCONTENT_TYPE__XML_DATA);
                createEAttribute(fContentTypeEClass, FCONTENT_TYPE__ID);
                createEAttribute(fContentTypeEClass, FCONTENT_TYPE__USE);

                fileGrpTypeEClass = createEClass(FILE_GRP_TYPE);
                createEReference(fileGrpTypeEClass, FILE_GRP_TYPE__FILE_GRP);
                createEReference(fileGrpTypeEClass, FILE_GRP_TYPE__FILE);
                createEAttribute(fileGrpTypeEClass, FILE_GRP_TYPE__ADMID);
                createEAttribute(fileGrpTypeEClass, FILE_GRP_TYPE__ID);
                createEAttribute(fileGrpTypeEClass, FILE_GRP_TYPE__USE);
                createEAttribute(fileGrpTypeEClass, FILE_GRP_TYPE__VERSDATE);

                fileGrpType1EClass = createEClass(FILE_GRP_TYPE1);

                fileSecTypeEClass = createEClass(FILE_SEC_TYPE);
                createEReference(fileSecTypeEClass, FILE_SEC_TYPE__FILE_GRP);
                createEAttribute(fileSecTypeEClass, FILE_SEC_TYPE__ID);

                fileTypeEClass = createEClass(FILE_TYPE);
                createEReference(fileTypeEClass, FILE_TYPE__FLOCAT);
                createEReference(fileTypeEClass, FILE_TYPE__FCONTENT);
                createEReference(fileTypeEClass, FILE_TYPE__STREAM);
                createEReference(fileTypeEClass, FILE_TYPE__TRANSFORM_FILE);
                createEReference(fileTypeEClass, FILE_TYPE__FILE);
                createEAttribute(fileTypeEClass, FILE_TYPE__ADMID);
                createEAttribute(fileTypeEClass, FILE_TYPE__BEGIN);
                createEAttribute(fileTypeEClass, FILE_TYPE__BETYPE);
                createEAttribute(fileTypeEClass, FILE_TYPE__CHECKSUM);
                createEAttribute(fileTypeEClass, FILE_TYPE__CHECKSUMTYPE);
                createEAttribute(fileTypeEClass, FILE_TYPE__CREATED);
                createEAttribute(fileTypeEClass, FILE_TYPE__DMDID);
                createEAttribute(fileTypeEClass, FILE_TYPE__END);
                createEAttribute(fileTypeEClass, FILE_TYPE__GROUPID);
                createEAttribute(fileTypeEClass, FILE_TYPE__ID);
                createEAttribute(fileTypeEClass, FILE_TYPE__MIMETYPE);
                createEAttribute(fileTypeEClass, FILE_TYPE__OWNERID);
                createEAttribute(fileTypeEClass, FILE_TYPE__SEQ);
                createEAttribute(fileTypeEClass, FILE_TYPE__SIZE);
                createEAttribute(fileTypeEClass, FILE_TYPE__USE);

                fLocatTypeEClass = createEClass(FLOCAT_TYPE);
                createEAttribute(fLocatTypeEClass, FLOCAT_TYPE__ACTUATE);
                createEAttribute(fLocatTypeEClass, FLOCAT_TYPE__ARCROLE);
                createEAttribute(fLocatTypeEClass, FLOCAT_TYPE__HREF);
                createEAttribute(fLocatTypeEClass, FLOCAT_TYPE__ID);
                createEAttribute(fLocatTypeEClass, FLOCAT_TYPE__LOCTYPE);
                createEAttribute(fLocatTypeEClass, FLOCAT_TYPE__OTHERLOCTYPE);
                createEAttribute(fLocatTypeEClass, FLOCAT_TYPE__ROLE);
                createEAttribute(fLocatTypeEClass, FLOCAT_TYPE__SHOW);
                createEAttribute(fLocatTypeEClass, FLOCAT_TYPE__TITLE);
                createEAttribute(fLocatTypeEClass, FLOCAT_TYPE__TYPE);
                createEAttribute(fLocatTypeEClass, FLOCAT_TYPE__USE);

                fptrTypeEClass = createEClass(FPTR_TYPE);
                createEReference(fptrTypeEClass, FPTR_TYPE__PAR);
                createEReference(fptrTypeEClass, FPTR_TYPE__SEQ);
                createEReference(fptrTypeEClass, FPTR_TYPE__AREA);
                createEAttribute(fptrTypeEClass, FPTR_TYPE__CONTENTIDS);
                createEAttribute(fptrTypeEClass, FPTR_TYPE__FILEID);
                createEAttribute(fptrTypeEClass, FPTR_TYPE__ID);

                mdRefTypeEClass = createEClass(MD_REF_TYPE);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__ACTUATE);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__ARCROLE);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__CHECKSUM);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__CHECKSUMTYPE);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__CREATED);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__HREF);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__ID);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__LABEL);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__LOCTYPE);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__MDTYPE);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__MDTYPEVERSION);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__MIMETYPE);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__OTHERLOCTYPE);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__OTHERMDTYPE);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__ROLE);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__SHOW);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__SIZE);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__TITLE);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__TYPE);
                createEAttribute(mdRefTypeEClass, MD_REF_TYPE__XPTR);

                mdSecTypeEClass = createEClass(MD_SEC_TYPE);
                createEReference(mdSecTypeEClass, MD_SEC_TYPE__MD_REF);
                createEReference(mdSecTypeEClass, MD_SEC_TYPE__MD_WRAP);
                createEAttribute(mdSecTypeEClass, MD_SEC_TYPE__ADMID);
                createEAttribute(mdSecTypeEClass, MD_SEC_TYPE__CREATED);
                createEAttribute(mdSecTypeEClass, MD_SEC_TYPE__GROUPID);
                createEAttribute(mdSecTypeEClass, MD_SEC_TYPE__ID);
                createEAttribute(mdSecTypeEClass, MD_SEC_TYPE__STATUS);

                mdWrapTypeEClass = createEClass(MD_WRAP_TYPE);
                createEAttribute(mdWrapTypeEClass, MD_WRAP_TYPE__BIN_DATA);
                createEReference(mdWrapTypeEClass, MD_WRAP_TYPE__XML_DATA);
                createEAttribute(mdWrapTypeEClass, MD_WRAP_TYPE__CHECKSUM);
                createEAttribute(mdWrapTypeEClass, MD_WRAP_TYPE__CHECKSUMTYPE);
                createEAttribute(mdWrapTypeEClass, MD_WRAP_TYPE__CREATED);
                createEAttribute(mdWrapTypeEClass, MD_WRAP_TYPE__ID);
                createEAttribute(mdWrapTypeEClass, MD_WRAP_TYPE__LABEL);
                createEAttribute(mdWrapTypeEClass, MD_WRAP_TYPE__MDTYPE);
                createEAttribute(mdWrapTypeEClass, MD_WRAP_TYPE__MDTYPEVERSION);
                createEAttribute(mdWrapTypeEClass, MD_WRAP_TYPE__MIMETYPE);
                createEAttribute(mdWrapTypeEClass, MD_WRAP_TYPE__OTHERMDTYPE);
                createEAttribute(mdWrapTypeEClass, MD_WRAP_TYPE__SIZE);

                metsDocumentIDTypeEClass = createEClass(METS_DOCUMENT_ID_TYPE);
                createEAttribute(metsDocumentIDTypeEClass, METS_DOCUMENT_ID_TYPE__VALUE);
                createEAttribute(metsDocumentIDTypeEClass, METS_DOCUMENT_ID_TYPE__ID);
                createEAttribute(metsDocumentIDTypeEClass, METS_DOCUMENT_ID_TYPE__TYPE);

                metsHdrTypeEClass = createEClass(METS_HDR_TYPE);
                createEReference(metsHdrTypeEClass, METS_HDR_TYPE__AGENT);
                createEReference(metsHdrTypeEClass, METS_HDR_TYPE__ALT_RECORD_ID);
                createEReference(metsHdrTypeEClass, METS_HDR_TYPE__METS_DOCUMENT_ID);
                createEAttribute(metsHdrTypeEClass, METS_HDR_TYPE__ADMID);
                createEAttribute(metsHdrTypeEClass, METS_HDR_TYPE__CREATEDATE);
                createEAttribute(metsHdrTypeEClass, METS_HDR_TYPE__ID);
                createEAttribute(metsHdrTypeEClass, METS_HDR_TYPE__LASTMODDATE);
                createEAttribute(metsHdrTypeEClass, METS_HDR_TYPE__RECORDSTATUS);

                metsTypeEClass = createEClass(METS_TYPE);
                createEReference(metsTypeEClass, METS_TYPE__METS_HDR);
                createEReference(metsTypeEClass, METS_TYPE__DMD_SEC);
                createEReference(metsTypeEClass, METS_TYPE__AMD_SEC);
                createEReference(metsTypeEClass, METS_TYPE__FILE_SEC);
                createEReference(metsTypeEClass, METS_TYPE__STRUCT_MAP);
                createEReference(metsTypeEClass, METS_TYPE__STRUCT_LINK);
                createEReference(metsTypeEClass, METS_TYPE__BEHAVIOR_SEC);
                createEAttribute(metsTypeEClass, METS_TYPE__ID);
                createEAttribute(metsTypeEClass, METS_TYPE__LABEL);
                createEAttribute(metsTypeEClass, METS_TYPE__OBJID);
                createEAttribute(metsTypeEClass, METS_TYPE__PROFILE);
                createEAttribute(metsTypeEClass, METS_TYPE__TYPE);

                metsType1EClass = createEClass(METS_TYPE1);

                mptrTypeEClass = createEClass(MPTR_TYPE);
                createEAttribute(mptrTypeEClass, MPTR_TYPE__ACTUATE);
                createEAttribute(mptrTypeEClass, MPTR_TYPE__ARCROLE);
                createEAttribute(mptrTypeEClass, MPTR_TYPE__CONTENTIDS);
                createEAttribute(mptrTypeEClass, MPTR_TYPE__HREF);
                createEAttribute(mptrTypeEClass, MPTR_TYPE__ID);
                createEAttribute(mptrTypeEClass, MPTR_TYPE__LOCTYPE);
                createEAttribute(mptrTypeEClass, MPTR_TYPE__OTHERLOCTYPE);
                createEAttribute(mptrTypeEClass, MPTR_TYPE__ROLE);
                createEAttribute(mptrTypeEClass, MPTR_TYPE__SHOW);
                createEAttribute(mptrTypeEClass, MPTR_TYPE__TITLE);
                createEAttribute(mptrTypeEClass, MPTR_TYPE__TYPE);

                objectTypeEClass = createEClass(OBJECT_TYPE);
                createEAttribute(objectTypeEClass, OBJECT_TYPE__ACTUATE);
                createEAttribute(objectTypeEClass, OBJECT_TYPE__ARCROLE);
                createEAttribute(objectTypeEClass, OBJECT_TYPE__HREF);
                createEAttribute(objectTypeEClass, OBJECT_TYPE__ID);
                createEAttribute(objectTypeEClass, OBJECT_TYPE__LABEL);
                createEAttribute(objectTypeEClass, OBJECT_TYPE__LOCTYPE);
                createEAttribute(objectTypeEClass, OBJECT_TYPE__OTHERLOCTYPE);
                createEAttribute(objectTypeEClass, OBJECT_TYPE__ROLE);
                createEAttribute(objectTypeEClass, OBJECT_TYPE__SHOW);
                createEAttribute(objectTypeEClass, OBJECT_TYPE__TITLE);
                createEAttribute(objectTypeEClass, OBJECT_TYPE__TYPE);

                parTypeEClass = createEClass(PAR_TYPE);
                createEAttribute(parTypeEClass, PAR_TYPE__GROUP);
                createEReference(parTypeEClass, PAR_TYPE__AREA);
                createEReference(parTypeEClass, PAR_TYPE__SEQ);
                createEAttribute(parTypeEClass, PAR_TYPE__ID);

                seqTypeEClass = createEClass(SEQ_TYPE);
                createEAttribute(seqTypeEClass, SEQ_TYPE__GROUP);
                createEReference(seqTypeEClass, SEQ_TYPE__AREA);
                createEReference(seqTypeEClass, SEQ_TYPE__PAR);
                createEAttribute(seqTypeEClass, SEQ_TYPE__ID);

                smArcLinkTypeEClass = createEClass(SM_ARC_LINK_TYPE);
                createEAttribute(smArcLinkTypeEClass, SM_ARC_LINK_TYPE__ACTUATE);
                createEAttribute(smArcLinkTypeEClass, SM_ARC_LINK_TYPE__ADMID);
                createEAttribute(smArcLinkTypeEClass, SM_ARC_LINK_TYPE__ARCROLE);
                createEAttribute(smArcLinkTypeEClass, SM_ARC_LINK_TYPE__ARCTYPE);
                createEAttribute(smArcLinkTypeEClass, SM_ARC_LINK_TYPE__FROM);
                createEAttribute(smArcLinkTypeEClass, SM_ARC_LINK_TYPE__ID);
                createEAttribute(smArcLinkTypeEClass, SM_ARC_LINK_TYPE__SHOW);
                createEAttribute(smArcLinkTypeEClass, SM_ARC_LINK_TYPE__TITLE);
                createEAttribute(smArcLinkTypeEClass, SM_ARC_LINK_TYPE__TO);
                createEAttribute(smArcLinkTypeEClass, SM_ARC_LINK_TYPE__TYPE);

                smLinkGrpTypeEClass = createEClass(SM_LINK_GRP_TYPE);
                createEReference(smLinkGrpTypeEClass, SM_LINK_GRP_TYPE__SM_LOCATOR_LINK);
                createEReference(smLinkGrpTypeEClass, SM_LINK_GRP_TYPE__SM_ARC_LINK);
                createEAttribute(smLinkGrpTypeEClass, SM_LINK_GRP_TYPE__ARCLINKORDER);
                createEAttribute(smLinkGrpTypeEClass, SM_LINK_GRP_TYPE__ID);
                createEAttribute(smLinkGrpTypeEClass, SM_LINK_GRP_TYPE__ROLE);
                createEAttribute(smLinkGrpTypeEClass, SM_LINK_GRP_TYPE__TITLE);
                createEAttribute(smLinkGrpTypeEClass, SM_LINK_GRP_TYPE__TYPE);

                smLinkTypeEClass = createEClass(SM_LINK_TYPE);
                createEAttribute(smLinkTypeEClass, SM_LINK_TYPE__ACTUATE);
                createEAttribute(smLinkTypeEClass, SM_LINK_TYPE__ARCROLE);
                createEAttribute(smLinkTypeEClass, SM_LINK_TYPE__FROM);
                createEAttribute(smLinkTypeEClass, SM_LINK_TYPE__ID);
                createEAttribute(smLinkTypeEClass, SM_LINK_TYPE__SHOW);
                createEAttribute(smLinkTypeEClass, SM_LINK_TYPE__TITLE);
                createEAttribute(smLinkTypeEClass, SM_LINK_TYPE__TO);

                smLocatorLinkTypeEClass = createEClass(SM_LOCATOR_LINK_TYPE);
                createEAttribute(smLocatorLinkTypeEClass, SM_LOCATOR_LINK_TYPE__HREF);
                createEAttribute(smLocatorLinkTypeEClass, SM_LOCATOR_LINK_TYPE__ID);
                createEAttribute(smLocatorLinkTypeEClass, SM_LOCATOR_LINK_TYPE__LABEL);
                createEAttribute(smLocatorLinkTypeEClass, SM_LOCATOR_LINK_TYPE__ROLE);
                createEAttribute(smLocatorLinkTypeEClass, SM_LOCATOR_LINK_TYPE__TITLE);
                createEAttribute(smLocatorLinkTypeEClass, SM_LOCATOR_LINK_TYPE__TYPE);

                streamTypeEClass = createEClass(STREAM_TYPE);
                createEAttribute(streamTypeEClass, STREAM_TYPE__ADMID);
                createEAttribute(streamTypeEClass, STREAM_TYPE__BEGIN);
                createEAttribute(streamTypeEClass, STREAM_TYPE__BETYPE);
                createEAttribute(streamTypeEClass, STREAM_TYPE__DMDID);
                createEAttribute(streamTypeEClass, STREAM_TYPE__END);
                createEAttribute(streamTypeEClass, STREAM_TYPE__ID);
                createEAttribute(streamTypeEClass, STREAM_TYPE__OWNERID);
                createEAttribute(streamTypeEClass, STREAM_TYPE__STREAM_TYPE);

                structLinkTypeEClass = createEClass(STRUCT_LINK_TYPE);
                createEAttribute(structLinkTypeEClass, STRUCT_LINK_TYPE__GROUP);
                createEReference(structLinkTypeEClass, STRUCT_LINK_TYPE__SM_LINK);
                createEReference(structLinkTypeEClass, STRUCT_LINK_TYPE__SM_LINK_GRP);
                createEAttribute(structLinkTypeEClass, STRUCT_LINK_TYPE__ID);

                structLinkType1EClass = createEClass(STRUCT_LINK_TYPE1);

                structMapTypeEClass = createEClass(STRUCT_MAP_TYPE);
                createEReference(structMapTypeEClass, STRUCT_MAP_TYPE__DIV);
                createEAttribute(structMapTypeEClass, STRUCT_MAP_TYPE__ID);
                createEAttribute(structMapTypeEClass, STRUCT_MAP_TYPE__LABEL);
                createEAttribute(structMapTypeEClass, STRUCT_MAP_TYPE__TYPE);

                transformFileTypeEClass = createEClass(TRANSFORM_FILE_TYPE);
                createEAttribute(transformFileTypeEClass, TRANSFORM_FILE_TYPE__ID);
                createEAttribute(transformFileTypeEClass, TRANSFORM_FILE_TYPE__TRANSFORMALGORITHM);
                createEAttribute(transformFileTypeEClass, TRANSFORM_FILE_TYPE__TRANSFORMBEHAVIOR);
                createEAttribute(transformFileTypeEClass, TRANSFORM_FILE_TYPE__TRANSFORMKEY);
                createEAttribute(transformFileTypeEClass, TRANSFORM_FILE_TYPE__TRANSFORMORDER);
                createEAttribute(transformFileTypeEClass, TRANSFORM_FILE_TYPE__TRANSFORMTYPE);

                xmlDataTypeEClass = createEClass(XML_DATA_TYPE);
                createEAttribute(xmlDataTypeEClass, XML_DATA_TYPE__ANY);

                xmlDataType1EClass = createEClass(XML_DATA_TYPE1);
                createEAttribute(xmlDataType1EClass, XML_DATA_TYPE1__ANY);

                // Create enums
                arclinkorderTypeEEnum = createEEnum(ARCLINKORDER_TYPE);
                betypeTypeEEnum = createEEnum(BETYPE_TYPE);
                betypeType1EEnum = createEEnum(BETYPE_TYPE1);
                betypeType2EEnum = createEEnum(BETYPE_TYPE2);
                checksumtypeTypeEEnum = createEEnum(CHECKSUMTYPE_TYPE);
                exttypeTypeEEnum = createEEnum(EXTTYPE_TYPE);
                loctypeTypeEEnum = createEEnum(LOCTYPE_TYPE);
                mdtypeTypeEEnum = createEEnum(MDTYPE_TYPE);
                roleTypeEEnum = createEEnum(ROLE_TYPE);
                shapeTypeEEnum = createEEnum(SHAPE_TYPE);
                transformtypeTypeEEnum = createEEnum(TRANSFORMTYPE_TYPE);
                typeTypeEEnum = createEEnum(TYPE_TYPE);

                // Create data types
                arclinkorderTypeObjectEDataType = createEDataType(ARCLINKORDER_TYPE_OBJECT);
                betypeTypeObjectEDataType = createEDataType(BETYPE_TYPE_OBJECT);
                betypeTypeObject1EDataType = createEDataType(BETYPE_TYPE_OBJECT1);
                betypeTypeObject2EDataType = createEDataType(BETYPE_TYPE_OBJECT2);
                checksumtypeTypeObjectEDataType = createEDataType(CHECKSUMTYPE_TYPE_OBJECT);
                exttypeTypeObjectEDataType = createEDataType(EXTTYPE_TYPE_OBJECT);
                loctypeTypeObjectEDataType = createEDataType(LOCTYPE_TYPE_OBJECT);
                mdtypeTypeObjectEDataType = createEDataType(MDTYPE_TYPE_OBJECT);
                roleTypeObjectEDataType = createEDataType(ROLE_TYPE_OBJECT);
                shapeTypeObjectEDataType = createEDataType(SHAPE_TYPE_OBJECT);
                transformtypeTypeObjectEDataType = createEDataType(TRANSFORMTYPE_TYPE_OBJECT);
                typeTypeObjectEDataType = createEDataType(TYPE_TYPE_OBJECT);
                urIsEDataType = createEDataType(UR_IS);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private boolean isInitialized = false;

        /**
         * Complete the initialization of the package and its meta-model.  This
         * method is guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void initializePackageContents() {
                if (isInitialized) return;
                isInitialized = true;

                // Initialize package
                setName(eNAME);
                setNsPrefix(eNS_PREFIX);
                setNsURI(eNS_URI);

                // Obtain other dependent packages
                XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
                XlinkPackage theXlinkPackage = (XlinkPackage)EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI);

                // Create type parameters

                // Set bounds for type parameters

                // Add supertypes to classes
                fileGrpType1EClass.getESuperTypes().add(this.getFileGrpType());
                metsType1EClass.getESuperTypes().add(this.getMetsType());
                structLinkType1EClass.getESuperTypes().add(this.getStructLinkType());

                // Initialize classes and features; add operations and parameters
                initEClass(agentTypeEClass, AgentType.class, "AgentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getAgentType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AgentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAgentType_Note(), theXMLTypePackage.getString(), "note", null, 0, -1, AgentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAgentType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, AgentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAgentType_OTHERROLE(), theXMLTypePackage.getString(), "oTHERROLE", null, 0, 1, AgentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAgentType_OTHERTYPE(), theXMLTypePackage.getString(), "oTHERTYPE", null, 0, 1, AgentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAgentType_ROLE(), this.getROLEType(), "rOLE", null, 1, 1, AgentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAgentType_TYPE(), this.getTYPEType(), "tYPE", null, 0, 1, AgentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(altRecordIDTypeEClass, AltRecordIDType.class, "AltRecordIDType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getAltRecordIDType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, AltRecordIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAltRecordIDType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, AltRecordIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAltRecordIDType_TYPE(), theXMLTypePackage.getString(), "tYPE", null, 0, 1, AltRecordIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(amdSecTypeEClass, AmdSecType.class, "AmdSecType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getAmdSecType_TechMD(), this.getMdSecType(), null, "techMD", null, 0, -1, AmdSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getAmdSecType_RightsMD(), this.getMdSecType(), null, "rightsMD", null, 0, -1, AmdSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getAmdSecType_SourceMD(), this.getMdSecType(), null, "sourceMD", null, 0, -1, AmdSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getAmdSecType_DigiprovMD(), this.getMdSecType(), null, "digiprovMD", null, 0, -1, AmdSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAmdSecType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, AmdSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(areaTypeEClass, AreaType.class, "AreaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getAreaType_ADMID(), theXMLTypePackage.getIDREFS(), "aDMID", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAreaType_BEGIN(), theXMLTypePackage.getString(), "bEGIN", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAreaType_BETYPE(), this.getBETYPEType(), "bETYPE", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAreaType_CONTENTIDS(), this.getURIs(), "cONTENTIDS", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAreaType_COORDS(), theXMLTypePackage.getString(), "cOORDS", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAreaType_END(), theXMLTypePackage.getString(), "eND", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAreaType_EXTENT(), theXMLTypePackage.getString(), "eXTENT", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAreaType_EXTTYPE(), this.getEXTTYPEType(), "eXTTYPE", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAreaType_FILEID(), theXMLTypePackage.getIDREF(), "fILEID", null, 1, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAreaType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getAreaType_SHAPE(), this.getSHAPEType(), "sHAPE", null, 0, 1, AreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(behaviorSecTypeEClass, BehaviorSecType.class, "BehaviorSecType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getBehaviorSecType_BehaviorSec(), this.getBehaviorSecType(), null, "behaviorSec", null, 0, -1, BehaviorSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getBehaviorSecType_Behavior(), this.getBehaviorType(), null, "behavior", null, 0, -1, BehaviorSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getBehaviorSecType_CREATED(), theXMLTypePackage.getDateTime(), "cREATED", null, 0, 1, BehaviorSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getBehaviorSecType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, BehaviorSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getBehaviorSecType_LABEL(), theXMLTypePackage.getString(), "lABEL", null, 0, 1, BehaviorSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(behaviorTypeEClass, BehaviorType.class, "BehaviorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getBehaviorType_InterfaceDef(), this.getObjectType(), null, "interfaceDef", null, 0, 1, BehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getBehaviorType_Mechanism(), this.getObjectType(), null, "mechanism", null, 1, 1, BehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getBehaviorType_ADMID(), theXMLTypePackage.getIDREFS(), "aDMID", null, 0, 1, BehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getBehaviorType_BTYPE(), theXMLTypePackage.getString(), "bTYPE", null, 0, 1, BehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getBehaviorType_CREATED(), theXMLTypePackage.getDateTime(), "cREATED", null, 0, 1, BehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getBehaviorType_GROUPID(), theXMLTypePackage.getString(), "gROUPID", null, 0, 1, BehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getBehaviorType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, BehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getBehaviorType_LABEL(), theXMLTypePackage.getString(), "lABEL", null, 0, 1, BehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getBehaviorType_STRUCTID(), theXMLTypePackage.getIDREFS(), "sTRUCTID", null, 0, 1, BehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(divTypeEClass, DivType.class, "DivType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getDivType_Mptr(), this.getMptrType(), null, "mptr", null, 0, -1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDivType_Fptr(), this.getFptrType(), null, "fptr", null, 0, -1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDivType_Div(), this.getDivType(), null, "div", null, 0, -1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDivType_AmdSec(), this.getAmdSecType(), null, "amdSec", null, 0, -1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDivType_CONTENTIDS(), this.getURIs(), "cONTENTIDS", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDivType_DmdSec(), this.getMdSecType(), null, "dmdSec", null, 0, -1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDivType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDivType_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDivType_LABEL1(), theXMLTypePackage.getString(), "lABEL1", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDivType_ORDER(), theXMLTypePackage.getInteger(), "oRDER", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDivType_ORDERLABEL(), theXMLTypePackage.getString(), "oRDERLABEL", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDivType_TYPE(), theXMLTypePackage.getString(), "tYPE", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDocumentRoot_Mets(), this.getMetsType1(), null, "mets", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

                initEClass(fContentTypeEClass, FContentType.class, "FContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getFContentType_BinData(), theXMLTypePackage.getBase64Binary(), "binData", null, 0, 1, FContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getFContentType_XmlData(), this.getXmlDataType(), null, "xmlData", null, 0, 1, FContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFContentType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, FContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFContentType_USE(), theXMLTypePackage.getString(), "uSE", null, 0, 1, FContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(fileGrpTypeEClass, FileGrpType.class, "FileGrpType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getFileGrpType_FileGrp(), this.getFileGrpType(), null, "fileGrp", null, 0, -1, FileGrpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getFileGrpType_File(), this.getFileType(), null, "file", null, 0, -1, FileGrpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileGrpType_ADMID(), theXMLTypePackage.getIDREFS(), "aDMID", null, 0, 1, FileGrpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileGrpType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, FileGrpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileGrpType_USE(), theXMLTypePackage.getString(), "uSE", null, 0, 1, FileGrpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileGrpType_VERSDATE(), theXMLTypePackage.getDateTime(), "vERSDATE", null, 0, 1, FileGrpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(fileGrpType1EClass, FileGrpType1.class, "FileGrpType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(fileSecTypeEClass, FileSecType.class, "FileSecType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getFileSecType_FileGrp(), this.getFileGrpType1(), null, "fileGrp", null, 1, -1, FileSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileSecType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, FileSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(fileTypeEClass, FileType.class, "FileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getFileType_FLocat(), this.getFLocatType(), null, "fLocat", null, 0, -1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getFileType_FContent(), this.getFContentType(), null, "fContent", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getFileType_Stream(), this.getStreamType(), null, "stream", null, 0, -1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getFileType_TransformFile(), this.getTransformFileType(), null, "transformFile", null, 0, -1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getFileType_File(), this.getFileType(), null, "file", null, 0, -1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_ADMID(), theXMLTypePackage.getIDREFS(), "aDMID", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_BEGIN(), theXMLTypePackage.getString(), "bEGIN", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_BETYPE(), this.getBETYPEType1(), "bETYPE", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_CHECKSUM(), theXMLTypePackage.getString(), "cHECKSUM", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_CHECKSUMTYPE(), this.getCHECKSUMTYPEType(), "cHECKSUMTYPE", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_CREATED(), theXMLTypePackage.getDateTime(), "cREATED", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_DMDID(), theXMLTypePackage.getIDREFS(), "dMDID", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_END(), theXMLTypePackage.getString(), "eND", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_GROUPID(), theXMLTypePackage.getString(), "gROUPID", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_ID(), theXMLTypePackage.getID(), "iD", null, 1, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_MIMETYPE(), theXMLTypePackage.getString(), "mIMETYPE", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_OWNERID(), theXMLTypePackage.getString(), "oWNERID", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_SEQ(), theXMLTypePackage.getInt(), "sEQ", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_SIZE(), theXMLTypePackage.getLong(), "sIZE", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFileType_USE(), theXMLTypePackage.getString(), "uSE", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(fLocatTypeEClass, FLocatType.class, "FLocatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getFLocatType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, FLocatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFLocatType_Arcrole(), theXMLTypePackage.getString(), "arcrole", null, 0, 1, FLocatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFLocatType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, FLocatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFLocatType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, FLocatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFLocatType_LOCTYPE(), this.getLOCTYPEType(), "lOCTYPE", null, 1, 1, FLocatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFLocatType_OTHERLOCTYPE(), theXMLTypePackage.getString(), "oTHERLOCTYPE", null, 0, 1, FLocatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFLocatType_Role(), theXMLTypePackage.getString(), "role", null, 0, 1, FLocatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFLocatType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, FLocatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFLocatType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, FLocatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFLocatType_Type(), theXMLTypePackage.getString(), "type", "simple", 0, 1, FLocatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFLocatType_USE(), theXMLTypePackage.getString(), "uSE", null, 0, 1, FLocatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(fptrTypeEClass, FptrType.class, "FptrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getFptrType_Par(), this.getParType(), null, "par", null, 0, 1, FptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getFptrType_Seq(), this.getSeqType(), null, "seq", null, 0, 1, FptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getFptrType_Area(), this.getAreaType(), null, "area", null, 0, 1, FptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFptrType_CONTENTIDS(), this.getURIs(), "cONTENTIDS", null, 0, 1, FptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFptrType_FILEID(), theXMLTypePackage.getIDREF(), "fILEID", null, 0, 1, FptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFptrType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, FptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(mdRefTypeEClass, MdRefType.class, "MdRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getMdRefType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_Arcrole(), theXMLTypePackage.getString(), "arcrole", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_CHECKSUM(), theXMLTypePackage.getString(), "cHECKSUM", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_CHECKSUMTYPE(), this.getCHECKSUMTYPEType(), "cHECKSUMTYPE", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_CREATED(), theXMLTypePackage.getDateTime(), "cREATED", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_LABEL(), theXMLTypePackage.getString(), "lABEL", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_LOCTYPE(), this.getLOCTYPEType(), "lOCTYPE", null, 1, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_MDTYPE(), this.getMDTYPEType(), "mDTYPE", null, 1, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_MDTYPEVERSION(), theXMLTypePackage.getString(), "mDTYPEVERSION", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_MIMETYPE(), theXMLTypePackage.getString(), "mIMETYPE", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_OTHERLOCTYPE(), theXMLTypePackage.getString(), "oTHERLOCTYPE", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_OTHERMDTYPE(), theXMLTypePackage.getString(), "oTHERMDTYPE", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_Role(), theXMLTypePackage.getString(), "role", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_SIZE(), theXMLTypePackage.getLong(), "sIZE", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_Type(), theXMLTypePackage.getString(), "type", "simple", 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdRefType_XPTR(), theXMLTypePackage.getString(), "xPTR", null, 0, 1, MdRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(mdSecTypeEClass, MdSecType.class, "MdSecType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMdSecType_MdRef(), this.getMdRefType(), null, "mdRef", null, 0, 1, MdSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMdSecType_MdWrap(), this.getMdWrapType(), null, "mdWrap", null, 0, 1, MdSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdSecType_ADMID(), theXMLTypePackage.getIDREFS(), "aDMID", null, 0, 1, MdSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdSecType_CREATED(), theXMLTypePackage.getDateTime(), "cREATED", null, 0, 1, MdSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdSecType_GROUPID(), theXMLTypePackage.getString(), "gROUPID", null, 0, 1, MdSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdSecType_ID(), theXMLTypePackage.getID(), "iD", null, 1, 1, MdSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdSecType_STATUS(), theXMLTypePackage.getString(), "sTATUS", null, 0, 1, MdSecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(mdWrapTypeEClass, MdWrapType.class, "MdWrapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getMdWrapType_BinData(), theXMLTypePackage.getBase64Binary(), "binData", null, 0, 1, MdWrapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMdWrapType_XmlData(), this.getXmlDataType1(), null, "xmlData", null, 0, 1, MdWrapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdWrapType_CHECKSUM(), theXMLTypePackage.getString(), "cHECKSUM", null, 0, 1, MdWrapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdWrapType_CHECKSUMTYPE(), this.getCHECKSUMTYPEType(), "cHECKSUMTYPE", null, 0, 1, MdWrapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdWrapType_CREATED(), theXMLTypePackage.getDateTime(), "cREATED", null, 0, 1, MdWrapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdWrapType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, MdWrapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdWrapType_LABEL(), theXMLTypePackage.getString(), "lABEL", null, 0, 1, MdWrapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdWrapType_MDTYPE(), this.getMDTYPEType(), "mDTYPE", null, 1, 1, MdWrapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdWrapType_MDTYPEVERSION(), theXMLTypePackage.getString(), "mDTYPEVERSION", null, 0, 1, MdWrapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdWrapType_MIMETYPE(), theXMLTypePackage.getString(), "mIMETYPE", null, 0, 1, MdWrapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdWrapType_OTHERMDTYPE(), theXMLTypePackage.getString(), "oTHERMDTYPE", null, 0, 1, MdWrapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMdWrapType_SIZE(), theXMLTypePackage.getLong(), "sIZE", null, 0, 1, MdWrapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(metsDocumentIDTypeEClass, MetsDocumentIDType.class, "MetsDocumentIDType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getMetsDocumentIDType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, MetsDocumentIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMetsDocumentIDType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, MetsDocumentIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMetsDocumentIDType_TYPE(), theXMLTypePackage.getString(), "tYPE", null, 0, 1, MetsDocumentIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(metsHdrTypeEClass, MetsHdrType.class, "MetsHdrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMetsHdrType_Agent(), this.getAgentType(), null, "agent", null, 0, -1, MetsHdrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMetsHdrType_AltRecordID(), this.getAltRecordIDType(), null, "altRecordID", null, 0, -1, MetsHdrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMetsHdrType_MetsDocumentID(), this.getMetsDocumentIDType(), null, "metsDocumentID", null, 0, 1, MetsHdrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMetsHdrType_ADMID(), theXMLTypePackage.getIDREFS(), "aDMID", null, 0, 1, MetsHdrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMetsHdrType_CREATEDATE(), theXMLTypePackage.getDateTime(), "cREATEDATE", null, 0, 1, MetsHdrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMetsHdrType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, MetsHdrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMetsHdrType_LASTMODDATE(), theXMLTypePackage.getDateTime(), "lASTMODDATE", null, 0, 1, MetsHdrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMetsHdrType_RECORDSTATUS(), theXMLTypePackage.getString(), "rECORDSTATUS", null, 0, 1, MetsHdrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(metsTypeEClass, MetsType.class, "MetsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMetsType_MetsHdr(), this.getMetsHdrType(), null, "metsHdr", null, 0, 1, MetsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMetsType_DmdSec(), this.getMdSecType(), null, "dmdSec", null, 0, -1, MetsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMetsType_AmdSec(), this.getAmdSecType(), null, "amdSec", null, 0, -1, MetsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMetsType_FileSec(), this.getFileSecType(), null, "fileSec", null, 0, 1, MetsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMetsType_StructMap(), this.getStructMapType(), null, "structMap", null, 1, -1, MetsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMetsType_StructLink(), this.getStructLinkType1(), null, "structLink", null, 0, 1, MetsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMetsType_BehaviorSec(), this.getBehaviorSecType(), null, "behaviorSec", null, 0, -1, MetsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMetsType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, MetsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMetsType_LABEL(), theXMLTypePackage.getString(), "lABEL", null, 0, 1, MetsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMetsType_OBJID(), theXMLTypePackage.getString(), "oBJID", null, 0, 1, MetsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMetsType_PROFILE(), theXMLTypePackage.getString(), "pROFILE", null, 0, 1, MetsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMetsType_TYPE(), theXMLTypePackage.getString(), "tYPE", null, 0, 1, MetsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(metsType1EClass, MetsType1.class, "MetsType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(mptrTypeEClass, MptrType.class, "MptrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getMptrType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, MptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMptrType_Arcrole(), theXMLTypePackage.getString(), "arcrole", null, 0, 1, MptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMptrType_CONTENTIDS(), this.getURIs(), "cONTENTIDS", null, 0, 1, MptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMptrType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, MptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMptrType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, MptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMptrType_LOCTYPE(), this.getLOCTYPEType(), "lOCTYPE", null, 1, 1, MptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMptrType_OTHERLOCTYPE(), theXMLTypePackage.getString(), "oTHERLOCTYPE", null, 0, 1, MptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMptrType_Role(), theXMLTypePackage.getString(), "role", null, 0, 1, MptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMptrType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, MptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMptrType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, MptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMptrType_Type(), theXMLTypePackage.getString(), "type", "simple", 0, 1, MptrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(objectTypeEClass, ObjectType.class, "ObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getObjectType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getObjectType_Arcrole(), theXMLTypePackage.getString(), "arcrole", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getObjectType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getObjectType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getObjectType_LABEL(), theXMLTypePackage.getString(), "lABEL", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getObjectType_LOCTYPE(), this.getLOCTYPEType(), "lOCTYPE", null, 1, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getObjectType_OTHERLOCTYPE(), theXMLTypePackage.getString(), "oTHERLOCTYPE", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getObjectType_Role(), theXMLTypePackage.getString(), "role", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getObjectType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getObjectType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getObjectType_Type(), theXMLTypePackage.getString(), "type", "simple", 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(parTypeEClass, ParType.class, "ParType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getParType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getParType_Area(), this.getAreaType(), null, "area", null, 0, -1, ParType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
                initEReference(getParType_Seq(), this.getSeqType(), null, "seq", null, 0, -1, ParType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
                initEAttribute(getParType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(seqTypeEClass, SeqType.class, "SeqType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getSeqType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getSeqType_Area(), this.getAreaType(), null, "area", null, 0, -1, SeqType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
                initEReference(getSeqType_Par(), this.getParType(), null, "par", null, 0, -1, SeqType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
                initEAttribute(getSeqType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(smArcLinkTypeEClass, SmArcLinkType.class, "SmArcLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getSmArcLinkType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, SmArcLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmArcLinkType_ADMID(), theXMLTypePackage.getIDREFS(), "aDMID", null, 0, 1, SmArcLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmArcLinkType_Arcrole(), theXMLTypePackage.getString(), "arcrole", null, 0, 1, SmArcLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmArcLinkType_ARCTYPE(), theXMLTypePackage.getString(), "aRCTYPE", null, 0, 1, SmArcLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmArcLinkType_From(), theXMLTypePackage.getString(), "from", null, 0, 1, SmArcLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmArcLinkType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, SmArcLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmArcLinkType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, SmArcLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmArcLinkType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, SmArcLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmArcLinkType_To(), theXMLTypePackage.getString(), "to", null, 0, 1, SmArcLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmArcLinkType_Type(), theXMLTypePackage.getString(), "type", "arc", 0, 1, SmArcLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(smLinkGrpTypeEClass, SmLinkGrpType.class, "SmLinkGrpType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getSmLinkGrpType_SmLocatorLink(), this.getSmLocatorLinkType(), null, "smLocatorLink", null, 2, -1, SmLinkGrpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getSmLinkGrpType_SmArcLink(), this.getSmArcLinkType(), null, "smArcLink", null, 1, -1, SmLinkGrpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLinkGrpType_ARCLINKORDER(), this.getARCLINKORDERType(), "aRCLINKORDER", "unordered", 0, 1, SmLinkGrpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLinkGrpType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, SmLinkGrpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLinkGrpType_Role(), theXMLTypePackage.getString(), "role", null, 0, 1, SmLinkGrpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLinkGrpType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, SmLinkGrpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLinkGrpType_Type(), theXMLTypePackage.getString(), "type", "extended", 0, 1, SmLinkGrpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(smLinkTypeEClass, SmLinkType.class, "SmLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getSmLinkType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, SmLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLinkType_Arcrole(), theXMLTypePackage.getString(), "arcrole", null, 0, 1, SmLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLinkType_From(), theXMLTypePackage.getString(), "from", null, 1, 1, SmLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLinkType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, SmLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLinkType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, SmLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLinkType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, SmLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLinkType_To(), theXMLTypePackage.getString(), "to", null, 1, 1, SmLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(smLocatorLinkTypeEClass, SmLocatorLinkType.class, "SmLocatorLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getSmLocatorLinkType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 1, 1, SmLocatorLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLocatorLinkType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, SmLocatorLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLocatorLinkType_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, SmLocatorLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLocatorLinkType_Role(), theXMLTypePackage.getString(), "role", null, 0, 1, SmLocatorLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLocatorLinkType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, SmLocatorLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSmLocatorLinkType_Type(), theXMLTypePackage.getString(), "type", "locator", 0, 1, SmLocatorLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(streamTypeEClass, StreamType.class, "StreamType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getStreamType_ADMID(), theXMLTypePackage.getIDREFS(), "aDMID", null, 0, 1, StreamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getStreamType_BEGIN(), theXMLTypePackage.getString(), "bEGIN", null, 0, 1, StreamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getStreamType_BETYPE(), this.getBETYPEType2(), "bETYPE", null, 0, 1, StreamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getStreamType_DMDID(), theXMLTypePackage.getIDREFS(), "dMDID", null, 0, 1, StreamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getStreamType_END(), theXMLTypePackage.getString(), "eND", null, 0, 1, StreamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getStreamType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, StreamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getStreamType_OWNERID(), theXMLTypePackage.getString(), "oWNERID", null, 0, 1, StreamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getStreamType_StreamType(), theXMLTypePackage.getString(), "streamType", null, 0, 1, StreamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(structLinkTypeEClass, StructLinkType.class, "StructLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getStructLinkType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, StructLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getStructLinkType_SmLink(), this.getSmLinkType(), null, "smLink", null, 0, -1, StructLinkType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
                initEReference(getStructLinkType_SmLinkGrp(), this.getSmLinkGrpType(), null, "smLinkGrp", null, 0, -1, StructLinkType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
                initEAttribute(getStructLinkType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, StructLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(structLinkType1EClass, StructLinkType1.class, "StructLinkType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(structMapTypeEClass, StructMapType.class, "StructMapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getStructMapType_Div(), this.getDivType(), null, "div", null, 1, 1, StructMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getStructMapType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, StructMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getStructMapType_LABEL(), theXMLTypePackage.getString(), "lABEL", null, 0, 1, StructMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getStructMapType_TYPE(), theXMLTypePackage.getString(), "tYPE", null, 0, 1, StructMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(transformFileTypeEClass, TransformFileType.class, "TransformFileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getTransformFileType_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, TransformFileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getTransformFileType_TRANSFORMALGORITHM(), theXMLTypePackage.getString(), "tRANSFORMALGORITHM", null, 1, 1, TransformFileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getTransformFileType_TRANSFORMBEHAVIOR(), theXMLTypePackage.getIDREF(), "tRANSFORMBEHAVIOR", null, 0, 1, TransformFileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getTransformFileType_TRANSFORMKEY(), theXMLTypePackage.getString(), "tRANSFORMKEY", null, 0, 1, TransformFileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getTransformFileType_TRANSFORMORDER(), theXMLTypePackage.getPositiveInteger(), "tRANSFORMORDER", null, 1, 1, TransformFileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getTransformFileType_TRANSFORMTYPE(), this.getTRANSFORMTYPEType(), "tRANSFORMTYPE", null, 1, 1, TransformFileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(xmlDataTypeEClass, XmlDataType.class, "XmlDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getXmlDataType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, -1, XmlDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(xmlDataType1EClass, XmlDataType1.class, "XmlDataType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getXmlDataType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, -1, XmlDataType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Initialize enums and add enum literals
                initEEnum(arclinkorderTypeEEnum, ARCLINKORDERType.class, "ARCLINKORDERType");
                addEEnumLiteral(arclinkorderTypeEEnum, ARCLINKORDERType.ORDERED);
                addEEnumLiteral(arclinkorderTypeEEnum, ARCLINKORDERType.UNORDERED);

                initEEnum(betypeTypeEEnum, BETYPEType.class, "BETYPEType");
                addEEnumLiteral(betypeTypeEEnum, BETYPEType.BYTE);
                addEEnumLiteral(betypeTypeEEnum, BETYPEType.IDREF);
                addEEnumLiteral(betypeTypeEEnum, BETYPEType.SMIL);
                addEEnumLiteral(betypeTypeEEnum, BETYPEType.MIDI);
                addEEnumLiteral(betypeTypeEEnum, BETYPEType.SMPTE25);
                addEEnumLiteral(betypeTypeEEnum, BETYPEType.SMPTE24);
                addEEnumLiteral(betypeTypeEEnum, BETYPEType.SMPTEDF30);
                addEEnumLiteral(betypeTypeEEnum, BETYPEType.SMPTENDF30);
                addEEnumLiteral(betypeTypeEEnum, BETYPEType.SMPTEDF2997);
                addEEnumLiteral(betypeTypeEEnum, BETYPEType.SMPTENDF2997);
                addEEnumLiteral(betypeTypeEEnum, BETYPEType.TIME);
                addEEnumLiteral(betypeTypeEEnum, BETYPEType.TCF);
                addEEnumLiteral(betypeTypeEEnum, BETYPEType.XPTR);

                initEEnum(betypeType1EEnum, BETYPEType1.class, "BETYPEType1");
                addEEnumLiteral(betypeType1EEnum, BETYPEType1.BYTE);

                initEEnum(betypeType2EEnum, BETYPEType2.class, "BETYPEType2");
                addEEnumLiteral(betypeType2EEnum, BETYPEType2.BYTE);

                initEEnum(checksumtypeTypeEEnum, CHECKSUMTYPEType.class, "CHECKSUMTYPEType");
                addEEnumLiteral(checksumtypeTypeEEnum, CHECKSUMTYPEType.ADLER32);
                addEEnumLiteral(checksumtypeTypeEEnum, CHECKSUMTYPEType.CRC32);
                addEEnumLiteral(checksumtypeTypeEEnum, CHECKSUMTYPEType.HAVAL);
                addEEnumLiteral(checksumtypeTypeEEnum, CHECKSUMTYPEType.MD5);
                addEEnumLiteral(checksumtypeTypeEEnum, CHECKSUMTYPEType.MNP);
                addEEnumLiteral(checksumtypeTypeEEnum, CHECKSUMTYPEType.SHA1);
                addEEnumLiteral(checksumtypeTypeEEnum, CHECKSUMTYPEType.SHA256);
                addEEnumLiteral(checksumtypeTypeEEnum, CHECKSUMTYPEType.SHA384);
                addEEnumLiteral(checksumtypeTypeEEnum, CHECKSUMTYPEType.SHA512);
                addEEnumLiteral(checksumtypeTypeEEnum, CHECKSUMTYPEType.TIGER);
                addEEnumLiteral(checksumtypeTypeEEnum, CHECKSUMTYPEType.WHIRLPOOL);

                initEEnum(exttypeTypeEEnum, EXTTYPEType.class, "EXTTYPEType");
                addEEnumLiteral(exttypeTypeEEnum, EXTTYPEType.BYTE);
                addEEnumLiteral(exttypeTypeEEnum, EXTTYPEType.SMIL);
                addEEnumLiteral(exttypeTypeEEnum, EXTTYPEType.MIDI);
                addEEnumLiteral(exttypeTypeEEnum, EXTTYPEType.SMPTE25);
                addEEnumLiteral(exttypeTypeEEnum, EXTTYPEType.SMPTE24);
                addEEnumLiteral(exttypeTypeEEnum, EXTTYPEType.SMPTEDF30);
                addEEnumLiteral(exttypeTypeEEnum, EXTTYPEType.SMPTENDF30);
                addEEnumLiteral(exttypeTypeEEnum, EXTTYPEType.SMPTEDF2997);
                addEEnumLiteral(exttypeTypeEEnum, EXTTYPEType.SMPTENDF2997);
                addEEnumLiteral(exttypeTypeEEnum, EXTTYPEType.TIME);
                addEEnumLiteral(exttypeTypeEEnum, EXTTYPEType.TCF);

                initEEnum(loctypeTypeEEnum, LOCTYPEType.class, "LOCTYPEType");
                addEEnumLiteral(loctypeTypeEEnum, LOCTYPEType.ARK);
                addEEnumLiteral(loctypeTypeEEnum, LOCTYPEType.URN);
                addEEnumLiteral(loctypeTypeEEnum, LOCTYPEType.URL);
                addEEnumLiteral(loctypeTypeEEnum, LOCTYPEType.PURL);
                addEEnumLiteral(loctypeTypeEEnum, LOCTYPEType.HANDLE);
                addEEnumLiteral(loctypeTypeEEnum, LOCTYPEType.DOI);
                addEEnumLiteral(loctypeTypeEEnum, LOCTYPEType.OTHER);

                initEEnum(mdtypeTypeEEnum, MDTYPEType.class, "MDTYPEType");
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.MARC);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.MODS);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.EAD);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.DC);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.NISOIMG);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.LCAV);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.VRA);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.TEIHDR);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.DDI);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.FGDC);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.LOM);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.PREMIS);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.PREMISOBJECT);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.PREMISAGENT);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.PREMISRIGHTS);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.PREMISEVENT);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.TEXTMD);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.METSRIGHTS);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.ISO191152003NAP);
                addEEnumLiteral(mdtypeTypeEEnum, MDTYPEType.OTHER);

                initEEnum(roleTypeEEnum, ROLEType.class, "ROLEType");
                addEEnumLiteral(roleTypeEEnum, ROLEType.CREATOR);
                addEEnumLiteral(roleTypeEEnum, ROLEType.EDITOR);
                addEEnumLiteral(roleTypeEEnum, ROLEType.ARCHIVIST);
                addEEnumLiteral(roleTypeEEnum, ROLEType.PRESERVATION);
                addEEnumLiteral(roleTypeEEnum, ROLEType.DISSEMINATOR);
                addEEnumLiteral(roleTypeEEnum, ROLEType.CUSTODIAN);
                addEEnumLiteral(roleTypeEEnum, ROLEType.IPOWNER);
                addEEnumLiteral(roleTypeEEnum, ROLEType.OTHER);

                initEEnum(shapeTypeEEnum, SHAPEType.class, "SHAPEType");
                addEEnumLiteral(shapeTypeEEnum, SHAPEType.RECT);
                addEEnumLiteral(shapeTypeEEnum, SHAPEType.CIRCLE);
                addEEnumLiteral(shapeTypeEEnum, SHAPEType.POLY);

                initEEnum(transformtypeTypeEEnum, TRANSFORMTYPEType.class, "TRANSFORMTYPEType");
                addEEnumLiteral(transformtypeTypeEEnum, TRANSFORMTYPEType.DECOMPRESSION);
                addEEnumLiteral(transformtypeTypeEEnum, TRANSFORMTYPEType.DECRYPTION);

                initEEnum(typeTypeEEnum, TYPEType.class, "TYPEType");
                addEEnumLiteral(typeTypeEEnum, TYPEType.INDIVIDUAL);
                addEEnumLiteral(typeTypeEEnum, TYPEType.ORGANIZATION);
                addEEnumLiteral(typeTypeEEnum, TYPEType.OTHER);

                // Initialize data types
                initEDataType(arclinkorderTypeObjectEDataType, ARCLINKORDERType.class, "ARCLINKORDERTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
                initEDataType(betypeTypeObjectEDataType, BETYPEType.class, "BETYPETypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
                initEDataType(betypeTypeObject1EDataType, BETYPEType1.class, "BETYPETypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
                initEDataType(betypeTypeObject2EDataType, BETYPEType2.class, "BETYPETypeObject2", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
                initEDataType(checksumtypeTypeObjectEDataType, CHECKSUMTYPEType.class, "CHECKSUMTYPETypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
                initEDataType(exttypeTypeObjectEDataType, EXTTYPEType.class, "EXTTYPETypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
                initEDataType(loctypeTypeObjectEDataType, LOCTYPEType.class, "LOCTYPETypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
                initEDataType(mdtypeTypeObjectEDataType, MDTYPEType.class, "MDTYPETypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
                initEDataType(roleTypeObjectEDataType, ROLEType.class, "ROLETypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
                initEDataType(shapeTypeObjectEDataType, SHAPEType.class, "SHAPETypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
                initEDataType(transformtypeTypeObjectEDataType, TRANSFORMTYPEType.class, "TRANSFORMTYPETypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
                initEDataType(typeTypeObjectEDataType, TYPEType.class, "TYPETypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
                initEDataType(urIsEDataType, List.class, "URIs", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

                // Create resource
                createResource(eNS_URI);

                // Create annotations
                // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
                createExtendedMetaDataAnnotations();
        }

        /**
         * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void createExtendedMetaDataAnnotations() {
                String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
                addAnnotation
                  (agentTypeEClass, 
                   source, 
                   new String[] {
                         "name", "agent_._type",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (getAgentType_Name(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "name",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getAgentType_Note(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "note",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getAgentType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getAgentType_OTHERROLE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "OTHERROLE"
                   });			
                addAnnotation
                  (getAgentType_OTHERTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "OTHERTYPE"
                   });			
                addAnnotation
                  (getAgentType_ROLE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ROLE"
                   });			
                addAnnotation
                  (getAgentType_TYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "TYPE"
                   });		
                addAnnotation
                  (altRecordIDTypeEClass, 
                   source, 
                   new String[] {
                         "name", "altRecordID_._type",
                         "kind", "simple"
                   });		
                addAnnotation
                  (getAltRecordIDType_Value(), 
                   source, 
                   new String[] {
                         "name", ":0",
                         "kind", "simple"
                   });			
                addAnnotation
                  (getAltRecordIDType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getAltRecordIDType_TYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "TYPE"
                   });			
                addAnnotation
                  (amdSecTypeEClass, 
                   source, 
                   new String[] {
                         "name", "amdSecType",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (getAmdSecType_TechMD(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "techMD",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getAmdSecType_RightsMD(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "rightsMD",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getAmdSecType_SourceMD(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "sourceMD",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getAmdSecType_DigiprovMD(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "digiprovMD",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getAmdSecType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });		
                addAnnotation
                  (arclinkorderTypeEEnum, 
                   source, 
                   new String[] {
                         "name", "ARCLINKORDER_._type"
                   });		
                addAnnotation
                  (arclinkorderTypeObjectEDataType, 
                   source, 
                   new String[] {
                         "name", "ARCLINKORDER_._type:Object",
                         "baseType", "ARCLINKORDER_._type"
                   });			
                addAnnotation
                  (areaTypeEClass, 
                   source, 
                   new String[] {
                         "name", "areaType",
                         "kind", "empty"
                   });			
                addAnnotation
                  (getAreaType_ADMID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ADMID"
                   });			
                addAnnotation
                  (getAreaType_BEGIN(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "BEGIN"
                   });			
                addAnnotation
                  (getAreaType_BETYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "BETYPE"
                   });			
                addAnnotation
                  (getAreaType_CONTENTIDS(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CONTENTIDS"
                   });			
                addAnnotation
                  (getAreaType_COORDS(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "COORDS"
                   });			
                addAnnotation
                  (getAreaType_END(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "END"
                   });			
                addAnnotation
                  (getAreaType_EXTENT(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "EXTENT"
                   });			
                addAnnotation
                  (getAreaType_EXTTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "EXTTYPE"
                   });			
                addAnnotation
                  (getAreaType_FILEID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "FILEID"
                   });			
                addAnnotation
                  (getAreaType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getAreaType_SHAPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "SHAPE"
                   });			
                addAnnotation
                  (behaviorSecTypeEClass, 
                   source, 
                   new String[] {
                         "name", "behaviorSecType",
                         "kind", "elementOnly"
                   });		
                addAnnotation
                  (getBehaviorSecType_BehaviorSec(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "behaviorSec",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getBehaviorSecType_Behavior(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "behavior",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getBehaviorSecType_CREATED(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CREATED"
                   });			
                addAnnotation
                  (getBehaviorSecType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getBehaviorSecType_LABEL(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "LABEL"
                   });			
                addAnnotation
                  (behaviorTypeEClass, 
                   source, 
                   new String[] {
                         "name", "behaviorType",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (getBehaviorType_InterfaceDef(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "interfaceDef",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getBehaviorType_Mechanism(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "mechanism",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getBehaviorType_ADMID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ADMID"
                   });			
                addAnnotation
                  (getBehaviorType_BTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "BTYPE"
                   });			
                addAnnotation
                  (getBehaviorType_CREATED(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CREATED"
                   });			
                addAnnotation
                  (getBehaviorType_GROUPID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "GROUPID"
                   });			
                addAnnotation
                  (getBehaviorType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getBehaviorType_LABEL(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "LABEL"
                   });			
                addAnnotation
                  (getBehaviorType_STRUCTID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "STRUCTID"
                   });		
                addAnnotation
                  (betypeTypeEEnum, 
                   source, 
                   new String[] {
                         "name", "BETYPE_._type"
                   });		
                addAnnotation
                  (betypeType1EEnum, 
                   source, 
                   new String[] {
                         "name", "BETYPE_._1_._type"
                   });		
                addAnnotation
                  (betypeType2EEnum, 
                   source, 
                   new String[] {
                         "name", "BETYPE_._2_._type"
                   });		
                addAnnotation
                  (betypeTypeObjectEDataType, 
                   source, 
                   new String[] {
                         "name", "BETYPE_._type:Object",
                         "baseType", "BETYPE_._type"
                   });		
                addAnnotation
                  (betypeTypeObject1EDataType, 
                   source, 
                   new String[] {
                         "name", "BETYPE_._1_._type:Object",
                         "baseType", "BETYPE_._1_._type"
                   });		
                addAnnotation
                  (betypeTypeObject2EDataType, 
                   source, 
                   new String[] {
                         "name", "BETYPE_._2_._type:Object",
                         "baseType", "BETYPE_._2_._type"
                   });		
                addAnnotation
                  (checksumtypeTypeEEnum, 
                   source, 
                   new String[] {
                         "name", "CHECKSUMTYPE_._type"
                   });		
                addAnnotation
                  (checksumtypeTypeObjectEDataType, 
                   source, 
                   new String[] {
                         "name", "CHECKSUMTYPE_._type:Object",
                         "baseType", "CHECKSUMTYPE_._type"
                   });			
                addAnnotation
                  (divTypeEClass, 
                   source, 
                   new String[] {
                         "name", "divType",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (getDivType_Mptr(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "mptr",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getDivType_Fptr(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "fptr",
                         "namespace", "##targetNamespace"
                   });		
                addAnnotation
                  (getDivType_Div(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "div",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getDivType_AmdSec(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ADMID"
                   });			
                addAnnotation
                  (getDivType_CONTENTIDS(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CONTENTIDS"
                   });			
                addAnnotation
                  (getDivType_DmdSec(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "DMDID"
                   });			
                addAnnotation
                  (getDivType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getDivType_Label(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "label",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getDivType_LABEL1(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "LABEL"
                   });			
                addAnnotation
                  (getDivType_ORDER(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ORDER"
                   });			
                addAnnotation
                  (getDivType_ORDERLABEL(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ORDERLABEL"
                   });			
                addAnnotation
                  (getDivType_TYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "TYPE"
                   });		
                addAnnotation
                  (documentRootEClass, 
                   source, 
                   new String[] {
                         "name", "",
                         "kind", "mixed"
                   });		
                addAnnotation
                  (getDocumentRoot_Mixed(), 
                   source, 
                   new String[] {
                         "kind", "elementWildcard",
                         "name", ":mixed"
                   });		
                addAnnotation
                  (getDocumentRoot_XMLNSPrefixMap(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "xmlns:prefix"
                   });		
                addAnnotation
                  (getDocumentRoot_XSISchemaLocation(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "xsi:schemaLocation"
                   });			
                addAnnotation
                  (getDocumentRoot_Mets(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "mets",
                         "namespace", "##targetNamespace"
                   });		
                addAnnotation
                  (exttypeTypeEEnum, 
                   source, 
                   new String[] {
                         "name", "EXTTYPE_._type"
                   });		
                addAnnotation
                  (exttypeTypeObjectEDataType, 
                   source, 
                   new String[] {
                         "name", "EXTTYPE_._type:Object",
                         "baseType", "EXTTYPE_._type"
                   });		
                addAnnotation
                  (fContentTypeEClass, 
                   source, 
                   new String[] {
                         "name", "FContent_._type",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (getFContentType_BinData(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "binData",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getFContentType_XmlData(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "xmlData",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getFContentType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getFContentType_USE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "USE"
                   });			
                addAnnotation
                  (fileGrpTypeEClass, 
                   source, 
                   new String[] {
                         "name", "fileGrpType",
                         "kind", "elementOnly"
                   });		
                addAnnotation
                  (getFileGrpType_FileGrp(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "fileGrp",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getFileGrpType_File(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "file",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getFileGrpType_ADMID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ADMID"
                   });			
                addAnnotation
                  (getFileGrpType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getFileGrpType_USE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "USE"
                   });			
                addAnnotation
                  (getFileGrpType_VERSDATE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "VERSDATE"
                   });		
                addAnnotation
                  (fileGrpType1EClass, 
                   source, 
                   new String[] {
                         "name", "fileGrp_._type",
                         "kind", "elementOnly"
                   });		
                addAnnotation
                  (fileSecTypeEClass, 
                   source, 
                   new String[] {
                         "name", "fileSec_._type",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (getFileSecType_FileGrp(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "fileGrp",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getFileSecType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (fileTypeEClass, 
                   source, 
                   new String[] {
                         "name", "fileType",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (getFileType_FLocat(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "FLocat",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getFileType_FContent(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "FContent",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getFileType_Stream(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "stream",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getFileType_TransformFile(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "transformFile",
                         "namespace", "##targetNamespace"
                   });		
                addAnnotation
                  (getFileType_File(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "file",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getFileType_ADMID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ADMID"
                   });			
                addAnnotation
                  (getFileType_BEGIN(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "BEGIN"
                   });			
                addAnnotation
                  (getFileType_BETYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "BETYPE"
                   });			
                addAnnotation
                  (getFileType_CHECKSUM(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CHECKSUM"
                   });			
                addAnnotation
                  (getFileType_CHECKSUMTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CHECKSUMTYPE"
                   });			
                addAnnotation
                  (getFileType_CREATED(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CREATED"
                   });			
                addAnnotation
                  (getFileType_DMDID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "DMDID"
                   });			
                addAnnotation
                  (getFileType_END(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "END"
                   });			
                addAnnotation
                  (getFileType_GROUPID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "GROUPID"
                   });			
                addAnnotation
                  (getFileType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getFileType_MIMETYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "MIMETYPE"
                   });			
                addAnnotation
                  (getFileType_OWNERID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "OWNERID"
                   });			
                addAnnotation
                  (getFileType_SEQ(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "SEQ"
                   });			
                addAnnotation
                  (getFileType_SIZE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "SIZE"
                   });			
                addAnnotation
                  (getFileType_USE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "USE"
                   });		
                addAnnotation
                  (fLocatTypeEClass, 
                   source, 
                   new String[] {
                         "name", "FLocat_._type",
                         "kind", "empty"
                   });		
                addAnnotation
                  (getFLocatType_Actuate(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "actuate",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getFLocatType_Arcrole(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "arcrole",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getFLocatType_Href(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "href",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getFLocatType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getFLocatType_LOCTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "LOCTYPE"
                   });			
                addAnnotation
                  (getFLocatType_OTHERLOCTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "OTHERLOCTYPE"
                   });		
                addAnnotation
                  (getFLocatType_Role(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "role",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getFLocatType_Show(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "show",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getFLocatType_Title(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "title",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getFLocatType_Type(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "type",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getFLocatType_USE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "USE"
                   });		
                addAnnotation
                  (fptrTypeEClass, 
                   source, 
                   new String[] {
                         "name", "fptr_._type",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (getFptrType_Par(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "par",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getFptrType_Seq(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "seq",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getFptrType_Area(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "area",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getFptrType_CONTENTIDS(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CONTENTIDS"
                   });			
                addAnnotation
                  (getFptrType_FILEID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "FILEID"
                   });			
                addAnnotation
                  (getFptrType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });		
                addAnnotation
                  (loctypeTypeEEnum, 
                   source, 
                   new String[] {
                         "name", "LOCTYPE_._type"
                   });		
                addAnnotation
                  (loctypeTypeObjectEDataType, 
                   source, 
                   new String[] {
                         "name", "LOCTYPE_._type:Object",
                         "baseType", "LOCTYPE_._type"
                   });		
                addAnnotation
                  (mdRefTypeEClass, 
                   source, 
                   new String[] {
                         "name", "mdRef_._type",
                         "kind", "empty"
                   });		
                addAnnotation
                  (getMdRefType_Actuate(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "actuate",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getMdRefType_Arcrole(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "arcrole",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getMdRefType_CHECKSUM(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CHECKSUM"
                   });			
                addAnnotation
                  (getMdRefType_CHECKSUMTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CHECKSUMTYPE"
                   });			
                addAnnotation
                  (getMdRefType_CREATED(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CREATED"
                   });		
                addAnnotation
                  (getMdRefType_Href(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "href",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getMdRefType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getMdRefType_LABEL(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "LABEL"
                   });			
                addAnnotation
                  (getMdRefType_LOCTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "LOCTYPE"
                   });			
                addAnnotation
                  (getMdRefType_MDTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "MDTYPE"
                   });			
                addAnnotation
                  (getMdRefType_MDTYPEVERSION(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "MDTYPEVERSION"
                   });			
                addAnnotation
                  (getMdRefType_MIMETYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "MIMETYPE"
                   });			
                addAnnotation
                  (getMdRefType_OTHERLOCTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "OTHERLOCTYPE"
                   });			
                addAnnotation
                  (getMdRefType_OTHERMDTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "OTHERMDTYPE"
                   });		
                addAnnotation
                  (getMdRefType_Role(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "role",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getMdRefType_Show(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "show",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getMdRefType_SIZE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "SIZE"
                   });		
                addAnnotation
                  (getMdRefType_Title(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "title",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getMdRefType_Type(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "type",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getMdRefType_XPTR(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "XPTR"
                   });			
                addAnnotation
                  (mdSecTypeEClass, 
                   source, 
                   new String[] {
                         "name", "mdSecType",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (getMdSecType_MdRef(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "mdRef",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getMdSecType_MdWrap(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "mdWrap",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getMdSecType_ADMID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ADMID"
                   });			
                addAnnotation
                  (getMdSecType_CREATED(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CREATED"
                   });			
                addAnnotation
                  (getMdSecType_GROUPID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "GROUPID"
                   });			
                addAnnotation
                  (getMdSecType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getMdSecType_STATUS(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "STATUS"
                   });		
                addAnnotation
                  (mdtypeTypeEEnum, 
                   source, 
                   new String[] {
                         "name", "MDTYPE_._type"
                   });		
                addAnnotation
                  (mdtypeTypeObjectEDataType, 
                   source, 
                   new String[] {
                         "name", "MDTYPE_._type:Object",
                         "baseType", "MDTYPE_._type"
                   });		
                addAnnotation
                  (mdWrapTypeEClass, 
                   source, 
                   new String[] {
                         "name", "mdWrap_._type",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (getMdWrapType_BinData(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "binData",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getMdWrapType_XmlData(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "xmlData",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getMdWrapType_CHECKSUM(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CHECKSUM"
                   });			
                addAnnotation
                  (getMdWrapType_CHECKSUMTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CHECKSUMTYPE"
                   });			
                addAnnotation
                  (getMdWrapType_CREATED(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CREATED"
                   });			
                addAnnotation
                  (getMdWrapType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getMdWrapType_LABEL(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "LABEL"
                   });			
                addAnnotation
                  (getMdWrapType_MDTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "MDTYPE"
                   });			
                addAnnotation
                  (getMdWrapType_MDTYPEVERSION(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "MDTYPEVERSION"
                   });			
                addAnnotation
                  (getMdWrapType_MIMETYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "MIMETYPE"
                   });			
                addAnnotation
                  (getMdWrapType_OTHERMDTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "OTHERMDTYPE"
                   });			
                addAnnotation
                  (getMdWrapType_SIZE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "SIZE"
                   });		
                addAnnotation
                  (metsDocumentIDTypeEClass, 
                   source, 
                   new String[] {
                         "name", "metsDocumentID_._type",
                         "kind", "simple"
                   });		
                addAnnotation
                  (getMetsDocumentIDType_Value(), 
                   source, 
                   new String[] {
                         "name", ":0",
                         "kind", "simple"
                   });			
                addAnnotation
                  (getMetsDocumentIDType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getMetsDocumentIDType_TYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "TYPE"
                   });		
                addAnnotation
                  (metsHdrTypeEClass, 
                   source, 
                   new String[] {
                         "name", "metsHdr_._type",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (getMetsHdrType_Agent(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "agent",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getMetsHdrType_AltRecordID(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "altRecordID",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getMetsHdrType_MetsDocumentID(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "metsDocumentID",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getMetsHdrType_ADMID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ADMID"
                   });			
                addAnnotation
                  (getMetsHdrType_CREATEDATE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CREATEDATE"
                   });			
                addAnnotation
                  (getMetsHdrType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getMetsHdrType_LASTMODDATE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "LASTMODDATE"
                   });			
                addAnnotation
                  (getMetsHdrType_RECORDSTATUS(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "RECORDSTATUS"
                   });			
                addAnnotation
                  (metsTypeEClass, 
                   source, 
                   new String[] {
                         "name", "metsType",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (getMetsType_MetsHdr(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "metsHdr",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getMetsType_DmdSec(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "dmdSec",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getMetsType_AmdSec(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "amdSec",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getMetsType_FileSec(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "fileSec",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getMetsType_StructMap(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "structMap",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getMetsType_StructLink(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "structLink",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getMetsType_BehaviorSec(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "behaviorSec",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getMetsType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getMetsType_LABEL(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "LABEL"
                   });			
                addAnnotation
                  (getMetsType_OBJID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "OBJID"
                   });			
                addAnnotation
                  (getMetsType_PROFILE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "PROFILE"
                   });			
                addAnnotation
                  (getMetsType_TYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "TYPE"
                   });		
                addAnnotation
                  (metsType1EClass, 
                   source, 
                   new String[] {
                         "name", "mets_._type",
                         "kind", "elementOnly"
                   });		
                addAnnotation
                  (mptrTypeEClass, 
                   source, 
                   new String[] {
                         "name", "mptr_._type",
                         "kind", "empty"
                   });		
                addAnnotation
                  (getMptrType_Actuate(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "actuate",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getMptrType_Arcrole(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "arcrole",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getMptrType_CONTENTIDS(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "CONTENTIDS"
                   });		
                addAnnotation
                  (getMptrType_Href(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "href",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getMptrType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getMptrType_LOCTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "LOCTYPE"
                   });			
                addAnnotation
                  (getMptrType_OTHERLOCTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "OTHERLOCTYPE"
                   });		
                addAnnotation
                  (getMptrType_Role(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "role",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getMptrType_Show(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "show",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getMptrType_Title(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "title",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getMptrType_Type(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "type",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (objectTypeEClass, 
                   source, 
                   new String[] {
                         "name", "objectType",
                         "kind", "empty"
                   });		
                addAnnotation
                  (getObjectType_Actuate(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "actuate",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getObjectType_Arcrole(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "arcrole",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getObjectType_Href(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "href",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getObjectType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getObjectType_LABEL(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "LABEL"
                   });			
                addAnnotation
                  (getObjectType_LOCTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "LOCTYPE"
                   });			
                addAnnotation
                  (getObjectType_OTHERLOCTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "OTHERLOCTYPE"
                   });		
                addAnnotation
                  (getObjectType_Role(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "role",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getObjectType_Show(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "show",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getObjectType_Title(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "title",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getObjectType_Type(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "type",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (parTypeEClass, 
                   source, 
                   new String[] {
                         "name", "parType",
                         "kind", "elementOnly"
                   });		
                addAnnotation
                  (getParType_Group(), 
                   source, 
                   new String[] {
                         "kind", "group",
                         "name", "group:0"
                   });		
                addAnnotation
                  (getParType_Area(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "area",
                         "namespace", "##targetNamespace",
                         "group", "#group:0"
                   });		
                addAnnotation
                  (getParType_Seq(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "seq",
                         "namespace", "##targetNamespace",
                         "group", "#group:0"
                   });			
                addAnnotation
                  (getParType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });		
                addAnnotation
                  (roleTypeEEnum, 
                   source, 
                   new String[] {
                         "name", "ROLE_._type"
                   });		
                addAnnotation
                  (roleTypeObjectEDataType, 
                   source, 
                   new String[] {
                         "name", "ROLE_._type:Object",
                         "baseType", "ROLE_._type"
                   });			
                addAnnotation
                  (seqTypeEClass, 
                   source, 
                   new String[] {
                         "name", "seqType",
                         "kind", "elementOnly"
                   });		
                addAnnotation
                  (getSeqType_Group(), 
                   source, 
                   new String[] {
                         "kind", "group",
                         "name", "group:0"
                   });		
                addAnnotation
                  (getSeqType_Area(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "area",
                         "namespace", "##targetNamespace",
                         "group", "#group:0"
                   });		
                addAnnotation
                  (getSeqType_Par(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "par",
                         "namespace", "##targetNamespace",
                         "group", "#group:0"
                   });			
                addAnnotation
                  (getSeqType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });		
                addAnnotation
                  (shapeTypeEEnum, 
                   source, 
                   new String[] {
                         "name", "SHAPE_._type"
                   });		
                addAnnotation
                  (shapeTypeObjectEDataType, 
                   source, 
                   new String[] {
                         "name", "SHAPE_._type:Object",
                         "baseType", "SHAPE_._type"
                   });			
                addAnnotation
                  (smArcLinkTypeEClass, 
                   source, 
                   new String[] {
                         "name", "smArcLink_._type",
                         "kind", "empty"
                   });		
                addAnnotation
                  (getSmArcLinkType_Actuate(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "actuate",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getSmArcLinkType_ADMID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ADMID"
                   });		
                addAnnotation
                  (getSmArcLinkType_Arcrole(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "arcrole",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getSmArcLinkType_ARCTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ARCTYPE"
                   });		
                addAnnotation
                  (getSmArcLinkType_From(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "from",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getSmArcLinkType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });		
                addAnnotation
                  (getSmArcLinkType_Show(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "show",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getSmArcLinkType_Title(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "title",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getSmArcLinkType_To(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "to",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getSmArcLinkType_Type(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "type",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (smLinkGrpTypeEClass, 
                   source, 
                   new String[] {
                         "name", "smLinkGrp_._type",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (getSmLinkGrpType_SmLocatorLink(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "smLocatorLink",
                         "namespace", "##targetNamespace"
                   });		
                addAnnotation
                  (getSmLinkGrpType_SmArcLink(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "smArcLink",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getSmLinkGrpType_ARCLINKORDER(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ARCLINKORDER"
                   });		
                addAnnotation
                  (getSmLinkGrpType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });		
                addAnnotation
                  (getSmLinkGrpType_Role(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "role",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getSmLinkGrpType_Title(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "title",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getSmLinkGrpType_Type(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "type",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (smLinkTypeEClass, 
                   source, 
                   new String[] {
                         "name", "smLink_._type",
                         "kind", "empty"
                   });			
                addAnnotation
                  (getSmLinkType_Actuate(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "actuate",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getSmLinkType_Arcrole(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "arcrole",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getSmLinkType_From(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "from",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getSmLinkType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getSmLinkType_Show(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "show",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getSmLinkType_Title(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "title",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getSmLinkType_To(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "to",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (smLocatorLinkTypeEClass, 
                   source, 
                   new String[] {
                         "name", "smLocatorLink_._type",
                         "kind", "empty"
                   });		
                addAnnotation
                  (getSmLocatorLinkType_Href(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "href",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });			
                addAnnotation
                  (getSmLocatorLinkType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });		
                addAnnotation
                  (getSmLocatorLinkType_Label(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "label",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getSmLocatorLinkType_Role(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "role",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getSmLocatorLinkType_Title(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "title",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (getSmLocatorLinkType_Type(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "type",
                         "namespace", "http://www.w3.org/1999/xlink"
                   });		
                addAnnotation
                  (streamTypeEClass, 
                   source, 
                   new String[] {
                         "name", "stream_._type",
                         "kind", "empty"
                   });			
                addAnnotation
                  (getStreamType_ADMID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ADMID"
                   });			
                addAnnotation
                  (getStreamType_BEGIN(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "BEGIN"
                   });			
                addAnnotation
                  (getStreamType_BETYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "BETYPE"
                   });			
                addAnnotation
                  (getStreamType_DMDID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "DMDID"
                   });			
                addAnnotation
                  (getStreamType_END(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "END"
                   });			
                addAnnotation
                  (getStreamType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getStreamType_OWNERID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "OWNERID"
                   });			
                addAnnotation
                  (getStreamType_StreamType(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "streamType"
                   });			
                addAnnotation
                  (structLinkTypeEClass, 
                   source, 
                   new String[] {
                         "name", "structLinkType",
                         "kind", "elementOnly"
                   });		
                addAnnotation
                  (getStructLinkType_Group(), 
                   source, 
                   new String[] {
                         "kind", "group",
                         "name", "group:0"
                   });			
                addAnnotation
                  (getStructLinkType_SmLink(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "smLink",
                         "namespace", "##targetNamespace",
                         "group", "#group:0"
                   });			
                addAnnotation
                  (getStructLinkType_SmLinkGrp(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "smLinkGrp",
                         "namespace", "##targetNamespace",
                         "group", "#group:0"
                   });			
                addAnnotation
                  (getStructLinkType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });		
                addAnnotation
                  (structLinkType1EClass, 
                   source, 
                   new String[] {
                         "name", "structLink_._type",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (structMapTypeEClass, 
                   source, 
                   new String[] {
                         "name", "structMapType",
                         "kind", "elementOnly"
                   });			
                addAnnotation
                  (getStructMapType_Div(), 
                   source, 
                   new String[] {
                         "kind", "element",
                         "name", "div",
                         "namespace", "##targetNamespace"
                   });			
                addAnnotation
                  (getStructMapType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getStructMapType_LABEL(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "LABEL"
                   });			
                addAnnotation
                  (getStructMapType_TYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "TYPE"
                   });		
                addAnnotation
                  (transformFileTypeEClass, 
                   source, 
                   new String[] {
                         "name", "transformFile_._type",
                         "kind", "empty"
                   });			
                addAnnotation
                  (getTransformFileType_ID(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "ID"
                   });			
                addAnnotation
                  (getTransformFileType_TRANSFORMALGORITHM(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "TRANSFORMALGORITHM"
                   });			
                addAnnotation
                  (getTransformFileType_TRANSFORMBEHAVIOR(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "TRANSFORMBEHAVIOR"
                   });			
                addAnnotation
                  (getTransformFileType_TRANSFORMKEY(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "TRANSFORMKEY"
                   });			
                addAnnotation
                  (getTransformFileType_TRANSFORMORDER(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "TRANSFORMORDER"
                   });			
                addAnnotation
                  (getTransformFileType_TRANSFORMTYPE(), 
                   source, 
                   new String[] {
                         "kind", "attribute",
                         "name", "TRANSFORMTYPE"
                   });		
                addAnnotation
                  (transformtypeTypeEEnum, 
                   source, 
                   new String[] {
                         "name", "TRANSFORMTYPE_._type"
                   });		
                addAnnotation
                  (transformtypeTypeObjectEDataType, 
                   source, 
                   new String[] {
                         "name", "TRANSFORMTYPE_._type:Object",
                         "baseType", "TRANSFORMTYPE_._type"
                   });		
                addAnnotation
                  (typeTypeEEnum, 
                   source, 
                   new String[] {
                         "name", "TYPE_._type"
                   });		
                addAnnotation
                  (typeTypeObjectEDataType, 
                   source, 
                   new String[] {
                         "name", "TYPE_._type:Object",
                         "baseType", "TYPE_._type"
                   });		
                addAnnotation
                  (urIsEDataType, 
                   source, 
                   new String[] {
                         "name", "URIs",
                         "itemType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
                   });		
                addAnnotation
                  (xmlDataTypeEClass, 
                   source, 
                   new String[] {
                         "name", "xmlData_._type",
                         "kind", "elementOnly"
                   });		
                addAnnotation
                  (getXmlDataType_Any(), 
                   source, 
                   new String[] {
                         "kind", "elementWildcard",
                         "wildcards", "##any",
                         "name", ":0",
                         "processing", "lax"
                   });		
                addAnnotation
                  (xmlDataType1EClass, 
                   source, 
                   new String[] {
                         "name", "xmlData_._1_._type",
                         "kind", "elementOnly"
                   });		
                addAnnotation
                  (getXmlDataType1_Any(), 
                   source, 
                   new String[] {
                         "kind", "elementWildcard",
                         "wildcards", "##any",
                         "name", ":0",
                         "processing", "lax"
                   });
        }

} //MetsPackageImpl
