/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import crosswalk.CrosswalkPackage;
import crosswalk.TextInputField;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Input Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.TextInputFieldImpl#getPreferredSize <em>Preferred Size</em>}</li>
 *   <li>{@link crosswalk.impl.TextInputFieldImpl#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link crosswalk.impl.TextInputFieldImpl#getVocabularyURL <em>Vocabulary URL</em>}</li>
 *   <li>{@link crosswalk.impl.TextInputFieldImpl#isAllowFreeText <em>Allow Free Text</em>}</li>
 *   <li>{@link crosswalk.impl.TextInputFieldImpl#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link crosswalk.impl.TextInputFieldImpl#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextInputFieldImpl extends InputFieldImpl<String> implements TextInputField {
	/**
	 * The default value of the '{@link #getPreferredSize() <em>Preferred Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredSize()
	 * @generated
	 * @ordered
	 */
	protected static final int PREFERRED_SIZE_EDEFAULT = 40;

	/**
	 * The cached value of the '{@link #getPreferredSize() <em>Preferred Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredSize()
	 * @generated
	 * @ordered
	 */
	protected int preferredSize = PREFERRED_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SIZE_EDEFAULT = 256;

	/**
	 * The cached value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected int maxSize = MAX_SIZE_EDEFAULT;

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
	 * The default value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected static final int ROWS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected int rows = ROWS_EDEFAULT;

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
	public int getPreferredSize() {
		return preferredSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredSize(int newPreferredSize) {
		int oldPreferredSize = preferredSize;
		preferredSize = newPreferredSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TEXT_INPUT_FIELD__PREFERRED_SIZE, oldPreferredSize, preferredSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSize() {
		return maxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSize(int newMaxSize) {
		int oldMaxSize = maxSize;
		maxSize = newMaxSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TEXT_INPUT_FIELD__MAX_SIZE, oldMaxSize, maxSize));
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
	public int getRows() {
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRows(int newRows) {
		int oldRows = rows;
		rows = newRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.TEXT_INPUT_FIELD__ROWS, oldRows, rows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrosswalkPackage.TEXT_INPUT_FIELD__PREFERRED_SIZE:
				return getPreferredSize();
			case CrosswalkPackage.TEXT_INPUT_FIELD__MAX_SIZE:
				return getMaxSize();
			case CrosswalkPackage.TEXT_INPUT_FIELD__VOCABULARY_URL:
				return getVocabularyURL();
			case CrosswalkPackage.TEXT_INPUT_FIELD__ALLOW_FREE_TEXT:
				return isAllowFreeText();
			case CrosswalkPackage.TEXT_INPUT_FIELD__VALID_VALUES:
				return getValidValues();
			case CrosswalkPackage.TEXT_INPUT_FIELD__ROWS:
				return getRows();
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
			case CrosswalkPackage.TEXT_INPUT_FIELD__PREFERRED_SIZE:
				setPreferredSize((Integer)newValue);
				return;
			case CrosswalkPackage.TEXT_INPUT_FIELD__MAX_SIZE:
				setMaxSize((Integer)newValue);
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
			case CrosswalkPackage.TEXT_INPUT_FIELD__ROWS:
				setRows((Integer)newValue);
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
			case CrosswalkPackage.TEXT_INPUT_FIELD__PREFERRED_SIZE:
				setPreferredSize(PREFERRED_SIZE_EDEFAULT);
				return;
			case CrosswalkPackage.TEXT_INPUT_FIELD__MAX_SIZE:
				setMaxSize(MAX_SIZE_EDEFAULT);
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
			case CrosswalkPackage.TEXT_INPUT_FIELD__ROWS:
				setRows(ROWS_EDEFAULT);
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
			case CrosswalkPackage.TEXT_INPUT_FIELD__PREFERRED_SIZE:
				return preferredSize != PREFERRED_SIZE_EDEFAULT;
			case CrosswalkPackage.TEXT_INPUT_FIELD__MAX_SIZE:
				return maxSize != MAX_SIZE_EDEFAULT;
			case CrosswalkPackage.TEXT_INPUT_FIELD__VOCABULARY_URL:
				return isSetVocabularyURL();
			case CrosswalkPackage.TEXT_INPUT_FIELD__ALLOW_FREE_TEXT:
				return allowFreeText != ALLOW_FREE_TEXT_EDEFAULT;
			case CrosswalkPackage.TEXT_INPUT_FIELD__VALID_VALUES:
				return validValues != null && !validValues.isEmpty();
			case CrosswalkPackage.TEXT_INPUT_FIELD__ROWS:
				return rows != ROWS_EDEFAULT;
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
		result.append(" (preferredSize: ");
		result.append(preferredSize);
		result.append(", maxSize: ");
		result.append(maxSize);
		result.append(", vocabularyURL: ");
		if (vocabularyURLESet) result.append(vocabularyURL); else result.append("<unset>");
		result.append(", allowFreeText: ");
		result.append(allowFreeText);
		result.append(", validValues: ");
		result.append(validValues);
		result.append(", rows: ");
		result.append(rows);
		result.append(')');
		return result.toString();
	}

} //TextInputFieldImpl
