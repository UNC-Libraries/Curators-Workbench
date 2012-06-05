/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;

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
