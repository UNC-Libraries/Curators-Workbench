/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * structLinkType: Complex Type for Structural Map Linking
 * 				The Structural Map Linking section allows for the specification of hyperlinks between different components of a METS structure delineated in a structural map.  structLink contains a single, repeatable element, smLink.  Each smLink element indicates a hyperlink between two nodes in the structMap.  The structMap nodes recorded in smLink are identified using their XML ID attribute	values.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.StructLinkType#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mets.StructLinkType#getSmLink <em>Sm Link</em>}</li>
 *   <li>{@link gov.loc.mets.StructLinkType#getSmLinkGrp <em>Sm Link Grp</em>}</li>
 *   <li>{@link gov.loc.mets.StructLinkType#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getStructLinkType()
 * @model extendedMetaData="name='structLinkType' kind='elementOnly'"
 * @generated
 */
public interface StructLinkType extends EObject {
        /**
         * Returns the value of the '<em><b>Group</b></em>' attribute list.
         * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Group</em>' attribute list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Group</em>' attribute list.
         * @see gov.loc.mets.MetsPackage#getStructLinkType_Group()
         * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
         *        extendedMetaData="kind='group' name='group:0'"
         * @generated
         */
        FeatureMap getGroup();

        /**
         * Returns the value of the '<em><b>Sm Link</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.SmLinkType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         *  
         * 						The Structural Map Link element &lt;smLink&gt; identifies a hyperlink between two nodes in the structural map. You would use &lt;smLink&gt;, for instance, to note the existence of hypertext links between web pages, if you wished to record those links within METS. NOTE: &lt;smLink&gt; is an empty element. The location of the &lt;smLink&gt; element to which the &lt;smLink&gt; element is pointing MUST be stored in the xlink:href attribute.
         * 				
         * <!-- end-model-doc -->
         * @return the value of the '<em>Sm Link</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getStructLinkType_SmLink()
         * @model containment="true" transient="true" volatile="true" derived="true"
         *        extendedMetaData="kind='element' name='smLink' namespace='##targetNamespace' group='#group:0'"
         * @generated
         */
        EList<SmLinkType> getSmLink();

        /**
         * Returns the value of the '<em><b>Sm Link Grp</b></em>' containment reference list.
         * The list contents are of type {@link gov.loc.mets.SmLinkGrpType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * <!-- begin-model-doc -->
         * 
         * 						The structMap link group element &lt;smLinkGrp&gt; provides an implementation of xlink:extendLink, and provides xlink compliant mechanisms for establishing xlink:arcLink type links between 2 or more &lt;div&gt; elements in &lt;structMap&gt; element(s) occurring within the same METS document or different METS documents.  The smLinkGrp could be used as an alternative to the &lt;smLink&gt; element to establish a one-to-one link between &lt;div&gt; elements in the same METS document in a fully xlink compliant manner.  However, it can also be used to establish one-to-many or many-to-many links between &lt;div&gt; elements. For example, if a METS document contains two &lt;structMap&gt; elements, one of which represents a purely logical structure and one of which represents a purely physical structure, the &lt;smLinkGrp&gt; element would provide a means of mapping a &lt;div&gt; representing a logical entity (for example, a newspaper article) with multiple &lt;div&gt; elements in the physical &lt;structMap&gt; representing the physical areas that  together comprise the logical entity (for example, the &lt;div&gt; elements representing the page areas that together comprise the newspaper article).
         * 					
         * <!-- end-model-doc -->
         * @return the value of the '<em>Sm Link Grp</em>' containment reference list.
         * @see gov.loc.mets.MetsPackage#getStructLinkType_SmLinkGrp()
         * @model containment="true" transient="true" volatile="true" derived="true"
         *        extendedMetaData="kind='element' name='smLinkGrp' namespace='##targetNamespace' group='#group:0'"
         * @generated
         */
        EList<SmLinkGrpType> getSmLinkGrp();

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
         * @see gov.loc.mets.MetsPackage#getStructLinkType_ID()
         * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
         *        extendedMetaData="kind='attribute' name='ID'"
         * @generated
         */
        String getID();

        /**
         * Sets the value of the '{@link gov.loc.mets.StructLinkType#getID <em>ID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>ID</em>' attribute.
         * @see #getID()
         * @generated
         */
        void setID(String value);

} // StructLinkType
