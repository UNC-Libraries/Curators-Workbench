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

import gov.loc.mods.mods.ClassificationDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.UsageAttributeDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.ClassificationDefinitionImpl#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ClassificationDefinitionImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ClassificationDefinitionImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.ClassificationDefinitionImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationDefinitionImpl extends StringPlusAuthorityImpl
		implements ClassificationDefinition {
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
	 * The default value of the '{@link #getEdition() <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdition() <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected String edition = EDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final UsageAttributeDefinition USAGE_EDEFAULT = UsageAttributeDefinition.PRIMARY;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected UsageAttributeDefinition usage = USAGE_EDEFAULT;

	/**
	 * This is true if the Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getClassificationDefinition();
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
					MODSPackage.CLASSIFICATION_DEFINITION__ALT_REP_GROUP,
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
					MODSPackage.CLASSIFICATION_DEFINITION__DISPLAY_LABEL,
					oldDisplayLabel, displayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdition(String newEdition) {
		String oldEdition = edition;
		edition = newEdition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.CLASSIFICATION_DEFINITION__EDITION, oldEdition,
					edition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageAttributeDefinition getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(UsageAttributeDefinition newUsage) {
		UsageAttributeDefinition oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		boolean oldUsageESet = usageESet;
		usageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.CLASSIFICATION_DEFINITION__USAGE, oldUsage,
					usage, !oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsage() {
		UsageAttributeDefinition oldUsage = usage;
		boolean oldUsageESet = usageESet;
		usage = USAGE_EDEFAULT;
		usageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					MODSPackage.CLASSIFICATION_DEFINITION__USAGE, oldUsage,
					USAGE_EDEFAULT, oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsage() {
		return usageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MODSPackage.CLASSIFICATION_DEFINITION__ALT_REP_GROUP:
			return getAltRepGroup();
		case MODSPackage.CLASSIFICATION_DEFINITION__DISPLAY_LABEL:
			return getDisplayLabel();
		case MODSPackage.CLASSIFICATION_DEFINITION__EDITION:
			return getEdition();
		case MODSPackage.CLASSIFICATION_DEFINITION__USAGE:
			return getUsage();
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
		case MODSPackage.CLASSIFICATION_DEFINITION__ALT_REP_GROUP:
			setAltRepGroup((String) newValue);
			return;
		case MODSPackage.CLASSIFICATION_DEFINITION__DISPLAY_LABEL:
			setDisplayLabel((String) newValue);
			return;
		case MODSPackage.CLASSIFICATION_DEFINITION__EDITION:
			setEdition((String) newValue);
			return;
		case MODSPackage.CLASSIFICATION_DEFINITION__USAGE:
			setUsage((UsageAttributeDefinition) newValue);
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
		case MODSPackage.CLASSIFICATION_DEFINITION__ALT_REP_GROUP:
			setAltRepGroup(ALT_REP_GROUP_EDEFAULT);
			return;
		case MODSPackage.CLASSIFICATION_DEFINITION__DISPLAY_LABEL:
			setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
			return;
		case MODSPackage.CLASSIFICATION_DEFINITION__EDITION:
			setEdition(EDITION_EDEFAULT);
			return;
		case MODSPackage.CLASSIFICATION_DEFINITION__USAGE:
			unsetUsage();
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
		case MODSPackage.CLASSIFICATION_DEFINITION__ALT_REP_GROUP:
			return ALT_REP_GROUP_EDEFAULT == null ? altRepGroup != null
					: !ALT_REP_GROUP_EDEFAULT.equals(altRepGroup);
		case MODSPackage.CLASSIFICATION_DEFINITION__DISPLAY_LABEL:
			return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null
					: !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
		case MODSPackage.CLASSIFICATION_DEFINITION__EDITION:
			return EDITION_EDEFAULT == null ? edition != null
					: !EDITION_EDEFAULT.equals(edition);
		case MODSPackage.CLASSIFICATION_DEFINITION__USAGE:
			return isSetUsage();
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
		result.append(", edition: ");
		result.append(edition);
		result.append(", usage: ");
		if (usageESet)
			result.append(usage);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ClassificationDefinitionImpl
