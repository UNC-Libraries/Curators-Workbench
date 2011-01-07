/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mets;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Data Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.XmlDataType1#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getXmlDataType1()
 * @model extendedMetaData="name='xmlData_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface XmlDataType1 extends EObject {
        /**
         * Returns the value of the '<em><b>Any</b></em>' attribute list.
         * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Any</em>' attribute list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Any</em>' attribute list.
         * @see gov.loc.mets.MetsPackage#getXmlDataType1_Any()
         * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
         *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':0' processing='lax'"
         * @generated
         */
        FeatureMap getAny();

} // XmlDataType1
