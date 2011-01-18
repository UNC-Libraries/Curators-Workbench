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

import org.eclipse.core.resources.IFolder;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Original Name Record Matcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.OriginalNameRecordMatcher#isCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link crosswalk.OriginalNameRecordMatcher#isIncludeFileExtension <em>Include File Extension</em>}</li>
 *   <li>{@link crosswalk.OriginalNameRecordMatcher#getBaseFolder <em>Base Folder</em>}</li>
 *   <li>{@link crosswalk.OriginalNameRecordMatcher#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getOriginalNameRecordMatcher()
 * @model
 * @generated
 */
public interface OriginalNameRecordMatcher extends RecordMatcherStrategy {
        /**
         * Returns the value of the '<em><b>Case Sensitive</b></em>' attribute.
         * The default value is <code>"false"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Case Sensitive</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Case Sensitive</em>' attribute.
         * @see #setCaseSensitive(boolean)
         * @see crosswalk.CrosswalkPackage#getOriginalNameRecordMatcher_CaseSensitive()
         * @model default="false" required="true"
         * @generated
         */
        boolean isCaseSensitive();

        /**
         * Sets the value of the '{@link crosswalk.OriginalNameRecordMatcher#isCaseSensitive <em>Case Sensitive</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Case Sensitive</em>' attribute.
         * @see #isCaseSensitive()
         * @generated
         */
        void setCaseSensitive(boolean value);

        /**
         * Returns the value of the '<em><b>Include File Extension</b></em>' attribute.
         * The default value is <code>"false"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Include File Extension</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Include File Extension</em>' attribute.
         * @see #setIncludeFileExtension(boolean)
         * @see crosswalk.CrosswalkPackage#getOriginalNameRecordMatcher_IncludeFileExtension()
         * @model default="false" required="true"
         * @generated
         */
        boolean isIncludeFileExtension();

        /**
         * Sets the value of the '{@link crosswalk.OriginalNameRecordMatcher#isIncludeFileExtension <em>Include File Extension</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Include File Extension</em>' attribute.
         * @see #isIncludeFileExtension()
         * @generated
         */
        void setIncludeFileExtension(boolean value);

        /**
         * Returns the value of the '<em><b>Base Folder</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Base Folder</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Base Folder</em>' attribute.
         * @see #isSetBaseFolder()
         * @see #unsetBaseFolder()
         * @see #setBaseFolder(IFolder)
         * @see crosswalk.CrosswalkPackage#getOriginalNameRecordMatcher_BaseFolder()
         * @model unsettable="true" dataType="crosswalk.IFolder"
         * @generated
         */
        IFolder getBaseFolder();

        /**
         * Sets the value of the '{@link crosswalk.OriginalNameRecordMatcher#getBaseFolder <em>Base Folder</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Base Folder</em>' attribute.
         * @see #isSetBaseFolder()
         * @see #unsetBaseFolder()
         * @see #getBaseFolder()
         * @generated
         */
        void setBaseFolder(IFolder value);

        /**
         * Unsets the value of the '{@link crosswalk.OriginalNameRecordMatcher#getBaseFolder <em>Base Folder</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetBaseFolder()
         * @see #getBaseFolder()
         * @see #setBaseFolder(IFolder)
         * @generated
         */
        void unsetBaseFolder();

        /**
         * Returns whether the value of the '{@link crosswalk.OriginalNameRecordMatcher#getBaseFolder <em>Base Folder</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Base Folder</em>' attribute is set.
         * @see #unsetBaseFolder()
         * @see #getBaseFolder()
         * @see #setBaseFolder(IFolder)
         * @generated
         */
        boolean isSetBaseFolder();

        /**
         * Returns the value of the '<em><b>Input</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Input</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Input</em>' containment reference.
         * @see #setInput(StringInput)
         * @see crosswalk.CrosswalkPackage#getOriginalNameRecordMatcher_Input()
         * @model containment="true" required="true"
         * @generated
         */
        StringInput getInput();

        /**
         * Sets the value of the '{@link crosswalk.OriginalNameRecordMatcher#getInput <em>Input</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Input</em>' containment reference.
         * @see #getInput()
         * @generated
         */
        void setInput(StringInput value);

} // OriginalNameRecordMatcher
