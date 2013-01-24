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

import gov.loc.mods.mods.CodeOrTextDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.PlaceAuthorityAttributeDefinition;
import gov.loc.mods.mods.PlaceTermDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place Term Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.PlaceTermDefinitionImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PlaceTermDefinitionImpl#getAuthorityURI <em>Authority URI</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PlaceTermDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PlaceTermDefinitionImpl#getValueURI <em>Value URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceTermDefinitionImpl extends XsStringImpl implements
		PlaceTermDefinition {
	/**
	 * The default value of the '{@link #getAuthority() <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected static final PlaceAuthorityAttributeDefinition AUTHORITY_EDEFAULT = PlaceAuthorityAttributeDefinition.MARCGAC;

	/**
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected PlaceAuthorityAttributeDefinition authority = AUTHORITY_EDEFAULT;

	/**
	 * This is true if the Authority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean authorityESet;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CodeOrTextDefinition TYPE_EDEFAULT = CodeOrTextDefinition.CODE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeOrTextDefinition type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

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
	protected PlaceTermDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getPlaceTermDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceAuthorityAttributeDefinition getAuthority() {
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthority(PlaceAuthorityAttributeDefinition newAuthority) {
		PlaceAuthorityAttributeDefinition oldAuthority = authority;
		authority = newAuthority == null ? AUTHORITY_EDEFAULT : newAuthority;
		boolean oldAuthorityESet = authorityESet;
		authorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.PLACE_TERM_DEFINITION__AUTHORITY, oldAuthority,
					authority, !oldAuthorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAuthority() {
		PlaceAuthorityAttributeDefinition oldAuthority = authority;
		boolean oldAuthorityESet = authorityESet;
		authority = AUTHORITY_EDEFAULT;
		authorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					MODSPackage.PLACE_TERM_DEFINITION__AUTHORITY, oldAuthority,
					AUTHORITY_EDEFAULT, oldAuthorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAuthority() {
		return authorityESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.PLACE_TERM_DEFINITION__AUTHORITY_URI,
					oldAuthorityURI, authorityURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeOrTextDefinition getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeOrTextDefinition newType) {
		CodeOrTextDefinition oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.PLACE_TERM_DEFINITION__TYPE, oldType, type,
					!oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		CodeOrTextDefinition oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					MODSPackage.PLACE_TERM_DEFINITION__TYPE, oldType,
					TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.PLACE_TERM_DEFINITION__VALUE_URI, oldValueURI,
					valueURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MODSPackage.PLACE_TERM_DEFINITION__AUTHORITY:
			return getAuthority();
		case MODSPackage.PLACE_TERM_DEFINITION__AUTHORITY_URI:
			return getAuthorityURI();
		case MODSPackage.PLACE_TERM_DEFINITION__TYPE:
			return getType();
		case MODSPackage.PLACE_TERM_DEFINITION__VALUE_URI:
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
		case MODSPackage.PLACE_TERM_DEFINITION__AUTHORITY:
			setAuthority((PlaceAuthorityAttributeDefinition) newValue);
			return;
		case MODSPackage.PLACE_TERM_DEFINITION__AUTHORITY_URI:
			setAuthorityURI((String) newValue);
			return;
		case MODSPackage.PLACE_TERM_DEFINITION__TYPE:
			setType((CodeOrTextDefinition) newValue);
			return;
		case MODSPackage.PLACE_TERM_DEFINITION__VALUE_URI:
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
		case MODSPackage.PLACE_TERM_DEFINITION__AUTHORITY:
			unsetAuthority();
			return;
		case MODSPackage.PLACE_TERM_DEFINITION__AUTHORITY_URI:
			setAuthorityURI(AUTHORITY_URI_EDEFAULT);
			return;
		case MODSPackage.PLACE_TERM_DEFINITION__TYPE:
			unsetType();
			return;
		case MODSPackage.PLACE_TERM_DEFINITION__VALUE_URI:
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
		case MODSPackage.PLACE_TERM_DEFINITION__AUTHORITY:
			return isSetAuthority();
		case MODSPackage.PLACE_TERM_DEFINITION__AUTHORITY_URI:
			return AUTHORITY_URI_EDEFAULT == null ? authorityURI != null
					: !AUTHORITY_URI_EDEFAULT.equals(authorityURI);
		case MODSPackage.PLACE_TERM_DEFINITION__TYPE:
			return isSetType();
		case MODSPackage.PLACE_TERM_DEFINITION__VALUE_URI:
			return VALUE_URI_EDEFAULT == null ? valueURI != null
					: !VALUE_URI_EDEFAULT.equals(valueURI);
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
		if (authorityESet)
			result.append(authority);
		else
			result.append("<unset>");
		result.append(", authorityURI: ");
		result.append(authorityURI);
		result.append(", type: ");
		if (typeESet)
			result.append(type);
		else
			result.append("<unset>");
		result.append(", valueURI: ");
		result.append(valueURI);
		result.append(')');
		return result.toString();
	}

} //PlaceTermDefinitionImpl
