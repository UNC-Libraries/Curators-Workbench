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
import crosswalk.diagram.edit.parts.DateInputFieldLabelEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileSourceFileEditPart;
import crosswalk.diagram.edit.parts.DictionaryDescriptionEditPart;
import crosswalk.diagram.edit.parts.DictionaryNameEditPart;
import crosswalk.diagram.edit.parts.FileBlockDescriptionEditPart;
import crosswalk.diagram.edit.parts.FileBlockNameEditPart;
import crosswalk.diagram.edit.parts.FormDescriptionEditPart;
import crosswalk.diagram.edit.parts.FormTitleEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockName2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockName3EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockNameEditPart;
import crosswalk.diagram.edit.parts.ParagraphHeadingEditPart;
import crosswalk.diagram.edit.parts.ParagraphTextEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldLabelColumnNumberEditPart;
import crosswalk.diagram.edit.parts.TextInputFieldLabelEditPart;
import crosswalk.diagram.edit.parts.TextValueEditPart;
import crosswalk.diagram.edit.parts.WrappingLabel2EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel3EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel4EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel5EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel6EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel7EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel8EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel9EditPart;
import crosswalk.diagram.edit.parts.WrappingLabelEditPart;
import crosswalk.diagram.parsers.CurrentDateLabelExpressionLabelParser;
import crosswalk.diagram.parsers.CurrentUsernameLabelExpressionLabelParser;
import crosswalk.diagram.parsers.DateRecognizerLabelExpressionLabelParser;
import crosswalk.diagram.parsers.DelimitedFileLabelExpressionLabelParser;
import crosswalk.diagram.parsers.MappedAttributeLabelExpressionLabelParser;
import crosswalk.diagram.parsers.MappedElementLabelExpressionLabelParser;
import crosswalk.diagram.parsers.MessageFormatMessageFormatParser;
import crosswalk.diagram.parsers.MessageFormatParser;
import crosswalk.diagram.parsers.NativeParser;
import crosswalk.diagram.parsers.OriginalNameRecordMatcherLabelExpressionLabelParser;
import crosswalk.diagram.parsers.TabbedDataFieldLabelExpressionLabelParser;
import crosswalk.diagram.parsers.TrimWhitespaceLabelExpressionLabelParser;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;

/**
 * @generated
 */
public class CrosswalkParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser dictionaryName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getDictionaryName_5025Parser() {
		if (dictionaryName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getDictionary_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getDictionary_Name() };
			NativeParser parser = new NativeParser(features, editableFeatures);
			dictionaryName_5025Parser = parser;
		}
		return dictionaryName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser dictionaryDescription_5026Parser;

	/**
	 * @generated
	 */
	private IParser getDictionaryDescription_5026Parser() {
		if (dictionaryDescription_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getDictionary_Description() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getDictionary_Description() };
			NativeParser parser = new NativeParser(features, editableFeatures);
			dictionaryDescription_5026Parser = parser;
		}
		return dictionaryDescription_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser formTitle_5023Parser;

	/**
	 * @generated
	 */
	private IParser getFormTitle_5023Parser() {
		if (formTitle_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getForm_Title() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getForm_Title() };
			NativeParser parser = new NativeParser(features, editableFeatures);
			formTitle_5023Parser = parser;
		}
		return formTitle_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser formDescription_5024Parser;

	/**
	 * @generated
	 */
	private IParser getFormDescription_5024Parser() {
		if (formDescription_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getForm_Description() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getForm_Description() };
			NativeParser parser = new NativeParser(features, editableFeatures);
			formDescription_5024Parser = parser;
		}
		return formDescription_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser getDelimitedFileLabel_5003Parser() {
		return new DelimitedFileLabelExpressionLabelParser();
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
			EAttribute[] features = new EAttribute[] {
					CrosswalkPackage.eINSTANCE.getDataField_Label(),
					CrosswalkPackage.eINSTANCE
							.getTabbedDataField_ColumnNumber() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getDataField_Label() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
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
	private OriginalNameRecordMatcherLabelExpressionLabelParser originalNameRecordMatcherLabel_5004Parser;

	/**
	 * @generated
	 */
	private IParser getOriginalNameRecordMatcherLabel_5004Parser() {
		if (originalNameRecordMatcherLabel_5004Parser == null) {
			originalNameRecordMatcherLabel_5004Parser = new OriginalNameRecordMatcherLabelExpressionLabelParser();
		}
		return originalNameRecordMatcherLabel_5004Parser;
	}

	/**
	 * @generated
	 */
	private DateRecognizerLabelExpressionLabelParser dateRecognizerLabel_5005Parser;

	/**
	 * @generated
	 */
	private IParser getDateRecognizerLabel_5005Parser() {
		if (dateRecognizerLabel_5005Parser == null) {
			dateRecognizerLabel_5005Parser = new DateRecognizerLabelExpressionLabelParser();
		}
		return dateRecognizerLabel_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser textValue_5006Parser;

	/**
	 * @generated
	 */
	private IParser getTextValue_5006Parser() {
		if (textValue_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getText_Value() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getText_Value() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			textValue_5006Parser = parser;
		}
		return textValue_5006Parser;
	}

	/**
	 * @generated
	 */
	private TrimWhitespaceLabelExpressionLabelParser trimWhitespaceLabel_5007Parser;

	/**
	 * @generated
	 */
	private IParser getTrimWhitespaceLabel_5007Parser() {
		if (trimWhitespaceLabel_5007Parser == null) {
			trimWhitespaceLabel_5007Parser = new TrimWhitespaceLabelExpressionLabelParser();
		}
		return trimWhitespaceLabel_5007Parser;
	}

	/**
	 * @generated
	 */
	private MappedElementLabelExpressionLabelParser mappedElementLabel_5010Parser;

	/**
	 * @generated
	 */
	private IParser getMappedElementLabel_5010Parser() {
		if (mappedElementLabel_5010Parser == null) {
			mappedElementLabel_5010Parser = new MappedElementLabelExpressionLabelParser();
		}
		return mappedElementLabel_5010Parser;
	}

	/**
	 * @generated
	 */
	private MappedElementLabelExpressionLabelParser mappedElementLabel_5009Parser;

	/**
	 * @generated
	 */
	private IParser getMappedElementLabel_5009Parser() {
		if (mappedElementLabel_5009Parser == null) {
			mappedElementLabel_5009Parser = new MappedElementLabelExpressionLabelParser();
		}
		return mappedElementLabel_5009Parser;
	}

	/**
	 * @generated
	 */
	private MappedAttributeLabelExpressionLabelParser mappedAttributeLabel_5008Parser;

	/**
	 * @generated
	 */
	private IParser getMappedAttributeLabel_5008Parser() {
		if (mappedAttributeLabel_5008Parser == null) {
			mappedAttributeLabel_5008Parser = new MappedAttributeLabelExpressionLabelParser();
		}
		return mappedAttributeLabel_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser metadataBlockName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getMetadataBlockName_5019Parser() {
		if (metadataBlockName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getMetadataBlock_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getMetadataBlock_Name() };
			NativeParser parser = new NativeParser(features, editableFeatures);
			metadataBlockName_5019Parser = parser;
		}
		return metadataBlockName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser textInputFieldLabel_5029Parser;

	/**
	 * @generated
	 */
	private IParser getTextInputFieldLabel_5029Parser() {
		if (textInputFieldLabel_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getInputField_Label() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getInputField_Label() };
			NativeParser parser = new NativeParser(features, editableFeatures);
			textInputFieldLabel_5029Parser = parser;
		}
		return textInputFieldLabel_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser metadataBlockName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getMetadataBlockName_5018Parser() {
		if (metadataBlockName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getMetadataBlock_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getMetadataBlock_Name() };
			NativeParser parser = new NativeParser(features, editableFeatures);
			metadataBlockName_5018Parser = parser;
		}
		return metadataBlockName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser metadataBlockName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getMetadataBlockName_5020Parser() {
		if (metadataBlockName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getMetadataBlock_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getMetadataBlock_Name() };
			NativeParser parser = new NativeParser(features, editableFeatures);
			metadataBlockName_5020Parser = parser;
		}
		return metadataBlockName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser paragraphHeading_5021Parser;

	/**
	 * @generated
	 */
	private IParser getParagraphHeading_5021Parser() {
		if (paragraphHeading_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getParagraph_Heading() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getParagraph_Heading() };
			NativeParser parser = new NativeParser(features, editableFeatures);
			paragraphHeading_5021Parser = parser;
		}
		return paragraphHeading_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser paragraphText_5022Parser;

	/**
	 * @generated
	 */
	private IParser getParagraphText_5022Parser() {
		if (paragraphText_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getParagraph_Text() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getParagraph_Text() };
			NativeParser parser = new NativeParser(features, editableFeatures);
			paragraphText_5022Parser = parser;
		}
		return paragraphText_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser fileBlockName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getFileBlockName_5031Parser() {
		if (fileBlockName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getFileBlock_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getFileBlock_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			fileBlockName_5031Parser = parser;
		}
		return fileBlockName_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser fileBlockDescription_5032Parser;

	/**
	 * @generated
	 */
	private IParser getFileBlockDescription_5032Parser() {
		if (fileBlockDescription_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getFileBlock_Description() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getFileBlock_Description() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			fileBlockDescription_5032Parser = parser;
		}
		return fileBlockDescription_5032Parser;
	}

	/**
	 * @generated
	 */
	private CurrentDateLabelExpressionLabelParser currentDateLabel_5027Parser;

	/**
	 * @generated
	 */
	private IParser getCurrentDateLabel_5027Parser() {
		if (currentDateLabel_5027Parser == null) {
			currentDateLabel_5027Parser = new CurrentDateLabelExpressionLabelParser();
		}
		return currentDateLabel_5027Parser;
	}

	/**
	 * @generated
	 */
	private CurrentUsernameLabelExpressionLabelParser currentUsernameLabel_5028Parser;

	/**
	 * @generated
	 */
	private IParser getCurrentUsernameLabel_5028Parser() {
		if (currentUsernameLabel_5028Parser == null) {
			currentUsernameLabel_5028Parser = new CurrentUsernameLabelExpressionLabelParser();
		}
		return currentUsernameLabel_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser dateInputFieldLabel_5030Parser;

	/**
	 * @generated
	 */
	private IParser getDateInputFieldLabel_5030Parser() {
		if (dateInputFieldLabel_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getInputField_Label() };
			EAttribute[] editableFeatures = new EAttribute[] { CrosswalkPackage.eINSTANCE
					.getInputField_Label() };
			MessageFormatMessageFormatParser parser = new MessageFormatMessageFormatParser(
					features, editableFeatures);
			parser.setViewPattern("{0} (Date)"); //$NON-NLS-1$
			parser.setEditorPattern("{0} (Date)"); //$NON-NLS-1$
			dateInputFieldLabel_5030Parser = parser;
		}
		return dateInputFieldLabel_5030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case DictionaryNameEditPart.VISUAL_ID:
			return getDictionaryName_5025Parser();
		case DictionaryDescriptionEditPart.VISUAL_ID:
			return getDictionaryDescription_5026Parser();
		case FormTitleEditPart.VISUAL_ID:
			return getFormTitle_5023Parser();
		case FormDescriptionEditPart.VISUAL_ID:
			return getFormDescription_5024Parser();
		case DelimitedFileSourceFileEditPart.VISUAL_ID:
			return getDelimitedFileLabel_5003Parser();
		case WrappingLabelEditPart.VISUAL_ID:
			return getTabbedDataFieldLabel_5001Parser();
		case TabbedDataFieldLabelColumnNumberEditPart.VISUAL_ID:
			return getTabbedDataFieldLabelColumnNumber_5002Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getOriginalNameRecordMatcherLabel_5004Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getDateRecognizerLabel_5005Parser();
		case TextValueEditPart.VISUAL_ID:
			return getTextValue_5006Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getTrimWhitespaceLabel_5007Parser();
		case WrappingLabel5EditPart.VISUAL_ID:
			return getMappedElementLabel_5010Parser();
		case WrappingLabel6EditPart.VISUAL_ID:
			return getMappedElementLabel_5009Parser();
		case WrappingLabel7EditPart.VISUAL_ID:
			return getMappedAttributeLabel_5008Parser();
		case MetadataBlockName2EditPart.VISUAL_ID:
			return getMetadataBlockName_5019Parser();
		case TextInputFieldLabelEditPart.VISUAL_ID:
			return getTextInputFieldLabel_5029Parser();
		case WrappingLabel8EditPart.VISUAL_ID:
			return getCurrentDateLabel_5027Parser();
		case WrappingLabel9EditPart.VISUAL_ID:
			return getCurrentUsernameLabel_5028Parser();
		case DateInputFieldLabelEditPart.VISUAL_ID:
			return getDateInputFieldLabel_5030Parser();
		case MetadataBlockNameEditPart.VISUAL_ID:
			return getMetadataBlockName_5018Parser();
		case MetadataBlockName3EditPart.VISUAL_ID:
			return getMetadataBlockName_5020Parser();
		case ParagraphHeadingEditPart.VISUAL_ID:
			return getParagraphHeading_5021Parser();
		case ParagraphTextEditPart.VISUAL_ID:
			return getParagraphText_5022Parser();
		case FileBlockNameEditPart.VISUAL_ID:
			return getFileBlockName_5031Parser();
		case FileBlockDescriptionEditPart.VISUAL_ID:
			return getFileBlockDescription_5032Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
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
