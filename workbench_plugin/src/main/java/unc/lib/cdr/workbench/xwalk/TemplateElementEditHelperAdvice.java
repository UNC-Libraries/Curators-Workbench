package unc.lib.cdr.workbench.xwalk;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.MetadataBlock;

public class TemplateElementEditHelperAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getAfterCreateCommand( final CreateElementRequest request) {
		System.out.println("over here! "+request.toString());
		if(request.getParameters().containsKey("templateElement")) {
			System.out.println("found template element "+request.getParameter("templateElement"));
			final EObject template = (EObject)request.getParameter("templateElement");
			AbstractTransactionalCommand com = new AbstractTransactionalCommand(request.getEditingDomain(), "my command", Collections.EMPTY_LIST) {
				@Override
				protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
						throws ExecutionException {
					EObject result = null;
					System.out.println("IN THE COMMAND");
					EObject n = request.getNewElement();
					if(n instanceof MetadataBlock) {
						MetadataBlock mb = (MetadataBlock)n;
						MetadataBlock mbt = (MetadataBlock)template;
						mb.setDescription(mbt.getDescription());
						mb.setName(mbt.getName());
						mb.getElements().clear();
						mb.getElements().addAll(EcoreUtil.copyAll(mbt.getElements()));
						mb.getPorts().clear();
						mb.getPorts().addAll(EcoreUtil.copyAll(mbt.getPorts()));
						result = mb;
					} else {
						EObject copy = EcoreUtil.copy(template);
						EcoreUtil.replace(request.getNewElement(), copy);
						result = copy;
					}
					return CommandResult.newOKCommandResult(result);
				}
			};
			return com;
		}
		
		return null;
	}


}
