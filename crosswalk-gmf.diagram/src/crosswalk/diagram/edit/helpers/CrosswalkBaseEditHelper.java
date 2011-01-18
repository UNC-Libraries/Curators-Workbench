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
package crosswalk.diagram.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelper;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

/**
 * @generated
 */
public class CrosswalkBaseEditHelper extends AbstractEditHelper {

    /**
     * @generated
     */
    public static final String EDIT_POLICY_COMMAND = "edit policy command"; //$NON-NLS-1$

    /**
     * @generated
     */
    public static final String CONTEXT_ELEMENT_TYPE = "context element type"; //$NON-NLS-1$

    /**
     * @generated
     */
    protected IEditHelperAdvice[] getEditHelperAdvice(IEditCommandRequest req) {
	if (req.getParameter(CONTEXT_ELEMENT_TYPE) instanceof IElementType) {
	    return ElementTypeRegistry.getInstance().getEditHelperAdvice(
			    (IElementType) req.getParameter(CONTEXT_ELEMENT_TYPE));
	}
	return super.getEditHelperAdvice(req);
    }

    /**
     * @generated
     */
    protected ICommand getInsteadCommand(IEditCommandRequest req) {
	ICommand epCommand = (ICommand) req.getParameter(EDIT_POLICY_COMMAND);
	req.setParameter(EDIT_POLICY_COMMAND, null);
	ICommand ehCommand = super.getInsteadCommand(req);
	if (epCommand == null) {
	    return ehCommand;
	}
	if (ehCommand == null) {
	    return epCommand;
	}
	CompositeCommand command = new CompositeCommand(null);
	command.add(epCommand);
	command.add(ehCommand);
	return command;
    }

    /**
     * @generated
     */
    protected ICommand getCreateCommand(CreateElementRequest req) {
	return null;
    }

    /**
     * @generated
     */
    protected ICommand getCreateRelationshipCommand(CreateRelationshipRequest req) {
	return null;
    }

    /**
     * @generated
     */
    protected ICommand getDestroyElementCommand(DestroyElementRequest req) {
	return null;
    }

    /**
     * @generated
     */
    protected ICommand getDestroyReferenceCommand(DestroyReferenceRequest req) {
	return null;
    }
}
