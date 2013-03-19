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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fptr Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.FptrType#getPar <em>Par</em>}</li>
 *   <li>{@link gov.loc.mets.FptrType#getSeq <em>Seq</em>}</li>
 *   <li>{@link gov.loc.mets.FptrType#getArea <em>Area</em>}</li>
 *   <li>{@link gov.loc.mets.FptrType#getCONTENTIDS <em>CONTENTIDS</em>}</li>
 *   <li>{@link gov.loc.mets.FptrType#getFILEID <em>FILEID</em>}</li>
 *   <li>{@link gov.loc.mets.FptrType#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getFptrType()
 * @model extendedMetaData="name='fptr_._type' kind='elementOnly'"
 * @generated
 */
public interface FptrType extends EObject {
        /**
	 * Returns the value of the '<em><b>Par</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * 									The &lt;par&gt; or parallel files element aggregates pointers to files, parts of files, and/or sequences of files or parts of files that must be played or displayed simultaneously to manifest a block of digital content represented by an &lt;fptr&gt; element. This might be the case, for example, with multi-media content, where a still image might have an accompanying audio track that comments on the still image. In this case, a &lt;par&gt; element would aggregate two &lt;area&gt; elements, one of which pointed to the image file and one of which pointed to the audio file that must be played in conjunction with the image. The &lt;area&gt; element associated with the image could be further qualified with SHAPE and COORDS attributes if only a portion of the image file was pertinent and the &lt;area&gt; element associated with the audio file could be further qualified with BETYPE, BEGIN, EXTTYPE, and EXTENT attributes if only a portion of the associated audio file should be played in conjunction with the image.
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Par</em>' containment reference.
	 * @see #setPar(ParType)
	 * @see gov.loc.mets.MetsPackage#getFptrType_Par()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='par' namespace='##targetNamespace'"
	 * @generated
	 */
        ParType getPar();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FptrType#getPar <em>Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Par</em>' containment reference.
	 * @see #getPar()
	 * @generated
	 */
        void setPar(ParType value);

        /**
	 * Returns the value of the '<em><b>Seq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *   
	 * 									The sequence of files element &lt;seq&gt; aggregates pointers to files,  parts of files and/or parallel sets of files or parts of files  that must be played or displayed sequentially to manifest a block of digital content. This might be the case, for example, if the parent &lt;div&gt; element represented a logical division, such as a diary entry, that spanned multiple pages of a diary and, hence, multiple page image files. In this case, a &lt;seq&gt; element would aggregate multiple, sequentially arranged &lt;area&gt; elements, each of which pointed to one of the image files that must be presented sequentially to manifest the entire diary entry. If the diary entry started in the middle of a page, then the first &lt;area&gt; element (representing the page on which the diary entry starts) might be further qualified, via its SHAPE and COORDS attributes, to specify the specific, pertinent area of the associated image file.
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seq</em>' containment reference.
	 * @see #setSeq(SeqType)
	 * @see gov.loc.mets.MetsPackage#getFptrType_Seq()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seq' namespace='##targetNamespace'"
	 * @generated
	 */
        SeqType getSeq();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FptrType#getSeq <em>Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq</em>' containment reference.
	 * @see #getSeq()
	 * @generated
	 */
        void setSeq(SeqType value);

        /**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * 									The area element &lt;area&gt; typically points to content consisting of just a portion or area of a file represented by a &lt;file&gt; element in the &lt;fileSec&gt;. In some contexts, however, the &lt;area&gt; element can also point to content represented by an integral file. A single &lt;area&gt; element would appear as the direct child of a &lt;fptr&gt; element when only a portion of a &lt;file&gt;, rather than an integral &lt;file&gt;, manifested the digital content represented by the &lt;fptr&gt;. Multiple &lt;area&gt; elements would appear as the direct children of a &lt;par&gt; element or a &lt;seq&gt; element when multiple files or parts of files manifested the digital content represented by an &lt;fptr&gt; element. When used in the context of a &lt;par&gt; or &lt;seq&gt; element an &lt;area&gt; element can point either to an integral file or to a segment of a file as necessary.
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area</em>' containment reference.
	 * @see #setArea(AreaType)
	 * @see gov.loc.mets.MetsPackage#getFptrType_Area()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='area' namespace='##targetNamespace'"
	 * @generated
	 */
        AreaType getArea();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FptrType#getArea <em>Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' containment reference.
	 * @see #getArea()
	 * @generated
	 */
        void setArea(AreaType value);

        /**
	 * Returns the value of the '<em><b>CONTENTIDS</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CONTENTIDS (URI/O): Content IDs for the content represented by the &lt;fptr&gt; (equivalent to DIDL DII or Digital Item Identifier, a unique external ID).
	 * 				            
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CONTENTIDS</em>' attribute.
	 * @see #setCONTENTIDS(List)
	 * @see gov.loc.mets.MetsPackage#getFptrType_CONTENTIDS()
	 * @model dataType="gov.loc.mets.URIs" many="false"
	 *        extendedMetaData="kind='attribute' name='CONTENTIDS'"
	 * @generated
	 */
        List<String> getCONTENTIDS();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FptrType#getCONTENTIDS <em>CONTENTIDS</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTENTIDS</em>' attribute.
	 * @see #getCONTENTIDS()
	 * @generated
	 */
        void setCONTENTIDS(List<String> value);

        /**
	 * Returns the value of the '<em><b>FILEID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FILEID (IDREF/O): An optional attribute that provides the XML ID identifying the &lt;file&gt; element that links to and/or contains the digital content represented by the &lt;fptr&gt;. A &lt;fptr&gt; element should only have a FILEID attribute value if it does not have a child &lt;area&gt;, &lt;par&gt; or &lt;seq&gt; element. If it has a child element, then the responsibility for pointing to the relevant content falls to this child element or its descendants.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FILEID</em>' attribute.
	 * @see #setFILEID(String)
	 * @see gov.loc.mets.MetsPackage#getFptrType_FILEID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='FILEID'"
	 * @generated
	 */
        String getFILEID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FptrType#getFILEID <em>FILEID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FILEID</em>' attribute.
	 * @see #getFILEID()
	 * @generated
	 */
        void setFILEID(String value);

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
	 * @see gov.loc.mets.MetsPackage#getFptrType_ID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
        String getID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FptrType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
        void setID(String value);

} // FptrType
