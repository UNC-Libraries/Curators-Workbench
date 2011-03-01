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
import crosswalk.diagram.edit.parts.DelimitedFileSourceFileEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeNameEditPart;
import crosswalk.diagram.edit.parts.StringInputName13EditPart;
import crosswalk.diagram.edit.parts.StringInputName2EditPart;
import crosswalk.diagram.edit.parts.StringInputName9EditPart;
import crosswalk.diagram.edit.parts.StringInputNameEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldLabelColumnNumberEditPart;
import crosswalk.diagram.edit.parts.TextValueEditPart;
import crosswalk.diagram.edit.parts.WrappingLabel12EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel13EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel14EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel15EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel16EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel9EditPart;
import crosswalk.diagram.parsers.DateRecognizerLabelExpressionLabelParser;
import crosswalk.diagram.parsers.MappedElementLabelExpressionLabelParser;
import crosswalk.diagram.parsers.MessageFormatParser;
import crosswalk.diagram.parsers.OriginalNameRecordMatcherLabelExpressionLabelParser;
import crosswalk.diagram.parsers.TabbedDataFieldLabelExpressionLabelParser;
import crosswalk.diagram.parsers.TrimWhitespaceLabelExpressionLabelParser;
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
	    stringInputName_5006Parser = parser;
	}
	return stringInputName_5006Parser;
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
	case WrappingLabel9EditPart.VISUAL_ID:
	    return getOriginalNameRecordMatcherLabel_5021Parser();
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
	case StringInputName9EditPart.VISUAL_ID:
	    return getStringInputName_5020Parser();
	case StringInputNameEditPart.VISUAL_ID:
	    return getStringInputName_5004Parser();
	case StringInputName2EditPart.VISUAL_ID:
	    return getStringInputName_5006Parser();
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
