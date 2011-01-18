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
 * A representation of the model object '<em><b>Data Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.DataField#getSource <em>Source</em>}</li>
 *   <li>{@link crosswalk.DataField#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getDataField()
 * @model
 * @generated
 */
public interface DataField extends StringGenerator {
        /**
         * Returns the value of the '<em><b>Source</b></em>' container reference.
         * It is bidirectional and its opposite is '{@link crosswalk.DataSource#getFields <em>Fields</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Source</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Source</em>' container reference.
         * @see #setSource(DataSource)
         * @see crosswalk.CrosswalkPackage#getDataField_Source()
         * @see crosswalk.DataSource#getFields
         * @model opposite="fields" transient="false"
         * @generated
         */
        DataSource getSource();

        /**
         * Sets the value of the '{@link crosswalk.DataField#getSource <em>Source</em>}' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Source</em>' container reference.
         * @see #getSource()
         * @generated
         */
        void setSource(DataSource value);

        /**
         * Returns the value of the '<em><b>Label</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Label</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Label</em>' attribute.
         * @see #setLabel(String)
         * @see crosswalk.CrosswalkPackage#getDataField_Label()
         * @model
         * @generated
         */
        String getLabel();

        /**
         * Sets the value of the '{@link crosswalk.DataField#getLabel <em>Label</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Label</em>' attribute.
         * @see #getLabel()
         * @generated
         */
        void setLabel(String value);

} // DataField
