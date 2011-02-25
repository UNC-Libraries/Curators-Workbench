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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see crosswalk.CrosswalkPackage
 * @generated
 */
public class CrosswalkSwitch<T> {
        /**
         * The cached model package
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static CrosswalkPackage modelPackage;

        /**
         * Creates an instance of the switch.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public CrosswalkSwitch() {
                if (modelPackage == null) {
                        modelPackage = CrosswalkPackage.eINSTANCE;
                }
        }

        /**
         * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the first non-null result returned by a <code>caseXXX</code> call.
         * @generated
         */
        public T doSwitch(EObject theEObject) {
                return doSwitch(theEObject.eClass(), theEObject);
        }

        /**
         * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the first non-null result returned by a <code>caseXXX</code> call.
         * @generated
         */
        protected T doSwitch(EClass theEClass, EObject theEObject) {
                if (theEClass.eContainer() == modelPackage) {
                        return doSwitch(theEClass.getClassifierID(), theEObject);
                }
                else {
                        List<EClass> eSuperTypes = theEClass.getESuperTypes();
                        return
                                eSuperTypes.isEmpty() ?
                                        defaultCase(theEObject) :
                                        doSwitch(eSuperTypes.get(0), theEObject);
                }
        }

        /**
         * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the first non-null result returned by a <code>caseXXX</code> call.
         * @generated
         */
        protected T doSwitch(int classifierID, EObject theEObject) {
                switch (classifierID) {
                        case CrosswalkPackage.TABBED_DATA_FIELD: {
                                TabbedDataField tabbedDataField = (TabbedDataField)theEObject;
                                T result = caseTabbedDataField(tabbedDataField);
                                if (result == null) result = caseDataField(tabbedDataField);
                                if (result == null) result = caseStringGenerator(tabbedDataField);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.TRIM_WHITESPACE: {
                                TrimWhitespace trimWhitespace = (TrimWhitespace)theEObject;
                                T result = caseTrimWhitespace(trimWhitespace);
                                if (result == null) result = caseWalkWidget(trimWhitespace);
                                if (result == null) result = caseStringGenerator(trimWhitespace);
                                if (result == null) result = caseInputConsumer(trimWhitespace);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.TITLE_INFO: {
                                TitleInfo titleInfo = (TitleInfo)theEObject;
                                T result = caseTitleInfo(titleInfo);
                                if (result == null) result = caseInputConsumer(titleInfo);
                                if (result == null) result = caseOutputElement(titleInfo);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.CROSS_WALK: {
                                CrossWalk crossWalk = (CrossWalk)theEObject;
                                T result = caseCrossWalk(crossWalk);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.OUTPUT_ELEMENT: {
                                OutputElement outputElement = (OutputElement)theEObject;
                                T result = caseOutputElement(outputElement);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.WALK_WIDGET: {
                                WalkWidget walkWidget = (WalkWidget)theEObject;
                                T result = caseWalkWidget(walkWidget);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.TAB_SEPARATED_FILE: {
                                TabSeparatedFile tabSeparatedFile = (TabSeparatedFile)theEObject;
                                T result = caseTabSeparatedFile(tabSeparatedFile);
                                if (result == null) result = caseDataSource(tabSeparatedFile);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.DATA_SOURCE: {
                                DataSource dataSource = (DataSource)theEObject;
                                T result = caseDataSource(dataSource);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.DATA_FIELD: {
                                DataField dataField = (DataField)theEObject;
                                T result = caseDataField(dataField);
                                if (result == null) result = caseStringGenerator(dataField);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.STRING_INPUT: {
                                StringInput stringInput = (StringInput)theEObject;
                                T result = caseStringInput(stringInput);
                                if (result == null) result = caseInput(stringInput);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.STRING_GENERATOR: {
                                StringGenerator stringGenerator = (StringGenerator)theEObject;
                                T result = caseStringGenerator(stringGenerator);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.INPUT_CONSUMER: {
                                InputConsumer inputConsumer = (InputConsumer)theEObject;
                                T result = caseInputConsumer(inputConsumer);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.INPUT: {
                                Input input = (Input)theEObject;
                                T result = caseInput(input);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.ABSTRACT: {
                                Abstract abstract_ = (Abstract)theEObject;
                                T result = caseAbstract(abstract_);
                                if (result == null) result = caseInputConsumer(abstract_);
                                if (result == null) result = caseOutputElement(abstract_);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.GENRE: {
                                Genre genre = (Genre)theEObject;
                                T result = caseGenre(genre);
                                if (result == null) result = caseInputConsumer(genre);
                                if (result == null) result = caseOutputElement(genre);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.IDENTIFIER: {
                                Identifier identifier = (Identifier)theEObject;
                                T result = caseIdentifier(identifier);
                                if (result == null) result = caseInputConsumer(identifier);
                                if (result == null) result = caseOutputElement(identifier);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.LANGUAGE: {
                                Language language = (Language)theEObject;
                                T result = caseLanguage(language);
                                if (result == null) result = caseInputConsumer(language);
                                if (result == null) result = caseOutputElement(language);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.NAME: {
                                Name name = (Name)theEObject;
                                T result = caseName(name);
                                if (result == null) result = caseInputConsumer(name);
                                if (result == null) result = caseOutputElement(name);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.SUBJECT: {
                                Subject subject = (Subject)theEObject;
                                T result = caseSubject(subject);
                                if (result == null) result = caseInputConsumer(subject);
                                if (result == null) result = caseOutputElement(subject);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.TYPE_OF_RESOURCE: {
                                TypeOfResource typeOfResource = (TypeOfResource)theEObject;
                                T result = caseTypeOfResource(typeOfResource);
                                if (result == null) result = caseInputConsumer(typeOfResource);
                                if (result == null) result = caseOutputElement(typeOfResource);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.RECORD_MATCHER_STRATEGY: {
                                RecordMatcherStrategy recordMatcherStrategy = (RecordMatcherStrategy)theEObject;
                                T result = caseRecordMatcherStrategy(recordMatcherStrategy);
                                if (result == null) result = caseWalkWidget(recordMatcherStrategy);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER: {
                                OriginalNameRecordMatcher originalNameRecordMatcher = (OriginalNameRecordMatcher)theEObject;
                                T result = caseOriginalNameRecordMatcher(originalNameRecordMatcher);
                                if (result == null) result = caseRecordMatcherStrategy(originalNameRecordMatcher);
                                if (result == null) result = caseWalkWidget(originalNameRecordMatcher);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.DATE_CREATED: {
                                DateCreated dateCreated = (DateCreated)theEObject;
                                T result = caseDateCreated(dateCreated);
                                if (result == null) result = caseInputConsumer(dateCreated);
                                if (result == null) result = caseOutputElement(dateCreated);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.DATE_INPUT: {
                                DateInput dateInput = (DateInput)theEObject;
                                T result = caseDateInput(dateInput);
                                if (result == null) result = caseInput(dateInput);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.DATE_GENERATOR: {
                                DateGenerator dateGenerator = (DateGenerator)theEObject;
                                T result = caseDateGenerator(dateGenerator);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.DATE_RECOGNIZER: {
                                DateRecognizer dateRecognizer = (DateRecognizer)theEObject;
                                T result = caseDateRecognizer(dateRecognizer);
                                if (result == null) result = caseInputConsumer(dateRecognizer);
                                if (result == null) result = caseDateGenerator(dateRecognizer);
                                if (result == null) result = caseWalkWidget(dateRecognizer);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.TEXT: {
                                Text text = (Text)theEObject;
                                T result = caseText(text);
                                if (result == null) result = caseStringGenerator(text);
                                if (result == null) result = caseWalkWidget(text);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.ACCESS_CONDITION: {
                                AccessCondition accessCondition = (AccessCondition)theEObject;
                                T result = caseAccessCondition(accessCondition);
                                if (result == null) result = caseInputConsumer(accessCondition);
                                if (result == null) result = caseOutputElement(accessCondition);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.DELIMITED_FILE: {
                                DelimitedFile delimitedFile = (DelimitedFile)theEObject;
                                T result = caseDelimitedFile(delimitedFile);
                                if (result == null) result = caseDataSource(delimitedFile);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.MAPPED_ELEMENT: {
                                MappedElement mappedElement = (MappedElement)theEObject;
                                T result = caseMappedElement(mappedElement);
                                if (result == null) result = caseOutputElement(mappedElement);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case CrosswalkPackage.MAPPED_ATTRIBUTE: {
                                MappedAttribute mappedAttribute = (MappedAttribute)theEObject;
                                T result = caseMappedAttribute(mappedAttribute);
                                if (result == null) result = caseOutputElement(mappedAttribute);
                                if (result == null) result = caseStringInput(mappedAttribute);
                                if (result == null) result = caseInput(mappedAttribute);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        default: return defaultCase(theEObject);
                }
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Tabbed Data Field</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Tabbed Data Field</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseTabbedDataField(TabbedDataField object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Trim Whitespace</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Trim Whitespace</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseTrimWhitespace(TrimWhitespace object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Title Info</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Title Info</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseTitleInfo(TitleInfo object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Cross Walk</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Cross Walk</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseCrossWalk(CrossWalk object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Output Element</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Output Element</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseOutputElement(OutputElement object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Walk Widget</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Walk Widget</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseWalkWidget(WalkWidget object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Tab Separated File</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Tab Separated File</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseTabSeparatedFile(TabSeparatedFile object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseDataSource(DataSource object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Data Field</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Data Field</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseDataField(DataField object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>String Input</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>String Input</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseStringInput(StringInput object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>String Generator</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>String Generator</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseStringGenerator(StringGenerator object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Input Consumer</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Input Consumer</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseInputConsumer(InputConsumer object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Input</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseInput(Input object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Abstract</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Abstract</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseAbstract(Abstract object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Genre</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Genre</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseGenre(Genre object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseIdentifier(Identifier object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Language</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseLanguage(Language object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Name</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseName(Name object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Subject</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Subject</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseSubject(Subject object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Type Of Resource</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Type Of Resource</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseTypeOfResource(TypeOfResource object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Record Matcher Strategy</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Record Matcher Strategy</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseRecordMatcherStrategy(RecordMatcherStrategy object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Original Name Record Matcher</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Original Name Record Matcher</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseOriginalNameRecordMatcher(OriginalNameRecordMatcher object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Date Created</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Date Created</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseDateCreated(DateCreated object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Date Input</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Date Input</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseDateInput(DateInput object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Date Generator</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Date Generator</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseDateGenerator(DateGenerator object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Date Recognizer</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Date Recognizer</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseDateRecognizer(DateRecognizer object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Text</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseText(Text object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Access Condition</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Access Condition</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseAccessCondition(AccessCondition object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Delimited File</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Delimited File</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseDelimitedFile(DelimitedFile object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Mapped Element</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Mapped Element</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMappedElement(MappedElement object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Mapped Attribute</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Mapped Attribute</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMappedAttribute(MappedAttribute object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch, but this is the last case anyway.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject)
         * @generated
         */
        public T defaultCase(EObject object) {
                return null;
        }

} //CrosswalkSwitch
