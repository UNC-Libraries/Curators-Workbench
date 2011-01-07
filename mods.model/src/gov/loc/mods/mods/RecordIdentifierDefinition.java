/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Identifier Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.RecordIdentifierDefinition#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getRecordIdentifierDefinition()
 * @model extendedMetaData="name='recordIdentifierDefinition' kind='simple'"
 * @generated
 */
public interface RecordIdentifierDefinition extends XsString {
    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' attribute.
     * @see #setSource(String)
     * @see gov.loc.mods.mods.MODSPackage#getRecordIdentifierDefinition_Source()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='source'"
     * @generated
     */
    String getSource();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.RecordIdentifierDefinition#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' attribute.
     * @see #getSource()
     * @generated
     */
    void setSource(String value);

} // RecordIdentifierDefinition
