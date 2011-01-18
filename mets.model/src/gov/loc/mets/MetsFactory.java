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
package gov.loc.mets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gov.loc.mets.MetsPackage
 * @generated
 */
public interface MetsFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        MetsFactory eINSTANCE = gov.loc.mets.impl.MetsFactoryImpl.init();

        /**
         * Returns a new object of class '<em>Agent Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Agent Type</em>'.
         * @generated
         */
        AgentType createAgentType();

        /**
         * Returns a new object of class '<em>Alt Record ID Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Alt Record ID Type</em>'.
         * @generated
         */
        AltRecordIDType createAltRecordIDType();

        /**
         * Returns a new object of class '<em>Amd Sec Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Amd Sec Type</em>'.
         * @generated
         */
        AmdSecType createAmdSecType();

        /**
         * Returns a new object of class '<em>Area Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Area Type</em>'.
         * @generated
         */
        AreaType createAreaType();

        /**
         * Returns a new object of class '<em>Behavior Sec Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Behavior Sec Type</em>'.
         * @generated
         */
        BehaviorSecType createBehaviorSecType();

        /**
         * Returns a new object of class '<em>Behavior Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Behavior Type</em>'.
         * @generated
         */
        BehaviorType createBehaviorType();

        /**
         * Returns a new object of class '<em>Div Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Div Type</em>'.
         * @generated
         */
        DivType createDivType();

        /**
         * Returns a new object of class '<em>Document Root</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Document Root</em>'.
         * @generated
         */
        DocumentRoot createDocumentRoot();

        /**
         * Returns a new object of class '<em>FContent Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>FContent Type</em>'.
         * @generated
         */
        FContentType createFContentType();

        /**
         * Returns a new object of class '<em>File Grp Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>File Grp Type</em>'.
         * @generated
         */
        FileGrpType createFileGrpType();

        /**
         * Returns a new object of class '<em>File Grp Type1</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>File Grp Type1</em>'.
         * @generated
         */
        FileGrpType1 createFileGrpType1();

        /**
         * Returns a new object of class '<em>File Sec Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>File Sec Type</em>'.
         * @generated
         */
        FileSecType createFileSecType();

        /**
         * Returns a new object of class '<em>File Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>File Type</em>'.
         * @generated
         */
        FileType createFileType();

        /**
         * Returns a new object of class '<em>FLocat Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>FLocat Type</em>'.
         * @generated
         */
        FLocatType createFLocatType();

        /**
         * Returns a new object of class '<em>Fptr Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Fptr Type</em>'.
         * @generated
         */
        FptrType createFptrType();

        /**
         * Returns a new object of class '<em>Md Ref Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Md Ref Type</em>'.
         * @generated
         */
        MdRefType createMdRefType();

        /**
         * Returns a new object of class '<em>Md Sec Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Md Sec Type</em>'.
         * @generated
         */
        MdSecType createMdSecType();

        /**
         * Returns a new object of class '<em>Md Wrap Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Md Wrap Type</em>'.
         * @generated
         */
        MdWrapType createMdWrapType();

        /**
         * Returns a new object of class '<em>Document ID Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Document ID Type</em>'.
         * @generated
         */
        MetsDocumentIDType createMetsDocumentIDType();

        /**
         * Returns a new object of class '<em>Hdr Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Hdr Type</em>'.
         * @generated
         */
        MetsHdrType createMetsHdrType();

        /**
         * Returns a new object of class '<em>Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Type</em>'.
         * @generated
         */
        MetsType createMetsType();

        /**
         * Returns a new object of class '<em>Type1</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Type1</em>'.
         * @generated
         */
        MetsType1 createMetsType1();

        /**
         * Returns a new object of class '<em>Mptr Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Mptr Type</em>'.
         * @generated
         */
        MptrType createMptrType();

        /**
         * Returns a new object of class '<em>Object Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Object Type</em>'.
         * @generated
         */
        ObjectType createObjectType();

        /**
         * Returns a new object of class '<em>Par Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Par Type</em>'.
         * @generated
         */
        ParType createParType();

        /**
         * Returns a new object of class '<em>Seq Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Seq Type</em>'.
         * @generated
         */
        SeqType createSeqType();

        /**
         * Returns a new object of class '<em>Sm Arc Link Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Sm Arc Link Type</em>'.
         * @generated
         */
        SmArcLinkType createSmArcLinkType();

        /**
         * Returns a new object of class '<em>Sm Link Grp Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Sm Link Grp Type</em>'.
         * @generated
         */
        SmLinkGrpType createSmLinkGrpType();

        /**
         * Returns a new object of class '<em>Sm Link Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Sm Link Type</em>'.
         * @generated
         */
        SmLinkType createSmLinkType();

        /**
         * Returns a new object of class '<em>Sm Locator Link Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Sm Locator Link Type</em>'.
         * @generated
         */
        SmLocatorLinkType createSmLocatorLinkType();

        /**
         * Returns a new object of class '<em>Stream Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Stream Type</em>'.
         * @generated
         */
        StreamType createStreamType();

        /**
         * Returns a new object of class '<em>Struct Link Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Struct Link Type</em>'.
         * @generated
         */
        StructLinkType createStructLinkType();

        /**
         * Returns a new object of class '<em>Struct Link Type1</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Struct Link Type1</em>'.
         * @generated
         */
        StructLinkType1 createStructLinkType1();

        /**
         * Returns a new object of class '<em>Struct Map Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Struct Map Type</em>'.
         * @generated
         */
        StructMapType createStructMapType();

        /**
         * Returns a new object of class '<em>Transform File Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Transform File Type</em>'.
         * @generated
         */
        TransformFileType createTransformFileType();

        /**
         * Returns a new object of class '<em>Xml Data Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Xml Data Type</em>'.
         * @generated
         */
        XmlDataType createXmlDataType();

        /**
         * Returns a new object of class '<em>Xml Data Type1</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Xml Data Type1</em>'.
         * @generated
         */
        XmlDataType1 createXmlDataType1();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        MetsPackage getMetsPackage();

} //MetsFactory
