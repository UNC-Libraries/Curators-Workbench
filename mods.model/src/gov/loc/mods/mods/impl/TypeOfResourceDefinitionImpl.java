/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.ResourceTypeDefinition;
import gov.loc.mods.mods.TypeOfResourceDefinition;
import gov.loc.mods.mods.UsageAttributeDefinition;
import gov.loc.mods.mods.YesDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Of Resource Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.TypeOfResourceDefinitionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TypeOfResourceDefinitionImpl#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TypeOfResourceDefinitionImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TypeOfResourceDefinitionImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TypeOfResourceDefinitionImpl#getManuscript <em>Manuscript</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TypeOfResourceDefinitionImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOfResourceDefinitionImpl extends EObjectImpl implements TypeOfResourceDefinition {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final ResourceTypeDefinition VALUE_EDEFAULT = ResourceTypeDefinition.TEXT;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected ResourceTypeDefinition value = VALUE_EDEFAULT;

    /**
     * This is true if the Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueESet;

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
     * The default value of the '{@link #getCollection() <em>Collection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollection()
     * @generated
     * @ordered
     */
    protected static final YesDefinition COLLECTION_EDEFAULT = YesDefinition.YES;

    /**
     * The cached value of the '{@link #getCollection() <em>Collection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollection()
     * @generated
     * @ordered
     */
    protected YesDefinition collection = COLLECTION_EDEFAULT;

    /**
     * This is true if the Collection attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean collectionESet;

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
     * The default value of the '{@link #getManuscript() <em>Manuscript</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManuscript()
     * @generated
     * @ordered
     */
    protected static final YesDefinition MANUSCRIPT_EDEFAULT = YesDefinition.YES;

    /**
     * The cached value of the '{@link #getManuscript() <em>Manuscript</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManuscript()
     * @generated
     * @ordered
     */
    protected YesDefinition manuscript = MANUSCRIPT_EDEFAULT;

    /**
     * This is true if the Manuscript attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean manuscriptESet;

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
    protected TypeOfResourceDefinitionImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return MODSPackage.eINSTANCE.getTypeOfResourceDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceTypeDefinition getValue() {
	return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(ResourceTypeDefinition newValue) {
	ResourceTypeDefinition oldValue = value;
	value = newValue == null ? VALUE_EDEFAULT : newValue;
	boolean oldValueESet = valueESet;
	valueESet = true;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TYPE_OF_RESOURCE_DEFINITION__VALUE,
			    oldValue, value, !oldValueESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetValue() {
	ResourceTypeDefinition oldValue = value;
	boolean oldValueESet = valueESet;
	value = VALUE_EDEFAULT;
	valueESet = false;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.TYPE_OF_RESOURCE_DEFINITION__VALUE,
			    oldValue, VALUE_EDEFAULT, oldValueESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetValue() {
	return valueESet;
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
			    MODSPackage.TYPE_OF_RESOURCE_DEFINITION__ALT_REP_GROUP, oldAltRepGroup, altRepGroup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YesDefinition getCollection() {
	return collection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCollection(YesDefinition newCollection) {
	YesDefinition oldCollection = collection;
	collection = newCollection == null ? COLLECTION_EDEFAULT : newCollection;
	boolean oldCollectionESet = collectionESet;
	collectionESet = true;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TYPE_OF_RESOURCE_DEFINITION__COLLECTION,
			    oldCollection, collection, !oldCollectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCollection() {
	YesDefinition oldCollection = collection;
	boolean oldCollectionESet = collectionESet;
	collection = COLLECTION_EDEFAULT;
	collectionESet = false;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.UNSET,
			    MODSPackage.TYPE_OF_RESOURCE_DEFINITION__COLLECTION, oldCollection, COLLECTION_EDEFAULT,
			    oldCollectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCollection() {
	return collectionESet;
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
			    MODSPackage.TYPE_OF_RESOURCE_DEFINITION__DISPLAY_LABEL, oldDisplayLabel, displayLabel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YesDefinition getManuscript() {
	return manuscript;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setManuscript(YesDefinition newManuscript) {
	YesDefinition oldManuscript = manuscript;
	manuscript = newManuscript == null ? MANUSCRIPT_EDEFAULT : newManuscript;
	boolean oldManuscriptESet = manuscriptESet;
	manuscriptESet = true;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TYPE_OF_RESOURCE_DEFINITION__MANUSCRIPT,
			    oldManuscript, manuscript, !oldManuscriptESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetManuscript() {
	YesDefinition oldManuscript = manuscript;
	boolean oldManuscriptESet = manuscriptESet;
	manuscript = MANUSCRIPT_EDEFAULT;
	manuscriptESet = false;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.UNSET,
			    MODSPackage.TYPE_OF_RESOURCE_DEFINITION__MANUSCRIPT, oldManuscript, MANUSCRIPT_EDEFAULT,
			    oldManuscriptESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetManuscript() {
	return manuscriptESet;
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TYPE_OF_RESOURCE_DEFINITION__USAGE,
			    oldUsage, usage, !oldUsageESet));
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
	    eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.TYPE_OF_RESOURCE_DEFINITION__USAGE,
			    oldUsage, USAGE_EDEFAULT, oldUsageESet));
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
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__VALUE:
	    return getValue();
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__ALT_REP_GROUP:
	    return getAltRepGroup();
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__COLLECTION:
	    return getCollection();
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__DISPLAY_LABEL:
	    return getDisplayLabel();
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__MANUSCRIPT:
	    return getManuscript();
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__USAGE:
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
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__VALUE:
	    setValue((ResourceTypeDefinition) newValue);
	    return;
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__ALT_REP_GROUP:
	    setAltRepGroup((String) newValue);
	    return;
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__COLLECTION:
	    setCollection((YesDefinition) newValue);
	    return;
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__DISPLAY_LABEL:
	    setDisplayLabel((String) newValue);
	    return;
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__MANUSCRIPT:
	    setManuscript((YesDefinition) newValue);
	    return;
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__USAGE:
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
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__VALUE:
	    unsetValue();
	    return;
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__ALT_REP_GROUP:
	    setAltRepGroup(ALT_REP_GROUP_EDEFAULT);
	    return;
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__COLLECTION:
	    unsetCollection();
	    return;
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__DISPLAY_LABEL:
	    setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
	    return;
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__MANUSCRIPT:
	    unsetManuscript();
	    return;
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__USAGE:
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
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__VALUE:
	    return isSetValue();
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__ALT_REP_GROUP:
	    return ALT_REP_GROUP_EDEFAULT == null ? altRepGroup != null : !ALT_REP_GROUP_EDEFAULT.equals(altRepGroup);
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__COLLECTION:
	    return isSetCollection();
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__DISPLAY_LABEL:
	    return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__MANUSCRIPT:
	    return isSetManuscript();
	case MODSPackage.TYPE_OF_RESOURCE_DEFINITION__USAGE:
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
	if (valueESet)
	    result.append(value);
	else
	    result.append("<unset>");
	result.append(", altRepGroup: ");
	result.append(altRepGroup);
	result.append(", collection: ");
	if (collectionESet)
	    result.append(collection);
	else
	    result.append("<unset>");
	result.append(", displayLabel: ");
	result.append(displayLabel);
	result.append(", manuscript: ");
	if (manuscriptESet)
	    result.append(manuscript);
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

} //TypeOfResourceDefinitionImpl
