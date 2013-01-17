package crosswalk.diagram.custom;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.util.Assert;

import crosswalk.CrosswalkPackage;

public class CompartmentChildCreateCommand extends CreateCommand {
	int index;

	public CompartmentChildCreateCommand(TransactionalEditingDomain editingDomain, ViewDescriptor viewDescriptor,
			View containerView, int index) {
		super(editingDomain, viewDescriptor, containerView);
		this.index = index;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {

		View view = ViewService.getInstance().createView(viewDescriptor.getViewKind(),
				viewDescriptor.getElementAdapter(), containerView, viewDescriptor.getSemanticHint(), index,
				viewDescriptor.isPersisted(), viewDescriptor.getPreferencesHint());
		Assert.isNotNull(view, "failed to create a view"); //$NON-NLS-1$
		viewDescriptor.setView(view);
		
		return CommandResult.newOKCommandResult(viewDescriptor);
	}
}
