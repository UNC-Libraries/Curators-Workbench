/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.PartDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PartDefinition#getDetail <em>Detail</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PartDefinition#getExtent <em>Extent</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PartDefinition#getDate <em>Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PartDefinition#getText <em>Text</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PartDefinition#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PartDefinition#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PartDefinition#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PartDefinition#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PartDefinition#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PartDefinition#getOrder <em>Order</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PartDefinition#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PartDefinition#getTransliteration <em>Transliteration</em>}</li>
 *   <li>{@link gov.loc.mods.mods.PartDefinition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getPartDefinition()
 * @model extendedMetaData="name='partDefinition' kind='elementOnly'"
 * @generated
 */
public interface PartDefinition extends EObject {
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
     * @see gov.loc.mods.mods.MODSPackage#getPartDefinition_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.DetailDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Detail</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Detail</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getPartDefinition_Detail()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DetailDefinition> getDetail();

    /**
     * Returns the value of the '<em><b>Extent</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.ExtentDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extent</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extent</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getPartDefinition_Extent()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='extent' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<ExtentDefinition> getExtent();

    /**
     * Returns the value of the '<em><b>Date</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.DateBaseDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getPartDefinition_Date()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<DateBaseDefinition> getDate();

    /**
     * Returns the value of the '<em><b>Text</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.UnstructuredTextDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getPartDefinition_Text()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<UnstructuredTextDefinition> getText();

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
     * @see gov.loc.mods.mods.MODSPackage#getPartDefinition_AltRepGroup()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='altRepGroup'"
     * @generated
     */
    String getAltRepGroup();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PartDefinition#getAltRepGroup <em>Alt Rep Group</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getPartDefinition_DisplayLabel()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='displayLabel'"
     * @generated
     */
    String getDisplayLabel();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PartDefinition#getDisplayLabel <em>Display Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Display Label</em>' attribute.
     * @see #getDisplayLabel()
     * @generated
     */
    void setDisplayLabel(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getPartDefinition_ID()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='ID'"
     * @generated
     */
    String getID();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PartDefinition#getID <em>ID</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getPartDefinition_Lang()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PartDefinition#getLang <em>Lang</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getPartDefinition_Lang1()
     * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
     *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    String getLang1();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PartDefinition#getLang1 <em>Lang1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lang1</em>' attribute.
     * @see #getLang1()
     * @generated
     */
    void setLang1(String value);

    /**
     * Returns the value of the '<em><b>Order</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Order</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Order</em>' attribute.
     * @see #setOrder(BigInteger)
     * @see gov.loc.mods.mods.MODSPackage#getPartDefinition_Order()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
     *        extendedMetaData="kind='attribute' name='order'"
     * @generated
     */
    BigInteger getOrder();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PartDefinition#getOrder <em>Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Order</em>' attribute.
     * @see #getOrder()
     * @generated
     */
    void setOrder(BigInteger value);

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
     * @see gov.loc.mods.mods.MODSPackage#getPartDefinition_Script()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='script'"
     * @generated
     */
    String getScript();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PartDefinition#getScript <em>Script</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getPartDefinition_Transliteration()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='transliteration'"
     * @generated
     */
    String getTransliteration();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PartDefinition#getTransliteration <em>Transliteration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transliteration</em>' attribute.
     * @see #getTransliteration()
     * @generated
     */
    void setTransliteration(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see gov.loc.mods.mods.MODSPackage#getPartDefinition_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.PartDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // PartDefinition
