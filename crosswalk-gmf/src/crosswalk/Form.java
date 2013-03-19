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
package crosswalk;

import java.util.Map;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.Form#getElements <em>Elements</em>}</li>
 *   <li>{@link crosswalk.Form#getTitle <em>Title</em>}</li>
 *   <li>{@link crosswalk.Form#getDescription <em>Description</em>}</li>
 *   <li>{@link crosswalk.Form#getEmailDepositNoticeTo <em>Email Deposit Notice To</em>}</li>
 *   <li>{@link crosswalk.Form#getDepositContainerId <em>Deposit Container Id</em>}</li>
 *   <li>{@link crosswalk.Form#getAuthorizedGroups <em>Authorized Groups</em>}</li>
 *   <li>{@link crosswalk.Form#isReviewBeforePublication <em>Review Before Publication</em>}</li>
 *   <li>{@link crosswalk.Form#isPromptForMultipleSubmissions <em>Prompt For Multiple Submissions</em>}</li>
 *   <li>{@link crosswalk.Form#isCanAddSupplementalFiles <em>Can Add Supplemental Files</em>}</li>
 *   <li>{@link crosswalk.Form#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link crosswalk.Form#getContactEmail <em>Contact Email</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends Editable, ContextProvider {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link crosswalk.FormElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see crosswalk.CrosswalkPackage#getForm_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormElement> getElements();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see crosswalk.CrosswalkPackage#getForm_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link crosswalk.Form#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see crosswalk.CrosswalkPackage#getForm_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link crosswalk.Form#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Email Deposit Notice To</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Deposit Notice To</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Deposit Notice To</em>' attribute list.
	 * @see crosswalk.CrosswalkPackage#getForm_EmailDepositNoticeTo()
	 * @model
	 * @generated
	 */
	EList<String> getEmailDepositNoticeTo();

	/**
	 * Returns the value of the '<em><b>Deposit Container Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deposit Container Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deposit Container Id</em>' attribute.
	 * @see #setDepositContainerId(String)
	 * @see crosswalk.CrosswalkPackage#getForm_DepositContainerId()
	 * @model
	 * @generated
	 */
	String getDepositContainerId();

	/**
	 * Sets the value of the '{@link crosswalk.Form#getDepositContainerId <em>Deposit Container Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deposit Container Id</em>' attribute.
	 * @see #getDepositContainerId()
	 * @generated
	 */
	void setDepositContainerId(String value);

	/**
	 * Returns the value of the '<em><b>Authorized Groups</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorized Groups</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorized Groups</em>' attribute list.
	 * @see crosswalk.CrosswalkPackage#getForm_AuthorizedGroups()
	 * @model default="public"
	 * @generated
	 */
	EList<String> getAuthorizedGroups();

	/**
	 * Returns the value of the '<em><b>Review Before Publication</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Review Before Publication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review Before Publication</em>' attribute.
	 * @see #setReviewBeforePublication(boolean)
	 * @see crosswalk.CrosswalkPackage#getForm_ReviewBeforePublication()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isReviewBeforePublication();

	/**
	 * Sets the value of the '{@link crosswalk.Form#isReviewBeforePublication <em>Review Before Publication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Before Publication</em>' attribute.
	 * @see #isReviewBeforePublication()
	 * @generated
	 */
	void setReviewBeforePublication(boolean value);

	/**
	 * Returns the value of the '<em><b>Prompt For Multiple Submissions</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prompt For Multiple Submissions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt For Multiple Submissions</em>' attribute.
	 * @see #setPromptForMultipleSubmissions(boolean)
	 * @see crosswalk.CrosswalkPackage#getForm_PromptForMultipleSubmissions()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isPromptForMultipleSubmissions();

	/**
	 * Sets the value of the '{@link crosswalk.Form#isPromptForMultipleSubmissions <em>Prompt For Multiple Submissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt For Multiple Submissions</em>' attribute.
	 * @see #isPromptForMultipleSubmissions()
	 * @generated
	 */
	void setPromptForMultipleSubmissions(boolean value);

	/**
	 * Returns the value of the '<em><b>Can Add Supplemental Files</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Add Supplemental Files</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Add Supplemental Files</em>' attribute.
	 * @see #setCanAddSupplementalFiles(boolean)
	 * @see crosswalk.CrosswalkPackage#getForm_CanAddSupplementalFiles()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isCanAddSupplementalFiles();

	/**
	 * Sets the value of the '{@link crosswalk.Form#isCanAddSupplementalFiles <em>Can Add Supplemental Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Add Supplemental Files</em>' attribute.
	 * @see #isCanAddSupplementalFiles()
	 * @generated
	 */
	void setCanAddSupplementalFiles(boolean value);

	/**
	 * Returns the value of the '<em><b>Contact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Name</em>' attribute.
	 * @see #isSetContactName()
	 * @see #unsetContactName()
	 * @see #setContactName(String)
	 * @see crosswalk.CrosswalkPackage#getForm_ContactName()
	 * @model unsettable="true"
	 * @generated
	 */
	String getContactName();

	/**
	 * Sets the value of the '{@link crosswalk.Form#getContactName <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Name</em>' attribute.
	 * @see #isSetContactName()
	 * @see #unsetContactName()
	 * @see #getContactName()
	 * @generated
	 */
	void setContactName(String value);

	/**
	 * Unsets the value of the '{@link crosswalk.Form#getContactName <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContactName()
	 * @see #getContactName()
	 * @see #setContactName(String)
	 * @generated
	 */
	void unsetContactName();

	/**
	 * Returns whether the value of the '{@link crosswalk.Form#getContactName <em>Contact Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contact Name</em>' attribute is set.
	 * @see #unsetContactName()
	 * @see #getContactName()
	 * @see #setContactName(String)
	 * @generated
	 */
	boolean isSetContactName();

	/**
	 * Returns the value of the '<em><b>Contact Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Email</em>' attribute.
	 * @see #isSetContactEmail()
	 * @see #unsetContactEmail()
	 * @see #setContactEmail(String)
	 * @see crosswalk.CrosswalkPackage#getForm_ContactEmail()
	 * @model unsettable="true"
	 * @generated
	 */
	String getContactEmail();

	/**
	 * Sets the value of the '{@link crosswalk.Form#getContactEmail <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Email</em>' attribute.
	 * @see #isSetContactEmail()
	 * @see #unsetContactEmail()
	 * @see #getContactEmail()
	 * @generated
	 */
	void setContactEmail(String value);

	/**
	 * Unsets the value of the '{@link crosswalk.Form#getContactEmail <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContactEmail()
	 * @see #getContactEmail()
	 * @see #setContactEmail(String)
	 * @generated
	 */
	void unsetContactEmail();

	/**
	 * Returns whether the value of the '{@link crosswalk.Form#getContactEmail <em>Contact Email</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contact Email</em>' attribute is set.
	 * @see #unsetContactEmail()
	 * @see #getContactEmail()
	 * @see #setContactEmail(String)
	 * @generated
	 */
	boolean isSetContactEmail();

} // Form
