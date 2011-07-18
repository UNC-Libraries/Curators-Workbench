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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.DataSource#getWalk <em>Walk</em>}</li>
 *   <li>{@link crosswalk.DataSource#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getDataSource()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DataSource extends EObject {
        /**
	 * Returns the value of the '<em><b>Walk</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link crosswalk.CrossWalk#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Walk</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Walk</em>' container reference.
	 * @see #setWalk(CrossWalk)
	 * @see crosswalk.CrosswalkPackage#getDataSource_Walk()
	 * @see crosswalk.CrossWalk#getDataSource
	 * @model opposite="DataSource" required="true" transient="false"
	 * @generated
	 */
        CrossWalk getWalk();

        /**
	 * Sets the value of the '{@link crosswalk.DataSource#getWalk <em>Walk</em>}' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Walk</em>' container reference.
	 * @see #getWalk()
	 * @generated
	 */
        void setWalk(CrossWalk value);

        /**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link crosswalk.DataField}.
	 * It is bidirectional and its opposite is '{@link crosswalk.DataField#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see crosswalk.CrosswalkPackage#getDataSource_Fields()
	 * @see crosswalk.DataField#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
        EList<DataField> getFields();

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @throws RecordOutOfRangeException
         * @model exceptions="crosswalk.DataException" RowNumberRequired="true"
         * @generated NOT
         */
        void GoToRecord(int RowNumber) throws DataException, RecordOutOfRangeException;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @throws RecordOutOfRangeException
         * @model exceptions="crosswalk.DataException"
         * @generated NOT
         */
        void GoToExample() throws DataException, RecordOutOfRangeException;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @model exceptions="crosswalk.DataException"
         * @generated NOT
         */
        void NextRecord() throws DataException, RecordOutOfRangeException;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @model exceptions="crosswalk.DataException"
         * @generated NOT
         */
        void Reset() throws DataException;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
        String getRecordID();

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
        String getName();

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @model fieldRequired="true"
	 * @generated
	 */
        String getFieldValue(DataField field);

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @model exceptions="crosswalk.DataException"
	 * @generated
	 */
        void initializeDataFields() throws DataException;

} // DataSource
