/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Part Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.NamePartDefinition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getNamePartDefinition()
 * @model extendedMetaData="name='namePartDefinition' kind='simple'"
 * @generated
 */
public interface NamePartDefinition extends XsString {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.NamePartTypeAttributeDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see gov.loc.mods.mods.NamePartTypeAttributeDefinition
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(NamePartTypeAttributeDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getNamePartDefinition_Type()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    NamePartTypeAttributeDefinition getType();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.NamePartDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see gov.loc.mods.mods.NamePartTypeAttributeDefinition
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(NamePartTypeAttributeDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.NamePartDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(NamePartTypeAttributeDefinition)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.NamePartDefinition#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(NamePartTypeAttributeDefinition)
     * @generated
     */
    boolean isSetType();

} // NamePartDefinition
