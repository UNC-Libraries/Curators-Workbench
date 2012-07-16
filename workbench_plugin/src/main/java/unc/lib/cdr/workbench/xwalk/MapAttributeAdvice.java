package unc.lib.cdr.workbench.xwalk;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.MappedElement;
import crosswalk.diagram.providers.CrosswalkElementTypes;

public class MapAttributeAdvice extends AbstractEditHelperAdvice implements IEditHelperAdvice {
	@Override
	protected ICommand getBeforeCreateCommand(final CreateElementRequest request) {
		if (isRelevant(request)) {
			return new PickMappedFeatureCommand(request);
		}
		return null;
	}

	@Override
	protected ICommand getAfterCreateCommand(final CreateElementRequest request) {
		if (isRelevant(request)) {
			return new SetMappedFeatureCommand(request);
		}
		return null;
	}
	
	/**
	 * This is required to such that we don't return commands for the wrong element types, causing meaningless prompts the
	 * unspecified create type request.
	 * @param request
	 * @return
	 */
	private static boolean isRelevant(CreateElementRequest request) {
		if(request.getContainer() instanceof MappedElement &&
				request.getElementType() == CrosswalkElementTypes.MappedAttribute_3009) {
			return true;
		}
		return false;
	}
}
