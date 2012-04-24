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

import crosswalk.Dictionary;
import crosswalk.InputField;
import crosswalk.MetadataBlock;
import crosswalk.diagram.edit.parts.CrossWalk2EditPart;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.DateRecognizer2EditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileSourceFileEditPart;
import crosswalk.diagram.edit.parts.DictionaryEditPart;
import crosswalk.diagram.edit.parts.EditingContainerEditPart;
import crosswalk.diagram.edit.parts.InputFieldEditPart;
import crosswalk.diagram.edit.parts.InputFieldLabelEditPart;
import crosswalk.diagram.edit.parts.InputOutputEditPart;
import crosswalk.diagram.edit.parts.MappedAttribute2EditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeNameEditPart;
import crosswalk.diagram.edit.parts.MappedElement2EditPart;
import crosswalk.diagram.edit.parts.MappedElement3EditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.MetadataBlock2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockName2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockNameEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcher2EditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.Text2EditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TextValue2EditPart;
import crosswalk.diagram.edit.parts.TextValueEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespace2EditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.edit.parts.WrappingLabel10EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel11EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel12EditPart;
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
			case MetadataBlockEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MetadataBlock", CrosswalkElementTypes.MetadataBlock_3010); //$NON-NLS-1$
			case MappedAttribute2EditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MappedAttribute", CrosswalkElementTypes.MappedAttribute_3016); //$NON-NLS-1$
			case MappedElementEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MappedElement", CrosswalkElementTypes.MappedElement_3007); //$NON-NLS-1$
			case TabbedDataFieldEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?TabbedDataField", CrosswalkElementTypes.TabbedDataField_3002); //$NON-NLS-1$
			case EditingContainerEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Diagram?http://lib.unc.edu/schemas/crosswalk?EditingContainer", CrosswalkElementTypes.EditingContainer_1000); //$NON-NLS-1$
			case MappedAttributeEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MappedAttribute", CrosswalkElementTypes.MappedAttribute_3009); //$NON-NLS-1$
			case TextEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?Text", CrosswalkElementTypes.Text_3005); //$NON-NLS-1$
			case InputOutputEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Link?http://lib.unc.edu/schemas/crosswalk?Input?Output", CrosswalkElementTypes.InputOutput_4001); //$NON-NLS-1$
			case DateRecognizer2EditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?DateRecognizer", CrosswalkElementTypes.DateRecognizer_3012); //$NON-NLS-1$
			case TrimWhitespaceEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?TrimWhitespace", CrosswalkElementTypes.TrimWhitespace_3006); //$NON-NLS-1$
			case MappedElement2EditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MappedElement", CrosswalkElementTypes.MappedElement_3008); //$NON-NLS-1$
			case Text2EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?Text", CrosswalkElementTypes.Text_3013); //$NON-NLS-1$
			case DelimitedFileEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?DelimitedFile", CrosswalkElementTypes.DelimitedFile_3001); //$NON-NLS-1$
			case DictionaryEditPart.VISUAL_ID:
				return getImage(
						"Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?Dictionary", CrosswalkElementTypes.Dictionary_2002); //$NON-NLS-1$
			case TrimWhitespace2EditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?TrimWhitespace", CrosswalkElementTypes.TrimWhitespace_3014); //$NON-NLS-1$
			case DateRecognizerEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?DateRecognizer", CrosswalkElementTypes.DateRecognizer_3004); //$NON-NLS-1$
			case MappedElement3EditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MappedElement", CrosswalkElementTypes.MappedElement_3015); //$NON-NLS-1$
			case InputFieldEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?InputField", CrosswalkElementTypes.InputField_3017); //$NON-NLS-1$
			case OriginalNameRecordMatcher2EditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?OriginalNameRecordMatcher", CrosswalkElementTypes.OriginalNameRecordMatcher_3011); //$NON-NLS-1$
			case OriginalNameRecordMatcherEditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?OriginalNameRecordMatcher", CrosswalkElementTypes.OriginalNameRecordMatcher_3003); //$NON-NLS-1$
			case MetadataBlock2EditPart.VISUAL_ID:
				return getImage(
						"Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MetadataBlock", CrosswalkElementTypes.MetadataBlock_3018); //$NON-NLS-1$
			case CrossWalkEditPart.VISUAL_ID:
				return getImage(
						"Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?CrossWalk", CrosswalkElementTypes.CrossWalk_2001); //$NON-NLS-1$
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
			case MetadataBlockEditPart.VISUAL_ID:
				return getMetadataBlock_3010Text(view);
			case MappedAttribute2EditPart.VISUAL_ID:
				return getMappedAttribute_3016Text(view);
			case MappedElementEditPart.VISUAL_ID:
				return getMappedElement_3007Text(view);
			case TabbedDataFieldEditPart.VISUAL_ID:
				return getTabbedDataField_3002Text(view);
			case EditingContainerEditPart.VISUAL_ID:
				return getEditingContainer_1000Text(view);
			case MappedAttributeEditPart.VISUAL_ID:
				return getMappedAttribute_3009Text(view);
			case TextEditPart.VISUAL_ID:
				return getText_3005Text(view);
			case InputOutputEditPart.VISUAL_ID:
				return getInputOutput_4001Text(view);
			case DateRecognizer2EditPart.VISUAL_ID:
				return getDateRecognizer_3012Text(view);
			case TrimWhitespaceEditPart.VISUAL_ID:
				return getTrimWhitespace_3006Text(view);
			case MappedElement2EditPart.VISUAL_ID:
				return getMappedElement_3008Text(view);
			case Text2EditPart.VISUAL_ID:
				return getText_3013Text(view);
			case DelimitedFileEditPart.VISUAL_ID:
				return getDelimitedFile_3001Text(view);
			case DictionaryEditPart.VISUAL_ID:
				return getDictionary_2002Text(view);
			case TrimWhitespace2EditPart.VISUAL_ID:
				return getTrimWhitespace_3014Text(view);
			case DateRecognizerEditPart.VISUAL_ID:
				return getDateRecognizer_3004Text(view);
			case MappedElement3EditPart.VISUAL_ID:
				return getMappedElement_3015Text(view);
			case InputFieldEditPart.VISUAL_ID:
				return getInputField_3017Text(view);
			case OriginalNameRecordMatcher2EditPart.VISUAL_ID:
				return getOriginalNameRecordMatcher_3011Text(view);
			case OriginalNameRecordMatcherEditPart.VISUAL_ID:
				return getOriginalNameRecordMatcher_3003Text(view);
			case MetadataBlock2EditPart.VISUAL_ID:
				return getMetadataBlock_3018Text(view);
			case CrossWalkEditPart.VISUAL_ID:
				return getCrossWalk_2001Text(view);
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
	private String getMappedAttribute_3016Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.MappedAttribute_3016,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(WrappingLabel12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOriginalNameRecordMatcher_3011Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.OriginalNameRecordMatcher_3011,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(WrappingLabel8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTrimWhitespace_3014Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.TrimWhitespace_3014,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(WrappingLabel10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMappedElement_3015Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.MappedElement_3015,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(WrappingLabel11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
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
		Dictionary domainModelElement = (Dictionary) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2002); //$NON-NLS-1$
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
	private String getDateRecognizer_3012Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.DateRecognizer_3012,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(WrappingLabel9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getText_3013Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.Text_3013,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(TextValue2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
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
	private String getInputField_3017Text(View view) {
		IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.InputField_3017,
				view.getElement() != null ? view.getElement() : view,
				CrosswalkVisualIDRegistry.getType(InputFieldLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCrossWalk_2001Text(View view) {
		return ""; //$NON-NLS-1$
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
