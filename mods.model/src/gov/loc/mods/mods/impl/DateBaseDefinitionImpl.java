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

import gov.loc.mods.mods.DateBaseDefinition;
import gov.loc.mods.mods.DateEncodingAttributeDefinition;
import gov.loc.mods.mods.DatePointAttributeDefinition;
import gov.loc.mods.mods.DateQualifierAttributeDefinition;
import gov.loc.mods.mods.MODSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Base Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.DateBaseDefinitionImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DateBaseDefinitionImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.DateBaseDefinitionImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateBaseDefinitionImpl extends XsStringImpl implements
		DateBaseDefinition {
	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final DateEncodingAttributeDefinition ENCODING_EDEFAULT = DateEncodingAttributeDefinition.W3CDTF;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected DateEncodingAttributeDefinition encoding = ENCODING_EDEFAULT;

	/**
	 * This is true if the Encoding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean encodingESet;

	/**
	 * The default value of the '{@link #getPoint() <em>Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected static final DatePointAttributeDefinition POINT_EDEFAULT = DatePointAttributeDefinition.START;

	/**
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected DatePointAttributeDefinition point = POINT_EDEFAULT;

	/**
	 * This is true if the Point attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pointESet;

	/**
	 * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final DateQualifierAttributeDefinition QUALIFIER_EDEFAULT = DateQualifierAttributeDefinition.APPROXIMATE;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected DateQualifierAttributeDefinition qualifier = QUALIFIER_EDEFAULT;

	/**
	 * This is true if the Qualifier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualifierESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateBaseDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getDateBaseDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateEncodingAttributeDefinition getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(DateEncodingAttributeDefinition newEncoding) {
		DateEncodingAttributeDefinition oldEncoding = encoding;
		encoding = newEncoding == null ? ENCODING_EDEFAULT : newEncoding;
		boolean oldEncodingESet = encodingESet;
		encodingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.DATE_BASE_DEFINITION__ENCODING, oldEncoding,
					encoding, !oldEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEncoding() {
		DateEncodingAttributeDefinition oldEncoding = encoding;
		boolean oldEncodingESet = encodingESet;
		encoding = ENCODING_EDEFAULT;
		encodingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					MODSPackage.DATE_BASE_DEFINITION__ENCODING, oldEncoding,
					ENCODING_EDEFAULT, oldEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEncoding() {
		return encodingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatePointAttributeDefinition getPoint() {
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoint(DatePointAttributeDefinition newPoint) {
		DatePointAttributeDefinition oldPoint = point;
		point = newPoint == null ? POINT_EDEFAULT : newPoint;
		boolean oldPointESet = pointESet;
		pointESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.DATE_BASE_DEFINITION__POINT, oldPoint, point,
					!oldPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPoint() {
		DatePointAttributeDefinition oldPoint = point;
		boolean oldPointESet = pointESet;
		point = POINT_EDEFAULT;
		pointESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					MODSPackage.DATE_BASE_DEFINITION__POINT, oldPoint,
					POINT_EDEFAULT, oldPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPoint() {
		return pointESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateQualifierAttributeDefinition getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(DateQualifierAttributeDefinition newQualifier) {
		DateQualifierAttributeDefinition oldQualifier = qualifier;
		qualifier = newQualifier == null ? QUALIFIER_EDEFAULT : newQualifier;
		boolean oldQualifierESet = qualifierESet;
		qualifierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.DATE_BASE_DEFINITION__QUALIFIER, oldQualifier,
					qualifier, !oldQualifierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualifier() {
		DateQualifierAttributeDefinition oldQualifier = qualifier;
		boolean oldQualifierESet = qualifierESet;
		qualifier = QUALIFIER_EDEFAULT;
		qualifierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					MODSPackage.DATE_BASE_DEFINITION__QUALIFIER, oldQualifier,
					QUALIFIER_EDEFAULT, oldQualifierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualifier() {
		return qualifierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MODSPackage.DATE_BASE_DEFINITION__ENCODING:
			return getEncoding();
		case MODSPackage.DATE_BASE_DEFINITION__POINT:
			return getPoint();
		case MODSPackage.DATE_BASE_DEFINITION__QUALIFIER:
			return getQualifier();
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
		case MODSPackage.DATE_BASE_DEFINITION__ENCODING:
			setEncoding((DateEncodingAttributeDefinition) newValue);
			return;
		case MODSPackage.DATE_BASE_DEFINITION__POINT:
			setPoint((DatePointAttributeDefinition) newValue);
			return;
		case MODSPackage.DATE_BASE_DEFINITION__QUALIFIER:
			setQualifier((DateQualifierAttributeDefinition) newValue);
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
		case MODSPackage.DATE_BASE_DEFINITION__ENCODING:
			unsetEncoding();
			return;
		case MODSPackage.DATE_BASE_DEFINITION__POINT:
			unsetPoint();
			return;
		case MODSPackage.DATE_BASE_DEFINITION__QUALIFIER:
			unsetQualifier();
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
		case MODSPackage.DATE_BASE_DEFINITION__ENCODING:
			return isSetEncoding();
		case MODSPackage.DATE_BASE_DEFINITION__POINT:
			return isSetPoint();
		case MODSPackage.DATE_BASE_DEFINITION__QUALIFIER:
			return isSetQualifier();
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
		result.append(" (encoding: ");
		if (encodingESet)
			result.append(encoding);
		else
			result.append("<unset>");
		result.append(", point: ");
		if (pointESet)
			result.append(point);
		else
			result.append("<unset>");
		result.append(", qualifier: ");
		if (qualifierESet)
			result.append(qualifier);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DateBaseDefinitionImpl
