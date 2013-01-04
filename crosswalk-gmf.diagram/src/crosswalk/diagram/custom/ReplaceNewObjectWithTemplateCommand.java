package crosswalk.diagram.custom;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.CrosswalkPackage;

public class ReplaceNewObjectWithTemplateCommand extends AbstractTransactionalCommand {

	private CreateElementRequest request = null;

	public ReplaceNewObjectWithTemplateCommand(TransactionalEditingDomain domain, CreateElementRequest request) {
		super(domain, "Replace Object with Template", Collections.EMPTY_LIST);
		this.request = request;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		EObject result = null;
		EObject n = request.getNewElement();
//		String id = EcoreUtil.getID(n);
//		System.out.println(id);
//		System.out.println(ViewUtil.resolve(n));
//		System.out.println(ViewUtil.resolve(request.getContainer()));
//		System.out.println(ViewUtil.getViewContainer(n));
//		System.out.println(request.getEditHelperContext());
//		System.out.println(request.getContainer());

		EObject template = (EObject) request.getParameter("templateElement");
/*		for (EStructuralFeature f : CrosswalkPackage.eINSTANCE.getMetadataBlock().getEAllStructuralFeatures()) {
			if (template.eIsSet(f)) {
				Object val = template.eGet(f, false);
				System.out.println(val);
				if (val instanceof EObject) {
					EcoreUtil.Copier copier = new EcoreUtil.Copier(false, true);
					EObject copy = copier.copy((EObject) template.eGet(f));
					copier.copyReferences();
					n.eSet(f, copy);
				} else if (val instanceof EList) {
					EcoreUtil.Copier copier = new EcoreUtil.Copier(false, true);
					Collection copy = copier.copyAll((EList) val);
					copier.copyReferences();
					n.eSet(f, copy);
				} else {
					n.eSet(f, val);
				}
			} else {
				n.eUnset(f);
			}
		}*/
		EcoreUtil.Copier copier = new EcoreUtil.Copier(false, true);
		EObject copy = copier.copy(template);
		copier.copyReferences();
		EcoreUtil.replace(n, copy);
		// IDiagramWorkbenchPart
		// getDiagramGraphicalViewer().findEditPartsForElement(id,
		// Object.class)
		// TODO point the notation at the replacement element
		result = copy;
		return CommandResult.newOKCommandResult(result);
	}

}
