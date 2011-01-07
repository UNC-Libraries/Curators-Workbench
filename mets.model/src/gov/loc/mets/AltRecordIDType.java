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
 * A representation of the model object '<em><b>Alt Record ID Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.AltRecordIDType#getValue <em>Value</em>}</li>
 *   <li>{@link gov.loc.mets.AltRecordIDType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.AltRecordIDType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getAltRecordIDType()
 * @model extendedMetaData="name='altRecordID_._type' kind='simple'"
 * @generated
 */
public interface AltRecordIDType extends EObject {
        /**
         * Returns the value of the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Value</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Value</em>' attribute.
         * @see #setValue(String)
         * @see gov.loc.mets.MetsPackage#getAltRecordIDType_Value()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="name=':0' kind='simple'"
         * @generated
         */
        String getValue();

        /**
         * Sets the value of the '{@link gov.loc.mets.AltRecordIDType#getValue <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Value</em>' attribute.
         * @see #getValue()
         * @generated
         */
        void setValue(String value);

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
         * @see gov.loc.mets.MetsPackage#getAltRecordIDType_ID()
         * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
         *        extendedMetaData="kind='attribute' name='ID'"
         * @generated
         */
        String getID();

        /**
         * Sets the value of the '{@link gov.loc.mets.AltRecordIDType#getID <em>ID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ID</em>' attribute.
         * @see #getID()
         * @generated
         */
        void setID(String value);

        /**
         * Returns the value of the '<em><b>TYPE</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * TYPE (string/O): A description of the identifier type (e.g., OCLC record number, LCCN, etc.).
         * 												
         * <!-- end-model-doc -->
         * @return the value of the '<em>TYPE</em>' attribute.
         * @see #setTYPE(String)
         * @see gov.loc.mets.MetsPackage#getAltRecordIDType_TYPE()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='TYPE'"
         * @generated
         */
        String getTYPE();

        /**
         * Sets the value of the '{@link gov.loc.mets.AltRecordIDType#getTYPE <em>TYPE</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>TYPE</em>' attribute.
         * @see #getTYPE()
         * @generated
         */
        void setTYPE(String value);

} // AltRecordIDType
