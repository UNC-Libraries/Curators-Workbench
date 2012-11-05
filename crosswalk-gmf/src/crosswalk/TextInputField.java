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
 *   <li>{@link crosswalk.TextInputField#getWidth <em>Width</em>}</li>
 *   <li>{@link crosswalk.TextInputField#getMaxCharacters <em>Max Characters</em>}</li>
 *   <li>{@link crosswalk.TextInputField#getVocabularyURL <em>Vocabulary URL</em>}</li>
 *   <li>{@link crosswalk.TextInputField#isAllowFreeText <em>Allow Free Text</em>}</li>
 *   <li>{@link crosswalk.TextInputField#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link crosswalk.TextInputField#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getTextInputField()
 * @model superTypes="crosswalk.InputField<org.eclipse.emf.ecore.EString>"
 * @generated
 */
public interface TextInputField extends InputField<String> {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"Normal"</code>.
	 * The literals are from the enumeration {@link crosswalk.FieldWidth}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see crosswalk.FieldWidth
	 * @see #setWidth(FieldWidth)
	 * @see crosswalk.CrosswalkPackage#getTextInputField_Width()
	 * @model default="Normal" required="true"
	 * @generated
	 */
	FieldWidth getWidth();

	/**
	 * Sets the value of the '{@link crosswalk.TextInputField#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see crosswalk.FieldWidth
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(FieldWidth value);

	/**
	 * Returns the value of the '<em><b>Max Characters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Characters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Characters</em>' attribute.
	 * @see #isSetMaxCharacters()
	 * @see #unsetMaxCharacters()
	 * @see #setMaxCharacters(Integer)
	 * @see crosswalk.CrosswalkPackage#getTextInputField_MaxCharacters()
	 * @model unsettable="true"
	 * @generated
	 */
	Integer getMaxCharacters();

	/**
	 * Sets the value of the '{@link crosswalk.TextInputField#getMaxCharacters <em>Max Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Characters</em>' attribute.
	 * @see #isSetMaxCharacters()
	 * @see #unsetMaxCharacters()
	 * @see #getMaxCharacters()
	 * @generated
	 */
	void setMaxCharacters(Integer value);

	/**
	 * Unsets the value of the '{@link crosswalk.TextInputField#getMaxCharacters <em>Max Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxCharacters()
	 * @see #getMaxCharacters()
	 * @see #setMaxCharacters(Integer)
	 * @generated
	 */
	void unsetMaxCharacters();

	/**
	 * Returns whether the value of the '{@link crosswalk.TextInputField#getMaxCharacters <em>Max Characters</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Characters</em>' attribute is set.
	 * @see #unsetMaxCharacters()
	 * @see #getMaxCharacters()
	 * @see #setMaxCharacters(Integer)
	 * @generated
	 */
	boolean isSetMaxCharacters();

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
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"SingleLine"</code>.
	 * The literals are from the enumeration {@link crosswalk.TextInputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see crosswalk.TextInputType
	 * @see #setType(TextInputType)
	 * @see crosswalk.CrosswalkPackage#getTextInputField_Type()
	 * @model default="SingleLine" required="true"
	 * @generated
	 */
	TextInputType getType();

	/**
	 * Sets the value of the '{@link crosswalk.TextInputField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see crosswalk.TextInputType
	 * @see #getType()
	 * @generated
	 */
	void setType(TextInputType value);

} // TextInputField
