/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.DateDefinition#getKeyDate <em>Key Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getDateDefinition()
 * @model extendedMetaData="name='dateDefinition' kind='simple'"
 * @generated
 */
public interface DateDefinition extends DateBaseDefinition {
    /**
     * Returns the value of the '<em><b>Key Date</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.YesDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key Date</em>' attribute.
     * @see gov.loc.mods.mods.YesDefinition
     * @see #isSetKeyDate()
     * @see #unsetKeyDate()
     * @see #setKeyDate(YesDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getDateDefinition_KeyDate()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='keyDate'"
     * @generated
     */
    YesDefinition getKeyDate();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.DateDefinition#getKeyDate <em>Key Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key Date</em>' attribute.
     * @see gov.loc.mods.mods.YesDefinition
     * @see #isSetKeyDate()
     * @see #unsetKeyDate()
     * @see #getKeyDate()
     * @generated
     */
    void setKeyDate(YesDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.DateDefinition#getKeyDate <em>Key Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKeyDate()
     * @see #getKeyDate()
     * @see #setKeyDate(YesDefinition)
     * @generated
     */
    void unsetKeyDate();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.DateDefinition#getKeyDate <em>Key Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Key Date</em>' attribute is set.
     * @see #unsetKeyDate()
     * @see #getKeyDate()
     * @see #setKeyDate(YesDefinition)
     * @generated
     */
    boolean isSetKeyDate();

} // DateDefinition
