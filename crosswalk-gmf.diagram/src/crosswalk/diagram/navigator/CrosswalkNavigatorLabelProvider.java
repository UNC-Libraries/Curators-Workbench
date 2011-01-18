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

import crosswalk.diagram.edit.parts.AbstractEditPart;
import crosswalk.diagram.edit.parts.AccessConditionEditPart;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.DateCreatedEditPart;
import crosswalk.diagram.edit.parts.DateInputEditPart;
import crosswalk.diagram.edit.parts.DateInputInputEditPart;
import crosswalk.diagram.edit.parts.DateInputNameEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.GenreEditPart;
import crosswalk.diagram.edit.parts.IdentifierEditPart;
import crosswalk.diagram.edit.parts.LanguageEditPart;
import crosswalk.diagram.edit.parts.NameEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.StringInput10EditPart;
import crosswalk.diagram.edit.parts.StringInput11EditPart;
import crosswalk.diagram.edit.parts.StringInput12EditPart;
import crosswalk.diagram.edit.parts.StringInput2EditPart;
import crosswalk.diagram.edit.parts.StringInput3EditPart;
import crosswalk.diagram.edit.parts.StringInput4EditPart;
import crosswalk.diagram.edit.parts.StringInput5EditPart;
import crosswalk.diagram.edit.parts.StringInput6EditPart;
import crosswalk.diagram.edit.parts.StringInput7EditPart;
import crosswalk.diagram.edit.parts.StringInput8EditPart;
import crosswalk.diagram.edit.parts.StringInput9EditPart;
import crosswalk.diagram.edit.parts.StringInputEditPart;
import crosswalk.diagram.edit.parts.StringInputInputEditPart;
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
import crosswalk.diagram.edit.parts.SubjectEditPart;
import crosswalk.diagram.edit.parts.TabSeparatedFileEditPart;
import crosswalk.diagram.edit.parts.TabSeparatedFileSourceFileEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldColumnNumberEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TextValueEditPart;
import crosswalk.diagram.edit.parts.TitleInfoEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.edit.parts.TypeOfResourceEditPart;
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
	case StringInputInputEditPart.VISUAL_ID:
	    return getImage("Navigator?Link?http://lib.unc.edu/schemas/crosswalk?StringInput?Input", CrosswalkElementTypes.StringInputInput_4009); //$NON-NLS-1$
	case NameEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?Name", CrosswalkElementTypes.Name_2011); //$NON-NLS-1$
	case TitleInfoEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?TitleInfo", CrosswalkElementTypes.TitleInfo_2005); //$NON-NLS-1$
	case TextEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?Text", CrosswalkElementTypes.Text_2018); //$NON-NLS-1$
	case StringInput2EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3010); //$NON-NLS-1$
	case StringInput12EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3022); //$NON-NLS-1$
	case DateCreatedEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?DateCreated", CrosswalkElementTypes.DateCreated_2015); //$NON-NLS-1$
	case OriginalNameRecordMatcherEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?OriginalNameRecordMatcher", CrosswalkElementTypes.OriginalNameRecordMatcher_2014); //$NON-NLS-1$
	case GenreEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?Genre", CrosswalkElementTypes.Genre_2008); //$NON-NLS-1$
	case DateInputInputEditPart.VISUAL_ID:
	    return getImage("Navigator?Link?http://lib.unc.edu/schemas/crosswalk?DateInput?Input", CrosswalkElementTypes.DateInputInput_4010); //$NON-NLS-1$
	case SubjectEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?Subject", CrosswalkElementTypes.Subject_2012); //$NON-NLS-1$
	case StringInput11EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3021); //$NON-NLS-1$
	case TabSeparatedFileEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?TabSeparatedFile", CrosswalkElementTypes.TabSeparatedFile_2001); //$NON-NLS-1$
	case StringInput10EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3020); //$NON-NLS-1$
	case StringInput3EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3011); //$NON-NLS-1$
	case StringInput8EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3016); //$NON-NLS-1$
	case TabbedDataFieldEditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?TabbedDataField", CrosswalkElementTypes.TabbedDataField_3017); //$NON-NLS-1$
	case StringInput7EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3015); //$NON-NLS-1$
	case StringInput6EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3014); //$NON-NLS-1$
	case CrossWalkEditPart.VISUAL_ID:
	    return getImage("Navigator?Diagram?http://lib.unc.edu/schemas/crosswalk?CrossWalk", CrosswalkElementTypes.CrossWalk_1000); //$NON-NLS-1$
	case TypeOfResourceEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?TypeOfResource", CrosswalkElementTypes.TypeOfResource_2013); //$NON-NLS-1$
	case IdentifierEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?Identifier", CrosswalkElementTypes.Identifier_2009); //$NON-NLS-1$
	case DateInputEditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?DateInput", CrosswalkElementTypes.DateInput_3019); //$NON-NLS-1$
	case AccessConditionEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?AccessCondition", CrosswalkElementTypes.AccessCondition_2016); //$NON-NLS-1$
	case DateRecognizerEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?DateRecognizer", CrosswalkElementTypes.DateRecognizer_2017); //$NON-NLS-1$
	case StringInput9EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3018); //$NON-NLS-1$
	case TrimWhitespaceEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?TrimWhitespace", CrosswalkElementTypes.TrimWhitespace_2019); //$NON-NLS-1$
	case StringInputEditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3008); //$NON-NLS-1$
	case LanguageEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?Language", CrosswalkElementTypes.Language_2010); //$NON-NLS-1$
	case StringInput5EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3013); //$NON-NLS-1$
	case StringInput4EditPart.VISUAL_ID:
	    return getImage("Navigator?Node?http://lib.unc.edu/schemas/crosswalk?StringInput", CrosswalkElementTypes.StringInput_3012); //$NON-NLS-1$
	case AbstractEditPart.VISUAL_ID:
	    return getImage("Navigator?TopLevelNode?http://lib.unc.edu/schemas/crosswalk?Abstract", CrosswalkElementTypes.Abstract_2007); //$NON-NLS-1$
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
	case StringInputInputEditPart.VISUAL_ID:
	    return getStringInputInput_4009Text(view);
	case NameEditPart.VISUAL_ID:
	    return getName_2011Text(view);
	case TitleInfoEditPart.VISUAL_ID:
	    return getTitleInfo_2005Text(view);
	case TextEditPart.VISUAL_ID:
	    return getText_2018Text(view);
	case StringInput2EditPart.VISUAL_ID:
	    return getStringInput_3010Text(view);
	case StringInput12EditPart.VISUAL_ID:
	    return getStringInput_3022Text(view);
	case DateCreatedEditPart.VISUAL_ID:
	    return getDateCreated_2015Text(view);
	case OriginalNameRecordMatcherEditPart.VISUAL_ID:
	    return getOriginalNameRecordMatcher_2014Text(view);
	case GenreEditPart.VISUAL_ID:
	    return getGenre_2008Text(view);
	case DateInputInputEditPart.VISUAL_ID:
	    return getDateInputInput_4010Text(view);
	case SubjectEditPart.VISUAL_ID:
	    return getSubject_2012Text(view);
	case StringInput11EditPart.VISUAL_ID:
	    return getStringInput_3021Text(view);
	case TabSeparatedFileEditPart.VISUAL_ID:
	    return getTabSeparatedFile_2001Text(view);
	case StringInput10EditPart.VISUAL_ID:
	    return getStringInput_3020Text(view);
	case StringInput3EditPart.VISUAL_ID:
	    return getStringInput_3011Text(view);
	case StringInput8EditPart.VISUAL_ID:
	    return getStringInput_3016Text(view);
	case TabbedDataFieldEditPart.VISUAL_ID:
	    return getTabbedDataField_3017Text(view);
	case StringInput7EditPart.VISUAL_ID:
	    return getStringInput_3015Text(view);
	case StringInput6EditPart.VISUAL_ID:
	    return getStringInput_3014Text(view);
	case CrossWalkEditPart.VISUAL_ID:
	    return getCrossWalk_1000Text(view);
	case TypeOfResourceEditPart.VISUAL_ID:
	    return getTypeOfResource_2013Text(view);
	case IdentifierEditPart.VISUAL_ID:
	    return getIdentifier_2009Text(view);
	case DateInputEditPart.VISUAL_ID:
	    return getDateInput_3019Text(view);
	case AccessConditionEditPart.VISUAL_ID:
	    return getAccessCondition_2016Text(view);
	case DateRecognizerEditPart.VISUAL_ID:
	    return getDateRecognizer_2017Text(view);
	case StringInput9EditPart.VISUAL_ID:
	    return getStringInput_3018Text(view);
	case TrimWhitespaceEditPart.VISUAL_ID:
	    return getTrimWhitespace_2019Text(view);
	case StringInputEditPart.VISUAL_ID:
	    return getStringInput_3008Text(view);
	case LanguageEditPart.VISUAL_ID:
	    return getLanguage_2010Text(view);
	case StringInput5EditPart.VISUAL_ID:
	    return getStringInput_3013Text(view);
	case StringInput4EditPart.VISUAL_ID:
	    return getStringInput_3012Text(view);
	case AbstractEditPart.VISUAL_ID:
	    return getAbstract_2007Text(view);
	}
	return getUnknownElementText(view);
    }

    /**
     * @generated
     */
    private String getStringInput_3010Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3010,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputNameEditPart.VISUAL_ID));
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
    private String getTrimWhitespace_2019Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.TrimWhitespace_2019,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel14EditPart.VISUAL_ID));
	if (parser != null) {
	    return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
			    ParserOptions.NONE.intValue());
	} else {
	    CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
	    return ""; //$NON-NLS-1$
	}
    }

    /**
     * @generated
     */
    private String getStringInputInput_4009Text(View view) {
	return ""; //$NON-NLS-1$
    }

    /**
     * @generated
     */
    private String getTabSeparatedFile_2001Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.TabSeparatedFile_2001,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(TabSeparatedFileSourceFileEditPart.VISUAL_ID));
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
    private String getStringInput_3022Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3022,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputName11EditPart.VISUAL_ID));
	if (parser != null) {
	    return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
			    ParserOptions.NONE.intValue());
	} else {
	    CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5036); //$NON-NLS-1$
	    return ""; //$NON-NLS-1$
	}
    }

    /**
     * @generated
     */
    private String getStringInput_3015Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3015,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputName6EditPart.VISUAL_ID));
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
    private String getTitleInfo_2005Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.TitleInfo_2005,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel3EditPart.VISUAL_ID));
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
    private String getCrossWalk_1000Text(View view) {
	return ""; //$NON-NLS-1$
    }

    /**
     * @generated
     */
    private String getSubject_2012Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.Subject_2012,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel9EditPart.VISUAL_ID));
	if (parser != null) {
	    return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
			    ParserOptions.NONE.intValue());
	} else {
	    CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
	    return ""; //$NON-NLS-1$
	}
    }

    /**
     * @generated
     */
    private String getStringInput_3008Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3008,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
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
    private String getLanguage_2010Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.Language_2010,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel7EditPart.VISUAL_ID));
	if (parser != null) {
	    return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
			    ParserOptions.NONE.intValue());
	} else {
	    CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
	    return ""; //$NON-NLS-1$
	}
    }

    /**
     * @generated
     */
    private String getDateCreated_2015Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.DateCreated_2015,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel11EditPart.VISUAL_ID));
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
    private String getText_2018Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.Text_2018,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(TextValueEditPart.VISUAL_ID));
	if (parser != null) {
	    return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
			    ParserOptions.NONE.intValue());
	} else {
	    CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5035); //$NON-NLS-1$
	    return ""; //$NON-NLS-1$
	}
    }

    /**
     * @generated
     */
    private String getDateInputInput_4010Text(View view) {
	return ""; //$NON-NLS-1$
    }

    /**
     * @generated
     */
    private String getGenre_2008Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.Genre_2008,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel5EditPart.VISUAL_ID));
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
    private String getDateInput_3019Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.DateInput_3019,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(DateInputNameEditPart.VISUAL_ID));
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
    private String getStringInput_3020Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3020,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputName9EditPart.VISUAL_ID));
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
    private String getStringInput_3021Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3021,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputName10EditPart.VISUAL_ID));
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
    private String getStringInput_3011Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3011,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputName2EditPart.VISUAL_ID));
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
    private String getName_2011Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.Name_2011,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel8EditPart.VISUAL_ID));
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
    private String getAbstract_2007Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.Abstract_2007,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel4EditPart.VISUAL_ID));
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
    private String getStringInput_3014Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3014,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputName5EditPart.VISUAL_ID));
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
    private String getStringInput_3012Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3012,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputName3EditPart.VISUAL_ID));
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
    private String getStringInput_3018Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3018,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputName8EditPart.VISUAL_ID));
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
    private String getAccessCondition_2016Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.AccessCondition_2016,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel12EditPart.VISUAL_ID));
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
    private String getOriginalNameRecordMatcher_2014Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.OriginalNameRecordMatcher_2014,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
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
    private String getDateRecognizer_2017Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.DateRecognizer_2017,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel13EditPart.VISUAL_ID));
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
    private String getIdentifier_2009Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.Identifier_2009,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel6EditPart.VISUAL_ID));
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
    private String getStringInput_3016Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3016,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputName7EditPart.VISUAL_ID));
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
    private String getTypeOfResource_2013Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.TypeOfResource_2013,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(WrappingLabel10EditPart.VISUAL_ID));
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
    private String getStringInput_3013Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.StringInput_3013,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(StringInputName4EditPart.VISUAL_ID));
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
    private String getTabbedDataField_3017Text(View view) {
	IParser parser = CrosswalkParserProvider.getParser(CrosswalkElementTypes.TabbedDataField_3017,
			view.getElement() != null ? view.getElement() : view,
			CrosswalkVisualIDRegistry.getType(TabbedDataFieldColumnNumberEditPart.VISUAL_ID));
	if (parser != null) {
	    return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
			    ParserOptions.NONE.intValue());
	} else {
	    CrosswalkDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
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
