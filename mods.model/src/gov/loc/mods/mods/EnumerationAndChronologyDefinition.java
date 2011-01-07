/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration And Chronology Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.EnumerationAndChronologyDefinition#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getEnumerationAndChronologyDefinition()
 * @model extendedMetaData="name='enumerationAndChronologyDefinition' kind='simple'"
 * @generated
 */
public interface EnumerationAndChronologyDefinition extends XsString {
    /**
     * Returns the value of the '<em><b>Unit Type</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.EnumerationAndChronologyUnitTypeAttributeDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit Type</em>' attribute.
     * @see gov.loc.mods.mods.EnumerationAndChronologyUnitTypeAttributeDefinition
     * @see #isSetUnitType()
     * @see #unsetUnitType()
     * @see #setUnitType(EnumerationAndChronologyUnitTypeAttributeDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getEnumerationAndChronologyDefinition_UnitType()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='unitType'"
     * @generated
     */
    EnumerationAndChronologyUnitTypeAttributeDefinition getUnitType();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.EnumerationAndChronologyDefinition#getUnitType <em>Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit Type</em>' attribute.
     * @see gov.loc.mods.mods.EnumerationAndChronologyUnitTypeAttributeDefinition
     * @see #isSetUnitType()
     * @see #unsetUnitType()
     * @see #getUnitType()
     * @generated
     */
    void setUnitType(EnumerationAndChronologyUnitTypeAttributeDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.EnumerationAndChronologyDefinition#getUnitType <em>Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnitType()
     * @see #getUnitType()
     * @see #setUnitType(EnumerationAndChronologyUnitTypeAttributeDefinition)
     * @generated
     */
    void unsetUnitType();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.EnumerationAndChronologyDefinition#getUnitType <em>Unit Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Unit Type</em>' attribute is set.
     * @see #unsetUnitType()
     * @see #getUnitType()
     * @see #setUnitType(EnumerationAndChronologyUnitTypeAttributeDefinition)
     * @generated
     */
    boolean isSetUnitType();

} // EnumerationAndChronologyDefinition
