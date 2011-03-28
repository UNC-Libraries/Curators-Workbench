/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.impl;

import gov.loc.mets.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetsFactoryImpl extends EFactoryImpl implements MetsFactory {
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static MetsFactory init() {
                try {
                        MetsFactory theMetsFactory = (MetsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.loc.gov/METS/"); 
                        if (theMetsFactory != null) {
                                return theMetsFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new MetsFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MetsFactoryImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public EObject create(EClass eClass) {
                switch (eClass.getClassifierID()) {
                        case MetsPackage.AGENT_TYPE: return createAgentType();
                        case MetsPackage.ALT_RECORD_ID_TYPE: return createAltRecordIDType();
                        case MetsPackage.AMD_SEC_TYPE: return createAmdSecType();
                        case MetsPackage.AREA_TYPE: return createAreaType();
                        case MetsPackage.BEHAVIOR_SEC_TYPE: return createBehaviorSecType();
                        case MetsPackage.BEHAVIOR_TYPE: return createBehaviorType();
                        case MetsPackage.DIV_TYPE: return createDivType();
                        case MetsPackage.DOCUMENT_ROOT: return createDocumentRoot();
                        case MetsPackage.FCONTENT_TYPE: return createFContentType();
                        case MetsPackage.FILE_GRP_TYPE: return createFileGrpType();
                        case MetsPackage.FILE_GRP_TYPE1: return createFileGrpType1();
                        case MetsPackage.FILE_SEC_TYPE: return createFileSecType();
                        case MetsPackage.FILE_TYPE: return createFileType();
                        case MetsPackage.FLOCAT_TYPE: return createFLocatType();
                        case MetsPackage.FPTR_TYPE: return createFptrType();
                        case MetsPackage.MD_REF_TYPE: return createMdRefType();
                        case MetsPackage.MD_SEC_TYPE: return createMdSecType();
                        case MetsPackage.MD_WRAP_TYPE: return createMdWrapType();
                        case MetsPackage.METS_DOCUMENT_ID_TYPE: return createMetsDocumentIDType();
                        case MetsPackage.METS_HDR_TYPE: return createMetsHdrType();
                        case MetsPackage.METS_TYPE: return createMetsType();
                        case MetsPackage.METS_TYPE1: return createMetsType1();
                        case MetsPackage.MPTR_TYPE: return createMptrType();
                        case MetsPackage.OBJECT_TYPE: return createObjectType();
                        case MetsPackage.PAR_TYPE: return createParType();
                        case MetsPackage.SEQ_TYPE: return createSeqType();
                        case MetsPackage.SM_ARC_LINK_TYPE: return createSmArcLinkType();
                        case MetsPackage.SM_LINK_GRP_TYPE: return createSmLinkGrpType();
                        case MetsPackage.SM_LINK_TYPE: return createSmLinkType();
                        case MetsPackage.SM_LOCATOR_LINK_TYPE: return createSmLocatorLinkType();
                        case MetsPackage.STREAM_TYPE: return createStreamType();
                        case MetsPackage.STRUCT_LINK_TYPE: return createStructLinkType();
                        case MetsPackage.STRUCT_LINK_TYPE1: return createStructLinkType1();
                        case MetsPackage.STRUCT_MAP_TYPE: return createStructMapType();
                        case MetsPackage.TRANSFORM_FILE_TYPE: return createTransformFileType();
                        case MetsPackage.XML_DATA_TYPE: return createXmlDataType();
                        case MetsPackage.XML_DATA_TYPE1: return createXmlDataType1();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object createFromString(EDataType eDataType, String initialValue) {
                switch (eDataType.getClassifierID()) {
                        case MetsPackage.ARCLINKORDER_TYPE:
                                return createARCLINKORDERTypeFromString(eDataType, initialValue);
                        case MetsPackage.BETYPE_TYPE:
                                return createBETYPETypeFromString(eDataType, initialValue);
                        case MetsPackage.BETYPE_TYPE1:
                                return createBETYPEType1FromString(eDataType, initialValue);
                        case MetsPackage.BETYPE_TYPE2:
                                return createBETYPEType2FromString(eDataType, initialValue);
                        case MetsPackage.CHECKSUMTYPE_TYPE:
                                return createCHECKSUMTYPETypeFromString(eDataType, initialValue);
                        case MetsPackage.EXTTYPE_TYPE:
                                return createEXTTYPETypeFromString(eDataType, initialValue);
                        case MetsPackage.LOCTYPE_TYPE:
                                return createLOCTYPETypeFromString(eDataType, initialValue);
                        case MetsPackage.MDTYPE_TYPE:
                                return createMDTYPETypeFromString(eDataType, initialValue);
                        case MetsPackage.ROLE_TYPE:
                                return createROLETypeFromString(eDataType, initialValue);
                        case MetsPackage.SHAPE_TYPE:
                                return createSHAPETypeFromString(eDataType, initialValue);
                        case MetsPackage.TRANSFORMTYPE_TYPE:
                                return createTRANSFORMTYPETypeFromString(eDataType, initialValue);
                        case MetsPackage.TYPE_TYPE:
                                return createTYPETypeFromString(eDataType, initialValue);
                        case MetsPackage.ARCLINKORDER_TYPE_OBJECT:
                                return createARCLINKORDERTypeObjectFromString(eDataType, initialValue);
                        case MetsPackage.BETYPE_TYPE_OBJECT:
                                return createBETYPETypeObjectFromString(eDataType, initialValue);
                        case MetsPackage.BETYPE_TYPE_OBJECT1:
                                return createBETYPETypeObject1FromString(eDataType, initialValue);
                        case MetsPackage.BETYPE_TYPE_OBJECT2:
                                return createBETYPETypeObject2FromString(eDataType, initialValue);
                        case MetsPackage.CHECKSUMTYPE_TYPE_OBJECT:
                                return createCHECKSUMTYPETypeObjectFromString(eDataType, initialValue);
                        case MetsPackage.EXTTYPE_TYPE_OBJECT:
                                return createEXTTYPETypeObjectFromString(eDataType, initialValue);
                        case MetsPackage.LOCTYPE_TYPE_OBJECT:
                                return createLOCTYPETypeObjectFromString(eDataType, initialValue);
                        case MetsPackage.MDTYPE_TYPE_OBJECT:
                                return createMDTYPETypeObjectFromString(eDataType, initialValue);
                        case MetsPackage.ROLE_TYPE_OBJECT:
                                return createROLETypeObjectFromString(eDataType, initialValue);
                        case MetsPackage.SHAPE_TYPE_OBJECT:
                                return createSHAPETypeObjectFromString(eDataType, initialValue);
                        case MetsPackage.TRANSFORMTYPE_TYPE_OBJECT:
                                return createTRANSFORMTYPETypeObjectFromString(eDataType, initialValue);
                        case MetsPackage.TYPE_TYPE_OBJECT:
                                return createTYPETypeObjectFromString(eDataType, initialValue);
                        case MetsPackage.UR_IS:
                                return createURIsFromString(eDataType, initialValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String convertToString(EDataType eDataType, Object instanceValue) {
                switch (eDataType.getClassifierID()) {
                        case MetsPackage.ARCLINKORDER_TYPE:
                                return convertARCLINKORDERTypeToString(eDataType, instanceValue);
                        case MetsPackage.BETYPE_TYPE:
                                return convertBETYPETypeToString(eDataType, instanceValue);
                        case MetsPackage.BETYPE_TYPE1:
                                return convertBETYPEType1ToString(eDataType, instanceValue);
                        case MetsPackage.BETYPE_TYPE2:
                                return convertBETYPEType2ToString(eDataType, instanceValue);
                        case MetsPackage.CHECKSUMTYPE_TYPE:
                                return convertCHECKSUMTYPETypeToString(eDataType, instanceValue);
                        case MetsPackage.EXTTYPE_TYPE:
                                return convertEXTTYPETypeToString(eDataType, instanceValue);
                        case MetsPackage.LOCTYPE_TYPE:
                                return convertLOCTYPETypeToString(eDataType, instanceValue);
                        case MetsPackage.MDTYPE_TYPE:
                                return convertMDTYPETypeToString(eDataType, instanceValue);
                        case MetsPackage.ROLE_TYPE:
                                return convertROLETypeToString(eDataType, instanceValue);
                        case MetsPackage.SHAPE_TYPE:
                                return convertSHAPETypeToString(eDataType, instanceValue);
                        case MetsPackage.TRANSFORMTYPE_TYPE:
                                return convertTRANSFORMTYPETypeToString(eDataType, instanceValue);
                        case MetsPackage.TYPE_TYPE:
                                return convertTYPETypeToString(eDataType, instanceValue);
                        case MetsPackage.ARCLINKORDER_TYPE_OBJECT:
                                return convertARCLINKORDERTypeObjectToString(eDataType, instanceValue);
                        case MetsPackage.BETYPE_TYPE_OBJECT:
                                return convertBETYPETypeObjectToString(eDataType, instanceValue);
                        case MetsPackage.BETYPE_TYPE_OBJECT1:
                                return convertBETYPETypeObject1ToString(eDataType, instanceValue);
                        case MetsPackage.BETYPE_TYPE_OBJECT2:
                                return convertBETYPETypeObject2ToString(eDataType, instanceValue);
                        case MetsPackage.CHECKSUMTYPE_TYPE_OBJECT:
                                return convertCHECKSUMTYPETypeObjectToString(eDataType, instanceValue);
                        case MetsPackage.EXTTYPE_TYPE_OBJECT:
                                return convertEXTTYPETypeObjectToString(eDataType, instanceValue);
                        case MetsPackage.LOCTYPE_TYPE_OBJECT:
                                return convertLOCTYPETypeObjectToString(eDataType, instanceValue);
                        case MetsPackage.MDTYPE_TYPE_OBJECT:
                                return convertMDTYPETypeObjectToString(eDataType, instanceValue);
                        case MetsPackage.ROLE_TYPE_OBJECT:
                                return convertROLETypeObjectToString(eDataType, instanceValue);
                        case MetsPackage.SHAPE_TYPE_OBJECT:
                                return convertSHAPETypeObjectToString(eDataType, instanceValue);
                        case MetsPackage.TRANSFORMTYPE_TYPE_OBJECT:
                                return convertTRANSFORMTYPETypeObjectToString(eDataType, instanceValue);
                        case MetsPackage.TYPE_TYPE_OBJECT:
                                return convertTYPETypeObjectToString(eDataType, instanceValue);
                        case MetsPackage.UR_IS:
                                return convertURIsToString(eDataType, instanceValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public AgentType createAgentType() {
                AgentTypeImpl agentType = new AgentTypeImpl();
                return agentType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public AltRecordIDType createAltRecordIDType() {
                AltRecordIDTypeImpl altRecordIDType = new AltRecordIDTypeImpl();
                return altRecordIDType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public AmdSecType createAmdSecType() {
                AmdSecTypeImpl amdSecType = new AmdSecTypeImpl();
                return amdSecType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public AreaType createAreaType() {
                AreaTypeImpl areaType = new AreaTypeImpl();
                return areaType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviorSecType createBehaviorSecType() {
                BehaviorSecTypeImpl behaviorSecType = new BehaviorSecTypeImpl();
                return behaviorSecType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviorType createBehaviorType() {
                BehaviorTypeImpl behaviorType = new BehaviorTypeImpl();
                return behaviorType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DivType createDivType() {
                DivTypeImpl divType = new DivTypeImpl();
                return divType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DocumentRoot createDocumentRoot() {
                DocumentRootImpl documentRoot = new DocumentRootImpl();
                return documentRoot;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public FContentType createFContentType() {
                FContentTypeImpl fContentType = new FContentTypeImpl();
                return fContentType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public FileGrpType createFileGrpType() {
                FileGrpTypeImpl fileGrpType = new FileGrpTypeImpl();
                return fileGrpType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public FileGrpType1 createFileGrpType1() {
                FileGrpType1Impl fileGrpType1 = new FileGrpType1Impl();
                return fileGrpType1;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public FileSecType createFileSecType() {
                FileSecTypeImpl fileSecType = new FileSecTypeImpl();
                return fileSecType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public FileType createFileType() {
                FileTypeImpl fileType = new FileTypeImpl();
                return fileType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public FLocatType createFLocatType() {
                FLocatTypeImpl fLocatType = new FLocatTypeImpl();
                return fLocatType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public FptrType createFptrType() {
                FptrTypeImpl fptrType = new FptrTypeImpl();
                return fptrType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MdRefType createMdRefType() {
                MdRefTypeImpl mdRefType = new MdRefTypeImpl();
                return mdRefType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MdSecType createMdSecType() {
                MdSecTypeImpl mdSecType = new MdSecTypeImpl();
                return mdSecType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MdWrapType createMdWrapType() {
                MdWrapTypeImpl mdWrapType = new MdWrapTypeImpl();
                return mdWrapType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MetsDocumentIDType createMetsDocumentIDType() {
                MetsDocumentIDTypeImpl metsDocumentIDType = new MetsDocumentIDTypeImpl();
                return metsDocumentIDType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MetsHdrType createMetsHdrType() {
                MetsHdrTypeImpl metsHdrType = new MetsHdrTypeImpl();
                return metsHdrType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MetsType createMetsType() {
                MetsTypeImpl metsType = new MetsTypeImpl();
                return metsType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MetsType1 createMetsType1() {
                MetsType1Impl metsType1 = new MetsType1Impl();
                return metsType1;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MptrType createMptrType() {
                MptrTypeImpl mptrType = new MptrTypeImpl();
                return mptrType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ObjectType createObjectType() {
                ObjectTypeImpl objectType = new ObjectTypeImpl();
                return objectType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ParType createParType() {
                ParTypeImpl parType = new ParTypeImpl();
                return parType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public SeqType createSeqType() {
                SeqTypeImpl seqType = new SeqTypeImpl();
                return seqType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public SmArcLinkType createSmArcLinkType() {
                SmArcLinkTypeImpl smArcLinkType = new SmArcLinkTypeImpl();
                return smArcLinkType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public SmLinkGrpType createSmLinkGrpType() {
                SmLinkGrpTypeImpl smLinkGrpType = new SmLinkGrpTypeImpl();
                return smLinkGrpType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public SmLinkType createSmLinkType() {
                SmLinkTypeImpl smLinkType = new SmLinkTypeImpl();
                return smLinkType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public SmLocatorLinkType createSmLocatorLinkType() {
                SmLocatorLinkTypeImpl smLocatorLinkType = new SmLocatorLinkTypeImpl();
                return smLocatorLinkType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public StreamType createStreamType() {
                StreamTypeImpl streamType = new StreamTypeImpl();
                return streamType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public StructLinkType createStructLinkType() {
                StructLinkTypeImpl structLinkType = new StructLinkTypeImpl();
                return structLinkType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public StructLinkType1 createStructLinkType1() {
                StructLinkType1Impl structLinkType1 = new StructLinkType1Impl();
                return structLinkType1;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public StructMapType createStructMapType() {
                StructMapTypeImpl structMapType = new StructMapTypeImpl();
                return structMapType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TransformFileType createTransformFileType() {
                TransformFileTypeImpl transformFileType = new TransformFileTypeImpl();
                return transformFileType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public XmlDataType createXmlDataType() {
                XmlDataTypeImpl xmlDataType = new XmlDataTypeImpl();
                return xmlDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public XmlDataType1 createXmlDataType1() {
                XmlDataType1Impl xmlDataType1 = new XmlDataType1Impl();
                return xmlDataType1;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ARCLINKORDERType createARCLINKORDERTypeFromString(EDataType eDataType, String initialValue) {
                ARCLINKORDERType result = ARCLINKORDERType.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertARCLINKORDERTypeToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BETYPEType createBETYPETypeFromString(EDataType eDataType, String initialValue) {
                BETYPEType result = BETYPEType.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertBETYPETypeToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BETYPEType1 createBETYPEType1FromString(EDataType eDataType, String initialValue) {
                BETYPEType1 result = BETYPEType1.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertBETYPEType1ToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BETYPEType2 createBETYPEType2FromString(EDataType eDataType, String initialValue) {
                BETYPEType2 result = BETYPEType2.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertBETYPEType2ToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public CHECKSUMTYPEType createCHECKSUMTYPETypeFromString(EDataType eDataType, String initialValue) {
                CHECKSUMTYPEType result = CHECKSUMTYPEType.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertCHECKSUMTYPETypeToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EXTTYPEType createEXTTYPETypeFromString(EDataType eDataType, String initialValue) {
                EXTTYPEType result = EXTTYPEType.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertEXTTYPETypeToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public LOCTYPEType createLOCTYPETypeFromString(EDataType eDataType, String initialValue) {
                LOCTYPEType result = LOCTYPEType.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertLOCTYPETypeToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MDTYPEType createMDTYPETypeFromString(EDataType eDataType, String initialValue) {
                MDTYPEType result = MDTYPEType.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertMDTYPETypeToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ROLEType createROLETypeFromString(EDataType eDataType, String initialValue) {
                ROLEType result = ROLEType.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertROLETypeToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public SHAPEType createSHAPETypeFromString(EDataType eDataType, String initialValue) {
                SHAPEType result = SHAPEType.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertSHAPETypeToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TRANSFORMTYPEType createTRANSFORMTYPETypeFromString(EDataType eDataType, String initialValue) {
                TRANSFORMTYPEType result = TRANSFORMTYPEType.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertTRANSFORMTYPETypeToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TYPEType createTYPETypeFromString(EDataType eDataType, String initialValue) {
                TYPEType result = TYPEType.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertTYPETypeToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ARCLINKORDERType createARCLINKORDERTypeObjectFromString(EDataType eDataType, String initialValue) {
                return createARCLINKORDERTypeFromString(MetsPackage.Literals.ARCLINKORDER_TYPE, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertARCLINKORDERTypeObjectToString(EDataType eDataType, Object instanceValue) {
                return convertARCLINKORDERTypeToString(MetsPackage.Literals.ARCLINKORDER_TYPE, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BETYPEType createBETYPETypeObjectFromString(EDataType eDataType, String initialValue) {
                return createBETYPETypeFromString(MetsPackage.Literals.BETYPE_TYPE, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertBETYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
                return convertBETYPETypeToString(MetsPackage.Literals.BETYPE_TYPE, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BETYPEType1 createBETYPETypeObject1FromString(EDataType eDataType, String initialValue) {
                return createBETYPEType1FromString(MetsPackage.Literals.BETYPE_TYPE1, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertBETYPETypeObject1ToString(EDataType eDataType, Object instanceValue) {
                return convertBETYPEType1ToString(MetsPackage.Literals.BETYPE_TYPE1, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BETYPEType2 createBETYPETypeObject2FromString(EDataType eDataType, String initialValue) {
                return createBETYPEType2FromString(MetsPackage.Literals.BETYPE_TYPE2, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertBETYPETypeObject2ToString(EDataType eDataType, Object instanceValue) {
                return convertBETYPEType2ToString(MetsPackage.Literals.BETYPE_TYPE2, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public CHECKSUMTYPEType createCHECKSUMTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
                return createCHECKSUMTYPETypeFromString(MetsPackage.Literals.CHECKSUMTYPE_TYPE, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertCHECKSUMTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
                return convertCHECKSUMTYPETypeToString(MetsPackage.Literals.CHECKSUMTYPE_TYPE, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EXTTYPEType createEXTTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
                return createEXTTYPETypeFromString(MetsPackage.Literals.EXTTYPE_TYPE, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertEXTTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
                return convertEXTTYPETypeToString(MetsPackage.Literals.EXTTYPE_TYPE, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public LOCTYPEType createLOCTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
                return createLOCTYPETypeFromString(MetsPackage.Literals.LOCTYPE_TYPE, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertLOCTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
                return convertLOCTYPETypeToString(MetsPackage.Literals.LOCTYPE_TYPE, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MDTYPEType createMDTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
                return createMDTYPETypeFromString(MetsPackage.Literals.MDTYPE_TYPE, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertMDTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
                return convertMDTYPETypeToString(MetsPackage.Literals.MDTYPE_TYPE, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ROLEType createROLETypeObjectFromString(EDataType eDataType, String initialValue) {
                return createROLETypeFromString(MetsPackage.Literals.ROLE_TYPE, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertROLETypeObjectToString(EDataType eDataType, Object instanceValue) {
                return convertROLETypeToString(MetsPackage.Literals.ROLE_TYPE, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public SHAPEType createSHAPETypeObjectFromString(EDataType eDataType, String initialValue) {
                return createSHAPETypeFromString(MetsPackage.Literals.SHAPE_TYPE, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertSHAPETypeObjectToString(EDataType eDataType, Object instanceValue) {
                return convertSHAPETypeToString(MetsPackage.Literals.SHAPE_TYPE, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TRANSFORMTYPEType createTRANSFORMTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
                return createTRANSFORMTYPETypeFromString(MetsPackage.Literals.TRANSFORMTYPE_TYPE, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertTRANSFORMTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
                return convertTRANSFORMTYPETypeToString(MetsPackage.Literals.TRANSFORMTYPE_TYPE, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TYPEType createTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
                return createTYPETypeFromString(MetsPackage.Literals.TYPE_TYPE, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
                return convertTYPETypeToString(MetsPackage.Literals.TYPE_TYPE, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public List<String> createURIsFromString(EDataType eDataType, String initialValue) {
                if (initialValue == null) return null;
                List<String> result = new ArrayList<String>();
                for (String item : split(initialValue)) {
                        result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, item));
                }
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertURIsToString(EDataType eDataType, Object instanceValue) {
                if (instanceValue == null) return null;
                List<?> list = (List<?>)instanceValue;
                if (list.isEmpty()) return "";
                StringBuffer result = new StringBuffer();
                for (Object item : list) {
                        result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, item));
                        result.append(' ');
                }
                return result.substring(0, result.length() - 1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MetsPackage getMetsPackage() {
                return (MetsPackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static MetsPackage getPackage() {
                return MetsPackage.eINSTANCE;
        }

} //MetsFactoryImpl
