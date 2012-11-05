/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import crosswalk.CrosswalkPackage;
import crosswalk.FieldWidth;
import crosswalk.TextInputField;
import crosswalk.TextInputType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Input Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.TextInputFieldImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link crosswalk.impl.TextInputFieldImpl#getMaxCharacters <em>Max Characters</em>}</li>
 *   <li>{@link crosswalk.impl.TextInputFieldImpl#getVocabularyURL <em>Vocabulary URL</em>}</li>
 *   <li>{@link crosswalk.impl.TextInputFieldImpl#isAllowFreeText <em>Allow Free Text</em>}</li>
 *   <li>{@link crosswalk.impl.TextInputFieldImpl#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link crosswalk.impl.TextInputFieldImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextInputFieldImpl extends InputFieldImpl<String> implements TextInputField {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final FieldWidth WIDTH_EDEFAULT = FieldWidth.NORMAL;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected FieldWidth width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCharacters() <em>Max Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCharacters()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_CHARACTERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCharacters() <em>Max Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCharacters()
	 * @generated
	 * @ordered
	 */
	protected Integer maxCharacters = MAX_CHARACTERS_EDEFAULT;

	/**
	 * This is true if the Max Characters attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxCharactersESet;

	/**
	 * The default value of the '{@link #getVocabularyURL() <em>Vocabulary URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabularyURL()
	 * @generated
	 * @ordered
	 */
	protected static final String VOCABULARY_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVocabularyURL() <em>Vocabulary URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabularyURL()
	 * @generated
	 * @ordered
	 */
	protected String vocabularyURL = VOCABULARY_URL_EDEFAULT;

	/**
	 * This is true if the Vocabulary URL attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vocabularyURLESet;

	/**
	 * The default value of the '{@link #isAllowFreeText() <em>Allow Free Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowFreeText()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_FREE_TEXT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAllowFreeText() <em>Allow Free Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowFreeText()
	 * @generated
	 * @ordered
	 */
	protected boolean allowFreeText = ALLOW_FREE_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidValues() <em>Valid Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> validValues;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TextInputType TYPE_EDEFAULT = TextInputType.SINGLE_LINE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TextInputType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextInputFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.TEXT_INPUT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldWidth getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(FieldWidth newWidth) {
		FieldWidth oldWidth = width;
		width = newWidth == null ? WIDTH_EDEFAULT : newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TEXT_INPUT_FIELD__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxCharacters() {
		return maxCharacters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCharacters(Integer newMaxCharacters) {
		Integer oldMaxCharacters = maxCharacters;
		maxCharacters = newMaxCharacters;
		boolean oldMaxCharactersESet = maxCharactersESet;
		maxCharactersESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TEXT_INPUT_FIELD__MAX_CHARACTERS, oldMaxCharacters, maxCharacters, !oldMaxCharactersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxCharacters() {
		Integer oldMaxCharacters = maxCharacters;
		boolean oldMaxCharactersESet = maxCharactersESet;
		maxCharacters = MAX_CHARACTERS_EDEFAULT;
		maxCharactersESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.TEXT_INPUT_FIELD__MAX_CHARACTERS, oldMaxCharacters, MAX_CHARACTERS_EDEFAULT, oldMaxCharactersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxCharacters() {
		return maxCharactersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVocabularyURL() {
		return vocabularyURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVocabularyURL(String newVocabularyURL) {
		String oldVocabularyURL = vocabularyURL;
		vocabularyURL = newVocabularyURL;
		boolean oldVocabularyURLESet = vocabularyURLESet;
		vocabularyURLESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TEXT_INPUT_FIELD__VOCABULARY_URL, oldVocabularyURL, vocabularyURL, !oldVocabularyURLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVocabularyURL() {
		String oldVocabularyURL = vocabularyURL;
		boolean oldVocabularyURLESet = vocabularyURLESet;
		vocabularyURL = VOCABULARY_URL_EDEFAULT;
		vocabularyURLESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.TEXT_INPUT_FIELD__VOCABULARY_URL, oldVocabularyURL, VOCABULARY_URL_EDEFAULT, oldVocabularyURLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVocabularyURL() {
		return vocabularyURLESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowFreeText() {
		return allowFreeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowFreeText(boolean newAllowFreeText) {
		boolean oldAllowFreeText = allowFreeText;
		allowFreeText = newAllowFreeText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TEXT_INPUT_FIELD__ALLOW_FREE_TEXT, oldAllowFreeText, allowFreeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValidValues() {
		if (validValues == null) {
			validValues = new EDataTypeUniqueEList<String>(String.class, this, CrosswalkPackage.TEXT_INPUT_FIELD__VALID_VALUES);
		}
		return validValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TextInputType newType) {
		TextInputType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TEXT_INPUT_FIELD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrosswalkPackage.TEXT_INPUT_FIELD__WIDTH:
				return getWidth();
			case CrosswalkPackage.TEXT_INPUT_FIELD__MAX_CHARACTERS:
				return getMaxCharacters();
			case CrosswalkPackage.TEXT_INPUT_FIELD__VOCABULARY_URL:
				return getVocabularyURL();
			case CrosswalkPackage.TEXT_INPUT_FIELD__ALLOW_FREE_TEXT:
				return isAllowFreeText();
			case CrosswalkPackage.TEXT_INPUT_FIELD__VALID_VALUES:
				return getValidValues();
			case CrosswalkPackage.TEXT_INPUT_FIELD__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CrosswalkPackage.TEXT_INPUT_FIELD__WIDTH:
				setWidth((FieldWidth)newValue);
				return;
			case CrosswalkPackage.TEXT_INPUT_FIELD__MAX_CHARACTERS:
				setMaxCharacters((Integer)newValue);
				return;
			case CrosswalkPackage.TEXT_INPUT_FIELD__VOCABULARY_URL:
				setVocabularyURL((String)newValue);
				return;
			case CrosswalkPackage.TEXT_INPUT_FIELD__ALLOW_FREE_TEXT:
				setAllowFreeText((Boolean)newValue);
				return;
			case CrosswalkPackage.TEXT_INPUT_FIELD__VALID_VALUES:
				getValidValues().clear();
				getValidValues().addAll((Collection<? extends String>)newValue);
				return;
			case CrosswalkPackage.TEXT_INPUT_FIELD__TYPE:
				setType((TextInputType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CrosswalkPackage.TEXT_INPUT_FIELD__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case CrosswalkPackage.TEXT_INPUT_FIELD__MAX_CHARACTERS:
				unsetMaxCharacters();
				return;
			case CrosswalkPackage.TEXT_INPUT_FIELD__VOCABULARY_URL:
				unsetVocabularyURL();
				return;
			case CrosswalkPackage.TEXT_INPUT_FIELD__ALLOW_FREE_TEXT:
				setAllowFreeText(ALLOW_FREE_TEXT_EDEFAULT);
				return;
			case CrosswalkPackage.TEXT_INPUT_FIELD__VALID_VALUES:
				getValidValues().clear();
				return;
			case CrosswalkPackage.TEXT_INPUT_FIELD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CrosswalkPackage.TEXT_INPUT_FIELD__WIDTH:
				return width != WIDTH_EDEFAULT;
			case CrosswalkPackage.TEXT_INPUT_FIELD__MAX_CHARACTERS:
				return isSetMaxCharacters();
			case CrosswalkPackage.TEXT_INPUT_FIELD__VOCABULARY_URL:
				return isSetVocabularyURL();
			case CrosswalkPackage.TEXT_INPUT_FIELD__ALLOW_FREE_TEXT:
				return allowFreeText != ALLOW_FREE_TEXT_EDEFAULT;
			case CrosswalkPackage.TEXT_INPUT_FIELD__VALID_VALUES:
				return validValues != null && !validValues.isEmpty();
			case CrosswalkPackage.TEXT_INPUT_FIELD__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (width: ");
		result.append(width);
		result.append(", maxCharacters: ");
		if (maxCharactersESet) result.append(maxCharacters); else result.append("<unset>");
		result.append(", vocabularyURL: ");
		if (vocabularyURLESet) result.append(vocabularyURL); else result.append("<unset>");
		result.append(", allowFreeText: ");
		result.append(allowFreeText);
		result.append(", validValues: ");
		result.append(validValues);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TextInputFieldImpl
