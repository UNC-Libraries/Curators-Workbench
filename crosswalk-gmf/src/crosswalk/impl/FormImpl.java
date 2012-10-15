/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import crosswalk.ContextProvider;
import crosswalk.CrosswalkPackage;
import crosswalk.Form;
import crosswalk.FormElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.FormImpl#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getCurrentUser <em>Current User</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getEmailDepositNoticeTo <em>Email Deposit Notice To</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getDepositContainerId <em>Deposit Container Id</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getAuthorizedGroups <em>Authorized Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormImpl extends EObjectImpl implements Form {
	/**
	 * The cached value of the '{@link #getOutputType() <em>Output Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputType()
	 * @generated
	 * @ordered
	 */
	protected EClass outputType;

	/**
	 * The default value of the '{@link #getCurrentUser() <em>Current User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentUser()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentUser() <em>Current User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentUser()
	 * @generated
	 * @ordered
	 */
	protected String currentUser = CURRENT_USER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FormElement> elements;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmailDepositNoticeTo() <em>Email Deposit Notice To</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailDepositNoticeTo()
	 * @generated
	 * @ordered
	 */
	protected EList<String> emailDepositNoticeTo;

	/**
	 * The default value of the '{@link #getDepositContainerId() <em>Deposit Container Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepositContainerId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPOSIT_CONTAINER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepositContainerId() <em>Deposit Container Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepositContainerId()
	 * @generated
	 * @ordered
	 */
	protected String depositContainerId = DEPOSIT_CONTAINER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthorizedGroups() <em>Authorized Groups</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizedGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<String> authorizedGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputType() {
		if (outputType != null && outputType.eIsProxy()) {
			InternalEObject oldOutputType = (InternalEObject)outputType;
			outputType = (EClass)eResolveProxy(oldOutputType);
			if (outputType != oldOutputType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrosswalkPackage.FORM__OUTPUT_TYPE, oldOutputType, outputType));
			}
		}
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetOutputType() {
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputType(EClass newOutputType) {
		EClass oldOutputType = outputType;
		outputType = newOutputType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.FORM__OUTPUT_TYPE, oldOutputType, outputType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentUser() {
		return currentUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentUser(String newCurrentUser) {
		String oldCurrentUser = currentUser;
		currentUser = newCurrentUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.FORM__CURRENT_USER, oldCurrentUser, currentUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<FormElement>(FormElement.class, this, CrosswalkPackage.FORM__ELEMENTS);
		}
		return elements;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.FORM__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.FORM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEmailDepositNoticeTo() {
		if (emailDepositNoticeTo == null) {
			emailDepositNoticeTo = new EDataTypeUniqueEList<String>(String.class, this, CrosswalkPackage.FORM__EMAIL_DEPOSIT_NOTICE_TO);
		}
		return emailDepositNoticeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepositContainerId() {
		return depositContainerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepositContainerId(String newDepositContainerId) {
		String oldDepositContainerId = depositContainerId;
		depositContainerId = newDepositContainerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.FORM__DEPOSIT_CONTAINER_ID, oldDepositContainerId, depositContainerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAuthorizedGroups() {
		if (authorizedGroups == null) {
			authorizedGroups = new EDataTypeUniqueEList<String>(String.class, this, CrosswalkPackage.FORM__AUTHORIZED_GROUPS);
		}
		return authorizedGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrosswalkPackage.FORM__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case CrosswalkPackage.FORM__OUTPUT_TYPE:
				if (resolve) return getOutputType();
				return basicGetOutputType();
			case CrosswalkPackage.FORM__CURRENT_USER:
				return getCurrentUser();
			case CrosswalkPackage.FORM__ELEMENTS:
				return getElements();
			case CrosswalkPackage.FORM__TITLE:
				return getTitle();
			case CrosswalkPackage.FORM__DESCRIPTION:
				return getDescription();
			case CrosswalkPackage.FORM__EMAIL_DEPOSIT_NOTICE_TO:
				return getEmailDepositNoticeTo();
			case CrosswalkPackage.FORM__DEPOSIT_CONTAINER_ID:
				return getDepositContainerId();
			case CrosswalkPackage.FORM__AUTHORIZED_GROUPS:
				return getAuthorizedGroups();
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
			case CrosswalkPackage.FORM__OUTPUT_TYPE:
				setOutputType((EClass)newValue);
				return;
			case CrosswalkPackage.FORM__CURRENT_USER:
				setCurrentUser((String)newValue);
				return;
			case CrosswalkPackage.FORM__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends FormElement>)newValue);
				return;
			case CrosswalkPackage.FORM__TITLE:
				setTitle((String)newValue);
				return;
			case CrosswalkPackage.FORM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CrosswalkPackage.FORM__EMAIL_DEPOSIT_NOTICE_TO:
				getEmailDepositNoticeTo().clear();
				getEmailDepositNoticeTo().addAll((Collection<? extends String>)newValue);
				return;
			case CrosswalkPackage.FORM__DEPOSIT_CONTAINER_ID:
				setDepositContainerId((String)newValue);
				return;
			case CrosswalkPackage.FORM__AUTHORIZED_GROUPS:
				getAuthorizedGroups().clear();
				getAuthorizedGroups().addAll((Collection<? extends String>)newValue);
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
			case CrosswalkPackage.FORM__OUTPUT_TYPE:
				setOutputType((EClass)null);
				return;
			case CrosswalkPackage.FORM__CURRENT_USER:
				setCurrentUser(CURRENT_USER_EDEFAULT);
				return;
			case CrosswalkPackage.FORM__ELEMENTS:
				getElements().clear();
				return;
			case CrosswalkPackage.FORM__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CrosswalkPackage.FORM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CrosswalkPackage.FORM__EMAIL_DEPOSIT_NOTICE_TO:
				getEmailDepositNoticeTo().clear();
				return;
			case CrosswalkPackage.FORM__DEPOSIT_CONTAINER_ID:
				setDepositContainerId(DEPOSIT_CONTAINER_ID_EDEFAULT);
				return;
			case CrosswalkPackage.FORM__AUTHORIZED_GROUPS:
				getAuthorizedGroups().clear();
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
			case CrosswalkPackage.FORM__OUTPUT_TYPE:
				return outputType != null;
			case CrosswalkPackage.FORM__CURRENT_USER:
				return CURRENT_USER_EDEFAULT == null ? currentUser != null : !CURRENT_USER_EDEFAULT.equals(currentUser);
			case CrosswalkPackage.FORM__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case CrosswalkPackage.FORM__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CrosswalkPackage.FORM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CrosswalkPackage.FORM__EMAIL_DEPOSIT_NOTICE_TO:
				return emailDepositNoticeTo != null && !emailDepositNoticeTo.isEmpty();
			case CrosswalkPackage.FORM__DEPOSIT_CONTAINER_ID:
				return DEPOSIT_CONTAINER_ID_EDEFAULT == null ? depositContainerId != null : !DEPOSIT_CONTAINER_ID_EDEFAULT.equals(depositContainerId);
			case CrosswalkPackage.FORM__AUTHORIZED_GROUPS:
				return authorizedGroups != null && !authorizedGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ContextProvider.class) {
			switch (derivedFeatureID) {
				case CrosswalkPackage.FORM__OUTPUT_TYPE: return CrosswalkPackage.CONTEXT_PROVIDER__OUTPUT_TYPE;
				case CrosswalkPackage.FORM__CURRENT_USER: return CrosswalkPackage.CONTEXT_PROVIDER__CURRENT_USER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ContextProvider.class) {
			switch (baseFeatureID) {
				case CrosswalkPackage.CONTEXT_PROVIDER__OUTPUT_TYPE: return CrosswalkPackage.FORM__OUTPUT_TYPE;
				case CrosswalkPackage.CONTEXT_PROVIDER__CURRENT_USER: return CrosswalkPackage.FORM__CURRENT_USER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (currentUser: ");
		result.append(currentUser);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", emailDepositNoticeTo: ");
		result.append(emailDepositNoticeTo);
		result.append(", depositContainerId: ");
		result.append(depositContainerId);
		result.append(", authorizedGroups: ");
		result.append(authorizedGroups);
		result.append(')');
		return result.toString();
	}

} //FormImpl
