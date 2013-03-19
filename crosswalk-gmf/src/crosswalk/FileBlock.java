/**
 */
package crosswalk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.FileBlock#getName <em>Name</em>}</li>
 *   <li>{@link crosswalk.FileBlock#getDescription <em>Description</em>}</li>
 *   <li>{@link crosswalk.FileBlock#getLabel <em>Label</em>}</li>
 *   <li>{@link crosswalk.FileBlock#isRequired <em>Required</em>}</li>
 *   <li>{@link crosswalk.FileBlock#getEnteredValue <em>Entered Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getFileBlock()
 * @model
 * @generated
 */
public interface FileBlock extends FormElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see crosswalk.CrosswalkPackage#getFileBlock_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crosswalk.FileBlock#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see crosswalk.CrosswalkPackage#getFileBlock_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link crosswalk.FileBlock#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see crosswalk.CrosswalkPackage#getFileBlock_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link crosswalk.FileBlock#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see crosswalk.CrosswalkPackage#getFileBlock_Required()
	 * @model required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link crosswalk.FileBlock#isRequired <em>Required</em>}' attribute.
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
	 * @see crosswalk.CrosswalkPackage#getFileBlock_EnteredValue()
	 * @model unsettable="true" transient="true"
	 * @generated
	 */
	Object getEnteredValue();

	/**
	 * Sets the value of the '{@link crosswalk.FileBlock#getEnteredValue <em>Entered Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entered Value</em>' attribute.
	 * @see #isSetEnteredValue()
	 * @see #unsetEnteredValue()
	 * @see #getEnteredValue()
	 * @generated
	 */
	void setEnteredValue(Object value);

	/**
	 * Unsets the value of the '{@link crosswalk.FileBlock#getEnteredValue <em>Entered Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnteredValue()
	 * @see #getEnteredValue()
	 * @see #setEnteredValue(Object)
	 * @generated
	 */
	void unsetEnteredValue();

	/**
	 * Returns whether the value of the '{@link crosswalk.FileBlock#getEnteredValue <em>Entered Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entered Value</em>' attribute is set.
	 * @see #unsetEnteredValue()
	 * @see #getEnteredValue()
	 * @see #setEnteredValue(Object)
	 * @generated
	 */
	boolean isSetEnteredValue();

} // FileBlock
