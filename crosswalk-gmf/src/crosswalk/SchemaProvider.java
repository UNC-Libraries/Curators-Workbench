/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.SchemaProvider#getOutputType <em>Output Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getSchemaProvider()
 * @model abstract="true"
 * @generated
 */
public interface SchemaProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Type</em>' reference.
	 * @see #setOutputType(EClass)
	 * @see crosswalk.CrosswalkPackage#getSchemaProvider_OutputType()
	 * @model required="true"
	 * @generated
	 */
	EClass getOutputType();

	/**
	 * Sets the value of the '{@link crosswalk.SchemaProvider#getOutputType <em>Output Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Type</em>' reference.
	 * @see #getOutputType()
	 * @generated
	 */
	void setOutputType(EClass value);

} // SchemaProvider
