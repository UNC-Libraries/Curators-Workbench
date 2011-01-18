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
 * A representation of the model object '<em><b>Date Recognizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.DateRecognizer#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getDateRecognizer()
 * @model
 * @generated
 */
public interface DateRecognizer extends InputConsumer, DateGenerator, WalkWidget {

        /**
         * Returns the value of the '<em><b>Format</b></em>' attribute.
         * The default value is <code>"yy-MM-dd"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Format</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Format</em>' attribute.
         * @see #setFormat(String)
         * @see crosswalk.CrosswalkPackage#getDateRecognizer_Format()
         * @model default="yy-MM-dd" required="true"
         * @generated
         */
        String getFormat();

        /**
         * Sets the value of the '{@link crosswalk.DateRecognizer#getFormat <em>Format</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Format</em>' attribute.
         * @see #getFormat()
         * @generated
         */
        void setFormat(String value);
} // DateRecognizer
