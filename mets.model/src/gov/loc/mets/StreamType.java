/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.StreamType#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.StreamType#getBEGIN <em>BEGIN</em>}</li>
 *   <li>{@link gov.loc.mets.StreamType#getBETYPE <em>BETYPE</em>}</li>
 *   <li>{@link gov.loc.mets.StreamType#getDMDID <em>DMDID</em>}</li>
 *   <li>{@link gov.loc.mets.StreamType#getEND <em>END</em>}</li>
 *   <li>{@link gov.loc.mets.StreamType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.StreamType#getOWNERID <em>OWNERID</em>}</li>
 *   <li>{@link gov.loc.mets.StreamType#getStreamType <em>Stream Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getStreamType()
 * @model extendedMetaData="name='stream_._type' kind='empty'"
 * @generated
 */
public interface StreamType extends EObject {
        /**
	 * Returns the value of the '<em><b>ADMID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ADMID (IDREFS/O): Contains the ID attribute values of the &lt;techMD&gt;, &lt;sourceMD&gt;, &lt;rightsMD&gt; and/or &lt;digiprovMD&gt; elements within the &lt;amdSec&gt; of the METS document that contain administrative metadata pertaining to the bytestream. For more information on using METS IDREFS and IDREF type attributes for internal linking, see Chapter 4 of the METS Primer.
	 * 									
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ADMID</em>' attribute.
	 * @see #setADMID(List)
	 * @see gov.loc.mets.MetsPackage#getStreamType_ADMID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='ADMID'"
	 * @generated
	 */
        List<String> getADMID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.StreamType#getADMID <em>ADMID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADMID</em>' attribute.
	 * @see #getADMID()
	 * @generated
	 */
        void setADMID(List<String> value);

        /**
	 * Returns the value of the '<em><b>BEGIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BEGIN (string/O): An attribute that specifies the point in the parent &lt;file&gt; where the current &lt;stream&gt; begins. It can be used in conjunction with the END attribute as a means of defining the location of the stream within its parent file. However, the BEGIN attribute can be used with or without a companion END attribute. When no END attribute is specified, the end of the parent file is assumed also to be the end point of the stream. The BEGIN and END attributes can only be interpreted meaningfully in conjunction with a BETYPE attribute, which specifies the kind of beginning/ending point values that are being used. 
	 * 									
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BEGIN</em>' attribute.
	 * @see #setBEGIN(String)
	 * @see gov.loc.mets.MetsPackage#getStreamType_BEGIN()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='BEGIN'"
	 * @generated
	 */
        String getBEGIN();

        /**
	 * Sets the value of the '{@link gov.loc.mets.StreamType#getBEGIN <em>BEGIN</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BEGIN</em>' attribute.
	 * @see #getBEGIN()
	 * @generated
	 */
        void setBEGIN(String value);

        /**
	 * Returns the value of the '<em><b>BETYPE</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mets.BETYPEType2}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BETYPE: Begin/End Type.
	 * 										BETYPE (string/O): An attribute that specifies the kind of BEGIN and/or END values that are being used. Currently BYTE is the only valid value that can be used in conjunction with nested &lt;file&gt; or &lt;stream&gt; elements. 
	 * 									
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BETYPE</em>' attribute.
	 * @see gov.loc.mets.BETYPEType2
	 * @see #isSetBETYPE()
	 * @see #unsetBETYPE()
	 * @see #setBETYPE(BETYPEType2)
	 * @see gov.loc.mets.MetsPackage#getStreamType_BETYPE()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='BETYPE'"
	 * @generated
	 */
        BETYPEType2 getBETYPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.StreamType#getBETYPE <em>BETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BETYPE</em>' attribute.
	 * @see gov.loc.mets.BETYPEType2
	 * @see #isSetBETYPE()
	 * @see #unsetBETYPE()
	 * @see #getBETYPE()
	 * @generated
	 */
        void setBETYPE(BETYPEType2 value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.StreamType#getBETYPE <em>BETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetBETYPE()
	 * @see #getBETYPE()
	 * @see #setBETYPE(BETYPEType2)
	 * @generated
	 */
        void unsetBETYPE();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.StreamType#getBETYPE <em>BETYPE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>BETYPE</em>' attribute is set.
	 * @see #unsetBETYPE()
	 * @see #getBETYPE()
	 * @see #setBETYPE(BETYPEType2)
	 * @generated
	 */
        boolean isSetBETYPE();

        /**
	 * Returns the value of the '<em><b>DMDID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DMDID (IDREFS/O): Contains the ID attribute values identifying the &lt;dmdSec&gt;, elements in the METS document that contain or link to descriptive metadata pertaining to the content file stream represented by the current &lt;stream&gt; element.  For more information on using METS IDREFS and IDREF type attributes for internal linking, see Chapter 4 of the METS Primer.
	 * 									
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DMDID</em>' attribute.
	 * @see #setDMDID(List)
	 * @see gov.loc.mets.MetsPackage#getStreamType_DMDID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='DMDID'"
	 * @generated
	 */
        List<String> getDMDID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.StreamType#getDMDID <em>DMDID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMDID</em>' attribute.
	 * @see #getDMDID()
	 * @generated
	 */
        void setDMDID(List<String> value);

        /**
	 * Returns the value of the '<em><b>END</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * END (string/O): An attribute that specifies the point in the parent &lt;file&gt; where the &lt;stream&gt; ends. It can only be interpreted meaningfully in conjunction with the BETYPE, which specifies the kind of ending point values being used. Typically the END attribute would only appear in conjunction with a BEGIN attribute.
	 * 									
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>END</em>' attribute.
	 * @see #setEND(String)
	 * @see gov.loc.mets.MetsPackage#getStreamType_END()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='END'"
	 * @generated
	 */
        String getEND();

        /**
	 * Sets the value of the '{@link gov.loc.mets.StreamType#getEND <em>END</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>END</em>' attribute.
	 * @see #getEND()
	 * @generated
	 */
        void setEND(String value);

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
	 * @see gov.loc.mets.MetsPackage#getStreamType_ID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
        String getID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.StreamType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
        void setID(String value);

        /**
	 * Returns the value of the '<em><b>OWNERID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OWNERID (string/O): Used to provide a unique identifier (which could include a URI) assigned to the file. This identifier may differ from the URI used to retrieve the file.
	 * 									
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OWNERID</em>' attribute.
	 * @see #setOWNERID(String)
	 * @see gov.loc.mets.MetsPackage#getStreamType_OWNERID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='OWNERID'"
	 * @generated
	 */
        String getOWNERID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.StreamType#getOWNERID <em>OWNERID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OWNERID</em>' attribute.
	 * @see #getOWNERID()
	 * @generated
	 */
        void setOWNERID(String value);

        /**
	 * Returns the value of the '<em><b>Stream Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * streamType (string/O): The IANA MIME media type for the bytestream.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stream Type</em>' attribute.
	 * @see #setStreamType(String)
	 * @see gov.loc.mets.MetsPackage#getStreamType_StreamType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='streamType'"
	 * @generated
	 */
        String getStreamType();

        /**
	 * Sets the value of the '{@link gov.loc.mets.StreamType#getStreamType <em>Stream Type</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Type</em>' attribute.
	 * @see #getStreamType()
	 * @generated
	 */
        void setStreamType(String value);

} // StreamType
