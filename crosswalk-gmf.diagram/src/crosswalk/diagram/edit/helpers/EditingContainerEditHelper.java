package crosswalk.diagram.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class EditingContainerEditHelper extends CrosswalkBaseEditHelper {

	@Override
	protected ICommand getDestroyElementCommand(DestroyElementRequest req) {
		// Prevents from removing the figure
		return UnexecutableCommand.INSTANCE;
	}
}
