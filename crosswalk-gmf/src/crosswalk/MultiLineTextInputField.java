/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Line Text Input Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.MultiLineTextInputField#getMaxSize <em>Max Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getMultiLineTextInputField()
 * @model superTypes="crosswalk.InputField<org.eclipse.emf.ecore.EString>"
 * @generated
 */
public interface MultiLineTextInputField extends InputField<String> {
	/**
	 * Returns the value of the '<em><b>Max Size</b></em>' attribute.
	 * The default value is <code>"2048"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Size</em>' attribute.
	 * @see #setMaxSize(int)
	 * @see crosswalk.CrosswalkPackage#getMultiLineTextInputField_MaxSize()
	 * @model default="2048" required="true"
	 * @generated
	 */
	int getMaxSize();

	/**
	 * Sets the value of the '{@link crosswalk.MultiLineTextInputField#getMaxSize <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' attribute.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(int value);

} // MultiLineTextInputField
