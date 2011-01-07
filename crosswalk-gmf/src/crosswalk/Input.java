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
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.Input#getName <em>Name</em>}</li>
 *   <li>{@link crosswalk.Input#getConsumer <em>Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getInput()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Input extends EObject {
        /**
         * Returns the value of the '<em><b>Name</b></em>' attribute.
         * The default value is <code>"input"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Name</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Name</em>' attribute.
         * @see #setName(String)
         * @see crosswalk.CrosswalkPackage#getInput_Name()
         * @model default="input" required="true"
         * @generated
         */
        String getName();

        /**
         * Sets the value of the '{@link crosswalk.Input#getName <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Name</em>' attribute.
         * @see #getName()
         * @generated
         */
        void setName(String value);

        /**
         * Returns the value of the '<em><b>Consumer</b></em>' container reference.
         * It is bidirectional and its opposite is '{@link crosswalk.InputConsumer#getInputs <em>Inputs</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Consumer</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Consumer</em>' container reference.
         * @see #setConsumer(InputConsumer)
         * @see crosswalk.CrosswalkPackage#getInput_Consumer()
         * @see crosswalk.InputConsumer#getInputs
         * @model opposite="Inputs" transient="false"
         * @generated
         */
        InputConsumer getConsumer();

        /**
         * Sets the value of the '{@link crosswalk.Input#getConsumer <em>Consumer</em>}' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Consumer</em>' container reference.
         * @see #getConsumer()
         * @generated
         */
        void setConsumer(InputConsumer value);

} // Input
