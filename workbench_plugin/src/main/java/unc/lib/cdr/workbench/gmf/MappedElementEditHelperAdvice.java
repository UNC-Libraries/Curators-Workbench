package unc.lib.cdr.workbench.gmf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.MappedAttribute;
import crosswalk.MappedElement;
import crosswalk.diagram.custom.MappedModelUtil;

public class MappedElementEditHelperAdvice extends AbstractEditHelperAdvice implements IEditHelperAdvice {

    /**
     *
     */
    private static final String MAPPED_FEATURE_PARAM = "mappedFeature";
    private static final Logger LOG = LoggerFactory.getLogger(MappedElementEditHelperAdvice.class);

    @Override
    protected ICommand getBeforeCreateCommand(final CreateElementRequest request) {
	ICommand result = new CreateElementCommand(request) {
	    @Override
	    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
			    throws ExecutionException {
		LOG.debug("Executing Before Create Command!");
		EObject parent = request.getContainer();
		EClass classToCreate = request.getElementType().getEClass();
		// switch between create element and create attribute
		List<EStructuralFeature> possibleFeatures = null;
		String message = null;
		if (CrosswalkPackage.eINSTANCE.getMappedElement().equals(classToCreate)) {
		    possibleFeatures = MappedModelUtil.getChildElementFeatures(parent);
		    message = "Pick a child element.";
		} else if (CrosswalkPackage.eINSTANCE.getMappedAttribute().equals(classToCreate)) {
		    possibleFeatures = MappedModelUtil.getAttributes(parent);
		    message = "Pick an attribute";
		}
		Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		MappedFeatureChoiceDialog dialog = new MappedFeatureChoiceDialog(shell);
		dialog.setFeatures(possibleFeatures);
		dialog.setMessage(message);
		EStructuralFeature answer = dialog.open();
		if (answer != null) {
		    LOG.debug("got ref selection:" + answer);
		    // set request params to deliver answer
		    Map<String, Object> params = new HashMap<String, Object>();
		    params.put(MAPPED_FEATURE_PARAM, answer);
		    request.addParameters(params);
		} else {
		    LOG.debug("no answer given, trying to cancel..");
		    return CommandResult.newCancelledCommandResult();
		}
		return CommandResult.newOKCommandResult();
	    }
	};
	return result;
    }

    @Override
    protected ICommand getAfterCreateCommand(final CreateElementRequest request) {

	ICommand result = null;
	EObject container = request.getContainer();
	if (container instanceof MappedElement || container instanceof CrossWalk) {
	    // LOG.debug("create element request: " + request.getLabel());
	    result = new CreateElementCommand(request) {

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
				throws ExecutionException {
		    LOG.debug("Executing MappedElement ConfigureCommand!");

		    EStructuralFeature feature = (EStructuralFeature) request.getParameters().get(
				    MAPPED_FEATURE_PARAM);
		    Object o = request.getNewElement();
		    if (o instanceof MappedElement) {
			MappedElement me = (MappedElement) request.getNewElement();
			me.setMappedFeature((EReference) feature);
			return CommandResult.newOKCommandResult();
		    } else if (o instanceof MappedAttribute) {
			MappedAttribute ma = (MappedAttribute) request.getNewElement();
			ma.setMappedFeature((EAttribute) feature);
			return CommandResult.newOKCommandResult();
		    } else {
			return CommandResult.newErrorCommandResult("Could not find mapped feature param.");
		    }
		}
	    };
	}
	return result;
    }

}
