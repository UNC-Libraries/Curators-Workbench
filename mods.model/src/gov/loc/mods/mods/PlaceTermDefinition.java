/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Term Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.PlaceTermDefinition#getAuthority <em>Authority</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PlaceTermDefinition#getAuthorityURI <em>Authority URI</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PlaceTermDefinition#getType <em>Type</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PlaceTermDefinition#getValueURI <em>Value URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getPlaceTermDefinition()
 * @model extendedMetaData="name='placeTermDefinition' kind='simple'"
 * @generated
 */
public interface PlaceTermDefinition extends XsString {
    /**
     * Returns the value of the '<em><b>Authority</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.PlaceAuthorityAttributeDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Authority</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Authority</em>' attribute.
     * @see gov.loc.mods.mods.PlaceAuthorityAttributeDefinition
     * @see #isSetAuthority()
     * @see #unsetAuthority()
     * @see #setAuthority(PlaceAuthorityAttributeDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getPlaceTermDefinition_Authority()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='authority'"
     * @generated
     */
    PlaceAuthorityAttributeDefinition getAuthority();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PlaceTermDefinition#getAuthority <em>Authority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Authority</em>' attribute.
     * @see gov.loc.mods.mods.PlaceAuthorityAttributeDefinition
     * @see #isSetAuthority()
     * @see #unsetAuthority()
     * @see #getAuthority()
     * @generated
     */
    void setAuthority(PlaceAuthorityAttributeDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.PlaceTermDefinition#getAuthority <em>Authority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAuthority()
     * @see #getAuthority()
     * @see #setAuthority(PlaceAuthorityAttributeDefinition)
     * @generated
     */
    void unsetAuthority();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.PlaceTermDefinition#getAuthority <em>Authority</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Authority</em>' attribute is set.
     * @see #unsetAuthority()
     * @see #getAuthority()
     * @see #setAuthority(PlaceAuthorityAttributeDefinition)
     * @generated
     */
    boolean isSetAuthority();

    /**
     * Returns the value of the '<em><b>Authority URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Authority URI</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Authority URI</em>' attribute.
     * @see #setAuthorityURI(String)
     * @see gov.loc.mods.mods.MODSPackage#getPlaceTermDefinition_AuthorityURI()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='authorityURI'"
     * @generated
     */
    String getAuthorityURI();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PlaceTermDefinition#getAuthorityURI <em>Authority URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Authority URI</em>' attribute.
     * @see #getAuthorityURI()
     * @generated
     */
    void setAuthorityURI(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.CodeOrTextDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see gov.loc.mods.mods.CodeOrTextDefinition
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(CodeOrTextDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getPlaceTermDefinition_Type()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    CodeOrTextDefinition getType();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PlaceTermDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see gov.loc.mods.mods.CodeOrTextDefinition
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(CodeOrTextDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.PlaceTermDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(CodeOrTextDefinition)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.PlaceTermDefinition#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(CodeOrTextDefinition)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Value URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value URI</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value URI</em>' attribute.
     * @see #setValueURI(String)
     * @see gov.loc.mods.mods.MODSPackage#getPlaceTermDefinition_ValueURI()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='valueURI'"
     * @generated
     */
    String getValueURI();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PlaceTermDefinition#getValueURI <em>Value URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value URI</em>' attribute.
     * @see #getValueURI()
     * @generated
     */
    void setValueURI(String value);

} // PlaceTermDefinition
