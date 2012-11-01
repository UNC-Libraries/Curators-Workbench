/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import org.eclipse.emf.common.util.EList;


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
 *   <li>{@link crosswalk.TextInputField#getVocabularyURL <em>Vocabulary URL</em>}</li>
 *   <li>{@link crosswalk.TextInputField#isAllowFreeText <em>Allow Free Text</em>}</li>
 *   <li>{@link crosswalk.TextInputField#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link crosswalk.TextInputField#getRows <em>Rows</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Vocabulary URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vocabulary URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vocabulary URL</em>' attribute.
	 * @see #isSetVocabularyURL()
	 * @see #unsetVocabularyURL()
	 * @see #setVocabularyURL(String)
	 * @see crosswalk.CrosswalkPackage#getTextInputField_VocabularyURL()
	 * @model unsettable="true"
	 * @generated
	 */
	String getVocabularyURL();

	/**
	 * Sets the value of the '{@link crosswalk.TextInputField#getVocabularyURL <em>Vocabulary URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vocabulary URL</em>' attribute.
	 * @see #isSetVocabularyURL()
	 * @see #unsetVocabularyURL()
	 * @see #getVocabularyURL()
	 * @generated
	 */
	void setVocabularyURL(String value);

	/**
	 * Unsets the value of the '{@link crosswalk.TextInputField#getVocabularyURL <em>Vocabulary URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVocabularyURL()
	 * @see #getVocabularyURL()
	 * @see #setVocabularyURL(String)
	 * @generated
	 */
	void unsetVocabularyURL();

	/**
	 * Returns whether the value of the '{@link crosswalk.TextInputField#getVocabularyURL <em>Vocabulary URL</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vocabulary URL</em>' attribute is set.
	 * @see #unsetVocabularyURL()
	 * @see #getVocabularyURL()
	 * @see #setVocabularyURL(String)
	 * @generated
	 */
	boolean isSetVocabularyURL();

	/**
	 * Returns the value of the '<em><b>Allow Free Text</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Free Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Free Text</em>' attribute.
	 * @see #setAllowFreeText(boolean)
	 * @see crosswalk.CrosswalkPackage#getTextInputField_AllowFreeText()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isAllowFreeText();

	/**
	 * Sets the value of the '{@link crosswalk.TextInputField#isAllowFreeText <em>Allow Free Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Free Text</em>' attribute.
	 * @see #isAllowFreeText()
	 * @generated
	 */
	void setAllowFreeText(boolean value);

	/**
	 * Returns the value of the '<em><b>Valid Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Values</em>' attribute list.
	 * @see crosswalk.CrosswalkPackage#getTextInputField_ValidValues()
	 * @model
	 * @generated
	 */
	EList<String> getValidValues();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see crosswalk.CrosswalkPackage#getTextInputField_Rows()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link crosswalk.TextInputField#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

} // TextInputField
