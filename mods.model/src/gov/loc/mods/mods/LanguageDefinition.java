/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.LanguageDefinition#getLanguageTerm <em>Language Term</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LanguageDefinition#getScriptTerm <em>Script Term</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LanguageDefinition#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LanguageDefinition#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LanguageDefinition#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LanguageDefinition#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LanguageDefinition#getObjectPart <em>Object Part</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LanguageDefinition#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LanguageDefinition#getTransliteration <em>Transliteration</em>}</li>
 *   <li>{@link gov.loc.mods.mods.LanguageDefinition#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getLanguageDefinition()
 * @model extendedMetaData="name='languageDefinition' kind='elementOnly'"
 * @generated
 */
public interface LanguageDefinition extends EObject {
    /**
     * Returns the value of the '<em><b>Language Term</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.LanguageTermDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Language Term</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Language Term</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getLanguageDefinition_LanguageTerm()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='languageTerm' namespace='##targetNamespace'"
     * @generated
     */
    EList<LanguageTermDefinition> getLanguageTerm();

    /**
     * Returns the value of the '<em><b>Script Term</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.ScriptTermDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script Term</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Script Term</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getLanguageDefinition_ScriptTerm()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='scriptTerm' namespace='##targetNamespace'"
     * @generated
     */
    EList<ScriptTermDefinition> getScriptTerm();

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
     * @see gov.loc.mods.mods.MODSPackage#getLanguageDefinition_AltRepGroup()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='altRepGroup'"
     * @generated
     */
    String getAltRepGroup();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.LanguageDefinition#getAltRepGroup <em>Alt Rep Group</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getLanguageDefinition_DisplayLabel()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='displayLabel'"
     * @generated
     */
    String getDisplayLabel();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.LanguageDefinition#getDisplayLabel <em>Display Label</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getLanguageDefinition_Lang()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.LanguageDefinition#getLang <em>Lang</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getLanguageDefinition_Lang1()
     * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
     *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    String getLang1();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.LanguageDefinition#getLang1 <em>Lang1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lang1</em>' attribute.
     * @see #getLang1()
     * @generated
     */
    void setLang1(String value);

    /**
     * Returns the value of the '<em><b>Object Part</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object Part</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object Part</em>' attribute.
     * @see #setObjectPart(String)
     * @see gov.loc.mods.mods.MODSPackage#getLanguageDefinition_ObjectPart()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='objectPart'"
     * @generated
     */
    String getObjectPart();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.LanguageDefinition#getObjectPart <em>Object Part</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object Part</em>' attribute.
     * @see #getObjectPart()
     * @generated
     */
    void setObjectPart(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getLanguageDefinition_Script()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='script'"
     * @generated
     */
    String getScript();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.LanguageDefinition#getScript <em>Script</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getLanguageDefinition_Transliteration()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='transliteration'"
     * @generated
     */
    String getTransliteration();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.LanguageDefinition#getTransliteration <em>Transliteration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transliteration</em>' attribute.
     * @see #getTransliteration()
     * @generated
     */
    void setTransliteration(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getLanguageDefinition_Usage()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='usage'"
     * @generated
     */
    UsageAttributeDefinition getUsage();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.LanguageDefinition#getUsage <em>Usage</em>}' attribute.
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
     * Unsets the value of the '{@link gov.loc.mods.mods.LanguageDefinition#getUsage <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsage()
     * @see #getUsage()
     * @see #setUsage(UsageAttributeDefinition)
     * @generated
     */
    void unsetUsage();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.LanguageDefinition#getUsage <em>Usage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage</em>' attribute is set.
     * @see #unsetUsage()
     * @see #getUsage()
     * @see #setUsage(UsageAttributeDefinition)
     * @generated
     */
    boolean isSetUsage();

} // LanguageDefinition
