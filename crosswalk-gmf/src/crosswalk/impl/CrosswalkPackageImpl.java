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
package crosswalk.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.DataField;
import crosswalk.DataSource;
import crosswalk.DateGenerator;
import crosswalk.DateInput;
import crosswalk.DateRecognizer;
import crosswalk.DelimitedFile;
import crosswalk.Input;
import crosswalk.InputConsumer;
import crosswalk.MappedAttribute;
import crosswalk.MappedElement;
import crosswalk.OriginalNameRecordMatcher;
import crosswalk.OutputElement;
import crosswalk.RecordMatcherStrategy;
import crosswalk.RecordMatches;
import crosswalk.RecordOutOfRangeException;
import crosswalk.StringGenerator;
import crosswalk.StringInput;
import crosswalk.TabSeparatedFile;
import crosswalk.TabbedDataField;
import crosswalk.Text;
import crosswalk.TrimWhitespace;
import crosswalk.WalkWidget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrosswalkPackageImpl extends EPackageImpl implements CrosswalkPackage {

    public List<EClass> getDataSourceImplementations() {
	List<EClass> dataSourceTypes = new ArrayList<EClass>();
	EClass dataSourceType = getDataSource();
	for(EClassifier c : getEClassifiers()) {
	    if(c instanceof EClass) {
		EClass clazz = (EClass)c;
		if(clazz.getEAllSuperTypes().contains(dataSourceType)) {
		    if(!clazz.isAbstract()) {
			dataSourceTypes.add(clazz);
		    }
		}
	    }
	}
	return dataSourceTypes;
    }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass tabbedDataFieldEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass trimWhitespaceEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass crossWalkEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass outputElementEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass walkWidgetEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass tabSeparatedFileEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass dataSourceEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass dataFieldEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass stringInputEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass stringGeneratorEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass inputConsumerEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass inputEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass recordMatcherStrategyEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass originalNameRecordMatcherEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass dateInputEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass dateGeneratorEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass dateRecognizerEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass textEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass delimitedFileEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass mappedElementEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass mappedAttributeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType dataExceptionEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType iProjectEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType iFileEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType recordMatchesEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType iFolderEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType recordOutOfRangeExceptionEDataType = null;

        /**
         * Creates an instance of the model <b>Package</b>, registered with
         * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
         * package URI value.
         * <p>Note: the correct way to create the package is via the static
         * factory method {@link #init init()}, which also performs
         * initialization of the package, or returns the registered package,
         * if one already exists.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.ecore.EPackage.Registry
         * @see crosswalk.CrosswalkPackage#eNS_URI
         * @see #init()
         * @generated
         */
        private CrosswalkPackageImpl() {
                super(eNS_URI, CrosswalkFactory.eINSTANCE);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static boolean isInited = false;

        /**
         * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
         * 
         * <p>This method is used to initialize {@link CrosswalkPackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static CrosswalkPackage init() {
                if (isInited) return (CrosswalkPackage)EPackage.Registry.INSTANCE.getEPackage(CrosswalkPackage.eNS_URI);

                // Obtain or create and register package
                CrosswalkPackageImpl theCrosswalkPackage = (CrosswalkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CrosswalkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CrosswalkPackageImpl());

                isInited = true;

                // Create package meta-data objects
                theCrosswalkPackage.createPackageContents();

                // Initialize created meta-data
                theCrosswalkPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theCrosswalkPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(CrosswalkPackage.eNS_URI, theCrosswalkPackage);
                return theCrosswalkPackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getTabbedDataField() {
                return tabbedDataFieldEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTabbedDataField_ColumnNumber() {
                return (EAttribute)tabbedDataFieldEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getTrimWhitespace() {
                return trimWhitespaceEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getCrossWalk() {
                return crossWalkEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getCrossWalk_DataSource() {
                return (EReference)crossWalkEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getCrossWalk_Widgets() {
                return (EReference)crossWalkEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getCrossWalk_Elements() {
                return (EReference)crossWalkEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getCrossWalk_OutputType() {
                return (EReference)crossWalkEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getOutputElement() {
                return outputElementEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getOutputElement_Walk() {
                return (EReference)outputElementEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getWalkWidget() {
                return walkWidgetEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getWalkWidget_Walk() {
                return (EReference)walkWidgetEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getTabSeparatedFile() {
                return tabSeparatedFileEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTabSeparatedFile_SourceFile() {
                return (EAttribute)tabSeparatedFileEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTabSeparatedFile_DataStartingRow() {
                return (EAttribute)tabSeparatedFileEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTabSeparatedFile_HeadingRow() {
                return (EAttribute)tabSeparatedFileEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDataSource() {
                return dataSourceEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDataSource_Walk() {
                return (EReference)dataSourceEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDataSource_Fields() {
                return (EReference)dataSourceEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDataField() {
                return dataFieldEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDataField_Source() {
                return (EReference)dataFieldEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDataField_Label() {
                return (EAttribute)dataFieldEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getStringInput() {
                return stringInputEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getStringInput_Input() {
                return (EReference)stringInputEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getStringGenerator() {
                return stringGeneratorEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getInputConsumer() {
                return inputConsumerEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getInputConsumer_Inputs() {
                return (EReference)inputConsumerEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getInput() {
                return inputEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getInput_Name() {
                return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getInput_Consumer() {
                return (EReference)inputEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getRecordMatcherStrategy() {
                return recordMatcherStrategyEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getOriginalNameRecordMatcher() {
                return originalNameRecordMatcherEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getOriginalNameRecordMatcher_CaseSensitive() {
                return (EAttribute)originalNameRecordMatcherEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getOriginalNameRecordMatcher_IncludeFileExtension() {
                return (EAttribute)originalNameRecordMatcherEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getOriginalNameRecordMatcher_BaseFolder() {
                return (EAttribute)originalNameRecordMatcherEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getOriginalNameRecordMatcher_Input() {
                return (EReference)originalNameRecordMatcherEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDateInput() {
                return dateInputEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDateInput_Input() {
                return (EReference)dateInputEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDateGenerator() {
                return dateGeneratorEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDateRecognizer() {
                return dateRecognizerEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDateRecognizer_Format() {
                return (EAttribute)dateRecognizerEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getText() {
                return textEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getText_Value() {
                return (EAttribute)textEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDelimitedFile() {
                return delimitedFileEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDelimitedFile_SourceFile() {
                return (EAttribute)delimitedFileEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDelimitedFile_DataRow() {
                return (EAttribute)delimitedFileEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDelimitedFile_HeaderRow() {
                return (EAttribute)delimitedFileEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDelimitedFile_TextEncoding() {
                return (EAttribute)delimitedFileEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDelimitedFile_FieldDelimiter() {
                return (EAttribute)delimitedFileEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDelimitedFile_TextDelimiter() {
                return (EAttribute)delimitedFileEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMappedElement() {
                return mappedElementEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMappedElement_ChildElements() {
                return (EReference)mappedElementEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMappedElement_Attributes() {
                return (EReference)mappedElementEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMappedElement_MappedFeature() {
                return (EReference)mappedElementEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMappedElement_Text() {
                return (EReference)mappedElementEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMappedElement_Parent() {
                return (EReference)mappedElementEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMappedAttribute() {
                return mappedAttributeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMappedAttribute_MappedFeature() {
                return (EReference)mappedAttributeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getDataException() {
                return dataExceptionEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getIProject() {
                return iProjectEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getIFile() {
                return iFileEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getRecordMatches() {
                return recordMatchesEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getIFolder() {
                return iFolderEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getRecordOutOfRangeException() {
                return recordOutOfRangeExceptionEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public CrosswalkFactory getCrosswalkFactory() {
                return (CrosswalkFactory)getEFactoryInstance();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private boolean isCreated = false;

        /**
         * Creates the meta-model objects for the package.  This method is
         * guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void createPackageContents() {
                if (isCreated) return;
                isCreated = true;

                // Create classes and their features
                tabbedDataFieldEClass = createEClass(TABBED_DATA_FIELD);
                createEAttribute(tabbedDataFieldEClass, TABBED_DATA_FIELD__COLUMN_NUMBER);

                trimWhitespaceEClass = createEClass(TRIM_WHITESPACE);

                crossWalkEClass = createEClass(CROSS_WALK);
                createEReference(crossWalkEClass, CROSS_WALK__DATA_SOURCE);
                createEReference(crossWalkEClass, CROSS_WALK__WIDGETS);
                createEReference(crossWalkEClass, CROSS_WALK__ELEMENTS);
                createEReference(crossWalkEClass, CROSS_WALK__OUTPUT_TYPE);

                outputElementEClass = createEClass(OUTPUT_ELEMENT);
                createEReference(outputElementEClass, OUTPUT_ELEMENT__WALK);

                walkWidgetEClass = createEClass(WALK_WIDGET);
                createEReference(walkWidgetEClass, WALK_WIDGET__WALK);

                tabSeparatedFileEClass = createEClass(TAB_SEPARATED_FILE);
                createEAttribute(tabSeparatedFileEClass, TAB_SEPARATED_FILE__SOURCE_FILE);
                createEAttribute(tabSeparatedFileEClass, TAB_SEPARATED_FILE__DATA_STARTING_ROW);
                createEAttribute(tabSeparatedFileEClass, TAB_SEPARATED_FILE__HEADING_ROW);

                dataSourceEClass = createEClass(DATA_SOURCE);
                createEReference(dataSourceEClass, DATA_SOURCE__WALK);
                createEReference(dataSourceEClass, DATA_SOURCE__FIELDS);

                dataFieldEClass = createEClass(DATA_FIELD);
                createEReference(dataFieldEClass, DATA_FIELD__SOURCE);
                createEAttribute(dataFieldEClass, DATA_FIELD__LABEL);

                stringInputEClass = createEClass(STRING_INPUT);
                createEReference(stringInputEClass, STRING_INPUT__INPUT);

                stringGeneratorEClass = createEClass(STRING_GENERATOR);

                inputConsumerEClass = createEClass(INPUT_CONSUMER);
                createEReference(inputConsumerEClass, INPUT_CONSUMER__INPUTS);

                inputEClass = createEClass(INPUT);
                createEAttribute(inputEClass, INPUT__NAME);
                createEReference(inputEClass, INPUT__CONSUMER);

                recordMatcherStrategyEClass = createEClass(RECORD_MATCHER_STRATEGY);

                originalNameRecordMatcherEClass = createEClass(ORIGINAL_NAME_RECORD_MATCHER);
                createEAttribute(originalNameRecordMatcherEClass, ORIGINAL_NAME_RECORD_MATCHER__CASE_SENSITIVE);
                createEAttribute(originalNameRecordMatcherEClass, ORIGINAL_NAME_RECORD_MATCHER__INCLUDE_FILE_EXTENSION);
                createEAttribute(originalNameRecordMatcherEClass, ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER);
                createEReference(originalNameRecordMatcherEClass, ORIGINAL_NAME_RECORD_MATCHER__INPUT);

                dateInputEClass = createEClass(DATE_INPUT);
                createEReference(dateInputEClass, DATE_INPUT__INPUT);

                dateGeneratorEClass = createEClass(DATE_GENERATOR);

                dateRecognizerEClass = createEClass(DATE_RECOGNIZER);
                createEAttribute(dateRecognizerEClass, DATE_RECOGNIZER__FORMAT);

                textEClass = createEClass(TEXT);
                createEAttribute(textEClass, TEXT__VALUE);

                delimitedFileEClass = createEClass(DELIMITED_FILE);
                createEAttribute(delimitedFileEClass, DELIMITED_FILE__SOURCE_FILE);
                createEAttribute(delimitedFileEClass, DELIMITED_FILE__DATA_ROW);
                createEAttribute(delimitedFileEClass, DELIMITED_FILE__HEADER_ROW);
                createEAttribute(delimitedFileEClass, DELIMITED_FILE__TEXT_ENCODING);
                createEAttribute(delimitedFileEClass, DELIMITED_FILE__FIELD_DELIMITER);
                createEAttribute(delimitedFileEClass, DELIMITED_FILE__TEXT_DELIMITER);

                mappedElementEClass = createEClass(MAPPED_ELEMENT);
                createEReference(mappedElementEClass, MAPPED_ELEMENT__CHILD_ELEMENTS);
                createEReference(mappedElementEClass, MAPPED_ELEMENT__ATTRIBUTES);
                createEReference(mappedElementEClass, MAPPED_ELEMENT__MAPPED_FEATURE);
                createEReference(mappedElementEClass, MAPPED_ELEMENT__TEXT);
                createEReference(mappedElementEClass, MAPPED_ELEMENT__PARENT);

                mappedAttributeEClass = createEClass(MAPPED_ATTRIBUTE);
                createEReference(mappedAttributeEClass, MAPPED_ATTRIBUTE__MAPPED_FEATURE);

                // Create data types
                dataExceptionEDataType = createEDataType(DATA_EXCEPTION);
                iProjectEDataType = createEDataType(IPROJECT);
                iFileEDataType = createEDataType(IFILE);
                recordMatchesEDataType = createEDataType(RECORD_MATCHES);
                iFolderEDataType = createEDataType(IFOLDER);
                recordOutOfRangeExceptionEDataType = createEDataType(RECORD_OUT_OF_RANGE_EXCEPTION);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private boolean isInitialized = false;

        /**
         * Complete the initialization of the package and its meta-model.  This
         * method is guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void initializePackageContents() {
                if (isInitialized) return;
                isInitialized = true;

                // Initialize package
                setName(eNAME);
                setNsPrefix(eNS_PREFIX);
                setNsURI(eNS_URI);

                // Create type parameters

                // Set bounds for type parameters

                // Add supertypes to classes
                tabbedDataFieldEClass.getESuperTypes().add(this.getDataField());
                trimWhitespaceEClass.getESuperTypes().add(this.getWalkWidget());
                trimWhitespaceEClass.getESuperTypes().add(this.getStringGenerator());
                trimWhitespaceEClass.getESuperTypes().add(this.getInputConsumer());
                tabSeparatedFileEClass.getESuperTypes().add(this.getDataSource());
                dataFieldEClass.getESuperTypes().add(this.getStringGenerator());
                stringInputEClass.getESuperTypes().add(this.getInput());
                recordMatcherStrategyEClass.getESuperTypes().add(this.getWalkWidget());
                originalNameRecordMatcherEClass.getESuperTypes().add(this.getRecordMatcherStrategy());
                dateInputEClass.getESuperTypes().add(this.getInput());
                dateRecognizerEClass.getESuperTypes().add(this.getInputConsumer());
                dateRecognizerEClass.getESuperTypes().add(this.getDateGenerator());
                dateRecognizerEClass.getESuperTypes().add(this.getWalkWidget());
                textEClass.getESuperTypes().add(this.getStringGenerator());
                textEClass.getESuperTypes().add(this.getWalkWidget());
                delimitedFileEClass.getESuperTypes().add(this.getDataSource());
                mappedElementEClass.getESuperTypes().add(this.getOutputElement());
                mappedAttributeEClass.getESuperTypes().add(this.getOutputElement());
                mappedAttributeEClass.getESuperTypes().add(this.getStringInput());

                // Initialize classes and features; add operations and parameters
                initEClass(tabbedDataFieldEClass, TabbedDataField.class, "TabbedDataField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getTabbedDataField_ColumnNumber(), ecorePackage.getEInt(), "ColumnNumber", "1", 1, 1, TabbedDataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(trimWhitespaceEClass, TrimWhitespace.class, "TrimWhitespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(crossWalkEClass, CrossWalk.class, "CrossWalk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getCrossWalk_DataSource(), this.getDataSource(), this.getDataSource_Walk(), "DataSource", null, 1, 1, CrossWalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getCrossWalk_Widgets(), this.getWalkWidget(), this.getWalkWidget_Walk(), "Widgets", null, 0, -1, CrossWalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
                initEReference(getCrossWalk_Elements(), this.getOutputElement(), this.getOutputElement_Walk(), "Elements", null, 1, -1, CrossWalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getCrossWalk_OutputType(), ecorePackage.getEClass(), null, "outputType", null, 1, 1, CrossWalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                EOperation op = addEOperation(crossWalkEClass, this.getIProject(), "getProject", 1, 1, IS_UNIQUE, IS_ORDERED);
                addEException(op, this.getDataException());

                initEClass(outputElementEClass, OutputElement.class, "OutputElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getOutputElement_Walk(), this.getCrossWalk(), this.getCrossWalk_Elements(), "Walk", null, 0, 1, OutputElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                op = addEOperation(outputElementEClass, null, "updateRecord", 1, 1, IS_UNIQUE, IS_ORDERED);
                addEParameter(op, ecorePackage.getEObject(), "record", 1, 1, IS_UNIQUE, IS_ORDERED);

                initEClass(walkWidgetEClass, WalkWidget.class, "WalkWidget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getWalkWidget_Walk(), this.getCrossWalk(), this.getCrossWalk_Widgets(), "Walk", null, 1, 1, WalkWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(tabSeparatedFileEClass, TabSeparatedFile.class, "TabSeparatedFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getTabSeparatedFile_SourceFile(), this.getIFile(), "SourceFile", null, 0, 1, TabSeparatedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getTabSeparatedFile_DataStartingRow(), ecorePackage.getEInt(), "DataStartingRow", "1", 1, 1, TabSeparatedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getTabSeparatedFile_HeadingRow(), ecorePackage.getEInt(), "HeadingRow", null, 0, 1, TabSeparatedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                op = addEOperation(tabSeparatedFileEClass, null, "GoToRecord", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEParameter(op, ecorePackage.getEInt(), "RowNumber", 1, 1, IS_UNIQUE, IS_ORDERED);
                addEException(op, this.getDataException());
                addEException(op, this.getRecordOutOfRangeException());

                initEClass(dataSourceEClass, DataSource.class, "DataSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getDataSource_Walk(), this.getCrossWalk(), this.getCrossWalk_DataSource(), "Walk", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDataSource_Fields(), this.getDataField(), this.getDataField_Source(), "fields", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                op = addEOperation(dataSourceEClass, null, "GoToExample", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEException(op, this.getDataException());
                addEException(op, this.getRecordOutOfRangeException());

                op = addEOperation(dataSourceEClass, null, "NextRecord", 1, 1, IS_UNIQUE, IS_ORDERED);
                addEException(op, this.getDataException());
                addEException(op, this.getRecordOutOfRangeException());

                op = addEOperation(dataSourceEClass, null, "Reset", 1, 1, IS_UNIQUE, IS_ORDERED);
                addEException(op, this.getDataException());

                addEOperation(dataSourceEClass, ecorePackage.getEString(), "getRecordID", 1, 1, IS_UNIQUE, IS_ORDERED);

                addEOperation(dataSourceEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

                op = addEOperation(dataSourceEClass, ecorePackage.getEString(), "getFieldValue", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEParameter(op, this.getDataField(), "field", 1, 1, IS_UNIQUE, IS_ORDERED);

                op = addEOperation(dataSourceEClass, null, "initializeDataFields", 1, 1, IS_UNIQUE, IS_ORDERED);
                addEException(op, this.getDataException());

                initEClass(dataFieldEClass, DataField.class, "DataField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getDataField_Source(), this.getDataSource(), this.getDataSource_Fields(), "source", null, 0, 1, DataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDataField_Label(), ecorePackage.getEString(), "label", null, 0, 1, DataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(stringInputEClass, StringInput.class, "StringInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getStringInput_Input(), this.getStringGenerator(), null, "Input", null, 0, 1, StringInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(stringGeneratorEClass, StringGenerator.class, "StringGenerator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                op = addEOperation(stringGeneratorEClass, ecorePackage.getEString(), "getResultString", 1, 1, IS_UNIQUE, IS_ORDERED);
                addEException(op, this.getDataException());

                initEClass(inputConsumerEClass, InputConsumer.class, "InputConsumer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getInputConsumer_Inputs(), this.getInput(), this.getInput_Consumer(), "Inputs", null, 0, -1, InputConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                addEOperation(inputConsumerEClass, null, "initInputs", 1, 1, IS_UNIQUE, IS_ORDERED);

                initEClass(inputEClass, Input.class, "Input", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getInput_Name(), ecorePackage.getEString(), "Name", "input", 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getInput_Consumer(), this.getInputConsumer(), this.getInputConsumer_Inputs(), "Consumer", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(recordMatcherStrategyEClass, RecordMatcherStrategy.class, "RecordMatcherStrategy", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                addEOperation(recordMatcherStrategyEClass, this.getRecordMatches(), "getMatches", 1, 1, IS_UNIQUE, IS_ORDERED);

                op = addEOperation(recordMatcherStrategyEClass, null, "run", 1, 1, IS_UNIQUE, IS_ORDERED);
                addEException(op, this.getDataException());

                initEClass(originalNameRecordMatcherEClass, OriginalNameRecordMatcher.class, "OriginalNameRecordMatcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getOriginalNameRecordMatcher_CaseSensitive(), ecorePackage.getEBoolean(), "caseSensitive", "false", 1, 1, OriginalNameRecordMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getOriginalNameRecordMatcher_IncludeFileExtension(), ecorePackage.getEBoolean(), "includeFileExtension", "false", 1, 1, OriginalNameRecordMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getOriginalNameRecordMatcher_BaseFolder(), this.getIFolder(), "baseFolder", null, 0, 1, OriginalNameRecordMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getOriginalNameRecordMatcher_Input(), this.getStringInput(), null, "input", null, 1, 1, OriginalNameRecordMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(dateInputEClass, DateInput.class, "DateInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getDateInput_Input(), this.getDateGenerator(), null, "Input", null, 0, 1, DateInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(dateGeneratorEClass, DateGenerator.class, "DateGenerator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                op = addEOperation(dateGeneratorEClass, ecorePackage.getEString(), "getResultString", 1, 1, IS_UNIQUE, IS_ORDERED);
                addEException(op, this.getDataException());

                initEClass(dateRecognizerEClass, DateRecognizer.class, "DateRecognizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getDateRecognizer_Format(), ecorePackage.getEString(), "Format", "yy-MM-dd", 1, 1, DateRecognizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getText_Value(), ecorePackage.getEString(), "Value", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(delimitedFileEClass, DelimitedFile.class, "DelimitedFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getDelimitedFile_SourceFile(), this.getIFile(), "SourceFile", null, 1, 1, DelimitedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDelimitedFile_DataRow(), ecorePackage.getEInt(), "dataRow", "1", 1, 1, DelimitedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDelimitedFile_HeaderRow(), ecorePackage.getEInt(), "headerRow", null, 0, 1, DelimitedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDelimitedFile_TextEncoding(), ecorePackage.getEString(), "textEncoding", "utf-8", 1, 1, DelimitedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDelimitedFile_FieldDelimiter(), ecorePackage.getEChar(), "fieldDelimiter", ",", 1, 1, DelimitedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDelimitedFile_TextDelimiter(), ecorePackage.getEChar(), "textDelimiter", "\"", 0, 1, DelimitedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                op = addEOperation(delimitedFileEClass, null, "GoToRecord", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEParameter(op, ecorePackage.getEInt(), "RowNumber", 1, 1, IS_UNIQUE, IS_ORDERED);
                addEException(op, this.getDataException());
                addEException(op, this.getRecordOutOfRangeException());

                initEClass(mappedElementEClass, MappedElement.class, "MappedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMappedElement_ChildElements(), this.getMappedElement(), this.getMappedElement_Parent(), "childElements", null, 0, -1, MappedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMappedElement_Attributes(), this.getMappedAttribute(), null, "attributes", null, 0, -1, MappedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMappedElement_MappedFeature(), ecorePackage.getEReference(), null, "mappedFeature", null, 1, 1, MappedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMappedElement_Text(), this.getStringInput(), null, "text", null, 0, 1, MappedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMappedElement_Parent(), this.getMappedElement(), this.getMappedElement_ChildElements(), "parent", null, 0, 1, MappedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(mappedAttributeEClass, MappedAttribute.class, "MappedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMappedAttribute_MappedFeature(), ecorePackage.getEAttribute(), null, "mappedFeature", null, 1, 1, MappedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Initialize data types
                initEDataType(dataExceptionEDataType, DataException.class, "DataException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(iProjectEDataType, IProject.class, "IProject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(iFileEDataType, IFile.class, "IFile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(recordMatchesEDataType, RecordMatches.class, "RecordMatches", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(iFolderEDataType, IFolder.class, "IFolder", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(recordOutOfRangeExceptionEDataType, RecordOutOfRangeException.class, "RecordOutOfRangeException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

                // Create resource
                createResource(eNS_URI);
        }

} //CrosswalkPackageImpl
