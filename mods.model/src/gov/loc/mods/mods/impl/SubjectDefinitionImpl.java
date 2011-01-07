/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods.impl;

import gov.loc.mods.mods.CartographicsDefinition;
import gov.loc.mods.mods.GenreDefinition;
import gov.loc.mods.mods.GeographicCodeDefinition;
import gov.loc.mods.mods.HierarchicalGeographicDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.StringPlusAuthority;
import gov.loc.mods.mods.SubjectDefinition;
import gov.loc.mods.mods.SubjectNameDefinition;
import gov.loc.mods.mods.SubjectTitleInfoDefinition;
import gov.loc.mods.mods.TemporalDefinition;
import gov.loc.mods.mods.UsageAttributeDefinition;

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
 * An implementation of the model object '<em><b>Subject Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getGeographic <em>Geographic</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getTitleInfo <em>Title Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getGeographicCode <em>Geographic Code</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getHierarchicalGeographic <em>Hierarchical Geographic</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getCartographics <em>Cartographics</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getOccupation <em>Occupation</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getGenre <em>Genre</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getAltRepGroup <em>Alt Rep Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getAuthorityURI <em>Authority URI</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getTransliteration <em>Transliteration</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.SubjectDefinitionImpl#getValueURI <em>Value URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjectDefinitionImpl extends EObjectImpl implements SubjectDefinition {
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
    protected SubjectDefinitionImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return MODSPackage.eINSTANCE.getSubjectDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
	if (group == null) {
	    group = new BasicFeatureMap(this, MODSPackage.SUBJECT_DEFINITION__GROUP);
	}
	return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StringPlusAuthority> getTopic() {
	return getGroup().list(MODSPackage.eINSTANCE.getSubjectDefinition_Topic());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StringPlusAuthority> getGeographic() {
	return getGroup().list(MODSPackage.eINSTANCE.getSubjectDefinition_Geographic());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TemporalDefinition> getTemporal() {
	return getGroup().list(MODSPackage.eINSTANCE.getSubjectDefinition_Temporal());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SubjectTitleInfoDefinition> getTitleInfo() {
	return getGroup().list(MODSPackage.eINSTANCE.getSubjectDefinition_TitleInfo());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SubjectNameDefinition> getName() {
	return getGroup().list(MODSPackage.eINSTANCE.getSubjectDefinition_Name());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GeographicCodeDefinition> getGeographicCode() {
	return getGroup().list(MODSPackage.eINSTANCE.getSubjectDefinition_GeographicCode());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<HierarchicalGeographicDefinition> getHierarchicalGeographic() {
	return getGroup().list(MODSPackage.eINSTANCE.getSubjectDefinition_HierarchicalGeographic());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CartographicsDefinition> getCartographics() {
	return getGroup().list(MODSPackage.eINSTANCE.getSubjectDefinition_Cartographics());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StringPlusAuthority> getOccupation() {
	return getGroup().list(MODSPackage.eINSTANCE.getSubjectDefinition_Occupation());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GenreDefinition> getGenre() {
	return getGroup().list(MODSPackage.eINSTANCE.getSubjectDefinition_Genre());
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__ACTUATE, oldActuate,
			    actuate, !oldActuateESet));
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
	    eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.SUBJECT_DEFINITION__ACTUATE,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__ALT_REP_GROUP,
			    oldAltRepGroup, altRepGroup));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__ARCROLE, oldArcrole,
			    arcrole));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__AUTHORITY,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__AUTHORITY_URI,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__DISPLAY_LABEL,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__HREF, oldHref, href));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__ID, oldID, iD));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__LANG, oldLang, lang));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__LANG1, oldLang1,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__ROLE, oldRole, role));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__SCRIPT, oldScript,
			    script));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__SHOW, oldShow, show,
			    !oldShowESet));
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
	    eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.SUBJECT_DEFINITION__SHOW, oldShow,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__TITLE, oldTitle,
			    title));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__TRANSLITERATION,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__TYPE, oldType, type,
			    !oldTypeESet));
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
	    eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.SUBJECT_DEFINITION__TYPE, oldType,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__USAGE, oldUsage,
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
	    eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.SUBJECT_DEFINITION__USAGE, oldUsage,
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
	    eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.SUBJECT_DEFINITION__VALUE_URI,
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
	case MODSPackage.SUBJECT_DEFINITION__GROUP:
	    return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
	case MODSPackage.SUBJECT_DEFINITION__TOPIC:
	    return ((InternalEList<?>) getTopic()).basicRemove(otherEnd, msgs);
	case MODSPackage.SUBJECT_DEFINITION__GEOGRAPHIC:
	    return ((InternalEList<?>) getGeographic()).basicRemove(otherEnd, msgs);
	case MODSPackage.SUBJECT_DEFINITION__TEMPORAL:
	    return ((InternalEList<?>) getTemporal()).basicRemove(otherEnd, msgs);
	case MODSPackage.SUBJECT_DEFINITION__TITLE_INFO:
	    return ((InternalEList<?>) getTitleInfo()).basicRemove(otherEnd, msgs);
	case MODSPackage.SUBJECT_DEFINITION__NAME:
	    return ((InternalEList<?>) getName()).basicRemove(otherEnd, msgs);
	case MODSPackage.SUBJECT_DEFINITION__GEOGRAPHIC_CODE:
	    return ((InternalEList<?>) getGeographicCode()).basicRemove(otherEnd, msgs);
	case MODSPackage.SUBJECT_DEFINITION__HIERARCHICAL_GEOGRAPHIC:
	    return ((InternalEList<?>) getHierarchicalGeographic()).basicRemove(otherEnd, msgs);
	case MODSPackage.SUBJECT_DEFINITION__CARTOGRAPHICS:
	    return ((InternalEList<?>) getCartographics()).basicRemove(otherEnd, msgs);
	case MODSPackage.SUBJECT_DEFINITION__OCCUPATION:
	    return ((InternalEList<?>) getOccupation()).basicRemove(otherEnd, msgs);
	case MODSPackage.SUBJECT_DEFINITION__GENRE:
	    return ((InternalEList<?>) getGenre()).basicRemove(otherEnd, msgs);
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
	case MODSPackage.SUBJECT_DEFINITION__GROUP:
	    if (coreType)
		return getGroup();
	    return ((FeatureMap.Internal) getGroup()).getWrapper();
	case MODSPackage.SUBJECT_DEFINITION__TOPIC:
	    return getTopic();
	case MODSPackage.SUBJECT_DEFINITION__GEOGRAPHIC:
	    return getGeographic();
	case MODSPackage.SUBJECT_DEFINITION__TEMPORAL:
	    return getTemporal();
	case MODSPackage.SUBJECT_DEFINITION__TITLE_INFO:
	    return getTitleInfo();
	case MODSPackage.SUBJECT_DEFINITION__NAME:
	    return getName();
	case MODSPackage.SUBJECT_DEFINITION__GEOGRAPHIC_CODE:
	    return getGeographicCode();
	case MODSPackage.SUBJECT_DEFINITION__HIERARCHICAL_GEOGRAPHIC:
	    return getHierarchicalGeographic();
	case MODSPackage.SUBJECT_DEFINITION__CARTOGRAPHICS:
	    return getCartographics();
	case MODSPackage.SUBJECT_DEFINITION__OCCUPATION:
	    return getOccupation();
	case MODSPackage.SUBJECT_DEFINITION__GENRE:
	    return getGenre();
	case MODSPackage.SUBJECT_DEFINITION__ACTUATE:
	    return getActuate();
	case MODSPackage.SUBJECT_DEFINITION__ALT_REP_GROUP:
	    return getAltRepGroup();
	case MODSPackage.SUBJECT_DEFINITION__ARCROLE:
	    return getArcrole();
	case MODSPackage.SUBJECT_DEFINITION__AUTHORITY:
	    return getAuthority();
	case MODSPackage.SUBJECT_DEFINITION__AUTHORITY_URI:
	    return getAuthorityURI();
	case MODSPackage.SUBJECT_DEFINITION__DISPLAY_LABEL:
	    return getDisplayLabel();
	case MODSPackage.SUBJECT_DEFINITION__HREF:
	    return getHref();
	case MODSPackage.SUBJECT_DEFINITION__ID:
	    return getID();
	case MODSPackage.SUBJECT_DEFINITION__LANG:
	    return getLang();
	case MODSPackage.SUBJECT_DEFINITION__LANG1:
	    return getLang1();
	case MODSPackage.SUBJECT_DEFINITION__ROLE:
	    return getRole();
	case MODSPackage.SUBJECT_DEFINITION__SCRIPT:
	    return getScript();
	case MODSPackage.SUBJECT_DEFINITION__SHOW:
	    return getShow();
	case MODSPackage.SUBJECT_DEFINITION__TITLE:
	    return getTitle();
	case MODSPackage.SUBJECT_DEFINITION__TRANSLITERATION:
	    return getTransliteration();
	case MODSPackage.SUBJECT_DEFINITION__TYPE:
	    return getType();
	case MODSPackage.SUBJECT_DEFINITION__USAGE:
	    return getUsage();
	case MODSPackage.SUBJECT_DEFINITION__VALUE_URI:
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
	case MODSPackage.SUBJECT_DEFINITION__GROUP:
	    ((FeatureMap.Internal) getGroup()).set(newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__TOPIC:
	    getTopic().clear();
	    getTopic().addAll((Collection<? extends StringPlusAuthority>) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__GEOGRAPHIC:
	    getGeographic().clear();
	    getGeographic().addAll((Collection<? extends StringPlusAuthority>) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__TEMPORAL:
	    getTemporal().clear();
	    getTemporal().addAll((Collection<? extends TemporalDefinition>) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__TITLE_INFO:
	    getTitleInfo().clear();
	    getTitleInfo().addAll((Collection<? extends SubjectTitleInfoDefinition>) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__NAME:
	    getName().clear();
	    getName().addAll((Collection<? extends SubjectNameDefinition>) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__GEOGRAPHIC_CODE:
	    getGeographicCode().clear();
	    getGeographicCode().addAll((Collection<? extends GeographicCodeDefinition>) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__HIERARCHICAL_GEOGRAPHIC:
	    getHierarchicalGeographic().clear();
	    getHierarchicalGeographic().addAll((Collection<? extends HierarchicalGeographicDefinition>) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__CARTOGRAPHICS:
	    getCartographics().clear();
	    getCartographics().addAll((Collection<? extends CartographicsDefinition>) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__OCCUPATION:
	    getOccupation().clear();
	    getOccupation().addAll((Collection<? extends StringPlusAuthority>) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__GENRE:
	    getGenre().clear();
	    getGenre().addAll((Collection<? extends GenreDefinition>) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__ACTUATE:
	    setActuate((ActuateType) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__ALT_REP_GROUP:
	    setAltRepGroup((String) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__ARCROLE:
	    setArcrole((String) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__AUTHORITY:
	    setAuthority((String) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__AUTHORITY_URI:
	    setAuthorityURI((String) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__DISPLAY_LABEL:
	    setDisplayLabel((String) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__HREF:
	    setHref((String) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__ID:
	    setID((String) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__LANG:
	    setLang((String) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__LANG1:
	    setLang1((String) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__ROLE:
	    setRole((String) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__SCRIPT:
	    setScript((String) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__SHOW:
	    setShow((ShowType) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__TITLE:
	    setTitle((String) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__TRANSLITERATION:
	    setTransliteration((String) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__TYPE:
	    setType((String) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__USAGE:
	    setUsage((UsageAttributeDefinition) newValue);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__VALUE_URI:
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
	case MODSPackage.SUBJECT_DEFINITION__GROUP:
	    getGroup().clear();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__TOPIC:
	    getTopic().clear();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__GEOGRAPHIC:
	    getGeographic().clear();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__TEMPORAL:
	    getTemporal().clear();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__TITLE_INFO:
	    getTitleInfo().clear();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__NAME:
	    getName().clear();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__GEOGRAPHIC_CODE:
	    getGeographicCode().clear();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__HIERARCHICAL_GEOGRAPHIC:
	    getHierarchicalGeographic().clear();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__CARTOGRAPHICS:
	    getCartographics().clear();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__OCCUPATION:
	    getOccupation().clear();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__GENRE:
	    getGenre().clear();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__ACTUATE:
	    unsetActuate();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__ALT_REP_GROUP:
	    setAltRepGroup(ALT_REP_GROUP_EDEFAULT);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__ARCROLE:
	    setArcrole(ARCROLE_EDEFAULT);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__AUTHORITY:
	    setAuthority(AUTHORITY_EDEFAULT);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__AUTHORITY_URI:
	    setAuthorityURI(AUTHORITY_URI_EDEFAULT);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__DISPLAY_LABEL:
	    setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__HREF:
	    setHref(HREF_EDEFAULT);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__ID:
	    setID(ID_EDEFAULT);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__LANG:
	    setLang(LANG_EDEFAULT);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__LANG1:
	    setLang1(LANG1_EDEFAULT);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__ROLE:
	    setRole(ROLE_EDEFAULT);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__SCRIPT:
	    setScript(SCRIPT_EDEFAULT);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__SHOW:
	    unsetShow();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__TITLE:
	    setTitle(TITLE_EDEFAULT);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__TRANSLITERATION:
	    setTransliteration(TRANSLITERATION_EDEFAULT);
	    return;
	case MODSPackage.SUBJECT_DEFINITION__TYPE:
	    unsetType();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__USAGE:
	    unsetUsage();
	    return;
	case MODSPackage.SUBJECT_DEFINITION__VALUE_URI:
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
	case MODSPackage.SUBJECT_DEFINITION__GROUP:
	    return group != null && !group.isEmpty();
	case MODSPackage.SUBJECT_DEFINITION__TOPIC:
	    return !getTopic().isEmpty();
	case MODSPackage.SUBJECT_DEFINITION__GEOGRAPHIC:
	    return !getGeographic().isEmpty();
	case MODSPackage.SUBJECT_DEFINITION__TEMPORAL:
	    return !getTemporal().isEmpty();
	case MODSPackage.SUBJECT_DEFINITION__TITLE_INFO:
	    return !getTitleInfo().isEmpty();
	case MODSPackage.SUBJECT_DEFINITION__NAME:
	    return !getName().isEmpty();
	case MODSPackage.SUBJECT_DEFINITION__GEOGRAPHIC_CODE:
	    return !getGeographicCode().isEmpty();
	case MODSPackage.SUBJECT_DEFINITION__HIERARCHICAL_GEOGRAPHIC:
	    return !getHierarchicalGeographic().isEmpty();
	case MODSPackage.SUBJECT_DEFINITION__CARTOGRAPHICS:
	    return !getCartographics().isEmpty();
	case MODSPackage.SUBJECT_DEFINITION__OCCUPATION:
	    return !getOccupation().isEmpty();
	case MODSPackage.SUBJECT_DEFINITION__GENRE:
	    return !getGenre().isEmpty();
	case MODSPackage.SUBJECT_DEFINITION__ACTUATE:
	    return isSetActuate();
	case MODSPackage.SUBJECT_DEFINITION__ALT_REP_GROUP:
	    return ALT_REP_GROUP_EDEFAULT == null ? altRepGroup != null : !ALT_REP_GROUP_EDEFAULT.equals(altRepGroup);
	case MODSPackage.SUBJECT_DEFINITION__ARCROLE:
	    return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
	case MODSPackage.SUBJECT_DEFINITION__AUTHORITY:
	    return AUTHORITY_EDEFAULT == null ? authority != null : !AUTHORITY_EDEFAULT.equals(authority);
	case MODSPackage.SUBJECT_DEFINITION__AUTHORITY_URI:
	    return AUTHORITY_URI_EDEFAULT == null ? authorityURI != null : !AUTHORITY_URI_EDEFAULT.equals(authorityURI);
	case MODSPackage.SUBJECT_DEFINITION__DISPLAY_LABEL:
	    return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
	case MODSPackage.SUBJECT_DEFINITION__HREF:
	    return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
	case MODSPackage.SUBJECT_DEFINITION__ID:
	    return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
	case MODSPackage.SUBJECT_DEFINITION__LANG:
	    return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
	case MODSPackage.SUBJECT_DEFINITION__LANG1:
	    return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
	case MODSPackage.SUBJECT_DEFINITION__ROLE:
	    return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
	case MODSPackage.SUBJECT_DEFINITION__SCRIPT:
	    return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
	case MODSPackage.SUBJECT_DEFINITION__SHOW:
	    return isSetShow();
	case MODSPackage.SUBJECT_DEFINITION__TITLE:
	    return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
	case MODSPackage.SUBJECT_DEFINITION__TRANSLITERATION:
	    return TRANSLITERATION_EDEFAULT == null ? transliteration != null : !TRANSLITERATION_EDEFAULT
			    .equals(transliteration);
	case MODSPackage.SUBJECT_DEFINITION__TYPE:
	    return isSetType();
	case MODSPackage.SUBJECT_DEFINITION__USAGE:
	    return isSetUsage();
	case MODSPackage.SUBJECT_DEFINITION__VALUE_URI:
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
	result.append(", altRepGroup: ");
	result.append(altRepGroup);
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
	result.append(", title: ");
	result.append(title);
	result.append(", transliteration: ");
	result.append(transliteration);
	result.append(", type: ");
	if (typeESet)
	    result.append(type);
	else
	    result.append("<unset>");
	result.append(", usage: ");
	if (usageESet)
	    result.append(usage);
	else
	    result.append("<unset>");
	result.append(", valueURI: ");
	result.append(valueURI);
	result.append(')');
	return result.toString();
    }

} //SubjectDefinitionImpl
