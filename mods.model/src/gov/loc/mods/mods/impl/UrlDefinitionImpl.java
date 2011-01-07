/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.UrlAccessAttributeDefinition;
import gov.loc.mods.mods.UrlDefinition;
import gov.loc.mods.mods.UrlUsageAttributeDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Url Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.UrlDefinitionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.UrlDefinitionImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.UrlDefinitionImpl#getDateLastAccessed <em>Date Last Accessed</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.UrlDefinitionImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.UrlDefinitionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.UrlDefinitionImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UrlDefinitionImpl extends EObjectImpl implements UrlDefinition {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccess()
     * @generated
     * @ordered
     */
    protected static final UrlAccessAttributeDefinition ACCESS_EDEFAULT = UrlAccessAttributeDefinition.PREVIEW;

    /**
     * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccess()
     * @generated
     * @ordered
     */
    protected UrlAccessAttributeDefinition access = ACCESS_EDEFAULT;

    /**
     * This is true if the Access attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accessESet;

    /**
     * The default value of the '{@link #getDateLastAccessed() <em>Date Last Accessed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateLastAccessed()
     * @generated
     * @ordered
     */
    protected static final String DATE_LAST_ACCESSED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDateLastAccessed() <em>Date Last Accessed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateLastAccessed()
     * @generated
     * @ordered
     */
    protected String dateLastAccessed = DATE_LAST_ACCESSED_EDEFAULT;

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
     * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNote()
     * @generated
     * @ordered
     */
    protected static final String NOTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNote()
     * @generated
     * @ordered
     */
    protected String note = NOTE_EDEFAULT;

    /**
     * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsage()
     * @generated
     * @ordered
     */
    protected static final UrlUsageAttributeDefinition USAGE_EDEFAULT = UrlUsageAttributeDefinition.PRIMARY_DISPLAY;

    /**
     * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsage()
     * @generated
     * @ordered
     */
    protected UrlUsageAttributeDefinition usage = USAGE_EDEFAULT;

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
    protected UrlDefinitionImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return MODSPackage.eINSTANCE.getUrlDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValue() {
	return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(String newValue) {
	String oldValue = value;
	value = newValue;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.URL_DEFINITION__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UrlAccessAttributeDefinition getAccess() {
	return access;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAccess(UrlAccessAttributeDefinition newAccess) {
	UrlAccessAttributeDefinition oldAccess = access;
	access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
	boolean oldAccessESet = accessESet;
	accessESet = true;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.URL_DEFINITION__ACCESS, oldAccess,
			    access, !oldAccessESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAccess() {
	UrlAccessAttributeDefinition oldAccess = access;
	boolean oldAccessESet = accessESet;
	access = ACCESS_EDEFAULT;
	accessESet = false;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.URL_DEFINITION__ACCESS, oldAccess,
			    ACCESS_EDEFAULT, oldAccessESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAccess() {
	return accessESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDateLastAccessed() {
	return dateLastAccessed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDateLastAccessed(String newDateLastAccessed) {
	String oldDateLastAccessed = dateLastAccessed;
	dateLastAccessed = newDateLastAccessed;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.URL_DEFINITION__DATE_LAST_ACCESSED,
			    oldDateLastAccessed, dateLastAccessed));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.URL_DEFINITION__DISPLAY_LABEL,
			    oldDisplayLabel, displayLabel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNote() {
	return note;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNote(String newNote) {
	String oldNote = note;
	note = newNote;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.URL_DEFINITION__NOTE, oldNote, note));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UrlUsageAttributeDefinition getUsage() {
	return usage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUsage(UrlUsageAttributeDefinition newUsage) {
	UrlUsageAttributeDefinition oldUsage = usage;
	usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
	boolean oldUsageESet = usageESet;
	usageESet = true;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.URL_DEFINITION__USAGE, oldUsage, usage,
			    !oldUsageESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUsage() {
	UrlUsageAttributeDefinition oldUsage = usage;
	boolean oldUsageESet = usageESet;
	usage = USAGE_EDEFAULT;
	usageESet = false;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.URL_DEFINITION__USAGE, oldUsage,
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
	case MODSPackage.URL_DEFINITION__VALUE:
	    return getValue();
	case MODSPackage.URL_DEFINITION__ACCESS:
	    return getAccess();
	case MODSPackage.URL_DEFINITION__DATE_LAST_ACCESSED:
	    return getDateLastAccessed();
	case MODSPackage.URL_DEFINITION__DISPLAY_LABEL:
	    return getDisplayLabel();
	case MODSPackage.URL_DEFINITION__NOTE:
	    return getNote();
	case MODSPackage.URL_DEFINITION__USAGE:
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
	case MODSPackage.URL_DEFINITION__VALUE:
	    setValue((String) newValue);
	    return;
	case MODSPackage.URL_DEFINITION__ACCESS:
	    setAccess((UrlAccessAttributeDefinition) newValue);
	    return;
	case MODSPackage.URL_DEFINITION__DATE_LAST_ACCESSED:
	    setDateLastAccessed((String) newValue);
	    return;
	case MODSPackage.URL_DEFINITION__DISPLAY_LABEL:
	    setDisplayLabel((String) newValue);
	    return;
	case MODSPackage.URL_DEFINITION__NOTE:
	    setNote((String) newValue);
	    return;
	case MODSPackage.URL_DEFINITION__USAGE:
	    setUsage((UrlUsageAttributeDefinition) newValue);
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
	case MODSPackage.URL_DEFINITION__VALUE:
	    setValue(VALUE_EDEFAULT);
	    return;
	case MODSPackage.URL_DEFINITION__ACCESS:
	    unsetAccess();
	    return;
	case MODSPackage.URL_DEFINITION__DATE_LAST_ACCESSED:
	    setDateLastAccessed(DATE_LAST_ACCESSED_EDEFAULT);
	    return;
	case MODSPackage.URL_DEFINITION__DISPLAY_LABEL:
	    setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
	    return;
	case MODSPackage.URL_DEFINITION__NOTE:
	    setNote(NOTE_EDEFAULT);
	    return;
	case MODSPackage.URL_DEFINITION__USAGE:
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
	case MODSPackage.URL_DEFINITION__VALUE:
	    return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
	case MODSPackage.URL_DEFINITION__ACCESS:
	    return isSetAccess();
	case MODSPackage.URL_DEFINITION__DATE_LAST_ACCESSED:
	    return DATE_LAST_ACCESSED_EDEFAULT == null ? dateLastAccessed != null : !DATE_LAST_ACCESSED_EDEFAULT
			    .equals(dateLastAccessed);
	case MODSPackage.URL_DEFINITION__DISPLAY_LABEL:
	    return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
	case MODSPackage.URL_DEFINITION__NOTE:
	    return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
	case MODSPackage.URL_DEFINITION__USAGE:
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
	result.append(" (value: ");
	result.append(value);
	result.append(", access: ");
	if (accessESet)
	    result.append(access);
	else
	    result.append("<unset>");
	result.append(", dateLastAccessed: ");
	result.append(dateLastAccessed);
	result.append(", displayLabel: ");
	result.append(displayLabel);
	result.append(", note: ");
	result.append(note);
	result.append(", usage: ");
	if (usageESet)
	    result.append(usage);
	else
	    result.append("<unset>");
	result.append(')');
	return result.toString();
    }

} //UrlDefinitionImpl
