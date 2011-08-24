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
import gov.loc.mods.mods.StringPlusAuthority;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Plus Authority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.StringPlusAuthorityImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.StringPlusAuthorityImpl#getAuthorityURI <em>Authority URI</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.StringPlusAuthorityImpl#getValueURI <em>Value URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringPlusAuthorityImpl extends XsStringImpl implements StringPlusAuthority {
	/**
	 * The default value of the '{@link #getAuthority() <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected String authority = AUTHORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorityURI() <em>Authority URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityURI()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORITY_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorityURI() <em>Authority URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityURI()
	 * @generated
	 * @ordered
	 */
	protected String authorityURI = AUTHORITY_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueURI() <em>Value URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueURI()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueURI() <em>Value URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueURI()
	 * @generated
	 * @ordered
	 */
	protected String valueURI = VALUE_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringPlusAuthorityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getStringPlusAuthority();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthority() {
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthority(String newAuthority) {
		String oldAuthority = authority;
		authority = newAuthority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.STRING_PLUS_AUTHORITY__AUTHORITY,
					oldAuthority, authority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorityURI() {
		return authorityURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorityURI(String newAuthorityURI) {
		String oldAuthorityURI = authorityURI;
		authorityURI = newAuthorityURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.STRING_PLUS_AUTHORITY__AUTHORITY_URI,
					oldAuthorityURI, authorityURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueURI() {
		return valueURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueURI(String newValueURI) {
		String oldValueURI = valueURI;
		valueURI = newValueURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.STRING_PLUS_AUTHORITY__VALUE_URI,
					oldValueURI, valueURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MODSPackage.STRING_PLUS_AUTHORITY__AUTHORITY:
				return getAuthority();
			case MODSPackage.STRING_PLUS_AUTHORITY__AUTHORITY_URI:
				return getAuthorityURI();
			case MODSPackage.STRING_PLUS_AUTHORITY__VALUE_URI:
				return getValueURI();
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
			case MODSPackage.STRING_PLUS_AUTHORITY__AUTHORITY:
				setAuthority((String) newValue);
				return;
			case MODSPackage.STRING_PLUS_AUTHORITY__AUTHORITY_URI:
				setAuthorityURI((String) newValue);
				return;
			case MODSPackage.STRING_PLUS_AUTHORITY__VALUE_URI:
				setValueURI((String) newValue);
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
			case MODSPackage.STRING_PLUS_AUTHORITY__AUTHORITY:
				setAuthority(AUTHORITY_EDEFAULT);
				return;
			case MODSPackage.STRING_PLUS_AUTHORITY__AUTHORITY_URI:
				setAuthorityURI(AUTHORITY_URI_EDEFAULT);
				return;
			case MODSPackage.STRING_PLUS_AUTHORITY__VALUE_URI:
				setValueURI(VALUE_URI_EDEFAULT);
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
			case MODSPackage.STRING_PLUS_AUTHORITY__AUTHORITY:
				return AUTHORITY_EDEFAULT == null ? authority != null : !AUTHORITY_EDEFAULT.equals(authority);
			case MODSPackage.STRING_PLUS_AUTHORITY__AUTHORITY_URI:
				return AUTHORITY_URI_EDEFAULT == null ? authorityURI != null : !AUTHORITY_URI_EDEFAULT.equals(authorityURI);
			case MODSPackage.STRING_PLUS_AUTHORITY__VALUE_URI:
				return VALUE_URI_EDEFAULT == null ? valueURI != null : !VALUE_URI_EDEFAULT.equals(valueURI);
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
		result.append(" (authority: ");
		result.append(authority);
		result.append(", authorityURI: ");
		result.append(authorityURI);
		result.append(", valueURI: ");
		result.append(valueURI);
		result.append(')');
		return result.toString();
	}

} //StringPlusAuthorityImpl
