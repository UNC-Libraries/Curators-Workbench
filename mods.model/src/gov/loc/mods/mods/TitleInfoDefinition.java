/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title Info Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.TitleInfoDefinition#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.TitleInfoDefinition#getNameTitleGroup <em>Name Title Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.TitleInfoDefinition#getSupplied <em>Supplied</em>}</li>
 *   <li>{@link gov.loc.mods.mods.TitleInfoDefinition#getType1 <em>Type1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.TitleInfoDefinition#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getTitleInfoDefinition()
 * @model extendedMetaData="name='titleInfoDefinition' kind='elementOnly'"
 * @generated
 */
public interface TitleInfoDefinition extends TitleInfoBaseDefinition {
    /**
     * Returns the value of the '<em><b>Alt Rep Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alt Rep Group</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alt Rep Group</em>' attribute.
     * @see #setAltRepGroup(String)
     * @see gov.loc.mods.mods.MODSPackage#getTitleInfoDefinition_AltRepGroup()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='altRepGroup'"
     * @generated
     */
    String getAltRepGroup();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.TitleInfoDefinition#getAltRepGroup <em>Alt Rep Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alt Rep Group</em>' attribute.
     * @see #getAltRepGroup()
     * @generated
     */
    void setAltRepGroup(String value);

    /**
     * Returns the value of the '<em><b>Name Title Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name Title Group</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name Title Group</em>' attribute.
     * @see #setNameTitleGroup(String)
     * @see gov.loc.mods.mods.MODSPackage#getTitleInfoDefinition_NameTitleGroup()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='nameTitleGroup'"
     * @generated
     */
    String getNameTitleGroup();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.TitleInfoDefinition#getNameTitleGroup <em>Name Title Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name Title Group</em>' attribute.
     * @see #getNameTitleGroup()
     * @generated
     */
    void setNameTitleGroup(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getTitleInfoDefinition_Supplied()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='supplied'"
     * @generated
     */
    YesDefinition getSupplied();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.TitleInfoDefinition#getSupplied <em>Supplied</em>}' attribute.
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
     * Unsets the value of the '{@link gov.loc.mods.mods.TitleInfoDefinition#getSupplied <em>Supplied</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSupplied()
     * @see #getSupplied()
     * @see #setSupplied(YesDefinition)
     * @generated
     */
    void unsetSupplied();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.TitleInfoDefinition#getSupplied <em>Supplied</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Supplied</em>' attribute is set.
     * @see #unsetSupplied()
     * @see #getSupplied()
     * @see #setSupplied(YesDefinition)
     * @generated
     */
    boolean isSetSupplied();

    /**
     * Returns the value of the '<em><b>Type1</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.TitleInfoTypeAttributeDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type1</em>' attribute.
     * @see gov.loc.mods.mods.TitleInfoTypeAttributeDefinition
     * @see #isSetType1()
     * @see #unsetType1()
     * @see #setType1(TitleInfoTypeAttributeDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getTitleInfoDefinition_Type1()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    TitleInfoTypeAttributeDefinition getType1();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.TitleInfoDefinition#getType1 <em>Type1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type1</em>' attribute.
     * @see gov.loc.mods.mods.TitleInfoTypeAttributeDefinition
     * @see #isSetType1()
     * @see #unsetType1()
     * @see #getType1()
     * @generated
     */
    void setType1(TitleInfoTypeAttributeDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.TitleInfoDefinition#getType1 <em>Type1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType1()
     * @see #getType1()
     * @see #setType1(TitleInfoTypeAttributeDefinition)
     * @generated
     */
    void unsetType1();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.TitleInfoDefinition#getType1 <em>Type1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type1</em>' attribute is set.
     * @see #unsetType1()
     * @see #getType1()
     * @see #setType1(TitleInfoTypeAttributeDefinition)
     * @generated
     */
    boolean isSetType1();

    /**
     * Returns the value of the '<em><b>Usage</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.UsageAttributeDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage</em>' attribute.
     * @see gov.loc.mods.mods.UsageAttributeDefinition
     * @see #isSetUsage()
     * @see #unsetUsage()
     * @see #setUsage(UsageAttributeDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getTitleInfoDefinition_Usage()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='usage'"
     * @generated
     */
    UsageAttributeDefinition getUsage();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.TitleInfoDefinition#getUsage <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage</em>' attribute.
     * @see gov.loc.mods.mods.UsageAttributeDefinition
     * @see #isSetUsage()
     * @see #unsetUsage()
     * @see #getUsage()
     * @generated
     */
    void setUsage(UsageAttributeDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.TitleInfoDefinition#getUsage <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsage()
     * @see #getUsage()
     * @see #setUsage(UsageAttributeDefinition)
     * @generated
     */
    void unsetUsage();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.TitleInfoDefinition#getUsage <em>Usage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage</em>' attribute is set.
     * @see #unsetUsage()
     * @see #getUsage()
     * @see #setUsage(UsageAttributeDefinition)
     * @generated
     */
    boolean isSetUsage();

} // TitleInfoDefinition
