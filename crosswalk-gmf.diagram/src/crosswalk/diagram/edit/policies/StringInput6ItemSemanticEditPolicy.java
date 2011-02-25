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
package crosswalk.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.diagram.edit.commands.StringInputInputCreateCommand;
import crosswalk.diagram.edit.commands.StringInputInputReorientCommand;
import crosswalk.diagram.edit.parts.StringInputInputEditPart;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class StringInput6ItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public StringInput6ItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.StringInput_3007);
    }

    /**
     * @generated
     */
    protected Command getDestroyElementCommand(DestroyElementRequest req) {
	View view = (View) getHost().getModel();
	CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
	cmd.setTransactionNestingEnabled(false);
	for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
	    Edge outgoingLink = (Edge) it.next();
	    if (CrosswalkVisualIDRegistry.getVisualID(outgoingLink) == StringInputInputEditPart.VISUAL_ID) {
		DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
				outgoingLink.getTarget().getElement(), false);
		cmd.add(new DestroyReferenceCommand(r));
		cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
		continue;
	    }
	}
	EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
	if (annotation == null) {
	    // there are indirectly referenced children, need extra commands: false
	    addDestroyShortcutsCommand(cmd, view);
	    // delete host element
	    cmd.add(new DestroyElementCommand(req));
	} else {
	    cmd.add(new DeleteCommand(getEditingDomain(), view));
	}
	return getGEFWrapper(cmd.reduce());
    }

    /**
     * @generated
     */
    protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
	Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
			: getCompleteCreateRelationshipCommand(req);
	return command != null ? command : super.getCreateRelationshipCommand(req);
    }

    /**
     * @generated
     */
    protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
	if (CrosswalkElementTypes.StringInputInput_4001 == req.getElementType()) {
	    return getGEFWrapper(new StringInputInputCreateCommand(req, req.getSource(), req.getTarget()));
	}
	return null;
    }

    /**
     * @generated
     */
    protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
	if (CrosswalkElementTypes.StringInputInput_4001 == req.getElementType()) {
	    return null;
	}
	return null;
    }

    /**
     * Returns command to reorient EReference based link. New link target or source
     * should be the domain model element associated with this node.
     * 
     * @generated
     */
    protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
	switch (getVisualID(req)) {
	case StringInputInputEditPart.VISUAL_ID:
	    return getGEFWrapper(new StringInputInputReorientCommand(req));
	}
	return super.getReorientReferenceRelationshipCommand(req);
    }

}
