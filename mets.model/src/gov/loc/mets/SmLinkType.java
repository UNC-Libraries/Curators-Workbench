/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import org.eclipse.emf.ecore.EObject;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sm Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.SmLinkType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mets.SmLinkType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mets.SmLinkType#getXlinkFrom <em>Xlink From</em>}</li>
 *   <li>{@link gov.loc.mets.SmLinkType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.SmLinkType#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mets.SmLinkType#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mets.SmLinkType#getXlinkTo <em>Xlink To</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getSmLinkType()
 * @model extendedMetaData="name='smLink_._type' kind='empty'"
 * @generated
 */
public interface SmLinkType extends EObject {
        /**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 								xlink:actuate - see the xlink specification at http://www.w3.org/TR/xlink/
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see gov.loc.mets.MetsPackage#getSmLinkType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        ActuateType getActuate();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmLinkType#getActuate <em>Actuate</em>}' attribute.
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
	 * Unsets the value of the '{@link gov.loc.mets.SmLinkType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
        void unsetActuate();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.SmLinkType#getActuate <em>Actuate</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 								 xlink:arcrole - the role of the link, as per the xlink specification.  See http://www.w3.org/TR/xlink/
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(String)
	 * @see gov.loc.mets.MetsPackage#getSmLinkType_Arcrole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getArcrole();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmLinkType#getArcrole <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcrole</em>' attribute.
	 * @see #getArcrole()
	 * @generated
	 */
        void setArcrole(String value);

        /**
	 * Returns the value of the '<em><b>Xlink From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 								xlink:from - the value of the label for the element in the structMap you are linking from.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xlink From</em>' reference.
	 * @see #setXlinkFrom(EObject)
	 * @see gov.loc.mets.MetsPackage#getSmLinkType_XlinkFrom()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='from' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	EObject getXlinkFrom();

								/**
	 * Sets the value of the '{@link gov.loc.mets.SmLinkType#getXlinkFrom <em>Xlink From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xlink From</em>' reference.
	 * @see #getXlinkFrom()
	 * @generated
	 */
	void setXlinkFrom(EObject value);

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
	 * @see gov.loc.mets.MetsPackage#getSmLinkType_ID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
        String getID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmLinkType#getID <em>ID</em>}' attribute.
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
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 								xlink:show - see the xlink specification at http://www.w3.org/TR/xlink/
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see gov.loc.mets.MetsPackage#getSmLinkType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        ShowType getShow();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmLinkType#getShow <em>Show</em>}' attribute.
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
	 * Unsets the value of the '{@link gov.loc.mets.SmLinkType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
        void unsetShow();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.SmLinkType#getShow <em>Show</em>}' attribute is set.
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
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 								xlink:title - a title for the link (if needed), as per the xlink specification.  See http://www.w3.org/TR/xlink/
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gov.loc.mets.MetsPackage#getSmLinkType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getTitle();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SmLinkType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
        void setTitle(String value);

        /**
	 * Returns the value of the '<em><b>Xlink To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 								xlink:to - the value of the label for the element in the structMap you are linking to.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xlink To</em>' reference.
	 * @see #setXlinkTo(EObject)
	 * @see gov.loc.mets.MetsPackage#getSmLinkType_XlinkTo()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='to' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	EObject getXlinkTo();

								/**
	 * Sets the value of the '{@link gov.loc.mets.SmLinkType#getXlinkTo <em>Xlink To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xlink To</em>' reference.
	 * @see #getXlinkTo()
	 * @generated
	 */
	void setXlinkTo(EObject value);

} // SmLinkType
