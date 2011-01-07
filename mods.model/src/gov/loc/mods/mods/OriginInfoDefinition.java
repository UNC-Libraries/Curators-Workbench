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
 * A representation of the model object '<em><b>Origin Info Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getPlace <em>Place</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getDateIssued <em>Date Issued</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getDateCaptured <em>Date Captured</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getDateValid <em>Date Valid</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getDateModified <em>Date Modified</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getCopyrightDate <em>Copyright Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getDateOther <em>Date Other</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getEdition <em>Edition</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getIssuance <em>Issuance</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.OriginInfoDefinition#getTransliteration <em>Transliteration</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition()
 * @model extendedMetaData="name='originInfoDefinition' kind='elementOnly'"
 * @generated
 */
public interface OriginInfoDefinition extends EObject {
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
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>Place</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.PlaceDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Place</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Place</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_Place()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='place' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<PlaceDefinition> getPlace();

    /**
     * Returns the value of the '<em><b>Publisher</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.StringPlusSupplied}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Publisher</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Publisher</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_Publisher()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<StringPlusSupplied> getPublisher();

    /**
     * Returns the value of the '<em><b>Date Issued</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.DateDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date Issued</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date Issued</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_DateIssued()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dateIssued' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DateDefinition> getDateIssued();

    /**
     * Returns the value of the '<em><b>Date Created</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.DateDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date Created</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date Created</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_DateCreated()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dateCreated' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DateDefinition> getDateCreated();

    /**
     * Returns the value of the '<em><b>Date Captured</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.DateDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date Captured</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date Captured</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_DateCaptured()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dateCaptured' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DateDefinition> getDateCaptured();

    /**
     * Returns the value of the '<em><b>Date Valid</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.DateDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date Valid</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date Valid</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_DateValid()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dateValid' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DateDefinition> getDateValid();

    /**
     * Returns the value of the '<em><b>Date Modified</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.DateDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date Modified</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date Modified</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_DateModified()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dateModified' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DateDefinition> getDateModified();

    /**
     * Returns the value of the '<em><b>Copyright Date</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.DateDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Copyright Date</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Copyright Date</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_CopyrightDate()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='copyrightDate' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DateDefinition> getCopyrightDate();

    /**
     * Returns the value of the '<em><b>Date Other</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.DateOtherDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date Other</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date Other</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_DateOther()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dateOther' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DateOtherDefinition> getDateOther();

    /**
     * Returns the value of the '<em><b>Edition</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.StringPlusSupplied}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Edition</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Edition</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_Edition()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='edition' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<StringPlusSupplied> getEdition();

    /**
     * Returns the value of the '<em><b>Issuance</b></em>' attribute list.
     * The list contents are of type {@link gov.loc.mods.mods.IssuanceDefinition}.
     * The literals are from the enumeration {@link gov.loc.mods.mods.IssuanceDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Issuance</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Issuance</em>' attribute list.
     * @see gov.loc.mods.mods.IssuanceDefinition
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_Issuance()
     * @model unique="false" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='issuance' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<IssuanceDefinition> getIssuance();

    /**
     * Returns the value of the '<em><b>Frequency</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.StringPlusAuthority}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Frequency</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Frequency</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_Frequency()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='frequency' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<StringPlusAuthority> getFrequency();

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
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_AltRepGroup()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='altRepGroup'"
     * @generated
     */
    String getAltRepGroup();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.OriginInfoDefinition#getAltRepGroup <em>Alt Rep Group</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_DisplayLabel()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='displayLabel'"
     * @generated
     */
    String getDisplayLabel();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.OriginInfoDefinition#getDisplayLabel <em>Display Label</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_Lang()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.OriginInfoDefinition#getLang <em>Lang</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_Lang1()
     * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
     *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    String getLang1();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.OriginInfoDefinition#getLang1 <em>Lang1</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_Script()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='script'"
     * @generated
     */
    String getScript();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.OriginInfoDefinition#getScript <em>Script</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getOriginInfoDefinition_Transliteration()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='transliteration'"
     * @generated
     */
    String getTransliteration();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.OriginInfoDefinition#getTransliteration <em>Transliteration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transliteration</em>' attribute.
     * @see #getTransliteration()
     * @generated
     */
    void setTransliteration(String value);

} // OriginInfoDefinition
