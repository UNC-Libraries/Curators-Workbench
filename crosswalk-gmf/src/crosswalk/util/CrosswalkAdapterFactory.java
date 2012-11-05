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
			public Adapter caseCurrentUsername(CurrentUsername object) {
				return createCurrentUsernameAdapter();
			}
			@Override
			public Adapter caseCurrentDate(CurrentDate object) {
				return createCurrentDateAdapter();
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
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter caseDataField(DataField object) {
				return createDataFieldAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
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
			public Adapter caseDateRecognizer(DateRecognizer object) {
				return createDateRecognizerAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseDelimitedFile(DelimitedFile object) {
				return createDelimitedFileAdapter();
			}
			@Override
			public Adapter caseMappedElement(MappedElement object) {
				return createMappedElementAdapter();
			}
			@Override
			public Adapter caseMappedAttribute(MappedAttribute object) {
				return createMappedAttributeAdapter();
			}
			@Override
			public Adapter caseConversionStrategy(ConversionStrategy object) {
				return createConversionStrategyAdapter();
			}
			@Override
			public Adapter caseDateToISO8601StringConversion(DateToISO8601StringConversion object) {
				return createDateToISO8601StringConversionAdapter();
			}
			@Override
			public Adapter caseDictionary(Dictionary object) {
				return createDictionaryAdapter();
			}
			@Override
			public Adapter caseMetadataBlock(MetadataBlock object) {
				return createMetadataBlockAdapter();
			}
			@Override
			public <F> Adapter caseInputField(InputField<F> object) {
				return createInputFieldAdapter();
			}
			@Override
			public Adapter caseTextInputField(TextInputField object) {
				return createTextInputFieldAdapter();
			}
			@Override
			public Adapter caseContextProvider(ContextProvider object) {
				return createContextProviderAdapter();
			}
			@Override
			public Adapter caseMappingContainer(MappingContainer object) {
				return createMappingContainerAdapter();
			}
			@Override
			public Adapter caseEditingContainer(EditingContainer object) {
				return createEditingContainerAdapter();
			}
			@Override
			public Adapter caseEditable(Editable object) {
				return createEditableAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseFormElement(FormElement object) {
				return createFormElementAdapter();
			}
			@Override
			public Adapter caseParagraph(Paragraph object) {
				return createParagraphAdapter();
			}
			@Override
			public Adapter caseDateInputField(DateInputField object) {
				return createDateInputFieldAdapter();
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
	 * Creates a new adapter for an object of class '{@link crosswalk.CurrentUsername <em>Current Username</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.CurrentUsername
	 * @generated
	 */
	public Adapter createCurrentUsernameAdapter() {
		return null;
	}

								/**
	 * Creates a new adapter for an object of class '{@link crosswalk.CurrentDate <em>Current Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.CurrentDate
	 * @generated
	 */
	public Adapter createCurrentDateAdapter() {
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
	 * Creates a new adapter for an object of class '{@link crosswalk.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.Output
	 * @generated
	 */
        public Adapter createOutputAdapter() {
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
	 * Creates a new adapter for an object of class '{@link crosswalk.MappedElement <em>Mapped Element</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.MappedElement
	 * @generated
	 */
        public Adapter createMappedElementAdapter() {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link crosswalk.MappedAttribute <em>Mapped Attribute</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.MappedAttribute
	 * @generated
	 */
        public Adapter createMappedAttributeAdapter() {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link crosswalk.ConversionStrategy <em>Conversion Strategy</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.ConversionStrategy
	 * @generated
	 */
        public Adapter createConversionStrategyAdapter() {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link crosswalk.DateToISO8601StringConversion <em>Date To ISO8601 String Conversion</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.DateToISO8601StringConversion
	 * @generated
	 */
        public Adapter createDateToISO8601StringConversionAdapter() {
		return null;
	}

        /**
	 * Creates a new adapter for an object of class '{@link crosswalk.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.Dictionary
	 * @generated
	 */
	public Adapter createDictionaryAdapter() {
		return null;
	}

								/**
	 * Creates a new adapter for an object of class '{@link crosswalk.MetadataBlock <em>Metadata Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.MetadataBlock
	 * @generated
	 */
	public Adapter createMetadataBlockAdapter() {
		return null;
	}

								/**
	 * Creates a new adapter for an object of class '{@link crosswalk.InputField <em>Input Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.InputField
	 * @generated
	 */
	public Adapter createInputFieldAdapter() {
		return null;
	}

								/**
	 * Creates a new adapter for an object of class '{@link crosswalk.TextInputField <em>Text Input Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.TextInputField
	 * @generated
	 */
	public Adapter createTextInputFieldAdapter() {
		return null;
	}

								/**
	 * Creates a new adapter for an object of class '{@link crosswalk.ContextProvider <em>Context Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.ContextProvider
	 * @generated
	 */
	public Adapter createContextProviderAdapter() {
		return null;
	}

								/**
	 * Creates a new adapter for an object of class '{@link crosswalk.MappingContainer <em>Mapping Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.MappingContainer
	 * @generated
	 */
	public Adapter createMappingContainerAdapter() {
		return null;
	}

								/**
	 * Creates a new adapter for an object of class '{@link crosswalk.EditingContainer <em>Editing Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.EditingContainer
	 * @generated
	 */
	public Adapter createEditingContainerAdapter() {
		return null;
	}

								/**
	 * Creates a new adapter for an object of class '{@link crosswalk.Editable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.Editable
	 * @generated
	 */
	public Adapter createEditableAdapter() {
		return null;
	}

								/**
	 * Creates a new adapter for an object of class '{@link crosswalk.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

								/**
	 * Creates a new adapter for an object of class '{@link crosswalk.FormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.FormElement
	 * @generated
	 */
	public Adapter createFormElementAdapter() {
		return null;
	}

								/**
	 * Creates a new adapter for an object of class '{@link crosswalk.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.Paragraph
	 * @generated
	 */
	public Adapter createParagraphAdapter() {
		return null;
	}

								/**
	 * Creates a new adapter for an object of class '{@link crosswalk.DateInputField <em>Date Input Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crosswalk.DateInputField
	 * @generated
	 */
	public Adapter createDateInputFieldAdapter() {
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
