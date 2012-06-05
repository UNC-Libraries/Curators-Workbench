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
 * A representation of the model object '<em><b>Conversion Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see crosswalk.CrosswalkPackage#getConversionStrategy()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ConversionStrategy extends EObject {
        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @model required="true" inputRequired="true"
	 * @generated
	 */
        Object convert(Object input);

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="crosswalk.Clazz" required="true"
	 * @generated
	 */
	Class getInputType();

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="crosswalk.Clazz" required="true"
	 * @generated
	 */
	Class getOutputType();

} // ConversionStrategy
