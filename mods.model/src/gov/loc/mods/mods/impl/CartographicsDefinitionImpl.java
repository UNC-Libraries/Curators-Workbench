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

import gov.loc.mods.mods.CartographicsDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.XsString;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartographics Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.CartographicsDefinitionImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.CartographicsDefinitionImpl#getProjection <em>Projection</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.CartographicsDefinitionImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.CartographicsDefinitionImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.CartographicsDefinitionImpl#getAuthorityURI <em>Authority URI</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.CartographicsDefinitionImpl#getValueURI <em>Value URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CartographicsDefinitionImpl extends EObjectImpl implements CartographicsDefinition {
	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected XsString scale;

	/**
	 * The cached value of the '{@link #getProjection() <em>Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjection()
	 * @generated
	 * @ordered
	 */
	protected XsString projection;

	/**
	 * The cached value of the '{@link #getCoordinates() <em>Coordinates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected EList<XsString> coordinates;

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
	protected CartographicsDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getCartographicsDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScale(XsString newScale, NotificationChain msgs) {
		XsString oldScale = scale;
		scale = newScale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MODSPackage.CARTOGRAPHICS_DEFINITION__SCALE, oldScale, newScale);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(XsString newScale) {
		if (newScale != scale) {
			NotificationChain msgs = null;
			if (scale != null)
				msgs = ((InternalEObject) scale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- MODSPackage.CARTOGRAPHICS_DEFINITION__SCALE, null, msgs);
			if (newScale != null)
				msgs = ((InternalEObject) newScale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- MODSPackage.CARTOGRAPHICS_DEFINITION__SCALE, null, msgs);
			msgs = basicSetScale(newScale, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.CARTOGRAPHICS_DEFINITION__SCALE, newScale,
					newScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsString getProjection() {
		return projection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjection(XsString newProjection, NotificationChain msgs) {
		XsString oldProjection = projection;
		projection = newProjection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MODSPackage.CARTOGRAPHICS_DEFINITION__PROJECTION, oldProjection, newProjection);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjection(XsString newProjection) {
		if (newProjection != projection) {
			NotificationChain msgs = null;
			if (projection != null)
				msgs = ((InternalEObject) projection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- MODSPackage.CARTOGRAPHICS_DEFINITION__PROJECTION, null, msgs);
			if (newProjection != null)
				msgs = ((InternalEObject) newProjection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- MODSPackage.CARTOGRAPHICS_DEFINITION__PROJECTION, null, msgs);
			msgs = basicSetProjection(newProjection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.CARTOGRAPHICS_DEFINITION__PROJECTION,
					newProjection, newProjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsString> getCoordinates() {
		if (coordinates == null) {
			coordinates = new EObjectContainmentEList<XsString>(XsString.class, this,
					MODSPackage.CARTOGRAPHICS_DEFINITION__COORDINATES);
		}
		return coordinates;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.CARTOGRAPHICS_DEFINITION__AUTHORITY,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.CARTOGRAPHICS_DEFINITION__AUTHORITY_URI,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.CARTOGRAPHICS_DEFINITION__VALUE_URI,
					oldValueURI, valueURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MODSPackage.CARTOGRAPHICS_DEFINITION__SCALE:
				return basicSetScale(null, msgs);
			case MODSPackage.CARTOGRAPHICS_DEFINITION__PROJECTION:
				return basicSetProjection(null, msgs);
			case MODSPackage.CARTOGRAPHICS_DEFINITION__COORDINATES:
				return ((InternalEList<?>) getCoordinates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MODSPackage.CARTOGRAPHICS_DEFINITION__SCALE:
				return getScale();
			case MODSPackage.CARTOGRAPHICS_DEFINITION__PROJECTION:
				return getProjection();
			case MODSPackage.CARTOGRAPHICS_DEFINITION__COORDINATES:
				return getCoordinates();
			case MODSPackage.CARTOGRAPHICS_DEFINITION__AUTHORITY:
				return getAuthority();
			case MODSPackage.CARTOGRAPHICS_DEFINITION__AUTHORITY_URI:
				return getAuthorityURI();
			case MODSPackage.CARTOGRAPHICS_DEFINITION__VALUE_URI:
				return getValueURI();
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
			case MODSPackage.CARTOGRAPHICS_DEFINITION__SCALE:
				setScale((XsString) newValue);
				return;
			case MODSPackage.CARTOGRAPHICS_DEFINITION__PROJECTION:
				setProjection((XsString) newValue);
				return;
			case MODSPackage.CARTOGRAPHICS_DEFINITION__COORDINATES:
				getCoordinates().clear();
				getCoordinates().addAll((Collection<? extends XsString>) newValue);
				return;
			case MODSPackage.CARTOGRAPHICS_DEFINITION__AUTHORITY:
				setAuthority((String) newValue);
				return;
			case MODSPackage.CARTOGRAPHICS_DEFINITION__AUTHORITY_URI:
				setAuthorityURI((String) newValue);
				return;
			case MODSPackage.CARTOGRAPHICS_DEFINITION__VALUE_URI:
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
			case MODSPackage.CARTOGRAPHICS_DEFINITION__SCALE:
				setScale((XsString) null);
				return;
			case MODSPackage.CARTOGRAPHICS_DEFINITION__PROJECTION:
				setProjection((XsString) null);
				return;
			case MODSPackage.CARTOGRAPHICS_DEFINITION__COORDINATES:
				getCoordinates().clear();
				return;
			case MODSPackage.CARTOGRAPHICS_DEFINITION__AUTHORITY:
				setAuthority(AUTHORITY_EDEFAULT);
				return;
			case MODSPackage.CARTOGRAPHICS_DEFINITION__AUTHORITY_URI:
				setAuthorityURI(AUTHORITY_URI_EDEFAULT);
				return;
			case MODSPackage.CARTOGRAPHICS_DEFINITION__VALUE_URI:
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
			case MODSPackage.CARTOGRAPHICS_DEFINITION__SCALE:
				return scale != null;
			case MODSPackage.CARTOGRAPHICS_DEFINITION__PROJECTION:
				return projection != null;
			case MODSPackage.CARTOGRAPHICS_DEFINITION__COORDINATES:
				return coordinates != null && !coordinates.isEmpty();
			case MODSPackage.CARTOGRAPHICS_DEFINITION__AUTHORITY:
				return AUTHORITY_EDEFAULT == null ? authority != null : !AUTHORITY_EDEFAULT.equals(authority);
			case MODSPackage.CARTOGRAPHICS_DEFINITION__AUTHORITY_URI:
				return AUTHORITY_URI_EDEFAULT == null ? authorityURI != null : !AUTHORITY_URI_EDEFAULT.equals(authorityURI);
			case MODSPackage.CARTOGRAPHICS_DEFINITION__VALUE_URI:
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

} //CartographicsDefinitionImpl
