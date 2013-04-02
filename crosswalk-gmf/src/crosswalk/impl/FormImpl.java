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
package crosswalk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import crosswalk.ContextProvider;
import crosswalk.CrosswalkPackage;
import crosswalk.FileBlock;
import crosswalk.Form;
import crosswalk.FormElement;
import crosswalk.OutputProfile;
import edu.unc.lib.schemas.acl.DocumentRoot;
import gov.loc.mods.mods.ModsDefinition;
import java.net.URI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.FormImpl#getOutputProfiles <em>Output Profiles</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getCurrentUser <em>Current User</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getEmailDepositNoticeTo <em>Email Deposit Notice To</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getDepositContainerId <em>Deposit Container Id</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getAuthorizedGroups <em>Authorized Groups</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#isReviewBeforePublication <em>Review Before Publication</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#isPromptForMultipleSubmissions <em>Prompt For Multiple Submissions</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#isCanAddSupplementalFiles <em>Can Add Supplemental Files</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getContactEmail <em>Contact Email</em>}</li>
 *   <li>{@link crosswalk.impl.FormImpl#getLogo <em>Logo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormImpl extends EObjectImpl implements Form {
	/**
	 * The cached value of the '{@link #getOutputProfiles() <em>Output Profiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputProfile> outputProfiles;

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
	 * The default value of the '{@link #isReviewBeforePublication() <em>Review Before Publication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReviewBeforePublication()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVIEW_BEFORE_PUBLICATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReviewBeforePublication() <em>Review Before Publication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReviewBeforePublication()
	 * @generated
	 * @ordered
	 */
	protected boolean reviewBeforePublication = REVIEW_BEFORE_PUBLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isPromptForMultipleSubmissions() <em>Prompt For Multiple Submissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPromptForMultipleSubmissions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROMPT_FOR_MULTIPLE_SUBMISSIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPromptForMultipleSubmissions() <em>Prompt For Multiple Submissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPromptForMultipleSubmissions()
	 * @generated
	 * @ordered
	 */
	protected boolean promptForMultipleSubmissions = PROMPT_FOR_MULTIPLE_SUBMISSIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanAddSupplementalFiles() <em>Can Add Supplemental Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanAddSupplementalFiles()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_ADD_SUPPLEMENTAL_FILES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanAddSupplementalFiles() <em>Can Add Supplemental Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanAddSupplementalFiles()
	 * @generated
	 * @ordered
	 */
	protected boolean canAddSupplementalFiles = CAN_ADD_SUPPLEMENTAL_FILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactName() <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactName() <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactName()
	 * @generated
	 * @ordered
	 */
	protected String contactName = CONTACT_NAME_EDEFAULT;

	/**
	 * This is true if the Contact Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contactNameESet;

	/**
	 * The default value of the '{@link #getContactEmail() <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactEmail() <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEmail()
	 * @generated
	 * @ordered
	 */
	protected String contactEmail = CONTACT_EMAIL_EDEFAULT;

	/**
	 * This is true if the Contact Email attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contactEmailESet;

	/**
	 * The default value of the '{@link #getLogo() <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogo()
	 * @generated
	 * @ordered
	 */
	protected static final URI LOGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogo() <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogo()
	 * @generated
	 * @ordered
	 */
	protected URI logo = LOGO_EDEFAULT;

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
	public EList<OutputProfile> getOutputProfiles() {
		if (outputProfiles == null) {
			outputProfiles = new EObjectContainmentEList<OutputProfile>(OutputProfile.class, this, CrosswalkPackage.FORM__OUTPUT_PROFILES);
		}
		return outputProfiles;
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
	public boolean isReviewBeforePublication() {
		return reviewBeforePublication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReviewBeforePublication(boolean newReviewBeforePublication) {
		boolean oldReviewBeforePublication = reviewBeforePublication;
		reviewBeforePublication = newReviewBeforePublication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.FORM__REVIEW_BEFORE_PUBLICATION, oldReviewBeforePublication, reviewBeforePublication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPromptForMultipleSubmissions() {
		return promptForMultipleSubmissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromptForMultipleSubmissions(boolean newPromptForMultipleSubmissions) {
		boolean oldPromptForMultipleSubmissions = promptForMultipleSubmissions;
		promptForMultipleSubmissions = newPromptForMultipleSubmissions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.FORM__PROMPT_FOR_MULTIPLE_SUBMISSIONS, oldPromptForMultipleSubmissions, promptForMultipleSubmissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanAddSupplementalFiles() {
		return canAddSupplementalFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanAddSupplementalFiles(boolean newCanAddSupplementalFiles) {
		boolean oldCanAddSupplementalFiles = canAddSupplementalFiles;
		canAddSupplementalFiles = newCanAddSupplementalFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.FORM__CAN_ADD_SUPPLEMENTAL_FILES, oldCanAddSupplementalFiles, canAddSupplementalFiles));
	}
	
	/**
	 * @generated NOT
	 */
	public boolean isHasFileBlocks() {
		for (FormElement element : this.getElements()) {
			if (FileBlock.class.isInstance(element))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactName(String newContactName) {
		String oldContactName = contactName;
		contactName = newContactName;
		boolean oldContactNameESet = contactNameESet;
		contactNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.FORM__CONTACT_NAME, oldContactName, contactName, !oldContactNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContactName() {
		String oldContactName = contactName;
		boolean oldContactNameESet = contactNameESet;
		contactName = CONTACT_NAME_EDEFAULT;
		contactNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.FORM__CONTACT_NAME, oldContactName, CONTACT_NAME_EDEFAULT, oldContactNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContactName() {
		return contactNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactEmail() {
		return contactEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactEmail(String newContactEmail) {
		String oldContactEmail = contactEmail;
		contactEmail = newContactEmail;
		boolean oldContactEmailESet = contactEmailESet;
		contactEmailESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.FORM__CONTACT_EMAIL, oldContactEmail, contactEmail, !oldContactEmailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContactEmail() {
		String oldContactEmail = contactEmail;
		boolean oldContactEmailESet = contactEmailESet;
		contactEmail = CONTACT_EMAIL_EDEFAULT;
		contactEmailESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CrosswalkPackage.FORM__CONTACT_EMAIL, oldContactEmail, CONTACT_EMAIL_EDEFAULT, oldContactEmailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContactEmail() {
		return contactEmailESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getLogo() {
		return logo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogo(URI newLogo) {
		URI oldLogo = logo;
		logo = newLogo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.FORM__LOGO, oldLogo, logo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrosswalkPackage.FORM__OUTPUT_PROFILES:
				return ((InternalEList<?>)getOutputProfiles()).basicRemove(otherEnd, msgs);
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
			case CrosswalkPackage.FORM__OUTPUT_PROFILES:
				return getOutputProfiles();
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
			case CrosswalkPackage.FORM__REVIEW_BEFORE_PUBLICATION:
				return isReviewBeforePublication();
			case CrosswalkPackage.FORM__PROMPT_FOR_MULTIPLE_SUBMISSIONS:
				return isPromptForMultipleSubmissions();
			case CrosswalkPackage.FORM__CAN_ADD_SUPPLEMENTAL_FILES:
				return isCanAddSupplementalFiles();
			case CrosswalkPackage.FORM__CONTACT_NAME:
				return getContactName();
			case CrosswalkPackage.FORM__CONTACT_EMAIL:
				return getContactEmail();
			case CrosswalkPackage.FORM__LOGO:
				return getLogo();
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
			case CrosswalkPackage.FORM__OUTPUT_PROFILES:
				getOutputProfiles().clear();
				getOutputProfiles().addAll((Collection<? extends OutputProfile>)newValue);
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
			case CrosswalkPackage.FORM__REVIEW_BEFORE_PUBLICATION:
				setReviewBeforePublication((Boolean)newValue);
				return;
			case CrosswalkPackage.FORM__PROMPT_FOR_MULTIPLE_SUBMISSIONS:
				setPromptForMultipleSubmissions((Boolean)newValue);
				return;
			case CrosswalkPackage.FORM__CAN_ADD_SUPPLEMENTAL_FILES:
				setCanAddSupplementalFiles((Boolean)newValue);
				return;
			case CrosswalkPackage.FORM__CONTACT_NAME:
				setContactName((String)newValue);
				return;
			case CrosswalkPackage.FORM__CONTACT_EMAIL:
				setContactEmail((String)newValue);
				return;
			case CrosswalkPackage.FORM__LOGO:
				setLogo((URI)newValue);
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
			case CrosswalkPackage.FORM__OUTPUT_PROFILES:
				getOutputProfiles().clear();
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
			case CrosswalkPackage.FORM__REVIEW_BEFORE_PUBLICATION:
				setReviewBeforePublication(REVIEW_BEFORE_PUBLICATION_EDEFAULT);
				return;
			case CrosswalkPackage.FORM__PROMPT_FOR_MULTIPLE_SUBMISSIONS:
				setPromptForMultipleSubmissions(PROMPT_FOR_MULTIPLE_SUBMISSIONS_EDEFAULT);
				return;
			case CrosswalkPackage.FORM__CAN_ADD_SUPPLEMENTAL_FILES:
				setCanAddSupplementalFiles(CAN_ADD_SUPPLEMENTAL_FILES_EDEFAULT);
				return;
			case CrosswalkPackage.FORM__CONTACT_NAME:
				unsetContactName();
				return;
			case CrosswalkPackage.FORM__CONTACT_EMAIL:
				unsetContactEmail();
				return;
			case CrosswalkPackage.FORM__LOGO:
				setLogo(LOGO_EDEFAULT);
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
			case CrosswalkPackage.FORM__OUTPUT_PROFILES:
				return outputProfiles != null && !outputProfiles.isEmpty();
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
			case CrosswalkPackage.FORM__REVIEW_BEFORE_PUBLICATION:
				return reviewBeforePublication != REVIEW_BEFORE_PUBLICATION_EDEFAULT;
			case CrosswalkPackage.FORM__PROMPT_FOR_MULTIPLE_SUBMISSIONS:
				return promptForMultipleSubmissions != PROMPT_FOR_MULTIPLE_SUBMISSIONS_EDEFAULT;
			case CrosswalkPackage.FORM__CAN_ADD_SUPPLEMENTAL_FILES:
				return canAddSupplementalFiles != CAN_ADD_SUPPLEMENTAL_FILES_EDEFAULT;
			case CrosswalkPackage.FORM__CONTACT_NAME:
				return isSetContactName();
			case CrosswalkPackage.FORM__CONTACT_EMAIL:
				return isSetContactEmail();
			case CrosswalkPackage.FORM__LOGO:
				return LOGO_EDEFAULT == null ? logo != null : !LOGO_EDEFAULT.equals(logo);
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
				case CrosswalkPackage.FORM__OUTPUT_PROFILES: return CrosswalkPackage.CONTEXT_PROVIDER__OUTPUT_PROFILES;
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
				case CrosswalkPackage.CONTEXT_PROVIDER__OUTPUT_PROFILES: return CrosswalkPackage.FORM__OUTPUT_PROFILES;
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
		result.append(", reviewBeforePublication: ");
		result.append(reviewBeforePublication);
		result.append(", promptForMultipleSubmissions: ");
		result.append(promptForMultipleSubmissions);
		result.append(", canAddSupplementalFiles: ");
		result.append(canAddSupplementalFiles);
		result.append(", contactName: ");
		if (contactNameESet) result.append(contactName); else result.append("<unset>");
		result.append(", contactEmail: ");
		if (contactEmailESet) result.append(contactEmail); else result.append("<unset>");
		result.append(", logo: ");
		result.append(logo);
		result.append(')');
		return result.toString();
	}

} //FormImpl
