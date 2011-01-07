/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.Text#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getText()
 * @model
 * @generated
 */
public interface Text extends StringGenerator, WalkWidget {
        /**
         * Returns the value of the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Value</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Value</em>' attribute.
         * @see #setValue(String)
         * @see crosswalk.CrosswalkPackage#getText_Value()
         * @model
         * @generated
         */
        String getValue();

        /**
         * Sets the value of the '{@link crosswalk.Text#getValue <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Value</em>' attribute.
         * @see #getValue()
         * @generated
         */
        void setValue(String value);

} // Text
