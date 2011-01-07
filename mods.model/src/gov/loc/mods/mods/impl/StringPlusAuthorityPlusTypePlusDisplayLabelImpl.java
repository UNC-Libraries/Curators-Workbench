/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.StringPlusAuthorityPlusTypePlusDisplayLabel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Plus Authority Plus Type Plus Display Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.StringPlusAuthorityPlusTypePlusDisplayLabelImpl#getDisplayLabel <em>Display Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringPlusAuthorityPlusTypePlusDisplayLabelImpl extends StringPlusAuthorityPlusTypeImpl implements
		StringPlusAuthorityPlusTypePlusDisplayLabel {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StringPlusAuthorityPlusTypePlusDisplayLabelImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return MODSPackage.eINSTANCE.getStringPlusAuthorityPlusTypePlusDisplayLabel();
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
			    MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__DISPLAY_LABEL,
			    oldDisplayLabel, displayLabel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__DISPLAY_LABEL:
	    return getDisplayLabel();
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
	case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__DISPLAY_LABEL:
	    setDisplayLabel((String) newValue);
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
	case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__DISPLAY_LABEL:
	    setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
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
	case MODSPackage.STRING_PLUS_AUTHORITY_PLUS_TYPE_PLUS_DISPLAY_LABEL__DISPLAY_LABEL:
	    return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
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
	result.append(" (displayLabel: ");
	result.append(displayLabel);
	result.append(')');
	return result.toString();
    }

} //StringPlusAuthorityPlusTypePlusDisplayLabelImpl
