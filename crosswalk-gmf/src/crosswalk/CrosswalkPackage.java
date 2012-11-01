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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see crosswalk.CrosswalkFactory
 * @model kind="package"
 * @generated
 */
public interface CrosswalkPackage extends EPackage {

    public List<EClass> getDataSourceImplementations();
        /**
	 * The package name.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        String eNAME = "crosswalk";

        /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        String eNS_URI = "http://lib.unc.edu/schemas/crosswalk";

        /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        String eNS_PREFIX = "walk";

        /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        CrosswalkPackage eINSTANCE = crosswalk.impl.CrosswalkPackageImpl.init();

        /**
	 * The meta object id for the '{@link crosswalk.Output <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.Output
	 * @see crosswalk.impl.CrosswalkPackageImpl#getOutput()
	 * @generated
	 */
        int OUTPUT = 9;

        /**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int OUTPUT_FEATURE_COUNT = 0;

        /**
	 * The meta object id for the '{@link crosswalk.impl.WalkWidgetImpl <em>Walk Widget</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.impl.WalkWidgetImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getWalkWidget()
	 * @generated
	 */
        int WALK_WIDGET = 6;

        /**
	 * The meta object id for the '{@link crosswalk.impl.TabbedDataFieldImpl <em>Tabbed Data Field</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.impl.TabbedDataFieldImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getTabbedDataField()
	 * @generated
	 */
        int TABBED_DATA_FIELD = 0;

        /**
	 * The meta object id for the '{@link crosswalk.impl.TrimWhitespaceImpl <em>Trim Whitespace</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.impl.TrimWhitespaceImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getTrimWhitespace()
	 * @generated
	 */
        int TRIM_WHITESPACE = 1;

        /**
	 * The meta object id for the '{@link crosswalk.OutputElement <em>Output Element</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.OutputElement
	 * @see crosswalk.impl.CrosswalkPackageImpl#getOutputElement()
	 * @generated
	 */
        int OUTPUT_ELEMENT = 5;

        /**
	 * The meta object id for the '{@link crosswalk.impl.CrossWalkImpl <em>Cross Walk</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.impl.CrossWalkImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getCrossWalk()
	 * @generated
	 */
        int CROSS_WALK = 4;

        /**
	 * The meta object id for the '{@link crosswalk.DataSource <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.DataSource
	 * @see crosswalk.impl.CrosswalkPackageImpl#getDataSource()
	 * @generated
	 */
        int DATA_SOURCE = 7;

        /**
	 * The meta object id for the '{@link crosswalk.Input <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.Input
	 * @see crosswalk.impl.CrosswalkPackageImpl#getInput()
	 * @generated
	 */
        int INPUT = 10;

        /**
	 * The meta object id for the '{@link crosswalk.impl.DataFieldImpl <em>Data Field</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.impl.DataFieldImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getDataField()
	 * @generated
	 */
        int DATA_FIELD = 8;

        /**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DATA_FIELD__SOURCE = OUTPUT_FEATURE_COUNT + 0;

        /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DATA_FIELD__LABEL = OUTPUT_FEATURE_COUNT + 1;

        /**
	 * The number of structural features of the '<em>Data Field</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DATA_FIELD_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 2;

        /**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int TABBED_DATA_FIELD__SOURCE = DATA_FIELD__SOURCE;

        /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int TABBED_DATA_FIELD__LABEL = DATA_FIELD__LABEL;

        /**
	 * The feature id for the '<em><b>Column Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int TABBED_DATA_FIELD__COLUMN_NUMBER = DATA_FIELD_FEATURE_COUNT + 0;

        /**
	 * The number of structural features of the '<em>Tabbed Data Field</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int TABBED_DATA_FIELD_FEATURE_COUNT = DATA_FIELD_FEATURE_COUNT + 1;

        /**
	 * The feature id for the '<em><b>Walk</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int WALK_WIDGET__WALK = 0;

        /**
	 * The number of structural features of the '<em>Walk Widget</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int WALK_WIDGET_FEATURE_COUNT = 1;

        /**
	 * The feature id for the '<em><b>Walk</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int TRIM_WHITESPACE__WALK = WALK_WIDGET__WALK;

        /**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int TRIM_WHITESPACE__OUTPUT = WALK_WIDGET_FEATURE_COUNT + 0;

        /**
	 * The number of structural features of the '<em>Trim Whitespace</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int TRIM_WHITESPACE_FEATURE_COUNT = WALK_WIDGET_FEATURE_COUNT + 1;

        /**
	 * The meta object id for the '{@link crosswalk.impl.CurrentUsernameImpl <em>Current Username</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.impl.CurrentUsernameImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getCurrentUsername()
	 * @generated
	 */
	int CURRENT_USERNAME = 2;

								/**
	 * The feature id for the '<em><b>Walk</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USERNAME__WALK = WALK_WIDGET__WALK;

								/**
	 * The number of structural features of the '<em>Current Username</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USERNAME_FEATURE_COUNT = WALK_WIDGET_FEATURE_COUNT + 0;

								/**
	 * The meta object id for the '{@link crosswalk.impl.CurrentDateImpl <em>Current Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.impl.CurrentDateImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getCurrentDate()
	 * @generated
	 */
	int CURRENT_DATE = 3;

								/**
	 * The feature id for the '<em><b>Walk</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_DATE__WALK = WALK_WIDGET__WALK;

								/**
	 * The number of structural features of the '<em>Current Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_DATE_FEATURE_COUNT = WALK_WIDGET_FEATURE_COUNT + 0;

								/**
	 * The meta object id for the '{@link crosswalk.impl.ContextProviderImpl <em>Context Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.impl.ContextProviderImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getContextProvider()
	 * @generated
	 */
	int CONTEXT_PROVIDER = 24;

								/**
	 * The feature id for the '<em><b>Output Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__OUTPUT_TYPE = 0;

								/**
	 * The feature id for the '<em><b>Current User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__CURRENT_USER = 1;

								/**
	 * The number of structural features of the '<em>Context Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER_FEATURE_COUNT = 2;

								/**
	 * The feature id for the '<em><b>Output Type</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CROSS_WALK__OUTPUT_TYPE = CONTEXT_PROVIDER__OUTPUT_TYPE;

								/**
	 * The feature id for the '<em><b>Current User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_WALK__CURRENT_USER = CONTEXT_PROVIDER__CURRENT_USER;

								/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CROSS_WALK__WIDGETS = CONTEXT_PROVIDER_FEATURE_COUNT + 0;

								/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CROSS_WALK__ELEMENTS = CONTEXT_PROVIDER_FEATURE_COUNT + 1;

								/**
	 * The feature id for the '<em><b>Exceptions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_WALK__EXCEPTIONS = CONTEXT_PROVIDER_FEATURE_COUNT + 2;

								/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CROSS_WALK__DATA_SOURCE = CONTEXT_PROVIDER_FEATURE_COUNT + 3;

        /**
	 * The number of structural features of the '<em>Cross Walk</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CROSS_WALK_FEATURE_COUNT = CONTEXT_PROVIDER_FEATURE_COUNT + 4;

        /**
	 * The feature id for the '<em><b>Walk</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int OUTPUT_ELEMENT__WALK = 0;

        /**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__EXCEPTION = 1;

								/**
	 * The number of structural features of the '<em>Output Element</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int OUTPUT_ELEMENT_FEATURE_COUNT = 2;

        /**
	 * The feature id for the '<em><b>Walk</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DATA_SOURCE__WALK = 0;

        /**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DATA_SOURCE__FIELDS = 1;

        /**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DATA_SOURCE_FEATURE_COUNT = 2;

        /**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int INPUT__OUTPUT = 0;

        /**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int INPUT_FEATURE_COUNT = 1;

        /**
	 * The meta object id for the '{@link crosswalk.RecordMatcherStrategy <em>Record Matcher Strategy</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.RecordMatcherStrategy
	 * @see crosswalk.impl.CrosswalkPackageImpl#getRecordMatcherStrategy()
	 * @generated
	 */
        int RECORD_MATCHER_STRATEGY = 11;

        /**
	 * The feature id for the '<em><b>Walk</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int RECORD_MATCHER_STRATEGY__WALK = WALK_WIDGET__WALK;

        /**
	 * The number of structural features of the '<em>Record Matcher Strategy</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int RECORD_MATCHER_STRATEGY_FEATURE_COUNT = WALK_WIDGET_FEATURE_COUNT + 0;

        /**
	 * The meta object id for the '{@link crosswalk.impl.OriginalNameRecordMatcherImpl <em>Original Name Record Matcher</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.impl.OriginalNameRecordMatcherImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getOriginalNameRecordMatcher()
	 * @generated
	 */
        int ORIGINAL_NAME_RECORD_MATCHER = 12;

        /**
	 * The feature id for the '<em><b>Walk</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int ORIGINAL_NAME_RECORD_MATCHER__WALK = RECORD_MATCHER_STRATEGY__WALK;

        /**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int ORIGINAL_NAME_RECORD_MATCHER__OUTPUT = RECORD_MATCHER_STRATEGY_FEATURE_COUNT + 0;

        /**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int ORIGINAL_NAME_RECORD_MATCHER__CASE_SENSITIVE = RECORD_MATCHER_STRATEGY_FEATURE_COUNT + 1;

        /**
	 * The feature id for the '<em><b>Include File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int ORIGINAL_NAME_RECORD_MATCHER__INCLUDE_FILE_EXTENSION = RECORD_MATCHER_STRATEGY_FEATURE_COUNT + 2;

        /**
	 * The feature id for the '<em><b>Base Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER = RECORD_MATCHER_STRATEGY_FEATURE_COUNT + 3;

        /**
	 * The number of structural features of the '<em>Original Name Record Matcher</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int ORIGINAL_NAME_RECORD_MATCHER_FEATURE_COUNT = RECORD_MATCHER_STRATEGY_FEATURE_COUNT + 4;

        /**
	 * The meta object id for the '{@link crosswalk.impl.DateRecognizerImpl <em>Date Recognizer</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.impl.DateRecognizerImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getDateRecognizer()
	 * @generated
	 */
        int DATE_RECOGNIZER = 13;

        /**
	 * The feature id for the '<em><b>Walk</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DATE_RECOGNIZER__WALK = WALK_WIDGET__WALK;

        /**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DATE_RECOGNIZER__OUTPUT = WALK_WIDGET_FEATURE_COUNT + 0;

        /**
	 * The feature id for the '<em><b>Formats</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_RECOGNIZER__FORMATS = WALK_WIDGET_FEATURE_COUNT + 1;

								/**
	 * The number of structural features of the '<em>Date Recognizer</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DATE_RECOGNIZER_FEATURE_COUNT = WALK_WIDGET_FEATURE_COUNT + 2;

        /**
	 * The meta object id for the '{@link crosswalk.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.impl.TextImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getText()
	 * @generated
	 */
        int TEXT = 14;

        /**
	 * The feature id for the '<em><b>Walk</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int TEXT__WALK = OUTPUT_FEATURE_COUNT + 0;

        /**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int TEXT__VALUE = OUTPUT_FEATURE_COUNT + 1;

        /**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int TEXT_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 2;

        /**
	 * The meta object id for the '{@link crosswalk.impl.DelimitedFileImpl <em>Delimited File</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.impl.DelimitedFileImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getDelimitedFile()
	 * @generated
	 */
        int DELIMITED_FILE = 15;

        /**
	 * The feature id for the '<em><b>Walk</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DELIMITED_FILE__WALK = DATA_SOURCE__WALK;

        /**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DELIMITED_FILE__FIELDS = DATA_SOURCE__FIELDS;

        /**
	 * The feature id for the '<em><b>Source File</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DELIMITED_FILE__SOURCE_FILE = DATA_SOURCE_FEATURE_COUNT + 0;

        /**
	 * The feature id for the '<em><b>First Data Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIMITED_FILE__FIRST_DATA_ROW = DATA_SOURCE_FEATURE_COUNT + 1;

								/**
	 * The feature id for the '<em><b>Header Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DELIMITED_FILE__HEADER_ROW = DATA_SOURCE_FEATURE_COUNT + 2;

        /**
	 * The feature id for the '<em><b>Text Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DELIMITED_FILE__TEXT_ENCODING = DATA_SOURCE_FEATURE_COUNT + 3;

        /**
	 * The feature id for the '<em><b>Field Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DELIMITED_FILE__FIELD_DELIMITER = DATA_SOURCE_FEATURE_COUNT + 4;

        /**
	 * The feature id for the '<em><b>Text Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DELIMITED_FILE__TEXT_DELIMITER = DATA_SOURCE_FEATURE_COUNT + 5;

        /**
	 * The feature id for the '<em><b>Last Data Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIMITED_FILE__LAST_DATA_ROW = DATA_SOURCE_FEATURE_COUNT + 6;

								/**
	 * The number of structural features of the '<em>Delimited File</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DELIMITED_FILE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 7;

        /**
	 * The meta object id for the '{@link crosswalk.impl.MappedElementImpl <em>Mapped Element</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.impl.MappedElementImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getMappedElement()
	 * @generated
	 */
        int MAPPED_ELEMENT = 16;

        /**
	 * The feature id for the '<em><b>Walk</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int MAPPED_ELEMENT__WALK = OUTPUT_ELEMENT__WALK;

        /**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ELEMENT__EXCEPTION = OUTPUT_ELEMENT__EXCEPTION;

								/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int MAPPED_ELEMENT__CHILD_ELEMENTS = OUTPUT_ELEMENT_FEATURE_COUNT + 0;

        /**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int MAPPED_ELEMENT__ATTRIBUTES = OUTPUT_ELEMENT_FEATURE_COUNT + 1;

        /**
	 * The feature id for the '<em><b>Mapped Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int MAPPED_ELEMENT__MAPPED_FEATURE = OUTPUT_ELEMENT_FEATURE_COUNT + 2;

        /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int MAPPED_ELEMENT__PARENT = OUTPUT_ELEMENT_FEATURE_COUNT + 3;

        /**
	 * The number of structural features of the '<em>Mapped Element</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int MAPPED_ELEMENT_FEATURE_COUNT = OUTPUT_ELEMENT_FEATURE_COUNT + 4;

        /**
	 * The meta object id for the '{@link crosswalk.impl.MappedAttributeImpl <em>Mapped Attribute</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.impl.MappedAttributeImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getMappedAttribute()
	 * @generated
	 */
        int MAPPED_ATTRIBUTE = 17;

        /**
	 * The feature id for the '<em><b>Walk</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int MAPPED_ATTRIBUTE__WALK = OUTPUT_ELEMENT__WALK;

        /**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ATTRIBUTE__EXCEPTION = OUTPUT_ELEMENT__EXCEPTION;

								/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int MAPPED_ATTRIBUTE__OUTPUT = OUTPUT_ELEMENT_FEATURE_COUNT + 0;

        /**
	 * The feature id for the '<em><b>Mapped Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int MAPPED_ATTRIBUTE__MAPPED_FEATURE = OUTPUT_ELEMENT_FEATURE_COUNT + 1;

        /**
	 * The feature id for the '<em><b>Conversion Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int MAPPED_ATTRIBUTE__CONVERSION_STRATEGY = OUTPUT_ELEMENT_FEATURE_COUNT + 2;

        /**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int MAPPED_ATTRIBUTE__DEFAULT_VALUE = OUTPUT_ELEMENT_FEATURE_COUNT + 3;

        /**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ATTRIBUTE__REQUIRED = OUTPUT_ELEMENT_FEATURE_COUNT + 4;

								/**
	 * The number of structural features of the '<em>Mapped Attribute</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int MAPPED_ATTRIBUTE_FEATURE_COUNT = OUTPUT_ELEMENT_FEATURE_COUNT + 5;

        /**
	 * The meta object id for the '{@link crosswalk.ConversionStrategy <em>Conversion Strategy</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.ConversionStrategy
	 * @see crosswalk.impl.CrosswalkPackageImpl#getConversionStrategy()
	 * @generated
	 */
        int CONVERSION_STRATEGY = 18;

        /**
	 * The number of structural features of the '<em>Conversion Strategy</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int CONVERSION_STRATEGY_FEATURE_COUNT = 0;

        /**
	 * The meta object id for the '{@link crosswalk.impl.DateToISO8601StringConversionImpl <em>Date To ISO8601 String Conversion</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.impl.DateToISO8601StringConversionImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getDateToISO8601StringConversion()
	 * @generated
	 */
        int DATE_TO_ISO8601_STRING_CONVERSION = 19;

        /**
	 * The number of structural features of the '<em>Date To ISO8601 String Conversion</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int DATE_TO_ISO8601_STRING_CONVERSION_FEATURE_COUNT = CONVERSION_STRATEGY_FEATURE_COUNT + 0;

        /**
	 * The meta object id for the '{@link crosswalk.impl.DictionaryImpl <em>Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.impl.DictionaryImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getDictionary()
	 * @generated
	 */
	int DICTIONARY = 20;

								/**
	 * The feature id for the '<em><b>Output Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__OUTPUT_TYPE = CONTEXT_PROVIDER__OUTPUT_TYPE;

								/**
	 * The feature id for the '<em><b>Current User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__CURRENT_USER = CONTEXT_PROVIDER__CURRENT_USER;

								/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__NAME = CONTEXT_PROVIDER_FEATURE_COUNT + 0;

								/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__BLOCKS = CONTEXT_PROVIDER_FEATURE_COUNT + 1;

								/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__DESCRIPTION = CONTEXT_PROVIDER_FEATURE_COUNT + 2;

								/**
	 * The number of structural features of the '<em>Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_FEATURE_COUNT = CONTEXT_PROVIDER_FEATURE_COUNT + 3;

								/**
	 * The meta object id for the '{@link crosswalk.impl.MetadataBlockImpl <em>Metadata Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.impl.MetadataBlockImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getMetadataBlock()
	 * @generated
	 */
	int METADATA_BLOCK = 21;

								/**
	 * The feature id for the '<em><b>Walk</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BLOCK__WALK = OUTPUT_ELEMENT__WALK;

								/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BLOCK__EXCEPTION = OUTPUT_ELEMENT__EXCEPTION;

								/**
	 * The feature id for the '<em><b>Output Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BLOCK__OUTPUT_TYPE = OUTPUT_ELEMENT_FEATURE_COUNT + 0;

								/**
	 * The feature id for the '<em><b>Current User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BLOCK__CURRENT_USER = OUTPUT_ELEMENT_FEATURE_COUNT + 1;

								/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BLOCK__WIDGETS = OUTPUT_ELEMENT_FEATURE_COUNT + 2;

								/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BLOCK__ELEMENTS = OUTPUT_ELEMENT_FEATURE_COUNT + 3;

								/**
	 * The feature id for the '<em><b>Exceptions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BLOCK__EXCEPTIONS = OUTPUT_ELEMENT_FEATURE_COUNT + 4;

								/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BLOCK__NAME = OUTPUT_ELEMENT_FEATURE_COUNT + 5;

								/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BLOCK__DESCRIPTION = OUTPUT_ELEMENT_FEATURE_COUNT + 6;

								/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BLOCK__PORTS = OUTPUT_ELEMENT_FEATURE_COUNT + 7;

								/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BLOCK__REQUIRED = OUTPUT_ELEMENT_FEATURE_COUNT + 8;

								/**
	 * The feature id for the '<em><b>Max Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BLOCK__MAX_REPEAT = OUTPUT_ELEMENT_FEATURE_COUNT + 9;

								/**
	 * The number of structural features of the '<em>Metadata Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BLOCK_FEATURE_COUNT = OUTPUT_ELEMENT_FEATURE_COUNT + 10;

								/**
	 * The meta object id for the '{@link crosswalk.impl.InputFieldImpl <em>Input Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.impl.InputFieldImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getInputField()
	 * @generated
	 */
	int INPUT_FIELD = 22;

								/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__OUTPUT = OUTPUT_FEATURE_COUNT + 0;

								/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__LABEL = OUTPUT_FEATURE_COUNT + 1;

								/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__USAGE = OUTPUT_FEATURE_COUNT + 2;

								/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__REQUIRED = OUTPUT_FEATURE_COUNT + 3;

								/**
	 * The feature id for the '<em><b>Entered Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__ENTERED_VALUE = OUTPUT_FEATURE_COUNT + 4;

								/**
	 * The number of structural features of the '<em>Input Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 5;

								/**
	 * The meta object id for the '{@link crosswalk.impl.TextInputFieldImpl <em>Text Input Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.impl.TextInputFieldImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getTextInputField()
	 * @generated
	 */
	int TEXT_INPUT_FIELD = 23;

								/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FIELD__OUTPUT = INPUT_FIELD__OUTPUT;

								/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FIELD__LABEL = INPUT_FIELD__LABEL;

								/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FIELD__USAGE = INPUT_FIELD__USAGE;

								/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FIELD__REQUIRED = INPUT_FIELD__REQUIRED;

								/**
	 * The feature id for the '<em><b>Entered Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FIELD__ENTERED_VALUE = INPUT_FIELD__ENTERED_VALUE;

								/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FIELD__PREFERRED_SIZE = INPUT_FIELD_FEATURE_COUNT + 0;

								/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FIELD__MAX_SIZE = INPUT_FIELD_FEATURE_COUNT + 1;

								/**
	 * The feature id for the '<em><b>Vocabulary URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FIELD__VOCABULARY_URL = INPUT_FIELD_FEATURE_COUNT + 2;

								/**
	 * The feature id for the '<em><b>Allow Free Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FIELD__ALLOW_FREE_TEXT = INPUT_FIELD_FEATURE_COUNT + 3;

								/**
	 * The feature id for the '<em><b>Valid Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FIELD__VALID_VALUES = INPUT_FIELD_FEATURE_COUNT + 4;

								/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FIELD__ROWS = INPUT_FIELD_FEATURE_COUNT + 5;

								/**
	 * The number of structural features of the '<em>Text Input Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FIELD_FEATURE_COUNT = INPUT_FIELD_FEATURE_COUNT + 6;

								/**
	 * The meta object id for the '{@link crosswalk.MappingContainer <em>Mapping Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.MappingContainer
	 * @see crosswalk.impl.CrosswalkPackageImpl#getMappingContainer()
	 * @generated
	 */
	int MAPPING_CONTAINER = 25;

								/**
	 * The feature id for the '<em><b>Output Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER__OUTPUT_TYPE = CONTEXT_PROVIDER__OUTPUT_TYPE;

								/**
	 * The feature id for the '<em><b>Current User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER__CURRENT_USER = CONTEXT_PROVIDER__CURRENT_USER;

								/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER__WIDGETS = CONTEXT_PROVIDER_FEATURE_COUNT + 0;

								/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER__ELEMENTS = CONTEXT_PROVIDER_FEATURE_COUNT + 1;

								/**
	 * The feature id for the '<em><b>Exceptions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER__EXCEPTIONS = CONTEXT_PROVIDER_FEATURE_COUNT + 2;

								/**
	 * The number of structural features of the '<em>Mapping Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_FEATURE_COUNT = CONTEXT_PROVIDER_FEATURE_COUNT + 3;

								/**
	 * The meta object id for the '{@link crosswalk.impl.EditingContainerImpl <em>Editing Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.impl.EditingContainerImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getEditingContainer()
	 * @generated
	 */
	int EDITING_CONTAINER = 26;

								/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITING_CONTAINER__MODEL = 0;

								/**
	 * The number of structural features of the '<em>Editing Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITING_CONTAINER_FEATURE_COUNT = 1;

								/**
	 * The meta object id for the '{@link crosswalk.Editable <em>Editable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.Editable
	 * @see crosswalk.impl.CrosswalkPackageImpl#getEditable()
	 * @generated
	 */
	int EDITABLE = 27;

								/**
	 * The number of structural features of the '<em>Editable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_FEATURE_COUNT = 0;

								/**
	 * The meta object id for the '{@link crosswalk.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.impl.FormImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 28;

								/**
	 * The feature id for the '<em><b>Output Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__OUTPUT_TYPE = EDITABLE_FEATURE_COUNT + 0;

								/**
	 * The feature id for the '<em><b>Current User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CURRENT_USER = EDITABLE_FEATURE_COUNT + 1;

								/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ELEMENTS = EDITABLE_FEATURE_COUNT + 2;

								/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TITLE = EDITABLE_FEATURE_COUNT + 3;

								/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__DESCRIPTION = EDITABLE_FEATURE_COUNT + 4;

								/**
	 * The feature id for the '<em><b>Email Deposit Notice To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__EMAIL_DEPOSIT_NOTICE_TO = EDITABLE_FEATURE_COUNT + 5;

								/**
	 * The feature id for the '<em><b>Deposit Container Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__DEPOSIT_CONTAINER_ID = EDITABLE_FEATURE_COUNT + 6;

								/**
	 * The feature id for the '<em><b>Authorized Groups</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__AUTHORIZED_GROUPS = EDITABLE_FEATURE_COUNT + 7;

								/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = EDITABLE_FEATURE_COUNT + 8;

								/**
	 * The meta object id for the '{@link crosswalk.FormElement <em>Form Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.FormElement
	 * @see crosswalk.impl.CrosswalkPackageImpl#getFormElement()
	 * @generated
	 */
	int FORM_ELEMENT = 29;

								/**
	 * The number of structural features of the '<em>Form Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT_FEATURE_COUNT = 0;

								/**
	 * The meta object id for the '{@link crosswalk.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.impl.ParagraphImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 30;

								/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__HEADING = FORM_ELEMENT_FEATURE_COUNT + 0;

								/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = FORM_ELEMENT_FEATURE_COUNT + 1;

								/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 2;

								/**
	 * The meta object id for the '{@link crosswalk.impl.DateInputFieldImpl <em>Date Input Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.impl.DateInputFieldImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getDateInputField()
	 * @generated
	 */
	int DATE_INPUT_FIELD = 31;

								/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_INPUT_FIELD__OUTPUT = INPUT_FIELD__OUTPUT;

								/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_INPUT_FIELD__LABEL = INPUT_FIELD__LABEL;

								/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_INPUT_FIELD__USAGE = INPUT_FIELD__USAGE;

								/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_INPUT_FIELD__REQUIRED = INPUT_FIELD__REQUIRED;

								/**
	 * The feature id for the '<em><b>Entered Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_INPUT_FIELD__ENTERED_VALUE = INPUT_FIELD__ENTERED_VALUE;

								/**
	 * The feature id for the '<em><b>Date Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_INPUT_FIELD__DATE_PRECISION = INPUT_FIELD_FEATURE_COUNT + 0;

								/**
	 * The number of structural features of the '<em>Date Input Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_INPUT_FIELD_FEATURE_COUNT = INPUT_FIELD_FEATURE_COUNT + 1;

								/**
	 * The meta object id for the '{@link crosswalk.impl.MultiLineTextInputFieldImpl <em>Multi Line Text Input Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.impl.MultiLineTextInputFieldImpl
	 * @see crosswalk.impl.CrosswalkPackageImpl#getMultiLineTextInputField()
	 * @generated
	 */
	int MULTI_LINE_TEXT_INPUT_FIELD = 32;

								/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT_INPUT_FIELD__OUTPUT = INPUT_FIELD__OUTPUT;

								/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT_INPUT_FIELD__LABEL = INPUT_FIELD__LABEL;

								/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT_INPUT_FIELD__USAGE = INPUT_FIELD__USAGE;

								/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT_INPUT_FIELD__REQUIRED = INPUT_FIELD__REQUIRED;

								/**
	 * The feature id for the '<em><b>Entered Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT_INPUT_FIELD__ENTERED_VALUE = INPUT_FIELD__ENTERED_VALUE;

								/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT_INPUT_FIELD__MAX_SIZE = INPUT_FIELD_FEATURE_COUNT + 0;

								/**
	 * The number of structural features of the '<em>Multi Line Text Input Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT_INPUT_FIELD_FEATURE_COUNT = INPUT_FIELD_FEATURE_COUNT + 1;

								/**
	 * The meta object id for the '{@link crosswalk.DatePrecision <em>Date Precision</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crosswalk.DatePrecision
	 * @see crosswalk.impl.CrosswalkPackageImpl#getDatePrecision()
	 * @generated
	 */
	int DATE_PRECISION = 33;

								/**
	 * The meta object id for the '<em>Data Exception</em>' data type.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.DataException
	 * @see crosswalk.impl.CrosswalkPackageImpl#getDataException()
	 * @generated
	 */
        int DATA_EXCEPTION = 34;

        /**
	 * The meta object id for the '<em>Record Matches</em>' data type.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.RecordMatches
	 * @see crosswalk.impl.CrosswalkPackageImpl#getRecordMatches()
	 * @generated
	 */
        int RECORD_MATCHES = 35;

        /**
	 * The meta object id for the '<em>Record Out Of Range Exception</em>' data type.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see crosswalk.RecordOutOfRangeException
	 * @see crosswalk.impl.CrosswalkPackageImpl#getRecordOutOfRangeException()
	 * @generated
	 */
        int RECORD_OUT_OF_RANGE_EXCEPTION = 36;

        /**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see crosswalk.impl.CrosswalkPackageImpl#getURI()
	 * @generated
	 */
	int URI = 37;

								/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Throwable
	 * @see crosswalk.impl.CrosswalkPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 38;

								/**
	 * The meta object id for the '<em>Clazz</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see crosswalk.impl.CrosswalkPackageImpl#getClazz()
	 * @generated
	 */
	int CLAZZ = 39;

								/**
	 * Returns the meta object for class '{@link crosswalk.TabbedDataField <em>Tabbed Data Field</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabbed Data Field</em>'.
	 * @see crosswalk.TabbedDataField
	 * @generated
	 */
        EClass getTabbedDataField();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.TabbedDataField#getColumnNumber <em>Column Number</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Number</em>'.
	 * @see crosswalk.TabbedDataField#getColumnNumber()
	 * @see #getTabbedDataField()
	 * @generated
	 */
        EAttribute getTabbedDataField_ColumnNumber();

        /**
	 * Returns the meta object for class '{@link crosswalk.TrimWhitespace <em>Trim Whitespace</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trim Whitespace</em>'.
	 * @see crosswalk.TrimWhitespace
	 * @generated
	 */
        EClass getTrimWhitespace();

        /**
	 * Returns the meta object for class '{@link crosswalk.CurrentUsername <em>Current Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Username</em>'.
	 * @see crosswalk.CurrentUsername
	 * @generated
	 */
	EClass getCurrentUsername();

								/**
	 * Returns the meta object for class '{@link crosswalk.CurrentDate <em>Current Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Date</em>'.
	 * @see crosswalk.CurrentDate
	 * @generated
	 */
	EClass getCurrentDate();

								/**
	 * Returns the meta object for class '{@link crosswalk.CrossWalk <em>Cross Walk</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Walk</em>'.
	 * @see crosswalk.CrossWalk
	 * @generated
	 */
        EClass getCrossWalk();

        /**
	 * Returns the meta object for the containment reference '{@link crosswalk.CrossWalk#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Source</em>'.
	 * @see crosswalk.CrossWalk#getDataSource()
	 * @see #getCrossWalk()
	 * @generated
	 */
        EReference getCrossWalk_DataSource();

        /**
	 * Returns the meta object for class '{@link crosswalk.OutputElement <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Element</em>'.
	 * @see crosswalk.OutputElement
	 * @generated
	 */
        EClass getOutputElement();

        /**
	 * Returns the meta object for the container reference '{@link crosswalk.OutputElement#getWalk <em>Walk</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Walk</em>'.
	 * @see crosswalk.OutputElement#getWalk()
	 * @see #getOutputElement()
	 * @generated
	 */
        EReference getOutputElement_Walk();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.OutputElement#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception</em>'.
	 * @see crosswalk.OutputElement#getException()
	 * @see #getOutputElement()
	 * @generated
	 */
	EAttribute getOutputElement_Exception();

								/**
	 * Returns the meta object for class '{@link crosswalk.WalkWidget <em>Walk Widget</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Walk Widget</em>'.
	 * @see crosswalk.WalkWidget
	 * @generated
	 */
        EClass getWalkWidget();

        /**
	 * Returns the meta object for the container reference '{@link crosswalk.WalkWidget#getWalk <em>Walk</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Walk</em>'.
	 * @see crosswalk.WalkWidget#getWalk()
	 * @see #getWalkWidget()
	 * @generated
	 */
        EReference getWalkWidget_Walk();

        /**
	 * Returns the meta object for class '{@link crosswalk.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see crosswalk.DataSource
	 * @generated
	 */
        EClass getDataSource();

        /**
	 * Returns the meta object for the container reference '{@link crosswalk.DataSource#getWalk <em>Walk</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Walk</em>'.
	 * @see crosswalk.DataSource#getWalk()
	 * @see #getDataSource()
	 * @generated
	 */
        EReference getDataSource_Walk();

        /**
	 * Returns the meta object for the containment reference list '{@link crosswalk.DataSource#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see crosswalk.DataSource#getFields()
	 * @see #getDataSource()
	 * @generated
	 */
        EReference getDataSource_Fields();

        /**
	 * Returns the meta object for class '{@link crosswalk.DataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Field</em>'.
	 * @see crosswalk.DataField
	 * @generated
	 */
        EClass getDataField();

        /**
	 * Returns the meta object for the container reference '{@link crosswalk.DataField#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see crosswalk.DataField#getSource()
	 * @see #getDataField()
	 * @generated
	 */
        EReference getDataField_Source();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.DataField#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see crosswalk.DataField#getLabel()
	 * @see #getDataField()
	 * @generated
	 */
        EAttribute getDataField_Label();

        /**
	 * Returns the meta object for class '{@link crosswalk.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see crosswalk.Output
	 * @generated
	 */
        EClass getOutput();

        /**
	 * Returns the meta object for class '{@link crosswalk.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see crosswalk.Input
	 * @generated
	 */
        EClass getInput();

        /**
	 * Returns the meta object for the reference '{@link crosswalk.Input#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see crosswalk.Input#getOutput()
	 * @see #getInput()
	 * @generated
	 */
        EReference getInput_Output();

        /**
	 * Returns the meta object for class '{@link crosswalk.RecordMatcherStrategy <em>Record Matcher Strategy</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Matcher Strategy</em>'.
	 * @see crosswalk.RecordMatcherStrategy
	 * @generated
	 */
        EClass getRecordMatcherStrategy();

        /**
	 * Returns the meta object for class '{@link crosswalk.OriginalNameRecordMatcher <em>Original Name Record Matcher</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Original Name Record Matcher</em>'.
	 * @see crosswalk.OriginalNameRecordMatcher
	 * @generated
	 */
        EClass getOriginalNameRecordMatcher();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.OriginalNameRecordMatcher#isCaseSensitive <em>Case Sensitive</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Sensitive</em>'.
	 * @see crosswalk.OriginalNameRecordMatcher#isCaseSensitive()
	 * @see #getOriginalNameRecordMatcher()
	 * @generated
	 */
        EAttribute getOriginalNameRecordMatcher_CaseSensitive();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.OriginalNameRecordMatcher#isIncludeFileExtension <em>Include File Extension</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include File Extension</em>'.
	 * @see crosswalk.OriginalNameRecordMatcher#isIncludeFileExtension()
	 * @see #getOriginalNameRecordMatcher()
	 * @generated
	 */
        EAttribute getOriginalNameRecordMatcher_IncludeFileExtension();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.OriginalNameRecordMatcher#getBaseFolder <em>Base Folder</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Folder</em>'.
	 * @see crosswalk.OriginalNameRecordMatcher#getBaseFolder()
	 * @see #getOriginalNameRecordMatcher()
	 * @generated
	 */
        EAttribute getOriginalNameRecordMatcher_BaseFolder();

        /**
	 * Returns the meta object for class '{@link crosswalk.DateRecognizer <em>Date Recognizer</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Recognizer</em>'.
	 * @see crosswalk.DateRecognizer
	 * @generated
	 */
        EClass getDateRecognizer();

        /**
	 * Returns the meta object for the attribute list '{@link crosswalk.DateRecognizer#getFormats <em>Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formats</em>'.
	 * @see crosswalk.DateRecognizer#getFormats()
	 * @see #getDateRecognizer()
	 * @generated
	 */
	EAttribute getDateRecognizer_Formats();

								/**
	 * Returns the meta object for class '{@link crosswalk.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see crosswalk.Text
	 * @generated
	 */
        EClass getText();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.Text#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crosswalk.Text#getValue()
	 * @see #getText()
	 * @generated
	 */
        EAttribute getText_Value();

        /**
	 * Returns the meta object for class '{@link crosswalk.DelimitedFile <em>Delimited File</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delimited File</em>'.
	 * @see crosswalk.DelimitedFile
	 * @generated
	 */
        EClass getDelimitedFile();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.DelimitedFile#getSourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source File</em>'.
	 * @see crosswalk.DelimitedFile#getSourceFile()
	 * @see #getDelimitedFile()
	 * @generated
	 */
        EAttribute getDelimitedFile_SourceFile();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.DelimitedFile#getFirstDataRow <em>First Data Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Data Row</em>'.
	 * @see crosswalk.DelimitedFile#getFirstDataRow()
	 * @see #getDelimitedFile()
	 * @generated
	 */
	EAttribute getDelimitedFile_FirstDataRow();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.DelimitedFile#isHeaderRow <em>Header Row</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Row</em>'.
	 * @see crosswalk.DelimitedFile#isHeaderRow()
	 * @see #getDelimitedFile()
	 * @generated
	 */
        EAttribute getDelimitedFile_HeaderRow();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.DelimitedFile#getTextEncoding <em>Text Encoding</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Encoding</em>'.
	 * @see crosswalk.DelimitedFile#getTextEncoding()
	 * @see #getDelimitedFile()
	 * @generated
	 */
        EAttribute getDelimitedFile_TextEncoding();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.DelimitedFile#getFieldDelimiter <em>Field Delimiter</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Delimiter</em>'.
	 * @see crosswalk.DelimitedFile#getFieldDelimiter()
	 * @see #getDelimitedFile()
	 * @generated
	 */
        EAttribute getDelimitedFile_FieldDelimiter();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.DelimitedFile#getTextDelimiter <em>Text Delimiter</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Delimiter</em>'.
	 * @see crosswalk.DelimitedFile#getTextDelimiter()
	 * @see #getDelimitedFile()
	 * @generated
	 */
        EAttribute getDelimitedFile_TextDelimiter();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.DelimitedFile#getLastDataRow <em>Last Data Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Data Row</em>'.
	 * @see crosswalk.DelimitedFile#getLastDataRow()
	 * @see #getDelimitedFile()
	 * @generated
	 */
	EAttribute getDelimitedFile_LastDataRow();

								/**
	 * Returns the meta object for class '{@link crosswalk.MappedElement <em>Mapped Element</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped Element</em>'.
	 * @see crosswalk.MappedElement
	 * @generated
	 */
        EClass getMappedElement();

        /**
	 * Returns the meta object for the containment reference list '{@link crosswalk.MappedElement#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see crosswalk.MappedElement#getChildElements()
	 * @see #getMappedElement()
	 * @generated
	 */
        EReference getMappedElement_ChildElements();

        /**
	 * Returns the meta object for the containment reference list '{@link crosswalk.MappedElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see crosswalk.MappedElement#getAttributes()
	 * @see #getMappedElement()
	 * @generated
	 */
        EReference getMappedElement_Attributes();

        /**
	 * Returns the meta object for the reference '{@link crosswalk.MappedElement#getMappedFeature <em>Mapped Feature</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapped Feature</em>'.
	 * @see crosswalk.MappedElement#getMappedFeature()
	 * @see #getMappedElement()
	 * @generated
	 */
        EReference getMappedElement_MappedFeature();

        /**
	 * Returns the meta object for the container reference '{@link crosswalk.MappedElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see crosswalk.MappedElement#getParent()
	 * @see #getMappedElement()
	 * @generated
	 */
        EReference getMappedElement_Parent();

        /**
	 * Returns the meta object for class '{@link crosswalk.MappedAttribute <em>Mapped Attribute</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped Attribute</em>'.
	 * @see crosswalk.MappedAttribute
	 * @generated
	 */
        EClass getMappedAttribute();

        /**
	 * Returns the meta object for the reference '{@link crosswalk.MappedAttribute#getMappedFeature <em>Mapped Feature</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapped Feature</em>'.
	 * @see crosswalk.MappedAttribute#getMappedFeature()
	 * @see #getMappedAttribute()
	 * @generated
	 */
        EReference getMappedAttribute_MappedFeature();

        /**
	 * Returns the meta object for the containment reference '{@link crosswalk.MappedAttribute#getConversionStrategy <em>Conversion Strategy</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversion Strategy</em>'.
	 * @see crosswalk.MappedAttribute#getConversionStrategy()
	 * @see #getMappedAttribute()
	 * @generated
	 */
        EReference getMappedAttribute_ConversionStrategy();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.MappedAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see crosswalk.MappedAttribute#getDefaultValue()
	 * @see #getMappedAttribute()
	 * @generated
	 */
        EAttribute getMappedAttribute_DefaultValue();

        /**
	 * Returns the meta object for the attribute '{@link crosswalk.MappedAttribute#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see crosswalk.MappedAttribute#isRequired()
	 * @see #getMappedAttribute()
	 * @generated
	 */
	EAttribute getMappedAttribute_Required();

								/**
	 * Returns the meta object for class '{@link crosswalk.ConversionStrategy <em>Conversion Strategy</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion Strategy</em>'.
	 * @see crosswalk.ConversionStrategy
	 * @generated
	 */
        EClass getConversionStrategy();

        /**
	 * Returns the meta object for class '{@link crosswalk.DateToISO8601StringConversion <em>Date To ISO8601 String Conversion</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date To ISO8601 String Conversion</em>'.
	 * @see crosswalk.DateToISO8601StringConversion
	 * @generated
	 */
        EClass getDateToISO8601StringConversion();

        /**
	 * Returns the meta object for class '{@link crosswalk.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary</em>'.
	 * @see crosswalk.Dictionary
	 * @generated
	 */
	EClass getDictionary();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.Dictionary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crosswalk.Dictionary#getName()
	 * @see #getDictionary()
	 * @generated
	 */
	EAttribute getDictionary_Name();

								/**
	 * Returns the meta object for the containment reference list '{@link crosswalk.Dictionary#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see crosswalk.Dictionary#getBlocks()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_Blocks();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.Dictionary#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see crosswalk.Dictionary#getDescription()
	 * @see #getDictionary()
	 * @generated
	 */
	EAttribute getDictionary_Description();

								/**
	 * Returns the meta object for class '{@link crosswalk.MetadataBlock <em>Metadata Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Block</em>'.
	 * @see crosswalk.MetadataBlock
	 * @generated
	 */
	EClass getMetadataBlock();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.MetadataBlock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crosswalk.MetadataBlock#getName()
	 * @see #getMetadataBlock()
	 * @generated
	 */
	EAttribute getMetadataBlock_Name();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.MetadataBlock#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see crosswalk.MetadataBlock#getDescription()
	 * @see #getMetadataBlock()
	 * @generated
	 */
	EAttribute getMetadataBlock_Description();

								/**
	 * Returns the meta object for the containment reference list '{@link crosswalk.MetadataBlock#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see crosswalk.MetadataBlock#getPorts()
	 * @see #getMetadataBlock()
	 * @generated
	 */
	EReference getMetadataBlock_Ports();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.MetadataBlock#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see crosswalk.MetadataBlock#isRequired()
	 * @see #getMetadataBlock()
	 * @generated
	 */
	EAttribute getMetadataBlock_Required();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.MetadataBlock#getMaxRepeat <em>Max Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Repeat</em>'.
	 * @see crosswalk.MetadataBlock#getMaxRepeat()
	 * @see #getMetadataBlock()
	 * @generated
	 */
	EAttribute getMetadataBlock_MaxRepeat();

								/**
	 * Returns the meta object for class '{@link crosswalk.InputField <em>Input Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Field</em>'.
	 * @see crosswalk.InputField
	 * @generated
	 */
	EClass getInputField();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.InputField#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see crosswalk.InputField#getLabel()
	 * @see #getInputField()
	 * @generated
	 */
	EAttribute getInputField_Label();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.InputField#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see crosswalk.InputField#getUsage()
	 * @see #getInputField()
	 * @generated
	 */
	EAttribute getInputField_Usage();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.InputField#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see crosswalk.InputField#isRequired()
	 * @see #getInputField()
	 * @generated
	 */
	EAttribute getInputField_Required();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.InputField#getEnteredValue <em>Entered Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entered Value</em>'.
	 * @see crosswalk.InputField#getEnteredValue()
	 * @see #getInputField()
	 * @generated
	 */
	EAttribute getInputField_EnteredValue();

								/**
	 * Returns the meta object for class '{@link crosswalk.TextInputField <em>Text Input Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input Field</em>'.
	 * @see crosswalk.TextInputField
	 * @generated
	 */
	EClass getTextInputField();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.TextInputField#getPreferredSize <em>Preferred Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferred Size</em>'.
	 * @see crosswalk.TextInputField#getPreferredSize()
	 * @see #getTextInputField()
	 * @generated
	 */
	EAttribute getTextInputField_PreferredSize();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.TextInputField#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Size</em>'.
	 * @see crosswalk.TextInputField#getMaxSize()
	 * @see #getTextInputField()
	 * @generated
	 */
	EAttribute getTextInputField_MaxSize();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.TextInputField#getVocabularyURL <em>Vocabulary URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vocabulary URL</em>'.
	 * @see crosswalk.TextInputField#getVocabularyURL()
	 * @see #getTextInputField()
	 * @generated
	 */
	EAttribute getTextInputField_VocabularyURL();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.TextInputField#isAllowFreeText <em>Allow Free Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Free Text</em>'.
	 * @see crosswalk.TextInputField#isAllowFreeText()
	 * @see #getTextInputField()
	 * @generated
	 */
	EAttribute getTextInputField_AllowFreeText();

								/**
	 * Returns the meta object for the attribute list '{@link crosswalk.TextInputField#getValidValues <em>Valid Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valid Values</em>'.
	 * @see crosswalk.TextInputField#getValidValues()
	 * @see #getTextInputField()
	 * @generated
	 */
	EAttribute getTextInputField_ValidValues();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.TextInputField#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see crosswalk.TextInputField#getRows()
	 * @see #getTextInputField()
	 * @generated
	 */
	EAttribute getTextInputField_Rows();

								/**
	 * Returns the meta object for class '{@link crosswalk.ContextProvider <em>Context Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Provider</em>'.
	 * @see crosswalk.ContextProvider
	 * @generated
	 */
	EClass getContextProvider();

								/**
	 * Returns the meta object for the reference '{@link crosswalk.ContextProvider#getOutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Type</em>'.
	 * @see crosswalk.ContextProvider#getOutputType()
	 * @see #getContextProvider()
	 * @generated
	 */
	EReference getContextProvider_OutputType();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.ContextProvider#getCurrentUser <em>Current User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current User</em>'.
	 * @see crosswalk.ContextProvider#getCurrentUser()
	 * @see #getContextProvider()
	 * @generated
	 */
	EAttribute getContextProvider_CurrentUser();

								/**
	 * Returns the meta object for class '{@link crosswalk.MappingContainer <em>Mapping Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Container</em>'.
	 * @see crosswalk.MappingContainer
	 * @generated
	 */
	EClass getMappingContainer();

								/**
	 * Returns the meta object for the containment reference list '{@link crosswalk.MappingContainer#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see crosswalk.MappingContainer#getWidgets()
	 * @see #getMappingContainer()
	 * @generated
	 */
	EReference getMappingContainer_Widgets();

								/**
	 * Returns the meta object for the containment reference list '{@link crosswalk.MappingContainer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see crosswalk.MappingContainer#getElements()
	 * @see #getMappingContainer()
	 * @generated
	 */
	EReference getMappingContainer_Elements();

								/**
	 * Returns the meta object for the attribute list '{@link crosswalk.MappingContainer#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exceptions</em>'.
	 * @see crosswalk.MappingContainer#getExceptions()
	 * @see #getMappingContainer()
	 * @generated
	 */
	EAttribute getMappingContainer_Exceptions();

								/**
	 * Returns the meta object for class '{@link crosswalk.EditingContainer <em>Editing Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editing Container</em>'.
	 * @see crosswalk.EditingContainer
	 * @generated
	 */
	EClass getEditingContainer();

								/**
	 * Returns the meta object for the containment reference '{@link crosswalk.EditingContainer#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see crosswalk.EditingContainer#getModel()
	 * @see #getEditingContainer()
	 * @generated
	 */
	EReference getEditingContainer_Model();

								/**
	 * Returns the meta object for class '{@link crosswalk.Editable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editable</em>'.
	 * @see crosswalk.Editable
	 * @generated
	 */
	EClass getEditable();

								/**
	 * Returns the meta object for class '{@link crosswalk.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see crosswalk.Form
	 * @generated
	 */
	EClass getForm();

								/**
	 * Returns the meta object for the containment reference list '{@link crosswalk.Form#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see crosswalk.Form#getElements()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Elements();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.Form#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see crosswalk.Form#getTitle()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Title();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.Form#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see crosswalk.Form#getDescription()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Description();

								/**
	 * Returns the meta object for the attribute list '{@link crosswalk.Form#getEmailDepositNoticeTo <em>Email Deposit Notice To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Email Deposit Notice To</em>'.
	 * @see crosswalk.Form#getEmailDepositNoticeTo()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_EmailDepositNoticeTo();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.Form#getDepositContainerId <em>Deposit Container Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deposit Container Id</em>'.
	 * @see crosswalk.Form#getDepositContainerId()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_DepositContainerId();

								/**
	 * Returns the meta object for the attribute list '{@link crosswalk.Form#getAuthorizedGroups <em>Authorized Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Authorized Groups</em>'.
	 * @see crosswalk.Form#getAuthorizedGroups()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_AuthorizedGroups();

								/**
	 * Returns the meta object for class '{@link crosswalk.FormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Element</em>'.
	 * @see crosswalk.FormElement
	 * @generated
	 */
	EClass getFormElement();

								/**
	 * Returns the meta object for class '{@link crosswalk.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see crosswalk.Paragraph
	 * @generated
	 */
	EClass getParagraph();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.Paragraph#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see crosswalk.Paragraph#getHeading()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Heading();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.Paragraph#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see crosswalk.Paragraph#getText()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Text();

								/**
	 * Returns the meta object for class '{@link crosswalk.DateInputField <em>Date Input Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Input Field</em>'.
	 * @see crosswalk.DateInputField
	 * @generated
	 */
	EClass getDateInputField();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.DateInputField#getDatePrecision <em>Date Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Precision</em>'.
	 * @see crosswalk.DateInputField#getDatePrecision()
	 * @see #getDateInputField()
	 * @generated
	 */
	EAttribute getDateInputField_DatePrecision();

								/**
	 * Returns the meta object for class '{@link crosswalk.MultiLineTextInputField <em>Multi Line Text Input Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Line Text Input Field</em>'.
	 * @see crosswalk.MultiLineTextInputField
	 * @generated
	 */
	EClass getMultiLineTextInputField();

								/**
	 * Returns the meta object for the attribute '{@link crosswalk.MultiLineTextInputField#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Size</em>'.
	 * @see crosswalk.MultiLineTextInputField#getMaxSize()
	 * @see #getMultiLineTextInputField()
	 * @generated
	 */
	EAttribute getMultiLineTextInputField_MaxSize();

								/**
	 * Returns the meta object for enum '{@link crosswalk.DatePrecision <em>Date Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Precision</em>'.
	 * @see crosswalk.DatePrecision
	 * @generated
	 */
	EEnum getDatePrecision();

								/**
	 * Returns the meta object for data type '{@link crosswalk.DataException <em>Data Exception</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Exception</em>'.
	 * @see crosswalk.DataException
	 * @model instanceClass="crosswalk.DataException"
	 * @generated
	 */
        EDataType getDataException();

        /**
	 * Returns the meta object for data type '{@link crosswalk.RecordMatches <em>Record Matches</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Record Matches</em>'.
	 * @see crosswalk.RecordMatches
	 * @model instanceClass="crosswalk.RecordMatches"
	 * @generated
	 */
        EDataType getRecordMatches();

        /**
	 * Returns the meta object for data type '{@link crosswalk.RecordOutOfRangeException <em>Record Out Of Range Exception</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Record Out Of Range Exception</em>'.
	 * @see crosswalk.RecordOutOfRangeException
	 * @model instanceClass="crosswalk.RecordOutOfRangeException"
	 * @generated
	 */
        EDataType getRecordOutOfRangeException();

        /**
	 * Returns the meta object for data type '{@link java.net.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getURI();

								/**
	 * Returns the meta object for data type '{@link java.lang.Throwable <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
	EDataType getException();

								/**
	 * Returns the meta object for data type '{@link java.lang.Class <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Clazz</em>'.
	 * @see java.lang.Class
	 * @model instanceClass="java.lang.Class"
	 * @generated
	 */
	EDataType getClazz();

								/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
        CrosswalkFactory getCrosswalkFactory();

        /**
	 * <!-- begin-user-doc -->
         * Defines literals for the meta objects that represent
         * <ul>
         *   <li>each class,</li>
         *   <li>each feature of each class,</li>
         *   <li>each enum,</li>
         *   <li>and each data type</li>
         * </ul>
         * <!-- end-user-doc -->
	 * @generated
	 */
        interface Literals {
                /**
		 * The meta object literal for the '{@link crosswalk.impl.TabbedDataFieldImpl <em>Tabbed Data Field</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.impl.TabbedDataFieldImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getTabbedDataField()
		 * @generated
		 */
                EClass TABBED_DATA_FIELD = eINSTANCE.getTabbedDataField();

                /**
		 * The meta object literal for the '<em><b>Column Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute TABBED_DATA_FIELD__COLUMN_NUMBER = eINSTANCE.getTabbedDataField_ColumnNumber();

                /**
		 * The meta object literal for the '{@link crosswalk.impl.TrimWhitespaceImpl <em>Trim Whitespace</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.impl.TrimWhitespaceImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getTrimWhitespace()
		 * @generated
		 */
                EClass TRIM_WHITESPACE = eINSTANCE.getTrimWhitespace();

                /**
		 * The meta object literal for the '{@link crosswalk.impl.CurrentUsernameImpl <em>Current Username</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.impl.CurrentUsernameImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getCurrentUsername()
		 * @generated
		 */
		EClass CURRENT_USERNAME = eINSTANCE.getCurrentUsername();

																/**
		 * The meta object literal for the '{@link crosswalk.impl.CurrentDateImpl <em>Current Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.impl.CurrentDateImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getCurrentDate()
		 * @generated
		 */
		EClass CURRENT_DATE = eINSTANCE.getCurrentDate();

																/**
		 * The meta object literal for the '{@link crosswalk.impl.CrossWalkImpl <em>Cross Walk</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.impl.CrossWalkImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getCrossWalk()
		 * @generated
		 */
                EClass CROSS_WALK = eINSTANCE.getCrossWalk();

                /**
		 * The meta object literal for the '<em><b>Data Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference CROSS_WALK__DATA_SOURCE = eINSTANCE.getCrossWalk_DataSource();

                /**
		 * The meta object literal for the '{@link crosswalk.OutputElement <em>Output Element</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.OutputElement
		 * @see crosswalk.impl.CrosswalkPackageImpl#getOutputElement()
		 * @generated
		 */
                EClass OUTPUT_ELEMENT = eINSTANCE.getOutputElement();

                /**
		 * The meta object literal for the '<em><b>Walk</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference OUTPUT_ELEMENT__WALK = eINSTANCE.getOutputElement_Walk();

                /**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_ELEMENT__EXCEPTION = eINSTANCE.getOutputElement_Exception();

																/**
		 * The meta object literal for the '{@link crosswalk.impl.WalkWidgetImpl <em>Walk Widget</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.impl.WalkWidgetImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getWalkWidget()
		 * @generated
		 */
                EClass WALK_WIDGET = eINSTANCE.getWalkWidget();

                /**
		 * The meta object literal for the '<em><b>Walk</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference WALK_WIDGET__WALK = eINSTANCE.getWalkWidget_Walk();

                /**
		 * The meta object literal for the '{@link crosswalk.DataSource <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.DataSource
		 * @see crosswalk.impl.CrosswalkPackageImpl#getDataSource()
		 * @generated
		 */
                EClass DATA_SOURCE = eINSTANCE.getDataSource();

                /**
		 * The meta object literal for the '<em><b>Walk</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference DATA_SOURCE__WALK = eINSTANCE.getDataSource_Walk();

                /**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference DATA_SOURCE__FIELDS = eINSTANCE.getDataSource_Fields();

                /**
		 * The meta object literal for the '{@link crosswalk.impl.DataFieldImpl <em>Data Field</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.impl.DataFieldImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getDataField()
		 * @generated
		 */
                EClass DATA_FIELD = eINSTANCE.getDataField();

                /**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference DATA_FIELD__SOURCE = eINSTANCE.getDataField_Source();

                /**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute DATA_FIELD__LABEL = eINSTANCE.getDataField_Label();

                /**
		 * The meta object literal for the '{@link crosswalk.Output <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.Output
		 * @see crosswalk.impl.CrosswalkPackageImpl#getOutput()
		 * @generated
		 */
                EClass OUTPUT = eINSTANCE.getOutput();

                /**
		 * The meta object literal for the '{@link crosswalk.Input <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.Input
		 * @see crosswalk.impl.CrosswalkPackageImpl#getInput()
		 * @generated
		 */
                EClass INPUT = eINSTANCE.getInput();

                /**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference INPUT__OUTPUT = eINSTANCE.getInput_Output();

                /**
		 * The meta object literal for the '{@link crosswalk.RecordMatcherStrategy <em>Record Matcher Strategy</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.RecordMatcherStrategy
		 * @see crosswalk.impl.CrosswalkPackageImpl#getRecordMatcherStrategy()
		 * @generated
		 */
                EClass RECORD_MATCHER_STRATEGY = eINSTANCE.getRecordMatcherStrategy();

                /**
		 * The meta object literal for the '{@link crosswalk.impl.OriginalNameRecordMatcherImpl <em>Original Name Record Matcher</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.impl.OriginalNameRecordMatcherImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getOriginalNameRecordMatcher()
		 * @generated
		 */
                EClass ORIGINAL_NAME_RECORD_MATCHER = eINSTANCE.getOriginalNameRecordMatcher();

                /**
		 * The meta object literal for the '<em><b>Case Sensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute ORIGINAL_NAME_RECORD_MATCHER__CASE_SENSITIVE = eINSTANCE.getOriginalNameRecordMatcher_CaseSensitive();

                /**
		 * The meta object literal for the '<em><b>Include File Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute ORIGINAL_NAME_RECORD_MATCHER__INCLUDE_FILE_EXTENSION = eINSTANCE.getOriginalNameRecordMatcher_IncludeFileExtension();

                /**
		 * The meta object literal for the '<em><b>Base Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER = eINSTANCE.getOriginalNameRecordMatcher_BaseFolder();

                /**
		 * The meta object literal for the '{@link crosswalk.impl.DateRecognizerImpl <em>Date Recognizer</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.impl.DateRecognizerImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getDateRecognizer()
		 * @generated
		 */
                EClass DATE_RECOGNIZER = eINSTANCE.getDateRecognizer();

                /**
		 * The meta object literal for the '<em><b>Formats</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_RECOGNIZER__FORMATS = eINSTANCE.getDateRecognizer_Formats();

																/**
		 * The meta object literal for the '{@link crosswalk.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.impl.TextImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getText()
		 * @generated
		 */
                EClass TEXT = eINSTANCE.getText();

                /**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute TEXT__VALUE = eINSTANCE.getText_Value();

                /**
		 * The meta object literal for the '{@link crosswalk.impl.DelimitedFileImpl <em>Delimited File</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.impl.DelimitedFileImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getDelimitedFile()
		 * @generated
		 */
                EClass DELIMITED_FILE = eINSTANCE.getDelimitedFile();

                /**
		 * The meta object literal for the '<em><b>Source File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute DELIMITED_FILE__SOURCE_FILE = eINSTANCE.getDelimitedFile_SourceFile();

                /**
		 * The meta object literal for the '<em><b>First Data Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIMITED_FILE__FIRST_DATA_ROW = eINSTANCE.getDelimitedFile_FirstDataRow();

																/**
		 * The meta object literal for the '<em><b>Header Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute DELIMITED_FILE__HEADER_ROW = eINSTANCE.getDelimitedFile_HeaderRow();

                /**
		 * The meta object literal for the '<em><b>Text Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute DELIMITED_FILE__TEXT_ENCODING = eINSTANCE.getDelimitedFile_TextEncoding();

                /**
		 * The meta object literal for the '<em><b>Field Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute DELIMITED_FILE__FIELD_DELIMITER = eINSTANCE.getDelimitedFile_FieldDelimiter();

                /**
		 * The meta object literal for the '<em><b>Text Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute DELIMITED_FILE__TEXT_DELIMITER = eINSTANCE.getDelimitedFile_TextDelimiter();

                /**
		 * The meta object literal for the '<em><b>Last Data Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIMITED_FILE__LAST_DATA_ROW = eINSTANCE.getDelimitedFile_LastDataRow();

																/**
		 * The meta object literal for the '{@link crosswalk.impl.MappedElementImpl <em>Mapped Element</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.impl.MappedElementImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getMappedElement()
		 * @generated
		 */
                EClass MAPPED_ELEMENT = eINSTANCE.getMappedElement();

                /**
		 * The meta object literal for the '<em><b>Child Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference MAPPED_ELEMENT__CHILD_ELEMENTS = eINSTANCE.getMappedElement_ChildElements();

                /**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference MAPPED_ELEMENT__ATTRIBUTES = eINSTANCE.getMappedElement_Attributes();

                /**
		 * The meta object literal for the '<em><b>Mapped Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference MAPPED_ELEMENT__MAPPED_FEATURE = eINSTANCE.getMappedElement_MappedFeature();

                /**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference MAPPED_ELEMENT__PARENT = eINSTANCE.getMappedElement_Parent();

                /**
		 * The meta object literal for the '{@link crosswalk.impl.MappedAttributeImpl <em>Mapped Attribute</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.impl.MappedAttributeImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getMappedAttribute()
		 * @generated
		 */
                EClass MAPPED_ATTRIBUTE = eINSTANCE.getMappedAttribute();

                /**
		 * The meta object literal for the '<em><b>Mapped Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference MAPPED_ATTRIBUTE__MAPPED_FEATURE = eINSTANCE.getMappedAttribute_MappedFeature();

                /**
		 * The meta object literal for the '<em><b>Conversion Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference MAPPED_ATTRIBUTE__CONVERSION_STRATEGY = eINSTANCE.getMappedAttribute_ConversionStrategy();

                /**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EAttribute MAPPED_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getMappedAttribute_DefaultValue();

                /**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPED_ATTRIBUTE__REQUIRED = eINSTANCE.getMappedAttribute_Required();

																/**
		 * The meta object literal for the '{@link crosswalk.ConversionStrategy <em>Conversion Strategy</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.ConversionStrategy
		 * @see crosswalk.impl.CrosswalkPackageImpl#getConversionStrategy()
		 * @generated
		 */
                EClass CONVERSION_STRATEGY = eINSTANCE.getConversionStrategy();

                /**
		 * The meta object literal for the '{@link crosswalk.impl.DateToISO8601StringConversionImpl <em>Date To ISO8601 String Conversion</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.impl.DateToISO8601StringConversionImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getDateToISO8601StringConversion()
		 * @generated
		 */
                EClass DATE_TO_ISO8601_STRING_CONVERSION = eINSTANCE.getDateToISO8601StringConversion();

                /**
		 * The meta object literal for the '{@link crosswalk.impl.DictionaryImpl <em>Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.impl.DictionaryImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getDictionary()
		 * @generated
		 */
		EClass DICTIONARY = eINSTANCE.getDictionary();

																/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY__NAME = eINSTANCE.getDictionary_Name();

																/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__BLOCKS = eINSTANCE.getDictionary_Blocks();

																/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY__DESCRIPTION = eINSTANCE.getDictionary_Description();

																/**
		 * The meta object literal for the '{@link crosswalk.impl.MetadataBlockImpl <em>Metadata Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.impl.MetadataBlockImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getMetadataBlock()
		 * @generated
		 */
		EClass METADATA_BLOCK = eINSTANCE.getMetadataBlock();

																/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_BLOCK__NAME = eINSTANCE.getMetadataBlock_Name();

																/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_BLOCK__DESCRIPTION = eINSTANCE.getMetadataBlock_Description();

																/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_BLOCK__PORTS = eINSTANCE.getMetadataBlock_Ports();

																/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_BLOCK__REQUIRED = eINSTANCE.getMetadataBlock_Required();

																/**
		 * The meta object literal for the '<em><b>Max Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_BLOCK__MAX_REPEAT = eINSTANCE.getMetadataBlock_MaxRepeat();

																/**
		 * The meta object literal for the '{@link crosswalk.impl.InputFieldImpl <em>Input Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.impl.InputFieldImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getInputField()
		 * @generated
		 */
		EClass INPUT_FIELD = eINSTANCE.getInputField();

																/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_FIELD__LABEL = eINSTANCE.getInputField_Label();

																/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_FIELD__USAGE = eINSTANCE.getInputField_Usage();

																/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_FIELD__REQUIRED = eINSTANCE.getInputField_Required();

																/**
		 * The meta object literal for the '<em><b>Entered Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_FIELD__ENTERED_VALUE = eINSTANCE.getInputField_EnteredValue();

																/**
		 * The meta object literal for the '{@link crosswalk.impl.TextInputFieldImpl <em>Text Input Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.impl.TextInputFieldImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getTextInputField()
		 * @generated
		 */
		EClass TEXT_INPUT_FIELD = eINSTANCE.getTextInputField();

																/**
		 * The meta object literal for the '<em><b>Preferred Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_FIELD__PREFERRED_SIZE = eINSTANCE.getTextInputField_PreferredSize();

																/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_FIELD__MAX_SIZE = eINSTANCE.getTextInputField_MaxSize();

																/**
		 * The meta object literal for the '<em><b>Vocabulary URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_FIELD__VOCABULARY_URL = eINSTANCE.getTextInputField_VocabularyURL();

																/**
		 * The meta object literal for the '<em><b>Allow Free Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_FIELD__ALLOW_FREE_TEXT = eINSTANCE.getTextInputField_AllowFreeText();

																/**
		 * The meta object literal for the '<em><b>Valid Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_FIELD__VALID_VALUES = eINSTANCE.getTextInputField_ValidValues();

																/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_FIELD__ROWS = eINSTANCE.getTextInputField_Rows();

																/**
		 * The meta object literal for the '{@link crosswalk.impl.ContextProviderImpl <em>Context Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.impl.ContextProviderImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getContextProvider()
		 * @generated
		 */
		EClass CONTEXT_PROVIDER = eINSTANCE.getContextProvider();

																/**
		 * The meta object literal for the '<em><b>Output Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PROVIDER__OUTPUT_TYPE = eINSTANCE.getContextProvider_OutputType();

																/**
		 * The meta object literal for the '<em><b>Current User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_PROVIDER__CURRENT_USER = eINSTANCE.getContextProvider_CurrentUser();

																/**
		 * The meta object literal for the '{@link crosswalk.MappingContainer <em>Mapping Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.MappingContainer
		 * @see crosswalk.impl.CrosswalkPackageImpl#getMappingContainer()
		 * @generated
		 */
		EClass MAPPING_CONTAINER = eINSTANCE.getMappingContainer();

																/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_CONTAINER__WIDGETS = eINSTANCE.getMappingContainer_Widgets();

																/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_CONTAINER__ELEMENTS = eINSTANCE.getMappingContainer_Elements();

																/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_CONTAINER__EXCEPTIONS = eINSTANCE.getMappingContainer_Exceptions();

																/**
		 * The meta object literal for the '{@link crosswalk.impl.EditingContainerImpl <em>Editing Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.impl.EditingContainerImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getEditingContainer()
		 * @generated
		 */
		EClass EDITING_CONTAINER = eINSTANCE.getEditingContainer();

																/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITING_CONTAINER__MODEL = eINSTANCE.getEditingContainer_Model();

																/**
		 * The meta object literal for the '{@link crosswalk.Editable <em>Editable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.Editable
		 * @see crosswalk.impl.CrosswalkPackageImpl#getEditable()
		 * @generated
		 */
		EClass EDITABLE = eINSTANCE.getEditable();

																/**
		 * The meta object literal for the '{@link crosswalk.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.impl.FormImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

																/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__ELEMENTS = eINSTANCE.getForm_Elements();

																/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__TITLE = eINSTANCE.getForm_Title();

																/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__DESCRIPTION = eINSTANCE.getForm_Description();

																/**
		 * The meta object literal for the '<em><b>Email Deposit Notice To</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__EMAIL_DEPOSIT_NOTICE_TO = eINSTANCE.getForm_EmailDepositNoticeTo();

																/**
		 * The meta object literal for the '<em><b>Deposit Container Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__DEPOSIT_CONTAINER_ID = eINSTANCE.getForm_DepositContainerId();

																/**
		 * The meta object literal for the '<em><b>Authorized Groups</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__AUTHORIZED_GROUPS = eINSTANCE.getForm_AuthorizedGroups();

																/**
		 * The meta object literal for the '{@link crosswalk.FormElement <em>Form Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.FormElement
		 * @see crosswalk.impl.CrosswalkPackageImpl#getFormElement()
		 * @generated
		 */
		EClass FORM_ELEMENT = eINSTANCE.getFormElement();

																/**
		 * The meta object literal for the '{@link crosswalk.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.impl.ParagraphImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

																/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__HEADING = eINSTANCE.getParagraph_Heading();

																/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__TEXT = eINSTANCE.getParagraph_Text();

																/**
		 * The meta object literal for the '{@link crosswalk.impl.DateInputFieldImpl <em>Date Input Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.impl.DateInputFieldImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getDateInputField()
		 * @generated
		 */
		EClass DATE_INPUT_FIELD = eINSTANCE.getDateInputField();

																/**
		 * The meta object literal for the '<em><b>Date Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_INPUT_FIELD__DATE_PRECISION = eINSTANCE.getDateInputField_DatePrecision();

																/**
		 * The meta object literal for the '{@link crosswalk.impl.MultiLineTextInputFieldImpl <em>Multi Line Text Input Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.impl.MultiLineTextInputFieldImpl
		 * @see crosswalk.impl.CrosswalkPackageImpl#getMultiLineTextInputField()
		 * @generated
		 */
		EClass MULTI_LINE_TEXT_INPUT_FIELD = eINSTANCE.getMultiLineTextInputField();

																/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_LINE_TEXT_INPUT_FIELD__MAX_SIZE = eINSTANCE.getMultiLineTextInputField_MaxSize();

																/**
		 * The meta object literal for the '{@link crosswalk.DatePrecision <em>Date Precision</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crosswalk.DatePrecision
		 * @see crosswalk.impl.CrosswalkPackageImpl#getDatePrecision()
		 * @generated
		 */
		EEnum DATE_PRECISION = eINSTANCE.getDatePrecision();

																/**
		 * The meta object literal for the '<em>Data Exception</em>' data type.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.DataException
		 * @see crosswalk.impl.CrosswalkPackageImpl#getDataException()
		 * @generated
		 */
                EDataType DATA_EXCEPTION = eINSTANCE.getDataException();

                /**
		 * The meta object literal for the '<em>Record Matches</em>' data type.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.RecordMatches
		 * @see crosswalk.impl.CrosswalkPackageImpl#getRecordMatches()
		 * @generated
		 */
                EDataType RECORD_MATCHES = eINSTANCE.getRecordMatches();

                /**
		 * The meta object literal for the '<em>Record Out Of Range Exception</em>' data type.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see crosswalk.RecordOutOfRangeException
		 * @see crosswalk.impl.CrosswalkPackageImpl#getRecordOutOfRangeException()
		 * @generated
		 */
                EDataType RECORD_OUT_OF_RANGE_EXCEPTION = eINSTANCE.getRecordOutOfRangeException();

																/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see crosswalk.impl.CrosswalkPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

																/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see crosswalk.impl.CrosswalkPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

																/**
		 * The meta object literal for the '<em>Clazz</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Class
		 * @see crosswalk.impl.CrosswalkPackageImpl#getClazz()
		 * @generated
		 */
		EDataType CLAZZ = eINSTANCE.getClazz();

        }

} //CrosswalkPackage
