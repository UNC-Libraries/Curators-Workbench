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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.loc.mets.MetsPackage
 * @generated
 */
public class MetsAdapterFactory extends AdapterFactoryImpl {
        /**
         * The cached model package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static MetsPackage modelPackage;

        /**
         * Creates an instance of the adapter factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MetsAdapterFactory() {
                if (modelPackage == null) {
                        modelPackage = MetsPackage.eINSTANCE;
                }
        }

        /**
         * Returns whether this factory is applicable for the type of the object.
         * <!-- begin-user-doc -->
         * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
         * <!-- end-user-doc -->
         * @return whether this factory is applicable for the type of the object.
         * @generated
         */
        @Override
        public boolean isFactoryForType(Object object) {
                if (object == modelPackage) {
                        return true;
                }
                if (object instanceof EObject) {
                        return ((EObject)object).eClass().getEPackage() == modelPackage;
                }
                return false;
        }

        /**
         * The switch that delegates to the <code>createXXX</code> methods.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MetsSwitch<Adapter> modelSwitch =
                new MetsSwitch<Adapter>() {
                        @Override
                        public Adapter caseAgentType(AgentType object) {
                                return createAgentTypeAdapter();
                        }
                        @Override
                        public Adapter caseAltRecordIDType(AltRecordIDType object) {
                                return createAltRecordIDTypeAdapter();
                        }
                        @Override
                        public Adapter caseAmdSecType(AmdSecType object) {
                                return createAmdSecTypeAdapter();
                        }
                        @Override
                        public Adapter caseAreaType(AreaType object) {
                                return createAreaTypeAdapter();
                        }
                        @Override
                        public Adapter caseBehaviorSecType(BehaviorSecType object) {
                                return createBehaviorSecTypeAdapter();
                        }
                        @Override
                        public Adapter caseBehaviorType(BehaviorType object) {
                                return createBehaviorTypeAdapter();
                        }
                        @Override
                        public Adapter caseDivType(DivType object) {
                                return createDivTypeAdapter();
                        }
                        @Override
                        public Adapter caseDocumentRoot(DocumentRoot object) {
                                return createDocumentRootAdapter();
                        }
                        @Override
                        public Adapter caseFContentType(FContentType object) {
                                return createFContentTypeAdapter();
                        }
                        @Override
                        public Adapter caseFileGrpType(FileGrpType object) {
                                return createFileGrpTypeAdapter();
                        }
                        @Override
                        public Adapter caseFileGrpType1(FileGrpType1 object) {
                                return createFileGrpType1Adapter();
                        }
                        @Override
                        public Adapter caseFileSecType(FileSecType object) {
                                return createFileSecTypeAdapter();
                        }
                        @Override
                        public Adapter caseFileType(FileType object) {
                                return createFileTypeAdapter();
                        }
                        @Override
                        public Adapter caseFLocatType(FLocatType object) {
                                return createFLocatTypeAdapter();
                        }
                        @Override
                        public Adapter caseFptrType(FptrType object) {
                                return createFptrTypeAdapter();
                        }
                        @Override
                        public Adapter caseMdRefType(MdRefType object) {
                                return createMdRefTypeAdapter();
                        }
                        @Override
                        public Adapter caseMdSecType(MdSecType object) {
                                return createMdSecTypeAdapter();
                        }
                        @Override
                        public Adapter caseMdWrapType(MdWrapType object) {
                                return createMdWrapTypeAdapter();
                        }
                        @Override
                        public Adapter caseMetsDocumentIDType(MetsDocumentIDType object) {
                                return createMetsDocumentIDTypeAdapter();
                        }
                        @Override
                        public Adapter caseMetsHdrType(MetsHdrType object) {
                                return createMetsHdrTypeAdapter();
                        }
                        @Override
                        public Adapter caseMetsType(MetsType object) {
                                return createMetsTypeAdapter();
                        }
                        @Override
                        public Adapter caseMetsType1(MetsType1 object) {
                                return createMetsType1Adapter();
                        }
                        @Override
                        public Adapter caseMptrType(MptrType object) {
                                return createMptrTypeAdapter();
                        }
                        @Override
                        public Adapter caseObjectType(ObjectType object) {
                                return createObjectTypeAdapter();
                        }
                        @Override
                        public Adapter caseParType(ParType object) {
                                return createParTypeAdapter();
                        }
                        @Override
                        public Adapter caseSeqType(SeqType object) {
                                return createSeqTypeAdapter();
                        }
                        @Override
                        public Adapter caseSmArcLinkType(SmArcLinkType object) {
                                return createSmArcLinkTypeAdapter();
                        }
                        @Override
                        public Adapter caseSmLinkGrpType(SmLinkGrpType object) {
                                return createSmLinkGrpTypeAdapter();
                        }
                        @Override
                        public Adapter caseSmLinkType(SmLinkType object) {
                                return createSmLinkTypeAdapter();
                        }
                        @Override
                        public Adapter caseSmLocatorLinkType(SmLocatorLinkType object) {
                                return createSmLocatorLinkTypeAdapter();
                        }
                        @Override
                        public Adapter caseStreamType(StreamType object) {
                                return createStreamTypeAdapter();
                        }
                        @Override
                        public Adapter caseStructLinkType(StructLinkType object) {
                                return createStructLinkTypeAdapter();
                        }
                        @Override
                        public Adapter caseStructLinkType1(StructLinkType1 object) {
                                return createStructLinkType1Adapter();
                        }
                        @Override
                        public Adapter caseStructMapType(StructMapType object) {
                                return createStructMapTypeAdapter();
                        }
                        @Override
                        public Adapter caseTransformFileType(TransformFileType object) {
                                return createTransformFileTypeAdapter();
                        }
                        @Override
                        public Adapter caseXmlDataType(XmlDataType object) {
                                return createXmlDataTypeAdapter();
                        }
                        @Override
                        public Adapter caseXmlDataType1(XmlDataType1 object) {
                                return createXmlDataType1Adapter();
                        }
                        @Override
                        public Adapter defaultCase(EObject object) {
                                return createEObjectAdapter();
                        }
                };

        /**
         * Creates an adapter for the <code>target</code>.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param target the object to adapt.
         * @return the adapter for the <code>target</code>.
         * @generated
         */
        @Override
        public Adapter createAdapter(Notifier target) {
                return modelSwitch.doSwitch((EObject)target);
        }


        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.AgentType <em>Agent Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.AgentType
         * @generated
         */
        public Adapter createAgentTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.AltRecordIDType <em>Alt Record ID Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.AltRecordIDType
         * @generated
         */
        public Adapter createAltRecordIDTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.AmdSecType <em>Amd Sec Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.AmdSecType
         * @generated
         */
        public Adapter createAmdSecTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.AreaType <em>Area Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.AreaType
         * @generated
         */
        public Adapter createAreaTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.BehaviorSecType <em>Behavior Sec Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.BehaviorSecType
         * @generated
         */
        public Adapter createBehaviorSecTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.BehaviorType <em>Behavior Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.BehaviorType
         * @generated
         */
        public Adapter createBehaviorTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.DivType <em>Div Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.DivType
         * @generated
         */
        public Adapter createDivTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.DocumentRoot <em>Document Root</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.DocumentRoot
         * @generated
         */
        public Adapter createDocumentRootAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.FContentType <em>FContent Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.FContentType
         * @generated
         */
        public Adapter createFContentTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.FileGrpType <em>File Grp Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.FileGrpType
         * @generated
         */
        public Adapter createFileGrpTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.FileGrpType1 <em>File Grp Type1</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.FileGrpType1
         * @generated
         */
        public Adapter createFileGrpType1Adapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.FileSecType <em>File Sec Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.FileSecType
         * @generated
         */
        public Adapter createFileSecTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.FileType <em>File Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.FileType
         * @generated
         */
        public Adapter createFileTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.FLocatType <em>FLocat Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.FLocatType
         * @generated
         */
        public Adapter createFLocatTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.FptrType <em>Fptr Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.FptrType
         * @generated
         */
        public Adapter createFptrTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.MdRefType <em>Md Ref Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.MdRefType
         * @generated
         */
        public Adapter createMdRefTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.MdSecType <em>Md Sec Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.MdSecType
         * @generated
         */
        public Adapter createMdSecTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.MdWrapType <em>Md Wrap Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.MdWrapType
         * @generated
         */
        public Adapter createMdWrapTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.MetsDocumentIDType <em>Document ID Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.MetsDocumentIDType
         * @generated
         */
        public Adapter createMetsDocumentIDTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.MetsHdrType <em>Hdr Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.MetsHdrType
         * @generated
         */
        public Adapter createMetsHdrTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.MetsType <em>Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.MetsType
         * @generated
         */
        public Adapter createMetsTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.MetsType1 <em>Type1</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.MetsType1
         * @generated
         */
        public Adapter createMetsType1Adapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.MptrType <em>Mptr Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.MptrType
         * @generated
         */
        public Adapter createMptrTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.ObjectType <em>Object Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.ObjectType
         * @generated
         */
        public Adapter createObjectTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.ParType <em>Par Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.ParType
         * @generated
         */
        public Adapter createParTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.SeqType <em>Seq Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.SeqType
         * @generated
         */
        public Adapter createSeqTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.SmArcLinkType <em>Sm Arc Link Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.SmArcLinkType
         * @generated
         */
        public Adapter createSmArcLinkTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.SmLinkGrpType <em>Sm Link Grp Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.SmLinkGrpType
         * @generated
         */
        public Adapter createSmLinkGrpTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.SmLinkType <em>Sm Link Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.SmLinkType
         * @generated
         */
        public Adapter createSmLinkTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.SmLocatorLinkType <em>Sm Locator Link Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.SmLocatorLinkType
         * @generated
         */
        public Adapter createSmLocatorLinkTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.StreamType <em>Stream Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.StreamType
         * @generated
         */
        public Adapter createStreamTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.StructLinkType <em>Struct Link Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.StructLinkType
         * @generated
         */
        public Adapter createStructLinkTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.StructLinkType1 <em>Struct Link Type1</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.StructLinkType1
         * @generated
         */
        public Adapter createStructLinkType1Adapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.StructMapType <em>Struct Map Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.StructMapType
         * @generated
         */
        public Adapter createStructMapTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.TransformFileType <em>Transform File Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.TransformFileType
         * @generated
         */
        public Adapter createTransformFileTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.XmlDataType <em>Xml Data Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.XmlDataType
         * @generated
         */
        public Adapter createXmlDataTypeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link gov.loc.mets.XmlDataType1 <em>Xml Data Type1</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see gov.loc.mets.XmlDataType1
         * @generated
         */
        public Adapter createXmlDataType1Adapter() {
                return null;
        }

        /**
         * Creates a new adapter for the default case.
         * <!-- begin-user-doc -->
         * This default implementation returns null.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @generated
         */
        public Adapter createEObjectAdapter() {
                return null;
        }

} //MetsAdapterFactory
