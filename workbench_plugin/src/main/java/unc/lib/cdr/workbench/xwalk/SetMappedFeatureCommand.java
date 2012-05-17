package unc.lib.cdr.workbench.xwalk;

import gov.loc.mods.mods.MODSPackage;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.MappedAttribute;
import crosswalk.MappedElement;
import crosswalk.diagram.custom.MappedModelUtil;
import crosswalk.impl.MappedElementImpl;

public class SetMappedFeatureCommand extends AbstractTransactionalCommand {
	private static final String MAPPED_FEATURE_PARAM = "mappedFeature";
	
	private CreateElementRequest request = null;
	
	public SetMappedFeatureCommand(CreateElementRequest request) {
		super(request.getEditingDomain(), "Pick the Mapped Feature", Collections.EMPTY_LIST);
		this.request = request;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		EStructuralFeature feature = (EStructuralFeature) request.getParameters().get(MAPPED_FEATURE_PARAM);
		Object o = request.getNewElement();
		if (o instanceof MappedElement) {
			MappedElementImpl me = (MappedElementImpl) request.getNewElement();
			me.setMappedFeature((EReference) feature);
			EClass type = ((EReference) feature).getEReferenceType();
			if (MODSPackage.eINSTANCE.getDateBaseDefinition().isSuperTypeOf(type)) {
				// this is a date!
				EAttribute textAttr = MappedModelUtil.getXMLTextAttributeInReferenceType(me);
				MappedModelUtil.setEDateToStringConversionStrategyAttribute(me, textAttr);
				MappedModelUtil.setMODSDateEncodingAttribute(me);
			} else { // detect a text value attribute
				EAttribute textValue = MappedModelUtil.getXMLTextAttributeInReferenceType(me);
				if (textValue != null) {
					MappedModelUtil.setTextAttribute(me, textValue);
				} else {
					System.out.println("No element value text attribute found.");
				}
			}
			return CommandResult.newOKCommandResult();
		} else if (o instanceof MappedAttribute) {
			MappedAttribute ma = (MappedAttribute) request.getNewElement();
			ma.setMappedFeature((EAttribute) feature);
			return CommandResult.newOKCommandResult();
		} else {
			return CommandResult.newErrorCommandResult("Could not find mapped feature param.");
		}
	}
}
