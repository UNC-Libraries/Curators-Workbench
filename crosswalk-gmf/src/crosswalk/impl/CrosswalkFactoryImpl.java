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

import crosswalk.*;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.DataField;
import crosswalk.DateRecognizer;
import crosswalk.DateToISO8601StringConversion;
import crosswalk.DelimitedFile;
import crosswalk.Dictionary;
import crosswalk.EditingContainer;
import crosswalk.InputField;
import crosswalk.MappedAttribute;
import crosswalk.MappedElement;
import crosswalk.MetadataBlock;
import crosswalk.OriginalNameRecordMatcher;
import crosswalk.RecordMatches;
import crosswalk.RecordOutOfRangeException;
import crosswalk.TabbedDataField;
import crosswalk.Text;
import crosswalk.TrimWhitespace;
import crosswalk.Vocabulary;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class CrosswalkFactoryImpl extends EFactoryImpl implements CrosswalkFactory {
    private static MappedElementFeatureSetupAdapter mappedElementFeatureSetupAdapter =  new MappedElementFeatureSetupAdapter();

    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 */
    public static CrosswalkFactory init() {
		try {
			CrosswalkFactory theCrosswalkFactory = (CrosswalkFactory)EPackage.Registry.INSTANCE.getEFactory("http://lib.unc.edu/schemas/crosswalk"); 
			if (theCrosswalkFactory != null) {
				return theCrosswalkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CrosswalkFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 */
    public CrosswalkFactoryImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CrosswalkPackage.TABBED_DATA_FIELD: return createTabbedDataField();
			case CrosswalkPackage.TRIM_WHITESPACE: return createTrimWhitespace();
			case CrosswalkPackage.CROSS_WALK: return createCrossWalk();
			case CrosswalkPackage.DATA_FIELD: return createDataField();
			case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER: return createOriginalNameRecordMatcher();
			case CrosswalkPackage.DATE_RECOGNIZER: return createDateRecognizer();
			case CrosswalkPackage.TEXT: return createText();
			case CrosswalkPackage.DELIMITED_FILE: return createDelimitedFile();
			case CrosswalkPackage.MAPPED_ELEMENT: return createMappedElement();
			case CrosswalkPackage.MAPPED_ATTRIBUTE: return createMappedAttribute();
			case CrosswalkPackage.DATE_TO_ISO8601_STRING_CONVERSION: return createDateToISO8601StringConversion();
			case CrosswalkPackage.DICTIONARY: return createDictionary();
			case CrosswalkPackage.METADATA_BLOCK: return createMetadataBlock();
			case CrosswalkPackage.VOCABULARY: return createVocabulary();
			case CrosswalkPackage.INPUT_FIELD: return createInputField();
			case CrosswalkPackage.EDITING_CONTAINER: return createEditingContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CrosswalkPackage.DATA_EXCEPTION:
				return createDataExceptionFromString(eDataType, initialValue);
			case CrosswalkPackage.IPROJECT:
				return createIProjectFromString(eDataType, initialValue);
			case CrosswalkPackage.IFILE:
				return createIFileFromString(eDataType, initialValue);
			case CrosswalkPackage.RECORD_MATCHES:
				return createRecordMatchesFromString(eDataType, initialValue);
			case CrosswalkPackage.IFOLDER:
				return createIFolderFromString(eDataType, initialValue);
			case CrosswalkPackage.RECORD_OUT_OF_RANGE_EXCEPTION:
				return createRecordOutOfRangeExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CrosswalkPackage.DATA_EXCEPTION:
				return convertDataExceptionToString(eDataType, instanceValue);
			case CrosswalkPackage.IPROJECT:
				return convertIProjectToString(eDataType, instanceValue);
			case CrosswalkPackage.IFILE:
				return convertIFileToString(eDataType, instanceValue);
			case CrosswalkPackage.RECORD_MATCHES:
				return convertRecordMatchesToString(eDataType, instanceValue);
			case CrosswalkPackage.IFOLDER:
				return convertIFolderToString(eDataType, instanceValue);
			case CrosswalkPackage.RECORD_OUT_OF_RANGE_EXCEPTION:
				return convertRecordOutOfRangeExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public TabbedDataField createTabbedDataField() {
		TabbedDataFieldImpl tabbedDataField = new TabbedDataFieldImpl();
		return tabbedDataField;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public TrimWhitespace createTrimWhitespace() {
		TrimWhitespaceImpl trimWhitespace = new TrimWhitespaceImpl();
		return trimWhitespace;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public CrossWalk createCrossWalk() {
		CrossWalkImpl crossWalk = new CrossWalkImpl();
		return crossWalk;
	}

    /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public DataField createDataField() {
		DataFieldImpl dataField = new DataFieldImpl();
		return dataField;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public OriginalNameRecordMatcher createOriginalNameRecordMatcher() {
		OriginalNameRecordMatcherImpl originalNameRecordMatcher = new OriginalNameRecordMatcherImpl();
		return originalNameRecordMatcher;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public DateRecognizer createDateRecognizer() {
		DateRecognizerImpl dateRecognizer = new DateRecognizerImpl();
		return dateRecognizer;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public DelimitedFile createDelimitedFile() {
		DelimitedFileImpl delimitedFile = new DelimitedFileImpl();
		return delimitedFile;
	}

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated NOT
         */
        public MappedElement createMappedElement() {
                MappedElementImpl mappedElement = new MappedElementImpl();
                mappedElement.eAdapters().add(CrosswalkFactoryImpl.mappedElementFeatureSetupAdapter);
                return mappedElement;
        }

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public MappedAttribute createMappedAttribute() {
		MappedAttributeImpl mappedAttribute = new MappedAttributeImpl();
		return mappedAttribute;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public DateToISO8601StringConversion createDateToISO8601StringConversion() {
		DateToISO8601StringConversionImpl dateToISO8601StringConversion = new DateToISO8601StringConversionImpl();
		return dateToISO8601StringConversion;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary createDictionary() {
		DictionaryImpl dictionary = new DictionaryImpl();
		return dictionary;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataBlock createMetadataBlock() {
		MetadataBlockImpl metadataBlock = new MetadataBlockImpl();
		return metadataBlock;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vocabulary createVocabulary() {
		VocabularyImpl vocabulary = new VocabularyImpl();
		return vocabulary;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputField createInputField() {
		InputFieldImpl inputField = new InputFieldImpl();
		return inputField;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingContainer createEditingContainer() {
		EditingContainerImpl editingContainer = new EditingContainerImpl();
		return editingContainer;
	}

/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public DataException createDataExceptionFromString(EDataType eDataType, String initialValue) {
		return (DataException)super.createFromString(eDataType, initialValue);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public String convertDataExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public IProject createIProjectFromString(EDataType eDataType, String initialValue) {
		return (IProject)super.createFromString(eDataType, initialValue);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public String convertIProjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public IFile createIFileFromString(EDataType eDataType, String initialValue) {
	IFile result = null;
	try {
	    URI pathToFile = new URI(initialValue);
	    ResourcesPlugin.getPlugin();
	    IFile[] files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(pathToFile);
	    // FIXME okay if File via wrong project?
	    if (files.length > 0) {
		result = files[0];
	    }
	} catch (URISyntaxException ignored) {
	}
	if (result == null) {
	    result = (IFile) super.createFromString(eDataType, initialValue);
	}
	return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public String convertIFileToString(EDataType eDataType, Object instanceValue) {
	String result = null;
	if (instanceValue == null) {
	    return "";
	}
	IFile f = (IFile) instanceValue;
	result = f.getLocationURI().toASCIIString();
	if (result == null) {
	    result = super.convertToString(eDataType, instanceValue);
	}
	return result;
    }

    /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @SuppressWarnings("unchecked")
        public RecordMatches createRecordMatchesFromString(EDataType eDataType, String initialValue) {
		return (RecordMatches)super.createFromString(eDataType, initialValue);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String convertRecordMatchesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public IFolder createIFolderFromString(EDataType eDataType, String initialValue) {
		return (IFolder)super.createFromString(eDataType, initialValue);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String convertIFolderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public RecordOutOfRangeException createRecordOutOfRangeExceptionFromString(EDataType eDataType, String initialValue) {
		return (RecordOutOfRangeException)super.createFromString(eDataType, initialValue);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String convertRecordOutOfRangeExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public CrosswalkPackage getCrosswalkPackage() {
		return (CrosswalkPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static CrosswalkPackage getPackage() {
		return CrosswalkPackage.eINSTANCE;
	}

}
