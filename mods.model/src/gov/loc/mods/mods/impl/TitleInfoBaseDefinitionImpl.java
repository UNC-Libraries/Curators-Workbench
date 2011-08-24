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

import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.TitleInfoBaseDefinition;
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

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Title Info Base Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getSubTitle <em>Sub Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getPartName <em>Part Name</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getNonSort <em>Non Sort</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getAuthorityURI <em>Authority URI</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getTransliteration <em>Transliteration</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.TitleInfoBaseDefinitionImpl#getValueURI <em>Value URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TitleInfoBaseDefinitionImpl extends EObjectImpl implements TitleInfoBaseDefinition {
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
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType ACTUATE_EDEFAULT = ActuateType.ON_LOAD;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

	/**
	 * The default value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcrole()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcrole()
	 * @generated
	 * @ordered
	 */
	protected String arcrole = ARCROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthority() <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected String authority = AUTHORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorityURI() <em>Authority URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityURI()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORITY_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorityURI() <em>Authority URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityURI()
	 * @generated
	 * @ordered
	 */
	protected String authorityURI = AUTHORITY_URI_EDEFAULT;

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
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

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
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

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
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final ShowType SHOW_EDEFAULT = ShowType.NEW;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected ShowType show = SHOW_EDEFAULT;

	/**
	 * This is true if the Show attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showESet;

	/**
	 * The default value of the '{@link #getTitle1() <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle1()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle1() <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle1()
	 * @generated
	 * @ordered
	 */
	protected String title1 = TITLE1_EDEFAULT;

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
	protected static final String TYPE_EDEFAULT = "simple";

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
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getValueURI() <em>Value URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueURI()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueURI() <em>Value URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueURI()
	 * @generated
	 * @ordered
	 */
	protected String valueURI = VALUE_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TitleInfoBaseDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getTitleInfoBaseDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, MODSPackage.TITLE_INFO_BASE_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsString> getTitle() {
		return getGroup().list(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsString> getSubTitle() {
		return getGroup().list(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_SubTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsString> getPartNumber() {
		return getGroup().list(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsString> getPartName() {
		return getGroup().list(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_PartName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XsString> getNonSort() {
		return getGroup().list(MODSPackage.eINSTANCE.getTitleInfoBaseDefinition_NonSort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateType getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuate(ActuateType newActuate) {
		ActuateType oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__ACTUATE,
					oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActuate() {
		ActuateType oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.TITLE_INFO_BASE_DEFINITION__ACTUATE,
					oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActuate() {
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArcrole() {
		return arcrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArcrole(String newArcrole) {
		String oldArcrole = arcrole;
		arcrole = newArcrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__ARCROLE,
					oldArcrole, arcrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthority() {
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthority(String newAuthority) {
		String oldAuthority = authority;
		authority = newAuthority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__AUTHORITY,
					oldAuthority, authority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorityURI() {
		return authorityURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorityURI(String newAuthorityURI) {
		String oldAuthorityURI = authorityURI;
		authorityURI = newAuthorityURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__AUTHORITY_URI,
					oldAuthorityURI, authorityURI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__DISPLAY_LABEL,
					oldDisplayLabel, displayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__HREF, oldHref,
					href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__LANG, oldLang,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__LANG1, oldLang1,
					lang1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__ROLE, oldRole,
					role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__SCRIPT,
					oldScript, script));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(ShowType newShow) {
		ShowType oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__SHOW, oldShow,
					show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShow() {
		ShowType oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.TITLE_INFO_BASE_DEFINITION__SHOW, oldShow,
					SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShow() {
		return showESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle1() {
		return title1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle1(String newTitle1) {
		String oldTitle1 = title1;
		title1 = newTitle1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__TITLE1,
					oldTitle1, title1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__TRANSLITERATION,
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
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__TYPE, oldType,
					type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		String oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.TITLE_INFO_BASE_DEFINITION__TYPE, oldType,
					TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueURI() {
		return valueURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueURI(String newValueURI) {
		String oldValueURI = valueURI;
		valueURI = newValueURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.TITLE_INFO_BASE_DEFINITION__VALUE_URI,
					oldValueURI, valueURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__GROUP:
				return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TITLE:
				return ((InternalEList<?>) getTitle()).basicRemove(otherEnd, msgs);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__SUB_TITLE:
				return ((InternalEList<?>) getSubTitle()).basicRemove(otherEnd, msgs);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__PART_NUMBER:
				return ((InternalEList<?>) getPartNumber()).basicRemove(otherEnd, msgs);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__PART_NAME:
				return ((InternalEList<?>) getPartName()).basicRemove(otherEnd, msgs);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__NON_SORT:
				return ((InternalEList<?>) getNonSort()).basicRemove(otherEnd, msgs);
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
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__GROUP:
				if (coreType)
					return getGroup();
				return ((FeatureMap.Internal) getGroup()).getWrapper();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TITLE:
				return getTitle();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__SUB_TITLE:
				return getSubTitle();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__PART_NUMBER:
				return getPartNumber();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__PART_NAME:
				return getPartName();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__NON_SORT:
				return getNonSort();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ACTUATE:
				return getActuate();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ARCROLE:
				return getArcrole();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__AUTHORITY:
				return getAuthority();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__AUTHORITY_URI:
				return getAuthorityURI();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__DISPLAY_LABEL:
				return getDisplayLabel();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__HREF:
				return getHref();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ID:
				return getID();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__LANG:
				return getLang();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__LANG1:
				return getLang1();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ROLE:
				return getRole();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__SCRIPT:
				return getScript();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__SHOW:
				return getShow();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TITLE1:
				return getTitle1();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TRANSLITERATION:
				return getTransliteration();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TYPE:
				return getType();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__VALUE_URI:
				return getValueURI();
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
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__GROUP:
				((FeatureMap.Internal) getGroup()).set(newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends XsString>) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__SUB_TITLE:
				getSubTitle().clear();
				getSubTitle().addAll((Collection<? extends XsString>) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__PART_NUMBER:
				getPartNumber().clear();
				getPartNumber().addAll((Collection<? extends XsString>) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__PART_NAME:
				getPartName().clear();
				getPartName().addAll((Collection<? extends XsString>) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__NON_SORT:
				getNonSort().clear();
				getNonSort().addAll((Collection<? extends XsString>) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ACTUATE:
				setActuate((ActuateType) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ARCROLE:
				setArcrole((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__AUTHORITY:
				setAuthority((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__AUTHORITY_URI:
				setAuthorityURI((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__DISPLAY_LABEL:
				setDisplayLabel((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__HREF:
				setHref((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ID:
				setID((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__LANG:
				setLang((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__LANG1:
				setLang1((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ROLE:
				setRole((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__SCRIPT:
				setScript((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__SHOW:
				setShow((ShowType) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TITLE1:
				setTitle1((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TRANSLITERATION:
				setTransliteration((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TYPE:
				setType((String) newValue);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__VALUE_URI:
				setValueURI((String) newValue);
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
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TITLE:
				getTitle().clear();
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__SUB_TITLE:
				getSubTitle().clear();
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__PART_NUMBER:
				getPartNumber().clear();
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__PART_NAME:
				getPartName().clear();
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__NON_SORT:
				getNonSort().clear();
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ACTUATE:
				unsetActuate();
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__AUTHORITY:
				setAuthority(AUTHORITY_EDEFAULT);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__AUTHORITY_URI:
				setAuthorityURI(AUTHORITY_URI_EDEFAULT);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__DISPLAY_LABEL:
				setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ID:
				setID(ID_EDEFAULT);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__LANG1:
				setLang1(LANG1_EDEFAULT);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__SCRIPT:
				setScript(SCRIPT_EDEFAULT);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__SHOW:
				unsetShow();
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TITLE1:
				setTitle1(TITLE1_EDEFAULT);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TRANSLITERATION:
				setTransliteration(TRANSLITERATION_EDEFAULT);
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TYPE:
				unsetType();
				return;
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__VALUE_URI:
				setValueURI(VALUE_URI_EDEFAULT);
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
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TITLE:
				return !getTitle().isEmpty();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__SUB_TITLE:
				return !getSubTitle().isEmpty();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__PART_NUMBER:
				return !getPartNumber().isEmpty();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__PART_NAME:
				return !getPartName().isEmpty();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__NON_SORT:
				return !getNonSort().isEmpty();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ACTUATE:
				return isSetActuate();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__AUTHORITY:
				return AUTHORITY_EDEFAULT == null ? authority != null : !AUTHORITY_EDEFAULT.equals(authority);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__AUTHORITY_URI:
				return AUTHORITY_URI_EDEFAULT == null ? authorityURI != null : !AUTHORITY_URI_EDEFAULT.equals(authorityURI);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__DISPLAY_LABEL:
				return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__LANG1:
				return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__SCRIPT:
				return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__SHOW:
				return isSetShow();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TITLE1:
				return TITLE1_EDEFAULT == null ? title1 != null : !TITLE1_EDEFAULT.equals(title1);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TRANSLITERATION:
				return TRANSLITERATION_EDEFAULT == null ? transliteration != null : !TRANSLITERATION_EDEFAULT
						.equals(transliteration);
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__TYPE:
				return isSetType();
			case MODSPackage.TITLE_INFO_BASE_DEFINITION__VALUE_URI:
				return VALUE_URI_EDEFAULT == null ? valueURI != null : !VALUE_URI_EDEFAULT.equals(valueURI);
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
		result.append(", actuate: ");
		if (actuateESet)
			result.append(actuate);
		else
			result.append("<unset>");
		result.append(", arcrole: ");
		result.append(arcrole);
		result.append(", authority: ");
		result.append(authority);
		result.append(", authorityURI: ");
		result.append(authorityURI);
		result.append(", displayLabel: ");
		result.append(displayLabel);
		result.append(", href: ");
		result.append(href);
		result.append(", iD: ");
		result.append(iD);
		result.append(", lang: ");
		result.append(lang);
		result.append(", lang1: ");
		result.append(lang1);
		result.append(", role: ");
		result.append(role);
		result.append(", script: ");
		result.append(script);
		result.append(", show: ");
		if (showESet)
			result.append(show);
		else
			result.append("<unset>");
		result.append(", title1: ");
		result.append(title1);
		result.append(", transliteration: ");
		result.append(transliteration);
		result.append(", type: ");
		if (typeESet)
			result.append(type);
		else
			result.append("<unset>");
		result.append(", valueURI: ");
		result.append(valueURI);
		result.append(')');
		return result.toString();
	}

} //TitleInfoBaseDefinitionImpl
