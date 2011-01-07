/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.LanguageDefinition;
import gov.loc.mods.mods.LanguageTermDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.ScriptTermDefinition;
import gov.loc.mods.mods.UsageAttributeDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.LanguageDefinitionImpl#getLanguageTerm <em>Language Term</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LanguageDefinitionImpl#getScriptTerm <em>Script Term</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LanguageDefinitionImpl#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LanguageDefinitionImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LanguageDefinitionImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LanguageDefinitionImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LanguageDefinitionImpl#getObjectPart <em>Object Part</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LanguageDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LanguageDefinitionImpl#getTransliteration <em>Transliteration</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LanguageDefinitionImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageDefinitionImpl extends EObjectImpl implements LanguageDefinition {
    /**
     * The cached value of the '{@link #getLanguageTerm() <em>Language Term</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLanguageTerm()
     * @generated
     * @ordered
     */
    protected EList<LanguageTermDefinition> languageTerm;

    /**
     * The cached value of the '{@link #getScriptTerm() <em>Script Term</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScriptTerm()
     * @generated
     * @ordered
     */
    protected EList<ScriptTermDefinition> scriptTerm;

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
     * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang()
     * @generated
     * @ordered
     */
    protected static final String LANG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang()
     * @generated
     * @ordered
     */
    protected String lang = LANG_EDEFAULT;

    /**
     * The default value of the '{@link #getLang1() <em>Lang1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang1()
     * @generated
     * @ordered
     */
    protected static final String LANG1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLang1() <em>Lang1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang1()
     * @generated
     * @ordered
     */
    protected String lang1 = LANG1_EDEFAULT;

    /**
     * The default value of the '{@link #getObjectPart() <em>Object Part</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjectPart()
     * @generated
     * @ordered
     */
    protected static final String OBJECT_PART_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getObjectPart() <em>Object Part</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjectPart()
     * @generated
     * @ordered
     */
    protected String objectPart = OBJECT_PART_EDEFAULT;

    /**
     * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScript()
     * @generated
     * @ordered
     */
    protected static final String SCRIPT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScript()
     * @generated
     * @ordered
     */
    protected String script = SCRIPT_EDEFAULT;

    /**
     * The default value of the '{@link #getTransliteration() <em>Transliteration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransliteration()
     * @generated
     * @ordered
     */
    protected static final String TRANSLITERATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTransliteration() <em>Transliteration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransliteration()
     * @generated
     * @ordered
     */
    protected String transliteration = TRANSLITERATION_EDEFAULT;

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
    protected LanguageDefinitionImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return MODSPackage.eINSTANCE.getLanguageDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LanguageTermDefinition> getLanguageTerm() {
	if (languageTerm == null) {
	    languageTerm = new EObjectContainmentEList<LanguageTermDefinition>(LanguageTermDefinition.class, this,
			    MODSPackage.LANGUAGE_DEFINITION__LANGUAGE_TERM);
	}
	return languageTerm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScriptTermDefinition> getScriptTerm() {
	if (scriptTerm == null) {
	    scriptTerm = new EObjectContainmentEList<ScriptTermDefinition>(ScriptTermDefinition.class, this,
			    MODSPackage.LANGUAGE_DEFINITION__SCRIPT_TERM);
	}
	return scriptTerm;
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.LANGUAGE_DEFINITION__ALT_REP_GROUP,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.LANGUAGE_DEFINITION__DISPLAY_LABEL,
			    oldDisplayLabel, displayLabel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLang() {
	return lang;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLang(String newLang) {
	String oldLang = lang;
	lang = newLang;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.LANGUAGE_DEFINITION__LANG, oldLang, lang));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLang1() {
	return lang1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLang1(String newLang1) {
	String oldLang1 = lang1;
	lang1 = newLang1;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.LANGUAGE_DEFINITION__LANG1, oldLang1,
			    lang1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getObjectPart() {
	return objectPart;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObjectPart(String newObjectPart) {
	String oldObjectPart = objectPart;
	objectPart = newObjectPart;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.LANGUAGE_DEFINITION__OBJECT_PART,
			    oldObjectPart, objectPart));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getScript() {
	return script;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScript(String newScript) {
	String oldScript = script;
	script = newScript;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.LANGUAGE_DEFINITION__SCRIPT, oldScript,
			    script));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTransliteration() {
	return transliteration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransliteration(String newTransliteration) {
	String oldTransliteration = transliteration;
	transliteration = newTransliteration;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.LANGUAGE_DEFINITION__TRANSLITERATION,
			    oldTransliteration, transliteration));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.LANGUAGE_DEFINITION__USAGE, oldUsage,
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
	    eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.LANGUAGE_DEFINITION__USAGE, oldUsage,
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
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
	switch (featureID) {
	case MODSPackage.LANGUAGE_DEFINITION__LANGUAGE_TERM:
	    return ((InternalEList<?>) getLanguageTerm()).basicRemove(otherEnd, msgs);
	case MODSPackage.LANGUAGE_DEFINITION__SCRIPT_TERM:
	    return ((InternalEList<?>) getScriptTerm()).basicRemove(otherEnd, msgs);
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
	case MODSPackage.LANGUAGE_DEFINITION__LANGUAGE_TERM:
	    return getLanguageTerm();
	case MODSPackage.LANGUAGE_DEFINITION__SCRIPT_TERM:
	    return getScriptTerm();
	case MODSPackage.LANGUAGE_DEFINITION__ALT_REP_GROUP:
	    return getAltRepGroup();
	case MODSPackage.LANGUAGE_DEFINITION__DISPLAY_LABEL:
	    return getDisplayLabel();
	case MODSPackage.LANGUAGE_DEFINITION__LANG:
	    return getLang();
	case MODSPackage.LANGUAGE_DEFINITION__LANG1:
	    return getLang1();
	case MODSPackage.LANGUAGE_DEFINITION__OBJECT_PART:
	    return getObjectPart();
	case MODSPackage.LANGUAGE_DEFINITION__SCRIPT:
	    return getScript();
	case MODSPackage.LANGUAGE_DEFINITION__TRANSLITERATION:
	    return getTransliteration();
	case MODSPackage.LANGUAGE_DEFINITION__USAGE:
	    return getUsage();
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
	case MODSPackage.LANGUAGE_DEFINITION__LANGUAGE_TERM:
	    getLanguageTerm().clear();
	    getLanguageTerm().addAll((Collection<? extends LanguageTermDefinition>) newValue);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__SCRIPT_TERM:
	    getScriptTerm().clear();
	    getScriptTerm().addAll((Collection<? extends ScriptTermDefinition>) newValue);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__ALT_REP_GROUP:
	    setAltRepGroup((String) newValue);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__DISPLAY_LABEL:
	    setDisplayLabel((String) newValue);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__LANG:
	    setLang((String) newValue);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__LANG1:
	    setLang1((String) newValue);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__OBJECT_PART:
	    setObjectPart((String) newValue);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__SCRIPT:
	    setScript((String) newValue);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__TRANSLITERATION:
	    setTransliteration((String) newValue);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__USAGE:
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
	case MODSPackage.LANGUAGE_DEFINITION__LANGUAGE_TERM:
	    getLanguageTerm().clear();
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__SCRIPT_TERM:
	    getScriptTerm().clear();
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__ALT_REP_GROUP:
	    setAltRepGroup(ALT_REP_GROUP_EDEFAULT);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__DISPLAY_LABEL:
	    setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__LANG:
	    setLang(LANG_EDEFAULT);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__LANG1:
	    setLang1(LANG1_EDEFAULT);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__OBJECT_PART:
	    setObjectPart(OBJECT_PART_EDEFAULT);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__SCRIPT:
	    setScript(SCRIPT_EDEFAULT);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__TRANSLITERATION:
	    setTransliteration(TRANSLITERATION_EDEFAULT);
	    return;
	case MODSPackage.LANGUAGE_DEFINITION__USAGE:
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
	case MODSPackage.LANGUAGE_DEFINITION__LANGUAGE_TERM:
	    return languageTerm != null && !languageTerm.isEmpty();
	case MODSPackage.LANGUAGE_DEFINITION__SCRIPT_TERM:
	    return scriptTerm != null && !scriptTerm.isEmpty();
	case MODSPackage.LANGUAGE_DEFINITION__ALT_REP_GROUP:
	    return ALT_REP_GROUP_EDEFAULT == null ? altRepGroup != null : !ALT_REP_GROUP_EDEFAULT.equals(altRepGroup);
	case MODSPackage.LANGUAGE_DEFINITION__DISPLAY_LABEL:
	    return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
	case MODSPackage.LANGUAGE_DEFINITION__LANG:
	    return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
	case MODSPackage.LANGUAGE_DEFINITION__LANG1:
	    return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
	case MODSPackage.LANGUAGE_DEFINITION__OBJECT_PART:
	    return OBJECT_PART_EDEFAULT == null ? objectPart != null : !OBJECT_PART_EDEFAULT.equals(objectPart);
	case MODSPackage.LANGUAGE_DEFINITION__SCRIPT:
	    return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
	case MODSPackage.LANGUAGE_DEFINITION__TRANSLITERATION:
	    return TRANSLITERATION_EDEFAULT == null ? transliteration != null : !TRANSLITERATION_EDEFAULT
			    .equals(transliteration);
	case MODSPackage.LANGUAGE_DEFINITION__USAGE:
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
	result.append(", lang: ");
	result.append(lang);
	result.append(", lang1: ");
	result.append(lang1);
	result.append(", objectPart: ");
	result.append(objectPart);
	result.append(", script: ");
	result.append(script);
	result.append(", transliteration: ");
	result.append(transliteration);
	result.append(", usage: ");
	if (usageESet)
	    result.append(usage);
	else
	    result.append("<unset>");
	result.append(')');
	return result.toString();
    }

} //LanguageDefinitionImpl
