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
package crosswalk.diagram.parsers;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;

/**
 * @generated
 */
public class TrimWhitespaceLabelExpressionLabelParser implements IParser {
    /**
     * @generated
     */
    public TrimWhitespaceLabelExpressionLabelParser() {
    }

    /**
     * @generated
     */
    public String getEditString(IAdaptable element, int flags) {
	return getPrintString(element, flags);
    }

    /**
     * @generated
     */
    public IParserEditStatus isValidEditString(IAdaptable element, String editString) {
	return ParserEditStatus.EDITABLE_STATUS;
    }

    /**
     * @generated
     */
    public ICommand getParseCommand(IAdaptable element, final String newString, int flags) {
	final EObject target = (EObject) element.getAdapter(EObject.class);
	if (!validateValues(target, newString)) {
	    return UnexecutableCommand.INSTANCE;
	}
	TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(target);
	if (editingDomain == null) {
	    return UnexecutableCommand.INSTANCE;
	}
	IFile affectedFile = WorkspaceSynchronizer.getFile(target.eResource());
	return new AbstractTransactionalCommand(editingDomain,
			"Set Values", affectedFile == null ? null : Collections.singletonList(affectedFile)) { //$NON-NLS-1$ 
	    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
			    throws ExecutionException {
		return new CommandResult(updateValues(target, newString));
	    }
	};
    }

    /**
     * @generated
     */
    public String getPrintString(IAdaptable element, int flags) {
	return "Normalize Whitespace";
    }

    /**
     * @generated
     */
    public boolean isAffectingEvent(Object event, int flags) {
	// XXX Any event is recognized as important, unless there's a way to extract this information from expression itself.
	// TODO analyze expressions (e.g. using OCL parser) to find out structural features in use  
	return true;
    }

    /**
     * @generated
     */
    public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
	return null;
    }

    /**
     * @generated
     */
    private boolean validateValues(EObject target, String newString) {
	// TODO implement as needed
	return true;
    }

    /**
     * @generated
     */
    private IStatus updateValues(EObject target, String newString) throws ExecutionException {
	// TODO implement this method
	// DO NOT FORGET to remove @generated tag or mark method @generated NOT
	throw new ExecutionException("Please implement parsing and value modification");
    }

}
