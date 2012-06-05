/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Input Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.TextInputField#getPreferredSize <em>Preferred Size</em>}</li>
 *   <li>{@link crosswalk.TextInputField#getMaxSize <em>Max Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getTextInputField()
 * @model superTypes="crosswalk.InputField<org.eclipse.emf.ecore.EString>"
 * @generated
 */
public interface TextInputField extends InputField<String> {
	/**
	 * Returns the value of the '<em><b>Preferred Size</b></em>' attribute.
	 * The default value is <code>"40"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Size</em>' attribute.
	 * @see #setPreferredSize(int)
	 * @see crosswalk.CrosswalkPackage#getTextInputField_PreferredSize()
	 * @model default="40" required="true"
	 * @generated
	 */
	int getPreferredSize();

	/**
	 * Sets the value of the '{@link crosswalk.TextInputField#getPreferredSize <em>Preferred Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Size</em>' attribute.
	 * @see #getPreferredSize()
	 * @generated
	 */
	void setPreferredSize(int value);

	/**
	 * Returns the value of the '<em><b>Max Size</b></em>' attribute.
	 * The default value is <code>"256"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Size</em>' attribute.
	 * @see #setMaxSize(int)
	 * @see crosswalk.CrosswalkPackage#getTextInputField_MaxSize()
	 * @model default="256" required="true"
	 * @generated
	 */
	int getMaxSize();

	/**
	 * Sets the value of the '{@link crosswalk.TextInputField#getMaxSize <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' attribute.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(int value);

} // TextInputField
