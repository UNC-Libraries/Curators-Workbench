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
package crosswalk.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import crosswalk.CrossWalk;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.CurrentDateEditPart;
import crosswalk.diagram.edit.parts.CurrentUsernameEditPart;
import crosswalk.diagram.edit.parts.DateInputFieldEditPart;
import crosswalk.diagram.edit.parts.DateInputFieldLabelEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileSourceFileEditPart;
import crosswalk.diagram.edit.parts.DictionaryEditPart;
import crosswalk.diagram.edit.parts.DictionaryNameEditPart;
import crosswalk.diagram.edit.parts.EditingContainerEditPart;
import crosswalk.diagram.edit.parts.FormEditPart;
import crosswalk.diagram.edit.parts.FormTitleEditPart;
import crosswalk.diagram.edit.parts.InputOutputEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedElement2EditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.MetadataBlock2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlock3EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockName2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockName3EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockNameEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.ParagraphEditPart;
import crosswalk.diagram.edit.parts.ParagraphHeadingEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TextInputFieldEditPart;
import crosswalk.diagram.edit.parts.TextInputFieldLabelEditPart;
import crosswalk.diagram.edit.parts.TextValueEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.edit.parts.WrappingLabel2EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel3EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel4EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel5EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel6EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel7EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel8EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel9EditPart;
import crosswalk.diagram.edit.parts.WrappingLabelEditPart;
import crosswalk.diagram.part.CrosswalkDiagramEditorPlugin;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;
import crosswalk.diagram.providers.CrosswalkParserProvider;

/**
 * @generated
 */
public class CrosswalkNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider,
		ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		CrosswalkDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		CrosswalkDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CrosswalkNavigatorItem && !isOwnView(((CrosswalkNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	@Override
	public Image getImage(Object element) {
		if (element instanceof CrosswalkNavigatorGroup) {
			CrosswalkNavigatorGroup group = (CrosswalkNavigatorGroup) element;
			return CrosswalkDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof CrosswalkNavigatorItem) {
			CrosswalkNavigatorItem navigatorItem = (CrosswalkNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (CrosswalkVisualIDRegistry.getVisualID(view)) {
			case TextEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?Text", CrosswalkElementTypes.Text_3005); //$NON-NLS-1$
			case MappedElement2EditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MappedElement", CrosswalkElementTypes.MappedElement_3008); //$NON-NLS-1$
			case InputOutputEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Link?http://lib.unc.edu/schemas/crosswalk?Input?Output", CrosswalkElementTypes.InputOutput_4001); //$NON-NLS-1$
			case TrimWhitespaceEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?TrimWhitespace", CrosswalkElementTypes.TrimWhitespace_3006); //$NON-NLS-1$
			case TextInputFieldEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?TextInputField", CrosswalkElementTypes.TextInputField_3023); //$NON-NLS-1$
			case TabbedDataFieldEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?TabbedDataField", CrosswalkElementTypes.TabbedDataField_3002); //$NON-NLS-1$
			case DelimitedFileEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?DelimitedFile", CrosswalkElementTypes.DelimitedFile_3001); //$NON-NLS-1$
			case MetadataBlockEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MetadataBlock", CrosswalkElementTypes.MetadataBlock_3010); //$NON-NLS-1$
			case CrossWalkEditPart.VISUAL_ID:
				return getImage(
						"Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?CrossWalk", CrosswalkElementTypes.CrossWalk_2001); //$NON-NLS-1$
			case DictionaryEditPart.VISUAL_ID:
				return getImage(
						"Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?Dictionary", CrosswalkElementTypes.Dictionary_2002); //$NON-NLS-1$
			case OriginalNameRecordMatcherEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?OriginalNameRecordMatcher", CrosswalkElementTypes.OriginalNameRecordMatcher_3003); //$NON-NLS-1$
			case EditingContainerEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Diagram?http://lib.unc.edu/schemas/crosswalk?EditingContainer", CrosswalkElementTypes.EditingContainer_1000); //$NON-NLS-1$
			case MappedAttributeEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MappedAttribute", CrosswalkElementTypes.MappedAttribute_3009); //$NON-NLS-1$
			case DateRecognizerEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?DateRecognizer", CrosswalkElementTypes.DateRecognizer_3004); //$NON-NLS-1$
			case MetadataBlock3EditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MetadataBlock", CrosswalkElementTypes.MetadataBlock_3019); //$NON-NLS-1$
			case CurrentUsernameEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?CurrentUsername", CrosswalkElementTypes.CurrentUsername_3022); //$NON-NLS-1$
			case FormEditPart.VISUAL_ID:
				return getImage(
						"Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?Form", CrosswalkElementTypes.Form_2003); //$NON-NLS-1$
			case ParagraphEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?Paragraph", CrosswalkElementTypes.Paragraph_3020); //$NON-NLS-1$
			case MappedElementEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MappedElement", CrosswalkElementTypes.MappedElement_3007); //$NON-NLS-1$
			case DateInputFieldEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?DateInputField", CrosswalkElementTypes.DateInputField_3024); //$NON-NLS-1$
			case MetadataBlock2EditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MetadataBlock", CrosswalkElementTypes.MetadataBlock_3018); //$NON-NLS-1$
			case CurrentDateEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?CurrentDate", CrosswalkElementTypes.CurrentDate_3021); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CrosswalkDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && CrosswalkElementTypes.isKnownElementType(elementType)) {
			image = CrosswalkElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	@Override
	public String getText(Object element) {
		if (element instanceof CrosswalkNavigatorGroup) {
			CrosswalkNavigatorGroup group = (CrosswalkNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CrosswalkNavigatorItem) {
			CrosswalkNavigatorItem navigatorItem = (CrosswalkNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (CrosswalkVisualIDRegistry.getVisualID(view)) {
			case TextEditPart.VISUAL_ID:
				return getText_3005Text(view);
			case MappedElement2EditPart.VISUAL_ID:
				return getMappedElement_3008Text(view);
			case InputOutputEditPart.VISUAL_ID:
				return getInputOutput_4001Text(view);
			case TrimWhitespaceEditPart.VISUAL_ID:
				return getTrimWhitespace_3006Text(view);
			case TextInputFieldEditPart.VISUAL_ID:
				return getTextInputField_3023Text(view);
			case TabbedDataFieldEditPart.VISUAL_ID:
				return getTabbedDataField_3002Text(view);
			case DelimitedFileEditPart.VISUAL_ID:
				return getDelimitedFile_3001Text(view);
			case MetadataBlockEditPart.VISUAL_ID:
				return getMetadataBlock_3010Text(view);
			case CrossWalkEditPart.VISUAL_ID:
				return getCrossWalk_2001Text(view);
			case DictionaryEditPart.VISUAL_ID:
				return getDictionary_2002Text(view);
			case OriginalNameRecordMatcherEditPart.VISUAL_ID:
				return getOriginalNameRecordMatcher_3003Text(view);
			case EditingContainerEditPart.VISUAL_ID:
				return getEditingContainer_1000Text(view);
			case MappedAttributeEditPart.VISUAL_ID:
				return getMappedAttribute_3009Text(view);
			case DateRecognizerEditPart.VISUAL_ID:
				return getDateRecognizer_3004Text(view);
			case MetadataBlock3EditPart.VISUAL_ID:
				return getMetadataBlock_3019Text(view);
			case CurrentUsernameEditPart.VISUAL_ID:
				return getCurrentUsername_3022Text(view);
			case FormEditPart.VISUAL_ID:
				return getForm_2003Text(view);
			case ParagraphEditPart.VISUAL_ID:
				return getParagraph_3020Text(view);
			case MappedElementEditPart.VISUAL_ID:
				return getMappedElement_3007Text(view);
			case DateInputFieldEditPart.VISUAL_ID:
				return getDateInputField_3024Text(view);
			case MetadataBlock2EditPart.VISUAL_ID:
				return getMetadataBlock_3018Text(view);
			case CurrentDateEditPart.VISUAL_ID:
				return getCurrentDate_3021Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getMappedAttribute_3009Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.MappedAttribute_3009,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(WrappingLabel7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMappedElement_3008Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.MappedElement_3008,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(WrappingLabel6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDateInputField_3024Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.DateInputField_3024,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(DateInputFieldLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCurrentUsername_3022Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.CurrentUsername_3022,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(WrappingLabel9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTrimWhitespace_3006Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.TrimWhitespace_3006,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMappedElement_3007Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.MappedElement_3007,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEditingContainer_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCurrentDate_3021Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.CurrentDate_3021,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(WrappingLabel8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParagraph_3020Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.Paragraph_3020,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(ParagraphHeadingEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTabbedDataField_3002Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.TabbedDataField_3002,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDictionary_2002Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.Dictionary_2002,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(DictionaryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOriginalNameRecordMatcher_3003Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.OriginalNameRecordMatcher_3003,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMetadataBlock_3018Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.MetadataBlock_3018,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(MetadataBlockName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMetadataBlock_3019Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.MetadataBlock_3019,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(MetadataBlockName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDelimitedFile_3001Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.DelimitedFile_3001,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(DelimitedFileSourceFileEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputOutput_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTextInputField_3023Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.TextInputField_3023,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(TextInputFieldLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMetadataBlock_3010Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.MetadataBlock_3010,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(MetadataBlockNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCrossWalk_2001Text(View view) {
		CrossWalk domainModelElement = (CrossWalk) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getCurrentUser();
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDateRecognizer_3004Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.DateRecognizer_3004,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForm_2003Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.Form_2003,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(FormTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getText_3005Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.Text_3005,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(TextValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return EditingContainerEditPart.MODEL_ID.equals(CrosswalkVisualIDRegistry.getModelID(view));
	}

}
