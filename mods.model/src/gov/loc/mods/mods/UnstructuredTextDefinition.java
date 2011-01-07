/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unstructured Text Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.UnstructuredTextDefinition#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mods.mods.UnstructuredTextDefinition#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mods.mods.UnstructuredTextDefinition#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.UnstructuredTextDefinition#getHref <em>Href</em>}</li>
 *   <li>{@link gov.loc.mods.mods.UnstructuredTextDefinition#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mods.mods.UnstructuredTextDefinition#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mods.mods.UnstructuredTextDefinition#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.UnstructuredTextDefinition#getType <em>Type</em>}</li>
 *   <li>{@link gov.loc.mods.mods.UnstructuredTextDefinition#getType1 <em>Type1</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getUnstructuredTextDefinition()
 * @model extendedMetaData="name='unstructuredTextDefinition' kind='simple'"
 * @generated
 */
public interface UnstructuredTextDefinition extends XsString {
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
     * @see gov.loc.mods.mods.MODSPackage#getUnstructuredTextDefinition_Actuate()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    ActuateType getActuate();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getActuate <em>Actuate</em>}' attribute.
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
     * Unsets the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getActuate <em>Actuate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActuate()
     * @see #getActuate()
     * @see #setActuate(ActuateType)
     * @generated
     */
    void unsetActuate();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getActuate <em>Actuate</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Arcrole</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Arcrole</em>' attribute.
     * @see #setArcrole(String)
     * @see gov.loc.mods.mods.MODSPackage#getUnstructuredTextDefinition_Arcrole()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getArcrole();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getArcrole <em>Arcrole</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Arcrole</em>' attribute.
     * @see #getArcrole()
     * @generated
     */
    void setArcrole(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getUnstructuredTextDefinition_DisplayLabel()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='displayLabel'"
     * @generated
     */
    String getDisplayLabel();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getDisplayLabel <em>Display Label</em>}' attribute.
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
     * @see gov.loc.mods.mods.MODSPackage#getUnstructuredTextDefinition_Href()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getHref();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getHref <em>Href</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Href</em>' attribute.
     * @see #getHref()
     * @generated
     */
    void setHref(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getUnstructuredTextDefinition_Role()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getRole();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getRole <em>Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role</em>' attribute.
     * @see #getRole()
     * @generated
     */
    void setRole(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getUnstructuredTextDefinition_Show()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    ShowType getShow();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getShow <em>Show</em>}' attribute.
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
     * Unsets the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getShow <em>Show</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShow()
     * @see #getShow()
     * @see #setShow(ShowType)
     * @generated
     */
    void unsetShow();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getShow <em>Show</em>}' attribute is set.
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
     * @see gov.loc.mods.mods.MODSPackage#getUnstructuredTextDefinition_Title()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

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
     * @see gov.loc.mods.mods.MODSPackage#getUnstructuredTextDefinition_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Type1</b></em>' attribute.
     * The default value is <code>"simple"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type1</em>' attribute.
     * @see #isSetType1()
     * @see #unsetType1()
     * @see #setType1(String)
     * @see gov.loc.mods.mods.MODSPackage#getUnstructuredTextDefinition_Type1()
     * @model default="simple" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
     * @generated
     */
    String getType1();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getType1 <em>Type1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type1</em>' attribute.
     * @see #isSetType1()
     * @see #unsetType1()
     * @see #getType1()
     * @generated
     */
    void setType1(String value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getType1 <em>Type1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType1()
     * @see #getType1()
     * @see #setType1(String)
     * @generated
     */
    void unsetType1();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.UnstructuredTextDefinition#getType1 <em>Type1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type1</em>' attribute is set.
     * @see #unsetType1()
     * @see #getType1()
     * @see #setType1(String)
     * @generated
     */
    boolean isSetType1();

} // UnstructuredTextDefinition
