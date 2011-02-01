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
package crosswalk.util;

import crosswalk.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see crosswalk.CrosswalkPackage
 * @generated
 */
public class CrosswalkAdapterFactory extends AdapterFactoryImpl {
        /**
         * The cached model package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static CrosswalkPackage modelPackage;

        /**
         * Creates an instance of the adapter factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public CrosswalkAdapterFactory() {
                if (modelPackage == null) {
                        modelPackage = CrosswalkPackage.eINSTANCE;
                }
        }

        /**
         * Returns whether this factory is applicable for the type of the object.
         * <!-- begin-user-doc -->
         * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
         * <!-- end-user-doc -->
         * @return whether this factory is applicable for the type of the object.
         * @generated
         */
        @Override
        public boolean isFactoryForType(Object object) {
                if (object == modelPackage) {
                        return true;
                }
                if (object instanceof EObject) {
                        return ((EObject)object).eClass().getEPackage() == modelPackage;
                }
                return false;
        }

        /**
         * The switch that delegates to the <code>createXXX</code> methods.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected CrosswalkSwitch<Adapter> modelSwitch =
                new CrosswalkSwitch<Adapter>() {
                        @Override
                        public Adapter caseTabbedDataField(TabbedDataField object) {
                                return createTabbedDataFieldAdapter();
                        }
                        @Override
                        public Adapter caseTrimWhitespace(TrimWhitespace object) {
                                return createTrimWhitespaceAdapter();
                        }
                        @Override
                        public Adapter caseTitleInfo(TitleInfo object) {
                                return createTitleInfoAdapter();
                        }
                        @Override
                        public Adapter caseCrossWalk(CrossWalk object) {
                                return createCrossWalkAdapter();
                        }
                        @Override
                        public Adapter caseOutputElement(OutputElement object) {
                                return createOutputElementAdapter();
                        }
                        @Override
                        public Adapter caseWalkWidget(WalkWidget object) {
                                return createWalkWidgetAdapter();
                        }
                        @Override
                        public Adapter caseTabSeparatedFile(TabSeparatedFile object) {
                                return createTabSeparatedFileAdapter();
                        }
                        @Override
                        public Adapter caseDataSource(DataSource object) {
                                return createDataSourceAdapter();
                        }
                        @Override
                        public Adapter caseDataField(DataField object) {
                                return createDataFieldAdapter();
                        }
                        @Override
                        public Adapter caseStringInput(StringInput object) {
                                return createStringInputAdapter();
                        }
                        @Override
                        public Adapter caseStringGenerator(StringGenerator object) {
                                return createStringGeneratorAdapter();
                        }
                        @Override
                        public Adapter caseInputConsumer(InputConsumer object) {
                                return createInputConsumerAdapter();
                        }
                        @Override
                        public Adapter caseInput(Input object) {
                                return createInputAdapter();
                        }
                        @Override
                        public Adapter caseAbstract(Abstract object) {
                                return createAbstractAdapter();
                        }
                        @Override
                        public Adapter caseGenre(Genre object) {
                                return createGenreAdapter();
                        }
                        @Override
                        public Adapter caseIdentifier(Identifier object) {
                                return createIdentifierAdapter();
                        }
                        @Override
                        public Adapter caseLanguage(Language object) {
                                return createLanguageAdapter();
                        }
                        @Override
                        public Adapter caseName(Name object) {
                                return createNameAdapter();
                        }
                        @Override
                        public Adapter caseSubject(Subject object) {
                                return createSubjectAdapter();
                        }
                        @Override
                        public Adapter caseTypeOfResource(TypeOfResource object) {
                                return createTypeOfResourceAdapter();
                        }
                        @Override
                        public Adapter caseRecordMatcherStrategy(RecordMatcherStrategy object) {
                                return createRecordMatcherStrategyAdapter();
                        }
                        @Override
                        public Adapter caseOriginalNameRecordMatcher(OriginalNameRecordMatcher object) {
                                return createOriginalNameRecordMatcherAdapter();
                        }
                        @Override
                        public Adapter caseDateCreated(DateCreated object) {
                                return createDateCreatedAdapter();
                        }
                        @Override
                        public Adapter caseDateInput(DateInput object) {
                                return createDateInputAdapter();
                        }
                        @Override
                        public Adapter caseDateGenerator(DateGenerator object) {
                                return createDateGeneratorAdapter();
                        }
                        @Override
                        public Adapter caseDateRecognizer(DateRecognizer object) {
                                return createDateRecognizerAdapter();
                        }
                        @Override
                        public Adapter caseText(Text object) {
                                return createTextAdapter();
                        }
                        @Override
                        public Adapter caseAccessCondition(AccessCondition object) {
                                return createAccessConditionAdapter();
                        }
                        @Override
                        public Adapter caseDelimitedFile(DelimitedFile object) {
                                return createDelimitedFileAdapter();
                        }
                        @Override
                        public Adapter defaultCase(EObject object) {
                                return createEObjectAdapter();
                        }
                };

        /**
         * Creates an adapter for the <code>target</code>.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param target the object to adapt.
         * @return the adapter for the <code>target</code>.
         * @generated
         */
        @Override
        public Adapter createAdapter(Notifier target) {
                return modelSwitch.doSwitch((EObject)target);
        }


        /**
         * Creates a new adapter for an object of class '{@link crosswalk.TabbedDataField <em>Tabbed Data Field</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.TabbedDataField
         * @generated
         */
        public Adapter createTabbedDataFieldAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.TrimWhitespace <em>Trim Whitespace</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.TrimWhitespace
         * @generated
         */
        public Adapter createTrimWhitespaceAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.TitleInfo <em>Title Info</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.TitleInfo
         * @generated
         */
        public Adapter createTitleInfoAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.CrossWalk <em>Cross Walk</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.CrossWalk
         * @generated
         */
        public Adapter createCrossWalkAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.OutputElement <em>Output Element</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.OutputElement
         * @generated
         */
        public Adapter createOutputElementAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.WalkWidget <em>Walk Widget</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.WalkWidget
         * @generated
         */
        public Adapter createWalkWidgetAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.TabSeparatedFile <em>Tab Separated File</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.TabSeparatedFile
         * @generated
         */
        public Adapter createTabSeparatedFileAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.DataSource <em>Data Source</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.DataSource
         * @generated
         */
        public Adapter createDataSourceAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.DataField <em>Data Field</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.DataField
         * @generated
         */
        public Adapter createDataFieldAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.StringInput <em>String Input</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.StringInput
         * @generated
         */
        public Adapter createStringInputAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.StringGenerator <em>String Generator</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.StringGenerator
         * @generated
         */
        public Adapter createStringGeneratorAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.InputConsumer <em>Input Consumer</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.InputConsumer
         * @generated
         */
        public Adapter createInputConsumerAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.Input <em>Input</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.Input
         * @generated
         */
        public Adapter createInputAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.Abstract <em>Abstract</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.Abstract
         * @generated
         */
        public Adapter createAbstractAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.Genre <em>Genre</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.Genre
         * @generated
         */
        public Adapter createGenreAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.Identifier <em>Identifier</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.Identifier
         * @generated
         */
        public Adapter createIdentifierAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.Language <em>Language</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.Language
         * @generated
         */
        public Adapter createLanguageAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.Name <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.Name
         * @generated
         */
        public Adapter createNameAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.Subject <em>Subject</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.Subject
         * @generated
         */
        public Adapter createSubjectAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.TypeOfResource <em>Type Of Resource</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.TypeOfResource
         * @generated
         */
        public Adapter createTypeOfResourceAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.RecordMatcherStrategy <em>Record Matcher Strategy</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.RecordMatcherStrategy
         * @generated
         */
        public Adapter createRecordMatcherStrategyAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.OriginalNameRecordMatcher <em>Original Name Record Matcher</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.OriginalNameRecordMatcher
         * @generated
         */
        public Adapter createOriginalNameRecordMatcherAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.DateCreated <em>Date Created</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.DateCreated
         * @generated
         */
        public Adapter createDateCreatedAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.DateInput <em>Date Input</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.DateInput
         * @generated
         */
        public Adapter createDateInputAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.DateGenerator <em>Date Generator</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.DateGenerator
         * @generated
         */
        public Adapter createDateGeneratorAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.DateRecognizer <em>Date Recognizer</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.DateRecognizer
         * @generated
         */
        public Adapter createDateRecognizerAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.Text <em>Text</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.Text
         * @generated
         */
        public Adapter createTextAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.AccessCondition <em>Access Condition</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.AccessCondition
         * @generated
         */
        public Adapter createAccessConditionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link crosswalk.DelimitedFile <em>Delimited File</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see crosswalk.DelimitedFile
         * @generated
         */
        public Adapter createDelimitedFileAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for the default case.
         * <!-- begin-user-doc -->
         * This default implementation returns null.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @generated
         */
        public Adapter createEObjectAdapter() {
                return null;
        }

} //CrosswalkAdapterFactory
