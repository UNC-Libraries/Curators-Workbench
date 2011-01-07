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
 * A representation of the model object '<em><b>Detail Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.DetailDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DetailDefinition#getNumber <em>Number</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DetailDefinition#getCaption <em>Caption</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DetailDefinition#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DetailDefinition#getLevel <em>Level</em>}</li>
 *   <li>{@link gov.loc.mods.mods.DetailDefinition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getDetailDefinition()
 * @model extendedMetaData="name='detailDefinition' kind='elementOnly'"
 * @generated
 */
public interface DetailDefinition extends EObject {
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
     * @see gov.loc.mods.mods.MODSPackage#getDetailDefinition_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>Number</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.XsString}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Number</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Number</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getDetailDefinition_Number()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<XsString> getNumber();

    /**
     * Returns the value of the '<em><b>Caption</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.XsString}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Caption</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Caption</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getDetailDefinition_Caption()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='caption' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<XsString> getCaption();

    /**
     * Returns the value of the '<em><b>Title</b></em>' containment reference list.
     * The list contents are of type {@link gov.loc.mods.mods.XsString}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title</em>' containment reference list.
     * @see gov.loc.mods.mods.MODSPackage#getDetailDefinition_Title()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' group='#group:0'"
     * @generated
     */
    EList<XsString> getTitle();

    /**
     * Returns the value of the '<em><b>Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Level</em>' attribute.
     * @see #setLevel(BigInteger)
     * @see gov.loc.mods.mods.MODSPackage#getDetailDefinition_Level()
     * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
     *        extendedMetaData="kind='attribute' name='level'"
     * @generated
     */
    BigInteger getLevel();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.DetailDefinition#getLevel <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Level</em>' attribute.
     * @see #getLevel()
     * @generated
     */
    void setLevel(BigInteger value);

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
     * @see gov.loc.mods.mods.MODSPackage#getDetailDefinition_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.DetailDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // DetailDefinition
