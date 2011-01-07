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
 * A representation of the model object '<em><b>Mods Collection Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.ModsCollectionDefinition#getMods <em>Mods</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getModsCollectionDefinition()
 * @model extendedMetaData="name='modsCollectionDefinition' kind='elementOnly'"
 * @generated
 */
public interface ModsCollectionDefinition extends EObject {
    /**
     * Returns the value of the '<em><b>Mods</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.ModsDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mods</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mods</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getModsCollectionDefinition_Mods()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='mods' namespace='##targetNamespace'"
     * @generated
     */
    EList<ModsDefinition> getMods();

} // ModsCollectionDefinition
