/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.loc.mets.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.loc.mets.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.loc.mets.DocumentRoot#getMets <em>Mets</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
        /**
         * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
         * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Mixed</em>' attribute list.
         * @see gov.loc.mets.MetsPackage#getDocumentRoot_Mixed()
         * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
         *        extendedMetaData="kind='elementWildcard' name=':mixed'"
         * @generated
         */
        FeatureMap getMixed();

        /**
         * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
         * The key is of type {@link java.lang.String},
         * and the value is of type {@link java.lang.String},
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>XMLNS Prefix Map</em>' map.
         * @see gov.loc.mets.MetsPackage#getDocumentRoot_XMLNSPrefixMap()
         * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
         *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
         * @generated
         */
        EMap<String, String> getXMLNSPrefixMap();

        /**
         * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
         * The key is of type {@link java.lang.String},
         * and the value is of type {@link java.lang.String},
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>XSI Schema Location</em>' map.
         * @see gov.loc.mets.MetsPackage#getDocumentRoot_XSISchemaLocation()
         * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
         *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
         * @generated
         */
        EMap<String, String> getXSISchemaLocation();

        /**
         * Returns the value of the '<em><b>Mets</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * METS: Metadata Encoding and Transmission Standard.
         * 				METS is intended to provide a standardized XML format for transmission of complex digital library objects between systems.  As such, it can be seen as filling a role similar to that defined for the Submission Information Package (SIP), Archival Information Package (AIP) and Dissemination Information Package (DIP) in the Reference Model for an Open Archival Information System. The root element &lt;mets&gt; establishes the container for the information being stored and/or transmitted by the standard.
         * 			
         * <!-- end-model-doc -->
         * @return the value of the '<em>Mets</em>' containment reference.
         * @see #setMets(MetsType1)
         * @see gov.loc.mets.MetsPackage#getDocumentRoot_Mets()
         * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
         *        extendedMetaData="kind='element' name='mets' namespace='##targetNamespace'"
         * @generated
         */
        MetsType1 getMets();

        /**
         * Sets the value of the '{@link gov.loc.mets.DocumentRoot#getMets <em>Mets</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Mets</em>' containment reference.
         * @see #getMets()
         * @generated
         */
        void setMets(MetsType1 value);

} // DocumentRoot
