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

import gov.loc.mods.mods.ExtensionDefinition;
import gov.loc.mods.mods.HoldingSimpleDefinition;
import gov.loc.mods.mods.LocationDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.PhysicalLocationDefinition;
import gov.loc.mods.mods.UrlDefinition;
import gov.loc.mods.mods.XsString;

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
 * An implementation of the model object '<em><b>Location Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.LocationDefinitionImpl#getPhysicalLocation <em>Physical Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LocationDefinitionImpl#getShelfLocator <em>Shelf Locator</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LocationDefinitionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LocationDefinitionImpl#getHoldingSimple <em>Holding Simple</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LocationDefinitionImpl#getHoldingExternal <em>Holding External</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LocationDefinitionImpl#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LocationDefinitionImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LocationDefinitionImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LocationDefinitionImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LocationDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.LocationDefinitionImpl#getTransliteration <em>Transliteration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationDefinitionImpl extends EObjectImpl implements
		LocationDefinition {
	/**
	 * The cached value of the '{@link #getPhysicalLocation() <em>Physical Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLocationDefinition> physicalLocation;

	/**
	 * The cached value of the '{@link #getShelfLocator() <em>Shelf Locator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShelfLocator()
	 * @generated
	 * @ordered
	 */
	protected EList<XsString> shelfLocator;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected EList<UrlDefinition> url;

	/**
	 * The cached value of the '{@link #getHoldingSimple() <em>Holding Simple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldingSimple()
	 * @generated
	 * @ordered
	 */
	protected HoldingSimpleDefinition holdingSimple;

	/**
	 * The cached value of the '{@link #getHoldingExternal() <em>Holding External</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldingExternal()
	 * @generated
	 * @ordered
	 */
	protected ExtensionDefinition holdingExternal;

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
	protected LocationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getLocationDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalLocationDefinition> getPhysicalLocation() {
		if (physicalLocation == null) {
			physicalLocation = new EObjectContainmentEList<PhysicalLocationDefinition>(
					PhysicalLocationDefinition.class, this,
					MODSPackage.LOCATION_DEFINITION__PHYSICAL_LOCATION);
		}
		return physicalLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsString> getShelfLocator() {
		if (shelfLocator == null) {
			shelfLocator = new EObjectContainmentEList<XsString>(
					XsString.class, this,
					MODSPackage.LOCATION_DEFINITION__SHELF_LOCATOR);
		}
		return shelfLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UrlDefinition> getUrl() {
		if (url == null) {
			url = new EObjectContainmentEList<UrlDefinition>(
					UrlDefinition.class, this,
					MODSPackage.LOCATION_DEFINITION__URL);
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HoldingSimpleDefinition getHoldingSimple() {
		return holdingSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHoldingSimple(
			HoldingSimpleDefinition newHoldingSimple, NotificationChain msgs) {
		HoldingSimpleDefinition oldHoldingSimple = holdingSimple;
		holdingSimple = newHoldingSimple;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					MODSPackage.LOCATION_DEFINITION__HOLDING_SIMPLE,
					oldHoldingSimple, newHoldingSimple);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldingSimple(HoldingSimpleDefinition newHoldingSimple) {
		if (newHoldingSimple != holdingSimple) {
			NotificationChain msgs = null;
			if (holdingSimple != null)
				msgs = ((InternalEObject) holdingSimple)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MODSPackage.LOCATION_DEFINITION__HOLDING_SIMPLE,
								null, msgs);
			if (newHoldingSimple != null)
				msgs = ((InternalEObject) newHoldingSimple)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MODSPackage.LOCATION_DEFINITION__HOLDING_SIMPLE,
								null, msgs);
			msgs = basicSetHoldingSimple(newHoldingSimple, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.LOCATION_DEFINITION__HOLDING_SIMPLE,
					newHoldingSimple, newHoldingSimple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionDefinition getHoldingExternal() {
		return holdingExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHoldingExternal(
			ExtensionDefinition newHoldingExternal, NotificationChain msgs) {
		ExtensionDefinition oldHoldingExternal = holdingExternal;
		holdingExternal = newHoldingExternal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					MODSPackage.LOCATION_DEFINITION__HOLDING_EXTERNAL,
					oldHoldingExternal, newHoldingExternal);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldingExternal(ExtensionDefinition newHoldingExternal) {
		if (newHoldingExternal != holdingExternal) {
			NotificationChain msgs = null;
			if (holdingExternal != null)
				msgs = ((InternalEObject) holdingExternal)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MODSPackage.LOCATION_DEFINITION__HOLDING_EXTERNAL,
								null, msgs);
			if (newHoldingExternal != null)
				msgs = ((InternalEObject) newHoldingExternal)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MODSPackage.LOCATION_DEFINITION__HOLDING_EXTERNAL,
								null, msgs);
			msgs = basicSetHoldingExternal(newHoldingExternal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.LOCATION_DEFINITION__HOLDING_EXTERNAL,
					newHoldingExternal, newHoldingExternal));
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
					MODSPackage.LOCATION_DEFINITION__ALT_REP_GROUP,
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
					MODSPackage.LOCATION_DEFINITION__DISPLAY_LABEL,
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
					MODSPackage.LOCATION_DEFINITION__LANG, oldLang, lang));
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
					MODSPackage.LOCATION_DEFINITION__LANG1, oldLang1, lang1));
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
					MODSPackage.LOCATION_DEFINITION__SCRIPT, oldScript, script));
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
					MODSPackage.LOCATION_DEFINITION__TRANSLITERATION,
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
		case MODSPackage.LOCATION_DEFINITION__PHYSICAL_LOCATION:
			return ((InternalEList<?>) getPhysicalLocation()).basicRemove(
					otherEnd, msgs);
		case MODSPackage.LOCATION_DEFINITION__SHELF_LOCATOR:
			return ((InternalEList<?>) getShelfLocator()).basicRemove(otherEnd,
					msgs);
		case MODSPackage.LOCATION_DEFINITION__URL:
			return ((InternalEList<?>) getUrl()).basicRemove(otherEnd, msgs);
		case MODSPackage.LOCATION_DEFINITION__HOLDING_SIMPLE:
			return basicSetHoldingSimple(null, msgs);
		case MODSPackage.LOCATION_DEFINITION__HOLDING_EXTERNAL:
			return basicSetHoldingExternal(null, msgs);
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
		case MODSPackage.LOCATION_DEFINITION__PHYSICAL_LOCATION:
			return getPhysicalLocation();
		case MODSPackage.LOCATION_DEFINITION__SHELF_LOCATOR:
			return getShelfLocator();
		case MODSPackage.LOCATION_DEFINITION__URL:
			return getUrl();
		case MODSPackage.LOCATION_DEFINITION__HOLDING_SIMPLE:
			return getHoldingSimple();
		case MODSPackage.LOCATION_DEFINITION__HOLDING_EXTERNAL:
			return getHoldingExternal();
		case MODSPackage.LOCATION_DEFINITION__ALT_REP_GROUP:
			return getAltRepGroup();
		case MODSPackage.LOCATION_DEFINITION__DISPLAY_LABEL:
			return getDisplayLabel();
		case MODSPackage.LOCATION_DEFINITION__LANG:
			return getLang();
		case MODSPackage.LOCATION_DEFINITION__LANG1:
			return getLang1();
		case MODSPackage.LOCATION_DEFINITION__SCRIPT:
			return getScript();
		case MODSPackage.LOCATION_DEFINITION__TRANSLITERATION:
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
		case MODSPackage.LOCATION_DEFINITION__PHYSICAL_LOCATION:
			getPhysicalLocation().clear();
			getPhysicalLocation()
					.addAll((Collection<? extends PhysicalLocationDefinition>) newValue);
			return;
		case MODSPackage.LOCATION_DEFINITION__SHELF_LOCATOR:
			getShelfLocator().clear();
			getShelfLocator().addAll((Collection<? extends XsString>) newValue);
			return;
		case MODSPackage.LOCATION_DEFINITION__URL:
			getUrl().clear();
			getUrl().addAll((Collection<? extends UrlDefinition>) newValue);
			return;
		case MODSPackage.LOCATION_DEFINITION__HOLDING_SIMPLE:
			setHoldingSimple((HoldingSimpleDefinition) newValue);
			return;
		case MODSPackage.LOCATION_DEFINITION__HOLDING_EXTERNAL:
			setHoldingExternal((ExtensionDefinition) newValue);
			return;
		case MODSPackage.LOCATION_DEFINITION__ALT_REP_GROUP:
			setAltRepGroup((String) newValue);
			return;
		case MODSPackage.LOCATION_DEFINITION__DISPLAY_LABEL:
			setDisplayLabel((String) newValue);
			return;
		case MODSPackage.LOCATION_DEFINITION__LANG:
			setLang((String) newValue);
			return;
		case MODSPackage.LOCATION_DEFINITION__LANG1:
			setLang1((String) newValue);
			return;
		case MODSPackage.LOCATION_DEFINITION__SCRIPT:
			setScript((String) newValue);
			return;
		case MODSPackage.LOCATION_DEFINITION__TRANSLITERATION:
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
		case MODSPackage.LOCATION_DEFINITION__PHYSICAL_LOCATION:
			getPhysicalLocation().clear();
			return;
		case MODSPackage.LOCATION_DEFINITION__SHELF_LOCATOR:
			getShelfLocator().clear();
			return;
		case MODSPackage.LOCATION_DEFINITION__URL:
			getUrl().clear();
			return;
		case MODSPackage.LOCATION_DEFINITION__HOLDING_SIMPLE:
			setHoldingSimple((HoldingSimpleDefinition) null);
			return;
		case MODSPackage.LOCATION_DEFINITION__HOLDING_EXTERNAL:
			setHoldingExternal((ExtensionDefinition) null);
			return;
		case MODSPackage.LOCATION_DEFINITION__ALT_REP_GROUP:
			setAltRepGroup(ALT_REP_GROUP_EDEFAULT);
			return;
		case MODSPackage.LOCATION_DEFINITION__DISPLAY_LABEL:
			setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
			return;
		case MODSPackage.LOCATION_DEFINITION__LANG:
			setLang(LANG_EDEFAULT);
			return;
		case MODSPackage.LOCATION_DEFINITION__LANG1:
			setLang1(LANG1_EDEFAULT);
			return;
		case MODSPackage.LOCATION_DEFINITION__SCRIPT:
			setScript(SCRIPT_EDEFAULT);
			return;
		case MODSPackage.LOCATION_DEFINITION__TRANSLITERATION:
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
		case MODSPackage.LOCATION_DEFINITION__PHYSICAL_LOCATION:
			return physicalLocation != null && !physicalLocation.isEmpty();
		case MODSPackage.LOCATION_DEFINITION__SHELF_LOCATOR:
			return shelfLocator != null && !shelfLocator.isEmpty();
		case MODSPackage.LOCATION_DEFINITION__URL:
			return url != null && !url.isEmpty();
		case MODSPackage.LOCATION_DEFINITION__HOLDING_SIMPLE:
			return holdingSimple != null;
		case MODSPackage.LOCATION_DEFINITION__HOLDING_EXTERNAL:
			return holdingExternal != null;
		case MODSPackage.LOCATION_DEFINITION__ALT_REP_GROUP:
			return ALT_REP_GROUP_EDEFAULT == null ? altRepGroup != null
					: !ALT_REP_GROUP_EDEFAULT.equals(altRepGroup);
		case MODSPackage.LOCATION_DEFINITION__DISPLAY_LABEL:
			return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null
					: !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
		case MODSPackage.LOCATION_DEFINITION__LANG:
			return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT
					.equals(lang);
		case MODSPackage.LOCATION_DEFINITION__LANG1:
			return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT
					.equals(lang1);
		case MODSPackage.LOCATION_DEFINITION__SCRIPT:
			return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT
					.equals(script);
		case MODSPackage.LOCATION_DEFINITION__TRANSLITERATION:
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
		result.append(" (altRepGroup: ");
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

} //LocationDefinitionImpl
