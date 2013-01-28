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

import gov.loc.mods.mods.DateBaseDefinition;
import gov.loc.mods.mods.DetailDefinition;
import gov.loc.mods.mods.ExtentDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.PartDefinition;
import gov.loc.mods.mods.UnstructuredTextDefinition;

import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>Part Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.PartDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PartDefinitionImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PartDefinitionImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PartDefinitionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PartDefinitionImpl#getText <em>Text</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PartDefinitionImpl#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PartDefinitionImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PartDefinitionImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PartDefinitionImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PartDefinitionImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PartDefinitionImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PartDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PartDefinitionImpl#getTransliteration <em>Transliteration</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.PartDefinitionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartDefinitionImpl extends EObjectImpl implements PartDefinition {
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
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

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
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger order = ORDER_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getPartDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, MODSPackage.PART_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DetailDefinition> getDetail() {
		return getGroup().list(MODSPackage.eINSTANCE.getPartDefinition_Detail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtentDefinition> getExtent() {
		return getGroup().list(MODSPackage.eINSTANCE.getPartDefinition_Extent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateBaseDefinition> getDate() {
		return getGroup().list(MODSPackage.eINSTANCE.getPartDefinition_Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnstructuredTextDefinition> getText() {
		return getGroup().list(MODSPackage.eINSTANCE.getPartDefinition_Text());
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.PART_DEFINITION__ALT_REP_GROUP,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.PART_DEFINITION__DISPLAY_LABEL,
					oldDisplayLabel, displayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.PART_DEFINITION__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.PART_DEFINITION__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.PART_DEFINITION__LANG1, oldLang1, lang1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(BigInteger newOrder) {
		BigInteger oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.PART_DEFINITION__ORDER, oldOrder, order));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.PART_DEFINITION__SCRIPT, oldScript, script));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.PART_DEFINITION__TRANSLITERATION,
					oldTransliteration, transliteration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.PART_DEFINITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MODSPackage.PART_DEFINITION__GROUP:
				return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
			case MODSPackage.PART_DEFINITION__DETAIL:
				return ((InternalEList<?>) getDetail()).basicRemove(otherEnd, msgs);
			case MODSPackage.PART_DEFINITION__EXTENT:
				return ((InternalEList<?>) getExtent()).basicRemove(otherEnd, msgs);
			case MODSPackage.PART_DEFINITION__DATE:
				return ((InternalEList<?>) getDate()).basicRemove(otherEnd, msgs);
			case MODSPackage.PART_DEFINITION__TEXT:
				return ((InternalEList<?>) getText()).basicRemove(otherEnd, msgs);
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
			case MODSPackage.PART_DEFINITION__GROUP:
				if (coreType)
					return getGroup();
				return ((FeatureMap.Internal) getGroup()).getWrapper();
			case MODSPackage.PART_DEFINITION__DETAIL:
				return getDetail();
			case MODSPackage.PART_DEFINITION__EXTENT:
				return getExtent();
			case MODSPackage.PART_DEFINITION__DATE:
				return getDate();
			case MODSPackage.PART_DEFINITION__TEXT:
				return getText();
			case MODSPackage.PART_DEFINITION__ALT_REP_GROUP:
				return getAltRepGroup();
			case MODSPackage.PART_DEFINITION__DISPLAY_LABEL:
				return getDisplayLabel();
			case MODSPackage.PART_DEFINITION__ID:
				return getID();
			case MODSPackage.PART_DEFINITION__LANG:
				return getLang();
			case MODSPackage.PART_DEFINITION__LANG1:
				return getLang1();
			case MODSPackage.PART_DEFINITION__ORDER:
				return getOrder();
			case MODSPackage.PART_DEFINITION__SCRIPT:
				return getScript();
			case MODSPackage.PART_DEFINITION__TRANSLITERATION:
				return getTransliteration();
			case MODSPackage.PART_DEFINITION__TYPE:
				return getType();
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
			case MODSPackage.PART_DEFINITION__GROUP:
				((FeatureMap.Internal) getGroup()).set(newValue);
				return;
			case MODSPackage.PART_DEFINITION__DETAIL:
				getDetail().clear();
				getDetail().addAll((Collection<? extends DetailDefinition>) newValue);
				return;
			case MODSPackage.PART_DEFINITION__EXTENT:
				getExtent().clear();
				getExtent().addAll((Collection<? extends ExtentDefinition>) newValue);
				return;
			case MODSPackage.PART_DEFINITION__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends DateBaseDefinition>) newValue);
				return;
			case MODSPackage.PART_DEFINITION__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends UnstructuredTextDefinition>) newValue);
				return;
			case MODSPackage.PART_DEFINITION__ALT_REP_GROUP:
				setAltRepGroup((String) newValue);
				return;
			case MODSPackage.PART_DEFINITION__DISPLAY_LABEL:
				setDisplayLabel((String) newValue);
				return;
			case MODSPackage.PART_DEFINITION__ID:
				setID((String) newValue);
				return;
			case MODSPackage.PART_DEFINITION__LANG:
				setLang((String) newValue);
				return;
			case MODSPackage.PART_DEFINITION__LANG1:
				setLang1((String) newValue);
				return;
			case MODSPackage.PART_DEFINITION__ORDER:
				setOrder((BigInteger) newValue);
				return;
			case MODSPackage.PART_DEFINITION__SCRIPT:
				setScript((String) newValue);
				return;
			case MODSPackage.PART_DEFINITION__TRANSLITERATION:
				setTransliteration((String) newValue);
				return;
			case MODSPackage.PART_DEFINITION__TYPE:
				setType((String) newValue);
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
			case MODSPackage.PART_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case MODSPackage.PART_DEFINITION__DETAIL:
				getDetail().clear();
				return;
			case MODSPackage.PART_DEFINITION__EXTENT:
				getExtent().clear();
				return;
			case MODSPackage.PART_DEFINITION__DATE:
				getDate().clear();
				return;
			case MODSPackage.PART_DEFINITION__TEXT:
				getText().clear();
				return;
			case MODSPackage.PART_DEFINITION__ALT_REP_GROUP:
				setAltRepGroup(ALT_REP_GROUP_EDEFAULT);
				return;
			case MODSPackage.PART_DEFINITION__DISPLAY_LABEL:
				setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
				return;
			case MODSPackage.PART_DEFINITION__ID:
				setID(ID_EDEFAULT);
				return;
			case MODSPackage.PART_DEFINITION__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case MODSPackage.PART_DEFINITION__LANG1:
				setLang1(LANG1_EDEFAULT);
				return;
			case MODSPackage.PART_DEFINITION__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case MODSPackage.PART_DEFINITION__SCRIPT:
				setScript(SCRIPT_EDEFAULT);
				return;
			case MODSPackage.PART_DEFINITION__TRANSLITERATION:
				setTransliteration(TRANSLITERATION_EDEFAULT);
				return;
			case MODSPackage.PART_DEFINITION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case MODSPackage.PART_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case MODSPackage.PART_DEFINITION__DETAIL:
				return !getDetail().isEmpty();
			case MODSPackage.PART_DEFINITION__EXTENT:
				return !getExtent().isEmpty();
			case MODSPackage.PART_DEFINITION__DATE:
				return !getDate().isEmpty();
			case MODSPackage.PART_DEFINITION__TEXT:
				return !getText().isEmpty();
			case MODSPackage.PART_DEFINITION__ALT_REP_GROUP:
				return ALT_REP_GROUP_EDEFAULT == null ? altRepGroup != null : !ALT_REP_GROUP_EDEFAULT.equals(altRepGroup);
			case MODSPackage.PART_DEFINITION__DISPLAY_LABEL:
				return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
			case MODSPackage.PART_DEFINITION__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MODSPackage.PART_DEFINITION__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case MODSPackage.PART_DEFINITION__LANG1:
				return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
			case MODSPackage.PART_DEFINITION__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
			case MODSPackage.PART_DEFINITION__SCRIPT:
				return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
			case MODSPackage.PART_DEFINITION__TRANSLITERATION:
				return TRANSLITERATION_EDEFAULT == null ? transliteration != null : !TRANSLITERATION_EDEFAULT
						.equals(transliteration);
			case MODSPackage.PART_DEFINITION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(", iD: ");
		result.append(iD);
		result.append(", lang: ");
		result.append(lang);
		result.append(", lang1: ");
		result.append(lang1);
		result.append(", order: ");
		result.append(order);
		result.append(", script: ");
		result.append(script);
		result.append(", transliteration: ");
		result.append(transliteration);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PartDefinitionImpl
