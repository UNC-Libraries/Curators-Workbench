/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note Base Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.NoteBaseDefinition#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getNoteBaseDefinition()
 * @model extendedMetaData="name='noteBaseDefinition' kind='simple'"
 * @generated
 */
public interface NoteBaseDefinition extends UnstructuredTextDefinition {
    /**
     * Returns the value of the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ID</em>' attribute.
     * @see #setID(String)
     * @see gov.loc.mods.mods.MODSPackage#getNoteBaseDefinition_ID()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='ID'"
     * @generated
     */
    String getID();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.NoteBaseDefinition#getID <em>ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ID</em>' attribute.
     * @see #getID()
     * @generated
     */
    void setID(String value);

} // NoteBaseDefinition
