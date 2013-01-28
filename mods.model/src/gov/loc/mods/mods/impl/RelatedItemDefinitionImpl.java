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

import gov.loc.mods.mods.AbstractDefinition;
import gov.loc.mods.mods.AccessConditionDefinition;
import gov.loc.mods.mods.ClassificationDefinition;
import gov.loc.mods.mods.ExtensionDefinition;
import gov.loc.mods.mods.GenreDefinition;
import gov.loc.mods.mods.IdentifierDefinition;
import gov.loc.mods.mods.LanguageDefinition;
import gov.loc.mods.mods.LocationDefinition;
import gov.loc.mods.mods.MODSPackage;
import gov.loc.mods.mods.NameDefinition;
import gov.loc.mods.mods.NoteDefinition;
import gov.loc.mods.mods.OriginInfoDefinition;
import gov.loc.mods.mods.PartDefinition;
import gov.loc.mods.mods.PhysicalDescriptionDefinition;
import gov.loc.mods.mods.RecordInfoDefinition;
import gov.loc.mods.mods.RelatedItemDefinition;
import gov.loc.mods.mods.RelatedItemTypeAttributeDefinition;
import gov.loc.mods.mods.SubjectDefinition;
import gov.loc.mods.mods.TableOfContentsDefinition;
import gov.loc.mods.mods.TargetAudienceDefinition;
import gov.loc.mods.mods.TitleInfoDefinition;
import gov.loc.mods.mods.TypeOfResourceDefinition;

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
 * An implementation of the model object '<em><b>Related Item Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getModsGroup <em>Mods Group</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getAccessCondition <em>Access Condition</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getGenre <em>Genre</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getOriginInfo <em>Origin Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getPart <em>Part</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getPhysicalDescription <em>Physical Description</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getRecordInfo <em>Record Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getRelatedItem <em>Related Item</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getTableOfContents <em>Table Of Contents</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getTargetAudience <em>Target Audience</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getTitleInfo <em>Title Info</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getTypeOfResource <em>Type Of Resource</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.RelatedItemDefinitionImpl#getType1 <em>Type1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedItemDefinitionImpl extends EObjectImpl implements RelatedItemDefinition {
	/**
	 * The cached value of the '{@link #getModsGroup() <em>Mods Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModsGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap modsGroup;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RelatedItemTypeAttributeDefinition TYPE_EDEFAULT = RelatedItemTypeAttributeDefinition.PRECEDING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RelatedItemTypeAttributeDefinition type = TYPE_EDEFAULT;

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
	protected static final String TYPE1_EDEFAULT = "simple";

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
	 * This is true if the Type1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean type1ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedItemDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getRelatedItemDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getModsGroup() {
		if (modsGroup == null) {
			modsGroup = new BasicFeatureMap(this, MODSPackage.RELATED_ITEM_DEFINITION__MODS_GROUP);
		}
		return modsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDefinition> getAbstract() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_Abstract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccessConditionDefinition> getAccessCondition() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_AccessCondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassificationDefinition> getClassification() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_Classification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionDefinition> getExtension() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_Extension());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenreDefinition> getGenre() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_Genre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentifierDefinition> getIdentifier() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_Identifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguageDefinition> getLanguage() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_Language());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationDefinition> getLocation() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_Location());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameDefinition> getName() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoteDefinition> getNote() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_Note());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OriginInfoDefinition> getOriginInfo() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_OriginInfo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartDefinition> getPart() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_Part());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalDescriptionDefinition> getPhysicalDescription() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_PhysicalDescription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordInfoDefinition> getRecordInfo() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_RecordInfo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedItemDefinition> getRelatedItem() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_RelatedItem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubjectDefinition> getSubject() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_Subject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableOfContentsDefinition> getTableOfContents() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_TableOfContents());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetAudienceDefinition> getTargetAudience() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_TargetAudience());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TitleInfoDefinition> getTitleInfo() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_TitleInfo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeOfResourceDefinition> getTypeOfResource() {
		return getModsGroup().list(MODSPackage.eINSTANCE.getRelatedItemDefinition_TypeOfResource());
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.RELATED_ITEM_DEFINITION__ACTUATE,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.RELATED_ITEM_DEFINITION__ACTUATE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.RELATED_ITEM_DEFINITION__ARCROLE,
					oldArcrole, arcrole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.RELATED_ITEM_DEFINITION__DISPLAY_LABEL,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.RELATED_ITEM_DEFINITION__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.RELATED_ITEM_DEFINITION__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.RELATED_ITEM_DEFINITION__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.RELATED_ITEM_DEFINITION__SHOW, oldShow,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.RELATED_ITEM_DEFINITION__SHOW, oldShow,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.RELATED_ITEM_DEFINITION__TITLE, oldTitle,
					title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedItemTypeAttributeDefinition getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RelatedItemTypeAttributeDefinition newType) {
		RelatedItemTypeAttributeDefinition oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.RELATED_ITEM_DEFINITION__TYPE, oldType,
					type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		RelatedItemTypeAttributeDefinition oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.RELATED_ITEM_DEFINITION__TYPE, oldType,
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
		boolean oldType1ESet = type1ESet;
		type1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MODSPackage.RELATED_ITEM_DEFINITION__TYPE1, oldType1,
					type1, !oldType1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType1() {
		String oldType1 = type1;
		boolean oldType1ESet = type1ESet;
		type1 = TYPE1_EDEFAULT;
		type1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MODSPackage.RELATED_ITEM_DEFINITION__TYPE1, oldType1,
					TYPE1_EDEFAULT, oldType1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType1() {
		return type1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MODSPackage.RELATED_ITEM_DEFINITION__MODS_GROUP:
				return ((InternalEList<?>) getModsGroup()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__ABSTRACT:
				return ((InternalEList<?>) getAbstract()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__ACCESS_CONDITION:
				return ((InternalEList<?>) getAccessCondition()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__CLASSIFICATION:
				return ((InternalEList<?>) getClassification()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__EXTENSION:
				return ((InternalEList<?>) getExtension()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__GENRE:
				return ((InternalEList<?>) getGenre()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>) getIdentifier()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__LANGUAGE:
				return ((InternalEList<?>) getLanguage()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__LOCATION:
				return ((InternalEList<?>) getLocation()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__NAME:
				return ((InternalEList<?>) getName()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__NOTE:
				return ((InternalEList<?>) getNote()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__ORIGIN_INFO:
				return ((InternalEList<?>) getOriginInfo()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__PART:
				return ((InternalEList<?>) getPart()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__PHYSICAL_DESCRIPTION:
				return ((InternalEList<?>) getPhysicalDescription()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__RECORD_INFO:
				return ((InternalEList<?>) getRecordInfo()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__RELATED_ITEM:
				return ((InternalEList<?>) getRelatedItem()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__SUBJECT:
				return ((InternalEList<?>) getSubject()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__TABLE_OF_CONTENTS:
				return ((InternalEList<?>) getTableOfContents()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__TARGET_AUDIENCE:
				return ((InternalEList<?>) getTargetAudience()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__TITLE_INFO:
				return ((InternalEList<?>) getTitleInfo()).basicRemove(otherEnd, msgs);
			case MODSPackage.RELATED_ITEM_DEFINITION__TYPE_OF_RESOURCE:
				return ((InternalEList<?>) getTypeOfResource()).basicRemove(otherEnd, msgs);
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
			case MODSPackage.RELATED_ITEM_DEFINITION__MODS_GROUP:
				if (coreType)
					return getModsGroup();
				return ((FeatureMap.Internal) getModsGroup()).getWrapper();
			case MODSPackage.RELATED_ITEM_DEFINITION__ABSTRACT:
				return getAbstract();
			case MODSPackage.RELATED_ITEM_DEFINITION__ACCESS_CONDITION:
				return getAccessCondition();
			case MODSPackage.RELATED_ITEM_DEFINITION__CLASSIFICATION:
				return getClassification();
			case MODSPackage.RELATED_ITEM_DEFINITION__EXTENSION:
				return getExtension();
			case MODSPackage.RELATED_ITEM_DEFINITION__GENRE:
				return getGenre();
			case MODSPackage.RELATED_ITEM_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case MODSPackage.RELATED_ITEM_DEFINITION__LANGUAGE:
				return getLanguage();
			case MODSPackage.RELATED_ITEM_DEFINITION__LOCATION:
				return getLocation();
			case MODSPackage.RELATED_ITEM_DEFINITION__NAME:
				return getName();
			case MODSPackage.RELATED_ITEM_DEFINITION__NOTE:
				return getNote();
			case MODSPackage.RELATED_ITEM_DEFINITION__ORIGIN_INFO:
				return getOriginInfo();
			case MODSPackage.RELATED_ITEM_DEFINITION__PART:
				return getPart();
			case MODSPackage.RELATED_ITEM_DEFINITION__PHYSICAL_DESCRIPTION:
				return getPhysicalDescription();
			case MODSPackage.RELATED_ITEM_DEFINITION__RECORD_INFO:
				return getRecordInfo();
			case MODSPackage.RELATED_ITEM_DEFINITION__RELATED_ITEM:
				return getRelatedItem();
			case MODSPackage.RELATED_ITEM_DEFINITION__SUBJECT:
				return getSubject();
			case MODSPackage.RELATED_ITEM_DEFINITION__TABLE_OF_CONTENTS:
				return getTableOfContents();
			case MODSPackage.RELATED_ITEM_DEFINITION__TARGET_AUDIENCE:
				return getTargetAudience();
			case MODSPackage.RELATED_ITEM_DEFINITION__TITLE_INFO:
				return getTitleInfo();
			case MODSPackage.RELATED_ITEM_DEFINITION__TYPE_OF_RESOURCE:
				return getTypeOfResource();
			case MODSPackage.RELATED_ITEM_DEFINITION__ACTUATE:
				return getActuate();
			case MODSPackage.RELATED_ITEM_DEFINITION__ARCROLE:
				return getArcrole();
			case MODSPackage.RELATED_ITEM_DEFINITION__DISPLAY_LABEL:
				return getDisplayLabel();
			case MODSPackage.RELATED_ITEM_DEFINITION__HREF:
				return getHref();
			case MODSPackage.RELATED_ITEM_DEFINITION__ID:
				return getID();
			case MODSPackage.RELATED_ITEM_DEFINITION__ROLE:
				return getRole();
			case MODSPackage.RELATED_ITEM_DEFINITION__SHOW:
				return getShow();
			case MODSPackage.RELATED_ITEM_DEFINITION__TITLE:
				return getTitle();
			case MODSPackage.RELATED_ITEM_DEFINITION__TYPE:
				return getType();
			case MODSPackage.RELATED_ITEM_DEFINITION__TYPE1:
				return getType1();
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
			case MODSPackage.RELATED_ITEM_DEFINITION__MODS_GROUP:
				((FeatureMap.Internal) getModsGroup()).set(newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__ABSTRACT:
				getAbstract().clear();
				getAbstract().addAll((Collection<? extends AbstractDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__ACCESS_CONDITION:
				getAccessCondition().clear();
				getAccessCondition().addAll((Collection<? extends AccessConditionDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection<? extends ClassificationDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends ExtensionDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__GENRE:
				getGenre().clear();
				getGenre().addAll((Collection<? extends GenreDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends IdentifierDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends LanguageDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends LocationDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__NAME:
				getName().clear();
				getName().addAll((Collection<? extends NameDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends NoteDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__ORIGIN_INFO:
				getOriginInfo().clear();
				getOriginInfo().addAll((Collection<? extends OriginInfoDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends PartDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__PHYSICAL_DESCRIPTION:
				getPhysicalDescription().clear();
				getPhysicalDescription().addAll((Collection<? extends PhysicalDescriptionDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__RECORD_INFO:
				getRecordInfo().clear();
				getRecordInfo().addAll((Collection<? extends RecordInfoDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__RELATED_ITEM:
				getRelatedItem().clear();
				getRelatedItem().addAll((Collection<? extends RelatedItemDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends SubjectDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__TABLE_OF_CONTENTS:
				getTableOfContents().clear();
				getTableOfContents().addAll((Collection<? extends TableOfContentsDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__TARGET_AUDIENCE:
				getTargetAudience().clear();
				getTargetAudience().addAll((Collection<? extends TargetAudienceDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__TITLE_INFO:
				getTitleInfo().clear();
				getTitleInfo().addAll((Collection<? extends TitleInfoDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__TYPE_OF_RESOURCE:
				getTypeOfResource().clear();
				getTypeOfResource().addAll((Collection<? extends TypeOfResourceDefinition>) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__ACTUATE:
				setActuate((ActuateType) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__ARCROLE:
				setArcrole((String) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__DISPLAY_LABEL:
				setDisplayLabel((String) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__HREF:
				setHref((String) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__ID:
				setID((String) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__ROLE:
				setRole((String) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__SHOW:
				setShow((ShowType) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__TITLE:
				setTitle((String) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__TYPE:
				setType((RelatedItemTypeAttributeDefinition) newValue);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__TYPE1:
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
			case MODSPackage.RELATED_ITEM_DEFINITION__MODS_GROUP:
				getModsGroup().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__ABSTRACT:
				getAbstract().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__ACCESS_CONDITION:
				getAccessCondition().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__CLASSIFICATION:
				getClassification().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__EXTENSION:
				getExtension().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__GENRE:
				getGenre().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__LANGUAGE:
				getLanguage().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__LOCATION:
				getLocation().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__NAME:
				getName().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__NOTE:
				getNote().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__ORIGIN_INFO:
				getOriginInfo().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__PART:
				getPart().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__PHYSICAL_DESCRIPTION:
				getPhysicalDescription().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__RECORD_INFO:
				getRecordInfo().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__RELATED_ITEM:
				getRelatedItem().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__SUBJECT:
				getSubject().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__TABLE_OF_CONTENTS:
				getTableOfContents().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__TARGET_AUDIENCE:
				getTargetAudience().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__TITLE_INFO:
				getTitleInfo().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__TYPE_OF_RESOURCE:
				getTypeOfResource().clear();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__ACTUATE:
				unsetActuate();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__DISPLAY_LABEL:
				setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__ID:
				setID(ID_EDEFAULT);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__SHOW:
				unsetShow();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__TYPE:
				unsetType();
				return;
			case MODSPackage.RELATED_ITEM_DEFINITION__TYPE1:
				unsetType1();
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
			case MODSPackage.RELATED_ITEM_DEFINITION__MODS_GROUP:
				return modsGroup != null && !modsGroup.isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__ABSTRACT:
				return !getAbstract().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__ACCESS_CONDITION:
				return !getAccessCondition().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__CLASSIFICATION:
				return !getClassification().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__EXTENSION:
				return !getExtension().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__GENRE:
				return !getGenre().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__IDENTIFIER:
				return !getIdentifier().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__LANGUAGE:
				return !getLanguage().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__LOCATION:
				return !getLocation().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__NAME:
				return !getName().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__NOTE:
				return !getNote().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__ORIGIN_INFO:
				return !getOriginInfo().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__PART:
				return !getPart().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__PHYSICAL_DESCRIPTION:
				return !getPhysicalDescription().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__RECORD_INFO:
				return !getRecordInfo().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__RELATED_ITEM:
				return !getRelatedItem().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__SUBJECT:
				return !getSubject().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__TABLE_OF_CONTENTS:
				return !getTableOfContents().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__TARGET_AUDIENCE:
				return !getTargetAudience().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__TITLE_INFO:
				return !getTitleInfo().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__TYPE_OF_RESOURCE:
				return !getTypeOfResource().isEmpty();
			case MODSPackage.RELATED_ITEM_DEFINITION__ACTUATE:
				return isSetActuate();
			case MODSPackage.RELATED_ITEM_DEFINITION__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case MODSPackage.RELATED_ITEM_DEFINITION__DISPLAY_LABEL:
				return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
			case MODSPackage.RELATED_ITEM_DEFINITION__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MODSPackage.RELATED_ITEM_DEFINITION__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MODSPackage.RELATED_ITEM_DEFINITION__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case MODSPackage.RELATED_ITEM_DEFINITION__SHOW:
				return isSetShow();
			case MODSPackage.RELATED_ITEM_DEFINITION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case MODSPackage.RELATED_ITEM_DEFINITION__TYPE:
				return isSetType();
			case MODSPackage.RELATED_ITEM_DEFINITION__TYPE1:
				return isSetType1();
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
		result.append(" (modsGroup: ");
		result.append(modsGroup);
		result.append(", actuate: ");
		if (actuateESet)
			result.append(actuate);
		else
			result.append("<unset>");
		result.append(", arcrole: ");
		result.append(arcrole);
		result.append(", displayLabel: ");
		result.append(displayLabel);
		result.append(", href: ");
		result.append(href);
		result.append(", iD: ");
		result.append(iD);
		result.append(", role: ");
		result.append(role);
		result.append(", show: ");
		if (showESet)
			result.append(show);
		else
			result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		if (typeESet)
			result.append(type);
		else
			result.append("<unset>");
		result.append(", type1: ");
		if (type1ESet)
			result.append(type1);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RelatedItemDefinitionImpl
