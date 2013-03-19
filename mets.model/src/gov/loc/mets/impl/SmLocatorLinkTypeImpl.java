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
package gov.loc.mets.impl;

import gov.loc.mets.MetsPackage;
import gov.loc.mets.SmLocatorLinkType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sm Locator Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.loc.mets.impl.SmLocatorLinkTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLocatorLinkTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLocatorLinkTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLocatorLinkTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLocatorLinkTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mets.impl.SmLocatorLinkTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmLocatorLinkTypeImpl extends EObjectImpl implements SmLocatorLinkType {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
        protected static final String LABEL_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
        protected String label = LABEL_EDEFAULT;

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
        protected static final String TYPE_EDEFAULT = "locator";

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
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected SmLocatorLinkTypeImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return MetsPackage.Literals.SM_LOCATOR_LINK_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LOCATOR_LINK_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LOCATOR_LINK_TYPE__ID, oldID, iD));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getLabel() {
		return label;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LOCATOR_LINK_TYPE__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LOCATOR_LINK_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LOCATOR_LINK_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetsPackage.SM_LOCATOR_LINK_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MetsPackage.SM_LOCATOR_LINK_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetsPackage.SM_LOCATOR_LINK_TYPE__HREF:
				return getHref();
			case MetsPackage.SM_LOCATOR_LINK_TYPE__ID:
				return getID();
			case MetsPackage.SM_LOCATOR_LINK_TYPE__LABEL:
				return getLabel();
			case MetsPackage.SM_LOCATOR_LINK_TYPE__ROLE:
				return getRole();
			case MetsPackage.SM_LOCATOR_LINK_TYPE__TITLE:
				return getTitle();
			case MetsPackage.SM_LOCATOR_LINK_TYPE__TYPE:
				return getType();
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
			case MetsPackage.SM_LOCATOR_LINK_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MetsPackage.SM_LOCATOR_LINK_TYPE__ID:
				setID((String)newValue);
				return;
			case MetsPackage.SM_LOCATOR_LINK_TYPE__LABEL:
				setLabel((String)newValue);
				return;
			case MetsPackage.SM_LOCATOR_LINK_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case MetsPackage.SM_LOCATOR_LINK_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case MetsPackage.SM_LOCATOR_LINK_TYPE__TYPE:
				setType((String)newValue);
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
			case MetsPackage.SM_LOCATOR_LINK_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MetsPackage.SM_LOCATOR_LINK_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case MetsPackage.SM_LOCATOR_LINK_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case MetsPackage.SM_LOCATOR_LINK_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case MetsPackage.SM_LOCATOR_LINK_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case MetsPackage.SM_LOCATOR_LINK_TYPE__TYPE:
				unsetType();
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
			case MetsPackage.SM_LOCATOR_LINK_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MetsPackage.SM_LOCATOR_LINK_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MetsPackage.SM_LOCATOR_LINK_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case MetsPackage.SM_LOCATOR_LINK_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case MetsPackage.SM_LOCATOR_LINK_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case MetsPackage.SM_LOCATOR_LINK_TYPE__TYPE:
				return isSetType();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (href: ");
		result.append(href);
		result.append(", iD: ");
		result.append(iD);
		result.append(", label: ");
		result.append(label);
		result.append(", role: ");
		result.append(role);
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SmLocatorLinkTypeImpl
