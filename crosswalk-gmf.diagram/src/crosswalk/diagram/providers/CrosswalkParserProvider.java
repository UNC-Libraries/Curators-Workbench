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
package crosswalk.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.CrosswalkPackage;
import crosswalk.diagram.edit.parts.DateInputNameEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileSourceFileEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeNameEditPart;
import crosswalk.diagram.edit.parts.StringInputName10EditPart;
import crosswalk.diagram.edit.parts.StringInputName11EditPart;
import crosswalk.diagram.edit.parts.StringInputName12EditPart;
import crosswalk.diagram.edit.parts.StringInputName13EditPart;
import crosswalk.diagram.edit.parts.StringInputName2EditPart;
import crosswalk.diagram.edit.parts.StringInputName3EditPart;
import crosswalk.diagram.edit.parts.StringInputName4EditPart;
import crosswalk.diagram.edit.parts.StringInputName5EditPart;
import crosswalk.diagram.edit.parts.StringInputName6EditPart;
import crosswalk.diagram.edit.parts.StringInputName7EditPart;
import crosswalk.diagram.edit.parts.StringInputName8EditPart;
import crosswalk.diagram.edit.parts.StringInputName9EditPart;
import crosswalk.diagram.edit.parts.StringInputNameEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldLabelColumnNumberEditPart;
import crosswalk.diagram.edit.parts.TextValueEditPart;
import crosswalk.diagram.edit.parts.WrappingLabel10EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel11EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel12EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel13EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel14EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel15EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel16EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel2EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel3EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel4EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel5EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel6EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel7EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel8EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel9EditPart;
import crosswalk.diagram.edit.parts.WrappingLabelEditPart;
import crosswalk.diagram.parsers.AbstractLabelExpressionLabelParser;
import crosswalk.diagram.parsers.AccessConditionLabelExpressionLabelParser;
import crosswalk.diagram.parsers.DateCreatedLabelExpressionLabelParser;
import crosswalk.diagram.parsers.DateRecognizerLabelExpressionLabelParser;
import crosswalk.diagram.parsers.GenreLabelExpressionLabelParser;
import crosswalk.diagram.parsers.IdentifierLabelExpressionLabelParser;
import crosswalk.diagram.parsers.LanguageLabelExpressionLabelParser;
import crosswalk.diagram.parsers.MappedElementLabelExpressionLabelParser;
import crosswalk.diagram.parsers.MessageFormatParser;
import crosswalk.diagram.parsers.NameLabelExpressionLabelParser;
import crosswalk.diagram.parsers.OriginalNameRecordMatcherLabelExpressionLabelParser;
import crosswalk.diagram.parsers.SubjectLabelExpressionLabelParser;
import crosswalk.diagram.parsers.TabbedDataFieldLabelExpressionLabelParser;
import crosswalk.diagram.parsers.TitleInfoLabelExpressionLabelParser;
import crosswalk.diagram.parsers.TrimWhitespaceLabelExpressionLabelParser;
import crosswalk.diagram.parsers.TypeOfResourceLabelExpressionLabelParser;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;

/**
 * @generated
 */
public class CrosswalkParserProvider extends AbstractProvider implements IParserProvider {

    /**
     * @generated
     */
    private IParser delimitedFileSourceFile_5003Parser;

    /**
     * @generated
     */
    private IParser getDelimitedFileSourceFile_5003Parser() {
	if (delimitedFileSourceFile_5003Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getDelimitedFile_SourceFile() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    delimitedFileSourceFile_5003Parser = parser;
	}
	return delimitedFileSourceFile_5003Parser;
    }

    /**
     * @generated
     */
    private TitleInfoLabelExpressionLabelParser titleInfoLabel_5005Parser;

    /**
     * @generated
     */
    private IParser getTitleInfoLabel_5005Parser() {
	if (titleInfoLabel_5005Parser == null) {
	    titleInfoLabel_5005Parser = new TitleInfoLabelExpressionLabelParser();
	}
	return titleInfoLabel_5005Parser;
    }

    /**
     * @generated
     */
    private AbstractLabelExpressionLabelParser abstractLabel_5007Parser;

    /**
     * @generated
     */
    private IParser getAbstractLabel_5007Parser() {
	if (abstractLabel_5007Parser == null) {
	    abstractLabel_5007Parser = new AbstractLabelExpressionLabelParser();
	}
	return abstractLabel_5007Parser;
    }

    /**
     * @generated
     */
    private GenreLabelExpressionLabelParser genreLabel_5009Parser;

    /**
     * @generated
     */
    private IParser getGenreLabel_5009Parser() {
	if (genreLabel_5009Parser == null) {
	    genreLabel_5009Parser = new GenreLabelExpressionLabelParser();
	}
	return genreLabel_5009Parser;
    }

    /**
     * @generated
     */
    private IdentifierLabelExpressionLabelParser identifierLabel_5011Parser;

    /**
     * @generated
     */
    private IParser getIdentifierLabel_5011Parser() {
	if (identifierLabel_5011Parser == null) {
	    identifierLabel_5011Parser = new IdentifierLabelExpressionLabelParser();
	}
	return identifierLabel_5011Parser;
    }

    /**
     * @generated
     */
    private LanguageLabelExpressionLabelParser languageLabel_5013Parser;

    /**
     * @generated
     */
    private IParser getLanguageLabel_5013Parser() {
	if (languageLabel_5013Parser == null) {
	    languageLabel_5013Parser = new LanguageLabelExpressionLabelParser();
	}
	return languageLabel_5013Parser;
    }

    /**
     * @generated
     */
    private NameLabelExpressionLabelParser nameLabel_5015Parser;

    /**
     * @generated
     */
    private IParser getNameLabel_5015Parser() {
	if (nameLabel_5015Parser == null) {
	    nameLabel_5015Parser = new NameLabelExpressionLabelParser();
	}
	return nameLabel_5015Parser;
    }

    /**
     * @generated
     */
    private SubjectLabelExpressionLabelParser subjectLabel_5017Parser;

    /**
     * @generated
     */
    private IParser getSubjectLabel_5017Parser() {
	if (subjectLabel_5017Parser == null) {
	    subjectLabel_5017Parser = new SubjectLabelExpressionLabelParser();
	}
	return subjectLabel_5017Parser;
    }

    /**
     * @generated
     */
    private TypeOfResourceLabelExpressionLabelParser typeOfResourceLabel_5019Parser;

    /**
     * @generated
     */
    private IParser getTypeOfResourceLabel_5019Parser() {
	if (typeOfResourceLabel_5019Parser == null) {
	    typeOfResourceLabel_5019Parser = new TypeOfResourceLabelExpressionLabelParser();
	}
	return typeOfResourceLabel_5019Parser;
    }

    /**
     * @generated
     */
    private OriginalNameRecordMatcherLabelExpressionLabelParser originalNameRecordMatcherLabel_5021Parser;

    /**
     * @generated
     */
    private IParser getOriginalNameRecordMatcherLabel_5021Parser() {
	if (originalNameRecordMatcherLabel_5021Parser == null) {
	    originalNameRecordMatcherLabel_5021Parser = new OriginalNameRecordMatcherLabelExpressionLabelParser();
	}
	return originalNameRecordMatcherLabel_5021Parser;
    }

    /**
     * @generated
     */
    private DateCreatedLabelExpressionLabelParser dateCreatedLabel_5023Parser;

    /**
     * @generated
     */
    private IParser getDateCreatedLabel_5023Parser() {
	if (dateCreatedLabel_5023Parser == null) {
	    dateCreatedLabel_5023Parser = new DateCreatedLabelExpressionLabelParser();
	}
	return dateCreatedLabel_5023Parser;
    }

    /**
     * @generated
     */
    private AccessConditionLabelExpressionLabelParser accessConditionLabel_5025Parser;

    /**
     * @generated
     */
    private IParser getAccessConditionLabel_5025Parser() {
	if (accessConditionLabel_5025Parser == null) {
	    accessConditionLabel_5025Parser = new AccessConditionLabelExpressionLabelParser();
	}
	return accessConditionLabel_5025Parser;
    }

    /**
     * @generated
     */
    private DateRecognizerLabelExpressionLabelParser dateRecognizerLabel_5027Parser;

    /**
     * @generated
     */
    private IParser getDateRecognizerLabel_5027Parser() {
	if (dateRecognizerLabel_5027Parser == null) {
	    dateRecognizerLabel_5027Parser = new DateRecognizerLabelExpressionLabelParser();
	}
	return dateRecognizerLabel_5027Parser;
    }

    /**
     * @generated
     */
    private IParser textValue_5028Parser;

    /**
     * @generated
     */
    private IParser getTextValue_5028Parser() {
	if (textValue_5028Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getText_Value() };
	    EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE.getText_Value() };
	    MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
	    textValue_5028Parser = parser;
	}
	return textValue_5028Parser;
    }

    /**
     * @generated
     */
    private TrimWhitespaceLabelExpressionLabelParser trimWhitespaceLabel_5030Parser;

    /**
     * @generated
     */
    private IParser getTrimWhitespaceLabel_5030Parser() {
	if (trimWhitespaceLabel_5030Parser == null) {
	    trimWhitespaceLabel_5030Parser = new TrimWhitespaceLabelExpressionLabelParser();
	}
	return trimWhitespaceLabel_5030Parser;
    }

    /**
     * @generated
     */
    private MappedElementLabelExpressionLabelParser mappedElementLabel_5034Parser;

    /**
     * @generated
     */
    private IParser getMappedElementLabel_5034Parser() {
	if (mappedElementLabel_5034Parser == null) {
	    mappedElementLabel_5034Parser = new MappedElementLabelExpressionLabelParser();
	}
	return mappedElementLabel_5034Parser;
    }

    /**
     * @generated
     */
    private TabbedDataFieldLabelExpressionLabelParser tabbedDataFieldLabel_5001Parser;

    /**
     * @generated
     */
    private IParser getTabbedDataFieldLabel_5001Parser() {
	if (tabbedDataFieldLabel_5001Parser == null) {
	    tabbedDataFieldLabel_5001Parser = new TabbedDataFieldLabelExpressionLabelParser();
	}
	return tabbedDataFieldLabel_5001Parser;
    }

    /**
     * @generated
     */
    private IParser tabbedDataFieldLabelColumnNumber_5002Parser;

    /**
     * @generated
     */
    private IParser getTabbedDataFieldLabelColumnNumber_5002Parser() {
	if (tabbedDataFieldLabelColumnNumber_5002Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getDataField_Label(),
			    CrosswalkPackage.eINSTANCE.getTabbedDataField_ColumnNumber() };
	    EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE.getDataField_Label() };
	    MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
	    parser.setViewPattern("Tab {1}: {0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("Tab {1}: {0}"); //$NON-NLS-1$
	    tabbedDataFieldLabelColumnNumber_5002Parser = parser;
	}
	return tabbedDataFieldLabelColumnNumber_5002Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5004Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5004Parser() {
	if (stringInputName_5004Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5004Parser = parser;
	}
	return stringInputName_5004Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5006Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5006Parser() {
	if (stringInputName_5006Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5006Parser = parser;
	}
	return stringInputName_5006Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5008Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5008Parser() {
	if (stringInputName_5008Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5008Parser = parser;
	}
	return stringInputName_5008Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5010Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5010Parser() {
	if (stringInputName_5010Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5010Parser = parser;
	}
	return stringInputName_5010Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5012Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5012Parser() {
	if (stringInputName_5012Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5012Parser = parser;
	}
	return stringInputName_5012Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5014Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5014Parser() {
	if (stringInputName_5014Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5014Parser = parser;
	}
	return stringInputName_5014Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5016Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5016Parser() {
	if (stringInputName_5016Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5016Parser = parser;
	}
	return stringInputName_5016Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5018Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5018Parser() {
	if (stringInputName_5018Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5018Parser = parser;
	}
	return stringInputName_5018Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5020Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5020Parser() {
	if (stringInputName_5020Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    stringInputName_5020Parser = parser;
	}
	return stringInputName_5020Parser;
    }

    /**
     * @generated
     */
    private IParser dateInputName_5022Parser;

    /**
     * @generated
     */
    private IParser getDateInputName_5022Parser() {
	if (dateInputName_5022Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    dateInputName_5022Parser = parser;
	}
	return dateInputName_5022Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5024Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5024Parser() {
	if (stringInputName_5024Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5024Parser = parser;
	}
	return stringInputName_5024Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5026Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5026Parser() {
	if (stringInputName_5026Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    stringInputName_5026Parser = parser;
	}
	return stringInputName_5026Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5029Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5029Parser() {
	if (stringInputName_5029Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    stringInputName_5029Parser = parser;
	}
	return stringInputName_5029Parser;
    }

    /**
     * @generated
     */
    private MappedElementLabelExpressionLabelParser mappedElementLabel_5031Parser;

    /**
     * @generated
     */
    private IParser getMappedElementLabel_5031Parser() {
	if (mappedElementLabel_5031Parser == null) {
	    mappedElementLabel_5031Parser = new MappedElementLabelExpressionLabelParser();
	}
	return mappedElementLabel_5031Parser;
    }

    /**
     * @generated
     */
    private IParser mappedAttributeName_5032Parser;

    /**
     * @generated
     */
    private IParser getMappedAttributeName_5032Parser() {
	if (mappedAttributeName_5032Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    mappedAttributeName_5032Parser = parser;
	}
	return mappedAttributeName_5032Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5033Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5033Parser() {
	if (stringInputName_5033Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5033Parser = parser;
	}
	return stringInputName_5033Parser;
    }

    /**
     * @generated
     */
    protected IParser getParser(int visualID) {
	switch (visualID) {
	case DelimitedFileSourceFileEditPart.VISUAL_ID:
	    return getDelimitedFileSourceFile_5003Parser();
	case WrappingLabelEditPart.VISUAL_ID:
	    return getTitleInfoLabel_5005Parser();
	case WrappingLabel2EditPart.VISUAL_ID:
	    return getAbstractLabel_5007Parser();
	case WrappingLabel3EditPart.VISUAL_ID:
	    return getGenreLabel_5009Parser();
	case WrappingLabel4EditPart.VISUAL_ID:
	    return getIdentifierLabel_5011Parser();
	case WrappingLabel5EditPart.VISUAL_ID:
	    return getLanguageLabel_5013Parser();
	case WrappingLabel6EditPart.VISUAL_ID:
	    return getNameLabel_5015Parser();
	case WrappingLabel7EditPart.VISUAL_ID:
	    return getSubjectLabel_5017Parser();
	case WrappingLabel8EditPart.VISUAL_ID:
	    return getTypeOfResourceLabel_5019Parser();
	case WrappingLabel9EditPart.VISUAL_ID:
	    return getOriginalNameRecordMatcherLabel_5021Parser();
	case WrappingLabel10EditPart.VISUAL_ID:
	    return getDateCreatedLabel_5023Parser();
	case WrappingLabel11EditPart.VISUAL_ID:
	    return getAccessConditionLabel_5025Parser();
	case WrappingLabel12EditPart.VISUAL_ID:
	    return getDateRecognizerLabel_5027Parser();
	case TextValueEditPart.VISUAL_ID:
	    return getTextValue_5028Parser();
	case WrappingLabel13EditPart.VISUAL_ID:
	    return getTrimWhitespaceLabel_5030Parser();
	case WrappingLabel14EditPart.VISUAL_ID:
	    return getMappedElementLabel_5034Parser();
	case WrappingLabel15EditPart.VISUAL_ID:
	    return getTabbedDataFieldLabel_5001Parser();
	case TabbedDataFieldLabelColumnNumberEditPart.VISUAL_ID:
	    return getTabbedDataFieldLabelColumnNumber_5002Parser();
	case StringInputNameEditPart.VISUAL_ID:
	    return getStringInputName_5004Parser();
	case StringInputName2EditPart.VISUAL_ID:
	    return getStringInputName_5006Parser();
	case StringInputName3EditPart.VISUAL_ID:
	    return getStringInputName_5008Parser();
	case StringInputName4EditPart.VISUAL_ID:
	    return getStringInputName_5010Parser();
	case StringInputName5EditPart.VISUAL_ID:
	    return getStringInputName_5012Parser();
	case StringInputName6EditPart.VISUAL_ID:
	    return getStringInputName_5014Parser();
	case StringInputName7EditPart.VISUAL_ID:
	    return getStringInputName_5016Parser();
	case StringInputName8EditPart.VISUAL_ID:
	    return getStringInputName_5018Parser();
	case StringInputName9EditPart.VISUAL_ID:
	    return getStringInputName_5020Parser();
	case DateInputNameEditPart.VISUAL_ID:
	    return getDateInputName_5022Parser();
	case StringInputName10EditPart.VISUAL_ID:
	    return getStringInputName_5024Parser();
	case StringInputName11EditPart.VISUAL_ID:
	    return getStringInputName_5026Parser();
	case StringInputName12EditPart.VISUAL_ID:
	    return getStringInputName_5029Parser();
	case WrappingLabel16EditPart.VISUAL_ID:
	    return getMappedElementLabel_5031Parser();
	case MappedAttributeNameEditPart.VISUAL_ID:
	    return getMappedAttributeName_5032Parser();
	case StringInputName13EditPart.VISUAL_ID:
	    return getStringInputName_5033Parser();
	}
	return null;
    }

    /**
     * Utility method that consults ParserService
     * @generated
     */
    public static IParser getParser(IElementType type, EObject object, String parserHint) {
	return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
    }

    /**
     * @generated
     */
    public IParser getParser(IAdaptable hint) {
	String vid = (String) hint.getAdapter(String.class);
	if (vid != null) {
	    return getParser(CrosswalkVisualIDRegistry.getVisualID(vid));
	}
	View view = (View) hint.getAdapter(View.class);
	if (view != null) {
	    return getParser(CrosswalkVisualIDRegistry.getVisualID(view));
	}
	return null;
    }

    /**
     * @generated
     */
    public boolean provides(IOperation operation) {
	if (operation instanceof GetParserOperation) {
	    IAdaptable hint = ((GetParserOperation) operation).getHint();
	    if (CrosswalkElementTypes.getElement(hint) == null) {
		return false;
	    }
	    return getParser(hint) != null;
	}
	return false;
    }

    /**
     * @generated
     */
    private static class HintAdapter extends ParserHintAdapter {

	/**
	 * @generated
	 */
	private final IElementType elementType;

	/**
	 * @generated
	 */
	public HintAdapter(IElementType type, EObject object, String parserHint) {
	    super(object, parserHint);
	    assert type != null;
	    elementType = type;
	}

	/**
	 * @generated
	 */
	@Override
	public Object getAdapter(Class adapter) {
	    if (IElementType.class.equals(adapter)) {
		return elementType;
	    }
	    return super.getAdapter(adapter);
	}
    }

}
