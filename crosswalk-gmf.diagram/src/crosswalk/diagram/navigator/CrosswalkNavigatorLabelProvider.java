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

import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.DateInputInputEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileSourceFileEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeNameEditPart;
import crosswalk.diagram.edit.parts.MappedElement2EditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.StringInput13EditPart;
import crosswalk.diagram.edit.parts.StringInput2EditPart;
import crosswalk.diagram.edit.parts.StringInput9EditPart;
import crosswalk.diagram.edit.parts.StringInputEditPart;
import crosswalk.diagram.edit.parts.StringInputInputEditPart;
import crosswalk.diagram.edit.parts.StringInputName13EditPart;
import crosswalk.diagram.edit.parts.StringInputName2EditPart;
import crosswalk.diagram.edit.parts.StringInputName9EditPart;
import crosswalk.diagram.edit.parts.StringInputNameEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TextValueEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.edit.parts.WrappingLabel12EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel13EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel14EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel15EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel16EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel9EditPart;
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
	case MappedAttributeEditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MappedAttribute", CrosswalkElementTypes.MappedAttribute_3016); //$NON-NLS-1$
	case TrimWhitespaceEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?TrimWhitespace", CrosswalkElementTypes.TrimWhitespace_2015); //$NON-NLS-1$
	case TabbedDataFieldEditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?TabbedDataField", CrosswalkElementTypes.TabbedDataField_3001); //$NON-NLS-1$
	case StringInputEditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3002); //$NON-NLS-1$
	case DelimitedFileEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?DelimitedFile", CrosswalkElementTypes.DelimitedFile_2001); //$NON-NLS-1$
	case StringInputInputEditPart.VISUAL_ID:
	    return getImage("Navigator?Link?http://lib.unc.edu/schemas/crosswalk?StringInput?Input", CrosswalkElementTypes.StringInputInput_4001); //$NON-NLS-1$
	case MappedElement2EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?MappedElement", CrosswalkElementTypes.MappedElement_3015); //$NON-NLS-1$
	case OriginalNameRecordMatcherEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?OriginalNameRecordMatcher", CrosswalkElementTypes.OriginalNameRecordMatcher_2010); //$NON-NLS-1$
	case StringInput2EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3003); //$NON-NLS-1$
	case MappedElementEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?MappedElement", CrosswalkElementTypes.MappedElement_2016); //$NON-NLS-1$
	case DateInputInputEditPart.VISUAL_ID:
	    return getImage("Navigator?Link?http://lib.unc.edu/schemas/crosswalk?DateInput?Input", CrosswalkElementTypes.DateInputInput_4002); //$NON-NLS-1$
	case TextEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?Text", CrosswalkElementTypes.Text_2014); //$NON-NLS-1$
	case CrossWalkEditPart.VISUAL_ID:
	    return getImage("Navigator?Diagram?http://lib.unc.edu/schemas/crosswalk?CrossWalk", CrosswalkElementTypes.CrossWalk_1000); //$NON-NLS-1$
	case StringInput13EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3017); //$NON-NLS-1$
	case StringInput9EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3010); //$NON-NLS-1$
	case DateRecognizerEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?DateRecognizer", CrosswalkElementTypes.DateRecognizer_2013); //$NON-NLS-1$
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
	case MappedAttributeEditPart.VISUAL_ID:
	    return getMappedAttribute_3016Text(view);
	case TrimWhitespaceEditPart.VISUAL_ID:
	    return getTrimWhitespace_2015Text(view);
	case TabbedDataFieldEditPart.VISUAL_ID:
	    return getTabbedDataField_3001Text(view);
	case StringInputEditPart.VISUAL_ID:
	    return getStringInput_3002Text(view);
	case DelimitedFileEditPart.VISUAL_ID:
	    return getDelimitedFile_2001Text(view);
	case StringInputInputEditPart.VISUAL_ID:
	    return getStringInputInput_4001Text(view);
	case MappedElement2EditPart.VISUAL_ID:
	    return getMappedElement_3015Text(view);
	case OriginalNameRecordMatcherEditPart.VISUAL_ID:
	    return getOriginalNameRecordMatcher_2010Text(view);
	case StringInput2EditPart.VISUAL_ID:
	    return getStringInput_3003Text(view);
	case MappedElementEditPart.VISUAL_ID:
	    return getMappedElement_2016Text(view);
	case DateInputInputEditPart.VISUAL_ID:
	    return getDateInputInput_4002Text(view);
	case TextEditPart.VISUAL_ID:
	    return getText_2014Text(view);
	case CrossWalkEditPart.VISUAL_ID:
	    return getCrossWalk_1000Text(view);
	case StringInput13EditPart.VISUAL_ID:
	    return getStringInput_3017Text(view);
	case StringInput9EditPart.VISUAL_ID:
	    return getStringInput_3010Text(view);
	case DateRecognizerEditPart.VISUAL_ID:
	    return getDateRecognizer_2013Text(view);
	}
	return getUnknownElementText(view);
    }

    /**
     * @generated
     */
    private String getStringInput_3017Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3017,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputName13EditPart.VISUAL_ID));
	if (parser != null) {
	    return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
			    ParserOptions.NONE.intValue());
	} else {
	    CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
	    return ""; //$NON-NLS-1$
	}
    }

    /**
     * @generated
     */
    private String getStringInput_3010Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3010,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputName9EditPart.VISUAL_ID));
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
    private String getDateRecognizer_2013Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.DateRecognizer_2013,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel12EditPart.VISUAL_ID));
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
    private String getMappedAttribute_3016Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.MappedAttribute_3016,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(MappedAttributeNameEditPart.VISUAL_ID));
	if (parser != null) {
	    return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
			    ParserOptions.NONE.intValue());
	} else {
	    CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5032); //$NON-NLS-1$
	    return ""; //$NON-NLS-1$
	}
    }

    /**
     * @generated
     */
    private String getTabbedDataField_3001Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.TabbedDataField_3001,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel15EditPart.VISUAL_ID));
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
    private String getCrossWalk_1000Text(View view) {
	return ""; //$NON-NLS-1$
    }

    /**
     * @generated
     */
    private String getMappedElement_2016Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.MappedElement_2016,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel14EditPart.VISUAL_ID));
	if (parser != null) {
	    return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
			    ParserOptions.NONE.intValue());
	} else {
	    CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5034); //$NON-NLS-1$
	    return ""; //$NON-NLS-1$
	}
    }

    /**
     * @generated
     */
    private String getTrimWhitespace_2015Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.TrimWhitespace_2015,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel13EditPart.VISUAL_ID));
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
    private String getStringInput_3003Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3003,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputName2EditPart.VISUAL_ID));
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
    private String getDateInputInput_4002Text(View view) {
	return ""; //$NON-NLS-1$
    }

    /**
     * @generated
     */
    private String getStringInputInput_4001Text(View view) {
	return ""; //$NON-NLS-1$
    }

    /**
     * @generated
     */
    private String getStringInput_3002Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3002,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputNameEditPart.VISUAL_ID));
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
    private String getMappedElement_3015Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.MappedElement_3015,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel16EditPart.VISUAL_ID));
	if (parser != null) {
	    return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
			    ParserOptions.NONE.intValue());
	} else {
	    CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
	    return ""; //$NON-NLS-1$
	}
    }

    /**
     * @generated
     */
    private String getOriginalNameRecordMatcher_2010Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.OriginalNameRecordMatcher_2010,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel9EditPart.VISUAL_ID));
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
    private String getDelimitedFile_2001Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.DelimitedFile_2001,
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
    private String getText_2014Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.Text_2014,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(TextValueEditPart.VISUAL_ID));
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
	return CrossWalkEditPart.MODEL_ID.equals(CrosswalkVisualIDRegistry.getModelID(view));
    }

}
