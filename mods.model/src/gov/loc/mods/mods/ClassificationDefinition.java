/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.ClassificationDefinition#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ClassificationDefinition#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ClassificationDefinition#getEdition <em>Edition</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ClassificationDefinition#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getClassificationDefinition()
 * @model extendedMetaData="name='classificationDefinition' kind='simple'"
 * @generated
 */
public interface ClassificationDefinition extends StringPlusAuthority {
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
     * @see gov.loc.mods.mods.MODSPackage#getClassificationDefinition_AltRepGroup()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='altRepGroup'"
     * @generated
     */
    String getAltRepGroup();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.ClassificationDefinition#getAltRepGroup <em>Alt Rep Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alt Rep Group</em>' attribute.
     * @see #getAltRepGroup()
     * @generated
     */
    void setAltRepGroup(String value);

    /**
     * Returns the value of the '<em><b>Display Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Display Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Display Label</em>' attribute.
     * @see #setDisplayLabel(String)
     * @see gov.loc.mods.mods.MODSPackage#getClassificationDefinition_DisplayLabel()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='displayLabel'"
     * @generated
     */
    String getDisplayLabel();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.ClassificationDefinition#getDisplayLabel <em>Display Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Display Label</em>' attribute.
     * @see #getDisplayLabel()
     * @generated
     */
    void setDisplayLabel(String value);

    /**
     * Returns the value of the '<em><b>Edition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Edition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Edition</em>' attribute.
     * @see #setEdition(String)
     * @see gov.loc.mods.mods.MODSPackage#getClassificationDefinition_Edition()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='edition'"
     * @generated
     */
    String getEdition();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.ClassificationDefinition#getEdition <em>Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Edition</em>' attribute.
     * @see #getEdition()
     * @generated
     */
    void setEdition(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getClassificationDefinition_Usage()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='usage'"
     * @generated
     */
    UsageAttributeDefinition getUsage();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.ClassificationDefinition#getUsage <em>Usage</em>}' attribute.
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
     * Unsets the value of the '{@link gov.loc.mods.mods.ClassificationDefinition#getUsage <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsage()
     * @see #getUsage()
     * @see #setUsage(UsageAttributeDefinition)
     * @generated
     */
    void unsetUsage();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.ClassificationDefinition#getUsage <em>Usage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage</em>' attribute is set.
     * @see #unsetUsage()
     * @see #getUsage()
     * @see #setUsage(UsageAttributeDefinition)
     * @generated
     */
    boolean isSetUsage();

} // ClassificationDefinition
