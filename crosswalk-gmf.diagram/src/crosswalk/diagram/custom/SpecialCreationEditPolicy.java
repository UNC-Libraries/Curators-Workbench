/**
 * Copyright 2011 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package crosswalk.diagram.custom;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.CrossWalk;
import crosswalk.MappedElement;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @author Gregory Jansen
 *
 */
public class SpecialCreationEditPolicy extends CreationEditPolicy {

	@Override
	public Command getCommand(Request request) {
		if (understandsRequest(request)) {
			if (request instanceof CreateUnspecifiedTypeRequest) {
				CreateUnspecifiedTypeRequest r = (CreateUnspecifiedTypeRequest) request;
				View view = (View)getHost().getModel();
				EObject hostElement = ViewUtil.resolveSemanticElement(view);
				CreateViewAndElementRequest chosenRequest = null;
				IElementType type = null;
				if(hostElement instanceof CrossWalk) {
					type = CrosswalkElementTypes.MappedElement_2016;
					chosenRequest = (CreateViewAndElementRequest)r.getRequestForType(type);
				} else if(hostElement instanceof MappedElement) {
					type = CrosswalkElementTypes.MappedElement_3015;
					chosenRequest = (CreateViewAndElementRequest)r.getRequestForType(type);
				}
				if (chosenRequest != null) {
					chosenRequest.setLocation(r.getLocation());
					chosenRequest.setExtendedData(r.getExtendedData());
					chosenRequest.setSize(r.getSize());
					//chosenRequest.setType(r.getType());
					List types = new ArrayList();
					types.add(type);
					CreateUnspecifiedTypeRequest answerReq = new CreateUnspecifiedTypeRequest(types, chosenRequest.getViewAndElementDescriptor().getPreferencesHint() );
					System.out.println("chose type: "+type);
					return super.getCommand(answerReq);
				}
			}
			return super.getCommand(request);
		}
		return null;
	}
}
