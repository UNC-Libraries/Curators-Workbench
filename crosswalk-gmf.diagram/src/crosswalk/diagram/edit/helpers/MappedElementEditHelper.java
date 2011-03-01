/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MappedElementEditHelper extends CrosswalkBaseEditHelper {

    @Override
    protected ICommand getCreateCommand(CreateElementRequest req) {
	//System.out.println("In EditHelper.getCreateCommand: "+req.getLabel()+"\nContainer: "+req.getContainer()+"\nNew Object: "+req.getNewElement());
	return null;
    }

    @Override
    protected ICommand getConfigureCommand(ConfigureRequest req) {
	// TODO Auto-generated method stub
	System.out.println("In the getConfigureCommand of EditHelper");
	return super.getConfigureCommand(req);
    }
}
