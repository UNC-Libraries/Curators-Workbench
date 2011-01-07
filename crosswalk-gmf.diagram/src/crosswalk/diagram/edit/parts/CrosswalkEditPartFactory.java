/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import crosswalk.diagram.part.CrosswalkVisualIDRegistry;

/**
 * @generated
 */
public class CrosswalkEditPartFactory implements EditPartFactory {

    /**
     * @generated
     */
    public EditPart createEditPart(EditPart context, Object model) {
	if (model instanceof View) {
	    View view = (View) model;
	    switch (CrosswalkVisualIDRegistry.getVisualID(view)) {

	    case CrossWalkEditPart.VISUAL_ID:
		return new CrossWalkEditPart(view);

	    case TabSeparatedFileEditPart.VISUAL_ID:
		return new TabSeparatedFileEditPart(view);

	    case TabSeparatedFileSourceFileEditPart.VISUAL_ID:
		return new TabSeparatedFileSourceFileEditPart(view);

	    case TitleInfoEditPart.VISUAL_ID:
		return new TitleInfoEditPart(view);

	    case WrappingLabel3EditPart.VISUAL_ID:
		return new WrappingLabel3EditPart(view);

	    case AbstractEditPart.VISUAL_ID:
		return new AbstractEditPart(view);

	    case WrappingLabel4EditPart.VISUAL_ID:
		return new WrappingLabel4EditPart(view);

	    case GenreEditPart.VISUAL_ID:
		return new GenreEditPart(view);

	    case WrappingLabel5EditPart.VISUAL_ID:
		return new WrappingLabel5EditPart(view);

	    case IdentifierEditPart.VISUAL_ID:
		return new IdentifierEditPart(view);

	    case WrappingLabel6EditPart.VISUAL_ID:
		return new WrappingLabel6EditPart(view);

	    case LanguageEditPart.VISUAL_ID:
		return new LanguageEditPart(view);

	    case WrappingLabel7EditPart.VISUAL_ID:
		return new WrappingLabel7EditPart(view);

	    case NameEditPart.VISUAL_ID:
		return new NameEditPart(view);

	    case WrappingLabel8EditPart.VISUAL_ID:
		return new WrappingLabel8EditPart(view);

	    case SubjectEditPart.VISUAL_ID:
		return new SubjectEditPart(view);

	    case WrappingLabel9EditPart.VISUAL_ID:
		return new WrappingLabel9EditPart(view);

	    case TypeOfResourceEditPart.VISUAL_ID:
		return new TypeOfResourceEditPart(view);

	    case WrappingLabel10EditPart.VISUAL_ID:
		return new WrappingLabel10EditPart(view);

	    case OriginalNameRecordMatcherEditPart.VISUAL_ID:
		return new OriginalNameRecordMatcherEditPart(view);

	    case WrappingLabel2EditPart.VISUAL_ID:
		return new WrappingLabel2EditPart(view);

	    case DateCreatedEditPart.VISUAL_ID:
		return new DateCreatedEditPart(view);

	    case WrappingLabel11EditPart.VISUAL_ID:
		return new WrappingLabel11EditPart(view);

	    case AccessConditionEditPart.VISUAL_ID:
		return new AccessConditionEditPart(view);

	    case WrappingLabel12EditPart.VISUAL_ID:
		return new WrappingLabel12EditPart(view);

	    case DateRecognizerEditPart.VISUAL_ID:
		return new DateRecognizerEditPart(view);

	    case WrappingLabel13EditPart.VISUAL_ID:
		return new WrappingLabel13EditPart(view);

	    case TextEditPart.VISUAL_ID:
		return new TextEditPart(view);

	    case TextValueEditPart.VISUAL_ID:
		return new TextValueEditPart(view);

	    case TrimWhitespaceEditPart.VISUAL_ID:
		return new TrimWhitespaceEditPart(view);

	    case WrappingLabel14EditPart.VISUAL_ID:
		return new WrappingLabel14EditPart(view);

	    case TabbedDataFieldEditPart.VISUAL_ID:
		return new TabbedDataFieldEditPart(view);

	    case TabbedDataFieldColumnNumberEditPart.VISUAL_ID:
		return new TabbedDataFieldColumnNumberEditPart(view);

	    case TabbedDataFieldLabelColumnNumberEditPart.VISUAL_ID:
		return new TabbedDataFieldLabelColumnNumberEditPart(view);

	    case StringInputEditPart.VISUAL_ID:
		return new StringInputEditPart(view);

	    case WrappingLabelEditPart.VISUAL_ID:
		return new WrappingLabelEditPart(view);

	    case StringInput2EditPart.VISUAL_ID:
		return new StringInput2EditPart(view);

	    case StringInputNameEditPart.VISUAL_ID:
		return new StringInputNameEditPart(view);

	    case StringInput3EditPart.VISUAL_ID:
		return new StringInput3EditPart(view);

	    case StringInputName2EditPart.VISUAL_ID:
		return new StringInputName2EditPart(view);

	    case StringInput4EditPart.VISUAL_ID:
		return new StringInput4EditPart(view);

	    case StringInputName3EditPart.VISUAL_ID:
		return new StringInputName3EditPart(view);

	    case StringInput5EditPart.VISUAL_ID:
		return new StringInput5EditPart(view);

	    case StringInputName4EditPart.VISUAL_ID:
		return new StringInputName4EditPart(view);

	    case StringInput6EditPart.VISUAL_ID:
		return new StringInput6EditPart(view);

	    case StringInputName5EditPart.VISUAL_ID:
		return new StringInputName5EditPart(view);

	    case StringInput7EditPart.VISUAL_ID:
		return new StringInput7EditPart(view);

	    case StringInputName6EditPart.VISUAL_ID:
		return new StringInputName6EditPart(view);

	    case StringInput8EditPart.VISUAL_ID:
		return new StringInput8EditPart(view);

	    case StringInputName7EditPart.VISUAL_ID:
		return new StringInputName7EditPart(view);

	    case StringInput9EditPart.VISUAL_ID:
		return new StringInput9EditPart(view);

	    case StringInputName8EditPart.VISUAL_ID:
		return new StringInputName8EditPart(view);

	    case DateInputEditPart.VISUAL_ID:
		return new DateInputEditPart(view);

	    case DateInputNameEditPart.VISUAL_ID:
		return new DateInputNameEditPart(view);

	    case StringInput10EditPart.VISUAL_ID:
		return new StringInput10EditPart(view);

	    case StringInputName9EditPart.VISUAL_ID:
		return new StringInputName9EditPart(view);

	    case StringInput11EditPart.VISUAL_ID:
		return new StringInput11EditPart(view);

	    case StringInputName10EditPart.VISUAL_ID:
		return new StringInputName10EditPart(view);

	    case StringInput12EditPart.VISUAL_ID:
		return new StringInput12EditPart(view);

	    case StringInputName11EditPart.VISUAL_ID:
		return new StringInputName11EditPart(view);

	    case TabSeparatedFileDataFieldCompartmentEditPart.VISUAL_ID:
		return new TabSeparatedFileDataFieldCompartmentEditPart(view);

	    case TitleInfoTitleInfoInputsCompartmentEditPart.VISUAL_ID:
		return new TitleInfoTitleInfoInputsCompartmentEditPart(view);

	    case AbstractOutputElementInputsCompartmentEditPart.VISUAL_ID:
		return new AbstractOutputElementInputsCompartmentEditPart(view);

	    case GenreOutputElementInputsCompartmentEditPart.VISUAL_ID:
		return new GenreOutputElementInputsCompartmentEditPart(view);

	    case IdentifierOutputElementInputsCompartmentEditPart.VISUAL_ID:
		return new IdentifierOutputElementInputsCompartmentEditPart(view);

	    case LanguageOutputElementInputsCompartmentEditPart.VISUAL_ID:
		return new LanguageOutputElementInputsCompartmentEditPart(view);

	    case NameOutputElementInputsCompartmentEditPart.VISUAL_ID:
		return new NameOutputElementInputsCompartmentEditPart(view);

	    case SubjectOutputElementInputsCompartmentEditPart.VISUAL_ID:
		return new SubjectOutputElementInputsCompartmentEditPart(view);

	    case TypeOfResourceOutputElementInputsCompartmentEditPart.VISUAL_ID:
		return new TypeOfResourceOutputElementInputsCompartmentEditPart(view);

	    case OriginalNameRecordMatcherOutputElementInputsCompartmentEditPart.VISUAL_ID:
		return new OriginalNameRecordMatcherOutputElementInputsCompartmentEditPart(view);

	    case DateCreatedOutputElementInputsCompartmentEditPart.VISUAL_ID:
		return new DateCreatedOutputElementInputsCompartmentEditPart(view);

	    case AccessConditionOutputElementInputsCompartmentEditPart.VISUAL_ID:
		return new AccessConditionOutputElementInputsCompartmentEditPart(view);

	    case DateRecognizerOutputElementInputsCompartmentEditPart.VISUAL_ID:
		return new DateRecognizerOutputElementInputsCompartmentEditPart(view);

	    case TrimWhitespaceOutputElementInputsCompartmentEditPart.VISUAL_ID:
		return new TrimWhitespaceOutputElementInputsCompartmentEditPart(view);

	    case StringInputInputEditPart.VISUAL_ID:
		return new StringInputInputEditPart(view);

	    case DateInputInputEditPart.VISUAL_ID:
		return new DateInputInputEditPart(view);

	    }
	}
	return createUnrecognizedEditPart(context, model);
    }

    /**
     * @generated
     */
    private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
	// Handle creation of unrecognized child node EditParts here
	return null;
    }

    /**
     * @generated
     */
    public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
	if (source.getFigure() instanceof WrappingLabel)
	    return new TextCellEditorLocator((WrappingLabel) source.getFigure());
	else {
	    return new LabelCellEditorLocator((Label) source.getFigure());
	}
    }

    /**
     * @generated
     */
    static private class TextCellEditorLocator implements CellEditorLocator {

	/**
	 * @generated
	 */
	private WrappingLabel wrapLabel;

	/**
	 * @generated
	 */
	public TextCellEditorLocator(WrappingLabel wrapLabel) {
	    this.wrapLabel = wrapLabel;
	}

	/**
	 * @generated
	 */
	public WrappingLabel getWrapLabel() {
	    return wrapLabel;
	}

	/**
	 * @generated
	 */
	public void relocate(CellEditor celleditor) {
	    Text text = (Text) celleditor.getControl();
	    Rectangle rect = getWrapLabel().getTextBounds().getCopy();
	    getWrapLabel().translateToAbsolute(rect);
	    if (!text.getFont().isDisposed()) {
		if (getWrapLabel().isTextWrapOn() && getWrapLabel().getText().length() > 0) {
		    rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
		} else {
		    int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
		    rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
		}
	    }
	    if (!rect.equals(new Rectangle(text.getBounds()))) {
		text.setBounds(rect.x, rect.y, rect.width, rect.height);
	    }
	}
    }

    /**
     * @generated
     */
    private static class LabelCellEditorLocator implements CellEditorLocator {

	/**
	 * @generated
	 */
	private Label label;

	/**
	 * @generated
	 */
	public LabelCellEditorLocator(Label label) {
	    this.label = label;
	}

	/**
	 * @generated
	 */
	public Label getLabel() {
	    return label;
	}

	/**
	 * @generated
	 */
	public void relocate(CellEditor celleditor) {
	    Text text = (Text) celleditor.getControl();
	    Rectangle rect = getLabel().getTextBounds().getCopy();
	    getLabel().translateToAbsolute(rect);
	    if (!text.getFont().isDisposed()) {
		int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
		rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
	    }
	    if (!rect.equals(new Rectangle(text.getBounds()))) {
		text.setBounds(rect.x, rect.y, rect.width, rect.height);
	    }
	}
    }
}
