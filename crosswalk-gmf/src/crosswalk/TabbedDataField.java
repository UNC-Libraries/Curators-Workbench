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
