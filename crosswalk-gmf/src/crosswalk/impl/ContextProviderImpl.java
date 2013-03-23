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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import crosswalk.ContextProvider;
import crosswalk.CrosswalkPackage;
import crosswalk.OutputProfile;
import edu.unc.lib.schemas.acl.DocumentRoot;
import gov.loc.mods.mods.ModsDefinition;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.ContextProviderImpl#getOutputProfiles <em>Output Profiles</em>}</li>
 *   <li>{@link crosswalk.impl.ContextProviderImpl#getCurrentUser <em>Current User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContextProviderImpl extends EObjectImpl implements ContextProvider {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.CONTEXT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputProfile> getOutputProfiles() {
		if (outputProfiles == null) {
			outputProfiles = new EObjectContainmentEList<OutputProfile>(OutputProfile.class, this, CrosswalkPackage.CONTEXT_PROVIDER__OUTPUT_PROFILES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.CONTEXT_PROVIDER__CURRENT_USER, oldCurrentUser, currentUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrosswalkPackage.CONTEXT_PROVIDER__OUTPUT_PROFILES:
				return ((InternalEList<?>)getOutputProfiles()).basicRemove(otherEnd, msgs);
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
			case CrosswalkPackage.CONTEXT_PROVIDER__OUTPUT_PROFILES:
				return getOutputProfiles();
			case CrosswalkPackage.CONTEXT_PROVIDER__CURRENT_USER:
				return getCurrentUser();
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
			case CrosswalkPackage.CONTEXT_PROVIDER__OUTPUT_PROFILES:
				getOutputProfiles().clear();
				getOutputProfiles().addAll((Collection<? extends OutputProfile>)newValue);
				return;
			case CrosswalkPackage.CONTEXT_PROVIDER__CURRENT_USER:
				setCurrentUser((String)newValue);
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
			case CrosswalkPackage.CONTEXT_PROVIDER__OUTPUT_PROFILES:
				getOutputProfiles().clear();
				return;
			case CrosswalkPackage.CONTEXT_PROVIDER__CURRENT_USER:
				setCurrentUser(CURRENT_USER_EDEFAULT);
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
			case CrosswalkPackage.CONTEXT_PROVIDER__OUTPUT_PROFILES:
				return outputProfiles != null && !outputProfiles.isEmpty();
			case CrosswalkPackage.CONTEXT_PROVIDER__CURRENT_USER:
				return CURRENT_USER_EDEFAULT == null ? currentUser != null : !CURRENT_USER_EDEFAULT.equals(currentUser);
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
		result.append(" (currentUser: ");
		result.append(currentUser);
		result.append(')');
		return result.toString();
	}

} //ContextProviderImpl
