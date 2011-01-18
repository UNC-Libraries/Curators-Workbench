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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Sec Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.FileSecType#getFileGrp <em>File Grp</em>}</li>
 *   <li>{@link gov.loc.mets.FileSecType#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getFileSecType()
 * @model extendedMetaData="name='fileSec_._type' kind='elementOnly'"
 * @generated
 */
public interface FileSecType extends EObject {
        /**
         * Returns the value of the '<em><b>File Grp</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.FileGrpType1}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 									A sequence of file group elements &lt;fileGrp&gt; can be used group the digital files comprising the content of a METS object either into a flat arrangement or, because each file group element can itself contain one or more  file group elements,  into a nested (hierarchical) arrangement. In the case where the content files are images of different formats and resolutions, for example, one could group the image content files by format and create a separate &lt;fileGrp&gt; for each image format/resolution such as:
         * -- one &lt;fileGrp&gt; for the thumbnails of the images
         * -- one &lt;fileGrp&gt; for the higher resolution JPEGs of the image 
         * -- one &lt;fileGrp&gt; for the master archival TIFFs of the images 
         * For a text resource with a variety of content file types one might group the content files at the highest level by type,  and then use the &lt;fileGrp&gt; element’s nesting capabilities to subdivide a &lt;fileGrp&gt; by format within the type, such as:
         * -- one &lt;fileGrp&gt; for all of the page images with nested &lt;fileGrp&gt; elements for each image format/resolution (tiff, jpeg, gif)
         * -- one &lt;fileGrp&gt; for a PDF version of all the pages of the document 
         * -- one &lt;fileGrp&gt; for  a TEI encoded XML version of the entire document or each of its pages.
         * A &lt;fileGrp&gt; may contain zero or more &lt;fileGrp&gt; elements and or &lt;file&gt; elements.					
         * 								
         * <!-- end-model-doc -->
         * @return the value of the '<em>File Grp</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getFileSecType_FileGrp()
         * @model containment="true" required="true"
         *        extendedMetaData="kind='element' name='fileGrp' namespace='##targetNamespace'"
         * @generated
         */
        EList<FileGrpType1> getFileGrp();

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
         * @see gov.loc.mets.MetsPackage#getFileSecType_ID()
         * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
         *        extendedMetaData="kind='attribute' name='ID'"
         * @generated
         */
        String getID();

        /**
         * Sets the value of the '{@link gov.loc.mets.FileSecType#getID <em>ID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ID</em>' attribute.
         * @see #getID()
         * @generated
         */
        void setID(String value);

} // FileSecType
