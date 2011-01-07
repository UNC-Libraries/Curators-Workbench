/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.DigitalOriginDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.NoteBaseDefinition;
import gov.loc.mods.mods.PhysicalDescriptionDefinition;
import gov.loc.mods.mods.ReformattingQualityDefinition;
import gov.loc.mods.mods.StringPlusAuthorityPlusType;
import gov.loc.mods.mods.StringPlusSupplied;
import gov.loc.mods.mods.XsString;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Description Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl#getForm <em>Form</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl#getReformattingQuality <em>Reformatting Quality</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl#getInternetMediaType <em>Internet Media Type</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl#getDigitalOrigin <em>Digital Origin</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PhysicalDescriptionDefinitionImpl#getTransliteration <em>Transliteration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalDescriptionDefinitionImpl extends EObjectImpl implements PhysicalDescriptionDefinition {
    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap group;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PhysicalDescriptionDefinitionImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
	if (group == null) {
	    group = new BasicFeatureMap(this, MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__GROUP);
	}
	return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StringPlusAuthorityPlusType> getForm() {
	return getGroup().list(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Form());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ReformattingQualityDefinition> getReformattingQuality() {
	return getGroup().list(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_ReformattingQuality());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XsString> getInternetMediaType() {
	return getGroup().list(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_InternetMediaType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StringPlusSupplied> getExtent() {
	return getGroup().list(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Extent());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DigitalOriginDefinition> getDigitalOrigin() {
	return getGroup().list(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_DigitalOrigin());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NoteBaseDefinition> getNote() {
	return getGroup().list(MODSPackage.eINSTANCE.getPhysicalDescriptionDefinition_Note());
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
			    MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__ALT_REP_GROUP, oldAltRepGroup, altRepGroup));
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
			    MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__DISPLAY_LABEL, oldDisplayLabel, displayLabel));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__LANG,
			    oldLang, lang));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__LANG1,
			    oldLang1, lang1));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__SCRIPT,
			    oldScript, script));
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
	    eNotify(new ENotificationImpl(this, Notification.SET,
			    MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__TRANSLITERATION, oldTransliteration,
			    transliteration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
	switch (featureID) {
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__GROUP:
	    return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__FORM:
	    return ((InternalEList<?>) getForm()).basicRemove(otherEnd, msgs);
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__INTERNET_MEDIA_TYPE:
	    return ((InternalEList<?>) getInternetMediaType()).basicRemove(otherEnd, msgs);
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__EXTENT:
	    return ((InternalEList<?>) getExtent()).basicRemove(otherEnd, msgs);
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__NOTE:
	    return ((InternalEList<?>) getNote()).basicRemove(otherEnd, msgs);
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
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__GROUP:
	    if (coreType)
		return getGroup();
	    return ((FeatureMap.Internal) getGroup()).getWrapper();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__FORM:
	    return getForm();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__REFORMATTING_QUALITY:
	    return getReformattingQuality();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__INTERNET_MEDIA_TYPE:
	    return getInternetMediaType();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__EXTENT:
	    return getExtent();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__DIGITAL_ORIGIN:
	    return getDigitalOrigin();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__NOTE:
	    return getNote();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__ALT_REP_GROUP:
	    return getAltRepGroup();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__DISPLAY_LABEL:
	    return getDisplayLabel();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__LANG:
	    return getLang();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__LANG1:
	    return getLang1();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__SCRIPT:
	    return getScript();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__TRANSLITERATION:
	    return getTransliteration();
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
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__GROUP:
	    ((FeatureMap.Internal) getGroup()).set(newValue);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__FORM:
	    getForm().clear();
	    getForm().addAll((Collection<? extends StringPlusAuthorityPlusType>) newValue);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__REFORMATTING_QUALITY:
	    getReformattingQuality().clear();
	    getReformattingQuality().addAll((Collection<? extends ReformattingQualityDefinition>) newValue);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__INTERNET_MEDIA_TYPE:
	    getInternetMediaType().clear();
	    getInternetMediaType().addAll((Collection<? extends XsString>) newValue);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__EXTENT:
	    getExtent().clear();
	    getExtent().addAll((Collection<? extends StringPlusSupplied>) newValue);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__DIGITAL_ORIGIN:
	    getDigitalOrigin().clear();
	    getDigitalOrigin().addAll((Collection<? extends DigitalOriginDefinition>) newValue);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__NOTE:
	    getNote().clear();
	    getNote().addAll((Collection<? extends NoteBaseDefinition>) newValue);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__ALT_REP_GROUP:
	    setAltRepGroup((String) newValue);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__DISPLAY_LABEL:
	    setDisplayLabel((String) newValue);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__LANG:
	    setLang((String) newValue);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__LANG1:
	    setLang1((String) newValue);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__SCRIPT:
	    setScript((String) newValue);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__TRANSLITERATION:
	    setTransliteration((String) newValue);
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
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__GROUP:
	    getGroup().clear();
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__FORM:
	    getForm().clear();
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__REFORMATTING_QUALITY:
	    getReformattingQuality().clear();
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__INTERNET_MEDIA_TYPE:
	    getInternetMediaType().clear();
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__EXTENT:
	    getExtent().clear();
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__DIGITAL_ORIGIN:
	    getDigitalOrigin().clear();
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__NOTE:
	    getNote().clear();
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__ALT_REP_GROUP:
	    setAltRepGroup(ALT_REP_GROUP_EDEFAULT);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__DISPLAY_LABEL:
	    setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__LANG:
	    setLang(LANG_EDEFAULT);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__LANG1:
	    setLang1(LANG1_EDEFAULT);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__SCRIPT:
	    setScript(SCRIPT_EDEFAULT);
	    return;
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__TRANSLITERATION:
	    setTransliteration(TRANSLITERATION_EDEFAULT);
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
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__GROUP:
	    return group != null && !group.isEmpty();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__FORM:
	    return !getForm().isEmpty();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__REFORMATTING_QUALITY:
	    return !getReformattingQuality().isEmpty();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__INTERNET_MEDIA_TYPE:
	    return !getInternetMediaType().isEmpty();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__EXTENT:
	    return !getExtent().isEmpty();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__DIGITAL_ORIGIN:
	    return !getDigitalOrigin().isEmpty();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__NOTE:
	    return !getNote().isEmpty();
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__ALT_REP_GROUP:
	    return ALT_REP_GROUP_EDEFAULT == null ? altRepGroup != null : !ALT_REP_GROUP_EDEFAULT.equals(altRepGroup);
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__DISPLAY_LABEL:
	    return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__LANG:
	    return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__LANG1:
	    return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__SCRIPT:
	    return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
	case MODSPackage.PHYSICAL_DESCRIPTION_DEFINITION__TRANSLITERATION:
	    return TRANSLITERATION_EDEFAULT == null ? transliteration != null : !TRANSLITERATION_EDEFAULT
			    .equals(transliteration);
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
	result.append(" (group: ");
	result.append(group);
	result.append(", altRepGroup: ");
	result.append(altRepGroup);
	result.append(", displayLabel: ");
	result.append(displayLabel);
	result.append(", lang: ");
	result.append(lang);
	result.append(", lang1: ");
	result.append(lang1);
	result.append(", script: ");
	result.append(script);
	result.append(", transliteration: ");
	result.append(transliteration);
	result.append(')');
	return result.toString();
    }

} //PhysicalDescriptionDefinitionImpl
