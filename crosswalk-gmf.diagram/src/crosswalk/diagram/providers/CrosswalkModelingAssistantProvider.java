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
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import crosswalk.diagram.custom.MappedModelUtil;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.CrossWalkModelBoxCompartmentEditPart;
import crosswalk.diagram.edit.parts.DateRecognizer2EditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.DictionaryModelBoxCompartmentEditPart;
import crosswalk.diagram.edit.parts.EditingContainerEditPart;
import crosswalk.diagram.edit.parts.FormEditPart;
import crosswalk.diagram.edit.parts.FormModelBoxCompartmentEditPart;
import crosswalk.diagram.edit.parts.InputFieldEditPart;
import crosswalk.diagram.edit.parts.MappedAttribute2EditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedElement2EditPart;
import crosswalk.diagram.edit.parts.MappedElement3EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartment2EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartment3EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartmentEditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.MetadataBlock2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlock3EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockMappingCompartment2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockMappingCompartment3EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockMappingCompartmentEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcher2EditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.Text2EditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespace2EditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.part.CrosswalkDiagramEditorPlugin;
import crosswalk.diagram.part.Messages;

/**
 * @generated
 */
public class CrosswalkModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBarGen(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof EditingContainerEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(CrosswalkElementTypes.CrossWalk_2001);
			types.add(CrosswalkElementTypes.Dictionary_2002);
			types.add(CrosswalkElementTypes.Form_2003);
			return types;
		}
		if (editPart instanceof FormEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(CrosswalkElementTypes.MetadataBlock_3019);
			types.add(CrosswalkElementTypes.Paragraph_3020);
			return types;
		}
		if (editPart instanceof DelimitedFileEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(CrosswalkElementTypes.TabbedDataField_3002);
			return types;
		}
		if (editPart instanceof MappedElementEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(CrosswalkElementTypes.MappedElement_3008);
			types.add(CrosswalkElementTypes.MappedAttribute_3009);
			return types;
		}
		if (editPart instanceof MappedElement2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(CrosswalkElementTypes.MappedElement_3008);
			types.add(CrosswalkElementTypes.MappedAttribute_3009);
			return types;
		}
		if (editPart instanceof MetadataBlock2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(CrosswalkElementTypes.InputField_3017);
			return types;
		}
		if (editPart instanceof MappedElement3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(CrosswalkElementTypes.MappedElement_3008);
			types.add(CrosswalkElementTypes.MappedAttribute_3016);
			return types;
		}
		if (editPart instanceof MetadataBlockEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(CrosswalkElementTypes.InputField_3017);
			return types;
		}
		if (editPart instanceof MetadataBlock3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(CrosswalkElementTypes.InputField_3017);
			return types;
		}
		if (editPart instanceof CrossWalkModelBoxCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(7);
			types.add(CrosswalkElementTypes.DelimitedFile_3001);
			types.add(CrosswalkElementTypes.OriginalNameRecordMatcher_3003);
			types.add(CrosswalkElementTypes.DateRecognizer_3004);
			types.add(CrosswalkElementTypes.Text_3005);
			types.add(CrosswalkElementTypes.TrimWhitespace_3006);
			types.add(CrosswalkElementTypes.MappedElement_3007);
			types.add(CrosswalkElementTypes.MetadataBlock_3018);
			return types;
		}
		if (editPart instanceof MetadataBlockMetadataBlockMappingCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(CrosswalkElementTypes.OriginalNameRecordMatcher_3011);
			types.add(CrosswalkElementTypes.DateRecognizer_3012);
			types.add(CrosswalkElementTypes.Text_3013);
			types.add(CrosswalkElementTypes.TrimWhitespace_3014);
			types.add(CrosswalkElementTypes.MappedElement_3015);
			return types;
		}
		if (editPart instanceof DictionaryModelBoxCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(CrosswalkElementTypes.MetadataBlock_3010);
			return types;
		}
		if (editPart instanceof MetadataBlockMetadataBlockMappingCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(CrosswalkElementTypes.OriginalNameRecordMatcher_3011);
			types.add(CrosswalkElementTypes.DateRecognizer_3012);
			types.add(CrosswalkElementTypes.Text_3013);
			types.add(CrosswalkElementTypes.TrimWhitespace_3014);
			types.add(CrosswalkElementTypes.MappedElement_3015);
			return types;
		}
		if (editPart instanceof MetadataBlockMetadataBlockMappingCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(CrosswalkElementTypes.OriginalNameRecordMatcher_3011);
			types.add(CrosswalkElementTypes.DateRecognizer_3012);
			types.add(CrosswalkElementTypes.Text_3013);
			types.add(CrosswalkElementTypes.TrimWhitespace_3014);
			types.add(CrosswalkElementTypes.MappedElement_3015);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public List getTypesForPopupBar(IAdaptable host) {
		//System.out.println("getting types for " + host);
		List<IElementType> types = new ArrayList<IElementType>();
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		EObject el = editPart.resolveSemanticElement();
		types = getTypesForPopupBarGen(host);
		if (editPart instanceof MappedElementEditPart || editPart instanceof MappedElement2EditPart) {
			boolean hasChildElements = MappedModelUtil.getChildElementFeatures(el).size() > 0;
			boolean hasChildAttributes = MappedModelUtil.getAttributes(el).size() > 0;
			if (!hasChildElements) {
				types.remove(CrosswalkElementTypes.MappedElement_3015);
				types.remove(CrosswalkElementTypes.MappedElement_3007);
				types.remove(CrosswalkElementTypes.MappedElement_3008);
			}
			if (!hasChildAttributes) {
				types.remove(CrosswalkElementTypes.MappedAttribute_3016);
				types.remove(CrosswalkElementTypes.MappedAttribute_3009);
			}
		}
		//for (IElementType e : types) {
		//	System.out.println("popup type: " + e);
		//}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof OriginalNameRecordMatcherEditPart) {
			return ((OriginalNameRecordMatcherEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DateRecognizerEditPart) {
			return ((DateRecognizerEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TrimWhitespaceEditPart) {
			return ((TrimWhitespaceEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MappedAttributeEditPart) {
			return ((MappedAttributeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OriginalNameRecordMatcher2EditPart) {
			return ((OriginalNameRecordMatcher2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DateRecognizer2EditPart) {
			return ((DateRecognizer2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TrimWhitespace2EditPart) {
			return ((TrimWhitespace2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MappedAttribute2EditPart) {
			return ((MappedAttribute2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InputFieldEditPart) {
			return ((InputFieldEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof TabbedDataFieldEditPart) {
			return ((TabbedDataFieldEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DateRecognizerEditPart) {
			return ((DateRecognizerEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TextEditPart) {
			return ((TextEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TrimWhitespaceEditPart) {
			return ((TrimWhitespaceEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DateRecognizer2EditPart) {
			return ((DateRecognizer2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Text2EditPart) {
			return ((Text2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TrimWhitespace2EditPart) {
			return ((TrimWhitespace2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InputFieldEditPart) {
			return ((InputFieldEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public List getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof OriginalNameRecordMatcherEditPart) {
			return ((OriginalNameRecordMatcherEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DateRecognizerEditPart) {
			return ((DateRecognizerEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TrimWhitespaceEditPart) {
			return ((TrimWhitespaceEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MappedAttributeEditPart) {
			return ((MappedAttributeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OriginalNameRecordMatcher2EditPart) {
			return ((OriginalNameRecordMatcher2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DateRecognizer2EditPart) {
			return ((DateRecognizer2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TrimWhitespace2EditPart) {
			return ((TrimWhitespace2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MappedAttribute2EditPart) {
			return ((MappedAttribute2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InputFieldEditPart) {
			return ((InputFieldEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof TabbedDataFieldEditPart) {
			return ((TabbedDataFieldEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DateRecognizerEditPart) {
			return ((DateRecognizerEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TextEditPart) {
			return ((TextEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TrimWhitespaceEditPart) {
			return ((TrimWhitespaceEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DateRecognizer2EditPart) {
			return ((DateRecognizer2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Text2EditPart) {
			return ((Text2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TrimWhitespace2EditPart) {
			return ((TrimWhitespace2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InputFieldEditPart) {
			return ((InputFieldEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof OriginalNameRecordMatcherEditPart) {
			return ((OriginalNameRecordMatcherEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DateRecognizerEditPart) {
			return ((DateRecognizerEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TrimWhitespaceEditPart) {
			return ((TrimWhitespaceEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MappedAttributeEditPart) {
			return ((MappedAttributeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OriginalNameRecordMatcher2EditPart) {
			return ((OriginalNameRecordMatcher2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DateRecognizer2EditPart) {
			return ((DateRecognizer2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TrimWhitespace2EditPart) {
			return ((TrimWhitespace2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MappedAttribute2EditPart) {
			return ((MappedAttribute2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InputFieldEditPart) {
			return ((InputFieldEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public EObject selectExistingElementForSource(IAdaptable target, IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	@Override
	public EObject selectExistingElementForTarget(IAdaptable source, IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(CrosswalkDiagramEditorPlugin.getInstance()
				.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setMessage(Messages.CrosswalkModelingAssistantProviderMessage);
		dialog.setTitle(Messages.CrosswalkModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
