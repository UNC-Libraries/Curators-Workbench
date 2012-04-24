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
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SemanticCreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.diagram.ui.requests.RefreshConnectionsRequest;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.CrossWalk;
import crosswalk.EditingContainer;
import crosswalk.MappedElement;
import crosswalk.MetadataBlock;
import crosswalk.diagram.edit.parts.CrossWalkModelBoxCompartmentEditPart;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @author Gregory Jansen
 *
 */
public class SpecialCreationEditPolicy extends CreationEditPolicy {

	@Override
	public Command getCommand(Request request) {
		//System.err.println("in special creation policy");
		if (understandsRequest(request)) {
			//System.err.println("request understood");
			//System.err.println("request: "+request);
			if (request instanceof CreateUnspecifiedTypeRequest) {
				//System.err.println("create unspecified type request found");
				CreateUnspecifiedTypeRequest r = (CreateUnspecifiedTypeRequest) request;
				View view = (View)getHost().getModel();
				EObject hostElement = ViewUtil.resolveSemanticElement(view);
				//System.err.println("request: "+r.toString());
				//System.err.println("view: "+view.toString());
				//System.err.println("host: "+hostElement.toString());
				//System.err.println("host: "+hostElement.eClass().toString());
				//System.err.println("host: "+hostElement.eClass().getInstanceTypeName());
				//System.err.println("req types:");
				//for(Object o : r.getElementTypes()) {
				//	System.err.println(o);
				//}
				CreateViewAndElementRequest chosenRequest = null;
				IElementType type = null;
				if(hostElement instanceof CrossWalk) {
					type = CrosswalkElementTypes.MappedElement_3007;
					chosenRequest = (CreateViewAndElementRequest)r.getRequestForType(type);
				} else if(hostElement instanceof MetadataBlock) {
					type = CrosswalkElementTypes.MappedElement_3015;
					chosenRequest = (CreateViewAndElementRequest)r.getRequestForType(type);
					System.err.println("found a metadata block parent..");
				} else if(hostElement instanceof MappedElement) {
					type = CrosswalkElementTypes.MappedElement_3008;
					chosenRequest = (CreateViewAndElementRequest)r.getRequestForType(type);
				}
				System.err.println("type chosen: "+type);
				System.err.println("request chosen: "+chosenRequest);
				if (chosenRequest != null) {
					List types = new ArrayList();
					types.add(type);
					CreateUnspecifiedTypeRequest answerReq = new CreateUnspecifiedTypeRequest(types, chosenRequest.getViewAndElementDescriptor().getPreferencesHint() );
					answerReq.setExtendedData(r.getExtendedData());
					answerReq.setLocation(r.getLocation());
					answerReq.setSize(r.getSize());
					return super.getCommand(answerReq);
				} else {
					System.err.println("special creation edit policy cannot determine req type");
				}
			}
			return super.getCommand(request);
		}
		return null;
	}
	
}
