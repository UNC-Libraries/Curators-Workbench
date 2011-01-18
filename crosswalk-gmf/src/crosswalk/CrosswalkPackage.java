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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
         * The meta object id for the '{@link crosswalk.impl.WalkWidgetImpl <em>Walk Widget</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.WalkWidgetImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getWalkWidget()
         * @generated
         */
        int WALK_WIDGET = 5;

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
        int OUTPUT_ELEMENT = 4;

        /**
         * The meta object id for the '{@link crosswalk.impl.TitleInfoImpl <em>Title Info</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.TitleInfoImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getTitleInfo()
         * @generated
         */
        int TITLE_INFO = 2;

        /**
         * The meta object id for the '{@link crosswalk.impl.CrossWalkImpl <em>Cross Walk</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.CrossWalkImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getCrossWalk()
         * @generated
         */
        int CROSS_WALK = 3;

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
         * The meta object id for the '{@link crosswalk.impl.TabSeparatedFileImpl <em>Tab Separated File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.TabSeparatedFileImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getTabSeparatedFile()
         * @generated
         */
        int TAB_SEPARATED_FILE = 6;

        /**
         * The meta object id for the '{@link crosswalk.Input <em>Input</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.Input
         * @see crosswalk.impl.CrosswalkPackageImpl#getInput()
         * @generated
         */
        int INPUT = 12;

        /**
         * The meta object id for the '{@link crosswalk.impl.StringInputImpl <em>String Input</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.StringInputImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getStringInput()
         * @generated
         */
        int STRING_INPUT = 9;

        /**
         * The meta object id for the '{@link crosswalk.StringGenerator <em>String Generator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.StringGenerator
         * @see crosswalk.impl.CrosswalkPackageImpl#getStringGenerator()
         * @generated
         */
        int STRING_GENERATOR = 10;

        /**
         * The number of structural features of the '<em>String Generator</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_GENERATOR_FEATURE_COUNT = 0;

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
        int DATA_FIELD__SOURCE = STRING_GENERATOR_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Label</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATA_FIELD__LABEL = STRING_GENERATOR_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Data Field</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATA_FIELD_FEATURE_COUNT = STRING_GENERATOR_FEATURE_COUNT + 2;

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
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TRIM_WHITESPACE__INPUTS = WALK_WIDGET_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Trim Whitespace</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TRIM_WHITESPACE_FEATURE_COUNT = WALK_WIDGET_FEATURE_COUNT + 1;

        /**
         * The meta object id for the '{@link crosswalk.impl.InputConsumerImpl <em>Input Consumer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.InputConsumerImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getInputConsumer()
         * @generated
         */
        int INPUT_CONSUMER = 11;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int INPUT_CONSUMER__INPUTS = 0;

        /**
         * The number of structural features of the '<em>Input Consumer</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int INPUT_CONSUMER_FEATURE_COUNT = 1;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TITLE_INFO__INPUTS = INPUT_CONSUMER__INPUTS;

        /**
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TITLE_INFO__WALK = INPUT_CONSUMER_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Title Info</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TITLE_INFO_FEATURE_COUNT = INPUT_CONSUMER_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Data Source</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROSS_WALK__DATA_SOURCE = 0;

        /**
         * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROSS_WALK__WIDGETS = 1;

        /**
         * The feature id for the '<em><b>Elements</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROSS_WALK__ELEMENTS = 2;

        /**
         * The number of structural features of the '<em>Cross Walk</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROSS_WALK_FEATURE_COUNT = 3;

        /**
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OUTPUT_ELEMENT__WALK = 0;

        /**
         * The number of structural features of the '<em>Output Element</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OUTPUT_ELEMENT_FEATURE_COUNT = 1;

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
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TAB_SEPARATED_FILE__WALK = DATA_SOURCE__WALK;

        /**
         * The feature id for the '<em><b>Fields</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TAB_SEPARATED_FILE__FIELDS = DATA_SOURCE__FIELDS;

        /**
         * The feature id for the '<em><b>Source File</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TAB_SEPARATED_FILE__SOURCE_FILE = DATA_SOURCE_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Data Starting Row</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TAB_SEPARATED_FILE__DATA_STARTING_ROW = DATA_SOURCE_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Heading Row</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TAB_SEPARATED_FILE__HEADING_ROW = DATA_SOURCE_FEATURE_COUNT + 2;

        /**
         * The number of structural features of the '<em>Tab Separated File</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TAB_SEPARATED_FILE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 3;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int INPUT__NAME = 0;

        /**
         * The feature id for the '<em><b>Consumer</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int INPUT__CONSUMER = 1;

        /**
         * The number of structural features of the '<em>Input</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int INPUT_FEATURE_COUNT = 2;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_INPUT__NAME = INPUT__NAME;

        /**
         * The feature id for the '<em><b>Consumer</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_INPUT__CONSUMER = INPUT__CONSUMER;

        /**
         * The feature id for the '<em><b>Input</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_INPUT__INPUT = INPUT_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>String Input</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

        /**
         * The meta object id for the '{@link crosswalk.impl.AbstractImpl <em>Abstract</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.AbstractImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getAbstract()
         * @generated
         */
        int ABSTRACT = 13;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ABSTRACT__INPUTS = INPUT_CONSUMER__INPUTS;

        /**
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ABSTRACT__WALK = INPUT_CONSUMER_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Abstract</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ABSTRACT_FEATURE_COUNT = INPUT_CONSUMER_FEATURE_COUNT + 1;

        /**
         * The meta object id for the '{@link crosswalk.impl.GenreImpl <em>Genre</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.GenreImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getGenre()
         * @generated
         */
        int GENRE = 14;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int GENRE__INPUTS = INPUT_CONSUMER__INPUTS;

        /**
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int GENRE__WALK = INPUT_CONSUMER_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Genre</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int GENRE_FEATURE_COUNT = INPUT_CONSUMER_FEATURE_COUNT + 1;

        /**
         * The meta object id for the '{@link crosswalk.impl.IdentifierImpl <em>Identifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.IdentifierImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getIdentifier()
         * @generated
         */
        int IDENTIFIER = 15;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IDENTIFIER__INPUTS = INPUT_CONSUMER__INPUTS;

        /**
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IDENTIFIER__WALK = INPUT_CONSUMER_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Identifier</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IDENTIFIER_FEATURE_COUNT = INPUT_CONSUMER_FEATURE_COUNT + 1;

        /**
         * The meta object id for the '{@link crosswalk.impl.LanguageImpl <em>Language</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.LanguageImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getLanguage()
         * @generated
         */
        int LANGUAGE = 16;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int LANGUAGE__INPUTS = INPUT_CONSUMER__INPUTS;

        /**
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int LANGUAGE__WALK = INPUT_CONSUMER_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Language</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int LANGUAGE_FEATURE_COUNT = INPUT_CONSUMER_FEATURE_COUNT + 1;

        /**
         * The meta object id for the '{@link crosswalk.impl.NameImpl <em>Name</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.NameImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getName_()
         * @generated
         */
        int NAME = 17;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NAME__INPUTS = INPUT_CONSUMER__INPUTS;

        /**
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NAME__WALK = INPUT_CONSUMER_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NAME__TYPE = INPUT_CONSUMER_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Name</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NAME_FEATURE_COUNT = INPUT_CONSUMER_FEATURE_COUNT + 2;

        /**
         * The meta object id for the '{@link crosswalk.impl.SubjectImpl <em>Subject</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.SubjectImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getSubject()
         * @generated
         */
        int SUBJECT = 18;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SUBJECT__INPUTS = INPUT_CONSUMER__INPUTS;

        /**
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SUBJECT__WALK = INPUT_CONSUMER_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Subject</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SUBJECT_FEATURE_COUNT = INPUT_CONSUMER_FEATURE_COUNT + 1;

        /**
         * The meta object id for the '{@link crosswalk.impl.TypeOfResourceImpl <em>Type Of Resource</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.TypeOfResourceImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getTypeOfResource()
         * @generated
         */
        int TYPE_OF_RESOURCE = 19;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TYPE_OF_RESOURCE__INPUTS = INPUT_CONSUMER__INPUTS;

        /**
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TYPE_OF_RESOURCE__WALK = INPUT_CONSUMER_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Type Of Resource</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TYPE_OF_RESOURCE_FEATURE_COUNT = INPUT_CONSUMER_FEATURE_COUNT + 1;

        /**
         * The meta object id for the '{@link crosswalk.RecordMatcherStrategy <em>Record Matcher Strategy</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.RecordMatcherStrategy
         * @see crosswalk.impl.CrosswalkPackageImpl#getRecordMatcherStrategy()
         * @generated
         */
        int RECORD_MATCHER_STRATEGY = 20;

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
        int ORIGINAL_NAME_RECORD_MATCHER = 21;

        /**
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ORIGINAL_NAME_RECORD_MATCHER__WALK = RECORD_MATCHER_STRATEGY__WALK;

        /**
         * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ORIGINAL_NAME_RECORD_MATCHER__CASE_SENSITIVE = RECORD_MATCHER_STRATEGY_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Include File Extension</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ORIGINAL_NAME_RECORD_MATCHER__INCLUDE_FILE_EXTENSION = RECORD_MATCHER_STRATEGY_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Base Folder</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER = RECORD_MATCHER_STRATEGY_FEATURE_COUNT + 2;

        /**
         * The feature id for the '<em><b>Input</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ORIGINAL_NAME_RECORD_MATCHER__INPUT = RECORD_MATCHER_STRATEGY_FEATURE_COUNT + 3;

        /**
         * The number of structural features of the '<em>Original Name Record Matcher</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ORIGINAL_NAME_RECORD_MATCHER_FEATURE_COUNT = RECORD_MATCHER_STRATEGY_FEATURE_COUNT + 4;

        /**
         * The meta object id for the '{@link crosswalk.impl.DateCreatedImpl <em>Date Created</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.DateCreatedImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getDateCreated()
         * @generated
         */
        int DATE_CREATED = 22;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_CREATED__INPUTS = INPUT_CONSUMER__INPUTS;

        /**
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_CREATED__WALK = INPUT_CONSUMER_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Date Created</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_CREATED_FEATURE_COUNT = INPUT_CONSUMER_FEATURE_COUNT + 1;

        /**
         * The meta object id for the '{@link crosswalk.impl.DateInputImpl <em>Date Input</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.DateInputImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getDateInput()
         * @generated
         */
        int DATE_INPUT = 23;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_INPUT__NAME = INPUT__NAME;

        /**
         * The feature id for the '<em><b>Consumer</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_INPUT__CONSUMER = INPUT__CONSUMER;

        /**
         * The feature id for the '<em><b>Input</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_INPUT__INPUT = INPUT_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Date Input</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

        /**
         * The meta object id for the '{@link crosswalk.DateGenerator <em>Date Generator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.DateGenerator
         * @see crosswalk.impl.CrosswalkPackageImpl#getDateGenerator()
         * @generated
         */
        int DATE_GENERATOR = 24;

        /**
         * The number of structural features of the '<em>Date Generator</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_GENERATOR_FEATURE_COUNT = 0;

        /**
         * The meta object id for the '{@link crosswalk.impl.DateRecognizerImpl <em>Date Recognizer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.DateRecognizerImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getDateRecognizer()
         * @generated
         */
        int DATE_RECOGNIZER = 25;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_RECOGNIZER__INPUTS = INPUT_CONSUMER__INPUTS;

        /**
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_RECOGNIZER__WALK = INPUT_CONSUMER_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Format</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_RECOGNIZER__FORMAT = INPUT_CONSUMER_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Date Recognizer</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DATE_RECOGNIZER_FEATURE_COUNT = INPUT_CONSUMER_FEATURE_COUNT + 2;

        /**
         * The meta object id for the '{@link crosswalk.impl.TextImpl <em>Text</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.TextImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getText()
         * @generated
         */
        int TEXT = 26;

        /**
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TEXT__WALK = STRING_GENERATOR_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TEXT__VALUE = STRING_GENERATOR_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Text</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TEXT_FEATURE_COUNT = STRING_GENERATOR_FEATURE_COUNT + 2;

        /**
         * The meta object id for the '{@link crosswalk.impl.AccessConditionImpl <em>Access Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.impl.AccessConditionImpl
         * @see crosswalk.impl.CrosswalkPackageImpl#getAccessCondition()
         * @generated
         */
        int ACCESS_CONDITION = 27;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ACCESS_CONDITION__INPUTS = INPUT_CONSUMER__INPUTS;

        /**
         * The feature id for the '<em><b>Walk</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ACCESS_CONDITION__WALK = INPUT_CONSUMER_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ACCESS_CONDITION__TYPE = INPUT_CONSUMER_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Access Condition</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ACCESS_CONDITION_FEATURE_COUNT = INPUT_CONSUMER_FEATURE_COUNT + 2;

        /**
         * The meta object id for the '<em>Data Exception</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.DataException
         * @see crosswalk.impl.CrosswalkPackageImpl#getDataException()
         * @generated
         */
        int DATA_EXCEPTION = 28;

        /**
         * The meta object id for the '<em>IProject</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.core.resources.IProject
         * @see crosswalk.impl.CrosswalkPackageImpl#getIProject()
         * @generated
         */
        int IPROJECT = 29;

        /**
         * The meta object id for the '<em>IFile</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.core.resources.IFile
         * @see crosswalk.impl.CrosswalkPackageImpl#getIFile()
         * @generated
         */
        int IFILE = 30;

        /**
         * The meta object id for the '<em>Record Matches</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.RecordMatches
         * @see crosswalk.impl.CrosswalkPackageImpl#getRecordMatches()
         * @generated
         */
        int RECORD_MATCHES = 31;

        /**
         * The meta object id for the '<em>IFolder</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.core.resources.IFolder
         * @see crosswalk.impl.CrosswalkPackageImpl#getIFolder()
         * @generated
         */
        int IFOLDER = 32;

        /**
         * The meta object id for the '<em>Record Out Of Range Exception</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see crosswalk.RecordOutOfRangeException
         * @see crosswalk.impl.CrosswalkPackageImpl#getRecordOutOfRangeException()
         * @generated
         */
        int RECORD_OUT_OF_RANGE_EXCEPTION = 33;

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
         * Returns the meta object for class '{@link crosswalk.TitleInfo <em>Title Info</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Title Info</em>'.
         * @see crosswalk.TitleInfo
         * @generated
         */
        EClass getTitleInfo();

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
         * Returns the meta object for the containment reference list '{@link crosswalk.CrossWalk#getWidgets <em>Widgets</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Widgets</em>'.
         * @see crosswalk.CrossWalk#getWidgets()
         * @see #getCrossWalk()
         * @generated
         */
        EReference getCrossWalk_Widgets();

        /**
         * Returns the meta object for the containment reference list '{@link crosswalk.CrossWalk#getElements <em>Elements</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Elements</em>'.
         * @see crosswalk.CrossWalk#getElements()
         * @see #getCrossWalk()
         * @generated
         */
        EReference getCrossWalk_Elements();

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
         * Returns the meta object for class '{@link crosswalk.TabSeparatedFile <em>Tab Separated File</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Tab Separated File</em>'.
         * @see crosswalk.TabSeparatedFile
         * @generated
         */
        EClass getTabSeparatedFile();

        /**
         * Returns the meta object for the attribute '{@link crosswalk.TabSeparatedFile#getSourceFile <em>Source File</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Source File</em>'.
         * @see crosswalk.TabSeparatedFile#getSourceFile()
         * @see #getTabSeparatedFile()
         * @generated
         */
        EAttribute getTabSeparatedFile_SourceFile();

        /**
         * Returns the meta object for the attribute '{@link crosswalk.TabSeparatedFile#getDataStartingRow <em>Data Starting Row</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Data Starting Row</em>'.
         * @see crosswalk.TabSeparatedFile#getDataStartingRow()
         * @see #getTabSeparatedFile()
         * @generated
         */
        EAttribute getTabSeparatedFile_DataStartingRow();

        /**
         * Returns the meta object for the attribute '{@link crosswalk.TabSeparatedFile#getHeadingRow <em>Heading Row</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Heading Row</em>'.
         * @see crosswalk.TabSeparatedFile#getHeadingRow()
         * @see #getTabSeparatedFile()
         * @generated
         */
        EAttribute getTabSeparatedFile_HeadingRow();

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
         * Returns the meta object for class '{@link crosswalk.StringInput <em>String Input</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>String Input</em>'.
         * @see crosswalk.StringInput
         * @generated
         */
        EClass getStringInput();

        /**
         * Returns the meta object for the reference '{@link crosswalk.StringInput#getInput <em>Input</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Input</em>'.
         * @see crosswalk.StringInput#getInput()
         * @see #getStringInput()
         * @generated
         */
        EReference getStringInput_Input();

        /**
         * Returns the meta object for class '{@link crosswalk.StringGenerator <em>String Generator</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>String Generator</em>'.
         * @see crosswalk.StringGenerator
         * @generated
         */
        EClass getStringGenerator();

        /**
         * Returns the meta object for class '{@link crosswalk.InputConsumer <em>Input Consumer</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Input Consumer</em>'.
         * @see crosswalk.InputConsumer
         * @generated
         */
        EClass getInputConsumer();

        /**
         * Returns the meta object for the containment reference list '{@link crosswalk.InputConsumer#getInputs <em>Inputs</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Inputs</em>'.
         * @see crosswalk.InputConsumer#getInputs()
         * @see #getInputConsumer()
         * @generated
         */
        EReference getInputConsumer_Inputs();

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
         * Returns the meta object for the attribute '{@link crosswalk.Input#getName <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Name</em>'.
         * @see crosswalk.Input#getName()
         * @see #getInput()
         * @generated
         */
        EAttribute getInput_Name();

        /**
         * Returns the meta object for the container reference '{@link crosswalk.Input#getConsumer <em>Consumer</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the container reference '<em>Consumer</em>'.
         * @see crosswalk.Input#getConsumer()
         * @see #getInput()
         * @generated
         */
        EReference getInput_Consumer();

        /**
         * Returns the meta object for class '{@link crosswalk.Abstract <em>Abstract</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Abstract</em>'.
         * @see crosswalk.Abstract
         * @generated
         */
        EClass getAbstract();

        /**
         * Returns the meta object for class '{@link crosswalk.Genre <em>Genre</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Genre</em>'.
         * @see crosswalk.Genre
         * @generated
         */
        EClass getGenre();

        /**
         * Returns the meta object for class '{@link crosswalk.Identifier <em>Identifier</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Identifier</em>'.
         * @see crosswalk.Identifier
         * @generated
         */
        EClass getIdentifier();

        /**
         * Returns the meta object for class '{@link crosswalk.Language <em>Language</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Language</em>'.
         * @see crosswalk.Language
         * @generated
         */
        EClass getLanguage();

        /**
         * Returns the meta object for class '{@link crosswalk.Name <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Name</em>'.
         * @see crosswalk.Name
         * @generated
         */
        EClass getName_();

        /**
         * Returns the meta object for the attribute '{@link crosswalk.Name#getType <em>Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Type</em>'.
         * @see crosswalk.Name#getType()
         * @see #getName_()
         * @generated
         */
        EAttribute getName_Type();

        /**
         * Returns the meta object for class '{@link crosswalk.Subject <em>Subject</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Subject</em>'.
         * @see crosswalk.Subject
         * @generated
         */
        EClass getSubject();

        /**
         * Returns the meta object for class '{@link crosswalk.TypeOfResource <em>Type Of Resource</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Type Of Resource</em>'.
         * @see crosswalk.TypeOfResource
         * @generated
         */
        EClass getTypeOfResource();

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
         * Returns the meta object for the containment reference '{@link crosswalk.OriginalNameRecordMatcher#getInput <em>Input</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Input</em>'.
         * @see crosswalk.OriginalNameRecordMatcher#getInput()
         * @see #getOriginalNameRecordMatcher()
         * @generated
         */
        EReference getOriginalNameRecordMatcher_Input();

        /**
         * Returns the meta object for class '{@link crosswalk.DateCreated <em>Date Created</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Date Created</em>'.
         * @see crosswalk.DateCreated
         * @generated
         */
        EClass getDateCreated();

        /**
         * Returns the meta object for class '{@link crosswalk.DateInput <em>Date Input</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Date Input</em>'.
         * @see crosswalk.DateInput
         * @generated
         */
        EClass getDateInput();

        /**
         * Returns the meta object for the reference '{@link crosswalk.DateInput#getInput <em>Input</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Input</em>'.
         * @see crosswalk.DateInput#getInput()
         * @see #getDateInput()
         * @generated
         */
        EReference getDateInput_Input();

        /**
         * Returns the meta object for class '{@link crosswalk.DateGenerator <em>Date Generator</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Date Generator</em>'.
         * @see crosswalk.DateGenerator
         * @generated
         */
        EClass getDateGenerator();

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
         * Returns the meta object for the attribute '{@link crosswalk.DateRecognizer#getFormat <em>Format</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Format</em>'.
         * @see crosswalk.DateRecognizer#getFormat()
         * @see #getDateRecognizer()
         * @generated
         */
        EAttribute getDateRecognizer_Format();

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
         * Returns the meta object for class '{@link crosswalk.AccessCondition <em>Access Condition</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Access Condition</em>'.
         * @see crosswalk.AccessCondition
         * @generated
         */
        EClass getAccessCondition();

        /**
         * Returns the meta object for the attribute '{@link crosswalk.AccessCondition#getType <em>Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Type</em>'.
         * @see crosswalk.AccessCondition#getType()
         * @see #getAccessCondition()
         * @generated
         */
        EAttribute getAccessCondition_Type();

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
         * Returns the meta object for data type '{@link org.eclipse.core.resources.IProject <em>IProject</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>IProject</em>'.
         * @see org.eclipse.core.resources.IProject
         * @model instanceClass="org.eclipse.core.resources.IProject"
         * @generated
         */
        EDataType getIProject();

        /**
         * Returns the meta object for data type '{@link org.eclipse.core.resources.IFile <em>IFile</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>IFile</em>'.
         * @see org.eclipse.core.resources.IFile
         * @model instanceClass="org.eclipse.core.resources.IFile"
         * @generated
         */
        EDataType getIFile();

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
         * Returns the meta object for data type '{@link org.eclipse.core.resources.IFolder <em>IFolder</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>IFolder</em>'.
         * @see org.eclipse.core.resources.IFolder
         * @model instanceClass="org.eclipse.core.resources.IFolder"
         * @generated
         */
        EDataType getIFolder();

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
                 * The meta object literal for the '{@link crosswalk.impl.TitleInfoImpl <em>Title Info</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.impl.TitleInfoImpl
                 * @see crosswalk.impl.CrosswalkPackageImpl#getTitleInfo()
                 * @generated
                 */
                EClass TITLE_INFO = eINSTANCE.getTitleInfo();

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
                 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference CROSS_WALK__WIDGETS = eINSTANCE.getCrossWalk_Widgets();

                /**
                 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference CROSS_WALK__ELEMENTS = eINSTANCE.getCrossWalk_Elements();

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
                 * The meta object literal for the '{@link crosswalk.impl.TabSeparatedFileImpl <em>Tab Separated File</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.impl.TabSeparatedFileImpl
                 * @see crosswalk.impl.CrosswalkPackageImpl#getTabSeparatedFile()
                 * @generated
                 */
                EClass TAB_SEPARATED_FILE = eINSTANCE.getTabSeparatedFile();

                /**
                 * The meta object literal for the '<em><b>Source File</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute TAB_SEPARATED_FILE__SOURCE_FILE = eINSTANCE.getTabSeparatedFile_SourceFile();

                /**
                 * The meta object literal for the '<em><b>Data Starting Row</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute TAB_SEPARATED_FILE__DATA_STARTING_ROW = eINSTANCE.getTabSeparatedFile_DataStartingRow();

                /**
                 * The meta object literal for the '<em><b>Heading Row</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute TAB_SEPARATED_FILE__HEADING_ROW = eINSTANCE.getTabSeparatedFile_HeadingRow();

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
                 * The meta object literal for the '{@link crosswalk.impl.StringInputImpl <em>String Input</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.impl.StringInputImpl
                 * @see crosswalk.impl.CrosswalkPackageImpl#getStringInput()
                 * @generated
                 */
                EClass STRING_INPUT = eINSTANCE.getStringInput();

                /**
                 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference STRING_INPUT__INPUT = eINSTANCE.getStringInput_Input();

                /**
                 * The meta object literal for the '{@link crosswalk.StringGenerator <em>String Generator</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.StringGenerator
                 * @see crosswalk.impl.CrosswalkPackageImpl#getStringGenerator()
                 * @generated
                 */
                EClass STRING_GENERATOR = eINSTANCE.getStringGenerator();

                /**
                 * The meta object literal for the '{@link crosswalk.impl.InputConsumerImpl <em>Input Consumer</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.impl.InputConsumerImpl
                 * @see crosswalk.impl.CrosswalkPackageImpl#getInputConsumer()
                 * @generated
                 */
                EClass INPUT_CONSUMER = eINSTANCE.getInputConsumer();

                /**
                 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference INPUT_CONSUMER__INPUTS = eINSTANCE.getInputConsumer_Inputs();

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
                 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

                /**
                 * The meta object literal for the '<em><b>Consumer</b></em>' container reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference INPUT__CONSUMER = eINSTANCE.getInput_Consumer();

                /**
                 * The meta object literal for the '{@link crosswalk.impl.AbstractImpl <em>Abstract</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.impl.AbstractImpl
                 * @see crosswalk.impl.CrosswalkPackageImpl#getAbstract()
                 * @generated
                 */
                EClass ABSTRACT = eINSTANCE.getAbstract();

                /**
                 * The meta object literal for the '{@link crosswalk.impl.GenreImpl <em>Genre</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.impl.GenreImpl
                 * @see crosswalk.impl.CrosswalkPackageImpl#getGenre()
                 * @generated
                 */
                EClass GENRE = eINSTANCE.getGenre();

                /**
                 * The meta object literal for the '{@link crosswalk.impl.IdentifierImpl <em>Identifier</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.impl.IdentifierImpl
                 * @see crosswalk.impl.CrosswalkPackageImpl#getIdentifier()
                 * @generated
                 */
                EClass IDENTIFIER = eINSTANCE.getIdentifier();

                /**
                 * The meta object literal for the '{@link crosswalk.impl.LanguageImpl <em>Language</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.impl.LanguageImpl
                 * @see crosswalk.impl.CrosswalkPackageImpl#getLanguage()
                 * @generated
                 */
                EClass LANGUAGE = eINSTANCE.getLanguage();

                /**
                 * The meta object literal for the '{@link crosswalk.impl.NameImpl <em>Name</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.impl.NameImpl
                 * @see crosswalk.impl.CrosswalkPackageImpl#getName_()
                 * @generated
                 */
                EClass NAME = eINSTANCE.getName_();

                /**
                 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute NAME__TYPE = eINSTANCE.getName_Type();

                /**
                 * The meta object literal for the '{@link crosswalk.impl.SubjectImpl <em>Subject</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.impl.SubjectImpl
                 * @see crosswalk.impl.CrosswalkPackageImpl#getSubject()
                 * @generated
                 */
                EClass SUBJECT = eINSTANCE.getSubject();

                /**
                 * The meta object literal for the '{@link crosswalk.impl.TypeOfResourceImpl <em>Type Of Resource</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.impl.TypeOfResourceImpl
                 * @see crosswalk.impl.CrosswalkPackageImpl#getTypeOfResource()
                 * @generated
                 */
                EClass TYPE_OF_RESOURCE = eINSTANCE.getTypeOfResource();

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
                 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ORIGINAL_NAME_RECORD_MATCHER__INPUT = eINSTANCE.getOriginalNameRecordMatcher_Input();

                /**
                 * The meta object literal for the '{@link crosswalk.impl.DateCreatedImpl <em>Date Created</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.impl.DateCreatedImpl
                 * @see crosswalk.impl.CrosswalkPackageImpl#getDateCreated()
                 * @generated
                 */
                EClass DATE_CREATED = eINSTANCE.getDateCreated();

                /**
                 * The meta object literal for the '{@link crosswalk.impl.DateInputImpl <em>Date Input</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.impl.DateInputImpl
                 * @see crosswalk.impl.CrosswalkPackageImpl#getDateInput()
                 * @generated
                 */
                EClass DATE_INPUT = eINSTANCE.getDateInput();

                /**
                 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DATE_INPUT__INPUT = eINSTANCE.getDateInput_Input();

                /**
                 * The meta object literal for the '{@link crosswalk.DateGenerator <em>Date Generator</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.DateGenerator
                 * @see crosswalk.impl.CrosswalkPackageImpl#getDateGenerator()
                 * @generated
                 */
                EClass DATE_GENERATOR = eINSTANCE.getDateGenerator();

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
                 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DATE_RECOGNIZER__FORMAT = eINSTANCE.getDateRecognizer_Format();

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
                 * The meta object literal for the '{@link crosswalk.impl.AccessConditionImpl <em>Access Condition</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.impl.AccessConditionImpl
                 * @see crosswalk.impl.CrosswalkPackageImpl#getAccessCondition()
                 * @generated
                 */
                EClass ACCESS_CONDITION = eINSTANCE.getAccessCondition();

                /**
                 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute ACCESS_CONDITION__TYPE = eINSTANCE.getAccessCondition_Type();

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
                 * The meta object literal for the '<em>IProject</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.core.resources.IProject
                 * @see crosswalk.impl.CrosswalkPackageImpl#getIProject()
                 * @generated
                 */
                EDataType IPROJECT = eINSTANCE.getIProject();

                /**
                 * The meta object literal for the '<em>IFile</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.core.resources.IFile
                 * @see crosswalk.impl.CrosswalkPackageImpl#getIFile()
                 * @generated
                 */
                EDataType IFILE = eINSTANCE.getIFile();

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
                 * The meta object literal for the '<em>IFolder</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see org.eclipse.core.resources.IFolder
                 * @see crosswalk.impl.CrosswalkPackageImpl#getIFolder()
                 * @generated
                 */
                EDataType IFOLDER = eINSTANCE.getIFolder();

                /**
                 * The meta object literal for the '<em>Record Out Of Range Exception</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see crosswalk.RecordOutOfRangeException
                 * @see crosswalk.impl.CrosswalkPackageImpl#getRecordOutOfRangeException()
                 * @generated
                 */
                EDataType RECORD_OUT_OF_RANGE_EXCEPTION = eINSTANCE.getRecordOutOfRangeException();

        }

} //CrosswalkPackage
