/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sm Arc Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 										The structMap arc link element &lt;smArcLink&gt; is of xlink:type "arc" It can be used to establish a traversal link between two &lt;div&gt; elements as identified by &lt;smLocatorLink&gt; elements within the same smLinkGrp element. The associated xlink:from and xlink:to attributes identify the from and to sides of the arc link by referencing the xlink:label attribute values on the participating smLocatorLink elements.
 * 									
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.SmArcLinkType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mets.SmArcLinkType#getADMID <em>ADMID</em>}</li>
 *   <li>{@link gov.loc.mets.SmArcLinkType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mets.SmArcLinkType#getARCTYPE <em>ARCTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.SmArcLinkType#getFrom <em>From</em>}</li>
 *   <li>{@link gov.loc.mets.SmArcLinkType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.SmArcLinkType#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mets.SmArcLinkType#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mets.SmArcLinkType#getTo <em>To</em>}</li>
 *   <li>{@link gov.loc.mets.SmArcLinkType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getSmArcLinkType()
 * @model extendedMetaData="name='smArcLink_._type' kind='empty'"
 * @generated
 */
public interface SmArcLinkType extends EObject {
        /**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Actuate</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see gov.loc.mets.MetsPackage#getSmArcLinkType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        ActuateType getActuate();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmArcLinkType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
        void setActuate(ActuateType value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.SmArcLinkType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
        void unsetActuate();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.SmArcLinkType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
        boolean isSetActuate();

        /**
	 * Returns the value of the '<em><b>ADMID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ADMID (IDREFS/O): Contains the ID attribute values identifying the &lt;sourceMD&gt;, &lt;techMD&gt;, &lt;digiprovMD&gt; and/or &lt;rightsMD&gt; elements within the &lt;amdSec&gt; of the METS document that contain or link to administrative metadata pertaining to &lt;smArcLink&gt;. Typically the &lt;smArcLink&gt; ADMID attribute would be used to identify one or more &lt;sourceMD&gt; and/or &lt;techMD&gt; elements that refine or clarify the relationship between the xlink:from and xlink:to sides of the arc. For more information on using METS IDREFS and IDREF type attributes for internal linking, see Chapter 4 of the METS Primer.
	 * 										
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ADMID</em>' attribute.
	 * @see #setADMID(List)
	 * @see gov.loc.mets.MetsPackage#getSmArcLinkType_ADMID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='ADMID'"
	 * @generated
	 */
        List<String> getADMID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmArcLinkType#getADMID <em>ADMID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADMID</em>' attribute.
	 * @see #getADMID()
	 * @generated
	 */
        void setADMID(List<String> value);

        /**
	 * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Arcrole</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(String)
	 * @see gov.loc.mets.MetsPackage#getSmArcLinkType_Arcrole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getArcrole();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmArcLinkType#getArcrole <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcrole</em>' attribute.
	 * @see #getArcrole()
	 * @generated
	 */
        void setArcrole(String value);

        /**
	 * Returns the value of the '<em><b>ARCTYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ARCTYPE (string/O):The ARCTYPE attribute provides a means of specifying the relationship between the &lt;div&gt; elements participating in the arc link, and hence the purpose or role of the link.  While it can be considered analogous to the xlink:arcrole attribute, its type is a simple string, rather than anyURI.  ARCTYPE has no xlink specified meaning, and the xlink:arcrole attribute should be used instead of or in addition to the ARCTYPE attribute when full xlink compliance is desired with respect to specifying the role or purpose of the arc link. 
	 * 										
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ARCTYPE</em>' attribute.
	 * @see #setARCTYPE(String)
	 * @see gov.loc.mets.MetsPackage#getSmArcLinkType_ARCTYPE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ARCTYPE'"
	 * @generated
	 */
        String getARCTYPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmArcLinkType#getARCTYPE <em>ARCTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ARCTYPE</em>' attribute.
	 * @see #getARCTYPE()
	 * @generated
	 */
        void setARCTYPE(String value);

        /**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>From</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see gov.loc.mets.MetsPackage#getSmArcLinkType_From()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='from' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getFrom();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmArcLinkType#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
        void setFrom(String value);

        /**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID (ID/O): This attribute uniquely identifies the element within the METS document, and would allow the element to be referenced unambiguously from another element or document via an IDREF or an XPTR. For more information on using ID attributes for internal and external linking see Chapter 4 of the METS Primer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see gov.loc.mets.MetsPackage#getSmArcLinkType_ID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
        String getID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmArcLinkType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
        void setID(String value);

        /**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Show</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see gov.loc.mets.MetsPackage#getSmArcLinkType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        ShowType getShow();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmArcLinkType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
        void setShow(ShowType value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.SmArcLinkType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
        void unsetShow();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.SmArcLinkType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
        boolean isSetShow();

        /**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Title</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gov.loc.mets.MetsPackage#getSmArcLinkType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getTitle();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmArcLinkType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
        void setTitle(String value);

        /**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>To</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see gov.loc.mets.MetsPackage#getSmArcLinkType_To()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='to' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getTo();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmArcLinkType#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
        void setTo(String value);

        /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"arc"</code>.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @see gov.loc.mets.MetsPackage#getSmArcLinkType_Type()
	 * @model default="arc" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getType();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmArcLinkType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
        void setType(String value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.SmArcLinkType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
        void unsetType();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.SmArcLinkType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
        boolean isSetType();

} // SmArcLinkType
