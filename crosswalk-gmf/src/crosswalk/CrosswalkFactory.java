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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see crosswalk.CrosswalkPackage
 * @generated
 */
public interface CrosswalkFactory extends EFactory {
        /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        CrosswalkFactory eINSTANCE = crosswalk.impl.CrosswalkFactoryImpl.init();

        /**
	 * Returns a new object of class '<em>Tabbed Data Field</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tabbed Data Field</em>'.
	 * @generated
	 */
        TabbedDataField createTabbedDataField();

        /**
	 * Returns a new object of class '<em>Trim Whitespace</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trim Whitespace</em>'.
	 * @generated
	 */
        TrimWhitespace createTrimWhitespace();

        /**
	 * Returns a new object of class '<em>Current Username</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Username</em>'.
	 * @generated
	 */
	CurrentUsername createCurrentUsername();

								/**
	 * Returns a new object of class '<em>Current Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Date</em>'.
	 * @generated
	 */
	CurrentDate createCurrentDate();

								/**
	 * Returns a new object of class '<em>Cross Walk</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cross Walk</em>'.
	 * @generated
	 */
        CrossWalk createCrossWalk();

        /**
	 * Returns a new object of class '<em>Data Field</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Field</em>'.
	 * @generated
	 */
        DataField createDataField();

        /**
	 * Returns a new object of class '<em>Original Name Record Matcher</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Original Name Record Matcher</em>'.
	 * @generated
	 */
        OriginalNameRecordMatcher createOriginalNameRecordMatcher();

        /**
	 * Returns a new object of class '<em>Date Recognizer</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Recognizer</em>'.
	 * @generated
	 */
        DateRecognizer createDateRecognizer();

        /**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
        Text createText();

        /**
	 * Returns a new object of class '<em>Delimited File</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delimited File</em>'.
	 * @generated
	 */
        DelimitedFile createDelimitedFile();

        /**
	 * Returns a new object of class '<em>Mapped Element</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapped Element</em>'.
	 * @generated
	 */
        MappedElement createMappedElement();

        /**
	 * Returns a new object of class '<em>Mapped Attribute</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapped Attribute</em>'.
	 * @generated
	 */
        MappedAttribute createMappedAttribute();

        /**
	 * Returns a new object of class '<em>Date To ISO8601 String Conversion</em>'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date To ISO8601 String Conversion</em>'.
	 * @generated
	 */
        DateToISO8601StringConversion createDateToISO8601StringConversion();

        /**
	 * Returns a new object of class '<em>Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dictionary</em>'.
	 * @generated
	 */
	Dictionary createDictionary();

								/**
	 * Returns a new object of class '<em>Metadata Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata Block</em>'.
	 * @generated
	 */
	MetadataBlock createMetadataBlock();

								/**
	 * Returns a new object of class '<em>Input Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Field</em>'.
	 * @generated
	 */
	<F> InputField<F> createInputField();

								/**
	 * Returns a new object of class '<em>Text Input Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Input Field</em>'.
	 * @generated
	 */
	TextInputField createTextInputField();

								/**
	 * Returns a new object of class '<em>Editing Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editing Container</em>'.
	 * @generated
	 */
	EditingContainer createEditingContainer();

								/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

								/**
	 * Returns a new object of class '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraph</em>'.
	 * @generated
	 */
	Paragraph createParagraph();

								/**
	 * Returns a new object of class '<em>Date Input Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Input Field</em>'.
	 * @generated
	 */
	DateInputField createDateInputField();

								/**
	 * Returns a new object of class '<em>Multi Line Text Input Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Line Text Input Field</em>'.
	 * @generated
	 */
	MultiLineTextInputField createMultiLineTextInputField();

								/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
        CrosswalkPackage getCrosswalkPackage();

} //CrosswalkFactory
