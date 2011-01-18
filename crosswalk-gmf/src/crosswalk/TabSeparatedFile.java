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

import java.util.List;

import org.eclipse.core.resources.IFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Separated File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.TabSeparatedFile#getSourceFile <em>Source File</em>}</li>
 *   <li>{@link crosswalk.TabSeparatedFile#getDataStartingRow <em>Data Starting Row</em>}</li>
 *   <li>{@link crosswalk.TabSeparatedFile#getHeadingRow <em>Heading Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getTabSeparatedFile()
 * @model
 * @generated
 */
public interface TabSeparatedFile extends DataSource {
        /**
         * Returns the value of the '<em><b>Source File</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Source File</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Source File</em>' attribute.
         * @see #setSourceFile(IFile)
         * @see crosswalk.CrosswalkPackage#getTabSeparatedFile_SourceFile()
         * @model dataType="crosswalk.IFile"
         * @generated
         */
        IFile getSourceFile();

        /**
         * Sets the value of the '{@link crosswalk.TabSeparatedFile#getSourceFile <em>Source File</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Source File</em>' attribute.
         * @see #getSourceFile()
         * @generated
         */
        void setSourceFile(IFile value);

        /**
         * Returns the value of the '<em><b>Data Starting Row</b></em>' attribute.
         * The default value is <code>"1"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Data Starting Row</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Data Starting Row</em>' attribute.
         * @see #setDataStartingRow(int)
         * @see crosswalk.CrosswalkPackage#getTabSeparatedFile_DataStartingRow()
         * @model default="1" required="true"
         * @generated
         */
        int getDataStartingRow();

        /**
         * Sets the value of the '{@link crosswalk.TabSeparatedFile#getDataStartingRow <em>Data Starting Row</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Data Starting Row</em>' attribute.
         * @see #getDataStartingRow()
         * @generated
         */
        void setDataStartingRow(int value);

        /**
         * Returns the value of the '<em><b>Heading Row</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Heading Row</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Heading Row</em>' attribute.
         * @see #isSetHeadingRow()
         * @see #unsetHeadingRow()
         * @see #setHeadingRow(int)
         * @see crosswalk.CrosswalkPackage#getTabSeparatedFile_HeadingRow()
         * @model unsettable="true"
         * @generated
         */
        int getHeadingRow();

        /**
         * Sets the value of the '{@link crosswalk.TabSeparatedFile#getHeadingRow <em>Heading Row</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Heading Row</em>' attribute.
         * @see #isSetHeadingRow()
         * @see #unsetHeadingRow()
         * @see #getHeadingRow()
         * @generated
         */
        void setHeadingRow(int value);

        /**
         * Unsets the value of the '{@link crosswalk.TabSeparatedFile#getHeadingRow <em>Heading Row</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetHeadingRow()
         * @see #getHeadingRow()
         * @see #setHeadingRow(int)
         * @generated
         */
        void unsetHeadingRow();

        /**
         * Returns whether the value of the '{@link crosswalk.TabSeparatedFile#getHeadingRow <em>Heading Row</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Heading Row</em>' attribute is set.
         * @see #unsetHeadingRow()
         * @see #getHeadingRow()
         * @see #setHeadingRow(int)
         * @generated
         */
        boolean isSetHeadingRow();

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @model exceptions="crosswalk.DataException crosswalk.RecordOutOfRangeException" RowNumberRequired="true"
         * @generated
         */
        void GoToRecord(int RowNumber) throws DataException, RecordOutOfRangeException;

	/**
	 * @return
	 */
	List<String> getCurrentRowData();

} // TabSeparatedFile
