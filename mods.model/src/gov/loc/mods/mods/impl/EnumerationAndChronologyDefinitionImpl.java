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

import gov.loc.mods.mods.EnumerationAndChronologyDefinition;
import gov.loc.mods.mods.EnumerationAndChronologyUnitTypeAttributeDefinition;
import gov.loc.mods.mods.MODSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration And Chronology Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.EnumerationAndChronologyDefinitionImpl#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationAndChronologyDefinitionImpl extends XsStringImpl implements EnumerationAndChronologyDefinition {
    /**
     * The default value of the '{@link #getUnitType() <em>Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitType()
     * @generated
     * @ordered
     */
    protected static final EnumerationAndChronologyUnitTypeAttributeDefinition UNIT_TYPE_EDEFAULT = EnumerationAndChronologyUnitTypeAttributeDefinition._1;

    /**
     * The cached value of the '{@link #getUnitType() <em>Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitType()
     * @generated
     * @ordered
     */
    protected EnumerationAndChronologyUnitTypeAttributeDefinition unitType = UNIT_TYPE_EDEFAULT;

    /**
     * This is true if the Unit Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unitTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnumerationAndChronologyDefinitionImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return MODSPackage.eINSTANCE.getEnumerationAndChronologyDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnumerationAndChronologyUnitTypeAttributeDefinition getUnitType() {
	return unitType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnitType(EnumerationAndChronologyUnitTypeAttributeDefinition newUnitType) {
	EnumerationAndChronologyUnitTypeAttributeDefinition oldUnitType = unitType;
	unitType = newUnitType == null ? UNIT_TYPE_EDEFAULT : newUnitType;
	boolean oldUnitTypeESet = unitTypeESet;
	unitTypeESet = true;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET,
			    MODSPackage.ENUMERATION_AND_CHRONOLOGY_DEFINITION__UNIT_TYPE, oldUnitType, unitType,
			    !oldUnitTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUnitType() {
	EnumerationAndChronologyUnitTypeAttributeDefinition oldUnitType = unitType;
	boolean oldUnitTypeESet = unitTypeESet;
	unitType = UNIT_TYPE_EDEFAULT;
	unitTypeESet = false;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.UNSET,
			    MODSPackage.ENUMERATION_AND_CHRONOLOGY_DEFINITION__UNIT_TYPE, oldUnitType,
			    UNIT_TYPE_EDEFAULT, oldUnitTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUnitType() {
	return unitTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case MODSPackage.ENUMERATION_AND_CHRONOLOGY_DEFINITION__UNIT_TYPE:
	    return getUnitType();
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
	case MODSPackage.ENUMERATION_AND_CHRONOLOGY_DEFINITION__UNIT_TYPE:
	    setUnitType((EnumerationAndChronologyUnitTypeAttributeDefinition) newValue);
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
	case MODSPackage.ENUMERATION_AND_CHRONOLOGY_DEFINITION__UNIT_TYPE:
	    unsetUnitType();
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
	case MODSPackage.ENUMERATION_AND_CHRONOLOGY_DEFINITION__UNIT_TYPE:
	    return isSetUnitType();
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
	result.append(" (unitType: ");
	if (unitTypeESet)
	    result.append(unitType);
	else
	    result.append("<unset>");
	result.append(')');
	return result.toString();
    }

} //EnumerationAndChronologyDefinitionImpl
