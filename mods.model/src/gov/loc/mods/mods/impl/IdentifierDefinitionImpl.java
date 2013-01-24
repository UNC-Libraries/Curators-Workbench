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

import gov.loc.mods.mods.IdentifierDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.YesDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.IdentifierDefinitionImpl#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.IdentifierDefinitionImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.IdentifierDefinitionImpl#getInvalid <em>Invalid</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.IdentifierDefinitionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentifierDefinitionImpl extends XsStringImpl implements
		IdentifierDefinition {
	/**
	 * The default value of the '{@link #getAltRepGroup() <em>Alt Rep Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltRepGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_REP_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAltRepGroup() <em>Alt Rep Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltRepGroup()
	 * @generated
	 * @ordered
	 */
	protected String altRepGroup = ALT_REP_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected String displayLabel = DISPLAY_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvalid() <em>Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalid()
	 * @generated
	 * @ordered
	 */
	protected static final YesDefinition INVALID_EDEFAULT = YesDefinition.YES;

	/**
	 * The cached value of the '{@link #getInvalid() <em>Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalid()
	 * @generated
	 * @ordered
	 */
	protected YesDefinition invalid = INVALID_EDEFAULT;

	/**
	 * This is true if the Invalid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean invalidESet;

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
	protected IdentifierDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getIdentifierDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAltRepGroup() {
		return altRepGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltRepGroup(String newAltRepGroup) {
		String oldAltRepGroup = altRepGroup;
		altRepGroup = newAltRepGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.IDENTIFIER_DEFINITION__ALT_REP_GROUP,
					oldAltRepGroup, altRepGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayLabel() {
		return displayLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayLabel(String newDisplayLabel) {
		String oldDisplayLabel = displayLabel;
		displayLabel = newDisplayLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.IDENTIFIER_DEFINITION__DISPLAY_LABEL,
					oldDisplayLabel, displayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesDefinition getInvalid() {
		return invalid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvalid(YesDefinition newInvalid) {
		YesDefinition oldInvalid = invalid;
		invalid = newInvalid == null ? INVALID_EDEFAULT : newInvalid;
		boolean oldInvalidESet = invalidESet;
		invalidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.IDENTIFIER_DEFINITION__INVALID, oldInvalid,
					invalid, !oldInvalidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInvalid() {
		YesDefinition oldInvalid = invalid;
		boolean oldInvalidESet = invalidESet;
		invalid = INVALID_EDEFAULT;
		invalidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					MODSPackage.IDENTIFIER_DEFINITION__INVALID, oldInvalid,
					INVALID_EDEFAULT, oldInvalidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInvalid() {
		return invalidESet;
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
					MODSPackage.IDENTIFIER_DEFINITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MODSPackage.IDENTIFIER_DEFINITION__ALT_REP_GROUP:
			return getAltRepGroup();
		case MODSPackage.IDENTIFIER_DEFINITION__DISPLAY_LABEL:
			return getDisplayLabel();
		case MODSPackage.IDENTIFIER_DEFINITION__INVALID:
			return getInvalid();
		case MODSPackage.IDENTIFIER_DEFINITION__TYPE:
			return getType();
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
		case MODSPackage.IDENTIFIER_DEFINITION__ALT_REP_GROUP:
			setAltRepGroup((String) newValue);
			return;
		case MODSPackage.IDENTIFIER_DEFINITION__DISPLAY_LABEL:
			setDisplayLabel((String) newValue);
			return;
		case MODSPackage.IDENTIFIER_DEFINITION__INVALID:
			setInvalid((YesDefinition) newValue);
			return;
		case MODSPackage.IDENTIFIER_DEFINITION__TYPE:
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
		case MODSPackage.IDENTIFIER_DEFINITION__ALT_REP_GROUP:
			setAltRepGroup(ALT_REP_GROUP_EDEFAULT);
			return;
		case MODSPackage.IDENTIFIER_DEFINITION__DISPLAY_LABEL:
			setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
			return;
		case MODSPackage.IDENTIFIER_DEFINITION__INVALID:
			unsetInvalid();
			return;
		case MODSPackage.IDENTIFIER_DEFINITION__TYPE:
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
		case MODSPackage.IDENTIFIER_DEFINITION__ALT_REP_GROUP:
			return ALT_REP_GROUP_EDEFAULT == null ? altRepGroup != null
					: !ALT_REP_GROUP_EDEFAULT.equals(altRepGroup);
		case MODSPackage.IDENTIFIER_DEFINITION__DISPLAY_LABEL:
			return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null
					: !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
		case MODSPackage.IDENTIFIER_DEFINITION__INVALID:
			return isSetInvalid();
		case MODSPackage.IDENTIFIER_DEFINITION__TYPE:
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
		result.append(" (altRepGroup: ");
		result.append(altRepGroup);
		result.append(", displayLabel: ");
		result.append(displayLabel);
		result.append(", invalid: ");
		if (invalidESet)
			result.append(invalid);
		else
			result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //IdentifierDefinitionImpl
