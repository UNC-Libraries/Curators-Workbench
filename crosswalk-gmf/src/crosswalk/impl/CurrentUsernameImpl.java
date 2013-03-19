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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import crosswalk.ContextProvider;
import crosswalk.CrosswalkPackage;
import crosswalk.CurrentUsername;
import crosswalk.DataException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Username</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CurrentUsernameImpl extends WalkWidgetImpl implements CurrentUsername {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentUsernameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.CURRENT_USERNAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object getResult() throws DataException {
		ContextProvider contextProvider = null;
		// find context provider, get user name
		for (EObject next = this.eContainer(); next != null; next = next.eContainer()) {
			if (next instanceof ContextProvider) {
				contextProvider = (ContextProvider)next;
				break;
			}
		}
		if(contextProvider != null) {
			return contextProvider.getCurrentUser();
		} else {
			throw new DataException("No username is provided in this context.");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Class getOutputType() {
		return java.lang.String.class;
	}

} //CurrentUsernameImpl
