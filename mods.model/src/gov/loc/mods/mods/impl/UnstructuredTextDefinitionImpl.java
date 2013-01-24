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
import gov.loc.mods.mods.UnstructuredTextDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unstructured Text Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.impl.UnstructuredTextDefinitionImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.UnstructuredTextDefinitionImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.UnstructuredTextDefinitionImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.UnstructuredTextDefinitionImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.UnstructuredTextDefinitionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.UnstructuredTextDefinitionImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.UnstructuredTextDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.UnstructuredTextDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.loc.mods.mods.impl.UnstructuredTextDefinitionImpl#getType1 <em>Type1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnstructuredTextDefinitionImpl extends XsStringImpl implements
		UnstructuredTextDefinition {
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
	protected UnstructuredTextDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MODSPackage.eINSTANCE.getUnstructuredTextDefinition();
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ACTUATE,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ACTUATE,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ARCROLE,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__DISPLAY_LABEL,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__HREF, oldHref,
					href));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ROLE, oldRole,
					role));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__SHOW, oldShow,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__SHOW, oldShow,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TITLE, oldTitle,
					title));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TYPE, oldType,
					type));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TYPE1, oldType1,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TYPE1, oldType1,
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ACTUATE:
			return getActuate();
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ARCROLE:
			return getArcrole();
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__DISPLAY_LABEL:
			return getDisplayLabel();
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__HREF:
			return getHref();
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ROLE:
			return getRole();
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__SHOW:
			return getShow();
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TITLE:
			return getTitle();
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TYPE:
			return getType();
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TYPE1:
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
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ACTUATE:
			setActuate((ActuateType) newValue);
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ARCROLE:
			setArcrole((String) newValue);
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__DISPLAY_LABEL:
			setDisplayLabel((String) newValue);
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__HREF:
			setHref((String) newValue);
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ROLE:
			setRole((String) newValue);
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__SHOW:
			setShow((ShowType) newValue);
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TITLE:
			setTitle((String) newValue);
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TYPE:
			setType((String) newValue);
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TYPE1:
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
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ACTUATE:
			unsetActuate();
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ARCROLE:
			setArcrole(ARCROLE_EDEFAULT);
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__DISPLAY_LABEL:
			setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__HREF:
			setHref(HREF_EDEFAULT);
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ROLE:
			setRole(ROLE_EDEFAULT);
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__SHOW:
			unsetShow();
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TYPE1:
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
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ACTUATE:
			return isSetActuate();
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ARCROLE:
			return ARCROLE_EDEFAULT == null ? arcrole != null
					: !ARCROLE_EDEFAULT.equals(arcrole);
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__DISPLAY_LABEL:
			return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null
					: !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__HREF:
			return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT
					.equals(href);
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__ROLE:
			return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT
					.equals(role);
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__SHOW:
			return isSetShow();
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT
					.equals(title);
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
					.equals(type);
		case MODSPackage.UNSTRUCTURED_TEXT_DEFINITION__TYPE1:
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
		result.append(" (actuate: ");
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
		result.append(type);
		result.append(", type1: ");
		if (type1ESet)
			result.append(type1);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UnstructuredTextDefinitionImpl
