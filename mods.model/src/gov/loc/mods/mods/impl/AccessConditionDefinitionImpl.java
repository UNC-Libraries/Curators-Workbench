/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.AccessConditionDefinition;
import gov.loc.mods.mods.MODSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Condition Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.AccessConditionDefinitionImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.AccessConditionDefinitionImpl#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.AccessConditionDefinitionImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.AccessConditionDefinitionImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.AccessConditionDefinitionImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.AccessConditionDefinitionImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.AccessConditionDefinitionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.AccessConditionDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.AccessConditionDefinitionImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.AccessConditionDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.AccessConditionDefinitionImpl#getTransliteration <em>Transliteration</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.AccessConditionDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.AccessConditionDefinitionImpl#getType1 <em>Type1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessConditionDefinitionImpl extends ExtensionDefinitionImpl implements AccessConditionDefinition {
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
     * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected static final String TITLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected String title = TITLE_EDEFAULT;

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
     * The default value of the '{@link #getType1() <em>Type1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType1()
     * @generated
     * @ordered
     */
    protected static final String TYPE1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType1() <em>Type1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType1()
     * @generated
     * @ordered
     */
    protected String type1 = TYPE1_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AccessConditionDefinitionImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return MODSPackage.eINSTANCE.getAccessConditionDefinition();
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ACCESS_CONDITION_DEFINITION__ACTUATE,
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
	    eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.ACCESS_CONDITION_DEFINITION__ACTUATE,
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
			    MODSPackage.ACCESS_CONDITION_DEFINITION__ALT_REP_GROUP, oldAltRepGroup, altRepGroup));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ACCESS_CONDITION_DEFINITION__ARCROLE,
			    oldArcrole, arcrole));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ACCESS_CONDITION_DEFINITION__HREF,
			    oldHref, href));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ACCESS_CONDITION_DEFINITION__LANG,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ACCESS_CONDITION_DEFINITION__LANG1,
			    oldLang1, lang1));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ACCESS_CONDITION_DEFINITION__ROLE,
			    oldRole, role));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ACCESS_CONDITION_DEFINITION__SCRIPT,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ACCESS_CONDITION_DEFINITION__SHOW,
			    oldShow, show, !oldShowESet));
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
	    eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.ACCESS_CONDITION_DEFINITION__SHOW,
			    oldShow, SHOW_EDEFAULT, oldShowESet));
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
    public String getTitle() {
	return title;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTitle(String newTitle) {
	String oldTitle = title;
	title = newTitle;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ACCESS_CONDITION_DEFINITION__TITLE,
			    oldTitle, title));
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
			    MODSPackage.ACCESS_CONDITION_DEFINITION__TRANSLITERATION, oldTransliteration,
			    transliteration));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ACCESS_CONDITION_DEFINITION__TYPE,
			    oldType, type, !oldTypeESet));
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
	    eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.ACCESS_CONDITION_DEFINITION__TYPE,
			    oldType, TYPE_EDEFAULT, oldTypeESet));
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
    public String getType1() {
	return type1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType1(String newType1) {
	String oldType1 = type1;
	type1 = newType1;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.ACCESS_CONDITION_DEFINITION__TYPE1,
			    oldType1, type1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ACTUATE:
	    return getActuate();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ALT_REP_GROUP:
	    return getAltRepGroup();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ARCROLE:
	    return getArcrole();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__HREF:
	    return getHref();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__LANG:
	    return getLang();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__LANG1:
	    return getLang1();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ROLE:
	    return getRole();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__SCRIPT:
	    return getScript();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__SHOW:
	    return getShow();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TITLE:
	    return getTitle();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TRANSLITERATION:
	    return getTransliteration();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TYPE:
	    return getType();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TYPE1:
	    return getType1();
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
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ACTUATE:
	    setActuate((ActuateType) newValue);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ALT_REP_GROUP:
	    setAltRepGroup((String) newValue);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ARCROLE:
	    setArcrole((String) newValue);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__HREF:
	    setHref((String) newValue);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__LANG:
	    setLang((String) newValue);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__LANG1:
	    setLang1((String) newValue);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ROLE:
	    setRole((String) newValue);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__SCRIPT:
	    setScript((String) newValue);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__SHOW:
	    setShow((ShowType) newValue);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TITLE:
	    setTitle((String) newValue);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TRANSLITERATION:
	    setTransliteration((String) newValue);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TYPE:
	    setType((String) newValue);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TYPE1:
	    setType1((String) newValue);
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
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ACTUATE:
	    unsetActuate();
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ALT_REP_GROUP:
	    setAltRepGroup(ALT_REP_GROUP_EDEFAULT);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ARCROLE:
	    setArcrole(ARCROLE_EDEFAULT);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__HREF:
	    setHref(HREF_EDEFAULT);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__LANG:
	    setLang(LANG_EDEFAULT);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__LANG1:
	    setLang1(LANG1_EDEFAULT);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ROLE:
	    setRole(ROLE_EDEFAULT);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__SCRIPT:
	    setScript(SCRIPT_EDEFAULT);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__SHOW:
	    unsetShow();
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TITLE:
	    setTitle(TITLE_EDEFAULT);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TRANSLITERATION:
	    setTransliteration(TRANSLITERATION_EDEFAULT);
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TYPE:
	    unsetType();
	    return;
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TYPE1:
	    setType1(TYPE1_EDEFAULT);
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
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ACTUATE:
	    return isSetActuate();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ALT_REP_GROUP:
	    return ALT_REP_GROUP_EDEFAULT == null ? altRepGroup != null : !ALT_REP_GROUP_EDEFAULT.equals(altRepGroup);
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ARCROLE:
	    return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
	case MODSPackage.ACCESS_CONDITION_DEFINITION__HREF:
	    return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
	case MODSPackage.ACCESS_CONDITION_DEFINITION__LANG:
	    return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
	case MODSPackage.ACCESS_CONDITION_DEFINITION__LANG1:
	    return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
	case MODSPackage.ACCESS_CONDITION_DEFINITION__ROLE:
	    return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
	case MODSPackage.ACCESS_CONDITION_DEFINITION__SCRIPT:
	    return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
	case MODSPackage.ACCESS_CONDITION_DEFINITION__SHOW:
	    return isSetShow();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TITLE:
	    return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TRANSLITERATION:
	    return TRANSLITERATION_EDEFAULT == null ? transliteration != null : !TRANSLITERATION_EDEFAULT
			    .equals(transliteration);
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TYPE:
	    return isSetType();
	case MODSPackage.ACCESS_CONDITION_DEFINITION__TYPE1:
	    return TYPE1_EDEFAULT == null ? type1 != null : !TYPE1_EDEFAULT.equals(type1);
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
	result.append(" (actuate: ");
	if (actuateESet)
	    result.append(actuate);
	else
	    result.append("<unset>");
	result.append(", altRepGroup: ");
	result.append(altRepGroup);
	result.append(", arcrole: ");
	result.append(arcrole);
	result.append(", href: ");
	result.append(href);
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
	result.append(", title: ");
	result.append(title);
	result.append(", transliteration: ");
	result.append(transliteration);
	result.append(", type: ");
	if (typeESet)
	    result.append(type);
	else
	    result.append("<unset>");
	result.append(", type1: ");
	result.append(type1);
	result.append(')');
	return result.toString();
    }

} //AccessConditionDefinitionImpl
