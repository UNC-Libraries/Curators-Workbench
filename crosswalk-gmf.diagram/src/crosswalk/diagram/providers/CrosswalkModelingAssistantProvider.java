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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import crosswalk.CrossWalk;
import crosswalk.MappedElement;
import crosswalk.diagram.custom.SpecialMappedElementTypesUtil;
import crosswalk.diagram.edit.parts.AbstractEditPart;
import crosswalk.diagram.edit.parts.AccessConditionEditPart;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.DateCreatedEditPart;
import crosswalk.diagram.edit.parts.DateInputEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.GenreEditPart;
import crosswalk.diagram.edit.parts.IdentifierEditPart;
import crosswalk.diagram.edit.parts.LanguageEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.NameEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.StringInput10EditPart;
import crosswalk.diagram.edit.parts.StringInput11EditPart;
import crosswalk.diagram.edit.parts.StringInput12EditPart;
import crosswalk.diagram.edit.parts.StringInput13EditPart;
import crosswalk.diagram.edit.parts.StringInput2EditPart;
import crosswalk.diagram.edit.parts.StringInput3EditPart;
import crosswalk.diagram.edit.parts.StringInput4EditPart;
import crosswalk.diagram.edit.parts.StringInput5EditPart;
import crosswalk.diagram.edit.parts.StringInput6EditPart;
import crosswalk.diagram.edit.parts.StringInput7EditPart;
import crosswalk.diagram.edit.parts.StringInput8EditPart;
import crosswalk.diagram.edit.parts.StringInput9EditPart;
import crosswalk.diagram.edit.parts.StringInputEditPart;
import crosswalk.diagram.edit.parts.SubjectEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TitleInfoEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.edit.parts.TypeOfResourceEditPart;
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
	    ArrayList<IElementType> types = new ArrayList<IElementType>(16);
	    types.add(CrosswalkElementTypes.DelimitedFile_2001);
	    types.add(CrosswalkElementTypes.TitleInfo_2002);
	    types.add(CrosswalkElementTypes.Abstract_2003);
	    types.add(CrosswalkElementTypes.Genre_2004);
	    types.add(CrosswalkElementTypes.Identifier_2005);
	    types.add(CrosswalkElementTypes.Language_2006);
	    types.add(CrosswalkElementTypes.Name_2007);
	    types.add(CrosswalkElementTypes.Subject_2008);
	    types.add(CrosswalkElementTypes.TypeOfResource_2009);
	    types.add(CrosswalkElementTypes.OriginalNameRecordMatcher_2010);
	    types.add(CrosswalkElementTypes.DateCreated_2011);
	    types.add(CrosswalkElementTypes.AccessCondition_2012);
	    types.add(CrosswalkElementTypes.DateRecognizer_2013);
	    types.add(CrosswalkElementTypes.Text_2014);
	    types.add(CrosswalkElementTypes.TrimWhitespace_2015);
	    types.add(CrosswalkElementTypes.MappedElement_2016);
	    //	    EObject eo = editPart.resolveSemanticElement();
	    //	    if(eo != null) {
	    //		CrossWalk me = (CrossWalk)eo;
	    //		if(me.getOutputType() != null) {
	    //		    EClass c = me.getOutputType();
	    //		    List<ISpecializationType> specials = SpecialMappedElementTypesUtil.getMappedElementTypesforEClass(c);
	    //		    types.addAll(specials);
	    //		}
	    //	    }
	    return types;
	}
	if (editPart instanceof DelimitedFileEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.TabbedDataField_3001);
	    return types;
	}
	if (editPart instanceof TitleInfoEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3002);
	    return types;
	}
	if (editPart instanceof AbstractEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3003);
	    return types;
	}
	if (editPart instanceof GenreEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3004);
	    return types;
	}
	if (editPart instanceof IdentifierEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3005);
	    return types;
	}
	if (editPart instanceof LanguageEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3006);
	    return types;
	}
	if (editPart instanceof NameEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3007);
	    return types;
	}
	if (editPart instanceof SubjectEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3008);
	    return types;
	}
	if (editPart instanceof TypeOfResourceEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3009);
	    return types;
	}
	if (editPart instanceof OriginalNameRecordMatcherEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3010);
	    return types;
	}
	if (editPart instanceof DateCreatedEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.DateInput_3011);
	    return types;
	}
	if (editPart instanceof AccessConditionEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3012);
	    return types;
	}
	if (editPart instanceof DateRecognizerEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3013);
	    return types;
	}
	if (editPart instanceof TrimWhitespaceEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(1);
	    types.add(CrosswalkElementTypes.StringInput_3014);
	    return types;
	}
	if (editPart instanceof MappedElementEditPart) {
	    ArrayList<IElementType> types = new ArrayList<IElementType>(3);
	    types.add(CrosswalkElementTypes.MappedElement_3015);
	    types.add(CrosswalkElementTypes.MappedAttribute_3016);
	    EObject eo = editPart.resolveSemanticElement();
	    //	    if(eo != null) {
	    //		MappedElement me = (MappedElement)eo;
	    //		if(me.getMappedFeature() != null) {
	    //		    EClass c = me.getMappedFeature().getEType().eClass();
	    //		    System.out.println("MappedElement class? "+c);
	    //		    List<ISpecializationType> specials = SpecialMappedElementTypesUtil.getMappedElementTypesforEClass(c);
	    //		    types.addAll(specials);
	    //		}
	    //	    }
	    // types.add(CrosswalkElementTypes.StringInput_3017);
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
	if (sourceEditPart instanceof StringInputEditPart) {
	    return ((StringInputEditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof StringInput2EditPart) {
	    return ((StringInput2EditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof StringInput3EditPart) {
	    return ((StringInput3EditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof StringInput4EditPart) {
	    return ((StringInput4EditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof StringInput5EditPart) {
	    return ((StringInput5EditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof StringInput6EditPart) {
	    return ((StringInput6EditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof StringInput7EditPart) {
	    return ((StringInput7EditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof StringInput8EditPart) {
	    return ((StringInput8EditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof StringInput9EditPart) {
	    return ((StringInput9EditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof DateInputEditPart) {
	    return ((DateInputEditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof StringInput10EditPart) {
	    return ((StringInput10EditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof StringInput11EditPart) {
	    return ((StringInput11EditPart) sourceEditPart).getMARelTypesOnSource();
	}
	if (sourceEditPart instanceof StringInput12EditPart) {
	    return ((StringInput12EditPart) sourceEditPart).getMARelTypesOnSource();
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
	if (targetEditPart instanceof DateRecognizerEditPart) {
	    return ((DateRecognizerEditPart) targetEditPart).getMARelTypesOnTarget();
	}
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
	if (sourceEditPart instanceof StringInputEditPart) {
	    return ((StringInputEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof StringInput2EditPart) {
	    return ((StringInput2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof StringInput3EditPart) {
	    return ((StringInput3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof StringInput4EditPart) {
	    return ((StringInput4EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof StringInput5EditPart) {
	    return ((StringInput5EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof StringInput6EditPart) {
	    return ((StringInput6EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof StringInput7EditPart) {
	    return ((StringInput7EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof StringInput8EditPart) {
	    return ((StringInput8EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof StringInput9EditPart) {
	    return ((StringInput9EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof DateInputEditPart) {
	    return ((DateInputEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof StringInput10EditPart) {
	    return ((StringInput10EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof StringInput11EditPart) {
	    return ((StringInput11EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
	}
	if (sourceEditPart instanceof StringInput12EditPart) {
	    return ((StringInput12EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
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
	if (targetEditPart instanceof DateRecognizerEditPart) {
	    return ((DateRecognizerEditPart) targetEditPart).getMATypesForSource(relationshipType);
	}
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
	if (sourceEditPart instanceof StringInputEditPart) {
	    return ((StringInputEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof StringInput2EditPart) {
	    return ((StringInput2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof StringInput3EditPart) {
	    return ((StringInput3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof StringInput4EditPart) {
	    return ((StringInput4EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof StringInput5EditPart) {
	    return ((StringInput5EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof StringInput6EditPart) {
	    return ((StringInput6EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof StringInput7EditPart) {
	    return ((StringInput7EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof StringInput8EditPart) {
	    return ((StringInput8EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof StringInput9EditPart) {
	    return ((StringInput9EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof DateInputEditPart) {
	    return ((DateInputEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof StringInput10EditPart) {
	    return ((StringInput10EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof StringInput11EditPart) {
	    return ((StringInput11EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
	}
	if (sourceEditPart instanceof StringInput12EditPart) {
	    return ((StringInput12EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
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
