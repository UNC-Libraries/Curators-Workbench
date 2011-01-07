/*
 * copyright 2010 University of North Carolina at Chapel Hill
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
import crosswalk.diagram.edit.parts.StringInputName10EditPart;
import crosswalk.diagram.edit.parts.StringInputName11EditPart;
import crosswalk.diagram.edit.parts.StringInputName2EditPart;
import crosswalk.diagram.edit.parts.StringInputName3EditPart;
import crosswalk.diagram.edit.parts.StringInputName4EditPart;
import crosswalk.diagram.edit.parts.StringInputName5EditPart;
import crosswalk.diagram.edit.parts.StringInputName6EditPart;
import crosswalk.diagram.edit.parts.StringInputName7EditPart;
import crosswalk.diagram.edit.parts.StringInputName8EditPart;
import crosswalk.diagram.edit.parts.StringInputName9EditPart;
import crosswalk.diagram.edit.parts.StringInputNameEditPart;
import crosswalk.diagram.edit.parts.TabSeparatedFileSourceFileEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldColumnNumberEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldLabelColumnNumberEditPart;
import crosswalk.diagram.edit.parts.TextValueEditPart;
import crosswalk.diagram.edit.parts.WrappingLabel10EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel11EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel12EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel13EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel14EditPart;
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
    private IParser tabSeparatedFileSourceFile_5001Parser;

    /**
     * @generated
     */
    private IParser getTabSeparatedFileSourceFile_5001Parser() {
	if (tabSeparatedFileSourceFile_5001Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getTabSeparatedFile_SourceFile() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("file: {0}"); //$NON-NLS-1$
	    parser.setEditorPattern("file: {0}"); //$NON-NLS-1$
	    parser.setEditPattern("file: {0}"); //$NON-NLS-1$
	    tabSeparatedFileSourceFile_5001Parser = parser;
	}
	return tabSeparatedFileSourceFile_5001Parser;
    }

    /**
     * @generated
     */
    private TitleInfoLabelExpressionLabelParser titleInfoLabel_5018Parser;

    /**
     * @generated
     */
    private IParser getTitleInfoLabel_5018Parser() {
	if (titleInfoLabel_5018Parser == null) {
	    titleInfoLabel_5018Parser = new TitleInfoLabelExpressionLabelParser();
	}
	return titleInfoLabel_5018Parser;
    }

    /**
     * @generated
     */
    private AbstractLabelExpressionLabelParser abstractLabel_5019Parser;

    /**
     * @generated
     */
    private IParser getAbstractLabel_5019Parser() {
	if (abstractLabel_5019Parser == null) {
	    abstractLabel_5019Parser = new AbstractLabelExpressionLabelParser();
	}
	return abstractLabel_5019Parser;
    }

    /**
     * @generated
     */
    private GenreLabelExpressionLabelParser genreLabel_5020Parser;

    /**
     * @generated
     */
    private IParser getGenreLabel_5020Parser() {
	if (genreLabel_5020Parser == null) {
	    genreLabel_5020Parser = new GenreLabelExpressionLabelParser();
	}
	return genreLabel_5020Parser;
    }

    /**
     * @generated
     */
    private IdentifierLabelExpressionLabelParser identifierLabel_5021Parser;

    /**
     * @generated
     */
    private IParser getIdentifierLabel_5021Parser() {
	if (identifierLabel_5021Parser == null) {
	    identifierLabel_5021Parser = new IdentifierLabelExpressionLabelParser();
	}
	return identifierLabel_5021Parser;
    }

    /**
     * @generated
     */
    private LanguageLabelExpressionLabelParser languageLabel_5022Parser;

    /**
     * @generated
     */
    private IParser getLanguageLabel_5022Parser() {
	if (languageLabel_5022Parser == null) {
	    languageLabel_5022Parser = new LanguageLabelExpressionLabelParser();
	}
	return languageLabel_5022Parser;
    }

    /**
     * @generated
     */
    private NameLabelExpressionLabelParser nameLabel_5023Parser;

    /**
     * @generated
     */
    private IParser getNameLabel_5023Parser() {
	if (nameLabel_5023Parser == null) {
	    nameLabel_5023Parser = new NameLabelExpressionLabelParser();
	}
	return nameLabel_5023Parser;
    }

    /**
     * @generated
     */
    private SubjectLabelExpressionLabelParser subjectLabel_5024Parser;

    /**
     * @generated
     */
    private IParser getSubjectLabel_5024Parser() {
	if (subjectLabel_5024Parser == null) {
	    subjectLabel_5024Parser = new SubjectLabelExpressionLabelParser();
	}
	return subjectLabel_5024Parser;
    }

    /**
     * @generated
     */
    private TypeOfResourceLabelExpressionLabelParser typeOfResourceLabel_5025Parser;

    /**
     * @generated
     */
    private IParser getTypeOfResourceLabel_5025Parser() {
	if (typeOfResourceLabel_5025Parser == null) {
	    typeOfResourceLabel_5025Parser = new TypeOfResourceLabelExpressionLabelParser();
	}
	return typeOfResourceLabel_5025Parser;
    }

    /**
     * @generated
     */
    private OriginalNameRecordMatcherLabelExpressionLabelParser originalNameRecordMatcherLabel_5028Parser;

    /**
     * @generated
     */
    private IParser getOriginalNameRecordMatcherLabel_5028Parser() {
	if (originalNameRecordMatcherLabel_5028Parser == null) {
	    originalNameRecordMatcherLabel_5028Parser = new OriginalNameRecordMatcherLabelExpressionLabelParser();
	}
	return originalNameRecordMatcherLabel_5028Parser;
    }

    /**
     * @generated
     */
    private DateCreatedLabelExpressionLabelParser dateCreatedLabel_5030Parser;

    /**
     * @generated
     */
    private IParser getDateCreatedLabel_5030Parser() {
	if (dateCreatedLabel_5030Parser == null) {
	    dateCreatedLabel_5030Parser = new DateCreatedLabelExpressionLabelParser();
	}
	return dateCreatedLabel_5030Parser;
    }

    /**
     * @generated
     */
    private AccessConditionLabelExpressionLabelParser accessConditionLabel_5032Parser;

    /**
     * @generated
     */
    private IParser getAccessConditionLabel_5032Parser() {
	if (accessConditionLabel_5032Parser == null) {
	    accessConditionLabel_5032Parser = new AccessConditionLabelExpressionLabelParser();
	}
	return accessConditionLabel_5032Parser;
    }

    /**
     * @generated
     */
    private DateRecognizerLabelExpressionLabelParser dateRecognizerLabel_5034Parser;

    /**
     * @generated
     */
    private IParser getDateRecognizerLabel_5034Parser() {
	if (dateRecognizerLabel_5034Parser == null) {
	    dateRecognizerLabel_5034Parser = new DateRecognizerLabelExpressionLabelParser();
	}
	return dateRecognizerLabel_5034Parser;
    }

    /**
     * @generated
     */
    private IParser textValue_5035Parser;

    /**
     * @generated
     */
    private IParser getTextValue_5035Parser() {
	if (textValue_5035Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getText_Value() };
	    EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE.getText_Value() };
	    MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
	    textValue_5035Parser = parser;
	}
	return textValue_5035Parser;
    }

    /**
     * @generated
     */
    private TrimWhitespaceLabelExpressionLabelParser trimWhitespaceLabel_5037Parser;

    /**
     * @generated
     */
    private IParser getTrimWhitespaceLabel_5037Parser() {
	if (trimWhitespaceLabel_5037Parser == null) {
	    trimWhitespaceLabel_5037Parser = new TrimWhitespaceLabelExpressionLabelParser();
	}
	return trimWhitespaceLabel_5037Parser;
    }

    /**
     * @generated
     */
    private TabbedDataFieldLabelExpressionLabelParser tabbedDataFieldLabel_5026Parser;

    /**
     * @generated
     */
    private IParser getTabbedDataFieldLabel_5026Parser() {
	if (tabbedDataFieldLabel_5026Parser == null) {
	    tabbedDataFieldLabel_5026Parser = new TabbedDataFieldLabelExpressionLabelParser();
	}
	return tabbedDataFieldLabel_5026Parser;
    }

    /**
     * @generated
     */
    private IParser tabbedDataFieldLabelColumnNumber_5038Parser;

    /**
     * @generated
     */
    private IParser getTabbedDataFieldLabelColumnNumber_5038Parser() {
	if (tabbedDataFieldLabelColumnNumber_5038Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getDataField_Label(),
			    CrosswalkPackage.eINSTANCE.getTabbedDataField_ColumnNumber() };
	    EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE.getDataField_Label() };
	    MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
	    parser.setViewPattern("Tab {1}: {0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("Tab {1}: {0}"); //$NON-NLS-1$
	    tabbedDataFieldLabelColumnNumber_5038Parser = parser;
	}
	return tabbedDataFieldLabelColumnNumber_5038Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5009Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5009Parser() {
	if (stringInputName_5009Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5009Parser = parser;
	}
	return stringInputName_5009Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5011Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5011Parser() {
	if (stringInputName_5011Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5011Parser = parser;
	}
	return stringInputName_5011Parser;
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
    private IParser stringInputName_5013Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5013Parser() {
	if (stringInputName_5013Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5013Parser = parser;
	}
	return stringInputName_5013Parser;
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
    private IParser stringInputName_5015Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5015Parser() {
	if (stringInputName_5015Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5015Parser = parser;
	}
	return stringInputName_5015Parser;
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
    private IParser stringInputName_5017Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5017Parser() {
	if (stringInputName_5017Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5017Parser = parser;
	}
	return stringInputName_5017Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5027Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5027Parser() {
	if (stringInputName_5027Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    stringInputName_5027Parser = parser;
	}
	return stringInputName_5027Parser;
    }

    /**
     * @generated
     */
    private IParser dateInputName_5029Parser;

    /**
     * @generated
     */
    private IParser getDateInputName_5029Parser() {
	if (dateInputName_5029Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    dateInputName_5029Parser = parser;
	}
	return dateInputName_5029Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5031Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5031Parser() {
	if (stringInputName_5031Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    parser.setViewPattern("{0}"); //$NON-NLS-1$
	    parser.setEditorPattern("{0}"); //$NON-NLS-1$
	    parser.setEditPattern("{0}"); //$NON-NLS-1$
	    stringInputName_5031Parser = parser;
	}
	return stringInputName_5031Parser;
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
	    stringInputName_5033Parser = parser;
	}
	return stringInputName_5033Parser;
    }

    /**
     * @generated
     */
    private IParser stringInputName_5036Parser;

    /**
     * @generated
     */
    private IParser getStringInputName_5036Parser() {
	if (stringInputName_5036Parser == null) {
	    EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE.getInput_Name() };
	    MessageFormatParser parser = new MessageFormatParser(features);
	    stringInputName_5036Parser = parser;
	}
	return stringInputName_5036Parser;
    }

    /**
     * @generated
     */
    protected IParser getParser(int visualID) {
	switch (visualID) {
	case TabSeparatedFileSourceFileEditPart.VISUAL_ID:
	    return getTabSeparatedFileSourceFile_5001Parser();
	case WrappingLabel3EditPart.VISUAL_ID:
	    return getTitleInfoLabel_5018Parser();
	case WrappingLabel4EditPart.VISUAL_ID:
	    return getAbstractLabel_5019Parser();
	case WrappingLabel5EditPart.VISUAL_ID:
	    return getGenreLabel_5020Parser();
	case WrappingLabel6EditPart.VISUAL_ID:
	    return getIdentifierLabel_5021Parser();
	case WrappingLabel7EditPart.VISUAL_ID:
	    return getLanguageLabel_5022Parser();
	case WrappingLabel8EditPart.VISUAL_ID:
	    return getNameLabel_5023Parser();
	case WrappingLabel9EditPart.VISUAL_ID:
	    return getSubjectLabel_5024Parser();
	case WrappingLabel10EditPart.VISUAL_ID:
	    return getTypeOfResourceLabel_5025Parser();
	case WrappingLabel2EditPart.VISUAL_ID:
	    return getOriginalNameRecordMatcherLabel_5028Parser();
	case WrappingLabel11EditPart.VISUAL_ID:
	    return getDateCreatedLabel_5030Parser();
	case WrappingLabel12EditPart.VISUAL_ID:
	    return getAccessConditionLabel_5032Parser();
	case WrappingLabel13EditPart.VISUAL_ID:
	    return getDateRecognizerLabel_5034Parser();
	case TextValueEditPart.VISUAL_ID:
	    return getTextValue_5035Parser();
	case WrappingLabel14EditPart.VISUAL_ID:
	    return getTrimWhitespaceLabel_5037Parser();
	case TabbedDataFieldColumnNumberEditPart.VISUAL_ID:
	    return getTabbedDataFieldLabel_5026Parser();
	case TabbedDataFieldLabelColumnNumberEditPart.VISUAL_ID:
	    return getTabbedDataFieldLabelColumnNumber_5038Parser();
	case WrappingLabelEditPart.VISUAL_ID:
	    return getStringInputName_5009Parser();
	case StringInputNameEditPart.VISUAL_ID:
	    return getStringInputName_5011Parser();
	case StringInputName2EditPart.VISUAL_ID:
	    return getStringInputName_5012Parser();
	case StringInputName3EditPart.VISUAL_ID:
	    return getStringInputName_5013Parser();
	case StringInputName4EditPart.VISUAL_ID:
	    return getStringInputName_5014Parser();
	case StringInputName5EditPart.VISUAL_ID:
	    return getStringInputName_5015Parser();
	case StringInputName6EditPart.VISUAL_ID:
	    return getStringInputName_5016Parser();
	case StringInputName7EditPart.VISUAL_ID:
	    return getStringInputName_5017Parser();
	case StringInputName8EditPart.VISUAL_ID:
	    return getStringInputName_5027Parser();
	case DateInputNameEditPart.VISUAL_ID:
	    return getDateInputName_5029Parser();
	case StringInputName9EditPart.VISUAL_ID:
	    return getStringInputName_5031Parser();
	case StringInputName10EditPart.VISUAL_ID:
	    return getStringInputName_5033Parser();
	case StringInputName11EditPart.VISUAL_ID:
	    return getStringInputName_5036Parser();
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
