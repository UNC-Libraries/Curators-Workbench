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

import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileDataFieldCompartmentEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileSourceFileEditPart;
import crosswalk.diagram.edit.parts.InputOutputEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeNameEditPart;
import crosswalk.diagram.edit.parts.MappedElement2EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartment2EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartmentEditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldLabelColumnNumberEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TextValueEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.edit.parts.WrappingLabel12EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel13EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel14EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel15EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel16EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel9EditPart;
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
		case DelimitedFileEditPart.VISUAL_ID:
		case OriginalNameRecordMatcherEditPart.VISUAL_ID:
		case DateRecognizerEditPart.VISUAL_ID:
		case TextEditPart.VISUAL_ID:
		case TrimWhitespaceEditPart.VISUAL_ID:
		case MappedElementEditPart.VISUAL_ID:
		case TabbedDataFieldEditPart.VISUAL_ID:
		case MappedAttributeEditPart.VISUAL_ID:
		case MappedElement2EditPart.VISUAL_ID:
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
	return DelimitedFileEditPart.VISUAL_ID == visualID || OriginalNameRecordMatcherEditPart.VISUAL_ID == visualID
			|| DateRecognizerEditPart.VISUAL_ID == visualID || TextEditPart.VISUAL_ID == visualID
			|| TrimWhitespaceEditPart.VISUAL_ID == visualID || MappedElementEditPart.VISUAL_ID == visualID
			|| TabbedDataFieldEditPart.VISUAL_ID == visualID
			|| MappedElement2EditPart.VISUAL_ID == visualID
			|| MappedAttributeEditPart.VISUAL_ID == visualID;
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
	case DelimitedFileEditPart.VISUAL_ID:
	    return createDelimitedFile_2001(domainElement, containerView, index, persisted, preferencesHint);
	case OriginalNameRecordMatcherEditPart.VISUAL_ID:
	    return createOriginalNameRecordMatcher_2010(domainElement, containerView, index, persisted, preferencesHint);
	case DateRecognizerEditPart.VISUAL_ID:
	    return createDateRecognizer_2013(domainElement, containerView, index, persisted, preferencesHint);
	case TextEditPart.VISUAL_ID:
	    return createText_2014(domainElement, containerView, index, persisted, preferencesHint);
	case TrimWhitespaceEditPart.VISUAL_ID:
	    return createTrimWhitespace_2015(domainElement, containerView, index, persisted, preferencesHint);
	case MappedElementEditPart.VISUAL_ID:
	    return createMappedElement_2016(domainElement, containerView, index, persisted, preferencesHint);
	case TabbedDataFieldEditPart.VISUAL_ID:
	    return createTabbedDataField_3001(domainElement, containerView, index, persisted, preferencesHint);
	case MappedElement2EditPart.VISUAL_ID:
	    return createMappedElement_3015(domainElement, containerView, index, persisted, preferencesHint);
	case MappedAttributeEditPart.VISUAL_ID:
	    return createMappedAttribute_3016(domainElement, containerView, index, persisted, preferencesHint);
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
	case InputOutputEditPart.VISUAL_ID:
	    return createInputOutput_4003(containerView, index, persisted, preferencesHint);
	}
	// can never happen, provided #provides(CreateEdgeViewOperation) is correct
	return null;
    }

    /**
     * @generated
     */
    public Node createDelimitedFile_2001(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(DelimitedFileEditPart.VISUAL_ID));
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
	Node label5003 = createLabel(node, CrosswalkVisualIDRegistry.getType(DelimitedFileSourceFileEditPart.VISUAL_ID));
	createCompartment(node, CrosswalkVisualIDRegistry.getType(DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID),
			false, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createOriginalNameRecordMatcher_2010(EObject domainElement, View containerView, int index,
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
	Node label5021 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel9EditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createDateRecognizer_2013(EObject domainElement, View containerView, int index, boolean persisted,
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
	Node label5027 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel12EditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createText_2014(EObject domainElement, View containerView, int index, boolean persisted,
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
	Node label5028 = createLabel(node, CrosswalkVisualIDRegistry.getType(TextValueEditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createTrimWhitespace_2015(EObject domainElement, View containerView, int index, boolean persisted,
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
	Node label5030 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel13EditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createMappedElement_2016(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(MappedElementEditPart.VISUAL_ID));
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
	Node label5034 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel14EditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry.getType(MappedElementChildElementsCompartmentEditPart.VISUAL_ID),
			true, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createTabbedDataField_3001(EObject domainElement, View containerView, int index, boolean persisted,
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
	Node label5001 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel15EditPart.VISUAL_ID));
	Node label5002 = createLabel(node,
			CrosswalkVisualIDRegistry.getType(TabbedDataFieldLabelColumnNumberEditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Node createMappedElement_3015(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(MappedElement2EditPart.VISUAL_ID));
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
	Node label5031 = createLabel(node, CrosswalkVisualIDRegistry.getType(WrappingLabel16EditPart.VISUAL_ID));
	createCompartment(node,
			CrosswalkVisualIDRegistry.getType(MappedElementChildElementsCompartment2EditPart.VISUAL_ID),
			true, false, true, true);
	return node;
    }

    /**
     * @generated
     */
    public Node createMappedAttribute_3016(EObject domainElement, View containerView, int index, boolean persisted,
		    PreferencesHint preferencesHint) {
	Shape node = NotationFactory.eINSTANCE.createShape();
	node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
	node.setType(CrosswalkVisualIDRegistry.getType(MappedAttributeEditPart.VISUAL_ID));
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
	Node label5032 = createLabel(node, CrosswalkVisualIDRegistry.getType(MappedAttributeNameEditPart.VISUAL_ID));
	return node;
    }

    /**
     * @generated
     */
    public Edge createInputOutput_4003(View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
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
	edge.setType(CrosswalkVisualIDRegistry.getType(InputOutputEditPart.VISUAL_ID));
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
