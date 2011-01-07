/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabbed Data Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.TabbedDataField#getColumnNumber <em>Column Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getTabbedDataField()
 * @model
 * @generated
 */
public interface TabbedDataField extends DataField {
        /**
         * Returns the value of the '<em><b>Column Number</b></em>' attribute.
         * The default value is <code>"1"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Column Number</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Column Number</em>' attribute.
         * @see #setColumnNumber(int)
         * @see crosswalk.CrosswalkPackage#getTabbedDataField_ColumnNumber()
         * @model default="1" required="true"
         * @generated
         */
        int getColumnNumber();

        /**
         * Sets the value of the '{@link crosswalk.TabbedDataField#getColumnNumber <em>Column Number</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Column Number</em>' attribute.
         * @see #getColumnNumber()
         * @generated
         */
        void setColumnNumber(int value);

} // TabbedDataField
