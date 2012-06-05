/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import crosswalk.CrosswalkPackage;
import crosswalk.TextInputField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Input Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.TextInputFieldImpl#getPreferredSize <em>Preferred Size</em>}</li>
 *   <li>{@link crosswalk.impl.TextInputFieldImpl#getMaxSize <em>Max Size</em>}</li>
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrosswalkPackage.TEXT_INPUT_FIELD__PREFERRED_SIZE:
				return getPreferredSize();
			case CrosswalkPackage.TEXT_INPUT_FIELD__MAX_SIZE:
				return getMaxSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CrosswalkPackage.TEXT_INPUT_FIELD__PREFERRED_SIZE:
				setPreferredSize((Integer)newValue);
				return;
			case CrosswalkPackage.TEXT_INPUT_FIELD__MAX_SIZE:
				setMaxSize((Integer)newValue);
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
		result.append(')');
		return result.toString();
	}

} //TextInputFieldImpl
