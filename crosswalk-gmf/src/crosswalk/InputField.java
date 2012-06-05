/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.InputField#getLabel <em>Label</em>}</li>
 *   <li>{@link crosswalk.InputField#getUsage <em>Usage</em>}</li>
 *   <li>{@link crosswalk.InputField#isRequired <em>Required</em>}</li>
 *   <li>{@link crosswalk.InputField#getEnteredValue <em>Entered Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getInputField()
 * @model
 * @generated
 */
public interface InputField<F> extends Output, Input {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see crosswalk.CrosswalkPackage#getInputField_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link crosswalk.InputField#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(String)
	 * @see crosswalk.CrosswalkPackage#getInputField_Usage()
	 * @model
	 * @generated
	 */
	String getUsage();

	/**
	 * Sets the value of the '{@link crosswalk.InputField#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see crosswalk.CrosswalkPackage#getInputField_Required()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link crosswalk.InputField#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Entered Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entered Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entered Value</em>' attribute.
	 * @see #isSetEnteredValue()
	 * @see #unsetEnteredValue()
	 * @see #setEnteredValue(Object)
	 * @see crosswalk.CrosswalkPackage#getInputField_EnteredValue()
	 * @model unsettable="true" transient="true"
	 * @generated NOT
	 */
	F getEnteredValue();

	/**
	 * Sets the value of the '{@link crosswalk.InputField#getEnteredValue <em>Entered Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entered Value</em>' attribute.
	 * @see #isSetEnteredValue()
	 * @see #unsetEnteredValue()
	 * @see #getEnteredValue()
	 * @generated NOT
	 */
	void setEnteredValue(F value);

	/**
	 * Unsets the value of the '{@link crosswalk.InputField#getEnteredValue <em>Entered Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnteredValue()
	 * @see #getEnteredValue()
	 * @see #setEnteredValue(Object)
	 * @generated
	 */
	void unsetEnteredValue();

	/**
	 * Returns whether the value of the '{@link crosswalk.InputField#getEnteredValue <em>Entered Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entered Value</em>' attribute is set.
	 * @see #unsetEnteredValue()
	 * @see #getEnteredValue()
	 * @see #setEnteredValue(Object)
	 * @generated
	 */
	boolean isSetEnteredValue();

} // InputField
