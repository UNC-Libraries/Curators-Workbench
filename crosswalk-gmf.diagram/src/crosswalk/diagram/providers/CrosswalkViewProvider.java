/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.providers;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

import crosswalk.diagram.edit.parts.AbstractEditPart;
import crosswalk.diagram.edit.parts.AbstractOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.AccessConditionEditPart;
import crosswalk.diagram.edit.parts.AccessConditionOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.DateCreatedEditPart;
import crosswalk.diagram.edit.parts.DateCreatedOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.DateInputEditPart;
import crosswalk.diagram.edit.parts.DateInputInputEditPart;
import crosswalk.diagram.edit.parts.DateInputNameEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.GenreEditPart;
import crosswalk.diagram.edit.parts.GenreOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.IdentifierEditPart;
import crosswalk.diagram.edit.parts.IdentifierOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.LanguageEditPart;
import crosswalk.diagram.edit.parts.LanguageOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.NameEditPart;
import crosswalk.diagram.edit.parts.NameOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherOutputElementInputsCompartmentEditPart;
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
import crosswalk.diagram.edit.parts.SubjectOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.TabSeparatedFileDataFieldCompartmentEditPart;
import crosswalk.diagram.edit.parts.TabSeparatedFileEditPart;
import crosswalk.diagram.edit.parts.TabSeparatedFileSourceFileEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldColumnNumberEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldLabelColumnNumberEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TextValueEditPart;
import crosswalk.diagram.edit.parts.TitleInfoEditPart;
import crosswalk.diagram.edit.parts.TitleInfoTitleInfoInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceOutputElementInputsCompartmentEditPart;
import crosswalk.diagram.edit.parts.TypeOfResourceEditPart;
import crosswalk.diagram.edit.parts.TypeOfResourceOutputElementInputsCompartmentEditPart;
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
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;

/**
 * @generated
 */
public class CrosswalkViewProvider extends AbstractProvider implements IViewProvider {

    /**
     * @generated
     */
    public final boolean provides(IOperation operation) {
	if (operation instanceof CreateViewForKindOperation) {
	    return provides((CreateViewForKindOperation) operation);
	}
	assert operation instanceof CreateViewOperation;
	if (operation instanceof CreateDiagramViewOperation) {
	    return provides((CreateDiagramViewOperation) operation);
	} else if (operation instanceof CreateEdgeViewOperation) {
	    return provides((CreateEdgeViewOperation) operation);
	} else if (operation instanceof CreateNodeViewOperation) {
	    return provides((CreateNodeViewOperation) operation);
	}
	return false;
    }

    /**
     * @generated
     */
    protected boolean provides(CreateViewForKindOperation op) {
	/*
	 if (op.getViewKind() == Node.class)
	 return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
	 if (op.getViewKind() == Edge.class)
	 return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
	 */
	return true;
    }

    /**
     * @generated
     */
    protected boolean provides(CreateDiagramViewOperation op) {
	return CrossWalkEditPart.MODEL_ID.equals(op.getSemanticHint())
			&& CrosswalkVisualIDRegistry.getDiagramVisualID(getSemanticElement(op.getSemanticAdapter())) != -1;
    }

    /**
     * @generated
     */
    protected boolean provides(CreateNodeViewOperation op) {
	if (op.getContainerView() == null) {
	    return false;
	}
	IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
	EObject domainElement = getSemanticElement(op.getSemanticAdapter());
	int visualID;
	if (op.getSemanticHint() == null) {
	    // Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
	    // In this situation there should be NO elementType, visualID will be determined
	    // by VisualIDRegistry.getNodeVisualID() for domainElement.
	    if (elementType != null || domainElement == null) {
		return false;
	    }
	    visualID = CrosswalkVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement);
	} else {
	    visualID = CrosswalkVisualIDRegistry.getVisualID(op.getSemanticHint());
	    if (elementType != null) {
		if (!CrosswalkElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
		    return false; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (!op.getSemanticHint().equals(elementTypeHint)) {
		    return false; // if semantic hint is specified it should be the same as in element type
		}
		if (domainElement != null
				&& visualID != CrosswalkVisualIDRegistry.getNodeVisualID(op.getContainerView(),
						domainElement)) {
		    return false; // visual id for node EClass should match visual id from element type
		}
	    } else {
		if (!CrossWalkEditPart.MODEL_ID.equals(CrosswalkVisualIDRegistry.getModelID(op.getContainerView()))) {
		    return false; // foreign diagram
		}
		switch (visualID) {
		case TabSeparatedFileEditPart.VISUAL_ID:
		case TitleInfoEditPart.VISUAL_ID:
		case AbstractEditPart.VISUAL_ID:
		case GenreEditPart.VISUAL_ID:
		case IdentifierEditPart.VISUAL_ID:
		case LanguageEditPart.VISUAL_ID:
		case NameEditPart.VISUAL_ID:
		case SubjectEditPart.VISUAL_ID:
		case TypeOfResourceEditPart.VISUAL_ID:
		case OriginalNameRecordMatcherEditPart.VISUAL_ID:
		case DateCreatedEditPart.VISUAL_ID:
		case AccessConditionEditPart.VISUAL_ID:
		case DateRecognizerEditPart.VISUAL_ID:
		case TextEditPart.VISUAL_ID:
		case TrimWhitespaceEditPart.VISUAL_ID:
		case TabbedDataFieldEditPart.VISUAL_ID:
		case StringInputEditPart.VISUAL_ID:
		case DateInputEditPart.VISUAL_ID:
		case StringInput2EditPart.VISUAL_ID:
		case StringInput3EditPart.VISUAL_ID:
		case StringInput4EditPart.VISUAL_ID:
		case StringInput5EditPart.VISUAL_ID:
		case StringInput6EditPart.VISUAL_ID:
		case StringInput7EditPart.VISUAL_ID:
		case StringInput8EditPart.VISUAL_ID:
		case StringInput9EditPart.VISUAL_ID:
		case StringInput10EditPart.VISUAL_ID:
		case StringInput11EditPart.VISUAL_ID:
		case StringInput12EditPart.VISUAL_ID:
		    if (domainElement == null
				    || visualID != CrosswalkVisualIDRegistry.getNodeVisualID(op.getContainerView(),
						    domainElement)) {
			return false; // visual id in semantic hint should match visual id for domain element
		    }
		    break;
		default:
		    return false;
		}
	    }
	}
	return TabSeparatedFileEditPart.VISUAL_ID == visualID || TitleInfoEditPart.VISUAL_ID == visualID
			|| AbstractEditPart.VISUAL_ID == visualID || GenreEditPart.VISUAL_ID == visualID
			|| IdentifierEditPart.VISUAL_ID == visualID || LanguageEditPart.VISUAL_ID == visualID
			|| NameEditPart.VISUAL_ID == visualID || SubjectEditPart.VISUAL_ID == visualID
			|| TypeOfResourceEditPart.VISUAL_ID == visualID
			|| OriginalNameRecordMatcherEditPart.VISUAL_ID == visualID
			|| DateCreatedEditPart.VISUAL_ID == visualID || AccessConditionEditPart.VISUAL_ID == visualID
			|| DateRecognizerEditPart.VISUAL_ID == visualID || TextEditPart.VISUAL_ID == visualID
			|| TrimWhitespaceEditPart.VISUAL_ID == visualID
			|| TabbedDataFieldEditPart.VISUAL_ID == visualID || StringInputEditPart.VISUAL_ID == visualID
			|| StringInput2EditPart.VISUAL_ID == visualID || StringInput3EditPart.VISUAL_ID == visualID
			|| StringInput4EditPart.VISUAL_ID == visualID || StringInput5EditPart.VISUAL_ID == visualID
			|| StringInput6EditPart.VISUAL_ID == visualID || StringInput7EditPart.VISUAL_ID == visualID
			|| StringInput8EditPart.VISUAL_ID == visualID || StringInput9EditPart.VISUAL_ID == visualID
			|| DateInputEditPart.VISUAL_ID == visualID || StringInput10EditPart.VISUAL_ID == visualID
			|| StringInput11EditPart.VISUAL_ID == visualID || StringInput12EditPart.VISUAL_ID == visualID;
    }

    /**
     * @generated
     */
    protected boolean provides(CreateEdgeViewOperation op) {
	IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
	if (!CrosswalkElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
	    return false; // foreign element type
	}
	String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
	if (elementTypeHint == null || (op.getSemanticHint() != null && !elementTypeHint.equals(op.getSemanticHint()))) {
	    return false; // our hint is visual id and must be specified, and it should be the same as in element type
	}
	int visualID = CrosswalkVisualIDRegistry.getVisualID(elementTypeHint);
	EObject domainElement = getSemanticElement(op.getSemanticAdapter());
	if (domainElement != null && visualID != CrosswalkVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
	    return false; // visual id for link EClass should match visual id from element type
	}
	return true;
    }

    /**
     * @generated
     */
    public Diagram createDiagram(IAdaptable semanticAdapter, String diagramKind, PreferencesHint preferencesHint) {
	Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
	diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
	diagram.setType(CrossWalkEditPart.MODEL_ID);
	diagram.setElement(getSemanticElement(semanticAdapter));
	diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
	return diagram;
    }

    /**
     * @generated
     */
    public Node createNode(IAdaptable semanticAdapter, View containerView, String semanticHint, int index,
		    boolean persisted, PreferencesHint preferencesHint) {
	final EObject domainElement = getSemanticElement(semanticAdapter);
	final int visualID;
	if (semanticHint == null) {
	    visualID = CrosswalkVisualIDRegistry.getNodeVisualID(containerView, domainElement);
	} else {
	    visualID = CrosswalkVisualIDRegistry.getVisualID(semanticHint);
	}
	switch (visualID) {
	case TabSeparatedFileEditPart.VISUAL_ID:
	    return createTabSeparatedFile_2001(domainElement, containerView, index, persisted, preferencesHint);
	case TitleInfoEditPart.VISUAL_ID:
	    return createTitleInfo_2005(domainElement, containerView, index, persisted, preferencesHint);
	case AbstractEditPart.VISUAL_ID:
	    return createAbstract_2007(domainElement, containerView, index, persisted, preferencesHint);
	case GenreEditPart.VISUAL_ID:
	    return createGenre_2008(domainElement, containerView, index, persisted, preferencesHint);
	case IdentifierEditPart.VISUAL_ID:
	    return createIdentifier_2009(domainElement, containerView, index, persisted, preferencesHint);
	case LanguageEditPart.VISUAL_ID:
	    return createLanguage_2010(domainElement, containerView, index, persisted, preferencesHint);
	case NameEditPart.VISUAL_ID:
	    return createName_2011(domainElement, containerView, index, persisted, preferencesHint);
	case SubjectEditPart.VISUAL_ID:
	    return createSubject_2012(domainElement, containerView, index, persisted, preferencesHint);
	case TypeOfResourceEditPart.VISUAL_ID:
	    return createTypeOfResource_2013(domainElement, containerView, index, persisted, preferencesHint);
	case OriginalNameRecordMatcherEditPart.VISUAL_ID:
	    return createOriginalNameRecordMatcher_2014(domainElement, containerView, index, persisted, preferencesHint);
	case DateCreatedEditPart.VISUAL_ID:
	    return createDateCreated_2015(domainElement, containerView, index, persisted, preferencesHint);
	case AccessConditionEditPart.VISUAL_ID:
	    return createAccessCondition_2016(domainElement, containerView, index, persisted, preferencesHint);
	case DateRecognizerEditPart.VISUAL_ID:
	    return createDateRecognizer_2017(domainElement, containerView, index, persisted, preferencesHint);
	case TextEditPart.VISUAL_ID:
	    return createText_2018(domainElement, containerView, index, persisted, preferencesHint);
	case TrimWhitespaceEditPart.VISUAL_ID:
	    return createTrimWhitespace_2019(domainElement, containerView, index, persisted, preferencesHint);
	case TabbedDataFieldEditPart.VISUAL_ID:
	    return createTabbedDataField_3017(domainElement, containerView, index, persisted, preferencesHint);
	case StringInputEditPart.VISUAL_ID:
	    return createStringInput_3008(domainElement, containerView, index, persisted, preferencesHint);
	case StringInput2EditPart.VISUAL_ID:
	    return createStringInput_3010(domainElement, containerView, index, persisted, preferencesHint);
	case StringInput3EditPart.VISUAL_ID:
	    return createStringInput_3011(domainElement, containerView, index, persisted, preferencesHint);
	case StringInput4EditPart.VISUAL_ID:
	    return createStringInput_3012(domainElement, containerView, index, persisted, preferencesHint);
	case StringInput5EditPart.VISUAL_ID:
	    return createStringInput_3013(domainElement, containerView, index, persisted, preferencesHint);
	case StringInput6EditPart.VISUAL_ID:
	    return createStringInput_3014(domainElement, containerView, index, persisted, preferencesHint);
	case StringInput7EditPart.VISUAL_ID:
	    return createStringInput_3015(domainElement, containerView, index, persisted, preferencesHint);
	case StringInput8EditPart.VISUAL_ID:
	    return createStringInput_3016(domainElement, containerView, index, persisted, preferencesHint);
	case StringInput9EditPart.VISUAL_ID:
	    return createStringInput_3018(domainElement, containerView, index, persisted, preferencesHint);
	case DateInputEditPart.VISUAL_ID:
	    return createDateInput_3019(domainElement, containerView, index, persisted, preferencesHint);
	case StringInput10EditPart.VISUAL_ID:
	    return createStringInput_3020(domainElement, containerView, index, persisted, preferencesHint);
	case StringInput11EditPart.VISUAL_ID:
	    return createStringInput_3021(domainElement, containerView, index, persisted, preferencesHint);
	case StringInput12EditPart.VISUAL_ID:
	    return createStringInput_3022(domainElement, containerView, index, persisted, preferencesHint);
	}
	// can't happen, provided #provides(CreateNodeViewOperation) is correct
	return null;
    }

    /**
     * @generated
     */
    public Edge createEdge(IAdaptable semanticAdapter, View containerView, String semanticHint, int index,
		    boolean persisted, PreferencesHint preferencesHint) {
	IElementType elementType = getSemanticElementType(semanticAdapter);
	String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
	switch (CrosswalkVisualIDRegistry.getVisualID(elementTypeHint)) {
	case StringInputInputEditPart.VISUAL_ID:
	    return createStringInputInput_4009(containerView, index, persisted, preferencesHint);
	case DateInputInputEditPart.VISUAL_ID:
	    return createDateInputInput_4010(containerView, index, persisted, preferencesHint);
	}
	// can never happen, provided #provides(CreateEdgeViewOperation) is correct
	return null;
    }

    /**
     * @generated
     */
    public Node createTabSeparatedFile_2001(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Node node = NotationFactory.eINSTANCE.createNode();
	node.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
	node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
	node.getStyles().add(NotationFactory.eINSTANCE.createLineStyle());
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(TabSeparatedFileEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	Node label5001 = createLabel(node,
			CrosswalkVisualIDRegistry.getType(TabSeparatedFileSourceFileEditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry.getType(TabSeparatedFileDataFieldCompartmentEditPart.VISUAL_ID),
			false, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createTitleInfo_2005(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Node node = NotationFactory.eINSTANCE.createNode();
	node.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
	node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
	node.getStyles().add(NotationFactory.eINSTANCE.createLineStyle());
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(TitleInfoEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	Node label5018 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel3EditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry.getType(TitleInfoTitleInfoInputsCompartmentEditPart.VISUAL_ID),
			false, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createAbstract_2007(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(AbstractEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5019 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel4EditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry.getType(AbstractOutputElementInputsCompartmentEditPart.VISUAL_ID),
			false, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createGenre_2008(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(GenreEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5020 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel5EditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry.getType(GenreOutputElementInputsCompartmentEditPart.VISUAL_ID),
			false, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createIdentifier_2009(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(IdentifierEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5021 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel6EditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry.getType(IdentifierOutputElementInputsCompartmentEditPart.VISUAL_ID),
			false, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createLanguage_2010(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(LanguageEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5022 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel7EditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry.getType(LanguageOutputElementInputsCompartmentEditPart.VISUAL_ID),
			false, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createName_2011(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(NameEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5023 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel8EditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry.getType(NameOutputElementInputsCompartmentEditPart.VISUAL_ID), false,
			false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createSubject_2012(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(SubjectEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5024 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel9EditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry.getType(SubjectOutputElementInputsCompartmentEditPart.VISUAL_ID),
			false, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createTypeOfResource_2013(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(TypeOfResourceEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5025 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel10EditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry
					.getType(TypeOfResourceOutputElementInputsCompartmentEditPart.VISUAL_ID),
			false, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createOriginalNameRecordMatcher_2014(EObject domainElement, View containerView, int index,
		    boolean persisted, PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(OriginalNameRecordMatcherEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5028 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
	createCompartment(
			node,
			CrosswalkVisualIDRegistry
					.getType(OriginalNameRecordMatcherOutputElementInputsCompartmentEditPart.VISUAL_ID),
			false, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createDateCreated_2015(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(DateCreatedEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5030 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel11EditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry.getType(DateCreatedOutputElementInputsCompartmentEditPart.VISUAL_ID),
			false, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createAccessCondition_2016(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(AccessConditionEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5032 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel12EditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry
					.getType(AccessConditionOutputElementInputsCompartmentEditPart.VISUAL_ID),
			false, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createDateRecognizer_2017(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(DateRecognizerEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5034 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel13EditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry
					.getType(DateRecognizerOutputElementInputsCompartmentEditPart.VISUAL_ID),
			false, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createText_2018(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(TextEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5035 = createLabel(node, CrosswalkVisualIDRegistry.getType(TextValueEditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createTrimWhitespace_2019(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(TrimWhitespaceEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	stampShortcut(containerView, node);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5037 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel14EditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry
					.getType(TrimWhitespaceOutputElementInputsCompartmentEditPart.VISUAL_ID),
			false, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createTabbedDataField_3017(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(TabbedDataFieldEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5026 = createLabel(node,
			CrosswalkVisualIDRegistry.getType(TabbedDataFieldColumnNumberEditPart.VISUAL_ID));
	Node label5038 = createLabel(node,
			CrosswalkVisualIDRegistry.getType(TabbedDataFieldLabelColumnNumberEditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createStringInput_3008(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(StringInputEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5009 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createStringInput_3010(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(StringInput2EditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5011 = createLabel(node, CrosswalkVisualIDRegistry.getType(StringInputNameEditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createStringInput_3011(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(StringInput3EditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5012 = createLabel(node, CrosswalkVisualIDRegistry.getType(StringInputName2EditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createStringInput_3012(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(StringInput4EditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5013 = createLabel(node, CrosswalkVisualIDRegistry.getType(StringInputName3EditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createStringInput_3013(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(StringInput5EditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5014 = createLabel(node, CrosswalkVisualIDRegistry.getType(StringInputName4EditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createStringInput_3014(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(StringInput6EditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5015 = createLabel(node, CrosswalkVisualIDRegistry.getType(StringInputName5EditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createStringInput_3015(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(StringInput7EditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5016 = createLabel(node, CrosswalkVisualIDRegistry.getType(StringInputName6EditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createStringInput_3016(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(StringInput8EditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5017 = createLabel(node, CrosswalkVisualIDRegistry.getType(StringInputName7EditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createStringInput_3018(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(StringInput9EditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5027 = createLabel(node, CrosswalkVisualIDRegistry.getType(StringInputName8EditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createDateInput_3019(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(DateInputEditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5029 = createLabel(node, CrosswalkVisualIDRegistry.getType(DateInputNameEditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createStringInput_3020(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(StringInput10EditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5031 = createLabel(node, CrosswalkVisualIDRegistry.getType(StringInputName9EditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createStringInput_3021(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(StringInput11EditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5033 = createLabel(node, CrosswalkVisualIDRegistry.getType(StringInputName10EditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createStringInput_3022(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(StringInput12EditPart.VISUAL_ID));
	ViewUtil.insertChildView(containerView, node, index, persisted);
	node.setElement(domainElement);
	// initializeFromPreferences 
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

	org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_LINE_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
			FigureUtilities.RGBToInteger(lineRGB));
	FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    nodeFontStyle.setFontName(fontData.getName());
	    nodeFontStyle.setFontHeight(fontData.getHeight());
	    nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
			IPreferenceConstants.PREF_FILL_COLOR);
	ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
			FigureUtilities.RGBToInteger(fillRGB));
	Node label5036 = createLabel(node, CrosswalkVisualIDRegistry.getType(StringInputName11EditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Edge createStringInputInput_4009(View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Edge edge = NotationFactory.eINSTANCE.createEdge();
	edge.getStyles().add(NotationFactory.eINSTANCE.createRoutingStyle());
	edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
	RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
	ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
	points.add(new RelativeBendpoint());
	points.add(new RelativeBendpoint());
	bendpoints.setPoints(points);
	edge.setBendpoints(bendpoints);
	ViewUtil.insertChildView(containerView, edge, index, persisted);
	edge.setType(CrosswalkVisualIDRegistry.getType(StringInputInputEditPart.VISUAL_ID));
	edge.setElement(null);
	// initializePreferences
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
	FontStyle edgeFontStyle = (FontStyle) edge.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (edgeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    edgeFontStyle.setFontName(fontData.getName());
	    edgeFontStyle.setFontHeight(fontData.getHeight());
	    edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	Routing routing = Routing.get(prefStore.getInt(IPreferenceConstants.PREF_LINE_STYLE));
	if (routing != null) {
	    ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
	}
	return edge;
    }

    /**
     * @generated
     */
    public Edge createDateInputInput_4010(View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Edge edge = NotationFactory.eINSTANCE.createEdge();
	edge.getStyles().add(NotationFactory.eINSTANCE.createRoutingStyle());
	edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
	RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
	ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
	points.add(new RelativeBendpoint());
	points.add(new RelativeBendpoint());
	bendpoints.setPoints(points);
	edge.setBendpoints(bendpoints);
	ViewUtil.insertChildView(containerView, edge, index, persisted);
	edge.setType(CrosswalkVisualIDRegistry.getType(DateInputInputEditPart.VISUAL_ID));
	edge.setElement(null);
	// initializePreferences
	final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
	FontStyle edgeFontStyle = (FontStyle) edge.getStyle(NotationPackage.Literals.FONT_STYLE);
	if (edgeFontStyle != null) {
	    FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
	    edgeFontStyle.setFontName(fontData.getName());
	    edgeFontStyle.setFontHeight(fontData.getHeight());
	    edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
	    edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
	    org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
			    IPreferenceConstants.PREF_FONT_COLOR);
	    edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
	Routing routing = Routing.get(prefStore.getInt(IPreferenceConstants.PREF_LINE_STYLE));
	if (routing != null) {
	    ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
	}
	return edge;
    }

    /**
     * @generated
     */
    private void stampShortcut(View containerView, Node target) {
	if (!CrossWalkEditPart.MODEL_ID.equals(CrosswalkVisualIDRegistry.getModelID(containerView))) {
	    EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
	    shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
	    shortcutAnnotation.getDetails().put("modelID", CrossWalkEditPart.MODEL_ID); //$NON-NLS-1$
	    target.getEAnnotations().add(shortcutAnnotation);
	}
    }

    /**
     * @generated
     */
    private Node createLabel(View owner, String hint) {
	DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
	rv.setType(hint);
	ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
	return rv;
    }

    /**
     * @generated
     */
    private Node createCompartment(View owner, String hint, boolean canCollapse, boolean hasTitle, boolean canSort,
		    boolean canFilter) {
	//SemanticListCompartment rv = NotationFactory.eINSTANCE.createSemanticListCompartment();
	//rv.setShowTitle(showTitle);
	//rv.setCollapsed(isCollapsed);
	Node rv;
	if (canCollapse) {
	    rv = NotationFactory.eINSTANCE.createBasicCompartment();
	} else {
	    rv = NotationFactory.eINSTANCE.createDecorationNode();
	}
	if (hasTitle) {
	    TitleStyle ts = NotationFactory.eINSTANCE.createTitleStyle();
	    ts.setShowTitle(true);
	    rv.getStyles().add(ts);
	}
	if (canSort) {
	    rv.getStyles().add(NotationFactory.eINSTANCE.createSortingStyle());
	}
	if (canFilter) {
	    rv.getStyles().add(NotationFactory.eINSTANCE.createFilteringStyle());
	}
	rv.setType(hint);
	ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
	return rv;
    }

    /**
     * @generated
     */
    private EObject getSemanticElement(IAdaptable semanticAdapter) {
	if (semanticAdapter == null) {
	    return null;
	}
	EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
	if (eObject != null) {
	    return EMFCoreUtil.resolve(TransactionUtil.getEditingDomain(eObject), eObject);
	}
	return null;
    }

    /**
     * @generated
     */
    private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
	if (semanticAdapter == null) {
	    return null;
	}
	return (IElementType) semanticAdapter.getAdapter(IElementType.class);
    }
}
