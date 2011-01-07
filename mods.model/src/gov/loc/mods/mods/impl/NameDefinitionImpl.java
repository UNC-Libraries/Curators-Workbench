/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.NameDefinition;
import gov.loc.mods.mods.UsageAttributeDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.NameDefinitionImpl#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.NameDefinitionImpl#getNameTitleGroup <em>Name Title Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.NameDefinitionImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameDefinitionImpl extends NameBaseDefinitionImpl implements NameDefinition {
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
    protected NameDefinitionImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return MODSPackage.eINSTANCE.getNameDefinition();
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.NAME_DEFINITION__ALT_REP_GROUP,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.NAME_DEFINITION__NAME_TITLE_GROUP,
			    oldNameTitleGroup, nameTitleGroup));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.NAME_DEFINITION__USAGE, oldUsage, usage,
			    !oldUsageESet));
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
	    eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.NAME_DEFINITION__USAGE, oldUsage,
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
	case MODSPackage.NAME_DEFINITION__ALT_REP_GROUP:
	    return getAltRepGroup();
	case MODSPackage.NAME_DEFINITION__NAME_TITLE_GROUP:
	    return getNameTitleGroup();
	case MODSPackage.NAME_DEFINITION__USAGE:
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
	case MODSPackage.NAME_DEFINITION__ALT_REP_GROUP:
	    setAltRepGroup((String) newValue);
	    return;
	case MODSPackage.NAME_DEFINITION__NAME_TITLE_GROUP:
	    setNameTitleGroup((String) newValue);
	    return;
	case MODSPackage.NAME_DEFINITION__USAGE:
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
	case MODSPackage.NAME_DEFINITION__ALT_REP_GROUP:
	    setAltRepGroup(ALT_REP_GROUP_EDEFAULT);
	    return;
	case MODSPackage.NAME_DEFINITION__NAME_TITLE_GROUP:
	    setNameTitleGroup(NAME_TITLE_GROUP_EDEFAULT);
	    return;
	case MODSPackage.NAME_DEFINITION__USAGE:
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
	case MODSPackage.NAME_DEFINITION__ALT_REP_GROUP:
	    return ALT_REP_GROUP_EDEFAULT == null ? altRepGroup != null : !ALT_REP_GROUP_EDEFAULT.equals(altRepGroup);
	case MODSPackage.NAME_DEFINITION__NAME_TITLE_GROUP:
	    return NAME_TITLE_GROUP_EDEFAULT == null ? nameTitleGroup != null : !NAME_TITLE_GROUP_EDEFAULT
			    .equals(nameTitleGroup);
	case MODSPackage.NAME_DEFINITION__USAGE:
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
	result.append(", usage: ");
	if (usageESet)
	    result.append(usage);
	else
	    result.append("<unset>");
	result.append(')');
	return result.toString();
    }

} //NameDefinitionImpl
