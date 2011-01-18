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

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.diagram.edit.policies.AbstractOutputElementInputsCompartmentCanonicalEditPolicy;
import crosswalk.diagram.edit.policies.AbstractOutputElementInputsCompartmentItemSemanticEditPolicy;
import crosswalk.diagram.part.Messages;

/**
 * @generated
 */
public class AbstractOutputElementInputsCompartmentEditPart extends ListCompartmentEditPart {

    /**
     * @generated
     */
    public static final int VISUAL_ID = 7002;

    /**
     * @generated
     */
    public AbstractOutputElementInputsCompartmentEditPart(View view) {
	super(view);
    }

    /**
     * @generated
     */
    protected boolean hasModelChildrenChanged(Notification evt) {
	return false;
    }

    /**
     * @generated
     */
    public String getCompartmentName() {
	return Messages.AbstractOutputElementInputsCompartmentEditPart_title;
    }

    /**
     * @generated
     */
    public IFigure createFigure() {
	ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
	result.setTitleVisibility(false);
	return result;
    }

    /**
     * @generated
     */
    protected void createDefaultEditPolicies() {
	super.createDefaultEditPolicies();
	installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
			new AbstractOutputElementInputsCompartmentItemSemanticEditPolicy());
	installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
	installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
	installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
			new AbstractOutputElementInputsCompartmentCanonicalEditPolicy());
    }

    /**
     * @generated
     */
    protected void setRatio(Double ratio) {
	// nothing to do -- parent layout does not accept Double constraints as ratio
	// super.setRatio(ratio); 
    }

}
