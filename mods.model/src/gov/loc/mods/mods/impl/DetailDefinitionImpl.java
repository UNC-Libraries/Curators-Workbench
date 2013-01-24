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

import gov.loc.mods.mods.DetailDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.XsString;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detail Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.DetailDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DetailDefinitionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DetailDefinitionImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DetailDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DetailDefinitionImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DetailDefinitionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DetailDefinitionImpl extends EObjectImpl implements
		DetailDefinition {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getDetailDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this,
					MODSPackage.DETAIL_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsString> getNumber() {
		return getGroup().list(
				MODSPackage.eINSTANCE.getDetailDefinition_Number());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsString> getCaption() {
		return getGroup().list(
				MODSPackage.eINSTANCE.getDetailDefinition_Caption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsString> getTitle() {
		return getGroup().list(
				MODSPackage.eINSTANCE.getDetailDefinition_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(BigInteger newLevel) {
		BigInteger oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.DETAIL_DEFINITION__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.DETAIL_DEFINITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MODSPackage.DETAIL_DEFINITION__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case MODSPackage.DETAIL_DEFINITION__NUMBER:
			return ((InternalEList<?>) getNumber()).basicRemove(otherEnd, msgs);
		case MODSPackage.DETAIL_DEFINITION__CAPTION:
			return ((InternalEList<?>) getCaption())
					.basicRemove(otherEnd, msgs);
		case MODSPackage.DETAIL_DEFINITION__TITLE:
			return ((InternalEList<?>) getTitle()).basicRemove(otherEnd, msgs);
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
		case MODSPackage.DETAIL_DEFINITION__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case MODSPackage.DETAIL_DEFINITION__NUMBER:
			return getNumber();
		case MODSPackage.DETAIL_DEFINITION__CAPTION:
			return getCaption();
		case MODSPackage.DETAIL_DEFINITION__TITLE:
			return getTitle();
		case MODSPackage.DETAIL_DEFINITION__LEVEL:
			return getLevel();
		case MODSPackage.DETAIL_DEFINITION__TYPE:
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
		case MODSPackage.DETAIL_DEFINITION__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case MODSPackage.DETAIL_DEFINITION__NUMBER:
			getNumber().clear();
			getNumber().addAll((Collection<? extends XsString>) newValue);
			return;
		case MODSPackage.DETAIL_DEFINITION__CAPTION:
			getCaption().clear();
			getCaption().addAll((Collection<? extends XsString>) newValue);
			return;
		case MODSPackage.DETAIL_DEFINITION__TITLE:
			getTitle().clear();
			getTitle().addAll((Collection<? extends XsString>) newValue);
			return;
		case MODSPackage.DETAIL_DEFINITION__LEVEL:
			setLevel((BigInteger) newValue);
			return;
		case MODSPackage.DETAIL_DEFINITION__TYPE:
			setType((String) newValue);
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
		case MODSPackage.DETAIL_DEFINITION__GROUP:
			getGroup().clear();
			return;
		case MODSPackage.DETAIL_DEFINITION__NUMBER:
			getNumber().clear();
			return;
		case MODSPackage.DETAIL_DEFINITION__CAPTION:
			getCaption().clear();
			return;
		case MODSPackage.DETAIL_DEFINITION__TITLE:
			getTitle().clear();
			return;
		case MODSPackage.DETAIL_DEFINITION__LEVEL:
			setLevel(LEVEL_EDEFAULT);
			return;
		case MODSPackage.DETAIL_DEFINITION__TYPE:
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
		case MODSPackage.DETAIL_DEFINITION__GROUP:
			return group != null && !group.isEmpty();
		case MODSPackage.DETAIL_DEFINITION__NUMBER:
			return !getNumber().isEmpty();
		case MODSPackage.DETAIL_DEFINITION__CAPTION:
			return !getCaption().isEmpty();
		case MODSPackage.DETAIL_DEFINITION__TITLE:
			return !getTitle().isEmpty();
		case MODSPackage.DETAIL_DEFINITION__LEVEL:
			return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT
					.equals(level);
		case MODSPackage.DETAIL_DEFINITION__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
					.equals(type);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", level: ");
		result.append(level);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DetailDefinitionImpl
