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
package gov.loc.mets.util;

import gov.loc.mets.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gov.loc.mets.MetsPackage
 * @generated
 */
public class MetsSwitch<T> {
        /**
	 * The cached model package
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected static MetsPackage modelPackage;

        /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public MetsSwitch() {
		if (modelPackage == null) {
			modelPackage = MetsPackage.eINSTANCE;
		}
	}

        /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
        public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

        /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
        protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

        /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
        protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MetsPackage.AGENT_TYPE: {
				AgentType agentType = (AgentType)theEObject;
				T result = caseAgentType(agentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.ALT_RECORD_ID_TYPE: {
				AltRecordIDType altRecordIDType = (AltRecordIDType)theEObject;
				T result = caseAltRecordIDType(altRecordIDType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.AMD_SEC_TYPE: {
				AmdSecType amdSecType = (AmdSecType)theEObject;
				T result = caseAmdSecType(amdSecType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.AREA_TYPE: {
				AreaType areaType = (AreaType)theEObject;
				T result = caseAreaType(areaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.BEHAVIOR_SEC_TYPE: {
				BehaviorSecType behaviorSecType = (BehaviorSecType)theEObject;
				T result = caseBehaviorSecType(behaviorSecType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.BEHAVIOR_TYPE: {
				BehaviorType behaviorType = (BehaviorType)theEObject;
				T result = caseBehaviorType(behaviorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.DIV_TYPE: {
				DivType divType = (DivType)theEObject;
				T result = caseDivType(divType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.FCONTENT_TYPE: {
				FContentType fContentType = (FContentType)theEObject;
				T result = caseFContentType(fContentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.FILE_GRP_TYPE: {
				FileGrpType fileGrpType = (FileGrpType)theEObject;
				T result = caseFileGrpType(fileGrpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.FILE_GRP_TYPE1: {
				FileGrpType1 fileGrpType1 = (FileGrpType1)theEObject;
				T result = caseFileGrpType1(fileGrpType1);
				if (result == null) result = caseFileGrpType(fileGrpType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.FILE_SEC_TYPE: {
				FileSecType fileSecType = (FileSecType)theEObject;
				T result = caseFileSecType(fileSecType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.FILE_TYPE: {
				FileType fileType = (FileType)theEObject;
				T result = caseFileType(fileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.FLOCAT_TYPE: {
				FLocatType fLocatType = (FLocatType)theEObject;
				T result = caseFLocatType(fLocatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.FPTR_TYPE: {
				FptrType fptrType = (FptrType)theEObject;
				T result = caseFptrType(fptrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.MD_REF_TYPE: {
				MdRefType mdRefType = (MdRefType)theEObject;
				T result = caseMdRefType(mdRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.MD_SEC_TYPE: {
				MdSecType mdSecType = (MdSecType)theEObject;
				T result = caseMdSecType(mdSecType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.MD_WRAP_TYPE: {
				MdWrapType mdWrapType = (MdWrapType)theEObject;
				T result = caseMdWrapType(mdWrapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.METS_DOCUMENT_ID_TYPE: {
				MetsDocumentIDType metsDocumentIDType = (MetsDocumentIDType)theEObject;
				T result = caseMetsDocumentIDType(metsDocumentIDType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.METS_HDR_TYPE: {
				MetsHdrType metsHdrType = (MetsHdrType)theEObject;
				T result = caseMetsHdrType(metsHdrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.METS_TYPE: {
				MetsType metsType = (MetsType)theEObject;
				T result = caseMetsType(metsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.METS_TYPE1: {
				MetsType1 metsType1 = (MetsType1)theEObject;
				T result = caseMetsType1(metsType1);
				if (result == null) result = caseMetsType(metsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.MPTR_TYPE: {
				MptrType mptrType = (MptrType)theEObject;
				T result = caseMptrType(mptrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.OBJECT_TYPE: {
				ObjectType objectType = (ObjectType)theEObject;
				T result = caseObjectType(objectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.PAR_TYPE: {
				ParType parType = (ParType)theEObject;
				T result = caseParType(parType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.SEQ_TYPE: {
				SeqType seqType = (SeqType)theEObject;
				T result = caseSeqType(seqType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.SM_ARC_LINK_TYPE: {
				SmArcLinkType smArcLinkType = (SmArcLinkType)theEObject;
				T result = caseSmArcLinkType(smArcLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.SM_LINK_GRP_TYPE: {
				SmLinkGrpType smLinkGrpType = (SmLinkGrpType)theEObject;
				T result = caseSmLinkGrpType(smLinkGrpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.SM_LINK_TYPE: {
				SmLinkType smLinkType = (SmLinkType)theEObject;
				T result = caseSmLinkType(smLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.SM_LOCATOR_LINK_TYPE: {
				SmLocatorLinkType smLocatorLinkType = (SmLocatorLinkType)theEObject;
				T result = caseSmLocatorLinkType(smLocatorLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.STREAM_TYPE: {
				StreamType streamType = (StreamType)theEObject;
				T result = caseStreamType(streamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.STRUCT_LINK_TYPE: {
				StructLinkType structLinkType = (StructLinkType)theEObject;
				T result = caseStructLinkType(structLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.STRUCT_LINK_TYPE1: {
				StructLinkType1 structLinkType1 = (StructLinkType1)theEObject;
				T result = caseStructLinkType1(structLinkType1);
				if (result == null) result = caseStructLinkType(structLinkType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.STRUCT_MAP_TYPE: {
				StructMapType structMapType = (StructMapType)theEObject;
				T result = caseStructMapType(structMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.TRANSFORM_FILE_TYPE: {
				TransformFileType transformFileType = (TransformFileType)theEObject;
				T result = caseTransformFileType(transformFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.XML_DATA_TYPE: {
				XmlDataType xmlDataType = (XmlDataType)theEObject;
				T result = caseXmlDataType(xmlDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetsPackage.XML_DATA_TYPE1: {
				XmlDataType1 xmlDataType1 = (XmlDataType1)theEObject;
				T result = caseXmlDataType1(xmlDataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseAgentType(AgentType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Alt Record ID Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt Record ID Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseAltRecordIDType(AltRecordIDType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Amd Sec Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amd Sec Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseAmdSecType(AmdSecType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Area Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseAreaType(AreaType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Sec Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Sec Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseBehaviorSecType(BehaviorSecType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseBehaviorType(BehaviorType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Div Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseDivType(DivType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>FContent Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FContent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseFContentType(FContentType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>File Grp Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Grp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseFileGrpType(FileGrpType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>File Grp Type1</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Grp Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseFileGrpType1(FileGrpType1 object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>File Sec Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Sec Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseFileSecType(FileSecType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseFileType(FileType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>FLocat Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FLocat Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseFLocatType(FLocatType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Fptr Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fptr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseFptrType(FptrType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Md Ref Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Md Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseMdRefType(MdRefType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Md Sec Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Md Sec Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseMdSecType(MdSecType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Md Wrap Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Md Wrap Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseMdWrapType(MdWrapType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Document ID Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document ID Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseMetsDocumentIDType(MetsDocumentIDType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Hdr Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hdr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseMetsHdrType(MetsHdrType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseMetsType(MetsType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Type1</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseMetsType1(MetsType1 object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Mptr Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mptr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseMptrType(MptrType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseObjectType(ObjectType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Par Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Par Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseParType(ParType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Seq Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seq Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseSeqType(SeqType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Sm Arc Link Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sm Arc Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseSmArcLinkType(SmArcLinkType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Sm Link Grp Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sm Link Grp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseSmLinkGrpType(SmLinkGrpType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Sm Link Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sm Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseSmLinkType(SmLinkType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Sm Locator Link Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sm Locator Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseSmLocatorLinkType(SmLocatorLinkType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseStreamType(StreamType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Link Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseStructLinkType(StructLinkType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Link Type1</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Link Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseStructLinkType1(StructLinkType1 object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Map Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseStructMapType(StructMapType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Transform File Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseTransformFileType(TransformFileType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Data Type</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseXmlDataType(XmlDataType object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Data Type1</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseXmlDataType1(XmlDataType1 object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch, but this is the last case anyway.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
        public T defaultCase(EObject object) {
		return null;
	}

} //MetsSwitch
