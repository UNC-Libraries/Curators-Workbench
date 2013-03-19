/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
