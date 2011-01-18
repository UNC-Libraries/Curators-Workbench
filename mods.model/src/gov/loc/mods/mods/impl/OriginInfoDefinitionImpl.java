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

import gov.loc.mods.mods.DateDefinition;
import gov.loc.mods.mods.DateOtherDefinition;
import gov.loc.mods.mods.IssuanceDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.OriginInfoDefinition;
import gov.loc.mods.mods.PlaceDefinition;
import gov.loc.mods.mods.StringPlusAuthority;
import gov.loc.mods.mods.StringPlusSupplied;

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
 * An implementation of the model object '<em><b>Origin Info Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getDateIssued <em>Date Issued</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getDateCaptured <em>Date Captured</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getDateValid <em>Date Valid</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getDateModified <em>Date Modified</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getCopyrightDate <em>Copyright Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getDateOther <em>Date Other</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getIssuance <em>Issuance</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.OriginInfoDefinitionImpl#getTransliteration <em>Transliteration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OriginInfoDefinitionImpl extends EObjectImpl implements OriginInfoDefinition {
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
    protected OriginInfoDefinitionImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return MODSPackage.eINSTANCE.getOriginInfoDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
	if (group == null) {
	    group = new BasicFeatureMap(this, MODSPackage.ORIGIN_INFO_DEFINITION__GROUP);
	}
	return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PlaceDefinition> getPlace() {
	return getGroup().list(MODSPackage.eINSTANCE.getOriginInfoDefinition_Place());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StringPlusSupplied> getPublisher() {
	return getGroup().list(MODSPackage.eINSTANCE.getOriginInfoDefinition_Publisher());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DateDefinition> getDateIssued() {
	return getGroup().list(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateIssued());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DateDefinition> getDateCreated() {
	return getGroup().list(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateCreated());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DateDefinition> getDateCaptured() {
	return getGroup().list(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateCaptured());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DateDefinition> getDateValid() {
	return getGroup().list(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateValid());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DateDefinition> getDateModified() {
	return getGroup().list(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateModified());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DateDefinition> getCopyrightDate() {
	return getGroup().list(MODSPackage.eINSTANCE.getOriginInfoDefinition_CopyrightDate());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DateOtherDefinition> getDateOther() {
	return getGroup().list(MODSPackage.eINSTANCE.getOriginInfoDefinition_DateOther());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StringPlusSupplied> getEdition() {
	return getGroup().list(MODSPackage.eINSTANCE.getOriginInfoDefinition_Edition());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IssuanceDefinition> getIssuance() {
	return getGroup().list(MODSPackage.eINSTANCE.getOriginInfoDefinition_Issuance());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StringPlusAuthority> getFrequency() {
	return getGroup().list(MODSPackage.eINSTANCE.getOriginInfoDefinition_Frequency());
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ORIGIN_INFO_DEFINITION__ALT_REP_GROUP,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ORIGIN_INFO_DEFINITION__DISPLAY_LABEL,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ORIGIN_INFO_DEFINITION__LANG, oldLang,
			    lang));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ORIGIN_INFO_DEFINITION__LANG1, oldLang1,
			    lang1));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ORIGIN_INFO_DEFINITION__SCRIPT,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ORIGIN_INFO_DEFINITION__TRANSLITERATION,
			    oldTransliteration, transliteration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
	switch (featureID) {
	case MODSPackage.ORIGIN_INFO_DEFINITION__GROUP:
	    return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
	case MODSPackage.ORIGIN_INFO_DEFINITION__PLACE:
	    return ((InternalEList<?>) getPlace()).basicRemove(otherEnd, msgs);
	case MODSPackage.ORIGIN_INFO_DEFINITION__PUBLISHER:
	    return ((InternalEList<?>) getPublisher()).basicRemove(otherEnd, msgs);
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_ISSUED:
	    return ((InternalEList<?>) getDateIssued()).basicRemove(otherEnd, msgs);
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_CREATED:
	    return ((InternalEList<?>) getDateCreated()).basicRemove(otherEnd, msgs);
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_CAPTURED:
	    return ((InternalEList<?>) getDateCaptured()).basicRemove(otherEnd, msgs);
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_VALID:
	    return ((InternalEList<?>) getDateValid()).basicRemove(otherEnd, msgs);
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_MODIFIED:
	    return ((InternalEList<?>) getDateModified()).basicRemove(otherEnd, msgs);
	case MODSPackage.ORIGIN_INFO_DEFINITION__COPYRIGHT_DATE:
	    return ((InternalEList<?>) getCopyrightDate()).basicRemove(otherEnd, msgs);
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_OTHER:
	    return ((InternalEList<?>) getDateOther()).basicRemove(otherEnd, msgs);
	case MODSPackage.ORIGIN_INFO_DEFINITION__EDITION:
	    return ((InternalEList<?>) getEdition()).basicRemove(otherEnd, msgs);
	case MODSPackage.ORIGIN_INFO_DEFINITION__FREQUENCY:
	    return ((InternalEList<?>) getFrequency()).basicRemove(otherEnd, msgs);
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
	case MODSPackage.ORIGIN_INFO_DEFINITION__GROUP:
	    if (coreType)
		return getGroup();
	    return ((FeatureMap.Internal) getGroup()).getWrapper();
	case MODSPackage.ORIGIN_INFO_DEFINITION__PLACE:
	    return getPlace();
	case MODSPackage.ORIGIN_INFO_DEFINITION__PUBLISHER:
	    return getPublisher();
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_ISSUED:
	    return getDateIssued();
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_CREATED:
	    return getDateCreated();
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_CAPTURED:
	    return getDateCaptured();
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_VALID:
	    return getDateValid();
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_MODIFIED:
	    return getDateModified();
	case MODSPackage.ORIGIN_INFO_DEFINITION__COPYRIGHT_DATE:
	    return getCopyrightDate();
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_OTHER:
	    return getDateOther();
	case MODSPackage.ORIGIN_INFO_DEFINITION__EDITION:
	    return getEdition();
	case MODSPackage.ORIGIN_INFO_DEFINITION__ISSUANCE:
	    return getIssuance();
	case MODSPackage.ORIGIN_INFO_DEFINITION__FREQUENCY:
	    return getFrequency();
	case MODSPackage.ORIGIN_INFO_DEFINITION__ALT_REP_GROUP:
	    return getAltRepGroup();
	case MODSPackage.ORIGIN_INFO_DEFINITION__DISPLAY_LABEL:
	    return getDisplayLabel();
	case MODSPackage.ORIGIN_INFO_DEFINITION__LANG:
	    return getLang();
	case MODSPackage.ORIGIN_INFO_DEFINITION__LANG1:
	    return getLang1();
	case MODSPackage.ORIGIN_INFO_DEFINITION__SCRIPT:
	    return getScript();
	case MODSPackage.ORIGIN_INFO_DEFINITION__TRANSLITERATION:
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
	case MODSPackage.ORIGIN_INFO_DEFINITION__GROUP:
	    ((FeatureMap.Internal) getGroup()).set(newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__PLACE:
	    getPlace().clear();
	    getPlace().addAll((Collection<? extends PlaceDefinition>) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__PUBLISHER:
	    getPublisher().clear();
	    getPublisher().addAll((Collection<? extends StringPlusSupplied>) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_ISSUED:
	    getDateIssued().clear();
	    getDateIssued().addAll((Collection<? extends DateDefinition>) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_CREATED:
	    getDateCreated().clear();
	    getDateCreated().addAll((Collection<? extends DateDefinition>) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_CAPTURED:
	    getDateCaptured().clear();
	    getDateCaptured().addAll((Collection<? extends DateDefinition>) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_VALID:
	    getDateValid().clear();
	    getDateValid().addAll((Collection<? extends DateDefinition>) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_MODIFIED:
	    getDateModified().clear();
	    getDateModified().addAll((Collection<? extends DateDefinition>) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__COPYRIGHT_DATE:
	    getCopyrightDate().clear();
	    getCopyrightDate().addAll((Collection<? extends DateDefinition>) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_OTHER:
	    getDateOther().clear();
	    getDateOther().addAll((Collection<? extends DateOtherDefinition>) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__EDITION:
	    getEdition().clear();
	    getEdition().addAll((Collection<? extends StringPlusSupplied>) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__ISSUANCE:
	    getIssuance().clear();
	    getIssuance().addAll((Collection<? extends IssuanceDefinition>) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__FREQUENCY:
	    getFrequency().clear();
	    getFrequency().addAll((Collection<? extends StringPlusAuthority>) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__ALT_REP_GROUP:
	    setAltRepGroup((String) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__DISPLAY_LABEL:
	    setDisplayLabel((String) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__LANG:
	    setLang((String) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__LANG1:
	    setLang1((String) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__SCRIPT:
	    setScript((String) newValue);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__TRANSLITERATION:
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
	case MODSPackage.ORIGIN_INFO_DEFINITION__GROUP:
	    getGroup().clear();
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__PLACE:
	    getPlace().clear();
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__PUBLISHER:
	    getPublisher().clear();
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_ISSUED:
	    getDateIssued().clear();
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_CREATED:
	    getDateCreated().clear();
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_CAPTURED:
	    getDateCaptured().clear();
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_VALID:
	    getDateValid().clear();
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_MODIFIED:
	    getDateModified().clear();
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__COPYRIGHT_DATE:
	    getCopyrightDate().clear();
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_OTHER:
	    getDateOther().clear();
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__EDITION:
	    getEdition().clear();
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__ISSUANCE:
	    getIssuance().clear();
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__FREQUENCY:
	    getFrequency().clear();
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__ALT_REP_GROUP:
	    setAltRepGroup(ALT_REP_GROUP_EDEFAULT);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__DISPLAY_LABEL:
	    setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__LANG:
	    setLang(LANG_EDEFAULT);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__LANG1:
	    setLang1(LANG1_EDEFAULT);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__SCRIPT:
	    setScript(SCRIPT_EDEFAULT);
	    return;
	case MODSPackage.ORIGIN_INFO_DEFINITION__TRANSLITERATION:
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
	case MODSPackage.ORIGIN_INFO_DEFINITION__GROUP:
	    return group != null && !group.isEmpty();
	case MODSPackage.ORIGIN_INFO_DEFINITION__PLACE:
	    return !getPlace().isEmpty();
	case MODSPackage.ORIGIN_INFO_DEFINITION__PUBLISHER:
	    return !getPublisher().isEmpty();
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_ISSUED:
	    return !getDateIssued().isEmpty();
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_CREATED:
	    return !getDateCreated().isEmpty();
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_CAPTURED:
	    return !getDateCaptured().isEmpty();
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_VALID:
	    return !getDateValid().isEmpty();
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_MODIFIED:
	    return !getDateModified().isEmpty();
	case MODSPackage.ORIGIN_INFO_DEFINITION__COPYRIGHT_DATE:
	    return !getCopyrightDate().isEmpty();
	case MODSPackage.ORIGIN_INFO_DEFINITION__DATE_OTHER:
	    return !getDateOther().isEmpty();
	case MODSPackage.ORIGIN_INFO_DEFINITION__EDITION:
	    return !getEdition().isEmpty();
	case MODSPackage.ORIGIN_INFO_DEFINITION__ISSUANCE:
	    return !getIssuance().isEmpty();
	case MODSPackage.ORIGIN_INFO_DEFINITION__FREQUENCY:
	    return !getFrequency().isEmpty();
	case MODSPackage.ORIGIN_INFO_DEFINITION__ALT_REP_GROUP:
	    return ALT_REP_GROUP_EDEFAULT == null ? altRepGroup != null : !ALT_REP_GROUP_EDEFAULT.equals(altRepGroup);
	case MODSPackage.ORIGIN_INFO_DEFINITION__DISPLAY_LABEL:
	    return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
	case MODSPackage.ORIGIN_INFO_DEFINITION__LANG:
	    return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
	case MODSPackage.ORIGIN_INFO_DEFINITION__LANG1:
	    return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
	case MODSPackage.ORIGIN_INFO_DEFINITION__SCRIPT:
	    return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
	case MODSPackage.ORIGIN_INFO_DEFINITION__TRANSLITERATION:
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

} //OriginInfoDefinitionImpl
