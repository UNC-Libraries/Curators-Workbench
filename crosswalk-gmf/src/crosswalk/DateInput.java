/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.DateInput#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getDateInput()
 * @model
 * @generated
 */
public interface DateInput extends Input {
        /**
         * Returns the value of the '<em><b>Input</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Input</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Input</em>' reference.
         * @see #isSetInput()
         * @see #unsetInput()
         * @see #setInput(DateGenerator)
         * @see crosswalk.CrosswalkPackage#getDateInput_Input()
         * @model unsettable="true"
         * @generated
         */
        DateGenerator getInput();

        /**
         * Sets the value of the '{@link crosswalk.DateInput#getInput <em>Input</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Input</em>' reference.
         * @see #isSetInput()
         * @see #unsetInput()
         * @see #getInput()
         * @generated
         */
        void setInput(DateGenerator value);

        /**
         * Unsets the value of the '{@link crosswalk.DateInput#getInput <em>Input</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetInput()
         * @see #getInput()
         * @see #setInput(DateGenerator)
         * @generated
         */
        void unsetInput();

        /**
         * Returns whether the value of the '{@link crosswalk.DateInput#getInput <em>Input</em>}' reference is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Input</em>' reference is set.
         * @see #unsetInput()
         * @see #getInput()
         * @see #setInput(DateGenerator)
         * @generated
         */
        boolean isSetInput();

} // DateInput
