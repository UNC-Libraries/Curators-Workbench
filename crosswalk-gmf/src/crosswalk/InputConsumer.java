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
 * A representation of the model object '<em><b>Input Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.InputConsumer#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getInputConsumer()
 * @model abstract="true"
 * @generated
 */
public interface InputConsumer extends EObject {
        /**
         * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
         * The list contents are of type {@link crosswalk.Input}.
         * It is bidirectional and its opposite is '{@link crosswalk.Input#getConsumer <em>Consumer</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Inputs</em>' containment reference list.
         * @see crosswalk.CrosswalkPackage#getInputConsumer_Inputs()
         * @see crosswalk.Input#getConsumer
         * @model opposite="Consumer" containment="true"
         * @generated
         */
        EList<Input> getInputs();

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @model
         * @generated
         */
        void initInputs();

} // InputConsumer
