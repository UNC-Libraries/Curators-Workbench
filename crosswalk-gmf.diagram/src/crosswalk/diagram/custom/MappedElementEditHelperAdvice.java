package crosswalk.diagram.custom;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import crosswalk.CrossWalk;
import crosswalk.MappedElement;

public class MappedElementEditHelperAdvice extends AbstractEditHelperAdvice {

    @Override
    protected ICommand getBeforeCreateCommand(CreateElementRequest request) {
	// TODO Auto-generated method stub
	System.out.println("MappedElementEditHelperAdvice.getBeforeCreateCommand");
	return null;
    }

    @Override
    protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {
	// TODO Auto-generated method stub
	System.out.println("MappedElementEditHelperAdvice.getAfterConfigureCommand");
	ICommand result = new ConfigureElementCommand(request) {

	    @Override
	    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
			    throws ExecutionException {
		System.out.println("Executing MappedElement ConfigureCommand!");
		MappedElement me = (MappedElement) request.getElementToConfigure();
		EObject modelParent = me.eContainer();
		EClass mappedParentType = null;
		if (modelParent instanceof CrossWalk) {
		    CrossWalk cw = (CrossWalk) modelParent;
		    mappedParentType = cw.getOutputType();
		} else if (modelParent instanceof MappedElement) {
		    MappedElement pe = (MappedElement) modelParent;
		    if (pe.getMappedFeature() != null) {
			mappedParentType = (EClass) pe.getMappedFeature().getEType();
		    }
		}
		System.out.println("being configured:" + me);
		System.out.println("model parent:" + modelParent);
		System.out.println("mappedParentType:" + mappedParentType);
		if (me == null || modelParent == null || mappedParentType == null) {
		    System.out.println("Cancelling due to not enough info");
		    return CommandResult.newCancelledCommandResult();
		}
		Map<String, EReference> possibleReferences = new HashMap<String, EReference>();
		for (EReference r : mappedParentType.getEAllReferences()) {
		    possibleReferences.put(r.getName(), r);
		}
		Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		String[] labels = possibleReferences.keySet().toArray(new String[] {});
		MessageDialog dialog = new MessageDialog(shell, "Select element:", null,
				"Which one of the following elements do you want?", MessageDialog.QUESTION, labels, 0);
		int answer = dialog.open();
		if (answer != SWT.DEFAULT) {
		    String name = labels[answer];
		    EReference ref = possibleReferences.get(name);
		    me.setMappedFeature(ref);
		} else {
		    return CommandResult.newErrorCommandResult("No mapped feature was picked");
		}
		return CommandResult.newOKCommandResult();
	    }
	};
	return result;
    }

}
