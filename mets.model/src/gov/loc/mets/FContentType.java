/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FContent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.FContentType#getBinData <em>Bin Data</em>}</li>
 *   <li>{@link gov.loc.mets.FContentType#getXmlData <em>Xml Data</em>}</li>
 *   <li>{@link gov.loc.mets.FContentType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.FContentType#getUSE <em>USE</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getFContentType()
 * @model extendedMetaData="name='FContent_._type' kind='elementOnly'"
 * @generated
 */
public interface FContentType extends EObject {
        /**
         * Returns the value of the '<em><b>Bin Data</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 									A binary data wrapper element &lt;binData&gt; is used to contain a Base64 encoded file.
         * 								
         * <!-- end-model-doc -->
         * @return the value of the '<em>Bin Data</em>' attribute.
         * @see #setBinData(byte[])
         * @see gov.loc.mets.MetsPackage#getFContentType_BinData()
         * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
         *        extendedMetaData="kind='element' name='binData' namespace='##targetNamespace'"
         * @generated
         */
        byte[] getBinData();

        /**
         * Sets the value of the '{@link gov.loc.mets.FContentType#getBinData <em>Bin Data</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Bin Data</em>' attribute.
         * @see #getBinData()
         * @generated
         */
        void setBinData(byte[] value);

        /**
         * Returns the value of the '<em><b>Xml Data</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 									An xml data wrapper element &lt;xmlData&gt; is used to contain  an XML encoded file. The content of an &lt;xmlData&gt; element can be in any namespace or in no namespace. As permitted by the XML Schema Standard, the processContents attribute value for the metadata in an &lt;xmlData&gt; element is set to “lax”. Therefore, if the source schema and its location are identified by means of an xsi:schemaLocation attribute, then an XML processor will validate the elements for which it can find declarations. If a source schema is not identified, or cannot be found at the specified schemaLocation, then an XML validator will check for well-formedness, but otherwise skip over the elements appearing in the &lt;xmlData&gt; element.
         * 								
         * <!-- end-model-doc -->
         * @return the value of the '<em>Xml Data</em>' containment reference.
         * @see #setXmlData(XmlDataType)
         * @see gov.loc.mets.MetsPackage#getFContentType_XmlData()
         * @model containment="true"
         *        extendedMetaData="kind='element' name='xmlData' namespace='##targetNamespace'"
         * @generated
         */
        XmlDataType getXmlData();

        /**
         * Sets the value of the '{@link gov.loc.mets.FContentType#getXmlData <em>Xml Data</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Xml Data</em>' containment reference.
         * @see #getXmlData()
         * @generated
         */
        void setXmlData(XmlDataType value);

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
         * @see gov.loc.mets.MetsPackage#getFContentType_ID()
         * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
         *        extendedMetaData="kind='attribute' name='ID'"
         * @generated
         */
        String getID();

        /**
         * Sets the value of the '{@link gov.loc.mets.FContentType#getID <em>ID</em>}' attribute.
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
         * USE (string/O): A tagging attribute to indicate the intended use of the specific copy of the file represented by the &lt;FContent&gt; element (e.g., service master, archive master). A USE attribute can be expressed at the&lt;fileGrp&gt; level, the &lt;file&gt; level, the &lt;FLocat&gt; level and/or the &lt;FContent&gt; level.  A USE attribute value at the &lt;fileGrp&gt; level should pertain to all of the files in the &lt;fileGrp&gt;.  A USE attribute at the &lt;file&gt; level should pertain to all copies of the file as represented by subsidiary &lt;FLocat&gt; and/or &lt;FContent&gt; elements.  A USE attribute at the &lt;FLocat&gt; or &lt;FContent&gt; level pertains to the particular copy of the file that is either referenced (&lt;FLocat&gt;) or wrapped (&lt;FContent&gt;).
         * 							
         * <!-- end-model-doc -->
         * @return the value of the '<em>USE</em>' attribute.
         * @see #setUSE(String)
         * @see gov.loc.mets.MetsPackage#getFContentType_USE()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='USE'"
         * @generated
         */
        String getUSE();

        /**
         * Sets the value of the '{@link gov.loc.mets.FContentType#getUSE <em>USE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>USE</em>' attribute.
         * @see #getUSE()
         * @generated
         */
        void setUSE(String value);

} // FContentType
