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

import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.StringPlusSupplied;
import gov.loc.mods.mods.YesDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Plus Supplied</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.StringPlusSuppliedImpl#getSupplied <em>Supplied</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringPlusSuppliedImpl extends XsStringImpl implements StringPlusSupplied {
	/**
	 * The default value of the '{@link #getSupplied() <em>Supplied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplied()
	 * @generated
	 * @ordered
	 */
	protected static final YesDefinition SUPPLIED_EDEFAULT = YesDefinition.YES;

	/**
	 * The cached value of the '{@link #getSupplied() <em>Supplied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplied()
	 * @generated
	 * @ordered
	 */
	protected YesDefinition supplied = SUPPLIED_EDEFAULT;

	/**
	 * This is true if the Supplied attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean suppliedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringPlusSuppliedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getStringPlusSupplied();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesDefinition getSupplied() {
		return supplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplied(YesDefinition newSupplied) {
		YesDefinition oldSupplied = supplied;
		supplied = newSupplied == null ? SUPPLIED_EDEFAULT : newSupplied;
		boolean oldSuppliedESet = suppliedESet;
		suppliedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.STRING_PLUS_SUPPLIED__SUPPLIED, oldSupplied,
					supplied, !oldSuppliedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSupplied() {
		YesDefinition oldSupplied = supplied;
		boolean oldSuppliedESet = suppliedESet;
		supplied = SUPPLIED_EDEFAULT;
		suppliedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.STRING_PLUS_SUPPLIED__SUPPLIED,
					oldSupplied, SUPPLIED_EDEFAULT, oldSuppliedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSupplied() {
		return suppliedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MODSPackage.STRING_PLUS_SUPPLIED__SUPPLIED:
				return getSupplied();
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
			case MODSPackage.STRING_PLUS_SUPPLIED__SUPPLIED:
				setSupplied((YesDefinition) newValue);
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
			case MODSPackage.STRING_PLUS_SUPPLIED__SUPPLIED:
				unsetSupplied();
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
			case MODSPackage.STRING_PLUS_SUPPLIED__SUPPLIED:
				return isSetSupplied();
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
		result.append(" (supplied: ");
		if (suppliedESet)
			result.append(supplied);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StringPlusSuppliedImpl
