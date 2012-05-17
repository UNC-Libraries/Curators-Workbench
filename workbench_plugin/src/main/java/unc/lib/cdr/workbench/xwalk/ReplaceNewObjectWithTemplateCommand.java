package unc.lib.cdr.workbench.xwalk;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

public class ReplaceNewObjectWithTemplateCommand extends AbstractTransactionalCommand {

	private CreateElementRequest request = null;
	
	public ReplaceNewObjectWithTemplateCommand(TransactionalEditingDomain domain, CreateElementRequest request) {
		super(domain, "Replace Object with Template", Collections.EMPTY_LIST);
		this.request = request;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		EObject result = null;
		System.out.println("IN THE COMMAND");
		EObject n = request.getNewElement();
		EObject template = (EObject)request.getParameter("templateElement");
		EcoreUtil.Copier copier = new EcoreUtil.Copier(false, true);
		EObject copy = copier.copy(template);
		copier.copyReferences();
		EcoreUtil.replace(n, copy);
		result = copy;
		return CommandResult.newOKCommandResult(result);
	}

}
