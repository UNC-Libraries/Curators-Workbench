/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.CopyInformationDefinition;
import gov.loc.mods.mods.HoldingSimpleDefinition;
import gov.loc.mods.mods.MODSPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Holding Simple Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.HoldingSimpleDefinitionImpl#getCopyInformation <em>Copy Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HoldingSimpleDefinitionImpl extends EObjectImpl implements HoldingSimpleDefinition {
    /**
     * The cached value of the '{@link #getCopyInformation() <em>Copy Information</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCopyInformation()
     * @generated
     * @ordered
     */
    protected EList<CopyInformationDefinition> copyInformation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HoldingSimpleDefinitionImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return MODSPackage.eINSTANCE.getHoldingSimpleDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CopyInformationDefinition> getCopyInformation() {
	if (copyInformation == null) {
	    copyInformation = new EObjectContainmentEList<CopyInformationDefinition>(CopyInformationDefinition.class,
			    this, MODSPackage.HOLDING_SIMPLE_DEFINITION__COPY_INFORMATION);
	}
	return copyInformation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
	switch (featureID) {
	case MODSPackage.HOLDING_SIMPLE_DEFINITION__COPY_INFORMATION:
	    return ((InternalEList<?>) getCopyInformation()).basicRemove(otherEnd, msgs);
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
	case MODSPackage.HOLDING_SIMPLE_DEFINITION__COPY_INFORMATION:
	    return getCopyInformation();
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
	case MODSPackage.HOLDING_SIMPLE_DEFINITION__COPY_INFORMATION:
	    getCopyInformation().clear();
	    getCopyInformation().addAll((Collection<? extends CopyInformationDefinition>) newValue);
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
	case MODSPackage.HOLDING_SIMPLE_DEFINITION__COPY_INFORMATION:
	    getCopyInformation().clear();
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
	case MODSPackage.HOLDING_SIMPLE_DEFINITION__COPY_INFORMATION:
	    return copyInformation != null && !copyInformation.isEmpty();
	}
	return super.eIsSet(featureID);
    }

} //HoldingSimpleDefinitionImpl
