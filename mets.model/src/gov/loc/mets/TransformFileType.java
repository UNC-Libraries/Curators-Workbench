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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.TransformFileType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.TransformFileType#getTRANSFORMALGORITHM <em>TRANSFORMALGORITHM</em>}</li>
 *   <li>{@link gov.loc.mets.TransformFileType#getTRANSFORMBEHAVIOR <em>TRANSFORMBEHAVIOR</em>}</li>
 *   <li>{@link gov.loc.mets.TransformFileType#getTRANSFORMKEY <em>TRANSFORMKEY</em>}</li>
 *   <li>{@link gov.loc.mets.TransformFileType#getTRANSFORMORDER <em>TRANSFORMORDER</em>}</li>
 *   <li>{@link gov.loc.mets.TransformFileType#getTRANSFORMTYPE <em>TRANSFORMTYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getTransformFileType()
 * @model extendedMetaData="name='transformFile_._type' kind='empty'"
 * @generated
 */
public interface TransformFileType extends EObject {
        /**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID (ID/O): This attribute uniquely identifies the element within the METS document, and would allow the element to be referenced unambiguously from another element or document via an IDREF or an XPTR. For more information on using ID attributes for internal and external linking see Chapter 4 of the METS Primer.
	 * 									
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see gov.loc.mets.MetsPackage#getTransformFileType_ID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
        String getID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.TransformFileType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
        void setID(String value);

        /**
	 * Returns the value of the '<em><b>TRANSFORMALGORITHM</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TRANSFORM-ALGORITHM (string/R): Specifies the decompression or decryption routine used to access the contents of the file. Algorithms for compression can be either loss-less or lossy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TRANSFORMALGORITHM</em>' attribute.
	 * @see #setTRANSFORMALGORITHM(String)
	 * @see gov.loc.mets.MetsPackage#getTransformFileType_TRANSFORMALGORITHM()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='TRANSFORMALGORITHM'"
	 * @generated
	 */
        String getTRANSFORMALGORITHM();

        /**
	 * Sets the value of the '{@link gov.loc.mets.TransformFileType#getTRANSFORMALGORITHM <em>TRANSFORMALGORITHM</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TRANSFORMALGORITHM</em>' attribute.
	 * @see #getTRANSFORMALGORITHM()
	 * @generated
	 */
        void setTRANSFORMALGORITHM(String value);

        /**
	 * Returns the value of the '<em><b>TRANSFORMBEHAVIOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TRANSFORMBEHAVIOR (string/O): An IDREF to a behavior element for this transformation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TRANSFORMBEHAVIOR</em>' attribute.
	 * @see #setTRANSFORMBEHAVIOR(String)
	 * @see gov.loc.mets.MetsPackage#getTransformFileType_TRANSFORMBEHAVIOR()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='TRANSFORMBEHAVIOR'"
	 * @generated
	 */
        String getTRANSFORMBEHAVIOR();

        /**
	 * Sets the value of the '{@link gov.loc.mets.TransformFileType#getTRANSFORMBEHAVIOR <em>TRANSFORMBEHAVIOR</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TRANSFORMBEHAVIOR</em>' attribute.
	 * @see #getTRANSFORMBEHAVIOR()
	 * @generated
	 */
        void setTRANSFORMBEHAVIOR(String value);

        /**
	 * Returns the value of the '<em><b>TRANSFORMKEY</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TRANSFORMKEY (string/O): A key to be used with the transform algorithm for accessing the file’s contents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TRANSFORMKEY</em>' attribute.
	 * @see #setTRANSFORMKEY(String)
	 * @see gov.loc.mets.MetsPackage#getTransformFileType_TRANSFORMKEY()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='TRANSFORMKEY'"
	 * @generated
	 */
        String getTRANSFORMKEY();

        /**
	 * Sets the value of the '{@link gov.loc.mets.TransformFileType#getTRANSFORMKEY <em>TRANSFORMKEY</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TRANSFORMKEY</em>' attribute.
	 * @see #getTRANSFORMKEY()
	 * @generated
	 */
        void setTRANSFORMKEY(String value);

        /**
	 * Returns the value of the '<em><b>TRANSFORMORDER</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TRANSFORMORDER (postive-integer/R): The order in which the instructions must be followed in order to unpack or transform the container file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TRANSFORMORDER</em>' attribute.
	 * @see #setTRANSFORMORDER(BigInteger)
	 * @see gov.loc.mets.MetsPackage#getTransformFileType_TRANSFORMORDER()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='TRANSFORMORDER'"
	 * @generated
	 */
        BigInteger getTRANSFORMORDER();

        /**
	 * Sets the value of the '{@link gov.loc.mets.TransformFileType#getTRANSFORMORDER <em>TRANSFORMORDER</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TRANSFORMORDER</em>' attribute.
	 * @see #getTRANSFORMORDER()
	 * @generated
	 */
        void setTRANSFORMORDER(BigInteger value);

        /**
	 * Returns the value of the '<em><b>TRANSFORMTYPE</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mets.TRANSFORMTYPEType}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TRANSFORMTYPE (string/R): Is used to indicate the type of transformation needed to render content of a file accessible. This may include unpacking a file into subsidiary files/streams. The controlled value constraints for this XML string include “decompression” and “decryption”. Decompression is defined as the action of reversing data compression, i.e., the process of encoding information using fewer bits than an unencoded representation would use by means of specific encoding schemas. Decryption is defined as the process of restoring data that has been obscured to make it unreadable without special knowledge (encrypted data) to its original form. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TRANSFORMTYPE</em>' attribute.
	 * @see gov.loc.mets.TRANSFORMTYPEType
	 * @see #isSetTRANSFORMTYPE()
	 * @see #unsetTRANSFORMTYPE()
	 * @see #setTRANSFORMTYPE(TRANSFORMTYPEType)
	 * @see gov.loc.mets.MetsPackage#getTransformFileType_TRANSFORMTYPE()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='TRANSFORMTYPE'"
	 * @generated
	 */
        TRANSFORMTYPEType getTRANSFORMTYPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.TransformFileType#getTRANSFORMTYPE <em>TRANSFORMTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TRANSFORMTYPE</em>' attribute.
	 * @see gov.loc.mets.TRANSFORMTYPEType
	 * @see #isSetTRANSFORMTYPE()
	 * @see #unsetTRANSFORMTYPE()
	 * @see #getTRANSFORMTYPE()
	 * @generated
	 */
        void setTRANSFORMTYPE(TRANSFORMTYPEType value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.TransformFileType#getTRANSFORMTYPE <em>TRANSFORMTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetTRANSFORMTYPE()
	 * @see #getTRANSFORMTYPE()
	 * @see #setTRANSFORMTYPE(TRANSFORMTYPEType)
	 * @generated
	 */
        void unsetTRANSFORMTYPE();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.TransformFileType#getTRANSFORMTYPE <em>TRANSFORMTYPE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>TRANSFORMTYPE</em>' attribute is set.
	 * @see #unsetTRANSFORMTYPE()
	 * @see #getTRANSFORMTYPE()
	 * @see #setTRANSFORMTYPE(TRANSFORMTYPEType)
	 * @generated
	 */
        boolean isSetTRANSFORMTYPE();

} // TransformFileType
