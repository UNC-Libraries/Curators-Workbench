/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extent Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.ExtentDefinition#getStart <em>Start</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ExtentDefinition#getEnd <em>End</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ExtentDefinition#getTotal <em>Total</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ExtentDefinition#getList <em>List</em>}</li>
 *   <li>{@link gov.loc.mods.mods.ExtentDefinition#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getExtentDefinition()
 * @model extendedMetaData="name='extentDefinition' kind='elementOnly'"
 * @generated
 */
public interface ExtentDefinition extends EObject {
    /**
     * Returns the value of the '<em><b>Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start</em>' containment reference.
     * @see #setStart(XsString)
     * @see gov.loc.mods.mods.MODSPackage#getExtentDefinition_Start()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
     * @generated
     */
    XsString getStart();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.ExtentDefinition#getStart <em>Start</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start</em>' containment reference.
     * @see #getStart()
     * @generated
     */
    void setStart(XsString value);

    /**
     * Returns the value of the '<em><b>End</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End</em>' containment reference.
     * @see #setEnd(XsString)
     * @see gov.loc.mods.mods.MODSPackage#getExtentDefinition_End()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
     * @generated
     */
    XsString getEnd();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.ExtentDefinition#getEnd <em>End</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End</em>' containment reference.
     * @see #getEnd()
     * @generated
     */
    void setEnd(XsString value);

    /**
     * Returns the value of the '<em><b>Total</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Total</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Total</em>' attribute.
     * @see #setTotal(BigInteger)
     * @see gov.loc.mods.mods.MODSPackage#getExtentDefinition_Total()
     * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
     *        extendedMetaData="kind='element' name='total' namespace='##targetNamespace'"
     * @generated
     */
    BigInteger getTotal();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.ExtentDefinition#getTotal <em>Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Total</em>' attribute.
     * @see #getTotal()
     * @generated
     */
    void setTotal(BigInteger value);

    /**
     * Returns the value of the '<em><b>List</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>List</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>List</em>' containment reference.
     * @see #setList(XsString)
     * @see gov.loc.mods.mods.MODSPackage#getExtentDefinition_List()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='list' namespace='##targetNamespace'"
     * @generated
     */
    XsString getList();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.ExtentDefinition#getList <em>List</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>List</em>' containment reference.
     * @see #getList()
     * @generated
     */
    void setList(XsString value);

    /**
     * Returns the value of the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit</em>' attribute.
     * @see #setUnit(String)
     * @see gov.loc.mods.mods.MODSPackage#getExtentDefinition_Unit()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='unit'"
     * @generated
     */
    String getUnit();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.ExtentDefinition#getUnit <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit</em>' attribute.
     * @see #getUnit()
     * @generated
     */
    void setUnit(String value);

} // ExtentDefinition
