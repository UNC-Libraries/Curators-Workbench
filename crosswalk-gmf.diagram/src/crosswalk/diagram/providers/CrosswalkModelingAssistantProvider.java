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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.StringInput13EditPart;
import crosswalk.diagram.edit.parts.StringInput2EditPart;
import crosswalk.diagram.edit.parts.StringInput9EditPart;
import crosswalk.diagram.edit.parts.StringInputEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.part.CrosswalkDiagramEditorPlugin;
import crosswalk.diagram.part.Messages;

/**
 * @generated
 */
public class CrosswalkModelingAssistantProvider extends ModelingAssistantProvider {

    /**
     * @generated NOT
     */
    @Override
    public List getTypesForPopupBar(IAdaptable host) {
	IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
	if (editPart instanceof CrossWalkEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(6);
	    types.add(CrosswalkElementTypes.DelimitedFile_2001);
	    types.add(CrosswalkElementTypes.OriginalNameRecordMatcher_2010);
	    types.add(CrosswalkElementTypes.DateRecognizer_2013);
	    types.add(CrosswalkElementTypes.Text_2014);
	    types.add(CrosswalkElementTypes.TrimWhitespace_2015);
	    types.add(CrosswalkElementTypes.MappedElement_2016);
	    return types;
	}
	if (editPart instanceof DelimitedFileEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.TabbedDataField_3001);
	    return types;
	}
	if (editPart instanceof OriginalNameRecordMatcherEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3010);
	    return types;
	}
	if (editPart instanceof DateRecognizerEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3002);
	    return types;
	}
	if (editPart instanceof TrimWhitespaceEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3003);
	    return types;
	}
	if (editPart instanceof MappedElementEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(3);
	    // TODO check for available references and attributes
	    EObject el = editPart.resolveSemanticElement();
	    if (MappedModelUtil.getChildElementFeatures(el).size() > 0) {
		types.add(CrosswalkElementTypes.MappedElement_3015);
	    }
	    if (MappedModelUtil.getAttributes(el).size() > 0) {
		types.add(CrosswalkElementTypes.MappedAttribute_3016);
	    }
	    //types.add(CrosswalkElementTypes.StringInput_3017);
	    return types;
	}
	return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    @Override
    public List getRelTypesOnSource(IAdaptable source) {
	IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
	if (sourceEditPart instanceof StringInput9EditPart) {
	    return ((StringInput9EditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof StringInputEditPart) {
	    return ((StringInputEditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof StringInput2EditPart) {
	    return ((StringInput2EditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof MappedAttributeEditPart) {
	    return ((MappedAttributeEditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof StringInput13EditPart) {
	    return ((StringInput13EditPart) sourceEditPart).getMARelTypesOnSource();
	}
	return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    @Override
    public List getRelTypesOnTarget(IAdaptable target) {
	IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
	if (targetEditPart instanceof TextEditPart) {
	    return ((TextEditPart) targetEditPart).getMARelTypesOnTarget();
	}
	if (targetEditPart instanceof TrimWhitespaceEditPart) {
	    return ((TrimWhitespaceEditPart) targetEditPart).getMARelTypesOnTarget();
	}
	if (targetEditPart instanceof TabbedDataFieldEditPart) {
	    return ((TabbedDataFieldEditPart) targetEditPart).getMARelTypesOnTarget();
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
	if (sourceEditPart instanceof StringInput9EditPart) {
	    return ((StringInput9EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof StringInputEditPart) {
	    return ((StringInputEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof StringInput2EditPart) {
	    return ((StringInput2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof MappedAttributeEditPart) {
	    return ((MappedAttributeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof StringInput13EditPart) {
	    return ((StringInput13EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    @Override
    public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
	IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
	if (targetEditPart instanceof TextEditPart) {
	    return ((TextEditPart) targetEditPart).getMATypesForSource(relationshipType);
	}
	if (targetEditPart instanceof TrimWhitespaceEditPart) {
	    return ((TrimWhitespaceEditPart) targetEditPart).getMATypesForSource(relationshipType);
	}
	if (targetEditPart instanceof TabbedDataFieldEditPart) {
	    return ((TabbedDataFieldEditPart) targetEditPart).getMATypesForSource(relationshipType);
	}
	return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    @Override
    public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
	IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
	if (sourceEditPart instanceof StringInput9EditPart) {
	    return ((StringInput9EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof StringInputEditPart) {
	    return ((StringInputEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof StringInput2EditPart) {
	    return ((StringInput2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof MappedAttributeEditPart) {
	    return ((MappedAttributeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof StringInput13EditPart) {
	    return ((StringInput13EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
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
