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

				case DelimitedFileEditPart.VISUAL_ID:
					return new DelimitedFileEditPart(view);

				case DelimitedFileSourceFileEditPart.VISUAL_ID:
					return new DelimitedFileSourceFileEditPart(view);

				case OriginalNameRecordMatcherEditPart.VISUAL_ID:
					return new OriginalNameRecordMatcherEditPart(view);

				case WrappingLabel9EditPart.VISUAL_ID:
					return new WrappingLabel9EditPart(view);

				case DateRecognizerEditPart.VISUAL_ID:
					return new DateRecognizerEditPart(view);

				case WrappingLabel12EditPart.VISUAL_ID:
					return new WrappingLabel12EditPart(view);

				case TextEditPart.VISUAL_ID:
					return new TextEditPart(view);

				case TextValueEditPart.VISUAL_ID:
					return new TextValueEditPart(view);

				case TrimWhitespaceEditPart.VISUAL_ID:
					return new TrimWhitespaceEditPart(view);

				case WrappingLabel13EditPart.VISUAL_ID:
					return new WrappingLabel13EditPart(view);

				case MappedElementEditPart.VISUAL_ID:
					return new MappedElementEditPart(view);

				case WrappingLabel14EditPart.VISUAL_ID:
					return new WrappingLabel14EditPart(view);

				case TabbedDataFieldEditPart.VISUAL_ID:
					return new TabbedDataFieldEditPart(view);

				case WrappingLabel15EditPart.VISUAL_ID:
					return new WrappingLabel15EditPart(view);

				case TabbedDataFieldLabelColumnNumberEditPart.VISUAL_ID:
					return new TabbedDataFieldLabelColumnNumberEditPart(view);

				case MappedElement2EditPart.VISUAL_ID:
					return new MappedElement2EditPart(view);

				case WrappingLabel16EditPart.VISUAL_ID:
					return new WrappingLabel16EditPart(view);

				case MappedAttributeEditPart.VISUAL_ID:
					return new MappedAttributeEditPart(view);

				case MappedAttributeNameEditPart.VISUAL_ID:
					return new MappedAttributeNameEditPart(view);

				case DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID:
					return new DelimitedFileDataFieldCompartmentEditPart(view);

				case MappedElementChildElementsCompartmentEditPart.VISUAL_ID:
					return new MappedElementChildElementsCompartmentEditPart(view);

				case MappedElementChildElementsCompartment2EditPart.VISUAL_ID:
					return new MappedElementChildElementsCompartment2EditPart(view);

				case InputOutputEditPart.VISUAL_ID:
					return new InputOutputEditPart(view);

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
