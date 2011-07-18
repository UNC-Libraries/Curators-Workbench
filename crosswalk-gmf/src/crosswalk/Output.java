/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see crosswalk.CrosswalkPackage#getOutput()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Output extends EObject {
        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @model kind="operation" required="true" exceptions="crosswalk.DataException"
	 * @generated
	 */
        Object getResult() throws DataException;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
        EDataType getOutputEDataType();

} // Output
