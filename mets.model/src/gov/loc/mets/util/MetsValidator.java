/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets.util;

import gov.loc.mets.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gov.loc.mets.MetsPackage
 * @generated
 */
public class MetsValidator extends EObjectValidator {
        /**
	 * The cached model package
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static final MetsValidator INSTANCE = new MetsValidator();

        /**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
        public static final String DIAGNOSTIC_SOURCE = "gov.loc.mets";

        /**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

        /**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

        /**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected XMLTypeValidator xmlTypeValidator;

        /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public MetsValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

        /**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EPackage getEPackage() {
	  return MetsPackage.eINSTANCE;
	}

        /**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MetsPackage.AGENT_TYPE:
				return validateAgentType((AgentType)value, diagnostics, context);
			case MetsPackage.ALT_RECORD_ID_TYPE:
				return validateAltRecordIDType((AltRecordIDType)value, diagnostics, context);
			case MetsPackage.AMD_SEC_TYPE:
				return validateAmdSecType((AmdSecType)value, diagnostics, context);
			case MetsPackage.AREA_TYPE:
				return validateAreaType((AreaType)value, diagnostics, context);
			case MetsPackage.BEHAVIOR_SEC_TYPE:
				return validateBehaviorSecType((BehaviorSecType)value, diagnostics, context);
			case MetsPackage.BEHAVIOR_TYPE:
				return validateBehaviorType((BehaviorType)value, diagnostics, context);
			case MetsPackage.DIV_TYPE:
				return validateDivType((DivType)value, diagnostics, context);
			case MetsPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case MetsPackage.FCONTENT_TYPE:
				return validateFContentType((FContentType)value, diagnostics, context);
			case MetsPackage.FILE_GRP_TYPE:
				return validateFileGrpType((FileGrpType)value, diagnostics, context);
			case MetsPackage.FILE_GRP_TYPE1:
				return validateFileGrpType1((FileGrpType1)value, diagnostics, context);
			case MetsPackage.FILE_SEC_TYPE:
				return validateFileSecType((FileSecType)value, diagnostics, context);
			case MetsPackage.FILE_TYPE:
				return validateFileType((FileType)value, diagnostics, context);
			case MetsPackage.FLOCAT_TYPE:
				return validateFLocatType((FLocatType)value, diagnostics, context);
			case MetsPackage.FPTR_TYPE:
				return validateFptrType((FptrType)value, diagnostics, context);
			case MetsPackage.MD_REF_TYPE:
				return validateMdRefType((MdRefType)value, diagnostics, context);
			case MetsPackage.MD_SEC_TYPE:
				return validateMdSecType((MdSecType)value, diagnostics, context);
			case MetsPackage.MD_WRAP_TYPE:
				return validateMdWrapType((MdWrapType)value, diagnostics, context);
			case MetsPackage.METS_DOCUMENT_ID_TYPE:
				return validateMetsDocumentIDType((MetsDocumentIDType)value, diagnostics, context);
			case MetsPackage.METS_HDR_TYPE:
				return validateMetsHdrType((MetsHdrType)value, diagnostics, context);
			case MetsPackage.METS_TYPE:
				return validateMetsType((MetsType)value, diagnostics, context);
			case MetsPackage.METS_TYPE1:
				return validateMetsType1((MetsType1)value, diagnostics, context);
			case MetsPackage.MPTR_TYPE:
				return validateMptrType((MptrType)value, diagnostics, context);
			case MetsPackage.OBJECT_TYPE:
				return validateObjectType((ObjectType)value, diagnostics, context);
			case MetsPackage.PAR_TYPE:
				return validateParType((ParType)value, diagnostics, context);
			case MetsPackage.SEQ_TYPE:
				return validateSeqType((SeqType)value, diagnostics, context);
			case MetsPackage.SM_ARC_LINK_TYPE:
				return validateSmArcLinkType((SmArcLinkType)value, diagnostics, context);
			case MetsPackage.SM_LINK_GRP_TYPE:
				return validateSmLinkGrpType((SmLinkGrpType)value, diagnostics, context);
			case MetsPackage.SM_LINK_TYPE:
				return validateSmLinkType((SmLinkType)value, diagnostics, context);
			case MetsPackage.SM_LOCATOR_LINK_TYPE:
				return validateSmLocatorLinkType((SmLocatorLinkType)value, diagnostics, context);
			case MetsPackage.STREAM_TYPE:
				return validateStreamType((StreamType)value, diagnostics, context);
			case MetsPackage.STRUCT_LINK_TYPE:
				return validateStructLinkType((StructLinkType)value, diagnostics, context);
			case MetsPackage.STRUCT_LINK_TYPE1:
				return validateStructLinkType1((StructLinkType1)value, diagnostics, context);
			case MetsPackage.STRUCT_MAP_TYPE:
				return validateStructMapType((StructMapType)value, diagnostics, context);
			case MetsPackage.TRANSFORM_FILE_TYPE:
				return validateTransformFileType((TransformFileType)value, diagnostics, context);
			case MetsPackage.XML_DATA_TYPE:
				return validateXmlDataType((XmlDataType)value, diagnostics, context);
			case MetsPackage.XML_DATA_TYPE1:
				return validateXmlDataType1((XmlDataType1)value, diagnostics, context);
			case MetsPackage.ARCLINKORDER_TYPE:
				return validateARCLINKORDERType((ARCLINKORDERType)value, diagnostics, context);
			case MetsPackage.BETYPE_TYPE:
				return validateBETYPEType((BETYPEType)value, diagnostics, context);
			case MetsPackage.BETYPE_TYPE1:
				return validateBETYPEType1((BETYPEType1)value, diagnostics, context);
			case MetsPackage.BETYPE_TYPE2:
				return validateBETYPEType2((BETYPEType2)value, diagnostics, context);
			case MetsPackage.CHECKSUMTYPE_TYPE:
				return validateCHECKSUMTYPEType((CHECKSUMTYPEType)value, diagnostics, context);
			case MetsPackage.EXTTYPE_TYPE:
				return validateEXTTYPEType((EXTTYPEType)value, diagnostics, context);
			case MetsPackage.LOCTYPE_TYPE:
				return validateLOCTYPEType((LOCTYPEType)value, diagnostics, context);
			case MetsPackage.MDTYPE_TYPE:
				return validateMDTYPEType((MDTYPEType)value, diagnostics, context);
			case MetsPackage.ROLE_TYPE:
				return validateROLEType((ROLEType)value, diagnostics, context);
			case MetsPackage.SHAPE_TYPE:
				return validateSHAPEType((SHAPEType)value, diagnostics, context);
			case MetsPackage.TRANSFORMTYPE_TYPE:
				return validateTRANSFORMTYPEType((TRANSFORMTYPEType)value, diagnostics, context);
			case MetsPackage.TYPE_TYPE:
				return validateTYPEType((TYPEType)value, diagnostics, context);
			case MetsPackage.ARCLINKORDER_TYPE_OBJECT:
				return validateARCLINKORDERTypeObject((ARCLINKORDERType)value, diagnostics, context);
			case MetsPackage.BETYPE_TYPE_OBJECT:
				return validateBETYPETypeObject((BETYPEType)value, diagnostics, context);
			case MetsPackage.BETYPE_TYPE_OBJECT1:
				return validateBETYPETypeObject1((BETYPEType1)value, diagnostics, context);
			case MetsPackage.BETYPE_TYPE_OBJECT2:
				return validateBETYPETypeObject2((BETYPEType2)value, diagnostics, context);
			case MetsPackage.CHECKSUMTYPE_TYPE_OBJECT:
				return validateCHECKSUMTYPETypeObject((CHECKSUMTYPEType)value, diagnostics, context);
			case MetsPackage.EXTTYPE_TYPE_OBJECT:
				return validateEXTTYPETypeObject((EXTTYPEType)value, diagnostics, context);
			case MetsPackage.LOCTYPE_TYPE_OBJECT:
				return validateLOCTYPETypeObject((LOCTYPEType)value, diagnostics, context);
			case MetsPackage.MDTYPE_TYPE_OBJECT:
				return validateMDTYPETypeObject((MDTYPEType)value, diagnostics, context);
			case MetsPackage.ROLE_TYPE_OBJECT:
				return validateROLETypeObject((ROLEType)value, diagnostics, context);
			case MetsPackage.SHAPE_TYPE_OBJECT:
				return validateSHAPETypeObject((SHAPEType)value, diagnostics, context);
			case MetsPackage.TRANSFORMTYPE_TYPE_OBJECT:
				return validateTRANSFORMTYPETypeObject((TRANSFORMTYPEType)value, diagnostics, context);
			case MetsPackage.TYPE_TYPE_OBJECT:
				return validateTYPETypeObject((TYPEType)value, diagnostics, context);
			case MetsPackage.UR_IS:
				return validateURIs((List<?>)value, diagnostics, context);
			default:
				return true;
		}
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateAgentType(AgentType agentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(agentType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateAltRecordIDType(AltRecordIDType altRecordIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(altRecordIDType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateAmdSecType(AmdSecType amdSecType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(amdSecType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateAreaType(AreaType areaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(areaType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateBehaviorSecType(BehaviorSecType behaviorSecType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behaviorSecType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateBehaviorType(BehaviorType behaviorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behaviorType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateDivType(DivType divType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(divType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateFContentType(FContentType fContentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fContentType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateFileGrpType(FileGrpType fileGrpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileGrpType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateFileGrpType1(FileGrpType1 fileGrpType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileGrpType1, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateFileSecType(FileSecType fileSecType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileSecType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateFileType(FileType fileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateFLocatType(FLocatType fLocatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fLocatType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateFptrType(FptrType fptrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fptrType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateMdRefType(MdRefType mdRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mdRefType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateMdSecType(MdSecType mdSecType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mdSecType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateMdWrapType(MdWrapType mdWrapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mdWrapType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateMetsDocumentIDType(MetsDocumentIDType metsDocumentIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metsDocumentIDType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateMetsHdrType(MetsHdrType metsHdrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metsHdrType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateMetsType(MetsType metsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metsType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateMetsType1(MetsType1 metsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metsType1, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateMptrType(MptrType mptrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mptrType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateObjectType(ObjectType objectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateParType(ParType parType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateSeqType(SeqType seqType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(seqType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateSmArcLinkType(SmArcLinkType smArcLinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smArcLinkType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateSmLinkGrpType(SmLinkGrpType smLinkGrpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smLinkGrpType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateSmLinkType(SmLinkType smLinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smLinkType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateSmLocatorLinkType(SmLocatorLinkType smLocatorLinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smLocatorLinkType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateStreamType(StreamType streamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(streamType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateStructLinkType(StructLinkType structLinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structLinkType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateStructLinkType1(StructLinkType1 structLinkType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structLinkType1, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateStructMapType(StructMapType structMapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structMapType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateTransformFileType(TransformFileType transformFileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformFileType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateXmlDataType(XmlDataType xmlDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlDataType, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateXmlDataType1(XmlDataType1 xmlDataType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlDataType1, diagnostics, context);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateARCLINKORDERType(ARCLINKORDERType arclinkorderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateBETYPEType(BETYPEType betypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateBETYPEType1(BETYPEType1 betypeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateBETYPEType2(BETYPEType2 betypeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateCHECKSUMTYPEType(CHECKSUMTYPEType checksumtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateEXTTYPEType(EXTTYPEType exttypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateLOCTYPEType(LOCTYPEType loctypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateMDTYPEType(MDTYPEType mdtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateROLEType(ROLEType roleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateSHAPEType(SHAPEType shapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateTRANSFORMTYPEType(TRANSFORMTYPEType transformtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateTYPEType(TYPEType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateARCLINKORDERTypeObject(ARCLINKORDERType arclinkorderTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateBETYPETypeObject(BETYPEType betypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateBETYPETypeObject1(BETYPEType1 betypeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateBETYPETypeObject2(BETYPEType2 betypeTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateCHECKSUMTYPETypeObject(CHECKSUMTYPEType checksumtypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateEXTTYPETypeObject(EXTTYPEType exttypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateLOCTYPETypeObject(LOCTYPEType loctypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateMDTYPETypeObject(MDTYPEType mdtypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateROLETypeObject(ROLEType roleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateSHAPETypeObject(SHAPEType shapeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateTRANSFORMTYPETypeObject(TRANSFORMTYPEType transformtypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateTYPETypeObject(TYPEType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateURIs(List<?> urIs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateURIs_ItemType(urIs, diagnostics, context);
		return result;
	}

        /**
	 * Validates the ItemType constraint of '<em>UR Is</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean validateURIs_ItemType(List<?> urIs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = urIs.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(item)) {
				result &= xmlTypeValidator.validateAnyURI((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.ANY_URI, item, diagnostics, context);
			}
		}
		return result;
	}

        /**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MetsValidator
