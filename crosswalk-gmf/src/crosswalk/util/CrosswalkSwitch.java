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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
public class CrosswalkSwitch<T> extends Switch<T> {
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
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

								/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
        @Override
								protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CrosswalkPackage.TABBED_DATA_FIELD: {
				TabbedDataField tabbedDataField = (TabbedDataField)theEObject;
				T result = caseTabbedDataField(tabbedDataField);
				if (result == null) result = caseDataField(tabbedDataField);
				if (result == null) result = caseOutput(tabbedDataField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.TRIM_WHITESPACE: {
				TrimWhitespace trimWhitespace = (TrimWhitespace)theEObject;
				T result = caseTrimWhitespace(trimWhitespace);
				if (result == null) result = caseWalkWidget(trimWhitespace);
				if (result == null) result = caseOutput(trimWhitespace);
				if (result == null) result = caseInput(trimWhitespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.CROSS_WALK: {
				CrossWalk crossWalk = (CrossWalk)theEObject;
				T result = caseCrossWalk(crossWalk);
				if (result == null) result = caseSchemaProvider(crossWalk);
				if (result == null) result = caseMappingContainer(crossWalk);
				if (result == null) result = caseEditable(crossWalk);
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
			case CrosswalkPackage.DATA_SOURCE: {
				DataSource dataSource = (DataSource)theEObject;
				T result = caseDataSource(dataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.DATA_FIELD: {
				DataField dataField = (DataField)theEObject;
				T result = caseDataField(dataField);
				if (result == null) result = caseOutput(dataField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.OUTPUT: {
				Output output = (Output)theEObject;
				T result = caseOutput(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
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
				if (result == null) result = caseInput(originalNameRecordMatcher);
				if (result == null) result = caseWalkWidget(originalNameRecordMatcher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.DATE_RECOGNIZER: {
				DateRecognizer dateRecognizer = (DateRecognizer)theEObject;
				T result = caseDateRecognizer(dateRecognizer);
				if (result == null) result = caseWalkWidget(dateRecognizer);
				if (result == null) result = caseOutput(dateRecognizer);
				if (result == null) result = caseInput(dateRecognizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseOutput(text);
				if (result == null) result = caseWalkWidget(text);
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
				if (result == null) result = caseInput(mappedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.CONVERSION_STRATEGY: {
				ConversionStrategy conversionStrategy = (ConversionStrategy)theEObject;
				T result = caseConversionStrategy(conversionStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.DATE_TO_ISO8601_STRING_CONVERSION: {
				DateToISO8601StringConversion dateToISO8601StringConversion = (DateToISO8601StringConversion)theEObject;
				T result = caseDateToISO8601StringConversion(dateToISO8601StringConversion);
				if (result == null) result = caseConversionStrategy(dateToISO8601StringConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.DICTIONARY: {
				Dictionary dictionary = (Dictionary)theEObject;
				T result = caseDictionary(dictionary);
				if (result == null) result = caseSchemaProvider(dictionary);
				if (result == null) result = caseEditable(dictionary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.METADATA_BLOCK: {
				MetadataBlock metadataBlock = (MetadataBlock)theEObject;
				T result = caseMetadataBlock(metadataBlock);
				if (result == null) result = caseOutputElement(metadataBlock);
				if (result == null) result = caseMappingContainer(metadataBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.VOCABULARY: {
				Vocabulary vocabulary = (Vocabulary)theEObject;
				T result = caseVocabulary(vocabulary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.INPUT_FIELD: {
				InputField inputField = (InputField)theEObject;
				T result = caseInputField(inputField);
				if (result == null) result = caseOutput(inputField);
				if (result == null) result = caseInput(inputField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.SCHEMA_PROVIDER: {
				SchemaProvider schemaProvider = (SchemaProvider)theEObject;
				T result = caseSchemaProvider(schemaProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.MAPPING_CONTAINER: {
				MappingContainer mappingContainer = (MappingContainer)theEObject;
				T result = caseMappingContainer(mappingContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.EDITING_CONTAINER: {
				EditingContainer editingContainer = (EditingContainer)theEObject;
				T result = caseEditingContainer(editingContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrosswalkPackage.EDITABLE: {
				Editable editable = (Editable)theEObject;
				T result = caseEditable(editable);
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
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseOutput(Output object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Conversion Strategy</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseConversionStrategy(ConversionStrategy object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Date To ISO8601 String Conversion</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date To ISO8601 String Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseDateToISO8601StringConversion(DateToISO8601StringConversion object) {
		return null;
	}

        /**
	 * Returns the result of interpreting the object as an instance of '<em>Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dictionary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDictionary(Dictionary object) {
		return null;
	}

								/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataBlock(MetadataBlock object) {
		return null;
	}

								/**
	 * Returns the result of interpreting the object as an instance of '<em>Vocabulary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocabulary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabulary(Vocabulary object) {
		return null;
	}

								/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputField(InputField object) {
		return null;
	}

								/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaProvider(SchemaProvider object) {
		return null;
	}

								/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingContainer(MappingContainer object) {
		return null;
	}

								/**
	 * Returns the result of interpreting the object as an instance of '<em>Editing Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editing Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditingContainer(EditingContainer object) {
		return null;
	}

								/**
	 * Returns the result of interpreting the object as an instance of '<em>Editable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditable(Editable object) {
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
        @Override
								public T defaultCase(EObject object) {
		return null;
	}

} //CrosswalkSwitch
