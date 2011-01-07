/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see crosswalk.CrosswalkPackage#getStringGenerator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StringGenerator extends EObject {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @model kind="operation" required="true" exceptions="crosswalk.DataException"
         * @generated
         */
        String getResultString() throws DataException;

} // StringGenerator
