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
import gov.loc.mods.mods.LanguageDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.RecordIdentifierDefinition;
import gov.loc.mods.mods.RecordInfoDefinition;
import gov.loc.mods.mods.StringPlusAuthority;
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
 * An implementation of the model object '<em><b>Record Info Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl#getRecordContentSource <em>Record Content Source</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl#getRecordCreationDate <em>Record Creation Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl#getRecordChangeDate <em>Record Change Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl#getRecordIdentifier <em>Record Identifier</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl#getLanguageOfCataloging <em>Language Of Cataloging</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl#getRecordOrigin <em>Record Origin</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl#getDescriptionStandard <em>Description Standard</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RecordInfoDefinitionImpl#getTransliteration <em>Transliteration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordInfoDefinitionImpl extends EObjectImpl implements
		RecordInfoDefinition {
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
	protected RecordInfoDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getRecordInfoDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this,
					MODSPackage.RECORD_INFO_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringPlusAuthority> getRecordContentSource() {
		return getGroup().list(
				MODSPackage.eINSTANCE
						.getRecordInfoDefinition_RecordContentSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateDefinition> getRecordCreationDate() {
		return getGroup().list(
				MODSPackage.eINSTANCE
						.getRecordInfoDefinition_RecordCreationDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateDefinition> getRecordChangeDate() {
		return getGroup().list(
				MODSPackage.eINSTANCE
						.getRecordInfoDefinition_RecordChangeDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordIdentifierDefinition> getRecordIdentifier() {
		return getGroup().list(
				MODSPackage.eINSTANCE
						.getRecordInfoDefinition_RecordIdentifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguageDefinition> getLanguageOfCataloging() {
		return getGroup().list(
				MODSPackage.eINSTANCE
						.getRecordInfoDefinition_LanguageOfCataloging());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsString> getRecordOrigin() {
		return getGroup().list(
				MODSPackage.eINSTANCE.getRecordInfoDefinition_RecordOrigin());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringPlusAuthority> getDescriptionStandard() {
		return getGroup().list(
				MODSPackage.eINSTANCE
						.getRecordInfoDefinition_DescriptionStandard());
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
					MODSPackage.RECORD_INFO_DEFINITION__ALT_REP_GROUP,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.RECORD_INFO_DEFINITION__DISPLAY_LABEL,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.RECORD_INFO_DEFINITION__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.RECORD_INFO_DEFINITION__LANG1, oldLang1, lang1));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.RECORD_INFO_DEFINITION__SCRIPT, oldScript,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.RECORD_INFO_DEFINITION__TRANSLITERATION,
					oldTransliteration, transliteration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MODSPackage.RECORD_INFO_DEFINITION__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CONTENT_SOURCE:
			return ((InternalEList<?>) getRecordContentSource()).basicRemove(
					otherEnd, msgs);
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CREATION_DATE:
			return ((InternalEList<?>) getRecordCreationDate()).basicRemove(
					otherEnd, msgs);
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CHANGE_DATE:
			return ((InternalEList<?>) getRecordChangeDate()).basicRemove(
					otherEnd, msgs);
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_IDENTIFIER:
			return ((InternalEList<?>) getRecordIdentifier()).basicRemove(
					otherEnd, msgs);
		case MODSPackage.RECORD_INFO_DEFINITION__LANGUAGE_OF_CATALOGING:
			return ((InternalEList<?>) getLanguageOfCataloging()).basicRemove(
					otherEnd, msgs);
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_ORIGIN:
			return ((InternalEList<?>) getRecordOrigin()).basicRemove(otherEnd,
					msgs);
		case MODSPackage.RECORD_INFO_DEFINITION__DESCRIPTION_STANDARD:
			return ((InternalEList<?>) getDescriptionStandard()).basicRemove(
					otherEnd, msgs);
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
		case MODSPackage.RECORD_INFO_DEFINITION__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CONTENT_SOURCE:
			return getRecordContentSource();
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CREATION_DATE:
			return getRecordCreationDate();
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CHANGE_DATE:
			return getRecordChangeDate();
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_IDENTIFIER:
			return getRecordIdentifier();
		case MODSPackage.RECORD_INFO_DEFINITION__LANGUAGE_OF_CATALOGING:
			return getLanguageOfCataloging();
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_ORIGIN:
			return getRecordOrigin();
		case MODSPackage.RECORD_INFO_DEFINITION__DESCRIPTION_STANDARD:
			return getDescriptionStandard();
		case MODSPackage.RECORD_INFO_DEFINITION__ALT_REP_GROUP:
			return getAltRepGroup();
		case MODSPackage.RECORD_INFO_DEFINITION__DISPLAY_LABEL:
			return getDisplayLabel();
		case MODSPackage.RECORD_INFO_DEFINITION__LANG:
			return getLang();
		case MODSPackage.RECORD_INFO_DEFINITION__LANG1:
			return getLang1();
		case MODSPackage.RECORD_INFO_DEFINITION__SCRIPT:
			return getScript();
		case MODSPackage.RECORD_INFO_DEFINITION__TRANSLITERATION:
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
		case MODSPackage.RECORD_INFO_DEFINITION__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CONTENT_SOURCE:
			getRecordContentSource().clear();
			getRecordContentSource().addAll(
					(Collection<? extends StringPlusAuthority>) newValue);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CREATION_DATE:
			getRecordCreationDate().clear();
			getRecordCreationDate().addAll(
					(Collection<? extends DateDefinition>) newValue);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CHANGE_DATE:
			getRecordChangeDate().clear();
			getRecordChangeDate().addAll(
					(Collection<? extends DateDefinition>) newValue);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_IDENTIFIER:
			getRecordIdentifier().clear();
			getRecordIdentifier()
					.addAll((Collection<? extends RecordIdentifierDefinition>) newValue);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__LANGUAGE_OF_CATALOGING:
			getLanguageOfCataloging().clear();
			getLanguageOfCataloging().addAll(
					(Collection<? extends LanguageDefinition>) newValue);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_ORIGIN:
			getRecordOrigin().clear();
			getRecordOrigin().addAll((Collection<? extends XsString>) newValue);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__DESCRIPTION_STANDARD:
			getDescriptionStandard().clear();
			getDescriptionStandard().addAll(
					(Collection<? extends StringPlusAuthority>) newValue);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__ALT_REP_GROUP:
			setAltRepGroup((String) newValue);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__DISPLAY_LABEL:
			setDisplayLabel((String) newValue);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__LANG:
			setLang((String) newValue);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__LANG1:
			setLang1((String) newValue);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__SCRIPT:
			setScript((String) newValue);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__TRANSLITERATION:
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
		case MODSPackage.RECORD_INFO_DEFINITION__GROUP:
			getGroup().clear();
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CONTENT_SOURCE:
			getRecordContentSource().clear();
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CREATION_DATE:
			getRecordCreationDate().clear();
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CHANGE_DATE:
			getRecordChangeDate().clear();
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_IDENTIFIER:
			getRecordIdentifier().clear();
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__LANGUAGE_OF_CATALOGING:
			getLanguageOfCataloging().clear();
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_ORIGIN:
			getRecordOrigin().clear();
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__DESCRIPTION_STANDARD:
			getDescriptionStandard().clear();
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__ALT_REP_GROUP:
			setAltRepGroup(ALT_REP_GROUP_EDEFAULT);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__DISPLAY_LABEL:
			setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__LANG:
			setLang(LANG_EDEFAULT);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__LANG1:
			setLang1(LANG1_EDEFAULT);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__SCRIPT:
			setScript(SCRIPT_EDEFAULT);
			return;
		case MODSPackage.RECORD_INFO_DEFINITION__TRANSLITERATION:
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
		case MODSPackage.RECORD_INFO_DEFINITION__GROUP:
			return group != null && !group.isEmpty();
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CONTENT_SOURCE:
			return !getRecordContentSource().isEmpty();
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CREATION_DATE:
			return !getRecordCreationDate().isEmpty();
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_CHANGE_DATE:
			return !getRecordChangeDate().isEmpty();
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_IDENTIFIER:
			return !getRecordIdentifier().isEmpty();
		case MODSPackage.RECORD_INFO_DEFINITION__LANGUAGE_OF_CATALOGING:
			return !getLanguageOfCataloging().isEmpty();
		case MODSPackage.RECORD_INFO_DEFINITION__RECORD_ORIGIN:
			return !getRecordOrigin().isEmpty();
		case MODSPackage.RECORD_INFO_DEFINITION__DESCRIPTION_STANDARD:
			return !getDescriptionStandard().isEmpty();
		case MODSPackage.RECORD_INFO_DEFINITION__ALT_REP_GROUP:
			return ALT_REP_GROUP_EDEFAULT == null ? altRepGroup != null
					: !ALT_REP_GROUP_EDEFAULT.equals(altRepGroup);
		case MODSPackage.RECORD_INFO_DEFINITION__DISPLAY_LABEL:
			return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null
					: !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
		case MODSPackage.RECORD_INFO_DEFINITION__LANG:
			return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT
					.equals(lang);
		case MODSPackage.RECORD_INFO_DEFINITION__LANG1:
			return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT
					.equals(lang1);
		case MODSPackage.RECORD_INFO_DEFINITION__SCRIPT:
			return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT
					.equals(script);
		case MODSPackage.RECORD_INFO_DEFINITION__TRANSLITERATION:
			return TRANSLITERATION_EDEFAULT == null ? transliteration != null
					: !TRANSLITERATION_EDEFAULT.equals(transliteration);
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

} //RecordInfoDefinitionImpl
