package unc.lib.cdr.workbench.xwalk;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.providers.CrosswalkElementTypes;

public class CrosswalkMetaBlockTemplateAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getAfterCreateCommand(final CreateElementRequest request) {
		if (request.getParameters().containsKey("templateElement") &&
				request.getElementType() == CrosswalkElementTypes.MetadataBlock_3018) {
			return new ReplaceNewObjectWithTemplateCommand(request.getEditingDomain(), request);
		}
		return null;
	}

}
