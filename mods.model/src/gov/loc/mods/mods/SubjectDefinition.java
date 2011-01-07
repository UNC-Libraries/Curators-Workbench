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

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getTopic <em>Topic</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getGeographic <em>Geographic</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getTitleInfo <em>Title Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getName <em>Name</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getGeographicCode <em>Geographic Code</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getHierarchicalGeographic <em>Hierarchical Geographic</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getCartographics <em>Cartographics</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getOccupation <em>Occupation</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getGenre <em>Genre</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getAuthority <em>Authority</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getAuthorityURI <em>Authority URI</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getHref <em>Href</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getTransliteration <em>Transliteration</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getType <em>Type</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getUsage <em>Usage</em>}</li>
 *   <li>{@link gov.loc.mods.mods.SubjectDefinition#getValueURI <em>Value URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition()
 * @model extendedMetaData="name='subjectDefinition' kind='elementOnly'"
 * @generated
 */
public interface SubjectDefinition extends EObject {
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
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>Topic</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.StringPlusAuthority}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Topic</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Topic</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Topic()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='topic' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<StringPlusAuthority> getTopic();

    /**
     * Returns the value of the '<em><b>Geographic</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.StringPlusAuthority}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Geographic</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Geographic</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Geographic()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='geographic' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<StringPlusAuthority> getGeographic();

    /**
     * Returns the value of the '<em><b>Temporal</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.TemporalDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Temporal</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Temporal</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Temporal()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='temporal' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<TemporalDefinition> getTemporal();

    /**
     * Returns the value of the '<em><b>Title Info</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.SubjectTitleInfoDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title Info</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title Info</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_TitleInfo()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='titleInfo' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<SubjectTitleInfoDefinition> getTitleInfo();

    /**
     * Returns the value of the '<em><b>Name</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.SubjectNameDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Name()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<SubjectNameDefinition> getName();

    /**
     * Returns the value of the '<em><b>Geographic Code</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.GeographicCodeDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Geographic Code</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Geographic Code</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_GeographicCode()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='geographicCode' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<GeographicCodeDefinition> getGeographicCode();

    /**
     * Returns the value of the '<em><b>Hierarchical Geographic</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.HierarchicalGeographicDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hierarchical Geographic</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hierarchical Geographic</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_HierarchicalGeographic()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='hierarchicalGeographic' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<HierarchicalGeographicDefinition> getHierarchicalGeographic();

    /**
     * Returns the value of the '<em><b>Cartographics</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.CartographicsDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cartographics</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cartographics</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Cartographics()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='cartographics' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<CartographicsDefinition> getCartographics();

    /**
     * Returns the value of the '<em><b>Occupation</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.StringPlusAuthority}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Occupation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Occupation</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Occupation()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='occupation' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<StringPlusAuthority> getOccupation();

    /**
     * Returns the value of the '<em><b>Genre</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.GenreDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Genre</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Genre</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Genre()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='genre' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<GenreDefinition> getGenre();

    /**
     * Returns the value of the '<em><b>Actuate</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actuate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actuate</em>' attribute.
     * @see org.w3._1999.xlink.ActuateType
     * @see #isSetActuate()
     * @see #unsetActuate()
     * @see #setActuate(ActuateType)
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Actuate()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    ActuateType getActuate();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getActuate <em>Actuate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actuate</em>' attribute.
     * @see org.w3._1999.xlink.ActuateType
     * @see #isSetActuate()
     * @see #unsetActuate()
     * @see #getActuate()
     * @generated
     */
    void setActuate(ActuateType value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getActuate <em>Actuate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActuate()
     * @see #getActuate()
     * @see #setActuate(ActuateType)
     * @generated
     */
    void unsetActuate();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getActuate <em>Actuate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Actuate</em>' attribute is set.
     * @see #unsetActuate()
     * @see #getActuate()
     * @see #setActuate(ActuateType)
     * @generated
     */
    boolean isSetActuate();

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
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_AltRepGroup()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='altRepGroup'"
     * @generated
     */
    String getAltRepGroup();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getAltRepGroup <em>Alt Rep Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alt Rep Group</em>' attribute.
     * @see #getAltRepGroup()
     * @generated
     */
    void setAltRepGroup(String value);

    /**
     * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Arcrole</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Arcrole</em>' attribute.
     * @see #setArcrole(String)
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Arcrole()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getArcrole();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getArcrole <em>Arcrole</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Arcrole</em>' attribute.
     * @see #getArcrole()
     * @generated
     */
    void setArcrole(String value);

    /**
     * Returns the value of the '<em><b>Authority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Authority</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Authority</em>' attribute.
     * @see #setAuthority(String)
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Authority()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='authority'"
     * @generated
     */
    String getAuthority();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getAuthority <em>Authority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Authority</em>' attribute.
     * @see #getAuthority()
     * @generated
     */
    void setAuthority(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_AuthorityURI()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='authorityURI'"
     * @generated
     */
    String getAuthorityURI();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getAuthorityURI <em>Authority URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Authority URI</em>' attribute.
     * @see #getAuthorityURI()
     * @generated
     */
    void setAuthorityURI(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_DisplayLabel()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='displayLabel'"
     * @generated
     */
    String getDisplayLabel();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getDisplayLabel <em>Display Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Display Label</em>' attribute.
     * @see #getDisplayLabel()
     * @generated
     */
    void setDisplayLabel(String value);

    /**
     * Returns the value of the '<em><b>Href</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Href</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Href</em>' attribute.
     * @see #setHref(String)
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Href()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getHref();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getHref <em>Href</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Href</em>' attribute.
     * @see #getHref()
     * @generated
     */
    void setHref(String value);

    /**
     * Returns the value of the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ID</em>' attribute.
     * @see #setID(String)
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_ID()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='ID'"
     * @generated
     */
    String getID();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getID <em>ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ID</em>' attribute.
     * @see #getID()
     * @generated
     */
    void setID(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Lang()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getLang <em>Lang</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Lang1()
     * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
     *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    String getLang1();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getLang1 <em>Lang1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lang1</em>' attribute.
     * @see #getLang1()
     * @generated
     */
    void setLang1(String value);

    /**
     * Returns the value of the '<em><b>Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role</em>' attribute.
     * @see #setRole(String)
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Role()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getRole();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getRole <em>Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role</em>' attribute.
     * @see #getRole()
     * @generated
     */
    void setRole(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Script()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='script'"
     * @generated
     */
    String getScript();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getScript <em>Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Script</em>' attribute.
     * @see #getScript()
     * @generated
     */
    void setScript(String value);

    /**
     * Returns the value of the '<em><b>Show</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Show</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Show</em>' attribute.
     * @see org.w3._1999.xlink.ShowType
     * @see #isSetShow()
     * @see #unsetShow()
     * @see #setShow(ShowType)
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Show()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    ShowType getShow();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getShow <em>Show</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Show</em>' attribute.
     * @see org.w3._1999.xlink.ShowType
     * @see #isSetShow()
     * @see #unsetShow()
     * @see #getShow()
     * @generated
     */
    void setShow(ShowType value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getShow <em>Show</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShow()
     * @see #getShow()
     * @see #setShow(ShowType)
     * @generated
     */
    void unsetShow();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getShow <em>Show</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Show</em>' attribute is set.
     * @see #unsetShow()
     * @see #getShow()
     * @see #setShow(ShowType)
     * @generated
     */
    boolean isSetShow();

    /**
     * Returns the value of the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title</em>' attribute.
     * @see #setTitle(String)
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Title()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Transliteration()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='transliteration'"
     * @generated
     */
    String getTransliteration();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getTransliteration <em>Transliteration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transliteration</em>' attribute.
     * @see #getTransliteration()
     * @generated
     */
    void setTransliteration(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"simple"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Type()
     * @model default="simple" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    boolean isSetType();

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
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_Usage()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='usage'"
     * @generated
     */
    UsageAttributeDefinition getUsage();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getUsage <em>Usage</em>}' attribute.
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
     * Unsets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getUsage <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsage()
     * @see #getUsage()
     * @see #setUsage(UsageAttributeDefinition)
     * @generated
     */
    void unsetUsage();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getUsage <em>Usage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage</em>' attribute is set.
     * @see #unsetUsage()
     * @see #getUsage()
     * @see #setUsage(UsageAttributeDefinition)
     * @generated
     */
    boolean isSetUsage();

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
     * @see gov.loc.mods.mods.MODSPackage#getSubjectDefinition_ValueURI()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='valueURI'"
     * @generated
     */
    String getValueURI();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.SubjectDefinition#getValueURI <em>Value URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value URI</em>' attribute.
     * @see #getValueURI()
     * @generated
     */
    void setValueURI(String value);

} // SubjectDefinition
