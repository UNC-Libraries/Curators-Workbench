/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Input Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.DateInputField#getDatePrecision <em>Date Precision</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getDateInputField()
 * @model superTypes="crosswalk.InputField<org.eclipse.emf.ecore.EDate>"
 * @generated
 */
public interface DateInputField extends InputField<Date> {

	/**
	 * Returns the value of the '<em><b>Date Precision</b></em>' attribute.
	 * The default value is <code>"Day"</code>.
	 * The literals are from the enumeration {@link crosswalk.DatePrecision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Precision</em>' attribute.
	 * @see crosswalk.DatePrecision
	 * @see #setDatePrecision(DatePrecision)
	 * @see crosswalk.CrosswalkPackage#getDateInputField_DatePrecision()
	 * @model default="Day" required="true"
	 * @generated
	 */
	DatePrecision getDatePrecision();

	/**
	 * Sets the value of the '{@link crosswalk.DateInputField#getDatePrecision <em>Date Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Precision</em>' attribute.
	 * @see crosswalk.DatePrecision
	 * @see #getDatePrecision()
	 * @generated
	 */
	void setDatePrecision(DatePrecision value);
} // DateInputField
