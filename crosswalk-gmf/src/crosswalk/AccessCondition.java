/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.AccessCondition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getAccessCondition()
 * @model
 * @generated
 */
public interface AccessCondition extends InputConsumer, OutputElement {
        /**
         * Returns the value of the '<em><b>Type</b></em>' attribute.
         * The default value is <code>"access"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Type</em>' attribute.
         * @see #setType(String)
         * @see crosswalk.CrosswalkPackage#getAccessCondition_Type()
         * @model default="access"
         * @generated
         */
        String getType();

        /**
         * Sets the value of the '{@link crosswalk.AccessCondition#getType <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Type</em>' attribute.
         * @see #getType()
         * @generated
         */
        void setType(String value);

} // AccessCondition
