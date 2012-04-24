/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.MappingContainer#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link crosswalk.MappingContainer#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getMappingContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MappingContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link crosswalk.WalkWidget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see crosswalk.CrosswalkPackage#getMappingContainer_Widgets()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<WalkWidget> getWidgets();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link crosswalk.OutputElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see crosswalk.CrosswalkPackage#getMappingContainer_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputElement> getElements();

} // MappingContainer
