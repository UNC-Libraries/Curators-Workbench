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
package crosswalk.diagram.sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import crosswalk.diagram.custom.HelpfulFeatureEditorDialog;

public class HelpfulPropertyDescriptor extends PropertyDescriptor implements
		IPropertyDescriptor {

	public HelpfulPropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
	}

	@Override
	public CellEditor createPropertyEditor(Composite composite) {
		if (!itemPropertyDescriptor.canSetProperty(object)) {
			return null;
		}

		CellEditor result = null;

		Object genericFeature = itemPropertyDescriptor.getFeature(object);
		
		if (genericFeature instanceof EReference[]) {
			result = new ExtendedComboBoxCellEditor(composite,
					new ArrayList<Object>(itemPropertyDescriptor
							.getChoiceOfValues(object)),
					getEditLabelProvider(),
					itemPropertyDescriptor.isSortChoices(object));
		} else if (genericFeature instanceof EStructuralFeature) {
			final EStructuralFeature feature = (EStructuralFeature) genericFeature;
			final EClassifier eType = feature.getEType();
			final Collection<?> choiceOfValues = itemPropertyDescriptor
					.getChoiceOfValues(object);
			// get help context from annotation on model
			String helpId = null;
			EAnnotation ann = feature.getEAnnotation("org.eclipse.help");
			if(ann != null && ann.getDetails() != null) {
				helpId = ann.getDetails().get("contextID");
			}
			final String helpContextID = helpId;
			if (choiceOfValues != null) {
				if (itemPropertyDescriptor.isMany(object)) {
					boolean valid = true;
					for (Object choice : choiceOfValues) {
						if (!eType.isInstance(choice)) {
							valid = false;
							break;
						}
					}

					if (valid) {
						final ILabelProvider editLabelProvider = getEditLabelProvider();
						result = new ExtendedDialogCellEditor(composite,
								editLabelProvider) {
							@Override
							protected Object openDialogBox(
									Control cellEditorWindow) {
								HelpfulFeatureEditorDialog dialog = new HelpfulFeatureEditorDialog(
										cellEditorWindow.getShell(),
										editLabelProvider, object,
										feature.getEType(),
										(List<?>) doGetValue(),
										getDisplayName(),
										new ArrayList<Object>(choiceOfValues),
										false,
										itemPropertyDescriptor
												.isSortChoices(object),
										feature.isUnique(), helpContextID);
								dialog.open();
								return dialog.getResult();
							}
						};
					}
				}

				if (result == null) {
					result = new ExtendedComboBoxCellEditor(composite,
							new ArrayList<Object>(choiceOfValues),
							getEditLabelProvider(),
							itemPropertyDescriptor.isSortChoices(object));
				}
			} else if (eType instanceof EDataType) {
				EDataType eDataType = (EDataType) eType;
				if (eDataType.isSerializable()) {
					if (itemPropertyDescriptor.isMany(object)) {
						final ILabelProvider editLabelProvider = getEditLabelProvider();
						result = new ExtendedDialogCellEditor(composite,
								editLabelProvider) {
							@Override
							protected Object openDialogBox(
									Control cellEditorWindow) {
								HelpfulFeatureEditorDialog dialog = new HelpfulFeatureEditorDialog(
										cellEditorWindow.getShell(),
										editLabelProvider, object,
										feature.getEType(),
										(List<?>) doGetValue(),
										getDisplayName(), null,
										itemPropertyDescriptor
												.isMultiLine(object), false,
										feature.isUnique(), helpContextID);
								dialog.open();
								return dialog.getResult();
							}
						};
					} else if (eDataType.getInstanceClass() == Boolean.class
							|| eDataType.getInstanceClass() == Boolean.TYPE) {
						result = new ExtendedComboBoxCellEditor(composite,
								Arrays.asList(new Object[] { Boolean.FALSE,
										Boolean.TRUE }),
								getEditLabelProvider(),
								itemPropertyDescriptor.isSortChoices(object));
					} else {
						result = createEDataTypeCellEditor(eDataType, composite);
					}
				}
			}
		}

		return result;
	}

}
