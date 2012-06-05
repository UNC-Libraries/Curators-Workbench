/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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

} // Form
