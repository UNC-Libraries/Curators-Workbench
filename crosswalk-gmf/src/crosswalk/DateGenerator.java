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
 * A representation of the model object '<em><b>Date Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see crosswalk.CrosswalkPackage#getDateGenerator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DateGenerator extends EObject {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @model kind="operation" required="true" exceptions="crosswalk.DataException"
         * @generated
         */
        String getResultString() throws DataException;

} // DateGenerator
