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
import gov.loc.mods.mods.TitleInfoDefinition;
import gov.loc.mods.mods.TitleInfoTypeAttributeDefinition;
import gov.loc.mods.mods.UsageAttributeDefinition;
import gov.loc.mods.mods.YesDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Title Info Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoDefinitionImpl#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoDefinitionImpl#getNameTitleGroup <em>Name Title Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoDefinitionImpl#getSupplied <em>Supplied</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoDefinitionImpl#getType1 <em>Type1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoDefinitionImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TitleInfoDefinitionImpl extends TitleInfoBaseDefinitionImpl implements TitleInfoDefinition {
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
	 * The default value of the '{@link #getNameTitleGroup() <em>Name Title Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTitleGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_TITLE_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameTitleGroup() <em>Name Title Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTitleGroup()
	 * @generated
	 * @ordered
	 */
	protected String nameTitleGroup = NAME_TITLE_GROUP_EDEFAULT;

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
	 * The default value of the '{@link #getType1() <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType1()
	 * @generated
	 * @ordered
	 */
	protected static final TitleInfoTypeAttributeDefinition TYPE1_EDEFAULT = TitleInfoTypeAttributeDefinition.ABBREVIATED;

	/**
	 * The cached value of the '{@link #getType1() <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType1()
	 * @generated
	 * @ordered
	 */
	protected TitleInfoTypeAttributeDefinition type1 = TYPE1_EDEFAULT;

	/**
	 * This is true if the Type1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean type1ESet;

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
	protected TitleInfoDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getTitleInfoDefinition();
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_DEFINITION__ALT_REP_GROUP,
					oldAltRepGroup, altRepGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameTitleGroup() {
		return nameTitleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameTitleGroup(String newNameTitleGroup) {
		String oldNameTitleGroup = nameTitleGroup;
		nameTitleGroup = newNameTitleGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_DEFINITION__NAME_TITLE_GROUP,
					oldNameTitleGroup, nameTitleGroup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_DEFINITION__SUPPLIED,
					oldSupplied, supplied, !oldSuppliedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.TITLE_INFO_DEFINITION__SUPPLIED,
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
	public TitleInfoTypeAttributeDefinition getType1() {
		return type1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType1(TitleInfoTypeAttributeDefinition newType1) {
		TitleInfoTypeAttributeDefinition oldType1 = type1;
		type1 = newType1 == null ? TYPE1_EDEFAULT : newType1;
		boolean oldType1ESet = type1ESet;
		type1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_DEFINITION__TYPE1, oldType1,
					type1, !oldType1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType1() {
		TitleInfoTypeAttributeDefinition oldType1 = type1;
		boolean oldType1ESet = type1ESet;
		type1 = TYPE1_EDEFAULT;
		type1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.TITLE_INFO_DEFINITION__TYPE1, oldType1,
					TYPE1_EDEFAULT, oldType1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType1() {
		return type1ESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_DEFINITION__USAGE, oldUsage,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.TITLE_INFO_DEFINITION__USAGE, oldUsage,
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
			case MODSPackage.TITLE_INFO_DEFINITION__ALT_REP_GROUP:
				return getAltRepGroup();
			case MODSPackage.TITLE_INFO_DEFINITION__NAME_TITLE_GROUP:
				return getNameTitleGroup();
			case MODSPackage.TITLE_INFO_DEFINITION__SUPPLIED:
				return getSupplied();
			case MODSPackage.TITLE_INFO_DEFINITION__TYPE1:
				return getType1();
			case MODSPackage.TITLE_INFO_DEFINITION__USAGE:
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
			case MODSPackage.TITLE_INFO_DEFINITION__ALT_REP_GROUP:
				setAltRepGroup((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_DEFINITION__NAME_TITLE_GROUP:
				setNameTitleGroup((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_DEFINITION__SUPPLIED:
				setSupplied((YesDefinition) newValue);
				return;
			case MODSPackage.TITLE_INFO_DEFINITION__TYPE1:
				setType1((TitleInfoTypeAttributeDefinition) newValue);
				return;
			case MODSPackage.TITLE_INFO_DEFINITION__USAGE:
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
			case MODSPackage.TITLE_INFO_DEFINITION__ALT_REP_GROUP:
				setAltRepGroup(ALT_REP_GROUP_EDEFAULT);
				return;
			case MODSPackage.TITLE_INFO_DEFINITION__NAME_TITLE_GROUP:
				setNameTitleGroup(NAME_TITLE_GROUP_EDEFAULT);
				return;
			case MODSPackage.TITLE_INFO_DEFINITION__SUPPLIED:
				unsetSupplied();
				return;
			case MODSPackage.TITLE_INFO_DEFINITION__TYPE1:
				unsetType1();
				return;
			case MODSPackage.TITLE_INFO_DEFINITION__USAGE:
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
			case MODSPackage.TITLE_INFO_DEFINITION__ALT_REP_GROUP:
				return ALT_REP_GROUP_EDEFAULT == null ? altRepGroup != null : !ALT_REP_GROUP_EDEFAULT.equals(altRepGroup);
			case MODSPackage.TITLE_INFO_DEFINITION__NAME_TITLE_GROUP:
				return NAME_TITLE_GROUP_EDEFAULT == null ? nameTitleGroup != null : !NAME_TITLE_GROUP_EDEFAULT
						.equals(nameTitleGroup);
			case MODSPackage.TITLE_INFO_DEFINITION__SUPPLIED:
				return isSetSupplied();
			case MODSPackage.TITLE_INFO_DEFINITION__TYPE1:
				return isSetType1();
			case MODSPackage.TITLE_INFO_DEFINITION__USAGE:
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
		result.append(", nameTitleGroup: ");
		result.append(nameTitleGroup);
		result.append(", supplied: ");
		if (suppliedESet)
			result.append(supplied);
		else
			result.append("<unset>");
		result.append(", type1: ");
		if (type1ESet)
			result.append(type1);
		else
			result.append("<unset>");
		result.append(", usage: ");
		if (usageESet)
			result.append(usage);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TitleInfoDefinitionImpl
