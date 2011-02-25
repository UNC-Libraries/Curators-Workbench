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

import crosswalk.Abstract;
import crosswalk.CrossWalk;
import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.DataField;
import crosswalk.Genre;
import crosswalk.Identifier;
import crosswalk.Language;
import crosswalk.Name;
import crosswalk.OriginalNameRecordMatcher;
import crosswalk.RecordMatches;
import crosswalk.RecordOutOfRangeException;
import crosswalk.StringInput;
import crosswalk.Subject;
import crosswalk.TabSeparatedFile;
import crosswalk.TabbedDataField;
import crosswalk.TitleInfo;
import crosswalk.TrimWhitespace;
import crosswalk.TypeOfResource;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class CrosswalkFactoryImpl extends EFactoryImpl implements CrosswalkFactory {
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
                        case CrosswalkPackage.TITLE_INFO: return createTitleInfo();
                        case CrosswalkPackage.CROSS_WALK: return createCrossWalk();
                        case CrosswalkPackage.TAB_SEPARATED_FILE: return createTabSeparatedFile();
                        case CrosswalkPackage.DATA_FIELD: return createDataField();
                        case CrosswalkPackage.STRING_INPUT: return createStringInput();
                        case CrosswalkPackage.ABSTRACT: return createAbstract();
                        case CrosswalkPackage.GENRE: return createGenre();
                        case CrosswalkPackage.IDENTIFIER: return createIdentifier();
                        case CrosswalkPackage.LANGUAGE: return createLanguage();
                        case CrosswalkPackage.NAME: return createName();
                        case CrosswalkPackage.SUBJECT: return createSubject();
                        case CrosswalkPackage.TYPE_OF_RESOURCE: return createTypeOfResource();
                        case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER: return createOriginalNameRecordMatcher();
                        case CrosswalkPackage.DATE_CREATED: return createDateCreated();
                        case CrosswalkPackage.DATE_INPUT: return createDateInput();
                        case CrosswalkPackage.DATE_RECOGNIZER: return createDateRecognizer();
                        case CrosswalkPackage.TEXT: return createText();
                        case CrosswalkPackage.ACCESS_CONDITION: return createAccessCondition();
                        case CrosswalkPackage.DELIMITED_FILE: return createDelimitedFile();
                        case CrosswalkPackage.MAPPED_ELEMENT: return createMappedElement();
                        case CrosswalkPackage.MAPPED_ATTRIBUTE: return createMappedAttribute();
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
    public TitleInfo createTitleInfo() {
                TitleInfoImpl titleInfo = new TitleInfoImpl();
                return titleInfo;
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
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public TabSeparatedFile createTabSeparatedFile() {
                TabSeparatedFileImpl tabSeparatedFile = new TabSeparatedFileImpl();
                return tabSeparatedFile;
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
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public StringInput createStringInput() {
                StringInputImpl stringInput = new StringInputImpl();
                return stringInput;
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Abstract createAbstract() {
                AbstractImpl abstract_ = new AbstractImpl();
                return abstract_;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Genre createGenre() {
                GenreImpl genre = new GenreImpl();
                return genre;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Identifier createIdentifier() {
                IdentifierImpl identifier = new IdentifierImpl();
                return identifier;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Language createLanguage() {
                LanguageImpl language = new LanguageImpl();
                return language;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Name createName() {
                NameImpl name = new NameImpl();
                return name;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Subject createSubject() {
                SubjectImpl subject = new SubjectImpl();
                return subject;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TypeOfResource createTypeOfResource() {
                TypeOfResourceImpl typeOfResource = new TypeOfResourceImpl();
                return typeOfResource;
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
        public DateCreated createDateCreated() {
                DateCreatedImpl dateCreated = new DateCreatedImpl();
                return dateCreated;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DateInput createDateInput() {
                DateInputImpl dateInput = new DateInputImpl();
                return dateInput;
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
        public AccessCondition createAccessCondition() {
                AccessConditionImpl accessCondition = new AccessConditionImpl();
                return accessCondition;
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
         * @generated
         */
        public MappedElement createMappedElement() {
                MappedElementImpl mappedElement = new MappedElementImpl();
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
