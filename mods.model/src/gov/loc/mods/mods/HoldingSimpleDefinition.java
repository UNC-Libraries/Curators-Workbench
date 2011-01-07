/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Holding Simple Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.HoldingSimpleDefinition#getCopyInformation <em>Copy Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getHoldingSimpleDefinition()
 * @model extendedMetaData="name='holdingSimpleDefinition' kind='elementOnly'"
 * @generated
 */
public interface HoldingSimpleDefinition extends EObject {
    /**
     * Returns the value of the '<em><b>Copy Information</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.CopyInformationDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Copy Information</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Copy Information</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getHoldingSimpleDefinition_CopyInformation()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='copyInformation' namespace='##targetNamespace'"
     * @generated
     */
    EList<CopyInformationDefinition> getCopyInformation();

} // HoldingSimpleDefinition
