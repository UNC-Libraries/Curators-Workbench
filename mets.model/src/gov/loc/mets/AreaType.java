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
 * A representation of the model object '<em><b>Area Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * areaType: Complex Type for Area Linking
 * 				The area element provides for more sophisticated linking between a div element and content files representing that div, be they text, image, audio, or video files.  An area element can link a div to a point within a file, to a one-dimension segment of a file (e.g., text segment, image line, audio/video clip), or a two-dimensional section of a file 	(e.g, subsection of an image, or a subsection of the  video display of a video file.  The area element has no content; all information is recorded within its various attributes.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.AreaType#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.AreaType#getBEGIN <em>BEGIN</em>}</li>
 *   <li>{@link gov.loc.mets.AreaType#getBETYPE <em>BETYPE</em>}</li>
 *   <li>{@link gov.loc.mets.AreaType#getCONTENTIDS <em>CONTENTIDS</em>}</li>
 *   <li>{@link gov.loc.mets.AreaType#getCOORDS <em>COORDS</em>}</li>
 *   <li>{@link gov.loc.mets.AreaType#getEND <em>END</em>}</li>
 *   <li>{@link gov.loc.mets.AreaType#getEXTENT <em>EXTENT</em>}</li>
 *   <li>{@link gov.loc.mets.AreaType#getEXTTYPE <em>EXTTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.AreaType#getFILEID <em>FILEID</em>}</li>
 *   <li>{@link gov.loc.mets.AreaType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.AreaType#getSHAPE <em>SHAPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getAreaType()
 * @model extendedMetaData="name='areaType' kind='empty'"
 * @generated
 */
public interface AreaType extends EObject {
        /**
	 * Returns the value of the '<em><b>ADMID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ADMID (IDREFS/O): Contains the ID attribute values identifying the &lt;rightsMD&gt;, &lt;sourceMD&gt;, &lt;techMD&gt; and/or &lt;digiprovMD&gt; elements within the &lt;amdSec&gt; of the METS document that contain or link to administrative metadata pertaining to the content represented by the &lt;area&gt; element. Typically the &lt;area&gt; ADMID attribute would be used to identify the &lt;rightsMD&gt; element or elements that pertain to the &lt;area&gt;, but it could be used anytime there was a need to link an &lt;area&gt; with pertinent administrative metadata. For more information on using METS IDREFS and IDREF type attributes for internal linking, see Chapter 4 of the METS Primer
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ADMID</em>' attribute.
	 * @see #setADMID(List)
	 * @see gov.loc.mets.MetsPackage#getAreaType_ADMID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='ADMID'"
	 * @generated
	 */
        List<String> getADMID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.AreaType#getADMID <em>ADMID</em>}' attribute.
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
	 * BEGIN (string/O): An attribute that specifies the point in the content file where the relevant section of content begins. It can be used in conjunction with either the END attribute or the EXTENT attribute as a means of defining the relevant portion of the referenced file precisely. It can only be interpreted meaningfully in conjunction with the BETYPE or EXTTYPE, which specify the kind of beginning/ending point values or beginning/extent values that are being used. The BEGIN attribute can be used with or without a companion END or EXTENT element. In this case, the end of the content file is assumed to be the end point.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BEGIN</em>' attribute.
	 * @see #setBEGIN(String)
	 * @see gov.loc.mets.MetsPackage#getAreaType_BEGIN()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='BEGIN'"
	 * @generated
	 */
        String getBEGIN();

        /**
	 * Sets the value of the '{@link gov.loc.mets.AreaType#getBEGIN <em>BEGIN</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BEGIN</em>' attribute.
	 * @see #getBEGIN()
	 * @generated
	 */
        void setBEGIN(String value);

        /**
	 * Returns the value of the '<em><b>BETYPE</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mets.BETYPEType}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BETYPE: Begin/End Type.
	 * 					BETYPE (string/O): An attribute that specifies the kind of BEGIN and/or END values that are being used. For example, if BYTE is specified, then the BEGIN and END point values represent the byte offsets into a file. If IDREF is specified, then the BEGIN element specifies the ID value that identifies the element in a structured text file where the relevant section of the file begins; and the END value (if present) would specify the ID value that identifies the element with which the relevant section of the file ends. Must be one of the following values: 
	 * BYTE
	 * IDREF
	 * SMIL
	 * MIDI
	 * SMPTE-25
	 * SMPTE-24
	 * SMPTE-DF30
	 * SMPTE-NDF30
	 * SMPTE-DF29.97
	 * SMPTE-NDF29.97
	 * TIME
	 * TCF
	 * XPTR
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BETYPE</em>' attribute.
	 * @see gov.loc.mets.BETYPEType
	 * @see #isSetBETYPE()
	 * @see #unsetBETYPE()
	 * @see #setBETYPE(BETYPEType)
	 * @see gov.loc.mets.MetsPackage#getAreaType_BETYPE()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='BETYPE'"
	 * @generated
	 */
        BETYPEType getBETYPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.AreaType#getBETYPE <em>BETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BETYPE</em>' attribute.
	 * @see gov.loc.mets.BETYPEType
	 * @see #isSetBETYPE()
	 * @see #unsetBETYPE()
	 * @see #getBETYPE()
	 * @generated
	 */
        void setBETYPE(BETYPEType value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.AreaType#getBETYPE <em>BETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetBETYPE()
	 * @see #getBETYPE()
	 * @see #setBETYPE(BETYPEType)
	 * @generated
	 */
        void unsetBETYPE();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.AreaType#getBETYPE <em>BETYPE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>BETYPE</em>' attribute is set.
	 * @see #unsetBETYPE()
	 * @see #getBETYPE()
	 * @see #setBETYPE(BETYPEType)
	 * @generated
	 */
        boolean isSetBETYPE();

        /**
	 * Returns the value of the '<em><b>CONTENTIDS</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CONTENTIDS (URI/O): Content IDs for the content represented by the &lt;area&gt; (equivalent to DIDL DII or Digital Item Identifier, a unique external ID).
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CONTENTIDS</em>' attribute.
	 * @see #setCONTENTIDS(List)
	 * @see gov.loc.mets.MetsPackage#getAreaType_CONTENTIDS()
	 * @model dataType="gov.loc.mets.URIs" many="false"
	 *        extendedMetaData="kind='attribute' name='CONTENTIDS'"
	 * @generated
	 */
        List<String> getCONTENTIDS();

        /**
	 * Sets the value of the '{@link gov.loc.mets.AreaType#getCONTENTIDS <em>CONTENTIDS</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTENTIDS</em>' attribute.
	 * @see #getCONTENTIDS()
	 * @generated
	 */
        void setCONTENTIDS(List<String> value);

        /**
	 * Returns the value of the '<em><b>COORDS</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * COORDS (string/O): Specifies the coordinates in an image map for the shape of the pertinent area as specified in the SHAPE attribute. While technically optional, SHAPE and COORDS must both appear together to define the relevant area of image content. COORDS should be used in conjunction with SHAPE in the manner defined for the COORDs and SHAPE attributes on an HTML4 &lt;area&gt; element. COORDS must be a comma delimited string of integer value pairs representing coordinates (plus radius in the case of CIRCLE) within an image map. Number of coordinates pairs depends on shape: RECT: x1, y1, x2, y2; CIRC: x1, y1; POLY: x1, y1, x2, y2, x3, y3 . . .
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>COORDS</em>' attribute.
	 * @see #setCOORDS(String)
	 * @see gov.loc.mets.MetsPackage#getAreaType_COORDS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='COORDS'"
	 * @generated
	 */
        String getCOORDS();

        /**
	 * Sets the value of the '{@link gov.loc.mets.AreaType#getCOORDS <em>COORDS</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COORDS</em>' attribute.
	 * @see #getCOORDS()
	 * @generated
	 */
        void setCOORDS(String value);

        /**
	 * Returns the value of the '<em><b>END</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * END (string/O): An attribute that specifies the point in the content file where the relevant section of content ends. It can only be interpreted meaningfully in conjunction with the BETYPE, which specifies the kind of ending point values being used. Typically the END attribute would only appear in conjunction with a BEGIN element.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>END</em>' attribute.
	 * @see #setEND(String)
	 * @see gov.loc.mets.MetsPackage#getAreaType_END()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='END'"
	 * @generated
	 */
        String getEND();

        /**
	 * Sets the value of the '{@link gov.loc.mets.AreaType#getEND <em>END</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>END</em>' attribute.
	 * @see #getEND()
	 * @generated
	 */
        void setEND(String value);

        /**
	 * Returns the value of the '<em><b>EXTENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EXTENT (string/O): An attribute that specifies the extent of the relevant section of the content file. Can only be interpreted meaningfully in conjunction with the EXTTYPE which specifies the kind of value that is being used. Typically the EXTENT attribute would only appear in conjunction with a BEGIN element and would not be used if the BEGIN point represents an IDREF.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EXTENT</em>' attribute.
	 * @see #setEXTENT(String)
	 * @see gov.loc.mets.MetsPackage#getAreaType_EXTENT()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='EXTENT'"
	 * @generated
	 */
        String getEXTENT();

        /**
	 * Sets the value of the '{@link gov.loc.mets.AreaType#getEXTENT <em>EXTENT</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EXTENT</em>' attribute.
	 * @see #getEXTENT()
	 * @generated
	 */
        void setEXTENT(String value);

        /**
	 * Returns the value of the '<em><b>EXTTYPE</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mets.EXTTYPEType}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EXTTYPE (string/O): An attribute that specifies the kind of EXTENT values that are being used. For example if BYTE is specified then EXTENT would represent a byte count. If TIME is specified the EXTENT would represent a duration of time. EXTTYPE must be one of the following values: 
	 * BYTE
	 * SMIL
	 * MIDI
	 * SMPTE-25
	 * SMPTE-24
	 * SMPTE-DF30
	 * SMPTE-NDF30
	 * SMPTE-DF29.97
	 * SMPTE-NDF29.97
	 * TIME
	 * TCF.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EXTTYPE</em>' attribute.
	 * @see gov.loc.mets.EXTTYPEType
	 * @see #isSetEXTTYPE()
	 * @see #unsetEXTTYPE()
	 * @see #setEXTTYPE(EXTTYPEType)
	 * @see gov.loc.mets.MetsPackage#getAreaType_EXTTYPE()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='EXTTYPE'"
	 * @generated
	 */
        EXTTYPEType getEXTTYPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.AreaType#getEXTTYPE <em>EXTTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EXTTYPE</em>' attribute.
	 * @see gov.loc.mets.EXTTYPEType
	 * @see #isSetEXTTYPE()
	 * @see #unsetEXTTYPE()
	 * @see #getEXTTYPE()
	 * @generated
	 */
        void setEXTTYPE(EXTTYPEType value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.AreaType#getEXTTYPE <em>EXTTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetEXTTYPE()
	 * @see #getEXTTYPE()
	 * @see #setEXTTYPE(EXTTYPEType)
	 * @generated
	 */
        void unsetEXTTYPE();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.AreaType#getEXTTYPE <em>EXTTYPE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>EXTTYPE</em>' attribute is set.
	 * @see #unsetEXTTYPE()
	 * @see #getEXTTYPE()
	 * @see #setEXTTYPE(EXTTYPEType)
	 * @generated
	 */
        boolean isSetEXTTYPE();

        /**
	 * Returns the value of the '<em><b>FILEID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FILEID (IDREF/R): An attribute which provides the XML ID value that identifies the &lt;file&gt; element in the &lt;fileSec&gt; that then points to and/or contains the digital content represented by the &lt;area&gt; element. It must contain an ID value represented in an ID attribute associated with a &lt;file&gt; element in the &lt;fileSec&gt; element in the same METS document.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FILEID</em>' attribute.
	 * @see #setFILEID(String)
	 * @see gov.loc.mets.MetsPackage#getAreaType_FILEID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='FILEID'"
	 * @generated
	 */
        String getFILEID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.AreaType#getFILEID <em>FILEID</em>}' attribute.
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
	 * @see gov.loc.mets.MetsPackage#getAreaType_ID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
        String getID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.AreaType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
        void setID(String value);

        /**
	 * Returns the value of the '<em><b>SHAPE</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mets.SHAPEType}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SHAPE (string/O): An attribute that can be used as in HTML to define the shape of the relevant area within the content file pointed to by the &lt;area&gt; element. Typically this would be used with image content (still image or video frame) when only a portion of an integal image map pertains. If SHAPE is specified then COORDS must also be present. SHAPE should be used in conjunction with COORDS in the manner defined for the shape and coords attributes on an HTML4 &lt;area&gt; element. SHAPE must contain one of the following values: 
	 * RECT 
	 * CIRCLE
	 * POLY
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SHAPE</em>' attribute.
	 * @see gov.loc.mets.SHAPEType
	 * @see #isSetSHAPE()
	 * @see #unsetSHAPE()
	 * @see #setSHAPE(SHAPEType)
	 * @see gov.loc.mets.MetsPackage#getAreaType_SHAPE()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='SHAPE'"
	 * @generated
	 */
        SHAPEType getSHAPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.AreaType#getSHAPE <em>SHAPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SHAPE</em>' attribute.
	 * @see gov.loc.mets.SHAPEType
	 * @see #isSetSHAPE()
	 * @see #unsetSHAPE()
	 * @see #getSHAPE()
	 * @generated
	 */
        void setSHAPE(SHAPEType value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.AreaType#getSHAPE <em>SHAPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetSHAPE()
	 * @see #getSHAPE()
	 * @see #setSHAPE(SHAPEType)
	 * @generated
	 */
        void unsetSHAPE();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.AreaType#getSHAPE <em>SHAPE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SHAPE</em>' attribute is set.
	 * @see #unsetSHAPE()
	 * @see #getSHAPE()
	 * @see #setSHAPE(SHAPEType)
	 * @generated
	 */
        boolean isSetSHAPE();

} // AreaType
