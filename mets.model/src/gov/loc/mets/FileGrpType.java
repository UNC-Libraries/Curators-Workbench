/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Grp Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * fileGrpType: Complex Type for File Groups
 * 				The file group is used to cluster all of the digital files composing a digital library object in a hierarchical arrangement (fileGrp is recursively defined to enable the creation of the hierarchy).  Any file group may contain zero or more file elements.  File elements in turn can contain one or more FLocat elements (a pointer to a file containing content for this object) and/or a FContent element (the contents of the file, in either XML or  Base64 encoding).
 * 				
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.FileGrpType#getFileGrp <em>File Grp</em>}</li>
 *   <li>{@link gov.loc.mets.FileGrpType#getFile <em>File</em>}</li>
 *   <li>{@link gov.loc.mets.FileGrpType#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.FileGrpType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.FileGrpType#getUSE <em>USE</em>}</li>
 *   <li>{@link gov.loc.mets.FileGrpType#getVERSDATE <em>VERSDATE</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getFileGrpType()
 * @model extendedMetaData="name='fileGrpType' kind='elementOnly'"
 * @generated
 */
public interface FileGrpType extends EObject {
        /**
	 * Returns the value of the '<em><b>File Grp</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mets.FileGrpType}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>File Grp</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>File Grp</em>' containment reference list.
	 * @see gov.loc.mets.MetsPackage#getFileGrpType_FileGrp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fileGrp' namespace='##targetNamespace'"
	 * @generated
	 */
        EList<FileGrpType> getFileGrp();

        /**
	 * Returns the value of the '<em><b>File</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mets.FileType}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						The file element &lt;file&gt; provides access to the content files for the digital object being described by the METS document. A &lt;file&gt; element may contain one or more &lt;FLocat&gt; elements which provide pointers to a content file and/or a &lt;FContent&gt; element which wraps an encoded version of the file. Embedding files using &lt;FContent&gt; can be a valuable feature for exchanging digital objects between repositories or for archiving versions of digital objects for off-site storage. All &lt;FLocat&gt; and &lt;FContent&gt; elements should identify and/or contain identical copies of a single file. The &lt;file&gt; element is recursive, thus allowing sub-files or component files of a larger file to be listed in the inventory. Alternatively, by using the &lt;stream&gt; element, a smaller component of a file or of a related file can be placed within a &lt;file&gt; element. Finally, by using the &lt;transformFile&gt; element, it is possible to include within a &lt;file&gt; element a different version of a file that has undergone a transformation for some reason, such as format migration.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File</em>' containment reference list.
	 * @see gov.loc.mets.MetsPackage#getFileGrpType_File()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='file' namespace='##targetNamespace'"
	 * @generated
	 */
        EList<FileType> getFile();

        /**
	 * Returns the value of the '<em><b>ADMID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ADMID (IDREF/O): Contains the ID attribute values of the &lt;techMD&gt;, &lt;sourceMD&gt;, &lt;rightsMD&gt; and/or &lt;digiprovMD&gt; elements within the &lt;amdSec&gt; of the METS document applicable to all of the files in a particular file group. For more information on using METS IDREFS and IDREF type attributes for internal linking, see Chapter 4 of the METS Primer.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ADMID</em>' attribute.
	 * @see #setADMID(List)
	 * @see gov.loc.mets.MetsPackage#getFileGrpType_ADMID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='ADMID'"
	 * @generated
	 */
        List<String> getADMID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FileGrpType#getADMID <em>ADMID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADMID</em>' attribute.
	 * @see #getADMID()
	 * @generated
	 */
        void setADMID(List<String> value);

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
	 * @see gov.loc.mets.MetsPackage#getFileGrpType_ID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
        String getID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FileGrpType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
        void setID(String value);

        /**
	 * Returns the value of the '<em><b>USE</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * USE (string/O): A tagging attribute to indicate the intended use of files within this file group (e.g., master, reference, thumbnails for image files). A USE attribute can be expressed at the&lt;fileGrp&gt; level, the &lt;file&gt; level, the &lt;FLocat&gt; level and/or the &lt;FContent&gt; level.  A USE attribute value at the &lt;fileGrp&gt; level should pertain to all of the files in the &lt;fileGrp&gt;.  A USE attribute at the &lt;file&gt; level should pertain to all copies of the file as represented by subsidiary &lt;FLocat&gt; and/or &lt;FContent&gt; elements.  A USE attribute at the &lt;FLocat&gt; or &lt;FContent&gt; level pertains to the particular copy of the file that is either referenced (&lt;FLocat&gt;) or wrapped (&lt;FContent&gt;). 
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>USE</em>' attribute.
	 * @see #setUSE(String)
	 * @see gov.loc.mets.MetsPackage#getFileGrpType_USE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='USE'"
	 * @generated
	 */
        String getUSE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FileGrpType#getUSE <em>USE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>USE</em>' attribute.
	 * @see #getUSE()
	 * @generated
	 */
        void setUSE(String value);

        /**
	 * Returns the value of the '<em><b>VERSDATE</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VERSDATE (dateTime/O): An optional dateTime attribute specifying the date this version/fileGrp of the digital object was created.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VERSDATE</em>' attribute.
	 * @see #setVERSDATE(XMLGregorianCalendar)
	 * @see gov.loc.mets.MetsPackage#getFileGrpType_VERSDATE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='VERSDATE'"
	 * @generated
	 */
        XMLGregorianCalendar getVERSDATE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FileGrpType#getVERSDATE <em>VERSDATE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VERSDATE</em>' attribute.
	 * @see #getVERSDATE()
	 * @generated
	 */
        void setVERSDATE(XMLGregorianCalendar value);

} // FileGrpType
