package unc.lib.cdr.workbench.gmf;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

public class MappedAttributeEditHelperAdvice implements IEditHelperAdvice {

	@Override
	public ICommand getBeforeEditCommand(IEditCommandRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICommand getAfterEditCommand(IEditCommandRequest request) {
		System.out.println("change color of ellipse here, MAhelperadvice");
		return null;
	}

	@Override
	public void configureRequest(IEditCommandRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean approveRequest(IEditCommandRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

}
