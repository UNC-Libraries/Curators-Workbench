/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.unc.lib.schemas.acl.impl;

import edu.unc.lib.schemas.acl.AccessControlType;
import edu.unc.lib.schemas.acl.AclPackage;
import edu.unc.lib.schemas.acl.GrantType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Access Control Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.unc.lib.schemas.acl.impl.AccessControlTypeImpl#getGrant <em>Grant</em>}</li>
 *   <li>{@link edu.unc.lib.schemas.acl.impl.AccessControlTypeImpl#isDiscoverable <em>Discoverable</em>}</li>
 *   <li>{@link edu.unc.lib.schemas.acl.impl.AccessControlTypeImpl#isPublished <em>Published</em>}</li>
 *   <li>{@link edu.unc.lib.schemas.acl.impl.AccessControlTypeImpl#getEmbargoUntil <em>Embargo Until</em>}</li>
 *   <li>{@link edu.unc.lib.schemas.acl.impl.AccessControlTypeImpl#isInherit <em>Inherit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessControlTypeImpl extends EObjectImpl implements AccessControlType {
        /**
	 * The cached value of the '{@link #getGrant() <em>Grant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getGrant()
	 * @generated
	 * @ordered
	 */
        protected EList<GrantType> grant;

        /**
	 * The default value of the '{@link #isDiscoverable() <em>Discoverable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscoverable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISCOVERABLE_EDEFAULT = true;

								/**
	 * The cached value of the '{@link #isDiscoverable() <em>Discoverable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscoverable()
	 * @generated
	 * @ordered
	 */
	protected boolean discoverable = DISCOVERABLE_EDEFAULT;

								/**
	 * This is true if the Discoverable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean discoverableESet;

								/**
	 * The default value of the '{@link #isPublished() <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublished()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLISHED_EDEFAULT = true;

								/**
	 * The cached value of the '{@link #isPublished() <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublished()
	 * @generated
	 * @ordered
	 */
	protected boolean published = PUBLISHED_EDEFAULT;

								/**
	 * This is true if the Published attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publishedESet;

								/**
	 * The default value of the '{@link #getEmbargoUntil() <em>Embargo Until</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getEmbargoUntil()
	 * @generated
	 * @ordered
	 */
        protected static final XMLGregorianCalendar EMBARGO_UNTIL_EDEFAULT = null;

        /**
	 * The cached value of the '{@link #getEmbargoUntil() <em>Embargo Until</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getEmbargoUntil()
	 * @generated
	 * @ordered
	 */
        protected XMLGregorianCalendar embargoUntil = EMBARGO_UNTIL_EDEFAULT;

        /**
	 * This is true if the Embargo Until attribute has been set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        protected boolean embargoUntilESet;

        /**
	 * The default value of the '{@link #isInherit() <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isInherit()
	 * @generated
	 * @ordered
	 */
        protected static final boolean INHERIT_EDEFAULT = true;

        /**
	 * The cached value of the '{@link #isInherit() <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isInherit()
	 * @generated
	 * @ordered
	 */
        protected boolean inherit = INHERIT_EDEFAULT;

        /**
	 * This is true if the Inherit attribute has been set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        protected boolean inheritESet;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected AccessControlTypeImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return AclPackage.Literals.ACCESS_CONTROL_TYPE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<GrantType> getGrant() {
		if (grant == null) {
			grant = new EObjectContainmentEList<GrantType>(GrantType.class, this, AclPackage.ACCESS_CONTROL_TYPE__GRANT);
		}
		return grant;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDiscoverable() {
		return discoverable;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoverable(boolean newDiscoverable) {
		boolean oldDiscoverable = discoverable;
		discoverable = newDiscoverable;
		boolean oldDiscoverableESet = discoverableESet;
		discoverableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AclPackage.ACCESS_CONTROL_TYPE__DISCOVERABLE, oldDiscoverable, discoverable, !oldDiscoverableESet));
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiscoverable() {
		boolean oldDiscoverable = discoverable;
		boolean oldDiscoverableESet = discoverableESet;
		discoverable = DISCOVERABLE_EDEFAULT;
		discoverableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AclPackage.ACCESS_CONTROL_TYPE__DISCOVERABLE, oldDiscoverable, DISCOVERABLE_EDEFAULT, oldDiscoverableESet));
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiscoverable() {
		return discoverableESet;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublished() {
		return published;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublished(boolean newPublished) {
		boolean oldPublished = published;
		published = newPublished;
		boolean oldPublishedESet = publishedESet;
		publishedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AclPackage.ACCESS_CONTROL_TYPE__PUBLISHED, oldPublished, published, !oldPublishedESet));
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPublished() {
		boolean oldPublished = published;
		boolean oldPublishedESet = publishedESet;
		published = PUBLISHED_EDEFAULT;
		publishedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AclPackage.ACCESS_CONTROL_TYPE__PUBLISHED, oldPublished, PUBLISHED_EDEFAULT, oldPublishedESet));
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPublished() {
		return publishedESet;
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public XMLGregorianCalendar getEmbargoUntil() {
		return embargoUntil;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setEmbargoUntil(XMLGregorianCalendar newEmbargoUntil) {
		XMLGregorianCalendar oldEmbargoUntil = embargoUntil;
		embargoUntil = newEmbargoUntil;
		boolean oldEmbargoUntilESet = embargoUntilESet;
		embargoUntilESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AclPackage.ACCESS_CONTROL_TYPE__EMBARGO_UNTIL, oldEmbargoUntil, embargoUntil, !oldEmbargoUntilESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void unsetEmbargoUntil() {
		XMLGregorianCalendar oldEmbargoUntil = embargoUntil;
		boolean oldEmbargoUntilESet = embargoUntilESet;
		embargoUntil = EMBARGO_UNTIL_EDEFAULT;
		embargoUntilESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AclPackage.ACCESS_CONTROL_TYPE__EMBARGO_UNTIL, oldEmbargoUntil, EMBARGO_UNTIL_EDEFAULT, oldEmbargoUntilESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean isSetEmbargoUntil() {
		return embargoUntilESet;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean isInherit() {
		return inherit;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setInherit(boolean newInherit) {
		boolean oldInherit = inherit;
		inherit = newInherit;
		boolean oldInheritESet = inheritESet;
		inheritESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AclPackage.ACCESS_CONTROL_TYPE__INHERIT, oldInherit, inherit, !oldInheritESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void unsetInherit() {
		boolean oldInherit = inherit;
		boolean oldInheritESet = inheritESet;
		inherit = INHERIT_EDEFAULT;
		inheritESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AclPackage.ACCESS_CONTROL_TYPE__INHERIT, oldInherit, INHERIT_EDEFAULT, oldInheritESet));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public boolean isSetInherit() {
		return inheritESet;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AclPackage.ACCESS_CONTROL_TYPE__GRANT:
				return ((InternalEList<?>)getGrant()).basicRemove(otherEnd, msgs);
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
			case AclPackage.ACCESS_CONTROL_TYPE__GRANT:
				return getGrant();
			case AclPackage.ACCESS_CONTROL_TYPE__DISCOVERABLE:
				return isDiscoverable();
			case AclPackage.ACCESS_CONTROL_TYPE__PUBLISHED:
				return isPublished();
			case AclPackage.ACCESS_CONTROL_TYPE__EMBARGO_UNTIL:
				return getEmbargoUntil();
			case AclPackage.ACCESS_CONTROL_TYPE__INHERIT:
				return isInherit();
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
			case AclPackage.ACCESS_CONTROL_TYPE__GRANT:
				getGrant().clear();
				getGrant().addAll((Collection<? extends GrantType>)newValue);
				return;
			case AclPackage.ACCESS_CONTROL_TYPE__DISCOVERABLE:
				setDiscoverable((Boolean)newValue);
				return;
			case AclPackage.ACCESS_CONTROL_TYPE__PUBLISHED:
				setPublished((Boolean)newValue);
				return;
			case AclPackage.ACCESS_CONTROL_TYPE__EMBARGO_UNTIL:
				setEmbargoUntil((XMLGregorianCalendar)newValue);
				return;
			case AclPackage.ACCESS_CONTROL_TYPE__INHERIT:
				setInherit((Boolean)newValue);
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
			case AclPackage.ACCESS_CONTROL_TYPE__GRANT:
				getGrant().clear();
				return;
			case AclPackage.ACCESS_CONTROL_TYPE__DISCOVERABLE:
				unsetDiscoverable();
				return;
			case AclPackage.ACCESS_CONTROL_TYPE__PUBLISHED:
				unsetPublished();
				return;
			case AclPackage.ACCESS_CONTROL_TYPE__EMBARGO_UNTIL:
				unsetEmbargoUntil();
				return;
			case AclPackage.ACCESS_CONTROL_TYPE__INHERIT:
				unsetInherit();
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
			case AclPackage.ACCESS_CONTROL_TYPE__GRANT:
				return grant != null && !grant.isEmpty();
			case AclPackage.ACCESS_CONTROL_TYPE__DISCOVERABLE:
				return isSetDiscoverable();
			case AclPackage.ACCESS_CONTROL_TYPE__PUBLISHED:
				return isSetPublished();
			case AclPackage.ACCESS_CONTROL_TYPE__EMBARGO_UNTIL:
				return isSetEmbargoUntil();
			case AclPackage.ACCESS_CONTROL_TYPE__INHERIT:
				return isSetInherit();
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
		result.append(" (discoverable: ");
		if (discoverableESet) result.append(discoverable); else result.append("<unset>");
		result.append(", published: ");
		if (publishedESet) result.append(published); else result.append("<unset>");
		result.append(", embargoUntil: ");
		if (embargoUntilESet) result.append(embargoUntil); else result.append("<unset>");
		result.append(", inherit: ");
		if (inheritESet) result.append(inherit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AccessControlTypeImpl
