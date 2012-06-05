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
 *   <li>{@link crosswalk.MappingContainer#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getMappingContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MappingContainer extends ContextProvider {
	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link crosswalk.WalkWidget}.
	 * It is bidirectional and its opposite is '{@link crosswalk.WalkWidget#getWalk <em>Walk</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see crosswalk.CrosswalkPackage#getMappingContainer_Widgets()
	 * @see crosswalk.WalkWidget#getWalk
	 * @model opposite="Walk" containment="true" ordered="false"
	 * @generated
	 */
	EList<WalkWidget> getWidgets();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link crosswalk.OutputElement}.
	 * It is bidirectional and its opposite is '{@link crosswalk.OutputElement#getWalk <em>Walk</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see crosswalk.CrosswalkPackage#getMappingContainer_Elements()
	 * @see crosswalk.OutputElement#getWalk
	 * @model opposite="Walk" containment="true" ordered="false"
	 * @generated
	 */
	EList<OutputElement> getElements();

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Throwable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exceptions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' attribute list.
	 * @see crosswalk.CrosswalkPackage#getMappingContainer_Exceptions()
	 * @model dataType="crosswalk.Exception" transient="true"
	 * @generated
	 */
	EList<Throwable> getExceptions();

} // MappingContainer
