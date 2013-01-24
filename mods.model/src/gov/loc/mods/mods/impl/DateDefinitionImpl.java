/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.DateDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.YesDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.DateDefinitionImpl#getKeyDate <em>Key Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateDefinitionImpl extends DateBaseDefinitionImpl implements
		DateDefinition {
	/**
	 * The default value of the '{@link #getKeyDate() <em>Key Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyDate()
	 * @generated
	 * @ordered
	 */
	protected static final YesDefinition KEY_DATE_EDEFAULT = YesDefinition.YES;

	/**
	 * The cached value of the '{@link #getKeyDate() <em>Key Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyDate()
	 * @generated
	 * @ordered
	 */
	protected YesDefinition keyDate = KEY_DATE_EDEFAULT;

	/**
	 * This is true if the Key Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyDateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getDateDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesDefinition getKeyDate() {
		return keyDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyDate(YesDefinition newKeyDate) {
		YesDefinition oldKeyDate = keyDate;
		keyDate = newKeyDate == null ? KEY_DATE_EDEFAULT : newKeyDate;
		boolean oldKeyDateESet = keyDateESet;
		keyDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.DATE_DEFINITION__KEY_DATE, oldKeyDate, keyDate,
					!oldKeyDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeyDate() {
		YesDefinition oldKeyDate = keyDate;
		boolean oldKeyDateESet = keyDateESet;
		keyDate = KEY_DATE_EDEFAULT;
		keyDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					MODSPackage.DATE_DEFINITION__KEY_DATE, oldKeyDate,
					KEY_DATE_EDEFAULT, oldKeyDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeyDate() {
		return keyDateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MODSPackage.DATE_DEFINITION__KEY_DATE:
			return getKeyDate();
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
		case MODSPackage.DATE_DEFINITION__KEY_DATE:
			setKeyDate((YesDefinition) newValue);
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
		case MODSPackage.DATE_DEFINITION__KEY_DATE:
			unsetKeyDate();
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
		case MODSPackage.DATE_DEFINITION__KEY_DATE:
			return isSetKeyDate();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (keyDate: ");
		if (keyDateESet)
			result.append(keyDate);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DateDefinitionImpl
