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
 * A representation of the model object '<em><b>Seq Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * seqType: Complex Type for Sequences of Files
 * 					The seq element should be used to link a div to a set of content files when those files should be played/displayed sequentially to deliver content to a user.  Individual &lt;area&gt; subelements within the seq element provide the links to the files or portions thereof.
 * 				
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.SeqType#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mets.SeqType#getArea <em>Area</em>}</li>
 *   <li>{@link gov.loc.mets.SeqType#getPar <em>Par</em>}</li>
 *   <li>{@link gov.loc.mets.SeqType#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getSeqType()
 * @model extendedMetaData="name='seqType' kind='elementOnly'"
 * @generated
 */
public interface SeqType extends EObject {
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
	 * @see gov.loc.mets.MetsPackage#getSeqType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
        FeatureMap getGroup();

        /**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mets.AreaType}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Area</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' containment reference list.
	 * @see gov.loc.mets.MetsPackage#getSeqType_Area()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='area' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
        EList<AreaType> getArea();

        /**
	 * Returns the value of the '<em><b>Par</b></em>' containment reference list.
	 * The list contents are of type {@link gov.loc.mets.ParType}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Par</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Par</em>' containment reference list.
	 * @see gov.loc.mets.MetsPackage#getSeqType_Par()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='par' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
        EList<ParType> getPar();

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
	 * @see gov.loc.mets.MetsPackage#getSeqType_ID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
        String getID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.SeqType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
        void setID(String value);

} // SeqType
