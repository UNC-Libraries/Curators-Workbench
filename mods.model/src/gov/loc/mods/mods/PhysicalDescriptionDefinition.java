/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Description Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getForm <em>Form</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getReformattingQuality <em>Reformatting Quality</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getInternetMediaType <em>Internet Media Type</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getExtent <em>Extent</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getDigitalOrigin <em>Digital Origin</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getNote <em>Note</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getTransliteration <em>Transliteration</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getPhysicalDescriptionDefinition()
 * @model extendedMetaData="name='physicalDescriptionDefinition' kind='elementOnly'"
 * @generated
 */
public interface PhysicalDescriptionDefinition extends EObject {
    /**
     * Returns the value of the '<em><b>Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' attribute list.
     * @see gov.loc.mods.mods.MODSPackage#getPhysicalDescriptionDefinition_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>Form</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.StringPlusAuthorityPlusType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Form</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Form</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getPhysicalDescriptionDefinition_Form()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<StringPlusAuthorityPlusType> getForm();

    /**
     * Returns the value of the '<em><b>Reformatting Quality</b></em>' attribute list.
     * The list contents are of type {@link gov.loc.mods.mods.ReformattingQualityDefinition}.
     * The literals are from the enumeration {@link gov.loc.mods.mods.ReformattingQualityDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reformatting Quality</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reformatting Quality</em>' attribute list.
     * @see gov.loc.mods.mods.ReformattingQualityDefinition
     * @see gov.loc.mods.mods.MODSPackage#getPhysicalDescriptionDefinition_ReformattingQuality()
     * @model unique="false" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='reformattingQuality' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<ReformattingQualityDefinition> getReformattingQuality();

    /**
     * Returns the value of the '<em><b>Internet Media Type</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.XsString}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Internet Media Type</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Internet Media Type</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getPhysicalDescriptionDefinition_InternetMediaType()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='internetMediaType' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<XsString> getInternetMediaType();

    /**
     * Returns the value of the '<em><b>Extent</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.StringPlusSupplied}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extent</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extent</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getPhysicalDescriptionDefinition_Extent()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='extent' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<StringPlusSupplied> getExtent();

    /**
     * Returns the value of the '<em><b>Digital Origin</b></em>' attribute list.
     * The list contents are of type {@link gov.loc.mods.mods.DigitalOriginDefinition}.
     * The literals are from the enumeration {@link gov.loc.mods.mods.DigitalOriginDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Digital Origin</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Digital Origin</em>' attribute list.
     * @see gov.loc.mods.mods.DigitalOriginDefinition
     * @see gov.loc.mods.mods.MODSPackage#getPhysicalDescriptionDefinition_DigitalOrigin()
     * @model unique="false" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='digitalOrigin' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DigitalOriginDefinition> getDigitalOrigin();

    /**
     * Returns the value of the '<em><b>Note</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.NoteBaseDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Note</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getPhysicalDescriptionDefinition_Note()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<NoteBaseDefinition> getNote();

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
     * @see gov.loc.mods.mods.MODSPackage#getPhysicalDescriptionDefinition_AltRepGroup()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='altRepGroup'"
     * @generated
     */
    String getAltRepGroup();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getAltRepGroup <em>Alt Rep Group</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getPhysicalDescriptionDefinition_DisplayLabel()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='displayLabel'"
     * @generated
     */
    String getDisplayLabel();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getDisplayLabel <em>Display Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Display Label</em>' attribute.
     * @see #getDisplayLabel()
     * @generated
     */
    void setDisplayLabel(String value);

    /**
     * Returns the value of the '<em><b>Lang</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lang</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lang</em>' attribute.
     * @see #setLang(String)
     * @see gov.loc.mods.mods.MODSPackage#getPhysicalDescriptionDefinition_Lang()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getLang <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lang</em>' attribute.
     * @see #getLang()
     * @generated
     */
    void setLang(String value);

    /**
     * Returns the value of the '<em><b>Lang1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Attempting to install the relevant ISO 2- and 3-letter
     *          codes as the enumerated possible values is probably never
     *          going to be a realistic possibility.  See
     *          RFC 3066 at http://www.ietf.org/rfc/rfc3066.txt and the IANA registry
     *          at http://www.iana.org/assignments/lang-tag-apps.htm for
     *          further information.
     * 
     *          The union allows for the 'un-declaration' of xml:lang with
     *          the empty string.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lang1</em>' attribute.
     * @see #setLang1(String)
     * @see gov.loc.mods.mods.MODSPackage#getPhysicalDescriptionDefinition_Lang1()
     * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
     *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    String getLang1();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getLang1 <em>Lang1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lang1</em>' attribute.
     * @see #getLang1()
     * @generated
     */
    void setLang1(String value);

    /**
     * Returns the value of the '<em><b>Script</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Script</em>' attribute.
     * @see #setScript(String)
     * @see gov.loc.mods.mods.MODSPackage#getPhysicalDescriptionDefinition_Script()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='script'"
     * @generated
     */
    String getScript();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getScript <em>Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Script</em>' attribute.
     * @see #getScript()
     * @generated
     */
    void setScript(String value);

    /**
     * Returns the value of the '<em><b>Transliteration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transliteration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transliteration</em>' attribute.
     * @see #setTransliteration(String)
     * @see gov.loc.mods.mods.MODSPackage#getPhysicalDescriptionDefinition_Transliteration()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='transliteration'"
     * @generated
     */
    String getTransliteration();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PhysicalDescriptionDefinition#getTransliteration <em>Transliteration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transliteration</em>' attribute.
     * @see #getTransliteration()
     * @generated
     */
    void setTransliteration(String value);

} // PhysicalDescriptionDefinition
