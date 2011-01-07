/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Plus Supplied</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.StringPlusSupplied#getSupplied <em>Supplied</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getStringPlusSupplied()
 * @model extendedMetaData="name='stringPlusSupplied' kind='simple'"
 * @generated
 */
public interface StringPlusSupplied extends XsString {
    /**
     * Returns the value of the '<em><b>Supplied</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.YesDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supplied</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Supplied</em>' attribute.
     * @see gov.loc.mods.mods.YesDefinition
     * @see #isSetSupplied()
     * @see #unsetSupplied()
     * @see #setSupplied(YesDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getStringPlusSupplied_Supplied()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='supplied'"
     * @generated
     */
    YesDefinition getSupplied();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.StringPlusSupplied#getSupplied <em>Supplied</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Supplied</em>' attribute.
     * @see gov.loc.mods.mods.YesDefinition
     * @see #isSetSupplied()
     * @see #unsetSupplied()
     * @see #getSupplied()
     * @generated
     */
    void setSupplied(YesDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.StringPlusSupplied#getSupplied <em>Supplied</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSupplied()
     * @see #getSupplied()
     * @see #setSupplied(YesDefinition)
     * @generated
     */
    void unsetSupplied();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.StringPlusSupplied#getSupplied <em>Supplied</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Supplied</em>' attribute is set.
     * @see #unsetSupplied()
     * @see #getSupplied()
     * @see #setSupplied(YesDefinition)
     * @generated
     */
    boolean isSetSupplied();

} // StringPlusSupplied
